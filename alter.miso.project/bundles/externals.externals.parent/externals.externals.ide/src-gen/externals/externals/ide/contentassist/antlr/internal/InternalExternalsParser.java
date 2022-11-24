package externals.externals.ide.contentassist.antlr.internal;
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
import externals.externals.services.ExternalsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExternalsParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Key", "'\"key\"'");
    		tokenNameToValue.put("Url", "'\"url\"'");
    		tokenNameToValue.put("Name", "'\"name\"'");
    		tokenNameToValue.put("Type", "'\"type\"'");
    		tokenNameToValue.put("Paths", "'\"paths\"'");
    		tokenNameToValue.put("Route", "'\"route\"'");
    		tokenNameToValue.put("APIAuth", "'\"APIAuth\"'");
    		tokenNameToValue.put("Outputs", "'\"outputs\"'");
    		tokenNameToValue.put("JSONPath", "'\"JSONPath\"'");
    		tokenNameToValue.put("Protocol", "'\"protocol\"'");
    		tokenNameToValue.put("Parameters", "'\"parameters\"'");
    		tokenNameToValue.put("APIDescriptions", "'\"APIDescriptions\"'");
    	}

    	public void setGrammarAccess(ExternalsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleExternalsRoot"
    // InternalExternalsParser.g:73:1: entryRuleExternalsRoot : ruleExternalsRoot EOF ;
    public final void entryRuleExternalsRoot() throws RecognitionException {
        try {
            // InternalExternalsParser.g:74:1: ( ruleExternalsRoot EOF )
            // InternalExternalsParser.g:75:1: ruleExternalsRoot EOF
            {
             before(grammarAccess.getExternalsRootRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRoot();

            state._fsp--;

             after(grammarAccess.getExternalsRootRule()); 
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
    // $ANTLR end "entryRuleExternalsRoot"


    // $ANTLR start "ruleExternalsRoot"
    // InternalExternalsParser.g:82:1: ruleExternalsRoot : ( ( rule__ExternalsRoot__Group__0 ) ) ;
    public final void ruleExternalsRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:86:2: ( ( ( rule__ExternalsRoot__Group__0 ) ) )
            // InternalExternalsParser.g:87:2: ( ( rule__ExternalsRoot__Group__0 ) )
            {
            // InternalExternalsParser.g:87:2: ( ( rule__ExternalsRoot__Group__0 ) )
            // InternalExternalsParser.g:88:3: ( rule__ExternalsRoot__Group__0 )
            {
             before(grammarAccess.getExternalsRootAccess().getGroup()); 
            // InternalExternalsParser.g:89:3: ( rule__ExternalsRoot__Group__0 )
            // InternalExternalsParser.g:89:4: rule__ExternalsRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRoot"


    // $ANTLR start "entryRuleExternalsRootPropertiesAbstract"
    // InternalExternalsParser.g:98:1: entryRuleExternalsRootPropertiesAbstract : ruleExternalsRootPropertiesAbstract EOF ;
    public final void entryRuleExternalsRootPropertiesAbstract() throws RecognitionException {
        try {
            // InternalExternalsParser.g:99:1: ( ruleExternalsRootPropertiesAbstract EOF )
            // InternalExternalsParser.g:100:1: ruleExternalsRootPropertiesAbstract EOF
            {
             before(grammarAccess.getExternalsRootPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleExternalsRootPropertiesAbstract"


    // $ANTLR start "ruleExternalsRootPropertiesAbstract"
    // InternalExternalsParser.g:107:1: ruleExternalsRootPropertiesAbstract : ( ruleExternalsRootAPIDescriptions ) ;
    public final void ruleExternalsRootPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:111:2: ( ( ruleExternalsRootAPIDescriptions ) )
            // InternalExternalsParser.g:112:2: ( ruleExternalsRootAPIDescriptions )
            {
            // InternalExternalsParser.g:112:2: ( ruleExternalsRootAPIDescriptions )
            // InternalExternalsParser.g:113:3: ruleExternalsRootAPIDescriptions
            {
             before(grammarAccess.getExternalsRootPropertiesAbstractAccess().getExternalsRootAPIDescriptionsParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptions();

            state._fsp--;

             after(grammarAccess.getExternalsRootPropertiesAbstractAccess().getExternalsRootAPIDescriptionsParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootPropertiesAbstract"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPropertiesAbstract"
    // InternalExternalsParser.g:123:1: entryRuleExternalsRootAPIDescriptionsItemsPropertiesAbstract : ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalExternalsParser.g:124:1: ( ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract EOF )
            // InternalExternalsParser.g:125:1: ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPropertiesAbstract"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract"
    // InternalExternalsParser.g:132:1: ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract : ( ( rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:136:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives ) ) )
            // InternalExternalsParser.g:137:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalExternalsParser.g:137:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives ) )
            // InternalExternalsParser.g:138:3: ( rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalExternalsParser.g:139:3: ( rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives )
            // InternalExternalsParser.g:139:4: rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract"
    // InternalExternalsParser.g:148:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract : ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalExternalsParser.g:149:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract EOF )
            // InternalExternalsParser.g:150:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract"
    // InternalExternalsParser.g:157:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:161:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives ) ) )
            // InternalExternalsParser.g:162:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalExternalsParser.g:162:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives ) )
            // InternalExternalsParser.g:163:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalExternalsParser.g:164:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives )
            // InternalExternalsParser.g:164:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract"
    // InternalExternalsParser.g:173:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract : ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalExternalsParser.g:174:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract EOF )
            // InternalExternalsParser.g:175:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract"
    // InternalExternalsParser.g:182:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:186:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives ) ) )
            // InternalExternalsParser.g:187:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalExternalsParser.g:187:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives ) )
            // InternalExternalsParser.g:188:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalExternalsParser.g:189:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives )
            // InternalExternalsParser.g:189:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract"
    // InternalExternalsParser.g:198:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract : ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalExternalsParser.g:199:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract EOF )
            // InternalExternalsParser.g:200:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract"
    // InternalExternalsParser.g:207:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:211:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives ) ) )
            // InternalExternalsParser.g:212:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalExternalsParser.g:212:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives ) )
            // InternalExternalsParser.g:213:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalExternalsParser.g:214:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives )
            // InternalExternalsParser.g:214:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract"
    // InternalExternalsParser.g:223:1: entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract : ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalExternalsParser.g:224:1: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract EOF )
            // InternalExternalsParser.g:225:1: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract"
    // InternalExternalsParser.g:232:1: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:236:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives ) ) )
            // InternalExternalsParser.g:237:2: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalExternalsParser.g:237:2: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives ) )
            // InternalExternalsParser.g:238:3: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalExternalsParser.g:239:3: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives )
            // InternalExternalsParser.g:239:4: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptions"
    // InternalExternalsParser.g:248:1: entryRuleExternalsRootAPIDescriptions : ruleExternalsRootAPIDescriptions EOF ;
    public final void entryRuleExternalsRootAPIDescriptions() throws RecognitionException {
        try {
            // InternalExternalsParser.g:249:1: ( ruleExternalsRootAPIDescriptions EOF )
            // InternalExternalsParser.g:250:1: ruleExternalsRootAPIDescriptions EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptions();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptions"


    // $ANTLR start "ruleExternalsRootAPIDescriptions"
    // InternalExternalsParser.g:257:1: ruleExternalsRootAPIDescriptions : ( ( rule__ExternalsRootAPIDescriptions__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:261:2: ( ( ( rule__ExternalsRootAPIDescriptions__Group__0 ) ) )
            // InternalExternalsParser.g:262:2: ( ( rule__ExternalsRootAPIDescriptions__Group__0 ) )
            {
            // InternalExternalsParser.g:262:2: ( ( rule__ExternalsRootAPIDescriptions__Group__0 ) )
            // InternalExternalsParser.g:263:3: ( rule__ExternalsRootAPIDescriptions__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getGroup()); 
            // InternalExternalsParser.g:264:3: ( rule__ExternalsRootAPIDescriptions__Group__0 )
            // InternalExternalsParser.g:264:4: rule__ExternalsRootAPIDescriptions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptions"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItems"
    // InternalExternalsParser.g:273:1: entryRuleExternalsRootAPIDescriptionsItems : ruleExternalsRootAPIDescriptionsItems EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItems() throws RecognitionException {
        try {
            // InternalExternalsParser.g:274:1: ( ruleExternalsRootAPIDescriptionsItems EOF )
            // InternalExternalsParser.g:275:1: ruleExternalsRootAPIDescriptionsItems EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItems"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItems"
    // InternalExternalsParser.g:282:1: ruleExternalsRootAPIDescriptionsItems : ( ( rule__ExternalsRootAPIDescriptionsItems__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:286:2: ( ( ( rule__ExternalsRootAPIDescriptionsItems__Group__0 ) ) )
            // InternalExternalsParser.g:287:2: ( ( rule__ExternalsRootAPIDescriptionsItems__Group__0 ) )
            {
            // InternalExternalsParser.g:287:2: ( ( rule__ExternalsRootAPIDescriptionsItems__Group__0 ) )
            // InternalExternalsParser.g:288:3: ( rule__ExternalsRootAPIDescriptionsItems__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getGroup()); 
            // InternalExternalsParser.g:289:3: ( rule__ExternalsRootAPIDescriptionsItems__Group__0 )
            // InternalExternalsParser.g:289:4: rule__ExternalsRootAPIDescriptionsItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItems"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsName"
    // InternalExternalsParser.g:298:1: entryRuleExternalsRootAPIDescriptionsItemsName : ruleExternalsRootAPIDescriptionsItemsName EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsName() throws RecognitionException {
        try {
            // InternalExternalsParser.g:299:1: ( ruleExternalsRootAPIDescriptionsItemsName EOF )
            // InternalExternalsParser.g:300:1: ruleExternalsRootAPIDescriptionsItemsName EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsNameRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsName();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsNameRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsName"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsName"
    // InternalExternalsParser.g:307:1: ruleExternalsRootAPIDescriptionsItemsName : ( ( rule__ExternalsRootAPIDescriptionsItemsName__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:311:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsName__Group__0 ) ) )
            // InternalExternalsParser.g:312:2: ( ( rule__ExternalsRootAPIDescriptionsItemsName__Group__0 ) )
            {
            // InternalExternalsParser.g:312:2: ( ( rule__ExternalsRootAPIDescriptionsItemsName__Group__0 ) )
            // InternalExternalsParser.g:313:3: ( rule__ExternalsRootAPIDescriptionsItemsName__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getGroup()); 
            // InternalExternalsParser.g:314:3: ( rule__ExternalsRootAPIDescriptionsItemsName__Group__0 )
            // InternalExternalsParser.g:314:4: rule__ExternalsRootAPIDescriptionsItemsName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsName"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsProtocol"
    // InternalExternalsParser.g:323:1: entryRuleExternalsRootAPIDescriptionsItemsProtocol : ruleExternalsRootAPIDescriptionsItemsProtocol EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsProtocol() throws RecognitionException {
        try {
            // InternalExternalsParser.g:324:1: ( ruleExternalsRootAPIDescriptionsItemsProtocol EOF )
            // InternalExternalsParser.g:325:1: ruleExternalsRootAPIDescriptionsItemsProtocol EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsProtocol();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsProtocol"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsProtocol"
    // InternalExternalsParser.g:332:1: ruleExternalsRootAPIDescriptionsItemsProtocol : ( ( rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:336:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0 ) ) )
            // InternalExternalsParser.g:337:2: ( ( rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0 ) )
            {
            // InternalExternalsParser.g:337:2: ( ( rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0 ) )
            // InternalExternalsParser.g:338:3: ( rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getGroup()); 
            // InternalExternalsParser.g:339:3: ( rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0 )
            // InternalExternalsParser.g:339:4: rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsProtocol"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsUrl"
    // InternalExternalsParser.g:348:1: entryRuleExternalsRootAPIDescriptionsItemsUrl : ruleExternalsRootAPIDescriptionsItemsUrl EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsUrl() throws RecognitionException {
        try {
            // InternalExternalsParser.g:349:1: ( ruleExternalsRootAPIDescriptionsItemsUrl EOF )
            // InternalExternalsParser.g:350:1: ruleExternalsRootAPIDescriptionsItemsUrl EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsUrl();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsUrl"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsUrl"
    // InternalExternalsParser.g:357:1: ruleExternalsRootAPIDescriptionsItemsUrl : ( ( rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsUrl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:361:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0 ) ) )
            // InternalExternalsParser.g:362:2: ( ( rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0 ) )
            {
            // InternalExternalsParser.g:362:2: ( ( rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0 ) )
            // InternalExternalsParser.g:363:3: ( rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getGroup()); 
            // InternalExternalsParser.g:364:3: ( rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0 )
            // InternalExternalsParser.g:364:4: rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsUrl"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPaths"
    // InternalExternalsParser.g:373:1: entryRuleExternalsRootAPIDescriptionsItemsPaths : ruleExternalsRootAPIDescriptionsItemsPaths EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPaths() throws RecognitionException {
        try {
            // InternalExternalsParser.g:374:1: ( ruleExternalsRootAPIDescriptionsItemsPaths EOF )
            // InternalExternalsParser.g:375:1: ruleExternalsRootAPIDescriptionsItemsPaths EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPaths();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPaths"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPaths"
    // InternalExternalsParser.g:382:1: ruleExternalsRootAPIDescriptionsItemsPaths : ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPaths() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:386:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0 ) ) )
            // InternalExternalsParser.g:387:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0 ) )
            {
            // InternalExternalsParser.g:387:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0 ) )
            // InternalExternalsParser.g:388:3: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getGroup()); 
            // InternalExternalsParser.g:389:3: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0 )
            // InternalExternalsParser.g:389:4: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPaths"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsAPIAuth"
    // InternalExternalsParser.g:398:1: entryRuleExternalsRootAPIDescriptionsItemsAPIAuth : ruleExternalsRootAPIDescriptionsItemsAPIAuth EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsAPIAuth() throws RecognitionException {
        try {
            // InternalExternalsParser.g:399:1: ( ruleExternalsRootAPIDescriptionsItemsAPIAuth EOF )
            // InternalExternalsParser.g:400:1: ruleExternalsRootAPIDescriptionsItemsAPIAuth EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsAPIAuth();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsAPIAuth"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsAPIAuth"
    // InternalExternalsParser.g:407:1: ruleExternalsRootAPIDescriptionsItemsAPIAuth : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsAPIAuth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:411:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0 ) ) )
            // InternalExternalsParser.g:412:2: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0 ) )
            {
            // InternalExternalsParser.g:412:2: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0 ) )
            // InternalExternalsParser.g:413:3: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getGroup()); 
            // InternalExternalsParser.g:414:3: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0 )
            // InternalExternalsParser.g:414:4: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsAPIAuth"


    // $ANTLR start "entryRuleEString"
    // InternalExternalsParser.g:423:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalExternalsParser.g:424:1: ( ruleEString EOF )
            // InternalExternalsParser.g:425:1: ruleEString EOF
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
    // InternalExternalsParser.g:432:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:436:2: ( ( ruleVALID_STRING ) )
            // InternalExternalsParser.g:437:2: ( ruleVALID_STRING )
            {
            // InternalExternalsParser.g:437:2: ( ruleVALID_STRING )
            // InternalExternalsParser.g:438:3: ruleVALID_STRING
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


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItems"
    // InternalExternalsParser.g:448:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItems : ruleExternalsRootAPIDescriptionsItemsPathsItems EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItems() throws RecognitionException {
        try {
            // InternalExternalsParser.g:449:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItems EOF )
            // InternalExternalsParser.g:450:1: ruleExternalsRootAPIDescriptionsItemsPathsItems EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItems"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItems"
    // InternalExternalsParser.g:457:1: ruleExternalsRootAPIDescriptionsItemsPathsItems : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:461:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0 ) ) )
            // InternalExternalsParser.g:462:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0 ) )
            {
            // InternalExternalsParser.g:462:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0 ) )
            // InternalExternalsParser.g:463:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getGroup()); 
            // InternalExternalsParser.g:464:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0 )
            // InternalExternalsParser.g:464:4: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItems"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsRoute"
    // InternalExternalsParser.g:473:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsRoute : ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsRoute() throws RecognitionException {
        try {
            // InternalExternalsParser.g:474:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute EOF )
            // InternalExternalsParser.g:475:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsRoute"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute"
    // InternalExternalsParser.g:482:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:486:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0 ) ) )
            // InternalExternalsParser.g:487:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0 ) )
            {
            // InternalExternalsParser.g:487:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0 ) )
            // InternalExternalsParser.g:488:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getGroup()); 
            // InternalExternalsParser.g:489:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0 )
            // InternalExternalsParser.g:489:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParameters"
    // InternalExternalsParser.g:498:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParameters : ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParameters() throws RecognitionException {
        try {
            // InternalExternalsParser.g:499:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters EOF )
            // InternalExternalsParser.g:500:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParameters"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters"
    // InternalExternalsParser.g:507:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:511:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0 ) ) )
            // InternalExternalsParser.g:512:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0 ) )
            {
            // InternalExternalsParser.g:512:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0 ) )
            // InternalExternalsParser.g:513:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getGroup()); 
            // InternalExternalsParser.g:514:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0 )
            // InternalExternalsParser.g:514:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputs"
    // InternalExternalsParser.g:523:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputs : ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputs() throws RecognitionException {
        try {
            // InternalExternalsParser.g:524:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs EOF )
            // InternalExternalsParser.g:525:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputs"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs"
    // InternalExternalsParser.g:532:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:536:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0 ) ) )
            // InternalExternalsParser.g:537:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0 ) )
            {
            // InternalExternalsParser.g:537:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0 ) )
            // InternalExternalsParser.g:538:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getGroup()); 
            // InternalExternalsParser.g:539:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0 )
            // InternalExternalsParser.g:539:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems"
    // InternalExternalsParser.g:548:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems : ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems() throws RecognitionException {
        try {
            // InternalExternalsParser.g:549:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems EOF )
            // InternalExternalsParser.g:550:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems"
    // InternalExternalsParser.g:557:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:561:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0 ) ) )
            // InternalExternalsParser.g:562:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0 ) )
            {
            // InternalExternalsParser.g:562:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0 ) )
            // InternalExternalsParser.g:563:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getGroup()); 
            // InternalExternalsParser.g:564:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0 )
            // InternalExternalsParser.g:564:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName"
    // InternalExternalsParser.g:573:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName : ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName() throws RecognitionException {
        try {
            // InternalExternalsParser.g:574:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName EOF )
            // InternalExternalsParser.g:575:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName"
    // InternalExternalsParser.g:582:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:586:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0 ) ) )
            // InternalExternalsParser.g:587:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0 ) )
            {
            // InternalExternalsParser.g:587:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0 ) )
            // InternalExternalsParser.g:588:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getGroup()); 
            // InternalExternalsParser.g:589:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0 )
            // InternalExternalsParser.g:589:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType"
    // InternalExternalsParser.g:598:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType : ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType() throws RecognitionException {
        try {
            // InternalExternalsParser.g:599:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType EOF )
            // InternalExternalsParser.g:600:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType"
    // InternalExternalsParser.g:607:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:611:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0 ) ) )
            // InternalExternalsParser.g:612:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0 ) )
            {
            // InternalExternalsParser.g:612:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0 ) )
            // InternalExternalsParser.g:613:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getGroup()); 
            // InternalExternalsParser.g:614:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0 )
            // InternalExternalsParser.g:614:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems"
    // InternalExternalsParser.g:623:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems : ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems() throws RecognitionException {
        try {
            // InternalExternalsParser.g:624:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems EOF )
            // InternalExternalsParser.g:625:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems"
    // InternalExternalsParser.g:632:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:636:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0 ) ) )
            // InternalExternalsParser.g:637:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0 ) )
            {
            // InternalExternalsParser.g:637:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0 ) )
            // InternalExternalsParser.g:638:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getGroup()); 
            // InternalExternalsParser.g:639:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0 )
            // InternalExternalsParser.g:639:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName"
    // InternalExternalsParser.g:648:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName : ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName() throws RecognitionException {
        try {
            // InternalExternalsParser.g:649:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName EOF )
            // InternalExternalsParser.g:650:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName"
    // InternalExternalsParser.g:657:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:661:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0 ) ) )
            // InternalExternalsParser.g:662:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0 ) )
            {
            // InternalExternalsParser.g:662:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0 ) )
            // InternalExternalsParser.g:663:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getGroup()); 
            // InternalExternalsParser.g:664:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0 )
            // InternalExternalsParser.g:664:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType"
    // InternalExternalsParser.g:673:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType : ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType() throws RecognitionException {
        try {
            // InternalExternalsParser.g:674:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType EOF )
            // InternalExternalsParser.g:675:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType"
    // InternalExternalsParser.g:682:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:686:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0 ) ) )
            // InternalExternalsParser.g:687:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0 ) )
            {
            // InternalExternalsParser.g:687:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0 ) )
            // InternalExternalsParser.g:688:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getGroup()); 
            // InternalExternalsParser.g:689:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0 )
            // InternalExternalsParser.g:689:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath"
    // InternalExternalsParser.g:698:1: entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath : ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath() throws RecognitionException {
        try {
            // InternalExternalsParser.g:699:1: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath EOF )
            // InternalExternalsParser.g:700:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath"
    // InternalExternalsParser.g:707:1: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:711:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0 ) ) )
            // InternalExternalsParser.g:712:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0 ) )
            {
            // InternalExternalsParser.g:712:2: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0 ) )
            // InternalExternalsParser.g:713:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getGroup()); 
            // InternalExternalsParser.g:714:3: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0 )
            // InternalExternalsParser.g:714:4: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItems"
    // InternalExternalsParser.g:723:1: entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItems : ruleExternalsRootAPIDescriptionsItemsAPIAuthItems EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItems() throws RecognitionException {
        try {
            // InternalExternalsParser.g:724:1: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItems EOF )
            // InternalExternalsParser.g:725:1: ruleExternalsRootAPIDescriptionsItemsAPIAuthItems EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsAPIAuthItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItems"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsAPIAuthItems"
    // InternalExternalsParser.g:732:1: ruleExternalsRootAPIDescriptionsItemsAPIAuthItems : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsAPIAuthItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:736:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0 ) ) )
            // InternalExternalsParser.g:737:2: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0 ) )
            {
            // InternalExternalsParser.g:737:2: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0 ) )
            // InternalExternalsParser.g:738:3: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getGroup()); 
            // InternalExternalsParser.g:739:3: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0 )
            // InternalExternalsParser.g:739:4: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsAPIAuthItems"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsName"
    // InternalExternalsParser.g:748:1: entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsName : ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsName() throws RecognitionException {
        try {
            // InternalExternalsParser.g:749:1: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName EOF )
            // InternalExternalsParser.g:750:1: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsName"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName"
    // InternalExternalsParser.g:757:1: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:761:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0 ) ) )
            // InternalExternalsParser.g:762:2: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0 ) )
            {
            // InternalExternalsParser.g:762:2: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0 ) )
            // InternalExternalsParser.g:763:3: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getGroup()); 
            // InternalExternalsParser.g:764:3: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0 )
            // InternalExternalsParser.g:764:4: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName"


    // $ANTLR start "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey"
    // InternalExternalsParser.g:773:1: entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey : ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey EOF ;
    public final void entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey() throws RecognitionException {
        try {
            // InternalExternalsParser.g:774:1: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey EOF )
            // InternalExternalsParser.g:775:1: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey EOF
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyRule()); 
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
    // $ANTLR end "entryRuleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey"


    // $ANTLR start "ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey"
    // InternalExternalsParser.g:782:1: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0 ) ) ;
    public final void ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:786:2: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0 ) ) )
            // InternalExternalsParser.g:787:2: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0 ) )
            {
            // InternalExternalsParser.g:787:2: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0 ) )
            // InternalExternalsParser.g:788:3: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getGroup()); 
            // InternalExternalsParser.g:789:3: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0 )
            // InternalExternalsParser.g:789:4: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalExternalsParser.g:798:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalExternalsParser.g:799:1: ( ruleVALID_STRING EOF )
            // InternalExternalsParser.g:800:1: ruleVALID_STRING EOF
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
    // InternalExternalsParser.g:807:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:811:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalExternalsParser.g:812:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalExternalsParser.g:812:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalExternalsParser.g:813:3: ( rule__VALID_STRING__Alternatives )
            {
             before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            // InternalExternalsParser.g:814:3: ( rule__VALID_STRING__Alternatives )
            // InternalExternalsParser.g:814:4: rule__VALID_STRING__Alternatives
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
    // InternalExternalsParser.g:823:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalExternalsParser.g:824:1: ( ruleKEYWORD EOF )
            // InternalExternalsParser.g:825:1: ruleKEYWORD EOF
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
    // InternalExternalsParser.g:832:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:836:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalExternalsParser.g:837:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalExternalsParser.g:837:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalExternalsParser.g:838:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalExternalsParser.g:839:3: ( rule__KEYWORD__Alternatives )
            // InternalExternalsParser.g:839:4: rule__KEYWORD__Alternatives
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


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives"
    // InternalExternalsParser.g:847:1: rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives : ( ( ruleExternalsRootAPIDescriptionsItemsName ) | ( ruleExternalsRootAPIDescriptionsItemsProtocol ) | ( ruleExternalsRootAPIDescriptionsItemsUrl ) | ( ruleExternalsRootAPIDescriptionsItemsPaths ) | ( ruleExternalsRootAPIDescriptionsItemsAPIAuth ) );
    public final void rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:851:1: ( ( ruleExternalsRootAPIDescriptionsItemsName ) | ( ruleExternalsRootAPIDescriptionsItemsProtocol ) | ( ruleExternalsRootAPIDescriptionsItemsUrl ) | ( ruleExternalsRootAPIDescriptionsItemsPaths ) | ( ruleExternalsRootAPIDescriptionsItemsAPIAuth ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt1=1;
                }
                break;
            case Protocol:
                {
                alt1=2;
                }
                break;
            case Url:
                {
                alt1=3;
                }
                break;
            case Paths:
                {
                alt1=4;
                }
                break;
            case APIAuth:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalExternalsParser.g:852:2: ( ruleExternalsRootAPIDescriptionsItemsName )
                    {
                    // InternalExternalsParser.g:852:2: ( ruleExternalsRootAPIDescriptionsItemsName )
                    // InternalExternalsParser.g:853:3: ruleExternalsRootAPIDescriptionsItemsName
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsName();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:858:2: ( ruleExternalsRootAPIDescriptionsItemsProtocol )
                    {
                    // InternalExternalsParser.g:858:2: ( ruleExternalsRootAPIDescriptionsItemsProtocol )
                    // InternalExternalsParser.g:859:3: ruleExternalsRootAPIDescriptionsItemsProtocol
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsProtocolParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsProtocol();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsProtocolParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExternalsParser.g:864:2: ( ruleExternalsRootAPIDescriptionsItemsUrl )
                    {
                    // InternalExternalsParser.g:864:2: ( ruleExternalsRootAPIDescriptionsItemsUrl )
                    // InternalExternalsParser.g:865:3: ruleExternalsRootAPIDescriptionsItemsUrl
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsUrlParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsUrl();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsUrlParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExternalsParser.g:870:2: ( ruleExternalsRootAPIDescriptionsItemsPaths )
                    {
                    // InternalExternalsParser.g:870:2: ( ruleExternalsRootAPIDescriptionsItemsPaths )
                    // InternalExternalsParser.g:871:3: ruleExternalsRootAPIDescriptionsItemsPaths
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsPaths();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExternalsParser.g:876:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuth )
                    {
                    // InternalExternalsParser.g:876:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuth )
                    // InternalExternalsParser.g:877:3: ruleExternalsRootAPIDescriptionsItemsAPIAuth
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsAPIAuthParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsAPIAuth();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsAPIAuthParserRuleCall_4()); 

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
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives"
    // InternalExternalsParser.g:886:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives : ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute ) | ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters ) | ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs ) );
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:890:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute ) | ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters ) | ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case Route:
                {
                alt2=1;
                }
                break;
            case Parameters:
                {
                alt2=2;
                }
                break;
            case Outputs:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalExternalsParser.g:891:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute )
                    {
                    // InternalExternalsParser.g:891:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute )
                    // InternalExternalsParser.g:892:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsRouteParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsPathsItemsRoute();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsRouteParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:897:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters )
                    {
                    // InternalExternalsParser.g:897:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters )
                    // InternalExternalsParser.g:898:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsPathsItemsParameters();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExternalsParser.g:903:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs )
                    {
                    // InternalExternalsParser.g:903:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs )
                    // InternalExternalsParser.g:904:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputs();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsParserRuleCall_2()); 

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
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives"
    // InternalExternalsParser.g:913:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives : ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName ) | ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType ) );
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:917:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName ) | ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Name) ) {
                alt3=1;
            }
            else if ( (LA3_0==Type) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalExternalsParser.g:918:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName )
                    {
                    // InternalExternalsParser.g:918:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName )
                    // InternalExternalsParser.g:919:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:924:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType )
                    {
                    // InternalExternalsParser.g:924:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType )
                    // InternalExternalsParser.g:925:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives"
    // InternalExternalsParser.g:934:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives : ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName ) | ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType ) | ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath ) );
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:938:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName ) | ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType ) | ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt4=1;
                }
                break;
            case Type:
                {
                alt4=2;
                }
                break;
            case JSONPath:
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
                    // InternalExternalsParser.g:939:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName )
                    {
                    // InternalExternalsParser.g:939:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName )
                    // InternalExternalsParser.g:940:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:945:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType )
                    {
                    // InternalExternalsParser.g:945:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType )
                    // InternalExternalsParser.g:946:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExternalsParser.g:951:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath )
                    {
                    // InternalExternalsParser.g:951:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath )
                    // InternalExternalsParser.g:952:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathParserRuleCall_2()); 

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
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives"
    // InternalExternalsParser.g:961:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives : ( ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName ) | ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey ) );
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:965:1: ( ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName ) | ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Name) ) {
                alt5=1;
            }
            else if ( (LA5_0==Key) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalExternalsParser.g:966:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName )
                    {
                    // InternalExternalsParser.g:966:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName )
                    // InternalExternalsParser.g:967:3: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsName();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:972:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey )
                    {
                    // InternalExternalsParser.g:972:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey )
                    // InternalExternalsParser.g:973:3: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey
                    {
                     before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsKey();

                    state._fsp--;

                     after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractAccess().getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyParserRuleCall_1()); 

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
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__VALID_STRING__Alternatives"
    // InternalExternalsParser.g:982:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:986:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=APIDescriptions && LA6_0<=Url)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalExternalsParser.g:987:2: ( RULE_STRING )
                    {
                    // InternalExternalsParser.g:987:2: ( RULE_STRING )
                    // InternalExternalsParser.g:988:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:993:2: ( ruleKEYWORD )
                    {
                    // InternalExternalsParser.g:993:2: ( ruleKEYWORD )
                    // InternalExternalsParser.g:994:3: ruleKEYWORD
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
    // InternalExternalsParser.g:1003:1: rule__KEYWORD__Alternatives : ( ( Outputs ) | ( JSONPath ) | ( Protocol ) | ( Route ) | ( Paths ) | ( Name ) | ( APIDescriptions ) | ( Type ) | ( Parameters ) | ( Url ) | ( APIAuth ) | ( Key ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1007:1: ( ( Outputs ) | ( JSONPath ) | ( Protocol ) | ( Route ) | ( Paths ) | ( Name ) | ( APIDescriptions ) | ( Type ) | ( Parameters ) | ( Url ) | ( APIAuth ) | ( Key ) )
            int alt7=12;
            switch ( input.LA(1) ) {
            case Outputs:
                {
                alt7=1;
                }
                break;
            case JSONPath:
                {
                alt7=2;
                }
                break;
            case Protocol:
                {
                alt7=3;
                }
                break;
            case Route:
                {
                alt7=4;
                }
                break;
            case Paths:
                {
                alt7=5;
                }
                break;
            case Name:
                {
                alt7=6;
                }
                break;
            case APIDescriptions:
                {
                alt7=7;
                }
                break;
            case Type:
                {
                alt7=8;
                }
                break;
            case Parameters:
                {
                alt7=9;
                }
                break;
            case Url:
                {
                alt7=10;
                }
                break;
            case APIAuth:
                {
                alt7=11;
                }
                break;
            case Key:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalExternalsParser.g:1008:2: ( Outputs )
                    {
                    // InternalExternalsParser.g:1008:2: ( Outputs )
                    // InternalExternalsParser.g:1009:3: Outputs
                    {
                     before(grammarAccess.getKEYWORDAccess().getOutputsKeyword_0()); 
                    match(input,Outputs,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOutputsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExternalsParser.g:1014:2: ( JSONPath )
                    {
                    // InternalExternalsParser.g:1014:2: ( JSONPath )
                    // InternalExternalsParser.g:1015:3: JSONPath
                    {
                     before(grammarAccess.getKEYWORDAccess().getJSONPathKeyword_1()); 
                    match(input,JSONPath,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getJSONPathKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExternalsParser.g:1020:2: ( Protocol )
                    {
                    // InternalExternalsParser.g:1020:2: ( Protocol )
                    // InternalExternalsParser.g:1021:3: Protocol
                    {
                     before(grammarAccess.getKEYWORDAccess().getProtocolKeyword_2()); 
                    match(input,Protocol,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getProtocolKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExternalsParser.g:1026:2: ( Route )
                    {
                    // InternalExternalsParser.g:1026:2: ( Route )
                    // InternalExternalsParser.g:1027:3: Route
                    {
                     before(grammarAccess.getKEYWORDAccess().getRouteKeyword_3()); 
                    match(input,Route,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getRouteKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExternalsParser.g:1032:2: ( Paths )
                    {
                    // InternalExternalsParser.g:1032:2: ( Paths )
                    // InternalExternalsParser.g:1033:3: Paths
                    {
                     before(grammarAccess.getKEYWORDAccess().getPathsKeyword_4()); 
                    match(input,Paths,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPathsKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExternalsParser.g:1038:2: ( Name )
                    {
                    // InternalExternalsParser.g:1038:2: ( Name )
                    // InternalExternalsParser.g:1039:3: Name
                    {
                     before(grammarAccess.getKEYWORDAccess().getNameKeyword_5()); 
                    match(input,Name,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNameKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalExternalsParser.g:1044:2: ( APIDescriptions )
                    {
                    // InternalExternalsParser.g:1044:2: ( APIDescriptions )
                    // InternalExternalsParser.g:1045:3: APIDescriptions
                    {
                     before(grammarAccess.getKEYWORDAccess().getAPIDescriptionsKeyword_6()); 
                    match(input,APIDescriptions,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAPIDescriptionsKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalExternalsParser.g:1050:2: ( Type )
                    {
                    // InternalExternalsParser.g:1050:2: ( Type )
                    // InternalExternalsParser.g:1051:3: Type
                    {
                     before(grammarAccess.getKEYWORDAccess().getTypeKeyword_7()); 
                    match(input,Type,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTypeKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalExternalsParser.g:1056:2: ( Parameters )
                    {
                    // InternalExternalsParser.g:1056:2: ( Parameters )
                    // InternalExternalsParser.g:1057:3: Parameters
                    {
                     before(grammarAccess.getKEYWORDAccess().getParametersKeyword_8()); 
                    match(input,Parameters,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getParametersKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalExternalsParser.g:1062:2: ( Url )
                    {
                    // InternalExternalsParser.g:1062:2: ( Url )
                    // InternalExternalsParser.g:1063:3: Url
                    {
                     before(grammarAccess.getKEYWORDAccess().getUrlKeyword_9()); 
                    match(input,Url,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getUrlKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalExternalsParser.g:1068:2: ( APIAuth )
                    {
                    // InternalExternalsParser.g:1068:2: ( APIAuth )
                    // InternalExternalsParser.g:1069:3: APIAuth
                    {
                     before(grammarAccess.getKEYWORDAccess().getAPIAuthKeyword_10()); 
                    match(input,APIAuth,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAPIAuthKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalExternalsParser.g:1074:2: ( Key )
                    {
                    // InternalExternalsParser.g:1074:2: ( Key )
                    // InternalExternalsParser.g:1075:3: Key
                    {
                     before(grammarAccess.getKEYWORDAccess().getKeyKeyword_11()); 
                    match(input,Key,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getKeyKeyword_11()); 

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


    // $ANTLR start "rule__ExternalsRoot__Group__0"
    // InternalExternalsParser.g:1084:1: rule__ExternalsRoot__Group__0 : rule__ExternalsRoot__Group__0__Impl rule__ExternalsRoot__Group__1 ;
    public final void rule__ExternalsRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1088:1: ( rule__ExternalsRoot__Group__0__Impl rule__ExternalsRoot__Group__1 )
            // InternalExternalsParser.g:1089:2: rule__ExternalsRoot__Group__0__Impl rule__ExternalsRoot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalsRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRoot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group__0"


    // $ANTLR start "rule__ExternalsRoot__Group__0__Impl"
    // InternalExternalsParser.g:1096:1: rule__ExternalsRoot__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1100:1: ( ( () ) )
            // InternalExternalsParser.g:1101:1: ( () )
            {
            // InternalExternalsParser.g:1101:1: ( () )
            // InternalExternalsParser.g:1102:2: ()
            {
             before(grammarAccess.getExternalsRootAccess().getExternalsRootAction_0()); 
            // InternalExternalsParser.g:1103:2: ()
            // InternalExternalsParser.g:1103:3: 
            {
            }

             after(grammarAccess.getExternalsRootAccess().getExternalsRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRoot__Group__1"
    // InternalExternalsParser.g:1111:1: rule__ExternalsRoot__Group__1 : rule__ExternalsRoot__Group__1__Impl rule__ExternalsRoot__Group__2 ;
    public final void rule__ExternalsRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1115:1: ( rule__ExternalsRoot__Group__1__Impl rule__ExternalsRoot__Group__2 )
            // InternalExternalsParser.g:1116:2: rule__ExternalsRoot__Group__1__Impl rule__ExternalsRoot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExternalsRoot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRoot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group__1"


    // $ANTLR start "rule__ExternalsRoot__Group__1__Impl"
    // InternalExternalsParser.g:1123:1: rule__ExternalsRoot__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ExternalsRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1127:1: ( ( LeftCurlyBracket ) )
            // InternalExternalsParser.g:1128:1: ( LeftCurlyBracket )
            {
            // InternalExternalsParser.g:1128:1: ( LeftCurlyBracket )
            // InternalExternalsParser.g:1129:2: LeftCurlyBracket
            {
             before(grammarAccess.getExternalsRootAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRoot__Group__2"
    // InternalExternalsParser.g:1138:1: rule__ExternalsRoot__Group__2 : rule__ExternalsRoot__Group__2__Impl rule__ExternalsRoot__Group__3 ;
    public final void rule__ExternalsRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1142:1: ( rule__ExternalsRoot__Group__2__Impl rule__ExternalsRoot__Group__3 )
            // InternalExternalsParser.g:1143:2: rule__ExternalsRoot__Group__2__Impl rule__ExternalsRoot__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ExternalsRoot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRoot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group__2"


    // $ANTLR start "rule__ExternalsRoot__Group__2__Impl"
    // InternalExternalsParser.g:1150:1: rule__ExternalsRoot__Group__2__Impl : ( ( rule__ExternalsRoot__Group_2__0 )? ) ;
    public final void rule__ExternalsRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1154:1: ( ( ( rule__ExternalsRoot__Group_2__0 )? ) )
            // InternalExternalsParser.g:1155:1: ( ( rule__ExternalsRoot__Group_2__0 )? )
            {
            // InternalExternalsParser.g:1155:1: ( ( rule__ExternalsRoot__Group_2__0 )? )
            // InternalExternalsParser.g:1156:2: ( rule__ExternalsRoot__Group_2__0 )?
            {
             before(grammarAccess.getExternalsRootAccess().getGroup_2()); 
            // InternalExternalsParser.g:1157:2: ( rule__ExternalsRoot__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==APIDescriptions) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalExternalsParser.g:1157:3: rule__ExternalsRoot__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalsRoot__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalsRootAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRoot__Group__3"
    // InternalExternalsParser.g:1165:1: rule__ExternalsRoot__Group__3 : rule__ExternalsRoot__Group__3__Impl ;
    public final void rule__ExternalsRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1169:1: ( rule__ExternalsRoot__Group__3__Impl )
            // InternalExternalsParser.g:1170:2: rule__ExternalsRoot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRoot__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group__3"


    // $ANTLR start "rule__ExternalsRoot__Group__3__Impl"
    // InternalExternalsParser.g:1176:1: rule__ExternalsRoot__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ExternalsRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1180:1: ( ( RightCurlyBracket ) )
            // InternalExternalsParser.g:1181:1: ( RightCurlyBracket )
            {
            // InternalExternalsParser.g:1181:1: ( RightCurlyBracket )
            // InternalExternalsParser.g:1182:2: RightCurlyBracket
            {
             before(grammarAccess.getExternalsRootAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRoot__Group_2__0"
    // InternalExternalsParser.g:1192:1: rule__ExternalsRoot__Group_2__0 : rule__ExternalsRoot__Group_2__0__Impl rule__ExternalsRoot__Group_2__1 ;
    public final void rule__ExternalsRoot__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1196:1: ( rule__ExternalsRoot__Group_2__0__Impl rule__ExternalsRoot__Group_2__1 )
            // InternalExternalsParser.g:1197:2: rule__ExternalsRoot__Group_2__0__Impl rule__ExternalsRoot__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ExternalsRoot__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRoot__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group_2__0"


    // $ANTLR start "rule__ExternalsRoot__Group_2__0__Impl"
    // InternalExternalsParser.g:1204:1: rule__ExternalsRoot__Group_2__0__Impl : ( ( rule__ExternalsRoot__ExternalsRootAssignment_2_0 ) ) ;
    public final void rule__ExternalsRoot__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1208:1: ( ( ( rule__ExternalsRoot__ExternalsRootAssignment_2_0 ) ) )
            // InternalExternalsParser.g:1209:1: ( ( rule__ExternalsRoot__ExternalsRootAssignment_2_0 ) )
            {
            // InternalExternalsParser.g:1209:1: ( ( rule__ExternalsRoot__ExternalsRootAssignment_2_0 ) )
            // InternalExternalsParser.g:1210:2: ( rule__ExternalsRoot__ExternalsRootAssignment_2_0 )
            {
             before(grammarAccess.getExternalsRootAccess().getExternalsRootAssignment_2_0()); 
            // InternalExternalsParser.g:1211:2: ( rule__ExternalsRoot__ExternalsRootAssignment_2_0 )
            // InternalExternalsParser.g:1211:3: rule__ExternalsRoot__ExternalsRootAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRoot__ExternalsRootAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAccess().getExternalsRootAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group_2__0__Impl"


    // $ANTLR start "rule__ExternalsRoot__Group_2__1"
    // InternalExternalsParser.g:1219:1: rule__ExternalsRoot__Group_2__1 : rule__ExternalsRoot__Group_2__1__Impl ;
    public final void rule__ExternalsRoot__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1223:1: ( rule__ExternalsRoot__Group_2__1__Impl )
            // InternalExternalsParser.g:1224:2: rule__ExternalsRoot__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRoot__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group_2__1"


    // $ANTLR start "rule__ExternalsRoot__Group_2__1__Impl"
    // InternalExternalsParser.g:1230:1: rule__ExternalsRoot__Group_2__1__Impl : ( ( rule__ExternalsRoot__Group_2_1__0 )* ) ;
    public final void rule__ExternalsRoot__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1234:1: ( ( ( rule__ExternalsRoot__Group_2_1__0 )* ) )
            // InternalExternalsParser.g:1235:1: ( ( rule__ExternalsRoot__Group_2_1__0 )* )
            {
            // InternalExternalsParser.g:1235:1: ( ( rule__ExternalsRoot__Group_2_1__0 )* )
            // InternalExternalsParser.g:1236:2: ( rule__ExternalsRoot__Group_2_1__0 )*
            {
             before(grammarAccess.getExternalsRootAccess().getGroup_2_1()); 
            // InternalExternalsParser.g:1237:2: ( rule__ExternalsRoot__Group_2_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Comma) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExternalsParser.g:1237:3: rule__ExternalsRoot__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExternalsRoot__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExternalsRootAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group_2__1__Impl"


    // $ANTLR start "rule__ExternalsRoot__Group_2_1__0"
    // InternalExternalsParser.g:1246:1: rule__ExternalsRoot__Group_2_1__0 : rule__ExternalsRoot__Group_2_1__0__Impl rule__ExternalsRoot__Group_2_1__1 ;
    public final void rule__ExternalsRoot__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1250:1: ( rule__ExternalsRoot__Group_2_1__0__Impl rule__ExternalsRoot__Group_2_1__1 )
            // InternalExternalsParser.g:1251:2: rule__ExternalsRoot__Group_2_1__0__Impl rule__ExternalsRoot__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ExternalsRoot__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRoot__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group_2_1__0"


    // $ANTLR start "rule__ExternalsRoot__Group_2_1__0__Impl"
    // InternalExternalsParser.g:1258:1: rule__ExternalsRoot__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ExternalsRoot__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1262:1: ( ( Comma ) )
            // InternalExternalsParser.g:1263:1: ( Comma )
            {
            // InternalExternalsParser.g:1263:1: ( Comma )
            // InternalExternalsParser.g:1264:2: Comma
            {
             before(grammarAccess.getExternalsRootAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group_2_1__0__Impl"


    // $ANTLR start "rule__ExternalsRoot__Group_2_1__1"
    // InternalExternalsParser.g:1273:1: rule__ExternalsRoot__Group_2_1__1 : rule__ExternalsRoot__Group_2_1__1__Impl ;
    public final void rule__ExternalsRoot__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1277:1: ( rule__ExternalsRoot__Group_2_1__1__Impl )
            // InternalExternalsParser.g:1278:2: rule__ExternalsRoot__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRoot__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group_2_1__1"


    // $ANTLR start "rule__ExternalsRoot__Group_2_1__1__Impl"
    // InternalExternalsParser.g:1284:1: rule__ExternalsRoot__Group_2_1__1__Impl : ( ( rule__ExternalsRoot__ExternalsRootAssignment_2_1_1 ) ) ;
    public final void rule__ExternalsRoot__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1288:1: ( ( ( rule__ExternalsRoot__ExternalsRootAssignment_2_1_1 ) ) )
            // InternalExternalsParser.g:1289:1: ( ( rule__ExternalsRoot__ExternalsRootAssignment_2_1_1 ) )
            {
            // InternalExternalsParser.g:1289:1: ( ( rule__ExternalsRoot__ExternalsRootAssignment_2_1_1 ) )
            // InternalExternalsParser.g:1290:2: ( rule__ExternalsRoot__ExternalsRootAssignment_2_1_1 )
            {
             before(grammarAccess.getExternalsRootAccess().getExternalsRootAssignment_2_1_1()); 
            // InternalExternalsParser.g:1291:2: ( rule__ExternalsRoot__ExternalsRootAssignment_2_1_1 )
            // InternalExternalsParser.g:1291:3: rule__ExternalsRoot__ExternalsRootAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRoot__ExternalsRootAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAccess().getExternalsRootAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__Group_2_1__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group__0"
    // InternalExternalsParser.g:1300:1: rule__ExternalsRootAPIDescriptions__Group__0 : rule__ExternalsRootAPIDescriptions__Group__0__Impl rule__ExternalsRootAPIDescriptions__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1304:1: ( rule__ExternalsRootAPIDescriptions__Group__0__Impl rule__ExternalsRootAPIDescriptions__Group__1 )
            // InternalExternalsParser.g:1305:2: rule__ExternalsRootAPIDescriptions__Group__0__Impl rule__ExternalsRootAPIDescriptions__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExternalsRootAPIDescriptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group__0__Impl"
    // InternalExternalsParser.g:1312:1: rule__ExternalsRootAPIDescriptions__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1316:1: ( ( () ) )
            // InternalExternalsParser.g:1317:1: ( () )
            {
            // InternalExternalsParser.g:1317:1: ( () )
            // InternalExternalsParser.g:1318:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getExternalsRootAPIDescriptionsAction_0()); 
            // InternalExternalsParser.g:1319:2: ()
            // InternalExternalsParser.g:1319:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getExternalsRootAPIDescriptionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group__1"
    // InternalExternalsParser.g:1327:1: rule__ExternalsRootAPIDescriptions__Group__1 : rule__ExternalsRootAPIDescriptions__Group__1__Impl rule__ExternalsRootAPIDescriptions__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1331:1: ( rule__ExternalsRootAPIDescriptions__Group__1__Impl rule__ExternalsRootAPIDescriptions__Group__2 )
            // InternalExternalsParser.g:1332:2: rule__ExternalsRootAPIDescriptions__Group__1__Impl rule__ExternalsRootAPIDescriptions__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group__1__Impl"
    // InternalExternalsParser.g:1339:1: rule__ExternalsRootAPIDescriptions__Group__1__Impl : ( APIDescriptions ) ;
    public final void rule__ExternalsRootAPIDescriptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1343:1: ( ( APIDescriptions ) )
            // InternalExternalsParser.g:1344:1: ( APIDescriptions )
            {
            // InternalExternalsParser.g:1344:1: ( APIDescriptions )
            // InternalExternalsParser.g:1345:2: APIDescriptions
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsKeyword_1()); 
            match(input,APIDescriptions,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group__2"
    // InternalExternalsParser.g:1354:1: rule__ExternalsRootAPIDescriptions__Group__2 : rule__ExternalsRootAPIDescriptions__Group__2__Impl rule__ExternalsRootAPIDescriptions__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1358:1: ( rule__ExternalsRootAPIDescriptions__Group__2__Impl rule__ExternalsRootAPIDescriptions__Group__3 )
            // InternalExternalsParser.g:1359:2: rule__ExternalsRootAPIDescriptions__Group__2__Impl rule__ExternalsRootAPIDescriptions__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ExternalsRootAPIDescriptions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group__2__Impl"
    // InternalExternalsParser.g:1366:1: rule__ExternalsRootAPIDescriptions__Group__2__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1370:1: ( ( Colon ) )
            // InternalExternalsParser.g:1371:1: ( Colon )
            {
            // InternalExternalsParser.g:1371:1: ( Colon )
            // InternalExternalsParser.g:1372:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group__3"
    // InternalExternalsParser.g:1381:1: rule__ExternalsRootAPIDescriptions__Group__3 : rule__ExternalsRootAPIDescriptions__Group__3__Impl rule__ExternalsRootAPIDescriptions__Group__4 ;
    public final void rule__ExternalsRootAPIDescriptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1385:1: ( rule__ExternalsRootAPIDescriptions__Group__3__Impl rule__ExternalsRootAPIDescriptions__Group__4 )
            // InternalExternalsParser.g:1386:2: rule__ExternalsRootAPIDescriptions__Group__3__Impl rule__ExternalsRootAPIDescriptions__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ExternalsRootAPIDescriptions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group__3__Impl"
    // InternalExternalsParser.g:1393:1: rule__ExternalsRootAPIDescriptions__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__ExternalsRootAPIDescriptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1397:1: ( ( LeftSquareBracket ) )
            // InternalExternalsParser.g:1398:1: ( LeftSquareBracket )
            {
            // InternalExternalsParser.g:1398:1: ( LeftSquareBracket )
            // InternalExternalsParser.g:1399:2: LeftSquareBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group__4"
    // InternalExternalsParser.g:1408:1: rule__ExternalsRootAPIDescriptions__Group__4 : rule__ExternalsRootAPIDescriptions__Group__4__Impl rule__ExternalsRootAPIDescriptions__Group__5 ;
    public final void rule__ExternalsRootAPIDescriptions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1412:1: ( rule__ExternalsRootAPIDescriptions__Group__4__Impl rule__ExternalsRootAPIDescriptions__Group__5 )
            // InternalExternalsParser.g:1413:2: rule__ExternalsRootAPIDescriptions__Group__4__Impl rule__ExternalsRootAPIDescriptions__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ExternalsRootAPIDescriptions__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group__4"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group__4__Impl"
    // InternalExternalsParser.g:1420:1: rule__ExternalsRootAPIDescriptions__Group__4__Impl : ( ( rule__ExternalsRootAPIDescriptions__Group_4__0 )? ) ;
    public final void rule__ExternalsRootAPIDescriptions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1424:1: ( ( ( rule__ExternalsRootAPIDescriptions__Group_4__0 )? ) )
            // InternalExternalsParser.g:1425:1: ( ( rule__ExternalsRootAPIDescriptions__Group_4__0 )? )
            {
            // InternalExternalsParser.g:1425:1: ( ( rule__ExternalsRootAPIDescriptions__Group_4__0 )? )
            // InternalExternalsParser.g:1426:2: ( rule__ExternalsRootAPIDescriptions__Group_4__0 )?
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getGroup_4()); 
            // InternalExternalsParser.g:1427:2: ( rule__ExternalsRootAPIDescriptions__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LeftCurlyBracket) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalExternalsParser.g:1427:3: rule__ExternalsRootAPIDescriptions__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalsRootAPIDescriptions__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group__4__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group__5"
    // InternalExternalsParser.g:1435:1: rule__ExternalsRootAPIDescriptions__Group__5 : rule__ExternalsRootAPIDescriptions__Group__5__Impl ;
    public final void rule__ExternalsRootAPIDescriptions__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1439:1: ( rule__ExternalsRootAPIDescriptions__Group__5__Impl )
            // InternalExternalsParser.g:1440:2: rule__ExternalsRootAPIDescriptions__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group__5"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group__5__Impl"
    // InternalExternalsParser.g:1446:1: rule__ExternalsRootAPIDescriptions__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ExternalsRootAPIDescriptions__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1450:1: ( ( RightSquareBracket ) )
            // InternalExternalsParser.g:1451:1: ( RightSquareBracket )
            {
            // InternalExternalsParser.g:1451:1: ( RightSquareBracket )
            // InternalExternalsParser.g:1452:2: RightSquareBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group__5__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group_4__0"
    // InternalExternalsParser.g:1462:1: rule__ExternalsRootAPIDescriptions__Group_4__0 : rule__ExternalsRootAPIDescriptions__Group_4__0__Impl rule__ExternalsRootAPIDescriptions__Group_4__1 ;
    public final void rule__ExternalsRootAPIDescriptions__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1466:1: ( rule__ExternalsRootAPIDescriptions__Group_4__0__Impl rule__ExternalsRootAPIDescriptions__Group_4__1 )
            // InternalExternalsParser.g:1467:2: rule__ExternalsRootAPIDescriptions__Group_4__0__Impl rule__ExternalsRootAPIDescriptions__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ExternalsRootAPIDescriptions__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group_4__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group_4__0__Impl"
    // InternalExternalsParser.g:1474:1: rule__ExternalsRootAPIDescriptions__Group_4__0__Impl : ( ( rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0 ) ) ;
    public final void rule__ExternalsRootAPIDescriptions__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1478:1: ( ( ( rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0 ) ) )
            // InternalExternalsParser.g:1479:1: ( ( rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0 ) )
            {
            // InternalExternalsParser.g:1479:1: ( ( rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0 ) )
            // InternalExternalsParser.g:1480:2: ( rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsAssignment_4_0()); 
            // InternalExternalsParser.g:1481:2: ( rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0 )
            // InternalExternalsParser.g:1481:3: rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group_4__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group_4__1"
    // InternalExternalsParser.g:1489:1: rule__ExternalsRootAPIDescriptions__Group_4__1 : rule__ExternalsRootAPIDescriptions__Group_4__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptions__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1493:1: ( rule__ExternalsRootAPIDescriptions__Group_4__1__Impl )
            // InternalExternalsParser.g:1494:2: rule__ExternalsRootAPIDescriptions__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group_4__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group_4__1__Impl"
    // InternalExternalsParser.g:1500:1: rule__ExternalsRootAPIDescriptions__Group_4__1__Impl : ( ( rule__ExternalsRootAPIDescriptions__Group_4_1__0 )* ) ;
    public final void rule__ExternalsRootAPIDescriptions__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1504:1: ( ( ( rule__ExternalsRootAPIDescriptions__Group_4_1__0 )* ) )
            // InternalExternalsParser.g:1505:1: ( ( rule__ExternalsRootAPIDescriptions__Group_4_1__0 )* )
            {
            // InternalExternalsParser.g:1505:1: ( ( rule__ExternalsRootAPIDescriptions__Group_4_1__0 )* )
            // InternalExternalsParser.g:1506:2: ( rule__ExternalsRootAPIDescriptions__Group_4_1__0 )*
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getGroup_4_1()); 
            // InternalExternalsParser.g:1507:2: ( rule__ExternalsRootAPIDescriptions__Group_4_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExternalsParser.g:1507:3: rule__ExternalsRootAPIDescriptions__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExternalsRootAPIDescriptions__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group_4__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group_4_1__0"
    // InternalExternalsParser.g:1516:1: rule__ExternalsRootAPIDescriptions__Group_4_1__0 : rule__ExternalsRootAPIDescriptions__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptions__Group_4_1__1 ;
    public final void rule__ExternalsRootAPIDescriptions__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1520:1: ( rule__ExternalsRootAPIDescriptions__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptions__Group_4_1__1 )
            // InternalExternalsParser.g:1521:2: rule__ExternalsRootAPIDescriptions__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptions__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalsRootAPIDescriptions__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group_4_1__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group_4_1__0__Impl"
    // InternalExternalsParser.g:1528:1: rule__ExternalsRootAPIDescriptions__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__ExternalsRootAPIDescriptions__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1532:1: ( ( Comma ) )
            // InternalExternalsParser.g:1533:1: ( Comma )
            {
            // InternalExternalsParser.g:1533:1: ( Comma )
            // InternalExternalsParser.g:1534:2: Comma
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group_4_1__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group_4_1__1"
    // InternalExternalsParser.g:1543:1: rule__ExternalsRootAPIDescriptions__Group_4_1__1 : rule__ExternalsRootAPIDescriptions__Group_4_1__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptions__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1547:1: ( rule__ExternalsRootAPIDescriptions__Group_4_1__1__Impl )
            // InternalExternalsParser.g:1548:2: rule__ExternalsRootAPIDescriptions__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group_4_1__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__Group_4_1__1__Impl"
    // InternalExternalsParser.g:1554:1: rule__ExternalsRootAPIDescriptions__Group_4_1__1__Impl : ( ( rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1 ) ) ;
    public final void rule__ExternalsRootAPIDescriptions__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1558:1: ( ( ( rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1 ) ) )
            // InternalExternalsParser.g:1559:1: ( ( rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1 ) )
            {
            // InternalExternalsParser.g:1559:1: ( ( rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1 ) )
            // InternalExternalsParser.g:1560:2: ( rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsAssignment_4_1_1()); 
            // InternalExternalsParser.g:1561:2: ( rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1 )
            // InternalExternalsParser.g:1561:3: rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__Group_4_1__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group__0"
    // InternalExternalsParser.g:1570:1: rule__ExternalsRootAPIDescriptionsItems__Group__0 : rule__ExternalsRootAPIDescriptionsItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItems__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1574:1: ( rule__ExternalsRootAPIDescriptionsItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItems__Group__1 )
            // InternalExternalsParser.g:1575:2: rule__ExternalsRootAPIDescriptionsItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalsRootAPIDescriptionsItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group__0__Impl"
    // InternalExternalsParser.g:1582:1: rule__ExternalsRootAPIDescriptionsItems__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1586:1: ( ( () ) )
            // InternalExternalsParser.g:1587:1: ( () )
            {
            // InternalExternalsParser.g:1587:1: ( () )
            // InternalExternalsParser.g:1588:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getExternalsRootAPIDescriptionsItemsAction_0()); 
            // InternalExternalsParser.g:1589:2: ()
            // InternalExternalsParser.g:1589:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getExternalsRootAPIDescriptionsItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group__1"
    // InternalExternalsParser.g:1597:1: rule__ExternalsRootAPIDescriptionsItems__Group__1 : rule__ExternalsRootAPIDescriptionsItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItems__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1601:1: ( rule__ExternalsRootAPIDescriptionsItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItems__Group__2 )
            // InternalExternalsParser.g:1602:2: rule__ExternalsRootAPIDescriptionsItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItems__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ExternalsRootAPIDescriptionsItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group__1__Impl"
    // InternalExternalsParser.g:1609:1: rule__ExternalsRootAPIDescriptionsItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1613:1: ( ( LeftCurlyBracket ) )
            // InternalExternalsParser.g:1614:1: ( LeftCurlyBracket )
            {
            // InternalExternalsParser.g:1614:1: ( LeftCurlyBracket )
            // InternalExternalsParser.g:1615:2: LeftCurlyBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group__2"
    // InternalExternalsParser.g:1624:1: rule__ExternalsRootAPIDescriptionsItems__Group__2 : rule__ExternalsRootAPIDescriptionsItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItems__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1628:1: ( rule__ExternalsRootAPIDescriptionsItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItems__Group__3 )
            // InternalExternalsParser.g:1629:2: rule__ExternalsRootAPIDescriptionsItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItems__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ExternalsRootAPIDescriptionsItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group__2__Impl"
    // InternalExternalsParser.g:1636:1: rule__ExternalsRootAPIDescriptionsItems__Group__2__Impl : ( ( rule__ExternalsRootAPIDescriptionsItems__Group_2__0 )? ) ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1640:1: ( ( ( rule__ExternalsRootAPIDescriptionsItems__Group_2__0 )? ) )
            // InternalExternalsParser.g:1641:1: ( ( rule__ExternalsRootAPIDescriptionsItems__Group_2__0 )? )
            {
            // InternalExternalsParser.g:1641:1: ( ( rule__ExternalsRootAPIDescriptionsItems__Group_2__0 )? )
            // InternalExternalsParser.g:1642:2: ( rule__ExternalsRootAPIDescriptionsItems__Group_2__0 )?
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getGroup_2()); 
            // InternalExternalsParser.g:1643:2: ( rule__ExternalsRootAPIDescriptionsItems__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=Protocol && LA12_0<=APIAuth)||LA12_0==Paths||LA12_0==Name||LA12_0==Url) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalExternalsParser.g:1643:3: rule__ExternalsRootAPIDescriptionsItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalsRootAPIDescriptionsItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group__3"
    // InternalExternalsParser.g:1651:1: rule__ExternalsRootAPIDescriptionsItems__Group__3 : rule__ExternalsRootAPIDescriptionsItems__Group__3__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1655:1: ( rule__ExternalsRootAPIDescriptionsItems__Group__3__Impl )
            // InternalExternalsParser.g:1656:2: rule__ExternalsRootAPIDescriptionsItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group__3__Impl"
    // InternalExternalsParser.g:1662:1: rule__ExternalsRootAPIDescriptionsItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1666:1: ( ( RightCurlyBracket ) )
            // InternalExternalsParser.g:1667:1: ( RightCurlyBracket )
            {
            // InternalExternalsParser.g:1667:1: ( RightCurlyBracket )
            // InternalExternalsParser.g:1668:2: RightCurlyBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group_2__0"
    // InternalExternalsParser.g:1678:1: rule__ExternalsRootAPIDescriptionsItems__Group_2__0 : rule__ExternalsRootAPIDescriptionsItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItems__Group_2__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1682:1: ( rule__ExternalsRootAPIDescriptionsItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItems__Group_2__1 )
            // InternalExternalsParser.g:1683:2: rule__ExternalsRootAPIDescriptionsItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ExternalsRootAPIDescriptionsItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItems__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group_2__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group_2__0__Impl"
    // InternalExternalsParser.g:1690:1: rule__ExternalsRootAPIDescriptionsItems__Group_2__0__Impl : ( ( rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1694:1: ( ( ( rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0 ) ) )
            // InternalExternalsParser.g:1695:1: ( ( rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0 ) )
            {
            // InternalExternalsParser.g:1695:1: ( ( rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0 ) )
            // InternalExternalsParser.g:1696:2: ( rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getItemsAssignment_2_0()); 
            // InternalExternalsParser.g:1697:2: ( rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0 )
            // InternalExternalsParser.g:1697:3: rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group_2__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group_2__1"
    // InternalExternalsParser.g:1705:1: rule__ExternalsRootAPIDescriptionsItems__Group_2__1 : rule__ExternalsRootAPIDescriptionsItems__Group_2__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1709:1: ( rule__ExternalsRootAPIDescriptionsItems__Group_2__1__Impl )
            // InternalExternalsParser.g:1710:2: rule__ExternalsRootAPIDescriptionsItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItems__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group_2__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group_2__1__Impl"
    // InternalExternalsParser.g:1716:1: rule__ExternalsRootAPIDescriptionsItems__Group_2__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0 )* ) ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1720:1: ( ( ( rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0 )* ) )
            // InternalExternalsParser.g:1721:1: ( ( rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0 )* )
            {
            // InternalExternalsParser.g:1721:1: ( ( rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0 )* )
            // InternalExternalsParser.g:1722:2: ( rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0 )*
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getGroup_2_1()); 
            // InternalExternalsParser.g:1723:2: ( rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Comma) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExternalsParser.g:1723:3: rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group_2__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0"
    // InternalExternalsParser.g:1732:1: rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0 : rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1736:1: ( rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1 )
            // InternalExternalsParser.g:1737:2: rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0__Impl"
    // InternalExternalsParser.g:1744:1: rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1748:1: ( ( Comma ) )
            // InternalExternalsParser.g:1749:1: ( Comma )
            {
            // InternalExternalsParser.g:1749:1: ( Comma )
            // InternalExternalsParser.g:1750:2: Comma
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1"
    // InternalExternalsParser.g:1759:1: rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1 : rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1763:1: ( rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1__Impl )
            // InternalExternalsParser.g:1764:2: rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1__Impl"
    // InternalExternalsParser.g:1770:1: rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1774:1: ( ( ( rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1 ) ) )
            // InternalExternalsParser.g:1775:1: ( ( rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalExternalsParser.g:1775:1: ( ( rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1 ) )
            // InternalExternalsParser.g:1776:2: ( rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalExternalsParser.g:1777:2: ( rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1 )
            // InternalExternalsParser.g:1777:3: rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsName__Group__0"
    // InternalExternalsParser.g:1786:1: rule__ExternalsRootAPIDescriptionsItemsName__Group__0 : rule__ExternalsRootAPIDescriptionsItemsName__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsName__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1790:1: ( rule__ExternalsRootAPIDescriptionsItemsName__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsName__Group__1 )
            // InternalExternalsParser.g:1791:2: rule__ExternalsRootAPIDescriptionsItemsName__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsName__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ExternalsRootAPIDescriptionsItemsName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsName__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsName__Group__0__Impl"
    // InternalExternalsParser.g:1798:1: rule__ExternalsRootAPIDescriptionsItemsName__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1802:1: ( ( () ) )
            // InternalExternalsParser.g:1803:1: ( () )
            {
            // InternalExternalsParser.g:1803:1: ( () )
            // InternalExternalsParser.g:1804:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getExternalsRootAPIDescriptionsItemsNameAction_0()); 
            // InternalExternalsParser.g:1805:2: ()
            // InternalExternalsParser.g:1805:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getExternalsRootAPIDescriptionsItemsNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsName__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsName__Group__1"
    // InternalExternalsParser.g:1813:1: rule__ExternalsRootAPIDescriptionsItemsName__Group__1 : rule__ExternalsRootAPIDescriptionsItemsName__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsName__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1817:1: ( rule__ExternalsRootAPIDescriptionsItemsName__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsName__Group__2 )
            // InternalExternalsParser.g:1818:2: rule__ExternalsRootAPIDescriptionsItemsName__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsName__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsName__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsName__Group__1__Impl"
    // InternalExternalsParser.g:1825:1: rule__ExternalsRootAPIDescriptionsItemsName__Group__1__Impl : ( Name ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1829:1: ( ( Name ) )
            // InternalExternalsParser.g:1830:1: ( Name )
            {
            // InternalExternalsParser.g:1830:1: ( Name )
            // InternalExternalsParser.g:1831:2: Name
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsName__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsName__Group__2"
    // InternalExternalsParser.g:1840:1: rule__ExternalsRootAPIDescriptionsItemsName__Group__2 : rule__ExternalsRootAPIDescriptionsItemsName__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsName__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1844:1: ( rule__ExternalsRootAPIDescriptionsItemsName__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsName__Group__3 )
            // InternalExternalsParser.g:1845:2: rule__ExternalsRootAPIDescriptionsItemsName__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsName__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ExternalsRootAPIDescriptionsItemsName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsName__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsName__Group__2__Impl"
    // InternalExternalsParser.g:1852:1: rule__ExternalsRootAPIDescriptionsItemsName__Group__2__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1856:1: ( ( Colon ) )
            // InternalExternalsParser.g:1857:1: ( Colon )
            {
            // InternalExternalsParser.g:1857:1: ( Colon )
            // InternalExternalsParser.g:1858:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsName__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsName__Group__3"
    // InternalExternalsParser.g:1867:1: rule__ExternalsRootAPIDescriptionsItemsName__Group__3 : rule__ExternalsRootAPIDescriptionsItemsName__Group__3__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1871:1: ( rule__ExternalsRootAPIDescriptionsItemsName__Group__3__Impl )
            // InternalExternalsParser.g:1872:2: rule__ExternalsRootAPIDescriptionsItemsName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsName__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsName__Group__3__Impl"
    // InternalExternalsParser.g:1878:1: rule__ExternalsRootAPIDescriptionsItemsName__Group__3__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1882:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3 ) ) )
            // InternalExternalsParser.g:1883:1: ( ( rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3 ) )
            {
            // InternalExternalsParser.g:1883:1: ( ( rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3 ) )
            // InternalExternalsParser.g:1884:2: ( rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getNameAssignment_3()); 
            // InternalExternalsParser.g:1885:2: ( rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3 )
            // InternalExternalsParser.g:1885:3: rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsName__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0"
    // InternalExternalsParser.g:1894:1: rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0 : rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1898:1: ( rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1 )
            // InternalExternalsParser.g:1899:2: rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0__Impl"
    // InternalExternalsParser.g:1906:1: rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0__Impl : ( Protocol ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1910:1: ( ( Protocol ) )
            // InternalExternalsParser.g:1911:1: ( Protocol )
            {
            // InternalExternalsParser.g:1911:1: ( Protocol )
            // InternalExternalsParser.g:1912:2: Protocol
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getProtocolKeyword_0()); 
            match(input,Protocol,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getProtocolKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1"
    // InternalExternalsParser.g:1921:1: rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1 : rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1925:1: ( rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2 )
            // InternalExternalsParser.g:1926:2: rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1__Impl"
    // InternalExternalsParser.g:1933:1: rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1937:1: ( ( Colon ) )
            // InternalExternalsParser.g:1938:1: ( Colon )
            {
            // InternalExternalsParser.g:1938:1: ( Colon )
            // InternalExternalsParser.g:1939:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2"
    // InternalExternalsParser.g:1948:1: rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2 : rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1952:1: ( rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2__Impl )
            // InternalExternalsParser.g:1953:2: rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2__Impl"
    // InternalExternalsParser.g:1959:1: rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1963:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2 ) ) )
            // InternalExternalsParser.g:1964:1: ( ( rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2 ) )
            {
            // InternalExternalsParser.g:1964:1: ( ( rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2 ) )
            // InternalExternalsParser.g:1965:2: ( rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getProtocolAssignment_2()); 
            // InternalExternalsParser.g:1966:2: ( rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2 )
            // InternalExternalsParser.g:1966:3: rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getProtocolAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0"
    // InternalExternalsParser.g:1975:1: rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0 : rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1979:1: ( rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1 )
            // InternalExternalsParser.g:1980:2: rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0__Impl"
    // InternalExternalsParser.g:1987:1: rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0__Impl : ( Url ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:1991:1: ( ( Url ) )
            // InternalExternalsParser.g:1992:1: ( Url )
            {
            // InternalExternalsParser.g:1992:1: ( Url )
            // InternalExternalsParser.g:1993:2: Url
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getUrlKeyword_0()); 
            match(input,Url,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getUrlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1"
    // InternalExternalsParser.g:2002:1: rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1 : rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2006:1: ( rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2 )
            // InternalExternalsParser.g:2007:2: rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1__Impl"
    // InternalExternalsParser.g:2014:1: rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2018:1: ( ( Colon ) )
            // InternalExternalsParser.g:2019:1: ( Colon )
            {
            // InternalExternalsParser.g:2019:1: ( Colon )
            // InternalExternalsParser.g:2020:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2"
    // InternalExternalsParser.g:2029:1: rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2 : rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2033:1: ( rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2__Impl )
            // InternalExternalsParser.g:2034:2: rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2__Impl"
    // InternalExternalsParser.g:2040:1: rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2044:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2 ) ) )
            // InternalExternalsParser.g:2045:1: ( ( rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2 ) )
            {
            // InternalExternalsParser.g:2045:1: ( ( rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2 ) )
            // InternalExternalsParser.g:2046:2: ( rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getUrlAssignment_2()); 
            // InternalExternalsParser.g:2047:2: ( rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2 )
            // InternalExternalsParser.g:2047:3: rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0"
    // InternalExternalsParser.g:2056:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0 : rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2060:1: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1 )
            // InternalExternalsParser.g:2061:2: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0__Impl"
    // InternalExternalsParser.g:2068:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2072:1: ( ( () ) )
            // InternalExternalsParser.g:2073:1: ( () )
            {
            // InternalExternalsParser.g:2073:1: ( () )
            // InternalExternalsParser.g:2074:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getExternalsRootAPIDescriptionsItemsPathsAction_0()); 
            // InternalExternalsParser.g:2075:2: ()
            // InternalExternalsParser.g:2075:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getExternalsRootAPIDescriptionsItemsPathsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1"
    // InternalExternalsParser.g:2083:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1 : rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2087:1: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2 )
            // InternalExternalsParser.g:2088:2: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1__Impl"
    // InternalExternalsParser.g:2095:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1__Impl : ( Paths ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2099:1: ( ( Paths ) )
            // InternalExternalsParser.g:2100:1: ( Paths )
            {
            // InternalExternalsParser.g:2100:1: ( Paths )
            // InternalExternalsParser.g:2101:2: Paths
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsKeyword_1()); 
            match(input,Paths,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2"
    // InternalExternalsParser.g:2110:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2 : rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2114:1: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3 )
            // InternalExternalsParser.g:2115:2: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2__Impl"
    // InternalExternalsParser.g:2122:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2126:1: ( ( Colon ) )
            // InternalExternalsParser.g:2127:1: ( Colon )
            {
            // InternalExternalsParser.g:2127:1: ( Colon )
            // InternalExternalsParser.g:2128:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3"
    // InternalExternalsParser.g:2137:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3 : rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2141:1: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4 )
            // InternalExternalsParser.g:2142:2: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3__Impl"
    // InternalExternalsParser.g:2149:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2153:1: ( ( LeftSquareBracket ) )
            // InternalExternalsParser.g:2154:1: ( LeftSquareBracket )
            {
            // InternalExternalsParser.g:2154:1: ( LeftSquareBracket )
            // InternalExternalsParser.g:2155:2: LeftSquareBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4"
    // InternalExternalsParser.g:2164:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4 : rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2168:1: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5 )
            // InternalExternalsParser.g:2169:2: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4__Impl"
    // InternalExternalsParser.g:2176:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0 )? ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2180:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0 )? ) )
            // InternalExternalsParser.g:2181:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0 )? )
            {
            // InternalExternalsParser.g:2181:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0 )? )
            // InternalExternalsParser.g:2182:2: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0 )?
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getGroup_4()); 
            // InternalExternalsParser.g:2183:2: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LeftCurlyBracket) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalExternalsParser.g:2183:3: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__4__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5"
    // InternalExternalsParser.g:2191:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5 : rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2195:1: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5__Impl )
            // InternalExternalsParser.g:2196:2: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5__Impl"
    // InternalExternalsParser.g:2202:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2206:1: ( ( RightSquareBracket ) )
            // InternalExternalsParser.g:2207:1: ( RightSquareBracket )
            {
            // InternalExternalsParser.g:2207:1: ( RightSquareBracket )
            // InternalExternalsParser.g:2208:2: RightSquareBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__5__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0"
    // InternalExternalsParser.g:2218:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0 : rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2222:1: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1 )
            // InternalExternalsParser.g:2223:2: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0__Impl"
    // InternalExternalsParser.g:2230:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2234:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0 ) ) )
            // InternalExternalsParser.g:2235:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0 ) )
            {
            // InternalExternalsParser.g:2235:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0 ) )
            // InternalExternalsParser.g:2236:2: ( rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsAssignment_4_0()); 
            // InternalExternalsParser.g:2237:2: ( rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0 )
            // InternalExternalsParser.g:2237:3: rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1"
    // InternalExternalsParser.g:2245:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1 : rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2249:1: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1__Impl )
            // InternalExternalsParser.g:2250:2: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1__Impl"
    // InternalExternalsParser.g:2256:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0 )* ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2260:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0 )* ) )
            // InternalExternalsParser.g:2261:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0 )* )
            {
            // InternalExternalsParser.g:2261:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0 )* )
            // InternalExternalsParser.g:2262:2: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0 )*
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getGroup_4_1()); 
            // InternalExternalsParser.g:2263:2: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExternalsParser.g:2263:3: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0"
    // InternalExternalsParser.g:2272:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0 : rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2276:1: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1 )
            // InternalExternalsParser.g:2277:2: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0__Impl"
    // InternalExternalsParser.g:2284:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2288:1: ( ( Comma ) )
            // InternalExternalsParser.g:2289:1: ( Comma )
            {
            // InternalExternalsParser.g:2289:1: ( Comma )
            // InternalExternalsParser.g:2290:2: Comma
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1"
    // InternalExternalsParser.g:2299:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1 : rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2303:1: ( rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1__Impl )
            // InternalExternalsParser.g:2304:2: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1__Impl"
    // InternalExternalsParser.g:2310:1: rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2314:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1 ) ) )
            // InternalExternalsParser.g:2315:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1 ) )
            {
            // InternalExternalsParser.g:2315:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1 ) )
            // InternalExternalsParser.g:2316:2: ( rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsAssignment_4_1_1()); 
            // InternalExternalsParser.g:2317:2: ( rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1 )
            // InternalExternalsParser.g:2317:3: rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0"
    // InternalExternalsParser.g:2326:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0 : rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2330:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1 )
            // InternalExternalsParser.g:2331:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0__Impl"
    // InternalExternalsParser.g:2338:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2342:1: ( ( () ) )
            // InternalExternalsParser.g:2343:1: ( () )
            {
            // InternalExternalsParser.g:2343:1: ( () )
            // InternalExternalsParser.g:2344:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getExternalsRootAPIDescriptionsItemsAPIAuthAction_0()); 
            // InternalExternalsParser.g:2345:2: ()
            // InternalExternalsParser.g:2345:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getExternalsRootAPIDescriptionsItemsAPIAuthAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1"
    // InternalExternalsParser.g:2353:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1 : rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2357:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2 )
            // InternalExternalsParser.g:2358:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1__Impl"
    // InternalExternalsParser.g:2365:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1__Impl : ( APIAuth ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2369:1: ( ( APIAuth ) )
            // InternalExternalsParser.g:2370:1: ( APIAuth )
            {
            // InternalExternalsParser.g:2370:1: ( APIAuth )
            // InternalExternalsParser.g:2371:2: APIAuth
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthKeyword_1()); 
            match(input,APIAuth,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2"
    // InternalExternalsParser.g:2380:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2 : rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2384:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3 )
            // InternalExternalsParser.g:2385:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2__Impl"
    // InternalExternalsParser.g:2392:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2396:1: ( ( Colon ) )
            // InternalExternalsParser.g:2397:1: ( Colon )
            {
            // InternalExternalsParser.g:2397:1: ( Colon )
            // InternalExternalsParser.g:2398:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3"
    // InternalExternalsParser.g:2407:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3 : rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2411:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4 )
            // InternalExternalsParser.g:2412:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3__Impl"
    // InternalExternalsParser.g:2419:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2423:1: ( ( LeftSquareBracket ) )
            // InternalExternalsParser.g:2424:1: ( LeftSquareBracket )
            {
            // InternalExternalsParser.g:2424:1: ( LeftSquareBracket )
            // InternalExternalsParser.g:2425:2: LeftSquareBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4"
    // InternalExternalsParser.g:2434:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4 : rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2438:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5 )
            // InternalExternalsParser.g:2439:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4__Impl"
    // InternalExternalsParser.g:2446:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0 )? ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2450:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0 )? ) )
            // InternalExternalsParser.g:2451:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0 )? )
            {
            // InternalExternalsParser.g:2451:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0 )? )
            // InternalExternalsParser.g:2452:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0 )?
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getGroup_4()); 
            // InternalExternalsParser.g:2453:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LeftCurlyBracket) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalExternalsParser.g:2453:3: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__4__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5"
    // InternalExternalsParser.g:2461:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5 : rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2465:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5__Impl )
            // InternalExternalsParser.g:2466:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5__Impl"
    // InternalExternalsParser.g:2472:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2476:1: ( ( RightSquareBracket ) )
            // InternalExternalsParser.g:2477:1: ( RightSquareBracket )
            {
            // InternalExternalsParser.g:2477:1: ( RightSquareBracket )
            // InternalExternalsParser.g:2478:2: RightSquareBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__5__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0"
    // InternalExternalsParser.g:2488:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0 : rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2492:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1 )
            // InternalExternalsParser.g:2493:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0__Impl"
    // InternalExternalsParser.g:2500:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2504:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0 ) ) )
            // InternalExternalsParser.g:2505:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0 ) )
            {
            // InternalExternalsParser.g:2505:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0 ) )
            // InternalExternalsParser.g:2506:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthAssignment_4_0()); 
            // InternalExternalsParser.g:2507:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0 )
            // InternalExternalsParser.g:2507:3: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1"
    // InternalExternalsParser.g:2515:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1 : rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2519:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1__Impl )
            // InternalExternalsParser.g:2520:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1__Impl"
    // InternalExternalsParser.g:2526:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0 )* ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2530:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0 )* ) )
            // InternalExternalsParser.g:2531:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0 )* )
            {
            // InternalExternalsParser.g:2531:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0 )* )
            // InternalExternalsParser.g:2532:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0 )*
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getGroup_4_1()); 
            // InternalExternalsParser.g:2533:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalExternalsParser.g:2533:3: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0"
    // InternalExternalsParser.g:2542:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0 : rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2546:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1 )
            // InternalExternalsParser.g:2547:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0__Impl"
    // InternalExternalsParser.g:2554:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2558:1: ( ( Comma ) )
            // InternalExternalsParser.g:2559:1: ( Comma )
            {
            // InternalExternalsParser.g:2559:1: ( Comma )
            // InternalExternalsParser.g:2560:2: Comma
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1"
    // InternalExternalsParser.g:2569:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1 : rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2573:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1__Impl )
            // InternalExternalsParser.g:2574:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1__Impl"
    // InternalExternalsParser.g:2580:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2584:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1 ) ) )
            // InternalExternalsParser.g:2585:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1 ) )
            {
            // InternalExternalsParser.g:2585:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1 ) )
            // InternalExternalsParser.g:2586:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthAssignment_4_1_1()); 
            // InternalExternalsParser.g:2587:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1 )
            // InternalExternalsParser.g:2587:3: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0"
    // InternalExternalsParser.g:2596:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2600:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1 )
            // InternalExternalsParser.g:2601:2: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0__Impl"
    // InternalExternalsParser.g:2608:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2612:1: ( ( () ) )
            // InternalExternalsParser.g:2613:1: ( () )
            {
            // InternalExternalsParser.g:2613:1: ( () )
            // InternalExternalsParser.g:2614:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getExternalsRootAPIDescriptionsItemsPathsItemsAction_0()); 
            // InternalExternalsParser.g:2615:2: ()
            // InternalExternalsParser.g:2615:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getExternalsRootAPIDescriptionsItemsPathsItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1"
    // InternalExternalsParser.g:2623:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2627:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2 )
            // InternalExternalsParser.g:2628:2: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1__Impl"
    // InternalExternalsParser.g:2635:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2639:1: ( ( LeftCurlyBracket ) )
            // InternalExternalsParser.g:2640:1: ( LeftCurlyBracket )
            {
            // InternalExternalsParser.g:2640:1: ( LeftCurlyBracket )
            // InternalExternalsParser.g:2641:2: LeftCurlyBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2"
    // InternalExternalsParser.g:2650:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2 : rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2654:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3 )
            // InternalExternalsParser.g:2655:2: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2__Impl"
    // InternalExternalsParser.g:2662:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0 )? ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2666:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0 )? ) )
            // InternalExternalsParser.g:2667:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0 )? )
            {
            // InternalExternalsParser.g:2667:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0 )? )
            // InternalExternalsParser.g:2668:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0 )?
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getGroup_2()); 
            // InternalExternalsParser.g:2669:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Parameters||LA18_0==Outputs||LA18_0==Route) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalExternalsParser.g:2669:3: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3"
    // InternalExternalsParser.g:2677:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3 : rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2681:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3__Impl )
            // InternalExternalsParser.g:2682:2: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3__Impl"
    // InternalExternalsParser.g:2688:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2692:1: ( ( RightCurlyBracket ) )
            // InternalExternalsParser.g:2693:1: ( RightCurlyBracket )
            {
            // InternalExternalsParser.g:2693:1: ( RightCurlyBracket )
            // InternalExternalsParser.g:2694:2: RightCurlyBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0"
    // InternalExternalsParser.g:2704:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2708:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1 )
            // InternalExternalsParser.g:2709:2: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0__Impl"
    // InternalExternalsParser.g:2716:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2720:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0 ) ) )
            // InternalExternalsParser.g:2721:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0 ) )
            {
            // InternalExternalsParser.g:2721:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0 ) )
            // InternalExternalsParser.g:2722:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getItemsAssignment_2_0()); 
            // InternalExternalsParser.g:2723:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0 )
            // InternalExternalsParser.g:2723:3: rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1"
    // InternalExternalsParser.g:2731:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2735:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1__Impl )
            // InternalExternalsParser.g:2736:2: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1__Impl"
    // InternalExternalsParser.g:2742:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0 )* ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2746:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0 )* ) )
            // InternalExternalsParser.g:2747:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0 )* )
            {
            // InternalExternalsParser.g:2747:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0 )* )
            // InternalExternalsParser.g:2748:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0 )*
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getGroup_2_1()); 
            // InternalExternalsParser.g:2749:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Comma) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalExternalsParser.g:2749:3: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0"
    // InternalExternalsParser.g:2758:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2762:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1 )
            // InternalExternalsParser.g:2763:2: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1
            {
            pushFollow(FOLLOW_17);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0__Impl"
    // InternalExternalsParser.g:2770:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2774:1: ( ( Comma ) )
            // InternalExternalsParser.g:2775:1: ( Comma )
            {
            // InternalExternalsParser.g:2775:1: ( Comma )
            // InternalExternalsParser.g:2776:2: Comma
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1"
    // InternalExternalsParser.g:2785:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2789:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1__Impl )
            // InternalExternalsParser.g:2790:2: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1__Impl"
    // InternalExternalsParser.g:2796:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2800:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1 ) ) )
            // InternalExternalsParser.g:2801:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalExternalsParser.g:2801:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1 ) )
            // InternalExternalsParser.g:2802:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalExternalsParser.g:2803:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1 )
            // InternalExternalsParser.g:2803:3: rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0"
    // InternalExternalsParser.g:2812:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2816:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1 )
            // InternalExternalsParser.g:2817:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0__Impl"
    // InternalExternalsParser.g:2824:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0__Impl : ( Route ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2828:1: ( ( Route ) )
            // InternalExternalsParser.g:2829:1: ( Route )
            {
            // InternalExternalsParser.g:2829:1: ( Route )
            // InternalExternalsParser.g:2830:2: Route
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getRouteKeyword_0()); 
            match(input,Route,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getRouteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1"
    // InternalExternalsParser.g:2839:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2843:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2 )
            // InternalExternalsParser.g:2844:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1__Impl"
    // InternalExternalsParser.g:2851:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2855:1: ( ( Colon ) )
            // InternalExternalsParser.g:2856:1: ( Colon )
            {
            // InternalExternalsParser.g:2856:1: ( Colon )
            // InternalExternalsParser.g:2857:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2"
    // InternalExternalsParser.g:2866:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2870:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2__Impl )
            // InternalExternalsParser.g:2871:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2__Impl"
    // InternalExternalsParser.g:2877:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2881:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2 ) ) )
            // InternalExternalsParser.g:2882:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2 ) )
            {
            // InternalExternalsParser.g:2882:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2 ) )
            // InternalExternalsParser.g:2883:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getRouteAssignment_2()); 
            // InternalExternalsParser.g:2884:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2 )
            // InternalExternalsParser.g:2884:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getRouteAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0"
    // InternalExternalsParser.g:2893:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2897:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1 )
            // InternalExternalsParser.g:2898:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0__Impl"
    // InternalExternalsParser.g:2905:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2909:1: ( ( () ) )
            // InternalExternalsParser.g:2910:1: ( () )
            {
            // InternalExternalsParser.g:2910:1: ( () )
            // InternalExternalsParser.g:2911:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersAction_0()); 
            // InternalExternalsParser.g:2912:2: ()
            // InternalExternalsParser.g:2912:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1"
    // InternalExternalsParser.g:2920:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2924:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2 )
            // InternalExternalsParser.g:2925:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1__Impl"
    // InternalExternalsParser.g:2932:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1__Impl : ( Parameters ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2936:1: ( ( Parameters ) )
            // InternalExternalsParser.g:2937:1: ( Parameters )
            {
            // InternalExternalsParser.g:2937:1: ( Parameters )
            // InternalExternalsParser.g:2938:2: Parameters
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersKeyword_1()); 
            match(input,Parameters,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2"
    // InternalExternalsParser.g:2947:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2951:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3 )
            // InternalExternalsParser.g:2952:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2__Impl"
    // InternalExternalsParser.g:2959:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2963:1: ( ( Colon ) )
            // InternalExternalsParser.g:2964:1: ( Colon )
            {
            // InternalExternalsParser.g:2964:1: ( Colon )
            // InternalExternalsParser.g:2965:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3"
    // InternalExternalsParser.g:2974:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2978:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4 )
            // InternalExternalsParser.g:2979:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3__Impl"
    // InternalExternalsParser.g:2986:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:2990:1: ( ( LeftSquareBracket ) )
            // InternalExternalsParser.g:2991:1: ( LeftSquareBracket )
            {
            // InternalExternalsParser.g:2991:1: ( LeftSquareBracket )
            // InternalExternalsParser.g:2992:2: LeftSquareBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4"
    // InternalExternalsParser.g:3001:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3005:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5 )
            // InternalExternalsParser.g:3006:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4__Impl"
    // InternalExternalsParser.g:3013:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0 )? ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3017:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0 )? ) )
            // InternalExternalsParser.g:3018:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0 )? )
            {
            // InternalExternalsParser.g:3018:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0 )? )
            // InternalExternalsParser.g:3019:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0 )?
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getGroup_4()); 
            // InternalExternalsParser.g:3020:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LeftCurlyBracket) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalExternalsParser.g:3020:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__4__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5"
    // InternalExternalsParser.g:3028:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3032:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5__Impl )
            // InternalExternalsParser.g:3033:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5__Impl"
    // InternalExternalsParser.g:3039:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3043:1: ( ( RightSquareBracket ) )
            // InternalExternalsParser.g:3044:1: ( RightSquareBracket )
            {
            // InternalExternalsParser.g:3044:1: ( RightSquareBracket )
            // InternalExternalsParser.g:3045:2: RightSquareBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__5__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0"
    // InternalExternalsParser.g:3055:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3059:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1 )
            // InternalExternalsParser.g:3060:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0__Impl"
    // InternalExternalsParser.g:3067:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3071:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0 ) ) )
            // InternalExternalsParser.g:3072:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0 ) )
            {
            // InternalExternalsParser.g:3072:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0 ) )
            // InternalExternalsParser.g:3073:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersAssignment_4_0()); 
            // InternalExternalsParser.g:3074:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0 )
            // InternalExternalsParser.g:3074:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1"
    // InternalExternalsParser.g:3082:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3086:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1__Impl )
            // InternalExternalsParser.g:3087:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1__Impl"
    // InternalExternalsParser.g:3093:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0 )* ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3097:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0 )* ) )
            // InternalExternalsParser.g:3098:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0 )* )
            {
            // InternalExternalsParser.g:3098:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0 )* )
            // InternalExternalsParser.g:3099:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0 )*
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getGroup_4_1()); 
            // InternalExternalsParser.g:3100:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalExternalsParser.g:3100:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0"
    // InternalExternalsParser.g:3109:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3113:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1 )
            // InternalExternalsParser.g:3114:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0__Impl"
    // InternalExternalsParser.g:3121:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3125:1: ( ( Comma ) )
            // InternalExternalsParser.g:3126:1: ( Comma )
            {
            // InternalExternalsParser.g:3126:1: ( Comma )
            // InternalExternalsParser.g:3127:2: Comma
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1"
    // InternalExternalsParser.g:3136:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3140:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1__Impl )
            // InternalExternalsParser.g:3141:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1__Impl"
    // InternalExternalsParser.g:3147:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3151:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1 ) ) )
            // InternalExternalsParser.g:3152:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1 ) )
            {
            // InternalExternalsParser.g:3152:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1 ) )
            // InternalExternalsParser.g:3153:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersAssignment_4_1_1()); 
            // InternalExternalsParser.g:3154:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1 )
            // InternalExternalsParser.g:3154:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0"
    // InternalExternalsParser.g:3163:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3167:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1 )
            // InternalExternalsParser.g:3168:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0__Impl"
    // InternalExternalsParser.g:3175:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3179:1: ( ( () ) )
            // InternalExternalsParser.g:3180:1: ( () )
            {
            // InternalExternalsParser.g:3180:1: ( () )
            // InternalExternalsParser.g:3181:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAction_0()); 
            // InternalExternalsParser.g:3182:2: ()
            // InternalExternalsParser.g:3182:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1"
    // InternalExternalsParser.g:3190:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3194:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2 )
            // InternalExternalsParser.g:3195:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1__Impl"
    // InternalExternalsParser.g:3202:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1__Impl : ( Outputs ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3206:1: ( ( Outputs ) )
            // InternalExternalsParser.g:3207:1: ( Outputs )
            {
            // InternalExternalsParser.g:3207:1: ( Outputs )
            // InternalExternalsParser.g:3208:2: Outputs
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsKeyword_1()); 
            match(input,Outputs,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2"
    // InternalExternalsParser.g:3217:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3221:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3 )
            // InternalExternalsParser.g:3222:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2__Impl"
    // InternalExternalsParser.g:3229:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3233:1: ( ( Colon ) )
            // InternalExternalsParser.g:3234:1: ( Colon )
            {
            // InternalExternalsParser.g:3234:1: ( Colon )
            // InternalExternalsParser.g:3235:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3"
    // InternalExternalsParser.g:3244:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3248:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4 )
            // InternalExternalsParser.g:3249:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3__Impl"
    // InternalExternalsParser.g:3256:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3260:1: ( ( LeftSquareBracket ) )
            // InternalExternalsParser.g:3261:1: ( LeftSquareBracket )
            {
            // InternalExternalsParser.g:3261:1: ( LeftSquareBracket )
            // InternalExternalsParser.g:3262:2: LeftSquareBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4"
    // InternalExternalsParser.g:3271:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3275:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5 )
            // InternalExternalsParser.g:3276:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4__Impl"
    // InternalExternalsParser.g:3283:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0 )? ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3287:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0 )? ) )
            // InternalExternalsParser.g:3288:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0 )? )
            {
            // InternalExternalsParser.g:3288:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0 )? )
            // InternalExternalsParser.g:3289:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0 )?
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getGroup_4()); 
            // InternalExternalsParser.g:3290:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LeftCurlyBracket) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalExternalsParser.g:3290:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__4__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5"
    // InternalExternalsParser.g:3298:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3302:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5__Impl )
            // InternalExternalsParser.g:3303:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5__Impl"
    // InternalExternalsParser.g:3309:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3313:1: ( ( RightSquareBracket ) )
            // InternalExternalsParser.g:3314:1: ( RightSquareBracket )
            {
            // InternalExternalsParser.g:3314:1: ( RightSquareBracket )
            // InternalExternalsParser.g:3315:2: RightSquareBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__5__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0"
    // InternalExternalsParser.g:3325:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3329:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1 )
            // InternalExternalsParser.g:3330:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0__Impl"
    // InternalExternalsParser.g:3337:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3341:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0 ) ) )
            // InternalExternalsParser.g:3342:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0 ) )
            {
            // InternalExternalsParser.g:3342:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0 ) )
            // InternalExternalsParser.g:3343:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsAssignment_4_0()); 
            // InternalExternalsParser.g:3344:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0 )
            // InternalExternalsParser.g:3344:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1"
    // InternalExternalsParser.g:3352:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3356:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1__Impl )
            // InternalExternalsParser.g:3357:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1__Impl"
    // InternalExternalsParser.g:3363:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0 )* ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3367:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0 )* ) )
            // InternalExternalsParser.g:3368:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0 )* )
            {
            // InternalExternalsParser.g:3368:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0 )* )
            // InternalExternalsParser.g:3369:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0 )*
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getGroup_4_1()); 
            // InternalExternalsParser.g:3370:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Comma) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalExternalsParser.g:3370:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0"
    // InternalExternalsParser.g:3379:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3383:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1 )
            // InternalExternalsParser.g:3384:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0__Impl"
    // InternalExternalsParser.g:3391:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3395:1: ( ( Comma ) )
            // InternalExternalsParser.g:3396:1: ( Comma )
            {
            // InternalExternalsParser.g:3396:1: ( Comma )
            // InternalExternalsParser.g:3397:2: Comma
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1"
    // InternalExternalsParser.g:3406:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3410:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1__Impl )
            // InternalExternalsParser.g:3411:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1__Impl"
    // InternalExternalsParser.g:3417:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3421:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1 ) ) )
            // InternalExternalsParser.g:3422:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1 ) )
            {
            // InternalExternalsParser.g:3422:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1 ) )
            // InternalExternalsParser.g:3423:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsAssignment_4_1_1()); 
            // InternalExternalsParser.g:3424:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1 )
            // InternalExternalsParser.g:3424:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0"
    // InternalExternalsParser.g:3433:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3437:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1 )
            // InternalExternalsParser.g:3438:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0__Impl"
    // InternalExternalsParser.g:3445:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3449:1: ( ( () ) )
            // InternalExternalsParser.g:3450:1: ( () )
            {
            // InternalExternalsParser.g:3450:1: ( () )
            // InternalExternalsParser.g:3451:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAction_0()); 
            // InternalExternalsParser.g:3452:2: ()
            // InternalExternalsParser.g:3452:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1"
    // InternalExternalsParser.g:3460:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3464:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2 )
            // InternalExternalsParser.g:3465:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1__Impl"
    // InternalExternalsParser.g:3472:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3476:1: ( ( LeftCurlyBracket ) )
            // InternalExternalsParser.g:3477:1: ( LeftCurlyBracket )
            {
            // InternalExternalsParser.g:3477:1: ( LeftCurlyBracket )
            // InternalExternalsParser.g:3478:2: LeftCurlyBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2"
    // InternalExternalsParser.g:3487:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3491:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3 )
            // InternalExternalsParser.g:3492:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2__Impl"
    // InternalExternalsParser.g:3499:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0 )? ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3503:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0 )? ) )
            // InternalExternalsParser.g:3504:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0 )? )
            {
            // InternalExternalsParser.g:3504:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0 )? )
            // InternalExternalsParser.g:3505:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0 )?
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getGroup_2()); 
            // InternalExternalsParser.g:3506:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=Name && LA24_0<=Type)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalExternalsParser.g:3506:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3"
    // InternalExternalsParser.g:3514:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3518:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3__Impl )
            // InternalExternalsParser.g:3519:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3__Impl"
    // InternalExternalsParser.g:3525:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3529:1: ( ( RightCurlyBracket ) )
            // InternalExternalsParser.g:3530:1: ( RightCurlyBracket )
            {
            // InternalExternalsParser.g:3530:1: ( RightCurlyBracket )
            // InternalExternalsParser.g:3531:2: RightCurlyBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0"
    // InternalExternalsParser.g:3541:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3545:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1 )
            // InternalExternalsParser.g:3546:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0__Impl"
    // InternalExternalsParser.g:3553:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3557:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0 ) ) )
            // InternalExternalsParser.g:3558:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0 ) )
            {
            // InternalExternalsParser.g:3558:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0 ) )
            // InternalExternalsParser.g:3559:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getItemsAssignment_2_0()); 
            // InternalExternalsParser.g:3560:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0 )
            // InternalExternalsParser.g:3560:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1"
    // InternalExternalsParser.g:3568:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3572:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1__Impl )
            // InternalExternalsParser.g:3573:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1__Impl"
    // InternalExternalsParser.g:3579:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0 )* ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3583:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0 )* ) )
            // InternalExternalsParser.g:3584:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0 )* )
            {
            // InternalExternalsParser.g:3584:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0 )* )
            // InternalExternalsParser.g:3585:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0 )*
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getGroup_2_1()); 
            // InternalExternalsParser.g:3586:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Comma) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalExternalsParser.g:3586:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0"
    // InternalExternalsParser.g:3595:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3599:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1 )
            // InternalExternalsParser.g:3600:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1
            {
            pushFollow(FOLLOW_20);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0__Impl"
    // InternalExternalsParser.g:3607:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3611:1: ( ( Comma ) )
            // InternalExternalsParser.g:3612:1: ( Comma )
            {
            // InternalExternalsParser.g:3612:1: ( Comma )
            // InternalExternalsParser.g:3613:2: Comma
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1"
    // InternalExternalsParser.g:3622:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3626:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1__Impl )
            // InternalExternalsParser.g:3627:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1__Impl"
    // InternalExternalsParser.g:3633:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3637:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1 ) ) )
            // InternalExternalsParser.g:3638:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalExternalsParser.g:3638:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1 ) )
            // InternalExternalsParser.g:3639:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalExternalsParser.g:3640:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1 )
            // InternalExternalsParser.g:3640:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0"
    // InternalExternalsParser.g:3649:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3653:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1 )
            // InternalExternalsParser.g:3654:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0__Impl"
    // InternalExternalsParser.g:3661:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3665:1: ( ( () ) )
            // InternalExternalsParser.g:3666:1: ( () )
            {
            // InternalExternalsParser.g:3666:1: ( () )
            // InternalExternalsParser.g:3667:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAction_0()); 
            // InternalExternalsParser.g:3668:2: ()
            // InternalExternalsParser.g:3668:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1"
    // InternalExternalsParser.g:3676:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3680:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2 )
            // InternalExternalsParser.g:3681:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1__Impl"
    // InternalExternalsParser.g:3688:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1__Impl : ( Name ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3692:1: ( ( Name ) )
            // InternalExternalsParser.g:3693:1: ( Name )
            {
            // InternalExternalsParser.g:3693:1: ( Name )
            // InternalExternalsParser.g:3694:2: Name
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2"
    // InternalExternalsParser.g:3703:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3707:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3 )
            // InternalExternalsParser.g:3708:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2__Impl"
    // InternalExternalsParser.g:3715:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3719:1: ( ( Colon ) )
            // InternalExternalsParser.g:3720:1: ( Colon )
            {
            // InternalExternalsParser.g:3720:1: ( Colon )
            // InternalExternalsParser.g:3721:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3"
    // InternalExternalsParser.g:3730:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3734:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3__Impl )
            // InternalExternalsParser.g:3735:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3__Impl"
    // InternalExternalsParser.g:3741:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3745:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3 ) ) )
            // InternalExternalsParser.g:3746:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3 ) )
            {
            // InternalExternalsParser.g:3746:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3 ) )
            // InternalExternalsParser.g:3747:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getNameAssignment_3()); 
            // InternalExternalsParser.g:3748:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3 )
            // InternalExternalsParser.g:3748:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0"
    // InternalExternalsParser.g:3757:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3761:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1 )
            // InternalExternalsParser.g:3762:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0__Impl"
    // InternalExternalsParser.g:3769:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0__Impl : ( Type ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3773:1: ( ( Type ) )
            // InternalExternalsParser.g:3774:1: ( Type )
            {
            // InternalExternalsParser.g:3774:1: ( Type )
            // InternalExternalsParser.g:3775:2: Type
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getTypeKeyword_0()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1"
    // InternalExternalsParser.g:3784:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3788:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2 )
            // InternalExternalsParser.g:3789:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1__Impl"
    // InternalExternalsParser.g:3796:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3800:1: ( ( Colon ) )
            // InternalExternalsParser.g:3801:1: ( Colon )
            {
            // InternalExternalsParser.g:3801:1: ( Colon )
            // InternalExternalsParser.g:3802:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2"
    // InternalExternalsParser.g:3811:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3815:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2__Impl )
            // InternalExternalsParser.g:3816:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2__Impl"
    // InternalExternalsParser.g:3822:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3826:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2 ) ) )
            // InternalExternalsParser.g:3827:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2 ) )
            {
            // InternalExternalsParser.g:3827:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2 ) )
            // InternalExternalsParser.g:3828:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getTypeAssignment_2()); 
            // InternalExternalsParser.g:3829:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2 )
            // InternalExternalsParser.g:3829:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0"
    // InternalExternalsParser.g:3838:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3842:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1 )
            // InternalExternalsParser.g:3843:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0__Impl"
    // InternalExternalsParser.g:3850:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3854:1: ( ( () ) )
            // InternalExternalsParser.g:3855:1: ( () )
            {
            // InternalExternalsParser.g:3855:1: ( () )
            // InternalExternalsParser.g:3856:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAction_0()); 
            // InternalExternalsParser.g:3857:2: ()
            // InternalExternalsParser.g:3857:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1"
    // InternalExternalsParser.g:3865:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3869:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2 )
            // InternalExternalsParser.g:3870:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1__Impl"
    // InternalExternalsParser.g:3877:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3881:1: ( ( LeftCurlyBracket ) )
            // InternalExternalsParser.g:3882:1: ( LeftCurlyBracket )
            {
            // InternalExternalsParser.g:3882:1: ( LeftCurlyBracket )
            // InternalExternalsParser.g:3883:2: LeftCurlyBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2"
    // InternalExternalsParser.g:3892:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3896:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3 )
            // InternalExternalsParser.g:3897:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2__Impl"
    // InternalExternalsParser.g:3904:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0 )? ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3908:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0 )? ) )
            // InternalExternalsParser.g:3909:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0 )? )
            {
            // InternalExternalsParser.g:3909:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0 )? )
            // InternalExternalsParser.g:3910:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0 )?
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getGroup_2()); 
            // InternalExternalsParser.g:3911:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==JSONPath||(LA26_0>=Name && LA26_0<=Type)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalExternalsParser.g:3911:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3"
    // InternalExternalsParser.g:3919:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3923:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3__Impl )
            // InternalExternalsParser.g:3924:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3__Impl"
    // InternalExternalsParser.g:3930:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3934:1: ( ( RightCurlyBracket ) )
            // InternalExternalsParser.g:3935:1: ( RightCurlyBracket )
            {
            // InternalExternalsParser.g:3935:1: ( RightCurlyBracket )
            // InternalExternalsParser.g:3936:2: RightCurlyBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0"
    // InternalExternalsParser.g:3946:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3950:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1 )
            // InternalExternalsParser.g:3951:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0__Impl"
    // InternalExternalsParser.g:3958:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3962:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0 ) ) )
            // InternalExternalsParser.g:3963:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0 ) )
            {
            // InternalExternalsParser.g:3963:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0 ) )
            // InternalExternalsParser.g:3964:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getItemsAssignment_2_0()); 
            // InternalExternalsParser.g:3965:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0 )
            // InternalExternalsParser.g:3965:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1"
    // InternalExternalsParser.g:3973:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3977:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1__Impl )
            // InternalExternalsParser.g:3978:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1__Impl"
    // InternalExternalsParser.g:3984:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0 )* ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:3988:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0 )* ) )
            // InternalExternalsParser.g:3989:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0 )* )
            {
            // InternalExternalsParser.g:3989:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0 )* )
            // InternalExternalsParser.g:3990:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0 )*
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getGroup_2_1()); 
            // InternalExternalsParser.g:3991:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalExternalsParser.g:3991:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0"
    // InternalExternalsParser.g:4000:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4004:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1 )
            // InternalExternalsParser.g:4005:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1
            {
            pushFollow(FOLLOW_22);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0__Impl"
    // InternalExternalsParser.g:4012:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4016:1: ( ( Comma ) )
            // InternalExternalsParser.g:4017:1: ( Comma )
            {
            // InternalExternalsParser.g:4017:1: ( Comma )
            // InternalExternalsParser.g:4018:2: Comma
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1"
    // InternalExternalsParser.g:4027:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4031:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1__Impl )
            // InternalExternalsParser.g:4032:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1__Impl"
    // InternalExternalsParser.g:4038:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4042:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1 ) ) )
            // InternalExternalsParser.g:4043:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalExternalsParser.g:4043:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1 ) )
            // InternalExternalsParser.g:4044:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalExternalsParser.g:4045:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1 )
            // InternalExternalsParser.g:4045:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0"
    // InternalExternalsParser.g:4054:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4058:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1 )
            // InternalExternalsParser.g:4059:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0__Impl"
    // InternalExternalsParser.g:4066:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4070:1: ( ( () ) )
            // InternalExternalsParser.g:4071:1: ( () )
            {
            // InternalExternalsParser.g:4071:1: ( () )
            // InternalExternalsParser.g:4072:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAction_0()); 
            // InternalExternalsParser.g:4073:2: ()
            // InternalExternalsParser.g:4073:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1"
    // InternalExternalsParser.g:4081:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4085:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2 )
            // InternalExternalsParser.g:4086:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1__Impl"
    // InternalExternalsParser.g:4093:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1__Impl : ( Name ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4097:1: ( ( Name ) )
            // InternalExternalsParser.g:4098:1: ( Name )
            {
            // InternalExternalsParser.g:4098:1: ( Name )
            // InternalExternalsParser.g:4099:2: Name
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2"
    // InternalExternalsParser.g:4108:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4112:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3 )
            // InternalExternalsParser.g:4113:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2__Impl"
    // InternalExternalsParser.g:4120:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4124:1: ( ( Colon ) )
            // InternalExternalsParser.g:4125:1: ( Colon )
            {
            // InternalExternalsParser.g:4125:1: ( Colon )
            // InternalExternalsParser.g:4126:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3"
    // InternalExternalsParser.g:4135:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4139:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3__Impl )
            // InternalExternalsParser.g:4140:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3__Impl"
    // InternalExternalsParser.g:4146:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4150:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3 ) ) )
            // InternalExternalsParser.g:4151:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3 ) )
            {
            // InternalExternalsParser.g:4151:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3 ) )
            // InternalExternalsParser.g:4152:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getNameAssignment_3()); 
            // InternalExternalsParser.g:4153:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3 )
            // InternalExternalsParser.g:4153:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0"
    // InternalExternalsParser.g:4162:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4166:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1 )
            // InternalExternalsParser.g:4167:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0__Impl"
    // InternalExternalsParser.g:4174:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0__Impl : ( Type ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4178:1: ( ( Type ) )
            // InternalExternalsParser.g:4179:1: ( Type )
            {
            // InternalExternalsParser.g:4179:1: ( Type )
            // InternalExternalsParser.g:4180:2: Type
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getTypeKeyword_0()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1"
    // InternalExternalsParser.g:4189:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4193:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2 )
            // InternalExternalsParser.g:4194:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1__Impl"
    // InternalExternalsParser.g:4201:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4205:1: ( ( Colon ) )
            // InternalExternalsParser.g:4206:1: ( Colon )
            {
            // InternalExternalsParser.g:4206:1: ( Colon )
            // InternalExternalsParser.g:4207:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2"
    // InternalExternalsParser.g:4216:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4220:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2__Impl )
            // InternalExternalsParser.g:4221:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2__Impl"
    // InternalExternalsParser.g:4227:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4231:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2 ) ) )
            // InternalExternalsParser.g:4232:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2 ) )
            {
            // InternalExternalsParser.g:4232:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2 ) )
            // InternalExternalsParser.g:4233:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getTypeAssignment_2()); 
            // InternalExternalsParser.g:4234:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2 )
            // InternalExternalsParser.g:4234:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0"
    // InternalExternalsParser.g:4243:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4247:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1 )
            // InternalExternalsParser.g:4248:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0__Impl"
    // InternalExternalsParser.g:4255:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0__Impl : ( JSONPath ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4259:1: ( ( JSONPath ) )
            // InternalExternalsParser.g:4260:1: ( JSONPath )
            {
            // InternalExternalsParser.g:4260:1: ( JSONPath )
            // InternalExternalsParser.g:4261:2: JSONPath
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getJSONPathKeyword_0()); 
            match(input,JSONPath,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getJSONPathKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1"
    // InternalExternalsParser.g:4270:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4274:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2 )
            // InternalExternalsParser.g:4275:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1__Impl"
    // InternalExternalsParser.g:4282:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4286:1: ( ( Colon ) )
            // InternalExternalsParser.g:4287:1: ( Colon )
            {
            // InternalExternalsParser.g:4287:1: ( Colon )
            // InternalExternalsParser.g:4288:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2"
    // InternalExternalsParser.g:4297:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2 : rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4301:1: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2__Impl )
            // InternalExternalsParser.g:4302:2: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2__Impl"
    // InternalExternalsParser.g:4308:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4312:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2 ) ) )
            // InternalExternalsParser.g:4313:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2 ) )
            {
            // InternalExternalsParser.g:4313:1: ( ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2 ) )
            // InternalExternalsParser.g:4314:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getJSONPathAssignment_2()); 
            // InternalExternalsParser.g:4315:2: ( rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2 )
            // InternalExternalsParser.g:4315:3: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getJSONPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0"
    // InternalExternalsParser.g:4324:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4328:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1 )
            // InternalExternalsParser.g:4329:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0__Impl"
    // InternalExternalsParser.g:4336:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4340:1: ( ( () ) )
            // InternalExternalsParser.g:4341:1: ( () )
            {
            // InternalExternalsParser.g:4341:1: ( () )
            // InternalExternalsParser.g:4342:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getExternalsRootAPIDescriptionsItemsAPIAuthItemsAction_0()); 
            // InternalExternalsParser.g:4343:2: ()
            // InternalExternalsParser.g:4343:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getExternalsRootAPIDescriptionsItemsAPIAuthItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1"
    // InternalExternalsParser.g:4351:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4355:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2 )
            // InternalExternalsParser.g:4356:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1__Impl"
    // InternalExternalsParser.g:4363:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4367:1: ( ( LeftCurlyBracket ) )
            // InternalExternalsParser.g:4368:1: ( LeftCurlyBracket )
            {
            // InternalExternalsParser.g:4368:1: ( LeftCurlyBracket )
            // InternalExternalsParser.g:4369:2: LeftCurlyBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2"
    // InternalExternalsParser.g:4378:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4382:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3 )
            // InternalExternalsParser.g:4383:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2__Impl"
    // InternalExternalsParser.g:4390:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0 )? ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4394:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0 )? ) )
            // InternalExternalsParser.g:4395:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0 )? )
            {
            // InternalExternalsParser.g:4395:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0 )? )
            // InternalExternalsParser.g:4396:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0 )?
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getGroup_2()); 
            // InternalExternalsParser.g:4397:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Name||LA28_0==Key) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalExternalsParser.g:4397:3: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3"
    // InternalExternalsParser.g:4405:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4409:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3__Impl )
            // InternalExternalsParser.g:4410:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3__Impl"
    // InternalExternalsParser.g:4416:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4420:1: ( ( RightCurlyBracket ) )
            // InternalExternalsParser.g:4421:1: ( RightCurlyBracket )
            {
            // InternalExternalsParser.g:4421:1: ( RightCurlyBracket )
            // InternalExternalsParser.g:4422:2: RightCurlyBracket
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0"
    // InternalExternalsParser.g:4432:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4436:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1 )
            // InternalExternalsParser.g:4437:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0__Impl"
    // InternalExternalsParser.g:4444:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4448:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0 ) ) )
            // InternalExternalsParser.g:4449:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0 ) )
            {
            // InternalExternalsParser.g:4449:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0 ) )
            // InternalExternalsParser.g:4450:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getItemsAssignment_2_0()); 
            // InternalExternalsParser.g:4451:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0 )
            // InternalExternalsParser.g:4451:3: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1"
    // InternalExternalsParser.g:4459:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4463:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1__Impl )
            // InternalExternalsParser.g:4464:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1__Impl"
    // InternalExternalsParser.g:4470:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0 )* ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4474:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0 )* ) )
            // InternalExternalsParser.g:4475:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0 )* )
            {
            // InternalExternalsParser.g:4475:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0 )* )
            // InternalExternalsParser.g:4476:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0 )*
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getGroup_2_1()); 
            // InternalExternalsParser.g:4477:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Comma) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalExternalsParser.g:4477:3: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0"
    // InternalExternalsParser.g:4486:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4490:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1 )
            // InternalExternalsParser.g:4491:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0__Impl"
    // InternalExternalsParser.g:4498:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4502:1: ( ( Comma ) )
            // InternalExternalsParser.g:4503:1: ( Comma )
            {
            // InternalExternalsParser.g:4503:1: ( Comma )
            // InternalExternalsParser.g:4504:2: Comma
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1"
    // InternalExternalsParser.g:4513:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4517:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1__Impl )
            // InternalExternalsParser.g:4518:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1__Impl"
    // InternalExternalsParser.g:4524:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4528:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1 ) ) )
            // InternalExternalsParser.g:4529:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalExternalsParser.g:4529:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1 ) )
            // InternalExternalsParser.g:4530:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalExternalsParser.g:4531:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1 )
            // InternalExternalsParser.g:4531:3: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0"
    // InternalExternalsParser.g:4540:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4544:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1 )
            // InternalExternalsParser.g:4545:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0__Impl"
    // InternalExternalsParser.g:4552:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0__Impl : ( () ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4556:1: ( ( () ) )
            // InternalExternalsParser.g:4557:1: ( () )
            {
            // InternalExternalsParser.g:4557:1: ( () )
            // InternalExternalsParser.g:4558:2: ()
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAction_0()); 
            // InternalExternalsParser.g:4559:2: ()
            // InternalExternalsParser.g:4559:3: 
            {
            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1"
    // InternalExternalsParser.g:4567:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4571:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2 )
            // InternalExternalsParser.g:4572:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1__Impl"
    // InternalExternalsParser.g:4579:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1__Impl : ( Name ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4583:1: ( ( Name ) )
            // InternalExternalsParser.g:4584:1: ( Name )
            {
            // InternalExternalsParser.g:4584:1: ( Name )
            // InternalExternalsParser.g:4585:2: Name
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2"
    // InternalExternalsParser.g:4594:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4598:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3 )
            // InternalExternalsParser.g:4599:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2__Impl"
    // InternalExternalsParser.g:4606:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4610:1: ( ( Colon ) )
            // InternalExternalsParser.g:4611:1: ( Colon )
            {
            // InternalExternalsParser.g:4611:1: ( Colon )
            // InternalExternalsParser.g:4612:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3"
    // InternalExternalsParser.g:4621:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4625:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3__Impl )
            // InternalExternalsParser.g:4626:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3__Impl"
    // InternalExternalsParser.g:4632:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4636:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3 ) ) )
            // InternalExternalsParser.g:4637:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3 ) )
            {
            // InternalExternalsParser.g:4637:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3 ) )
            // InternalExternalsParser.g:4638:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getNameAssignment_3()); 
            // InternalExternalsParser.g:4639:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3 )
            // InternalExternalsParser.g:4639:3: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__3__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0"
    // InternalExternalsParser.g:4648:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4652:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1 )
            // InternalExternalsParser.g:4653:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0__Impl"
    // InternalExternalsParser.g:4660:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0__Impl : ( Key ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4664:1: ( ( Key ) )
            // InternalExternalsParser.g:4665:1: ( Key )
            {
            // InternalExternalsParser.g:4665:1: ( Key )
            // InternalExternalsParser.g:4666:2: Key
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getKeyKeyword_0()); 
            match(input,Key,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getKeyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1"
    // InternalExternalsParser.g:4675:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2 ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4679:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2 )
            // InternalExternalsParser.g:4680:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1__Impl rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1__Impl"
    // InternalExternalsParser.g:4687:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1__Impl : ( Colon ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4691:1: ( ( Colon ) )
            // InternalExternalsParser.g:4692:1: ( Colon )
            {
            // InternalExternalsParser.g:4692:1: ( Colon )
            // InternalExternalsParser.g:4693:2: Colon
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__1__Impl"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2"
    // InternalExternalsParser.g:4702:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2 : rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2__Impl ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4706:1: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2__Impl )
            // InternalExternalsParser.g:4707:2: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2__Impl"
    // InternalExternalsParser.g:4713:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2__Impl : ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2 ) ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4717:1: ( ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2 ) ) )
            // InternalExternalsParser.g:4718:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2 ) )
            {
            // InternalExternalsParser.g:4718:1: ( ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2 ) )
            // InternalExternalsParser.g:4719:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2 )
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getKeyAssignment_2()); 
            // InternalExternalsParser.g:4720:2: ( rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2 )
            // InternalExternalsParser.g:4720:3: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getKeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__2__Impl"


    // $ANTLR start "rule__ExternalsRoot__ExternalsRootAssignment_2_0"
    // InternalExternalsParser.g:4729:1: rule__ExternalsRoot__ExternalsRootAssignment_2_0 : ( ruleExternalsRootPropertiesAbstract ) ;
    public final void rule__ExternalsRoot__ExternalsRootAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4733:1: ( ( ruleExternalsRootPropertiesAbstract ) )
            // InternalExternalsParser.g:4734:2: ( ruleExternalsRootPropertiesAbstract )
            {
            // InternalExternalsParser.g:4734:2: ( ruleExternalsRootPropertiesAbstract )
            // InternalExternalsParser.g:4735:3: ruleExternalsRootPropertiesAbstract
            {
             before(grammarAccess.getExternalsRootAccess().getExternalsRootExternalsRootPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAccess().getExternalsRootExternalsRootPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__ExternalsRootAssignment_2_0"


    // $ANTLR start "rule__ExternalsRoot__ExternalsRootAssignment_2_1_1"
    // InternalExternalsParser.g:4744:1: rule__ExternalsRoot__ExternalsRootAssignment_2_1_1 : ( ruleExternalsRootPropertiesAbstract ) ;
    public final void rule__ExternalsRoot__ExternalsRootAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4748:1: ( ( ruleExternalsRootPropertiesAbstract ) )
            // InternalExternalsParser.g:4749:2: ( ruleExternalsRootPropertiesAbstract )
            {
            // InternalExternalsParser.g:4749:2: ( ruleExternalsRootPropertiesAbstract )
            // InternalExternalsParser.g:4750:3: ruleExternalsRootPropertiesAbstract
            {
             before(grammarAccess.getExternalsRootAccess().getExternalsRootExternalsRootPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAccess().getExternalsRootExternalsRootPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRoot__ExternalsRootAssignment_2_1_1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0"
    // InternalExternalsParser.g:4759:1: rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0 : ( ruleExternalsRootAPIDescriptionsItems ) ;
    public final void rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4763:1: ( ( ruleExternalsRootAPIDescriptionsItems ) )
            // InternalExternalsParser.g:4764:2: ( ruleExternalsRootAPIDescriptionsItems )
            {
            // InternalExternalsParser.g:4764:2: ( ruleExternalsRootAPIDescriptionsItems )
            // InternalExternalsParser.g:4765:3: ruleExternalsRootAPIDescriptionsItems
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsExternalsRootAPIDescriptionsItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsExternalsRootAPIDescriptionsItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1"
    // InternalExternalsParser.g:4774:1: rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1 : ( ruleExternalsRootAPIDescriptionsItems ) ;
    public final void rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4778:1: ( ( ruleExternalsRootAPIDescriptionsItems ) )
            // InternalExternalsParser.g:4779:2: ( ruleExternalsRootAPIDescriptionsItems )
            {
            // InternalExternalsParser.g:4779:2: ( ruleExternalsRootAPIDescriptionsItems )
            // InternalExternalsParser.g:4780:3: ruleExternalsRootAPIDescriptionsItems
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsExternalsRootAPIDescriptionsItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsExternalsRootAPIDescriptionsItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0"
    // InternalExternalsParser.g:4789:1: rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0 : ( ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ;
    public final void rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4793:1: ( ( ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) )
            // InternalExternalsParser.g:4794:2: ( ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract )
            {
            // InternalExternalsParser.g:4794:2: ( ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract )
            // InternalExternalsParser.g:4795:3: ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1"
    // InternalExternalsParser.g:4804:1: rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1 : ( ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) ;
    public final void rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4808:1: ( ( ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract ) )
            // InternalExternalsParser.g:4809:2: ( ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract )
            {
            // InternalExternalsParser.g:4809:2: ( ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract )
            // InternalExternalsParser.g:4810:3: ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3"
    // InternalExternalsParser.g:4819:1: rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4823:1: ( ( ruleEString ) )
            // InternalExternalsParser.g:4824:2: ( ruleEString )
            {
            // InternalExternalsParser.g:4824:2: ( ruleEString )
            // InternalExternalsParser.g:4825:3: ruleEString
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2"
    // InternalExternalsParser.g:4834:1: rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2 : ( ruleEString ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4838:1: ( ( ruleEString ) )
            // InternalExternalsParser.g:4839:2: ( ruleEString )
            {
            // InternalExternalsParser.g:4839:2: ( ruleEString )
            // InternalExternalsParser.g:4840:3: ruleEString
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getProtocolEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getProtocolEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2"
    // InternalExternalsParser.g:4849:1: rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2 : ( ruleEString ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4853:1: ( ( ruleEString ) )
            // InternalExternalsParser.g:4854:2: ( ruleEString )
            {
            // InternalExternalsParser.g:4854:2: ( ruleEString )
            // InternalExternalsParser.g:4855:3: ruleEString
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getUrlEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getUrlEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0"
    // InternalExternalsParser.g:4864:1: rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0 : ( ruleExternalsRootAPIDescriptionsItemsPathsItems ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4868:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItems ) )
            // InternalExternalsParser.g:4869:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItems )
            {
            // InternalExternalsParser.g:4869:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItems )
            // InternalExternalsParser.g:4870:3: ruleExternalsRootAPIDescriptionsItemsPathsItems
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsExternalsRootAPIDescriptionsItemsPathsItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPathsItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsExternalsRootAPIDescriptionsItemsPathsItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1"
    // InternalExternalsParser.g:4879:1: rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1 : ( ruleExternalsRootAPIDescriptionsItemsPathsItems ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4883:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItems ) )
            // InternalExternalsParser.g:4884:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItems )
            {
            // InternalExternalsParser.g:4884:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItems )
            // InternalExternalsParser.g:4885:3: ruleExternalsRootAPIDescriptionsItemsPathsItems
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsExternalsRootAPIDescriptionsItemsPathsItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPathsItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsExternalsRootAPIDescriptionsItemsPathsItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0"
    // InternalExternalsParser.g:4894:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0 : ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4898:1: ( ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) )
            // InternalExternalsParser.g:4899:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItems )
            {
            // InternalExternalsParser.g:4899:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItems )
            // InternalExternalsParser.g:4900:3: ruleExternalsRootAPIDescriptionsItemsAPIAuthItems
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthExternalsRootAPIDescriptionsItemsAPIAuthItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsAPIAuthItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthExternalsRootAPIDescriptionsItemsAPIAuthItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1"
    // InternalExternalsParser.g:4909:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1 : ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4913:1: ( ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItems ) )
            // InternalExternalsParser.g:4914:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItems )
            {
            // InternalExternalsParser.g:4914:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItems )
            // InternalExternalsParser.g:4915:3: ruleExternalsRootAPIDescriptionsItemsAPIAuthItems
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthExternalsRootAPIDescriptionsItemsAPIAuthItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsAPIAuthItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthExternalsRootAPIDescriptionsItemsAPIAuthItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0"
    // InternalExternalsParser.g:4924:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0 : ( ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4928:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) )
            // InternalExternalsParser.g:4929:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract )
            {
            // InternalExternalsParser.g:4929:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract )
            // InternalExternalsParser.g:4930:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1"
    // InternalExternalsParser.g:4939:1: rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1 : ( ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4943:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract ) )
            // InternalExternalsParser.g:4944:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract )
            {
            // InternalExternalsParser.g:4944:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract )
            // InternalExternalsParser.g:4945:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2"
    // InternalExternalsParser.g:4954:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2 : ( ruleEString ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4958:1: ( ( ruleEString ) )
            // InternalExternalsParser.g:4959:2: ( ruleEString )
            {
            // InternalExternalsParser.g:4959:2: ( ruleEString )
            // InternalExternalsParser.g:4960:3: ruleEString
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getRouteEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getRouteEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0"
    // InternalExternalsParser.g:4969:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0 : ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4973:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) )
            // InternalExternalsParser.g:4974:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems )
            {
            // InternalExternalsParser.g:4974:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems )
            // InternalExternalsParser.g:4975:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1"
    // InternalExternalsParser.g:4984:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1 : ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:4988:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems ) )
            // InternalExternalsParser.g:4989:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems )
            {
            // InternalExternalsParser.g:4989:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems )
            // InternalExternalsParser.g:4990:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0"
    // InternalExternalsParser.g:4999:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0 : ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5003:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) )
            // InternalExternalsParser.g:5004:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems )
            {
            // InternalExternalsParser.g:5004:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems )
            // InternalExternalsParser.g:5005:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1"
    // InternalExternalsParser.g:5014:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1 : ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5018:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems ) )
            // InternalExternalsParser.g:5019:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems )
            {
            // InternalExternalsParser.g:5019:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems )
            // InternalExternalsParser.g:5020:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0"
    // InternalExternalsParser.g:5029:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0 : ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5033:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) )
            // InternalExternalsParser.g:5034:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract )
            {
            // InternalExternalsParser.g:5034:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract )
            // InternalExternalsParser.g:5035:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1"
    // InternalExternalsParser.g:5044:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1 : ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5048:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract ) )
            // InternalExternalsParser.g:5049:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract )
            {
            // InternalExternalsParser.g:5049:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract )
            // InternalExternalsParser.g:5050:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3"
    // InternalExternalsParser.g:5059:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5063:1: ( ( ruleEString ) )
            // InternalExternalsParser.g:5064:2: ( ruleEString )
            {
            // InternalExternalsParser.g:5064:2: ( ruleEString )
            // InternalExternalsParser.g:5065:3: ruleEString
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2"
    // InternalExternalsParser.g:5074:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2 : ( ruleEString ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5078:1: ( ( ruleEString ) )
            // InternalExternalsParser.g:5079:2: ( ruleEString )
            {
            // InternalExternalsParser.g:5079:2: ( ruleEString )
            // InternalExternalsParser.g:5080:3: ruleEString
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getTypeEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getTypeEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0"
    // InternalExternalsParser.g:5089:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0 : ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5093:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) )
            // InternalExternalsParser.g:5094:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract )
            {
            // InternalExternalsParser.g:5094:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract )
            // InternalExternalsParser.g:5095:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1"
    // InternalExternalsParser.g:5104:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1 : ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5108:1: ( ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract ) )
            // InternalExternalsParser.g:5109:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract )
            {
            // InternalExternalsParser.g:5109:2: ( ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract )
            // InternalExternalsParser.g:5110:3: ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getItemsExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3"
    // InternalExternalsParser.g:5119:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5123:1: ( ( ruleEString ) )
            // InternalExternalsParser.g:5124:2: ( ruleEString )
            {
            // InternalExternalsParser.g:5124:2: ( ruleEString )
            // InternalExternalsParser.g:5125:3: ruleEString
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2"
    // InternalExternalsParser.g:5134:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2 : ( ruleEString ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5138:1: ( ( ruleEString ) )
            // InternalExternalsParser.g:5139:2: ( ruleEString )
            {
            // InternalExternalsParser.g:5139:2: ( ruleEString )
            // InternalExternalsParser.g:5140:3: ruleEString
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getTypeEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getTypeEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2"
    // InternalExternalsParser.g:5149:1: rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2 : ( ruleEString ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5153:1: ( ( ruleEString ) )
            // InternalExternalsParser.g:5154:2: ( ruleEString )
            {
            // InternalExternalsParser.g:5154:2: ( ruleEString )
            // InternalExternalsParser.g:5155:3: ruleEString
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getJSONPathEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getJSONPathEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0"
    // InternalExternalsParser.g:5164:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0 : ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5168:1: ( ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) )
            // InternalExternalsParser.g:5169:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract )
            {
            // InternalExternalsParser.g:5169:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract )
            // InternalExternalsParser.g:5170:3: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getItemsExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getItemsExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1"
    // InternalExternalsParser.g:5179:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1 : ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5183:1: ( ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract ) )
            // InternalExternalsParser.g:5184:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract )
            {
            // InternalExternalsParser.g:5184:2: ( ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract )
            // InternalExternalsParser.g:5185:3: ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getItemsExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getItemsExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3"
    // InternalExternalsParser.g:5194:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5198:1: ( ( ruleEString ) )
            // InternalExternalsParser.g:5199:2: ( ruleEString )
            {
            // InternalExternalsParser.g:5199:2: ( ruleEString )
            // InternalExternalsParser.g:5200:3: ruleEString
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3"


    // $ANTLR start "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2"
    // InternalExternalsParser.g:5209:1: rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2 : ( ruleEString ) ;
    public final void rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExternalsParser.g:5213:1: ( ( ruleEString ) )
            // InternalExternalsParser.g:5214:2: ( ruleEString )
            {
            // InternalExternalsParser.g:5214:2: ( ruleEString )
            // InternalExternalsParser.g:5215:3: ruleEString
            {
             before(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getKeyEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getKeyEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000209580L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000009580L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000080FFF0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200A20L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000A20L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000203000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000203040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000003040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000205000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000005000L});

}