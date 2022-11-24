package ontological.ontological.ide.contentassist.antlr.internal;
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
import ontological.ontological.services.OntologicalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntologicalParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("URI", "'\"URI\"'");
    		tokenNameToValue.put("Max", "'\"max\"'");
    		tokenNameToValue.put("Min", "'\"min\"'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("Name", "'\"name\"'");
    		tokenNameToValue.put("Type", "'\"type\"'");
    		tokenNameToValue.put("IsKey", "'\"isKey\"'");
    		tokenNameToValue.put("NoSCN", "'\"noSCN\"'");
    		tokenNameToValue.put("AutoID", "'\"autoID\"'");
    		tokenNameToValue.put("Target", "'\"target\"'");
    		tokenNameToValue.put("Classes", "'\"classes\"'");
    		tokenNameToValue.put("Default", "'\"default\"'");
    		tokenNameToValue.put("IsParam", "'\"isParam\"'");
    		tokenNameToValue.put("Physics", "'\"physics\"'");
    		tokenNameToValue.put("Abstract", "'\"abstract\"'");
    		tokenNameToValue.put("External", "'\"external\"'");
    		tokenNameToValue.put("Firebase", "'\"firebase\"'");
    		tokenNameToValue.put("Gameloop", "'\"gameloop\"'");
    		tokenNameToValue.put("Opposite", "'\"opposite\"'");
    		tokenNameToValue.put("ReadOnly", "'\"readOnly\"'");
    		tokenNameToValue.put("Bluetooth", "'\"bluetooth\"'");
    		tokenNameToValue.put("OnlyCodes", "'\"onlyCodes\"'");
    		tokenNameToValue.put("Attributes", "'\"attributes\"'");
    		tokenNameToValue.put("References", "'\"references\"'");
    		tokenNameToValue.put("Containtment", "'\"containtment\"'");
    	}

    	public void setGrammarAccess(OntologicalGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleOntologicalRoot"
    // InternalOntologicalParser.g:87:1: entryRuleOntologicalRoot : ruleOntologicalRoot EOF ;
    public final void entryRuleOntologicalRoot() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:88:1: ( ruleOntologicalRoot EOF )
            // InternalOntologicalParser.g:89:1: ruleOntologicalRoot EOF
            {
             before(grammarAccess.getOntologicalRootRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRoot();

            state._fsp--;

             after(grammarAccess.getOntologicalRootRule()); 
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
    // $ANTLR end "entryRuleOntologicalRoot"


    // $ANTLR start "ruleOntologicalRoot"
    // InternalOntologicalParser.g:96:1: ruleOntologicalRoot : ( ( rule__OntologicalRoot__Group__0 ) ) ;
    public final void ruleOntologicalRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:100:2: ( ( ( rule__OntologicalRoot__Group__0 ) ) )
            // InternalOntologicalParser.g:101:2: ( ( rule__OntologicalRoot__Group__0 ) )
            {
            // InternalOntologicalParser.g:101:2: ( ( rule__OntologicalRoot__Group__0 ) )
            // InternalOntologicalParser.g:102:3: ( rule__OntologicalRoot__Group__0 )
            {
             before(grammarAccess.getOntologicalRootAccess().getGroup()); 
            // InternalOntologicalParser.g:103:3: ( rule__OntologicalRoot__Group__0 )
            // InternalOntologicalParser.g:103:4: rule__OntologicalRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRoot"


    // $ANTLR start "entryRuleOntologicalRootPropertiesAbstract"
    // InternalOntologicalParser.g:112:1: entryRuleOntologicalRootPropertiesAbstract : ruleOntologicalRootPropertiesAbstract EOF ;
    public final void entryRuleOntologicalRootPropertiesAbstract() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:113:1: ( ruleOntologicalRootPropertiesAbstract EOF )
            // InternalOntologicalParser.g:114:1: ruleOntologicalRootPropertiesAbstract EOF
            {
             before(grammarAccess.getOntologicalRootPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootPropertiesAbstract"


    // $ANTLR start "ruleOntologicalRootPropertiesAbstract"
    // InternalOntologicalParser.g:121:1: ruleOntologicalRootPropertiesAbstract : ( ( rule__OntologicalRootPropertiesAbstract__Alternatives ) ) ;
    public final void ruleOntologicalRootPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:125:2: ( ( ( rule__OntologicalRootPropertiesAbstract__Alternatives ) ) )
            // InternalOntologicalParser.g:126:2: ( ( rule__OntologicalRootPropertiesAbstract__Alternatives ) )
            {
            // InternalOntologicalParser.g:126:2: ( ( rule__OntologicalRootPropertiesAbstract__Alternatives ) )
            // InternalOntologicalParser.g:127:3: ( rule__OntologicalRootPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getAlternatives()); 
            // InternalOntologicalParser.g:128:3: ( rule__OntologicalRootPropertiesAbstract__Alternatives )
            // InternalOntologicalParser.g:128:4: rule__OntologicalRootPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootPropertiesAbstract"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsPropertiesAbstract"
    // InternalOntologicalParser.g:137:1: entryRuleOntologicalRootClassesItemsPropertiesAbstract : ruleOntologicalRootClassesItemsPropertiesAbstract EOF ;
    public final void entryRuleOntologicalRootClassesItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:138:1: ( ruleOntologicalRootClassesItemsPropertiesAbstract EOF )
            // InternalOntologicalParser.g:139:1: ruleOntologicalRootClassesItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsPropertiesAbstract"


    // $ANTLR start "ruleOntologicalRootClassesItemsPropertiesAbstract"
    // InternalOntologicalParser.g:146:1: ruleOntologicalRootClassesItemsPropertiesAbstract : ( ( rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleOntologicalRootClassesItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:150:2: ( ( ( rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives ) ) )
            // InternalOntologicalParser.g:151:2: ( ( rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalOntologicalParser.g:151:2: ( ( rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives ) )
            // InternalOntologicalParser.g:152:3: ( rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalOntologicalParser.g:153:3: ( rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives )
            // InternalOntologicalParser.g:153:4: rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsPropertiesAbstract"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract"
    // InternalOntologicalParser.g:162:1: entryRuleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract : ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract EOF ;
    public final void entryRuleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:163:1: ( ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract EOF )
            // InternalOntologicalParser.g:164:1: ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract"
    // InternalOntologicalParser.g:171:1: ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract : ( ( rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:175:2: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives ) ) )
            // InternalOntologicalParser.g:176:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalOntologicalParser.g:176:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives ) )
            // InternalOntologicalParser.g:177:3: ( rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalOntologicalParser.g:178:3: ( rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives )
            // InternalOntologicalParser.g:178:4: rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract"
    // InternalOntologicalParser.g:187:1: entryRuleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract : ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract EOF ;
    public final void entryRuleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:188:1: ( ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract EOF )
            // InternalOntologicalParser.g:189:1: ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract"
    // InternalOntologicalParser.g:196:1: ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract : ( ( rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:200:2: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives ) ) )
            // InternalOntologicalParser.g:201:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalOntologicalParser.g:201:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives ) )
            // InternalOntologicalParser.g:202:3: ( rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalOntologicalParser.g:203:3: ( rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives )
            // InternalOntologicalParser.g:203:4: rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract"


    // $ANTLR start "entryRuleOntologicalRootName"
    // InternalOntologicalParser.g:212:1: entryRuleOntologicalRootName : ruleOntologicalRootName EOF ;
    public final void entryRuleOntologicalRootName() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:213:1: ( ruleOntologicalRootName EOF )
            // InternalOntologicalParser.g:214:1: ruleOntologicalRootName EOF
            {
             before(grammarAccess.getOntologicalRootNameRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootName();

            state._fsp--;

             after(grammarAccess.getOntologicalRootNameRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootName"


    // $ANTLR start "ruleOntologicalRootName"
    // InternalOntologicalParser.g:221:1: ruleOntologicalRootName : ( ( rule__OntologicalRootName__Group__0 ) ) ;
    public final void ruleOntologicalRootName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:225:2: ( ( ( rule__OntologicalRootName__Group__0 ) ) )
            // InternalOntologicalParser.g:226:2: ( ( rule__OntologicalRootName__Group__0 ) )
            {
            // InternalOntologicalParser.g:226:2: ( ( rule__OntologicalRootName__Group__0 ) )
            // InternalOntologicalParser.g:227:3: ( rule__OntologicalRootName__Group__0 )
            {
             before(grammarAccess.getOntologicalRootNameAccess().getGroup()); 
            // InternalOntologicalParser.g:228:3: ( rule__OntologicalRootName__Group__0 )
            // InternalOntologicalParser.g:228:4: rule__OntologicalRootName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootName"


    // $ANTLR start "entryRuleOntologicalRootURI"
    // InternalOntologicalParser.g:237:1: entryRuleOntologicalRootURI : ruleOntologicalRootURI EOF ;
    public final void entryRuleOntologicalRootURI() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:238:1: ( ruleOntologicalRootURI EOF )
            // InternalOntologicalParser.g:239:1: ruleOntologicalRootURI EOF
            {
             before(grammarAccess.getOntologicalRootURIRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootURI();

            state._fsp--;

             after(grammarAccess.getOntologicalRootURIRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootURI"


    // $ANTLR start "ruleOntologicalRootURI"
    // InternalOntologicalParser.g:246:1: ruleOntologicalRootURI : ( ( rule__OntologicalRootURI__Group__0 ) ) ;
    public final void ruleOntologicalRootURI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:250:2: ( ( ( rule__OntologicalRootURI__Group__0 ) ) )
            // InternalOntologicalParser.g:251:2: ( ( rule__OntologicalRootURI__Group__0 ) )
            {
            // InternalOntologicalParser.g:251:2: ( ( rule__OntologicalRootURI__Group__0 ) )
            // InternalOntologicalParser.g:252:3: ( rule__OntologicalRootURI__Group__0 )
            {
             before(grammarAccess.getOntologicalRootURIAccess().getGroup()); 
            // InternalOntologicalParser.g:253:3: ( rule__OntologicalRootURI__Group__0 )
            // InternalOntologicalParser.g:253:4: rule__OntologicalRootURI__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootURI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootURIAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootURI"


    // $ANTLR start "entryRuleOntologicalRootOnlyCodes"
    // InternalOntologicalParser.g:262:1: entryRuleOntologicalRootOnlyCodes : ruleOntologicalRootOnlyCodes EOF ;
    public final void entryRuleOntologicalRootOnlyCodes() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:263:1: ( ruleOntologicalRootOnlyCodes EOF )
            // InternalOntologicalParser.g:264:1: ruleOntologicalRootOnlyCodes EOF
            {
             before(grammarAccess.getOntologicalRootOnlyCodesRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootOnlyCodes();

            state._fsp--;

             after(grammarAccess.getOntologicalRootOnlyCodesRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootOnlyCodes"


    // $ANTLR start "ruleOntologicalRootOnlyCodes"
    // InternalOntologicalParser.g:271:1: ruleOntologicalRootOnlyCodes : ( ( rule__OntologicalRootOnlyCodes__Group__0 ) ) ;
    public final void ruleOntologicalRootOnlyCodes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:275:2: ( ( ( rule__OntologicalRootOnlyCodes__Group__0 ) ) )
            // InternalOntologicalParser.g:276:2: ( ( rule__OntologicalRootOnlyCodes__Group__0 ) )
            {
            // InternalOntologicalParser.g:276:2: ( ( rule__OntologicalRootOnlyCodes__Group__0 ) )
            // InternalOntologicalParser.g:277:3: ( rule__OntologicalRootOnlyCodes__Group__0 )
            {
             before(grammarAccess.getOntologicalRootOnlyCodesAccess().getGroup()); 
            // InternalOntologicalParser.g:278:3: ( rule__OntologicalRootOnlyCodes__Group__0 )
            // InternalOntologicalParser.g:278:4: rule__OntologicalRootOnlyCodes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootOnlyCodes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootOnlyCodesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootOnlyCodes"


    // $ANTLR start "entryRuleOntologicalRootBluetooth"
    // InternalOntologicalParser.g:287:1: entryRuleOntologicalRootBluetooth : ruleOntologicalRootBluetooth EOF ;
    public final void entryRuleOntologicalRootBluetooth() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:288:1: ( ruleOntologicalRootBluetooth EOF )
            // InternalOntologicalParser.g:289:1: ruleOntologicalRootBluetooth EOF
            {
             before(grammarAccess.getOntologicalRootBluetoothRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootBluetooth();

            state._fsp--;

             after(grammarAccess.getOntologicalRootBluetoothRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootBluetooth"


    // $ANTLR start "ruleOntologicalRootBluetooth"
    // InternalOntologicalParser.g:296:1: ruleOntologicalRootBluetooth : ( ( rule__OntologicalRootBluetooth__Group__0 ) ) ;
    public final void ruleOntologicalRootBluetooth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:300:2: ( ( ( rule__OntologicalRootBluetooth__Group__0 ) ) )
            // InternalOntologicalParser.g:301:2: ( ( rule__OntologicalRootBluetooth__Group__0 ) )
            {
            // InternalOntologicalParser.g:301:2: ( ( rule__OntologicalRootBluetooth__Group__0 ) )
            // InternalOntologicalParser.g:302:3: ( rule__OntologicalRootBluetooth__Group__0 )
            {
             before(grammarAccess.getOntologicalRootBluetoothAccess().getGroup()); 
            // InternalOntologicalParser.g:303:3: ( rule__OntologicalRootBluetooth__Group__0 )
            // InternalOntologicalParser.g:303:4: rule__OntologicalRootBluetooth__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootBluetooth__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootBluetoothAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootBluetooth"


    // $ANTLR start "entryRuleOntologicalRootExternal"
    // InternalOntologicalParser.g:312:1: entryRuleOntologicalRootExternal : ruleOntologicalRootExternal EOF ;
    public final void entryRuleOntologicalRootExternal() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:313:1: ( ruleOntologicalRootExternal EOF )
            // InternalOntologicalParser.g:314:1: ruleOntologicalRootExternal EOF
            {
             before(grammarAccess.getOntologicalRootExternalRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootExternal();

            state._fsp--;

             after(grammarAccess.getOntologicalRootExternalRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootExternal"


    // $ANTLR start "ruleOntologicalRootExternal"
    // InternalOntologicalParser.g:321:1: ruleOntologicalRootExternal : ( ( rule__OntologicalRootExternal__Group__0 ) ) ;
    public final void ruleOntologicalRootExternal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:325:2: ( ( ( rule__OntologicalRootExternal__Group__0 ) ) )
            // InternalOntologicalParser.g:326:2: ( ( rule__OntologicalRootExternal__Group__0 ) )
            {
            // InternalOntologicalParser.g:326:2: ( ( rule__OntologicalRootExternal__Group__0 ) )
            // InternalOntologicalParser.g:327:3: ( rule__OntologicalRootExternal__Group__0 )
            {
             before(grammarAccess.getOntologicalRootExternalAccess().getGroup()); 
            // InternalOntologicalParser.g:328:3: ( rule__OntologicalRootExternal__Group__0 )
            // InternalOntologicalParser.g:328:4: rule__OntologicalRootExternal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootExternal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootExternalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootExternal"


    // $ANTLR start "entryRuleOntologicalRootFirebase"
    // InternalOntologicalParser.g:337:1: entryRuleOntologicalRootFirebase : ruleOntologicalRootFirebase EOF ;
    public final void entryRuleOntologicalRootFirebase() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:338:1: ( ruleOntologicalRootFirebase EOF )
            // InternalOntologicalParser.g:339:1: ruleOntologicalRootFirebase EOF
            {
             before(grammarAccess.getOntologicalRootFirebaseRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootFirebase();

            state._fsp--;

             after(grammarAccess.getOntologicalRootFirebaseRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootFirebase"


    // $ANTLR start "ruleOntologicalRootFirebase"
    // InternalOntologicalParser.g:346:1: ruleOntologicalRootFirebase : ( ( rule__OntologicalRootFirebase__Group__0 ) ) ;
    public final void ruleOntologicalRootFirebase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:350:2: ( ( ( rule__OntologicalRootFirebase__Group__0 ) ) )
            // InternalOntologicalParser.g:351:2: ( ( rule__OntologicalRootFirebase__Group__0 ) )
            {
            // InternalOntologicalParser.g:351:2: ( ( rule__OntologicalRootFirebase__Group__0 ) )
            // InternalOntologicalParser.g:352:3: ( rule__OntologicalRootFirebase__Group__0 )
            {
             before(grammarAccess.getOntologicalRootFirebaseAccess().getGroup()); 
            // InternalOntologicalParser.g:353:3: ( rule__OntologicalRootFirebase__Group__0 )
            // InternalOntologicalParser.g:353:4: rule__OntologicalRootFirebase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootFirebase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootFirebaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootFirebase"


    // $ANTLR start "entryRuleOntologicalRootPhysics"
    // InternalOntologicalParser.g:362:1: entryRuleOntologicalRootPhysics : ruleOntologicalRootPhysics EOF ;
    public final void entryRuleOntologicalRootPhysics() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:363:1: ( ruleOntologicalRootPhysics EOF )
            // InternalOntologicalParser.g:364:1: ruleOntologicalRootPhysics EOF
            {
             before(grammarAccess.getOntologicalRootPhysicsRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootPhysics();

            state._fsp--;

             after(grammarAccess.getOntologicalRootPhysicsRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootPhysics"


    // $ANTLR start "ruleOntologicalRootPhysics"
    // InternalOntologicalParser.g:371:1: ruleOntologicalRootPhysics : ( ( rule__OntologicalRootPhysics__Group__0 ) ) ;
    public final void ruleOntologicalRootPhysics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:375:2: ( ( ( rule__OntologicalRootPhysics__Group__0 ) ) )
            // InternalOntologicalParser.g:376:2: ( ( rule__OntologicalRootPhysics__Group__0 ) )
            {
            // InternalOntologicalParser.g:376:2: ( ( rule__OntologicalRootPhysics__Group__0 ) )
            // InternalOntologicalParser.g:377:3: ( rule__OntologicalRootPhysics__Group__0 )
            {
             before(grammarAccess.getOntologicalRootPhysicsAccess().getGroup()); 
            // InternalOntologicalParser.g:378:3: ( rule__OntologicalRootPhysics__Group__0 )
            // InternalOntologicalParser.g:378:4: rule__OntologicalRootPhysics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootPhysics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootPhysicsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootPhysics"


    // $ANTLR start "entryRuleOntologicalRootGameloop"
    // InternalOntologicalParser.g:387:1: entryRuleOntologicalRootGameloop : ruleOntologicalRootGameloop EOF ;
    public final void entryRuleOntologicalRootGameloop() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:388:1: ( ruleOntologicalRootGameloop EOF )
            // InternalOntologicalParser.g:389:1: ruleOntologicalRootGameloop EOF
            {
             before(grammarAccess.getOntologicalRootGameloopRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootGameloop();

            state._fsp--;

             after(grammarAccess.getOntologicalRootGameloopRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootGameloop"


    // $ANTLR start "ruleOntologicalRootGameloop"
    // InternalOntologicalParser.g:396:1: ruleOntologicalRootGameloop : ( ( rule__OntologicalRootGameloop__Group__0 ) ) ;
    public final void ruleOntologicalRootGameloop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:400:2: ( ( ( rule__OntologicalRootGameloop__Group__0 ) ) )
            // InternalOntologicalParser.g:401:2: ( ( rule__OntologicalRootGameloop__Group__0 ) )
            {
            // InternalOntologicalParser.g:401:2: ( ( rule__OntologicalRootGameloop__Group__0 ) )
            // InternalOntologicalParser.g:402:3: ( rule__OntologicalRootGameloop__Group__0 )
            {
             before(grammarAccess.getOntologicalRootGameloopAccess().getGroup()); 
            // InternalOntologicalParser.g:403:3: ( rule__OntologicalRootGameloop__Group__0 )
            // InternalOntologicalParser.g:403:4: rule__OntologicalRootGameloop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootGameloop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootGameloopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootGameloop"


    // $ANTLR start "entryRuleOntologicalRootClasses"
    // InternalOntologicalParser.g:412:1: entryRuleOntologicalRootClasses : ruleOntologicalRootClasses EOF ;
    public final void entryRuleOntologicalRootClasses() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:413:1: ( ruleOntologicalRootClasses EOF )
            // InternalOntologicalParser.g:414:1: ruleOntologicalRootClasses EOF
            {
             before(grammarAccess.getOntologicalRootClassesRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClasses();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClasses"


    // $ANTLR start "ruleOntologicalRootClasses"
    // InternalOntologicalParser.g:421:1: ruleOntologicalRootClasses : ( ( rule__OntologicalRootClasses__Group__0 ) ) ;
    public final void ruleOntologicalRootClasses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:425:2: ( ( ( rule__OntologicalRootClasses__Group__0 ) ) )
            // InternalOntologicalParser.g:426:2: ( ( rule__OntologicalRootClasses__Group__0 ) )
            {
            // InternalOntologicalParser.g:426:2: ( ( rule__OntologicalRootClasses__Group__0 ) )
            // InternalOntologicalParser.g:427:3: ( rule__OntologicalRootClasses__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getGroup()); 
            // InternalOntologicalParser.g:428:3: ( rule__OntologicalRootClasses__Group__0 )
            // InternalOntologicalParser.g:428:4: rule__OntologicalRootClasses__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClasses"


    // $ANTLR start "entryRuleEString"
    // InternalOntologicalParser.g:437:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:438:1: ( ruleEString EOF )
            // InternalOntologicalParser.g:439:1: ruleEString EOF
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
    // InternalOntologicalParser.g:446:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:450:2: ( ( ruleVALID_STRING ) )
            // InternalOntologicalParser.g:451:2: ( ruleVALID_STRING )
            {
            // InternalOntologicalParser.g:451:2: ( ruleVALID_STRING )
            // InternalOntologicalParser.g:452:3: ruleVALID_STRING
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


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalOntologicalParser.g:462:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:463:1: ( ruleEBooleanObject EOF )
            // InternalOntologicalParser.g:464:1: ruleEBooleanObject EOF
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
    // InternalOntologicalParser.g:471:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:475:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalOntologicalParser.g:476:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalOntologicalParser.g:476:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalOntologicalParser.g:477:3: ( rule__EBooleanObject__Alternatives )
            {
             before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            // InternalOntologicalParser.g:478:3: ( rule__EBooleanObject__Alternatives )
            // InternalOntologicalParser.g:478:4: rule__EBooleanObject__Alternatives
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


    // $ANTLR start "entryRuleOntologicalRootClassesItems"
    // InternalOntologicalParser.g:487:1: entryRuleOntologicalRootClassesItems : ruleOntologicalRootClassesItems EOF ;
    public final void entryRuleOntologicalRootClassesItems() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:488:1: ( ruleOntologicalRootClassesItems EOF )
            // InternalOntologicalParser.g:489:1: ruleOntologicalRootClassesItems EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItems();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItems"


    // $ANTLR start "ruleOntologicalRootClassesItems"
    // InternalOntologicalParser.g:496:1: ruleOntologicalRootClassesItems : ( ( rule__OntologicalRootClassesItems__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:500:2: ( ( ( rule__OntologicalRootClassesItems__Group__0 ) ) )
            // InternalOntologicalParser.g:501:2: ( ( rule__OntologicalRootClassesItems__Group__0 ) )
            {
            // InternalOntologicalParser.g:501:2: ( ( rule__OntologicalRootClassesItems__Group__0 ) )
            // InternalOntologicalParser.g:502:3: ( rule__OntologicalRootClassesItems__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAccess().getGroup()); 
            // InternalOntologicalParser.g:503:3: ( rule__OntologicalRootClassesItems__Group__0 )
            // InternalOntologicalParser.g:503:4: rule__OntologicalRootClassesItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItems"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsName"
    // InternalOntologicalParser.g:512:1: entryRuleOntologicalRootClassesItemsName : ruleOntologicalRootClassesItemsName EOF ;
    public final void entryRuleOntologicalRootClassesItemsName() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:513:1: ( ruleOntologicalRootClassesItemsName EOF )
            // InternalOntologicalParser.g:514:1: ruleOntologicalRootClassesItemsName EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsNameRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsName();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsNameRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsName"


    // $ANTLR start "ruleOntologicalRootClassesItemsName"
    // InternalOntologicalParser.g:521:1: ruleOntologicalRootClassesItemsName : ( ( rule__OntologicalRootClassesItemsName__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:525:2: ( ( ( rule__OntologicalRootClassesItemsName__Group__0 ) ) )
            // InternalOntologicalParser.g:526:2: ( ( rule__OntologicalRootClassesItemsName__Group__0 ) )
            {
            // InternalOntologicalParser.g:526:2: ( ( rule__OntologicalRootClassesItemsName__Group__0 ) )
            // InternalOntologicalParser.g:527:3: ( rule__OntologicalRootClassesItemsName__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsNameAccess().getGroup()); 
            // InternalOntologicalParser.g:528:3: ( rule__OntologicalRootClassesItemsName__Group__0 )
            // InternalOntologicalParser.g:528:4: rule__OntologicalRootClassesItemsName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsName"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAbstract"
    // InternalOntologicalParser.g:537:1: entryRuleOntologicalRootClassesItemsAbstract : ruleOntologicalRootClassesItemsAbstract EOF ;
    public final void entryRuleOntologicalRootClassesItemsAbstract() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:538:1: ( ruleOntologicalRootClassesItemsAbstract EOF )
            // InternalOntologicalParser.g:539:1: ruleOntologicalRootClassesItemsAbstract EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAbstractRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAbstract"


    // $ANTLR start "ruleOntologicalRootClassesItemsAbstract"
    // InternalOntologicalParser.g:546:1: ruleOntologicalRootClassesItemsAbstract : ( ( rule__OntologicalRootClassesItemsAbstract__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:550:2: ( ( ( rule__OntologicalRootClassesItemsAbstract__Group__0 ) ) )
            // InternalOntologicalParser.g:551:2: ( ( rule__OntologicalRootClassesItemsAbstract__Group__0 ) )
            {
            // InternalOntologicalParser.g:551:2: ( ( rule__OntologicalRootClassesItemsAbstract__Group__0 ) )
            // InternalOntologicalParser.g:552:3: ( rule__OntologicalRootClassesItemsAbstract__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getGroup()); 
            // InternalOntologicalParser.g:553:3: ( rule__OntologicalRootClassesItemsAbstract__Group__0 )
            // InternalOntologicalParser.g:553:4: rule__OntologicalRootClassesItemsAbstract__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAbstract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAbstract"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributes"
    // InternalOntologicalParser.g:562:1: entryRuleOntologicalRootClassesItemsAttributes : ruleOntologicalRootClassesItemsAttributes EOF ;
    public final void entryRuleOntologicalRootClassesItemsAttributes() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:563:1: ( ruleOntologicalRootClassesItemsAttributes EOF )
            // InternalOntologicalParser.g:564:1: ruleOntologicalRootClassesItemsAttributes EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAttributes();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributes"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributes"
    // InternalOntologicalParser.g:571:1: ruleOntologicalRootClassesItemsAttributes : ( ( rule__OntologicalRootClassesItemsAttributes__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:575:2: ( ( ( rule__OntologicalRootClassesItemsAttributes__Group__0 ) ) )
            // InternalOntologicalParser.g:576:2: ( ( rule__OntologicalRootClassesItemsAttributes__Group__0 ) )
            {
            // InternalOntologicalParser.g:576:2: ( ( rule__OntologicalRootClassesItemsAttributes__Group__0 ) )
            // InternalOntologicalParser.g:577:3: ( rule__OntologicalRootClassesItemsAttributes__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getGroup()); 
            // InternalOntologicalParser.g:578:3: ( rule__OntologicalRootClassesItemsAttributes__Group__0 )
            // InternalOntologicalParser.g:578:4: rule__OntologicalRootClassesItemsAttributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributes"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferences"
    // InternalOntologicalParser.g:587:1: entryRuleOntologicalRootClassesItemsReferences : ruleOntologicalRootClassesItemsReferences EOF ;
    public final void entryRuleOntologicalRootClassesItemsReferences() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:588:1: ( ruleOntologicalRootClassesItemsReferences EOF )
            // InternalOntologicalParser.g:589:1: ruleOntologicalRootClassesItemsReferences EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsReferences();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferences"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferences"
    // InternalOntologicalParser.g:596:1: ruleOntologicalRootClassesItemsReferences : ( ( rule__OntologicalRootClassesItemsReferences__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsReferences() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:600:2: ( ( ( rule__OntologicalRootClassesItemsReferences__Group__0 ) ) )
            // InternalOntologicalParser.g:601:2: ( ( rule__OntologicalRootClassesItemsReferences__Group__0 ) )
            {
            // InternalOntologicalParser.g:601:2: ( ( rule__OntologicalRootClassesItemsReferences__Group__0 ) )
            // InternalOntologicalParser.g:602:3: ( rule__OntologicalRootClassesItemsReferences__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getGroup()); 
            // InternalOntologicalParser.g:603:3: ( rule__OntologicalRootClassesItemsReferences__Group__0 )
            // InternalOntologicalParser.g:603:4: rule__OntologicalRootClassesItemsReferences__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsReferences"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAutoID"
    // InternalOntologicalParser.g:612:1: entryRuleOntologicalRootClassesItemsAutoID : ruleOntologicalRootClassesItemsAutoID EOF ;
    public final void entryRuleOntologicalRootClassesItemsAutoID() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:613:1: ( ruleOntologicalRootClassesItemsAutoID EOF )
            // InternalOntologicalParser.g:614:1: ruleOntologicalRootClassesItemsAutoID EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAutoIDRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAutoID();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAutoIDRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAutoID"


    // $ANTLR start "ruleOntologicalRootClassesItemsAutoID"
    // InternalOntologicalParser.g:621:1: ruleOntologicalRootClassesItemsAutoID : ( ( rule__OntologicalRootClassesItemsAutoID__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsAutoID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:625:2: ( ( ( rule__OntologicalRootClassesItemsAutoID__Group__0 ) ) )
            // InternalOntologicalParser.g:626:2: ( ( rule__OntologicalRootClassesItemsAutoID__Group__0 ) )
            {
            // InternalOntologicalParser.g:626:2: ( ( rule__OntologicalRootClassesItemsAutoID__Group__0 ) )
            // InternalOntologicalParser.g:627:3: ( rule__OntologicalRootClassesItemsAutoID__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getGroup()); 
            // InternalOntologicalParser.g:628:3: ( rule__OntologicalRootClassesItemsAutoID__Group__0 )
            // InternalOntologicalParser.g:628:4: rule__OntologicalRootClassesItemsAutoID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAutoID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAutoID"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsOnlyCodes"
    // InternalOntologicalParser.g:637:1: entryRuleOntologicalRootClassesItemsOnlyCodes : ruleOntologicalRootClassesItemsOnlyCodes EOF ;
    public final void entryRuleOntologicalRootClassesItemsOnlyCodes() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:638:1: ( ruleOntologicalRootClassesItemsOnlyCodes EOF )
            // InternalOntologicalParser.g:639:1: ruleOntologicalRootClassesItemsOnlyCodes EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsOnlyCodesRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsOnlyCodes();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsOnlyCodesRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsOnlyCodes"


    // $ANTLR start "ruleOntologicalRootClassesItemsOnlyCodes"
    // InternalOntologicalParser.g:646:1: ruleOntologicalRootClassesItemsOnlyCodes : ( ( rule__OntologicalRootClassesItemsOnlyCodes__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsOnlyCodes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:650:2: ( ( ( rule__OntologicalRootClassesItemsOnlyCodes__Group__0 ) ) )
            // InternalOntologicalParser.g:651:2: ( ( rule__OntologicalRootClassesItemsOnlyCodes__Group__0 ) )
            {
            // InternalOntologicalParser.g:651:2: ( ( rule__OntologicalRootClassesItemsOnlyCodes__Group__0 ) )
            // InternalOntologicalParser.g:652:3: ( rule__OntologicalRootClassesItemsOnlyCodes__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getGroup()); 
            // InternalOntologicalParser.g:653:3: ( rule__OntologicalRootClassesItemsOnlyCodes__Group__0 )
            // InternalOntologicalParser.g:653:4: rule__OntologicalRootClassesItemsOnlyCodes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsOnlyCodes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsOnlyCodes"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsBluetooth"
    // InternalOntologicalParser.g:662:1: entryRuleOntologicalRootClassesItemsBluetooth : ruleOntologicalRootClassesItemsBluetooth EOF ;
    public final void entryRuleOntologicalRootClassesItemsBluetooth() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:663:1: ( ruleOntologicalRootClassesItemsBluetooth EOF )
            // InternalOntologicalParser.g:664:1: ruleOntologicalRootClassesItemsBluetooth EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsBluetoothRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsBluetooth();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsBluetoothRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsBluetooth"


    // $ANTLR start "ruleOntologicalRootClassesItemsBluetooth"
    // InternalOntologicalParser.g:671:1: ruleOntologicalRootClassesItemsBluetooth : ( ( rule__OntologicalRootClassesItemsBluetooth__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsBluetooth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:675:2: ( ( ( rule__OntologicalRootClassesItemsBluetooth__Group__0 ) ) )
            // InternalOntologicalParser.g:676:2: ( ( rule__OntologicalRootClassesItemsBluetooth__Group__0 ) )
            {
            // InternalOntologicalParser.g:676:2: ( ( rule__OntologicalRootClassesItemsBluetooth__Group__0 ) )
            // InternalOntologicalParser.g:677:3: ( rule__OntologicalRootClassesItemsBluetooth__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getGroup()); 
            // InternalOntologicalParser.g:678:3: ( rule__OntologicalRootClassesItemsBluetooth__Group__0 )
            // InternalOntologicalParser.g:678:4: rule__OntologicalRootClassesItemsBluetooth__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsBluetooth__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsBluetooth"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsNoSCN"
    // InternalOntologicalParser.g:687:1: entryRuleOntologicalRootClassesItemsNoSCN : ruleOntologicalRootClassesItemsNoSCN EOF ;
    public final void entryRuleOntologicalRootClassesItemsNoSCN() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:688:1: ( ruleOntologicalRootClassesItemsNoSCN EOF )
            // InternalOntologicalParser.g:689:1: ruleOntologicalRootClassesItemsNoSCN EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsNoSCNRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsNoSCN();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsNoSCNRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsNoSCN"


    // $ANTLR start "ruleOntologicalRootClassesItemsNoSCN"
    // InternalOntologicalParser.g:696:1: ruleOntologicalRootClassesItemsNoSCN : ( ( rule__OntologicalRootClassesItemsNoSCN__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsNoSCN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:700:2: ( ( ( rule__OntologicalRootClassesItemsNoSCN__Group__0 ) ) )
            // InternalOntologicalParser.g:701:2: ( ( rule__OntologicalRootClassesItemsNoSCN__Group__0 ) )
            {
            // InternalOntologicalParser.g:701:2: ( ( rule__OntologicalRootClassesItemsNoSCN__Group__0 ) )
            // InternalOntologicalParser.g:702:3: ( rule__OntologicalRootClassesItemsNoSCN__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getGroup()); 
            // InternalOntologicalParser.g:703:3: ( rule__OntologicalRootClassesItemsNoSCN__Group__0 )
            // InternalOntologicalParser.g:703:4: rule__OntologicalRootClassesItemsNoSCN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsNoSCN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsNoSCN"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItems"
    // InternalOntologicalParser.g:712:1: entryRuleOntologicalRootClassesItemsAttributesItems : ruleOntologicalRootClassesItemsAttributesItems EOF ;
    public final void entryRuleOntologicalRootClassesItemsAttributesItems() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:713:1: ( ruleOntologicalRootClassesItemsAttributesItems EOF )
            // InternalOntologicalParser.g:714:1: ruleOntologicalRootClassesItemsAttributesItems EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAttributesItems();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItems"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItems"
    // InternalOntologicalParser.g:721:1: ruleOntologicalRootClassesItemsAttributesItems : ( ( rule__OntologicalRootClassesItemsAttributesItems__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsAttributesItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:725:2: ( ( ( rule__OntologicalRootClassesItemsAttributesItems__Group__0 ) ) )
            // InternalOntologicalParser.g:726:2: ( ( rule__OntologicalRootClassesItemsAttributesItems__Group__0 ) )
            {
            // InternalOntologicalParser.g:726:2: ( ( rule__OntologicalRootClassesItemsAttributesItems__Group__0 ) )
            // InternalOntologicalParser.g:727:3: ( rule__OntologicalRootClassesItemsAttributesItems__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getGroup()); 
            // InternalOntologicalParser.g:728:3: ( rule__OntologicalRootClassesItemsAttributesItems__Group__0 )
            // InternalOntologicalParser.g:728:4: rule__OntologicalRootClassesItemsAttributesItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItems"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsName"
    // InternalOntologicalParser.g:737:1: entryRuleOntologicalRootClassesItemsAttributesItemsName : ruleOntologicalRootClassesItemsAttributesItemsName EOF ;
    public final void entryRuleOntologicalRootClassesItemsAttributesItemsName() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:738:1: ( ruleOntologicalRootClassesItemsAttributesItemsName EOF )
            // InternalOntologicalParser.g:739:1: ruleOntologicalRootClassesItemsAttributesItemsName EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAttributesItemsName();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsName"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsName"
    // InternalOntologicalParser.g:746:1: ruleOntologicalRootClassesItemsAttributesItemsName : ( ( rule__OntologicalRootClassesItemsAttributesItemsName__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsAttributesItemsName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:750:2: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsName__Group__0 ) ) )
            // InternalOntologicalParser.g:751:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsName__Group__0 ) )
            {
            // InternalOntologicalParser.g:751:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsName__Group__0 ) )
            // InternalOntologicalParser.g:752:3: ( rule__OntologicalRootClassesItemsAttributesItemsName__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getGroup()); 
            // InternalOntologicalParser.g:753:3: ( rule__OntologicalRootClassesItemsAttributesItemsName__Group__0 )
            // InternalOntologicalParser.g:753:4: rule__OntologicalRootClassesItemsAttributesItemsName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsName"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsType"
    // InternalOntologicalParser.g:762:1: entryRuleOntologicalRootClassesItemsAttributesItemsType : ruleOntologicalRootClassesItemsAttributesItemsType EOF ;
    public final void entryRuleOntologicalRootClassesItemsAttributesItemsType() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:763:1: ( ruleOntologicalRootClassesItemsAttributesItemsType EOF )
            // InternalOntologicalParser.g:764:1: ruleOntologicalRootClassesItemsAttributesItemsType EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAttributesItemsType();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsType"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsType"
    // InternalOntologicalParser.g:771:1: ruleOntologicalRootClassesItemsAttributesItemsType : ( ( rule__OntologicalRootClassesItemsAttributesItemsType__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsAttributesItemsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:775:2: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsType__Group__0 ) ) )
            // InternalOntologicalParser.g:776:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsType__Group__0 ) )
            {
            // InternalOntologicalParser.g:776:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsType__Group__0 ) )
            // InternalOntologicalParser.g:777:3: ( rule__OntologicalRootClassesItemsAttributesItemsType__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getGroup()); 
            // InternalOntologicalParser.g:778:3: ( rule__OntologicalRootClassesItemsAttributesItemsType__Group__0 )
            // InternalOntologicalParser.g:778:4: rule__OntologicalRootClassesItemsAttributesItemsType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsType"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsMin"
    // InternalOntologicalParser.g:787:1: entryRuleOntologicalRootClassesItemsAttributesItemsMin : ruleOntologicalRootClassesItemsAttributesItemsMin EOF ;
    public final void entryRuleOntologicalRootClassesItemsAttributesItemsMin() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:788:1: ( ruleOntologicalRootClassesItemsAttributesItemsMin EOF )
            // InternalOntologicalParser.g:789:1: ruleOntologicalRootClassesItemsAttributesItemsMin EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAttributesItemsMin();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsMin"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsMin"
    // InternalOntologicalParser.g:796:1: ruleOntologicalRootClassesItemsAttributesItemsMin : ( ( rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsAttributesItemsMin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:800:2: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0 ) ) )
            // InternalOntologicalParser.g:801:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0 ) )
            {
            // InternalOntologicalParser.g:801:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0 ) )
            // InternalOntologicalParser.g:802:3: ( rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getGroup()); 
            // InternalOntologicalParser.g:803:3: ( rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0 )
            // InternalOntologicalParser.g:803:4: rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsMin"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsMax"
    // InternalOntologicalParser.g:812:1: entryRuleOntologicalRootClassesItemsAttributesItemsMax : ruleOntologicalRootClassesItemsAttributesItemsMax EOF ;
    public final void entryRuleOntologicalRootClassesItemsAttributesItemsMax() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:813:1: ( ruleOntologicalRootClassesItemsAttributesItemsMax EOF )
            // InternalOntologicalParser.g:814:1: ruleOntologicalRootClassesItemsAttributesItemsMax EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAttributesItemsMax();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsMax"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsMax"
    // InternalOntologicalParser.g:821:1: ruleOntologicalRootClassesItemsAttributesItemsMax : ( ( rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsAttributesItemsMax() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:825:2: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0 ) ) )
            // InternalOntologicalParser.g:826:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0 ) )
            {
            // InternalOntologicalParser.g:826:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0 ) )
            // InternalOntologicalParser.g:827:3: ( rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getGroup()); 
            // InternalOntologicalParser.g:828:3: ( rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0 )
            // InternalOntologicalParser.g:828:4: rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsMax"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsDefault"
    // InternalOntologicalParser.g:837:1: entryRuleOntologicalRootClassesItemsAttributesItemsDefault : ruleOntologicalRootClassesItemsAttributesItemsDefault EOF ;
    public final void entryRuleOntologicalRootClassesItemsAttributesItemsDefault() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:838:1: ( ruleOntologicalRootClassesItemsAttributesItemsDefault EOF )
            // InternalOntologicalParser.g:839:1: ruleOntologicalRootClassesItemsAttributesItemsDefault EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAttributesItemsDefault();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsDefault"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsDefault"
    // InternalOntologicalParser.g:846:1: ruleOntologicalRootClassesItemsAttributesItemsDefault : ( ( rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsAttributesItemsDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:850:2: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0 ) ) )
            // InternalOntologicalParser.g:851:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0 ) )
            {
            // InternalOntologicalParser.g:851:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0 ) )
            // InternalOntologicalParser.g:852:3: ( rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getGroup()); 
            // InternalOntologicalParser.g:853:3: ( rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0 )
            // InternalOntologicalParser.g:853:4: rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsDefault"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsReadOnly"
    // InternalOntologicalParser.g:862:1: entryRuleOntologicalRootClassesItemsAttributesItemsReadOnly : ruleOntologicalRootClassesItemsAttributesItemsReadOnly EOF ;
    public final void entryRuleOntologicalRootClassesItemsAttributesItemsReadOnly() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:863:1: ( ruleOntologicalRootClassesItemsAttributesItemsReadOnly EOF )
            // InternalOntologicalParser.g:864:1: ruleOntologicalRootClassesItemsAttributesItemsReadOnly EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAttributesItemsReadOnly();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsReadOnly"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsReadOnly"
    // InternalOntologicalParser.g:871:1: ruleOntologicalRootClassesItemsAttributesItemsReadOnly : ( ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsAttributesItemsReadOnly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:875:2: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0 ) ) )
            // InternalOntologicalParser.g:876:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0 ) )
            {
            // InternalOntologicalParser.g:876:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0 ) )
            // InternalOntologicalParser.g:877:3: ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getGroup()); 
            // InternalOntologicalParser.g:878:3: ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0 )
            // InternalOntologicalParser.g:878:4: rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsReadOnly"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsIsParam"
    // InternalOntologicalParser.g:887:1: entryRuleOntologicalRootClassesItemsAttributesItemsIsParam : ruleOntologicalRootClassesItemsAttributesItemsIsParam EOF ;
    public final void entryRuleOntologicalRootClassesItemsAttributesItemsIsParam() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:888:1: ( ruleOntologicalRootClassesItemsAttributesItemsIsParam EOF )
            // InternalOntologicalParser.g:889:1: ruleOntologicalRootClassesItemsAttributesItemsIsParam EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAttributesItemsIsParam();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsIsParam"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsIsParam"
    // InternalOntologicalParser.g:896:1: ruleOntologicalRootClassesItemsAttributesItemsIsParam : ( ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsAttributesItemsIsParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:900:2: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0 ) ) )
            // InternalOntologicalParser.g:901:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0 ) )
            {
            // InternalOntologicalParser.g:901:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0 ) )
            // InternalOntologicalParser.g:902:3: ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getGroup()); 
            // InternalOntologicalParser.g:903:3: ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0 )
            // InternalOntologicalParser.g:903:4: rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsIsParam"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsAttributesItemsIsKey"
    // InternalOntologicalParser.g:912:1: entryRuleOntologicalRootClassesItemsAttributesItemsIsKey : ruleOntologicalRootClassesItemsAttributesItemsIsKey EOF ;
    public final void entryRuleOntologicalRootClassesItemsAttributesItemsIsKey() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:913:1: ( ruleOntologicalRootClassesItemsAttributesItemsIsKey EOF )
            // InternalOntologicalParser.g:914:1: ruleOntologicalRootClassesItemsAttributesItemsIsKey EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsAttributesItemsIsKey();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsAttributesItemsIsKey"


    // $ANTLR start "ruleOntologicalRootClassesItemsAttributesItemsIsKey"
    // InternalOntologicalParser.g:921:1: ruleOntologicalRootClassesItemsAttributesItemsIsKey : ( ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsAttributesItemsIsKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:925:2: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0 ) ) )
            // InternalOntologicalParser.g:926:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0 ) )
            {
            // InternalOntologicalParser.g:926:2: ( ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0 ) )
            // InternalOntologicalParser.g:927:3: ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getGroup()); 
            // InternalOntologicalParser.g:928:3: ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0 )
            // InternalOntologicalParser.g:928:4: rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsAttributesItemsIsKey"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItems"
    // InternalOntologicalParser.g:937:1: entryRuleOntologicalRootClassesItemsReferencesItems : ruleOntologicalRootClassesItemsReferencesItems EOF ;
    public final void entryRuleOntologicalRootClassesItemsReferencesItems() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:938:1: ( ruleOntologicalRootClassesItemsReferencesItems EOF )
            // InternalOntologicalParser.g:939:1: ruleOntologicalRootClassesItemsReferencesItems EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsReferencesItems();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItems"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItems"
    // InternalOntologicalParser.g:946:1: ruleOntologicalRootClassesItemsReferencesItems : ( ( rule__OntologicalRootClassesItemsReferencesItems__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsReferencesItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:950:2: ( ( ( rule__OntologicalRootClassesItemsReferencesItems__Group__0 ) ) )
            // InternalOntologicalParser.g:951:2: ( ( rule__OntologicalRootClassesItemsReferencesItems__Group__0 ) )
            {
            // InternalOntologicalParser.g:951:2: ( ( rule__OntologicalRootClassesItemsReferencesItems__Group__0 ) )
            // InternalOntologicalParser.g:952:3: ( rule__OntologicalRootClassesItemsReferencesItems__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getGroup()); 
            // InternalOntologicalParser.g:953:3: ( rule__OntologicalRootClassesItemsReferencesItems__Group__0 )
            // InternalOntologicalParser.g:953:4: rule__OntologicalRootClassesItemsReferencesItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItems"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsName"
    // InternalOntologicalParser.g:962:1: entryRuleOntologicalRootClassesItemsReferencesItemsName : ruleOntologicalRootClassesItemsReferencesItemsName EOF ;
    public final void entryRuleOntologicalRootClassesItemsReferencesItemsName() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:963:1: ( ruleOntologicalRootClassesItemsReferencesItemsName EOF )
            // InternalOntologicalParser.g:964:1: ruleOntologicalRootClassesItemsReferencesItemsName EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsReferencesItemsName();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsName"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsName"
    // InternalOntologicalParser.g:971:1: ruleOntologicalRootClassesItemsReferencesItemsName : ( ( rule__OntologicalRootClassesItemsReferencesItemsName__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsReferencesItemsName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:975:2: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsName__Group__0 ) ) )
            // InternalOntologicalParser.g:976:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsName__Group__0 ) )
            {
            // InternalOntologicalParser.g:976:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsName__Group__0 ) )
            // InternalOntologicalParser.g:977:3: ( rule__OntologicalRootClassesItemsReferencesItemsName__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getGroup()); 
            // InternalOntologicalParser.g:978:3: ( rule__OntologicalRootClassesItemsReferencesItemsName__Group__0 )
            // InternalOntologicalParser.g:978:4: rule__OntologicalRootClassesItemsReferencesItemsName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsName"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsContaintment"
    // InternalOntologicalParser.g:987:1: entryRuleOntologicalRootClassesItemsReferencesItemsContaintment : ruleOntologicalRootClassesItemsReferencesItemsContaintment EOF ;
    public final void entryRuleOntologicalRootClassesItemsReferencesItemsContaintment() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:988:1: ( ruleOntologicalRootClassesItemsReferencesItemsContaintment EOF )
            // InternalOntologicalParser.g:989:1: ruleOntologicalRootClassesItemsReferencesItemsContaintment EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsReferencesItemsContaintment();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsContaintment"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsContaintment"
    // InternalOntologicalParser.g:996:1: ruleOntologicalRootClassesItemsReferencesItemsContaintment : ( ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsReferencesItemsContaintment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1000:2: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0 ) ) )
            // InternalOntologicalParser.g:1001:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0 ) )
            {
            // InternalOntologicalParser.g:1001:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0 ) )
            // InternalOntologicalParser.g:1002:3: ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getGroup()); 
            // InternalOntologicalParser.g:1003:3: ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0 )
            // InternalOntologicalParser.g:1003:4: rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsContaintment"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsMin"
    // InternalOntologicalParser.g:1012:1: entryRuleOntologicalRootClassesItemsReferencesItemsMin : ruleOntologicalRootClassesItemsReferencesItemsMin EOF ;
    public final void entryRuleOntologicalRootClassesItemsReferencesItemsMin() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:1013:1: ( ruleOntologicalRootClassesItemsReferencesItemsMin EOF )
            // InternalOntologicalParser.g:1014:1: ruleOntologicalRootClassesItemsReferencesItemsMin EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsReferencesItemsMin();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsMin"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsMin"
    // InternalOntologicalParser.g:1021:1: ruleOntologicalRootClassesItemsReferencesItemsMin : ( ( rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsReferencesItemsMin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1025:2: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0 ) ) )
            // InternalOntologicalParser.g:1026:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0 ) )
            {
            // InternalOntologicalParser.g:1026:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0 ) )
            // InternalOntologicalParser.g:1027:3: ( rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getGroup()); 
            // InternalOntologicalParser.g:1028:3: ( rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0 )
            // InternalOntologicalParser.g:1028:4: rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsMin"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsMax"
    // InternalOntologicalParser.g:1037:1: entryRuleOntologicalRootClassesItemsReferencesItemsMax : ruleOntologicalRootClassesItemsReferencesItemsMax EOF ;
    public final void entryRuleOntologicalRootClassesItemsReferencesItemsMax() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:1038:1: ( ruleOntologicalRootClassesItemsReferencesItemsMax EOF )
            // InternalOntologicalParser.g:1039:1: ruleOntologicalRootClassesItemsReferencesItemsMax EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsReferencesItemsMax();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsMax"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsMax"
    // InternalOntologicalParser.g:1046:1: ruleOntologicalRootClassesItemsReferencesItemsMax : ( ( rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsReferencesItemsMax() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1050:2: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0 ) ) )
            // InternalOntologicalParser.g:1051:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0 ) )
            {
            // InternalOntologicalParser.g:1051:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0 ) )
            // InternalOntologicalParser.g:1052:3: ( rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getGroup()); 
            // InternalOntologicalParser.g:1053:3: ( rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0 )
            // InternalOntologicalParser.g:1053:4: rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsMax"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsTarget"
    // InternalOntologicalParser.g:1062:1: entryRuleOntologicalRootClassesItemsReferencesItemsTarget : ruleOntologicalRootClassesItemsReferencesItemsTarget EOF ;
    public final void entryRuleOntologicalRootClassesItemsReferencesItemsTarget() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:1063:1: ( ruleOntologicalRootClassesItemsReferencesItemsTarget EOF )
            // InternalOntologicalParser.g:1064:1: ruleOntologicalRootClassesItemsReferencesItemsTarget EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsReferencesItemsTarget();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsTarget"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsTarget"
    // InternalOntologicalParser.g:1071:1: ruleOntologicalRootClassesItemsReferencesItemsTarget : ( ( rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsReferencesItemsTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1075:2: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0 ) ) )
            // InternalOntologicalParser.g:1076:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0 ) )
            {
            // InternalOntologicalParser.g:1076:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0 ) )
            // InternalOntologicalParser.g:1077:3: ( rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getGroup()); 
            // InternalOntologicalParser.g:1078:3: ( rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0 )
            // InternalOntologicalParser.g:1078:4: rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsTarget"


    // $ANTLR start "entryRuleOntologicalRootClassesItemsReferencesItemsOpposite"
    // InternalOntologicalParser.g:1087:1: entryRuleOntologicalRootClassesItemsReferencesItemsOpposite : ruleOntologicalRootClassesItemsReferencesItemsOpposite EOF ;
    public final void entryRuleOntologicalRootClassesItemsReferencesItemsOpposite() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:1088:1: ( ruleOntologicalRootClassesItemsReferencesItemsOpposite EOF )
            // InternalOntologicalParser.g:1089:1: ruleOntologicalRootClassesItemsReferencesItemsOpposite EOF
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeRule()); 
            pushFollow(FOLLOW_1);
            ruleOntologicalRootClassesItemsReferencesItemsOpposite();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeRule()); 
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
    // $ANTLR end "entryRuleOntologicalRootClassesItemsReferencesItemsOpposite"


    // $ANTLR start "ruleOntologicalRootClassesItemsReferencesItemsOpposite"
    // InternalOntologicalParser.g:1096:1: ruleOntologicalRootClassesItemsReferencesItemsOpposite : ( ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0 ) ) ;
    public final void ruleOntologicalRootClassesItemsReferencesItemsOpposite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1100:2: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0 ) ) )
            // InternalOntologicalParser.g:1101:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0 ) )
            {
            // InternalOntologicalParser.g:1101:2: ( ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0 ) )
            // InternalOntologicalParser.g:1102:3: ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getGroup()); 
            // InternalOntologicalParser.g:1103:3: ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0 )
            // InternalOntologicalParser.g:1103:4: rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntologicalRootClassesItemsReferencesItemsOpposite"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalOntologicalParser.g:1112:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:1113:1: ( ruleVALID_STRING EOF )
            // InternalOntologicalParser.g:1114:1: ruleVALID_STRING EOF
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
    // InternalOntologicalParser.g:1121:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1125:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalOntologicalParser.g:1126:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalOntologicalParser.g:1126:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalOntologicalParser.g:1127:3: ( rule__VALID_STRING__Alternatives )
            {
             before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            // InternalOntologicalParser.g:1128:3: ( rule__VALID_STRING__Alternatives )
            // InternalOntologicalParser.g:1128:4: rule__VALID_STRING__Alternatives
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
    // InternalOntologicalParser.g:1137:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalOntologicalParser.g:1138:1: ( ruleKEYWORD EOF )
            // InternalOntologicalParser.g:1139:1: ruleKEYWORD EOF
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
    // InternalOntologicalParser.g:1146:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1150:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalOntologicalParser.g:1151:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalOntologicalParser.g:1151:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalOntologicalParser.g:1152:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalOntologicalParser.g:1153:3: ( rule__KEYWORD__Alternatives )
            // InternalOntologicalParser.g:1153:4: rule__KEYWORD__Alternatives
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


    // $ANTLR start "rule__OntologicalRootPropertiesAbstract__Alternatives"
    // InternalOntologicalParser.g:1161:1: rule__OntologicalRootPropertiesAbstract__Alternatives : ( ( ruleOntologicalRootName ) | ( ruleOntologicalRootURI ) | ( ruleOntologicalRootOnlyCodes ) | ( ruleOntologicalRootBluetooth ) | ( ruleOntologicalRootExternal ) | ( ruleOntologicalRootFirebase ) | ( ruleOntologicalRootPhysics ) | ( ruleOntologicalRootGameloop ) | ( ruleOntologicalRootClasses ) );
    public final void rule__OntologicalRootPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1165:1: ( ( ruleOntologicalRootName ) | ( ruleOntologicalRootURI ) | ( ruleOntologicalRootOnlyCodes ) | ( ruleOntologicalRootBluetooth ) | ( ruleOntologicalRootExternal ) | ( ruleOntologicalRootFirebase ) | ( ruleOntologicalRootPhysics ) | ( ruleOntologicalRootGameloop ) | ( ruleOntologicalRootClasses ) )
            int alt1=9;
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
            case OnlyCodes:
                {
                alt1=3;
                }
                break;
            case Bluetooth:
                {
                alt1=4;
                }
                break;
            case External:
                {
                alt1=5;
                }
                break;
            case Firebase:
                {
                alt1=6;
                }
                break;
            case Physics:
                {
                alt1=7;
                }
                break;
            case Gameloop:
                {
                alt1=8;
                }
                break;
            case Classes:
                {
                alt1=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalOntologicalParser.g:1166:2: ( ruleOntologicalRootName )
                    {
                    // InternalOntologicalParser.g:1166:2: ( ruleOntologicalRootName )
                    // InternalOntologicalParser.g:1167:3: ruleOntologicalRootName
                    {
                     before(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootName();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:1172:2: ( ruleOntologicalRootURI )
                    {
                    // InternalOntologicalParser.g:1172:2: ( ruleOntologicalRootURI )
                    // InternalOntologicalParser.g:1173:3: ruleOntologicalRootURI
                    {
                     before(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootURIParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootURI();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootURIParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntologicalParser.g:1178:2: ( ruleOntologicalRootOnlyCodes )
                    {
                    // InternalOntologicalParser.g:1178:2: ( ruleOntologicalRootOnlyCodes )
                    // InternalOntologicalParser.g:1179:3: ruleOntologicalRootOnlyCodes
                    {
                     before(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootOnlyCodesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootOnlyCodes();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootOnlyCodesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntologicalParser.g:1184:2: ( ruleOntologicalRootBluetooth )
                    {
                    // InternalOntologicalParser.g:1184:2: ( ruleOntologicalRootBluetooth )
                    // InternalOntologicalParser.g:1185:3: ruleOntologicalRootBluetooth
                    {
                     before(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootBluetoothParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootBluetooth();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootBluetoothParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntologicalParser.g:1190:2: ( ruleOntologicalRootExternal )
                    {
                    // InternalOntologicalParser.g:1190:2: ( ruleOntologicalRootExternal )
                    // InternalOntologicalParser.g:1191:3: ruleOntologicalRootExternal
                    {
                     before(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootExternalParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootExternal();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootExternalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntologicalParser.g:1196:2: ( ruleOntologicalRootFirebase )
                    {
                    // InternalOntologicalParser.g:1196:2: ( ruleOntologicalRootFirebase )
                    // InternalOntologicalParser.g:1197:3: ruleOntologicalRootFirebase
                    {
                     before(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootFirebaseParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootFirebase();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootFirebaseParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOntologicalParser.g:1202:2: ( ruleOntologicalRootPhysics )
                    {
                    // InternalOntologicalParser.g:1202:2: ( ruleOntologicalRootPhysics )
                    // InternalOntologicalParser.g:1203:3: ruleOntologicalRootPhysics
                    {
                     before(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootPhysicsParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootPhysics();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootPhysicsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOntologicalParser.g:1208:2: ( ruleOntologicalRootGameloop )
                    {
                    // InternalOntologicalParser.g:1208:2: ( ruleOntologicalRootGameloop )
                    // InternalOntologicalParser.g:1209:3: ruleOntologicalRootGameloop
                    {
                     before(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootGameloopParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootGameloop();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootGameloopParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalOntologicalParser.g:1214:2: ( ruleOntologicalRootClasses )
                    {
                    // InternalOntologicalParser.g:1214:2: ( ruleOntologicalRootClasses )
                    // InternalOntologicalParser.g:1215:3: ruleOntologicalRootClasses
                    {
                     before(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootClassesParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClasses();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getOntologicalRootClassesParserRuleCall_8()); 

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
    // $ANTLR end "rule__OntologicalRootPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives"
    // InternalOntologicalParser.g:1224:1: rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives : ( ( ruleOntologicalRootClassesItemsName ) | ( ruleOntologicalRootClassesItemsAbstract ) | ( ruleOntologicalRootClassesItemsAttributes ) | ( ruleOntologicalRootClassesItemsReferences ) | ( ruleOntologicalRootClassesItemsAutoID ) | ( ruleOntologicalRootClassesItemsOnlyCodes ) | ( ruleOntologicalRootClassesItemsBluetooth ) | ( ruleOntologicalRootClassesItemsNoSCN ) );
    public final void rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1228:1: ( ( ruleOntologicalRootClassesItemsName ) | ( ruleOntologicalRootClassesItemsAbstract ) | ( ruleOntologicalRootClassesItemsAttributes ) | ( ruleOntologicalRootClassesItemsReferences ) | ( ruleOntologicalRootClassesItemsAutoID ) | ( ruleOntologicalRootClassesItemsOnlyCodes ) | ( ruleOntologicalRootClassesItemsBluetooth ) | ( ruleOntologicalRootClassesItemsNoSCN ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt2=1;
                }
                break;
            case Abstract:
                {
                alt2=2;
                }
                break;
            case Attributes:
                {
                alt2=3;
                }
                break;
            case References:
                {
                alt2=4;
                }
                break;
            case AutoID:
                {
                alt2=5;
                }
                break;
            case OnlyCodes:
                {
                alt2=6;
                }
                break;
            case Bluetooth:
                {
                alt2=7;
                }
                break;
            case NoSCN:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOntologicalParser.g:1229:2: ( ruleOntologicalRootClassesItemsName )
                    {
                    // InternalOntologicalParser.g:1229:2: ( ruleOntologicalRootClassesItemsName )
                    // InternalOntologicalParser.g:1230:3: ruleOntologicalRootClassesItemsName
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsName();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:1235:2: ( ruleOntologicalRootClassesItemsAbstract )
                    {
                    // InternalOntologicalParser.g:1235:2: ( ruleOntologicalRootClassesItemsAbstract )
                    // InternalOntologicalParser.g:1236:3: ruleOntologicalRootClassesItemsAbstract
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAbstractParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsAbstract();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAbstractParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntologicalParser.g:1241:2: ( ruleOntologicalRootClassesItemsAttributes )
                    {
                    // InternalOntologicalParser.g:1241:2: ( ruleOntologicalRootClassesItemsAttributes )
                    // InternalOntologicalParser.g:1242:3: ruleOntologicalRootClassesItemsAttributes
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsAttributes();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntologicalParser.g:1247:2: ( ruleOntologicalRootClassesItemsReferences )
                    {
                    // InternalOntologicalParser.g:1247:2: ( ruleOntologicalRootClassesItemsReferences )
                    // InternalOntologicalParser.g:1248:3: ruleOntologicalRootClassesItemsReferences
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsReferences();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntologicalParser.g:1253:2: ( ruleOntologicalRootClassesItemsAutoID )
                    {
                    // InternalOntologicalParser.g:1253:2: ( ruleOntologicalRootClassesItemsAutoID )
                    // InternalOntologicalParser.g:1254:3: ruleOntologicalRootClassesItemsAutoID
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAutoIDParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsAutoID();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAutoIDParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntologicalParser.g:1259:2: ( ruleOntologicalRootClassesItemsOnlyCodes )
                    {
                    // InternalOntologicalParser.g:1259:2: ( ruleOntologicalRootClassesItemsOnlyCodes )
                    // InternalOntologicalParser.g:1260:3: ruleOntologicalRootClassesItemsOnlyCodes
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsOnlyCodesParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsOnlyCodes();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsOnlyCodesParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOntologicalParser.g:1265:2: ( ruleOntologicalRootClassesItemsBluetooth )
                    {
                    // InternalOntologicalParser.g:1265:2: ( ruleOntologicalRootClassesItemsBluetooth )
                    // InternalOntologicalParser.g:1266:3: ruleOntologicalRootClassesItemsBluetooth
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsBluetoothParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsBluetooth();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsBluetoothParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOntologicalParser.g:1271:2: ( ruleOntologicalRootClassesItemsNoSCN )
                    {
                    // InternalOntologicalParser.g:1271:2: ( ruleOntologicalRootClassesItemsNoSCN )
                    // InternalOntologicalParser.g:1272:3: ruleOntologicalRootClassesItemsNoSCN
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsNoSCNParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsNoSCN();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsNoSCNParserRuleCall_7()); 

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
    // $ANTLR end "rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives"
    // InternalOntologicalParser.g:1281:1: rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives : ( ( ruleOntologicalRootClassesItemsAttributesItemsName ) | ( ruleOntologicalRootClassesItemsAttributesItemsType ) | ( ruleOntologicalRootClassesItemsAttributesItemsMin ) | ( ruleOntologicalRootClassesItemsAttributesItemsMax ) | ( ruleOntologicalRootClassesItemsAttributesItemsDefault ) | ( ruleOntologicalRootClassesItemsAttributesItemsReadOnly ) | ( ruleOntologicalRootClassesItemsAttributesItemsIsParam ) | ( ruleOntologicalRootClassesItemsAttributesItemsIsKey ) );
    public final void rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1285:1: ( ( ruleOntologicalRootClassesItemsAttributesItemsName ) | ( ruleOntologicalRootClassesItemsAttributesItemsType ) | ( ruleOntologicalRootClassesItemsAttributesItemsMin ) | ( ruleOntologicalRootClassesItemsAttributesItemsMax ) | ( ruleOntologicalRootClassesItemsAttributesItemsDefault ) | ( ruleOntologicalRootClassesItemsAttributesItemsReadOnly ) | ( ruleOntologicalRootClassesItemsAttributesItemsIsParam ) | ( ruleOntologicalRootClassesItemsAttributesItemsIsKey ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt3=1;
                }
                break;
            case Type:
                {
                alt3=2;
                }
                break;
            case Min:
                {
                alt3=3;
                }
                break;
            case Max:
                {
                alt3=4;
                }
                break;
            case Default:
                {
                alt3=5;
                }
                break;
            case ReadOnly:
                {
                alt3=6;
                }
                break;
            case IsParam:
                {
                alt3=7;
                }
                break;
            case IsKey:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOntologicalParser.g:1286:2: ( ruleOntologicalRootClassesItemsAttributesItemsName )
                    {
                    // InternalOntologicalParser.g:1286:2: ( ruleOntologicalRootClassesItemsAttributesItemsName )
                    // InternalOntologicalParser.g:1287:3: ruleOntologicalRootClassesItemsAttributesItemsName
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsAttributesItemsName();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:1292:2: ( ruleOntologicalRootClassesItemsAttributesItemsType )
                    {
                    // InternalOntologicalParser.g:1292:2: ( ruleOntologicalRootClassesItemsAttributesItemsType )
                    // InternalOntologicalParser.g:1293:3: ruleOntologicalRootClassesItemsAttributesItemsType
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsAttributesItemsType();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntologicalParser.g:1298:2: ( ruleOntologicalRootClassesItemsAttributesItemsMin )
                    {
                    // InternalOntologicalParser.g:1298:2: ( ruleOntologicalRootClassesItemsAttributesItemsMin )
                    // InternalOntologicalParser.g:1299:3: ruleOntologicalRootClassesItemsAttributesItemsMin
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsMinParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsAttributesItemsMin();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsMinParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntologicalParser.g:1304:2: ( ruleOntologicalRootClassesItemsAttributesItemsMax )
                    {
                    // InternalOntologicalParser.g:1304:2: ( ruleOntologicalRootClassesItemsAttributesItemsMax )
                    // InternalOntologicalParser.g:1305:3: ruleOntologicalRootClassesItemsAttributesItemsMax
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsMaxParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsAttributesItemsMax();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsMaxParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntologicalParser.g:1310:2: ( ruleOntologicalRootClassesItemsAttributesItemsDefault )
                    {
                    // InternalOntologicalParser.g:1310:2: ( ruleOntologicalRootClassesItemsAttributesItemsDefault )
                    // InternalOntologicalParser.g:1311:3: ruleOntologicalRootClassesItemsAttributesItemsDefault
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsDefaultParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsAttributesItemsDefault();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsDefaultParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntologicalParser.g:1316:2: ( ruleOntologicalRootClassesItemsAttributesItemsReadOnly )
                    {
                    // InternalOntologicalParser.g:1316:2: ( ruleOntologicalRootClassesItemsAttributesItemsReadOnly )
                    // InternalOntologicalParser.g:1317:3: ruleOntologicalRootClassesItemsAttributesItemsReadOnly
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsReadOnlyParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsAttributesItemsReadOnly();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsReadOnlyParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOntologicalParser.g:1322:2: ( ruleOntologicalRootClassesItemsAttributesItemsIsParam )
                    {
                    // InternalOntologicalParser.g:1322:2: ( ruleOntologicalRootClassesItemsAttributesItemsIsParam )
                    // InternalOntologicalParser.g:1323:3: ruleOntologicalRootClassesItemsAttributesItemsIsParam
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsIsParamParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsAttributesItemsIsParam();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsIsParamParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOntologicalParser.g:1328:2: ( ruleOntologicalRootClassesItemsAttributesItemsIsKey )
                    {
                    // InternalOntologicalParser.g:1328:2: ( ruleOntologicalRootClassesItemsAttributesItemsIsKey )
                    // InternalOntologicalParser.g:1329:3: ruleOntologicalRootClassesItemsAttributesItemsIsKey
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsIsKeyParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsAttributesItemsIsKey();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsAttributesItemsIsKeyParserRuleCall_7()); 

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives"
    // InternalOntologicalParser.g:1338:1: rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives : ( ( ruleOntologicalRootClassesItemsReferencesItemsName ) | ( ruleOntologicalRootClassesItemsReferencesItemsContaintment ) | ( ruleOntologicalRootClassesItemsReferencesItemsMin ) | ( ruleOntologicalRootClassesItemsReferencesItemsMax ) | ( ruleOntologicalRootClassesItemsReferencesItemsTarget ) | ( ruleOntologicalRootClassesItemsReferencesItemsOpposite ) );
    public final void rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1342:1: ( ( ruleOntologicalRootClassesItemsReferencesItemsName ) | ( ruleOntologicalRootClassesItemsReferencesItemsContaintment ) | ( ruleOntologicalRootClassesItemsReferencesItemsMin ) | ( ruleOntologicalRootClassesItemsReferencesItemsMax ) | ( ruleOntologicalRootClassesItemsReferencesItemsTarget ) | ( ruleOntologicalRootClassesItemsReferencesItemsOpposite ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt4=1;
                }
                break;
            case Containtment:
                {
                alt4=2;
                }
                break;
            case Min:
                {
                alt4=3;
                }
                break;
            case Max:
                {
                alt4=4;
                }
                break;
            case Target:
                {
                alt4=5;
                }
                break;
            case Opposite:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalOntologicalParser.g:1343:2: ( ruleOntologicalRootClassesItemsReferencesItemsName )
                    {
                    // InternalOntologicalParser.g:1343:2: ( ruleOntologicalRootClassesItemsReferencesItemsName )
                    // InternalOntologicalParser.g:1344:3: ruleOntologicalRootClassesItemsReferencesItemsName
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsReferencesItemsName();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:1349:2: ( ruleOntologicalRootClassesItemsReferencesItemsContaintment )
                    {
                    // InternalOntologicalParser.g:1349:2: ( ruleOntologicalRootClassesItemsReferencesItemsContaintment )
                    // InternalOntologicalParser.g:1350:3: ruleOntologicalRootClassesItemsReferencesItemsContaintment
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsContaintmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsReferencesItemsContaintment();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsContaintmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntologicalParser.g:1355:2: ( ruleOntologicalRootClassesItemsReferencesItemsMin )
                    {
                    // InternalOntologicalParser.g:1355:2: ( ruleOntologicalRootClassesItemsReferencesItemsMin )
                    // InternalOntologicalParser.g:1356:3: ruleOntologicalRootClassesItemsReferencesItemsMin
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsMinParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsReferencesItemsMin();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsMinParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntologicalParser.g:1361:2: ( ruleOntologicalRootClassesItemsReferencesItemsMax )
                    {
                    // InternalOntologicalParser.g:1361:2: ( ruleOntologicalRootClassesItemsReferencesItemsMax )
                    // InternalOntologicalParser.g:1362:3: ruleOntologicalRootClassesItemsReferencesItemsMax
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsMaxParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsReferencesItemsMax();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsMaxParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntologicalParser.g:1367:2: ( ruleOntologicalRootClassesItemsReferencesItemsTarget )
                    {
                    // InternalOntologicalParser.g:1367:2: ( ruleOntologicalRootClassesItemsReferencesItemsTarget )
                    // InternalOntologicalParser.g:1368:3: ruleOntologicalRootClassesItemsReferencesItemsTarget
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsTargetParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsReferencesItemsTarget();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsTargetParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntologicalParser.g:1373:2: ( ruleOntologicalRootClassesItemsReferencesItemsOpposite )
                    {
                    // InternalOntologicalParser.g:1373:2: ( ruleOntologicalRootClassesItemsReferencesItemsOpposite )
                    // InternalOntologicalParser.g:1374:3: ruleOntologicalRootClassesItemsReferencesItemsOpposite
                    {
                     before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsOppositeParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleOntologicalRootClassesItemsReferencesItemsOpposite();

                    state._fsp--;

                     after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getOntologicalRootClassesItemsReferencesItemsOppositeParserRuleCall_5()); 

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__EBooleanObject__Alternatives"
    // InternalOntologicalParser.g:1383:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1387:1: ( ( True ) | ( False ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==True) ) {
                alt5=1;
            }
            else if ( (LA5_0==False) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntologicalParser.g:1388:2: ( True )
                    {
                    // InternalOntologicalParser.g:1388:2: ( True )
                    // InternalOntologicalParser.g:1389:3: True
                    {
                     before(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:1394:2: ( False )
                    {
                    // InternalOntologicalParser.g:1394:2: ( False )
                    // InternalOntologicalParser.g:1395:3: False
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


    // $ANTLR start "rule__VALID_STRING__Alternatives"
    // InternalOntologicalParser.g:1404:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1408:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=Containtment && LA6_0<=Min)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntologicalParser.g:1409:2: ( RULE_STRING )
                    {
                    // InternalOntologicalParser.g:1409:2: ( RULE_STRING )
                    // InternalOntologicalParser.g:1410:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:1415:2: ( ruleKEYWORD )
                    {
                    // InternalOntologicalParser.g:1415:2: ( ruleKEYWORD )
                    // InternalOntologicalParser.g:1416:3: ruleKEYWORD
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
    // InternalOntologicalParser.g:1425:1: rule__KEYWORD__Alternatives : ( ( Gameloop ) | ( IsParam ) | ( References ) | ( Max ) | ( Containtment ) | ( Classes ) | ( AutoID ) | ( IsKey ) | ( ReadOnly ) | ( Opposite ) | ( Abstract ) | ( Firebase ) | ( Type ) | ( URI ) | ( Target ) | ( External ) | ( Default ) | ( Min ) | ( Bluetooth ) | ( OnlyCodes ) | ( Physics ) | ( Name ) | ( Attributes ) | ( NoSCN ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1429:1: ( ( Gameloop ) | ( IsParam ) | ( References ) | ( Max ) | ( Containtment ) | ( Classes ) | ( AutoID ) | ( IsKey ) | ( ReadOnly ) | ( Opposite ) | ( Abstract ) | ( Firebase ) | ( Type ) | ( URI ) | ( Target ) | ( External ) | ( Default ) | ( Min ) | ( Bluetooth ) | ( OnlyCodes ) | ( Physics ) | ( Name ) | ( Attributes ) | ( NoSCN ) )
            int alt7=24;
            switch ( input.LA(1) ) {
            case Gameloop:
                {
                alt7=1;
                }
                break;
            case IsParam:
                {
                alt7=2;
                }
                break;
            case References:
                {
                alt7=3;
                }
                break;
            case Max:
                {
                alt7=4;
                }
                break;
            case Containtment:
                {
                alt7=5;
                }
                break;
            case Classes:
                {
                alt7=6;
                }
                break;
            case AutoID:
                {
                alt7=7;
                }
                break;
            case IsKey:
                {
                alt7=8;
                }
                break;
            case ReadOnly:
                {
                alt7=9;
                }
                break;
            case Opposite:
                {
                alt7=10;
                }
                break;
            case Abstract:
                {
                alt7=11;
                }
                break;
            case Firebase:
                {
                alt7=12;
                }
                break;
            case Type:
                {
                alt7=13;
                }
                break;
            case URI:
                {
                alt7=14;
                }
                break;
            case Target:
                {
                alt7=15;
                }
                break;
            case External:
                {
                alt7=16;
                }
                break;
            case Default:
                {
                alt7=17;
                }
                break;
            case Min:
                {
                alt7=18;
                }
                break;
            case Bluetooth:
                {
                alt7=19;
                }
                break;
            case OnlyCodes:
                {
                alt7=20;
                }
                break;
            case Physics:
                {
                alt7=21;
                }
                break;
            case Name:
                {
                alt7=22;
                }
                break;
            case Attributes:
                {
                alt7=23;
                }
                break;
            case NoSCN:
                {
                alt7=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalOntologicalParser.g:1430:2: ( Gameloop )
                    {
                    // InternalOntologicalParser.g:1430:2: ( Gameloop )
                    // InternalOntologicalParser.g:1431:3: Gameloop
                    {
                     before(grammarAccess.getKEYWORDAccess().getGameloopKeyword_0()); 
                    match(input,Gameloop,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getGameloopKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntologicalParser.g:1436:2: ( IsParam )
                    {
                    // InternalOntologicalParser.g:1436:2: ( IsParam )
                    // InternalOntologicalParser.g:1437:3: IsParam
                    {
                     before(grammarAccess.getKEYWORDAccess().getIsParamKeyword_1()); 
                    match(input,IsParam,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getIsParamKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntologicalParser.g:1442:2: ( References )
                    {
                    // InternalOntologicalParser.g:1442:2: ( References )
                    // InternalOntologicalParser.g:1443:3: References
                    {
                     before(grammarAccess.getKEYWORDAccess().getReferencesKeyword_2()); 
                    match(input,References,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getReferencesKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntologicalParser.g:1448:2: ( Max )
                    {
                    // InternalOntologicalParser.g:1448:2: ( Max )
                    // InternalOntologicalParser.g:1449:3: Max
                    {
                     before(grammarAccess.getKEYWORDAccess().getMaxKeyword_3()); 
                    match(input,Max,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMaxKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntologicalParser.g:1454:2: ( Containtment )
                    {
                    // InternalOntologicalParser.g:1454:2: ( Containtment )
                    // InternalOntologicalParser.g:1455:3: Containtment
                    {
                     before(grammarAccess.getKEYWORDAccess().getContaintmentKeyword_4()); 
                    match(input,Containtment,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getContaintmentKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntologicalParser.g:1460:2: ( Classes )
                    {
                    // InternalOntologicalParser.g:1460:2: ( Classes )
                    // InternalOntologicalParser.g:1461:3: Classes
                    {
                     before(grammarAccess.getKEYWORDAccess().getClassesKeyword_5()); 
                    match(input,Classes,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getClassesKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOntologicalParser.g:1466:2: ( AutoID )
                    {
                    // InternalOntologicalParser.g:1466:2: ( AutoID )
                    // InternalOntologicalParser.g:1467:3: AutoID
                    {
                     before(grammarAccess.getKEYWORDAccess().getAutoIDKeyword_6()); 
                    match(input,AutoID,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAutoIDKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOntologicalParser.g:1472:2: ( IsKey )
                    {
                    // InternalOntologicalParser.g:1472:2: ( IsKey )
                    // InternalOntologicalParser.g:1473:3: IsKey
                    {
                     before(grammarAccess.getKEYWORDAccess().getIsKeyKeyword_7()); 
                    match(input,IsKey,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getIsKeyKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalOntologicalParser.g:1478:2: ( ReadOnly )
                    {
                    // InternalOntologicalParser.g:1478:2: ( ReadOnly )
                    // InternalOntologicalParser.g:1479:3: ReadOnly
                    {
                     before(grammarAccess.getKEYWORDAccess().getReadOnlyKeyword_8()); 
                    match(input,ReadOnly,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getReadOnlyKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalOntologicalParser.g:1484:2: ( Opposite )
                    {
                    // InternalOntologicalParser.g:1484:2: ( Opposite )
                    // InternalOntologicalParser.g:1485:3: Opposite
                    {
                     before(grammarAccess.getKEYWORDAccess().getOppositeKeyword_9()); 
                    match(input,Opposite,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOppositeKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalOntologicalParser.g:1490:2: ( Abstract )
                    {
                    // InternalOntologicalParser.g:1490:2: ( Abstract )
                    // InternalOntologicalParser.g:1491:3: Abstract
                    {
                     before(grammarAccess.getKEYWORDAccess().getAbstractKeyword_10()); 
                    match(input,Abstract,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAbstractKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalOntologicalParser.g:1496:2: ( Firebase )
                    {
                    // InternalOntologicalParser.g:1496:2: ( Firebase )
                    // InternalOntologicalParser.g:1497:3: Firebase
                    {
                     before(grammarAccess.getKEYWORDAccess().getFirebaseKeyword_11()); 
                    match(input,Firebase,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getFirebaseKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalOntologicalParser.g:1502:2: ( Type )
                    {
                    // InternalOntologicalParser.g:1502:2: ( Type )
                    // InternalOntologicalParser.g:1503:3: Type
                    {
                     before(grammarAccess.getKEYWORDAccess().getTypeKeyword_12()); 
                    match(input,Type,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTypeKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalOntologicalParser.g:1508:2: ( URI )
                    {
                    // InternalOntologicalParser.g:1508:2: ( URI )
                    // InternalOntologicalParser.g:1509:3: URI
                    {
                     before(grammarAccess.getKEYWORDAccess().getURIKeyword_13()); 
                    match(input,URI,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getURIKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalOntologicalParser.g:1514:2: ( Target )
                    {
                    // InternalOntologicalParser.g:1514:2: ( Target )
                    // InternalOntologicalParser.g:1515:3: Target
                    {
                     before(grammarAccess.getKEYWORDAccess().getTargetKeyword_14()); 
                    match(input,Target,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTargetKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalOntologicalParser.g:1520:2: ( External )
                    {
                    // InternalOntologicalParser.g:1520:2: ( External )
                    // InternalOntologicalParser.g:1521:3: External
                    {
                     before(grammarAccess.getKEYWORDAccess().getExternalKeyword_15()); 
                    match(input,External,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getExternalKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalOntologicalParser.g:1526:2: ( Default )
                    {
                    // InternalOntologicalParser.g:1526:2: ( Default )
                    // InternalOntologicalParser.g:1527:3: Default
                    {
                     before(grammarAccess.getKEYWORDAccess().getDefaultKeyword_16()); 
                    match(input,Default,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDefaultKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalOntologicalParser.g:1532:2: ( Min )
                    {
                    // InternalOntologicalParser.g:1532:2: ( Min )
                    // InternalOntologicalParser.g:1533:3: Min
                    {
                     before(grammarAccess.getKEYWORDAccess().getMinKeyword_17()); 
                    match(input,Min,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMinKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalOntologicalParser.g:1538:2: ( Bluetooth )
                    {
                    // InternalOntologicalParser.g:1538:2: ( Bluetooth )
                    // InternalOntologicalParser.g:1539:3: Bluetooth
                    {
                     before(grammarAccess.getKEYWORDAccess().getBluetoothKeyword_18()); 
                    match(input,Bluetooth,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getBluetoothKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalOntologicalParser.g:1544:2: ( OnlyCodes )
                    {
                    // InternalOntologicalParser.g:1544:2: ( OnlyCodes )
                    // InternalOntologicalParser.g:1545:3: OnlyCodes
                    {
                     before(grammarAccess.getKEYWORDAccess().getOnlyCodesKeyword_19()); 
                    match(input,OnlyCodes,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOnlyCodesKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalOntologicalParser.g:1550:2: ( Physics )
                    {
                    // InternalOntologicalParser.g:1550:2: ( Physics )
                    // InternalOntologicalParser.g:1551:3: Physics
                    {
                     before(grammarAccess.getKEYWORDAccess().getPhysicsKeyword_20()); 
                    match(input,Physics,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPhysicsKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalOntologicalParser.g:1556:2: ( Name )
                    {
                    // InternalOntologicalParser.g:1556:2: ( Name )
                    // InternalOntologicalParser.g:1557:3: Name
                    {
                     before(grammarAccess.getKEYWORDAccess().getNameKeyword_21()); 
                    match(input,Name,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNameKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalOntologicalParser.g:1562:2: ( Attributes )
                    {
                    // InternalOntologicalParser.g:1562:2: ( Attributes )
                    // InternalOntologicalParser.g:1563:3: Attributes
                    {
                     before(grammarAccess.getKEYWORDAccess().getAttributesKeyword_22()); 
                    match(input,Attributes,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAttributesKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalOntologicalParser.g:1568:2: ( NoSCN )
                    {
                    // InternalOntologicalParser.g:1568:2: ( NoSCN )
                    // InternalOntologicalParser.g:1569:3: NoSCN
                    {
                     before(grammarAccess.getKEYWORDAccess().getNoSCNKeyword_23()); 
                    match(input,NoSCN,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNoSCNKeyword_23()); 

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


    // $ANTLR start "rule__OntologicalRoot__Group__0"
    // InternalOntologicalParser.g:1578:1: rule__OntologicalRoot__Group__0 : rule__OntologicalRoot__Group__0__Impl rule__OntologicalRoot__Group__1 ;
    public final void rule__OntologicalRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1582:1: ( rule__OntologicalRoot__Group__0__Impl rule__OntologicalRoot__Group__1 )
            // InternalOntologicalParser.g:1583:2: rule__OntologicalRoot__Group__0__Impl rule__OntologicalRoot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__OntologicalRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRoot__Group__1();

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
    // $ANTLR end "rule__OntologicalRoot__Group__0"


    // $ANTLR start "rule__OntologicalRoot__Group__0__Impl"
    // InternalOntologicalParser.g:1590:1: rule__OntologicalRoot__Group__0__Impl : ( () ) ;
    public final void rule__OntologicalRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1594:1: ( ( () ) )
            // InternalOntologicalParser.g:1595:1: ( () )
            {
            // InternalOntologicalParser.g:1595:1: ( () )
            // InternalOntologicalParser.g:1596:2: ()
            {
             before(grammarAccess.getOntologicalRootAccess().getOntologicalRootAction_0()); 
            // InternalOntologicalParser.g:1597:2: ()
            // InternalOntologicalParser.g:1597:3: 
            {
            }

             after(grammarAccess.getOntologicalRootAccess().getOntologicalRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRoot__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRoot__Group__1"
    // InternalOntologicalParser.g:1605:1: rule__OntologicalRoot__Group__1 : rule__OntologicalRoot__Group__1__Impl rule__OntologicalRoot__Group__2 ;
    public final void rule__OntologicalRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1609:1: ( rule__OntologicalRoot__Group__1__Impl rule__OntologicalRoot__Group__2 )
            // InternalOntologicalParser.g:1610:2: rule__OntologicalRoot__Group__1__Impl rule__OntologicalRoot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__OntologicalRoot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRoot__Group__2();

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
    // $ANTLR end "rule__OntologicalRoot__Group__1"


    // $ANTLR start "rule__OntologicalRoot__Group__1__Impl"
    // InternalOntologicalParser.g:1617:1: rule__OntologicalRoot__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__OntologicalRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1621:1: ( ( LeftCurlyBracket ) )
            // InternalOntologicalParser.g:1622:1: ( LeftCurlyBracket )
            {
            // InternalOntologicalParser.g:1622:1: ( LeftCurlyBracket )
            // InternalOntologicalParser.g:1623:2: LeftCurlyBracket
            {
             before(grammarAccess.getOntologicalRootAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRoot__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRoot__Group__2"
    // InternalOntologicalParser.g:1632:1: rule__OntologicalRoot__Group__2 : rule__OntologicalRoot__Group__2__Impl rule__OntologicalRoot__Group__3 ;
    public final void rule__OntologicalRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1636:1: ( rule__OntologicalRoot__Group__2__Impl rule__OntologicalRoot__Group__3 )
            // InternalOntologicalParser.g:1637:2: rule__OntologicalRoot__Group__2__Impl rule__OntologicalRoot__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__OntologicalRoot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRoot__Group__3();

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
    // $ANTLR end "rule__OntologicalRoot__Group__2"


    // $ANTLR start "rule__OntologicalRoot__Group__2__Impl"
    // InternalOntologicalParser.g:1644:1: rule__OntologicalRoot__Group__2__Impl : ( ( rule__OntologicalRoot__Group_2__0 )? ) ;
    public final void rule__OntologicalRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1648:1: ( ( ( rule__OntologicalRoot__Group_2__0 )? ) )
            // InternalOntologicalParser.g:1649:1: ( ( rule__OntologicalRoot__Group_2__0 )? )
            {
            // InternalOntologicalParser.g:1649:1: ( ( rule__OntologicalRoot__Group_2__0 )? )
            // InternalOntologicalParser.g:1650:2: ( rule__OntologicalRoot__Group_2__0 )?
            {
             before(grammarAccess.getOntologicalRootAccess().getGroup_2()); 
            // InternalOntologicalParser.g:1651:2: ( rule__OntologicalRoot__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=Bluetooth && LA8_0<=OnlyCodes)||(LA8_0>=External && LA8_0<=Gameloop)||LA8_0==Classes||LA8_0==Physics||LA8_0==Name||LA8_0==URI) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntologicalParser.g:1651:3: rule__OntologicalRoot__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntologicalRoot__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntologicalRootAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRoot__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRoot__Group__3"
    // InternalOntologicalParser.g:1659:1: rule__OntologicalRoot__Group__3 : rule__OntologicalRoot__Group__3__Impl ;
    public final void rule__OntologicalRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1663:1: ( rule__OntologicalRoot__Group__3__Impl )
            // InternalOntologicalParser.g:1664:2: rule__OntologicalRoot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRoot__Group__3__Impl();

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
    // $ANTLR end "rule__OntologicalRoot__Group__3"


    // $ANTLR start "rule__OntologicalRoot__Group__3__Impl"
    // InternalOntologicalParser.g:1670:1: rule__OntologicalRoot__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__OntologicalRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1674:1: ( ( RightCurlyBracket ) )
            // InternalOntologicalParser.g:1675:1: ( RightCurlyBracket )
            {
            // InternalOntologicalParser.g:1675:1: ( RightCurlyBracket )
            // InternalOntologicalParser.g:1676:2: RightCurlyBracket
            {
             before(grammarAccess.getOntologicalRootAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRoot__Group__3__Impl"


    // $ANTLR start "rule__OntologicalRoot__Group_2__0"
    // InternalOntologicalParser.g:1686:1: rule__OntologicalRoot__Group_2__0 : rule__OntologicalRoot__Group_2__0__Impl rule__OntologicalRoot__Group_2__1 ;
    public final void rule__OntologicalRoot__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1690:1: ( rule__OntologicalRoot__Group_2__0__Impl rule__OntologicalRoot__Group_2__1 )
            // InternalOntologicalParser.g:1691:2: rule__OntologicalRoot__Group_2__0__Impl rule__OntologicalRoot__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__OntologicalRoot__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRoot__Group_2__1();

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
    // $ANTLR end "rule__OntologicalRoot__Group_2__0"


    // $ANTLR start "rule__OntologicalRoot__Group_2__0__Impl"
    // InternalOntologicalParser.g:1698:1: rule__OntologicalRoot__Group_2__0__Impl : ( ( rule__OntologicalRoot__OntologicalRootAssignment_2_0 ) ) ;
    public final void rule__OntologicalRoot__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1702:1: ( ( ( rule__OntologicalRoot__OntologicalRootAssignment_2_0 ) ) )
            // InternalOntologicalParser.g:1703:1: ( ( rule__OntologicalRoot__OntologicalRootAssignment_2_0 ) )
            {
            // InternalOntologicalParser.g:1703:1: ( ( rule__OntologicalRoot__OntologicalRootAssignment_2_0 ) )
            // InternalOntologicalParser.g:1704:2: ( rule__OntologicalRoot__OntologicalRootAssignment_2_0 )
            {
             before(grammarAccess.getOntologicalRootAccess().getOntologicalRootAssignment_2_0()); 
            // InternalOntologicalParser.g:1705:2: ( rule__OntologicalRoot__OntologicalRootAssignment_2_0 )
            // InternalOntologicalParser.g:1705:3: rule__OntologicalRoot__OntologicalRootAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRoot__OntologicalRootAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootAccess().getOntologicalRootAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRoot__Group_2__0__Impl"


    // $ANTLR start "rule__OntologicalRoot__Group_2__1"
    // InternalOntologicalParser.g:1713:1: rule__OntologicalRoot__Group_2__1 : rule__OntologicalRoot__Group_2__1__Impl ;
    public final void rule__OntologicalRoot__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1717:1: ( rule__OntologicalRoot__Group_2__1__Impl )
            // InternalOntologicalParser.g:1718:2: rule__OntologicalRoot__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRoot__Group_2__1__Impl();

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
    // $ANTLR end "rule__OntologicalRoot__Group_2__1"


    // $ANTLR start "rule__OntologicalRoot__Group_2__1__Impl"
    // InternalOntologicalParser.g:1724:1: rule__OntologicalRoot__Group_2__1__Impl : ( ( rule__OntologicalRoot__Group_2_1__0 )* ) ;
    public final void rule__OntologicalRoot__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1728:1: ( ( ( rule__OntologicalRoot__Group_2_1__0 )* ) )
            // InternalOntologicalParser.g:1729:1: ( ( rule__OntologicalRoot__Group_2_1__0 )* )
            {
            // InternalOntologicalParser.g:1729:1: ( ( rule__OntologicalRoot__Group_2_1__0 )* )
            // InternalOntologicalParser.g:1730:2: ( rule__OntologicalRoot__Group_2_1__0 )*
            {
             before(grammarAccess.getOntologicalRootAccess().getGroup_2_1()); 
            // InternalOntologicalParser.g:1731:2: ( rule__OntologicalRoot__Group_2_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Comma) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOntologicalParser.g:1731:3: rule__OntologicalRoot__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__OntologicalRoot__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getOntologicalRootAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRoot__Group_2__1__Impl"


    // $ANTLR start "rule__OntologicalRoot__Group_2_1__0"
    // InternalOntologicalParser.g:1740:1: rule__OntologicalRoot__Group_2_1__0 : rule__OntologicalRoot__Group_2_1__0__Impl rule__OntologicalRoot__Group_2_1__1 ;
    public final void rule__OntologicalRoot__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1744:1: ( rule__OntologicalRoot__Group_2_1__0__Impl rule__OntologicalRoot__Group_2_1__1 )
            // InternalOntologicalParser.g:1745:2: rule__OntologicalRoot__Group_2_1__0__Impl rule__OntologicalRoot__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__OntologicalRoot__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRoot__Group_2_1__1();

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
    // $ANTLR end "rule__OntologicalRoot__Group_2_1__0"


    // $ANTLR start "rule__OntologicalRoot__Group_2_1__0__Impl"
    // InternalOntologicalParser.g:1752:1: rule__OntologicalRoot__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__OntologicalRoot__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1756:1: ( ( Comma ) )
            // InternalOntologicalParser.g:1757:1: ( Comma )
            {
            // InternalOntologicalParser.g:1757:1: ( Comma )
            // InternalOntologicalParser.g:1758:2: Comma
            {
             before(grammarAccess.getOntologicalRootAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRoot__Group_2_1__0__Impl"


    // $ANTLR start "rule__OntologicalRoot__Group_2_1__1"
    // InternalOntologicalParser.g:1767:1: rule__OntologicalRoot__Group_2_1__1 : rule__OntologicalRoot__Group_2_1__1__Impl ;
    public final void rule__OntologicalRoot__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1771:1: ( rule__OntologicalRoot__Group_2_1__1__Impl )
            // InternalOntologicalParser.g:1772:2: rule__OntologicalRoot__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRoot__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__OntologicalRoot__Group_2_1__1"


    // $ANTLR start "rule__OntologicalRoot__Group_2_1__1__Impl"
    // InternalOntologicalParser.g:1778:1: rule__OntologicalRoot__Group_2_1__1__Impl : ( ( rule__OntologicalRoot__OntologicalRootAssignment_2_1_1 ) ) ;
    public final void rule__OntologicalRoot__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1782:1: ( ( ( rule__OntologicalRoot__OntologicalRootAssignment_2_1_1 ) ) )
            // InternalOntologicalParser.g:1783:1: ( ( rule__OntologicalRoot__OntologicalRootAssignment_2_1_1 ) )
            {
            // InternalOntologicalParser.g:1783:1: ( ( rule__OntologicalRoot__OntologicalRootAssignment_2_1_1 ) )
            // InternalOntologicalParser.g:1784:2: ( rule__OntologicalRoot__OntologicalRootAssignment_2_1_1 )
            {
             before(grammarAccess.getOntologicalRootAccess().getOntologicalRootAssignment_2_1_1()); 
            // InternalOntologicalParser.g:1785:2: ( rule__OntologicalRoot__OntologicalRootAssignment_2_1_1 )
            // InternalOntologicalParser.g:1785:3: rule__OntologicalRoot__OntologicalRootAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRoot__OntologicalRootAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootAccess().getOntologicalRootAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRoot__Group_2_1__1__Impl"


    // $ANTLR start "rule__OntologicalRootName__Group__0"
    // InternalOntologicalParser.g:1794:1: rule__OntologicalRootName__Group__0 : rule__OntologicalRootName__Group__0__Impl rule__OntologicalRootName__Group__1 ;
    public final void rule__OntologicalRootName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1798:1: ( rule__OntologicalRootName__Group__0__Impl rule__OntologicalRootName__Group__1 )
            // InternalOntologicalParser.g:1799:2: rule__OntologicalRootName__Group__0__Impl rule__OntologicalRootName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__OntologicalRootName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootName__Group__1();

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
    // $ANTLR end "rule__OntologicalRootName__Group__0"


    // $ANTLR start "rule__OntologicalRootName__Group__0__Impl"
    // InternalOntologicalParser.g:1806:1: rule__OntologicalRootName__Group__0__Impl : ( () ) ;
    public final void rule__OntologicalRootName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1810:1: ( ( () ) )
            // InternalOntologicalParser.g:1811:1: ( () )
            {
            // InternalOntologicalParser.g:1811:1: ( () )
            // InternalOntologicalParser.g:1812:2: ()
            {
             before(grammarAccess.getOntologicalRootNameAccess().getOntologicalRootNameAction_0()); 
            // InternalOntologicalParser.g:1813:2: ()
            // InternalOntologicalParser.g:1813:3: 
            {
            }

             after(grammarAccess.getOntologicalRootNameAccess().getOntologicalRootNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootName__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootName__Group__1"
    // InternalOntologicalParser.g:1821:1: rule__OntologicalRootName__Group__1 : rule__OntologicalRootName__Group__1__Impl rule__OntologicalRootName__Group__2 ;
    public final void rule__OntologicalRootName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1825:1: ( rule__OntologicalRootName__Group__1__Impl rule__OntologicalRootName__Group__2 )
            // InternalOntologicalParser.g:1826:2: rule__OntologicalRootName__Group__1__Impl rule__OntologicalRootName__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootName__Group__2();

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
    // $ANTLR end "rule__OntologicalRootName__Group__1"


    // $ANTLR start "rule__OntologicalRootName__Group__1__Impl"
    // InternalOntologicalParser.g:1833:1: rule__OntologicalRootName__Group__1__Impl : ( Name ) ;
    public final void rule__OntologicalRootName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1837:1: ( ( Name ) )
            // InternalOntologicalParser.g:1838:1: ( Name )
            {
            // InternalOntologicalParser.g:1838:1: ( Name )
            // InternalOntologicalParser.g:1839:2: Name
            {
             before(grammarAccess.getOntologicalRootNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootName__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootName__Group__2"
    // InternalOntologicalParser.g:1848:1: rule__OntologicalRootName__Group__2 : rule__OntologicalRootName__Group__2__Impl rule__OntologicalRootName__Group__3 ;
    public final void rule__OntologicalRootName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1852:1: ( rule__OntologicalRootName__Group__2__Impl rule__OntologicalRootName__Group__3 )
            // InternalOntologicalParser.g:1853:2: rule__OntologicalRootName__Group__2__Impl rule__OntologicalRootName__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootName__Group__3();

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
    // $ANTLR end "rule__OntologicalRootName__Group__2"


    // $ANTLR start "rule__OntologicalRootName__Group__2__Impl"
    // InternalOntologicalParser.g:1860:1: rule__OntologicalRootName__Group__2__Impl : ( Colon ) ;
    public final void rule__OntologicalRootName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1864:1: ( ( Colon ) )
            // InternalOntologicalParser.g:1865:1: ( Colon )
            {
            // InternalOntologicalParser.g:1865:1: ( Colon )
            // InternalOntologicalParser.g:1866:2: Colon
            {
             before(grammarAccess.getOntologicalRootNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootName__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootName__Group__3"
    // InternalOntologicalParser.g:1875:1: rule__OntologicalRootName__Group__3 : rule__OntologicalRootName__Group__3__Impl ;
    public final void rule__OntologicalRootName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1879:1: ( rule__OntologicalRootName__Group__3__Impl )
            // InternalOntologicalParser.g:1880:2: rule__OntologicalRootName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootName__Group__3__Impl();

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
    // $ANTLR end "rule__OntologicalRootName__Group__3"


    // $ANTLR start "rule__OntologicalRootName__Group__3__Impl"
    // InternalOntologicalParser.g:1886:1: rule__OntologicalRootName__Group__3__Impl : ( ( rule__OntologicalRootName__NameAssignment_3 ) ) ;
    public final void rule__OntologicalRootName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1890:1: ( ( ( rule__OntologicalRootName__NameAssignment_3 ) ) )
            // InternalOntologicalParser.g:1891:1: ( ( rule__OntologicalRootName__NameAssignment_3 ) )
            {
            // InternalOntologicalParser.g:1891:1: ( ( rule__OntologicalRootName__NameAssignment_3 ) )
            // InternalOntologicalParser.g:1892:2: ( rule__OntologicalRootName__NameAssignment_3 )
            {
             before(grammarAccess.getOntologicalRootNameAccess().getNameAssignment_3()); 
            // InternalOntologicalParser.g:1893:2: ( rule__OntologicalRootName__NameAssignment_3 )
            // InternalOntologicalParser.g:1893:3: rule__OntologicalRootName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootName__Group__3__Impl"


    // $ANTLR start "rule__OntologicalRootURI__Group__0"
    // InternalOntologicalParser.g:1902:1: rule__OntologicalRootURI__Group__0 : rule__OntologicalRootURI__Group__0__Impl rule__OntologicalRootURI__Group__1 ;
    public final void rule__OntologicalRootURI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1906:1: ( rule__OntologicalRootURI__Group__0__Impl rule__OntologicalRootURI__Group__1 )
            // InternalOntologicalParser.g:1907:2: rule__OntologicalRootURI__Group__0__Impl rule__OntologicalRootURI__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootURI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootURI__Group__1();

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
    // $ANTLR end "rule__OntologicalRootURI__Group__0"


    // $ANTLR start "rule__OntologicalRootURI__Group__0__Impl"
    // InternalOntologicalParser.g:1914:1: rule__OntologicalRootURI__Group__0__Impl : ( URI ) ;
    public final void rule__OntologicalRootURI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1918:1: ( ( URI ) )
            // InternalOntologicalParser.g:1919:1: ( URI )
            {
            // InternalOntologicalParser.g:1919:1: ( URI )
            // InternalOntologicalParser.g:1920:2: URI
            {
             before(grammarAccess.getOntologicalRootURIAccess().getURIKeyword_0()); 
            match(input,URI,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootURIAccess().getURIKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootURI__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootURI__Group__1"
    // InternalOntologicalParser.g:1929:1: rule__OntologicalRootURI__Group__1 : rule__OntologicalRootURI__Group__1__Impl rule__OntologicalRootURI__Group__2 ;
    public final void rule__OntologicalRootURI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1933:1: ( rule__OntologicalRootURI__Group__1__Impl rule__OntologicalRootURI__Group__2 )
            // InternalOntologicalParser.g:1934:2: rule__OntologicalRootURI__Group__1__Impl rule__OntologicalRootURI__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootURI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootURI__Group__2();

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
    // $ANTLR end "rule__OntologicalRootURI__Group__1"


    // $ANTLR start "rule__OntologicalRootURI__Group__1__Impl"
    // InternalOntologicalParser.g:1941:1: rule__OntologicalRootURI__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootURI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1945:1: ( ( Colon ) )
            // InternalOntologicalParser.g:1946:1: ( Colon )
            {
            // InternalOntologicalParser.g:1946:1: ( Colon )
            // InternalOntologicalParser.g:1947:2: Colon
            {
             before(grammarAccess.getOntologicalRootURIAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootURIAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootURI__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootURI__Group__2"
    // InternalOntologicalParser.g:1956:1: rule__OntologicalRootURI__Group__2 : rule__OntologicalRootURI__Group__2__Impl ;
    public final void rule__OntologicalRootURI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1960:1: ( rule__OntologicalRootURI__Group__2__Impl )
            // InternalOntologicalParser.g:1961:2: rule__OntologicalRootURI__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootURI__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootURI__Group__2"


    // $ANTLR start "rule__OntologicalRootURI__Group__2__Impl"
    // InternalOntologicalParser.g:1967:1: rule__OntologicalRootURI__Group__2__Impl : ( ( rule__OntologicalRootURI__URIAssignment_2 ) ) ;
    public final void rule__OntologicalRootURI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1971:1: ( ( ( rule__OntologicalRootURI__URIAssignment_2 ) ) )
            // InternalOntologicalParser.g:1972:1: ( ( rule__OntologicalRootURI__URIAssignment_2 ) )
            {
            // InternalOntologicalParser.g:1972:1: ( ( rule__OntologicalRootURI__URIAssignment_2 ) )
            // InternalOntologicalParser.g:1973:2: ( rule__OntologicalRootURI__URIAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootURIAccess().getURIAssignment_2()); 
            // InternalOntologicalParser.g:1974:2: ( rule__OntologicalRootURI__URIAssignment_2 )
            // InternalOntologicalParser.g:1974:3: rule__OntologicalRootURI__URIAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootURI__URIAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootURIAccess().getURIAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootURI__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootOnlyCodes__Group__0"
    // InternalOntologicalParser.g:1983:1: rule__OntologicalRootOnlyCodes__Group__0 : rule__OntologicalRootOnlyCodes__Group__0__Impl rule__OntologicalRootOnlyCodes__Group__1 ;
    public final void rule__OntologicalRootOnlyCodes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1987:1: ( rule__OntologicalRootOnlyCodes__Group__0__Impl rule__OntologicalRootOnlyCodes__Group__1 )
            // InternalOntologicalParser.g:1988:2: rule__OntologicalRootOnlyCodes__Group__0__Impl rule__OntologicalRootOnlyCodes__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootOnlyCodes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootOnlyCodes__Group__1();

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
    // $ANTLR end "rule__OntologicalRootOnlyCodes__Group__0"


    // $ANTLR start "rule__OntologicalRootOnlyCodes__Group__0__Impl"
    // InternalOntologicalParser.g:1995:1: rule__OntologicalRootOnlyCodes__Group__0__Impl : ( OnlyCodes ) ;
    public final void rule__OntologicalRootOnlyCodes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:1999:1: ( ( OnlyCodes ) )
            // InternalOntologicalParser.g:2000:1: ( OnlyCodes )
            {
            // InternalOntologicalParser.g:2000:1: ( OnlyCodes )
            // InternalOntologicalParser.g:2001:2: OnlyCodes
            {
             before(grammarAccess.getOntologicalRootOnlyCodesAccess().getOnlyCodesKeyword_0()); 
            match(input,OnlyCodes,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootOnlyCodesAccess().getOnlyCodesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootOnlyCodes__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootOnlyCodes__Group__1"
    // InternalOntologicalParser.g:2010:1: rule__OntologicalRootOnlyCodes__Group__1 : rule__OntologicalRootOnlyCodes__Group__1__Impl rule__OntologicalRootOnlyCodes__Group__2 ;
    public final void rule__OntologicalRootOnlyCodes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2014:1: ( rule__OntologicalRootOnlyCodes__Group__1__Impl rule__OntologicalRootOnlyCodes__Group__2 )
            // InternalOntologicalParser.g:2015:2: rule__OntologicalRootOnlyCodes__Group__1__Impl rule__OntologicalRootOnlyCodes__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootOnlyCodes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootOnlyCodes__Group__2();

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
    // $ANTLR end "rule__OntologicalRootOnlyCodes__Group__1"


    // $ANTLR start "rule__OntologicalRootOnlyCodes__Group__1__Impl"
    // InternalOntologicalParser.g:2022:1: rule__OntologicalRootOnlyCodes__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootOnlyCodes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2026:1: ( ( Colon ) )
            // InternalOntologicalParser.g:2027:1: ( Colon )
            {
            // InternalOntologicalParser.g:2027:1: ( Colon )
            // InternalOntologicalParser.g:2028:2: Colon
            {
             before(grammarAccess.getOntologicalRootOnlyCodesAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootOnlyCodesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootOnlyCodes__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootOnlyCodes__Group__2"
    // InternalOntologicalParser.g:2037:1: rule__OntologicalRootOnlyCodes__Group__2 : rule__OntologicalRootOnlyCodes__Group__2__Impl ;
    public final void rule__OntologicalRootOnlyCodes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2041:1: ( rule__OntologicalRootOnlyCodes__Group__2__Impl )
            // InternalOntologicalParser.g:2042:2: rule__OntologicalRootOnlyCodes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootOnlyCodes__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootOnlyCodes__Group__2"


    // $ANTLR start "rule__OntologicalRootOnlyCodes__Group__2__Impl"
    // InternalOntologicalParser.g:2048:1: rule__OntologicalRootOnlyCodes__Group__2__Impl : ( ( rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2 ) ) ;
    public final void rule__OntologicalRootOnlyCodes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2052:1: ( ( ( rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2 ) ) )
            // InternalOntologicalParser.g:2053:1: ( ( rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2 ) )
            {
            // InternalOntologicalParser.g:2053:1: ( ( rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2 ) )
            // InternalOntologicalParser.g:2054:2: ( rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootOnlyCodesAccess().getOnlyCodesAssignment_2()); 
            // InternalOntologicalParser.g:2055:2: ( rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2 )
            // InternalOntologicalParser.g:2055:3: rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootOnlyCodesAccess().getOnlyCodesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootOnlyCodes__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootBluetooth__Group__0"
    // InternalOntologicalParser.g:2064:1: rule__OntologicalRootBluetooth__Group__0 : rule__OntologicalRootBluetooth__Group__0__Impl rule__OntologicalRootBluetooth__Group__1 ;
    public final void rule__OntologicalRootBluetooth__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2068:1: ( rule__OntologicalRootBluetooth__Group__0__Impl rule__OntologicalRootBluetooth__Group__1 )
            // InternalOntologicalParser.g:2069:2: rule__OntologicalRootBluetooth__Group__0__Impl rule__OntologicalRootBluetooth__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootBluetooth__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootBluetooth__Group__1();

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
    // $ANTLR end "rule__OntologicalRootBluetooth__Group__0"


    // $ANTLR start "rule__OntologicalRootBluetooth__Group__0__Impl"
    // InternalOntologicalParser.g:2076:1: rule__OntologicalRootBluetooth__Group__0__Impl : ( Bluetooth ) ;
    public final void rule__OntologicalRootBluetooth__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2080:1: ( ( Bluetooth ) )
            // InternalOntologicalParser.g:2081:1: ( Bluetooth )
            {
            // InternalOntologicalParser.g:2081:1: ( Bluetooth )
            // InternalOntologicalParser.g:2082:2: Bluetooth
            {
             before(grammarAccess.getOntologicalRootBluetoothAccess().getBluetoothKeyword_0()); 
            match(input,Bluetooth,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootBluetoothAccess().getBluetoothKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootBluetooth__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootBluetooth__Group__1"
    // InternalOntologicalParser.g:2091:1: rule__OntologicalRootBluetooth__Group__1 : rule__OntologicalRootBluetooth__Group__1__Impl rule__OntologicalRootBluetooth__Group__2 ;
    public final void rule__OntologicalRootBluetooth__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2095:1: ( rule__OntologicalRootBluetooth__Group__1__Impl rule__OntologicalRootBluetooth__Group__2 )
            // InternalOntologicalParser.g:2096:2: rule__OntologicalRootBluetooth__Group__1__Impl rule__OntologicalRootBluetooth__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootBluetooth__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootBluetooth__Group__2();

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
    // $ANTLR end "rule__OntologicalRootBluetooth__Group__1"


    // $ANTLR start "rule__OntologicalRootBluetooth__Group__1__Impl"
    // InternalOntologicalParser.g:2103:1: rule__OntologicalRootBluetooth__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootBluetooth__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2107:1: ( ( Colon ) )
            // InternalOntologicalParser.g:2108:1: ( Colon )
            {
            // InternalOntologicalParser.g:2108:1: ( Colon )
            // InternalOntologicalParser.g:2109:2: Colon
            {
             before(grammarAccess.getOntologicalRootBluetoothAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootBluetoothAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootBluetooth__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootBluetooth__Group__2"
    // InternalOntologicalParser.g:2118:1: rule__OntologicalRootBluetooth__Group__2 : rule__OntologicalRootBluetooth__Group__2__Impl ;
    public final void rule__OntologicalRootBluetooth__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2122:1: ( rule__OntologicalRootBluetooth__Group__2__Impl )
            // InternalOntologicalParser.g:2123:2: rule__OntologicalRootBluetooth__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootBluetooth__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootBluetooth__Group__2"


    // $ANTLR start "rule__OntologicalRootBluetooth__Group__2__Impl"
    // InternalOntologicalParser.g:2129:1: rule__OntologicalRootBluetooth__Group__2__Impl : ( ( rule__OntologicalRootBluetooth__BluetoothAssignment_2 ) ) ;
    public final void rule__OntologicalRootBluetooth__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2133:1: ( ( ( rule__OntologicalRootBluetooth__BluetoothAssignment_2 ) ) )
            // InternalOntologicalParser.g:2134:1: ( ( rule__OntologicalRootBluetooth__BluetoothAssignment_2 ) )
            {
            // InternalOntologicalParser.g:2134:1: ( ( rule__OntologicalRootBluetooth__BluetoothAssignment_2 ) )
            // InternalOntologicalParser.g:2135:2: ( rule__OntologicalRootBluetooth__BluetoothAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootBluetoothAccess().getBluetoothAssignment_2()); 
            // InternalOntologicalParser.g:2136:2: ( rule__OntologicalRootBluetooth__BluetoothAssignment_2 )
            // InternalOntologicalParser.g:2136:3: rule__OntologicalRootBluetooth__BluetoothAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootBluetooth__BluetoothAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootBluetoothAccess().getBluetoothAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootBluetooth__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootExternal__Group__0"
    // InternalOntologicalParser.g:2145:1: rule__OntologicalRootExternal__Group__0 : rule__OntologicalRootExternal__Group__0__Impl rule__OntologicalRootExternal__Group__1 ;
    public final void rule__OntologicalRootExternal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2149:1: ( rule__OntologicalRootExternal__Group__0__Impl rule__OntologicalRootExternal__Group__1 )
            // InternalOntologicalParser.g:2150:2: rule__OntologicalRootExternal__Group__0__Impl rule__OntologicalRootExternal__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootExternal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootExternal__Group__1();

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
    // $ANTLR end "rule__OntologicalRootExternal__Group__0"


    // $ANTLR start "rule__OntologicalRootExternal__Group__0__Impl"
    // InternalOntologicalParser.g:2157:1: rule__OntologicalRootExternal__Group__0__Impl : ( External ) ;
    public final void rule__OntologicalRootExternal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2161:1: ( ( External ) )
            // InternalOntologicalParser.g:2162:1: ( External )
            {
            // InternalOntologicalParser.g:2162:1: ( External )
            // InternalOntologicalParser.g:2163:2: External
            {
             before(grammarAccess.getOntologicalRootExternalAccess().getExternalKeyword_0()); 
            match(input,External,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootExternalAccess().getExternalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootExternal__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootExternal__Group__1"
    // InternalOntologicalParser.g:2172:1: rule__OntologicalRootExternal__Group__1 : rule__OntologicalRootExternal__Group__1__Impl rule__OntologicalRootExternal__Group__2 ;
    public final void rule__OntologicalRootExternal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2176:1: ( rule__OntologicalRootExternal__Group__1__Impl rule__OntologicalRootExternal__Group__2 )
            // InternalOntologicalParser.g:2177:2: rule__OntologicalRootExternal__Group__1__Impl rule__OntologicalRootExternal__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootExternal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootExternal__Group__2();

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
    // $ANTLR end "rule__OntologicalRootExternal__Group__1"


    // $ANTLR start "rule__OntologicalRootExternal__Group__1__Impl"
    // InternalOntologicalParser.g:2184:1: rule__OntologicalRootExternal__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootExternal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2188:1: ( ( Colon ) )
            // InternalOntologicalParser.g:2189:1: ( Colon )
            {
            // InternalOntologicalParser.g:2189:1: ( Colon )
            // InternalOntologicalParser.g:2190:2: Colon
            {
             before(grammarAccess.getOntologicalRootExternalAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootExternalAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootExternal__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootExternal__Group__2"
    // InternalOntologicalParser.g:2199:1: rule__OntologicalRootExternal__Group__2 : rule__OntologicalRootExternal__Group__2__Impl ;
    public final void rule__OntologicalRootExternal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2203:1: ( rule__OntologicalRootExternal__Group__2__Impl )
            // InternalOntologicalParser.g:2204:2: rule__OntologicalRootExternal__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootExternal__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootExternal__Group__2"


    // $ANTLR start "rule__OntologicalRootExternal__Group__2__Impl"
    // InternalOntologicalParser.g:2210:1: rule__OntologicalRootExternal__Group__2__Impl : ( ( rule__OntologicalRootExternal__ExternalAssignment_2 ) ) ;
    public final void rule__OntologicalRootExternal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2214:1: ( ( ( rule__OntologicalRootExternal__ExternalAssignment_2 ) ) )
            // InternalOntologicalParser.g:2215:1: ( ( rule__OntologicalRootExternal__ExternalAssignment_2 ) )
            {
            // InternalOntologicalParser.g:2215:1: ( ( rule__OntologicalRootExternal__ExternalAssignment_2 ) )
            // InternalOntologicalParser.g:2216:2: ( rule__OntologicalRootExternal__ExternalAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootExternalAccess().getExternalAssignment_2()); 
            // InternalOntologicalParser.g:2217:2: ( rule__OntologicalRootExternal__ExternalAssignment_2 )
            // InternalOntologicalParser.g:2217:3: rule__OntologicalRootExternal__ExternalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootExternal__ExternalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootExternalAccess().getExternalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootExternal__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootFirebase__Group__0"
    // InternalOntologicalParser.g:2226:1: rule__OntologicalRootFirebase__Group__0 : rule__OntologicalRootFirebase__Group__0__Impl rule__OntologicalRootFirebase__Group__1 ;
    public final void rule__OntologicalRootFirebase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2230:1: ( rule__OntologicalRootFirebase__Group__0__Impl rule__OntologicalRootFirebase__Group__1 )
            // InternalOntologicalParser.g:2231:2: rule__OntologicalRootFirebase__Group__0__Impl rule__OntologicalRootFirebase__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootFirebase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootFirebase__Group__1();

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
    // $ANTLR end "rule__OntologicalRootFirebase__Group__0"


    // $ANTLR start "rule__OntologicalRootFirebase__Group__0__Impl"
    // InternalOntologicalParser.g:2238:1: rule__OntologicalRootFirebase__Group__0__Impl : ( Firebase ) ;
    public final void rule__OntologicalRootFirebase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2242:1: ( ( Firebase ) )
            // InternalOntologicalParser.g:2243:1: ( Firebase )
            {
            // InternalOntologicalParser.g:2243:1: ( Firebase )
            // InternalOntologicalParser.g:2244:2: Firebase
            {
             before(grammarAccess.getOntologicalRootFirebaseAccess().getFirebaseKeyword_0()); 
            match(input,Firebase,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootFirebaseAccess().getFirebaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootFirebase__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootFirebase__Group__1"
    // InternalOntologicalParser.g:2253:1: rule__OntologicalRootFirebase__Group__1 : rule__OntologicalRootFirebase__Group__1__Impl rule__OntologicalRootFirebase__Group__2 ;
    public final void rule__OntologicalRootFirebase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2257:1: ( rule__OntologicalRootFirebase__Group__1__Impl rule__OntologicalRootFirebase__Group__2 )
            // InternalOntologicalParser.g:2258:2: rule__OntologicalRootFirebase__Group__1__Impl rule__OntologicalRootFirebase__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootFirebase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootFirebase__Group__2();

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
    // $ANTLR end "rule__OntologicalRootFirebase__Group__1"


    // $ANTLR start "rule__OntologicalRootFirebase__Group__1__Impl"
    // InternalOntologicalParser.g:2265:1: rule__OntologicalRootFirebase__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootFirebase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2269:1: ( ( Colon ) )
            // InternalOntologicalParser.g:2270:1: ( Colon )
            {
            // InternalOntologicalParser.g:2270:1: ( Colon )
            // InternalOntologicalParser.g:2271:2: Colon
            {
             before(grammarAccess.getOntologicalRootFirebaseAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootFirebaseAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootFirebase__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootFirebase__Group__2"
    // InternalOntologicalParser.g:2280:1: rule__OntologicalRootFirebase__Group__2 : rule__OntologicalRootFirebase__Group__2__Impl ;
    public final void rule__OntologicalRootFirebase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2284:1: ( rule__OntologicalRootFirebase__Group__2__Impl )
            // InternalOntologicalParser.g:2285:2: rule__OntologicalRootFirebase__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootFirebase__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootFirebase__Group__2"


    // $ANTLR start "rule__OntologicalRootFirebase__Group__2__Impl"
    // InternalOntologicalParser.g:2291:1: rule__OntologicalRootFirebase__Group__2__Impl : ( ( rule__OntologicalRootFirebase__FirebaseAssignment_2 ) ) ;
    public final void rule__OntologicalRootFirebase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2295:1: ( ( ( rule__OntologicalRootFirebase__FirebaseAssignment_2 ) ) )
            // InternalOntologicalParser.g:2296:1: ( ( rule__OntologicalRootFirebase__FirebaseAssignment_2 ) )
            {
            // InternalOntologicalParser.g:2296:1: ( ( rule__OntologicalRootFirebase__FirebaseAssignment_2 ) )
            // InternalOntologicalParser.g:2297:2: ( rule__OntologicalRootFirebase__FirebaseAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootFirebaseAccess().getFirebaseAssignment_2()); 
            // InternalOntologicalParser.g:2298:2: ( rule__OntologicalRootFirebase__FirebaseAssignment_2 )
            // InternalOntologicalParser.g:2298:3: rule__OntologicalRootFirebase__FirebaseAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootFirebase__FirebaseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootFirebaseAccess().getFirebaseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootFirebase__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootPhysics__Group__0"
    // InternalOntologicalParser.g:2307:1: rule__OntologicalRootPhysics__Group__0 : rule__OntologicalRootPhysics__Group__0__Impl rule__OntologicalRootPhysics__Group__1 ;
    public final void rule__OntologicalRootPhysics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2311:1: ( rule__OntologicalRootPhysics__Group__0__Impl rule__OntologicalRootPhysics__Group__1 )
            // InternalOntologicalParser.g:2312:2: rule__OntologicalRootPhysics__Group__0__Impl rule__OntologicalRootPhysics__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootPhysics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootPhysics__Group__1();

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
    // $ANTLR end "rule__OntologicalRootPhysics__Group__0"


    // $ANTLR start "rule__OntologicalRootPhysics__Group__0__Impl"
    // InternalOntologicalParser.g:2319:1: rule__OntologicalRootPhysics__Group__0__Impl : ( Physics ) ;
    public final void rule__OntologicalRootPhysics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2323:1: ( ( Physics ) )
            // InternalOntologicalParser.g:2324:1: ( Physics )
            {
            // InternalOntologicalParser.g:2324:1: ( Physics )
            // InternalOntologicalParser.g:2325:2: Physics
            {
             before(grammarAccess.getOntologicalRootPhysicsAccess().getPhysicsKeyword_0()); 
            match(input,Physics,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootPhysicsAccess().getPhysicsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootPhysics__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootPhysics__Group__1"
    // InternalOntologicalParser.g:2334:1: rule__OntologicalRootPhysics__Group__1 : rule__OntologicalRootPhysics__Group__1__Impl rule__OntologicalRootPhysics__Group__2 ;
    public final void rule__OntologicalRootPhysics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2338:1: ( rule__OntologicalRootPhysics__Group__1__Impl rule__OntologicalRootPhysics__Group__2 )
            // InternalOntologicalParser.g:2339:2: rule__OntologicalRootPhysics__Group__1__Impl rule__OntologicalRootPhysics__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootPhysics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootPhysics__Group__2();

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
    // $ANTLR end "rule__OntologicalRootPhysics__Group__1"


    // $ANTLR start "rule__OntologicalRootPhysics__Group__1__Impl"
    // InternalOntologicalParser.g:2346:1: rule__OntologicalRootPhysics__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootPhysics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2350:1: ( ( Colon ) )
            // InternalOntologicalParser.g:2351:1: ( Colon )
            {
            // InternalOntologicalParser.g:2351:1: ( Colon )
            // InternalOntologicalParser.g:2352:2: Colon
            {
             before(grammarAccess.getOntologicalRootPhysicsAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootPhysicsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootPhysics__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootPhysics__Group__2"
    // InternalOntologicalParser.g:2361:1: rule__OntologicalRootPhysics__Group__2 : rule__OntologicalRootPhysics__Group__2__Impl ;
    public final void rule__OntologicalRootPhysics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2365:1: ( rule__OntologicalRootPhysics__Group__2__Impl )
            // InternalOntologicalParser.g:2366:2: rule__OntologicalRootPhysics__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootPhysics__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootPhysics__Group__2"


    // $ANTLR start "rule__OntologicalRootPhysics__Group__2__Impl"
    // InternalOntologicalParser.g:2372:1: rule__OntologicalRootPhysics__Group__2__Impl : ( ( rule__OntologicalRootPhysics__PhysicsAssignment_2 ) ) ;
    public final void rule__OntologicalRootPhysics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2376:1: ( ( ( rule__OntologicalRootPhysics__PhysicsAssignment_2 ) ) )
            // InternalOntologicalParser.g:2377:1: ( ( rule__OntologicalRootPhysics__PhysicsAssignment_2 ) )
            {
            // InternalOntologicalParser.g:2377:1: ( ( rule__OntologicalRootPhysics__PhysicsAssignment_2 ) )
            // InternalOntologicalParser.g:2378:2: ( rule__OntologicalRootPhysics__PhysicsAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootPhysicsAccess().getPhysicsAssignment_2()); 
            // InternalOntologicalParser.g:2379:2: ( rule__OntologicalRootPhysics__PhysicsAssignment_2 )
            // InternalOntologicalParser.g:2379:3: rule__OntologicalRootPhysics__PhysicsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootPhysics__PhysicsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootPhysicsAccess().getPhysicsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootPhysics__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootGameloop__Group__0"
    // InternalOntologicalParser.g:2388:1: rule__OntologicalRootGameloop__Group__0 : rule__OntologicalRootGameloop__Group__0__Impl rule__OntologicalRootGameloop__Group__1 ;
    public final void rule__OntologicalRootGameloop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2392:1: ( rule__OntologicalRootGameloop__Group__0__Impl rule__OntologicalRootGameloop__Group__1 )
            // InternalOntologicalParser.g:2393:2: rule__OntologicalRootGameloop__Group__0__Impl rule__OntologicalRootGameloop__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootGameloop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootGameloop__Group__1();

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
    // $ANTLR end "rule__OntologicalRootGameloop__Group__0"


    // $ANTLR start "rule__OntologicalRootGameloop__Group__0__Impl"
    // InternalOntologicalParser.g:2400:1: rule__OntologicalRootGameloop__Group__0__Impl : ( Gameloop ) ;
    public final void rule__OntologicalRootGameloop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2404:1: ( ( Gameloop ) )
            // InternalOntologicalParser.g:2405:1: ( Gameloop )
            {
            // InternalOntologicalParser.g:2405:1: ( Gameloop )
            // InternalOntologicalParser.g:2406:2: Gameloop
            {
             before(grammarAccess.getOntologicalRootGameloopAccess().getGameloopKeyword_0()); 
            match(input,Gameloop,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootGameloopAccess().getGameloopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootGameloop__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootGameloop__Group__1"
    // InternalOntologicalParser.g:2415:1: rule__OntologicalRootGameloop__Group__1 : rule__OntologicalRootGameloop__Group__1__Impl rule__OntologicalRootGameloop__Group__2 ;
    public final void rule__OntologicalRootGameloop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2419:1: ( rule__OntologicalRootGameloop__Group__1__Impl rule__OntologicalRootGameloop__Group__2 )
            // InternalOntologicalParser.g:2420:2: rule__OntologicalRootGameloop__Group__1__Impl rule__OntologicalRootGameloop__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootGameloop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootGameloop__Group__2();

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
    // $ANTLR end "rule__OntologicalRootGameloop__Group__1"


    // $ANTLR start "rule__OntologicalRootGameloop__Group__1__Impl"
    // InternalOntologicalParser.g:2427:1: rule__OntologicalRootGameloop__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootGameloop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2431:1: ( ( Colon ) )
            // InternalOntologicalParser.g:2432:1: ( Colon )
            {
            // InternalOntologicalParser.g:2432:1: ( Colon )
            // InternalOntologicalParser.g:2433:2: Colon
            {
             before(grammarAccess.getOntologicalRootGameloopAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootGameloopAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootGameloop__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootGameloop__Group__2"
    // InternalOntologicalParser.g:2442:1: rule__OntologicalRootGameloop__Group__2 : rule__OntologicalRootGameloop__Group__2__Impl ;
    public final void rule__OntologicalRootGameloop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2446:1: ( rule__OntologicalRootGameloop__Group__2__Impl )
            // InternalOntologicalParser.g:2447:2: rule__OntologicalRootGameloop__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootGameloop__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootGameloop__Group__2"


    // $ANTLR start "rule__OntologicalRootGameloop__Group__2__Impl"
    // InternalOntologicalParser.g:2453:1: rule__OntologicalRootGameloop__Group__2__Impl : ( ( rule__OntologicalRootGameloop__GameloopAssignment_2 ) ) ;
    public final void rule__OntologicalRootGameloop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2457:1: ( ( ( rule__OntologicalRootGameloop__GameloopAssignment_2 ) ) )
            // InternalOntologicalParser.g:2458:1: ( ( rule__OntologicalRootGameloop__GameloopAssignment_2 ) )
            {
            // InternalOntologicalParser.g:2458:1: ( ( rule__OntologicalRootGameloop__GameloopAssignment_2 ) )
            // InternalOntologicalParser.g:2459:2: ( rule__OntologicalRootGameloop__GameloopAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootGameloopAccess().getGameloopAssignment_2()); 
            // InternalOntologicalParser.g:2460:2: ( rule__OntologicalRootGameloop__GameloopAssignment_2 )
            // InternalOntologicalParser.g:2460:3: rule__OntologicalRootGameloop__GameloopAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootGameloop__GameloopAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootGameloopAccess().getGameloopAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootGameloop__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClasses__Group__0"
    // InternalOntologicalParser.g:2469:1: rule__OntologicalRootClasses__Group__0 : rule__OntologicalRootClasses__Group__0__Impl rule__OntologicalRootClasses__Group__1 ;
    public final void rule__OntologicalRootClasses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2473:1: ( rule__OntologicalRootClasses__Group__0__Impl rule__OntologicalRootClasses__Group__1 )
            // InternalOntologicalParser.g:2474:2: rule__OntologicalRootClasses__Group__0__Impl rule__OntologicalRootClasses__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__OntologicalRootClasses__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClasses__Group__0"


    // $ANTLR start "rule__OntologicalRootClasses__Group__0__Impl"
    // InternalOntologicalParser.g:2481:1: rule__OntologicalRootClasses__Group__0__Impl : ( () ) ;
    public final void rule__OntologicalRootClasses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2485:1: ( ( () ) )
            // InternalOntologicalParser.g:2486:1: ( () )
            {
            // InternalOntologicalParser.g:2486:1: ( () )
            // InternalOntologicalParser.g:2487:2: ()
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getOntologicalRootClassesAction_0()); 
            // InternalOntologicalParser.g:2488:2: ()
            // InternalOntologicalParser.g:2488:3: 
            {
            }

             after(grammarAccess.getOntologicalRootClassesAccess().getOntologicalRootClassesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClasses__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClasses__Group__1"
    // InternalOntologicalParser.g:2496:1: rule__OntologicalRootClasses__Group__1 : rule__OntologicalRootClasses__Group__1__Impl rule__OntologicalRootClasses__Group__2 ;
    public final void rule__OntologicalRootClasses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2500:1: ( rule__OntologicalRootClasses__Group__1__Impl rule__OntologicalRootClasses__Group__2 )
            // InternalOntologicalParser.g:2501:2: rule__OntologicalRootClasses__Group__1__Impl rule__OntologicalRootClasses__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClasses__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClasses__Group__1"


    // $ANTLR start "rule__OntologicalRootClasses__Group__1__Impl"
    // InternalOntologicalParser.g:2508:1: rule__OntologicalRootClasses__Group__1__Impl : ( Classes ) ;
    public final void rule__OntologicalRootClasses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2512:1: ( ( Classes ) )
            // InternalOntologicalParser.g:2513:1: ( Classes )
            {
            // InternalOntologicalParser.g:2513:1: ( Classes )
            // InternalOntologicalParser.g:2514:2: Classes
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getClassesKeyword_1()); 
            match(input,Classes,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesAccess().getClassesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClasses__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClasses__Group__2"
    // InternalOntologicalParser.g:2523:1: rule__OntologicalRootClasses__Group__2 : rule__OntologicalRootClasses__Group__2__Impl rule__OntologicalRootClasses__Group__3 ;
    public final void rule__OntologicalRootClasses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2527:1: ( rule__OntologicalRootClasses__Group__2__Impl rule__OntologicalRootClasses__Group__3 )
            // InternalOntologicalParser.g:2528:2: rule__OntologicalRootClasses__Group__2__Impl rule__OntologicalRootClasses__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__OntologicalRootClasses__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__Group__3();

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
    // $ANTLR end "rule__OntologicalRootClasses__Group__2"


    // $ANTLR start "rule__OntologicalRootClasses__Group__2__Impl"
    // InternalOntologicalParser.g:2535:1: rule__OntologicalRootClasses__Group__2__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClasses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2539:1: ( ( Colon ) )
            // InternalOntologicalParser.g:2540:1: ( Colon )
            {
            // InternalOntologicalParser.g:2540:1: ( Colon )
            // InternalOntologicalParser.g:2541:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClasses__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClasses__Group__3"
    // InternalOntologicalParser.g:2550:1: rule__OntologicalRootClasses__Group__3 : rule__OntologicalRootClasses__Group__3__Impl rule__OntologicalRootClasses__Group__4 ;
    public final void rule__OntologicalRootClasses__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2554:1: ( rule__OntologicalRootClasses__Group__3__Impl rule__OntologicalRootClasses__Group__4 )
            // InternalOntologicalParser.g:2555:2: rule__OntologicalRootClasses__Group__3__Impl rule__OntologicalRootClasses__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__OntologicalRootClasses__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__Group__4();

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
    // $ANTLR end "rule__OntologicalRootClasses__Group__3"


    // $ANTLR start "rule__OntologicalRootClasses__Group__3__Impl"
    // InternalOntologicalParser.g:2562:1: rule__OntologicalRootClasses__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__OntologicalRootClasses__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2566:1: ( ( LeftSquareBracket ) )
            // InternalOntologicalParser.g:2567:1: ( LeftSquareBracket )
            {
            // InternalOntologicalParser.g:2567:1: ( LeftSquareBracket )
            // InternalOntologicalParser.g:2568:2: LeftSquareBracket
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClasses__Group__3__Impl"


    // $ANTLR start "rule__OntologicalRootClasses__Group__4"
    // InternalOntologicalParser.g:2577:1: rule__OntologicalRootClasses__Group__4 : rule__OntologicalRootClasses__Group__4__Impl rule__OntologicalRootClasses__Group__5 ;
    public final void rule__OntologicalRootClasses__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2581:1: ( rule__OntologicalRootClasses__Group__4__Impl rule__OntologicalRootClasses__Group__5 )
            // InternalOntologicalParser.g:2582:2: rule__OntologicalRootClasses__Group__4__Impl rule__OntologicalRootClasses__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__OntologicalRootClasses__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__Group__5();

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
    // $ANTLR end "rule__OntologicalRootClasses__Group__4"


    // $ANTLR start "rule__OntologicalRootClasses__Group__4__Impl"
    // InternalOntologicalParser.g:2589:1: rule__OntologicalRootClasses__Group__4__Impl : ( ( rule__OntologicalRootClasses__Group_4__0 )? ) ;
    public final void rule__OntologicalRootClasses__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2593:1: ( ( ( rule__OntologicalRootClasses__Group_4__0 )? ) )
            // InternalOntologicalParser.g:2594:1: ( ( rule__OntologicalRootClasses__Group_4__0 )? )
            {
            // InternalOntologicalParser.g:2594:1: ( ( rule__OntologicalRootClasses__Group_4__0 )? )
            // InternalOntologicalParser.g:2595:2: ( rule__OntologicalRootClasses__Group_4__0 )?
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getGroup_4()); 
            // InternalOntologicalParser.g:2596:2: ( rule__OntologicalRootClasses__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LeftCurlyBracket) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntologicalParser.g:2596:3: rule__OntologicalRootClasses__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntologicalRootClasses__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntologicalRootClassesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClasses__Group__4__Impl"


    // $ANTLR start "rule__OntologicalRootClasses__Group__5"
    // InternalOntologicalParser.g:2604:1: rule__OntologicalRootClasses__Group__5 : rule__OntologicalRootClasses__Group__5__Impl ;
    public final void rule__OntologicalRootClasses__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2608:1: ( rule__OntologicalRootClasses__Group__5__Impl )
            // InternalOntologicalParser.g:2609:2: rule__OntologicalRootClasses__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__Group__5__Impl();

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
    // $ANTLR end "rule__OntologicalRootClasses__Group__5"


    // $ANTLR start "rule__OntologicalRootClasses__Group__5__Impl"
    // InternalOntologicalParser.g:2615:1: rule__OntologicalRootClasses__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__OntologicalRootClasses__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2619:1: ( ( RightSquareBracket ) )
            // InternalOntologicalParser.g:2620:1: ( RightSquareBracket )
            {
            // InternalOntologicalParser.g:2620:1: ( RightSquareBracket )
            // InternalOntologicalParser.g:2621:2: RightSquareBracket
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClasses__Group__5__Impl"


    // $ANTLR start "rule__OntologicalRootClasses__Group_4__0"
    // InternalOntologicalParser.g:2631:1: rule__OntologicalRootClasses__Group_4__0 : rule__OntologicalRootClasses__Group_4__0__Impl rule__OntologicalRootClasses__Group_4__1 ;
    public final void rule__OntologicalRootClasses__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2635:1: ( rule__OntologicalRootClasses__Group_4__0__Impl rule__OntologicalRootClasses__Group_4__1 )
            // InternalOntologicalParser.g:2636:2: rule__OntologicalRootClasses__Group_4__0__Impl rule__OntologicalRootClasses__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__OntologicalRootClasses__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__Group_4__1();

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
    // $ANTLR end "rule__OntologicalRootClasses__Group_4__0"


    // $ANTLR start "rule__OntologicalRootClasses__Group_4__0__Impl"
    // InternalOntologicalParser.g:2643:1: rule__OntologicalRootClasses__Group_4__0__Impl : ( ( rule__OntologicalRootClasses__ClassesAssignment_4_0 ) ) ;
    public final void rule__OntologicalRootClasses__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2647:1: ( ( ( rule__OntologicalRootClasses__ClassesAssignment_4_0 ) ) )
            // InternalOntologicalParser.g:2648:1: ( ( rule__OntologicalRootClasses__ClassesAssignment_4_0 ) )
            {
            // InternalOntologicalParser.g:2648:1: ( ( rule__OntologicalRootClasses__ClassesAssignment_4_0 ) )
            // InternalOntologicalParser.g:2649:2: ( rule__OntologicalRootClasses__ClassesAssignment_4_0 )
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getClassesAssignment_4_0()); 
            // InternalOntologicalParser.g:2650:2: ( rule__OntologicalRootClasses__ClassesAssignment_4_0 )
            // InternalOntologicalParser.g:2650:3: rule__OntologicalRootClasses__ClassesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__ClassesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesAccess().getClassesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClasses__Group_4__0__Impl"


    // $ANTLR start "rule__OntologicalRootClasses__Group_4__1"
    // InternalOntologicalParser.g:2658:1: rule__OntologicalRootClasses__Group_4__1 : rule__OntologicalRootClasses__Group_4__1__Impl ;
    public final void rule__OntologicalRootClasses__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2662:1: ( rule__OntologicalRootClasses__Group_4__1__Impl )
            // InternalOntologicalParser.g:2663:2: rule__OntologicalRootClasses__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__Group_4__1__Impl();

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
    // $ANTLR end "rule__OntologicalRootClasses__Group_4__1"


    // $ANTLR start "rule__OntologicalRootClasses__Group_4__1__Impl"
    // InternalOntologicalParser.g:2669:1: rule__OntologicalRootClasses__Group_4__1__Impl : ( ( rule__OntologicalRootClasses__Group_4_1__0 )* ) ;
    public final void rule__OntologicalRootClasses__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2673:1: ( ( ( rule__OntologicalRootClasses__Group_4_1__0 )* ) )
            // InternalOntologicalParser.g:2674:1: ( ( rule__OntologicalRootClasses__Group_4_1__0 )* )
            {
            // InternalOntologicalParser.g:2674:1: ( ( rule__OntologicalRootClasses__Group_4_1__0 )* )
            // InternalOntologicalParser.g:2675:2: ( rule__OntologicalRootClasses__Group_4_1__0 )*
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getGroup_4_1()); 
            // InternalOntologicalParser.g:2676:2: ( rule__OntologicalRootClasses__Group_4_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOntologicalParser.g:2676:3: rule__OntologicalRootClasses__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__OntologicalRootClasses__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getOntologicalRootClassesAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClasses__Group_4__1__Impl"


    // $ANTLR start "rule__OntologicalRootClasses__Group_4_1__0"
    // InternalOntologicalParser.g:2685:1: rule__OntologicalRootClasses__Group_4_1__0 : rule__OntologicalRootClasses__Group_4_1__0__Impl rule__OntologicalRootClasses__Group_4_1__1 ;
    public final void rule__OntologicalRootClasses__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2689:1: ( rule__OntologicalRootClasses__Group_4_1__0__Impl rule__OntologicalRootClasses__Group_4_1__1 )
            // InternalOntologicalParser.g:2690:2: rule__OntologicalRootClasses__Group_4_1__0__Impl rule__OntologicalRootClasses__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__OntologicalRootClasses__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__Group_4_1__1();

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
    // $ANTLR end "rule__OntologicalRootClasses__Group_4_1__0"


    // $ANTLR start "rule__OntologicalRootClasses__Group_4_1__0__Impl"
    // InternalOntologicalParser.g:2697:1: rule__OntologicalRootClasses__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__OntologicalRootClasses__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2701:1: ( ( Comma ) )
            // InternalOntologicalParser.g:2702:1: ( Comma )
            {
            // InternalOntologicalParser.g:2702:1: ( Comma )
            // InternalOntologicalParser.g:2703:2: Comma
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClasses__Group_4_1__0__Impl"


    // $ANTLR start "rule__OntologicalRootClasses__Group_4_1__1"
    // InternalOntologicalParser.g:2712:1: rule__OntologicalRootClasses__Group_4_1__1 : rule__OntologicalRootClasses__Group_4_1__1__Impl ;
    public final void rule__OntologicalRootClasses__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2716:1: ( rule__OntologicalRootClasses__Group_4_1__1__Impl )
            // InternalOntologicalParser.g:2717:2: rule__OntologicalRootClasses__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__OntologicalRootClasses__Group_4_1__1"


    // $ANTLR start "rule__OntologicalRootClasses__Group_4_1__1__Impl"
    // InternalOntologicalParser.g:2723:1: rule__OntologicalRootClasses__Group_4_1__1__Impl : ( ( rule__OntologicalRootClasses__ClassesAssignment_4_1_1 ) ) ;
    public final void rule__OntologicalRootClasses__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2727:1: ( ( ( rule__OntologicalRootClasses__ClassesAssignment_4_1_1 ) ) )
            // InternalOntologicalParser.g:2728:1: ( ( rule__OntologicalRootClasses__ClassesAssignment_4_1_1 ) )
            {
            // InternalOntologicalParser.g:2728:1: ( ( rule__OntologicalRootClasses__ClassesAssignment_4_1_1 ) )
            // InternalOntologicalParser.g:2729:2: ( rule__OntologicalRootClasses__ClassesAssignment_4_1_1 )
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getClassesAssignment_4_1_1()); 
            // InternalOntologicalParser.g:2730:2: ( rule__OntologicalRootClasses__ClassesAssignment_4_1_1 )
            // InternalOntologicalParser.g:2730:3: rule__OntologicalRootClasses__ClassesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClasses__ClassesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesAccess().getClassesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClasses__Group_4_1__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group__0"
    // InternalOntologicalParser.g:2739:1: rule__OntologicalRootClassesItems__Group__0 : rule__OntologicalRootClassesItems__Group__0__Impl rule__OntologicalRootClassesItems__Group__1 ;
    public final void rule__OntologicalRootClassesItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2743:1: ( rule__OntologicalRootClassesItems__Group__0__Impl rule__OntologicalRootClassesItems__Group__1 )
            // InternalOntologicalParser.g:2744:2: rule__OntologicalRootClassesItems__Group__0__Impl rule__OntologicalRootClassesItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__OntologicalRootClassesItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItems__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItems__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group__0__Impl"
    // InternalOntologicalParser.g:2751:1: rule__OntologicalRootClassesItems__Group__0__Impl : ( () ) ;
    public final void rule__OntologicalRootClassesItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2755:1: ( ( () ) )
            // InternalOntologicalParser.g:2756:1: ( () )
            {
            // InternalOntologicalParser.g:2756:1: ( () )
            // InternalOntologicalParser.g:2757:2: ()
            {
             before(grammarAccess.getOntologicalRootClassesItemsAccess().getOntologicalRootClassesItemsAction_0()); 
            // InternalOntologicalParser.g:2758:2: ()
            // InternalOntologicalParser.g:2758:3: 
            {
            }

             after(grammarAccess.getOntologicalRootClassesItemsAccess().getOntologicalRootClassesItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItems__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group__1"
    // InternalOntologicalParser.g:2766:1: rule__OntologicalRootClassesItems__Group__1 : rule__OntologicalRootClassesItems__Group__1__Impl rule__OntologicalRootClassesItems__Group__2 ;
    public final void rule__OntologicalRootClassesItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2770:1: ( rule__OntologicalRootClassesItems__Group__1__Impl rule__OntologicalRootClassesItems__Group__2 )
            // InternalOntologicalParser.g:2771:2: rule__OntologicalRootClassesItems__Group__1__Impl rule__OntologicalRootClassesItems__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__OntologicalRootClassesItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItems__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItems__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group__1__Impl"
    // InternalOntologicalParser.g:2778:1: rule__OntologicalRootClassesItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__OntologicalRootClassesItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2782:1: ( ( LeftCurlyBracket ) )
            // InternalOntologicalParser.g:2783:1: ( LeftCurlyBracket )
            {
            // InternalOntologicalParser.g:2783:1: ( LeftCurlyBracket )
            // InternalOntologicalParser.g:2784:2: LeftCurlyBracket
            {
             before(grammarAccess.getOntologicalRootClassesItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItems__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group__2"
    // InternalOntologicalParser.g:2793:1: rule__OntologicalRootClassesItems__Group__2 : rule__OntologicalRootClassesItems__Group__2__Impl rule__OntologicalRootClassesItems__Group__3 ;
    public final void rule__OntologicalRootClassesItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2797:1: ( rule__OntologicalRootClassesItems__Group__2__Impl rule__OntologicalRootClassesItems__Group__3 )
            // InternalOntologicalParser.g:2798:2: rule__OntologicalRootClassesItems__Group__2__Impl rule__OntologicalRootClassesItems__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__OntologicalRootClassesItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItems__Group__3();

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
    // $ANTLR end "rule__OntologicalRootClassesItems__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group__2__Impl"
    // InternalOntologicalParser.g:2805:1: rule__OntologicalRootClassesItems__Group__2__Impl : ( ( rule__OntologicalRootClassesItems__Group_2__0 )? ) ;
    public final void rule__OntologicalRootClassesItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2809:1: ( ( ( rule__OntologicalRootClassesItems__Group_2__0 )? ) )
            // InternalOntologicalParser.g:2810:1: ( ( rule__OntologicalRootClassesItems__Group_2__0 )? )
            {
            // InternalOntologicalParser.g:2810:1: ( ( rule__OntologicalRootClassesItems__Group_2__0 )? )
            // InternalOntologicalParser.g:2811:2: ( rule__OntologicalRootClassesItems__Group_2__0 )?
            {
             before(grammarAccess.getOntologicalRootClassesItemsAccess().getGroup_2()); 
            // InternalOntologicalParser.g:2812:2: ( rule__OntologicalRootClassesItems__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=Attributes && LA12_0<=Abstract)||LA12_0==AutoID||(LA12_0>=NoSCN && LA12_0<=Name)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntologicalParser.g:2812:3: rule__OntologicalRootClassesItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntologicalRootClassesItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntologicalRootClassesItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItems__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group__3"
    // InternalOntologicalParser.g:2820:1: rule__OntologicalRootClassesItems__Group__3 : rule__OntologicalRootClassesItems__Group__3__Impl ;
    public final void rule__OntologicalRootClassesItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2824:1: ( rule__OntologicalRootClassesItems__Group__3__Impl )
            // InternalOntologicalParser.g:2825:2: rule__OntologicalRootClassesItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItems__Group__3__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItems__Group__3"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group__3__Impl"
    // InternalOntologicalParser.g:2831:1: rule__OntologicalRootClassesItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__OntologicalRootClassesItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2835:1: ( ( RightCurlyBracket ) )
            // InternalOntologicalParser.g:2836:1: ( RightCurlyBracket )
            {
            // InternalOntologicalParser.g:2836:1: ( RightCurlyBracket )
            // InternalOntologicalParser.g:2837:2: RightCurlyBracket
            {
             before(grammarAccess.getOntologicalRootClassesItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItems__Group__3__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group_2__0"
    // InternalOntologicalParser.g:2847:1: rule__OntologicalRootClassesItems__Group_2__0 : rule__OntologicalRootClassesItems__Group_2__0__Impl rule__OntologicalRootClassesItems__Group_2__1 ;
    public final void rule__OntologicalRootClassesItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2851:1: ( rule__OntologicalRootClassesItems__Group_2__0__Impl rule__OntologicalRootClassesItems__Group_2__1 )
            // InternalOntologicalParser.g:2852:2: rule__OntologicalRootClassesItems__Group_2__0__Impl rule__OntologicalRootClassesItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__OntologicalRootClassesItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItems__Group_2__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItems__Group_2__0"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group_2__0__Impl"
    // InternalOntologicalParser.g:2859:1: rule__OntologicalRootClassesItems__Group_2__0__Impl : ( ( rule__OntologicalRootClassesItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__OntologicalRootClassesItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2863:1: ( ( ( rule__OntologicalRootClassesItems__ItemsAssignment_2_0 ) ) )
            // InternalOntologicalParser.g:2864:1: ( ( rule__OntologicalRootClassesItems__ItemsAssignment_2_0 ) )
            {
            // InternalOntologicalParser.g:2864:1: ( ( rule__OntologicalRootClassesItems__ItemsAssignment_2_0 ) )
            // InternalOntologicalParser.g:2865:2: ( rule__OntologicalRootClassesItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAccess().getItemsAssignment_2_0()); 
            // InternalOntologicalParser.g:2866:2: ( rule__OntologicalRootClassesItems__ItemsAssignment_2_0 )
            // InternalOntologicalParser.g:2866:3: rule__OntologicalRootClassesItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItems__Group_2__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group_2__1"
    // InternalOntologicalParser.g:2874:1: rule__OntologicalRootClassesItems__Group_2__1 : rule__OntologicalRootClassesItems__Group_2__1__Impl ;
    public final void rule__OntologicalRootClassesItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2878:1: ( rule__OntologicalRootClassesItems__Group_2__1__Impl )
            // InternalOntologicalParser.g:2879:2: rule__OntologicalRootClassesItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItems__Group_2__1__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItems__Group_2__1"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group_2__1__Impl"
    // InternalOntologicalParser.g:2885:1: rule__OntologicalRootClassesItems__Group_2__1__Impl : ( ( rule__OntologicalRootClassesItems__Group_2_1__0 )* ) ;
    public final void rule__OntologicalRootClassesItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2889:1: ( ( ( rule__OntologicalRootClassesItems__Group_2_1__0 )* ) )
            // InternalOntologicalParser.g:2890:1: ( ( rule__OntologicalRootClassesItems__Group_2_1__0 )* )
            {
            // InternalOntologicalParser.g:2890:1: ( ( rule__OntologicalRootClassesItems__Group_2_1__0 )* )
            // InternalOntologicalParser.g:2891:2: ( rule__OntologicalRootClassesItems__Group_2_1__0 )*
            {
             before(grammarAccess.getOntologicalRootClassesItemsAccess().getGroup_2_1()); 
            // InternalOntologicalParser.g:2892:2: ( rule__OntologicalRootClassesItems__Group_2_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Comma) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOntologicalParser.g:2892:3: rule__OntologicalRootClassesItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__OntologicalRootClassesItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOntologicalRootClassesItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItems__Group_2__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group_2_1__0"
    // InternalOntologicalParser.g:2901:1: rule__OntologicalRootClassesItems__Group_2_1__0 : rule__OntologicalRootClassesItems__Group_2_1__0__Impl rule__OntologicalRootClassesItems__Group_2_1__1 ;
    public final void rule__OntologicalRootClassesItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2905:1: ( rule__OntologicalRootClassesItems__Group_2_1__0__Impl rule__OntologicalRootClassesItems__Group_2_1__1 )
            // InternalOntologicalParser.g:2906:2: rule__OntologicalRootClassesItems__Group_2_1__0__Impl rule__OntologicalRootClassesItems__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__OntologicalRootClassesItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItems__Group_2_1__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItems__Group_2_1__0"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group_2_1__0__Impl"
    // InternalOntologicalParser.g:2913:1: rule__OntologicalRootClassesItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__OntologicalRootClassesItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2917:1: ( ( Comma ) )
            // InternalOntologicalParser.g:2918:1: ( Comma )
            {
            // InternalOntologicalParser.g:2918:1: ( Comma )
            // InternalOntologicalParser.g:2919:2: Comma
            {
             before(grammarAccess.getOntologicalRootClassesItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group_2_1__1"
    // InternalOntologicalParser.g:2928:1: rule__OntologicalRootClassesItems__Group_2_1__1 : rule__OntologicalRootClassesItems__Group_2_1__1__Impl ;
    public final void rule__OntologicalRootClassesItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2932:1: ( rule__OntologicalRootClassesItems__Group_2_1__1__Impl )
            // InternalOntologicalParser.g:2933:2: rule__OntologicalRootClassesItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItems__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItems__Group_2_1__1"


    // $ANTLR start "rule__OntologicalRootClassesItems__Group_2_1__1__Impl"
    // InternalOntologicalParser.g:2939:1: rule__OntologicalRootClassesItems__Group_2_1__1__Impl : ( ( rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__OntologicalRootClassesItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2943:1: ( ( ( rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1 ) ) )
            // InternalOntologicalParser.g:2944:1: ( ( rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalOntologicalParser.g:2944:1: ( ( rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1 ) )
            // InternalOntologicalParser.g:2945:2: ( rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalOntologicalParser.g:2946:2: ( rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1 )
            // InternalOntologicalParser.g:2946:3: rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsName__Group__0"
    // InternalOntologicalParser.g:2955:1: rule__OntologicalRootClassesItemsName__Group__0 : rule__OntologicalRootClassesItemsName__Group__0__Impl rule__OntologicalRootClassesItemsName__Group__1 ;
    public final void rule__OntologicalRootClassesItemsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2959:1: ( rule__OntologicalRootClassesItemsName__Group__0__Impl rule__OntologicalRootClassesItemsName__Group__1 )
            // InternalOntologicalParser.g:2960:2: rule__OntologicalRootClassesItemsName__Group__0__Impl rule__OntologicalRootClassesItemsName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__OntologicalRootClassesItemsName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsName__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsName__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsName__Group__0__Impl"
    // InternalOntologicalParser.g:2967:1: rule__OntologicalRootClassesItemsName__Group__0__Impl : ( () ) ;
    public final void rule__OntologicalRootClassesItemsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2971:1: ( ( () ) )
            // InternalOntologicalParser.g:2972:1: ( () )
            {
            // InternalOntologicalParser.g:2972:1: ( () )
            // InternalOntologicalParser.g:2973:2: ()
            {
             before(grammarAccess.getOntologicalRootClassesItemsNameAccess().getOntologicalRootClassesItemsNameAction_0()); 
            // InternalOntologicalParser.g:2974:2: ()
            // InternalOntologicalParser.g:2974:3: 
            {
            }

             after(grammarAccess.getOntologicalRootClassesItemsNameAccess().getOntologicalRootClassesItemsNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsName__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsName__Group__1"
    // InternalOntologicalParser.g:2982:1: rule__OntologicalRootClassesItemsName__Group__1 : rule__OntologicalRootClassesItemsName__Group__1__Impl rule__OntologicalRootClassesItemsName__Group__2 ;
    public final void rule__OntologicalRootClassesItemsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2986:1: ( rule__OntologicalRootClassesItemsName__Group__1__Impl rule__OntologicalRootClassesItemsName__Group__2 )
            // InternalOntologicalParser.g:2987:2: rule__OntologicalRootClassesItemsName__Group__1__Impl rule__OntologicalRootClassesItemsName__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsName__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsName__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsName__Group__1__Impl"
    // InternalOntologicalParser.g:2994:1: rule__OntologicalRootClassesItemsName__Group__1__Impl : ( Name ) ;
    public final void rule__OntologicalRootClassesItemsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:2998:1: ( ( Name ) )
            // InternalOntologicalParser.g:2999:1: ( Name )
            {
            // InternalOntologicalParser.g:2999:1: ( Name )
            // InternalOntologicalParser.g:3000:2: Name
            {
             before(grammarAccess.getOntologicalRootClassesItemsNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsName__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsName__Group__2"
    // InternalOntologicalParser.g:3009:1: rule__OntologicalRootClassesItemsName__Group__2 : rule__OntologicalRootClassesItemsName__Group__2__Impl rule__OntologicalRootClassesItemsName__Group__3 ;
    public final void rule__OntologicalRootClassesItemsName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3013:1: ( rule__OntologicalRootClassesItemsName__Group__2__Impl rule__OntologicalRootClassesItemsName__Group__3 )
            // InternalOntologicalParser.g:3014:2: rule__OntologicalRootClassesItemsName__Group__2__Impl rule__OntologicalRootClassesItemsName__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsName__Group__3();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsName__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsName__Group__2__Impl"
    // InternalOntologicalParser.g:3021:1: rule__OntologicalRootClassesItemsName__Group__2__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3025:1: ( ( Colon ) )
            // InternalOntologicalParser.g:3026:1: ( Colon )
            {
            // InternalOntologicalParser.g:3026:1: ( Colon )
            // InternalOntologicalParser.g:3027:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsName__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsName__Group__3"
    // InternalOntologicalParser.g:3036:1: rule__OntologicalRootClassesItemsName__Group__3 : rule__OntologicalRootClassesItemsName__Group__3__Impl ;
    public final void rule__OntologicalRootClassesItemsName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3040:1: ( rule__OntologicalRootClassesItemsName__Group__3__Impl )
            // InternalOntologicalParser.g:3041:2: rule__OntologicalRootClassesItemsName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsName__Group__3__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsName__Group__3"


    // $ANTLR start "rule__OntologicalRootClassesItemsName__Group__3__Impl"
    // InternalOntologicalParser.g:3047:1: rule__OntologicalRootClassesItemsName__Group__3__Impl : ( ( rule__OntologicalRootClassesItemsName__NameAssignment_3 ) ) ;
    public final void rule__OntologicalRootClassesItemsName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3051:1: ( ( ( rule__OntologicalRootClassesItemsName__NameAssignment_3 ) ) )
            // InternalOntologicalParser.g:3052:1: ( ( rule__OntologicalRootClassesItemsName__NameAssignment_3 ) )
            {
            // InternalOntologicalParser.g:3052:1: ( ( rule__OntologicalRootClassesItemsName__NameAssignment_3 ) )
            // InternalOntologicalParser.g:3053:2: ( rule__OntologicalRootClassesItemsName__NameAssignment_3 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsNameAccess().getNameAssignment_3()); 
            // InternalOntologicalParser.g:3054:2: ( rule__OntologicalRootClassesItemsName__NameAssignment_3 )
            // InternalOntologicalParser.g:3054:3: rule__OntologicalRootClassesItemsName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsName__Group__3__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAbstract__Group__0"
    // InternalOntologicalParser.g:3063:1: rule__OntologicalRootClassesItemsAbstract__Group__0 : rule__OntologicalRootClassesItemsAbstract__Group__0__Impl rule__OntologicalRootClassesItemsAbstract__Group__1 ;
    public final void rule__OntologicalRootClassesItemsAbstract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3067:1: ( rule__OntologicalRootClassesItemsAbstract__Group__0__Impl rule__OntologicalRootClassesItemsAbstract__Group__1 )
            // InternalOntologicalParser.g:3068:2: rule__OntologicalRootClassesItemsAbstract__Group__0__Impl rule__OntologicalRootClassesItemsAbstract__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsAbstract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAbstract__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAbstract__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAbstract__Group__0__Impl"
    // InternalOntologicalParser.g:3075:1: rule__OntologicalRootClassesItemsAbstract__Group__0__Impl : ( Abstract ) ;
    public final void rule__OntologicalRootClassesItemsAbstract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3079:1: ( ( Abstract ) )
            // InternalOntologicalParser.g:3080:1: ( Abstract )
            {
            // InternalOntologicalParser.g:3080:1: ( Abstract )
            // InternalOntologicalParser.g:3081:2: Abstract
            {
             before(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getAbstractKeyword_0()); 
            match(input,Abstract,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getAbstractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAbstract__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAbstract__Group__1"
    // InternalOntologicalParser.g:3090:1: rule__OntologicalRootClassesItemsAbstract__Group__1 : rule__OntologicalRootClassesItemsAbstract__Group__1__Impl rule__OntologicalRootClassesItemsAbstract__Group__2 ;
    public final void rule__OntologicalRootClassesItemsAbstract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3094:1: ( rule__OntologicalRootClassesItemsAbstract__Group__1__Impl rule__OntologicalRootClassesItemsAbstract__Group__2 )
            // InternalOntologicalParser.g:3095:2: rule__OntologicalRootClassesItemsAbstract__Group__1__Impl rule__OntologicalRootClassesItemsAbstract__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsAbstract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAbstract__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAbstract__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAbstract__Group__1__Impl"
    // InternalOntologicalParser.g:3102:1: rule__OntologicalRootClassesItemsAbstract__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsAbstract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3106:1: ( ( Colon ) )
            // InternalOntologicalParser.g:3107:1: ( Colon )
            {
            // InternalOntologicalParser.g:3107:1: ( Colon )
            // InternalOntologicalParser.g:3108:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAbstract__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAbstract__Group__2"
    // InternalOntologicalParser.g:3117:1: rule__OntologicalRootClassesItemsAbstract__Group__2 : rule__OntologicalRootClassesItemsAbstract__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsAbstract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3121:1: ( rule__OntologicalRootClassesItemsAbstract__Group__2__Impl )
            // InternalOntologicalParser.g:3122:2: rule__OntologicalRootClassesItemsAbstract__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAbstract__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAbstract__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAbstract__Group__2__Impl"
    // InternalOntologicalParser.g:3128:1: rule__OntologicalRootClassesItemsAbstract__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsAbstract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3132:1: ( ( ( rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2 ) ) )
            // InternalOntologicalParser.g:3133:1: ( ( rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2 ) )
            {
            // InternalOntologicalParser.g:3133:1: ( ( rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2 ) )
            // InternalOntologicalParser.g:3134:2: ( rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getAbstractAssignment_2()); 
            // InternalOntologicalParser.g:3135:2: ( rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2 )
            // InternalOntologicalParser.g:3135:3: rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getAbstractAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAbstract__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group__0"
    // InternalOntologicalParser.g:3144:1: rule__OntologicalRootClassesItemsAttributes__Group__0 : rule__OntologicalRootClassesItemsAttributes__Group__0__Impl rule__OntologicalRootClassesItemsAttributes__Group__1 ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3148:1: ( rule__OntologicalRootClassesItemsAttributes__Group__0__Impl rule__OntologicalRootClassesItemsAttributes__Group__1 )
            // InternalOntologicalParser.g:3149:2: rule__OntologicalRootClassesItemsAttributes__Group__0__Impl rule__OntologicalRootClassesItemsAttributes__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__OntologicalRootClassesItemsAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group__0__Impl"
    // InternalOntologicalParser.g:3156:1: rule__OntologicalRootClassesItemsAttributes__Group__0__Impl : ( () ) ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3160:1: ( ( () ) )
            // InternalOntologicalParser.g:3161:1: ( () )
            {
            // InternalOntologicalParser.g:3161:1: ( () )
            // InternalOntologicalParser.g:3162:2: ()
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getOntologicalRootClassesItemsAttributesAction_0()); 
            // InternalOntologicalParser.g:3163:2: ()
            // InternalOntologicalParser.g:3163:3: 
            {
            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getOntologicalRootClassesItemsAttributesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group__1"
    // InternalOntologicalParser.g:3171:1: rule__OntologicalRootClassesItemsAttributes__Group__1 : rule__OntologicalRootClassesItemsAttributes__Group__1__Impl rule__OntologicalRootClassesItemsAttributes__Group__2 ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3175:1: ( rule__OntologicalRootClassesItemsAttributes__Group__1__Impl rule__OntologicalRootClassesItemsAttributes__Group__2 )
            // InternalOntologicalParser.g:3176:2: rule__OntologicalRootClassesItemsAttributes__Group__1__Impl rule__OntologicalRootClassesItemsAttributes__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group__1__Impl"
    // InternalOntologicalParser.g:3183:1: rule__OntologicalRootClassesItemsAttributes__Group__1__Impl : ( Attributes ) ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3187:1: ( ( Attributes ) )
            // InternalOntologicalParser.g:3188:1: ( Attributes )
            {
            // InternalOntologicalParser.g:3188:1: ( Attributes )
            // InternalOntologicalParser.g:3189:2: Attributes
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesKeyword_1()); 
            match(input,Attributes,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group__2"
    // InternalOntologicalParser.g:3198:1: rule__OntologicalRootClassesItemsAttributes__Group__2 : rule__OntologicalRootClassesItemsAttributes__Group__2__Impl rule__OntologicalRootClassesItemsAttributes__Group__3 ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3202:1: ( rule__OntologicalRootClassesItemsAttributes__Group__2__Impl rule__OntologicalRootClassesItemsAttributes__Group__3 )
            // InternalOntologicalParser.g:3203:2: rule__OntologicalRootClassesItemsAttributes__Group__2__Impl rule__OntologicalRootClassesItemsAttributes__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__OntologicalRootClassesItemsAttributes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__Group__3();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group__2__Impl"
    // InternalOntologicalParser.g:3210:1: rule__OntologicalRootClassesItemsAttributes__Group__2__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3214:1: ( ( Colon ) )
            // InternalOntologicalParser.g:3215:1: ( Colon )
            {
            // InternalOntologicalParser.g:3215:1: ( Colon )
            // InternalOntologicalParser.g:3216:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group__3"
    // InternalOntologicalParser.g:3225:1: rule__OntologicalRootClassesItemsAttributes__Group__3 : rule__OntologicalRootClassesItemsAttributes__Group__3__Impl rule__OntologicalRootClassesItemsAttributes__Group__4 ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3229:1: ( rule__OntologicalRootClassesItemsAttributes__Group__3__Impl rule__OntologicalRootClassesItemsAttributes__Group__4 )
            // InternalOntologicalParser.g:3230:2: rule__OntologicalRootClassesItemsAttributes__Group__3__Impl rule__OntologicalRootClassesItemsAttributes__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__OntologicalRootClassesItemsAttributes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__Group__4();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group__3"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group__3__Impl"
    // InternalOntologicalParser.g:3237:1: rule__OntologicalRootClassesItemsAttributes__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3241:1: ( ( LeftSquareBracket ) )
            // InternalOntologicalParser.g:3242:1: ( LeftSquareBracket )
            {
            // InternalOntologicalParser.g:3242:1: ( LeftSquareBracket )
            // InternalOntologicalParser.g:3243:2: LeftSquareBracket
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group__3__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group__4"
    // InternalOntologicalParser.g:3252:1: rule__OntologicalRootClassesItemsAttributes__Group__4 : rule__OntologicalRootClassesItemsAttributes__Group__4__Impl rule__OntologicalRootClassesItemsAttributes__Group__5 ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3256:1: ( rule__OntologicalRootClassesItemsAttributes__Group__4__Impl rule__OntologicalRootClassesItemsAttributes__Group__5 )
            // InternalOntologicalParser.g:3257:2: rule__OntologicalRootClassesItemsAttributes__Group__4__Impl rule__OntologicalRootClassesItemsAttributes__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__OntologicalRootClassesItemsAttributes__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__Group__5();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group__4"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group__4__Impl"
    // InternalOntologicalParser.g:3264:1: rule__OntologicalRootClassesItemsAttributes__Group__4__Impl : ( ( rule__OntologicalRootClassesItemsAttributes__Group_4__0 )? ) ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3268:1: ( ( ( rule__OntologicalRootClassesItemsAttributes__Group_4__0 )? ) )
            // InternalOntologicalParser.g:3269:1: ( ( rule__OntologicalRootClassesItemsAttributes__Group_4__0 )? )
            {
            // InternalOntologicalParser.g:3269:1: ( ( rule__OntologicalRootClassesItemsAttributes__Group_4__0 )? )
            // InternalOntologicalParser.g:3270:2: ( rule__OntologicalRootClassesItemsAttributes__Group_4__0 )?
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getGroup_4()); 
            // InternalOntologicalParser.g:3271:2: ( rule__OntologicalRootClassesItemsAttributes__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LeftCurlyBracket) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntologicalParser.g:3271:3: rule__OntologicalRootClassesItemsAttributes__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntologicalRootClassesItemsAttributes__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group__4__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group__5"
    // InternalOntologicalParser.g:3279:1: rule__OntologicalRootClassesItemsAttributes__Group__5 : rule__OntologicalRootClassesItemsAttributes__Group__5__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3283:1: ( rule__OntologicalRootClassesItemsAttributes__Group__5__Impl )
            // InternalOntologicalParser.g:3284:2: rule__OntologicalRootClassesItemsAttributes__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__Group__5__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group__5"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group__5__Impl"
    // InternalOntologicalParser.g:3290:1: rule__OntologicalRootClassesItemsAttributes__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3294:1: ( ( RightSquareBracket ) )
            // InternalOntologicalParser.g:3295:1: ( RightSquareBracket )
            {
            // InternalOntologicalParser.g:3295:1: ( RightSquareBracket )
            // InternalOntologicalParser.g:3296:2: RightSquareBracket
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group__5__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group_4__0"
    // InternalOntologicalParser.g:3306:1: rule__OntologicalRootClassesItemsAttributes__Group_4__0 : rule__OntologicalRootClassesItemsAttributes__Group_4__0__Impl rule__OntologicalRootClassesItemsAttributes__Group_4__1 ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3310:1: ( rule__OntologicalRootClassesItemsAttributes__Group_4__0__Impl rule__OntologicalRootClassesItemsAttributes__Group_4__1 )
            // InternalOntologicalParser.g:3311:2: rule__OntologicalRootClassesItemsAttributes__Group_4__0__Impl rule__OntologicalRootClassesItemsAttributes__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__OntologicalRootClassesItemsAttributes__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__Group_4__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group_4__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group_4__0__Impl"
    // InternalOntologicalParser.g:3318:1: rule__OntologicalRootClassesItemsAttributes__Group_4__0__Impl : ( ( rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0 ) ) ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3322:1: ( ( ( rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0 ) ) )
            // InternalOntologicalParser.g:3323:1: ( ( rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0 ) )
            {
            // InternalOntologicalParser.g:3323:1: ( ( rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0 ) )
            // InternalOntologicalParser.g:3324:2: ( rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesAssignment_4_0()); 
            // InternalOntologicalParser.g:3325:2: ( rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0 )
            // InternalOntologicalParser.g:3325:3: rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group_4__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group_4__1"
    // InternalOntologicalParser.g:3333:1: rule__OntologicalRootClassesItemsAttributes__Group_4__1 : rule__OntologicalRootClassesItemsAttributes__Group_4__1__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3337:1: ( rule__OntologicalRootClassesItemsAttributes__Group_4__1__Impl )
            // InternalOntologicalParser.g:3338:2: rule__OntologicalRootClassesItemsAttributes__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__Group_4__1__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group_4__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group_4__1__Impl"
    // InternalOntologicalParser.g:3344:1: rule__OntologicalRootClassesItemsAttributes__Group_4__1__Impl : ( ( rule__OntologicalRootClassesItemsAttributes__Group_4_1__0 )* ) ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3348:1: ( ( ( rule__OntologicalRootClassesItemsAttributes__Group_4_1__0 )* ) )
            // InternalOntologicalParser.g:3349:1: ( ( rule__OntologicalRootClassesItemsAttributes__Group_4_1__0 )* )
            {
            // InternalOntologicalParser.g:3349:1: ( ( rule__OntologicalRootClassesItemsAttributes__Group_4_1__0 )* )
            // InternalOntologicalParser.g:3350:2: ( rule__OntologicalRootClassesItemsAttributes__Group_4_1__0 )*
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getGroup_4_1()); 
            // InternalOntologicalParser.g:3351:2: ( rule__OntologicalRootClassesItemsAttributes__Group_4_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOntologicalParser.g:3351:3: rule__OntologicalRootClassesItemsAttributes__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__OntologicalRootClassesItemsAttributes__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group_4__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group_4_1__0"
    // InternalOntologicalParser.g:3360:1: rule__OntologicalRootClassesItemsAttributes__Group_4_1__0 : rule__OntologicalRootClassesItemsAttributes__Group_4_1__0__Impl rule__OntologicalRootClassesItemsAttributes__Group_4_1__1 ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3364:1: ( rule__OntologicalRootClassesItemsAttributes__Group_4_1__0__Impl rule__OntologicalRootClassesItemsAttributes__Group_4_1__1 )
            // InternalOntologicalParser.g:3365:2: rule__OntologicalRootClassesItemsAttributes__Group_4_1__0__Impl rule__OntologicalRootClassesItemsAttributes__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__OntologicalRootClassesItemsAttributes__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__Group_4_1__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group_4_1__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group_4_1__0__Impl"
    // InternalOntologicalParser.g:3372:1: rule__OntologicalRootClassesItemsAttributes__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3376:1: ( ( Comma ) )
            // InternalOntologicalParser.g:3377:1: ( Comma )
            {
            // InternalOntologicalParser.g:3377:1: ( Comma )
            // InternalOntologicalParser.g:3378:2: Comma
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group_4_1__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group_4_1__1"
    // InternalOntologicalParser.g:3387:1: rule__OntologicalRootClassesItemsAttributes__Group_4_1__1 : rule__OntologicalRootClassesItemsAttributes__Group_4_1__1__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3391:1: ( rule__OntologicalRootClassesItemsAttributes__Group_4_1__1__Impl )
            // InternalOntologicalParser.g:3392:2: rule__OntologicalRootClassesItemsAttributes__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group_4_1__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__Group_4_1__1__Impl"
    // InternalOntologicalParser.g:3398:1: rule__OntologicalRootClassesItemsAttributes__Group_4_1__1__Impl : ( ( rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1 ) ) ;
    public final void rule__OntologicalRootClassesItemsAttributes__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3402:1: ( ( ( rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1 ) ) )
            // InternalOntologicalParser.g:3403:1: ( ( rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1 ) )
            {
            // InternalOntologicalParser.g:3403:1: ( ( rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1 ) )
            // InternalOntologicalParser.g:3404:2: ( rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesAssignment_4_1_1()); 
            // InternalOntologicalParser.g:3405:2: ( rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1 )
            // InternalOntologicalParser.g:3405:3: rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__Group_4_1__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group__0"
    // InternalOntologicalParser.g:3414:1: rule__OntologicalRootClassesItemsReferences__Group__0 : rule__OntologicalRootClassesItemsReferences__Group__0__Impl rule__OntologicalRootClassesItemsReferences__Group__1 ;
    public final void rule__OntologicalRootClassesItemsReferences__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3418:1: ( rule__OntologicalRootClassesItemsReferences__Group__0__Impl rule__OntologicalRootClassesItemsReferences__Group__1 )
            // InternalOntologicalParser.g:3419:2: rule__OntologicalRootClassesItemsReferences__Group__0__Impl rule__OntologicalRootClassesItemsReferences__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__OntologicalRootClassesItemsReferences__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group__0__Impl"
    // InternalOntologicalParser.g:3426:1: rule__OntologicalRootClassesItemsReferences__Group__0__Impl : ( () ) ;
    public final void rule__OntologicalRootClassesItemsReferences__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3430:1: ( ( () ) )
            // InternalOntologicalParser.g:3431:1: ( () )
            {
            // InternalOntologicalParser.g:3431:1: ( () )
            // InternalOntologicalParser.g:3432:2: ()
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getOntologicalRootClassesItemsReferencesAction_0()); 
            // InternalOntologicalParser.g:3433:2: ()
            // InternalOntologicalParser.g:3433:3: 
            {
            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getOntologicalRootClassesItemsReferencesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group__1"
    // InternalOntologicalParser.g:3441:1: rule__OntologicalRootClassesItemsReferences__Group__1 : rule__OntologicalRootClassesItemsReferences__Group__1__Impl rule__OntologicalRootClassesItemsReferences__Group__2 ;
    public final void rule__OntologicalRootClassesItemsReferences__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3445:1: ( rule__OntologicalRootClassesItemsReferences__Group__1__Impl rule__OntologicalRootClassesItemsReferences__Group__2 )
            // InternalOntologicalParser.g:3446:2: rule__OntologicalRootClassesItemsReferences__Group__1__Impl rule__OntologicalRootClassesItemsReferences__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsReferences__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group__1__Impl"
    // InternalOntologicalParser.g:3453:1: rule__OntologicalRootClassesItemsReferences__Group__1__Impl : ( References ) ;
    public final void rule__OntologicalRootClassesItemsReferences__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3457:1: ( ( References ) )
            // InternalOntologicalParser.g:3458:1: ( References )
            {
            // InternalOntologicalParser.g:3458:1: ( References )
            // InternalOntologicalParser.g:3459:2: References
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesKeyword_1()); 
            match(input,References,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group__2"
    // InternalOntologicalParser.g:3468:1: rule__OntologicalRootClassesItemsReferences__Group__2 : rule__OntologicalRootClassesItemsReferences__Group__2__Impl rule__OntologicalRootClassesItemsReferences__Group__3 ;
    public final void rule__OntologicalRootClassesItemsReferences__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3472:1: ( rule__OntologicalRootClassesItemsReferences__Group__2__Impl rule__OntologicalRootClassesItemsReferences__Group__3 )
            // InternalOntologicalParser.g:3473:2: rule__OntologicalRootClassesItemsReferences__Group__2__Impl rule__OntologicalRootClassesItemsReferences__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__OntologicalRootClassesItemsReferences__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__Group__3();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group__2__Impl"
    // InternalOntologicalParser.g:3480:1: rule__OntologicalRootClassesItemsReferences__Group__2__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsReferences__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3484:1: ( ( Colon ) )
            // InternalOntologicalParser.g:3485:1: ( Colon )
            {
            // InternalOntologicalParser.g:3485:1: ( Colon )
            // InternalOntologicalParser.g:3486:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group__3"
    // InternalOntologicalParser.g:3495:1: rule__OntologicalRootClassesItemsReferences__Group__3 : rule__OntologicalRootClassesItemsReferences__Group__3__Impl rule__OntologicalRootClassesItemsReferences__Group__4 ;
    public final void rule__OntologicalRootClassesItemsReferences__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3499:1: ( rule__OntologicalRootClassesItemsReferences__Group__3__Impl rule__OntologicalRootClassesItemsReferences__Group__4 )
            // InternalOntologicalParser.g:3500:2: rule__OntologicalRootClassesItemsReferences__Group__3__Impl rule__OntologicalRootClassesItemsReferences__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__OntologicalRootClassesItemsReferences__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__Group__4();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group__3"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group__3__Impl"
    // InternalOntologicalParser.g:3507:1: rule__OntologicalRootClassesItemsReferences__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__OntologicalRootClassesItemsReferences__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3511:1: ( ( LeftSquareBracket ) )
            // InternalOntologicalParser.g:3512:1: ( LeftSquareBracket )
            {
            // InternalOntologicalParser.g:3512:1: ( LeftSquareBracket )
            // InternalOntologicalParser.g:3513:2: LeftSquareBracket
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group__3__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group__4"
    // InternalOntologicalParser.g:3522:1: rule__OntologicalRootClassesItemsReferences__Group__4 : rule__OntologicalRootClassesItemsReferences__Group__4__Impl rule__OntologicalRootClassesItemsReferences__Group__5 ;
    public final void rule__OntologicalRootClassesItemsReferences__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3526:1: ( rule__OntologicalRootClassesItemsReferences__Group__4__Impl rule__OntologicalRootClassesItemsReferences__Group__5 )
            // InternalOntologicalParser.g:3527:2: rule__OntologicalRootClassesItemsReferences__Group__4__Impl rule__OntologicalRootClassesItemsReferences__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__OntologicalRootClassesItemsReferences__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__Group__5();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group__4"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group__4__Impl"
    // InternalOntologicalParser.g:3534:1: rule__OntologicalRootClassesItemsReferences__Group__4__Impl : ( ( rule__OntologicalRootClassesItemsReferences__Group_4__0 )? ) ;
    public final void rule__OntologicalRootClassesItemsReferences__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3538:1: ( ( ( rule__OntologicalRootClassesItemsReferences__Group_4__0 )? ) )
            // InternalOntologicalParser.g:3539:1: ( ( rule__OntologicalRootClassesItemsReferences__Group_4__0 )? )
            {
            // InternalOntologicalParser.g:3539:1: ( ( rule__OntologicalRootClassesItemsReferences__Group_4__0 )? )
            // InternalOntologicalParser.g:3540:2: ( rule__OntologicalRootClassesItemsReferences__Group_4__0 )?
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getGroup_4()); 
            // InternalOntologicalParser.g:3541:2: ( rule__OntologicalRootClassesItemsReferences__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LeftCurlyBracket) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntologicalParser.g:3541:3: rule__OntologicalRootClassesItemsReferences__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntologicalRootClassesItemsReferences__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group__4__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group__5"
    // InternalOntologicalParser.g:3549:1: rule__OntologicalRootClassesItemsReferences__Group__5 : rule__OntologicalRootClassesItemsReferences__Group__5__Impl ;
    public final void rule__OntologicalRootClassesItemsReferences__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3553:1: ( rule__OntologicalRootClassesItemsReferences__Group__5__Impl )
            // InternalOntologicalParser.g:3554:2: rule__OntologicalRootClassesItemsReferences__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__Group__5__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group__5"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group__5__Impl"
    // InternalOntologicalParser.g:3560:1: rule__OntologicalRootClassesItemsReferences__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__OntologicalRootClassesItemsReferences__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3564:1: ( ( RightSquareBracket ) )
            // InternalOntologicalParser.g:3565:1: ( RightSquareBracket )
            {
            // InternalOntologicalParser.g:3565:1: ( RightSquareBracket )
            // InternalOntologicalParser.g:3566:2: RightSquareBracket
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group__5__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group_4__0"
    // InternalOntologicalParser.g:3576:1: rule__OntologicalRootClassesItemsReferences__Group_4__0 : rule__OntologicalRootClassesItemsReferences__Group_4__0__Impl rule__OntologicalRootClassesItemsReferences__Group_4__1 ;
    public final void rule__OntologicalRootClassesItemsReferences__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3580:1: ( rule__OntologicalRootClassesItemsReferences__Group_4__0__Impl rule__OntologicalRootClassesItemsReferences__Group_4__1 )
            // InternalOntologicalParser.g:3581:2: rule__OntologicalRootClassesItemsReferences__Group_4__0__Impl rule__OntologicalRootClassesItemsReferences__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__OntologicalRootClassesItemsReferences__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__Group_4__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group_4__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group_4__0__Impl"
    // InternalOntologicalParser.g:3588:1: rule__OntologicalRootClassesItemsReferences__Group_4__0__Impl : ( ( rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0 ) ) ;
    public final void rule__OntologicalRootClassesItemsReferences__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3592:1: ( ( ( rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0 ) ) )
            // InternalOntologicalParser.g:3593:1: ( ( rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0 ) )
            {
            // InternalOntologicalParser.g:3593:1: ( ( rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0 ) )
            // InternalOntologicalParser.g:3594:2: ( rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesAssignment_4_0()); 
            // InternalOntologicalParser.g:3595:2: ( rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0 )
            // InternalOntologicalParser.g:3595:3: rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group_4__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group_4__1"
    // InternalOntologicalParser.g:3603:1: rule__OntologicalRootClassesItemsReferences__Group_4__1 : rule__OntologicalRootClassesItemsReferences__Group_4__1__Impl ;
    public final void rule__OntologicalRootClassesItemsReferences__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3607:1: ( rule__OntologicalRootClassesItemsReferences__Group_4__1__Impl )
            // InternalOntologicalParser.g:3608:2: rule__OntologicalRootClassesItemsReferences__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__Group_4__1__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group_4__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group_4__1__Impl"
    // InternalOntologicalParser.g:3614:1: rule__OntologicalRootClassesItemsReferences__Group_4__1__Impl : ( ( rule__OntologicalRootClassesItemsReferences__Group_4_1__0 )* ) ;
    public final void rule__OntologicalRootClassesItemsReferences__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3618:1: ( ( ( rule__OntologicalRootClassesItemsReferences__Group_4_1__0 )* ) )
            // InternalOntologicalParser.g:3619:1: ( ( rule__OntologicalRootClassesItemsReferences__Group_4_1__0 )* )
            {
            // InternalOntologicalParser.g:3619:1: ( ( rule__OntologicalRootClassesItemsReferences__Group_4_1__0 )* )
            // InternalOntologicalParser.g:3620:2: ( rule__OntologicalRootClassesItemsReferences__Group_4_1__0 )*
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getGroup_4_1()); 
            // InternalOntologicalParser.g:3621:2: ( rule__OntologicalRootClassesItemsReferences__Group_4_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOntologicalParser.g:3621:3: rule__OntologicalRootClassesItemsReferences__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__OntologicalRootClassesItemsReferences__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group_4__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group_4_1__0"
    // InternalOntologicalParser.g:3630:1: rule__OntologicalRootClassesItemsReferences__Group_4_1__0 : rule__OntologicalRootClassesItemsReferences__Group_4_1__0__Impl rule__OntologicalRootClassesItemsReferences__Group_4_1__1 ;
    public final void rule__OntologicalRootClassesItemsReferences__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3634:1: ( rule__OntologicalRootClassesItemsReferences__Group_4_1__0__Impl rule__OntologicalRootClassesItemsReferences__Group_4_1__1 )
            // InternalOntologicalParser.g:3635:2: rule__OntologicalRootClassesItemsReferences__Group_4_1__0__Impl rule__OntologicalRootClassesItemsReferences__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__OntologicalRootClassesItemsReferences__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__Group_4_1__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group_4_1__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group_4_1__0__Impl"
    // InternalOntologicalParser.g:3642:1: rule__OntologicalRootClassesItemsReferences__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__OntologicalRootClassesItemsReferences__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3646:1: ( ( Comma ) )
            // InternalOntologicalParser.g:3647:1: ( Comma )
            {
            // InternalOntologicalParser.g:3647:1: ( Comma )
            // InternalOntologicalParser.g:3648:2: Comma
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group_4_1__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group_4_1__1"
    // InternalOntologicalParser.g:3657:1: rule__OntologicalRootClassesItemsReferences__Group_4_1__1 : rule__OntologicalRootClassesItemsReferences__Group_4_1__1__Impl ;
    public final void rule__OntologicalRootClassesItemsReferences__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3661:1: ( rule__OntologicalRootClassesItemsReferences__Group_4_1__1__Impl )
            // InternalOntologicalParser.g:3662:2: rule__OntologicalRootClassesItemsReferences__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group_4_1__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__Group_4_1__1__Impl"
    // InternalOntologicalParser.g:3668:1: rule__OntologicalRootClassesItemsReferences__Group_4_1__1__Impl : ( ( rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1 ) ) ;
    public final void rule__OntologicalRootClassesItemsReferences__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3672:1: ( ( ( rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1 ) ) )
            // InternalOntologicalParser.g:3673:1: ( ( rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1 ) )
            {
            // InternalOntologicalParser.g:3673:1: ( ( rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1 ) )
            // InternalOntologicalParser.g:3674:2: ( rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesAssignment_4_1_1()); 
            // InternalOntologicalParser.g:3675:2: ( rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1 )
            // InternalOntologicalParser.g:3675:3: rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__Group_4_1__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAutoID__Group__0"
    // InternalOntologicalParser.g:3684:1: rule__OntologicalRootClassesItemsAutoID__Group__0 : rule__OntologicalRootClassesItemsAutoID__Group__0__Impl rule__OntologicalRootClassesItemsAutoID__Group__1 ;
    public final void rule__OntologicalRootClassesItemsAutoID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3688:1: ( rule__OntologicalRootClassesItemsAutoID__Group__0__Impl rule__OntologicalRootClassesItemsAutoID__Group__1 )
            // InternalOntologicalParser.g:3689:2: rule__OntologicalRootClassesItemsAutoID__Group__0__Impl rule__OntologicalRootClassesItemsAutoID__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsAutoID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAutoID__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAutoID__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAutoID__Group__0__Impl"
    // InternalOntologicalParser.g:3696:1: rule__OntologicalRootClassesItemsAutoID__Group__0__Impl : ( AutoID ) ;
    public final void rule__OntologicalRootClassesItemsAutoID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3700:1: ( ( AutoID ) )
            // InternalOntologicalParser.g:3701:1: ( AutoID )
            {
            // InternalOntologicalParser.g:3701:1: ( AutoID )
            // InternalOntologicalParser.g:3702:2: AutoID
            {
             before(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getAutoIDKeyword_0()); 
            match(input,AutoID,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getAutoIDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAutoID__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAutoID__Group__1"
    // InternalOntologicalParser.g:3711:1: rule__OntologicalRootClassesItemsAutoID__Group__1 : rule__OntologicalRootClassesItemsAutoID__Group__1__Impl rule__OntologicalRootClassesItemsAutoID__Group__2 ;
    public final void rule__OntologicalRootClassesItemsAutoID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3715:1: ( rule__OntologicalRootClassesItemsAutoID__Group__1__Impl rule__OntologicalRootClassesItemsAutoID__Group__2 )
            // InternalOntologicalParser.g:3716:2: rule__OntologicalRootClassesItemsAutoID__Group__1__Impl rule__OntologicalRootClassesItemsAutoID__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootClassesItemsAutoID__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAutoID__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAutoID__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAutoID__Group__1__Impl"
    // InternalOntologicalParser.g:3723:1: rule__OntologicalRootClassesItemsAutoID__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsAutoID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3727:1: ( ( Colon ) )
            // InternalOntologicalParser.g:3728:1: ( Colon )
            {
            // InternalOntologicalParser.g:3728:1: ( Colon )
            // InternalOntologicalParser.g:3729:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAutoID__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAutoID__Group__2"
    // InternalOntologicalParser.g:3738:1: rule__OntologicalRootClassesItemsAutoID__Group__2 : rule__OntologicalRootClassesItemsAutoID__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsAutoID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3742:1: ( rule__OntologicalRootClassesItemsAutoID__Group__2__Impl )
            // InternalOntologicalParser.g:3743:2: rule__OntologicalRootClassesItemsAutoID__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAutoID__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAutoID__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAutoID__Group__2__Impl"
    // InternalOntologicalParser.g:3749:1: rule__OntologicalRootClassesItemsAutoID__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsAutoID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3753:1: ( ( ( rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2 ) ) )
            // InternalOntologicalParser.g:3754:1: ( ( rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2 ) )
            {
            // InternalOntologicalParser.g:3754:1: ( ( rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2 ) )
            // InternalOntologicalParser.g:3755:2: ( rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getAutoIDAssignment_2()); 
            // InternalOntologicalParser.g:3756:2: ( rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2 )
            // InternalOntologicalParser.g:3756:3: rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getAutoIDAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAutoID__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsOnlyCodes__Group__0"
    // InternalOntologicalParser.g:3765:1: rule__OntologicalRootClassesItemsOnlyCodes__Group__0 : rule__OntologicalRootClassesItemsOnlyCodes__Group__0__Impl rule__OntologicalRootClassesItemsOnlyCodes__Group__1 ;
    public final void rule__OntologicalRootClassesItemsOnlyCodes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3769:1: ( rule__OntologicalRootClassesItemsOnlyCodes__Group__0__Impl rule__OntologicalRootClassesItemsOnlyCodes__Group__1 )
            // InternalOntologicalParser.g:3770:2: rule__OntologicalRootClassesItemsOnlyCodes__Group__0__Impl rule__OntologicalRootClassesItemsOnlyCodes__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsOnlyCodes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsOnlyCodes__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsOnlyCodes__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsOnlyCodes__Group__0__Impl"
    // InternalOntologicalParser.g:3777:1: rule__OntologicalRootClassesItemsOnlyCodes__Group__0__Impl : ( OnlyCodes ) ;
    public final void rule__OntologicalRootClassesItemsOnlyCodes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3781:1: ( ( OnlyCodes ) )
            // InternalOntologicalParser.g:3782:1: ( OnlyCodes )
            {
            // InternalOntologicalParser.g:3782:1: ( OnlyCodes )
            // InternalOntologicalParser.g:3783:2: OnlyCodes
            {
             before(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getOnlyCodesKeyword_0()); 
            match(input,OnlyCodes,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getOnlyCodesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsOnlyCodes__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsOnlyCodes__Group__1"
    // InternalOntologicalParser.g:3792:1: rule__OntologicalRootClassesItemsOnlyCodes__Group__1 : rule__OntologicalRootClassesItemsOnlyCodes__Group__1__Impl rule__OntologicalRootClassesItemsOnlyCodes__Group__2 ;
    public final void rule__OntologicalRootClassesItemsOnlyCodes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3796:1: ( rule__OntologicalRootClassesItemsOnlyCodes__Group__1__Impl rule__OntologicalRootClassesItemsOnlyCodes__Group__2 )
            // InternalOntologicalParser.g:3797:2: rule__OntologicalRootClassesItemsOnlyCodes__Group__1__Impl rule__OntologicalRootClassesItemsOnlyCodes__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootClassesItemsOnlyCodes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsOnlyCodes__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsOnlyCodes__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsOnlyCodes__Group__1__Impl"
    // InternalOntologicalParser.g:3804:1: rule__OntologicalRootClassesItemsOnlyCodes__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsOnlyCodes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3808:1: ( ( Colon ) )
            // InternalOntologicalParser.g:3809:1: ( Colon )
            {
            // InternalOntologicalParser.g:3809:1: ( Colon )
            // InternalOntologicalParser.g:3810:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsOnlyCodes__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsOnlyCodes__Group__2"
    // InternalOntologicalParser.g:3819:1: rule__OntologicalRootClassesItemsOnlyCodes__Group__2 : rule__OntologicalRootClassesItemsOnlyCodes__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsOnlyCodes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3823:1: ( rule__OntologicalRootClassesItemsOnlyCodes__Group__2__Impl )
            // InternalOntologicalParser.g:3824:2: rule__OntologicalRootClassesItemsOnlyCodes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsOnlyCodes__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsOnlyCodes__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsOnlyCodes__Group__2__Impl"
    // InternalOntologicalParser.g:3830:1: rule__OntologicalRootClassesItemsOnlyCodes__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsOnlyCodes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3834:1: ( ( ( rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2 ) ) )
            // InternalOntologicalParser.g:3835:1: ( ( rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2 ) )
            {
            // InternalOntologicalParser.g:3835:1: ( ( rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2 ) )
            // InternalOntologicalParser.g:3836:2: ( rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getOnlyCodesAssignment_2()); 
            // InternalOntologicalParser.g:3837:2: ( rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2 )
            // InternalOntologicalParser.g:3837:3: rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getOnlyCodesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsOnlyCodes__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsBluetooth__Group__0"
    // InternalOntologicalParser.g:3846:1: rule__OntologicalRootClassesItemsBluetooth__Group__0 : rule__OntologicalRootClassesItemsBluetooth__Group__0__Impl rule__OntologicalRootClassesItemsBluetooth__Group__1 ;
    public final void rule__OntologicalRootClassesItemsBluetooth__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3850:1: ( rule__OntologicalRootClassesItemsBluetooth__Group__0__Impl rule__OntologicalRootClassesItemsBluetooth__Group__1 )
            // InternalOntologicalParser.g:3851:2: rule__OntologicalRootClassesItemsBluetooth__Group__0__Impl rule__OntologicalRootClassesItemsBluetooth__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsBluetooth__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsBluetooth__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsBluetooth__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsBluetooth__Group__0__Impl"
    // InternalOntologicalParser.g:3858:1: rule__OntologicalRootClassesItemsBluetooth__Group__0__Impl : ( Bluetooth ) ;
    public final void rule__OntologicalRootClassesItemsBluetooth__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3862:1: ( ( Bluetooth ) )
            // InternalOntologicalParser.g:3863:1: ( Bluetooth )
            {
            // InternalOntologicalParser.g:3863:1: ( Bluetooth )
            // InternalOntologicalParser.g:3864:2: Bluetooth
            {
             before(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getBluetoothKeyword_0()); 
            match(input,Bluetooth,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getBluetoothKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsBluetooth__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsBluetooth__Group__1"
    // InternalOntologicalParser.g:3873:1: rule__OntologicalRootClassesItemsBluetooth__Group__1 : rule__OntologicalRootClassesItemsBluetooth__Group__1__Impl rule__OntologicalRootClassesItemsBluetooth__Group__2 ;
    public final void rule__OntologicalRootClassesItemsBluetooth__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3877:1: ( rule__OntologicalRootClassesItemsBluetooth__Group__1__Impl rule__OntologicalRootClassesItemsBluetooth__Group__2 )
            // InternalOntologicalParser.g:3878:2: rule__OntologicalRootClassesItemsBluetooth__Group__1__Impl rule__OntologicalRootClassesItemsBluetooth__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootClassesItemsBluetooth__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsBluetooth__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsBluetooth__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsBluetooth__Group__1__Impl"
    // InternalOntologicalParser.g:3885:1: rule__OntologicalRootClassesItemsBluetooth__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsBluetooth__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3889:1: ( ( Colon ) )
            // InternalOntologicalParser.g:3890:1: ( Colon )
            {
            // InternalOntologicalParser.g:3890:1: ( Colon )
            // InternalOntologicalParser.g:3891:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsBluetooth__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsBluetooth__Group__2"
    // InternalOntologicalParser.g:3900:1: rule__OntologicalRootClassesItemsBluetooth__Group__2 : rule__OntologicalRootClassesItemsBluetooth__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsBluetooth__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3904:1: ( rule__OntologicalRootClassesItemsBluetooth__Group__2__Impl )
            // InternalOntologicalParser.g:3905:2: rule__OntologicalRootClassesItemsBluetooth__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsBluetooth__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsBluetooth__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsBluetooth__Group__2__Impl"
    // InternalOntologicalParser.g:3911:1: rule__OntologicalRootClassesItemsBluetooth__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsBluetooth__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3915:1: ( ( ( rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2 ) ) )
            // InternalOntologicalParser.g:3916:1: ( ( rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2 ) )
            {
            // InternalOntologicalParser.g:3916:1: ( ( rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2 ) )
            // InternalOntologicalParser.g:3917:2: ( rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getBluetoothAssignment_2()); 
            // InternalOntologicalParser.g:3918:2: ( rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2 )
            // InternalOntologicalParser.g:3918:3: rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getBluetoothAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsBluetooth__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsNoSCN__Group__0"
    // InternalOntologicalParser.g:3927:1: rule__OntologicalRootClassesItemsNoSCN__Group__0 : rule__OntologicalRootClassesItemsNoSCN__Group__0__Impl rule__OntologicalRootClassesItemsNoSCN__Group__1 ;
    public final void rule__OntologicalRootClassesItemsNoSCN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3931:1: ( rule__OntologicalRootClassesItemsNoSCN__Group__0__Impl rule__OntologicalRootClassesItemsNoSCN__Group__1 )
            // InternalOntologicalParser.g:3932:2: rule__OntologicalRootClassesItemsNoSCN__Group__0__Impl rule__OntologicalRootClassesItemsNoSCN__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsNoSCN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsNoSCN__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsNoSCN__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsNoSCN__Group__0__Impl"
    // InternalOntologicalParser.g:3939:1: rule__OntologicalRootClassesItemsNoSCN__Group__0__Impl : ( NoSCN ) ;
    public final void rule__OntologicalRootClassesItemsNoSCN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3943:1: ( ( NoSCN ) )
            // InternalOntologicalParser.g:3944:1: ( NoSCN )
            {
            // InternalOntologicalParser.g:3944:1: ( NoSCN )
            // InternalOntologicalParser.g:3945:2: NoSCN
            {
             before(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getNoSCNKeyword_0()); 
            match(input,NoSCN,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getNoSCNKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsNoSCN__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsNoSCN__Group__1"
    // InternalOntologicalParser.g:3954:1: rule__OntologicalRootClassesItemsNoSCN__Group__1 : rule__OntologicalRootClassesItemsNoSCN__Group__1__Impl rule__OntologicalRootClassesItemsNoSCN__Group__2 ;
    public final void rule__OntologicalRootClassesItemsNoSCN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3958:1: ( rule__OntologicalRootClassesItemsNoSCN__Group__1__Impl rule__OntologicalRootClassesItemsNoSCN__Group__2 )
            // InternalOntologicalParser.g:3959:2: rule__OntologicalRootClassesItemsNoSCN__Group__1__Impl rule__OntologicalRootClassesItemsNoSCN__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootClassesItemsNoSCN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsNoSCN__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsNoSCN__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsNoSCN__Group__1__Impl"
    // InternalOntologicalParser.g:3966:1: rule__OntologicalRootClassesItemsNoSCN__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsNoSCN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3970:1: ( ( Colon ) )
            // InternalOntologicalParser.g:3971:1: ( Colon )
            {
            // InternalOntologicalParser.g:3971:1: ( Colon )
            // InternalOntologicalParser.g:3972:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsNoSCN__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsNoSCN__Group__2"
    // InternalOntologicalParser.g:3981:1: rule__OntologicalRootClassesItemsNoSCN__Group__2 : rule__OntologicalRootClassesItemsNoSCN__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsNoSCN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3985:1: ( rule__OntologicalRootClassesItemsNoSCN__Group__2__Impl )
            // InternalOntologicalParser.g:3986:2: rule__OntologicalRootClassesItemsNoSCN__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsNoSCN__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsNoSCN__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsNoSCN__Group__2__Impl"
    // InternalOntologicalParser.g:3992:1: rule__OntologicalRootClassesItemsNoSCN__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsNoSCN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:3996:1: ( ( ( rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2 ) ) )
            // InternalOntologicalParser.g:3997:1: ( ( rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2 ) )
            {
            // InternalOntologicalParser.g:3997:1: ( ( rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2 ) )
            // InternalOntologicalParser.g:3998:2: ( rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getNoSCNAssignment_2()); 
            // InternalOntologicalParser.g:3999:2: ( rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2 )
            // InternalOntologicalParser.g:3999:3: rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getNoSCNAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsNoSCN__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group__0"
    // InternalOntologicalParser.g:4008:1: rule__OntologicalRootClassesItemsAttributesItems__Group__0 : rule__OntologicalRootClassesItemsAttributesItems__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItems__Group__1 ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4012:1: ( rule__OntologicalRootClassesItemsAttributesItems__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItems__Group__1 )
            // InternalOntologicalParser.g:4013:2: rule__OntologicalRootClassesItemsAttributesItems__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__OntologicalRootClassesItemsAttributesItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItems__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group__0__Impl"
    // InternalOntologicalParser.g:4020:1: rule__OntologicalRootClassesItemsAttributesItems__Group__0__Impl : ( () ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4024:1: ( ( () ) )
            // InternalOntologicalParser.g:4025:1: ( () )
            {
            // InternalOntologicalParser.g:4025:1: ( () )
            // InternalOntologicalParser.g:4026:2: ()
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getOntologicalRootClassesItemsAttributesItemsAction_0()); 
            // InternalOntologicalParser.g:4027:2: ()
            // InternalOntologicalParser.g:4027:3: 
            {
            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getOntologicalRootClassesItemsAttributesItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group__1"
    // InternalOntologicalParser.g:4035:1: rule__OntologicalRootClassesItemsAttributesItems__Group__1 : rule__OntologicalRootClassesItemsAttributesItems__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItems__Group__2 ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4039:1: ( rule__OntologicalRootClassesItemsAttributesItems__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItems__Group__2 )
            // InternalOntologicalParser.g:4040:2: rule__OntologicalRootClassesItemsAttributesItems__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItems__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__OntologicalRootClassesItemsAttributesItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItems__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group__1__Impl"
    // InternalOntologicalParser.g:4047:1: rule__OntologicalRootClassesItemsAttributesItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4051:1: ( ( LeftCurlyBracket ) )
            // InternalOntologicalParser.g:4052:1: ( LeftCurlyBracket )
            {
            // InternalOntologicalParser.g:4052:1: ( LeftCurlyBracket )
            // InternalOntologicalParser.g:4053:2: LeftCurlyBracket
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group__2"
    // InternalOntologicalParser.g:4062:1: rule__OntologicalRootClassesItemsAttributesItems__Group__2 : rule__OntologicalRootClassesItemsAttributesItems__Group__2__Impl rule__OntologicalRootClassesItemsAttributesItems__Group__3 ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4066:1: ( rule__OntologicalRootClassesItemsAttributesItems__Group__2__Impl rule__OntologicalRootClassesItemsAttributesItems__Group__3 )
            // InternalOntologicalParser.g:4067:2: rule__OntologicalRootClassesItemsAttributesItems__Group__2__Impl rule__OntologicalRootClassesItemsAttributesItems__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__OntologicalRootClassesItemsAttributesItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItems__Group__3();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group__2__Impl"
    // InternalOntologicalParser.g:4074:1: rule__OntologicalRootClassesItemsAttributesItems__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsAttributesItems__Group_2__0 )? ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4078:1: ( ( ( rule__OntologicalRootClassesItemsAttributesItems__Group_2__0 )? ) )
            // InternalOntologicalParser.g:4079:1: ( ( rule__OntologicalRootClassesItemsAttributesItems__Group_2__0 )? )
            {
            // InternalOntologicalParser.g:4079:1: ( ( rule__OntologicalRootClassesItemsAttributesItems__Group_2__0 )? )
            // InternalOntologicalParser.g:4080:2: ( rule__OntologicalRootClassesItemsAttributesItems__Group_2__0 )?
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getGroup_2()); 
            // InternalOntologicalParser.g:4081:2: ( rule__OntologicalRootClassesItemsAttributesItems__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ReadOnly||(LA18_0>=Default && LA18_0<=IsParam)||LA18_0==IsKey||(LA18_0>=Name && LA18_0<=Type)||(LA18_0>=Max && LA18_0<=Min)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntologicalParser.g:4081:3: rule__OntologicalRootClassesItemsAttributesItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntologicalRootClassesItemsAttributesItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group__3"
    // InternalOntologicalParser.g:4089:1: rule__OntologicalRootClassesItemsAttributesItems__Group__3 : rule__OntologicalRootClassesItemsAttributesItems__Group__3__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4093:1: ( rule__OntologicalRootClassesItemsAttributesItems__Group__3__Impl )
            // InternalOntologicalParser.g:4094:2: rule__OntologicalRootClassesItemsAttributesItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItems__Group__3__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group__3"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group__3__Impl"
    // InternalOntologicalParser.g:4100:1: rule__OntologicalRootClassesItemsAttributesItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4104:1: ( ( RightCurlyBracket ) )
            // InternalOntologicalParser.g:4105:1: ( RightCurlyBracket )
            {
            // InternalOntologicalParser.g:4105:1: ( RightCurlyBracket )
            // InternalOntologicalParser.g:4106:2: RightCurlyBracket
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group__3__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group_2__0"
    // InternalOntologicalParser.g:4116:1: rule__OntologicalRootClassesItemsAttributesItems__Group_2__0 : rule__OntologicalRootClassesItemsAttributesItems__Group_2__0__Impl rule__OntologicalRootClassesItemsAttributesItems__Group_2__1 ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4120:1: ( rule__OntologicalRootClassesItemsAttributesItems__Group_2__0__Impl rule__OntologicalRootClassesItemsAttributesItems__Group_2__1 )
            // InternalOntologicalParser.g:4121:2: rule__OntologicalRootClassesItemsAttributesItems__Group_2__0__Impl rule__OntologicalRootClassesItemsAttributesItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__OntologicalRootClassesItemsAttributesItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItems__Group_2__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group_2__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group_2__0__Impl"
    // InternalOntologicalParser.g:4128:1: rule__OntologicalRootClassesItemsAttributesItems__Group_2__0__Impl : ( ( rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4132:1: ( ( ( rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0 ) ) )
            // InternalOntologicalParser.g:4133:1: ( ( rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0 ) )
            {
            // InternalOntologicalParser.g:4133:1: ( ( rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0 ) )
            // InternalOntologicalParser.g:4134:2: ( rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getItemsAssignment_2_0()); 
            // InternalOntologicalParser.g:4135:2: ( rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0 )
            // InternalOntologicalParser.g:4135:3: rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group_2__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group_2__1"
    // InternalOntologicalParser.g:4143:1: rule__OntologicalRootClassesItemsAttributesItems__Group_2__1 : rule__OntologicalRootClassesItemsAttributesItems__Group_2__1__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4147:1: ( rule__OntologicalRootClassesItemsAttributesItems__Group_2__1__Impl )
            // InternalOntologicalParser.g:4148:2: rule__OntologicalRootClassesItemsAttributesItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItems__Group_2__1__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group_2__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group_2__1__Impl"
    // InternalOntologicalParser.g:4154:1: rule__OntologicalRootClassesItemsAttributesItems__Group_2__1__Impl : ( ( rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0 )* ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4158:1: ( ( ( rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0 )* ) )
            // InternalOntologicalParser.g:4159:1: ( ( rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0 )* )
            {
            // InternalOntologicalParser.g:4159:1: ( ( rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0 )* )
            // InternalOntologicalParser.g:4160:2: ( rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0 )*
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getGroup_2_1()); 
            // InternalOntologicalParser.g:4161:2: ( rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Comma) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOntologicalParser.g:4161:3: rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group_2__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0"
    // InternalOntologicalParser.g:4170:1: rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0 : rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0__Impl rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1 ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4174:1: ( rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0__Impl rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1 )
            // InternalOntologicalParser.g:4175:2: rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0__Impl rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1
            {
            pushFollow(FOLLOW_19);
            rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0__Impl"
    // InternalOntologicalParser.g:4182:1: rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4186:1: ( ( Comma ) )
            // InternalOntologicalParser.g:4187:1: ( Comma )
            {
            // InternalOntologicalParser.g:4187:1: ( Comma )
            // InternalOntologicalParser.g:4188:2: Comma
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1"
    // InternalOntologicalParser.g:4197:1: rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1 : rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4201:1: ( rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1__Impl )
            // InternalOntologicalParser.g:4202:2: rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1__Impl"
    // InternalOntologicalParser.g:4208:1: rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1__Impl : ( ( rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4212:1: ( ( ( rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1 ) ) )
            // InternalOntologicalParser.g:4213:1: ( ( rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalOntologicalParser.g:4213:1: ( ( rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1 ) )
            // InternalOntologicalParser.g:4214:2: ( rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalOntologicalParser.g:4215:2: ( rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1 )
            // InternalOntologicalParser.g:4215:3: rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsName__Group__0"
    // InternalOntologicalParser.g:4224:1: rule__OntologicalRootClassesItemsAttributesItemsName__Group__0 : rule__OntologicalRootClassesItemsAttributesItemsName__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsName__Group__1 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4228:1: ( rule__OntologicalRootClassesItemsAttributesItemsName__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsName__Group__1 )
            // InternalOntologicalParser.g:4229:2: rule__OntologicalRootClassesItemsAttributesItemsName__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__OntologicalRootClassesItemsAttributesItemsName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsName__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsName__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsName__Group__0__Impl"
    // InternalOntologicalParser.g:4236:1: rule__OntologicalRootClassesItemsAttributesItemsName__Group__0__Impl : ( () ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4240:1: ( ( () ) )
            // InternalOntologicalParser.g:4241:1: ( () )
            {
            // InternalOntologicalParser.g:4241:1: ( () )
            // InternalOntologicalParser.g:4242:2: ()
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getOntologicalRootClassesItemsAttributesItemsNameAction_0()); 
            // InternalOntologicalParser.g:4243:2: ()
            // InternalOntologicalParser.g:4243:3: 
            {
            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getOntologicalRootClassesItemsAttributesItemsNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsName__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsName__Group__1"
    // InternalOntologicalParser.g:4251:1: rule__OntologicalRootClassesItemsAttributesItemsName__Group__1 : rule__OntologicalRootClassesItemsAttributesItemsName__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsName__Group__2 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4255:1: ( rule__OntologicalRootClassesItemsAttributesItemsName__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsName__Group__2 )
            // InternalOntologicalParser.g:4256:2: rule__OntologicalRootClassesItemsAttributesItemsName__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsName__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsAttributesItemsName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsName__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsName__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsName__Group__1__Impl"
    // InternalOntologicalParser.g:4263:1: rule__OntologicalRootClassesItemsAttributesItemsName__Group__1__Impl : ( Name ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4267:1: ( ( Name ) )
            // InternalOntologicalParser.g:4268:1: ( Name )
            {
            // InternalOntologicalParser.g:4268:1: ( Name )
            // InternalOntologicalParser.g:4269:2: Name
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsName__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsName__Group__2"
    // InternalOntologicalParser.g:4278:1: rule__OntologicalRootClassesItemsAttributesItemsName__Group__2 : rule__OntologicalRootClassesItemsAttributesItemsName__Group__2__Impl rule__OntologicalRootClassesItemsAttributesItemsName__Group__3 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4282:1: ( rule__OntologicalRootClassesItemsAttributesItemsName__Group__2__Impl rule__OntologicalRootClassesItemsAttributesItemsName__Group__3 )
            // InternalOntologicalParser.g:4283:2: rule__OntologicalRootClassesItemsAttributesItemsName__Group__2__Impl rule__OntologicalRootClassesItemsAttributesItemsName__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsAttributesItemsName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsName__Group__3();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsName__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsName__Group__2__Impl"
    // InternalOntologicalParser.g:4290:1: rule__OntologicalRootClassesItemsAttributesItemsName__Group__2__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4294:1: ( ( Colon ) )
            // InternalOntologicalParser.g:4295:1: ( Colon )
            {
            // InternalOntologicalParser.g:4295:1: ( Colon )
            // InternalOntologicalParser.g:4296:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsName__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsName__Group__3"
    // InternalOntologicalParser.g:4305:1: rule__OntologicalRootClassesItemsAttributesItemsName__Group__3 : rule__OntologicalRootClassesItemsAttributesItemsName__Group__3__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4309:1: ( rule__OntologicalRootClassesItemsAttributesItemsName__Group__3__Impl )
            // InternalOntologicalParser.g:4310:2: rule__OntologicalRootClassesItemsAttributesItemsName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsName__Group__3__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsName__Group__3"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsName__Group__3__Impl"
    // InternalOntologicalParser.g:4316:1: rule__OntologicalRootClassesItemsAttributesItemsName__Group__3__Impl : ( ( rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3 ) ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4320:1: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3 ) ) )
            // InternalOntologicalParser.g:4321:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3 ) )
            {
            // InternalOntologicalParser.g:4321:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3 ) )
            // InternalOntologicalParser.g:4322:2: ( rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getNameAssignment_3()); 
            // InternalOntologicalParser.g:4323:2: ( rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3 )
            // InternalOntologicalParser.g:4323:3: rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsName__Group__3__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsType__Group__0"
    // InternalOntologicalParser.g:4332:1: rule__OntologicalRootClassesItemsAttributesItemsType__Group__0 : rule__OntologicalRootClassesItemsAttributesItemsType__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsType__Group__1 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4336:1: ( rule__OntologicalRootClassesItemsAttributesItemsType__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsType__Group__1 )
            // InternalOntologicalParser.g:4337:2: rule__OntologicalRootClassesItemsAttributesItemsType__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsType__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsAttributesItemsType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsType__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsType__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsType__Group__0__Impl"
    // InternalOntologicalParser.g:4344:1: rule__OntologicalRootClassesItemsAttributesItemsType__Group__0__Impl : ( Type ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4348:1: ( ( Type ) )
            // InternalOntologicalParser.g:4349:1: ( Type )
            {
            // InternalOntologicalParser.g:4349:1: ( Type )
            // InternalOntologicalParser.g:4350:2: Type
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getTypeKeyword_0()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsType__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsType__Group__1"
    // InternalOntologicalParser.g:4359:1: rule__OntologicalRootClassesItemsAttributesItemsType__Group__1 : rule__OntologicalRootClassesItemsAttributesItemsType__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsType__Group__2 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4363:1: ( rule__OntologicalRootClassesItemsAttributesItemsType__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsType__Group__2 )
            // InternalOntologicalParser.g:4364:2: rule__OntologicalRootClassesItemsAttributesItemsType__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsType__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsAttributesItemsType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsType__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsType__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsType__Group__1__Impl"
    // InternalOntologicalParser.g:4371:1: rule__OntologicalRootClassesItemsAttributesItemsType__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4375:1: ( ( Colon ) )
            // InternalOntologicalParser.g:4376:1: ( Colon )
            {
            // InternalOntologicalParser.g:4376:1: ( Colon )
            // InternalOntologicalParser.g:4377:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsType__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsType__Group__2"
    // InternalOntologicalParser.g:4386:1: rule__OntologicalRootClassesItemsAttributesItemsType__Group__2 : rule__OntologicalRootClassesItemsAttributesItemsType__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4390:1: ( rule__OntologicalRootClassesItemsAttributesItemsType__Group__2__Impl )
            // InternalOntologicalParser.g:4391:2: rule__OntologicalRootClassesItemsAttributesItemsType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsType__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsType__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsType__Group__2__Impl"
    // InternalOntologicalParser.g:4397:1: rule__OntologicalRootClassesItemsAttributesItemsType__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4401:1: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2 ) ) )
            // InternalOntologicalParser.g:4402:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2 ) )
            {
            // InternalOntologicalParser.g:4402:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2 ) )
            // InternalOntologicalParser.g:4403:2: ( rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getTypeAssignment_2()); 
            // InternalOntologicalParser.g:4404:2: ( rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2 )
            // InternalOntologicalParser.g:4404:3: rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsType__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0"
    // InternalOntologicalParser.g:4413:1: rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0 : rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4417:1: ( rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1 )
            // InternalOntologicalParser.g:4418:2: rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0__Impl"
    // InternalOntologicalParser.g:4425:1: rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0__Impl : ( Min ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4429:1: ( ( Min ) )
            // InternalOntologicalParser.g:4430:1: ( Min )
            {
            // InternalOntologicalParser.g:4430:1: ( Min )
            // InternalOntologicalParser.g:4431:2: Min
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getMinKeyword_0()); 
            match(input,Min,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getMinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1"
    // InternalOntologicalParser.g:4440:1: rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1 : rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4444:1: ( rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2 )
            // InternalOntologicalParser.g:4445:2: rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1__Impl"
    // InternalOntologicalParser.g:4452:1: rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4456:1: ( ( Colon ) )
            // InternalOntologicalParser.g:4457:1: ( Colon )
            {
            // InternalOntologicalParser.g:4457:1: ( Colon )
            // InternalOntologicalParser.g:4458:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2"
    // InternalOntologicalParser.g:4467:1: rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2 : rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4471:1: ( rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2__Impl )
            // InternalOntologicalParser.g:4472:2: rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2__Impl"
    // InternalOntologicalParser.g:4478:1: rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4482:1: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2 ) ) )
            // InternalOntologicalParser.g:4483:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2 ) )
            {
            // InternalOntologicalParser.g:4483:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2 ) )
            // InternalOntologicalParser.g:4484:2: ( rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getMinAssignment_2()); 
            // InternalOntologicalParser.g:4485:2: ( rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2 )
            // InternalOntologicalParser.g:4485:3: rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getMinAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0"
    // InternalOntologicalParser.g:4494:1: rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0 : rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4498:1: ( rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1 )
            // InternalOntologicalParser.g:4499:2: rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0__Impl"
    // InternalOntologicalParser.g:4506:1: rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0__Impl : ( Max ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4510:1: ( ( Max ) )
            // InternalOntologicalParser.g:4511:1: ( Max )
            {
            // InternalOntologicalParser.g:4511:1: ( Max )
            // InternalOntologicalParser.g:4512:2: Max
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getMaxKeyword_0()); 
            match(input,Max,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getMaxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1"
    // InternalOntologicalParser.g:4521:1: rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1 : rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4525:1: ( rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2 )
            // InternalOntologicalParser.g:4526:2: rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1__Impl"
    // InternalOntologicalParser.g:4533:1: rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4537:1: ( ( Colon ) )
            // InternalOntologicalParser.g:4538:1: ( Colon )
            {
            // InternalOntologicalParser.g:4538:1: ( Colon )
            // InternalOntologicalParser.g:4539:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2"
    // InternalOntologicalParser.g:4548:1: rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2 : rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4552:1: ( rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2__Impl )
            // InternalOntologicalParser.g:4553:2: rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2__Impl"
    // InternalOntologicalParser.g:4559:1: rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4563:1: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2 ) ) )
            // InternalOntologicalParser.g:4564:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2 ) )
            {
            // InternalOntologicalParser.g:4564:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2 ) )
            // InternalOntologicalParser.g:4565:2: ( rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getMaxAssignment_2()); 
            // InternalOntologicalParser.g:4566:2: ( rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2 )
            // InternalOntologicalParser.g:4566:3: rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getMaxAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0"
    // InternalOntologicalParser.g:4575:1: rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0 : rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4579:1: ( rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1 )
            // InternalOntologicalParser.g:4580:2: rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0__Impl"
    // InternalOntologicalParser.g:4587:1: rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0__Impl : ( Default ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4591:1: ( ( Default ) )
            // InternalOntologicalParser.g:4592:1: ( Default )
            {
            // InternalOntologicalParser.g:4592:1: ( Default )
            // InternalOntologicalParser.g:4593:2: Default
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getDefaultKeyword_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getDefaultKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1"
    // InternalOntologicalParser.g:4602:1: rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1 : rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4606:1: ( rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2 )
            // InternalOntologicalParser.g:4607:2: rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1__Impl"
    // InternalOntologicalParser.g:4614:1: rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4618:1: ( ( Colon ) )
            // InternalOntologicalParser.g:4619:1: ( Colon )
            {
            // InternalOntologicalParser.g:4619:1: ( Colon )
            // InternalOntologicalParser.g:4620:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2"
    // InternalOntologicalParser.g:4629:1: rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2 : rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4633:1: ( rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2__Impl )
            // InternalOntologicalParser.g:4634:2: rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2__Impl"
    // InternalOntologicalParser.g:4640:1: rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4644:1: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2 ) ) )
            // InternalOntologicalParser.g:4645:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2 ) )
            {
            // InternalOntologicalParser.g:4645:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2 ) )
            // InternalOntologicalParser.g:4646:2: ( rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getDefaultAssignment_2()); 
            // InternalOntologicalParser.g:4647:2: ( rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2 )
            // InternalOntologicalParser.g:4647:3: rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getDefaultAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0"
    // InternalOntologicalParser.g:4656:1: rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0 : rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4660:1: ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1 )
            // InternalOntologicalParser.g:4661:2: rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0__Impl"
    // InternalOntologicalParser.g:4668:1: rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0__Impl : ( ReadOnly ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4672:1: ( ( ReadOnly ) )
            // InternalOntologicalParser.g:4673:1: ( ReadOnly )
            {
            // InternalOntologicalParser.g:4673:1: ( ReadOnly )
            // InternalOntologicalParser.g:4674:2: ReadOnly
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getReadOnlyKeyword_0()); 
            match(input,ReadOnly,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getReadOnlyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1"
    // InternalOntologicalParser.g:4683:1: rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1 : rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4687:1: ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2 )
            // InternalOntologicalParser.g:4688:2: rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1__Impl"
    // InternalOntologicalParser.g:4695:1: rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4699:1: ( ( Colon ) )
            // InternalOntologicalParser.g:4700:1: ( Colon )
            {
            // InternalOntologicalParser.g:4700:1: ( Colon )
            // InternalOntologicalParser.g:4701:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2"
    // InternalOntologicalParser.g:4710:1: rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2 : rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4714:1: ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2__Impl )
            // InternalOntologicalParser.g:4715:2: rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2__Impl"
    // InternalOntologicalParser.g:4721:1: rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4725:1: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2 ) ) )
            // InternalOntologicalParser.g:4726:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2 ) )
            {
            // InternalOntologicalParser.g:4726:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2 ) )
            // InternalOntologicalParser.g:4727:2: ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getReadOnlyAssignment_2()); 
            // InternalOntologicalParser.g:4728:2: ( rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2 )
            // InternalOntologicalParser.g:4728:3: rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getReadOnlyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0"
    // InternalOntologicalParser.g:4737:1: rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0 : rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4741:1: ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1 )
            // InternalOntologicalParser.g:4742:2: rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0__Impl"
    // InternalOntologicalParser.g:4749:1: rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0__Impl : ( IsParam ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4753:1: ( ( IsParam ) )
            // InternalOntologicalParser.g:4754:1: ( IsParam )
            {
            // InternalOntologicalParser.g:4754:1: ( IsParam )
            // InternalOntologicalParser.g:4755:2: IsParam
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getIsParamKeyword_0()); 
            match(input,IsParam,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getIsParamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1"
    // InternalOntologicalParser.g:4764:1: rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1 : rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4768:1: ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2 )
            // InternalOntologicalParser.g:4769:2: rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1__Impl"
    // InternalOntologicalParser.g:4776:1: rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4780:1: ( ( Colon ) )
            // InternalOntologicalParser.g:4781:1: ( Colon )
            {
            // InternalOntologicalParser.g:4781:1: ( Colon )
            // InternalOntologicalParser.g:4782:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2"
    // InternalOntologicalParser.g:4791:1: rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2 : rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4795:1: ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2__Impl )
            // InternalOntologicalParser.g:4796:2: rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2__Impl"
    // InternalOntologicalParser.g:4802:1: rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4806:1: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2 ) ) )
            // InternalOntologicalParser.g:4807:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2 ) )
            {
            // InternalOntologicalParser.g:4807:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2 ) )
            // InternalOntologicalParser.g:4808:2: ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getIsParamAssignment_2()); 
            // InternalOntologicalParser.g:4809:2: ( rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2 )
            // InternalOntologicalParser.g:4809:3: rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getIsParamAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0"
    // InternalOntologicalParser.g:4818:1: rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0 : rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4822:1: ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1 )
            // InternalOntologicalParser.g:4823:2: rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0__Impl rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0__Impl"
    // InternalOntologicalParser.g:4830:1: rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0__Impl : ( IsKey ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4834:1: ( ( IsKey ) )
            // InternalOntologicalParser.g:4835:1: ( IsKey )
            {
            // InternalOntologicalParser.g:4835:1: ( IsKey )
            // InternalOntologicalParser.g:4836:2: IsKey
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getIsKeyKeyword_0()); 
            match(input,IsKey,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getIsKeyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1"
    // InternalOntologicalParser.g:4845:1: rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1 : rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2 ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4849:1: ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2 )
            // InternalOntologicalParser.g:4850:2: rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1__Impl rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1__Impl"
    // InternalOntologicalParser.g:4857:1: rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4861:1: ( ( Colon ) )
            // InternalOntologicalParser.g:4862:1: ( Colon )
            {
            // InternalOntologicalParser.g:4862:1: ( Colon )
            // InternalOntologicalParser.g:4863:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2"
    // InternalOntologicalParser.g:4872:1: rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2 : rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4876:1: ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2__Impl )
            // InternalOntologicalParser.g:4877:2: rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2__Impl"
    // InternalOntologicalParser.g:4883:1: rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4887:1: ( ( ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2 ) ) )
            // InternalOntologicalParser.g:4888:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2 ) )
            {
            // InternalOntologicalParser.g:4888:1: ( ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2 ) )
            // InternalOntologicalParser.g:4889:2: ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getIsKeyAssignment_2()); 
            // InternalOntologicalParser.g:4890:2: ( rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2 )
            // InternalOntologicalParser.g:4890:3: rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getIsKeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group__0"
    // InternalOntologicalParser.g:4899:1: rule__OntologicalRootClassesItemsReferencesItems__Group__0 : rule__OntologicalRootClassesItemsReferencesItems__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItems__Group__1 ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4903:1: ( rule__OntologicalRootClassesItemsReferencesItems__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItems__Group__1 )
            // InternalOntologicalParser.g:4904:2: rule__OntologicalRootClassesItemsReferencesItems__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__OntologicalRootClassesItemsReferencesItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItems__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group__0__Impl"
    // InternalOntologicalParser.g:4911:1: rule__OntologicalRootClassesItemsReferencesItems__Group__0__Impl : ( () ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4915:1: ( ( () ) )
            // InternalOntologicalParser.g:4916:1: ( () )
            {
            // InternalOntologicalParser.g:4916:1: ( () )
            // InternalOntologicalParser.g:4917:2: ()
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getOntologicalRootClassesItemsReferencesItemsAction_0()); 
            // InternalOntologicalParser.g:4918:2: ()
            // InternalOntologicalParser.g:4918:3: 
            {
            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getOntologicalRootClassesItemsReferencesItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group__1"
    // InternalOntologicalParser.g:4926:1: rule__OntologicalRootClassesItemsReferencesItems__Group__1 : rule__OntologicalRootClassesItemsReferencesItems__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItems__Group__2 ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4930:1: ( rule__OntologicalRootClassesItemsReferencesItems__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItems__Group__2 )
            // InternalOntologicalParser.g:4931:2: rule__OntologicalRootClassesItemsReferencesItems__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItems__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__OntologicalRootClassesItemsReferencesItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItems__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group__1__Impl"
    // InternalOntologicalParser.g:4938:1: rule__OntologicalRootClassesItemsReferencesItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4942:1: ( ( LeftCurlyBracket ) )
            // InternalOntologicalParser.g:4943:1: ( LeftCurlyBracket )
            {
            // InternalOntologicalParser.g:4943:1: ( LeftCurlyBracket )
            // InternalOntologicalParser.g:4944:2: LeftCurlyBracket
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group__2"
    // InternalOntologicalParser.g:4953:1: rule__OntologicalRootClassesItemsReferencesItems__Group__2 : rule__OntologicalRootClassesItemsReferencesItems__Group__2__Impl rule__OntologicalRootClassesItemsReferencesItems__Group__3 ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4957:1: ( rule__OntologicalRootClassesItemsReferencesItems__Group__2__Impl rule__OntologicalRootClassesItemsReferencesItems__Group__3 )
            // InternalOntologicalParser.g:4958:2: rule__OntologicalRootClassesItemsReferencesItems__Group__2__Impl rule__OntologicalRootClassesItemsReferencesItems__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__OntologicalRootClassesItemsReferencesItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItems__Group__3();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group__2__Impl"
    // InternalOntologicalParser.g:4965:1: rule__OntologicalRootClassesItemsReferencesItems__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsReferencesItems__Group_2__0 )? ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4969:1: ( ( ( rule__OntologicalRootClassesItemsReferencesItems__Group_2__0 )? ) )
            // InternalOntologicalParser.g:4970:1: ( ( rule__OntologicalRootClassesItemsReferencesItems__Group_2__0 )? )
            {
            // InternalOntologicalParser.g:4970:1: ( ( rule__OntologicalRootClassesItemsReferencesItems__Group_2__0 )? )
            // InternalOntologicalParser.g:4971:2: ( rule__OntologicalRootClassesItemsReferencesItems__Group_2__0 )?
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getGroup_2()); 
            // InternalOntologicalParser.g:4972:2: ( rule__OntologicalRootClassesItemsReferencesItems__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Containtment||LA20_0==Opposite||LA20_0==Target||LA20_0==Name||(LA20_0>=Max && LA20_0<=Min)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntologicalParser.g:4972:3: rule__OntologicalRootClassesItemsReferencesItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntologicalRootClassesItemsReferencesItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group__3"
    // InternalOntologicalParser.g:4980:1: rule__OntologicalRootClassesItemsReferencesItems__Group__3 : rule__OntologicalRootClassesItemsReferencesItems__Group__3__Impl ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4984:1: ( rule__OntologicalRootClassesItemsReferencesItems__Group__3__Impl )
            // InternalOntologicalParser.g:4985:2: rule__OntologicalRootClassesItemsReferencesItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItems__Group__3__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group__3"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group__3__Impl"
    // InternalOntologicalParser.g:4991:1: rule__OntologicalRootClassesItemsReferencesItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:4995:1: ( ( RightCurlyBracket ) )
            // InternalOntologicalParser.g:4996:1: ( RightCurlyBracket )
            {
            // InternalOntologicalParser.g:4996:1: ( RightCurlyBracket )
            // InternalOntologicalParser.g:4997:2: RightCurlyBracket
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group__3__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group_2__0"
    // InternalOntologicalParser.g:5007:1: rule__OntologicalRootClassesItemsReferencesItems__Group_2__0 : rule__OntologicalRootClassesItemsReferencesItems__Group_2__0__Impl rule__OntologicalRootClassesItemsReferencesItems__Group_2__1 ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5011:1: ( rule__OntologicalRootClassesItemsReferencesItems__Group_2__0__Impl rule__OntologicalRootClassesItemsReferencesItems__Group_2__1 )
            // InternalOntologicalParser.g:5012:2: rule__OntologicalRootClassesItemsReferencesItems__Group_2__0__Impl rule__OntologicalRootClassesItemsReferencesItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__OntologicalRootClassesItemsReferencesItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItems__Group_2__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group_2__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group_2__0__Impl"
    // InternalOntologicalParser.g:5019:1: rule__OntologicalRootClassesItemsReferencesItems__Group_2__0__Impl : ( ( rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5023:1: ( ( ( rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0 ) ) )
            // InternalOntologicalParser.g:5024:1: ( ( rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0 ) )
            {
            // InternalOntologicalParser.g:5024:1: ( ( rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0 ) )
            // InternalOntologicalParser.g:5025:2: ( rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getItemsAssignment_2_0()); 
            // InternalOntologicalParser.g:5026:2: ( rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0 )
            // InternalOntologicalParser.g:5026:3: rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group_2__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group_2__1"
    // InternalOntologicalParser.g:5034:1: rule__OntologicalRootClassesItemsReferencesItems__Group_2__1 : rule__OntologicalRootClassesItemsReferencesItems__Group_2__1__Impl ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5038:1: ( rule__OntologicalRootClassesItemsReferencesItems__Group_2__1__Impl )
            // InternalOntologicalParser.g:5039:2: rule__OntologicalRootClassesItemsReferencesItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItems__Group_2__1__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group_2__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group_2__1__Impl"
    // InternalOntologicalParser.g:5045:1: rule__OntologicalRootClassesItemsReferencesItems__Group_2__1__Impl : ( ( rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0 )* ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5049:1: ( ( ( rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0 )* ) )
            // InternalOntologicalParser.g:5050:1: ( ( rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0 )* )
            {
            // InternalOntologicalParser.g:5050:1: ( ( rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0 )* )
            // InternalOntologicalParser.g:5051:2: ( rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0 )*
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getGroup_2_1()); 
            // InternalOntologicalParser.g:5052:2: ( rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOntologicalParser.g:5052:3: rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group_2__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0"
    // InternalOntologicalParser.g:5061:1: rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0 : rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0__Impl rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1 ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5065:1: ( rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0__Impl rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1 )
            // InternalOntologicalParser.g:5066:2: rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0__Impl rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1
            {
            pushFollow(FOLLOW_21);
            rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0__Impl"
    // InternalOntologicalParser.g:5073:1: rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5077:1: ( ( Comma ) )
            // InternalOntologicalParser.g:5078:1: ( Comma )
            {
            // InternalOntologicalParser.g:5078:1: ( Comma )
            // InternalOntologicalParser.g:5079:2: Comma
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1"
    // InternalOntologicalParser.g:5088:1: rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1 : rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1__Impl ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5092:1: ( rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1__Impl )
            // InternalOntologicalParser.g:5093:2: rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1__Impl"
    // InternalOntologicalParser.g:5099:1: rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1__Impl : ( ( rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5103:1: ( ( ( rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1 ) ) )
            // InternalOntologicalParser.g:5104:1: ( ( rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalOntologicalParser.g:5104:1: ( ( rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1 ) )
            // InternalOntologicalParser.g:5105:2: ( rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalOntologicalParser.g:5106:2: ( rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1 )
            // InternalOntologicalParser.g:5106:3: rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsName__Group__0"
    // InternalOntologicalParser.g:5115:1: rule__OntologicalRootClassesItemsReferencesItemsName__Group__0 : rule__OntologicalRootClassesItemsReferencesItemsName__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsName__Group__1 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5119:1: ( rule__OntologicalRootClassesItemsReferencesItemsName__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsName__Group__1 )
            // InternalOntologicalParser.g:5120:2: rule__OntologicalRootClassesItemsReferencesItemsName__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__OntologicalRootClassesItemsReferencesItemsName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsName__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsName__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsName__Group__0__Impl"
    // InternalOntologicalParser.g:5127:1: rule__OntologicalRootClassesItemsReferencesItemsName__Group__0__Impl : ( () ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5131:1: ( ( () ) )
            // InternalOntologicalParser.g:5132:1: ( () )
            {
            // InternalOntologicalParser.g:5132:1: ( () )
            // InternalOntologicalParser.g:5133:2: ()
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getOntologicalRootClassesItemsReferencesItemsNameAction_0()); 
            // InternalOntologicalParser.g:5134:2: ()
            // InternalOntologicalParser.g:5134:3: 
            {
            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getOntologicalRootClassesItemsReferencesItemsNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsName__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsName__Group__1"
    // InternalOntologicalParser.g:5142:1: rule__OntologicalRootClassesItemsReferencesItemsName__Group__1 : rule__OntologicalRootClassesItemsReferencesItemsName__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsName__Group__2 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5146:1: ( rule__OntologicalRootClassesItemsReferencesItemsName__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsName__Group__2 )
            // InternalOntologicalParser.g:5147:2: rule__OntologicalRootClassesItemsReferencesItemsName__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsName__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsReferencesItemsName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsName__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsName__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsName__Group__1__Impl"
    // InternalOntologicalParser.g:5154:1: rule__OntologicalRootClassesItemsReferencesItemsName__Group__1__Impl : ( Name ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5158:1: ( ( Name ) )
            // InternalOntologicalParser.g:5159:1: ( Name )
            {
            // InternalOntologicalParser.g:5159:1: ( Name )
            // InternalOntologicalParser.g:5160:2: Name
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsName__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsName__Group__2"
    // InternalOntologicalParser.g:5169:1: rule__OntologicalRootClassesItemsReferencesItemsName__Group__2 : rule__OntologicalRootClassesItemsReferencesItemsName__Group__2__Impl rule__OntologicalRootClassesItemsReferencesItemsName__Group__3 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5173:1: ( rule__OntologicalRootClassesItemsReferencesItemsName__Group__2__Impl rule__OntologicalRootClassesItemsReferencesItemsName__Group__3 )
            // InternalOntologicalParser.g:5174:2: rule__OntologicalRootClassesItemsReferencesItemsName__Group__2__Impl rule__OntologicalRootClassesItemsReferencesItemsName__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsReferencesItemsName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsName__Group__3();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsName__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsName__Group__2__Impl"
    // InternalOntologicalParser.g:5181:1: rule__OntologicalRootClassesItemsReferencesItemsName__Group__2__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5185:1: ( ( Colon ) )
            // InternalOntologicalParser.g:5186:1: ( Colon )
            {
            // InternalOntologicalParser.g:5186:1: ( Colon )
            // InternalOntologicalParser.g:5187:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsName__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsName__Group__3"
    // InternalOntologicalParser.g:5196:1: rule__OntologicalRootClassesItemsReferencesItemsName__Group__3 : rule__OntologicalRootClassesItemsReferencesItemsName__Group__3__Impl ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5200:1: ( rule__OntologicalRootClassesItemsReferencesItemsName__Group__3__Impl )
            // InternalOntologicalParser.g:5201:2: rule__OntologicalRootClassesItemsReferencesItemsName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsName__Group__3__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsName__Group__3"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsName__Group__3__Impl"
    // InternalOntologicalParser.g:5207:1: rule__OntologicalRootClassesItemsReferencesItemsName__Group__3__Impl : ( ( rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3 ) ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5211:1: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3 ) ) )
            // InternalOntologicalParser.g:5212:1: ( ( rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3 ) )
            {
            // InternalOntologicalParser.g:5212:1: ( ( rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3 ) )
            // InternalOntologicalParser.g:5213:2: ( rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getNameAssignment_3()); 
            // InternalOntologicalParser.g:5214:2: ( rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3 )
            // InternalOntologicalParser.g:5214:3: rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsName__Group__3__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0"
    // InternalOntologicalParser.g:5223:1: rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0 : rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5227:1: ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1 )
            // InternalOntologicalParser.g:5228:2: rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0__Impl"
    // InternalOntologicalParser.g:5235:1: rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0__Impl : ( Containtment ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5239:1: ( ( Containtment ) )
            // InternalOntologicalParser.g:5240:1: ( Containtment )
            {
            // InternalOntologicalParser.g:5240:1: ( Containtment )
            // InternalOntologicalParser.g:5241:2: Containtment
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getContaintmentKeyword_0()); 
            match(input,Containtment,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getContaintmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1"
    // InternalOntologicalParser.g:5250:1: rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1 : rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5254:1: ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2 )
            // InternalOntologicalParser.g:5255:2: rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1__Impl"
    // InternalOntologicalParser.g:5262:1: rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5266:1: ( ( Colon ) )
            // InternalOntologicalParser.g:5267:1: ( Colon )
            {
            // InternalOntologicalParser.g:5267:1: ( Colon )
            // InternalOntologicalParser.g:5268:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2"
    // InternalOntologicalParser.g:5277:1: rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2 : rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5281:1: ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2__Impl )
            // InternalOntologicalParser.g:5282:2: rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2__Impl"
    // InternalOntologicalParser.g:5288:1: rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5292:1: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2 ) ) )
            // InternalOntologicalParser.g:5293:1: ( ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2 ) )
            {
            // InternalOntologicalParser.g:5293:1: ( ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2 ) )
            // InternalOntologicalParser.g:5294:2: ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getContaintmentAssignment_2()); 
            // InternalOntologicalParser.g:5295:2: ( rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2 )
            // InternalOntologicalParser.g:5295:3: rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getContaintmentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0"
    // InternalOntologicalParser.g:5304:1: rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0 : rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5308:1: ( rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1 )
            // InternalOntologicalParser.g:5309:2: rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0__Impl"
    // InternalOntologicalParser.g:5316:1: rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0__Impl : ( Min ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5320:1: ( ( Min ) )
            // InternalOntologicalParser.g:5321:1: ( Min )
            {
            // InternalOntologicalParser.g:5321:1: ( Min )
            // InternalOntologicalParser.g:5322:2: Min
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getMinKeyword_0()); 
            match(input,Min,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getMinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1"
    // InternalOntologicalParser.g:5331:1: rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1 : rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5335:1: ( rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2 )
            // InternalOntologicalParser.g:5336:2: rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1__Impl"
    // InternalOntologicalParser.g:5343:1: rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5347:1: ( ( Colon ) )
            // InternalOntologicalParser.g:5348:1: ( Colon )
            {
            // InternalOntologicalParser.g:5348:1: ( Colon )
            // InternalOntologicalParser.g:5349:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2"
    // InternalOntologicalParser.g:5358:1: rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2 : rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5362:1: ( rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2__Impl )
            // InternalOntologicalParser.g:5363:2: rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2__Impl"
    // InternalOntologicalParser.g:5369:1: rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5373:1: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2 ) ) )
            // InternalOntologicalParser.g:5374:1: ( ( rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2 ) )
            {
            // InternalOntologicalParser.g:5374:1: ( ( rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2 ) )
            // InternalOntologicalParser.g:5375:2: ( rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getMinAssignment_2()); 
            // InternalOntologicalParser.g:5376:2: ( rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2 )
            // InternalOntologicalParser.g:5376:3: rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getMinAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0"
    // InternalOntologicalParser.g:5385:1: rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0 : rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5389:1: ( rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1 )
            // InternalOntologicalParser.g:5390:2: rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0__Impl"
    // InternalOntologicalParser.g:5397:1: rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0__Impl : ( Max ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5401:1: ( ( Max ) )
            // InternalOntologicalParser.g:5402:1: ( Max )
            {
            // InternalOntologicalParser.g:5402:1: ( Max )
            // InternalOntologicalParser.g:5403:2: Max
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getMaxKeyword_0()); 
            match(input,Max,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getMaxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1"
    // InternalOntologicalParser.g:5412:1: rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1 : rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5416:1: ( rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2 )
            // InternalOntologicalParser.g:5417:2: rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1__Impl"
    // InternalOntologicalParser.g:5424:1: rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5428:1: ( ( Colon ) )
            // InternalOntologicalParser.g:5429:1: ( Colon )
            {
            // InternalOntologicalParser.g:5429:1: ( Colon )
            // InternalOntologicalParser.g:5430:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2"
    // InternalOntologicalParser.g:5439:1: rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2 : rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5443:1: ( rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2__Impl )
            // InternalOntologicalParser.g:5444:2: rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2__Impl"
    // InternalOntologicalParser.g:5450:1: rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5454:1: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2 ) ) )
            // InternalOntologicalParser.g:5455:1: ( ( rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2 ) )
            {
            // InternalOntologicalParser.g:5455:1: ( ( rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2 ) )
            // InternalOntologicalParser.g:5456:2: ( rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getMaxAssignment_2()); 
            // InternalOntologicalParser.g:5457:2: ( rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2 )
            // InternalOntologicalParser.g:5457:3: rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getMaxAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0"
    // InternalOntologicalParser.g:5466:1: rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0 : rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5470:1: ( rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1 )
            // InternalOntologicalParser.g:5471:2: rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0__Impl"
    // InternalOntologicalParser.g:5478:1: rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0__Impl : ( Target ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5482:1: ( ( Target ) )
            // InternalOntologicalParser.g:5483:1: ( Target )
            {
            // InternalOntologicalParser.g:5483:1: ( Target )
            // InternalOntologicalParser.g:5484:2: Target
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getTargetKeyword_0()); 
            match(input,Target,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getTargetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1"
    // InternalOntologicalParser.g:5493:1: rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1 : rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5497:1: ( rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2 )
            // InternalOntologicalParser.g:5498:2: rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1__Impl"
    // InternalOntologicalParser.g:5505:1: rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5509:1: ( ( Colon ) )
            // InternalOntologicalParser.g:5510:1: ( Colon )
            {
            // InternalOntologicalParser.g:5510:1: ( Colon )
            // InternalOntologicalParser.g:5511:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2"
    // InternalOntologicalParser.g:5520:1: rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2 : rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5524:1: ( rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2__Impl )
            // InternalOntologicalParser.g:5525:2: rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2__Impl"
    // InternalOntologicalParser.g:5531:1: rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5535:1: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2 ) ) )
            // InternalOntologicalParser.g:5536:1: ( ( rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2 ) )
            {
            // InternalOntologicalParser.g:5536:1: ( ( rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2 ) )
            // InternalOntologicalParser.g:5537:2: ( rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getTargetAssignment_2()); 
            // InternalOntologicalParser.g:5538:2: ( rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2 )
            // InternalOntologicalParser.g:5538:3: rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0"
    // InternalOntologicalParser.g:5547:1: rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0 : rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5551:1: ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1 )
            // InternalOntologicalParser.g:5552:2: rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0__Impl rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0__Impl"
    // InternalOntologicalParser.g:5559:1: rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0__Impl : ( Opposite ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5563:1: ( ( Opposite ) )
            // InternalOntologicalParser.g:5564:1: ( Opposite )
            {
            // InternalOntologicalParser.g:5564:1: ( Opposite )
            // InternalOntologicalParser.g:5565:2: Opposite
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getOppositeKeyword_0()); 
            match(input,Opposite,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getOppositeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1"
    // InternalOntologicalParser.g:5574:1: rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1 : rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2 ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5578:1: ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2 )
            // InternalOntologicalParser.g:5579:2: rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1__Impl rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1__Impl"
    // InternalOntologicalParser.g:5586:1: rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1__Impl : ( Colon ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5590:1: ( ( Colon ) )
            // InternalOntologicalParser.g:5591:1: ( Colon )
            {
            // InternalOntologicalParser.g:5591:1: ( Colon )
            // InternalOntologicalParser.g:5592:2: Colon
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__1__Impl"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2"
    // InternalOntologicalParser.g:5601:1: rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2 : rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2__Impl ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5605:1: ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2__Impl )
            // InternalOntologicalParser.g:5606:2: rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2__Impl();

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
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2__Impl"
    // InternalOntologicalParser.g:5612:1: rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2__Impl : ( ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2 ) ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5616:1: ( ( ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2 ) ) )
            // InternalOntologicalParser.g:5617:1: ( ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2 ) )
            {
            // InternalOntologicalParser.g:5617:1: ( ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2 ) )
            // InternalOntologicalParser.g:5618:2: ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2 )
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getOppositeAssignment_2()); 
            // InternalOntologicalParser.g:5619:2: ( rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2 )
            // InternalOntologicalParser.g:5619:3: rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getOppositeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__2__Impl"


    // $ANTLR start "rule__OntologicalRoot__OntologicalRootAssignment_2_0"
    // InternalOntologicalParser.g:5628:1: rule__OntologicalRoot__OntologicalRootAssignment_2_0 : ( ruleOntologicalRootPropertiesAbstract ) ;
    public final void rule__OntologicalRoot__OntologicalRootAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5632:1: ( ( ruleOntologicalRootPropertiesAbstract ) )
            // InternalOntologicalParser.g:5633:2: ( ruleOntologicalRootPropertiesAbstract )
            {
            // InternalOntologicalParser.g:5633:2: ( ruleOntologicalRootPropertiesAbstract )
            // InternalOntologicalParser.g:5634:3: ruleOntologicalRootPropertiesAbstract
            {
             before(grammarAccess.getOntologicalRootAccess().getOntologicalRootOntologicalRootPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootAccess().getOntologicalRootOntologicalRootPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRoot__OntologicalRootAssignment_2_0"


    // $ANTLR start "rule__OntologicalRoot__OntologicalRootAssignment_2_1_1"
    // InternalOntologicalParser.g:5643:1: rule__OntologicalRoot__OntologicalRootAssignment_2_1_1 : ( ruleOntologicalRootPropertiesAbstract ) ;
    public final void rule__OntologicalRoot__OntologicalRootAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5647:1: ( ( ruleOntologicalRootPropertiesAbstract ) )
            // InternalOntologicalParser.g:5648:2: ( ruleOntologicalRootPropertiesAbstract )
            {
            // InternalOntologicalParser.g:5648:2: ( ruleOntologicalRootPropertiesAbstract )
            // InternalOntologicalParser.g:5649:3: ruleOntologicalRootPropertiesAbstract
            {
             before(grammarAccess.getOntologicalRootAccess().getOntologicalRootOntologicalRootPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootAccess().getOntologicalRootOntologicalRootPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRoot__OntologicalRootAssignment_2_1_1"


    // $ANTLR start "rule__OntologicalRootName__NameAssignment_3"
    // InternalOntologicalParser.g:5658:1: rule__OntologicalRootName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OntologicalRootName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5662:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:5663:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:5663:2: ( ruleEString )
            // InternalOntologicalParser.g:5664:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootName__NameAssignment_3"


    // $ANTLR start "rule__OntologicalRootURI__URIAssignment_2"
    // InternalOntologicalParser.g:5673:1: rule__OntologicalRootURI__URIAssignment_2 : ( ruleEString ) ;
    public final void rule__OntologicalRootURI__URIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5677:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:5678:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:5678:2: ( ruleEString )
            // InternalOntologicalParser.g:5679:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootURIAccess().getURIEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootURIAccess().getURIEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootURI__URIAssignment_2"


    // $ANTLR start "rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2"
    // InternalOntologicalParser.g:5688:1: rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5692:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:5693:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:5693:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:5694:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootOnlyCodesAccess().getOnlyCodesEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootOnlyCodesAccess().getOnlyCodesEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2"


    // $ANTLR start "rule__OntologicalRootBluetooth__BluetoothAssignment_2"
    // InternalOntologicalParser.g:5703:1: rule__OntologicalRootBluetooth__BluetoothAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootBluetooth__BluetoothAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5707:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:5708:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:5708:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:5709:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootBluetoothAccess().getBluetoothEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootBluetoothAccess().getBluetoothEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootBluetooth__BluetoothAssignment_2"


    // $ANTLR start "rule__OntologicalRootExternal__ExternalAssignment_2"
    // InternalOntologicalParser.g:5718:1: rule__OntologicalRootExternal__ExternalAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootExternal__ExternalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5722:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:5723:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:5723:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:5724:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootExternalAccess().getExternalEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootExternalAccess().getExternalEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootExternal__ExternalAssignment_2"


    // $ANTLR start "rule__OntologicalRootFirebase__FirebaseAssignment_2"
    // InternalOntologicalParser.g:5733:1: rule__OntologicalRootFirebase__FirebaseAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootFirebase__FirebaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5737:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:5738:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:5738:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:5739:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootFirebaseAccess().getFirebaseEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootFirebaseAccess().getFirebaseEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootFirebase__FirebaseAssignment_2"


    // $ANTLR start "rule__OntologicalRootPhysics__PhysicsAssignment_2"
    // InternalOntologicalParser.g:5748:1: rule__OntologicalRootPhysics__PhysicsAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootPhysics__PhysicsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5752:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:5753:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:5753:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:5754:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootPhysicsAccess().getPhysicsEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootPhysicsAccess().getPhysicsEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootPhysics__PhysicsAssignment_2"


    // $ANTLR start "rule__OntologicalRootGameloop__GameloopAssignment_2"
    // InternalOntologicalParser.g:5763:1: rule__OntologicalRootGameloop__GameloopAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootGameloop__GameloopAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5767:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:5768:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:5768:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:5769:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootGameloopAccess().getGameloopEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootGameloopAccess().getGameloopEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootGameloop__GameloopAssignment_2"


    // $ANTLR start "rule__OntologicalRootClasses__ClassesAssignment_4_0"
    // InternalOntologicalParser.g:5778:1: rule__OntologicalRootClasses__ClassesAssignment_4_0 : ( ruleOntologicalRootClassesItems ) ;
    public final void rule__OntologicalRootClasses__ClassesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5782:1: ( ( ruleOntologicalRootClassesItems ) )
            // InternalOntologicalParser.g:5783:2: ( ruleOntologicalRootClassesItems )
            {
            // InternalOntologicalParser.g:5783:2: ( ruleOntologicalRootClassesItems )
            // InternalOntologicalParser.g:5784:3: ruleOntologicalRootClassesItems
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getClassesOntologicalRootClassesItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootClassesItems();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesAccess().getClassesOntologicalRootClassesItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClasses__ClassesAssignment_4_0"


    // $ANTLR start "rule__OntologicalRootClasses__ClassesAssignment_4_1_1"
    // InternalOntologicalParser.g:5793:1: rule__OntologicalRootClasses__ClassesAssignment_4_1_1 : ( ruleOntologicalRootClassesItems ) ;
    public final void rule__OntologicalRootClasses__ClassesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5797:1: ( ( ruleOntologicalRootClassesItems ) )
            // InternalOntologicalParser.g:5798:2: ( ruleOntologicalRootClassesItems )
            {
            // InternalOntologicalParser.g:5798:2: ( ruleOntologicalRootClassesItems )
            // InternalOntologicalParser.g:5799:3: ruleOntologicalRootClassesItems
            {
             before(grammarAccess.getOntologicalRootClassesAccess().getClassesOntologicalRootClassesItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootClassesItems();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesAccess().getClassesOntologicalRootClassesItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClasses__ClassesAssignment_4_1_1"


    // $ANTLR start "rule__OntologicalRootClassesItems__ItemsAssignment_2_0"
    // InternalOntologicalParser.g:5808:1: rule__OntologicalRootClassesItems__ItemsAssignment_2_0 : ( ruleOntologicalRootClassesItemsPropertiesAbstract ) ;
    public final void rule__OntologicalRootClassesItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5812:1: ( ( ruleOntologicalRootClassesItemsPropertiesAbstract ) )
            // InternalOntologicalParser.g:5813:2: ( ruleOntologicalRootClassesItemsPropertiesAbstract )
            {
            // InternalOntologicalParser.g:5813:2: ( ruleOntologicalRootClassesItemsPropertiesAbstract )
            // InternalOntologicalParser.g:5814:3: ruleOntologicalRootClassesItemsPropertiesAbstract
            {
             before(grammarAccess.getOntologicalRootClassesItemsAccess().getItemsOntologicalRootClassesItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootClassesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAccess().getItemsOntologicalRootClassesItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1"
    // InternalOntologicalParser.g:5823:1: rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1 : ( ruleOntologicalRootClassesItemsPropertiesAbstract ) ;
    public final void rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5827:1: ( ( ruleOntologicalRootClassesItemsPropertiesAbstract ) )
            // InternalOntologicalParser.g:5828:2: ( ruleOntologicalRootClassesItemsPropertiesAbstract )
            {
            // InternalOntologicalParser.g:5828:2: ( ruleOntologicalRootClassesItemsPropertiesAbstract )
            // InternalOntologicalParser.g:5829:3: ruleOntologicalRootClassesItemsPropertiesAbstract
            {
             before(grammarAccess.getOntologicalRootClassesItemsAccess().getItemsOntologicalRootClassesItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootClassesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAccess().getItemsOntologicalRootClassesItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__OntologicalRootClassesItemsName__NameAssignment_3"
    // InternalOntologicalParser.g:5838:1: rule__OntologicalRootClassesItemsName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5842:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:5843:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:5843:2: ( ruleEString )
            // InternalOntologicalParser.g:5844:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsName__NameAssignment_3"


    // $ANTLR start "rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2"
    // InternalOntologicalParser.g:5853:1: rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5857:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:5858:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:5858:2: ( ruleEString )
            // InternalOntologicalParser.g:5859:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getAbstractEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getAbstractEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0"
    // InternalOntologicalParser.g:5868:1: rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0 : ( ruleOntologicalRootClassesItemsAttributesItems ) ;
    public final void rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5872:1: ( ( ruleOntologicalRootClassesItemsAttributesItems ) )
            // InternalOntologicalParser.g:5873:2: ( ruleOntologicalRootClassesItemsAttributesItems )
            {
            // InternalOntologicalParser.g:5873:2: ( ruleOntologicalRootClassesItemsAttributesItems )
            // InternalOntologicalParser.g:5874:3: ruleOntologicalRootClassesItemsAttributesItems
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesOntologicalRootClassesItemsAttributesItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootClassesItemsAttributesItems();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesOntologicalRootClassesItemsAttributesItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1"
    // InternalOntologicalParser.g:5883:1: rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1 : ( ruleOntologicalRootClassesItemsAttributesItems ) ;
    public final void rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5887:1: ( ( ruleOntologicalRootClassesItemsAttributesItems ) )
            // InternalOntologicalParser.g:5888:2: ( ruleOntologicalRootClassesItemsAttributesItems )
            {
            // InternalOntologicalParser.g:5888:2: ( ruleOntologicalRootClassesItemsAttributesItems )
            // InternalOntologicalParser.g:5889:3: ruleOntologicalRootClassesItemsAttributesItems
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesOntologicalRootClassesItemsAttributesItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootClassesItemsAttributesItems();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesOntologicalRootClassesItemsAttributesItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0"
    // InternalOntologicalParser.g:5898:1: rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0 : ( ruleOntologicalRootClassesItemsReferencesItems ) ;
    public final void rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5902:1: ( ( ruleOntologicalRootClassesItemsReferencesItems ) )
            // InternalOntologicalParser.g:5903:2: ( ruleOntologicalRootClassesItemsReferencesItems )
            {
            // InternalOntologicalParser.g:5903:2: ( ruleOntologicalRootClassesItemsReferencesItems )
            // InternalOntologicalParser.g:5904:3: ruleOntologicalRootClassesItemsReferencesItems
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesOntologicalRootClassesItemsReferencesItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootClassesItemsReferencesItems();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesOntologicalRootClassesItemsReferencesItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1"
    // InternalOntologicalParser.g:5913:1: rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1 : ( ruleOntologicalRootClassesItemsReferencesItems ) ;
    public final void rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5917:1: ( ( ruleOntologicalRootClassesItemsReferencesItems ) )
            // InternalOntologicalParser.g:5918:2: ( ruleOntologicalRootClassesItemsReferencesItems )
            {
            // InternalOntologicalParser.g:5918:2: ( ruleOntologicalRootClassesItemsReferencesItems )
            // InternalOntologicalParser.g:5919:3: ruleOntologicalRootClassesItemsReferencesItems
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesOntologicalRootClassesItemsReferencesItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootClassesItemsReferencesItems();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesOntologicalRootClassesItemsReferencesItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2"
    // InternalOntologicalParser.g:5928:1: rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5932:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:5933:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:5933:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:5934:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getAutoIDEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getAutoIDEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2"
    // InternalOntologicalParser.g:5943:1: rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5947:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:5948:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:5948:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:5949:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getOnlyCodesEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getOnlyCodesEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2"
    // InternalOntologicalParser.g:5958:1: rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5962:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:5963:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:5963:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:5964:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getBluetoothEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getBluetoothEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2"
    // InternalOntologicalParser.g:5973:1: rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5977:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:5978:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:5978:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:5979:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getNoSCNEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getNoSCNEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0"
    // InternalOntologicalParser.g:5988:1: rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0 : ( ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:5992:1: ( ( ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) )
            // InternalOntologicalParser.g:5993:2: ( ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract )
            {
            // InternalOntologicalParser.g:5993:2: ( ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract )
            // InternalOntologicalParser.g:5994:3: ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getItemsOntologicalRootClassesItemsAttributesItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getItemsOntologicalRootClassesItemsAttributesItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1"
    // InternalOntologicalParser.g:6003:1: rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1 : ( ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6007:1: ( ( ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract ) )
            // InternalOntologicalParser.g:6008:2: ( ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract )
            {
            // InternalOntologicalParser.g:6008:2: ( ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract )
            // InternalOntologicalParser.g:6009:3: ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getItemsOntologicalRootClassesItemsAttributesItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootClassesItemsAttributesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getItemsOntologicalRootClassesItemsAttributesItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3"
    // InternalOntologicalParser.g:6018:1: rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6022:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:6023:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:6023:2: ( ruleEString )
            // InternalOntologicalParser.g:6024:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2"
    // InternalOntologicalParser.g:6033:1: rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6037:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:6038:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:6038:2: ( ruleEString )
            // InternalOntologicalParser.g:6039:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getTypeEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getTypeEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2"
    // InternalOntologicalParser.g:6048:1: rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6052:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:6053:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:6053:2: ( ruleEString )
            // InternalOntologicalParser.g:6054:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getMinEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getMinEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2"
    // InternalOntologicalParser.g:6063:1: rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6067:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:6068:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:6068:2: ( ruleEString )
            // InternalOntologicalParser.g:6069:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getMaxEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getMaxEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2"
    // InternalOntologicalParser.g:6078:1: rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6082:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:6083:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:6083:2: ( ruleEString )
            // InternalOntologicalParser.g:6084:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getDefaultEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getDefaultEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2"
    // InternalOntologicalParser.g:6093:1: rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6097:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:6098:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:6098:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:6099:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getReadOnlyEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getReadOnlyEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2"
    // InternalOntologicalParser.g:6108:1: rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6112:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:6113:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:6113:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:6114:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getIsParamEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getIsParamEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2"
    // InternalOntologicalParser.g:6123:1: rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6127:1: ( ( ruleEBooleanObject ) )
            // InternalOntologicalParser.g:6128:2: ( ruleEBooleanObject )
            {
            // InternalOntologicalParser.g:6128:2: ( ruleEBooleanObject )
            // InternalOntologicalParser.g:6129:3: ruleEBooleanObject
            {
             before(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getIsKeyEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getIsKeyEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0"
    // InternalOntologicalParser.g:6138:1: rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0 : ( ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6142:1: ( ( ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) )
            // InternalOntologicalParser.g:6143:2: ( ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract )
            {
            // InternalOntologicalParser.g:6143:2: ( ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract )
            // InternalOntologicalParser.g:6144:3: ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getItemsOntologicalRootClassesItemsReferencesItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getItemsOntologicalRootClassesItemsReferencesItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1"
    // InternalOntologicalParser.g:6153:1: rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1 : ( ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6157:1: ( ( ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract ) )
            // InternalOntologicalParser.g:6158:2: ( ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract )
            {
            // InternalOntologicalParser.g:6158:2: ( ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract )
            // InternalOntologicalParser.g:6159:3: ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getItemsOntologicalRootClassesItemsReferencesItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOntologicalRootClassesItemsReferencesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getItemsOntologicalRootClassesItemsReferencesItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3"
    // InternalOntologicalParser.g:6168:1: rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6172:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:6173:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:6173:2: ( ruleEString )
            // InternalOntologicalParser.g:6174:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2"
    // InternalOntologicalParser.g:6183:1: rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6187:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:6188:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:6188:2: ( ruleEString )
            // InternalOntologicalParser.g:6189:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getContaintmentEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getContaintmentEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2"
    // InternalOntologicalParser.g:6198:1: rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6202:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:6203:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:6203:2: ( ruleEString )
            // InternalOntologicalParser.g:6204:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getMinEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getMinEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2"
    // InternalOntologicalParser.g:6213:1: rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6217:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:6218:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:6218:2: ( ruleEString )
            // InternalOntologicalParser.g:6219:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getMaxEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getMaxEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2"
    // InternalOntologicalParser.g:6228:1: rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6232:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:6233:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:6233:2: ( ruleEString )
            // InternalOntologicalParser.g:6234:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getTargetEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getTargetEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2"


    // $ANTLR start "rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2"
    // InternalOntologicalParser.g:6243:1: rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2 : ( ruleEString ) ;
    public final void rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntologicalParser.g:6247:1: ( ( ruleEString ) )
            // InternalOntologicalParser.g:6248:2: ( ruleEString )
            {
            // InternalOntologicalParser.g:6248:2: ( ruleEString )
            // InternalOntologicalParser.g:6249:3: ruleEString
            {
             before(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getOppositeEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getOppositeEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000802849D80L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002849D80L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000200FFFFFF0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800C803E0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C803E0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000080DA34000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000DA34000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000080C902010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C902010L});

}