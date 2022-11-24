package graphic.graphic.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import graphic.graphic.services.GraphicGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphicParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("V1", "'\"v1\"'");
    		tokenNameToValue.put("V2", "'\"v2\"'");
    		tokenNameToValue.put("V3", "'\"v3\"'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("URI", "'\"URI\"'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("Name", "'\"name\"'");
    		tokenNameToValue.put("Text", "'\"text\"'");
    		tokenNameToValue.put("Trim", "'\"trim\"'");
    		tokenNameToValue.put("Type", "'\"type\"'");
    		tokenNameToValue.put("Color", "'\"color\"'");
    		tokenNameToValue.put("Vname", "'\"vname\"'");
    		tokenNameToValue.put("Width", "'\"width\"'");
    		tokenNameToValue.put("Planes", "'\"planes\"'");
    		tokenNameToValue.put("Target", "'\"target\"'");
    		tokenNameToValue.put("Classes", "'\"classes\"'");
    		tokenNameToValue.put("Pattern", "'\"pattern\"'");
    		tokenNameToValue.put("SizeMax", "'\"sizeMax\"'");
    		tokenNameToValue.put("SizeMin", "'\"sizeMin\"'");
    		tokenNameToValue.put("Position", "'\"position\"'");
    		tokenNameToValue.put("Rotation", "'\"rotation\"'");
    		tokenNameToValue.put("SizeInit", "'\"sizeInit\"'");
    		tokenNameToValue.put("Versions", "'\"versions\"'");
    		tokenNameToValue.put("Decorator", "'\"decorator\"'");
    		tokenNameToValue.put("TextColor", "'\"textColor\"'");
    		tokenNameToValue.put("Connections", "'\"connections\"'");
    		tokenNameToValue.put("Constraints", "'\"constraints\"'");
    		tokenNameToValue.put("Ilumination", "'\"ilumination\"'");
    		tokenNameToValue.put("Overlapping", "'\"overlapping\"'");
    		tokenNameToValue.put("DecoratorPos", "'\"decoratorPos\"'");
    		tokenNameToValue.put("XToOriginPos", "'\"xToOriginPos\"'");
    		tokenNameToValue.put("YToOriginPos", "'\"yToOriginPos\"'");
    		tokenNameToValue.put("ZToOriginPos", "'\"zToOriginPos\"'");
    		tokenNameToValue.put("DecoratorColor", "'\"decoratorColor\"'");
    		tokenNameToValue.put("DecoratorWidth", "'\"decoratorWidth\"'");
    		tokenNameToValue.put("ShowAttributes", "'\"showAttributes\"'");
    		tokenNameToValue.put("CategoryBitMask", "'\"categoryBitMask\"'");
    		tokenNameToValue.put("CollisionBitMask", "'\"collisionBitMask\"'");
    		tokenNameToValue.put("ContactTestBitMask", "'\"contactTestBitMask\"'");
    		tokenNameToValue.put("MaterialAttributes", "'\"materialAttributes\"'");
    	}

    	public void setGrammarAccess(GraphicGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleGraphicRoot"
    // InternalGraphicParser.g:101:1: entryRuleGraphicRoot : ruleGraphicRoot EOF ;
    public final void entryRuleGraphicRoot() throws RecognitionException {
        try {
            // InternalGraphicParser.g:102:1: ( ruleGraphicRoot EOF )
            // InternalGraphicParser.g:103:1: ruleGraphicRoot EOF
            {
             before(grammarAccess.getGraphicRootRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRoot();

            state._fsp--;

             after(grammarAccess.getGraphicRootRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRoot"


    // $ANTLR start "ruleGraphicRoot"
    // InternalGraphicParser.g:110:1: ruleGraphicRoot : ( ( rule__GraphicRoot__Group__0 ) ) ;
    public final void ruleGraphicRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:114:2: ( ( ( rule__GraphicRoot__Group__0 ) ) )
            // InternalGraphicParser.g:115:2: ( ( rule__GraphicRoot__Group__0 ) )
            {
            // InternalGraphicParser.g:115:2: ( ( rule__GraphicRoot__Group__0 ) )
            // InternalGraphicParser.g:116:3: ( rule__GraphicRoot__Group__0 )
            {
             before(grammarAccess.getGraphicRootAccess().getGroup()); 
            // InternalGraphicParser.g:117:3: ( rule__GraphicRoot__Group__0 )
            // InternalGraphicParser.g:117:4: rule__GraphicRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRoot"


    // $ANTLR start "entryRuleGraphicRootPropertiesAbstract"
    // InternalGraphicParser.g:126:1: entryRuleGraphicRootPropertiesAbstract : ruleGraphicRootPropertiesAbstract EOF ;
    public final void entryRuleGraphicRootPropertiesAbstract() throws RecognitionException {
        try {
            // InternalGraphicParser.g:127:1: ( ruleGraphicRootPropertiesAbstract EOF )
            // InternalGraphicParser.g:128:1: ruleGraphicRootPropertiesAbstract EOF
            {
             before(grammarAccess.getGraphicRootPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootPropertiesAbstractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootPropertiesAbstract"


    // $ANTLR start "ruleGraphicRootPropertiesAbstract"
    // InternalGraphicParser.g:135:1: ruleGraphicRootPropertiesAbstract : ( ( rule__GraphicRootPropertiesAbstract__Alternatives ) ) ;
    public final void ruleGraphicRootPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:139:2: ( ( ( rule__GraphicRootPropertiesAbstract__Alternatives ) ) )
            // InternalGraphicParser.g:140:2: ( ( rule__GraphicRootPropertiesAbstract__Alternatives ) )
            {
            // InternalGraphicParser.g:140:2: ( ( rule__GraphicRootPropertiesAbstract__Alternatives ) )
            // InternalGraphicParser.g:141:3: ( rule__GraphicRootPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getGraphicRootPropertiesAbstractAccess().getAlternatives()); 
            // InternalGraphicParser.g:142:3: ( rule__GraphicRootPropertiesAbstract__Alternatives )
            // InternalGraphicParser.g:142:4: rule__GraphicRootPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootPropertiesAbstract"


    // $ANTLR start "entryRuleGraphicRootClassesItemsPropertiesAbstract"
    // InternalGraphicParser.g:151:1: entryRuleGraphicRootClassesItemsPropertiesAbstract : ruleGraphicRootClassesItemsPropertiesAbstract EOF ;
    public final void entryRuleGraphicRootClassesItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalGraphicParser.g:152:1: ( ruleGraphicRootClassesItemsPropertiesAbstract EOF )
            // InternalGraphicParser.g:153:1: ruleGraphicRootClassesItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsPropertiesAbstract"


    // $ANTLR start "ruleGraphicRootClassesItemsPropertiesAbstract"
    // InternalGraphicParser.g:160:1: ruleGraphicRootClassesItemsPropertiesAbstract : ( ( rule__GraphicRootClassesItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleGraphicRootClassesItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:164:2: ( ( ( rule__GraphicRootClassesItemsPropertiesAbstract__Alternatives ) ) )
            // InternalGraphicParser.g:165:2: ( ( rule__GraphicRootClassesItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalGraphicParser.g:165:2: ( ( rule__GraphicRootClassesItemsPropertiesAbstract__Alternatives ) )
            // InternalGraphicParser.g:166:3: ( rule__GraphicRootClassesItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalGraphicParser.g:167:3: ( rule__GraphicRootClassesItemsPropertiesAbstract__Alternatives )
            // InternalGraphicParser.g:167:4: rule__GraphicRootClassesItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsPropertiesAbstract"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVersionsPropertiesAbstract"
    // InternalGraphicParser.g:176:1: entryRuleGraphicRootClassesItemsVersionsPropertiesAbstract : ruleGraphicRootClassesItemsVersionsPropertiesAbstract EOF ;
    public final void entryRuleGraphicRootClassesItemsVersionsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalGraphicParser.g:177:1: ( ruleGraphicRootClassesItemsVersionsPropertiesAbstract EOF )
            // InternalGraphicParser.g:178:1: ruleGraphicRootClassesItemsVersionsPropertiesAbstract EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsVersionsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsVersionsPropertiesAbstract"


    // $ANTLR start "ruleGraphicRootClassesItemsVersionsPropertiesAbstract"
    // InternalGraphicParser.g:185:1: ruleGraphicRootClassesItemsVersionsPropertiesAbstract : ( ( rule__GraphicRootClassesItemsVersionsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleGraphicRootClassesItemsVersionsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:189:2: ( ( ( rule__GraphicRootClassesItemsVersionsPropertiesAbstract__Alternatives ) ) )
            // InternalGraphicParser.g:190:2: ( ( rule__GraphicRootClassesItemsVersionsPropertiesAbstract__Alternatives ) )
            {
            // InternalGraphicParser.g:190:2: ( ( rule__GraphicRootClassesItemsVersionsPropertiesAbstract__Alternatives ) )
            // InternalGraphicParser.g:191:3: ( rule__GraphicRootClassesItemsVersionsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractAccess().getAlternatives()); 
            // InternalGraphicParser.g:192:3: ( rule__GraphicRootClassesItemsVersionsPropertiesAbstract__Alternatives )
            // InternalGraphicParser.g:192:4: rule__GraphicRootClassesItemsVersionsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsVersionsPropertiesAbstract"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVnamePropertiesAbstract"
    // InternalGraphicParser.g:201:1: entryRuleGraphicRootClassesItemsVnamePropertiesAbstract : ruleGraphicRootClassesItemsVnamePropertiesAbstract EOF ;
    public final void entryRuleGraphicRootClassesItemsVnamePropertiesAbstract() throws RecognitionException {
        try {
            // InternalGraphicParser.g:202:1: ( ruleGraphicRootClassesItemsVnamePropertiesAbstract EOF )
            // InternalGraphicParser.g:203:1: ruleGraphicRootClassesItemsVnamePropertiesAbstract EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsVnamePropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsVnamePropertiesAbstract"


    // $ANTLR start "ruleGraphicRootClassesItemsVnamePropertiesAbstract"
    // InternalGraphicParser.g:210:1: ruleGraphicRootClassesItemsVnamePropertiesAbstract : ( ( rule__GraphicRootClassesItemsVnamePropertiesAbstract__Alternatives ) ) ;
    public final void ruleGraphicRootClassesItemsVnamePropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:214:2: ( ( ( rule__GraphicRootClassesItemsVnamePropertiesAbstract__Alternatives ) ) )
            // InternalGraphicParser.g:215:2: ( ( rule__GraphicRootClassesItemsVnamePropertiesAbstract__Alternatives ) )
            {
            // InternalGraphicParser.g:215:2: ( ( rule__GraphicRootClassesItemsVnamePropertiesAbstract__Alternatives ) )
            // InternalGraphicParser.g:216:3: ( rule__GraphicRootClassesItemsVnamePropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractAccess().getAlternatives()); 
            // InternalGraphicParser.g:217:3: ( rule__GraphicRootClassesItemsVnamePropertiesAbstract__Alternatives )
            // InternalGraphicParser.g:217:4: rule__GraphicRootClassesItemsVnamePropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnamePropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsVnamePropertiesAbstract"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsPropertiesAbstract"
    // InternalGraphicParser.g:226:1: entryRuleGraphicRootClassesItemsConstraintsPropertiesAbstract : ruleGraphicRootClassesItemsConstraintsPropertiesAbstract EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalGraphicParser.g:227:1: ( ruleGraphicRootClassesItemsConstraintsPropertiesAbstract EOF )
            // InternalGraphicParser.g:228:1: ruleGraphicRootClassesItemsConstraintsPropertiesAbstract EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsPropertiesAbstract"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsPropertiesAbstract"
    // InternalGraphicParser.g:235:1: ruleGraphicRootClassesItemsConstraintsPropertiesAbstract : ( ( rule__GraphicRootClassesItemsConstraintsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:239:2: ( ( ( rule__GraphicRootClassesItemsConstraintsPropertiesAbstract__Alternatives ) ) )
            // InternalGraphicParser.g:240:2: ( ( rule__GraphicRootClassesItemsConstraintsPropertiesAbstract__Alternatives ) )
            {
            // InternalGraphicParser.g:240:2: ( ( rule__GraphicRootClassesItemsConstraintsPropertiesAbstract__Alternatives ) )
            // InternalGraphicParser.g:241:3: ( rule__GraphicRootClassesItemsConstraintsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getAlternatives()); 
            // InternalGraphicParser.g:242:3: ( rule__GraphicRootClassesItemsConstraintsPropertiesAbstract__Alternatives )
            // InternalGraphicParser.g:242:4: rule__GraphicRootClassesItemsConstraintsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsPropertiesAbstract"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract"
    // InternalGraphicParser.g:251:1: entryRuleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract : ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalGraphicParser.g:252:1: ( ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract EOF )
            // InternalGraphicParser.g:253:1: ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract"
    // InternalGraphicParser.g:260:1: ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract : ( ( rule__GraphicRootClassesItemsConnectionsItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:264:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsPropertiesAbstract__Alternatives ) ) )
            // InternalGraphicParser.g:265:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalGraphicParser.g:265:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsPropertiesAbstract__Alternatives ) )
            // InternalGraphicParser.g:266:3: ( rule__GraphicRootClassesItemsConnectionsItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalGraphicParser.g:267:3: ( rule__GraphicRootClassesItemsConnectionsItemsPropertiesAbstract__Alternatives )
            // InternalGraphicParser.g:267:4: rule__GraphicRootClassesItemsConnectionsItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract"


    // $ANTLR start "entryRuleGraphicRootName"
    // InternalGraphicParser.g:276:1: entryRuleGraphicRootName : ruleGraphicRootName EOF ;
    public final void entryRuleGraphicRootName() throws RecognitionException {
        try {
            // InternalGraphicParser.g:277:1: ( ruleGraphicRootName EOF )
            // InternalGraphicParser.g:278:1: ruleGraphicRootName EOF
            {
             before(grammarAccess.getGraphicRootNameRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootName();

            state._fsp--;

             after(grammarAccess.getGraphicRootNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootName"


    // $ANTLR start "ruleGraphicRootName"
    // InternalGraphicParser.g:285:1: ruleGraphicRootName : ( ( rule__GraphicRootName__Group__0 ) ) ;
    public final void ruleGraphicRootName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:289:2: ( ( ( rule__GraphicRootName__Group__0 ) ) )
            // InternalGraphicParser.g:290:2: ( ( rule__GraphicRootName__Group__0 ) )
            {
            // InternalGraphicParser.g:290:2: ( ( rule__GraphicRootName__Group__0 ) )
            // InternalGraphicParser.g:291:3: ( rule__GraphicRootName__Group__0 )
            {
             before(grammarAccess.getGraphicRootNameAccess().getGroup()); 
            // InternalGraphicParser.g:292:3: ( rule__GraphicRootName__Group__0 )
            // InternalGraphicParser.g:292:4: rule__GraphicRootName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootName"


    // $ANTLR start "entryRuleGraphicRootURI"
    // InternalGraphicParser.g:301:1: entryRuleGraphicRootURI : ruleGraphicRootURI EOF ;
    public final void entryRuleGraphicRootURI() throws RecognitionException {
        try {
            // InternalGraphicParser.g:302:1: ( ruleGraphicRootURI EOF )
            // InternalGraphicParser.g:303:1: ruleGraphicRootURI EOF
            {
             before(grammarAccess.getGraphicRootURIRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootURI();

            state._fsp--;

             after(grammarAccess.getGraphicRootURIRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootURI"


    // $ANTLR start "ruleGraphicRootURI"
    // InternalGraphicParser.g:310:1: ruleGraphicRootURI : ( ( rule__GraphicRootURI__Group__0 ) ) ;
    public final void ruleGraphicRootURI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:314:2: ( ( ( rule__GraphicRootURI__Group__0 ) ) )
            // InternalGraphicParser.g:315:2: ( ( rule__GraphicRootURI__Group__0 ) )
            {
            // InternalGraphicParser.g:315:2: ( ( rule__GraphicRootURI__Group__0 ) )
            // InternalGraphicParser.g:316:3: ( rule__GraphicRootURI__Group__0 )
            {
             before(grammarAccess.getGraphicRootURIAccess().getGroup()); 
            // InternalGraphicParser.g:317:3: ( rule__GraphicRootURI__Group__0 )
            // InternalGraphicParser.g:317:4: rule__GraphicRootURI__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootURI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootURIAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootURI"


    // $ANTLR start "entryRuleGraphicRootClasses"
    // InternalGraphicParser.g:326:1: entryRuleGraphicRootClasses : ruleGraphicRootClasses EOF ;
    public final void entryRuleGraphicRootClasses() throws RecognitionException {
        try {
            // InternalGraphicParser.g:327:1: ( ruleGraphicRootClasses EOF )
            // InternalGraphicParser.g:328:1: ruleGraphicRootClasses EOF
            {
             before(grammarAccess.getGraphicRootClassesRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClasses();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClasses"


    // $ANTLR start "ruleGraphicRootClasses"
    // InternalGraphicParser.g:335:1: ruleGraphicRootClasses : ( ( rule__GraphicRootClasses__Group__0 ) ) ;
    public final void ruleGraphicRootClasses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:339:2: ( ( ( rule__GraphicRootClasses__Group__0 ) ) )
            // InternalGraphicParser.g:340:2: ( ( rule__GraphicRootClasses__Group__0 ) )
            {
            // InternalGraphicParser.g:340:2: ( ( rule__GraphicRootClasses__Group__0 ) )
            // InternalGraphicParser.g:341:3: ( rule__GraphicRootClasses__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesAccess().getGroup()); 
            // InternalGraphicParser.g:342:3: ( rule__GraphicRootClasses__Group__0 )
            // InternalGraphicParser.g:342:4: rule__GraphicRootClasses__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClasses"


    // $ANTLR start "entryRuleEString"
    // InternalGraphicParser.g:351:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGraphicParser.g:352:1: ( ruleEString EOF )
            // InternalGraphicParser.g:353:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalGraphicParser.g:360:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:364:2: ( ( ruleVALID_STRING ) )
            // InternalGraphicParser.g:365:2: ( ruleVALID_STRING )
            {
            // InternalGraphicParser.g:365:2: ( ruleVALID_STRING )
            // InternalGraphicParser.g:366:3: ruleVALID_STRING
            {
             before(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleVALID_STRING();

            state._fsp--;

             after(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleGraphicRootClassesItems"
    // InternalGraphicParser.g:376:1: entryRuleGraphicRootClassesItems : ruleGraphicRootClassesItems EOF ;
    public final void entryRuleGraphicRootClassesItems() throws RecognitionException {
        try {
            // InternalGraphicParser.g:377:1: ( ruleGraphicRootClassesItems EOF )
            // InternalGraphicParser.g:378:1: ruleGraphicRootClassesItems EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItems();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItems"


    // $ANTLR start "ruleGraphicRootClassesItems"
    // InternalGraphicParser.g:385:1: ruleGraphicRootClassesItems : ( ( rule__GraphicRootClassesItems__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:389:2: ( ( ( rule__GraphicRootClassesItems__Group__0 ) ) )
            // InternalGraphicParser.g:390:2: ( ( rule__GraphicRootClassesItems__Group__0 ) )
            {
            // InternalGraphicParser.g:390:2: ( ( rule__GraphicRootClassesItems__Group__0 ) )
            // InternalGraphicParser.g:391:3: ( rule__GraphicRootClassesItems__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsAccess().getGroup()); 
            // InternalGraphicParser.g:392:3: ( rule__GraphicRootClassesItems__Group__0 )
            // InternalGraphicParser.g:392:4: rule__GraphicRootClassesItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItems"


    // $ANTLR start "entryRuleGraphicRootClassesItemsName"
    // InternalGraphicParser.g:401:1: entryRuleGraphicRootClassesItemsName : ruleGraphicRootClassesItemsName EOF ;
    public final void entryRuleGraphicRootClassesItemsName() throws RecognitionException {
        try {
            // InternalGraphicParser.g:402:1: ( ruleGraphicRootClassesItemsName EOF )
            // InternalGraphicParser.g:403:1: ruleGraphicRootClassesItemsName EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsNameRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsName();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsName"


    // $ANTLR start "ruleGraphicRootClassesItemsName"
    // InternalGraphicParser.g:410:1: ruleGraphicRootClassesItemsName : ( ( rule__GraphicRootClassesItemsName__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:414:2: ( ( ( rule__GraphicRootClassesItemsName__Group__0 ) ) )
            // InternalGraphicParser.g:415:2: ( ( rule__GraphicRootClassesItemsName__Group__0 ) )
            {
            // InternalGraphicParser.g:415:2: ( ( rule__GraphicRootClassesItemsName__Group__0 ) )
            // InternalGraphicParser.g:416:3: ( rule__GraphicRootClassesItemsName__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsNameAccess().getGroup()); 
            // InternalGraphicParser.g:417:3: ( rule__GraphicRootClassesItemsName__Group__0 )
            // InternalGraphicParser.g:417:4: rule__GraphicRootClassesItemsName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsName"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVersions"
    // InternalGraphicParser.g:426:1: entryRuleGraphicRootClassesItemsVersions : ruleGraphicRootClassesItemsVersions EOF ;
    public final void entryRuleGraphicRootClassesItemsVersions() throws RecognitionException {
        try {
            // InternalGraphicParser.g:427:1: ( ruleGraphicRootClassesItemsVersions EOF )
            // InternalGraphicParser.g:428:1: ruleGraphicRootClassesItemsVersions EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsVersions();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVersionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsVersions"


    // $ANTLR start "ruleGraphicRootClassesItemsVersions"
    // InternalGraphicParser.g:435:1: ruleGraphicRootClassesItemsVersions : ( ( rule__GraphicRootClassesItemsVersions__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsVersions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:439:2: ( ( ( rule__GraphicRootClassesItemsVersions__Group__0 ) ) )
            // InternalGraphicParser.g:440:2: ( ( rule__GraphicRootClassesItemsVersions__Group__0 ) )
            {
            // InternalGraphicParser.g:440:2: ( ( rule__GraphicRootClassesItemsVersions__Group__0 ) )
            // InternalGraphicParser.g:441:3: ( rule__GraphicRootClassesItemsVersions__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getGroup()); 
            // InternalGraphicParser.g:442:3: ( rule__GraphicRootClassesItemsVersions__Group__0 )
            // InternalGraphicParser.g:442:4: rule__GraphicRootClassesItemsVersions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsVersions"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVname"
    // InternalGraphicParser.g:451:1: entryRuleGraphicRootClassesItemsVname : ruleGraphicRootClassesItemsVname EOF ;
    public final void entryRuleGraphicRootClassesItemsVname() throws RecognitionException {
        try {
            // InternalGraphicParser.g:452:1: ( ruleGraphicRootClassesItemsVname EOF )
            // InternalGraphicParser.g:453:1: ruleGraphicRootClassesItemsVname EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsVname();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVnameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsVname"


    // $ANTLR start "ruleGraphicRootClassesItemsVname"
    // InternalGraphicParser.g:460:1: ruleGraphicRootClassesItemsVname : ( ( rule__GraphicRootClassesItemsVname__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsVname() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:464:2: ( ( ( rule__GraphicRootClassesItemsVname__Group__0 ) ) )
            // InternalGraphicParser.g:465:2: ( ( rule__GraphicRootClassesItemsVname__Group__0 ) )
            {
            // InternalGraphicParser.g:465:2: ( ( rule__GraphicRootClassesItemsVname__Group__0 ) )
            // InternalGraphicParser.g:466:3: ( rule__GraphicRootClassesItemsVname__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getGroup()); 
            // InternalGraphicParser.g:467:3: ( rule__GraphicRootClassesItemsVname__Group__0 )
            // InternalGraphicParser.g:467:4: rule__GraphicRootClassesItemsVname__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsVname"


    // $ANTLR start "entryRuleGraphicRootClassesItemsShowAttributes"
    // InternalGraphicParser.g:476:1: entryRuleGraphicRootClassesItemsShowAttributes : ruleGraphicRootClassesItemsShowAttributes EOF ;
    public final void entryRuleGraphicRootClassesItemsShowAttributes() throws RecognitionException {
        try {
            // InternalGraphicParser.g:477:1: ( ruleGraphicRootClassesItemsShowAttributes EOF )
            // InternalGraphicParser.g:478:1: ruleGraphicRootClassesItemsShowAttributes EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsShowAttributes();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsShowAttributesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsShowAttributes"


    // $ANTLR start "ruleGraphicRootClassesItemsShowAttributes"
    // InternalGraphicParser.g:485:1: ruleGraphicRootClassesItemsShowAttributes : ( ( rule__GraphicRootClassesItemsShowAttributes__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsShowAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:489:2: ( ( ( rule__GraphicRootClassesItemsShowAttributes__Group__0 ) ) )
            // InternalGraphicParser.g:490:2: ( ( rule__GraphicRootClassesItemsShowAttributes__Group__0 ) )
            {
            // InternalGraphicParser.g:490:2: ( ( rule__GraphicRootClassesItemsShowAttributes__Group__0 ) )
            // InternalGraphicParser.g:491:3: ( rule__GraphicRootClassesItemsShowAttributes__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getGroup()); 
            // InternalGraphicParser.g:492:3: ( rule__GraphicRootClassesItemsShowAttributes__Group__0 )
            // InternalGraphicParser.g:492:4: rule__GraphicRootClassesItemsShowAttributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsShowAttributes"


    // $ANTLR start "entryRuleGraphicRootClassesItemsMaterialAttributes"
    // InternalGraphicParser.g:501:1: entryRuleGraphicRootClassesItemsMaterialAttributes : ruleGraphicRootClassesItemsMaterialAttributes EOF ;
    public final void entryRuleGraphicRootClassesItemsMaterialAttributes() throws RecognitionException {
        try {
            // InternalGraphicParser.g:502:1: ( ruleGraphicRootClassesItemsMaterialAttributes EOF )
            // InternalGraphicParser.g:503:1: ruleGraphicRootClassesItemsMaterialAttributes EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsMaterialAttributes();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsMaterialAttributes"


    // $ANTLR start "ruleGraphicRootClassesItemsMaterialAttributes"
    // InternalGraphicParser.g:510:1: ruleGraphicRootClassesItemsMaterialAttributes : ( ( rule__GraphicRootClassesItemsMaterialAttributes__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsMaterialAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:514:2: ( ( ( rule__GraphicRootClassesItemsMaterialAttributes__Group__0 ) ) )
            // InternalGraphicParser.g:515:2: ( ( rule__GraphicRootClassesItemsMaterialAttributes__Group__0 ) )
            {
            // InternalGraphicParser.g:515:2: ( ( rule__GraphicRootClassesItemsMaterialAttributes__Group__0 ) )
            // InternalGraphicParser.g:516:3: ( rule__GraphicRootClassesItemsMaterialAttributes__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getGroup()); 
            // InternalGraphicParser.g:517:3: ( rule__GraphicRootClassesItemsMaterialAttributes__Group__0 )
            // InternalGraphicParser.g:517:4: rule__GraphicRootClassesItemsMaterialAttributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsMaterialAttributes"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraints"
    // InternalGraphicParser.g:526:1: entryRuleGraphicRootClassesItemsConstraints : ruleGraphicRootClassesItemsConstraints EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraints() throws RecognitionException {
        try {
            // InternalGraphicParser.g:527:1: ( ruleGraphicRootClassesItemsConstraints EOF )
            // InternalGraphicParser.g:528:1: ruleGraphicRootClassesItemsConstraints EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraints();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraints"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraints"
    // InternalGraphicParser.g:535:1: ruleGraphicRootClassesItemsConstraints : ( ( rule__GraphicRootClassesItemsConstraints__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:539:2: ( ( ( rule__GraphicRootClassesItemsConstraints__Group__0 ) ) )
            // InternalGraphicParser.g:540:2: ( ( rule__GraphicRootClassesItemsConstraints__Group__0 ) )
            {
            // InternalGraphicParser.g:540:2: ( ( rule__GraphicRootClassesItemsConstraints__Group__0 ) )
            // InternalGraphicParser.g:541:3: ( rule__GraphicRootClassesItemsConstraints__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getGroup()); 
            // InternalGraphicParser.g:542:3: ( rule__GraphicRootClassesItemsConstraints__Group__0 )
            // InternalGraphicParser.g:542:4: rule__GraphicRootClassesItemsConstraints__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraints"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnections"
    // InternalGraphicParser.g:551:1: entryRuleGraphicRootClassesItemsConnections : ruleGraphicRootClassesItemsConnections EOF ;
    public final void entryRuleGraphicRootClassesItemsConnections() throws RecognitionException {
        try {
            // InternalGraphicParser.g:552:1: ( ruleGraphicRootClassesItemsConnections EOF )
            // InternalGraphicParser.g:553:1: ruleGraphicRootClassesItemsConnections EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnections();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnections"


    // $ANTLR start "ruleGraphicRootClassesItemsConnections"
    // InternalGraphicParser.g:560:1: ruleGraphicRootClassesItemsConnections : ( ( rule__GraphicRootClassesItemsConnections__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnections() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:564:2: ( ( ( rule__GraphicRootClassesItemsConnections__Group__0 ) ) )
            // InternalGraphicParser.g:565:2: ( ( rule__GraphicRootClassesItemsConnections__Group__0 ) )
            {
            // InternalGraphicParser.g:565:2: ( ( rule__GraphicRootClassesItemsConnections__Group__0 ) )
            // InternalGraphicParser.g:566:3: ( rule__GraphicRootClassesItemsConnections__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getGroup()); 
            // InternalGraphicParser.g:567:3: ( rule__GraphicRootClassesItemsConnections__Group__0 )
            // InternalGraphicParser.g:567:4: rule__GraphicRootClassesItemsConnections__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnections"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVersionsV1"
    // InternalGraphicParser.g:576:1: entryRuleGraphicRootClassesItemsVersionsV1 : ruleGraphicRootClassesItemsVersionsV1 EOF ;
    public final void entryRuleGraphicRootClassesItemsVersionsV1() throws RecognitionException {
        try {
            // InternalGraphicParser.g:577:1: ( ruleGraphicRootClassesItemsVersionsV1 EOF )
            // InternalGraphicParser.g:578:1: ruleGraphicRootClassesItemsVersionsV1 EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV1Rule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsVersionsV1();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVersionsV1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsVersionsV1"


    // $ANTLR start "ruleGraphicRootClassesItemsVersionsV1"
    // InternalGraphicParser.g:585:1: ruleGraphicRootClassesItemsVersionsV1 : ( ( rule__GraphicRootClassesItemsVersionsV1__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsVersionsV1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:589:2: ( ( ( rule__GraphicRootClassesItemsVersionsV1__Group__0 ) ) )
            // InternalGraphicParser.g:590:2: ( ( rule__GraphicRootClassesItemsVersionsV1__Group__0 ) )
            {
            // InternalGraphicParser.g:590:2: ( ( rule__GraphicRootClassesItemsVersionsV1__Group__0 ) )
            // InternalGraphicParser.g:591:3: ( rule__GraphicRootClassesItemsVersionsV1__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getGroup()); 
            // InternalGraphicParser.g:592:3: ( rule__GraphicRootClassesItemsVersionsV1__Group__0 )
            // InternalGraphicParser.g:592:4: rule__GraphicRootClassesItemsVersionsV1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsVersionsV1"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVersionsV2"
    // InternalGraphicParser.g:601:1: entryRuleGraphicRootClassesItemsVersionsV2 : ruleGraphicRootClassesItemsVersionsV2 EOF ;
    public final void entryRuleGraphicRootClassesItemsVersionsV2() throws RecognitionException {
        try {
            // InternalGraphicParser.g:602:1: ( ruleGraphicRootClassesItemsVersionsV2 EOF )
            // InternalGraphicParser.g:603:1: ruleGraphicRootClassesItemsVersionsV2 EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV2Rule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsVersionsV2();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVersionsV2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsVersionsV2"


    // $ANTLR start "ruleGraphicRootClassesItemsVersionsV2"
    // InternalGraphicParser.g:610:1: ruleGraphicRootClassesItemsVersionsV2 : ( ( rule__GraphicRootClassesItemsVersionsV2__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsVersionsV2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:614:2: ( ( ( rule__GraphicRootClassesItemsVersionsV2__Group__0 ) ) )
            // InternalGraphicParser.g:615:2: ( ( rule__GraphicRootClassesItemsVersionsV2__Group__0 ) )
            {
            // InternalGraphicParser.g:615:2: ( ( rule__GraphicRootClassesItemsVersionsV2__Group__0 ) )
            // InternalGraphicParser.g:616:3: ( rule__GraphicRootClassesItemsVersionsV2__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getGroup()); 
            // InternalGraphicParser.g:617:3: ( rule__GraphicRootClassesItemsVersionsV2__Group__0 )
            // InternalGraphicParser.g:617:4: rule__GraphicRootClassesItemsVersionsV2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsVersionsV2"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVersionsV3"
    // InternalGraphicParser.g:626:1: entryRuleGraphicRootClassesItemsVersionsV3 : ruleGraphicRootClassesItemsVersionsV3 EOF ;
    public final void entryRuleGraphicRootClassesItemsVersionsV3() throws RecognitionException {
        try {
            // InternalGraphicParser.g:627:1: ( ruleGraphicRootClassesItemsVersionsV3 EOF )
            // InternalGraphicParser.g:628:1: ruleGraphicRootClassesItemsVersionsV3 EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV3Rule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsVersionsV3();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVersionsV3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsVersionsV3"


    // $ANTLR start "ruleGraphicRootClassesItemsVersionsV3"
    // InternalGraphicParser.g:635:1: ruleGraphicRootClassesItemsVersionsV3 : ( ( rule__GraphicRootClassesItemsVersionsV3__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsVersionsV3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:639:2: ( ( ( rule__GraphicRootClassesItemsVersionsV3__Group__0 ) ) )
            // InternalGraphicParser.g:640:2: ( ( rule__GraphicRootClassesItemsVersionsV3__Group__0 ) )
            {
            // InternalGraphicParser.g:640:2: ( ( rule__GraphicRootClassesItemsVersionsV3__Group__0 ) )
            // InternalGraphicParser.g:641:3: ( rule__GraphicRootClassesItemsVersionsV3__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getGroup()); 
            // InternalGraphicParser.g:642:3: ( rule__GraphicRootClassesItemsVersionsV3__Group__0 )
            // InternalGraphicParser.g:642:4: rule__GraphicRootClassesItemsVersionsV3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsVersionsV3"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVnameV1"
    // InternalGraphicParser.g:651:1: entryRuleGraphicRootClassesItemsVnameV1 : ruleGraphicRootClassesItemsVnameV1 EOF ;
    public final void entryRuleGraphicRootClassesItemsVnameV1() throws RecognitionException {
        try {
            // InternalGraphicParser.g:652:1: ( ruleGraphicRootClassesItemsVnameV1 EOF )
            // InternalGraphicParser.g:653:1: ruleGraphicRootClassesItemsVnameV1 EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV1Rule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsVnameV1();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVnameV1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsVnameV1"


    // $ANTLR start "ruleGraphicRootClassesItemsVnameV1"
    // InternalGraphicParser.g:660:1: ruleGraphicRootClassesItemsVnameV1 : ( ( rule__GraphicRootClassesItemsVnameV1__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsVnameV1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:664:2: ( ( ( rule__GraphicRootClassesItemsVnameV1__Group__0 ) ) )
            // InternalGraphicParser.g:665:2: ( ( rule__GraphicRootClassesItemsVnameV1__Group__0 ) )
            {
            // InternalGraphicParser.g:665:2: ( ( rule__GraphicRootClassesItemsVnameV1__Group__0 ) )
            // InternalGraphicParser.g:666:3: ( rule__GraphicRootClassesItemsVnameV1__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV1Access().getGroup()); 
            // InternalGraphicParser.g:667:3: ( rule__GraphicRootClassesItemsVnameV1__Group__0 )
            // InternalGraphicParser.g:667:4: rule__GraphicRootClassesItemsVnameV1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVnameV1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsVnameV1"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVnameV2"
    // InternalGraphicParser.g:676:1: entryRuleGraphicRootClassesItemsVnameV2 : ruleGraphicRootClassesItemsVnameV2 EOF ;
    public final void entryRuleGraphicRootClassesItemsVnameV2() throws RecognitionException {
        try {
            // InternalGraphicParser.g:677:1: ( ruleGraphicRootClassesItemsVnameV2 EOF )
            // InternalGraphicParser.g:678:1: ruleGraphicRootClassesItemsVnameV2 EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV2Rule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsVnameV2();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVnameV2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsVnameV2"


    // $ANTLR start "ruleGraphicRootClassesItemsVnameV2"
    // InternalGraphicParser.g:685:1: ruleGraphicRootClassesItemsVnameV2 : ( ( rule__GraphicRootClassesItemsVnameV2__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsVnameV2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:689:2: ( ( ( rule__GraphicRootClassesItemsVnameV2__Group__0 ) ) )
            // InternalGraphicParser.g:690:2: ( ( rule__GraphicRootClassesItemsVnameV2__Group__0 ) )
            {
            // InternalGraphicParser.g:690:2: ( ( rule__GraphicRootClassesItemsVnameV2__Group__0 ) )
            // InternalGraphicParser.g:691:3: ( rule__GraphicRootClassesItemsVnameV2__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV2Access().getGroup()); 
            // InternalGraphicParser.g:692:3: ( rule__GraphicRootClassesItemsVnameV2__Group__0 )
            // InternalGraphicParser.g:692:4: rule__GraphicRootClassesItemsVnameV2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVnameV2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsVnameV2"


    // $ANTLR start "entryRuleGraphicRootClassesItemsVnameV3"
    // InternalGraphicParser.g:701:1: entryRuleGraphicRootClassesItemsVnameV3 : ruleGraphicRootClassesItemsVnameV3 EOF ;
    public final void entryRuleGraphicRootClassesItemsVnameV3() throws RecognitionException {
        try {
            // InternalGraphicParser.g:702:1: ( ruleGraphicRootClassesItemsVnameV3 EOF )
            // InternalGraphicParser.g:703:1: ruleGraphicRootClassesItemsVnameV3 EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV3Rule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsVnameV3();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVnameV3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsVnameV3"


    // $ANTLR start "ruleGraphicRootClassesItemsVnameV3"
    // InternalGraphicParser.g:710:1: ruleGraphicRootClassesItemsVnameV3 : ( ( rule__GraphicRootClassesItemsVnameV3__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsVnameV3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:714:2: ( ( ( rule__GraphicRootClassesItemsVnameV3__Group__0 ) ) )
            // InternalGraphicParser.g:715:2: ( ( rule__GraphicRootClassesItemsVnameV3__Group__0 ) )
            {
            // InternalGraphicParser.g:715:2: ( ( rule__GraphicRootClassesItemsVnameV3__Group__0 ) )
            // InternalGraphicParser.g:716:3: ( rule__GraphicRootClassesItemsVnameV3__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV3Access().getGroup()); 
            // InternalGraphicParser.g:717:3: ( rule__GraphicRootClassesItemsVnameV3__Group__0 )
            // InternalGraphicParser.g:717:4: rule__GraphicRootClassesItemsVnameV3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVnameV3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsVnameV3"


    // $ANTLR start "entryRuleGraphicRootClassesItemsShowAttributesItems"
    // InternalGraphicParser.g:726:1: entryRuleGraphicRootClassesItemsShowAttributesItems : ruleGraphicRootClassesItemsShowAttributesItems EOF ;
    public final void entryRuleGraphicRootClassesItemsShowAttributesItems() throws RecognitionException {
        try {
            // InternalGraphicParser.g:727:1: ( ruleGraphicRootClassesItemsShowAttributesItems EOF )
            // InternalGraphicParser.g:728:1: ruleGraphicRootClassesItemsShowAttributesItems EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsShowAttributesItems();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsShowAttributesItemsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsShowAttributesItems"


    // $ANTLR start "ruleGraphicRootClassesItemsShowAttributesItems"
    // InternalGraphicParser.g:735:1: ruleGraphicRootClassesItemsShowAttributesItems : ( ( rule__GraphicRootClassesItemsShowAttributesItems__ItemsAssignment ) ) ;
    public final void ruleGraphicRootClassesItemsShowAttributesItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:739:2: ( ( ( rule__GraphicRootClassesItemsShowAttributesItems__ItemsAssignment ) ) )
            // InternalGraphicParser.g:740:2: ( ( rule__GraphicRootClassesItemsShowAttributesItems__ItemsAssignment ) )
            {
            // InternalGraphicParser.g:740:2: ( ( rule__GraphicRootClassesItemsShowAttributesItems__ItemsAssignment ) )
            // InternalGraphicParser.g:741:3: ( rule__GraphicRootClassesItemsShowAttributesItems__ItemsAssignment )
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesItemsAccess().getItemsAssignment()); 
            // InternalGraphicParser.g:742:3: ( rule__GraphicRootClassesItemsShowAttributesItems__ItemsAssignment )
            // InternalGraphicParser.g:742:4: rule__GraphicRootClassesItemsShowAttributesItems__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributesItems__ItemsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsShowAttributesItemsAccess().getItemsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsShowAttributesItems"


    // $ANTLR start "entryRuleGraphicRootClassesItemsMaterialAttributesItems"
    // InternalGraphicParser.g:751:1: entryRuleGraphicRootClassesItemsMaterialAttributesItems : ruleGraphicRootClassesItemsMaterialAttributesItems EOF ;
    public final void entryRuleGraphicRootClassesItemsMaterialAttributesItems() throws RecognitionException {
        try {
            // InternalGraphicParser.g:752:1: ( ruleGraphicRootClassesItemsMaterialAttributesItems EOF )
            // InternalGraphicParser.g:753:1: ruleGraphicRootClassesItemsMaterialAttributesItems EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsMaterialAttributesItems();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesItemsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsMaterialAttributesItems"


    // $ANTLR start "ruleGraphicRootClassesItemsMaterialAttributesItems"
    // InternalGraphicParser.g:760:1: ruleGraphicRootClassesItemsMaterialAttributesItems : ( ( rule__GraphicRootClassesItemsMaterialAttributesItems__ItemsAssignment ) ) ;
    public final void ruleGraphicRootClassesItemsMaterialAttributesItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:764:2: ( ( ( rule__GraphicRootClassesItemsMaterialAttributesItems__ItemsAssignment ) ) )
            // InternalGraphicParser.g:765:2: ( ( rule__GraphicRootClassesItemsMaterialAttributesItems__ItemsAssignment ) )
            {
            // InternalGraphicParser.g:765:2: ( ( rule__GraphicRootClassesItemsMaterialAttributesItems__ItemsAssignment ) )
            // InternalGraphicParser.g:766:3: ( rule__GraphicRootClassesItemsMaterialAttributesItems__ItemsAssignment )
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesItemsAccess().getItemsAssignment()); 
            // InternalGraphicParser.g:767:3: ( rule__GraphicRootClassesItemsMaterialAttributesItems__ItemsAssignment )
            // InternalGraphicParser.g:767:4: rule__GraphicRootClassesItemsMaterialAttributesItems__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributesItems__ItemsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesItemsAccess().getItemsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsMaterialAttributesItems"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsPlanes"
    // InternalGraphicParser.g:776:1: entryRuleGraphicRootClassesItemsConstraintsPlanes : ruleGraphicRootClassesItemsConstraintsPlanes EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsPlanes() throws RecognitionException {
        try {
            // InternalGraphicParser.g:777:1: ( ruleGraphicRootClassesItemsConstraintsPlanes EOF )
            // InternalGraphicParser.g:778:1: ruleGraphicRootClassesItemsConstraintsPlanes EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsPlanes();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsPlanes"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsPlanes"
    // InternalGraphicParser.g:785:1: ruleGraphicRootClassesItemsConstraintsPlanes : ( ( rule__GraphicRootClassesItemsConstraintsPlanes__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsPlanes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:789:2: ( ( ( rule__GraphicRootClassesItemsConstraintsPlanes__Group__0 ) ) )
            // InternalGraphicParser.g:790:2: ( ( rule__GraphicRootClassesItemsConstraintsPlanes__Group__0 ) )
            {
            // InternalGraphicParser.g:790:2: ( ( rule__GraphicRootClassesItemsConstraintsPlanes__Group__0 ) )
            // InternalGraphicParser.g:791:3: ( rule__GraphicRootClassesItemsConstraintsPlanes__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getGroup()); 
            // InternalGraphicParser.g:792:3: ( rule__GraphicRootClassesItemsConstraintsPlanes__Group__0 )
            // InternalGraphicParser.g:792:4: rule__GraphicRootClassesItemsConstraintsPlanes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsPlanes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsPlanes"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsIlumination"
    // InternalGraphicParser.g:801:1: entryRuleGraphicRootClassesItemsConstraintsIlumination : ruleGraphicRootClassesItemsConstraintsIlumination EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsIlumination() throws RecognitionException {
        try {
            // InternalGraphicParser.g:802:1: ( ruleGraphicRootClassesItemsConstraintsIlumination EOF )
            // InternalGraphicParser.g:803:1: ruleGraphicRootClassesItemsConstraintsIlumination EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsIlumination();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsIlumination"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsIlumination"
    // InternalGraphicParser.g:810:1: ruleGraphicRootClassesItemsConstraintsIlumination : ( ( rule__GraphicRootClassesItemsConstraintsIlumination__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsIlumination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:814:2: ( ( ( rule__GraphicRootClassesItemsConstraintsIlumination__Group__0 ) ) )
            // InternalGraphicParser.g:815:2: ( ( rule__GraphicRootClassesItemsConstraintsIlumination__Group__0 ) )
            {
            // InternalGraphicParser.g:815:2: ( ( rule__GraphicRootClassesItemsConstraintsIlumination__Group__0 ) )
            // InternalGraphicParser.g:816:3: ( rule__GraphicRootClassesItemsConstraintsIlumination__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getGroup()); 
            // InternalGraphicParser.g:817:3: ( rule__GraphicRootClassesItemsConstraintsIlumination__Group__0 )
            // InternalGraphicParser.g:817:4: rule__GraphicRootClassesItemsConstraintsIlumination__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsIlumination__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsIlumination"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsSizeMax"
    // InternalGraphicParser.g:826:1: entryRuleGraphicRootClassesItemsConstraintsSizeMax : ruleGraphicRootClassesItemsConstraintsSizeMax EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsSizeMax() throws RecognitionException {
        try {
            // InternalGraphicParser.g:827:1: ( ruleGraphicRootClassesItemsConstraintsSizeMax EOF )
            // InternalGraphicParser.g:828:1: ruleGraphicRootClassesItemsConstraintsSizeMax EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsSizeMax();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsSizeMax"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsSizeMax"
    // InternalGraphicParser.g:835:1: ruleGraphicRootClassesItemsConstraintsSizeMax : ( ( rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsSizeMax() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:839:2: ( ( ( rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0 ) ) )
            // InternalGraphicParser.g:840:2: ( ( rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0 ) )
            {
            // InternalGraphicParser.g:840:2: ( ( rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0 ) )
            // InternalGraphicParser.g:841:3: ( rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getGroup()); 
            // InternalGraphicParser.g:842:3: ( rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0 )
            // InternalGraphicParser.g:842:4: rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsSizeMax"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsSizeMin"
    // InternalGraphicParser.g:851:1: entryRuleGraphicRootClassesItemsConstraintsSizeMin : ruleGraphicRootClassesItemsConstraintsSizeMin EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsSizeMin() throws RecognitionException {
        try {
            // InternalGraphicParser.g:852:1: ( ruleGraphicRootClassesItemsConstraintsSizeMin EOF )
            // InternalGraphicParser.g:853:1: ruleGraphicRootClassesItemsConstraintsSizeMin EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsSizeMin();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsSizeMin"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsSizeMin"
    // InternalGraphicParser.g:860:1: ruleGraphicRootClassesItemsConstraintsSizeMin : ( ( rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsSizeMin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:864:2: ( ( ( rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0 ) ) )
            // InternalGraphicParser.g:865:2: ( ( rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0 ) )
            {
            // InternalGraphicParser.g:865:2: ( ( rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0 ) )
            // InternalGraphicParser.g:866:3: ( rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getGroup()); 
            // InternalGraphicParser.g:867:3: ( rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0 )
            // InternalGraphicParser.g:867:4: rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsSizeMin"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsSizeInit"
    // InternalGraphicParser.g:876:1: entryRuleGraphicRootClassesItemsConstraintsSizeInit : ruleGraphicRootClassesItemsConstraintsSizeInit EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsSizeInit() throws RecognitionException {
        try {
            // InternalGraphicParser.g:877:1: ( ruleGraphicRootClassesItemsConstraintsSizeInit EOF )
            // InternalGraphicParser.g:878:1: ruleGraphicRootClassesItemsConstraintsSizeInit EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsSizeInit();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsSizeInit"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsSizeInit"
    // InternalGraphicParser.g:885:1: ruleGraphicRootClassesItemsConstraintsSizeInit : ( ( rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsSizeInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:889:2: ( ( ( rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0 ) ) )
            // InternalGraphicParser.g:890:2: ( ( rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0 ) )
            {
            // InternalGraphicParser.g:890:2: ( ( rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0 ) )
            // InternalGraphicParser.g:891:3: ( rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getGroup()); 
            // InternalGraphicParser.g:892:3: ( rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0 )
            // InternalGraphicParser.g:892:4: rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsSizeInit"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsOverlapping"
    // InternalGraphicParser.g:901:1: entryRuleGraphicRootClassesItemsConstraintsOverlapping : ruleGraphicRootClassesItemsConstraintsOverlapping EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsOverlapping() throws RecognitionException {
        try {
            // InternalGraphicParser.g:902:1: ( ruleGraphicRootClassesItemsConstraintsOverlapping EOF )
            // InternalGraphicParser.g:903:1: ruleGraphicRootClassesItemsConstraintsOverlapping EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsOverlapping();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsOverlapping"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsOverlapping"
    // InternalGraphicParser.g:910:1: ruleGraphicRootClassesItemsConstraintsOverlapping : ( ( rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsOverlapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:914:2: ( ( ( rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0 ) ) )
            // InternalGraphicParser.g:915:2: ( ( rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0 ) )
            {
            // InternalGraphicParser.g:915:2: ( ( rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0 ) )
            // InternalGraphicParser.g:916:3: ( rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getGroup()); 
            // InternalGraphicParser.g:917:3: ( rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0 )
            // InternalGraphicParser.g:917:4: rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsOverlapping"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsXToOriginPos"
    // InternalGraphicParser.g:926:1: entryRuleGraphicRootClassesItemsConstraintsXToOriginPos : ruleGraphicRootClassesItemsConstraintsXToOriginPos EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsXToOriginPos() throws RecognitionException {
        try {
            // InternalGraphicParser.g:927:1: ( ruleGraphicRootClassesItemsConstraintsXToOriginPos EOF )
            // InternalGraphicParser.g:928:1: ruleGraphicRootClassesItemsConstraintsXToOriginPos EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsXToOriginPos();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsXToOriginPos"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsXToOriginPos"
    // InternalGraphicParser.g:935:1: ruleGraphicRootClassesItemsConstraintsXToOriginPos : ( ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsXToOriginPos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:939:2: ( ( ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0 ) ) )
            // InternalGraphicParser.g:940:2: ( ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0 ) )
            {
            // InternalGraphicParser.g:940:2: ( ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0 ) )
            // InternalGraphicParser.g:941:3: ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getGroup()); 
            // InternalGraphicParser.g:942:3: ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0 )
            // InternalGraphicParser.g:942:4: rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsXToOriginPos"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsYToOriginPos"
    // InternalGraphicParser.g:951:1: entryRuleGraphicRootClassesItemsConstraintsYToOriginPos : ruleGraphicRootClassesItemsConstraintsYToOriginPos EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsYToOriginPos() throws RecognitionException {
        try {
            // InternalGraphicParser.g:952:1: ( ruleGraphicRootClassesItemsConstraintsYToOriginPos EOF )
            // InternalGraphicParser.g:953:1: ruleGraphicRootClassesItemsConstraintsYToOriginPos EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsYToOriginPos();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsYToOriginPos"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsYToOriginPos"
    // InternalGraphicParser.g:960:1: ruleGraphicRootClassesItemsConstraintsYToOriginPos : ( ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsYToOriginPos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:964:2: ( ( ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0 ) ) )
            // InternalGraphicParser.g:965:2: ( ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0 ) )
            {
            // InternalGraphicParser.g:965:2: ( ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0 ) )
            // InternalGraphicParser.g:966:3: ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getGroup()); 
            // InternalGraphicParser.g:967:3: ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0 )
            // InternalGraphicParser.g:967:4: rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsYToOriginPos"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsZToOriginPos"
    // InternalGraphicParser.g:976:1: entryRuleGraphicRootClassesItemsConstraintsZToOriginPos : ruleGraphicRootClassesItemsConstraintsZToOriginPos EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsZToOriginPos() throws RecognitionException {
        try {
            // InternalGraphicParser.g:977:1: ( ruleGraphicRootClassesItemsConstraintsZToOriginPos EOF )
            // InternalGraphicParser.g:978:1: ruleGraphicRootClassesItemsConstraintsZToOriginPos EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsZToOriginPos();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsZToOriginPos"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsZToOriginPos"
    // InternalGraphicParser.g:985:1: ruleGraphicRootClassesItemsConstraintsZToOriginPos : ( ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsZToOriginPos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:989:2: ( ( ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0 ) ) )
            // InternalGraphicParser.g:990:2: ( ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0 ) )
            {
            // InternalGraphicParser.g:990:2: ( ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0 ) )
            // InternalGraphicParser.g:991:3: ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getGroup()); 
            // InternalGraphicParser.g:992:3: ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0 )
            // InternalGraphicParser.g:992:4: rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsZToOriginPos"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsRotation"
    // InternalGraphicParser.g:1001:1: entryRuleGraphicRootClassesItemsConstraintsRotation : ruleGraphicRootClassesItemsConstraintsRotation EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsRotation() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1002:1: ( ruleGraphicRootClassesItemsConstraintsRotation EOF )
            // InternalGraphicParser.g:1003:1: ruleGraphicRootClassesItemsConstraintsRotation EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsRotationRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsRotation();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsRotationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsRotation"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsRotation"
    // InternalGraphicParser.g:1010:1: ruleGraphicRootClassesItemsConstraintsRotation : ( ( rule__GraphicRootClassesItemsConstraintsRotation__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsRotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1014:2: ( ( ( rule__GraphicRootClassesItemsConstraintsRotation__Group__0 ) ) )
            // InternalGraphicParser.g:1015:2: ( ( rule__GraphicRootClassesItemsConstraintsRotation__Group__0 ) )
            {
            // InternalGraphicParser.g:1015:2: ( ( rule__GraphicRootClassesItemsConstraintsRotation__Group__0 ) )
            // InternalGraphicParser.g:1016:3: ( rule__GraphicRootClassesItemsConstraintsRotation__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getGroup()); 
            // InternalGraphicParser.g:1017:3: ( rule__GraphicRootClassesItemsConstraintsRotation__Group__0 )
            // InternalGraphicParser.g:1017:4: rule__GraphicRootClassesItemsConstraintsRotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsRotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsRotation"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsText"
    // InternalGraphicParser.g:1026:1: entryRuleGraphicRootClassesItemsConstraintsText : ruleGraphicRootClassesItemsConstraintsText EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsText() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1027:1: ( ruleGraphicRootClassesItemsConstraintsText EOF )
            // InternalGraphicParser.g:1028:1: ruleGraphicRootClassesItemsConstraintsText EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsTextRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsText();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsText"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsText"
    // InternalGraphicParser.g:1035:1: ruleGraphicRootClassesItemsConstraintsText : ( ( rule__GraphicRootClassesItemsConstraintsText__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1039:2: ( ( ( rule__GraphicRootClassesItemsConstraintsText__Group__0 ) ) )
            // InternalGraphicParser.g:1040:2: ( ( rule__GraphicRootClassesItemsConstraintsText__Group__0 ) )
            {
            // InternalGraphicParser.g:1040:2: ( ( rule__GraphicRootClassesItemsConstraintsText__Group__0 ) )
            // InternalGraphicParser.g:1041:3: ( rule__GraphicRootClassesItemsConstraintsText__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getGroup()); 
            // InternalGraphicParser.g:1042:3: ( rule__GraphicRootClassesItemsConstraintsText__Group__0 )
            // InternalGraphicParser.g:1042:4: rule__GraphicRootClassesItemsConstraintsText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsText"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsTrim"
    // InternalGraphicParser.g:1051:1: entryRuleGraphicRootClassesItemsConstraintsTrim : ruleGraphicRootClassesItemsConstraintsTrim EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsTrim() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1052:1: ( ruleGraphicRootClassesItemsConstraintsTrim EOF )
            // InternalGraphicParser.g:1053:1: ruleGraphicRootClassesItemsConstraintsTrim EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsTrimRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsTrim();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsTrimRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsTrim"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsTrim"
    // InternalGraphicParser.g:1060:1: ruleGraphicRootClassesItemsConstraintsTrim : ( ( rule__GraphicRootClassesItemsConstraintsTrim__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsTrim() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1064:2: ( ( ( rule__GraphicRootClassesItemsConstraintsTrim__Group__0 ) ) )
            // InternalGraphicParser.g:1065:2: ( ( rule__GraphicRootClassesItemsConstraintsTrim__Group__0 ) )
            {
            // InternalGraphicParser.g:1065:2: ( ( rule__GraphicRootClassesItemsConstraintsTrim__Group__0 ) )
            // InternalGraphicParser.g:1066:3: ( rule__GraphicRootClassesItemsConstraintsTrim__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getGroup()); 
            // InternalGraphicParser.g:1067:3: ( rule__GraphicRootClassesItemsConstraintsTrim__Group__0 )
            // InternalGraphicParser.g:1067:4: rule__GraphicRootClassesItemsConstraintsTrim__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsTrim__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsTrim"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsCategoryBitMask"
    // InternalGraphicParser.g:1076:1: entryRuleGraphicRootClassesItemsConstraintsCategoryBitMask : ruleGraphicRootClassesItemsConstraintsCategoryBitMask EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsCategoryBitMask() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1077:1: ( ruleGraphicRootClassesItemsConstraintsCategoryBitMask EOF )
            // InternalGraphicParser.g:1078:1: ruleGraphicRootClassesItemsConstraintsCategoryBitMask EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsCategoryBitMask();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsCategoryBitMask"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsCategoryBitMask"
    // InternalGraphicParser.g:1085:1: ruleGraphicRootClassesItemsConstraintsCategoryBitMask : ( ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsCategoryBitMask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1089:2: ( ( ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0 ) ) )
            // InternalGraphicParser.g:1090:2: ( ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0 ) )
            {
            // InternalGraphicParser.g:1090:2: ( ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0 ) )
            // InternalGraphicParser.g:1091:3: ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getGroup()); 
            // InternalGraphicParser.g:1092:3: ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0 )
            // InternalGraphicParser.g:1092:4: rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsCategoryBitMask"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsCollisionBitMask"
    // InternalGraphicParser.g:1101:1: entryRuleGraphicRootClassesItemsConstraintsCollisionBitMask : ruleGraphicRootClassesItemsConstraintsCollisionBitMask EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsCollisionBitMask() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1102:1: ( ruleGraphicRootClassesItemsConstraintsCollisionBitMask EOF )
            // InternalGraphicParser.g:1103:1: ruleGraphicRootClassesItemsConstraintsCollisionBitMask EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsCollisionBitMask();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsCollisionBitMask"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsCollisionBitMask"
    // InternalGraphicParser.g:1110:1: ruleGraphicRootClassesItemsConstraintsCollisionBitMask : ( ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsCollisionBitMask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1114:2: ( ( ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0 ) ) )
            // InternalGraphicParser.g:1115:2: ( ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0 ) )
            {
            // InternalGraphicParser.g:1115:2: ( ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0 ) )
            // InternalGraphicParser.g:1116:3: ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getGroup()); 
            // InternalGraphicParser.g:1117:3: ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0 )
            // InternalGraphicParser.g:1117:4: rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsCollisionBitMask"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConstraintsContactTestBitMask"
    // InternalGraphicParser.g:1126:1: entryRuleGraphicRootClassesItemsConstraintsContactTestBitMask : ruleGraphicRootClassesItemsConstraintsContactTestBitMask EOF ;
    public final void entryRuleGraphicRootClassesItemsConstraintsContactTestBitMask() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1127:1: ( ruleGraphicRootClassesItemsConstraintsContactTestBitMask EOF )
            // InternalGraphicParser.g:1128:1: ruleGraphicRootClassesItemsConstraintsContactTestBitMask EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConstraintsContactTestBitMask();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConstraintsContactTestBitMask"


    // $ANTLR start "ruleGraphicRootClassesItemsConstraintsContactTestBitMask"
    // InternalGraphicParser.g:1135:1: ruleGraphicRootClassesItemsConstraintsContactTestBitMask : ( ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConstraintsContactTestBitMask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1139:2: ( ( ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0 ) ) )
            // InternalGraphicParser.g:1140:2: ( ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0 ) )
            {
            // InternalGraphicParser.g:1140:2: ( ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0 ) )
            // InternalGraphicParser.g:1141:3: ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getGroup()); 
            // InternalGraphicParser.g:1142:3: ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0 )
            // InternalGraphicParser.g:1142:4: rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConstraintsContactTestBitMask"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalGraphicParser.g:1151:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1152:1: ( ruleEBooleanObject EOF )
            // InternalGraphicParser.g:1153:1: ruleEBooleanObject EOF
            {
             before(grammarAccess.getEBooleanObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getEBooleanObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBooleanObject"


    // $ANTLR start "ruleEBooleanObject"
    // InternalGraphicParser.g:1160:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1164:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalGraphicParser.g:1165:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalGraphicParser.g:1165:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalGraphicParser.g:1166:3: ( rule__EBooleanObject__Alternatives )
            {
             before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            // InternalGraphicParser.g:1167:3: ( rule__EBooleanObject__Alternatives )
            // InternalGraphicParser.g:1167:4: rule__EBooleanObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBooleanObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBooleanObject"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalGraphicParser.g:1176:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1177:1: ( ruleEDoubleObject EOF )
            // InternalGraphicParser.g:1178:1: ruleEDoubleObject EOF
            {
             before(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getEDoubleObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalGraphicParser.g:1185:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Alternatives ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1189:2: ( ( ( rule__EDoubleObject__Alternatives ) ) )
            // InternalGraphicParser.g:1190:2: ( ( rule__EDoubleObject__Alternatives ) )
            {
            // InternalGraphicParser.g:1190:2: ( ( rule__EDoubleObject__Alternatives ) )
            // InternalGraphicParser.g:1191:3: ( rule__EDoubleObject__Alternatives )
            {
             before(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 
            // InternalGraphicParser.g:1192:3: ( rule__EDoubleObject__Alternatives )
            // InternalGraphicParser.g:1192:4: rule__EDoubleObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItems"
    // InternalGraphicParser.g:1201:1: entryRuleGraphicRootClassesItemsConnectionsItems : ruleGraphicRootClassesItemsConnectionsItems EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItems() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1202:1: ( ruleGraphicRootClassesItemsConnectionsItems EOF )
            // InternalGraphicParser.g:1203:1: ruleGraphicRootClassesItemsConnectionsItems EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItems();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItems"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItems"
    // InternalGraphicParser.g:1210:1: ruleGraphicRootClassesItemsConnectionsItems : ( ( rule__GraphicRootClassesItemsConnectionsItems__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1214:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItems__Group__0 ) ) )
            // InternalGraphicParser.g:1215:2: ( ( rule__GraphicRootClassesItemsConnectionsItems__Group__0 ) )
            {
            // InternalGraphicParser.g:1215:2: ( ( rule__GraphicRootClassesItemsConnectionsItems__Group__0 ) )
            // InternalGraphicParser.g:1216:3: ( rule__GraphicRootClassesItemsConnectionsItems__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getGroup()); 
            // InternalGraphicParser.g:1217:3: ( rule__GraphicRootClassesItemsConnectionsItems__Group__0 )
            // InternalGraphicParser.g:1217:4: rule__GraphicRootClassesItemsConnectionsItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItems"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsName"
    // InternalGraphicParser.g:1226:1: entryRuleGraphicRootClassesItemsConnectionsItemsName : ruleGraphicRootClassesItemsConnectionsItemsName EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsName() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1227:1: ( ruleGraphicRootClassesItemsConnectionsItemsName EOF )
            // InternalGraphicParser.g:1228:1: ruleGraphicRootClassesItemsConnectionsItemsName EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsName();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsName"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsName"
    // InternalGraphicParser.g:1235:1: ruleGraphicRootClassesItemsConnectionsItemsName : ( ( rule__GraphicRootClassesItemsConnectionsItemsName__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1239:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsName__Group__0 ) ) )
            // InternalGraphicParser.g:1240:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsName__Group__0 ) )
            {
            // InternalGraphicParser.g:1240:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsName__Group__0 ) )
            // InternalGraphicParser.g:1241:3: ( rule__GraphicRootClassesItemsConnectionsItemsName__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getGroup()); 
            // InternalGraphicParser.g:1242:3: ( rule__GraphicRootClassesItemsConnectionsItemsName__Group__0 )
            // InternalGraphicParser.g:1242:4: rule__GraphicRootClassesItemsConnectionsItemsName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsName"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsType"
    // InternalGraphicParser.g:1251:1: entryRuleGraphicRootClassesItemsConnectionsItemsType : ruleGraphicRootClassesItemsConnectionsItemsType EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsType() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1252:1: ( ruleGraphicRootClassesItemsConnectionsItemsType EOF )
            // InternalGraphicParser.g:1253:1: ruleGraphicRootClassesItemsConnectionsItemsType EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsType();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsType"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsType"
    // InternalGraphicParser.g:1260:1: ruleGraphicRootClassesItemsConnectionsItemsType : ( ( rule__GraphicRootClassesItemsConnectionsItemsType__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1264:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsType__Group__0 ) ) )
            // InternalGraphicParser.g:1265:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsType__Group__0 ) )
            {
            // InternalGraphicParser.g:1265:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsType__Group__0 ) )
            // InternalGraphicParser.g:1266:3: ( rule__GraphicRootClassesItemsConnectionsItemsType__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getGroup()); 
            // InternalGraphicParser.g:1267:3: ( rule__GraphicRootClassesItemsConnectionsItemsType__Group__0 )
            // InternalGraphicParser.g:1267:4: rule__GraphicRootClassesItemsConnectionsItemsType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsType"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsColor"
    // InternalGraphicParser.g:1276:1: entryRuleGraphicRootClassesItemsConnectionsItemsColor : ruleGraphicRootClassesItemsConnectionsItemsColor EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsColor() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1277:1: ( ruleGraphicRootClassesItemsConnectionsItemsColor EOF )
            // InternalGraphicParser.g:1278:1: ruleGraphicRootClassesItemsConnectionsItemsColor EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsColor();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsColor"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsColor"
    // InternalGraphicParser.g:1285:1: ruleGraphicRootClassesItemsConnectionsItemsColor : ( ( rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1289:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0 ) ) )
            // InternalGraphicParser.g:1290:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0 ) )
            {
            // InternalGraphicParser.g:1290:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0 ) )
            // InternalGraphicParser.g:1291:3: ( rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getGroup()); 
            // InternalGraphicParser.g:1292:3: ( rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0 )
            // InternalGraphicParser.g:1292:4: rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsColor"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsTextColor"
    // InternalGraphicParser.g:1301:1: entryRuleGraphicRootClassesItemsConnectionsItemsTextColor : ruleGraphicRootClassesItemsConnectionsItemsTextColor EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsTextColor() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1302:1: ( ruleGraphicRootClassesItemsConnectionsItemsTextColor EOF )
            // InternalGraphicParser.g:1303:1: ruleGraphicRootClassesItemsConnectionsItemsTextColor EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsTextColor();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsTextColor"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsTextColor"
    // InternalGraphicParser.g:1310:1: ruleGraphicRootClassesItemsConnectionsItemsTextColor : ( ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsTextColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1314:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0 ) ) )
            // InternalGraphicParser.g:1315:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0 ) )
            {
            // InternalGraphicParser.g:1315:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0 ) )
            // InternalGraphicParser.g:1316:3: ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getGroup()); 
            // InternalGraphicParser.g:1317:3: ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0 )
            // InternalGraphicParser.g:1317:4: rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsTextColor"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsDecorator"
    // InternalGraphicParser.g:1326:1: entryRuleGraphicRootClassesItemsConnectionsItemsDecorator : ruleGraphicRootClassesItemsConnectionsItemsDecorator EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsDecorator() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1327:1: ( ruleGraphicRootClassesItemsConnectionsItemsDecorator EOF )
            // InternalGraphicParser.g:1328:1: ruleGraphicRootClassesItemsConnectionsItemsDecorator EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsDecorator();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsDecorator"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsDecorator"
    // InternalGraphicParser.g:1335:1: ruleGraphicRootClassesItemsConnectionsItemsDecorator : ( ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsDecorator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1339:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0 ) ) )
            // InternalGraphicParser.g:1340:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0 ) )
            {
            // InternalGraphicParser.g:1340:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0 ) )
            // InternalGraphicParser.g:1341:3: ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getGroup()); 
            // InternalGraphicParser.g:1342:3: ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0 )
            // InternalGraphicParser.g:1342:4: rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsDecorator"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorColor"
    // InternalGraphicParser.g:1351:1: entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorColor : ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorColor() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1352:1: ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor EOF )
            // InternalGraphicParser.g:1353:1: ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorColor"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor"
    // InternalGraphicParser.g:1360:1: ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor : ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1364:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0 ) ) )
            // InternalGraphicParser.g:1365:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0 ) )
            {
            // InternalGraphicParser.g:1365:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0 ) )
            // InternalGraphicParser.g:1366:3: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getGroup()); 
            // InternalGraphicParser.g:1367:3: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0 )
            // InternalGraphicParser.g:1367:4: rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorWidth"
    // InternalGraphicParser.g:1376:1: entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorWidth : ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorWidth() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1377:1: ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth EOF )
            // InternalGraphicParser.g:1378:1: ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorWidth"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth"
    // InternalGraphicParser.g:1385:1: ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth : ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1389:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0 ) ) )
            // InternalGraphicParser.g:1390:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0 ) )
            {
            // InternalGraphicParser.g:1390:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0 ) )
            // InternalGraphicParser.g:1391:3: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getGroup()); 
            // InternalGraphicParser.g:1392:3: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0 )
            // InternalGraphicParser.g:1392:4: rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorPos"
    // InternalGraphicParser.g:1401:1: entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorPos : ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorPos() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1402:1: ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos EOF )
            // InternalGraphicParser.g:1403:1: ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsDecoratorPos"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos"
    // InternalGraphicParser.g:1410:1: ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos : ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1414:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0 ) ) )
            // InternalGraphicParser.g:1415:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0 ) )
            {
            // InternalGraphicParser.g:1415:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0 ) )
            // InternalGraphicParser.g:1416:3: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getGroup()); 
            // InternalGraphicParser.g:1417:3: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0 )
            // InternalGraphicParser.g:1417:4: rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsPattern"
    // InternalGraphicParser.g:1426:1: entryRuleGraphicRootClassesItemsConnectionsItemsPattern : ruleGraphicRootClassesItemsConnectionsItemsPattern EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsPattern() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1427:1: ( ruleGraphicRootClassesItemsConnectionsItemsPattern EOF )
            // InternalGraphicParser.g:1428:1: ruleGraphicRootClassesItemsConnectionsItemsPattern EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsPattern();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsPattern"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsPattern"
    // InternalGraphicParser.g:1435:1: ruleGraphicRootClassesItemsConnectionsItemsPattern : ( ( rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1439:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0 ) ) )
            // InternalGraphicParser.g:1440:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0 ) )
            {
            // InternalGraphicParser.g:1440:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0 ) )
            // InternalGraphicParser.g:1441:3: ( rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getGroup()); 
            // InternalGraphicParser.g:1442:3: ( rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0 )
            // InternalGraphicParser.g:1442:4: rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsPattern"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsWidth"
    // InternalGraphicParser.g:1451:1: entryRuleGraphicRootClassesItemsConnectionsItemsWidth : ruleGraphicRootClassesItemsConnectionsItemsWidth EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsWidth() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1452:1: ( ruleGraphicRootClassesItemsConnectionsItemsWidth EOF )
            // InternalGraphicParser.g:1453:1: ruleGraphicRootClassesItemsConnectionsItemsWidth EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsWidth();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsWidth"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsWidth"
    // InternalGraphicParser.g:1460:1: ruleGraphicRootClassesItemsConnectionsItemsWidth : ( ( rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsWidth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1464:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0 ) ) )
            // InternalGraphicParser.g:1465:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0 ) )
            {
            // InternalGraphicParser.g:1465:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0 ) )
            // InternalGraphicParser.g:1466:3: ( rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getGroup()); 
            // InternalGraphicParser.g:1467:3: ( rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0 )
            // InternalGraphicParser.g:1467:4: rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsWidth"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsPosition"
    // InternalGraphicParser.g:1476:1: entryRuleGraphicRootClassesItemsConnectionsItemsPosition : ruleGraphicRootClassesItemsConnectionsItemsPosition EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsPosition() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1477:1: ( ruleGraphicRootClassesItemsConnectionsItemsPosition EOF )
            // InternalGraphicParser.g:1478:1: ruleGraphicRootClassesItemsConnectionsItemsPosition EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsPosition();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsPosition"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsPosition"
    // InternalGraphicParser.g:1485:1: ruleGraphicRootClassesItemsConnectionsItemsPosition : ( ( rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1489:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0 ) ) )
            // InternalGraphicParser.g:1490:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0 ) )
            {
            // InternalGraphicParser.g:1490:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0 ) )
            // InternalGraphicParser.g:1491:3: ( rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getGroup()); 
            // InternalGraphicParser.g:1492:3: ( rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0 )
            // InternalGraphicParser.g:1492:4: rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsPosition"


    // $ANTLR start "entryRuleGraphicRootClassesItemsConnectionsItemsTarget"
    // InternalGraphicParser.g:1501:1: entryRuleGraphicRootClassesItemsConnectionsItemsTarget : ruleGraphicRootClassesItemsConnectionsItemsTarget EOF ;
    public final void entryRuleGraphicRootClassesItemsConnectionsItemsTarget() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1502:1: ( ruleGraphicRootClassesItemsConnectionsItemsTarget EOF )
            // InternalGraphicParser.g:1503:1: ruleGraphicRootClassesItemsConnectionsItemsTarget EOF
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicRootClassesItemsConnectionsItemsTarget();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphicRootClassesItemsConnectionsItemsTarget"


    // $ANTLR start "ruleGraphicRootClassesItemsConnectionsItemsTarget"
    // InternalGraphicParser.g:1510:1: ruleGraphicRootClassesItemsConnectionsItemsTarget : ( ( rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0 ) ) ;
    public final void ruleGraphicRootClassesItemsConnectionsItemsTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1514:2: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0 ) ) )
            // InternalGraphicParser.g:1515:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0 ) )
            {
            // InternalGraphicParser.g:1515:2: ( ( rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0 ) )
            // InternalGraphicParser.g:1516:3: ( rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getGroup()); 
            // InternalGraphicParser.g:1517:3: ( rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0 )
            // InternalGraphicParser.g:1517:4: rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicRootClassesItemsConnectionsItemsTarget"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalGraphicParser.g:1526:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1527:1: ( ruleVALID_STRING EOF )
            // InternalGraphicParser.g:1528:1: ruleVALID_STRING EOF
            {
             before(grammarAccess.getVALID_STRINGRule()); 
            pushFollow(FOLLOW_1);
            ruleVALID_STRING();

            state._fsp--;

             after(grammarAccess.getVALID_STRINGRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVALID_STRING"


    // $ANTLR start "ruleVALID_STRING"
    // InternalGraphicParser.g:1535:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1539:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalGraphicParser.g:1540:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalGraphicParser.g:1540:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalGraphicParser.g:1541:3: ( rule__VALID_STRING__Alternatives )
            {
             before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            // InternalGraphicParser.g:1542:3: ( rule__VALID_STRING__Alternatives )
            // InternalGraphicParser.g:1542:4: rule__VALID_STRING__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VALID_STRING__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVALID_STRING"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalGraphicParser.g:1551:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalGraphicParser.g:1552:1: ( ruleKEYWORD EOF )
            // InternalGraphicParser.g:1553:1: ruleKEYWORD EOF
            {
             before(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            ruleKEYWORD();

            state._fsp--;

             after(grammarAccess.getKEYWORDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalGraphicParser.g:1560:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1564:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalGraphicParser.g:1565:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalGraphicParser.g:1565:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalGraphicParser.g:1566:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalGraphicParser.g:1567:3: ( rule__KEYWORD__Alternatives )
            // InternalGraphicParser.g:1567:4: rule__KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KEYWORD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKEYWORDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "rule__GraphicRootPropertiesAbstract__Alternatives"
    // InternalGraphicParser.g:1575:1: rule__GraphicRootPropertiesAbstract__Alternatives : ( ( ruleGraphicRootName ) | ( ruleGraphicRootURI ) | ( ruleGraphicRootClasses ) );
    public final void rule__GraphicRootPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1579:1: ( ( ruleGraphicRootName ) | ( ruleGraphicRootURI ) | ( ruleGraphicRootClasses ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt1=1;
                }
                break;
            case URI:
                {
                alt1=2;
                }
                break;
            case Classes:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGraphicParser.g:1580:2: ( ruleGraphicRootName )
                    {
                    // InternalGraphicParser.g:1580:2: ( ruleGraphicRootName )
                    // InternalGraphicParser.g:1581:3: ruleGraphicRootName
                    {
                     before(grammarAccess.getGraphicRootPropertiesAbstractAccess().getGraphicRootNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootName();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootPropertiesAbstractAccess().getGraphicRootNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:1586:2: ( ruleGraphicRootURI )
                    {
                    // InternalGraphicParser.g:1586:2: ( ruleGraphicRootURI )
                    // InternalGraphicParser.g:1587:3: ruleGraphicRootURI
                    {
                     before(grammarAccess.getGraphicRootPropertiesAbstractAccess().getGraphicRootURIParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootURI();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootPropertiesAbstractAccess().getGraphicRootURIParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:1592:2: ( ruleGraphicRootClasses )
                    {
                    // InternalGraphicParser.g:1592:2: ( ruleGraphicRootClasses )
                    // InternalGraphicParser.g:1593:3: ruleGraphicRootClasses
                    {
                     before(grammarAccess.getGraphicRootPropertiesAbstractAccess().getGraphicRootClassesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClasses();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootPropertiesAbstractAccess().getGraphicRootClassesParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__GraphicRootClassesItemsPropertiesAbstract__Alternatives"
    // InternalGraphicParser.g:1602:1: rule__GraphicRootClassesItemsPropertiesAbstract__Alternatives : ( ( ruleGraphicRootClassesItemsName ) | ( ruleGraphicRootClassesItemsVersions ) | ( ruleGraphicRootClassesItemsVname ) | ( ruleGraphicRootClassesItemsShowAttributes ) | ( ruleGraphicRootClassesItemsMaterialAttributes ) | ( ruleGraphicRootClassesItemsConstraints ) | ( ruleGraphicRootClassesItemsConnections ) );
    public final void rule__GraphicRootClassesItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1606:1: ( ( ruleGraphicRootClassesItemsName ) | ( ruleGraphicRootClassesItemsVersions ) | ( ruleGraphicRootClassesItemsVname ) | ( ruleGraphicRootClassesItemsShowAttributes ) | ( ruleGraphicRootClassesItemsMaterialAttributes ) | ( ruleGraphicRootClassesItemsConstraints ) | ( ruleGraphicRootClassesItemsConnections ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt2=1;
                }
                break;
            case Versions:
                {
                alt2=2;
                }
                break;
            case Vname:
                {
                alt2=3;
                }
                break;
            case ShowAttributes:
                {
                alt2=4;
                }
                break;
            case MaterialAttributes:
                {
                alt2=5;
                }
                break;
            case Constraints:
                {
                alt2=6;
                }
                break;
            case Connections:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGraphicParser.g:1607:2: ( ruleGraphicRootClassesItemsName )
                    {
                    // InternalGraphicParser.g:1607:2: ( ruleGraphicRootClassesItemsName )
                    // InternalGraphicParser.g:1608:3: ruleGraphicRootClassesItemsName
                    {
                     before(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsName();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:1613:2: ( ruleGraphicRootClassesItemsVersions )
                    {
                    // InternalGraphicParser.g:1613:2: ( ruleGraphicRootClassesItemsVersions )
                    // InternalGraphicParser.g:1614:3: ruleGraphicRootClassesItemsVersions
                    {
                     before(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsVersionsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsVersions();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsVersionsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:1619:2: ( ruleGraphicRootClassesItemsVname )
                    {
                    // InternalGraphicParser.g:1619:2: ( ruleGraphicRootClassesItemsVname )
                    // InternalGraphicParser.g:1620:3: ruleGraphicRootClassesItemsVname
                    {
                     before(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsVnameParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsVname();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsVnameParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphicParser.g:1625:2: ( ruleGraphicRootClassesItemsShowAttributes )
                    {
                    // InternalGraphicParser.g:1625:2: ( ruleGraphicRootClassesItemsShowAttributes )
                    // InternalGraphicParser.g:1626:3: ruleGraphicRootClassesItemsShowAttributes
                    {
                     before(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsShowAttributesParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsShowAttributes();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsShowAttributesParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphicParser.g:1631:2: ( ruleGraphicRootClassesItemsMaterialAttributes )
                    {
                    // InternalGraphicParser.g:1631:2: ( ruleGraphicRootClassesItemsMaterialAttributes )
                    // InternalGraphicParser.g:1632:3: ruleGraphicRootClassesItemsMaterialAttributes
                    {
                     before(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsMaterialAttributesParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsMaterialAttributes();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsMaterialAttributesParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphicParser.g:1637:2: ( ruleGraphicRootClassesItemsConstraints )
                    {
                    // InternalGraphicParser.g:1637:2: ( ruleGraphicRootClassesItemsConstraints )
                    // InternalGraphicParser.g:1638:3: ruleGraphicRootClassesItemsConstraints
                    {
                     before(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraints();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGraphicParser.g:1643:2: ( ruleGraphicRootClassesItemsConnections )
                    {
                    // InternalGraphicParser.g:1643:2: ( ruleGraphicRootClassesItemsConnections )
                    // InternalGraphicParser.g:1644:3: ruleGraphicRootClassesItemsConnections
                    {
                     before(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnections();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsPropertiesAbstract__Alternatives"
    // InternalGraphicParser.g:1653:1: rule__GraphicRootClassesItemsVersionsPropertiesAbstract__Alternatives : ( ( ruleGraphicRootClassesItemsVersionsV1 ) | ( ruleGraphicRootClassesItemsVersionsV2 ) | ( ruleGraphicRootClassesItemsVersionsV3 ) );
    public final void rule__GraphicRootClassesItemsVersionsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1657:1: ( ( ruleGraphicRootClassesItemsVersionsV1 ) | ( ruleGraphicRootClassesItemsVersionsV2 ) | ( ruleGraphicRootClassesItemsVersionsV3 ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case V1:
                {
                alt3=1;
                }
                break;
            case V2:
                {
                alt3=2;
                }
                break;
            case V3:
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
                    // InternalGraphicParser.g:1658:2: ( ruleGraphicRootClassesItemsVersionsV1 )
                    {
                    // InternalGraphicParser.g:1658:2: ( ruleGraphicRootClassesItemsVersionsV1 )
                    // InternalGraphicParser.g:1659:3: ruleGraphicRootClassesItemsVersionsV1
                    {
                     before(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractAccess().getGraphicRootClassesItemsVersionsV1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsVersionsV1();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractAccess().getGraphicRootClassesItemsVersionsV1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:1664:2: ( ruleGraphicRootClassesItemsVersionsV2 )
                    {
                    // InternalGraphicParser.g:1664:2: ( ruleGraphicRootClassesItemsVersionsV2 )
                    // InternalGraphicParser.g:1665:3: ruleGraphicRootClassesItemsVersionsV2
                    {
                     before(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractAccess().getGraphicRootClassesItemsVersionsV2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsVersionsV2();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractAccess().getGraphicRootClassesItemsVersionsV2ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:1670:2: ( ruleGraphicRootClassesItemsVersionsV3 )
                    {
                    // InternalGraphicParser.g:1670:2: ( ruleGraphicRootClassesItemsVersionsV3 )
                    // InternalGraphicParser.g:1671:3: ruleGraphicRootClassesItemsVersionsV3
                    {
                     before(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractAccess().getGraphicRootClassesItemsVersionsV3ParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsVersionsV3();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsVersionsPropertiesAbstractAccess().getGraphicRootClassesItemsVersionsV3ParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__GraphicRootClassesItemsVnamePropertiesAbstract__Alternatives"
    // InternalGraphicParser.g:1680:1: rule__GraphicRootClassesItemsVnamePropertiesAbstract__Alternatives : ( ( ruleGraphicRootClassesItemsVnameV1 ) | ( ruleGraphicRootClassesItemsVnameV2 ) | ( ruleGraphicRootClassesItemsVnameV3 ) );
    public final void rule__GraphicRootClassesItemsVnamePropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1684:1: ( ( ruleGraphicRootClassesItemsVnameV1 ) | ( ruleGraphicRootClassesItemsVnameV2 ) | ( ruleGraphicRootClassesItemsVnameV3 ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case V1:
                {
                alt4=1;
                }
                break;
            case V2:
                {
                alt4=2;
                }
                break;
            case V3:
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
                    // InternalGraphicParser.g:1685:2: ( ruleGraphicRootClassesItemsVnameV1 )
                    {
                    // InternalGraphicParser.g:1685:2: ( ruleGraphicRootClassesItemsVnameV1 )
                    // InternalGraphicParser.g:1686:3: ruleGraphicRootClassesItemsVnameV1
                    {
                     before(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractAccess().getGraphicRootClassesItemsVnameV1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsVnameV1();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractAccess().getGraphicRootClassesItemsVnameV1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:1691:2: ( ruleGraphicRootClassesItemsVnameV2 )
                    {
                    // InternalGraphicParser.g:1691:2: ( ruleGraphicRootClassesItemsVnameV2 )
                    // InternalGraphicParser.g:1692:3: ruleGraphicRootClassesItemsVnameV2
                    {
                     before(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractAccess().getGraphicRootClassesItemsVnameV2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsVnameV2();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractAccess().getGraphicRootClassesItemsVnameV2ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:1697:2: ( ruleGraphicRootClassesItemsVnameV3 )
                    {
                    // InternalGraphicParser.g:1697:2: ( ruleGraphicRootClassesItemsVnameV3 )
                    // InternalGraphicParser.g:1698:3: ruleGraphicRootClassesItemsVnameV3
                    {
                     before(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractAccess().getGraphicRootClassesItemsVnameV3ParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsVnameV3();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsVnamePropertiesAbstractAccess().getGraphicRootClassesItemsVnameV3ParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnamePropertiesAbstract__Alternatives"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsPropertiesAbstract__Alternatives"
    // InternalGraphicParser.g:1707:1: rule__GraphicRootClassesItemsConstraintsPropertiesAbstract__Alternatives : ( ( ruleGraphicRootClassesItemsConstraintsPlanes ) | ( ruleGraphicRootClassesItemsConstraintsIlumination ) | ( ruleGraphicRootClassesItemsConstraintsSizeMax ) | ( ruleGraphicRootClassesItemsConstraintsSizeMin ) | ( ruleGraphicRootClassesItemsConstraintsSizeInit ) | ( ruleGraphicRootClassesItemsConstraintsOverlapping ) | ( ruleGraphicRootClassesItemsConstraintsXToOriginPos ) | ( ruleGraphicRootClassesItemsConstraintsYToOriginPos ) | ( ruleGraphicRootClassesItemsConstraintsZToOriginPos ) | ( ruleGraphicRootClassesItemsConstraintsRotation ) | ( ruleGraphicRootClassesItemsConstraintsText ) | ( ruleGraphicRootClassesItemsConstraintsTrim ) | ( ruleGraphicRootClassesItemsConstraintsCategoryBitMask ) | ( ruleGraphicRootClassesItemsConstraintsCollisionBitMask ) | ( ruleGraphicRootClassesItemsConstraintsContactTestBitMask ) );
    public final void rule__GraphicRootClassesItemsConstraintsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1711:1: ( ( ruleGraphicRootClassesItemsConstraintsPlanes ) | ( ruleGraphicRootClassesItemsConstraintsIlumination ) | ( ruleGraphicRootClassesItemsConstraintsSizeMax ) | ( ruleGraphicRootClassesItemsConstraintsSizeMin ) | ( ruleGraphicRootClassesItemsConstraintsSizeInit ) | ( ruleGraphicRootClassesItemsConstraintsOverlapping ) | ( ruleGraphicRootClassesItemsConstraintsXToOriginPos ) | ( ruleGraphicRootClassesItemsConstraintsYToOriginPos ) | ( ruleGraphicRootClassesItemsConstraintsZToOriginPos ) | ( ruleGraphicRootClassesItemsConstraintsRotation ) | ( ruleGraphicRootClassesItemsConstraintsText ) | ( ruleGraphicRootClassesItemsConstraintsTrim ) | ( ruleGraphicRootClassesItemsConstraintsCategoryBitMask ) | ( ruleGraphicRootClassesItemsConstraintsCollisionBitMask ) | ( ruleGraphicRootClassesItemsConstraintsContactTestBitMask ) )
            int alt5=15;
            switch ( input.LA(1) ) {
            case Planes:
                {
                alt5=1;
                }
                break;
            case Ilumination:
                {
                alt5=2;
                }
                break;
            case SizeMax:
                {
                alt5=3;
                }
                break;
            case SizeMin:
                {
                alt5=4;
                }
                break;
            case SizeInit:
                {
                alt5=5;
                }
                break;
            case Overlapping:
                {
                alt5=6;
                }
                break;
            case XToOriginPos:
                {
                alt5=7;
                }
                break;
            case YToOriginPos:
                {
                alt5=8;
                }
                break;
            case ZToOriginPos:
                {
                alt5=9;
                }
                break;
            case Rotation:
                {
                alt5=10;
                }
                break;
            case Text:
                {
                alt5=11;
                }
                break;
            case Trim:
                {
                alt5=12;
                }
                break;
            case CategoryBitMask:
                {
                alt5=13;
                }
                break;
            case CollisionBitMask:
                {
                alt5=14;
                }
                break;
            case ContactTestBitMask:
                {
                alt5=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGraphicParser.g:1712:2: ( ruleGraphicRootClassesItemsConstraintsPlanes )
                    {
                    // InternalGraphicParser.g:1712:2: ( ruleGraphicRootClassesItemsConstraintsPlanes )
                    // InternalGraphicParser.g:1713:3: ruleGraphicRootClassesItemsConstraintsPlanes
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsPlanesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsPlanes();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsPlanesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:1718:2: ( ruleGraphicRootClassesItemsConstraintsIlumination )
                    {
                    // InternalGraphicParser.g:1718:2: ( ruleGraphicRootClassesItemsConstraintsIlumination )
                    // InternalGraphicParser.g:1719:3: ruleGraphicRootClassesItemsConstraintsIlumination
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsIluminationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsIlumination();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsIluminationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:1724:2: ( ruleGraphicRootClassesItemsConstraintsSizeMax )
                    {
                    // InternalGraphicParser.g:1724:2: ( ruleGraphicRootClassesItemsConstraintsSizeMax )
                    // InternalGraphicParser.g:1725:3: ruleGraphicRootClassesItemsConstraintsSizeMax
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsSizeMaxParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsSizeMax();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsSizeMaxParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphicParser.g:1730:2: ( ruleGraphicRootClassesItemsConstraintsSizeMin )
                    {
                    // InternalGraphicParser.g:1730:2: ( ruleGraphicRootClassesItemsConstraintsSizeMin )
                    // InternalGraphicParser.g:1731:3: ruleGraphicRootClassesItemsConstraintsSizeMin
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsSizeMinParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsSizeMin();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsSizeMinParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphicParser.g:1736:2: ( ruleGraphicRootClassesItemsConstraintsSizeInit )
                    {
                    // InternalGraphicParser.g:1736:2: ( ruleGraphicRootClassesItemsConstraintsSizeInit )
                    // InternalGraphicParser.g:1737:3: ruleGraphicRootClassesItemsConstraintsSizeInit
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsSizeInitParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsSizeInit();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsSizeInitParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphicParser.g:1742:2: ( ruleGraphicRootClassesItemsConstraintsOverlapping )
                    {
                    // InternalGraphicParser.g:1742:2: ( ruleGraphicRootClassesItemsConstraintsOverlapping )
                    // InternalGraphicParser.g:1743:3: ruleGraphicRootClassesItemsConstraintsOverlapping
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsOverlappingParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsOverlapping();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsOverlappingParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGraphicParser.g:1748:2: ( ruleGraphicRootClassesItemsConstraintsXToOriginPos )
                    {
                    // InternalGraphicParser.g:1748:2: ( ruleGraphicRootClassesItemsConstraintsXToOriginPos )
                    // InternalGraphicParser.g:1749:3: ruleGraphicRootClassesItemsConstraintsXToOriginPos
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsXToOriginPosParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsXToOriginPos();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsXToOriginPosParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGraphicParser.g:1754:2: ( ruleGraphicRootClassesItemsConstraintsYToOriginPos )
                    {
                    // InternalGraphicParser.g:1754:2: ( ruleGraphicRootClassesItemsConstraintsYToOriginPos )
                    // InternalGraphicParser.g:1755:3: ruleGraphicRootClassesItemsConstraintsYToOriginPos
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsYToOriginPosParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsYToOriginPos();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsYToOriginPosParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGraphicParser.g:1760:2: ( ruleGraphicRootClassesItemsConstraintsZToOriginPos )
                    {
                    // InternalGraphicParser.g:1760:2: ( ruleGraphicRootClassesItemsConstraintsZToOriginPos )
                    // InternalGraphicParser.g:1761:3: ruleGraphicRootClassesItemsConstraintsZToOriginPos
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsZToOriginPosParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsZToOriginPos();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsZToOriginPosParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGraphicParser.g:1766:2: ( ruleGraphicRootClassesItemsConstraintsRotation )
                    {
                    // InternalGraphicParser.g:1766:2: ( ruleGraphicRootClassesItemsConstraintsRotation )
                    // InternalGraphicParser.g:1767:3: ruleGraphicRootClassesItemsConstraintsRotation
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsRotationParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsRotation();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsRotationParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGraphicParser.g:1772:2: ( ruleGraphicRootClassesItemsConstraintsText )
                    {
                    // InternalGraphicParser.g:1772:2: ( ruleGraphicRootClassesItemsConstraintsText )
                    // InternalGraphicParser.g:1773:3: ruleGraphicRootClassesItemsConstraintsText
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsTextParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsText();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsTextParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGraphicParser.g:1778:2: ( ruleGraphicRootClassesItemsConstraintsTrim )
                    {
                    // InternalGraphicParser.g:1778:2: ( ruleGraphicRootClassesItemsConstraintsTrim )
                    // InternalGraphicParser.g:1779:3: ruleGraphicRootClassesItemsConstraintsTrim
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsTrimParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsTrim();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsTrimParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGraphicParser.g:1784:2: ( ruleGraphicRootClassesItemsConstraintsCategoryBitMask )
                    {
                    // InternalGraphicParser.g:1784:2: ( ruleGraphicRootClassesItemsConstraintsCategoryBitMask )
                    // InternalGraphicParser.g:1785:3: ruleGraphicRootClassesItemsConstraintsCategoryBitMask
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsCategoryBitMaskParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsCategoryBitMask();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsCategoryBitMaskParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalGraphicParser.g:1790:2: ( ruleGraphicRootClassesItemsConstraintsCollisionBitMask )
                    {
                    // InternalGraphicParser.g:1790:2: ( ruleGraphicRootClassesItemsConstraintsCollisionBitMask )
                    // InternalGraphicParser.g:1791:3: ruleGraphicRootClassesItemsConstraintsCollisionBitMask
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsCollisionBitMaskParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsCollisionBitMask();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsCollisionBitMaskParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalGraphicParser.g:1796:2: ( ruleGraphicRootClassesItemsConstraintsContactTestBitMask )
                    {
                    // InternalGraphicParser.g:1796:2: ( ruleGraphicRootClassesItemsConstraintsContactTestBitMask )
                    // InternalGraphicParser.g:1797:3: ruleGraphicRootClassesItemsConstraintsContactTestBitMask
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsContactTestBitMaskParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConstraintsContactTestBitMask();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConstraintsPropertiesAbstractAccess().getGraphicRootClassesItemsConstraintsContactTestBitMaskParserRuleCall_14()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPropertiesAbstract__Alternatives"
    // InternalGraphicParser.g:1806:1: rule__GraphicRootClassesItemsConnectionsItemsPropertiesAbstract__Alternatives : ( ( ruleGraphicRootClassesItemsConnectionsItemsName ) | ( ruleGraphicRootClassesItemsConnectionsItemsType ) | ( ruleGraphicRootClassesItemsConnectionsItemsColor ) | ( ruleGraphicRootClassesItemsConnectionsItemsTextColor ) | ( ruleGraphicRootClassesItemsConnectionsItemsDecorator ) | ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor ) | ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth ) | ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos ) | ( ruleGraphicRootClassesItemsConnectionsItemsPattern ) | ( ruleGraphicRootClassesItemsConnectionsItemsWidth ) | ( ruleGraphicRootClassesItemsConnectionsItemsPosition ) | ( ruleGraphicRootClassesItemsConnectionsItemsTarget ) );
    public final void rule__GraphicRootClassesItemsConnectionsItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1810:1: ( ( ruleGraphicRootClassesItemsConnectionsItemsName ) | ( ruleGraphicRootClassesItemsConnectionsItemsType ) | ( ruleGraphicRootClassesItemsConnectionsItemsColor ) | ( ruleGraphicRootClassesItemsConnectionsItemsTextColor ) | ( ruleGraphicRootClassesItemsConnectionsItemsDecorator ) | ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor ) | ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth ) | ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos ) | ( ruleGraphicRootClassesItemsConnectionsItemsPattern ) | ( ruleGraphicRootClassesItemsConnectionsItemsWidth ) | ( ruleGraphicRootClassesItemsConnectionsItemsPosition ) | ( ruleGraphicRootClassesItemsConnectionsItemsTarget ) )
            int alt6=12;
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
            case Color:
                {
                alt6=3;
                }
                break;
            case TextColor:
                {
                alt6=4;
                }
                break;
            case Decorator:
                {
                alt6=5;
                }
                break;
            case DecoratorColor:
                {
                alt6=6;
                }
                break;
            case DecoratorWidth:
                {
                alt6=7;
                }
                break;
            case DecoratorPos:
                {
                alt6=8;
                }
                break;
            case Pattern:
                {
                alt6=9;
                }
                break;
            case Width:
                {
                alt6=10;
                }
                break;
            case Position:
                {
                alt6=11;
                }
                break;
            case Target:
                {
                alt6=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGraphicParser.g:1811:2: ( ruleGraphicRootClassesItemsConnectionsItemsName )
                    {
                    // InternalGraphicParser.g:1811:2: ( ruleGraphicRootClassesItemsConnectionsItemsName )
                    // InternalGraphicParser.g:1812:3: ruleGraphicRootClassesItemsConnectionsItemsName
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnectionsItemsName();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:1817:2: ( ruleGraphicRootClassesItemsConnectionsItemsType )
                    {
                    // InternalGraphicParser.g:1817:2: ( ruleGraphicRootClassesItemsConnectionsItemsType )
                    // InternalGraphicParser.g:1818:3: ruleGraphicRootClassesItemsConnectionsItemsType
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnectionsItemsType();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:1823:2: ( ruleGraphicRootClassesItemsConnectionsItemsColor )
                    {
                    // InternalGraphicParser.g:1823:2: ( ruleGraphicRootClassesItemsConnectionsItemsColor )
                    // InternalGraphicParser.g:1824:3: ruleGraphicRootClassesItemsConnectionsItemsColor
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsColorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnectionsItemsColor();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsColorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphicParser.g:1829:2: ( ruleGraphicRootClassesItemsConnectionsItemsTextColor )
                    {
                    // InternalGraphicParser.g:1829:2: ( ruleGraphicRootClassesItemsConnectionsItemsTextColor )
                    // InternalGraphicParser.g:1830:3: ruleGraphicRootClassesItemsConnectionsItemsTextColor
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsTextColorParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnectionsItemsTextColor();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsTextColorParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphicParser.g:1835:2: ( ruleGraphicRootClassesItemsConnectionsItemsDecorator )
                    {
                    // InternalGraphicParser.g:1835:2: ( ruleGraphicRootClassesItemsConnectionsItemsDecorator )
                    // InternalGraphicParser.g:1836:3: ruleGraphicRootClassesItemsConnectionsItemsDecorator
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsDecoratorParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnectionsItemsDecorator();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsDecoratorParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphicParser.g:1841:2: ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor )
                    {
                    // InternalGraphicParser.g:1841:2: ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor )
                    // InternalGraphicParser.g:1842:3: ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsDecoratorColorParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnectionsItemsDecoratorColor();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsDecoratorColorParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGraphicParser.g:1847:2: ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth )
                    {
                    // InternalGraphicParser.g:1847:2: ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth )
                    // InternalGraphicParser.g:1848:3: ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsDecoratorWidthParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnectionsItemsDecoratorWidth();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsDecoratorWidthParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGraphicParser.g:1853:2: ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos )
                    {
                    // InternalGraphicParser.g:1853:2: ( ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos )
                    // InternalGraphicParser.g:1854:3: ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsDecoratorPosParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnectionsItemsDecoratorPos();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsDecoratorPosParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGraphicParser.g:1859:2: ( ruleGraphicRootClassesItemsConnectionsItemsPattern )
                    {
                    // InternalGraphicParser.g:1859:2: ( ruleGraphicRootClassesItemsConnectionsItemsPattern )
                    // InternalGraphicParser.g:1860:3: ruleGraphicRootClassesItemsConnectionsItemsPattern
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsPatternParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnectionsItemsPattern();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsPatternParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGraphicParser.g:1865:2: ( ruleGraphicRootClassesItemsConnectionsItemsWidth )
                    {
                    // InternalGraphicParser.g:1865:2: ( ruleGraphicRootClassesItemsConnectionsItemsWidth )
                    // InternalGraphicParser.g:1866:3: ruleGraphicRootClassesItemsConnectionsItemsWidth
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsWidthParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnectionsItemsWidth();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsWidthParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGraphicParser.g:1871:2: ( ruleGraphicRootClassesItemsConnectionsItemsPosition )
                    {
                    // InternalGraphicParser.g:1871:2: ( ruleGraphicRootClassesItemsConnectionsItemsPosition )
                    // InternalGraphicParser.g:1872:3: ruleGraphicRootClassesItemsConnectionsItemsPosition
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsPositionParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnectionsItemsPosition();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsPositionParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGraphicParser.g:1877:2: ( ruleGraphicRootClassesItemsConnectionsItemsTarget )
                    {
                    // InternalGraphicParser.g:1877:2: ( ruleGraphicRootClassesItemsConnectionsItemsTarget )
                    // InternalGraphicParser.g:1878:3: ruleGraphicRootClassesItemsConnectionsItemsTarget
                    {
                     before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsTargetParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicRootClassesItemsConnectionsItemsTarget();

                    state._fsp--;

                     after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPropertiesAbstractAccess().getGraphicRootClassesItemsConnectionsItemsTargetParserRuleCall_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__EBooleanObject__Alternatives"
    // InternalGraphicParser.g:1887:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1891:1: ( ( True ) | ( False ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==True) ) {
                alt7=1;
            }
            else if ( (LA7_0==False) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGraphicParser.g:1892:2: ( True )
                    {
                    // InternalGraphicParser.g:1892:2: ( True )
                    // InternalGraphicParser.g:1893:3: True
                    {
                     before(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:1898:2: ( False )
                    {
                    // InternalGraphicParser.g:1898:2: ( False )
                    // InternalGraphicParser.g:1899:3: False
                    {
                     before(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); 
                    match(input,False,FOLLOW_2); 
                     after(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBooleanObject__Alternatives"


    // $ANTLR start "rule__EDoubleObject__Alternatives"
    // InternalGraphicParser.g:1908:1: rule__EDoubleObject__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDoubleObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1912:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_E_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_E_DOUBLE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGraphicParser.g:1913:2: ( RULE_E_INT )
                    {
                    // InternalGraphicParser.g:1913:2: ( RULE_E_INT )
                    // InternalGraphicParser.g:1914:3: RULE_E_INT
                    {
                     before(grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0()); 
                    match(input,RULE_E_INT,FOLLOW_2); 
                     after(grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:1919:2: ( RULE_E_DOUBLE )
                    {
                    // InternalGraphicParser.g:1919:2: ( RULE_E_DOUBLE )
                    // InternalGraphicParser.g:1920:3: RULE_E_DOUBLE
                    {
                     before(grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1()); 
                    match(input,RULE_E_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDoubleObject__Alternatives"


    // $ANTLR start "rule__VALID_STRING__Alternatives"
    // InternalGraphicParser.g:1929:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1933:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=ContactTestBitMask && LA9_0<=URI)||(LA9_0>=V1 && LA9_0<=V3)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGraphicParser.g:1934:2: ( RULE_STRING )
                    {
                    // InternalGraphicParser.g:1934:2: ( RULE_STRING )
                    // InternalGraphicParser.g:1935:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:1940:2: ( ruleKEYWORD )
                    {
                    // InternalGraphicParser.g:1940:2: ( ruleKEYWORD )
                    // InternalGraphicParser.g:1941:3: ruleKEYWORD
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKEYWORD();

                    state._fsp--;

                     after(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_STRING__Alternatives"


    // $ANTLR start "rule__KEYWORD__Alternatives"
    // InternalGraphicParser.g:1950:1: rule__KEYWORD__Alternatives : ( ( Decorator ) | ( XToOriginPos ) | ( Color ) | ( ShowAttributes ) | ( Classes ) | ( SizeInit ) | ( Pattern ) | ( Type ) | ( URI ) | ( Constraints ) | ( CategoryBitMask ) | ( Trim ) | ( Text ) | ( SizeMax ) | ( Connections ) | ( CollisionBitMask ) | ( ContactTestBitMask ) | ( ZToOriginPos ) | ( Rotation ) | ( Planes ) | ( TextColor ) | ( SizeMin ) | ( DecoratorPos ) | ( Target ) | ( YToOriginPos ) | ( MaterialAttributes ) | ( Vname ) | ( DecoratorColor ) | ( Versions ) | ( Ilumination ) | ( Overlapping ) | ( Name ) | ( Width ) | ( DecoratorWidth ) | ( V1 ) | ( Position ) | ( V2 ) | ( V3 ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:1954:1: ( ( Decorator ) | ( XToOriginPos ) | ( Color ) | ( ShowAttributes ) | ( Classes ) | ( SizeInit ) | ( Pattern ) | ( Type ) | ( URI ) | ( Constraints ) | ( CategoryBitMask ) | ( Trim ) | ( Text ) | ( SizeMax ) | ( Connections ) | ( CollisionBitMask ) | ( ContactTestBitMask ) | ( ZToOriginPos ) | ( Rotation ) | ( Planes ) | ( TextColor ) | ( SizeMin ) | ( DecoratorPos ) | ( Target ) | ( YToOriginPos ) | ( MaterialAttributes ) | ( Vname ) | ( DecoratorColor ) | ( Versions ) | ( Ilumination ) | ( Overlapping ) | ( Name ) | ( Width ) | ( DecoratorWidth ) | ( V1 ) | ( Position ) | ( V2 ) | ( V3 ) )
            int alt10=38;
            switch ( input.LA(1) ) {
            case Decorator:
                {
                alt10=1;
                }
                break;
            case XToOriginPos:
                {
                alt10=2;
                }
                break;
            case Color:
                {
                alt10=3;
                }
                break;
            case ShowAttributes:
                {
                alt10=4;
                }
                break;
            case Classes:
                {
                alt10=5;
                }
                break;
            case SizeInit:
                {
                alt10=6;
                }
                break;
            case Pattern:
                {
                alt10=7;
                }
                break;
            case Type:
                {
                alt10=8;
                }
                break;
            case URI:
                {
                alt10=9;
                }
                break;
            case Constraints:
                {
                alt10=10;
                }
                break;
            case CategoryBitMask:
                {
                alt10=11;
                }
                break;
            case Trim:
                {
                alt10=12;
                }
                break;
            case Text:
                {
                alt10=13;
                }
                break;
            case SizeMax:
                {
                alt10=14;
                }
                break;
            case Connections:
                {
                alt10=15;
                }
                break;
            case CollisionBitMask:
                {
                alt10=16;
                }
                break;
            case ContactTestBitMask:
                {
                alt10=17;
                }
                break;
            case ZToOriginPos:
                {
                alt10=18;
                }
                break;
            case Rotation:
                {
                alt10=19;
                }
                break;
            case Planes:
                {
                alt10=20;
                }
                break;
            case TextColor:
                {
                alt10=21;
                }
                break;
            case SizeMin:
                {
                alt10=22;
                }
                break;
            case DecoratorPos:
                {
                alt10=23;
                }
                break;
            case Target:
                {
                alt10=24;
                }
                break;
            case YToOriginPos:
                {
                alt10=25;
                }
                break;
            case MaterialAttributes:
                {
                alt10=26;
                }
                break;
            case Vname:
                {
                alt10=27;
                }
                break;
            case DecoratorColor:
                {
                alt10=28;
                }
                break;
            case Versions:
                {
                alt10=29;
                }
                break;
            case Ilumination:
                {
                alt10=30;
                }
                break;
            case Overlapping:
                {
                alt10=31;
                }
                break;
            case Name:
                {
                alt10=32;
                }
                break;
            case Width:
                {
                alt10=33;
                }
                break;
            case DecoratorWidth:
                {
                alt10=34;
                }
                break;
            case V1:
                {
                alt10=35;
                }
                break;
            case Position:
                {
                alt10=36;
                }
                break;
            case V2:
                {
                alt10=37;
                }
                break;
            case V3:
                {
                alt10=38;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalGraphicParser.g:1955:2: ( Decorator )
                    {
                    // InternalGraphicParser.g:1955:2: ( Decorator )
                    // InternalGraphicParser.g:1956:3: Decorator
                    {
                     before(grammarAccess.getKEYWORDAccess().getDecoratorKeyword_0()); 
                    match(input,Decorator,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDecoratorKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphicParser.g:1961:2: ( XToOriginPos )
                    {
                    // InternalGraphicParser.g:1961:2: ( XToOriginPos )
                    // InternalGraphicParser.g:1962:3: XToOriginPos
                    {
                     before(grammarAccess.getKEYWORDAccess().getXToOriginPosKeyword_1()); 
                    match(input,XToOriginPos,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getXToOriginPosKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGraphicParser.g:1967:2: ( Color )
                    {
                    // InternalGraphicParser.g:1967:2: ( Color )
                    // InternalGraphicParser.g:1968:3: Color
                    {
                     before(grammarAccess.getKEYWORDAccess().getColorKeyword_2()); 
                    match(input,Color,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getColorKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGraphicParser.g:1973:2: ( ShowAttributes )
                    {
                    // InternalGraphicParser.g:1973:2: ( ShowAttributes )
                    // InternalGraphicParser.g:1974:3: ShowAttributes
                    {
                     before(grammarAccess.getKEYWORDAccess().getShowAttributesKeyword_3()); 
                    match(input,ShowAttributes,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getShowAttributesKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGraphicParser.g:1979:2: ( Classes )
                    {
                    // InternalGraphicParser.g:1979:2: ( Classes )
                    // InternalGraphicParser.g:1980:3: Classes
                    {
                     before(grammarAccess.getKEYWORDAccess().getClassesKeyword_4()); 
                    match(input,Classes,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getClassesKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGraphicParser.g:1985:2: ( SizeInit )
                    {
                    // InternalGraphicParser.g:1985:2: ( SizeInit )
                    // InternalGraphicParser.g:1986:3: SizeInit
                    {
                     before(grammarAccess.getKEYWORDAccess().getSizeInitKeyword_5()); 
                    match(input,SizeInit,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getSizeInitKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGraphicParser.g:1991:2: ( Pattern )
                    {
                    // InternalGraphicParser.g:1991:2: ( Pattern )
                    // InternalGraphicParser.g:1992:3: Pattern
                    {
                     before(grammarAccess.getKEYWORDAccess().getPatternKeyword_6()); 
                    match(input,Pattern,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPatternKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGraphicParser.g:1997:2: ( Type )
                    {
                    // InternalGraphicParser.g:1997:2: ( Type )
                    // InternalGraphicParser.g:1998:3: Type
                    {
                     before(grammarAccess.getKEYWORDAccess().getTypeKeyword_7()); 
                    match(input,Type,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTypeKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGraphicParser.g:2003:2: ( URI )
                    {
                    // InternalGraphicParser.g:2003:2: ( URI )
                    // InternalGraphicParser.g:2004:3: URI
                    {
                     before(grammarAccess.getKEYWORDAccess().getURIKeyword_8()); 
                    match(input,URI,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getURIKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGraphicParser.g:2009:2: ( Constraints )
                    {
                    // InternalGraphicParser.g:2009:2: ( Constraints )
                    // InternalGraphicParser.g:2010:3: Constraints
                    {
                     before(grammarAccess.getKEYWORDAccess().getConstraintsKeyword_9()); 
                    match(input,Constraints,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getConstraintsKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGraphicParser.g:2015:2: ( CategoryBitMask )
                    {
                    // InternalGraphicParser.g:2015:2: ( CategoryBitMask )
                    // InternalGraphicParser.g:2016:3: CategoryBitMask
                    {
                     before(grammarAccess.getKEYWORDAccess().getCategoryBitMaskKeyword_10()); 
                    match(input,CategoryBitMask,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getCategoryBitMaskKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGraphicParser.g:2021:2: ( Trim )
                    {
                    // InternalGraphicParser.g:2021:2: ( Trim )
                    // InternalGraphicParser.g:2022:3: Trim
                    {
                     before(grammarAccess.getKEYWORDAccess().getTrimKeyword_11()); 
                    match(input,Trim,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTrimKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGraphicParser.g:2027:2: ( Text )
                    {
                    // InternalGraphicParser.g:2027:2: ( Text )
                    // InternalGraphicParser.g:2028:3: Text
                    {
                     before(grammarAccess.getKEYWORDAccess().getTextKeyword_12()); 
                    match(input,Text,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTextKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalGraphicParser.g:2033:2: ( SizeMax )
                    {
                    // InternalGraphicParser.g:2033:2: ( SizeMax )
                    // InternalGraphicParser.g:2034:3: SizeMax
                    {
                     before(grammarAccess.getKEYWORDAccess().getSizeMaxKeyword_13()); 
                    match(input,SizeMax,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getSizeMaxKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalGraphicParser.g:2039:2: ( Connections )
                    {
                    // InternalGraphicParser.g:2039:2: ( Connections )
                    // InternalGraphicParser.g:2040:3: Connections
                    {
                     before(grammarAccess.getKEYWORDAccess().getConnectionsKeyword_14()); 
                    match(input,Connections,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getConnectionsKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalGraphicParser.g:2045:2: ( CollisionBitMask )
                    {
                    // InternalGraphicParser.g:2045:2: ( CollisionBitMask )
                    // InternalGraphicParser.g:2046:3: CollisionBitMask
                    {
                     before(grammarAccess.getKEYWORDAccess().getCollisionBitMaskKeyword_15()); 
                    match(input,CollisionBitMask,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getCollisionBitMaskKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalGraphicParser.g:2051:2: ( ContactTestBitMask )
                    {
                    // InternalGraphicParser.g:2051:2: ( ContactTestBitMask )
                    // InternalGraphicParser.g:2052:3: ContactTestBitMask
                    {
                     before(grammarAccess.getKEYWORDAccess().getContactTestBitMaskKeyword_16()); 
                    match(input,ContactTestBitMask,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getContactTestBitMaskKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalGraphicParser.g:2057:2: ( ZToOriginPos )
                    {
                    // InternalGraphicParser.g:2057:2: ( ZToOriginPos )
                    // InternalGraphicParser.g:2058:3: ZToOriginPos
                    {
                     before(grammarAccess.getKEYWORDAccess().getZToOriginPosKeyword_17()); 
                    match(input,ZToOriginPos,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getZToOriginPosKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalGraphicParser.g:2063:2: ( Rotation )
                    {
                    // InternalGraphicParser.g:2063:2: ( Rotation )
                    // InternalGraphicParser.g:2064:3: Rotation
                    {
                     before(grammarAccess.getKEYWORDAccess().getRotationKeyword_18()); 
                    match(input,Rotation,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getRotationKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalGraphicParser.g:2069:2: ( Planes )
                    {
                    // InternalGraphicParser.g:2069:2: ( Planes )
                    // InternalGraphicParser.g:2070:3: Planes
                    {
                     before(grammarAccess.getKEYWORDAccess().getPlanesKeyword_19()); 
                    match(input,Planes,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPlanesKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalGraphicParser.g:2075:2: ( TextColor )
                    {
                    // InternalGraphicParser.g:2075:2: ( TextColor )
                    // InternalGraphicParser.g:2076:3: TextColor
                    {
                     before(grammarAccess.getKEYWORDAccess().getTextColorKeyword_20()); 
                    match(input,TextColor,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTextColorKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalGraphicParser.g:2081:2: ( SizeMin )
                    {
                    // InternalGraphicParser.g:2081:2: ( SizeMin )
                    // InternalGraphicParser.g:2082:3: SizeMin
                    {
                     before(grammarAccess.getKEYWORDAccess().getSizeMinKeyword_21()); 
                    match(input,SizeMin,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getSizeMinKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalGraphicParser.g:2087:2: ( DecoratorPos )
                    {
                    // InternalGraphicParser.g:2087:2: ( DecoratorPos )
                    // InternalGraphicParser.g:2088:3: DecoratorPos
                    {
                     before(grammarAccess.getKEYWORDAccess().getDecoratorPosKeyword_22()); 
                    match(input,DecoratorPos,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDecoratorPosKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalGraphicParser.g:2093:2: ( Target )
                    {
                    // InternalGraphicParser.g:2093:2: ( Target )
                    // InternalGraphicParser.g:2094:3: Target
                    {
                     before(grammarAccess.getKEYWORDAccess().getTargetKeyword_23()); 
                    match(input,Target,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTargetKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalGraphicParser.g:2099:2: ( YToOriginPos )
                    {
                    // InternalGraphicParser.g:2099:2: ( YToOriginPos )
                    // InternalGraphicParser.g:2100:3: YToOriginPos
                    {
                     before(grammarAccess.getKEYWORDAccess().getYToOriginPosKeyword_24()); 
                    match(input,YToOriginPos,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getYToOriginPosKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalGraphicParser.g:2105:2: ( MaterialAttributes )
                    {
                    // InternalGraphicParser.g:2105:2: ( MaterialAttributes )
                    // InternalGraphicParser.g:2106:3: MaterialAttributes
                    {
                     before(grammarAccess.getKEYWORDAccess().getMaterialAttributesKeyword_25()); 
                    match(input,MaterialAttributes,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMaterialAttributesKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalGraphicParser.g:2111:2: ( Vname )
                    {
                    // InternalGraphicParser.g:2111:2: ( Vname )
                    // InternalGraphicParser.g:2112:3: Vname
                    {
                     before(grammarAccess.getKEYWORDAccess().getVnameKeyword_26()); 
                    match(input,Vname,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getVnameKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalGraphicParser.g:2117:2: ( DecoratorColor )
                    {
                    // InternalGraphicParser.g:2117:2: ( DecoratorColor )
                    // InternalGraphicParser.g:2118:3: DecoratorColor
                    {
                     before(grammarAccess.getKEYWORDAccess().getDecoratorColorKeyword_27()); 
                    match(input,DecoratorColor,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDecoratorColorKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalGraphicParser.g:2123:2: ( Versions )
                    {
                    // InternalGraphicParser.g:2123:2: ( Versions )
                    // InternalGraphicParser.g:2124:3: Versions
                    {
                     before(grammarAccess.getKEYWORDAccess().getVersionsKeyword_28()); 
                    match(input,Versions,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getVersionsKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalGraphicParser.g:2129:2: ( Ilumination )
                    {
                    // InternalGraphicParser.g:2129:2: ( Ilumination )
                    // InternalGraphicParser.g:2130:3: Ilumination
                    {
                     before(grammarAccess.getKEYWORDAccess().getIluminationKeyword_29()); 
                    match(input,Ilumination,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getIluminationKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalGraphicParser.g:2135:2: ( Overlapping )
                    {
                    // InternalGraphicParser.g:2135:2: ( Overlapping )
                    // InternalGraphicParser.g:2136:3: Overlapping
                    {
                     before(grammarAccess.getKEYWORDAccess().getOverlappingKeyword_30()); 
                    match(input,Overlapping,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOverlappingKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalGraphicParser.g:2141:2: ( Name )
                    {
                    // InternalGraphicParser.g:2141:2: ( Name )
                    // InternalGraphicParser.g:2142:3: Name
                    {
                     before(grammarAccess.getKEYWORDAccess().getNameKeyword_31()); 
                    match(input,Name,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNameKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalGraphicParser.g:2147:2: ( Width )
                    {
                    // InternalGraphicParser.g:2147:2: ( Width )
                    // InternalGraphicParser.g:2148:3: Width
                    {
                     before(grammarAccess.getKEYWORDAccess().getWidthKeyword_32()); 
                    match(input,Width,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getWidthKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalGraphicParser.g:2153:2: ( DecoratorWidth )
                    {
                    // InternalGraphicParser.g:2153:2: ( DecoratorWidth )
                    // InternalGraphicParser.g:2154:3: DecoratorWidth
                    {
                     before(grammarAccess.getKEYWORDAccess().getDecoratorWidthKeyword_33()); 
                    match(input,DecoratorWidth,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDecoratorWidthKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalGraphicParser.g:2159:2: ( V1 )
                    {
                    // InternalGraphicParser.g:2159:2: ( V1 )
                    // InternalGraphicParser.g:2160:3: V1
                    {
                     before(grammarAccess.getKEYWORDAccess().getV1Keyword_34()); 
                    match(input,V1,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getV1Keyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalGraphicParser.g:2165:2: ( Position )
                    {
                    // InternalGraphicParser.g:2165:2: ( Position )
                    // InternalGraphicParser.g:2166:3: Position
                    {
                     before(grammarAccess.getKEYWORDAccess().getPositionKeyword_35()); 
                    match(input,Position,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPositionKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalGraphicParser.g:2171:2: ( V2 )
                    {
                    // InternalGraphicParser.g:2171:2: ( V2 )
                    // InternalGraphicParser.g:2172:3: V2
                    {
                     before(grammarAccess.getKEYWORDAccess().getV2Keyword_36()); 
                    match(input,V2,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getV2Keyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalGraphicParser.g:2177:2: ( V3 )
                    {
                    // InternalGraphicParser.g:2177:2: ( V3 )
                    // InternalGraphicParser.g:2178:3: V3
                    {
                     before(grammarAccess.getKEYWORDAccess().getV3Keyword_37()); 
                    match(input,V3,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getV3Keyword_37()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KEYWORD__Alternatives"


    // $ANTLR start "rule__GraphicRoot__Group__0"
    // InternalGraphicParser.g:2187:1: rule__GraphicRoot__Group__0 : rule__GraphicRoot__Group__0__Impl rule__GraphicRoot__Group__1 ;
    public final void rule__GraphicRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2191:1: ( rule__GraphicRoot__Group__0__Impl rule__GraphicRoot__Group__1 )
            // InternalGraphicParser.g:2192:2: rule__GraphicRoot__Group__0__Impl rule__GraphicRoot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphicRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRoot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group__0"


    // $ANTLR start "rule__GraphicRoot__Group__0__Impl"
    // InternalGraphicParser.g:2199:1: rule__GraphicRoot__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2203:1: ( ( () ) )
            // InternalGraphicParser.g:2204:1: ( () )
            {
            // InternalGraphicParser.g:2204:1: ( () )
            // InternalGraphicParser.g:2205:2: ()
            {
             before(grammarAccess.getGraphicRootAccess().getGraphicRootAction_0()); 
            // InternalGraphicParser.g:2206:2: ()
            // InternalGraphicParser.g:2206:3: 
            {
            }

             after(grammarAccess.getGraphicRootAccess().getGraphicRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group__0__Impl"


    // $ANTLR start "rule__GraphicRoot__Group__1"
    // InternalGraphicParser.g:2214:1: rule__GraphicRoot__Group__1 : rule__GraphicRoot__Group__1__Impl rule__GraphicRoot__Group__2 ;
    public final void rule__GraphicRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2218:1: ( rule__GraphicRoot__Group__1__Impl rule__GraphicRoot__Group__2 )
            // InternalGraphicParser.g:2219:2: rule__GraphicRoot__Group__1__Impl rule__GraphicRoot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GraphicRoot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRoot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group__1"


    // $ANTLR start "rule__GraphicRoot__Group__1__Impl"
    // InternalGraphicParser.g:2226:1: rule__GraphicRoot__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__GraphicRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2230:1: ( ( LeftCurlyBracket ) )
            // InternalGraphicParser.g:2231:1: ( LeftCurlyBracket )
            {
            // InternalGraphicParser.g:2231:1: ( LeftCurlyBracket )
            // InternalGraphicParser.g:2232:2: LeftCurlyBracket
            {
             before(grammarAccess.getGraphicRootAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group__1__Impl"


    // $ANTLR start "rule__GraphicRoot__Group__2"
    // InternalGraphicParser.g:2241:1: rule__GraphicRoot__Group__2 : rule__GraphicRoot__Group__2__Impl rule__GraphicRoot__Group__3 ;
    public final void rule__GraphicRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2245:1: ( rule__GraphicRoot__Group__2__Impl rule__GraphicRoot__Group__3 )
            // InternalGraphicParser.g:2246:2: rule__GraphicRoot__Group__2__Impl rule__GraphicRoot__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__GraphicRoot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRoot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group__2"


    // $ANTLR start "rule__GraphicRoot__Group__2__Impl"
    // InternalGraphicParser.g:2253:1: rule__GraphicRoot__Group__2__Impl : ( ( rule__GraphicRoot__Group_2__0 )? ) ;
    public final void rule__GraphicRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2257:1: ( ( ( rule__GraphicRoot__Group_2__0 )? ) )
            // InternalGraphicParser.g:2258:1: ( ( rule__GraphicRoot__Group_2__0 )? )
            {
            // InternalGraphicParser.g:2258:1: ( ( rule__GraphicRoot__Group_2__0 )? )
            // InternalGraphicParser.g:2259:2: ( rule__GraphicRoot__Group_2__0 )?
            {
             before(grammarAccess.getGraphicRootAccess().getGroup_2()); 
            // InternalGraphicParser.g:2260:2: ( rule__GraphicRoot__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Classes||LA11_0==Name||LA11_0==URI) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphicParser.g:2260:3: rule__GraphicRoot__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphicRoot__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphicRootAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group__2__Impl"


    // $ANTLR start "rule__GraphicRoot__Group__3"
    // InternalGraphicParser.g:2268:1: rule__GraphicRoot__Group__3 : rule__GraphicRoot__Group__3__Impl ;
    public final void rule__GraphicRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2272:1: ( rule__GraphicRoot__Group__3__Impl )
            // InternalGraphicParser.g:2273:2: rule__GraphicRoot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRoot__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group__3"


    // $ANTLR start "rule__GraphicRoot__Group__3__Impl"
    // InternalGraphicParser.g:2279:1: rule__GraphicRoot__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__GraphicRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2283:1: ( ( RightCurlyBracket ) )
            // InternalGraphicParser.g:2284:1: ( RightCurlyBracket )
            {
            // InternalGraphicParser.g:2284:1: ( RightCurlyBracket )
            // InternalGraphicParser.g:2285:2: RightCurlyBracket
            {
             before(grammarAccess.getGraphicRootAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group__3__Impl"


    // $ANTLR start "rule__GraphicRoot__Group_2__0"
    // InternalGraphicParser.g:2295:1: rule__GraphicRoot__Group_2__0 : rule__GraphicRoot__Group_2__0__Impl rule__GraphicRoot__Group_2__1 ;
    public final void rule__GraphicRoot__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2299:1: ( rule__GraphicRoot__Group_2__0__Impl rule__GraphicRoot__Group_2__1 )
            // InternalGraphicParser.g:2300:2: rule__GraphicRoot__Group_2__0__Impl rule__GraphicRoot__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GraphicRoot__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRoot__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group_2__0"


    // $ANTLR start "rule__GraphicRoot__Group_2__0__Impl"
    // InternalGraphicParser.g:2307:1: rule__GraphicRoot__Group_2__0__Impl : ( ( rule__GraphicRoot__GraphicRootAssignment_2_0 ) ) ;
    public final void rule__GraphicRoot__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2311:1: ( ( ( rule__GraphicRoot__GraphicRootAssignment_2_0 ) ) )
            // InternalGraphicParser.g:2312:1: ( ( rule__GraphicRoot__GraphicRootAssignment_2_0 ) )
            {
            // InternalGraphicParser.g:2312:1: ( ( rule__GraphicRoot__GraphicRootAssignment_2_0 ) )
            // InternalGraphicParser.g:2313:2: ( rule__GraphicRoot__GraphicRootAssignment_2_0 )
            {
             before(grammarAccess.getGraphicRootAccess().getGraphicRootAssignment_2_0()); 
            // InternalGraphicParser.g:2314:2: ( rule__GraphicRoot__GraphicRootAssignment_2_0 )
            // InternalGraphicParser.g:2314:3: rule__GraphicRoot__GraphicRootAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRoot__GraphicRootAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootAccess().getGraphicRootAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group_2__0__Impl"


    // $ANTLR start "rule__GraphicRoot__Group_2__1"
    // InternalGraphicParser.g:2322:1: rule__GraphicRoot__Group_2__1 : rule__GraphicRoot__Group_2__1__Impl ;
    public final void rule__GraphicRoot__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2326:1: ( rule__GraphicRoot__Group_2__1__Impl )
            // InternalGraphicParser.g:2327:2: rule__GraphicRoot__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRoot__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group_2__1"


    // $ANTLR start "rule__GraphicRoot__Group_2__1__Impl"
    // InternalGraphicParser.g:2333:1: rule__GraphicRoot__Group_2__1__Impl : ( ( rule__GraphicRoot__Group_2_1__0 )* ) ;
    public final void rule__GraphicRoot__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2337:1: ( ( ( rule__GraphicRoot__Group_2_1__0 )* ) )
            // InternalGraphicParser.g:2338:1: ( ( rule__GraphicRoot__Group_2_1__0 )* )
            {
            // InternalGraphicParser.g:2338:1: ( ( rule__GraphicRoot__Group_2_1__0 )* )
            // InternalGraphicParser.g:2339:2: ( rule__GraphicRoot__Group_2_1__0 )*
            {
             before(grammarAccess.getGraphicRootAccess().getGroup_2_1()); 
            // InternalGraphicParser.g:2340:2: ( rule__GraphicRoot__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGraphicParser.g:2340:3: rule__GraphicRoot__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GraphicRoot__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGraphicRootAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group_2__1__Impl"


    // $ANTLR start "rule__GraphicRoot__Group_2_1__0"
    // InternalGraphicParser.g:2349:1: rule__GraphicRoot__Group_2_1__0 : rule__GraphicRoot__Group_2_1__0__Impl rule__GraphicRoot__Group_2_1__1 ;
    public final void rule__GraphicRoot__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2353:1: ( rule__GraphicRoot__Group_2_1__0__Impl rule__GraphicRoot__Group_2_1__1 )
            // InternalGraphicParser.g:2354:2: rule__GraphicRoot__Group_2_1__0__Impl rule__GraphicRoot__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__GraphicRoot__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRoot__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group_2_1__0"


    // $ANTLR start "rule__GraphicRoot__Group_2_1__0__Impl"
    // InternalGraphicParser.g:2361:1: rule__GraphicRoot__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__GraphicRoot__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2365:1: ( ( Comma ) )
            // InternalGraphicParser.g:2366:1: ( Comma )
            {
            // InternalGraphicParser.g:2366:1: ( Comma )
            // InternalGraphicParser.g:2367:2: Comma
            {
             before(grammarAccess.getGraphicRootAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGraphicRootAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group_2_1__0__Impl"


    // $ANTLR start "rule__GraphicRoot__Group_2_1__1"
    // InternalGraphicParser.g:2376:1: rule__GraphicRoot__Group_2_1__1 : rule__GraphicRoot__Group_2_1__1__Impl ;
    public final void rule__GraphicRoot__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2380:1: ( rule__GraphicRoot__Group_2_1__1__Impl )
            // InternalGraphicParser.g:2381:2: rule__GraphicRoot__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRoot__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group_2_1__1"


    // $ANTLR start "rule__GraphicRoot__Group_2_1__1__Impl"
    // InternalGraphicParser.g:2387:1: rule__GraphicRoot__Group_2_1__1__Impl : ( ( rule__GraphicRoot__GraphicRootAssignment_2_1_1 ) ) ;
    public final void rule__GraphicRoot__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2391:1: ( ( ( rule__GraphicRoot__GraphicRootAssignment_2_1_1 ) ) )
            // InternalGraphicParser.g:2392:1: ( ( rule__GraphicRoot__GraphicRootAssignment_2_1_1 ) )
            {
            // InternalGraphicParser.g:2392:1: ( ( rule__GraphicRoot__GraphicRootAssignment_2_1_1 ) )
            // InternalGraphicParser.g:2393:2: ( rule__GraphicRoot__GraphicRootAssignment_2_1_1 )
            {
             before(grammarAccess.getGraphicRootAccess().getGraphicRootAssignment_2_1_1()); 
            // InternalGraphicParser.g:2394:2: ( rule__GraphicRoot__GraphicRootAssignment_2_1_1 )
            // InternalGraphicParser.g:2394:3: rule__GraphicRoot__GraphicRootAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRoot__GraphicRootAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootAccess().getGraphicRootAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__Group_2_1__1__Impl"


    // $ANTLR start "rule__GraphicRootName__Group__0"
    // InternalGraphicParser.g:2403:1: rule__GraphicRootName__Group__0 : rule__GraphicRootName__Group__0__Impl rule__GraphicRootName__Group__1 ;
    public final void rule__GraphicRootName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2407:1: ( rule__GraphicRootName__Group__0__Impl rule__GraphicRootName__Group__1 )
            // InternalGraphicParser.g:2408:2: rule__GraphicRootName__Group__0__Impl rule__GraphicRootName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__GraphicRootName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootName__Group__0"


    // $ANTLR start "rule__GraphicRootName__Group__0__Impl"
    // InternalGraphicParser.g:2415:1: rule__GraphicRootName__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRootName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2419:1: ( ( () ) )
            // InternalGraphicParser.g:2420:1: ( () )
            {
            // InternalGraphicParser.g:2420:1: ( () )
            // InternalGraphicParser.g:2421:2: ()
            {
             before(grammarAccess.getGraphicRootNameAccess().getGraphicRootNameAction_0()); 
            // InternalGraphicParser.g:2422:2: ()
            // InternalGraphicParser.g:2422:3: 
            {
            }

             after(grammarAccess.getGraphicRootNameAccess().getGraphicRootNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootName__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootName__Group__1"
    // InternalGraphicParser.g:2430:1: rule__GraphicRootName__Group__1 : rule__GraphicRootName__Group__1__Impl rule__GraphicRootName__Group__2 ;
    public final void rule__GraphicRootName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2434:1: ( rule__GraphicRootName__Group__1__Impl rule__GraphicRootName__Group__2 )
            // InternalGraphicParser.g:2435:2: rule__GraphicRootName__Group__1__Impl rule__GraphicRootName__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootName__Group__1"


    // $ANTLR start "rule__GraphicRootName__Group__1__Impl"
    // InternalGraphicParser.g:2442:1: rule__GraphicRootName__Group__1__Impl : ( Name ) ;
    public final void rule__GraphicRootName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2446:1: ( ( Name ) )
            // InternalGraphicParser.g:2447:1: ( Name )
            {
            // InternalGraphicParser.g:2447:1: ( Name )
            // InternalGraphicParser.g:2448:2: Name
            {
             before(grammarAccess.getGraphicRootNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getGraphicRootNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootName__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootName__Group__2"
    // InternalGraphicParser.g:2457:1: rule__GraphicRootName__Group__2 : rule__GraphicRootName__Group__2__Impl rule__GraphicRootName__Group__3 ;
    public final void rule__GraphicRootName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2461:1: ( rule__GraphicRootName__Group__2__Impl rule__GraphicRootName__Group__3 )
            // InternalGraphicParser.g:2462:2: rule__GraphicRootName__Group__2__Impl rule__GraphicRootName__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootName__Group__2"


    // $ANTLR start "rule__GraphicRootName__Group__2__Impl"
    // InternalGraphicParser.g:2469:1: rule__GraphicRootName__Group__2__Impl : ( Colon ) ;
    public final void rule__GraphicRootName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2473:1: ( ( Colon ) )
            // InternalGraphicParser.g:2474:1: ( Colon )
            {
            // InternalGraphicParser.g:2474:1: ( Colon )
            // InternalGraphicParser.g:2475:2: Colon
            {
             before(grammarAccess.getGraphicRootNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootName__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootName__Group__3"
    // InternalGraphicParser.g:2484:1: rule__GraphicRootName__Group__3 : rule__GraphicRootName__Group__3__Impl ;
    public final void rule__GraphicRootName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2488:1: ( rule__GraphicRootName__Group__3__Impl )
            // InternalGraphicParser.g:2489:2: rule__GraphicRootName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootName__Group__3"


    // $ANTLR start "rule__GraphicRootName__Group__3__Impl"
    // InternalGraphicParser.g:2495:1: rule__GraphicRootName__Group__3__Impl : ( ( rule__GraphicRootName__NameAssignment_3 ) ) ;
    public final void rule__GraphicRootName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2499:1: ( ( ( rule__GraphicRootName__NameAssignment_3 ) ) )
            // InternalGraphicParser.g:2500:1: ( ( rule__GraphicRootName__NameAssignment_3 ) )
            {
            // InternalGraphicParser.g:2500:1: ( ( rule__GraphicRootName__NameAssignment_3 ) )
            // InternalGraphicParser.g:2501:2: ( rule__GraphicRootName__NameAssignment_3 )
            {
             before(grammarAccess.getGraphicRootNameAccess().getNameAssignment_3()); 
            // InternalGraphicParser.g:2502:2: ( rule__GraphicRootName__NameAssignment_3 )
            // InternalGraphicParser.g:2502:3: rule__GraphicRootName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootName__Group__3__Impl"


    // $ANTLR start "rule__GraphicRootURI__Group__0"
    // InternalGraphicParser.g:2511:1: rule__GraphicRootURI__Group__0 : rule__GraphicRootURI__Group__0__Impl rule__GraphicRootURI__Group__1 ;
    public final void rule__GraphicRootURI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2515:1: ( rule__GraphicRootURI__Group__0__Impl rule__GraphicRootURI__Group__1 )
            // InternalGraphicParser.g:2516:2: rule__GraphicRootURI__Group__0__Impl rule__GraphicRootURI__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootURI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootURI__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootURI__Group__0"


    // $ANTLR start "rule__GraphicRootURI__Group__0__Impl"
    // InternalGraphicParser.g:2523:1: rule__GraphicRootURI__Group__0__Impl : ( URI ) ;
    public final void rule__GraphicRootURI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2527:1: ( ( URI ) )
            // InternalGraphicParser.g:2528:1: ( URI )
            {
            // InternalGraphicParser.g:2528:1: ( URI )
            // InternalGraphicParser.g:2529:2: URI
            {
             before(grammarAccess.getGraphicRootURIAccess().getURIKeyword_0()); 
            match(input,URI,FOLLOW_2); 
             after(grammarAccess.getGraphicRootURIAccess().getURIKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootURI__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootURI__Group__1"
    // InternalGraphicParser.g:2538:1: rule__GraphicRootURI__Group__1 : rule__GraphicRootURI__Group__1__Impl rule__GraphicRootURI__Group__2 ;
    public final void rule__GraphicRootURI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2542:1: ( rule__GraphicRootURI__Group__1__Impl rule__GraphicRootURI__Group__2 )
            // InternalGraphicParser.g:2543:2: rule__GraphicRootURI__Group__1__Impl rule__GraphicRootURI__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootURI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootURI__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootURI__Group__1"


    // $ANTLR start "rule__GraphicRootURI__Group__1__Impl"
    // InternalGraphicParser.g:2550:1: rule__GraphicRootURI__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootURI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2554:1: ( ( Colon ) )
            // InternalGraphicParser.g:2555:1: ( Colon )
            {
            // InternalGraphicParser.g:2555:1: ( Colon )
            // InternalGraphicParser.g:2556:2: Colon
            {
             before(grammarAccess.getGraphicRootURIAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootURIAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootURI__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootURI__Group__2"
    // InternalGraphicParser.g:2565:1: rule__GraphicRootURI__Group__2 : rule__GraphicRootURI__Group__2__Impl ;
    public final void rule__GraphicRootURI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2569:1: ( rule__GraphicRootURI__Group__2__Impl )
            // InternalGraphicParser.g:2570:2: rule__GraphicRootURI__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootURI__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootURI__Group__2"


    // $ANTLR start "rule__GraphicRootURI__Group__2__Impl"
    // InternalGraphicParser.g:2576:1: rule__GraphicRootURI__Group__2__Impl : ( ( rule__GraphicRootURI__URIAssignment_2 ) ) ;
    public final void rule__GraphicRootURI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2580:1: ( ( ( rule__GraphicRootURI__URIAssignment_2 ) ) )
            // InternalGraphicParser.g:2581:1: ( ( rule__GraphicRootURI__URIAssignment_2 ) )
            {
            // InternalGraphicParser.g:2581:1: ( ( rule__GraphicRootURI__URIAssignment_2 ) )
            // InternalGraphicParser.g:2582:2: ( rule__GraphicRootURI__URIAssignment_2 )
            {
             before(grammarAccess.getGraphicRootURIAccess().getURIAssignment_2()); 
            // InternalGraphicParser.g:2583:2: ( rule__GraphicRootURI__URIAssignment_2 )
            // InternalGraphicParser.g:2583:3: rule__GraphicRootURI__URIAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootURI__URIAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootURIAccess().getURIAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootURI__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClasses__Group__0"
    // InternalGraphicParser.g:2592:1: rule__GraphicRootClasses__Group__0 : rule__GraphicRootClasses__Group__0__Impl rule__GraphicRootClasses__Group__1 ;
    public final void rule__GraphicRootClasses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2596:1: ( rule__GraphicRootClasses__Group__0__Impl rule__GraphicRootClasses__Group__1 )
            // InternalGraphicParser.g:2597:2: rule__GraphicRootClasses__Group__0__Impl rule__GraphicRootClasses__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GraphicRootClasses__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group__0"


    // $ANTLR start "rule__GraphicRootClasses__Group__0__Impl"
    // InternalGraphicParser.g:2604:1: rule__GraphicRootClasses__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRootClasses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2608:1: ( ( () ) )
            // InternalGraphicParser.g:2609:1: ( () )
            {
            // InternalGraphicParser.g:2609:1: ( () )
            // InternalGraphicParser.g:2610:2: ()
            {
             before(grammarAccess.getGraphicRootClassesAccess().getGraphicRootClassesAction_0()); 
            // InternalGraphicParser.g:2611:2: ()
            // InternalGraphicParser.g:2611:3: 
            {
            }

             after(grammarAccess.getGraphicRootClassesAccess().getGraphicRootClassesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClasses__Group__1"
    // InternalGraphicParser.g:2619:1: rule__GraphicRootClasses__Group__1 : rule__GraphicRootClasses__Group__1__Impl rule__GraphicRootClasses__Group__2 ;
    public final void rule__GraphicRootClasses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2623:1: ( rule__GraphicRootClasses__Group__1__Impl rule__GraphicRootClasses__Group__2 )
            // InternalGraphicParser.g:2624:2: rule__GraphicRootClasses__Group__1__Impl rule__GraphicRootClasses__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClasses__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group__1"


    // $ANTLR start "rule__GraphicRootClasses__Group__1__Impl"
    // InternalGraphicParser.g:2631:1: rule__GraphicRootClasses__Group__1__Impl : ( Classes ) ;
    public final void rule__GraphicRootClasses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2635:1: ( ( Classes ) )
            // InternalGraphicParser.g:2636:1: ( Classes )
            {
            // InternalGraphicParser.g:2636:1: ( Classes )
            // InternalGraphicParser.g:2637:2: Classes
            {
             before(grammarAccess.getGraphicRootClassesAccess().getClassesKeyword_1()); 
            match(input,Classes,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesAccess().getClassesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClasses__Group__2"
    // InternalGraphicParser.g:2646:1: rule__GraphicRootClasses__Group__2 : rule__GraphicRootClasses__Group__2__Impl rule__GraphicRootClasses__Group__3 ;
    public final void rule__GraphicRootClasses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2650:1: ( rule__GraphicRootClasses__Group__2__Impl rule__GraphicRootClasses__Group__3 )
            // InternalGraphicParser.g:2651:2: rule__GraphicRootClasses__Group__2__Impl rule__GraphicRootClasses__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__GraphicRootClasses__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group__2"


    // $ANTLR start "rule__GraphicRootClasses__Group__2__Impl"
    // InternalGraphicParser.g:2658:1: rule__GraphicRootClasses__Group__2__Impl : ( Colon ) ;
    public final void rule__GraphicRootClasses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2662:1: ( ( Colon ) )
            // InternalGraphicParser.g:2663:1: ( Colon )
            {
            // InternalGraphicParser.g:2663:1: ( Colon )
            // InternalGraphicParser.g:2664:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClasses__Group__3"
    // InternalGraphicParser.g:2673:1: rule__GraphicRootClasses__Group__3 : rule__GraphicRootClasses__Group__3__Impl rule__GraphicRootClasses__Group__4 ;
    public final void rule__GraphicRootClasses__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2677:1: ( rule__GraphicRootClasses__Group__3__Impl rule__GraphicRootClasses__Group__4 )
            // InternalGraphicParser.g:2678:2: rule__GraphicRootClasses__Group__3__Impl rule__GraphicRootClasses__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__GraphicRootClasses__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group__3"


    // $ANTLR start "rule__GraphicRootClasses__Group__3__Impl"
    // InternalGraphicParser.g:2685:1: rule__GraphicRootClasses__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__GraphicRootClasses__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2689:1: ( ( LeftSquareBracket ) )
            // InternalGraphicParser.g:2690:1: ( LeftSquareBracket )
            {
            // InternalGraphicParser.g:2690:1: ( LeftSquareBracket )
            // InternalGraphicParser.g:2691:2: LeftSquareBracket
            {
             before(grammarAccess.getGraphicRootClassesAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group__3__Impl"


    // $ANTLR start "rule__GraphicRootClasses__Group__4"
    // InternalGraphicParser.g:2700:1: rule__GraphicRootClasses__Group__4 : rule__GraphicRootClasses__Group__4__Impl rule__GraphicRootClasses__Group__5 ;
    public final void rule__GraphicRootClasses__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2704:1: ( rule__GraphicRootClasses__Group__4__Impl rule__GraphicRootClasses__Group__5 )
            // InternalGraphicParser.g:2705:2: rule__GraphicRootClasses__Group__4__Impl rule__GraphicRootClasses__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__GraphicRootClasses__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group__4"


    // $ANTLR start "rule__GraphicRootClasses__Group__4__Impl"
    // InternalGraphicParser.g:2712:1: rule__GraphicRootClasses__Group__4__Impl : ( ( rule__GraphicRootClasses__Group_4__0 )? ) ;
    public final void rule__GraphicRootClasses__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2716:1: ( ( ( rule__GraphicRootClasses__Group_4__0 )? ) )
            // InternalGraphicParser.g:2717:1: ( ( rule__GraphicRootClasses__Group_4__0 )? )
            {
            // InternalGraphicParser.g:2717:1: ( ( rule__GraphicRootClasses__Group_4__0 )? )
            // InternalGraphicParser.g:2718:2: ( rule__GraphicRootClasses__Group_4__0 )?
            {
             before(grammarAccess.getGraphicRootClassesAccess().getGroup_4()); 
            // InternalGraphicParser.g:2719:2: ( rule__GraphicRootClasses__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftCurlyBracket) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphicParser.g:2719:3: rule__GraphicRootClasses__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphicRootClasses__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphicRootClassesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group__4__Impl"


    // $ANTLR start "rule__GraphicRootClasses__Group__5"
    // InternalGraphicParser.g:2727:1: rule__GraphicRootClasses__Group__5 : rule__GraphicRootClasses__Group__5__Impl ;
    public final void rule__GraphicRootClasses__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2731:1: ( rule__GraphicRootClasses__Group__5__Impl )
            // InternalGraphicParser.g:2732:2: rule__GraphicRootClasses__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group__5"


    // $ANTLR start "rule__GraphicRootClasses__Group__5__Impl"
    // InternalGraphicParser.g:2738:1: rule__GraphicRootClasses__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__GraphicRootClasses__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2742:1: ( ( RightSquareBracket ) )
            // InternalGraphicParser.g:2743:1: ( RightSquareBracket )
            {
            // InternalGraphicParser.g:2743:1: ( RightSquareBracket )
            // InternalGraphicParser.g:2744:2: RightSquareBracket
            {
             before(grammarAccess.getGraphicRootClassesAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group__5__Impl"


    // $ANTLR start "rule__GraphicRootClasses__Group_4__0"
    // InternalGraphicParser.g:2754:1: rule__GraphicRootClasses__Group_4__0 : rule__GraphicRootClasses__Group_4__0__Impl rule__GraphicRootClasses__Group_4__1 ;
    public final void rule__GraphicRootClasses__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2758:1: ( rule__GraphicRootClasses__Group_4__0__Impl rule__GraphicRootClasses__Group_4__1 )
            // InternalGraphicParser.g:2759:2: rule__GraphicRootClasses__Group_4__0__Impl rule__GraphicRootClasses__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__GraphicRootClasses__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group_4__0"


    // $ANTLR start "rule__GraphicRootClasses__Group_4__0__Impl"
    // InternalGraphicParser.g:2766:1: rule__GraphicRootClasses__Group_4__0__Impl : ( ( rule__GraphicRootClasses__ClassesAssignment_4_0 ) ) ;
    public final void rule__GraphicRootClasses__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2770:1: ( ( ( rule__GraphicRootClasses__ClassesAssignment_4_0 ) ) )
            // InternalGraphicParser.g:2771:1: ( ( rule__GraphicRootClasses__ClassesAssignment_4_0 ) )
            {
            // InternalGraphicParser.g:2771:1: ( ( rule__GraphicRootClasses__ClassesAssignment_4_0 ) )
            // InternalGraphicParser.g:2772:2: ( rule__GraphicRootClasses__ClassesAssignment_4_0 )
            {
             before(grammarAccess.getGraphicRootClassesAccess().getClassesAssignment_4_0()); 
            // InternalGraphicParser.g:2773:2: ( rule__GraphicRootClasses__ClassesAssignment_4_0 )
            // InternalGraphicParser.g:2773:3: rule__GraphicRootClasses__ClassesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__ClassesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesAccess().getClassesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group_4__0__Impl"


    // $ANTLR start "rule__GraphicRootClasses__Group_4__1"
    // InternalGraphicParser.g:2781:1: rule__GraphicRootClasses__Group_4__1 : rule__GraphicRootClasses__Group_4__1__Impl ;
    public final void rule__GraphicRootClasses__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2785:1: ( rule__GraphicRootClasses__Group_4__1__Impl )
            // InternalGraphicParser.g:2786:2: rule__GraphicRootClasses__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group_4__1"


    // $ANTLR start "rule__GraphicRootClasses__Group_4__1__Impl"
    // InternalGraphicParser.g:2792:1: rule__GraphicRootClasses__Group_4__1__Impl : ( ( rule__GraphicRootClasses__Group_4_1__0 )* ) ;
    public final void rule__GraphicRootClasses__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2796:1: ( ( ( rule__GraphicRootClasses__Group_4_1__0 )* ) )
            // InternalGraphicParser.g:2797:1: ( ( rule__GraphicRootClasses__Group_4_1__0 )* )
            {
            // InternalGraphicParser.g:2797:1: ( ( rule__GraphicRootClasses__Group_4_1__0 )* )
            // InternalGraphicParser.g:2798:2: ( rule__GraphicRootClasses__Group_4_1__0 )*
            {
             before(grammarAccess.getGraphicRootClassesAccess().getGroup_4_1()); 
            // InternalGraphicParser.g:2799:2: ( rule__GraphicRootClasses__Group_4_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGraphicParser.g:2799:3: rule__GraphicRootClasses__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GraphicRootClasses__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getGraphicRootClassesAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group_4__1__Impl"


    // $ANTLR start "rule__GraphicRootClasses__Group_4_1__0"
    // InternalGraphicParser.g:2808:1: rule__GraphicRootClasses__Group_4_1__0 : rule__GraphicRootClasses__Group_4_1__0__Impl rule__GraphicRootClasses__Group_4_1__1 ;
    public final void rule__GraphicRootClasses__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2812:1: ( rule__GraphicRootClasses__Group_4_1__0__Impl rule__GraphicRootClasses__Group_4_1__1 )
            // InternalGraphicParser.g:2813:2: rule__GraphicRootClasses__Group_4_1__0__Impl rule__GraphicRootClasses__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphicRootClasses__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group_4_1__0"


    // $ANTLR start "rule__GraphicRootClasses__Group_4_1__0__Impl"
    // InternalGraphicParser.g:2820:1: rule__GraphicRootClasses__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__GraphicRootClasses__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2824:1: ( ( Comma ) )
            // InternalGraphicParser.g:2825:1: ( Comma )
            {
            // InternalGraphicParser.g:2825:1: ( Comma )
            // InternalGraphicParser.g:2826:2: Comma
            {
             before(grammarAccess.getGraphicRootClassesAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group_4_1__0__Impl"


    // $ANTLR start "rule__GraphicRootClasses__Group_4_1__1"
    // InternalGraphicParser.g:2835:1: rule__GraphicRootClasses__Group_4_1__1 : rule__GraphicRootClasses__Group_4_1__1__Impl ;
    public final void rule__GraphicRootClasses__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2839:1: ( rule__GraphicRootClasses__Group_4_1__1__Impl )
            // InternalGraphicParser.g:2840:2: rule__GraphicRootClasses__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group_4_1__1"


    // $ANTLR start "rule__GraphicRootClasses__Group_4_1__1__Impl"
    // InternalGraphicParser.g:2846:1: rule__GraphicRootClasses__Group_4_1__1__Impl : ( ( rule__GraphicRootClasses__ClassesAssignment_4_1_1 ) ) ;
    public final void rule__GraphicRootClasses__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2850:1: ( ( ( rule__GraphicRootClasses__ClassesAssignment_4_1_1 ) ) )
            // InternalGraphicParser.g:2851:1: ( ( rule__GraphicRootClasses__ClassesAssignment_4_1_1 ) )
            {
            // InternalGraphicParser.g:2851:1: ( ( rule__GraphicRootClasses__ClassesAssignment_4_1_1 ) )
            // InternalGraphicParser.g:2852:2: ( rule__GraphicRootClasses__ClassesAssignment_4_1_1 )
            {
             before(grammarAccess.getGraphicRootClassesAccess().getClassesAssignment_4_1_1()); 
            // InternalGraphicParser.g:2853:2: ( rule__GraphicRootClasses__ClassesAssignment_4_1_1 )
            // InternalGraphicParser.g:2853:3: rule__GraphicRootClasses__ClassesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClasses__ClassesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesAccess().getClassesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__Group_4_1__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItems__Group__0"
    // InternalGraphicParser.g:2862:1: rule__GraphicRootClassesItems__Group__0 : rule__GraphicRootClassesItems__Group__0__Impl rule__GraphicRootClassesItems__Group__1 ;
    public final void rule__GraphicRootClassesItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2866:1: ( rule__GraphicRootClassesItems__Group__0__Impl rule__GraphicRootClassesItems__Group__1 )
            // InternalGraphicParser.g:2867:2: rule__GraphicRootClassesItems__Group__0__Impl rule__GraphicRootClassesItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphicRootClassesItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItems__Group__0__Impl"
    // InternalGraphicParser.g:2874:1: rule__GraphicRootClassesItems__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRootClassesItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2878:1: ( ( () ) )
            // InternalGraphicParser.g:2879:1: ( () )
            {
            // InternalGraphicParser.g:2879:1: ( () )
            // InternalGraphicParser.g:2880:2: ()
            {
             before(grammarAccess.getGraphicRootClassesItemsAccess().getGraphicRootClassesItemsAction_0()); 
            // InternalGraphicParser.g:2881:2: ()
            // InternalGraphicParser.g:2881:3: 
            {
            }

             after(grammarAccess.getGraphicRootClassesItemsAccess().getGraphicRootClassesItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItems__Group__1"
    // InternalGraphicParser.g:2889:1: rule__GraphicRootClassesItems__Group__1 : rule__GraphicRootClassesItems__Group__1__Impl rule__GraphicRootClassesItems__Group__2 ;
    public final void rule__GraphicRootClassesItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2893:1: ( rule__GraphicRootClassesItems__Group__1__Impl rule__GraphicRootClassesItems__Group__2 )
            // InternalGraphicParser.g:2894:2: rule__GraphicRootClassesItems__Group__1__Impl rule__GraphicRootClassesItems__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__GraphicRootClassesItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItems__Group__1__Impl"
    // InternalGraphicParser.g:2901:1: rule__GraphicRootClassesItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__GraphicRootClassesItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2905:1: ( ( LeftCurlyBracket ) )
            // InternalGraphicParser.g:2906:1: ( LeftCurlyBracket )
            {
            // InternalGraphicParser.g:2906:1: ( LeftCurlyBracket )
            // InternalGraphicParser.g:2907:2: LeftCurlyBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItems__Group__2"
    // InternalGraphicParser.g:2916:1: rule__GraphicRootClassesItems__Group__2 : rule__GraphicRootClassesItems__Group__2__Impl rule__GraphicRootClassesItems__Group__3 ;
    public final void rule__GraphicRootClassesItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2920:1: ( rule__GraphicRootClassesItems__Group__2__Impl rule__GraphicRootClassesItems__Group__3 )
            // InternalGraphicParser.g:2921:2: rule__GraphicRootClassesItems__Group__2__Impl rule__GraphicRootClassesItems__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__GraphicRootClassesItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItems__Group__2__Impl"
    // InternalGraphicParser.g:2928:1: rule__GraphicRootClassesItems__Group__2__Impl : ( ( rule__GraphicRootClassesItems__Group_2__0 )? ) ;
    public final void rule__GraphicRootClassesItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2932:1: ( ( ( rule__GraphicRootClassesItems__Group_2__0 )? ) )
            // InternalGraphicParser.g:2933:1: ( ( rule__GraphicRootClassesItems__Group_2__0 )? )
            {
            // InternalGraphicParser.g:2933:1: ( ( rule__GraphicRootClassesItems__Group_2__0 )? )
            // InternalGraphicParser.g:2934:2: ( rule__GraphicRootClassesItems__Group_2__0 )?
            {
             before(grammarAccess.getGraphicRootClassesItemsAccess().getGroup_2()); 
            // InternalGraphicParser.g:2935:2: ( rule__GraphicRootClassesItems__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==MaterialAttributes||LA15_0==ShowAttributes||(LA15_0>=Connections && LA15_0<=Constraints)||LA15_0==Versions||LA15_0==Vname||LA15_0==Name) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGraphicParser.g:2935:3: rule__GraphicRootClassesItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphicRootClassesItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphicRootClassesItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItems__Group__3"
    // InternalGraphicParser.g:2943:1: rule__GraphicRootClassesItems__Group__3 : rule__GraphicRootClassesItems__Group__3__Impl ;
    public final void rule__GraphicRootClassesItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2947:1: ( rule__GraphicRootClassesItems__Group__3__Impl )
            // InternalGraphicParser.g:2948:2: rule__GraphicRootClassesItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group__3"


    // $ANTLR start "rule__GraphicRootClassesItems__Group__3__Impl"
    // InternalGraphicParser.g:2954:1: rule__GraphicRootClassesItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__GraphicRootClassesItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2958:1: ( ( RightCurlyBracket ) )
            // InternalGraphicParser.g:2959:1: ( RightCurlyBracket )
            {
            // InternalGraphicParser.g:2959:1: ( RightCurlyBracket )
            // InternalGraphicParser.g:2960:2: RightCurlyBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group__3__Impl"


    // $ANTLR start "rule__GraphicRootClassesItems__Group_2__0"
    // InternalGraphicParser.g:2970:1: rule__GraphicRootClassesItems__Group_2__0 : rule__GraphicRootClassesItems__Group_2__0__Impl rule__GraphicRootClassesItems__Group_2__1 ;
    public final void rule__GraphicRootClassesItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2974:1: ( rule__GraphicRootClassesItems__Group_2__0__Impl rule__GraphicRootClassesItems__Group_2__1 )
            // InternalGraphicParser.g:2975:2: rule__GraphicRootClassesItems__Group_2__0__Impl rule__GraphicRootClassesItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GraphicRootClassesItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItems__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group_2__0"


    // $ANTLR start "rule__GraphicRootClassesItems__Group_2__0__Impl"
    // InternalGraphicParser.g:2982:1: rule__GraphicRootClassesItems__Group_2__0__Impl : ( ( rule__GraphicRootClassesItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__GraphicRootClassesItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:2986:1: ( ( ( rule__GraphicRootClassesItems__ItemsAssignment_2_0 ) ) )
            // InternalGraphicParser.g:2987:1: ( ( rule__GraphicRootClassesItems__ItemsAssignment_2_0 ) )
            {
            // InternalGraphicParser.g:2987:1: ( ( rule__GraphicRootClassesItems__ItemsAssignment_2_0 ) )
            // InternalGraphicParser.g:2988:2: ( rule__GraphicRootClassesItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsAccess().getItemsAssignment_2_0()); 
            // InternalGraphicParser.g:2989:2: ( rule__GraphicRootClassesItems__ItemsAssignment_2_0 )
            // InternalGraphicParser.g:2989:3: rule__GraphicRootClassesItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group_2__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItems__Group_2__1"
    // InternalGraphicParser.g:2997:1: rule__GraphicRootClassesItems__Group_2__1 : rule__GraphicRootClassesItems__Group_2__1__Impl ;
    public final void rule__GraphicRootClassesItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3001:1: ( rule__GraphicRootClassesItems__Group_2__1__Impl )
            // InternalGraphicParser.g:3002:2: rule__GraphicRootClassesItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItems__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group_2__1"


    // $ANTLR start "rule__GraphicRootClassesItems__Group_2__1__Impl"
    // InternalGraphicParser.g:3008:1: rule__GraphicRootClassesItems__Group_2__1__Impl : ( ( rule__GraphicRootClassesItems__Group_2_1__0 )* ) ;
    public final void rule__GraphicRootClassesItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3012:1: ( ( ( rule__GraphicRootClassesItems__Group_2_1__0 )* ) )
            // InternalGraphicParser.g:3013:1: ( ( rule__GraphicRootClassesItems__Group_2_1__0 )* )
            {
            // InternalGraphicParser.g:3013:1: ( ( rule__GraphicRootClassesItems__Group_2_1__0 )* )
            // InternalGraphicParser.g:3014:2: ( rule__GraphicRootClassesItems__Group_2_1__0 )*
            {
             before(grammarAccess.getGraphicRootClassesItemsAccess().getGroup_2_1()); 
            // InternalGraphicParser.g:3015:2: ( rule__GraphicRootClassesItems__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGraphicParser.g:3015:3: rule__GraphicRootClassesItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GraphicRootClassesItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getGraphicRootClassesItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group_2__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItems__Group_2_1__0"
    // InternalGraphicParser.g:3024:1: rule__GraphicRootClassesItems__Group_2_1__0 : rule__GraphicRootClassesItems__Group_2_1__0__Impl rule__GraphicRootClassesItems__Group_2_1__1 ;
    public final void rule__GraphicRootClassesItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3028:1: ( rule__GraphicRootClassesItems__Group_2_1__0__Impl rule__GraphicRootClassesItems__Group_2_1__1 )
            // InternalGraphicParser.g:3029:2: rule__GraphicRootClassesItems__Group_2_1__0__Impl rule__GraphicRootClassesItems__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__GraphicRootClassesItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItems__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group_2_1__0"


    // $ANTLR start "rule__GraphicRootClassesItems__Group_2_1__0__Impl"
    // InternalGraphicParser.g:3036:1: rule__GraphicRootClassesItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__GraphicRootClassesItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3040:1: ( ( Comma ) )
            // InternalGraphicParser.g:3041:1: ( Comma )
            {
            // InternalGraphicParser.g:3041:1: ( Comma )
            // InternalGraphicParser.g:3042:2: Comma
            {
             before(grammarAccess.getGraphicRootClassesItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItems__Group_2_1__1"
    // InternalGraphicParser.g:3051:1: rule__GraphicRootClassesItems__Group_2_1__1 : rule__GraphicRootClassesItems__Group_2_1__1__Impl ;
    public final void rule__GraphicRootClassesItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3055:1: ( rule__GraphicRootClassesItems__Group_2_1__1__Impl )
            // InternalGraphicParser.g:3056:2: rule__GraphicRootClassesItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItems__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group_2_1__1"


    // $ANTLR start "rule__GraphicRootClassesItems__Group_2_1__1__Impl"
    // InternalGraphicParser.g:3062:1: rule__GraphicRootClassesItems__Group_2_1__1__Impl : ( ( rule__GraphicRootClassesItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__GraphicRootClassesItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3066:1: ( ( ( rule__GraphicRootClassesItems__ItemsAssignment_2_1_1 ) ) )
            // InternalGraphicParser.g:3067:1: ( ( rule__GraphicRootClassesItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalGraphicParser.g:3067:1: ( ( rule__GraphicRootClassesItems__ItemsAssignment_2_1_1 ) )
            // InternalGraphicParser.g:3068:2: ( rule__GraphicRootClassesItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getGraphicRootClassesItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalGraphicParser.g:3069:2: ( rule__GraphicRootClassesItems__ItemsAssignment_2_1_1 )
            // InternalGraphicParser.g:3069:3: rule__GraphicRootClassesItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsName__Group__0"
    // InternalGraphicParser.g:3078:1: rule__GraphicRootClassesItemsName__Group__0 : rule__GraphicRootClassesItemsName__Group__0__Impl rule__GraphicRootClassesItemsName__Group__1 ;
    public final void rule__GraphicRootClassesItemsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3082:1: ( rule__GraphicRootClassesItemsName__Group__0__Impl rule__GraphicRootClassesItemsName__Group__1 )
            // InternalGraphicParser.g:3083:2: rule__GraphicRootClassesItemsName__Group__0__Impl rule__GraphicRootClassesItemsName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__GraphicRootClassesItemsName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsName__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsName__Group__0__Impl"
    // InternalGraphicParser.g:3090:1: rule__GraphicRootClassesItemsName__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRootClassesItemsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3094:1: ( ( () ) )
            // InternalGraphicParser.g:3095:1: ( () )
            {
            // InternalGraphicParser.g:3095:1: ( () )
            // InternalGraphicParser.g:3096:2: ()
            {
             before(grammarAccess.getGraphicRootClassesItemsNameAccess().getGraphicRootClassesItemsNameAction_0()); 
            // InternalGraphicParser.g:3097:2: ()
            // InternalGraphicParser.g:3097:3: 
            {
            }

             after(grammarAccess.getGraphicRootClassesItemsNameAccess().getGraphicRootClassesItemsNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsName__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsName__Group__1"
    // InternalGraphicParser.g:3105:1: rule__GraphicRootClassesItemsName__Group__1 : rule__GraphicRootClassesItemsName__Group__1__Impl rule__GraphicRootClassesItemsName__Group__2 ;
    public final void rule__GraphicRootClassesItemsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3109:1: ( rule__GraphicRootClassesItemsName__Group__1__Impl rule__GraphicRootClassesItemsName__Group__2 )
            // InternalGraphicParser.g:3110:2: rule__GraphicRootClassesItemsName__Group__1__Impl rule__GraphicRootClassesItemsName__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsName__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsName__Group__1__Impl"
    // InternalGraphicParser.g:3117:1: rule__GraphicRootClassesItemsName__Group__1__Impl : ( Name ) ;
    public final void rule__GraphicRootClassesItemsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3121:1: ( ( Name ) )
            // InternalGraphicParser.g:3122:1: ( Name )
            {
            // InternalGraphicParser.g:3122:1: ( Name )
            // InternalGraphicParser.g:3123:2: Name
            {
             before(grammarAccess.getGraphicRootClassesItemsNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsName__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsName__Group__2"
    // InternalGraphicParser.g:3132:1: rule__GraphicRootClassesItemsName__Group__2 : rule__GraphicRootClassesItemsName__Group__2__Impl rule__GraphicRootClassesItemsName__Group__3 ;
    public final void rule__GraphicRootClassesItemsName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3136:1: ( rule__GraphicRootClassesItemsName__Group__2__Impl rule__GraphicRootClassesItemsName__Group__3 )
            // InternalGraphicParser.g:3137:2: rule__GraphicRootClassesItemsName__Group__2__Impl rule__GraphicRootClassesItemsName__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsName__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsName__Group__2__Impl"
    // InternalGraphicParser.g:3144:1: rule__GraphicRootClassesItemsName__Group__2__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3148:1: ( ( Colon ) )
            // InternalGraphicParser.g:3149:1: ( Colon )
            {
            // InternalGraphicParser.g:3149:1: ( Colon )
            // InternalGraphicParser.g:3150:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsName__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsName__Group__3"
    // InternalGraphicParser.g:3159:1: rule__GraphicRootClassesItemsName__Group__3 : rule__GraphicRootClassesItemsName__Group__3__Impl ;
    public final void rule__GraphicRootClassesItemsName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3163:1: ( rule__GraphicRootClassesItemsName__Group__3__Impl )
            // InternalGraphicParser.g:3164:2: rule__GraphicRootClassesItemsName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsName__Group__3"


    // $ANTLR start "rule__GraphicRootClassesItemsName__Group__3__Impl"
    // InternalGraphicParser.g:3170:1: rule__GraphicRootClassesItemsName__Group__3__Impl : ( ( rule__GraphicRootClassesItemsName__NameAssignment_3 ) ) ;
    public final void rule__GraphicRootClassesItemsName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3174:1: ( ( ( rule__GraphicRootClassesItemsName__NameAssignment_3 ) ) )
            // InternalGraphicParser.g:3175:1: ( ( rule__GraphicRootClassesItemsName__NameAssignment_3 ) )
            {
            // InternalGraphicParser.g:3175:1: ( ( rule__GraphicRootClassesItemsName__NameAssignment_3 ) )
            // InternalGraphicParser.g:3176:2: ( rule__GraphicRootClassesItemsName__NameAssignment_3 )
            {
             before(grammarAccess.getGraphicRootClassesItemsNameAccess().getNameAssignment_3()); 
            // InternalGraphicParser.g:3177:2: ( rule__GraphicRootClassesItemsName__NameAssignment_3 )
            // InternalGraphicParser.g:3177:3: rule__GraphicRootClassesItemsName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsName__Group__3__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group__0"
    // InternalGraphicParser.g:3186:1: rule__GraphicRootClassesItemsVersions__Group__0 : rule__GraphicRootClassesItemsVersions__Group__0__Impl rule__GraphicRootClassesItemsVersions__Group__1 ;
    public final void rule__GraphicRootClassesItemsVersions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3190:1: ( rule__GraphicRootClassesItemsVersions__Group__0__Impl rule__GraphicRootClassesItemsVersions__Group__1 )
            // InternalGraphicParser.g:3191:2: rule__GraphicRootClassesItemsVersions__Group__0__Impl rule__GraphicRootClassesItemsVersions__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__GraphicRootClassesItemsVersions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group__0__Impl"
    // InternalGraphicParser.g:3198:1: rule__GraphicRootClassesItemsVersions__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRootClassesItemsVersions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3202:1: ( ( () ) )
            // InternalGraphicParser.g:3203:1: ( () )
            {
            // InternalGraphicParser.g:3203:1: ( () )
            // InternalGraphicParser.g:3204:2: ()
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getGraphicRootClassesItemsVersionsAction_0()); 
            // InternalGraphicParser.g:3205:2: ()
            // InternalGraphicParser.g:3205:3: 
            {
            }

             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getGraphicRootClassesItemsVersionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group__1"
    // InternalGraphicParser.g:3213:1: rule__GraphicRootClassesItemsVersions__Group__1 : rule__GraphicRootClassesItemsVersions__Group__1__Impl rule__GraphicRootClassesItemsVersions__Group__2 ;
    public final void rule__GraphicRootClassesItemsVersions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3217:1: ( rule__GraphicRootClassesItemsVersions__Group__1__Impl rule__GraphicRootClassesItemsVersions__Group__2 )
            // InternalGraphicParser.g:3218:2: rule__GraphicRootClassesItemsVersions__Group__1__Impl rule__GraphicRootClassesItemsVersions__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsVersions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group__1__Impl"
    // InternalGraphicParser.g:3225:1: rule__GraphicRootClassesItemsVersions__Group__1__Impl : ( Versions ) ;
    public final void rule__GraphicRootClassesItemsVersions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3229:1: ( ( Versions ) )
            // InternalGraphicParser.g:3230:1: ( Versions )
            {
            // InternalGraphicParser.g:3230:1: ( Versions )
            // InternalGraphicParser.g:3231:2: Versions
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsKeyword_1()); 
            match(input,Versions,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group__2"
    // InternalGraphicParser.g:3240:1: rule__GraphicRootClassesItemsVersions__Group__2 : rule__GraphicRootClassesItemsVersions__Group__2__Impl rule__GraphicRootClassesItemsVersions__Group__3 ;
    public final void rule__GraphicRootClassesItemsVersions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3244:1: ( rule__GraphicRootClassesItemsVersions__Group__2__Impl rule__GraphicRootClassesItemsVersions__Group__3 )
            // InternalGraphicParser.g:3245:2: rule__GraphicRootClassesItemsVersions__Group__2__Impl rule__GraphicRootClassesItemsVersions__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__GraphicRootClassesItemsVersions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group__2__Impl"
    // InternalGraphicParser.g:3252:1: rule__GraphicRootClassesItemsVersions__Group__2__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsVersions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3256:1: ( ( Colon ) )
            // InternalGraphicParser.g:3257:1: ( Colon )
            {
            // InternalGraphicParser.g:3257:1: ( Colon )
            // InternalGraphicParser.g:3258:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group__3"
    // InternalGraphicParser.g:3267:1: rule__GraphicRootClassesItemsVersions__Group__3 : rule__GraphicRootClassesItemsVersions__Group__3__Impl rule__GraphicRootClassesItemsVersions__Group__4 ;
    public final void rule__GraphicRootClassesItemsVersions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3271:1: ( rule__GraphicRootClassesItemsVersions__Group__3__Impl rule__GraphicRootClassesItemsVersions__Group__4 )
            // InternalGraphicParser.g:3272:2: rule__GraphicRootClassesItemsVersions__Group__3__Impl rule__GraphicRootClassesItemsVersions__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__GraphicRootClassesItemsVersions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group__3"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group__3__Impl"
    // InternalGraphicParser.g:3279:1: rule__GraphicRootClassesItemsVersions__Group__3__Impl : ( LeftCurlyBracket ) ;
    public final void rule__GraphicRootClassesItemsVersions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3283:1: ( ( LeftCurlyBracket ) )
            // InternalGraphicParser.g:3284:1: ( LeftCurlyBracket )
            {
            // InternalGraphicParser.g:3284:1: ( LeftCurlyBracket )
            // InternalGraphicParser.g:3285:2: LeftCurlyBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group__3__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group__4"
    // InternalGraphicParser.g:3294:1: rule__GraphicRootClassesItemsVersions__Group__4 : rule__GraphicRootClassesItemsVersions__Group__4__Impl rule__GraphicRootClassesItemsVersions__Group__5 ;
    public final void rule__GraphicRootClassesItemsVersions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3298:1: ( rule__GraphicRootClassesItemsVersions__Group__4__Impl rule__GraphicRootClassesItemsVersions__Group__5 )
            // InternalGraphicParser.g:3299:2: rule__GraphicRootClassesItemsVersions__Group__4__Impl rule__GraphicRootClassesItemsVersions__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__GraphicRootClassesItemsVersions__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group__4"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group__4__Impl"
    // InternalGraphicParser.g:3306:1: rule__GraphicRootClassesItemsVersions__Group__4__Impl : ( ( rule__GraphicRootClassesItemsVersions__Group_4__0 )? ) ;
    public final void rule__GraphicRootClassesItemsVersions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3310:1: ( ( ( rule__GraphicRootClassesItemsVersions__Group_4__0 )? ) )
            // InternalGraphicParser.g:3311:1: ( ( rule__GraphicRootClassesItemsVersions__Group_4__0 )? )
            {
            // InternalGraphicParser.g:3311:1: ( ( rule__GraphicRootClassesItemsVersions__Group_4__0 )? )
            // InternalGraphicParser.g:3312:2: ( rule__GraphicRootClassesItemsVersions__Group_4__0 )?
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getGroup_4()); 
            // InternalGraphicParser.g:3313:2: ( rule__GraphicRootClassesItemsVersions__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=V1 && LA17_0<=V3)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGraphicParser.g:3313:3: rule__GraphicRootClassesItemsVersions__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphicRootClassesItemsVersions__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group__4__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group__5"
    // InternalGraphicParser.g:3321:1: rule__GraphicRootClassesItemsVersions__Group__5 : rule__GraphicRootClassesItemsVersions__Group__5__Impl ;
    public final void rule__GraphicRootClassesItemsVersions__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3325:1: ( rule__GraphicRootClassesItemsVersions__Group__5__Impl )
            // InternalGraphicParser.g:3326:2: rule__GraphicRootClassesItemsVersions__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group__5"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group__5__Impl"
    // InternalGraphicParser.g:3332:1: rule__GraphicRootClassesItemsVersions__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__GraphicRootClassesItemsVersions__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3336:1: ( ( RightCurlyBracket ) )
            // InternalGraphicParser.g:3337:1: ( RightCurlyBracket )
            {
            // InternalGraphicParser.g:3337:1: ( RightCurlyBracket )
            // InternalGraphicParser.g:3338:2: RightCurlyBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group__5__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group_4__0"
    // InternalGraphicParser.g:3348:1: rule__GraphicRootClassesItemsVersions__Group_4__0 : rule__GraphicRootClassesItemsVersions__Group_4__0__Impl rule__GraphicRootClassesItemsVersions__Group_4__1 ;
    public final void rule__GraphicRootClassesItemsVersions__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3352:1: ( rule__GraphicRootClassesItemsVersions__Group_4__0__Impl rule__GraphicRootClassesItemsVersions__Group_4__1 )
            // InternalGraphicParser.g:3353:2: rule__GraphicRootClassesItemsVersions__Group_4__0__Impl rule__GraphicRootClassesItemsVersions__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__GraphicRootClassesItemsVersions__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group_4__0"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group_4__0__Impl"
    // InternalGraphicParser.g:3360:1: rule__GraphicRootClassesItemsVersions__Group_4__0__Impl : ( ( rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_0 ) ) ;
    public final void rule__GraphicRootClassesItemsVersions__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3364:1: ( ( ( rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_0 ) ) )
            // InternalGraphicParser.g:3365:1: ( ( rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_0 ) )
            {
            // InternalGraphicParser.g:3365:1: ( ( rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_0 ) )
            // InternalGraphicParser.g:3366:2: ( rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsAssignment_4_0()); 
            // InternalGraphicParser.g:3367:2: ( rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_0 )
            // InternalGraphicParser.g:3367:3: rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group_4__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group_4__1"
    // InternalGraphicParser.g:3375:1: rule__GraphicRootClassesItemsVersions__Group_4__1 : rule__GraphicRootClassesItemsVersions__Group_4__1__Impl ;
    public final void rule__GraphicRootClassesItemsVersions__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3379:1: ( rule__GraphicRootClassesItemsVersions__Group_4__1__Impl )
            // InternalGraphicParser.g:3380:2: rule__GraphicRootClassesItemsVersions__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group_4__1"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group_4__1__Impl"
    // InternalGraphicParser.g:3386:1: rule__GraphicRootClassesItemsVersions__Group_4__1__Impl : ( ( rule__GraphicRootClassesItemsVersions__Group_4_1__0 )* ) ;
    public final void rule__GraphicRootClassesItemsVersions__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3390:1: ( ( ( rule__GraphicRootClassesItemsVersions__Group_4_1__0 )* ) )
            // InternalGraphicParser.g:3391:1: ( ( rule__GraphicRootClassesItemsVersions__Group_4_1__0 )* )
            {
            // InternalGraphicParser.g:3391:1: ( ( rule__GraphicRootClassesItemsVersions__Group_4_1__0 )* )
            // InternalGraphicParser.g:3392:2: ( rule__GraphicRootClassesItemsVersions__Group_4_1__0 )*
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getGroup_4_1()); 
            // InternalGraphicParser.g:3393:2: ( rule__GraphicRootClassesItemsVersions__Group_4_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Comma) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGraphicParser.g:3393:3: rule__GraphicRootClassesItemsVersions__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GraphicRootClassesItemsVersions__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group_4__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group_4_1__0"
    // InternalGraphicParser.g:3402:1: rule__GraphicRootClassesItemsVersions__Group_4_1__0 : rule__GraphicRootClassesItemsVersions__Group_4_1__0__Impl rule__GraphicRootClassesItemsVersions__Group_4_1__1 ;
    public final void rule__GraphicRootClassesItemsVersions__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3406:1: ( rule__GraphicRootClassesItemsVersions__Group_4_1__0__Impl rule__GraphicRootClassesItemsVersions__Group_4_1__1 )
            // InternalGraphicParser.g:3407:2: rule__GraphicRootClassesItemsVersions__Group_4_1__0__Impl rule__GraphicRootClassesItemsVersions__Group_4_1__1
            {
            pushFollow(FOLLOW_17);
            rule__GraphicRootClassesItemsVersions__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group_4_1__0"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group_4_1__0__Impl"
    // InternalGraphicParser.g:3414:1: rule__GraphicRootClassesItemsVersions__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__GraphicRootClassesItemsVersions__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3418:1: ( ( Comma ) )
            // InternalGraphicParser.g:3419:1: ( Comma )
            {
            // InternalGraphicParser.g:3419:1: ( Comma )
            // InternalGraphicParser.g:3420:2: Comma
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group_4_1__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group_4_1__1"
    // InternalGraphicParser.g:3429:1: rule__GraphicRootClassesItemsVersions__Group_4_1__1 : rule__GraphicRootClassesItemsVersions__Group_4_1__1__Impl ;
    public final void rule__GraphicRootClassesItemsVersions__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3433:1: ( rule__GraphicRootClassesItemsVersions__Group_4_1__1__Impl )
            // InternalGraphicParser.g:3434:2: rule__GraphicRootClassesItemsVersions__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group_4_1__1"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__Group_4_1__1__Impl"
    // InternalGraphicParser.g:3440:1: rule__GraphicRootClassesItemsVersions__Group_4_1__1__Impl : ( ( rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_1_1 ) ) ;
    public final void rule__GraphicRootClassesItemsVersions__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3444:1: ( ( ( rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_1_1 ) ) )
            // InternalGraphicParser.g:3445:1: ( ( rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_1_1 ) )
            {
            // InternalGraphicParser.g:3445:1: ( ( rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_1_1 ) )
            // InternalGraphicParser.g:3446:2: ( rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_1_1 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsAssignment_4_1_1()); 
            // InternalGraphicParser.g:3447:2: ( rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_1_1 )
            // InternalGraphicParser.g:3447:3: rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__Group_4_1__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group__0"
    // InternalGraphicParser.g:3456:1: rule__GraphicRootClassesItemsVname__Group__0 : rule__GraphicRootClassesItemsVname__Group__0__Impl rule__GraphicRootClassesItemsVname__Group__1 ;
    public final void rule__GraphicRootClassesItemsVname__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3460:1: ( rule__GraphicRootClassesItemsVname__Group__0__Impl rule__GraphicRootClassesItemsVname__Group__1 )
            // InternalGraphicParser.g:3461:2: rule__GraphicRootClassesItemsVname__Group__0__Impl rule__GraphicRootClassesItemsVname__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__GraphicRootClassesItemsVname__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group__0__Impl"
    // InternalGraphicParser.g:3468:1: rule__GraphicRootClassesItemsVname__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRootClassesItemsVname__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3472:1: ( ( () ) )
            // InternalGraphicParser.g:3473:1: ( () )
            {
            // InternalGraphicParser.g:3473:1: ( () )
            // InternalGraphicParser.g:3474:2: ()
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getGraphicRootClassesItemsVnameAction_0()); 
            // InternalGraphicParser.g:3475:2: ()
            // InternalGraphicParser.g:3475:3: 
            {
            }

             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getGraphicRootClassesItemsVnameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group__1"
    // InternalGraphicParser.g:3483:1: rule__GraphicRootClassesItemsVname__Group__1 : rule__GraphicRootClassesItemsVname__Group__1__Impl rule__GraphicRootClassesItemsVname__Group__2 ;
    public final void rule__GraphicRootClassesItemsVname__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3487:1: ( rule__GraphicRootClassesItemsVname__Group__1__Impl rule__GraphicRootClassesItemsVname__Group__2 )
            // InternalGraphicParser.g:3488:2: rule__GraphicRootClassesItemsVname__Group__1__Impl rule__GraphicRootClassesItemsVname__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsVname__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group__1__Impl"
    // InternalGraphicParser.g:3495:1: rule__GraphicRootClassesItemsVname__Group__1__Impl : ( Vname ) ;
    public final void rule__GraphicRootClassesItemsVname__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3499:1: ( ( Vname ) )
            // InternalGraphicParser.g:3500:1: ( Vname )
            {
            // InternalGraphicParser.g:3500:1: ( Vname )
            // InternalGraphicParser.g:3501:2: Vname
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameKeyword_1()); 
            match(input,Vname,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group__2"
    // InternalGraphicParser.g:3510:1: rule__GraphicRootClassesItemsVname__Group__2 : rule__GraphicRootClassesItemsVname__Group__2__Impl rule__GraphicRootClassesItemsVname__Group__3 ;
    public final void rule__GraphicRootClassesItemsVname__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3514:1: ( rule__GraphicRootClassesItemsVname__Group__2__Impl rule__GraphicRootClassesItemsVname__Group__3 )
            // InternalGraphicParser.g:3515:2: rule__GraphicRootClassesItemsVname__Group__2__Impl rule__GraphicRootClassesItemsVname__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__GraphicRootClassesItemsVname__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group__2__Impl"
    // InternalGraphicParser.g:3522:1: rule__GraphicRootClassesItemsVname__Group__2__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsVname__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3526:1: ( ( Colon ) )
            // InternalGraphicParser.g:3527:1: ( Colon )
            {
            // InternalGraphicParser.g:3527:1: ( Colon )
            // InternalGraphicParser.g:3528:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group__3"
    // InternalGraphicParser.g:3537:1: rule__GraphicRootClassesItemsVname__Group__3 : rule__GraphicRootClassesItemsVname__Group__3__Impl rule__GraphicRootClassesItemsVname__Group__4 ;
    public final void rule__GraphicRootClassesItemsVname__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3541:1: ( rule__GraphicRootClassesItemsVname__Group__3__Impl rule__GraphicRootClassesItemsVname__Group__4 )
            // InternalGraphicParser.g:3542:2: rule__GraphicRootClassesItemsVname__Group__3__Impl rule__GraphicRootClassesItemsVname__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__GraphicRootClassesItemsVname__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group__3"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group__3__Impl"
    // InternalGraphicParser.g:3549:1: rule__GraphicRootClassesItemsVname__Group__3__Impl : ( LeftCurlyBracket ) ;
    public final void rule__GraphicRootClassesItemsVname__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3553:1: ( ( LeftCurlyBracket ) )
            // InternalGraphicParser.g:3554:1: ( LeftCurlyBracket )
            {
            // InternalGraphicParser.g:3554:1: ( LeftCurlyBracket )
            // InternalGraphicParser.g:3555:2: LeftCurlyBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group__3__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group__4"
    // InternalGraphicParser.g:3564:1: rule__GraphicRootClassesItemsVname__Group__4 : rule__GraphicRootClassesItemsVname__Group__4__Impl rule__GraphicRootClassesItemsVname__Group__5 ;
    public final void rule__GraphicRootClassesItemsVname__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3568:1: ( rule__GraphicRootClassesItemsVname__Group__4__Impl rule__GraphicRootClassesItemsVname__Group__5 )
            // InternalGraphicParser.g:3569:2: rule__GraphicRootClassesItemsVname__Group__4__Impl rule__GraphicRootClassesItemsVname__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__GraphicRootClassesItemsVname__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group__4"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group__4__Impl"
    // InternalGraphicParser.g:3576:1: rule__GraphicRootClassesItemsVname__Group__4__Impl : ( ( rule__GraphicRootClassesItemsVname__Group_4__0 )? ) ;
    public final void rule__GraphicRootClassesItemsVname__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3580:1: ( ( ( rule__GraphicRootClassesItemsVname__Group_4__0 )? ) )
            // InternalGraphicParser.g:3581:1: ( ( rule__GraphicRootClassesItemsVname__Group_4__0 )? )
            {
            // InternalGraphicParser.g:3581:1: ( ( rule__GraphicRootClassesItemsVname__Group_4__0 )? )
            // InternalGraphicParser.g:3582:2: ( rule__GraphicRootClassesItemsVname__Group_4__0 )?
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getGroup_4()); 
            // InternalGraphicParser.g:3583:2: ( rule__GraphicRootClassesItemsVname__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=V1 && LA19_0<=V3)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGraphicParser.g:3583:3: rule__GraphicRootClassesItemsVname__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphicRootClassesItemsVname__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group__4__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group__5"
    // InternalGraphicParser.g:3591:1: rule__GraphicRootClassesItemsVname__Group__5 : rule__GraphicRootClassesItemsVname__Group__5__Impl ;
    public final void rule__GraphicRootClassesItemsVname__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3595:1: ( rule__GraphicRootClassesItemsVname__Group__5__Impl )
            // InternalGraphicParser.g:3596:2: rule__GraphicRootClassesItemsVname__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group__5"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group__5__Impl"
    // InternalGraphicParser.g:3602:1: rule__GraphicRootClassesItemsVname__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__GraphicRootClassesItemsVname__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3606:1: ( ( RightCurlyBracket ) )
            // InternalGraphicParser.g:3607:1: ( RightCurlyBracket )
            {
            // InternalGraphicParser.g:3607:1: ( RightCurlyBracket )
            // InternalGraphicParser.g:3608:2: RightCurlyBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group__5__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group_4__0"
    // InternalGraphicParser.g:3618:1: rule__GraphicRootClassesItemsVname__Group_4__0 : rule__GraphicRootClassesItemsVname__Group_4__0__Impl rule__GraphicRootClassesItemsVname__Group_4__1 ;
    public final void rule__GraphicRootClassesItemsVname__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3622:1: ( rule__GraphicRootClassesItemsVname__Group_4__0__Impl rule__GraphicRootClassesItemsVname__Group_4__1 )
            // InternalGraphicParser.g:3623:2: rule__GraphicRootClassesItemsVname__Group_4__0__Impl rule__GraphicRootClassesItemsVname__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__GraphicRootClassesItemsVname__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group_4__0"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group_4__0__Impl"
    // InternalGraphicParser.g:3630:1: rule__GraphicRootClassesItemsVname__Group_4__0__Impl : ( ( rule__GraphicRootClassesItemsVname__VnameAssignment_4_0 ) ) ;
    public final void rule__GraphicRootClassesItemsVname__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3634:1: ( ( ( rule__GraphicRootClassesItemsVname__VnameAssignment_4_0 ) ) )
            // InternalGraphicParser.g:3635:1: ( ( rule__GraphicRootClassesItemsVname__VnameAssignment_4_0 ) )
            {
            // InternalGraphicParser.g:3635:1: ( ( rule__GraphicRootClassesItemsVname__VnameAssignment_4_0 ) )
            // InternalGraphicParser.g:3636:2: ( rule__GraphicRootClassesItemsVname__VnameAssignment_4_0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameAssignment_4_0()); 
            // InternalGraphicParser.g:3637:2: ( rule__GraphicRootClassesItemsVname__VnameAssignment_4_0 )
            // InternalGraphicParser.g:3637:3: rule__GraphicRootClassesItemsVname__VnameAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__VnameAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group_4__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group_4__1"
    // InternalGraphicParser.g:3645:1: rule__GraphicRootClassesItemsVname__Group_4__1 : rule__GraphicRootClassesItemsVname__Group_4__1__Impl ;
    public final void rule__GraphicRootClassesItemsVname__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3649:1: ( rule__GraphicRootClassesItemsVname__Group_4__1__Impl )
            // InternalGraphicParser.g:3650:2: rule__GraphicRootClassesItemsVname__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group_4__1"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group_4__1__Impl"
    // InternalGraphicParser.g:3656:1: rule__GraphicRootClassesItemsVname__Group_4__1__Impl : ( ( rule__GraphicRootClassesItemsVname__Group_4_1__0 )* ) ;
    public final void rule__GraphicRootClassesItemsVname__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3660:1: ( ( ( rule__GraphicRootClassesItemsVname__Group_4_1__0 )* ) )
            // InternalGraphicParser.g:3661:1: ( ( rule__GraphicRootClassesItemsVname__Group_4_1__0 )* )
            {
            // InternalGraphicParser.g:3661:1: ( ( rule__GraphicRootClassesItemsVname__Group_4_1__0 )* )
            // InternalGraphicParser.g:3662:2: ( rule__GraphicRootClassesItemsVname__Group_4_1__0 )*
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getGroup_4_1()); 
            // InternalGraphicParser.g:3663:2: ( rule__GraphicRootClassesItemsVname__Group_4_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Comma) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGraphicParser.g:3663:3: rule__GraphicRootClassesItemsVname__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GraphicRootClassesItemsVname__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group_4__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group_4_1__0"
    // InternalGraphicParser.g:3672:1: rule__GraphicRootClassesItemsVname__Group_4_1__0 : rule__GraphicRootClassesItemsVname__Group_4_1__0__Impl rule__GraphicRootClassesItemsVname__Group_4_1__1 ;
    public final void rule__GraphicRootClassesItemsVname__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3676:1: ( rule__GraphicRootClassesItemsVname__Group_4_1__0__Impl rule__GraphicRootClassesItemsVname__Group_4_1__1 )
            // InternalGraphicParser.g:3677:2: rule__GraphicRootClassesItemsVname__Group_4_1__0__Impl rule__GraphicRootClassesItemsVname__Group_4_1__1
            {
            pushFollow(FOLLOW_17);
            rule__GraphicRootClassesItemsVname__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group_4_1__0"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group_4_1__0__Impl"
    // InternalGraphicParser.g:3684:1: rule__GraphicRootClassesItemsVname__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__GraphicRootClassesItemsVname__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3688:1: ( ( Comma ) )
            // InternalGraphicParser.g:3689:1: ( Comma )
            {
            // InternalGraphicParser.g:3689:1: ( Comma )
            // InternalGraphicParser.g:3690:2: Comma
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group_4_1__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group_4_1__1"
    // InternalGraphicParser.g:3699:1: rule__GraphicRootClassesItemsVname__Group_4_1__1 : rule__GraphicRootClassesItemsVname__Group_4_1__1__Impl ;
    public final void rule__GraphicRootClassesItemsVname__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3703:1: ( rule__GraphicRootClassesItemsVname__Group_4_1__1__Impl )
            // InternalGraphicParser.g:3704:2: rule__GraphicRootClassesItemsVname__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group_4_1__1"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__Group_4_1__1__Impl"
    // InternalGraphicParser.g:3710:1: rule__GraphicRootClassesItemsVname__Group_4_1__1__Impl : ( ( rule__GraphicRootClassesItemsVname__VnameAssignment_4_1_1 ) ) ;
    public final void rule__GraphicRootClassesItemsVname__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3714:1: ( ( ( rule__GraphicRootClassesItemsVname__VnameAssignment_4_1_1 ) ) )
            // InternalGraphicParser.g:3715:1: ( ( rule__GraphicRootClassesItemsVname__VnameAssignment_4_1_1 ) )
            {
            // InternalGraphicParser.g:3715:1: ( ( rule__GraphicRootClassesItemsVname__VnameAssignment_4_1_1 ) )
            // InternalGraphicParser.g:3716:2: ( rule__GraphicRootClassesItemsVname__VnameAssignment_4_1_1 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameAssignment_4_1_1()); 
            // InternalGraphicParser.g:3717:2: ( rule__GraphicRootClassesItemsVname__VnameAssignment_4_1_1 )
            // InternalGraphicParser.g:3717:3: rule__GraphicRootClassesItemsVname__VnameAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVname__VnameAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__Group_4_1__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group__0"
    // InternalGraphicParser.g:3726:1: rule__GraphicRootClassesItemsShowAttributes__Group__0 : rule__GraphicRootClassesItemsShowAttributes__Group__0__Impl rule__GraphicRootClassesItemsShowAttributes__Group__1 ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3730:1: ( rule__GraphicRootClassesItemsShowAttributes__Group__0__Impl rule__GraphicRootClassesItemsShowAttributes__Group__1 )
            // InternalGraphicParser.g:3731:2: rule__GraphicRootClassesItemsShowAttributes__Group__0__Impl rule__GraphicRootClassesItemsShowAttributes__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__GraphicRootClassesItemsShowAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group__0__Impl"
    // InternalGraphicParser.g:3738:1: rule__GraphicRootClassesItemsShowAttributes__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3742:1: ( ( () ) )
            // InternalGraphicParser.g:3743:1: ( () )
            {
            // InternalGraphicParser.g:3743:1: ( () )
            // InternalGraphicParser.g:3744:2: ()
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getGraphicRootClassesItemsShowAttributesAction_0()); 
            // InternalGraphicParser.g:3745:2: ()
            // InternalGraphicParser.g:3745:3: 
            {
            }

             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getGraphicRootClassesItemsShowAttributesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group__1"
    // InternalGraphicParser.g:3753:1: rule__GraphicRootClassesItemsShowAttributes__Group__1 : rule__GraphicRootClassesItemsShowAttributes__Group__1__Impl rule__GraphicRootClassesItemsShowAttributes__Group__2 ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3757:1: ( rule__GraphicRootClassesItemsShowAttributes__Group__1__Impl rule__GraphicRootClassesItemsShowAttributes__Group__2 )
            // InternalGraphicParser.g:3758:2: rule__GraphicRootClassesItemsShowAttributes__Group__1__Impl rule__GraphicRootClassesItemsShowAttributes__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsShowAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group__1__Impl"
    // InternalGraphicParser.g:3765:1: rule__GraphicRootClassesItemsShowAttributes__Group__1__Impl : ( ShowAttributes ) ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3769:1: ( ( ShowAttributes ) )
            // InternalGraphicParser.g:3770:1: ( ShowAttributes )
            {
            // InternalGraphicParser.g:3770:1: ( ShowAttributes )
            // InternalGraphicParser.g:3771:2: ShowAttributes
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesKeyword_1()); 
            match(input,ShowAttributes,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group__2"
    // InternalGraphicParser.g:3780:1: rule__GraphicRootClassesItemsShowAttributes__Group__2 : rule__GraphicRootClassesItemsShowAttributes__Group__2__Impl rule__GraphicRootClassesItemsShowAttributes__Group__3 ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3784:1: ( rule__GraphicRootClassesItemsShowAttributes__Group__2__Impl rule__GraphicRootClassesItemsShowAttributes__Group__3 )
            // InternalGraphicParser.g:3785:2: rule__GraphicRootClassesItemsShowAttributes__Group__2__Impl rule__GraphicRootClassesItemsShowAttributes__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__GraphicRootClassesItemsShowAttributes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group__2__Impl"
    // InternalGraphicParser.g:3792:1: rule__GraphicRootClassesItemsShowAttributes__Group__2__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3796:1: ( ( Colon ) )
            // InternalGraphicParser.g:3797:1: ( Colon )
            {
            // InternalGraphicParser.g:3797:1: ( Colon )
            // InternalGraphicParser.g:3798:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group__3"
    // InternalGraphicParser.g:3807:1: rule__GraphicRootClassesItemsShowAttributes__Group__3 : rule__GraphicRootClassesItemsShowAttributes__Group__3__Impl rule__GraphicRootClassesItemsShowAttributes__Group__4 ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3811:1: ( rule__GraphicRootClassesItemsShowAttributes__Group__3__Impl rule__GraphicRootClassesItemsShowAttributes__Group__4 )
            // InternalGraphicParser.g:3812:2: rule__GraphicRootClassesItemsShowAttributes__Group__3__Impl rule__GraphicRootClassesItemsShowAttributes__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__GraphicRootClassesItemsShowAttributes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group__3"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group__3__Impl"
    // InternalGraphicParser.g:3819:1: rule__GraphicRootClassesItemsShowAttributes__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3823:1: ( ( LeftSquareBracket ) )
            // InternalGraphicParser.g:3824:1: ( LeftSquareBracket )
            {
            // InternalGraphicParser.g:3824:1: ( LeftSquareBracket )
            // InternalGraphicParser.g:3825:2: LeftSquareBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group__3__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group__4"
    // InternalGraphicParser.g:3834:1: rule__GraphicRootClassesItemsShowAttributes__Group__4 : rule__GraphicRootClassesItemsShowAttributes__Group__4__Impl rule__GraphicRootClassesItemsShowAttributes__Group__5 ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3838:1: ( rule__GraphicRootClassesItemsShowAttributes__Group__4__Impl rule__GraphicRootClassesItemsShowAttributes__Group__5 )
            // InternalGraphicParser.g:3839:2: rule__GraphicRootClassesItemsShowAttributes__Group__4__Impl rule__GraphicRootClassesItemsShowAttributes__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__GraphicRootClassesItemsShowAttributes__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group__4"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group__4__Impl"
    // InternalGraphicParser.g:3846:1: rule__GraphicRootClassesItemsShowAttributes__Group__4__Impl : ( ( rule__GraphicRootClassesItemsShowAttributes__Group_4__0 )? ) ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3850:1: ( ( ( rule__GraphicRootClassesItemsShowAttributes__Group_4__0 )? ) )
            // InternalGraphicParser.g:3851:1: ( ( rule__GraphicRootClassesItemsShowAttributes__Group_4__0 )? )
            {
            // InternalGraphicParser.g:3851:1: ( ( rule__GraphicRootClassesItemsShowAttributes__Group_4__0 )? )
            // InternalGraphicParser.g:3852:2: ( rule__GraphicRootClassesItemsShowAttributes__Group_4__0 )?
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getGroup_4()); 
            // InternalGraphicParser.g:3853:2: ( rule__GraphicRootClassesItemsShowAttributes__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=ContactTestBitMask && LA21_0<=URI)||(LA21_0>=V1 && LA21_0<=V3)||LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGraphicParser.g:3853:3: rule__GraphicRootClassesItemsShowAttributes__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphicRootClassesItemsShowAttributes__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group__4__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group__5"
    // InternalGraphicParser.g:3861:1: rule__GraphicRootClassesItemsShowAttributes__Group__5 : rule__GraphicRootClassesItemsShowAttributes__Group__5__Impl ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3865:1: ( rule__GraphicRootClassesItemsShowAttributes__Group__5__Impl )
            // InternalGraphicParser.g:3866:2: rule__GraphicRootClassesItemsShowAttributes__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group__5"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group__5__Impl"
    // InternalGraphicParser.g:3872:1: rule__GraphicRootClassesItemsShowAttributes__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3876:1: ( ( RightSquareBracket ) )
            // InternalGraphicParser.g:3877:1: ( RightSquareBracket )
            {
            // InternalGraphicParser.g:3877:1: ( RightSquareBracket )
            // InternalGraphicParser.g:3878:2: RightSquareBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group__5__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group_4__0"
    // InternalGraphicParser.g:3888:1: rule__GraphicRootClassesItemsShowAttributes__Group_4__0 : rule__GraphicRootClassesItemsShowAttributes__Group_4__0__Impl rule__GraphicRootClassesItemsShowAttributes__Group_4__1 ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3892:1: ( rule__GraphicRootClassesItemsShowAttributes__Group_4__0__Impl rule__GraphicRootClassesItemsShowAttributes__Group_4__1 )
            // InternalGraphicParser.g:3893:2: rule__GraphicRootClassesItemsShowAttributes__Group_4__0__Impl rule__GraphicRootClassesItemsShowAttributes__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__GraphicRootClassesItemsShowAttributes__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group_4__0"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group_4__0__Impl"
    // InternalGraphicParser.g:3900:1: rule__GraphicRootClassesItemsShowAttributes__Group_4__0__Impl : ( ( rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_0 ) ) ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3904:1: ( ( ( rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_0 ) ) )
            // InternalGraphicParser.g:3905:1: ( ( rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_0 ) )
            {
            // InternalGraphicParser.g:3905:1: ( ( rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_0 ) )
            // InternalGraphicParser.g:3906:2: ( rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesAssignment_4_0()); 
            // InternalGraphicParser.g:3907:2: ( rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_0 )
            // InternalGraphicParser.g:3907:3: rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group_4__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group_4__1"
    // InternalGraphicParser.g:3915:1: rule__GraphicRootClassesItemsShowAttributes__Group_4__1 : rule__GraphicRootClassesItemsShowAttributes__Group_4__1__Impl ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3919:1: ( rule__GraphicRootClassesItemsShowAttributes__Group_4__1__Impl )
            // InternalGraphicParser.g:3920:2: rule__GraphicRootClassesItemsShowAttributes__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group_4__1"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group_4__1__Impl"
    // InternalGraphicParser.g:3926:1: rule__GraphicRootClassesItemsShowAttributes__Group_4__1__Impl : ( ( rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0 )* ) ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3930:1: ( ( ( rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0 )* ) )
            // InternalGraphicParser.g:3931:1: ( ( rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0 )* )
            {
            // InternalGraphicParser.g:3931:1: ( ( rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0 )* )
            // InternalGraphicParser.g:3932:2: ( rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0 )*
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getGroup_4_1()); 
            // InternalGraphicParser.g:3933:2: ( rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Comma) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGraphicParser.g:3933:3: rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group_4__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0"
    // InternalGraphicParser.g:3942:1: rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0 : rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0__Impl rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1 ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3946:1: ( rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0__Impl rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1 )
            // InternalGraphicParser.g:3947:2: rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0__Impl rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0__Impl"
    // InternalGraphicParser.g:3954:1: rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3958:1: ( ( Comma ) )
            // InternalGraphicParser.g:3959:1: ( Comma )
            {
            // InternalGraphicParser.g:3959:1: ( Comma )
            // InternalGraphicParser.g:3960:2: Comma
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group_4_1__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1"
    // InternalGraphicParser.g:3969:1: rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1 : rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1__Impl ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3973:1: ( rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1__Impl )
            // InternalGraphicParser.g:3974:2: rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1__Impl"
    // InternalGraphicParser.g:3980:1: rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1__Impl : ( ( rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_1_1 ) ) ;
    public final void rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:3984:1: ( ( ( rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_1_1 ) ) )
            // InternalGraphicParser.g:3985:1: ( ( rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_1_1 ) )
            {
            // InternalGraphicParser.g:3985:1: ( ( rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_1_1 ) )
            // InternalGraphicParser.g:3986:2: ( rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_1_1 )
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesAssignment_4_1_1()); 
            // InternalGraphicParser.g:3987:2: ( rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_1_1 )
            // InternalGraphicParser.g:3987:3: rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__Group_4_1__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group__0"
    // InternalGraphicParser.g:3996:1: rule__GraphicRootClassesItemsMaterialAttributes__Group__0 : rule__GraphicRootClassesItemsMaterialAttributes__Group__0__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__1 ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4000:1: ( rule__GraphicRootClassesItemsMaterialAttributes__Group__0__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__1 )
            // InternalGraphicParser.g:4001:2: rule__GraphicRootClassesItemsMaterialAttributes__Group__0__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__GraphicRootClassesItemsMaterialAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group__0__Impl"
    // InternalGraphicParser.g:4008:1: rule__GraphicRootClassesItemsMaterialAttributes__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4012:1: ( ( () ) )
            // InternalGraphicParser.g:4013:1: ( () )
            {
            // InternalGraphicParser.g:4013:1: ( () )
            // InternalGraphicParser.g:4014:2: ()
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getGraphicRootClassesItemsMaterialAttributesAction_0()); 
            // InternalGraphicParser.g:4015:2: ()
            // InternalGraphicParser.g:4015:3: 
            {
            }

             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getGraphicRootClassesItemsMaterialAttributesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group__1"
    // InternalGraphicParser.g:4023:1: rule__GraphicRootClassesItemsMaterialAttributes__Group__1 : rule__GraphicRootClassesItemsMaterialAttributes__Group__1__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__2 ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4027:1: ( rule__GraphicRootClassesItemsMaterialAttributes__Group__1__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__2 )
            // InternalGraphicParser.g:4028:2: rule__GraphicRootClassesItemsMaterialAttributes__Group__1__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsMaterialAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group__1__Impl"
    // InternalGraphicParser.g:4035:1: rule__GraphicRootClassesItemsMaterialAttributes__Group__1__Impl : ( MaterialAttributes ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4039:1: ( ( MaterialAttributes ) )
            // InternalGraphicParser.g:4040:1: ( MaterialAttributes )
            {
            // InternalGraphicParser.g:4040:1: ( MaterialAttributes )
            // InternalGraphicParser.g:4041:2: MaterialAttributes
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesKeyword_1()); 
            match(input,MaterialAttributes,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group__2"
    // InternalGraphicParser.g:4050:1: rule__GraphicRootClassesItemsMaterialAttributes__Group__2 : rule__GraphicRootClassesItemsMaterialAttributes__Group__2__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__3 ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4054:1: ( rule__GraphicRootClassesItemsMaterialAttributes__Group__2__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__3 )
            // InternalGraphicParser.g:4055:2: rule__GraphicRootClassesItemsMaterialAttributes__Group__2__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__GraphicRootClassesItemsMaterialAttributes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group__2__Impl"
    // InternalGraphicParser.g:4062:1: rule__GraphicRootClassesItemsMaterialAttributes__Group__2__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4066:1: ( ( Colon ) )
            // InternalGraphicParser.g:4067:1: ( Colon )
            {
            // InternalGraphicParser.g:4067:1: ( Colon )
            // InternalGraphicParser.g:4068:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group__3"
    // InternalGraphicParser.g:4077:1: rule__GraphicRootClassesItemsMaterialAttributes__Group__3 : rule__GraphicRootClassesItemsMaterialAttributes__Group__3__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__4 ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4081:1: ( rule__GraphicRootClassesItemsMaterialAttributes__Group__3__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__4 )
            // InternalGraphicParser.g:4082:2: rule__GraphicRootClassesItemsMaterialAttributes__Group__3__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__GraphicRootClassesItemsMaterialAttributes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group__3"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group__3__Impl"
    // InternalGraphicParser.g:4089:1: rule__GraphicRootClassesItemsMaterialAttributes__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4093:1: ( ( LeftSquareBracket ) )
            // InternalGraphicParser.g:4094:1: ( LeftSquareBracket )
            {
            // InternalGraphicParser.g:4094:1: ( LeftSquareBracket )
            // InternalGraphicParser.g:4095:2: LeftSquareBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group__3__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group__4"
    // InternalGraphicParser.g:4104:1: rule__GraphicRootClassesItemsMaterialAttributes__Group__4 : rule__GraphicRootClassesItemsMaterialAttributes__Group__4__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__5 ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4108:1: ( rule__GraphicRootClassesItemsMaterialAttributes__Group__4__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__5 )
            // InternalGraphicParser.g:4109:2: rule__GraphicRootClassesItemsMaterialAttributes__Group__4__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__GraphicRootClassesItemsMaterialAttributes__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group__4"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group__4__Impl"
    // InternalGraphicParser.g:4116:1: rule__GraphicRootClassesItemsMaterialAttributes__Group__4__Impl : ( ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0 )? ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4120:1: ( ( ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0 )? ) )
            // InternalGraphicParser.g:4121:1: ( ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0 )? )
            {
            // InternalGraphicParser.g:4121:1: ( ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0 )? )
            // InternalGraphicParser.g:4122:2: ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0 )?
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getGroup_4()); 
            // InternalGraphicParser.g:4123:2: ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=ContactTestBitMask && LA23_0<=URI)||(LA23_0>=V1 && LA23_0<=V3)||LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGraphicParser.g:4123:3: rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group__4__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group__5"
    // InternalGraphicParser.g:4131:1: rule__GraphicRootClassesItemsMaterialAttributes__Group__5 : rule__GraphicRootClassesItemsMaterialAttributes__Group__5__Impl ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4135:1: ( rule__GraphicRootClassesItemsMaterialAttributes__Group__5__Impl )
            // InternalGraphicParser.g:4136:2: rule__GraphicRootClassesItemsMaterialAttributes__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group__5"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group__5__Impl"
    // InternalGraphicParser.g:4142:1: rule__GraphicRootClassesItemsMaterialAttributes__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4146:1: ( ( RightSquareBracket ) )
            // InternalGraphicParser.g:4147:1: ( RightSquareBracket )
            {
            // InternalGraphicParser.g:4147:1: ( RightSquareBracket )
            // InternalGraphicParser.g:4148:2: RightSquareBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group__5__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0"
    // InternalGraphicParser.g:4158:1: rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0 : rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1 ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4162:1: ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1 )
            // InternalGraphicParser.g:4163:2: rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0__Impl"
    // InternalGraphicParser.g:4170:1: rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0__Impl : ( ( rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_0 ) ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4174:1: ( ( ( rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_0 ) ) )
            // InternalGraphicParser.g:4175:1: ( ( rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_0 ) )
            {
            // InternalGraphicParser.g:4175:1: ( ( rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_0 ) )
            // InternalGraphicParser.g:4176:2: ( rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesAssignment_4_0()); 
            // InternalGraphicParser.g:4177:2: ( rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_0 )
            // InternalGraphicParser.g:4177:3: rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group_4__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1"
    // InternalGraphicParser.g:4185:1: rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1 : rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1__Impl ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4189:1: ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1__Impl )
            // InternalGraphicParser.g:4190:2: rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1__Impl"
    // InternalGraphicParser.g:4196:1: rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1__Impl : ( ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0 )* ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4200:1: ( ( ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0 )* ) )
            // InternalGraphicParser.g:4201:1: ( ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0 )* )
            {
            // InternalGraphicParser.g:4201:1: ( ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0 )* )
            // InternalGraphicParser.g:4202:2: ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0 )*
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getGroup_4_1()); 
            // InternalGraphicParser.g:4203:2: ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Comma) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGraphicParser.g:4203:3: rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group_4__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0"
    // InternalGraphicParser.g:4212:1: rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0 : rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1 ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4216:1: ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1 )
            // InternalGraphicParser.g:4217:2: rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0__Impl rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0__Impl"
    // InternalGraphicParser.g:4224:1: rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4228:1: ( ( Comma ) )
            // InternalGraphicParser.g:4229:1: ( Comma )
            {
            // InternalGraphicParser.g:4229:1: ( Comma )
            // InternalGraphicParser.g:4230:2: Comma
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1"
    // InternalGraphicParser.g:4239:1: rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1 : rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1__Impl ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4243:1: ( rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1__Impl )
            // InternalGraphicParser.g:4244:2: rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1__Impl"
    // InternalGraphicParser.g:4250:1: rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1__Impl : ( ( rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_1_1 ) ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4254:1: ( ( ( rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_1_1 ) ) )
            // InternalGraphicParser.g:4255:1: ( ( rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_1_1 ) )
            {
            // InternalGraphicParser.g:4255:1: ( ( rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_1_1 ) )
            // InternalGraphicParser.g:4256:2: ( rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_1_1 )
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesAssignment_4_1_1()); 
            // InternalGraphicParser.g:4257:2: ( rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_1_1 )
            // InternalGraphicParser.g:4257:3: rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__Group_4_1__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group__0"
    // InternalGraphicParser.g:4266:1: rule__GraphicRootClassesItemsConstraints__Group__0 : rule__GraphicRootClassesItemsConstraints__Group__0__Impl rule__GraphicRootClassesItemsConstraints__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4270:1: ( rule__GraphicRootClassesItemsConstraints__Group__0__Impl rule__GraphicRootClassesItemsConstraints__Group__1 )
            // InternalGraphicParser.g:4271:2: rule__GraphicRootClassesItemsConstraints__Group__0__Impl rule__GraphicRootClassesItemsConstraints__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__GraphicRootClassesItemsConstraints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group__0__Impl"
    // InternalGraphicParser.g:4278:1: rule__GraphicRootClassesItemsConstraints__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRootClassesItemsConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4282:1: ( ( () ) )
            // InternalGraphicParser.g:4283:1: ( () )
            {
            // InternalGraphicParser.g:4283:1: ( () )
            // InternalGraphicParser.g:4284:2: ()
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getGraphicRootClassesItemsConstraintsAction_0()); 
            // InternalGraphicParser.g:4285:2: ()
            // InternalGraphicParser.g:4285:3: 
            {
            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getGraphicRootClassesItemsConstraintsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group__1"
    // InternalGraphicParser.g:4293:1: rule__GraphicRootClassesItemsConstraints__Group__1 : rule__GraphicRootClassesItemsConstraints__Group__1__Impl rule__GraphicRootClassesItemsConstraints__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4297:1: ( rule__GraphicRootClassesItemsConstraints__Group__1__Impl rule__GraphicRootClassesItemsConstraints__Group__2 )
            // InternalGraphicParser.g:4298:2: rule__GraphicRootClassesItemsConstraints__Group__1__Impl rule__GraphicRootClassesItemsConstraints__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group__1__Impl"
    // InternalGraphicParser.g:4305:1: rule__GraphicRootClassesItemsConstraints__Group__1__Impl : ( Constraints ) ;
    public final void rule__GraphicRootClassesItemsConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4309:1: ( ( Constraints ) )
            // InternalGraphicParser.g:4310:1: ( Constraints )
            {
            // InternalGraphicParser.g:4310:1: ( Constraints )
            // InternalGraphicParser.g:4311:2: Constraints
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsKeyword_1()); 
            match(input,Constraints,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group__2"
    // InternalGraphicParser.g:4320:1: rule__GraphicRootClassesItemsConstraints__Group__2 : rule__GraphicRootClassesItemsConstraints__Group__2__Impl rule__GraphicRootClassesItemsConstraints__Group__3 ;
    public final void rule__GraphicRootClassesItemsConstraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4324:1: ( rule__GraphicRootClassesItemsConstraints__Group__2__Impl rule__GraphicRootClassesItemsConstraints__Group__3 )
            // InternalGraphicParser.g:4325:2: rule__GraphicRootClassesItemsConstraints__Group__2__Impl rule__GraphicRootClassesItemsConstraints__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__GraphicRootClassesItemsConstraints__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group__2__Impl"
    // InternalGraphicParser.g:4332:1: rule__GraphicRootClassesItemsConstraints__Group__2__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4336:1: ( ( Colon ) )
            // InternalGraphicParser.g:4337:1: ( Colon )
            {
            // InternalGraphicParser.g:4337:1: ( Colon )
            // InternalGraphicParser.g:4338:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group__3"
    // InternalGraphicParser.g:4347:1: rule__GraphicRootClassesItemsConstraints__Group__3 : rule__GraphicRootClassesItemsConstraints__Group__3__Impl rule__GraphicRootClassesItemsConstraints__Group__4 ;
    public final void rule__GraphicRootClassesItemsConstraints__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4351:1: ( rule__GraphicRootClassesItemsConstraints__Group__3__Impl rule__GraphicRootClassesItemsConstraints__Group__4 )
            // InternalGraphicParser.g:4352:2: rule__GraphicRootClassesItemsConstraints__Group__3__Impl rule__GraphicRootClassesItemsConstraints__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__GraphicRootClassesItemsConstraints__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group__3"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group__3__Impl"
    // InternalGraphicParser.g:4359:1: rule__GraphicRootClassesItemsConstraints__Group__3__Impl : ( LeftCurlyBracket ) ;
    public final void rule__GraphicRootClassesItemsConstraints__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4363:1: ( ( LeftCurlyBracket ) )
            // InternalGraphicParser.g:4364:1: ( LeftCurlyBracket )
            {
            // InternalGraphicParser.g:4364:1: ( LeftCurlyBracket )
            // InternalGraphicParser.g:4365:2: LeftCurlyBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group__3__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group__4"
    // InternalGraphicParser.g:4374:1: rule__GraphicRootClassesItemsConstraints__Group__4 : rule__GraphicRootClassesItemsConstraints__Group__4__Impl rule__GraphicRootClassesItemsConstraints__Group__5 ;
    public final void rule__GraphicRootClassesItemsConstraints__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4378:1: ( rule__GraphicRootClassesItemsConstraints__Group__4__Impl rule__GraphicRootClassesItemsConstraints__Group__5 )
            // InternalGraphicParser.g:4379:2: rule__GraphicRootClassesItemsConstraints__Group__4__Impl rule__GraphicRootClassesItemsConstraints__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__GraphicRootClassesItemsConstraints__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group__4"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group__4__Impl"
    // InternalGraphicParser.g:4386:1: rule__GraphicRootClassesItemsConstraints__Group__4__Impl : ( ( rule__GraphicRootClassesItemsConstraints__Group_4__0 )? ) ;
    public final void rule__GraphicRootClassesItemsConstraints__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4390:1: ( ( ( rule__GraphicRootClassesItemsConstraints__Group_4__0 )? ) )
            // InternalGraphicParser.g:4391:1: ( ( rule__GraphicRootClassesItemsConstraints__Group_4__0 )? )
            {
            // InternalGraphicParser.g:4391:1: ( ( rule__GraphicRootClassesItemsConstraints__Group_4__0 )? )
            // InternalGraphicParser.g:4392:2: ( rule__GraphicRootClassesItemsConstraints__Group_4__0 )?
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getGroup_4()); 
            // InternalGraphicParser.g:4393:2: ( rule__GraphicRootClassesItemsConstraints__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ContactTestBitMask||(LA25_0>=CollisionBitMask && LA25_0<=CategoryBitMask)||(LA25_0>=XToOriginPos && LA25_0<=ZToOriginPos)||(LA25_0>=Ilumination && LA25_0<=Overlapping)||(LA25_0>=Rotation && LA25_0<=SizeInit)||(LA25_0>=SizeMax && LA25_0<=Planes)||(LA25_0>=Text && LA25_0<=Trim)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGraphicParser.g:4393:3: rule__GraphicRootClassesItemsConstraints__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphicRootClassesItemsConstraints__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group__4__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group__5"
    // InternalGraphicParser.g:4401:1: rule__GraphicRootClassesItemsConstraints__Group__5 : rule__GraphicRootClassesItemsConstraints__Group__5__Impl ;
    public final void rule__GraphicRootClassesItemsConstraints__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4405:1: ( rule__GraphicRootClassesItemsConstraints__Group__5__Impl )
            // InternalGraphicParser.g:4406:2: rule__GraphicRootClassesItemsConstraints__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group__5"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group__5__Impl"
    // InternalGraphicParser.g:4412:1: rule__GraphicRootClassesItemsConstraints__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__GraphicRootClassesItemsConstraints__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4416:1: ( ( RightCurlyBracket ) )
            // InternalGraphicParser.g:4417:1: ( RightCurlyBracket )
            {
            // InternalGraphicParser.g:4417:1: ( RightCurlyBracket )
            // InternalGraphicParser.g:4418:2: RightCurlyBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group__5__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group_4__0"
    // InternalGraphicParser.g:4428:1: rule__GraphicRootClassesItemsConstraints__Group_4__0 : rule__GraphicRootClassesItemsConstraints__Group_4__0__Impl rule__GraphicRootClassesItemsConstraints__Group_4__1 ;
    public final void rule__GraphicRootClassesItemsConstraints__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4432:1: ( rule__GraphicRootClassesItemsConstraints__Group_4__0__Impl rule__GraphicRootClassesItemsConstraints__Group_4__1 )
            // InternalGraphicParser.g:4433:2: rule__GraphicRootClassesItemsConstraints__Group_4__0__Impl rule__GraphicRootClassesItemsConstraints__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__GraphicRootClassesItemsConstraints__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group_4__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group_4__0__Impl"
    // InternalGraphicParser.g:4440:1: rule__GraphicRootClassesItemsConstraints__Group_4__0__Impl : ( ( rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_0 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraints__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4444:1: ( ( ( rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_0 ) ) )
            // InternalGraphicParser.g:4445:1: ( ( rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_0 ) )
            {
            // InternalGraphicParser.g:4445:1: ( ( rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_0 ) )
            // InternalGraphicParser.g:4446:2: ( rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsAssignment_4_0()); 
            // InternalGraphicParser.g:4447:2: ( rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_0 )
            // InternalGraphicParser.g:4447:3: rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group_4__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group_4__1"
    // InternalGraphicParser.g:4455:1: rule__GraphicRootClassesItemsConstraints__Group_4__1 : rule__GraphicRootClassesItemsConstraints__Group_4__1__Impl ;
    public final void rule__GraphicRootClassesItemsConstraints__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4459:1: ( rule__GraphicRootClassesItemsConstraints__Group_4__1__Impl )
            // InternalGraphicParser.g:4460:2: rule__GraphicRootClassesItemsConstraints__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group_4__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group_4__1__Impl"
    // InternalGraphicParser.g:4466:1: rule__GraphicRootClassesItemsConstraints__Group_4__1__Impl : ( ( rule__GraphicRootClassesItemsConstraints__Group_4_1__0 )* ) ;
    public final void rule__GraphicRootClassesItemsConstraints__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4470:1: ( ( ( rule__GraphicRootClassesItemsConstraints__Group_4_1__0 )* ) )
            // InternalGraphicParser.g:4471:1: ( ( rule__GraphicRootClassesItemsConstraints__Group_4_1__0 )* )
            {
            // InternalGraphicParser.g:4471:1: ( ( rule__GraphicRootClassesItemsConstraints__Group_4_1__0 )* )
            // InternalGraphicParser.g:4472:2: ( rule__GraphicRootClassesItemsConstraints__Group_4_1__0 )*
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getGroup_4_1()); 
            // InternalGraphicParser.g:4473:2: ( rule__GraphicRootClassesItemsConstraints__Group_4_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGraphicParser.g:4473:3: rule__GraphicRootClassesItemsConstraints__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GraphicRootClassesItemsConstraints__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group_4__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group_4_1__0"
    // InternalGraphicParser.g:4482:1: rule__GraphicRootClassesItemsConstraints__Group_4_1__0 : rule__GraphicRootClassesItemsConstraints__Group_4_1__0__Impl rule__GraphicRootClassesItemsConstraints__Group_4_1__1 ;
    public final void rule__GraphicRootClassesItemsConstraints__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4486:1: ( rule__GraphicRootClassesItemsConstraints__Group_4_1__0__Impl rule__GraphicRootClassesItemsConstraints__Group_4_1__1 )
            // InternalGraphicParser.g:4487:2: rule__GraphicRootClassesItemsConstraints__Group_4_1__0__Impl rule__GraphicRootClassesItemsConstraints__Group_4_1__1
            {
            pushFollow(FOLLOW_24);
            rule__GraphicRootClassesItemsConstraints__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group_4_1__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group_4_1__0__Impl"
    // InternalGraphicParser.g:4494:1: rule__GraphicRootClassesItemsConstraints__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__GraphicRootClassesItemsConstraints__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4498:1: ( ( Comma ) )
            // InternalGraphicParser.g:4499:1: ( Comma )
            {
            // InternalGraphicParser.g:4499:1: ( Comma )
            // InternalGraphicParser.g:4500:2: Comma
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group_4_1__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group_4_1__1"
    // InternalGraphicParser.g:4509:1: rule__GraphicRootClassesItemsConstraints__Group_4_1__1 : rule__GraphicRootClassesItemsConstraints__Group_4_1__1__Impl ;
    public final void rule__GraphicRootClassesItemsConstraints__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4513:1: ( rule__GraphicRootClassesItemsConstraints__Group_4_1__1__Impl )
            // InternalGraphicParser.g:4514:2: rule__GraphicRootClassesItemsConstraints__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group_4_1__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__Group_4_1__1__Impl"
    // InternalGraphicParser.g:4520:1: rule__GraphicRootClassesItemsConstraints__Group_4_1__1__Impl : ( ( rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_1_1 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraints__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4524:1: ( ( ( rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_1_1 ) ) )
            // InternalGraphicParser.g:4525:1: ( ( rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_1_1 ) )
            {
            // InternalGraphicParser.g:4525:1: ( ( rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_1_1 ) )
            // InternalGraphicParser.g:4526:2: ( rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_1_1 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsAssignment_4_1_1()); 
            // InternalGraphicParser.g:4527:2: ( rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_1_1 )
            // InternalGraphicParser.g:4527:3: rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__Group_4_1__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group__0"
    // InternalGraphicParser.g:4536:1: rule__GraphicRootClassesItemsConnections__Group__0 : rule__GraphicRootClassesItemsConnections__Group__0__Impl rule__GraphicRootClassesItemsConnections__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnections__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4540:1: ( rule__GraphicRootClassesItemsConnections__Group__0__Impl rule__GraphicRootClassesItemsConnections__Group__1 )
            // InternalGraphicParser.g:4541:2: rule__GraphicRootClassesItemsConnections__Group__0__Impl rule__GraphicRootClassesItemsConnections__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__GraphicRootClassesItemsConnections__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group__0__Impl"
    // InternalGraphicParser.g:4548:1: rule__GraphicRootClassesItemsConnections__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRootClassesItemsConnections__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4552:1: ( ( () ) )
            // InternalGraphicParser.g:4553:1: ( () )
            {
            // InternalGraphicParser.g:4553:1: ( () )
            // InternalGraphicParser.g:4554:2: ()
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getGraphicRootClassesItemsConnectionsAction_0()); 
            // InternalGraphicParser.g:4555:2: ()
            // InternalGraphicParser.g:4555:3: 
            {
            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getGraphicRootClassesItemsConnectionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group__1"
    // InternalGraphicParser.g:4563:1: rule__GraphicRootClassesItemsConnections__Group__1 : rule__GraphicRootClassesItemsConnections__Group__1__Impl rule__GraphicRootClassesItemsConnections__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnections__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4567:1: ( rule__GraphicRootClassesItemsConnections__Group__1__Impl rule__GraphicRootClassesItemsConnections__Group__2 )
            // InternalGraphicParser.g:4568:2: rule__GraphicRootClassesItemsConnections__Group__1__Impl rule__GraphicRootClassesItemsConnections__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnections__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group__1__Impl"
    // InternalGraphicParser.g:4575:1: rule__GraphicRootClassesItemsConnections__Group__1__Impl : ( Connections ) ;
    public final void rule__GraphicRootClassesItemsConnections__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4579:1: ( ( Connections ) )
            // InternalGraphicParser.g:4580:1: ( Connections )
            {
            // InternalGraphicParser.g:4580:1: ( Connections )
            // InternalGraphicParser.g:4581:2: Connections
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsKeyword_1()); 
            match(input,Connections,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group__2"
    // InternalGraphicParser.g:4590:1: rule__GraphicRootClassesItemsConnections__Group__2 : rule__GraphicRootClassesItemsConnections__Group__2__Impl rule__GraphicRootClassesItemsConnections__Group__3 ;
    public final void rule__GraphicRootClassesItemsConnections__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4594:1: ( rule__GraphicRootClassesItemsConnections__Group__2__Impl rule__GraphicRootClassesItemsConnections__Group__3 )
            // InternalGraphicParser.g:4595:2: rule__GraphicRootClassesItemsConnections__Group__2__Impl rule__GraphicRootClassesItemsConnections__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__GraphicRootClassesItemsConnections__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group__2__Impl"
    // InternalGraphicParser.g:4602:1: rule__GraphicRootClassesItemsConnections__Group__2__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnections__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4606:1: ( ( Colon ) )
            // InternalGraphicParser.g:4607:1: ( Colon )
            {
            // InternalGraphicParser.g:4607:1: ( Colon )
            // InternalGraphicParser.g:4608:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group__3"
    // InternalGraphicParser.g:4617:1: rule__GraphicRootClassesItemsConnections__Group__3 : rule__GraphicRootClassesItemsConnections__Group__3__Impl rule__GraphicRootClassesItemsConnections__Group__4 ;
    public final void rule__GraphicRootClassesItemsConnections__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4621:1: ( rule__GraphicRootClassesItemsConnections__Group__3__Impl rule__GraphicRootClassesItemsConnections__Group__4 )
            // InternalGraphicParser.g:4622:2: rule__GraphicRootClassesItemsConnections__Group__3__Impl rule__GraphicRootClassesItemsConnections__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__GraphicRootClassesItemsConnections__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group__3"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group__3__Impl"
    // InternalGraphicParser.g:4629:1: rule__GraphicRootClassesItemsConnections__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__GraphicRootClassesItemsConnections__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4633:1: ( ( LeftSquareBracket ) )
            // InternalGraphicParser.g:4634:1: ( LeftSquareBracket )
            {
            // InternalGraphicParser.g:4634:1: ( LeftSquareBracket )
            // InternalGraphicParser.g:4635:2: LeftSquareBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group__3__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group__4"
    // InternalGraphicParser.g:4644:1: rule__GraphicRootClassesItemsConnections__Group__4 : rule__GraphicRootClassesItemsConnections__Group__4__Impl rule__GraphicRootClassesItemsConnections__Group__5 ;
    public final void rule__GraphicRootClassesItemsConnections__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4648:1: ( rule__GraphicRootClassesItemsConnections__Group__4__Impl rule__GraphicRootClassesItemsConnections__Group__5 )
            // InternalGraphicParser.g:4649:2: rule__GraphicRootClassesItemsConnections__Group__4__Impl rule__GraphicRootClassesItemsConnections__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__GraphicRootClassesItemsConnections__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group__4"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group__4__Impl"
    // InternalGraphicParser.g:4656:1: rule__GraphicRootClassesItemsConnections__Group__4__Impl : ( ( rule__GraphicRootClassesItemsConnections__Group_4__0 )? ) ;
    public final void rule__GraphicRootClassesItemsConnections__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4660:1: ( ( ( rule__GraphicRootClassesItemsConnections__Group_4__0 )? ) )
            // InternalGraphicParser.g:4661:1: ( ( rule__GraphicRootClassesItemsConnections__Group_4__0 )? )
            {
            // InternalGraphicParser.g:4661:1: ( ( rule__GraphicRootClassesItemsConnections__Group_4__0 )? )
            // InternalGraphicParser.g:4662:2: ( rule__GraphicRootClassesItemsConnections__Group_4__0 )?
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getGroup_4()); 
            // InternalGraphicParser.g:4663:2: ( rule__GraphicRootClassesItemsConnections__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LeftCurlyBracket) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGraphicParser.g:4663:3: rule__GraphicRootClassesItemsConnections__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphicRootClassesItemsConnections__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group__4__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group__5"
    // InternalGraphicParser.g:4671:1: rule__GraphicRootClassesItemsConnections__Group__5 : rule__GraphicRootClassesItemsConnections__Group__5__Impl ;
    public final void rule__GraphicRootClassesItemsConnections__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4675:1: ( rule__GraphicRootClassesItemsConnections__Group__5__Impl )
            // InternalGraphicParser.g:4676:2: rule__GraphicRootClassesItemsConnections__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group__5"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group__5__Impl"
    // InternalGraphicParser.g:4682:1: rule__GraphicRootClassesItemsConnections__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__GraphicRootClassesItemsConnections__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4686:1: ( ( RightSquareBracket ) )
            // InternalGraphicParser.g:4687:1: ( RightSquareBracket )
            {
            // InternalGraphicParser.g:4687:1: ( RightSquareBracket )
            // InternalGraphicParser.g:4688:2: RightSquareBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group__5__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group_4__0"
    // InternalGraphicParser.g:4698:1: rule__GraphicRootClassesItemsConnections__Group_4__0 : rule__GraphicRootClassesItemsConnections__Group_4__0__Impl rule__GraphicRootClassesItemsConnections__Group_4__1 ;
    public final void rule__GraphicRootClassesItemsConnections__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4702:1: ( rule__GraphicRootClassesItemsConnections__Group_4__0__Impl rule__GraphicRootClassesItemsConnections__Group_4__1 )
            // InternalGraphicParser.g:4703:2: rule__GraphicRootClassesItemsConnections__Group_4__0__Impl rule__GraphicRootClassesItemsConnections__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__GraphicRootClassesItemsConnections__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group_4__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group_4__0__Impl"
    // InternalGraphicParser.g:4710:1: rule__GraphicRootClassesItemsConnections__Group_4__0__Impl : ( ( rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_0 ) ) ;
    public final void rule__GraphicRootClassesItemsConnections__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4714:1: ( ( ( rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_0 ) ) )
            // InternalGraphicParser.g:4715:1: ( ( rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_0 ) )
            {
            // InternalGraphicParser.g:4715:1: ( ( rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_0 ) )
            // InternalGraphicParser.g:4716:2: ( rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsAssignment_4_0()); 
            // InternalGraphicParser.g:4717:2: ( rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_0 )
            // InternalGraphicParser.g:4717:3: rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group_4__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group_4__1"
    // InternalGraphicParser.g:4725:1: rule__GraphicRootClassesItemsConnections__Group_4__1 : rule__GraphicRootClassesItemsConnections__Group_4__1__Impl ;
    public final void rule__GraphicRootClassesItemsConnections__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4729:1: ( rule__GraphicRootClassesItemsConnections__Group_4__1__Impl )
            // InternalGraphicParser.g:4730:2: rule__GraphicRootClassesItemsConnections__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group_4__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group_4__1__Impl"
    // InternalGraphicParser.g:4736:1: rule__GraphicRootClassesItemsConnections__Group_4__1__Impl : ( ( rule__GraphicRootClassesItemsConnections__Group_4_1__0 )* ) ;
    public final void rule__GraphicRootClassesItemsConnections__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4740:1: ( ( ( rule__GraphicRootClassesItemsConnections__Group_4_1__0 )* ) )
            // InternalGraphicParser.g:4741:1: ( ( rule__GraphicRootClassesItemsConnections__Group_4_1__0 )* )
            {
            // InternalGraphicParser.g:4741:1: ( ( rule__GraphicRootClassesItemsConnections__Group_4_1__0 )* )
            // InternalGraphicParser.g:4742:2: ( rule__GraphicRootClassesItemsConnections__Group_4_1__0 )*
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getGroup_4_1()); 
            // InternalGraphicParser.g:4743:2: ( rule__GraphicRootClassesItemsConnections__Group_4_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Comma) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGraphicParser.g:4743:3: rule__GraphicRootClassesItemsConnections__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GraphicRootClassesItemsConnections__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group_4__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group_4_1__0"
    // InternalGraphicParser.g:4752:1: rule__GraphicRootClassesItemsConnections__Group_4_1__0 : rule__GraphicRootClassesItemsConnections__Group_4_1__0__Impl rule__GraphicRootClassesItemsConnections__Group_4_1__1 ;
    public final void rule__GraphicRootClassesItemsConnections__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4756:1: ( rule__GraphicRootClassesItemsConnections__Group_4_1__0__Impl rule__GraphicRootClassesItemsConnections__Group_4_1__1 )
            // InternalGraphicParser.g:4757:2: rule__GraphicRootClassesItemsConnections__Group_4_1__0__Impl rule__GraphicRootClassesItemsConnections__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphicRootClassesItemsConnections__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group_4_1__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group_4_1__0__Impl"
    // InternalGraphicParser.g:4764:1: rule__GraphicRootClassesItemsConnections__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__GraphicRootClassesItemsConnections__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4768:1: ( ( Comma ) )
            // InternalGraphicParser.g:4769:1: ( Comma )
            {
            // InternalGraphicParser.g:4769:1: ( Comma )
            // InternalGraphicParser.g:4770:2: Comma
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group_4_1__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group_4_1__1"
    // InternalGraphicParser.g:4779:1: rule__GraphicRootClassesItemsConnections__Group_4_1__1 : rule__GraphicRootClassesItemsConnections__Group_4_1__1__Impl ;
    public final void rule__GraphicRootClassesItemsConnections__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4783:1: ( rule__GraphicRootClassesItemsConnections__Group_4_1__1__Impl )
            // InternalGraphicParser.g:4784:2: rule__GraphicRootClassesItemsConnections__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group_4_1__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__Group_4_1__1__Impl"
    // InternalGraphicParser.g:4790:1: rule__GraphicRootClassesItemsConnections__Group_4_1__1__Impl : ( ( rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_1_1 ) ) ;
    public final void rule__GraphicRootClassesItemsConnections__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4794:1: ( ( ( rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_1_1 ) ) )
            // InternalGraphicParser.g:4795:1: ( ( rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_1_1 ) )
            {
            // InternalGraphicParser.g:4795:1: ( ( rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_1_1 ) )
            // InternalGraphicParser.g:4796:2: ( rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_1_1 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsAssignment_4_1_1()); 
            // InternalGraphicParser.g:4797:2: ( rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_1_1 )
            // InternalGraphicParser.g:4797:3: rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__Group_4_1__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV1__Group__0"
    // InternalGraphicParser.g:4806:1: rule__GraphicRootClassesItemsVersionsV1__Group__0 : rule__GraphicRootClassesItemsVersionsV1__Group__0__Impl rule__GraphicRootClassesItemsVersionsV1__Group__1 ;
    public final void rule__GraphicRootClassesItemsVersionsV1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4810:1: ( rule__GraphicRootClassesItemsVersionsV1__Group__0__Impl rule__GraphicRootClassesItemsVersionsV1__Group__1 )
            // InternalGraphicParser.g:4811:2: rule__GraphicRootClassesItemsVersionsV1__Group__0__Impl rule__GraphicRootClassesItemsVersionsV1__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsVersionsV1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV1__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV1__Group__0__Impl"
    // InternalGraphicParser.g:4818:1: rule__GraphicRootClassesItemsVersionsV1__Group__0__Impl : ( V1 ) ;
    public final void rule__GraphicRootClassesItemsVersionsV1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4822:1: ( ( V1 ) )
            // InternalGraphicParser.g:4823:1: ( V1 )
            {
            // InternalGraphicParser.g:4823:1: ( V1 )
            // InternalGraphicParser.g:4824:2: V1
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getV1Keyword_0()); 
            match(input,V1,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getV1Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV1__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV1__Group__1"
    // InternalGraphicParser.g:4833:1: rule__GraphicRootClassesItemsVersionsV1__Group__1 : rule__GraphicRootClassesItemsVersionsV1__Group__1__Impl rule__GraphicRootClassesItemsVersionsV1__Group__2 ;
    public final void rule__GraphicRootClassesItemsVersionsV1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4837:1: ( rule__GraphicRootClassesItemsVersionsV1__Group__1__Impl rule__GraphicRootClassesItemsVersionsV1__Group__2 )
            // InternalGraphicParser.g:4838:2: rule__GraphicRootClassesItemsVersionsV1__Group__1__Impl rule__GraphicRootClassesItemsVersionsV1__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsVersionsV1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV1__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV1__Group__1__Impl"
    // InternalGraphicParser.g:4845:1: rule__GraphicRootClassesItemsVersionsV1__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsVersionsV1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4849:1: ( ( Colon ) )
            // InternalGraphicParser.g:4850:1: ( Colon )
            {
            // InternalGraphicParser.g:4850:1: ( Colon )
            // InternalGraphicParser.g:4851:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV1__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV1__Group__2"
    // InternalGraphicParser.g:4860:1: rule__GraphicRootClassesItemsVersionsV1__Group__2 : rule__GraphicRootClassesItemsVersionsV1__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsVersionsV1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4864:1: ( rule__GraphicRootClassesItemsVersionsV1__Group__2__Impl )
            // InternalGraphicParser.g:4865:2: rule__GraphicRootClassesItemsVersionsV1__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV1__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV1__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV1__Group__2__Impl"
    // InternalGraphicParser.g:4871:1: rule__GraphicRootClassesItemsVersionsV1__Group__2__Impl : ( ( rule__GraphicRootClassesItemsVersionsV1__V1Assignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsVersionsV1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4875:1: ( ( ( rule__GraphicRootClassesItemsVersionsV1__V1Assignment_2 ) ) )
            // InternalGraphicParser.g:4876:1: ( ( rule__GraphicRootClassesItemsVersionsV1__V1Assignment_2 ) )
            {
            // InternalGraphicParser.g:4876:1: ( ( rule__GraphicRootClassesItemsVersionsV1__V1Assignment_2 ) )
            // InternalGraphicParser.g:4877:2: ( rule__GraphicRootClassesItemsVersionsV1__V1Assignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getV1Assignment_2()); 
            // InternalGraphicParser.g:4878:2: ( rule__GraphicRootClassesItemsVersionsV1__V1Assignment_2 )
            // InternalGraphicParser.g:4878:3: rule__GraphicRootClassesItemsVersionsV1__V1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV1__V1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getV1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV1__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV2__Group__0"
    // InternalGraphicParser.g:4887:1: rule__GraphicRootClassesItemsVersionsV2__Group__0 : rule__GraphicRootClassesItemsVersionsV2__Group__0__Impl rule__GraphicRootClassesItemsVersionsV2__Group__1 ;
    public final void rule__GraphicRootClassesItemsVersionsV2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4891:1: ( rule__GraphicRootClassesItemsVersionsV2__Group__0__Impl rule__GraphicRootClassesItemsVersionsV2__Group__1 )
            // InternalGraphicParser.g:4892:2: rule__GraphicRootClassesItemsVersionsV2__Group__0__Impl rule__GraphicRootClassesItemsVersionsV2__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsVersionsV2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV2__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV2__Group__0__Impl"
    // InternalGraphicParser.g:4899:1: rule__GraphicRootClassesItemsVersionsV2__Group__0__Impl : ( V2 ) ;
    public final void rule__GraphicRootClassesItemsVersionsV2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4903:1: ( ( V2 ) )
            // InternalGraphicParser.g:4904:1: ( V2 )
            {
            // InternalGraphicParser.g:4904:1: ( V2 )
            // InternalGraphicParser.g:4905:2: V2
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getV2Keyword_0()); 
            match(input,V2,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getV2Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV2__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV2__Group__1"
    // InternalGraphicParser.g:4914:1: rule__GraphicRootClassesItemsVersionsV2__Group__1 : rule__GraphicRootClassesItemsVersionsV2__Group__1__Impl rule__GraphicRootClassesItemsVersionsV2__Group__2 ;
    public final void rule__GraphicRootClassesItemsVersionsV2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4918:1: ( rule__GraphicRootClassesItemsVersionsV2__Group__1__Impl rule__GraphicRootClassesItemsVersionsV2__Group__2 )
            // InternalGraphicParser.g:4919:2: rule__GraphicRootClassesItemsVersionsV2__Group__1__Impl rule__GraphicRootClassesItemsVersionsV2__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsVersionsV2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV2__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV2__Group__1__Impl"
    // InternalGraphicParser.g:4926:1: rule__GraphicRootClassesItemsVersionsV2__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsVersionsV2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4930:1: ( ( Colon ) )
            // InternalGraphicParser.g:4931:1: ( Colon )
            {
            // InternalGraphicParser.g:4931:1: ( Colon )
            // InternalGraphicParser.g:4932:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV2__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV2__Group__2"
    // InternalGraphicParser.g:4941:1: rule__GraphicRootClassesItemsVersionsV2__Group__2 : rule__GraphicRootClassesItemsVersionsV2__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsVersionsV2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4945:1: ( rule__GraphicRootClassesItemsVersionsV2__Group__2__Impl )
            // InternalGraphicParser.g:4946:2: rule__GraphicRootClassesItemsVersionsV2__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV2__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV2__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV2__Group__2__Impl"
    // InternalGraphicParser.g:4952:1: rule__GraphicRootClassesItemsVersionsV2__Group__2__Impl : ( ( rule__GraphicRootClassesItemsVersionsV2__V2Assignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsVersionsV2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4956:1: ( ( ( rule__GraphicRootClassesItemsVersionsV2__V2Assignment_2 ) ) )
            // InternalGraphicParser.g:4957:1: ( ( rule__GraphicRootClassesItemsVersionsV2__V2Assignment_2 ) )
            {
            // InternalGraphicParser.g:4957:1: ( ( rule__GraphicRootClassesItemsVersionsV2__V2Assignment_2 ) )
            // InternalGraphicParser.g:4958:2: ( rule__GraphicRootClassesItemsVersionsV2__V2Assignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getV2Assignment_2()); 
            // InternalGraphicParser.g:4959:2: ( rule__GraphicRootClassesItemsVersionsV2__V2Assignment_2 )
            // InternalGraphicParser.g:4959:3: rule__GraphicRootClassesItemsVersionsV2__V2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV2__V2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getV2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV2__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV3__Group__0"
    // InternalGraphicParser.g:4968:1: rule__GraphicRootClassesItemsVersionsV3__Group__0 : rule__GraphicRootClassesItemsVersionsV3__Group__0__Impl rule__GraphicRootClassesItemsVersionsV3__Group__1 ;
    public final void rule__GraphicRootClassesItemsVersionsV3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4972:1: ( rule__GraphicRootClassesItemsVersionsV3__Group__0__Impl rule__GraphicRootClassesItemsVersionsV3__Group__1 )
            // InternalGraphicParser.g:4973:2: rule__GraphicRootClassesItemsVersionsV3__Group__0__Impl rule__GraphicRootClassesItemsVersionsV3__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsVersionsV3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV3__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV3__Group__0__Impl"
    // InternalGraphicParser.g:4980:1: rule__GraphicRootClassesItemsVersionsV3__Group__0__Impl : ( V3 ) ;
    public final void rule__GraphicRootClassesItemsVersionsV3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4984:1: ( ( V3 ) )
            // InternalGraphicParser.g:4985:1: ( V3 )
            {
            // InternalGraphicParser.g:4985:1: ( V3 )
            // InternalGraphicParser.g:4986:2: V3
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getV3Keyword_0()); 
            match(input,V3,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getV3Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV3__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV3__Group__1"
    // InternalGraphicParser.g:4995:1: rule__GraphicRootClassesItemsVersionsV3__Group__1 : rule__GraphicRootClassesItemsVersionsV3__Group__1__Impl rule__GraphicRootClassesItemsVersionsV3__Group__2 ;
    public final void rule__GraphicRootClassesItemsVersionsV3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:4999:1: ( rule__GraphicRootClassesItemsVersionsV3__Group__1__Impl rule__GraphicRootClassesItemsVersionsV3__Group__2 )
            // InternalGraphicParser.g:5000:2: rule__GraphicRootClassesItemsVersionsV3__Group__1__Impl rule__GraphicRootClassesItemsVersionsV3__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsVersionsV3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV3__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV3__Group__1__Impl"
    // InternalGraphicParser.g:5007:1: rule__GraphicRootClassesItemsVersionsV3__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsVersionsV3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5011:1: ( ( Colon ) )
            // InternalGraphicParser.g:5012:1: ( Colon )
            {
            // InternalGraphicParser.g:5012:1: ( Colon )
            // InternalGraphicParser.g:5013:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV3__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV3__Group__2"
    // InternalGraphicParser.g:5022:1: rule__GraphicRootClassesItemsVersionsV3__Group__2 : rule__GraphicRootClassesItemsVersionsV3__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsVersionsV3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5026:1: ( rule__GraphicRootClassesItemsVersionsV3__Group__2__Impl )
            // InternalGraphicParser.g:5027:2: rule__GraphicRootClassesItemsVersionsV3__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV3__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV3__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV3__Group__2__Impl"
    // InternalGraphicParser.g:5033:1: rule__GraphicRootClassesItemsVersionsV3__Group__2__Impl : ( ( rule__GraphicRootClassesItemsVersionsV3__V3Assignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsVersionsV3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5037:1: ( ( ( rule__GraphicRootClassesItemsVersionsV3__V3Assignment_2 ) ) )
            // InternalGraphicParser.g:5038:1: ( ( rule__GraphicRootClassesItemsVersionsV3__V3Assignment_2 ) )
            {
            // InternalGraphicParser.g:5038:1: ( ( rule__GraphicRootClassesItemsVersionsV3__V3Assignment_2 ) )
            // InternalGraphicParser.g:5039:2: ( rule__GraphicRootClassesItemsVersionsV3__V3Assignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getV3Assignment_2()); 
            // InternalGraphicParser.g:5040:2: ( rule__GraphicRootClassesItemsVersionsV3__V3Assignment_2 )
            // InternalGraphicParser.g:5040:3: rule__GraphicRootClassesItemsVersionsV3__V3Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVersionsV3__V3Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getV3Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV3__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV1__Group__0"
    // InternalGraphicParser.g:5049:1: rule__GraphicRootClassesItemsVnameV1__Group__0 : rule__GraphicRootClassesItemsVnameV1__Group__0__Impl rule__GraphicRootClassesItemsVnameV1__Group__1 ;
    public final void rule__GraphicRootClassesItemsVnameV1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5053:1: ( rule__GraphicRootClassesItemsVnameV1__Group__0__Impl rule__GraphicRootClassesItemsVnameV1__Group__1 )
            // InternalGraphicParser.g:5054:2: rule__GraphicRootClassesItemsVnameV1__Group__0__Impl rule__GraphicRootClassesItemsVnameV1__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsVnameV1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV1__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV1__Group__0__Impl"
    // InternalGraphicParser.g:5061:1: rule__GraphicRootClassesItemsVnameV1__Group__0__Impl : ( V1 ) ;
    public final void rule__GraphicRootClassesItemsVnameV1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5065:1: ( ( V1 ) )
            // InternalGraphicParser.g:5066:1: ( V1 )
            {
            // InternalGraphicParser.g:5066:1: ( V1 )
            // InternalGraphicParser.g:5067:2: V1
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV1Access().getV1Keyword_0()); 
            match(input,V1,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVnameV1Access().getV1Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV1__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV1__Group__1"
    // InternalGraphicParser.g:5076:1: rule__GraphicRootClassesItemsVnameV1__Group__1 : rule__GraphicRootClassesItemsVnameV1__Group__1__Impl rule__GraphicRootClassesItemsVnameV1__Group__2 ;
    public final void rule__GraphicRootClassesItemsVnameV1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5080:1: ( rule__GraphicRootClassesItemsVnameV1__Group__1__Impl rule__GraphicRootClassesItemsVnameV1__Group__2 )
            // InternalGraphicParser.g:5081:2: rule__GraphicRootClassesItemsVnameV1__Group__1__Impl rule__GraphicRootClassesItemsVnameV1__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsVnameV1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV1__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV1__Group__1__Impl"
    // InternalGraphicParser.g:5088:1: rule__GraphicRootClassesItemsVnameV1__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsVnameV1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5092:1: ( ( Colon ) )
            // InternalGraphicParser.g:5093:1: ( Colon )
            {
            // InternalGraphicParser.g:5093:1: ( Colon )
            // InternalGraphicParser.g:5094:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV1Access().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVnameV1Access().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV1__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV1__Group__2"
    // InternalGraphicParser.g:5103:1: rule__GraphicRootClassesItemsVnameV1__Group__2 : rule__GraphicRootClassesItemsVnameV1__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsVnameV1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5107:1: ( rule__GraphicRootClassesItemsVnameV1__Group__2__Impl )
            // InternalGraphicParser.g:5108:2: rule__GraphicRootClassesItemsVnameV1__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV1__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV1__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV1__Group__2__Impl"
    // InternalGraphicParser.g:5114:1: rule__GraphicRootClassesItemsVnameV1__Group__2__Impl : ( ( rule__GraphicRootClassesItemsVnameV1__V1Assignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsVnameV1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5118:1: ( ( ( rule__GraphicRootClassesItemsVnameV1__V1Assignment_2 ) ) )
            // InternalGraphicParser.g:5119:1: ( ( rule__GraphicRootClassesItemsVnameV1__V1Assignment_2 ) )
            {
            // InternalGraphicParser.g:5119:1: ( ( rule__GraphicRootClassesItemsVnameV1__V1Assignment_2 ) )
            // InternalGraphicParser.g:5120:2: ( rule__GraphicRootClassesItemsVnameV1__V1Assignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV1Access().getV1Assignment_2()); 
            // InternalGraphicParser.g:5121:2: ( rule__GraphicRootClassesItemsVnameV1__V1Assignment_2 )
            // InternalGraphicParser.g:5121:3: rule__GraphicRootClassesItemsVnameV1__V1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV1__V1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVnameV1Access().getV1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV1__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV2__Group__0"
    // InternalGraphicParser.g:5130:1: rule__GraphicRootClassesItemsVnameV2__Group__0 : rule__GraphicRootClassesItemsVnameV2__Group__0__Impl rule__GraphicRootClassesItemsVnameV2__Group__1 ;
    public final void rule__GraphicRootClassesItemsVnameV2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5134:1: ( rule__GraphicRootClassesItemsVnameV2__Group__0__Impl rule__GraphicRootClassesItemsVnameV2__Group__1 )
            // InternalGraphicParser.g:5135:2: rule__GraphicRootClassesItemsVnameV2__Group__0__Impl rule__GraphicRootClassesItemsVnameV2__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsVnameV2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV2__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV2__Group__0__Impl"
    // InternalGraphicParser.g:5142:1: rule__GraphicRootClassesItemsVnameV2__Group__0__Impl : ( V2 ) ;
    public final void rule__GraphicRootClassesItemsVnameV2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5146:1: ( ( V2 ) )
            // InternalGraphicParser.g:5147:1: ( V2 )
            {
            // InternalGraphicParser.g:5147:1: ( V2 )
            // InternalGraphicParser.g:5148:2: V2
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV2Access().getV2Keyword_0()); 
            match(input,V2,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVnameV2Access().getV2Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV2__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV2__Group__1"
    // InternalGraphicParser.g:5157:1: rule__GraphicRootClassesItemsVnameV2__Group__1 : rule__GraphicRootClassesItemsVnameV2__Group__1__Impl rule__GraphicRootClassesItemsVnameV2__Group__2 ;
    public final void rule__GraphicRootClassesItemsVnameV2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5161:1: ( rule__GraphicRootClassesItemsVnameV2__Group__1__Impl rule__GraphicRootClassesItemsVnameV2__Group__2 )
            // InternalGraphicParser.g:5162:2: rule__GraphicRootClassesItemsVnameV2__Group__1__Impl rule__GraphicRootClassesItemsVnameV2__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsVnameV2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV2__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV2__Group__1__Impl"
    // InternalGraphicParser.g:5169:1: rule__GraphicRootClassesItemsVnameV2__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsVnameV2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5173:1: ( ( Colon ) )
            // InternalGraphicParser.g:5174:1: ( Colon )
            {
            // InternalGraphicParser.g:5174:1: ( Colon )
            // InternalGraphicParser.g:5175:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV2Access().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVnameV2Access().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV2__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV2__Group__2"
    // InternalGraphicParser.g:5184:1: rule__GraphicRootClassesItemsVnameV2__Group__2 : rule__GraphicRootClassesItemsVnameV2__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsVnameV2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5188:1: ( rule__GraphicRootClassesItemsVnameV2__Group__2__Impl )
            // InternalGraphicParser.g:5189:2: rule__GraphicRootClassesItemsVnameV2__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV2__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV2__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV2__Group__2__Impl"
    // InternalGraphicParser.g:5195:1: rule__GraphicRootClassesItemsVnameV2__Group__2__Impl : ( ( rule__GraphicRootClassesItemsVnameV2__V2Assignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsVnameV2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5199:1: ( ( ( rule__GraphicRootClassesItemsVnameV2__V2Assignment_2 ) ) )
            // InternalGraphicParser.g:5200:1: ( ( rule__GraphicRootClassesItemsVnameV2__V2Assignment_2 ) )
            {
            // InternalGraphicParser.g:5200:1: ( ( rule__GraphicRootClassesItemsVnameV2__V2Assignment_2 ) )
            // InternalGraphicParser.g:5201:2: ( rule__GraphicRootClassesItemsVnameV2__V2Assignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV2Access().getV2Assignment_2()); 
            // InternalGraphicParser.g:5202:2: ( rule__GraphicRootClassesItemsVnameV2__V2Assignment_2 )
            // InternalGraphicParser.g:5202:3: rule__GraphicRootClassesItemsVnameV2__V2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV2__V2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVnameV2Access().getV2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV2__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV3__Group__0"
    // InternalGraphicParser.g:5211:1: rule__GraphicRootClassesItemsVnameV3__Group__0 : rule__GraphicRootClassesItemsVnameV3__Group__0__Impl rule__GraphicRootClassesItemsVnameV3__Group__1 ;
    public final void rule__GraphicRootClassesItemsVnameV3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5215:1: ( rule__GraphicRootClassesItemsVnameV3__Group__0__Impl rule__GraphicRootClassesItemsVnameV3__Group__1 )
            // InternalGraphicParser.g:5216:2: rule__GraphicRootClassesItemsVnameV3__Group__0__Impl rule__GraphicRootClassesItemsVnameV3__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsVnameV3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV3__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV3__Group__0__Impl"
    // InternalGraphicParser.g:5223:1: rule__GraphicRootClassesItemsVnameV3__Group__0__Impl : ( V3 ) ;
    public final void rule__GraphicRootClassesItemsVnameV3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5227:1: ( ( V3 ) )
            // InternalGraphicParser.g:5228:1: ( V3 )
            {
            // InternalGraphicParser.g:5228:1: ( V3 )
            // InternalGraphicParser.g:5229:2: V3
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV3Access().getV3Keyword_0()); 
            match(input,V3,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVnameV3Access().getV3Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV3__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV3__Group__1"
    // InternalGraphicParser.g:5238:1: rule__GraphicRootClassesItemsVnameV3__Group__1 : rule__GraphicRootClassesItemsVnameV3__Group__1__Impl rule__GraphicRootClassesItemsVnameV3__Group__2 ;
    public final void rule__GraphicRootClassesItemsVnameV3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5242:1: ( rule__GraphicRootClassesItemsVnameV3__Group__1__Impl rule__GraphicRootClassesItemsVnameV3__Group__2 )
            // InternalGraphicParser.g:5243:2: rule__GraphicRootClassesItemsVnameV3__Group__1__Impl rule__GraphicRootClassesItemsVnameV3__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsVnameV3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV3__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV3__Group__1__Impl"
    // InternalGraphicParser.g:5250:1: rule__GraphicRootClassesItemsVnameV3__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsVnameV3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5254:1: ( ( Colon ) )
            // InternalGraphicParser.g:5255:1: ( Colon )
            {
            // InternalGraphicParser.g:5255:1: ( Colon )
            // InternalGraphicParser.g:5256:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV3Access().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsVnameV3Access().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV3__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV3__Group__2"
    // InternalGraphicParser.g:5265:1: rule__GraphicRootClassesItemsVnameV3__Group__2 : rule__GraphicRootClassesItemsVnameV3__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsVnameV3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5269:1: ( rule__GraphicRootClassesItemsVnameV3__Group__2__Impl )
            // InternalGraphicParser.g:5270:2: rule__GraphicRootClassesItemsVnameV3__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV3__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV3__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV3__Group__2__Impl"
    // InternalGraphicParser.g:5276:1: rule__GraphicRootClassesItemsVnameV3__Group__2__Impl : ( ( rule__GraphicRootClassesItemsVnameV3__V3Assignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsVnameV3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5280:1: ( ( ( rule__GraphicRootClassesItemsVnameV3__V3Assignment_2 ) ) )
            // InternalGraphicParser.g:5281:1: ( ( rule__GraphicRootClassesItemsVnameV3__V3Assignment_2 ) )
            {
            // InternalGraphicParser.g:5281:1: ( ( rule__GraphicRootClassesItemsVnameV3__V3Assignment_2 ) )
            // InternalGraphicParser.g:5282:2: ( rule__GraphicRootClassesItemsVnameV3__V3Assignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV3Access().getV3Assignment_2()); 
            // InternalGraphicParser.g:5283:2: ( rule__GraphicRootClassesItemsVnameV3__V3Assignment_2 )
            // InternalGraphicParser.g:5283:3: rule__GraphicRootClassesItemsVnameV3__V3Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsVnameV3__V3Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsVnameV3Access().getV3Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV3__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsPlanes__Group__0"
    // InternalGraphicParser.g:5292:1: rule__GraphicRootClassesItemsConstraintsPlanes__Group__0 : rule__GraphicRootClassesItemsConstraintsPlanes__Group__0__Impl rule__GraphicRootClassesItemsConstraintsPlanes__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsPlanes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5296:1: ( rule__GraphicRootClassesItemsConstraintsPlanes__Group__0__Impl rule__GraphicRootClassesItemsConstraintsPlanes__Group__1 )
            // InternalGraphicParser.g:5297:2: rule__GraphicRootClassesItemsConstraintsPlanes__Group__0__Impl rule__GraphicRootClassesItemsConstraintsPlanes__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsPlanes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsPlanes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsPlanes__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsPlanes__Group__0__Impl"
    // InternalGraphicParser.g:5304:1: rule__GraphicRootClassesItemsConstraintsPlanes__Group__0__Impl : ( Planes ) ;
    public final void rule__GraphicRootClassesItemsConstraintsPlanes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5308:1: ( ( Planes ) )
            // InternalGraphicParser.g:5309:1: ( Planes )
            {
            // InternalGraphicParser.g:5309:1: ( Planes )
            // InternalGraphicParser.g:5310:2: Planes
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getPlanesKeyword_0()); 
            match(input,Planes,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getPlanesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsPlanes__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsPlanes__Group__1"
    // InternalGraphicParser.g:5319:1: rule__GraphicRootClassesItemsConstraintsPlanes__Group__1 : rule__GraphicRootClassesItemsConstraintsPlanes__Group__1__Impl rule__GraphicRootClassesItemsConstraintsPlanes__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsPlanes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5323:1: ( rule__GraphicRootClassesItemsConstraintsPlanes__Group__1__Impl rule__GraphicRootClassesItemsConstraintsPlanes__Group__2 )
            // InternalGraphicParser.g:5324:2: rule__GraphicRootClassesItemsConstraintsPlanes__Group__1__Impl rule__GraphicRootClassesItemsConstraintsPlanes__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConstraintsPlanes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsPlanes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsPlanes__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsPlanes__Group__1__Impl"
    // InternalGraphicParser.g:5331:1: rule__GraphicRootClassesItemsConstraintsPlanes__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsPlanes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5335:1: ( ( Colon ) )
            // InternalGraphicParser.g:5336:1: ( Colon )
            {
            // InternalGraphicParser.g:5336:1: ( Colon )
            // InternalGraphicParser.g:5337:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsPlanes__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsPlanes__Group__2"
    // InternalGraphicParser.g:5346:1: rule__GraphicRootClassesItemsConstraintsPlanes__Group__2 : rule__GraphicRootClassesItemsConstraintsPlanes__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsPlanes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5350:1: ( rule__GraphicRootClassesItemsConstraintsPlanes__Group__2__Impl )
            // InternalGraphicParser.g:5351:2: rule__GraphicRootClassesItemsConstraintsPlanes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsPlanes__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsPlanes__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsPlanes__Group__2__Impl"
    // InternalGraphicParser.g:5357:1: rule__GraphicRootClassesItemsConstraintsPlanes__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsPlanes__PlanesAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsPlanes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5361:1: ( ( ( rule__GraphicRootClassesItemsConstraintsPlanes__PlanesAssignment_2 ) ) )
            // InternalGraphicParser.g:5362:1: ( ( rule__GraphicRootClassesItemsConstraintsPlanes__PlanesAssignment_2 ) )
            {
            // InternalGraphicParser.g:5362:1: ( ( rule__GraphicRootClassesItemsConstraintsPlanes__PlanesAssignment_2 ) )
            // InternalGraphicParser.g:5363:2: ( rule__GraphicRootClassesItemsConstraintsPlanes__PlanesAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getPlanesAssignment_2()); 
            // InternalGraphicParser.g:5364:2: ( rule__GraphicRootClassesItemsConstraintsPlanes__PlanesAssignment_2 )
            // InternalGraphicParser.g:5364:3: rule__GraphicRootClassesItemsConstraintsPlanes__PlanesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsPlanes__PlanesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getPlanesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsPlanes__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsIlumination__Group__0"
    // InternalGraphicParser.g:5373:1: rule__GraphicRootClassesItemsConstraintsIlumination__Group__0 : rule__GraphicRootClassesItemsConstraintsIlumination__Group__0__Impl rule__GraphicRootClassesItemsConstraintsIlumination__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsIlumination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5377:1: ( rule__GraphicRootClassesItemsConstraintsIlumination__Group__0__Impl rule__GraphicRootClassesItemsConstraintsIlumination__Group__1 )
            // InternalGraphicParser.g:5378:2: rule__GraphicRootClassesItemsConstraintsIlumination__Group__0__Impl rule__GraphicRootClassesItemsConstraintsIlumination__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsIlumination__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsIlumination__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsIlumination__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsIlumination__Group__0__Impl"
    // InternalGraphicParser.g:5385:1: rule__GraphicRootClassesItemsConstraintsIlumination__Group__0__Impl : ( Ilumination ) ;
    public final void rule__GraphicRootClassesItemsConstraintsIlumination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5389:1: ( ( Ilumination ) )
            // InternalGraphicParser.g:5390:1: ( Ilumination )
            {
            // InternalGraphicParser.g:5390:1: ( Ilumination )
            // InternalGraphicParser.g:5391:2: Ilumination
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getIluminationKeyword_0()); 
            match(input,Ilumination,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getIluminationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsIlumination__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsIlumination__Group__1"
    // InternalGraphicParser.g:5400:1: rule__GraphicRootClassesItemsConstraintsIlumination__Group__1 : rule__GraphicRootClassesItemsConstraintsIlumination__Group__1__Impl rule__GraphicRootClassesItemsConstraintsIlumination__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsIlumination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5404:1: ( rule__GraphicRootClassesItemsConstraintsIlumination__Group__1__Impl rule__GraphicRootClassesItemsConstraintsIlumination__Group__2 )
            // InternalGraphicParser.g:5405:2: rule__GraphicRootClassesItemsConstraintsIlumination__Group__1__Impl rule__GraphicRootClassesItemsConstraintsIlumination__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConstraintsIlumination__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsIlumination__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsIlumination__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsIlumination__Group__1__Impl"
    // InternalGraphicParser.g:5412:1: rule__GraphicRootClassesItemsConstraintsIlumination__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsIlumination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5416:1: ( ( Colon ) )
            // InternalGraphicParser.g:5417:1: ( Colon )
            {
            // InternalGraphicParser.g:5417:1: ( Colon )
            // InternalGraphicParser.g:5418:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsIlumination__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsIlumination__Group__2"
    // InternalGraphicParser.g:5427:1: rule__GraphicRootClassesItemsConstraintsIlumination__Group__2 : rule__GraphicRootClassesItemsConstraintsIlumination__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsIlumination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5431:1: ( rule__GraphicRootClassesItemsConstraintsIlumination__Group__2__Impl )
            // InternalGraphicParser.g:5432:2: rule__GraphicRootClassesItemsConstraintsIlumination__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsIlumination__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsIlumination__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsIlumination__Group__2__Impl"
    // InternalGraphicParser.g:5438:1: rule__GraphicRootClassesItemsConstraintsIlumination__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsIlumination__IluminationAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsIlumination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5442:1: ( ( ( rule__GraphicRootClassesItemsConstraintsIlumination__IluminationAssignment_2 ) ) )
            // InternalGraphicParser.g:5443:1: ( ( rule__GraphicRootClassesItemsConstraintsIlumination__IluminationAssignment_2 ) )
            {
            // InternalGraphicParser.g:5443:1: ( ( rule__GraphicRootClassesItemsConstraintsIlumination__IluminationAssignment_2 ) )
            // InternalGraphicParser.g:5444:2: ( rule__GraphicRootClassesItemsConstraintsIlumination__IluminationAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getIluminationAssignment_2()); 
            // InternalGraphicParser.g:5445:2: ( rule__GraphicRootClassesItemsConstraintsIlumination__IluminationAssignment_2 )
            // InternalGraphicParser.g:5445:3: rule__GraphicRootClassesItemsConstraintsIlumination__IluminationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsIlumination__IluminationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getIluminationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsIlumination__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0"
    // InternalGraphicParser.g:5454:1: rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0 : rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0__Impl rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5458:1: ( rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0__Impl rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1 )
            // InternalGraphicParser.g:5459:2: rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0__Impl rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0__Impl"
    // InternalGraphicParser.g:5466:1: rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0__Impl : ( SizeMax ) ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5470:1: ( ( SizeMax ) )
            // InternalGraphicParser.g:5471:1: ( SizeMax )
            {
            // InternalGraphicParser.g:5471:1: ( SizeMax )
            // InternalGraphicParser.g:5472:2: SizeMax
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getSizeMaxKeyword_0()); 
            match(input,SizeMax,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getSizeMaxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMax__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1"
    // InternalGraphicParser.g:5481:1: rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1 : rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1__Impl rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5485:1: ( rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1__Impl rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2 )
            // InternalGraphicParser.g:5486:2: rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1__Impl rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1__Impl"
    // InternalGraphicParser.g:5493:1: rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5497:1: ( ( Colon ) )
            // InternalGraphicParser.g:5498:1: ( Colon )
            {
            // InternalGraphicParser.g:5498:1: ( Colon )
            // InternalGraphicParser.g:5499:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMax__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2"
    // InternalGraphicParser.g:5508:1: rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2 : rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5512:1: ( rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2__Impl )
            // InternalGraphicParser.g:5513:2: rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2__Impl"
    // InternalGraphicParser.g:5519:1: rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsSizeMax__SizeMaxAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5523:1: ( ( ( rule__GraphicRootClassesItemsConstraintsSizeMax__SizeMaxAssignment_2 ) ) )
            // InternalGraphicParser.g:5524:1: ( ( rule__GraphicRootClassesItemsConstraintsSizeMax__SizeMaxAssignment_2 ) )
            {
            // InternalGraphicParser.g:5524:1: ( ( rule__GraphicRootClassesItemsConstraintsSizeMax__SizeMaxAssignment_2 ) )
            // InternalGraphicParser.g:5525:2: ( rule__GraphicRootClassesItemsConstraintsSizeMax__SizeMaxAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getSizeMaxAssignment_2()); 
            // InternalGraphicParser.g:5526:2: ( rule__GraphicRootClassesItemsConstraintsSizeMax__SizeMaxAssignment_2 )
            // InternalGraphicParser.g:5526:3: rule__GraphicRootClassesItemsConstraintsSizeMax__SizeMaxAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeMax__SizeMaxAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getSizeMaxAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMax__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0"
    // InternalGraphicParser.g:5535:1: rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0 : rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0__Impl rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5539:1: ( rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0__Impl rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1 )
            // InternalGraphicParser.g:5540:2: rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0__Impl rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0__Impl"
    // InternalGraphicParser.g:5547:1: rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0__Impl : ( SizeMin ) ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5551:1: ( ( SizeMin ) )
            // InternalGraphicParser.g:5552:1: ( SizeMin )
            {
            // InternalGraphicParser.g:5552:1: ( SizeMin )
            // InternalGraphicParser.g:5553:2: SizeMin
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getSizeMinKeyword_0()); 
            match(input,SizeMin,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getSizeMinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMin__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1"
    // InternalGraphicParser.g:5562:1: rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1 : rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1__Impl rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5566:1: ( rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1__Impl rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2 )
            // InternalGraphicParser.g:5567:2: rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1__Impl rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1__Impl"
    // InternalGraphicParser.g:5574:1: rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5578:1: ( ( Colon ) )
            // InternalGraphicParser.g:5579:1: ( Colon )
            {
            // InternalGraphicParser.g:5579:1: ( Colon )
            // InternalGraphicParser.g:5580:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMin__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2"
    // InternalGraphicParser.g:5589:1: rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2 : rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5593:1: ( rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2__Impl )
            // InternalGraphicParser.g:5594:2: rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2__Impl"
    // InternalGraphicParser.g:5600:1: rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsSizeMin__SizeMinAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5604:1: ( ( ( rule__GraphicRootClassesItemsConstraintsSizeMin__SizeMinAssignment_2 ) ) )
            // InternalGraphicParser.g:5605:1: ( ( rule__GraphicRootClassesItemsConstraintsSizeMin__SizeMinAssignment_2 ) )
            {
            // InternalGraphicParser.g:5605:1: ( ( rule__GraphicRootClassesItemsConstraintsSizeMin__SizeMinAssignment_2 ) )
            // InternalGraphicParser.g:5606:2: ( rule__GraphicRootClassesItemsConstraintsSizeMin__SizeMinAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getSizeMinAssignment_2()); 
            // InternalGraphicParser.g:5607:2: ( rule__GraphicRootClassesItemsConstraintsSizeMin__SizeMinAssignment_2 )
            // InternalGraphicParser.g:5607:3: rule__GraphicRootClassesItemsConstraintsSizeMin__SizeMinAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeMin__SizeMinAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getSizeMinAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMin__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0"
    // InternalGraphicParser.g:5616:1: rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0 : rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0__Impl rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5620:1: ( rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0__Impl rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1 )
            // InternalGraphicParser.g:5621:2: rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0__Impl rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0__Impl"
    // InternalGraphicParser.g:5628:1: rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0__Impl : ( SizeInit ) ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5632:1: ( ( SizeInit ) )
            // InternalGraphicParser.g:5633:1: ( SizeInit )
            {
            // InternalGraphicParser.g:5633:1: ( SizeInit )
            // InternalGraphicParser.g:5634:2: SizeInit
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getSizeInitKeyword_0()); 
            match(input,SizeInit,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getSizeInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeInit__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1"
    // InternalGraphicParser.g:5643:1: rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1 : rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1__Impl rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5647:1: ( rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1__Impl rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2 )
            // InternalGraphicParser.g:5648:2: rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1__Impl rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1__Impl"
    // InternalGraphicParser.g:5655:1: rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5659:1: ( ( Colon ) )
            // InternalGraphicParser.g:5660:1: ( Colon )
            {
            // InternalGraphicParser.g:5660:1: ( Colon )
            // InternalGraphicParser.g:5661:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeInit__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2"
    // InternalGraphicParser.g:5670:1: rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2 : rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5674:1: ( rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2__Impl )
            // InternalGraphicParser.g:5675:2: rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2__Impl"
    // InternalGraphicParser.g:5681:1: rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsSizeInit__SizeInitAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5685:1: ( ( ( rule__GraphicRootClassesItemsConstraintsSizeInit__SizeInitAssignment_2 ) ) )
            // InternalGraphicParser.g:5686:1: ( ( rule__GraphicRootClassesItemsConstraintsSizeInit__SizeInitAssignment_2 ) )
            {
            // InternalGraphicParser.g:5686:1: ( ( rule__GraphicRootClassesItemsConstraintsSizeInit__SizeInitAssignment_2 ) )
            // InternalGraphicParser.g:5687:2: ( rule__GraphicRootClassesItemsConstraintsSizeInit__SizeInitAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getSizeInitAssignment_2()); 
            // InternalGraphicParser.g:5688:2: ( rule__GraphicRootClassesItemsConstraintsSizeInit__SizeInitAssignment_2 )
            // InternalGraphicParser.g:5688:3: rule__GraphicRootClassesItemsConstraintsSizeInit__SizeInitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsSizeInit__SizeInitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getSizeInitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeInit__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0"
    // InternalGraphicParser.g:5697:1: rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0 : rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0__Impl rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5701:1: ( rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0__Impl rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1 )
            // InternalGraphicParser.g:5702:2: rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0__Impl rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0__Impl"
    // InternalGraphicParser.g:5709:1: rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0__Impl : ( Overlapping ) ;
    public final void rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5713:1: ( ( Overlapping ) )
            // InternalGraphicParser.g:5714:1: ( Overlapping )
            {
            // InternalGraphicParser.g:5714:1: ( Overlapping )
            // InternalGraphicParser.g:5715:2: Overlapping
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getOverlappingKeyword_0()); 
            match(input,Overlapping,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getOverlappingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsOverlapping__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1"
    // InternalGraphicParser.g:5724:1: rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1 : rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1__Impl rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5728:1: ( rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1__Impl rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2 )
            // InternalGraphicParser.g:5729:2: rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1__Impl rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1__Impl"
    // InternalGraphicParser.g:5736:1: rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5740:1: ( ( Colon ) )
            // InternalGraphicParser.g:5741:1: ( Colon )
            {
            // InternalGraphicParser.g:5741:1: ( Colon )
            // InternalGraphicParser.g:5742:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsOverlapping__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2"
    // InternalGraphicParser.g:5751:1: rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2 : rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5755:1: ( rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2__Impl )
            // InternalGraphicParser.g:5756:2: rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2__Impl"
    // InternalGraphicParser.g:5762:1: rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsOverlapping__OverlappingAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5766:1: ( ( ( rule__GraphicRootClassesItemsConstraintsOverlapping__OverlappingAssignment_2 ) ) )
            // InternalGraphicParser.g:5767:1: ( ( rule__GraphicRootClassesItemsConstraintsOverlapping__OverlappingAssignment_2 ) )
            {
            // InternalGraphicParser.g:5767:1: ( ( rule__GraphicRootClassesItemsConstraintsOverlapping__OverlappingAssignment_2 ) )
            // InternalGraphicParser.g:5768:2: ( rule__GraphicRootClassesItemsConstraintsOverlapping__OverlappingAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getOverlappingAssignment_2()); 
            // InternalGraphicParser.g:5769:2: ( rule__GraphicRootClassesItemsConstraintsOverlapping__OverlappingAssignment_2 )
            // InternalGraphicParser.g:5769:3: rule__GraphicRootClassesItemsConstraintsOverlapping__OverlappingAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsOverlapping__OverlappingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getOverlappingAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsOverlapping__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0"
    // InternalGraphicParser.g:5778:1: rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0 : rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0__Impl rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5782:1: ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0__Impl rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1 )
            // InternalGraphicParser.g:5783:2: rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0__Impl rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0__Impl"
    // InternalGraphicParser.g:5790:1: rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0__Impl : ( XToOriginPos ) ;
    public final void rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5794:1: ( ( XToOriginPos ) )
            // InternalGraphicParser.g:5795:1: ( XToOriginPos )
            {
            // InternalGraphicParser.g:5795:1: ( XToOriginPos )
            // InternalGraphicParser.g:5796:2: XToOriginPos
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getXToOriginPosKeyword_0()); 
            match(input,XToOriginPos,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getXToOriginPosKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1"
    // InternalGraphicParser.g:5805:1: rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1 : rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1__Impl rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5809:1: ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1__Impl rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2 )
            // InternalGraphicParser.g:5810:2: rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1__Impl rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1__Impl"
    // InternalGraphicParser.g:5817:1: rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5821:1: ( ( Colon ) )
            // InternalGraphicParser.g:5822:1: ( Colon )
            {
            // InternalGraphicParser.g:5822:1: ( Colon )
            // InternalGraphicParser.g:5823:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2"
    // InternalGraphicParser.g:5832:1: rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2 : rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5836:1: ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2__Impl )
            // InternalGraphicParser.g:5837:2: rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2__Impl"
    // InternalGraphicParser.g:5843:1: rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__XToOriginPosAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5847:1: ( ( ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__XToOriginPosAssignment_2 ) ) )
            // InternalGraphicParser.g:5848:1: ( ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__XToOriginPosAssignment_2 ) )
            {
            // InternalGraphicParser.g:5848:1: ( ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__XToOriginPosAssignment_2 ) )
            // InternalGraphicParser.g:5849:2: ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__XToOriginPosAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getXToOriginPosAssignment_2()); 
            // InternalGraphicParser.g:5850:2: ( rule__GraphicRootClassesItemsConstraintsXToOriginPos__XToOriginPosAssignment_2 )
            // InternalGraphicParser.g:5850:3: rule__GraphicRootClassesItemsConstraintsXToOriginPos__XToOriginPosAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsXToOriginPos__XToOriginPosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getXToOriginPosAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsXToOriginPos__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0"
    // InternalGraphicParser.g:5859:1: rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0 : rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0__Impl rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5863:1: ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0__Impl rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1 )
            // InternalGraphicParser.g:5864:2: rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0__Impl rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0__Impl"
    // InternalGraphicParser.g:5871:1: rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0__Impl : ( YToOriginPos ) ;
    public final void rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5875:1: ( ( YToOriginPos ) )
            // InternalGraphicParser.g:5876:1: ( YToOriginPos )
            {
            // InternalGraphicParser.g:5876:1: ( YToOriginPos )
            // InternalGraphicParser.g:5877:2: YToOriginPos
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getYToOriginPosKeyword_0()); 
            match(input,YToOriginPos,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getYToOriginPosKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1"
    // InternalGraphicParser.g:5886:1: rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1 : rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1__Impl rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5890:1: ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1__Impl rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2 )
            // InternalGraphicParser.g:5891:2: rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1__Impl rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1__Impl"
    // InternalGraphicParser.g:5898:1: rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5902:1: ( ( Colon ) )
            // InternalGraphicParser.g:5903:1: ( Colon )
            {
            // InternalGraphicParser.g:5903:1: ( Colon )
            // InternalGraphicParser.g:5904:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2"
    // InternalGraphicParser.g:5913:1: rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2 : rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5917:1: ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2__Impl )
            // InternalGraphicParser.g:5918:2: rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2__Impl"
    // InternalGraphicParser.g:5924:1: rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__YToOriginPosAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5928:1: ( ( ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__YToOriginPosAssignment_2 ) ) )
            // InternalGraphicParser.g:5929:1: ( ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__YToOriginPosAssignment_2 ) )
            {
            // InternalGraphicParser.g:5929:1: ( ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__YToOriginPosAssignment_2 ) )
            // InternalGraphicParser.g:5930:2: ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__YToOriginPosAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getYToOriginPosAssignment_2()); 
            // InternalGraphicParser.g:5931:2: ( rule__GraphicRootClassesItemsConstraintsYToOriginPos__YToOriginPosAssignment_2 )
            // InternalGraphicParser.g:5931:3: rule__GraphicRootClassesItemsConstraintsYToOriginPos__YToOriginPosAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsYToOriginPos__YToOriginPosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getYToOriginPosAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsYToOriginPos__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0"
    // InternalGraphicParser.g:5940:1: rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0 : rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0__Impl rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5944:1: ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0__Impl rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1 )
            // InternalGraphicParser.g:5945:2: rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0__Impl rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0__Impl"
    // InternalGraphicParser.g:5952:1: rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0__Impl : ( ZToOriginPos ) ;
    public final void rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5956:1: ( ( ZToOriginPos ) )
            // InternalGraphicParser.g:5957:1: ( ZToOriginPos )
            {
            // InternalGraphicParser.g:5957:1: ( ZToOriginPos )
            // InternalGraphicParser.g:5958:2: ZToOriginPos
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getZToOriginPosKeyword_0()); 
            match(input,ZToOriginPos,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getZToOriginPosKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1"
    // InternalGraphicParser.g:5967:1: rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1 : rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1__Impl rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5971:1: ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1__Impl rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2 )
            // InternalGraphicParser.g:5972:2: rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1__Impl rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1__Impl"
    // InternalGraphicParser.g:5979:1: rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5983:1: ( ( Colon ) )
            // InternalGraphicParser.g:5984:1: ( Colon )
            {
            // InternalGraphicParser.g:5984:1: ( Colon )
            // InternalGraphicParser.g:5985:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2"
    // InternalGraphicParser.g:5994:1: rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2 : rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:5998:1: ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2__Impl )
            // InternalGraphicParser.g:5999:2: rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2__Impl"
    // InternalGraphicParser.g:6005:1: rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__ZToOriginPosAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6009:1: ( ( ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__ZToOriginPosAssignment_2 ) ) )
            // InternalGraphicParser.g:6010:1: ( ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__ZToOriginPosAssignment_2 ) )
            {
            // InternalGraphicParser.g:6010:1: ( ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__ZToOriginPosAssignment_2 ) )
            // InternalGraphicParser.g:6011:2: ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__ZToOriginPosAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getZToOriginPosAssignment_2()); 
            // InternalGraphicParser.g:6012:2: ( rule__GraphicRootClassesItemsConstraintsZToOriginPos__ZToOriginPosAssignment_2 )
            // InternalGraphicParser.g:6012:3: rule__GraphicRootClassesItemsConstraintsZToOriginPos__ZToOriginPosAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsZToOriginPos__ZToOriginPosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getZToOriginPosAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsZToOriginPos__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsRotation__Group__0"
    // InternalGraphicParser.g:6021:1: rule__GraphicRootClassesItemsConstraintsRotation__Group__0 : rule__GraphicRootClassesItemsConstraintsRotation__Group__0__Impl rule__GraphicRootClassesItemsConstraintsRotation__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsRotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6025:1: ( rule__GraphicRootClassesItemsConstraintsRotation__Group__0__Impl rule__GraphicRootClassesItemsConstraintsRotation__Group__1 )
            // InternalGraphicParser.g:6026:2: rule__GraphicRootClassesItemsConstraintsRotation__Group__0__Impl rule__GraphicRootClassesItemsConstraintsRotation__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsRotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsRotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsRotation__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsRotation__Group__0__Impl"
    // InternalGraphicParser.g:6033:1: rule__GraphicRootClassesItemsConstraintsRotation__Group__0__Impl : ( Rotation ) ;
    public final void rule__GraphicRootClassesItemsConstraintsRotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6037:1: ( ( Rotation ) )
            // InternalGraphicParser.g:6038:1: ( Rotation )
            {
            // InternalGraphicParser.g:6038:1: ( Rotation )
            // InternalGraphicParser.g:6039:2: Rotation
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getRotationKeyword_0()); 
            match(input,Rotation,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getRotationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsRotation__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsRotation__Group__1"
    // InternalGraphicParser.g:6048:1: rule__GraphicRootClassesItemsConstraintsRotation__Group__1 : rule__GraphicRootClassesItemsConstraintsRotation__Group__1__Impl rule__GraphicRootClassesItemsConstraintsRotation__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsRotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6052:1: ( rule__GraphicRootClassesItemsConstraintsRotation__Group__1__Impl rule__GraphicRootClassesItemsConstraintsRotation__Group__2 )
            // InternalGraphicParser.g:6053:2: rule__GraphicRootClassesItemsConstraintsRotation__Group__1__Impl rule__GraphicRootClassesItemsConstraintsRotation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConstraintsRotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsRotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsRotation__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsRotation__Group__1__Impl"
    // InternalGraphicParser.g:6060:1: rule__GraphicRootClassesItemsConstraintsRotation__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsRotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6064:1: ( ( Colon ) )
            // InternalGraphicParser.g:6065:1: ( Colon )
            {
            // InternalGraphicParser.g:6065:1: ( Colon )
            // InternalGraphicParser.g:6066:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsRotation__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsRotation__Group__2"
    // InternalGraphicParser.g:6075:1: rule__GraphicRootClassesItemsConstraintsRotation__Group__2 : rule__GraphicRootClassesItemsConstraintsRotation__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsRotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6079:1: ( rule__GraphicRootClassesItemsConstraintsRotation__Group__2__Impl )
            // InternalGraphicParser.g:6080:2: rule__GraphicRootClassesItemsConstraintsRotation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsRotation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsRotation__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsRotation__Group__2__Impl"
    // InternalGraphicParser.g:6086:1: rule__GraphicRootClassesItemsConstraintsRotation__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsRotation__RotationAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsRotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6090:1: ( ( ( rule__GraphicRootClassesItemsConstraintsRotation__RotationAssignment_2 ) ) )
            // InternalGraphicParser.g:6091:1: ( ( rule__GraphicRootClassesItemsConstraintsRotation__RotationAssignment_2 ) )
            {
            // InternalGraphicParser.g:6091:1: ( ( rule__GraphicRootClassesItemsConstraintsRotation__RotationAssignment_2 ) )
            // InternalGraphicParser.g:6092:2: ( rule__GraphicRootClassesItemsConstraintsRotation__RotationAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getRotationAssignment_2()); 
            // InternalGraphicParser.g:6093:2: ( rule__GraphicRootClassesItemsConstraintsRotation__RotationAssignment_2 )
            // InternalGraphicParser.g:6093:3: rule__GraphicRootClassesItemsConstraintsRotation__RotationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsRotation__RotationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getRotationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsRotation__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsText__Group__0"
    // InternalGraphicParser.g:6102:1: rule__GraphicRootClassesItemsConstraintsText__Group__0 : rule__GraphicRootClassesItemsConstraintsText__Group__0__Impl rule__GraphicRootClassesItemsConstraintsText__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6106:1: ( rule__GraphicRootClassesItemsConstraintsText__Group__0__Impl rule__GraphicRootClassesItemsConstraintsText__Group__1 )
            // InternalGraphicParser.g:6107:2: rule__GraphicRootClassesItemsConstraintsText__Group__0__Impl rule__GraphicRootClassesItemsConstraintsText__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsText__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsText__Group__0__Impl"
    // InternalGraphicParser.g:6114:1: rule__GraphicRootClassesItemsConstraintsText__Group__0__Impl : ( Text ) ;
    public final void rule__GraphicRootClassesItemsConstraintsText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6118:1: ( ( Text ) )
            // InternalGraphicParser.g:6119:1: ( Text )
            {
            // InternalGraphicParser.g:6119:1: ( Text )
            // InternalGraphicParser.g:6120:2: Text
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getTextKeyword_0()); 
            match(input,Text,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsText__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsText__Group__1"
    // InternalGraphicParser.g:6129:1: rule__GraphicRootClassesItemsConstraintsText__Group__1 : rule__GraphicRootClassesItemsConstraintsText__Group__1__Impl rule__GraphicRootClassesItemsConstraintsText__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6133:1: ( rule__GraphicRootClassesItemsConstraintsText__Group__1__Impl rule__GraphicRootClassesItemsConstraintsText__Group__2 )
            // InternalGraphicParser.g:6134:2: rule__GraphicRootClassesItemsConstraintsText__Group__1__Impl rule__GraphicRootClassesItemsConstraintsText__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConstraintsText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsText__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsText__Group__1__Impl"
    // InternalGraphicParser.g:6141:1: rule__GraphicRootClassesItemsConstraintsText__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6145:1: ( ( Colon ) )
            // InternalGraphicParser.g:6146:1: ( Colon )
            {
            // InternalGraphicParser.g:6146:1: ( Colon )
            // InternalGraphicParser.g:6147:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsText__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsText__Group__2"
    // InternalGraphicParser.g:6156:1: rule__GraphicRootClassesItemsConstraintsText__Group__2 : rule__GraphicRootClassesItemsConstraintsText__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6160:1: ( rule__GraphicRootClassesItemsConstraintsText__Group__2__Impl )
            // InternalGraphicParser.g:6161:2: rule__GraphicRootClassesItemsConstraintsText__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsText__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsText__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsText__Group__2__Impl"
    // InternalGraphicParser.g:6167:1: rule__GraphicRootClassesItemsConstraintsText__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsText__TextAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6171:1: ( ( ( rule__GraphicRootClassesItemsConstraintsText__TextAssignment_2 ) ) )
            // InternalGraphicParser.g:6172:1: ( ( rule__GraphicRootClassesItemsConstraintsText__TextAssignment_2 ) )
            {
            // InternalGraphicParser.g:6172:1: ( ( rule__GraphicRootClassesItemsConstraintsText__TextAssignment_2 ) )
            // InternalGraphicParser.g:6173:2: ( rule__GraphicRootClassesItemsConstraintsText__TextAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getTextAssignment_2()); 
            // InternalGraphicParser.g:6174:2: ( rule__GraphicRootClassesItemsConstraintsText__TextAssignment_2 )
            // InternalGraphicParser.g:6174:3: rule__GraphicRootClassesItemsConstraintsText__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsText__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsText__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsTrim__Group__0"
    // InternalGraphicParser.g:6183:1: rule__GraphicRootClassesItemsConstraintsTrim__Group__0 : rule__GraphicRootClassesItemsConstraintsTrim__Group__0__Impl rule__GraphicRootClassesItemsConstraintsTrim__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsTrim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6187:1: ( rule__GraphicRootClassesItemsConstraintsTrim__Group__0__Impl rule__GraphicRootClassesItemsConstraintsTrim__Group__1 )
            // InternalGraphicParser.g:6188:2: rule__GraphicRootClassesItemsConstraintsTrim__Group__0__Impl rule__GraphicRootClassesItemsConstraintsTrim__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsTrim__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsTrim__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsTrim__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsTrim__Group__0__Impl"
    // InternalGraphicParser.g:6195:1: rule__GraphicRootClassesItemsConstraintsTrim__Group__0__Impl : ( Trim ) ;
    public final void rule__GraphicRootClassesItemsConstraintsTrim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6199:1: ( ( Trim ) )
            // InternalGraphicParser.g:6200:1: ( Trim )
            {
            // InternalGraphicParser.g:6200:1: ( Trim )
            // InternalGraphicParser.g:6201:2: Trim
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getTrimKeyword_0()); 
            match(input,Trim,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getTrimKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsTrim__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsTrim__Group__1"
    // InternalGraphicParser.g:6210:1: rule__GraphicRootClassesItemsConstraintsTrim__Group__1 : rule__GraphicRootClassesItemsConstraintsTrim__Group__1__Impl rule__GraphicRootClassesItemsConstraintsTrim__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsTrim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6214:1: ( rule__GraphicRootClassesItemsConstraintsTrim__Group__1__Impl rule__GraphicRootClassesItemsConstraintsTrim__Group__2 )
            // InternalGraphicParser.g:6215:2: rule__GraphicRootClassesItemsConstraintsTrim__Group__1__Impl rule__GraphicRootClassesItemsConstraintsTrim__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__GraphicRootClassesItemsConstraintsTrim__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsTrim__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsTrim__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsTrim__Group__1__Impl"
    // InternalGraphicParser.g:6222:1: rule__GraphicRootClassesItemsConstraintsTrim__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsTrim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6226:1: ( ( Colon ) )
            // InternalGraphicParser.g:6227:1: ( Colon )
            {
            // InternalGraphicParser.g:6227:1: ( Colon )
            // InternalGraphicParser.g:6228:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsTrim__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsTrim__Group__2"
    // InternalGraphicParser.g:6237:1: rule__GraphicRootClassesItemsConstraintsTrim__Group__2 : rule__GraphicRootClassesItemsConstraintsTrim__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsTrim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6241:1: ( rule__GraphicRootClassesItemsConstraintsTrim__Group__2__Impl )
            // InternalGraphicParser.g:6242:2: rule__GraphicRootClassesItemsConstraintsTrim__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsTrim__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsTrim__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsTrim__Group__2__Impl"
    // InternalGraphicParser.g:6248:1: rule__GraphicRootClassesItemsConstraintsTrim__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsTrim__TrimAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsTrim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6252:1: ( ( ( rule__GraphicRootClassesItemsConstraintsTrim__TrimAssignment_2 ) ) )
            // InternalGraphicParser.g:6253:1: ( ( rule__GraphicRootClassesItemsConstraintsTrim__TrimAssignment_2 ) )
            {
            // InternalGraphicParser.g:6253:1: ( ( rule__GraphicRootClassesItemsConstraintsTrim__TrimAssignment_2 ) )
            // InternalGraphicParser.g:6254:2: ( rule__GraphicRootClassesItemsConstraintsTrim__TrimAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getTrimAssignment_2()); 
            // InternalGraphicParser.g:6255:2: ( rule__GraphicRootClassesItemsConstraintsTrim__TrimAssignment_2 )
            // InternalGraphicParser.g:6255:3: rule__GraphicRootClassesItemsConstraintsTrim__TrimAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsTrim__TrimAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getTrimAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsTrim__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0"
    // InternalGraphicParser.g:6264:1: rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0 : rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0__Impl rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6268:1: ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0__Impl rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1 )
            // InternalGraphicParser.g:6269:2: rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0__Impl rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0__Impl"
    // InternalGraphicParser.g:6276:1: rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0__Impl : ( CategoryBitMask ) ;
    public final void rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6280:1: ( ( CategoryBitMask ) )
            // InternalGraphicParser.g:6281:1: ( CategoryBitMask )
            {
            // InternalGraphicParser.g:6281:1: ( CategoryBitMask )
            // InternalGraphicParser.g:6282:2: CategoryBitMask
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getCategoryBitMaskKeyword_0()); 
            match(input,CategoryBitMask,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getCategoryBitMaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1"
    // InternalGraphicParser.g:6291:1: rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1 : rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1__Impl rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6295:1: ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1__Impl rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2 )
            // InternalGraphicParser.g:6296:2: rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1__Impl rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1__Impl"
    // InternalGraphicParser.g:6303:1: rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6307:1: ( ( Colon ) )
            // InternalGraphicParser.g:6308:1: ( Colon )
            {
            // InternalGraphicParser.g:6308:1: ( Colon )
            // InternalGraphicParser.g:6309:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2"
    // InternalGraphicParser.g:6318:1: rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2 : rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6322:1: ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2__Impl )
            // InternalGraphicParser.g:6323:2: rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2__Impl"
    // InternalGraphicParser.g:6329:1: rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__CategoryBitMaskAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6333:1: ( ( ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__CategoryBitMaskAssignment_2 ) ) )
            // InternalGraphicParser.g:6334:1: ( ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__CategoryBitMaskAssignment_2 ) )
            {
            // InternalGraphicParser.g:6334:1: ( ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__CategoryBitMaskAssignment_2 ) )
            // InternalGraphicParser.g:6335:2: ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__CategoryBitMaskAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getCategoryBitMaskAssignment_2()); 
            // InternalGraphicParser.g:6336:2: ( rule__GraphicRootClassesItemsConstraintsCategoryBitMask__CategoryBitMaskAssignment_2 )
            // InternalGraphicParser.g:6336:3: rule__GraphicRootClassesItemsConstraintsCategoryBitMask__CategoryBitMaskAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsCategoryBitMask__CategoryBitMaskAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getCategoryBitMaskAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0"
    // InternalGraphicParser.g:6345:1: rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0 : rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0__Impl rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6349:1: ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0__Impl rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1 )
            // InternalGraphicParser.g:6350:2: rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0__Impl rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0__Impl"
    // InternalGraphicParser.g:6357:1: rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0__Impl : ( CollisionBitMask ) ;
    public final void rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6361:1: ( ( CollisionBitMask ) )
            // InternalGraphicParser.g:6362:1: ( CollisionBitMask )
            {
            // InternalGraphicParser.g:6362:1: ( CollisionBitMask )
            // InternalGraphicParser.g:6363:2: CollisionBitMask
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getCollisionBitMaskKeyword_0()); 
            match(input,CollisionBitMask,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getCollisionBitMaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1"
    // InternalGraphicParser.g:6372:1: rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1 : rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1__Impl rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6376:1: ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1__Impl rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2 )
            // InternalGraphicParser.g:6377:2: rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1__Impl rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1__Impl"
    // InternalGraphicParser.g:6384:1: rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6388:1: ( ( Colon ) )
            // InternalGraphicParser.g:6389:1: ( Colon )
            {
            // InternalGraphicParser.g:6389:1: ( Colon )
            // InternalGraphicParser.g:6390:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2"
    // InternalGraphicParser.g:6399:1: rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2 : rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6403:1: ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2__Impl )
            // InternalGraphicParser.g:6404:2: rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2__Impl"
    // InternalGraphicParser.g:6410:1: rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__CollisionBitMaskAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6414:1: ( ( ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__CollisionBitMaskAssignment_2 ) ) )
            // InternalGraphicParser.g:6415:1: ( ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__CollisionBitMaskAssignment_2 ) )
            {
            // InternalGraphicParser.g:6415:1: ( ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__CollisionBitMaskAssignment_2 ) )
            // InternalGraphicParser.g:6416:2: ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__CollisionBitMaskAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getCollisionBitMaskAssignment_2()); 
            // InternalGraphicParser.g:6417:2: ( rule__GraphicRootClassesItemsConstraintsCollisionBitMask__CollisionBitMaskAssignment_2 )
            // InternalGraphicParser.g:6417:3: rule__GraphicRootClassesItemsConstraintsCollisionBitMask__CollisionBitMaskAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsCollisionBitMask__CollisionBitMaskAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getCollisionBitMaskAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0"
    // InternalGraphicParser.g:6426:1: rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0 : rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0__Impl rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1 ;
    public final void rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6430:1: ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0__Impl rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1 )
            // InternalGraphicParser.g:6431:2: rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0__Impl rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0__Impl"
    // InternalGraphicParser.g:6438:1: rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0__Impl : ( ContactTestBitMask ) ;
    public final void rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6442:1: ( ( ContactTestBitMask ) )
            // InternalGraphicParser.g:6443:1: ( ContactTestBitMask )
            {
            // InternalGraphicParser.g:6443:1: ( ContactTestBitMask )
            // InternalGraphicParser.g:6444:2: ContactTestBitMask
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getContactTestBitMaskKeyword_0()); 
            match(input,ContactTestBitMask,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getContactTestBitMaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1"
    // InternalGraphicParser.g:6453:1: rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1 : rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1__Impl rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2 ;
    public final void rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6457:1: ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1__Impl rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2 )
            // InternalGraphicParser.g:6458:2: rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1__Impl rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1__Impl"
    // InternalGraphicParser.g:6465:1: rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6469:1: ( ( Colon ) )
            // InternalGraphicParser.g:6470:1: ( Colon )
            {
            // InternalGraphicParser.g:6470:1: ( Colon )
            // InternalGraphicParser.g:6471:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2"
    // InternalGraphicParser.g:6480:1: rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2 : rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6484:1: ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2__Impl )
            // InternalGraphicParser.g:6485:2: rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2__Impl"
    // InternalGraphicParser.g:6491:1: rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__ContactTestBitMaskAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6495:1: ( ( ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__ContactTestBitMaskAssignment_2 ) ) )
            // InternalGraphicParser.g:6496:1: ( ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__ContactTestBitMaskAssignment_2 ) )
            {
            // InternalGraphicParser.g:6496:1: ( ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__ContactTestBitMaskAssignment_2 ) )
            // InternalGraphicParser.g:6497:2: ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__ContactTestBitMaskAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getContactTestBitMaskAssignment_2()); 
            // InternalGraphicParser.g:6498:2: ( rule__GraphicRootClassesItemsConstraintsContactTestBitMask__ContactTestBitMaskAssignment_2 )
            // InternalGraphicParser.g:6498:3: rule__GraphicRootClassesItemsConstraintsContactTestBitMask__ContactTestBitMaskAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConstraintsContactTestBitMask__ContactTestBitMaskAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getContactTestBitMaskAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group__0"
    // InternalGraphicParser.g:6507:1: rule__GraphicRootClassesItemsConnectionsItems__Group__0 : rule__GraphicRootClassesItemsConnectionsItems__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItems__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6511:1: ( rule__GraphicRootClassesItemsConnectionsItems__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItems__Group__1 )
            // InternalGraphicParser.g:6512:2: rule__GraphicRootClassesItemsConnectionsItems__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphicRootClassesItemsConnectionsItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group__0__Impl"
    // InternalGraphicParser.g:6519:1: rule__GraphicRootClassesItemsConnectionsItems__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6523:1: ( ( () ) )
            // InternalGraphicParser.g:6524:1: ( () )
            {
            // InternalGraphicParser.g:6524:1: ( () )
            // InternalGraphicParser.g:6525:2: ()
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getGraphicRootClassesItemsConnectionsItemsAction_0()); 
            // InternalGraphicParser.g:6526:2: ()
            // InternalGraphicParser.g:6526:3: 
            {
            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getGraphicRootClassesItemsConnectionsItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group__1"
    // InternalGraphicParser.g:6534:1: rule__GraphicRootClassesItemsConnectionsItems__Group__1 : rule__GraphicRootClassesItemsConnectionsItems__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItems__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6538:1: ( rule__GraphicRootClassesItemsConnectionsItems__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItems__Group__2 )
            // InternalGraphicParser.g:6539:2: rule__GraphicRootClassesItemsConnectionsItems__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItems__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__GraphicRootClassesItemsConnectionsItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group__1__Impl"
    // InternalGraphicParser.g:6546:1: rule__GraphicRootClassesItemsConnectionsItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6550:1: ( ( LeftCurlyBracket ) )
            // InternalGraphicParser.g:6551:1: ( LeftCurlyBracket )
            {
            // InternalGraphicParser.g:6551:1: ( LeftCurlyBracket )
            // InternalGraphicParser.g:6552:2: LeftCurlyBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group__2"
    // InternalGraphicParser.g:6561:1: rule__GraphicRootClassesItemsConnectionsItems__Group__2 : rule__GraphicRootClassesItemsConnectionsItems__Group__2__Impl rule__GraphicRootClassesItemsConnectionsItems__Group__3 ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6565:1: ( rule__GraphicRootClassesItemsConnectionsItems__Group__2__Impl rule__GraphicRootClassesItemsConnectionsItems__Group__3 )
            // InternalGraphicParser.g:6566:2: rule__GraphicRootClassesItemsConnectionsItems__Group__2__Impl rule__GraphicRootClassesItemsConnectionsItems__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__GraphicRootClassesItemsConnectionsItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group__2__Impl"
    // InternalGraphicParser.g:6573:1: rule__GraphicRootClassesItemsConnectionsItems__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItems__Group_2__0 )? ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6577:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItems__Group_2__0 )? ) )
            // InternalGraphicParser.g:6578:1: ( ( rule__GraphicRootClassesItemsConnectionsItems__Group_2__0 )? )
            {
            // InternalGraphicParser.g:6578:1: ( ( rule__GraphicRootClassesItemsConnectionsItems__Group_2__0 )? )
            // InternalGraphicParser.g:6579:2: ( rule__GraphicRootClassesItemsConnectionsItems__Group_2__0 )?
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getGroup_2()); 
            // InternalGraphicParser.g:6580:2: ( rule__GraphicRootClassesItemsConnectionsItems__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=DecoratorColor && LA29_0<=DecoratorWidth)||LA29_0==DecoratorPos||(LA29_0>=Decorator && LA29_0<=Position)||LA29_0==Pattern||(LA29_0>=Target && LA29_0<=Color)||(LA29_0>=Width && LA29_0<=Name)||LA29_0==Type) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGraphicParser.g:6580:3: rule__GraphicRootClassesItemsConnectionsItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphicRootClassesItemsConnectionsItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group__3"
    // InternalGraphicParser.g:6588:1: rule__GraphicRootClassesItemsConnectionsItems__Group__3 : rule__GraphicRootClassesItemsConnectionsItems__Group__3__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6592:1: ( rule__GraphicRootClassesItemsConnectionsItems__Group__3__Impl )
            // InternalGraphicParser.g:6593:2: rule__GraphicRootClassesItemsConnectionsItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group__3"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group__3__Impl"
    // InternalGraphicParser.g:6599:1: rule__GraphicRootClassesItemsConnectionsItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6603:1: ( ( RightCurlyBracket ) )
            // InternalGraphicParser.g:6604:1: ( RightCurlyBracket )
            {
            // InternalGraphicParser.g:6604:1: ( RightCurlyBracket )
            // InternalGraphicParser.g:6605:2: RightCurlyBracket
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group__3__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group_2__0"
    // InternalGraphicParser.g:6615:1: rule__GraphicRootClassesItemsConnectionsItems__Group_2__0 : rule__GraphicRootClassesItemsConnectionsItems__Group_2__0__Impl rule__GraphicRootClassesItemsConnectionsItems__Group_2__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6619:1: ( rule__GraphicRootClassesItemsConnectionsItems__Group_2__0__Impl rule__GraphicRootClassesItemsConnectionsItems__Group_2__1 )
            // InternalGraphicParser.g:6620:2: rule__GraphicRootClassesItemsConnectionsItems__Group_2__0__Impl rule__GraphicRootClassesItemsConnectionsItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GraphicRootClassesItemsConnectionsItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItems__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group_2__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group_2__0__Impl"
    // InternalGraphicParser.g:6627:1: rule__GraphicRootClassesItemsConnectionsItems__Group_2__0__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6631:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_0 ) ) )
            // InternalGraphicParser.g:6632:1: ( ( rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_0 ) )
            {
            // InternalGraphicParser.g:6632:1: ( ( rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_0 ) )
            // InternalGraphicParser.g:6633:2: ( rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getItemsAssignment_2_0()); 
            // InternalGraphicParser.g:6634:2: ( rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_0 )
            // InternalGraphicParser.g:6634:3: rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group_2__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group_2__1"
    // InternalGraphicParser.g:6642:1: rule__GraphicRootClassesItemsConnectionsItems__Group_2__1 : rule__GraphicRootClassesItemsConnectionsItems__Group_2__1__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6646:1: ( rule__GraphicRootClassesItemsConnectionsItems__Group_2__1__Impl )
            // InternalGraphicParser.g:6647:2: rule__GraphicRootClassesItemsConnectionsItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItems__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group_2__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group_2__1__Impl"
    // InternalGraphicParser.g:6653:1: rule__GraphicRootClassesItemsConnectionsItems__Group_2__1__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0 )* ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6657:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0 )* ) )
            // InternalGraphicParser.g:6658:1: ( ( rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0 )* )
            {
            // InternalGraphicParser.g:6658:1: ( ( rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0 )* )
            // InternalGraphicParser.g:6659:2: ( rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0 )*
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getGroup_2_1()); 
            // InternalGraphicParser.g:6660:2: ( rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Comma) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGraphicParser.g:6660:3: rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group_2__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0"
    // InternalGraphicParser.g:6669:1: rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0 : rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0__Impl rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6673:1: ( rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0__Impl rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1 )
            // InternalGraphicParser.g:6674:2: rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0__Impl rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1
            {
            pushFollow(FOLLOW_28);
            rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0__Impl"
    // InternalGraphicParser.g:6681:1: rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6685:1: ( ( Comma ) )
            // InternalGraphicParser.g:6686:1: ( Comma )
            {
            // InternalGraphicParser.g:6686:1: ( Comma )
            // InternalGraphicParser.g:6687:2: Comma
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1"
    // InternalGraphicParser.g:6696:1: rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1 : rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6700:1: ( rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1__Impl )
            // InternalGraphicParser.g:6701:2: rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1__Impl"
    // InternalGraphicParser.g:6707:1: rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6711:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_1_1 ) ) )
            // InternalGraphicParser.g:6712:1: ( ( rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalGraphicParser.g:6712:1: ( ( rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_1_1 ) )
            // InternalGraphicParser.g:6713:2: ( rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalGraphicParser.g:6714:2: ( rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_1_1 )
            // InternalGraphicParser.g:6714:3: rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsName__Group__0"
    // InternalGraphicParser.g:6723:1: rule__GraphicRootClassesItemsConnectionsItemsName__Group__0 : rule__GraphicRootClassesItemsConnectionsItemsName__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsName__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6727:1: ( rule__GraphicRootClassesItemsConnectionsItemsName__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsName__Group__1 )
            // InternalGraphicParser.g:6728:2: rule__GraphicRootClassesItemsConnectionsItemsName__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__GraphicRootClassesItemsConnectionsItemsName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsName__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsName__Group__0__Impl"
    // InternalGraphicParser.g:6735:1: rule__GraphicRootClassesItemsConnectionsItemsName__Group__0__Impl : ( () ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6739:1: ( ( () ) )
            // InternalGraphicParser.g:6740:1: ( () )
            {
            // InternalGraphicParser.g:6740:1: ( () )
            // InternalGraphicParser.g:6741:2: ()
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getGraphicRootClassesItemsConnectionsItemsNameAction_0()); 
            // InternalGraphicParser.g:6742:2: ()
            // InternalGraphicParser.g:6742:3: 
            {
            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getGraphicRootClassesItemsConnectionsItemsNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsName__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsName__Group__1"
    // InternalGraphicParser.g:6750:1: rule__GraphicRootClassesItemsConnectionsItemsName__Group__1 : rule__GraphicRootClassesItemsConnectionsItemsName__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsName__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6754:1: ( rule__GraphicRootClassesItemsConnectionsItemsName__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsName__Group__2 )
            // InternalGraphicParser.g:6755:2: rule__GraphicRootClassesItemsConnectionsItemsName__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsName__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnectionsItemsName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsName__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsName__Group__1__Impl"
    // InternalGraphicParser.g:6762:1: rule__GraphicRootClassesItemsConnectionsItemsName__Group__1__Impl : ( Name ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6766:1: ( ( Name ) )
            // InternalGraphicParser.g:6767:1: ( Name )
            {
            // InternalGraphicParser.g:6767:1: ( Name )
            // InternalGraphicParser.g:6768:2: Name
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsName__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsName__Group__2"
    // InternalGraphicParser.g:6777:1: rule__GraphicRootClassesItemsConnectionsItemsName__Group__2 : rule__GraphicRootClassesItemsConnectionsItemsName__Group__2__Impl rule__GraphicRootClassesItemsConnectionsItemsName__Group__3 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6781:1: ( rule__GraphicRootClassesItemsConnectionsItemsName__Group__2__Impl rule__GraphicRootClassesItemsConnectionsItemsName__Group__3 )
            // InternalGraphicParser.g:6782:2: rule__GraphicRootClassesItemsConnectionsItemsName__Group__2__Impl rule__GraphicRootClassesItemsConnectionsItemsName__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConnectionsItemsName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsName__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsName__Group__2__Impl"
    // InternalGraphicParser.g:6789:1: rule__GraphicRootClassesItemsConnectionsItemsName__Group__2__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6793:1: ( ( Colon ) )
            // InternalGraphicParser.g:6794:1: ( Colon )
            {
            // InternalGraphicParser.g:6794:1: ( Colon )
            // InternalGraphicParser.g:6795:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsName__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsName__Group__3"
    // InternalGraphicParser.g:6804:1: rule__GraphicRootClassesItemsConnectionsItemsName__Group__3 : rule__GraphicRootClassesItemsConnectionsItemsName__Group__3__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6808:1: ( rule__GraphicRootClassesItemsConnectionsItemsName__Group__3__Impl )
            // InternalGraphicParser.g:6809:2: rule__GraphicRootClassesItemsConnectionsItemsName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsName__Group__3"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsName__Group__3__Impl"
    // InternalGraphicParser.g:6815:1: rule__GraphicRootClassesItemsConnectionsItemsName__Group__3__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItemsName__NameAssignment_3 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6819:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsName__NameAssignment_3 ) ) )
            // InternalGraphicParser.g:6820:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsName__NameAssignment_3 ) )
            {
            // InternalGraphicParser.g:6820:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsName__NameAssignment_3 ) )
            // InternalGraphicParser.g:6821:2: ( rule__GraphicRootClassesItemsConnectionsItemsName__NameAssignment_3 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getNameAssignment_3()); 
            // InternalGraphicParser.g:6822:2: ( rule__GraphicRootClassesItemsConnectionsItemsName__NameAssignment_3 )
            // InternalGraphicParser.g:6822:3: rule__GraphicRootClassesItemsConnectionsItemsName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsName__Group__3__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsType__Group__0"
    // InternalGraphicParser.g:6831:1: rule__GraphicRootClassesItemsConnectionsItemsType__Group__0 : rule__GraphicRootClassesItemsConnectionsItemsType__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsType__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6835:1: ( rule__GraphicRootClassesItemsConnectionsItemsType__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsType__Group__1 )
            // InternalGraphicParser.g:6836:2: rule__GraphicRootClassesItemsConnectionsItemsType__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsType__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnectionsItemsType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsType__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsType__Group__0__Impl"
    // InternalGraphicParser.g:6843:1: rule__GraphicRootClassesItemsConnectionsItemsType__Group__0__Impl : ( Type ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6847:1: ( ( Type ) )
            // InternalGraphicParser.g:6848:1: ( Type )
            {
            // InternalGraphicParser.g:6848:1: ( Type )
            // InternalGraphicParser.g:6849:2: Type
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getTypeKeyword_0()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsType__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsType__Group__1"
    // InternalGraphicParser.g:6858:1: rule__GraphicRootClassesItemsConnectionsItemsType__Group__1 : rule__GraphicRootClassesItemsConnectionsItemsType__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsType__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6862:1: ( rule__GraphicRootClassesItemsConnectionsItemsType__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsType__Group__2 )
            // InternalGraphicParser.g:6863:2: rule__GraphicRootClassesItemsConnectionsItemsType__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsType__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConnectionsItemsType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsType__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsType__Group__1__Impl"
    // InternalGraphicParser.g:6870:1: rule__GraphicRootClassesItemsConnectionsItemsType__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6874:1: ( ( Colon ) )
            // InternalGraphicParser.g:6875:1: ( Colon )
            {
            // InternalGraphicParser.g:6875:1: ( Colon )
            // InternalGraphicParser.g:6876:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsType__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsType__Group__2"
    // InternalGraphicParser.g:6885:1: rule__GraphicRootClassesItemsConnectionsItemsType__Group__2 : rule__GraphicRootClassesItemsConnectionsItemsType__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6889:1: ( rule__GraphicRootClassesItemsConnectionsItemsType__Group__2__Impl )
            // InternalGraphicParser.g:6890:2: rule__GraphicRootClassesItemsConnectionsItemsType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsType__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsType__Group__2__Impl"
    // InternalGraphicParser.g:6896:1: rule__GraphicRootClassesItemsConnectionsItemsType__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItemsType__TypeAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6900:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsType__TypeAssignment_2 ) ) )
            // InternalGraphicParser.g:6901:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsType__TypeAssignment_2 ) )
            {
            // InternalGraphicParser.g:6901:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsType__TypeAssignment_2 ) )
            // InternalGraphicParser.g:6902:2: ( rule__GraphicRootClassesItemsConnectionsItemsType__TypeAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getTypeAssignment_2()); 
            // InternalGraphicParser.g:6903:2: ( rule__GraphicRootClassesItemsConnectionsItemsType__TypeAssignment_2 )
            // InternalGraphicParser.g:6903:3: rule__GraphicRootClassesItemsConnectionsItemsType__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsType__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0"
    // InternalGraphicParser.g:6912:1: rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0 : rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6916:1: ( rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1 )
            // InternalGraphicParser.g:6917:2: rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0__Impl"
    // InternalGraphicParser.g:6924:1: rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0__Impl : ( Color ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6928:1: ( ( Color ) )
            // InternalGraphicParser.g:6929:1: ( Color )
            {
            // InternalGraphicParser.g:6929:1: ( Color )
            // InternalGraphicParser.g:6930:2: Color
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getColorKeyword_0()); 
            match(input,Color,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getColorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsColor__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1"
    // InternalGraphicParser.g:6939:1: rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1 : rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6943:1: ( rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2 )
            // InternalGraphicParser.g:6944:2: rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1__Impl"
    // InternalGraphicParser.g:6951:1: rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6955:1: ( ( Colon ) )
            // InternalGraphicParser.g:6956:1: ( Colon )
            {
            // InternalGraphicParser.g:6956:1: ( Colon )
            // InternalGraphicParser.g:6957:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsColor__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2"
    // InternalGraphicParser.g:6966:1: rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2 : rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6970:1: ( rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2__Impl )
            // InternalGraphicParser.g:6971:2: rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2__Impl"
    // InternalGraphicParser.g:6977:1: rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItemsColor__ColorAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6981:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsColor__ColorAssignment_2 ) ) )
            // InternalGraphicParser.g:6982:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsColor__ColorAssignment_2 ) )
            {
            // InternalGraphicParser.g:6982:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsColor__ColorAssignment_2 ) )
            // InternalGraphicParser.g:6983:2: ( rule__GraphicRootClassesItemsConnectionsItemsColor__ColorAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getColorAssignment_2()); 
            // InternalGraphicParser.g:6984:2: ( rule__GraphicRootClassesItemsConnectionsItemsColor__ColorAssignment_2 )
            // InternalGraphicParser.g:6984:3: rule__GraphicRootClassesItemsConnectionsItemsColor__ColorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsColor__ColorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getColorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsColor__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0"
    // InternalGraphicParser.g:6993:1: rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0 : rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:6997:1: ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1 )
            // InternalGraphicParser.g:6998:2: rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0__Impl"
    // InternalGraphicParser.g:7005:1: rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0__Impl : ( TextColor ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7009:1: ( ( TextColor ) )
            // InternalGraphicParser.g:7010:1: ( TextColor )
            {
            // InternalGraphicParser.g:7010:1: ( TextColor )
            // InternalGraphicParser.g:7011:2: TextColor
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getTextColorKeyword_0()); 
            match(input,TextColor,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getTextColorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1"
    // InternalGraphicParser.g:7020:1: rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1 : rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7024:1: ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2 )
            // InternalGraphicParser.g:7025:2: rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1__Impl"
    // InternalGraphicParser.g:7032:1: rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7036:1: ( ( Colon ) )
            // InternalGraphicParser.g:7037:1: ( Colon )
            {
            // InternalGraphicParser.g:7037:1: ( Colon )
            // InternalGraphicParser.g:7038:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2"
    // InternalGraphicParser.g:7047:1: rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2 : rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7051:1: ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2__Impl )
            // InternalGraphicParser.g:7052:2: rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2__Impl"
    // InternalGraphicParser.g:7058:1: rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__TextColorAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7062:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__TextColorAssignment_2 ) ) )
            // InternalGraphicParser.g:7063:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__TextColorAssignment_2 ) )
            {
            // InternalGraphicParser.g:7063:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__TextColorAssignment_2 ) )
            // InternalGraphicParser.g:7064:2: ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__TextColorAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getTextColorAssignment_2()); 
            // InternalGraphicParser.g:7065:2: ( rule__GraphicRootClassesItemsConnectionsItemsTextColor__TextColorAssignment_2 )
            // InternalGraphicParser.g:7065:3: rule__GraphicRootClassesItemsConnectionsItemsTextColor__TextColorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsTextColor__TextColorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getTextColorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTextColor__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0"
    // InternalGraphicParser.g:7074:1: rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0 : rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7078:1: ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1 )
            // InternalGraphicParser.g:7079:2: rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0__Impl"
    // InternalGraphicParser.g:7086:1: rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0__Impl : ( Decorator ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7090:1: ( ( Decorator ) )
            // InternalGraphicParser.g:7091:1: ( Decorator )
            {
            // InternalGraphicParser.g:7091:1: ( Decorator )
            // InternalGraphicParser.g:7092:2: Decorator
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getDecoratorKeyword_0()); 
            match(input,Decorator,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getDecoratorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1"
    // InternalGraphicParser.g:7101:1: rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1 : rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7105:1: ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2 )
            // InternalGraphicParser.g:7106:2: rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1__Impl"
    // InternalGraphicParser.g:7113:1: rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7117:1: ( ( Colon ) )
            // InternalGraphicParser.g:7118:1: ( Colon )
            {
            // InternalGraphicParser.g:7118:1: ( Colon )
            // InternalGraphicParser.g:7119:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2"
    // InternalGraphicParser.g:7128:1: rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2 : rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7132:1: ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2__Impl )
            // InternalGraphicParser.g:7133:2: rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2__Impl"
    // InternalGraphicParser.g:7139:1: rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__DecoratorAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7143:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__DecoratorAssignment_2 ) ) )
            // InternalGraphicParser.g:7144:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__DecoratorAssignment_2 ) )
            {
            // InternalGraphicParser.g:7144:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__DecoratorAssignment_2 ) )
            // InternalGraphicParser.g:7145:2: ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__DecoratorAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getDecoratorAssignment_2()); 
            // InternalGraphicParser.g:7146:2: ( rule__GraphicRootClassesItemsConnectionsItemsDecorator__DecoratorAssignment_2 )
            // InternalGraphicParser.g:7146:3: rule__GraphicRootClassesItemsConnectionsItemsDecorator__DecoratorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecorator__DecoratorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getDecoratorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecorator__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0"
    // InternalGraphicParser.g:7155:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0 : rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7159:1: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1 )
            // InternalGraphicParser.g:7160:2: rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0__Impl"
    // InternalGraphicParser.g:7167:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0__Impl : ( DecoratorColor ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7171:1: ( ( DecoratorColor ) )
            // InternalGraphicParser.g:7172:1: ( DecoratorColor )
            {
            // InternalGraphicParser.g:7172:1: ( DecoratorColor )
            // InternalGraphicParser.g:7173:2: DecoratorColor
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getDecoratorColorKeyword_0()); 
            match(input,DecoratorColor,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getDecoratorColorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1"
    // InternalGraphicParser.g:7182:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1 : rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7186:1: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2 )
            // InternalGraphicParser.g:7187:2: rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1__Impl"
    // InternalGraphicParser.g:7194:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7198:1: ( ( Colon ) )
            // InternalGraphicParser.g:7199:1: ( Colon )
            {
            // InternalGraphicParser.g:7199:1: ( Colon )
            // InternalGraphicParser.g:7200:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2"
    // InternalGraphicParser.g:7209:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2 : rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7213:1: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2__Impl )
            // InternalGraphicParser.g:7214:2: rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2__Impl"
    // InternalGraphicParser.g:7220:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__DecoratorColorAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7224:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__DecoratorColorAssignment_2 ) ) )
            // InternalGraphicParser.g:7225:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__DecoratorColorAssignment_2 ) )
            {
            // InternalGraphicParser.g:7225:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__DecoratorColorAssignment_2 ) )
            // InternalGraphicParser.g:7226:2: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__DecoratorColorAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getDecoratorColorAssignment_2()); 
            // InternalGraphicParser.g:7227:2: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__DecoratorColorAssignment_2 )
            // InternalGraphicParser.g:7227:3: rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__DecoratorColorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__DecoratorColorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getDecoratorColorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0"
    // InternalGraphicParser.g:7236:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0 : rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7240:1: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1 )
            // InternalGraphicParser.g:7241:2: rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0__Impl"
    // InternalGraphicParser.g:7248:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0__Impl : ( DecoratorWidth ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7252:1: ( ( DecoratorWidth ) )
            // InternalGraphicParser.g:7253:1: ( DecoratorWidth )
            {
            // InternalGraphicParser.g:7253:1: ( DecoratorWidth )
            // InternalGraphicParser.g:7254:2: DecoratorWidth
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getDecoratorWidthKeyword_0()); 
            match(input,DecoratorWidth,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getDecoratorWidthKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1"
    // InternalGraphicParser.g:7263:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1 : rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7267:1: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2 )
            // InternalGraphicParser.g:7268:2: rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1__Impl"
    // InternalGraphicParser.g:7275:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7279:1: ( ( Colon ) )
            // InternalGraphicParser.g:7280:1: ( Colon )
            {
            // InternalGraphicParser.g:7280:1: ( Colon )
            // InternalGraphicParser.g:7281:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2"
    // InternalGraphicParser.g:7290:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2 : rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7294:1: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2__Impl )
            // InternalGraphicParser.g:7295:2: rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2__Impl"
    // InternalGraphicParser.g:7301:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__DecoratorWidthAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7305:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__DecoratorWidthAssignment_2 ) ) )
            // InternalGraphicParser.g:7306:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__DecoratorWidthAssignment_2 ) )
            {
            // InternalGraphicParser.g:7306:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__DecoratorWidthAssignment_2 ) )
            // InternalGraphicParser.g:7307:2: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__DecoratorWidthAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getDecoratorWidthAssignment_2()); 
            // InternalGraphicParser.g:7308:2: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__DecoratorWidthAssignment_2 )
            // InternalGraphicParser.g:7308:3: rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__DecoratorWidthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__DecoratorWidthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getDecoratorWidthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0"
    // InternalGraphicParser.g:7317:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0 : rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7321:1: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1 )
            // InternalGraphicParser.g:7322:2: rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0__Impl"
    // InternalGraphicParser.g:7329:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0__Impl : ( DecoratorPos ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7333:1: ( ( DecoratorPos ) )
            // InternalGraphicParser.g:7334:1: ( DecoratorPos )
            {
            // InternalGraphicParser.g:7334:1: ( DecoratorPos )
            // InternalGraphicParser.g:7335:2: DecoratorPos
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getDecoratorPosKeyword_0()); 
            match(input,DecoratorPos,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getDecoratorPosKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1"
    // InternalGraphicParser.g:7344:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1 : rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7348:1: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2 )
            // InternalGraphicParser.g:7349:2: rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1__Impl"
    // InternalGraphicParser.g:7356:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7360:1: ( ( Colon ) )
            // InternalGraphicParser.g:7361:1: ( Colon )
            {
            // InternalGraphicParser.g:7361:1: ( Colon )
            // InternalGraphicParser.g:7362:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2"
    // InternalGraphicParser.g:7371:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2 : rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7375:1: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2__Impl )
            // InternalGraphicParser.g:7376:2: rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2__Impl"
    // InternalGraphicParser.g:7382:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__DecoratorPosAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7386:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__DecoratorPosAssignment_2 ) ) )
            // InternalGraphicParser.g:7387:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__DecoratorPosAssignment_2 ) )
            {
            // InternalGraphicParser.g:7387:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__DecoratorPosAssignment_2 ) )
            // InternalGraphicParser.g:7388:2: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__DecoratorPosAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getDecoratorPosAssignment_2()); 
            // InternalGraphicParser.g:7389:2: ( rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__DecoratorPosAssignment_2 )
            // InternalGraphicParser.g:7389:3: rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__DecoratorPosAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__DecoratorPosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getDecoratorPosAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0"
    // InternalGraphicParser.g:7398:1: rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0 : rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7402:1: ( rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1 )
            // InternalGraphicParser.g:7403:2: rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0__Impl"
    // InternalGraphicParser.g:7410:1: rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0__Impl : ( Pattern ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7414:1: ( ( Pattern ) )
            // InternalGraphicParser.g:7415:1: ( Pattern )
            {
            // InternalGraphicParser.g:7415:1: ( Pattern )
            // InternalGraphicParser.g:7416:2: Pattern
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getPatternKeyword_0()); 
            match(input,Pattern,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getPatternKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1"
    // InternalGraphicParser.g:7425:1: rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1 : rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7429:1: ( rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2 )
            // InternalGraphicParser.g:7430:2: rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1__Impl"
    // InternalGraphicParser.g:7437:1: rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7441:1: ( ( Colon ) )
            // InternalGraphicParser.g:7442:1: ( Colon )
            {
            // InternalGraphicParser.g:7442:1: ( Colon )
            // InternalGraphicParser.g:7443:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2"
    // InternalGraphicParser.g:7452:1: rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2 : rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7456:1: ( rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2__Impl )
            // InternalGraphicParser.g:7457:2: rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2__Impl"
    // InternalGraphicParser.g:7463:1: rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItemsPattern__PatternAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7467:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsPattern__PatternAssignment_2 ) ) )
            // InternalGraphicParser.g:7468:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsPattern__PatternAssignment_2 ) )
            {
            // InternalGraphicParser.g:7468:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsPattern__PatternAssignment_2 ) )
            // InternalGraphicParser.g:7469:2: ( rule__GraphicRootClassesItemsConnectionsItemsPattern__PatternAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getPatternAssignment_2()); 
            // InternalGraphicParser.g:7470:2: ( rule__GraphicRootClassesItemsConnectionsItemsPattern__PatternAssignment_2 )
            // InternalGraphicParser.g:7470:3: rule__GraphicRootClassesItemsConnectionsItemsPattern__PatternAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsPattern__PatternAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getPatternAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPattern__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0"
    // InternalGraphicParser.g:7479:1: rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0 : rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7483:1: ( rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1 )
            // InternalGraphicParser.g:7484:2: rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0__Impl"
    // InternalGraphicParser.g:7491:1: rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0__Impl : ( Width ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7495:1: ( ( Width ) )
            // InternalGraphicParser.g:7496:1: ( Width )
            {
            // InternalGraphicParser.g:7496:1: ( Width )
            // InternalGraphicParser.g:7497:2: Width
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getWidthKeyword_0()); 
            match(input,Width,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getWidthKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1"
    // InternalGraphicParser.g:7506:1: rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1 : rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7510:1: ( rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2 )
            // InternalGraphicParser.g:7511:2: rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1__Impl"
    // InternalGraphicParser.g:7518:1: rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7522:1: ( ( Colon ) )
            // InternalGraphicParser.g:7523:1: ( Colon )
            {
            // InternalGraphicParser.g:7523:1: ( Colon )
            // InternalGraphicParser.g:7524:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2"
    // InternalGraphicParser.g:7533:1: rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2 : rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7537:1: ( rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2__Impl )
            // InternalGraphicParser.g:7538:2: rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2__Impl"
    // InternalGraphicParser.g:7544:1: rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItemsWidth__WidthAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7548:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsWidth__WidthAssignment_2 ) ) )
            // InternalGraphicParser.g:7549:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsWidth__WidthAssignment_2 ) )
            {
            // InternalGraphicParser.g:7549:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsWidth__WidthAssignment_2 ) )
            // InternalGraphicParser.g:7550:2: ( rule__GraphicRootClassesItemsConnectionsItemsWidth__WidthAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getWidthAssignment_2()); 
            // InternalGraphicParser.g:7551:2: ( rule__GraphicRootClassesItemsConnectionsItemsWidth__WidthAssignment_2 )
            // InternalGraphicParser.g:7551:3: rule__GraphicRootClassesItemsConnectionsItemsWidth__WidthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsWidth__WidthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getWidthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsWidth__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0"
    // InternalGraphicParser.g:7560:1: rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0 : rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7564:1: ( rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1 )
            // InternalGraphicParser.g:7565:2: rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0__Impl"
    // InternalGraphicParser.g:7572:1: rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0__Impl : ( Position ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7576:1: ( ( Position ) )
            // InternalGraphicParser.g:7577:1: ( Position )
            {
            // InternalGraphicParser.g:7577:1: ( Position )
            // InternalGraphicParser.g:7578:2: Position
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getPositionKeyword_0()); 
            match(input,Position,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getPositionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1"
    // InternalGraphicParser.g:7587:1: rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1 : rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7591:1: ( rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2 )
            // InternalGraphicParser.g:7592:2: rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1__Impl"
    // InternalGraphicParser.g:7599:1: rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7603:1: ( ( Colon ) )
            // InternalGraphicParser.g:7604:1: ( Colon )
            {
            // InternalGraphicParser.g:7604:1: ( Colon )
            // InternalGraphicParser.g:7605:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2"
    // InternalGraphicParser.g:7614:1: rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2 : rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7618:1: ( rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2__Impl )
            // InternalGraphicParser.g:7619:2: rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2__Impl"
    // InternalGraphicParser.g:7625:1: rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItemsPosition__PositionAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7629:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsPosition__PositionAssignment_2 ) ) )
            // InternalGraphicParser.g:7630:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsPosition__PositionAssignment_2 ) )
            {
            // InternalGraphicParser.g:7630:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsPosition__PositionAssignment_2 ) )
            // InternalGraphicParser.g:7631:2: ( rule__GraphicRootClassesItemsConnectionsItemsPosition__PositionAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getPositionAssignment_2()); 
            // InternalGraphicParser.g:7632:2: ( rule__GraphicRootClassesItemsConnectionsItemsPosition__PositionAssignment_2 )
            // InternalGraphicParser.g:7632:3: rule__GraphicRootClassesItemsConnectionsItemsPosition__PositionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsPosition__PositionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getPositionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPosition__Group__2__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0"
    // InternalGraphicParser.g:7641:1: rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0 : rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7645:1: ( rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1 )
            // InternalGraphicParser.g:7646:2: rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0__Impl rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0__Impl"
    // InternalGraphicParser.g:7653:1: rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0__Impl : ( Target ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7657:1: ( ( Target ) )
            // InternalGraphicParser.g:7658:1: ( Target )
            {
            // InternalGraphicParser.g:7658:1: ( Target )
            // InternalGraphicParser.g:7659:2: Target
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getTargetKeyword_0()); 
            match(input,Target,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getTargetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__0__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1"
    // InternalGraphicParser.g:7668:1: rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1 : rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2 ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7672:1: ( rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2 )
            // InternalGraphicParser.g:7673:2: rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1__Impl rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1__Impl"
    // InternalGraphicParser.g:7680:1: rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1__Impl : ( Colon ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7684:1: ( ( Colon ) )
            // InternalGraphicParser.g:7685:1: ( Colon )
            {
            // InternalGraphicParser.g:7685:1: ( Colon )
            // InternalGraphicParser.g:7686:2: Colon
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__1__Impl"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2"
    // InternalGraphicParser.g:7695:1: rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2 : rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2__Impl ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7699:1: ( rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2__Impl )
            // InternalGraphicParser.g:7700:2: rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2__Impl"
    // InternalGraphicParser.g:7706:1: rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2__Impl : ( ( rule__GraphicRootClassesItemsConnectionsItemsTarget__TargetAssignment_2 ) ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7710:1: ( ( ( rule__GraphicRootClassesItemsConnectionsItemsTarget__TargetAssignment_2 ) ) )
            // InternalGraphicParser.g:7711:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsTarget__TargetAssignment_2 ) )
            {
            // InternalGraphicParser.g:7711:1: ( ( rule__GraphicRootClassesItemsConnectionsItemsTarget__TargetAssignment_2 ) )
            // InternalGraphicParser.g:7712:2: ( rule__GraphicRootClassesItemsConnectionsItemsTarget__TargetAssignment_2 )
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getTargetAssignment_2()); 
            // InternalGraphicParser.g:7713:2: ( rule__GraphicRootClassesItemsConnectionsItemsTarget__TargetAssignment_2 )
            // InternalGraphicParser.g:7713:3: rule__GraphicRootClassesItemsConnectionsItemsTarget__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphicRootClassesItemsConnectionsItemsTarget__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTarget__Group__2__Impl"


    // $ANTLR start "rule__GraphicRoot__GraphicRootAssignment_2_0"
    // InternalGraphicParser.g:7722:1: rule__GraphicRoot__GraphicRootAssignment_2_0 : ( ruleGraphicRootPropertiesAbstract ) ;
    public final void rule__GraphicRoot__GraphicRootAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7726:1: ( ( ruleGraphicRootPropertiesAbstract ) )
            // InternalGraphicParser.g:7727:2: ( ruleGraphicRootPropertiesAbstract )
            {
            // InternalGraphicParser.g:7727:2: ( ruleGraphicRootPropertiesAbstract )
            // InternalGraphicParser.g:7728:3: ruleGraphicRootPropertiesAbstract
            {
             before(grammarAccess.getGraphicRootAccess().getGraphicRootGraphicRootPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootAccess().getGraphicRootGraphicRootPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__GraphicRootAssignment_2_0"


    // $ANTLR start "rule__GraphicRoot__GraphicRootAssignment_2_1_1"
    // InternalGraphicParser.g:7737:1: rule__GraphicRoot__GraphicRootAssignment_2_1_1 : ( ruleGraphicRootPropertiesAbstract ) ;
    public final void rule__GraphicRoot__GraphicRootAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7741:1: ( ( ruleGraphicRootPropertiesAbstract ) )
            // InternalGraphicParser.g:7742:2: ( ruleGraphicRootPropertiesAbstract )
            {
            // InternalGraphicParser.g:7742:2: ( ruleGraphicRootPropertiesAbstract )
            // InternalGraphicParser.g:7743:3: ruleGraphicRootPropertiesAbstract
            {
             before(grammarAccess.getGraphicRootAccess().getGraphicRootGraphicRootPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootAccess().getGraphicRootGraphicRootPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRoot__GraphicRootAssignment_2_1_1"


    // $ANTLR start "rule__GraphicRootName__NameAssignment_3"
    // InternalGraphicParser.g:7752:1: rule__GraphicRootName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__GraphicRootName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7756:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:7757:2: ( ruleEString )
            {
            // InternalGraphicParser.g:7757:2: ( ruleEString )
            // InternalGraphicParser.g:7758:3: ruleEString
            {
             before(grammarAccess.getGraphicRootNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootName__NameAssignment_3"


    // $ANTLR start "rule__GraphicRootURI__URIAssignment_2"
    // InternalGraphicParser.g:7767:1: rule__GraphicRootURI__URIAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootURI__URIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7771:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:7772:2: ( ruleEString )
            {
            // InternalGraphicParser.g:7772:2: ( ruleEString )
            // InternalGraphicParser.g:7773:3: ruleEString
            {
             before(grammarAccess.getGraphicRootURIAccess().getURIEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootURIAccess().getURIEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootURI__URIAssignment_2"


    // $ANTLR start "rule__GraphicRootClasses__ClassesAssignment_4_0"
    // InternalGraphicParser.g:7782:1: rule__GraphicRootClasses__ClassesAssignment_4_0 : ( ruleGraphicRootClassesItems ) ;
    public final void rule__GraphicRootClasses__ClassesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7786:1: ( ( ruleGraphicRootClassesItems ) )
            // InternalGraphicParser.g:7787:2: ( ruleGraphicRootClassesItems )
            {
            // InternalGraphicParser.g:7787:2: ( ruleGraphicRootClassesItems )
            // InternalGraphicParser.g:7788:3: ruleGraphicRootClassesItems
            {
             before(grammarAccess.getGraphicRootClassesAccess().getClassesGraphicRootClassesItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItems();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesAccess().getClassesGraphicRootClassesItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__ClassesAssignment_4_0"


    // $ANTLR start "rule__GraphicRootClasses__ClassesAssignment_4_1_1"
    // InternalGraphicParser.g:7797:1: rule__GraphicRootClasses__ClassesAssignment_4_1_1 : ( ruleGraphicRootClassesItems ) ;
    public final void rule__GraphicRootClasses__ClassesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7801:1: ( ( ruleGraphicRootClassesItems ) )
            // InternalGraphicParser.g:7802:2: ( ruleGraphicRootClassesItems )
            {
            // InternalGraphicParser.g:7802:2: ( ruleGraphicRootClassesItems )
            // InternalGraphicParser.g:7803:3: ruleGraphicRootClassesItems
            {
             before(grammarAccess.getGraphicRootClassesAccess().getClassesGraphicRootClassesItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItems();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesAccess().getClassesGraphicRootClassesItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClasses__ClassesAssignment_4_1_1"


    // $ANTLR start "rule__GraphicRootClassesItems__ItemsAssignment_2_0"
    // InternalGraphicParser.g:7812:1: rule__GraphicRootClassesItems__ItemsAssignment_2_0 : ( ruleGraphicRootClassesItemsPropertiesAbstract ) ;
    public final void rule__GraphicRootClassesItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7816:1: ( ( ruleGraphicRootClassesItemsPropertiesAbstract ) )
            // InternalGraphicParser.g:7817:2: ( ruleGraphicRootClassesItemsPropertiesAbstract )
            {
            // InternalGraphicParser.g:7817:2: ( ruleGraphicRootClassesItemsPropertiesAbstract )
            // InternalGraphicParser.g:7818:3: ruleGraphicRootClassesItemsPropertiesAbstract
            {
             before(grammarAccess.getGraphicRootClassesItemsAccess().getItemsGraphicRootClassesItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsAccess().getItemsGraphicRootClassesItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__GraphicRootClassesItems__ItemsAssignment_2_1_1"
    // InternalGraphicParser.g:7827:1: rule__GraphicRootClassesItems__ItemsAssignment_2_1_1 : ( ruleGraphicRootClassesItemsPropertiesAbstract ) ;
    public final void rule__GraphicRootClassesItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7831:1: ( ( ruleGraphicRootClassesItemsPropertiesAbstract ) )
            // InternalGraphicParser.g:7832:2: ( ruleGraphicRootClassesItemsPropertiesAbstract )
            {
            // InternalGraphicParser.g:7832:2: ( ruleGraphicRootClassesItemsPropertiesAbstract )
            // InternalGraphicParser.g:7833:3: ruleGraphicRootClassesItemsPropertiesAbstract
            {
             before(grammarAccess.getGraphicRootClassesItemsAccess().getItemsGraphicRootClassesItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsAccess().getItemsGraphicRootClassesItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__GraphicRootClassesItemsName__NameAssignment_3"
    // InternalGraphicParser.g:7842:1: rule__GraphicRootClassesItemsName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7846:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:7847:2: ( ruleEString )
            {
            // InternalGraphicParser.g:7847:2: ( ruleEString )
            // InternalGraphicParser.g:7848:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsName__NameAssignment_3"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_0"
    // InternalGraphicParser.g:7857:1: rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_0 : ( ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ;
    public final void rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7861:1: ( ( ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) )
            // InternalGraphicParser.g:7862:2: ( ruleGraphicRootClassesItemsVersionsPropertiesAbstract )
            {
            // InternalGraphicParser.g:7862:2: ( ruleGraphicRootClassesItemsVersionsPropertiesAbstract )
            // InternalGraphicParser.g:7863:3: ruleGraphicRootClassesItemsVersionsPropertiesAbstract
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsGraphicRootClassesItemsVersionsPropertiesAbstractParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsVersionsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsGraphicRootClassesItemsVersionsPropertiesAbstractParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_0"


    // $ANTLR start "rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_1_1"
    // InternalGraphicParser.g:7872:1: rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_1_1 : ( ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) ;
    public final void rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7876:1: ( ( ruleGraphicRootClassesItemsVersionsPropertiesAbstract ) )
            // InternalGraphicParser.g:7877:2: ( ruleGraphicRootClassesItemsVersionsPropertiesAbstract )
            {
            // InternalGraphicParser.g:7877:2: ( ruleGraphicRootClassesItemsVersionsPropertiesAbstract )
            // InternalGraphicParser.g:7878:3: ruleGraphicRootClassesItemsVersionsPropertiesAbstract
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsGraphicRootClassesItemsVersionsPropertiesAbstractParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsVersionsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVersionsAccess().getVersionsGraphicRootClassesItemsVersionsPropertiesAbstractParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersions__VersionsAssignment_4_1_1"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__VnameAssignment_4_0"
    // InternalGraphicParser.g:7887:1: rule__GraphicRootClassesItemsVname__VnameAssignment_4_0 : ( ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ;
    public final void rule__GraphicRootClassesItemsVname__VnameAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7891:1: ( ( ruleGraphicRootClassesItemsVnamePropertiesAbstract ) )
            // InternalGraphicParser.g:7892:2: ( ruleGraphicRootClassesItemsVnamePropertiesAbstract )
            {
            // InternalGraphicParser.g:7892:2: ( ruleGraphicRootClassesItemsVnamePropertiesAbstract )
            // InternalGraphicParser.g:7893:3: ruleGraphicRootClassesItemsVnamePropertiesAbstract
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameGraphicRootClassesItemsVnamePropertiesAbstractParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsVnamePropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameGraphicRootClassesItemsVnamePropertiesAbstractParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__VnameAssignment_4_0"


    // $ANTLR start "rule__GraphicRootClassesItemsVname__VnameAssignment_4_1_1"
    // InternalGraphicParser.g:7902:1: rule__GraphicRootClassesItemsVname__VnameAssignment_4_1_1 : ( ruleGraphicRootClassesItemsVnamePropertiesAbstract ) ;
    public final void rule__GraphicRootClassesItemsVname__VnameAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7906:1: ( ( ruleGraphicRootClassesItemsVnamePropertiesAbstract ) )
            // InternalGraphicParser.g:7907:2: ( ruleGraphicRootClassesItemsVnamePropertiesAbstract )
            {
            // InternalGraphicParser.g:7907:2: ( ruleGraphicRootClassesItemsVnamePropertiesAbstract )
            // InternalGraphicParser.g:7908:3: ruleGraphicRootClassesItemsVnamePropertiesAbstract
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameGraphicRootClassesItemsVnamePropertiesAbstractParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsVnamePropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVnameAccess().getVnameGraphicRootClassesItemsVnamePropertiesAbstractParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVname__VnameAssignment_4_1_1"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_0"
    // InternalGraphicParser.g:7917:1: rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_0 : ( ruleGraphicRootClassesItemsShowAttributesItems ) ;
    public final void rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7921:1: ( ( ruleGraphicRootClassesItemsShowAttributesItems ) )
            // InternalGraphicParser.g:7922:2: ( ruleGraphicRootClassesItemsShowAttributesItems )
            {
            // InternalGraphicParser.g:7922:2: ( ruleGraphicRootClassesItemsShowAttributesItems )
            // InternalGraphicParser.g:7923:3: ruleGraphicRootClassesItemsShowAttributesItems
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesGraphicRootClassesItemsShowAttributesItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsShowAttributesItems();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesGraphicRootClassesItemsShowAttributesItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_0"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_1_1"
    // InternalGraphicParser.g:7932:1: rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_1_1 : ( ruleGraphicRootClassesItemsShowAttributesItems ) ;
    public final void rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7936:1: ( ( ruleGraphicRootClassesItemsShowAttributesItems ) )
            // InternalGraphicParser.g:7937:2: ( ruleGraphicRootClassesItemsShowAttributesItems )
            {
            // InternalGraphicParser.g:7937:2: ( ruleGraphicRootClassesItemsShowAttributesItems )
            // InternalGraphicParser.g:7938:3: ruleGraphicRootClassesItemsShowAttributesItems
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesGraphicRootClassesItemsShowAttributesItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsShowAttributesItems();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsShowAttributesAccess().getShowAttributesGraphicRootClassesItemsShowAttributesItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributes__ShowAttributesAssignment_4_1_1"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_0"
    // InternalGraphicParser.g:7947:1: rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_0 : ( ruleGraphicRootClassesItemsMaterialAttributesItems ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7951:1: ( ( ruleGraphicRootClassesItemsMaterialAttributesItems ) )
            // InternalGraphicParser.g:7952:2: ( ruleGraphicRootClassesItemsMaterialAttributesItems )
            {
            // InternalGraphicParser.g:7952:2: ( ruleGraphicRootClassesItemsMaterialAttributesItems )
            // InternalGraphicParser.g:7953:3: ruleGraphicRootClassesItemsMaterialAttributesItems
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesGraphicRootClassesItemsMaterialAttributesItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsMaterialAttributesItems();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesGraphicRootClassesItemsMaterialAttributesItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_0"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_1_1"
    // InternalGraphicParser.g:7962:1: rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_1_1 : ( ruleGraphicRootClassesItemsMaterialAttributesItems ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7966:1: ( ( ruleGraphicRootClassesItemsMaterialAttributesItems ) )
            // InternalGraphicParser.g:7967:2: ( ruleGraphicRootClassesItemsMaterialAttributesItems )
            {
            // InternalGraphicParser.g:7967:2: ( ruleGraphicRootClassesItemsMaterialAttributesItems )
            // InternalGraphicParser.g:7968:3: ruleGraphicRootClassesItemsMaterialAttributesItems
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesGraphicRootClassesItemsMaterialAttributesItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsMaterialAttributesItems();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesAccess().getMaterialAttributesGraphicRootClassesItemsMaterialAttributesItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributes__MaterialAttributesAssignment_4_1_1"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_0"
    // InternalGraphicParser.g:7977:1: rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_0 : ( ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ;
    public final void rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7981:1: ( ( ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) )
            // InternalGraphicParser.g:7982:2: ( ruleGraphicRootClassesItemsConstraintsPropertiesAbstract )
            {
            // InternalGraphicParser.g:7982:2: ( ruleGraphicRootClassesItemsConstraintsPropertiesAbstract )
            // InternalGraphicParser.g:7983:3: ruleGraphicRootClassesItemsConstraintsPropertiesAbstract
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsGraphicRootClassesItemsConstraintsPropertiesAbstractParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsConstraintsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsGraphicRootClassesItemsConstraintsPropertiesAbstractParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_0"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_1_1"
    // InternalGraphicParser.g:7992:1: rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_1_1 : ( ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) ;
    public final void rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:7996:1: ( ( ruleGraphicRootClassesItemsConstraintsPropertiesAbstract ) )
            // InternalGraphicParser.g:7997:2: ( ruleGraphicRootClassesItemsConstraintsPropertiesAbstract )
            {
            // InternalGraphicParser.g:7997:2: ( ruleGraphicRootClassesItemsConstraintsPropertiesAbstract )
            // InternalGraphicParser.g:7998:3: ruleGraphicRootClassesItemsConstraintsPropertiesAbstract
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsGraphicRootClassesItemsConstraintsPropertiesAbstractParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsConstraintsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsAccess().getConstraintsGraphicRootClassesItemsConstraintsPropertiesAbstractParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraints__ConstraintsAssignment_4_1_1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_0"
    // InternalGraphicParser.g:8007:1: rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_0 : ( ruleGraphicRootClassesItemsConnectionsItems ) ;
    public final void rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8011:1: ( ( ruleGraphicRootClassesItemsConnectionsItems ) )
            // InternalGraphicParser.g:8012:2: ( ruleGraphicRootClassesItemsConnectionsItems )
            {
            // InternalGraphicParser.g:8012:2: ( ruleGraphicRootClassesItemsConnectionsItems )
            // InternalGraphicParser.g:8013:3: ruleGraphicRootClassesItemsConnectionsItems
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsGraphicRootClassesItemsConnectionsItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsConnectionsItems();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsGraphicRootClassesItemsConnectionsItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_1_1"
    // InternalGraphicParser.g:8022:1: rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_1_1 : ( ruleGraphicRootClassesItemsConnectionsItems ) ;
    public final void rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8026:1: ( ( ruleGraphicRootClassesItemsConnectionsItems ) )
            // InternalGraphicParser.g:8027:2: ( ruleGraphicRootClassesItemsConnectionsItems )
            {
            // InternalGraphicParser.g:8027:2: ( ruleGraphicRootClassesItemsConnectionsItems )
            // InternalGraphicParser.g:8028:3: ruleGraphicRootClassesItemsConnectionsItems
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsGraphicRootClassesItemsConnectionsItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsConnectionsItems();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsAccess().getConnectionsGraphicRootClassesItemsConnectionsItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnections__ConnectionsAssignment_4_1_1"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV1__V1Assignment_2"
    // InternalGraphicParser.g:8037:1: rule__GraphicRootClassesItemsVersionsV1__V1Assignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsVersionsV1__V1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8041:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8042:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8042:2: ( ruleEString )
            // InternalGraphicParser.g:8043:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getV1EStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVersionsV1Access().getV1EStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV1__V1Assignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV2__V2Assignment_2"
    // InternalGraphicParser.g:8052:1: rule__GraphicRootClassesItemsVersionsV2__V2Assignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsVersionsV2__V2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8056:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8057:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8057:2: ( ruleEString )
            // InternalGraphicParser.g:8058:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getV2EStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVersionsV2Access().getV2EStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV2__V2Assignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsVersionsV3__V3Assignment_2"
    // InternalGraphicParser.g:8067:1: rule__GraphicRootClassesItemsVersionsV3__V3Assignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsVersionsV3__V3Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8071:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8072:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8072:2: ( ruleEString )
            // InternalGraphicParser.g:8073:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getV3EStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVersionsV3Access().getV3EStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVersionsV3__V3Assignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV1__V1Assignment_2"
    // InternalGraphicParser.g:8082:1: rule__GraphicRootClassesItemsVnameV1__V1Assignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsVnameV1__V1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8086:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8087:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8087:2: ( ruleEString )
            // InternalGraphicParser.g:8088:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV1Access().getV1EStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVnameV1Access().getV1EStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV1__V1Assignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV2__V2Assignment_2"
    // InternalGraphicParser.g:8097:1: rule__GraphicRootClassesItemsVnameV2__V2Assignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsVnameV2__V2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8101:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8102:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8102:2: ( ruleEString )
            // InternalGraphicParser.g:8103:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV2Access().getV2EStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVnameV2Access().getV2EStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV2__V2Assignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsVnameV3__V3Assignment_2"
    // InternalGraphicParser.g:8112:1: rule__GraphicRootClassesItemsVnameV3__V3Assignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsVnameV3__V3Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8116:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8117:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8117:2: ( ruleEString )
            // InternalGraphicParser.g:8118:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsVnameV3Access().getV3EStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsVnameV3Access().getV3EStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsVnameV3__V3Assignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsShowAttributesItems__ItemsAssignment"
    // InternalGraphicParser.g:8127:1: rule__GraphicRootClassesItemsShowAttributesItems__ItemsAssignment : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsShowAttributesItems__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8131:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8132:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8132:2: ( ruleEString )
            // InternalGraphicParser.g:8133:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsShowAttributesItemsAccess().getItemsEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsShowAttributesItemsAccess().getItemsEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsShowAttributesItems__ItemsAssignment"


    // $ANTLR start "rule__GraphicRootClassesItemsMaterialAttributesItems__ItemsAssignment"
    // InternalGraphicParser.g:8142:1: rule__GraphicRootClassesItemsMaterialAttributesItems__ItemsAssignment : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsMaterialAttributesItems__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8146:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8147:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8147:2: ( ruleEString )
            // InternalGraphicParser.g:8148:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsMaterialAttributesItemsAccess().getItemsEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsMaterialAttributesItemsAccess().getItemsEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsMaterialAttributesItems__ItemsAssignment"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsPlanes__PlanesAssignment_2"
    // InternalGraphicParser.g:8157:1: rule__GraphicRootClassesItemsConstraintsPlanes__PlanesAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConstraintsPlanes__PlanesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8161:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8162:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8162:2: ( ruleEString )
            // InternalGraphicParser.g:8163:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getPlanesEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsPlanesAccess().getPlanesEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsPlanes__PlanesAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsIlumination__IluminationAssignment_2"
    // InternalGraphicParser.g:8172:1: rule__GraphicRootClassesItemsConstraintsIlumination__IluminationAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConstraintsIlumination__IluminationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8176:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8177:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8177:2: ( ruleEString )
            // InternalGraphicParser.g:8178:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getIluminationEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsIluminationAccess().getIluminationEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsIlumination__IluminationAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMax__SizeMaxAssignment_2"
    // InternalGraphicParser.g:8187:1: rule__GraphicRootClassesItemsConstraintsSizeMax__SizeMaxAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMax__SizeMaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8191:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8192:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8192:2: ( ruleEString )
            // InternalGraphicParser.g:8193:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getSizeMaxEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMaxAccess().getSizeMaxEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMax__SizeMaxAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeMin__SizeMinAssignment_2"
    // InternalGraphicParser.g:8202:1: rule__GraphicRootClassesItemsConstraintsSizeMin__SizeMinAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeMin__SizeMinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8206:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8207:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8207:2: ( ruleEString )
            // InternalGraphicParser.g:8208:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getSizeMinEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeMinAccess().getSizeMinEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeMin__SizeMinAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsSizeInit__SizeInitAssignment_2"
    // InternalGraphicParser.g:8217:1: rule__GraphicRootClassesItemsConstraintsSizeInit__SizeInitAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConstraintsSizeInit__SizeInitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8221:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8222:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8222:2: ( ruleEString )
            // InternalGraphicParser.g:8223:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getSizeInitEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsSizeInitAccess().getSizeInitEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsSizeInit__SizeInitAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsOverlapping__OverlappingAssignment_2"
    // InternalGraphicParser.g:8232:1: rule__GraphicRootClassesItemsConstraintsOverlapping__OverlappingAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConstraintsOverlapping__OverlappingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8236:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8237:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8237:2: ( ruleEString )
            // InternalGraphicParser.g:8238:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getOverlappingEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsOverlappingAccess().getOverlappingEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsOverlapping__OverlappingAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsXToOriginPos__XToOriginPosAssignment_2"
    // InternalGraphicParser.g:8247:1: rule__GraphicRootClassesItemsConstraintsXToOriginPos__XToOriginPosAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConstraintsXToOriginPos__XToOriginPosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8251:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8252:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8252:2: ( ruleEString )
            // InternalGraphicParser.g:8253:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getXToOriginPosEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsXToOriginPosAccess().getXToOriginPosEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsXToOriginPos__XToOriginPosAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsYToOriginPos__YToOriginPosAssignment_2"
    // InternalGraphicParser.g:8262:1: rule__GraphicRootClassesItemsConstraintsYToOriginPos__YToOriginPosAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConstraintsYToOriginPos__YToOriginPosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8266:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8267:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8267:2: ( ruleEString )
            // InternalGraphicParser.g:8268:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getYToOriginPosEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsYToOriginPosAccess().getYToOriginPosEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsYToOriginPos__YToOriginPosAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsZToOriginPos__ZToOriginPosAssignment_2"
    // InternalGraphicParser.g:8277:1: rule__GraphicRootClassesItemsConstraintsZToOriginPos__ZToOriginPosAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConstraintsZToOriginPos__ZToOriginPosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8281:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8282:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8282:2: ( ruleEString )
            // InternalGraphicParser.g:8283:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getZToOriginPosEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsZToOriginPosAccess().getZToOriginPosEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsZToOriginPos__ZToOriginPosAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsRotation__RotationAssignment_2"
    // InternalGraphicParser.g:8292:1: rule__GraphicRootClassesItemsConstraintsRotation__RotationAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConstraintsRotation__RotationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8296:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8297:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8297:2: ( ruleEString )
            // InternalGraphicParser.g:8298:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getRotationEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsRotationAccess().getRotationEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsRotation__RotationAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsText__TextAssignment_2"
    // InternalGraphicParser.g:8307:1: rule__GraphicRootClassesItemsConstraintsText__TextAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConstraintsText__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8311:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8312:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8312:2: ( ruleEString )
            // InternalGraphicParser.g:8313:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getTextEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsTextAccess().getTextEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsText__TextAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsTrim__TrimAssignment_2"
    // InternalGraphicParser.g:8322:1: rule__GraphicRootClassesItemsConstraintsTrim__TrimAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__GraphicRootClassesItemsConstraintsTrim__TrimAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8326:1: ( ( ruleEBooleanObject ) )
            // InternalGraphicParser.g:8327:2: ( ruleEBooleanObject )
            {
            // InternalGraphicParser.g:8327:2: ( ruleEBooleanObject )
            // InternalGraphicParser.g:8328:3: ruleEBooleanObject
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getTrimEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsTrimAccess().getTrimEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsTrim__TrimAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__CategoryBitMaskAssignment_2"
    // InternalGraphicParser.g:8337:1: rule__GraphicRootClassesItemsConstraintsCategoryBitMask__CategoryBitMaskAssignment_2 : ( ruleEDoubleObject ) ;
    public final void rule__GraphicRootClassesItemsConstraintsCategoryBitMask__CategoryBitMaskAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8341:1: ( ( ruleEDoubleObject ) )
            // InternalGraphicParser.g:8342:2: ( ruleEDoubleObject )
            {
            // InternalGraphicParser.g:8342:2: ( ruleEDoubleObject )
            // InternalGraphicParser.g:8343:3: ruleEDoubleObject
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getCategoryBitMaskEDoubleObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsCategoryBitMaskAccess().getCategoryBitMaskEDoubleObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCategoryBitMask__CategoryBitMaskAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__CollisionBitMaskAssignment_2"
    // InternalGraphicParser.g:8352:1: rule__GraphicRootClassesItemsConstraintsCollisionBitMask__CollisionBitMaskAssignment_2 : ( ruleEDoubleObject ) ;
    public final void rule__GraphicRootClassesItemsConstraintsCollisionBitMask__CollisionBitMaskAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8356:1: ( ( ruleEDoubleObject ) )
            // InternalGraphicParser.g:8357:2: ( ruleEDoubleObject )
            {
            // InternalGraphicParser.g:8357:2: ( ruleEDoubleObject )
            // InternalGraphicParser.g:8358:3: ruleEDoubleObject
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getCollisionBitMaskEDoubleObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsCollisionBitMaskAccess().getCollisionBitMaskEDoubleObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsCollisionBitMask__CollisionBitMaskAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__ContactTestBitMaskAssignment_2"
    // InternalGraphicParser.g:8367:1: rule__GraphicRootClassesItemsConstraintsContactTestBitMask__ContactTestBitMaskAssignment_2 : ( ruleEDoubleObject ) ;
    public final void rule__GraphicRootClassesItemsConstraintsContactTestBitMask__ContactTestBitMaskAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8371:1: ( ( ruleEDoubleObject ) )
            // InternalGraphicParser.g:8372:2: ( ruleEDoubleObject )
            {
            // InternalGraphicParser.g:8372:2: ( ruleEDoubleObject )
            // InternalGraphicParser.g:8373:3: ruleEDoubleObject
            {
             before(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getContactTestBitMaskEDoubleObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConstraintsContactTestBitMaskAccess().getContactTestBitMaskEDoubleObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConstraintsContactTestBitMask__ContactTestBitMaskAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_0"
    // InternalGraphicParser.g:8382:1: rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_0 : ( ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8386:1: ( ( ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) )
            // InternalGraphicParser.g:8387:2: ( ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract )
            {
            // InternalGraphicParser.g:8387:2: ( ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract )
            // InternalGraphicParser.g:8388:3: ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getItemsGraphicRootClassesItemsConnectionsItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getItemsGraphicRootClassesItemsConnectionsItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_1_1"
    // InternalGraphicParser.g:8397:1: rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_1_1 : ( ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8401:1: ( ( ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract ) )
            // InternalGraphicParser.g:8402:2: ( ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract )
            {
            // InternalGraphicParser.g:8402:2: ( ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract )
            // InternalGraphicParser.g:8403:3: ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getItemsGraphicRootClassesItemsConnectionsItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicRootClassesItemsConnectionsItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsAccess().getItemsGraphicRootClassesItemsConnectionsItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsName__NameAssignment_3"
    // InternalGraphicParser.g:8412:1: rule__GraphicRootClassesItemsConnectionsItemsName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8416:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8417:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8417:2: ( ruleEString )
            // InternalGraphicParser.g:8418:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsName__NameAssignment_3"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsType__TypeAssignment_2"
    // InternalGraphicParser.g:8427:1: rule__GraphicRootClassesItemsConnectionsItemsType__TypeAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8431:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8432:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8432:2: ( ruleEString )
            // InternalGraphicParser.g:8433:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getTypeEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTypeAccess().getTypeEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsType__TypeAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsColor__ColorAssignment_2"
    // InternalGraphicParser.g:8442:1: rule__GraphicRootClassesItemsConnectionsItemsColor__ColorAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsColor__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8446:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8447:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8447:2: ( ruleEString )
            // InternalGraphicParser.g:8448:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getColorEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsColorAccess().getColorEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsColor__ColorAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTextColor__TextColorAssignment_2"
    // InternalGraphicParser.g:8457:1: rule__GraphicRootClassesItemsConnectionsItemsTextColor__TextColorAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTextColor__TextColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8461:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8462:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8462:2: ( ruleEString )
            // InternalGraphicParser.g:8463:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getTextColorEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTextColorAccess().getTextColorEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTextColor__TextColorAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecorator__DecoratorAssignment_2"
    // InternalGraphicParser.g:8472:1: rule__GraphicRootClassesItemsConnectionsItemsDecorator__DecoratorAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecorator__DecoratorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8476:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8477:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8477:2: ( ruleEString )
            // InternalGraphicParser.g:8478:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getDecoratorEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorAccess().getDecoratorEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecorator__DecoratorAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__DecoratorColorAssignment_2"
    // InternalGraphicParser.g:8487:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__DecoratorColorAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__DecoratorColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8491:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8492:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8492:2: ( ruleEString )
            // InternalGraphicParser.g:8493:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getDecoratorColorEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorColorAccess().getDecoratorColorEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorColor__DecoratorColorAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__DecoratorWidthAssignment_2"
    // InternalGraphicParser.g:8502:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__DecoratorWidthAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__DecoratorWidthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8506:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8507:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8507:2: ( ruleEString )
            // InternalGraphicParser.g:8508:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getDecoratorWidthEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorWidthAccess().getDecoratorWidthEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorWidth__DecoratorWidthAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__DecoratorPosAssignment_2"
    // InternalGraphicParser.g:8517:1: rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__DecoratorPosAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__DecoratorPosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8521:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8522:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8522:2: ( ruleEString )
            // InternalGraphicParser.g:8523:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getDecoratorPosEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsDecoratorPosAccess().getDecoratorPosEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsDecoratorPos__DecoratorPosAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPattern__PatternAssignment_2"
    // InternalGraphicParser.g:8532:1: rule__GraphicRootClassesItemsConnectionsItemsPattern__PatternAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPattern__PatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8536:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8537:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8537:2: ( ruleEString )
            // InternalGraphicParser.g:8538:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getPatternEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPatternAccess().getPatternEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPattern__PatternAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsWidth__WidthAssignment_2"
    // InternalGraphicParser.g:8547:1: rule__GraphicRootClassesItemsConnectionsItemsWidth__WidthAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsWidth__WidthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8551:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8552:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8552:2: ( ruleEString )
            // InternalGraphicParser.g:8553:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getWidthEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsWidthAccess().getWidthEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsWidth__WidthAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsPosition__PositionAssignment_2"
    // InternalGraphicParser.g:8562:1: rule__GraphicRootClassesItemsConnectionsItemsPosition__PositionAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsPosition__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8566:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8567:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8567:2: ( ruleEString )
            // InternalGraphicParser.g:8568:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getPositionEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsPositionAccess().getPositionEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsPosition__PositionAssignment_2"


    // $ANTLR start "rule__GraphicRootClassesItemsConnectionsItemsTarget__TargetAssignment_2"
    // InternalGraphicParser.g:8577:1: rule__GraphicRootClassesItemsConnectionsItemsTarget__TargetAssignment_2 : ( ruleEString ) ;
    public final void rule__GraphicRootClassesItemsConnectionsItemsTarget__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphicParser.g:8581:1: ( ( ruleEString ) )
            // InternalGraphicParser.g:8582:2: ( ruleEString )
            {
            // InternalGraphicParser.g:8582:2: ( ruleEString )
            // InternalGraphicParser.g:8583:3: ruleEString
            {
             before(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getTargetEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicRootClassesItemsConnectionsItemsTargetAccess().getTargetEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicRootClassesItemsConnectionsItemsTarget__TargetAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0002004402000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004402000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008077FFFFFFFF0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0002000501018420L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000501018420L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002070000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008877FFFFFFFF0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002001838C670D0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001838C670D0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00020026C4380B00L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000026C4380B00L});

}