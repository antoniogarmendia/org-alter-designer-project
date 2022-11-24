package accesses.accesses.ide.contentassist.antlr.internal;
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
import accesses.accesses.services.AccessesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAccessesParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("Way", "'\"way\"'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("Attr", "'\"attr\"'");
    		tokenNameToValue.put("Auth", "'\"auth\"'");
    		tokenNameToValue.put("Body", "'\"body\"'");
    		tokenNameToValue.put("Name", "'\"name\"'");
    		tokenNameToValue.put("Path", "'\"path\"'");
    		tokenNameToValue.put("Input", "'\"input\"'");
    		tokenNameToValue.put("Value", "'\"value\"'");
    		tokenNameToValue.put("Method", "'\"method\"'");
    		tokenNameToValue.put("OnLoad", "'\"onLoad\"'");
    		tokenNameToValue.put("OnMove", "'\"onMove\"'");
    		tokenNameToValue.put("Output", "'\"output\"'");
    		tokenNameToValue.put("APIBody", "'\"APIBody\"'");
    		tokenNameToValue.put("Trigger", "'\"trigger\"'");
    		tokenNameToValue.put("APIInput", "'\"APIInput\"'");
    		tokenNameToValue.put("OnAccess", "'\"onAccess\"'");
    		tokenNameToValue.put("OnChange", "'\"onChange\"'");
    		tokenNameToValue.put("OnCreate", "'\"onCreate\"'");
    		tokenNameToValue.put("OnDelete", "'\"onDelete\"'");
    		tokenNameToValue.put("APIOutput", "'\"APIOutput\"'");
    		tokenNameToValue.put("Classname", "'\"classname\"'");
    		tokenNameToValue.put("Ontological", "'\"ontological\"'");
    		tokenNameToValue.put("TimeTrigger", "'\"timeTrigger\"'");
    		tokenNameToValue.put("ExternalAccess", "'\"ExternalAccess\"'");
    	}

    	public void setGrammarAccess(AccessesGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAccessesRoot"
    // InternalAccessesParser.g:87:1: entryRuleAccessesRoot : ruleAccessesRoot EOF ;
    public final void entryRuleAccessesRoot() throws RecognitionException {
        try {
            // InternalAccessesParser.g:88:1: ( ruleAccessesRoot EOF )
            // InternalAccessesParser.g:89:1: ruleAccessesRoot EOF
            {
             before(grammarAccess.getAccessesRootRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRoot();

            state._fsp--;

             after(grammarAccess.getAccessesRootRule()); 
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
    // $ANTLR end "entryRuleAccessesRoot"


    // $ANTLR start "ruleAccessesRoot"
    // InternalAccessesParser.g:96:1: ruleAccessesRoot : ( ( rule__AccessesRoot__Group__0 ) ) ;
    public final void ruleAccessesRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:100:2: ( ( ( rule__AccessesRoot__Group__0 ) ) )
            // InternalAccessesParser.g:101:2: ( ( rule__AccessesRoot__Group__0 ) )
            {
            // InternalAccessesParser.g:101:2: ( ( rule__AccessesRoot__Group__0 ) )
            // InternalAccessesParser.g:102:3: ( rule__AccessesRoot__Group__0 )
            {
             before(grammarAccess.getAccessesRootAccess().getGroup()); 
            // InternalAccessesParser.g:103:3: ( rule__AccessesRoot__Group__0 )
            // InternalAccessesParser.g:103:4: rule__AccessesRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRoot"


    // $ANTLR start "entryRuleAccessesRootPropertiesAbstract"
    // InternalAccessesParser.g:112:1: entryRuleAccessesRootPropertiesAbstract : ruleAccessesRootPropertiesAbstract EOF ;
    public final void entryRuleAccessesRootPropertiesAbstract() throws RecognitionException {
        try {
            // InternalAccessesParser.g:113:1: ( ruleAccessesRootPropertiesAbstract EOF )
            // InternalAccessesParser.g:114:1: ruleAccessesRootPropertiesAbstract EOF
            {
             before(grammarAccess.getAccessesRootPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleAccessesRootPropertiesAbstract"


    // $ANTLR start "ruleAccessesRootPropertiesAbstract"
    // InternalAccessesParser.g:121:1: ruleAccessesRootPropertiesAbstract : ( ruleAccessesRootExternalAccess ) ;
    public final void ruleAccessesRootPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:125:2: ( ( ruleAccessesRootExternalAccess ) )
            // InternalAccessesParser.g:126:2: ( ruleAccessesRootExternalAccess )
            {
            // InternalAccessesParser.g:126:2: ( ruleAccessesRootExternalAccess )
            // InternalAccessesParser.g:127:3: ruleAccessesRootExternalAccess
            {
             before(grammarAccess.getAccessesRootPropertiesAbstractAccess().getAccessesRootExternalAccessParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccess();

            state._fsp--;

             after(grammarAccess.getAccessesRootPropertiesAbstractAccess().getAccessesRootExternalAccessParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootPropertiesAbstract"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsPropertiesAbstract"
    // InternalAccessesParser.g:137:1: entryRuleAccessesRootExternalAccessItemsPropertiesAbstract : ruleAccessesRootExternalAccessItemsPropertiesAbstract EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalAccessesParser.g:138:1: ( ruleAccessesRootExternalAccessItemsPropertiesAbstract EOF )
            // InternalAccessesParser.g:139:1: ruleAccessesRootExternalAccessItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsPropertiesAbstract"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsPropertiesAbstract"
    // InternalAccessesParser.g:146:1: ruleAccessesRootExternalAccessItemsPropertiesAbstract : ( ( rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleAccessesRootExternalAccessItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:150:2: ( ( ( rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives ) ) )
            // InternalAccessesParser.g:151:2: ( ( rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalAccessesParser.g:151:2: ( ( rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives ) )
            // InternalAccessesParser.g:152:3: ( rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalAccessesParser.g:153:3: ( rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives )
            // InternalAccessesParser.g:153:4: rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsPropertiesAbstract"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerPropertiesAbstract"
    // InternalAccessesParser.g:162:1: entryRuleAccessesRootExternalAccessItemsTriggerPropertiesAbstract : ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsTriggerPropertiesAbstract() throws RecognitionException {
        try {
            // InternalAccessesParser.g:163:1: ( ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract EOF )
            // InternalAccessesParser.g:164:1: ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerPropertiesAbstract"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract"
    // InternalAccessesParser.g:171:1: ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract : ( ( rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives ) ) ;
    public final void ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:175:2: ( ( ( rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives ) ) )
            // InternalAccessesParser.g:176:2: ( ( rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives ) )
            {
            // InternalAccessesParser.g:176:2: ( ( rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives ) )
            // InternalAccessesParser.g:177:3: ( rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAlternatives()); 
            // InternalAccessesParser.g:178:3: ( rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives )
            // InternalAccessesParser.g:178:4: rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract"
    // InternalAccessesParser.g:187:1: entryRuleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract : ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalAccessesParser.g:188:1: ( ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract EOF )
            // InternalAccessesParser.g:189:1: ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract"
    // InternalAccessesParser.g:196:1: ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract : ( ( rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:200:2: ( ( ( rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives ) ) )
            // InternalAccessesParser.g:201:2: ( ( rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalAccessesParser.g:201:2: ( ( rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives ) )
            // InternalAccessesParser.g:202:3: ( rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalAccessesParser.g:203:3: ( rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives )
            // InternalAccessesParser.g:203:4: rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract"
    // InternalAccessesParser.g:212:1: entryRuleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract : ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalAccessesParser.g:213:1: ( ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract EOF )
            // InternalAccessesParser.g:214:1: ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract"
    // InternalAccessesParser.g:221:1: ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract : ( ( rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:225:2: ( ( ( rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives ) ) )
            // InternalAccessesParser.g:226:2: ( ( rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalAccessesParser.g:226:2: ( ( rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives ) )
            // InternalAccessesParser.g:227:3: ( rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalAccessesParser.g:228:3: ( rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives )
            // InternalAccessesParser.g:228:4: rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract"
    // InternalAccessesParser.g:237:1: entryRuleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract : ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalAccessesParser.g:238:1: ( ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract EOF )
            // InternalAccessesParser.g:239:1: ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract"
    // InternalAccessesParser.g:246:1: ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract : ( ( rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:250:2: ( ( ( rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives ) ) )
            // InternalAccessesParser.g:251:2: ( ( rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalAccessesParser.g:251:2: ( ( rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives ) )
            // InternalAccessesParser.g:252:3: ( rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalAccessesParser.g:253:3: ( rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives )
            // InternalAccessesParser.g:253:4: rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract"


    // $ANTLR start "entryRuleAccessesRootExternalAccess"
    // InternalAccessesParser.g:262:1: entryRuleAccessesRootExternalAccess : ruleAccessesRootExternalAccess EOF ;
    public final void entryRuleAccessesRootExternalAccess() throws RecognitionException {
        try {
            // InternalAccessesParser.g:263:1: ( ruleAccessesRootExternalAccess EOF )
            // InternalAccessesParser.g:264:1: ruleAccessesRootExternalAccess EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccess();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccess"


    // $ANTLR start "ruleAccessesRootExternalAccess"
    // InternalAccessesParser.g:271:1: ruleAccessesRootExternalAccess : ( ( rule__AccessesRootExternalAccess__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:275:2: ( ( ( rule__AccessesRootExternalAccess__Group__0 ) ) )
            // InternalAccessesParser.g:276:2: ( ( rule__AccessesRootExternalAccess__Group__0 ) )
            {
            // InternalAccessesParser.g:276:2: ( ( rule__AccessesRootExternalAccess__Group__0 ) )
            // InternalAccessesParser.g:277:3: ( rule__AccessesRootExternalAccess__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getGroup()); 
            // InternalAccessesParser.g:278:3: ( rule__AccessesRootExternalAccess__Group__0 )
            // InternalAccessesParser.g:278:4: rule__AccessesRootExternalAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccess"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItems"
    // InternalAccessesParser.g:287:1: entryRuleAccessesRootExternalAccessItems : ruleAccessesRootExternalAccessItems EOF ;
    public final void entryRuleAccessesRootExternalAccessItems() throws RecognitionException {
        try {
            // InternalAccessesParser.g:288:1: ( ruleAccessesRootExternalAccessItems EOF )
            // InternalAccessesParser.g:289:1: ruleAccessesRootExternalAccessItems EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItems();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItems"


    // $ANTLR start "ruleAccessesRootExternalAccessItems"
    // InternalAccessesParser.g:296:1: ruleAccessesRootExternalAccessItems : ( ( rule__AccessesRootExternalAccessItems__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:300:2: ( ( ( rule__AccessesRootExternalAccessItems__Group__0 ) ) )
            // InternalAccessesParser.g:301:2: ( ( rule__AccessesRootExternalAccessItems__Group__0 ) )
            {
            // InternalAccessesParser.g:301:2: ( ( rule__AccessesRootExternalAccessItems__Group__0 ) )
            // InternalAccessesParser.g:302:3: ( rule__AccessesRootExternalAccessItems__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAccess().getGroup()); 
            // InternalAccessesParser.g:303:3: ( rule__AccessesRootExternalAccessItems__Group__0 )
            // InternalAccessesParser.g:303:4: rule__AccessesRootExternalAccessItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItems"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsName"
    // InternalAccessesParser.g:312:1: entryRuleAccessesRootExternalAccessItemsName : ruleAccessesRootExternalAccessItemsName EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsName() throws RecognitionException {
        try {
            // InternalAccessesParser.g:313:1: ( ruleAccessesRootExternalAccessItemsName EOF )
            // InternalAccessesParser.g:314:1: ruleAccessesRootExternalAccessItemsName EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsNameRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsName();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsNameRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsName"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsName"
    // InternalAccessesParser.g:321:1: ruleAccessesRootExternalAccessItemsName : ( ( rule__AccessesRootExternalAccessItemsName__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:325:2: ( ( ( rule__AccessesRootExternalAccessItemsName__Group__0 ) ) )
            // InternalAccessesParser.g:326:2: ( ( rule__AccessesRootExternalAccessItemsName__Group__0 ) )
            {
            // InternalAccessesParser.g:326:2: ( ( rule__AccessesRootExternalAccessItemsName__Group__0 ) )
            // InternalAccessesParser.g:327:3: ( rule__AccessesRootExternalAccessItemsName__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getGroup()); 
            // InternalAccessesParser.g:328:3: ( rule__AccessesRootExternalAccessItemsName__Group__0 )
            // InternalAccessesParser.g:328:4: rule__AccessesRootExternalAccessItemsName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsName"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsPath"
    // InternalAccessesParser.g:337:1: entryRuleAccessesRootExternalAccessItemsPath : ruleAccessesRootExternalAccessItemsPath EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsPath() throws RecognitionException {
        try {
            // InternalAccessesParser.g:338:1: ( ruleAccessesRootExternalAccessItemsPath EOF )
            // InternalAccessesParser.g:339:1: ruleAccessesRootExternalAccessItemsPath EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsPathRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsPath();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsPathRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsPath"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsPath"
    // InternalAccessesParser.g:346:1: ruleAccessesRootExternalAccessItemsPath : ( ( rule__AccessesRootExternalAccessItemsPath__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:350:2: ( ( ( rule__AccessesRootExternalAccessItemsPath__Group__0 ) ) )
            // InternalAccessesParser.g:351:2: ( ( rule__AccessesRootExternalAccessItemsPath__Group__0 ) )
            {
            // InternalAccessesParser.g:351:2: ( ( rule__AccessesRootExternalAccessItemsPath__Group__0 ) )
            // InternalAccessesParser.g:352:3: ( rule__AccessesRootExternalAccessItemsPath__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getGroup()); 
            // InternalAccessesParser.g:353:3: ( rule__AccessesRootExternalAccessItemsPath__Group__0 )
            // InternalAccessesParser.g:353:4: rule__AccessesRootExternalAccessItemsPath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsPath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsPath"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsOntological"
    // InternalAccessesParser.g:362:1: entryRuleAccessesRootExternalAccessItemsOntological : ruleAccessesRootExternalAccessItemsOntological EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsOntological() throws RecognitionException {
        try {
            // InternalAccessesParser.g:363:1: ( ruleAccessesRootExternalAccessItemsOntological EOF )
            // InternalAccessesParser.g:364:1: ruleAccessesRootExternalAccessItemsOntological EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOntologicalRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsOntological();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOntologicalRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsOntological"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsOntological"
    // InternalAccessesParser.g:371:1: ruleAccessesRootExternalAccessItemsOntological : ( ( rule__AccessesRootExternalAccessItemsOntological__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsOntological() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:375:2: ( ( ( rule__AccessesRootExternalAccessItemsOntological__Group__0 ) ) )
            // InternalAccessesParser.g:376:2: ( ( rule__AccessesRootExternalAccessItemsOntological__Group__0 ) )
            {
            // InternalAccessesParser.g:376:2: ( ( rule__AccessesRootExternalAccessItemsOntological__Group__0 ) )
            // InternalAccessesParser.g:377:3: ( rule__AccessesRootExternalAccessItemsOntological__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getGroup()); 
            // InternalAccessesParser.g:378:3: ( rule__AccessesRootExternalAccessItemsOntological__Group__0 )
            // InternalAccessesParser.g:378:4: rule__AccessesRootExternalAccessItemsOntological__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOntological__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsOntological"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsClassname"
    // InternalAccessesParser.g:387:1: entryRuleAccessesRootExternalAccessItemsClassname : ruleAccessesRootExternalAccessItemsClassname EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsClassname() throws RecognitionException {
        try {
            // InternalAccessesParser.g:388:1: ( ruleAccessesRootExternalAccessItemsClassname EOF )
            // InternalAccessesParser.g:389:1: ruleAccessesRootExternalAccessItemsClassname EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsClassnameRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsClassname();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsClassnameRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsClassname"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsClassname"
    // InternalAccessesParser.g:396:1: ruleAccessesRootExternalAccessItemsClassname : ( ( rule__AccessesRootExternalAccessItemsClassname__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsClassname() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:400:2: ( ( ( rule__AccessesRootExternalAccessItemsClassname__Group__0 ) ) )
            // InternalAccessesParser.g:401:2: ( ( rule__AccessesRootExternalAccessItemsClassname__Group__0 ) )
            {
            // InternalAccessesParser.g:401:2: ( ( rule__AccessesRootExternalAccessItemsClassname__Group__0 ) )
            // InternalAccessesParser.g:402:3: ( rule__AccessesRootExternalAccessItemsClassname__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getGroup()); 
            // InternalAccessesParser.g:403:3: ( rule__AccessesRootExternalAccessItemsClassname__Group__0 )
            // InternalAccessesParser.g:403:4: rule__AccessesRootExternalAccessItemsClassname__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsClassname__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsClassname"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsMethod"
    // InternalAccessesParser.g:412:1: entryRuleAccessesRootExternalAccessItemsMethod : ruleAccessesRootExternalAccessItemsMethod EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsMethod() throws RecognitionException {
        try {
            // InternalAccessesParser.g:413:1: ( ruleAccessesRootExternalAccessItemsMethod EOF )
            // InternalAccessesParser.g:414:1: ruleAccessesRootExternalAccessItemsMethod EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsMethod();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsMethodRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsMethod"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsMethod"
    // InternalAccessesParser.g:421:1: ruleAccessesRootExternalAccessItemsMethod : ( ( rule__AccessesRootExternalAccessItemsMethod__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:425:2: ( ( ( rule__AccessesRootExternalAccessItemsMethod__Group__0 ) ) )
            // InternalAccessesParser.g:426:2: ( ( rule__AccessesRootExternalAccessItemsMethod__Group__0 ) )
            {
            // InternalAccessesParser.g:426:2: ( ( rule__AccessesRootExternalAccessItemsMethod__Group__0 ) )
            // InternalAccessesParser.g:427:3: ( rule__AccessesRootExternalAccessItemsMethod__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getGroup()); 
            // InternalAccessesParser.g:428:3: ( rule__AccessesRootExternalAccessItemsMethod__Group__0 )
            // InternalAccessesParser.g:428:4: rule__AccessesRootExternalAccessItemsMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsMethod"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsAuth"
    // InternalAccessesParser.g:437:1: entryRuleAccessesRootExternalAccessItemsAuth : ruleAccessesRootExternalAccessItemsAuth EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsAuth() throws RecognitionException {
        try {
            // InternalAccessesParser.g:438:1: ( ruleAccessesRootExternalAccessItemsAuth EOF )
            // InternalAccessesParser.g:439:1: ruleAccessesRootExternalAccessItemsAuth EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAuthRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsAuth();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsAuthRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsAuth"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsAuth"
    // InternalAccessesParser.g:446:1: ruleAccessesRootExternalAccessItemsAuth : ( ( rule__AccessesRootExternalAccessItemsAuth__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsAuth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:450:2: ( ( ( rule__AccessesRootExternalAccessItemsAuth__Group__0 ) ) )
            // InternalAccessesParser.g:451:2: ( ( rule__AccessesRootExternalAccessItemsAuth__Group__0 ) )
            {
            // InternalAccessesParser.g:451:2: ( ( rule__AccessesRootExternalAccessItemsAuth__Group__0 ) )
            // InternalAccessesParser.g:452:3: ( rule__AccessesRootExternalAccessItemsAuth__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getGroup()); 
            // InternalAccessesParser.g:453:3: ( rule__AccessesRootExternalAccessItemsAuth__Group__0 )
            // InternalAccessesParser.g:453:4: rule__AccessesRootExternalAccessItemsAuth__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsAuth__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsAuth"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInput"
    // InternalAccessesParser.g:462:1: entryRuleAccessesRootExternalAccessItemsInput : ruleAccessesRootExternalAccessItemsInput EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsInput() throws RecognitionException {
        try {
            // InternalAccessesParser.g:463:1: ( ruleAccessesRootExternalAccessItemsInput EOF )
            // InternalAccessesParser.g:464:1: ruleAccessesRootExternalAccessItemsInput EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsInput();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInput"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInput"
    // InternalAccessesParser.g:471:1: ruleAccessesRootExternalAccessItemsInput : ( ( rule__AccessesRootExternalAccessItemsInput__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:475:2: ( ( ( rule__AccessesRootExternalAccessItemsInput__Group__0 ) ) )
            // InternalAccessesParser.g:476:2: ( ( rule__AccessesRootExternalAccessItemsInput__Group__0 ) )
            {
            // InternalAccessesParser.g:476:2: ( ( rule__AccessesRootExternalAccessItemsInput__Group__0 ) )
            // InternalAccessesParser.g:477:3: ( rule__AccessesRootExternalAccessItemsInput__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getGroup()); 
            // InternalAccessesParser.g:478:3: ( rule__AccessesRootExternalAccessItemsInput__Group__0 )
            // InternalAccessesParser.g:478:4: rule__AccessesRootExternalAccessItemsInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInput"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsOutput"
    // InternalAccessesParser.g:487:1: entryRuleAccessesRootExternalAccessItemsOutput : ruleAccessesRootExternalAccessItemsOutput EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsOutput() throws RecognitionException {
        try {
            // InternalAccessesParser.g:488:1: ( ruleAccessesRootExternalAccessItemsOutput EOF )
            // InternalAccessesParser.g:489:1: ruleAccessesRootExternalAccessItemsOutput EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsOutput();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsOutput"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsOutput"
    // InternalAccessesParser.g:496:1: ruleAccessesRootExternalAccessItemsOutput : ( ( rule__AccessesRootExternalAccessItemsOutput__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:500:2: ( ( ( rule__AccessesRootExternalAccessItemsOutput__Group__0 ) ) )
            // InternalAccessesParser.g:501:2: ( ( rule__AccessesRootExternalAccessItemsOutput__Group__0 ) )
            {
            // InternalAccessesParser.g:501:2: ( ( rule__AccessesRootExternalAccessItemsOutput__Group__0 ) )
            // InternalAccessesParser.g:502:3: ( rule__AccessesRootExternalAccessItemsOutput__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getGroup()); 
            // InternalAccessesParser.g:503:3: ( rule__AccessesRootExternalAccessItemsOutput__Group__0 )
            // InternalAccessesParser.g:503:4: rule__AccessesRootExternalAccessItemsOutput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsOutput"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsBody"
    // InternalAccessesParser.g:512:1: entryRuleAccessesRootExternalAccessItemsBody : ruleAccessesRootExternalAccessItemsBody EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsBody() throws RecognitionException {
        try {
            // InternalAccessesParser.g:513:1: ( ruleAccessesRootExternalAccessItemsBody EOF )
            // InternalAccessesParser.g:514:1: ruleAccessesRootExternalAccessItemsBody EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsBody();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsBody"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsBody"
    // InternalAccessesParser.g:521:1: ruleAccessesRootExternalAccessItemsBody : ( ( rule__AccessesRootExternalAccessItemsBody__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:525:2: ( ( ( rule__AccessesRootExternalAccessItemsBody__Group__0 ) ) )
            // InternalAccessesParser.g:526:2: ( ( rule__AccessesRootExternalAccessItemsBody__Group__0 ) )
            {
            // InternalAccessesParser.g:526:2: ( ( rule__AccessesRootExternalAccessItemsBody__Group__0 ) )
            // InternalAccessesParser.g:527:3: ( rule__AccessesRootExternalAccessItemsBody__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getGroup()); 
            // InternalAccessesParser.g:528:3: ( rule__AccessesRootExternalAccessItemsBody__Group__0 )
            // InternalAccessesParser.g:528:4: rule__AccessesRootExternalAccessItemsBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsBody"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTrigger"
    // InternalAccessesParser.g:537:1: entryRuleAccessesRootExternalAccessItemsTrigger : ruleAccessesRootExternalAccessItemsTrigger EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsTrigger() throws RecognitionException {
        try {
            // InternalAccessesParser.g:538:1: ( ruleAccessesRootExternalAccessItemsTrigger EOF )
            // InternalAccessesParser.g:539:1: ruleAccessesRootExternalAccessItemsTrigger EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsTrigger();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTrigger"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTrigger"
    // InternalAccessesParser.g:546:1: ruleAccessesRootExternalAccessItemsTrigger : ( ( rule__AccessesRootExternalAccessItemsTrigger__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:550:2: ( ( ( rule__AccessesRootExternalAccessItemsTrigger__Group__0 ) ) )
            // InternalAccessesParser.g:551:2: ( ( rule__AccessesRootExternalAccessItemsTrigger__Group__0 ) )
            {
            // InternalAccessesParser.g:551:2: ( ( rule__AccessesRootExternalAccessItemsTrigger__Group__0 ) )
            // InternalAccessesParser.g:552:3: ( rule__AccessesRootExternalAccessItemsTrigger__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getGroup()); 
            // InternalAccessesParser.g:553:3: ( rule__AccessesRootExternalAccessItemsTrigger__Group__0 )
            // InternalAccessesParser.g:553:4: rule__AccessesRootExternalAccessItemsTrigger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTrigger"


    // $ANTLR start "entryRuleEString"
    // InternalAccessesParser.g:562:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAccessesParser.g:563:1: ( ruleEString EOF )
            // InternalAccessesParser.g:564:1: ruleEString EOF
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
    // InternalAccessesParser.g:571:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:575:2: ( ( ruleVALID_STRING ) )
            // InternalAccessesParser.g:576:2: ( ruleVALID_STRING )
            {
            // InternalAccessesParser.g:576:2: ( ruleVALID_STRING )
            // InternalAccessesParser.g:577:3: ruleVALID_STRING
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


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInputItems"
    // InternalAccessesParser.g:587:1: entryRuleAccessesRootExternalAccessItemsInputItems : ruleAccessesRootExternalAccessItemsInputItems EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsInputItems() throws RecognitionException {
        try {
            // InternalAccessesParser.g:588:1: ( ruleAccessesRootExternalAccessItemsInputItems EOF )
            // InternalAccessesParser.g:589:1: ruleAccessesRootExternalAccessItemsInputItems EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsInputItems();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInputItems"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInputItems"
    // InternalAccessesParser.g:596:1: ruleAccessesRootExternalAccessItemsInputItems : ( ( rule__AccessesRootExternalAccessItemsInputItems__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsInputItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:600:2: ( ( ( rule__AccessesRootExternalAccessItemsInputItems__Group__0 ) ) )
            // InternalAccessesParser.g:601:2: ( ( rule__AccessesRootExternalAccessItemsInputItems__Group__0 ) )
            {
            // InternalAccessesParser.g:601:2: ( ( rule__AccessesRootExternalAccessItemsInputItems__Group__0 ) )
            // InternalAccessesParser.g:602:3: ( rule__AccessesRootExternalAccessItemsInputItems__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getGroup()); 
            // InternalAccessesParser.g:603:3: ( rule__AccessesRootExternalAccessItemsInputItems__Group__0 )
            // InternalAccessesParser.g:603:4: rule__AccessesRootExternalAccessItemsInputItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInputItems"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInputItemsAttr"
    // InternalAccessesParser.g:612:1: entryRuleAccessesRootExternalAccessItemsInputItemsAttr : ruleAccessesRootExternalAccessItemsInputItemsAttr EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsInputItemsAttr() throws RecognitionException {
        try {
            // InternalAccessesParser.g:613:1: ( ruleAccessesRootExternalAccessItemsInputItemsAttr EOF )
            // InternalAccessesParser.g:614:1: ruleAccessesRootExternalAccessItemsInputItemsAttr EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsInputItemsAttr();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInputItemsAttr"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInputItemsAttr"
    // InternalAccessesParser.g:621:1: ruleAccessesRootExternalAccessItemsInputItemsAttr : ( ( rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsInputItemsAttr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:625:2: ( ( ( rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0 ) ) )
            // InternalAccessesParser.g:626:2: ( ( rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0 ) )
            {
            // InternalAccessesParser.g:626:2: ( ( rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0 ) )
            // InternalAccessesParser.g:627:3: ( rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getGroup()); 
            // InternalAccessesParser.g:628:3: ( rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0 )
            // InternalAccessesParser.g:628:4: rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInputItemsAttr"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInputItemsAPIInput"
    // InternalAccessesParser.g:637:1: entryRuleAccessesRootExternalAccessItemsInputItemsAPIInput : ruleAccessesRootExternalAccessItemsInputItemsAPIInput EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsInputItemsAPIInput() throws RecognitionException {
        try {
            // InternalAccessesParser.g:638:1: ( ruleAccessesRootExternalAccessItemsInputItemsAPIInput EOF )
            // InternalAccessesParser.g:639:1: ruleAccessesRootExternalAccessItemsInputItemsAPIInput EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsInputItemsAPIInput();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInputItemsAPIInput"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInputItemsAPIInput"
    // InternalAccessesParser.g:646:1: ruleAccessesRootExternalAccessItemsInputItemsAPIInput : ( ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsInputItemsAPIInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:650:2: ( ( ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0 ) ) )
            // InternalAccessesParser.g:651:2: ( ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0 ) )
            {
            // InternalAccessesParser.g:651:2: ( ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0 ) )
            // InternalAccessesParser.g:652:3: ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getGroup()); 
            // InternalAccessesParser.g:653:3: ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0 )
            // InternalAccessesParser.g:653:4: rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInputItemsAPIInput"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInputItemsWay"
    // InternalAccessesParser.g:662:1: entryRuleAccessesRootExternalAccessItemsInputItemsWay : ruleAccessesRootExternalAccessItemsInputItemsWay EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsInputItemsWay() throws RecognitionException {
        try {
            // InternalAccessesParser.g:663:1: ( ruleAccessesRootExternalAccessItemsInputItemsWay EOF )
            // InternalAccessesParser.g:664:1: ruleAccessesRootExternalAccessItemsInputItemsWay EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsInputItemsWay();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInputItemsWay"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInputItemsWay"
    // InternalAccessesParser.g:671:1: ruleAccessesRootExternalAccessItemsInputItemsWay : ( ( rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsInputItemsWay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:675:2: ( ( ( rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0 ) ) )
            // InternalAccessesParser.g:676:2: ( ( rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0 ) )
            {
            // InternalAccessesParser.g:676:2: ( ( rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0 ) )
            // InternalAccessesParser.g:677:3: ( rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getGroup()); 
            // InternalAccessesParser.g:678:3: ( rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0 )
            // InternalAccessesParser.g:678:4: rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInputItemsWay"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsInputItemsValue"
    // InternalAccessesParser.g:687:1: entryRuleAccessesRootExternalAccessItemsInputItemsValue : ruleAccessesRootExternalAccessItemsInputItemsValue EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsInputItemsValue() throws RecognitionException {
        try {
            // InternalAccessesParser.g:688:1: ( ruleAccessesRootExternalAccessItemsInputItemsValue EOF )
            // InternalAccessesParser.g:689:1: ruleAccessesRootExternalAccessItemsInputItemsValue EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsInputItemsValue();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsInputItemsValue"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsInputItemsValue"
    // InternalAccessesParser.g:696:1: ruleAccessesRootExternalAccessItemsInputItemsValue : ( ( rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsInputItemsValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:700:2: ( ( ( rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0 ) ) )
            // InternalAccessesParser.g:701:2: ( ( rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0 ) )
            {
            // InternalAccessesParser.g:701:2: ( ( rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0 ) )
            // InternalAccessesParser.g:702:3: ( rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getGroup()); 
            // InternalAccessesParser.g:703:3: ( rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0 )
            // InternalAccessesParser.g:703:4: rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsInputItemsValue"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsOutputItems"
    // InternalAccessesParser.g:712:1: entryRuleAccessesRootExternalAccessItemsOutputItems : ruleAccessesRootExternalAccessItemsOutputItems EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsOutputItems() throws RecognitionException {
        try {
            // InternalAccessesParser.g:713:1: ( ruleAccessesRootExternalAccessItemsOutputItems EOF )
            // InternalAccessesParser.g:714:1: ruleAccessesRootExternalAccessItemsOutputItems EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsOutputItems();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsOutputItems"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsOutputItems"
    // InternalAccessesParser.g:721:1: ruleAccessesRootExternalAccessItemsOutputItems : ( ( rule__AccessesRootExternalAccessItemsOutputItems__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsOutputItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:725:2: ( ( ( rule__AccessesRootExternalAccessItemsOutputItems__Group__0 ) ) )
            // InternalAccessesParser.g:726:2: ( ( rule__AccessesRootExternalAccessItemsOutputItems__Group__0 ) )
            {
            // InternalAccessesParser.g:726:2: ( ( rule__AccessesRootExternalAccessItemsOutputItems__Group__0 ) )
            // InternalAccessesParser.g:727:3: ( rule__AccessesRootExternalAccessItemsOutputItems__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getGroup()); 
            // InternalAccessesParser.g:728:3: ( rule__AccessesRootExternalAccessItemsOutputItems__Group__0 )
            // InternalAccessesParser.g:728:4: rule__AccessesRootExternalAccessItemsOutputItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsOutputItems"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsOutputItemsAttr"
    // InternalAccessesParser.g:737:1: entryRuleAccessesRootExternalAccessItemsOutputItemsAttr : ruleAccessesRootExternalAccessItemsOutputItemsAttr EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsOutputItemsAttr() throws RecognitionException {
        try {
            // InternalAccessesParser.g:738:1: ( ruleAccessesRootExternalAccessItemsOutputItemsAttr EOF )
            // InternalAccessesParser.g:739:1: ruleAccessesRootExternalAccessItemsOutputItemsAttr EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsOutputItemsAttr();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsOutputItemsAttr"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsOutputItemsAttr"
    // InternalAccessesParser.g:746:1: ruleAccessesRootExternalAccessItemsOutputItemsAttr : ( ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsOutputItemsAttr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:750:2: ( ( ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0 ) ) )
            // InternalAccessesParser.g:751:2: ( ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0 ) )
            {
            // InternalAccessesParser.g:751:2: ( ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0 ) )
            // InternalAccessesParser.g:752:3: ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getGroup()); 
            // InternalAccessesParser.g:753:3: ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0 )
            // InternalAccessesParser.g:753:4: rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsOutputItemsAttr"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsOutputItemsAPIOutput"
    // InternalAccessesParser.g:762:1: entryRuleAccessesRootExternalAccessItemsOutputItemsAPIOutput : ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsOutputItemsAPIOutput() throws RecognitionException {
        try {
            // InternalAccessesParser.g:763:1: ( ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput EOF )
            // InternalAccessesParser.g:764:1: ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsOutputItemsAPIOutput"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput"
    // InternalAccessesParser.g:771:1: ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput : ( ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:775:2: ( ( ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0 ) ) )
            // InternalAccessesParser.g:776:2: ( ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0 ) )
            {
            // InternalAccessesParser.g:776:2: ( ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0 ) )
            // InternalAccessesParser.g:777:3: ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getGroup()); 
            // InternalAccessesParser.g:778:3: ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0 )
            // InternalAccessesParser.g:778:4: rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsBodyItems"
    // InternalAccessesParser.g:787:1: entryRuleAccessesRootExternalAccessItemsBodyItems : ruleAccessesRootExternalAccessItemsBodyItems EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsBodyItems() throws RecognitionException {
        try {
            // InternalAccessesParser.g:788:1: ( ruleAccessesRootExternalAccessItemsBodyItems EOF )
            // InternalAccessesParser.g:789:1: ruleAccessesRootExternalAccessItemsBodyItems EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsBodyItems();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsBodyItems"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsBodyItems"
    // InternalAccessesParser.g:796:1: ruleAccessesRootExternalAccessItemsBodyItems : ( ( rule__AccessesRootExternalAccessItemsBodyItems__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsBodyItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:800:2: ( ( ( rule__AccessesRootExternalAccessItemsBodyItems__Group__0 ) ) )
            // InternalAccessesParser.g:801:2: ( ( rule__AccessesRootExternalAccessItemsBodyItems__Group__0 ) )
            {
            // InternalAccessesParser.g:801:2: ( ( rule__AccessesRootExternalAccessItemsBodyItems__Group__0 ) )
            // InternalAccessesParser.g:802:3: ( rule__AccessesRootExternalAccessItemsBodyItems__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getGroup()); 
            // InternalAccessesParser.g:803:3: ( rule__AccessesRootExternalAccessItemsBodyItems__Group__0 )
            // InternalAccessesParser.g:803:4: rule__AccessesRootExternalAccessItemsBodyItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsBodyItems"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsBodyItemsAttr"
    // InternalAccessesParser.g:812:1: entryRuleAccessesRootExternalAccessItemsBodyItemsAttr : ruleAccessesRootExternalAccessItemsBodyItemsAttr EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsBodyItemsAttr() throws RecognitionException {
        try {
            // InternalAccessesParser.g:813:1: ( ruleAccessesRootExternalAccessItemsBodyItemsAttr EOF )
            // InternalAccessesParser.g:814:1: ruleAccessesRootExternalAccessItemsBodyItemsAttr EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsBodyItemsAttr();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsBodyItemsAttr"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsBodyItemsAttr"
    // InternalAccessesParser.g:821:1: ruleAccessesRootExternalAccessItemsBodyItemsAttr : ( ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsBodyItemsAttr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:825:2: ( ( ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0 ) ) )
            // InternalAccessesParser.g:826:2: ( ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0 ) )
            {
            // InternalAccessesParser.g:826:2: ( ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0 ) )
            // InternalAccessesParser.g:827:3: ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getGroup()); 
            // InternalAccessesParser.g:828:3: ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0 )
            // InternalAccessesParser.g:828:4: rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsBodyItemsAttr"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsBodyItemsAPIBody"
    // InternalAccessesParser.g:837:1: entryRuleAccessesRootExternalAccessItemsBodyItemsAPIBody : ruleAccessesRootExternalAccessItemsBodyItemsAPIBody EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsBodyItemsAPIBody() throws RecognitionException {
        try {
            // InternalAccessesParser.g:838:1: ( ruleAccessesRootExternalAccessItemsBodyItemsAPIBody EOF )
            // InternalAccessesParser.g:839:1: ruleAccessesRootExternalAccessItemsBodyItemsAPIBody EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsBodyItemsAPIBody();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsBodyItemsAPIBody"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsBodyItemsAPIBody"
    // InternalAccessesParser.g:846:1: ruleAccessesRootExternalAccessItemsBodyItemsAPIBody : ( ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsBodyItemsAPIBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:850:2: ( ( ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0 ) ) )
            // InternalAccessesParser.g:851:2: ( ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0 ) )
            {
            // InternalAccessesParser.g:851:2: ( ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0 ) )
            // InternalAccessesParser.g:852:3: ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getGroup()); 
            // InternalAccessesParser.g:853:3: ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0 )
            // InternalAccessesParser.g:853:4: rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsBodyItemsAPIBody"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerOnChange"
    // InternalAccessesParser.g:862:1: entryRuleAccessesRootExternalAccessItemsTriggerOnChange : ruleAccessesRootExternalAccessItemsTriggerOnChange EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsTriggerOnChange() throws RecognitionException {
        try {
            // InternalAccessesParser.g:863:1: ( ruleAccessesRootExternalAccessItemsTriggerOnChange EOF )
            // InternalAccessesParser.g:864:1: ruleAccessesRootExternalAccessItemsTriggerOnChange EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsTriggerOnChange();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerOnChange"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerOnChange"
    // InternalAccessesParser.g:871:1: ruleAccessesRootExternalAccessItemsTriggerOnChange : ( ( rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsTriggerOnChange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:875:2: ( ( ( rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0 ) ) )
            // InternalAccessesParser.g:876:2: ( ( rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0 ) )
            {
            // InternalAccessesParser.g:876:2: ( ( rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0 ) )
            // InternalAccessesParser.g:877:3: ( rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getGroup()); 
            // InternalAccessesParser.g:878:3: ( rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0 )
            // InternalAccessesParser.g:878:4: rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerOnChange"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerOnCreate"
    // InternalAccessesParser.g:887:1: entryRuleAccessesRootExternalAccessItemsTriggerOnCreate : ruleAccessesRootExternalAccessItemsTriggerOnCreate EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsTriggerOnCreate() throws RecognitionException {
        try {
            // InternalAccessesParser.g:888:1: ( ruleAccessesRootExternalAccessItemsTriggerOnCreate EOF )
            // InternalAccessesParser.g:889:1: ruleAccessesRootExternalAccessItemsTriggerOnCreate EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsTriggerOnCreate();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerOnCreate"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerOnCreate"
    // InternalAccessesParser.g:896:1: ruleAccessesRootExternalAccessItemsTriggerOnCreate : ( ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsTriggerOnCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:900:2: ( ( ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0 ) ) )
            // InternalAccessesParser.g:901:2: ( ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0 ) )
            {
            // InternalAccessesParser.g:901:2: ( ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0 ) )
            // InternalAccessesParser.g:902:3: ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getGroup()); 
            // InternalAccessesParser.g:903:3: ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0 )
            // InternalAccessesParser.g:903:4: rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerOnCreate"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerOnMove"
    // InternalAccessesParser.g:912:1: entryRuleAccessesRootExternalAccessItemsTriggerOnMove : ruleAccessesRootExternalAccessItemsTriggerOnMove EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsTriggerOnMove() throws RecognitionException {
        try {
            // InternalAccessesParser.g:913:1: ( ruleAccessesRootExternalAccessItemsTriggerOnMove EOF )
            // InternalAccessesParser.g:914:1: ruleAccessesRootExternalAccessItemsTriggerOnMove EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsTriggerOnMove();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerOnMove"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerOnMove"
    // InternalAccessesParser.g:921:1: ruleAccessesRootExternalAccessItemsTriggerOnMove : ( ( rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsTriggerOnMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:925:2: ( ( ( rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0 ) ) )
            // InternalAccessesParser.g:926:2: ( ( rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0 ) )
            {
            // InternalAccessesParser.g:926:2: ( ( rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0 ) )
            // InternalAccessesParser.g:927:3: ( rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getGroup()); 
            // InternalAccessesParser.g:928:3: ( rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0 )
            // InternalAccessesParser.g:928:4: rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerOnMove"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerOnDelete"
    // InternalAccessesParser.g:937:1: entryRuleAccessesRootExternalAccessItemsTriggerOnDelete : ruleAccessesRootExternalAccessItemsTriggerOnDelete EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsTriggerOnDelete() throws RecognitionException {
        try {
            // InternalAccessesParser.g:938:1: ( ruleAccessesRootExternalAccessItemsTriggerOnDelete EOF )
            // InternalAccessesParser.g:939:1: ruleAccessesRootExternalAccessItemsTriggerOnDelete EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsTriggerOnDelete();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerOnDelete"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerOnDelete"
    // InternalAccessesParser.g:946:1: ruleAccessesRootExternalAccessItemsTriggerOnDelete : ( ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsTriggerOnDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:950:2: ( ( ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0 ) ) )
            // InternalAccessesParser.g:951:2: ( ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0 ) )
            {
            // InternalAccessesParser.g:951:2: ( ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0 ) )
            // InternalAccessesParser.g:952:3: ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getGroup()); 
            // InternalAccessesParser.g:953:3: ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0 )
            // InternalAccessesParser.g:953:4: rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerOnDelete"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerOnAccess"
    // InternalAccessesParser.g:962:1: entryRuleAccessesRootExternalAccessItemsTriggerOnAccess : ruleAccessesRootExternalAccessItemsTriggerOnAccess EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsTriggerOnAccess() throws RecognitionException {
        try {
            // InternalAccessesParser.g:963:1: ( ruleAccessesRootExternalAccessItemsTriggerOnAccess EOF )
            // InternalAccessesParser.g:964:1: ruleAccessesRootExternalAccessItemsTriggerOnAccess EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsTriggerOnAccess();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerOnAccess"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerOnAccess"
    // InternalAccessesParser.g:971:1: ruleAccessesRootExternalAccessItemsTriggerOnAccess : ( ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsTriggerOnAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:975:2: ( ( ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0 ) ) )
            // InternalAccessesParser.g:976:2: ( ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0 ) )
            {
            // InternalAccessesParser.g:976:2: ( ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0 ) )
            // InternalAccessesParser.g:977:3: ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getGroup()); 
            // InternalAccessesParser.g:978:3: ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0 )
            // InternalAccessesParser.g:978:4: rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerOnAccess"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerOnLoad"
    // InternalAccessesParser.g:987:1: entryRuleAccessesRootExternalAccessItemsTriggerOnLoad : ruleAccessesRootExternalAccessItemsTriggerOnLoad EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsTriggerOnLoad() throws RecognitionException {
        try {
            // InternalAccessesParser.g:988:1: ( ruleAccessesRootExternalAccessItemsTriggerOnLoad EOF )
            // InternalAccessesParser.g:989:1: ruleAccessesRootExternalAccessItemsTriggerOnLoad EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsTriggerOnLoad();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerOnLoad"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerOnLoad"
    // InternalAccessesParser.g:996:1: ruleAccessesRootExternalAccessItemsTriggerOnLoad : ( ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsTriggerOnLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1000:2: ( ( ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0 ) ) )
            // InternalAccessesParser.g:1001:2: ( ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0 ) )
            {
            // InternalAccessesParser.g:1001:2: ( ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0 ) )
            // InternalAccessesParser.g:1002:3: ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getGroup()); 
            // InternalAccessesParser.g:1003:3: ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0 )
            // InternalAccessesParser.g:1003:4: rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerOnLoad"


    // $ANTLR start "entryRuleAccessesRootExternalAccessItemsTriggerTimeTrigger"
    // InternalAccessesParser.g:1012:1: entryRuleAccessesRootExternalAccessItemsTriggerTimeTrigger : ruleAccessesRootExternalAccessItemsTriggerTimeTrigger EOF ;
    public final void entryRuleAccessesRootExternalAccessItemsTriggerTimeTrigger() throws RecognitionException {
        try {
            // InternalAccessesParser.g:1013:1: ( ruleAccessesRootExternalAccessItemsTriggerTimeTrigger EOF )
            // InternalAccessesParser.g:1014:1: ruleAccessesRootExternalAccessItemsTriggerTimeTrigger EOF
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessesRootExternalAccessItemsTriggerTimeTrigger();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerRule()); 
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
    // $ANTLR end "entryRuleAccessesRootExternalAccessItemsTriggerTimeTrigger"


    // $ANTLR start "ruleAccessesRootExternalAccessItemsTriggerTimeTrigger"
    // InternalAccessesParser.g:1021:1: ruleAccessesRootExternalAccessItemsTriggerTimeTrigger : ( ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0 ) ) ;
    public final void ruleAccessesRootExternalAccessItemsTriggerTimeTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1025:2: ( ( ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0 ) ) )
            // InternalAccessesParser.g:1026:2: ( ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0 ) )
            {
            // InternalAccessesParser.g:1026:2: ( ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0 ) )
            // InternalAccessesParser.g:1027:3: ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getGroup()); 
            // InternalAccessesParser.g:1028:3: ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0 )
            // InternalAccessesParser.g:1028:4: rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessesRootExternalAccessItemsTriggerTimeTrigger"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalAccessesParser.g:1037:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalAccessesParser.g:1038:1: ( ruleEBooleanObject EOF )
            // InternalAccessesParser.g:1039:1: ruleEBooleanObject EOF
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
    // InternalAccessesParser.g:1046:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1050:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalAccessesParser.g:1051:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalAccessesParser.g:1051:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalAccessesParser.g:1052:3: ( rule__EBooleanObject__Alternatives )
            {
             before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            // InternalAccessesParser.g:1053:3: ( rule__EBooleanObject__Alternatives )
            // InternalAccessesParser.g:1053:4: rule__EBooleanObject__Alternatives
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
    // InternalAccessesParser.g:1062:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalAccessesParser.g:1063:1: ( ruleEDoubleObject EOF )
            // InternalAccessesParser.g:1064:1: ruleEDoubleObject EOF
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
    // InternalAccessesParser.g:1071:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Alternatives ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1075:2: ( ( ( rule__EDoubleObject__Alternatives ) ) )
            // InternalAccessesParser.g:1076:2: ( ( rule__EDoubleObject__Alternatives ) )
            {
            // InternalAccessesParser.g:1076:2: ( ( rule__EDoubleObject__Alternatives ) )
            // InternalAccessesParser.g:1077:3: ( rule__EDoubleObject__Alternatives )
            {
             before(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 
            // InternalAccessesParser.g:1078:3: ( rule__EDoubleObject__Alternatives )
            // InternalAccessesParser.g:1078:4: rule__EDoubleObject__Alternatives
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


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalAccessesParser.g:1087:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalAccessesParser.g:1088:1: ( ruleVALID_STRING EOF )
            // InternalAccessesParser.g:1089:1: ruleVALID_STRING EOF
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
    // InternalAccessesParser.g:1096:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1100:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalAccessesParser.g:1101:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalAccessesParser.g:1101:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalAccessesParser.g:1102:3: ( rule__VALID_STRING__Alternatives )
            {
             before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            // InternalAccessesParser.g:1103:3: ( rule__VALID_STRING__Alternatives )
            // InternalAccessesParser.g:1103:4: rule__VALID_STRING__Alternatives
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
    // InternalAccessesParser.g:1112:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalAccessesParser.g:1113:1: ( ruleKEYWORD EOF )
            // InternalAccessesParser.g:1114:1: ruleKEYWORD EOF
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
    // InternalAccessesParser.g:1121:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1125:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalAccessesParser.g:1126:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalAccessesParser.g:1126:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalAccessesParser.g:1127:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalAccessesParser.g:1128:3: ( rule__KEYWORD__Alternatives )
            // InternalAccessesParser.g:1128:4: rule__KEYWORD__Alternatives
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


    // $ANTLR start "rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives"
    // InternalAccessesParser.g:1136:1: rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives : ( ( ruleAccessesRootExternalAccessItemsName ) | ( ruleAccessesRootExternalAccessItemsPath ) | ( ruleAccessesRootExternalAccessItemsOntological ) | ( ruleAccessesRootExternalAccessItemsClassname ) | ( ruleAccessesRootExternalAccessItemsMethod ) | ( ruleAccessesRootExternalAccessItemsAuth ) | ( ruleAccessesRootExternalAccessItemsInput ) | ( ruleAccessesRootExternalAccessItemsOutput ) | ( ruleAccessesRootExternalAccessItemsBody ) | ( ruleAccessesRootExternalAccessItemsTrigger ) );
    public final void rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1140:1: ( ( ruleAccessesRootExternalAccessItemsName ) | ( ruleAccessesRootExternalAccessItemsPath ) | ( ruleAccessesRootExternalAccessItemsOntological ) | ( ruleAccessesRootExternalAccessItemsClassname ) | ( ruleAccessesRootExternalAccessItemsMethod ) | ( ruleAccessesRootExternalAccessItemsAuth ) | ( ruleAccessesRootExternalAccessItemsInput ) | ( ruleAccessesRootExternalAccessItemsOutput ) | ( ruleAccessesRootExternalAccessItemsBody ) | ( ruleAccessesRootExternalAccessItemsTrigger ) )
            int alt1=10;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt1=1;
                }
                break;
            case Path:
                {
                alt1=2;
                }
                break;
            case Ontological:
                {
                alt1=3;
                }
                break;
            case Classname:
                {
                alt1=4;
                }
                break;
            case Method:
                {
                alt1=5;
                }
                break;
            case Auth:
                {
                alt1=6;
                }
                break;
            case Input:
                {
                alt1=7;
                }
                break;
            case Output:
                {
                alt1=8;
                }
                break;
            case Body:
                {
                alt1=9;
                }
                break;
            case Trigger:
                {
                alt1=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAccessesParser.g:1141:2: ( ruleAccessesRootExternalAccessItemsName )
                    {
                    // InternalAccessesParser.g:1141:2: ( ruleAccessesRootExternalAccessItemsName )
                    // InternalAccessesParser.g:1142:3: ruleAccessesRootExternalAccessItemsName
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsName();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:1147:2: ( ruleAccessesRootExternalAccessItemsPath )
                    {
                    // InternalAccessesParser.g:1147:2: ( ruleAccessesRootExternalAccessItemsPath )
                    // InternalAccessesParser.g:1148:3: ruleAccessesRootExternalAccessItemsPath
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsPathParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsPath();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsPathParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAccessesParser.g:1153:2: ( ruleAccessesRootExternalAccessItemsOntological )
                    {
                    // InternalAccessesParser.g:1153:2: ( ruleAccessesRootExternalAccessItemsOntological )
                    // InternalAccessesParser.g:1154:3: ruleAccessesRootExternalAccessItemsOntological
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsOntologicalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsOntological();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsOntologicalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAccessesParser.g:1159:2: ( ruleAccessesRootExternalAccessItemsClassname )
                    {
                    // InternalAccessesParser.g:1159:2: ( ruleAccessesRootExternalAccessItemsClassname )
                    // InternalAccessesParser.g:1160:3: ruleAccessesRootExternalAccessItemsClassname
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsClassnameParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsClassname();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsClassnameParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAccessesParser.g:1165:2: ( ruleAccessesRootExternalAccessItemsMethod )
                    {
                    // InternalAccessesParser.g:1165:2: ( ruleAccessesRootExternalAccessItemsMethod )
                    // InternalAccessesParser.g:1166:3: ruleAccessesRootExternalAccessItemsMethod
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsMethodParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsMethod();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsMethodParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAccessesParser.g:1171:2: ( ruleAccessesRootExternalAccessItemsAuth )
                    {
                    // InternalAccessesParser.g:1171:2: ( ruleAccessesRootExternalAccessItemsAuth )
                    // InternalAccessesParser.g:1172:3: ruleAccessesRootExternalAccessItemsAuth
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsAuthParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsAuth();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsAuthParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAccessesParser.g:1177:2: ( ruleAccessesRootExternalAccessItemsInput )
                    {
                    // InternalAccessesParser.g:1177:2: ( ruleAccessesRootExternalAccessItemsInput )
                    // InternalAccessesParser.g:1178:3: ruleAccessesRootExternalAccessItemsInput
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsInput();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAccessesParser.g:1183:2: ( ruleAccessesRootExternalAccessItemsOutput )
                    {
                    // InternalAccessesParser.g:1183:2: ( ruleAccessesRootExternalAccessItemsOutput )
                    // InternalAccessesParser.g:1184:3: ruleAccessesRootExternalAccessItemsOutput
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsOutputParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsOutput();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsOutputParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalAccessesParser.g:1189:2: ( ruleAccessesRootExternalAccessItemsBody )
                    {
                    // InternalAccessesParser.g:1189:2: ( ruleAccessesRootExternalAccessItemsBody )
                    // InternalAccessesParser.g:1190:3: ruleAccessesRootExternalAccessItemsBody
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsBodyParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsBody();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsBodyParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalAccessesParser.g:1195:2: ( ruleAccessesRootExternalAccessItemsTrigger )
                    {
                    // InternalAccessesParser.g:1195:2: ( ruleAccessesRootExternalAccessItemsTrigger )
                    // InternalAccessesParser.g:1196:3: ruleAccessesRootExternalAccessItemsTrigger
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsTrigger();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerParserRuleCall_9()); 

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
    // $ANTLR end "rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives"
    // InternalAccessesParser.g:1205:1: rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives : ( ( ruleAccessesRootExternalAccessItemsTriggerOnChange ) | ( ruleAccessesRootExternalAccessItemsTriggerOnCreate ) | ( ruleAccessesRootExternalAccessItemsTriggerOnMove ) | ( ruleAccessesRootExternalAccessItemsTriggerOnDelete ) | ( ruleAccessesRootExternalAccessItemsTriggerOnAccess ) | ( ruleAccessesRootExternalAccessItemsTriggerOnLoad ) | ( ruleAccessesRootExternalAccessItemsTriggerTimeTrigger ) );
    public final void rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1209:1: ( ( ruleAccessesRootExternalAccessItemsTriggerOnChange ) | ( ruleAccessesRootExternalAccessItemsTriggerOnCreate ) | ( ruleAccessesRootExternalAccessItemsTriggerOnMove ) | ( ruleAccessesRootExternalAccessItemsTriggerOnDelete ) | ( ruleAccessesRootExternalAccessItemsTriggerOnAccess ) | ( ruleAccessesRootExternalAccessItemsTriggerOnLoad ) | ( ruleAccessesRootExternalAccessItemsTriggerTimeTrigger ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case OnChange:
                {
                alt2=1;
                }
                break;
            case OnCreate:
                {
                alt2=2;
                }
                break;
            case OnMove:
                {
                alt2=3;
                }
                break;
            case OnDelete:
                {
                alt2=4;
                }
                break;
            case OnAccess:
                {
                alt2=5;
                }
                break;
            case OnLoad:
                {
                alt2=6;
                }
                break;
            case TimeTrigger:
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
                    // InternalAccessesParser.g:1210:2: ( ruleAccessesRootExternalAccessItemsTriggerOnChange )
                    {
                    // InternalAccessesParser.g:1210:2: ( ruleAccessesRootExternalAccessItemsTriggerOnChange )
                    // InternalAccessesParser.g:1211:3: ruleAccessesRootExternalAccessItemsTriggerOnChange
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnChangeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsTriggerOnChange();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnChangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:1216:2: ( ruleAccessesRootExternalAccessItemsTriggerOnCreate )
                    {
                    // InternalAccessesParser.g:1216:2: ( ruleAccessesRootExternalAccessItemsTriggerOnCreate )
                    // InternalAccessesParser.g:1217:3: ruleAccessesRootExternalAccessItemsTriggerOnCreate
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnCreateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsTriggerOnCreate();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnCreateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAccessesParser.g:1222:2: ( ruleAccessesRootExternalAccessItemsTriggerOnMove )
                    {
                    // InternalAccessesParser.g:1222:2: ( ruleAccessesRootExternalAccessItemsTriggerOnMove )
                    // InternalAccessesParser.g:1223:3: ruleAccessesRootExternalAccessItemsTriggerOnMove
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnMoveParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsTriggerOnMove();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnMoveParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAccessesParser.g:1228:2: ( ruleAccessesRootExternalAccessItemsTriggerOnDelete )
                    {
                    // InternalAccessesParser.g:1228:2: ( ruleAccessesRootExternalAccessItemsTriggerOnDelete )
                    // InternalAccessesParser.g:1229:3: ruleAccessesRootExternalAccessItemsTriggerOnDelete
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnDeleteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsTriggerOnDelete();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnDeleteParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAccessesParser.g:1234:2: ( ruleAccessesRootExternalAccessItemsTriggerOnAccess )
                    {
                    // InternalAccessesParser.g:1234:2: ( ruleAccessesRootExternalAccessItemsTriggerOnAccess )
                    // InternalAccessesParser.g:1235:3: ruleAccessesRootExternalAccessItemsTriggerOnAccess
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnAccessParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsTriggerOnAccess();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnAccessParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAccessesParser.g:1240:2: ( ruleAccessesRootExternalAccessItemsTriggerOnLoad )
                    {
                    // InternalAccessesParser.g:1240:2: ( ruleAccessesRootExternalAccessItemsTriggerOnLoad )
                    // InternalAccessesParser.g:1241:3: ruleAccessesRootExternalAccessItemsTriggerOnLoad
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnLoadParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsTriggerOnLoad();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerOnLoadParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAccessesParser.g:1246:2: ( ruleAccessesRootExternalAccessItemsTriggerTimeTrigger )
                    {
                    // InternalAccessesParser.g:1246:2: ( ruleAccessesRootExternalAccessItemsTriggerTimeTrigger )
                    // InternalAccessesParser.g:1247:3: ruleAccessesRootExternalAccessItemsTriggerTimeTrigger
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerTimeTriggerParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsTriggerTimeTrigger();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAccessesRootExternalAccessItemsTriggerTimeTriggerParserRuleCall_6()); 

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
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives"
    // InternalAccessesParser.g:1256:1: rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives : ( ( ruleAccessesRootExternalAccessItemsInputItemsAttr ) | ( ruleAccessesRootExternalAccessItemsInputItemsAPIInput ) | ( ruleAccessesRootExternalAccessItemsInputItemsWay ) | ( ruleAccessesRootExternalAccessItemsInputItemsValue ) );
    public final void rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1260:1: ( ( ruleAccessesRootExternalAccessItemsInputItemsAttr ) | ( ruleAccessesRootExternalAccessItemsInputItemsAPIInput ) | ( ruleAccessesRootExternalAccessItemsInputItemsWay ) | ( ruleAccessesRootExternalAccessItemsInputItemsValue ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case Attr:
                {
                alt3=1;
                }
                break;
            case APIInput:
                {
                alt3=2;
                }
                break;
            case Way:
                {
                alt3=3;
                }
                break;
            case Value:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAccessesParser.g:1261:2: ( ruleAccessesRootExternalAccessItemsInputItemsAttr )
                    {
                    // InternalAccessesParser.g:1261:2: ( ruleAccessesRootExternalAccessItemsInputItemsAttr )
                    // InternalAccessesParser.g:1262:3: ruleAccessesRootExternalAccessItemsInputItemsAttr
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputItemsAttrParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsInputItemsAttr();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputItemsAttrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:1267:2: ( ruleAccessesRootExternalAccessItemsInputItemsAPIInput )
                    {
                    // InternalAccessesParser.g:1267:2: ( ruleAccessesRootExternalAccessItemsInputItemsAPIInput )
                    // InternalAccessesParser.g:1268:3: ruleAccessesRootExternalAccessItemsInputItemsAPIInput
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputItemsAPIInputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsInputItemsAPIInput();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputItemsAPIInputParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAccessesParser.g:1273:2: ( ruleAccessesRootExternalAccessItemsInputItemsWay )
                    {
                    // InternalAccessesParser.g:1273:2: ( ruleAccessesRootExternalAccessItemsInputItemsWay )
                    // InternalAccessesParser.g:1274:3: ruleAccessesRootExternalAccessItemsInputItemsWay
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputItemsWayParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsInputItemsWay();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputItemsWayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAccessesParser.g:1279:2: ( ruleAccessesRootExternalAccessItemsInputItemsValue )
                    {
                    // InternalAccessesParser.g:1279:2: ( ruleAccessesRootExternalAccessItemsInputItemsValue )
                    // InternalAccessesParser.g:1280:3: ruleAccessesRootExternalAccessItemsInputItemsValue
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputItemsValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsInputItemsValue();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsInputItemsValueParserRuleCall_3()); 

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
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives"
    // InternalAccessesParser.g:1289:1: rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives : ( ( ruleAccessesRootExternalAccessItemsOutputItemsAttr ) | ( ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput ) );
    public final void rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1293:1: ( ( ruleAccessesRootExternalAccessItemsOutputItemsAttr ) | ( ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Attr) ) {
                alt4=1;
            }
            else if ( (LA4_0==APIOutput) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAccessesParser.g:1294:2: ( ruleAccessesRootExternalAccessItemsOutputItemsAttr )
                    {
                    // InternalAccessesParser.g:1294:2: ( ruleAccessesRootExternalAccessItemsOutputItemsAttr )
                    // InternalAccessesParser.g:1295:3: ruleAccessesRootExternalAccessItemsOutputItemsAttr
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsOutputItemsAttrParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsOutputItemsAttr();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsOutputItemsAttrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:1300:2: ( ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput )
                    {
                    // InternalAccessesParser.g:1300:2: ( ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput )
                    // InternalAccessesParser.g:1301:3: ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsOutputItemsAPIOutputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsOutputItemsAPIOutput();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsOutputItemsAPIOutputParserRuleCall_1()); 

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
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives"
    // InternalAccessesParser.g:1310:1: rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives : ( ( ruleAccessesRootExternalAccessItemsBodyItemsAttr ) | ( ruleAccessesRootExternalAccessItemsBodyItemsAPIBody ) );
    public final void rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1314:1: ( ( ruleAccessesRootExternalAccessItemsBodyItemsAttr ) | ( ruleAccessesRootExternalAccessItemsBodyItemsAPIBody ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Attr) ) {
                alt5=1;
            }
            else if ( (LA5_0==APIBody) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAccessesParser.g:1315:2: ( ruleAccessesRootExternalAccessItemsBodyItemsAttr )
                    {
                    // InternalAccessesParser.g:1315:2: ( ruleAccessesRootExternalAccessItemsBodyItemsAttr )
                    // InternalAccessesParser.g:1316:3: ruleAccessesRootExternalAccessItemsBodyItemsAttr
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsBodyItemsAttrParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsBodyItemsAttr();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsBodyItemsAttrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:1321:2: ( ruleAccessesRootExternalAccessItemsBodyItemsAPIBody )
                    {
                    // InternalAccessesParser.g:1321:2: ( ruleAccessesRootExternalAccessItemsBodyItemsAPIBody )
                    // InternalAccessesParser.g:1322:3: ruleAccessesRootExternalAccessItemsBodyItemsAPIBody
                    {
                     before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsBodyItemsAPIBodyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessesRootExternalAccessItemsBodyItemsAPIBody();

                    state._fsp--;

                     after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractAccess().getAccessesRootExternalAccessItemsBodyItemsAPIBodyParserRuleCall_1()); 

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
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__EBooleanObject__Alternatives"
    // InternalAccessesParser.g:1331:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1335:1: ( ( True ) | ( False ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==True) ) {
                alt6=1;
            }
            else if ( (LA6_0==False) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAccessesParser.g:1336:2: ( True )
                    {
                    // InternalAccessesParser.g:1336:2: ( True )
                    // InternalAccessesParser.g:1337:3: True
                    {
                     before(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:1342:2: ( False )
                    {
                    // InternalAccessesParser.g:1342:2: ( False )
                    // InternalAccessesParser.g:1343:3: False
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
    // InternalAccessesParser.g:1352:1: rule__EDoubleObject__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDoubleObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1356:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_E_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_E_DOUBLE) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAccessesParser.g:1357:2: ( RULE_E_INT )
                    {
                    // InternalAccessesParser.g:1357:2: ( RULE_E_INT )
                    // InternalAccessesParser.g:1358:3: RULE_E_INT
                    {
                     before(grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0()); 
                    match(input,RULE_E_INT,FOLLOW_2); 
                     after(grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:1363:2: ( RULE_E_DOUBLE )
                    {
                    // InternalAccessesParser.g:1363:2: ( RULE_E_DOUBLE )
                    // InternalAccessesParser.g:1364:3: RULE_E_DOUBLE
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
    // InternalAccessesParser.g:1373:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1377:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=ExternalAccess && LA8_0<=Way)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAccessesParser.g:1378:2: ( RULE_STRING )
                    {
                    // InternalAccessesParser.g:1378:2: ( RULE_STRING )
                    // InternalAccessesParser.g:1379:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:1384:2: ( ruleKEYWORD )
                    {
                    // InternalAccessesParser.g:1384:2: ( ruleKEYWORD )
                    // InternalAccessesParser.g:1385:3: ruleKEYWORD
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
    // InternalAccessesParser.g:1394:1: rule__KEYWORD__Alternatives : ( ( APIOutput ) | ( APIBody ) | ( OnCreate ) | ( Method ) | ( OnChange ) | ( Auth ) | ( ExternalAccess ) | ( Ontological ) | ( Trigger ) | ( Body ) | ( OnMove ) | ( TimeTrigger ) | ( Way ) | ( Output ) | ( Path ) | ( Input ) | ( OnDelete ) | ( Classname ) | ( Name ) | ( APIInput ) | ( OnLoad ) | ( Attr ) | ( Value ) | ( OnAccess ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1398:1: ( ( APIOutput ) | ( APIBody ) | ( OnCreate ) | ( Method ) | ( OnChange ) | ( Auth ) | ( ExternalAccess ) | ( Ontological ) | ( Trigger ) | ( Body ) | ( OnMove ) | ( TimeTrigger ) | ( Way ) | ( Output ) | ( Path ) | ( Input ) | ( OnDelete ) | ( Classname ) | ( Name ) | ( APIInput ) | ( OnLoad ) | ( Attr ) | ( Value ) | ( OnAccess ) )
            int alt9=24;
            switch ( input.LA(1) ) {
            case APIOutput:
                {
                alt9=1;
                }
                break;
            case APIBody:
                {
                alt9=2;
                }
                break;
            case OnCreate:
                {
                alt9=3;
                }
                break;
            case Method:
                {
                alt9=4;
                }
                break;
            case OnChange:
                {
                alt9=5;
                }
                break;
            case Auth:
                {
                alt9=6;
                }
                break;
            case ExternalAccess:
                {
                alt9=7;
                }
                break;
            case Ontological:
                {
                alt9=8;
                }
                break;
            case Trigger:
                {
                alt9=9;
                }
                break;
            case Body:
                {
                alt9=10;
                }
                break;
            case OnMove:
                {
                alt9=11;
                }
                break;
            case TimeTrigger:
                {
                alt9=12;
                }
                break;
            case Way:
                {
                alt9=13;
                }
                break;
            case Output:
                {
                alt9=14;
                }
                break;
            case Path:
                {
                alt9=15;
                }
                break;
            case Input:
                {
                alt9=16;
                }
                break;
            case OnDelete:
                {
                alt9=17;
                }
                break;
            case Classname:
                {
                alt9=18;
                }
                break;
            case Name:
                {
                alt9=19;
                }
                break;
            case APIInput:
                {
                alt9=20;
                }
                break;
            case OnLoad:
                {
                alt9=21;
                }
                break;
            case Attr:
                {
                alt9=22;
                }
                break;
            case Value:
                {
                alt9=23;
                }
                break;
            case OnAccess:
                {
                alt9=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAccessesParser.g:1399:2: ( APIOutput )
                    {
                    // InternalAccessesParser.g:1399:2: ( APIOutput )
                    // InternalAccessesParser.g:1400:3: APIOutput
                    {
                     before(grammarAccess.getKEYWORDAccess().getAPIOutputKeyword_0()); 
                    match(input,APIOutput,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAPIOutputKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAccessesParser.g:1405:2: ( APIBody )
                    {
                    // InternalAccessesParser.g:1405:2: ( APIBody )
                    // InternalAccessesParser.g:1406:3: APIBody
                    {
                     before(grammarAccess.getKEYWORDAccess().getAPIBodyKeyword_1()); 
                    match(input,APIBody,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAPIBodyKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAccessesParser.g:1411:2: ( OnCreate )
                    {
                    // InternalAccessesParser.g:1411:2: ( OnCreate )
                    // InternalAccessesParser.g:1412:3: OnCreate
                    {
                     before(grammarAccess.getKEYWORDAccess().getOnCreateKeyword_2()); 
                    match(input,OnCreate,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOnCreateKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAccessesParser.g:1417:2: ( Method )
                    {
                    // InternalAccessesParser.g:1417:2: ( Method )
                    // InternalAccessesParser.g:1418:3: Method
                    {
                     before(grammarAccess.getKEYWORDAccess().getMethodKeyword_3()); 
                    match(input,Method,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMethodKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAccessesParser.g:1423:2: ( OnChange )
                    {
                    // InternalAccessesParser.g:1423:2: ( OnChange )
                    // InternalAccessesParser.g:1424:3: OnChange
                    {
                     before(grammarAccess.getKEYWORDAccess().getOnChangeKeyword_4()); 
                    match(input,OnChange,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOnChangeKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAccessesParser.g:1429:2: ( Auth )
                    {
                    // InternalAccessesParser.g:1429:2: ( Auth )
                    // InternalAccessesParser.g:1430:3: Auth
                    {
                     before(grammarAccess.getKEYWORDAccess().getAuthKeyword_5()); 
                    match(input,Auth,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAuthKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAccessesParser.g:1435:2: ( ExternalAccess )
                    {
                    // InternalAccessesParser.g:1435:2: ( ExternalAccess )
                    // InternalAccessesParser.g:1436:3: ExternalAccess
                    {
                     before(grammarAccess.getKEYWORDAccess().getExternalAccessKeyword_6()); 
                    match(input,ExternalAccess,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getExternalAccessKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAccessesParser.g:1441:2: ( Ontological )
                    {
                    // InternalAccessesParser.g:1441:2: ( Ontological )
                    // InternalAccessesParser.g:1442:3: Ontological
                    {
                     before(grammarAccess.getKEYWORDAccess().getOntologicalKeyword_7()); 
                    match(input,Ontological,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOntologicalKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalAccessesParser.g:1447:2: ( Trigger )
                    {
                    // InternalAccessesParser.g:1447:2: ( Trigger )
                    // InternalAccessesParser.g:1448:3: Trigger
                    {
                     before(grammarAccess.getKEYWORDAccess().getTriggerKeyword_8()); 
                    match(input,Trigger,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTriggerKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalAccessesParser.g:1453:2: ( Body )
                    {
                    // InternalAccessesParser.g:1453:2: ( Body )
                    // InternalAccessesParser.g:1454:3: Body
                    {
                     before(grammarAccess.getKEYWORDAccess().getBodyKeyword_9()); 
                    match(input,Body,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getBodyKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalAccessesParser.g:1459:2: ( OnMove )
                    {
                    // InternalAccessesParser.g:1459:2: ( OnMove )
                    // InternalAccessesParser.g:1460:3: OnMove
                    {
                     before(grammarAccess.getKEYWORDAccess().getOnMoveKeyword_10()); 
                    match(input,OnMove,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOnMoveKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalAccessesParser.g:1465:2: ( TimeTrigger )
                    {
                    // InternalAccessesParser.g:1465:2: ( TimeTrigger )
                    // InternalAccessesParser.g:1466:3: TimeTrigger
                    {
                     before(grammarAccess.getKEYWORDAccess().getTimeTriggerKeyword_11()); 
                    match(input,TimeTrigger,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTimeTriggerKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalAccessesParser.g:1471:2: ( Way )
                    {
                    // InternalAccessesParser.g:1471:2: ( Way )
                    // InternalAccessesParser.g:1472:3: Way
                    {
                     before(grammarAccess.getKEYWORDAccess().getWayKeyword_12()); 
                    match(input,Way,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getWayKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalAccessesParser.g:1477:2: ( Output )
                    {
                    // InternalAccessesParser.g:1477:2: ( Output )
                    // InternalAccessesParser.g:1478:3: Output
                    {
                     before(grammarAccess.getKEYWORDAccess().getOutputKeyword_13()); 
                    match(input,Output,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOutputKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalAccessesParser.g:1483:2: ( Path )
                    {
                    // InternalAccessesParser.g:1483:2: ( Path )
                    // InternalAccessesParser.g:1484:3: Path
                    {
                     before(grammarAccess.getKEYWORDAccess().getPathKeyword_14()); 
                    match(input,Path,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPathKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalAccessesParser.g:1489:2: ( Input )
                    {
                    // InternalAccessesParser.g:1489:2: ( Input )
                    // InternalAccessesParser.g:1490:3: Input
                    {
                     before(grammarAccess.getKEYWORDAccess().getInputKeyword_15()); 
                    match(input,Input,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getInputKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalAccessesParser.g:1495:2: ( OnDelete )
                    {
                    // InternalAccessesParser.g:1495:2: ( OnDelete )
                    // InternalAccessesParser.g:1496:3: OnDelete
                    {
                     before(grammarAccess.getKEYWORDAccess().getOnDeleteKeyword_16()); 
                    match(input,OnDelete,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOnDeleteKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalAccessesParser.g:1501:2: ( Classname )
                    {
                    // InternalAccessesParser.g:1501:2: ( Classname )
                    // InternalAccessesParser.g:1502:3: Classname
                    {
                     before(grammarAccess.getKEYWORDAccess().getClassnameKeyword_17()); 
                    match(input,Classname,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getClassnameKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalAccessesParser.g:1507:2: ( Name )
                    {
                    // InternalAccessesParser.g:1507:2: ( Name )
                    // InternalAccessesParser.g:1508:3: Name
                    {
                     before(grammarAccess.getKEYWORDAccess().getNameKeyword_18()); 
                    match(input,Name,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNameKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalAccessesParser.g:1513:2: ( APIInput )
                    {
                    // InternalAccessesParser.g:1513:2: ( APIInput )
                    // InternalAccessesParser.g:1514:3: APIInput
                    {
                     before(grammarAccess.getKEYWORDAccess().getAPIInputKeyword_19()); 
                    match(input,APIInput,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAPIInputKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalAccessesParser.g:1519:2: ( OnLoad )
                    {
                    // InternalAccessesParser.g:1519:2: ( OnLoad )
                    // InternalAccessesParser.g:1520:3: OnLoad
                    {
                     before(grammarAccess.getKEYWORDAccess().getOnLoadKeyword_20()); 
                    match(input,OnLoad,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOnLoadKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalAccessesParser.g:1525:2: ( Attr )
                    {
                    // InternalAccessesParser.g:1525:2: ( Attr )
                    // InternalAccessesParser.g:1526:3: Attr
                    {
                     before(grammarAccess.getKEYWORDAccess().getAttrKeyword_21()); 
                    match(input,Attr,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAttrKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalAccessesParser.g:1531:2: ( Value )
                    {
                    // InternalAccessesParser.g:1531:2: ( Value )
                    // InternalAccessesParser.g:1532:3: Value
                    {
                     before(grammarAccess.getKEYWORDAccess().getValueKeyword_22()); 
                    match(input,Value,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getValueKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalAccessesParser.g:1537:2: ( OnAccess )
                    {
                    // InternalAccessesParser.g:1537:2: ( OnAccess )
                    // InternalAccessesParser.g:1538:3: OnAccess
                    {
                     before(grammarAccess.getKEYWORDAccess().getOnAccessKeyword_23()); 
                    match(input,OnAccess,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOnAccessKeyword_23()); 

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


    // $ANTLR start "rule__AccessesRoot__Group__0"
    // InternalAccessesParser.g:1547:1: rule__AccessesRoot__Group__0 : rule__AccessesRoot__Group__0__Impl rule__AccessesRoot__Group__1 ;
    public final void rule__AccessesRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1551:1: ( rule__AccessesRoot__Group__0__Impl rule__AccessesRoot__Group__1 )
            // InternalAccessesParser.g:1552:2: rule__AccessesRoot__Group__0__Impl rule__AccessesRoot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AccessesRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRoot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group__0"


    // $ANTLR start "rule__AccessesRoot__Group__0__Impl"
    // InternalAccessesParser.g:1559:1: rule__AccessesRoot__Group__0__Impl : ( () ) ;
    public final void rule__AccessesRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1563:1: ( ( () ) )
            // InternalAccessesParser.g:1564:1: ( () )
            {
            // InternalAccessesParser.g:1564:1: ( () )
            // InternalAccessesParser.g:1565:2: ()
            {
             before(grammarAccess.getAccessesRootAccess().getAccessesRootAction_0()); 
            // InternalAccessesParser.g:1566:2: ()
            // InternalAccessesParser.g:1566:3: 
            {
            }

             after(grammarAccess.getAccessesRootAccess().getAccessesRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group__0__Impl"


    // $ANTLR start "rule__AccessesRoot__Group__1"
    // InternalAccessesParser.g:1574:1: rule__AccessesRoot__Group__1 : rule__AccessesRoot__Group__1__Impl rule__AccessesRoot__Group__2 ;
    public final void rule__AccessesRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1578:1: ( rule__AccessesRoot__Group__1__Impl rule__AccessesRoot__Group__2 )
            // InternalAccessesParser.g:1579:2: rule__AccessesRoot__Group__1__Impl rule__AccessesRoot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AccessesRoot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRoot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group__1"


    // $ANTLR start "rule__AccessesRoot__Group__1__Impl"
    // InternalAccessesParser.g:1586:1: rule__AccessesRoot__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__AccessesRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1590:1: ( ( LeftCurlyBracket ) )
            // InternalAccessesParser.g:1591:1: ( LeftCurlyBracket )
            {
            // InternalAccessesParser.g:1591:1: ( LeftCurlyBracket )
            // InternalAccessesParser.g:1592:2: LeftCurlyBracket
            {
             before(grammarAccess.getAccessesRootAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group__1__Impl"


    // $ANTLR start "rule__AccessesRoot__Group__2"
    // InternalAccessesParser.g:1601:1: rule__AccessesRoot__Group__2 : rule__AccessesRoot__Group__2__Impl rule__AccessesRoot__Group__3 ;
    public final void rule__AccessesRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1605:1: ( rule__AccessesRoot__Group__2__Impl rule__AccessesRoot__Group__3 )
            // InternalAccessesParser.g:1606:2: rule__AccessesRoot__Group__2__Impl rule__AccessesRoot__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AccessesRoot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRoot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group__2"


    // $ANTLR start "rule__AccessesRoot__Group__2__Impl"
    // InternalAccessesParser.g:1613:1: rule__AccessesRoot__Group__2__Impl : ( ( rule__AccessesRoot__Group_2__0 )? ) ;
    public final void rule__AccessesRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1617:1: ( ( ( rule__AccessesRoot__Group_2__0 )? ) )
            // InternalAccessesParser.g:1618:1: ( ( rule__AccessesRoot__Group_2__0 )? )
            {
            // InternalAccessesParser.g:1618:1: ( ( rule__AccessesRoot__Group_2__0 )? )
            // InternalAccessesParser.g:1619:2: ( rule__AccessesRoot__Group_2__0 )?
            {
             before(grammarAccess.getAccessesRootAccess().getGroup_2()); 
            // InternalAccessesParser.g:1620:2: ( rule__AccessesRoot__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ExternalAccess) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAccessesParser.g:1620:3: rule__AccessesRoot__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AccessesRoot__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccessesRootAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group__2__Impl"


    // $ANTLR start "rule__AccessesRoot__Group__3"
    // InternalAccessesParser.g:1628:1: rule__AccessesRoot__Group__3 : rule__AccessesRoot__Group__3__Impl ;
    public final void rule__AccessesRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1632:1: ( rule__AccessesRoot__Group__3__Impl )
            // InternalAccessesParser.g:1633:2: rule__AccessesRoot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRoot__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group__3"


    // $ANTLR start "rule__AccessesRoot__Group__3__Impl"
    // InternalAccessesParser.g:1639:1: rule__AccessesRoot__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__AccessesRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1643:1: ( ( RightCurlyBracket ) )
            // InternalAccessesParser.g:1644:1: ( RightCurlyBracket )
            {
            // InternalAccessesParser.g:1644:1: ( RightCurlyBracket )
            // InternalAccessesParser.g:1645:2: RightCurlyBracket
            {
             before(grammarAccess.getAccessesRootAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group__3__Impl"


    // $ANTLR start "rule__AccessesRoot__Group_2__0"
    // InternalAccessesParser.g:1655:1: rule__AccessesRoot__Group_2__0 : rule__AccessesRoot__Group_2__0__Impl rule__AccessesRoot__Group_2__1 ;
    public final void rule__AccessesRoot__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1659:1: ( rule__AccessesRoot__Group_2__0__Impl rule__AccessesRoot__Group_2__1 )
            // InternalAccessesParser.g:1660:2: rule__AccessesRoot__Group_2__0__Impl rule__AccessesRoot__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__AccessesRoot__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRoot__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group_2__0"


    // $ANTLR start "rule__AccessesRoot__Group_2__0__Impl"
    // InternalAccessesParser.g:1667:1: rule__AccessesRoot__Group_2__0__Impl : ( ( rule__AccessesRoot__AccessesRootAssignment_2_0 ) ) ;
    public final void rule__AccessesRoot__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1671:1: ( ( ( rule__AccessesRoot__AccessesRootAssignment_2_0 ) ) )
            // InternalAccessesParser.g:1672:1: ( ( rule__AccessesRoot__AccessesRootAssignment_2_0 ) )
            {
            // InternalAccessesParser.g:1672:1: ( ( rule__AccessesRoot__AccessesRootAssignment_2_0 ) )
            // InternalAccessesParser.g:1673:2: ( rule__AccessesRoot__AccessesRootAssignment_2_0 )
            {
             before(grammarAccess.getAccessesRootAccess().getAccessesRootAssignment_2_0()); 
            // InternalAccessesParser.g:1674:2: ( rule__AccessesRoot__AccessesRootAssignment_2_0 )
            // InternalAccessesParser.g:1674:3: rule__AccessesRoot__AccessesRootAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRoot__AccessesRootAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootAccess().getAccessesRootAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group_2__0__Impl"


    // $ANTLR start "rule__AccessesRoot__Group_2__1"
    // InternalAccessesParser.g:1682:1: rule__AccessesRoot__Group_2__1 : rule__AccessesRoot__Group_2__1__Impl ;
    public final void rule__AccessesRoot__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1686:1: ( rule__AccessesRoot__Group_2__1__Impl )
            // InternalAccessesParser.g:1687:2: rule__AccessesRoot__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRoot__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group_2__1"


    // $ANTLR start "rule__AccessesRoot__Group_2__1__Impl"
    // InternalAccessesParser.g:1693:1: rule__AccessesRoot__Group_2__1__Impl : ( ( rule__AccessesRoot__Group_2_1__0 )* ) ;
    public final void rule__AccessesRoot__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1697:1: ( ( ( rule__AccessesRoot__Group_2_1__0 )* ) )
            // InternalAccessesParser.g:1698:1: ( ( rule__AccessesRoot__Group_2_1__0 )* )
            {
            // InternalAccessesParser.g:1698:1: ( ( rule__AccessesRoot__Group_2_1__0 )* )
            // InternalAccessesParser.g:1699:2: ( rule__AccessesRoot__Group_2_1__0 )*
            {
             before(grammarAccess.getAccessesRootAccess().getGroup_2_1()); 
            // InternalAccessesParser.g:1700:2: ( rule__AccessesRoot__Group_2_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAccessesParser.g:1700:3: rule__AccessesRoot__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AccessesRoot__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAccessesRootAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group_2__1__Impl"


    // $ANTLR start "rule__AccessesRoot__Group_2_1__0"
    // InternalAccessesParser.g:1709:1: rule__AccessesRoot__Group_2_1__0 : rule__AccessesRoot__Group_2_1__0__Impl rule__AccessesRoot__Group_2_1__1 ;
    public final void rule__AccessesRoot__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1713:1: ( rule__AccessesRoot__Group_2_1__0__Impl rule__AccessesRoot__Group_2_1__1 )
            // InternalAccessesParser.g:1714:2: rule__AccessesRoot__Group_2_1__0__Impl rule__AccessesRoot__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__AccessesRoot__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRoot__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group_2_1__0"


    // $ANTLR start "rule__AccessesRoot__Group_2_1__0__Impl"
    // InternalAccessesParser.g:1721:1: rule__AccessesRoot__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__AccessesRoot__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1725:1: ( ( Comma ) )
            // InternalAccessesParser.g:1726:1: ( Comma )
            {
            // InternalAccessesParser.g:1726:1: ( Comma )
            // InternalAccessesParser.g:1727:2: Comma
            {
             before(grammarAccess.getAccessesRootAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getAccessesRootAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group_2_1__0__Impl"


    // $ANTLR start "rule__AccessesRoot__Group_2_1__1"
    // InternalAccessesParser.g:1736:1: rule__AccessesRoot__Group_2_1__1 : rule__AccessesRoot__Group_2_1__1__Impl ;
    public final void rule__AccessesRoot__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1740:1: ( rule__AccessesRoot__Group_2_1__1__Impl )
            // InternalAccessesParser.g:1741:2: rule__AccessesRoot__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRoot__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group_2_1__1"


    // $ANTLR start "rule__AccessesRoot__Group_2_1__1__Impl"
    // InternalAccessesParser.g:1747:1: rule__AccessesRoot__Group_2_1__1__Impl : ( ( rule__AccessesRoot__AccessesRootAssignment_2_1_1 ) ) ;
    public final void rule__AccessesRoot__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1751:1: ( ( ( rule__AccessesRoot__AccessesRootAssignment_2_1_1 ) ) )
            // InternalAccessesParser.g:1752:1: ( ( rule__AccessesRoot__AccessesRootAssignment_2_1_1 ) )
            {
            // InternalAccessesParser.g:1752:1: ( ( rule__AccessesRoot__AccessesRootAssignment_2_1_1 ) )
            // InternalAccessesParser.g:1753:2: ( rule__AccessesRoot__AccessesRootAssignment_2_1_1 )
            {
             before(grammarAccess.getAccessesRootAccess().getAccessesRootAssignment_2_1_1()); 
            // InternalAccessesParser.g:1754:2: ( rule__AccessesRoot__AccessesRootAssignment_2_1_1 )
            // InternalAccessesParser.g:1754:3: rule__AccessesRoot__AccessesRootAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRoot__AccessesRootAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootAccess().getAccessesRootAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__Group_2_1__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group__0"
    // InternalAccessesParser.g:1763:1: rule__AccessesRootExternalAccess__Group__0 : rule__AccessesRootExternalAccess__Group__0__Impl rule__AccessesRootExternalAccess__Group__1 ;
    public final void rule__AccessesRootExternalAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1767:1: ( rule__AccessesRootExternalAccess__Group__0__Impl rule__AccessesRootExternalAccess__Group__1 )
            // InternalAccessesParser.g:1768:2: rule__AccessesRootExternalAccess__Group__0__Impl rule__AccessesRootExternalAccess__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AccessesRootExternalAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group__0__Impl"
    // InternalAccessesParser.g:1775:1: rule__AccessesRootExternalAccess__Group__0__Impl : ( () ) ;
    public final void rule__AccessesRootExternalAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1779:1: ( ( () ) )
            // InternalAccessesParser.g:1780:1: ( () )
            {
            // InternalAccessesParser.g:1780:1: ( () )
            // InternalAccessesParser.g:1781:2: ()
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getAccessesRootExternalAccessAction_0()); 
            // InternalAccessesParser.g:1782:2: ()
            // InternalAccessesParser.g:1782:3: 
            {
            }

             after(grammarAccess.getAccessesRootExternalAccessAccess().getAccessesRootExternalAccessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group__1"
    // InternalAccessesParser.g:1790:1: rule__AccessesRootExternalAccess__Group__1 : rule__AccessesRootExternalAccess__Group__1__Impl rule__AccessesRootExternalAccess__Group__2 ;
    public final void rule__AccessesRootExternalAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1794:1: ( rule__AccessesRootExternalAccess__Group__1__Impl rule__AccessesRootExternalAccess__Group__2 )
            // InternalAccessesParser.g:1795:2: rule__AccessesRootExternalAccess__Group__1__Impl rule__AccessesRootExternalAccess__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group__1__Impl"
    // InternalAccessesParser.g:1802:1: rule__AccessesRootExternalAccess__Group__1__Impl : ( ExternalAccess ) ;
    public final void rule__AccessesRootExternalAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1806:1: ( ( ExternalAccess ) )
            // InternalAccessesParser.g:1807:1: ( ExternalAccess )
            {
            // InternalAccessesParser.g:1807:1: ( ExternalAccess )
            // InternalAccessesParser.g:1808:2: ExternalAccess
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessKeyword_1()); 
            match(input,ExternalAccess,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group__2"
    // InternalAccessesParser.g:1817:1: rule__AccessesRootExternalAccess__Group__2 : rule__AccessesRootExternalAccess__Group__2__Impl rule__AccessesRootExternalAccess__Group__3 ;
    public final void rule__AccessesRootExternalAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1821:1: ( rule__AccessesRootExternalAccess__Group__2__Impl rule__AccessesRootExternalAccess__Group__3 )
            // InternalAccessesParser.g:1822:2: rule__AccessesRootExternalAccess__Group__2__Impl rule__AccessesRootExternalAccess__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__AccessesRootExternalAccess__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group__2__Impl"
    // InternalAccessesParser.g:1829:1: rule__AccessesRootExternalAccess__Group__2__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1833:1: ( ( Colon ) )
            // InternalAccessesParser.g:1834:1: ( Colon )
            {
            // InternalAccessesParser.g:1834:1: ( Colon )
            // InternalAccessesParser.g:1835:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group__3"
    // InternalAccessesParser.g:1844:1: rule__AccessesRootExternalAccess__Group__3 : rule__AccessesRootExternalAccess__Group__3__Impl rule__AccessesRootExternalAccess__Group__4 ;
    public final void rule__AccessesRootExternalAccess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1848:1: ( rule__AccessesRootExternalAccess__Group__3__Impl rule__AccessesRootExternalAccess__Group__4 )
            // InternalAccessesParser.g:1849:2: rule__AccessesRootExternalAccess__Group__3__Impl rule__AccessesRootExternalAccess__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__AccessesRootExternalAccess__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group__3"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group__3__Impl"
    // InternalAccessesParser.g:1856:1: rule__AccessesRootExternalAccess__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__AccessesRootExternalAccess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1860:1: ( ( LeftSquareBracket ) )
            // InternalAccessesParser.g:1861:1: ( LeftSquareBracket )
            {
            // InternalAccessesParser.g:1861:1: ( LeftSquareBracket )
            // InternalAccessesParser.g:1862:2: LeftSquareBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group__3__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group__4"
    // InternalAccessesParser.g:1871:1: rule__AccessesRootExternalAccess__Group__4 : rule__AccessesRootExternalAccess__Group__4__Impl rule__AccessesRootExternalAccess__Group__5 ;
    public final void rule__AccessesRootExternalAccess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1875:1: ( rule__AccessesRootExternalAccess__Group__4__Impl rule__AccessesRootExternalAccess__Group__5 )
            // InternalAccessesParser.g:1876:2: rule__AccessesRootExternalAccess__Group__4__Impl rule__AccessesRootExternalAccess__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__AccessesRootExternalAccess__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group__4"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group__4__Impl"
    // InternalAccessesParser.g:1883:1: rule__AccessesRootExternalAccess__Group__4__Impl : ( ( rule__AccessesRootExternalAccess__Group_4__0 )? ) ;
    public final void rule__AccessesRootExternalAccess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1887:1: ( ( ( rule__AccessesRootExternalAccess__Group_4__0 )? ) )
            // InternalAccessesParser.g:1888:1: ( ( rule__AccessesRootExternalAccess__Group_4__0 )? )
            {
            // InternalAccessesParser.g:1888:1: ( ( rule__AccessesRootExternalAccess__Group_4__0 )? )
            // InternalAccessesParser.g:1889:2: ( rule__AccessesRootExternalAccess__Group_4__0 )?
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getGroup_4()); 
            // InternalAccessesParser.g:1890:2: ( rule__AccessesRootExternalAccess__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LeftCurlyBracket) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAccessesParser.g:1890:3: rule__AccessesRootExternalAccess__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AccessesRootExternalAccess__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccessesRootExternalAccessAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group__4__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group__5"
    // InternalAccessesParser.g:1898:1: rule__AccessesRootExternalAccess__Group__5 : rule__AccessesRootExternalAccess__Group__5__Impl ;
    public final void rule__AccessesRootExternalAccess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1902:1: ( rule__AccessesRootExternalAccess__Group__5__Impl )
            // InternalAccessesParser.g:1903:2: rule__AccessesRootExternalAccess__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group__5"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group__5__Impl"
    // InternalAccessesParser.g:1909:1: rule__AccessesRootExternalAccess__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__AccessesRootExternalAccess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1913:1: ( ( RightSquareBracket ) )
            // InternalAccessesParser.g:1914:1: ( RightSquareBracket )
            {
            // InternalAccessesParser.g:1914:1: ( RightSquareBracket )
            // InternalAccessesParser.g:1915:2: RightSquareBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group__5__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group_4__0"
    // InternalAccessesParser.g:1925:1: rule__AccessesRootExternalAccess__Group_4__0 : rule__AccessesRootExternalAccess__Group_4__0__Impl rule__AccessesRootExternalAccess__Group_4__1 ;
    public final void rule__AccessesRootExternalAccess__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1929:1: ( rule__AccessesRootExternalAccess__Group_4__0__Impl rule__AccessesRootExternalAccess__Group_4__1 )
            // InternalAccessesParser.g:1930:2: rule__AccessesRootExternalAccess__Group_4__0__Impl rule__AccessesRootExternalAccess__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__AccessesRootExternalAccess__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group_4__0"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group_4__0__Impl"
    // InternalAccessesParser.g:1937:1: rule__AccessesRootExternalAccess__Group_4__0__Impl : ( ( rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0 ) ) ;
    public final void rule__AccessesRootExternalAccess__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1941:1: ( ( ( rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0 ) ) )
            // InternalAccessesParser.g:1942:1: ( ( rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0 ) )
            {
            // InternalAccessesParser.g:1942:1: ( ( rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0 ) )
            // InternalAccessesParser.g:1943:2: ( rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessAssignment_4_0()); 
            // InternalAccessesParser.g:1944:2: ( rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0 )
            // InternalAccessesParser.g:1944:3: rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group_4__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group_4__1"
    // InternalAccessesParser.g:1952:1: rule__AccessesRootExternalAccess__Group_4__1 : rule__AccessesRootExternalAccess__Group_4__1__Impl ;
    public final void rule__AccessesRootExternalAccess__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1956:1: ( rule__AccessesRootExternalAccess__Group_4__1__Impl )
            // InternalAccessesParser.g:1957:2: rule__AccessesRootExternalAccess__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group_4__1"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group_4__1__Impl"
    // InternalAccessesParser.g:1963:1: rule__AccessesRootExternalAccess__Group_4__1__Impl : ( ( rule__AccessesRootExternalAccess__Group_4_1__0 )* ) ;
    public final void rule__AccessesRootExternalAccess__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1967:1: ( ( ( rule__AccessesRootExternalAccess__Group_4_1__0 )* ) )
            // InternalAccessesParser.g:1968:1: ( ( rule__AccessesRootExternalAccess__Group_4_1__0 )* )
            {
            // InternalAccessesParser.g:1968:1: ( ( rule__AccessesRootExternalAccess__Group_4_1__0 )* )
            // InternalAccessesParser.g:1969:2: ( rule__AccessesRootExternalAccess__Group_4_1__0 )*
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getGroup_4_1()); 
            // InternalAccessesParser.g:1970:2: ( rule__AccessesRootExternalAccess__Group_4_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Comma) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAccessesParser.g:1970:3: rule__AccessesRootExternalAccess__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AccessesRootExternalAccess__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAccessesRootExternalAccessAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group_4__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group_4_1__0"
    // InternalAccessesParser.g:1979:1: rule__AccessesRootExternalAccess__Group_4_1__0 : rule__AccessesRootExternalAccess__Group_4_1__0__Impl rule__AccessesRootExternalAccess__Group_4_1__1 ;
    public final void rule__AccessesRootExternalAccess__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1983:1: ( rule__AccessesRootExternalAccess__Group_4_1__0__Impl rule__AccessesRootExternalAccess__Group_4_1__1 )
            // InternalAccessesParser.g:1984:2: rule__AccessesRootExternalAccess__Group_4_1__0__Impl rule__AccessesRootExternalAccess__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__AccessesRootExternalAccess__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group_4_1__0"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group_4_1__0__Impl"
    // InternalAccessesParser.g:1991:1: rule__AccessesRootExternalAccess__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__AccessesRootExternalAccess__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:1995:1: ( ( Comma ) )
            // InternalAccessesParser.g:1996:1: ( Comma )
            {
            // InternalAccessesParser.g:1996:1: ( Comma )
            // InternalAccessesParser.g:1997:2: Comma
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group_4_1__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group_4_1__1"
    // InternalAccessesParser.g:2006:1: rule__AccessesRootExternalAccess__Group_4_1__1 : rule__AccessesRootExternalAccess__Group_4_1__1__Impl ;
    public final void rule__AccessesRootExternalAccess__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2010:1: ( rule__AccessesRootExternalAccess__Group_4_1__1__Impl )
            // InternalAccessesParser.g:2011:2: rule__AccessesRootExternalAccess__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group_4_1__1"


    // $ANTLR start "rule__AccessesRootExternalAccess__Group_4_1__1__Impl"
    // InternalAccessesParser.g:2017:1: rule__AccessesRootExternalAccess__Group_4_1__1__Impl : ( ( rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1 ) ) ;
    public final void rule__AccessesRootExternalAccess__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2021:1: ( ( ( rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1 ) ) )
            // InternalAccessesParser.g:2022:1: ( ( rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1 ) )
            {
            // InternalAccessesParser.g:2022:1: ( ( rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1 ) )
            // InternalAccessesParser.g:2023:2: ( rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1 )
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessAssignment_4_1_1()); 
            // InternalAccessesParser.g:2024:2: ( rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1 )
            // InternalAccessesParser.g:2024:3: rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__Group_4_1__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group__0"
    // InternalAccessesParser.g:2033:1: rule__AccessesRootExternalAccessItems__Group__0 : rule__AccessesRootExternalAccessItems__Group__0__Impl rule__AccessesRootExternalAccessItems__Group__1 ;
    public final void rule__AccessesRootExternalAccessItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2037:1: ( rule__AccessesRootExternalAccessItems__Group__0__Impl rule__AccessesRootExternalAccessItems__Group__1 )
            // InternalAccessesParser.g:2038:2: rule__AccessesRootExternalAccessItems__Group__0__Impl rule__AccessesRootExternalAccessItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AccessesRootExternalAccessItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group__0__Impl"
    // InternalAccessesParser.g:2045:1: rule__AccessesRootExternalAccessItems__Group__0__Impl : ( () ) ;
    public final void rule__AccessesRootExternalAccessItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2049:1: ( ( () ) )
            // InternalAccessesParser.g:2050:1: ( () )
            {
            // InternalAccessesParser.g:2050:1: ( () )
            // InternalAccessesParser.g:2051:2: ()
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAccess().getAccessesRootExternalAccessItemsAction_0()); 
            // InternalAccessesParser.g:2052:2: ()
            // InternalAccessesParser.g:2052:3: 
            {
            }

             after(grammarAccess.getAccessesRootExternalAccessItemsAccess().getAccessesRootExternalAccessItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group__1"
    // InternalAccessesParser.g:2060:1: rule__AccessesRootExternalAccessItems__Group__1 : rule__AccessesRootExternalAccessItems__Group__1__Impl rule__AccessesRootExternalAccessItems__Group__2 ;
    public final void rule__AccessesRootExternalAccessItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2064:1: ( rule__AccessesRootExternalAccessItems__Group__1__Impl rule__AccessesRootExternalAccessItems__Group__2 )
            // InternalAccessesParser.g:2065:2: rule__AccessesRootExternalAccessItems__Group__1__Impl rule__AccessesRootExternalAccessItems__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__AccessesRootExternalAccessItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group__1__Impl"
    // InternalAccessesParser.g:2072:1: rule__AccessesRootExternalAccessItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__AccessesRootExternalAccessItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2076:1: ( ( LeftCurlyBracket ) )
            // InternalAccessesParser.g:2077:1: ( LeftCurlyBracket )
            {
            // InternalAccessesParser.g:2077:1: ( LeftCurlyBracket )
            // InternalAccessesParser.g:2078:2: LeftCurlyBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group__2"
    // InternalAccessesParser.g:2087:1: rule__AccessesRootExternalAccessItems__Group__2 : rule__AccessesRootExternalAccessItems__Group__2__Impl rule__AccessesRootExternalAccessItems__Group__3 ;
    public final void rule__AccessesRootExternalAccessItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2091:1: ( rule__AccessesRootExternalAccessItems__Group__2__Impl rule__AccessesRootExternalAccessItems__Group__3 )
            // InternalAccessesParser.g:2092:2: rule__AccessesRootExternalAccessItems__Group__2__Impl rule__AccessesRootExternalAccessItems__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__AccessesRootExternalAccessItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group__2__Impl"
    // InternalAccessesParser.g:2099:1: rule__AccessesRootExternalAccessItems__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItems__Group_2__0 )? ) ;
    public final void rule__AccessesRootExternalAccessItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2103:1: ( ( ( rule__AccessesRootExternalAccessItems__Group_2__0 )? ) )
            // InternalAccessesParser.g:2104:1: ( ( rule__AccessesRootExternalAccessItems__Group_2__0 )? )
            {
            // InternalAccessesParser.g:2104:1: ( ( rule__AccessesRootExternalAccessItems__Group_2__0 )? )
            // InternalAccessesParser.g:2105:2: ( rule__AccessesRootExternalAccessItems__Group_2__0 )?
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAccess().getGroup_2()); 
            // InternalAccessesParser.g:2106:2: ( rule__AccessesRootExternalAccessItems__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Ontological||LA14_0==Classname||(LA14_0>=Trigger && LA14_0<=Method)||(LA14_0>=Output && LA14_0<=Input)||(LA14_0>=Auth && LA14_0<=Path)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAccessesParser.g:2106:3: rule__AccessesRootExternalAccessItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AccessesRootExternalAccessItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccessesRootExternalAccessItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group__3"
    // InternalAccessesParser.g:2114:1: rule__AccessesRootExternalAccessItems__Group__3 : rule__AccessesRootExternalAccessItems__Group__3__Impl ;
    public final void rule__AccessesRootExternalAccessItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2118:1: ( rule__AccessesRootExternalAccessItems__Group__3__Impl )
            // InternalAccessesParser.g:2119:2: rule__AccessesRootExternalAccessItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group__3"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group__3__Impl"
    // InternalAccessesParser.g:2125:1: rule__AccessesRootExternalAccessItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__AccessesRootExternalAccessItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2129:1: ( ( RightCurlyBracket ) )
            // InternalAccessesParser.g:2130:1: ( RightCurlyBracket )
            {
            // InternalAccessesParser.g:2130:1: ( RightCurlyBracket )
            // InternalAccessesParser.g:2131:2: RightCurlyBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group__3__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group_2__0"
    // InternalAccessesParser.g:2141:1: rule__AccessesRootExternalAccessItems__Group_2__0 : rule__AccessesRootExternalAccessItems__Group_2__0__Impl rule__AccessesRootExternalAccessItems__Group_2__1 ;
    public final void rule__AccessesRootExternalAccessItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2145:1: ( rule__AccessesRootExternalAccessItems__Group_2__0__Impl rule__AccessesRootExternalAccessItems__Group_2__1 )
            // InternalAccessesParser.g:2146:2: rule__AccessesRootExternalAccessItems__Group_2__0__Impl rule__AccessesRootExternalAccessItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__AccessesRootExternalAccessItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItems__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group_2__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group_2__0__Impl"
    // InternalAccessesParser.g:2153:1: rule__AccessesRootExternalAccessItems__Group_2__0__Impl : ( ( rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__AccessesRootExternalAccessItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2157:1: ( ( ( rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0 ) ) )
            // InternalAccessesParser.g:2158:1: ( ( rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0 ) )
            {
            // InternalAccessesParser.g:2158:1: ( ( rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0 ) )
            // InternalAccessesParser.g:2159:2: ( rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAccess().getItemsAssignment_2_0()); 
            // InternalAccessesParser.g:2160:2: ( rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0 )
            // InternalAccessesParser.g:2160:3: rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group_2__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group_2__1"
    // InternalAccessesParser.g:2168:1: rule__AccessesRootExternalAccessItems__Group_2__1 : rule__AccessesRootExternalAccessItems__Group_2__1__Impl ;
    public final void rule__AccessesRootExternalAccessItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2172:1: ( rule__AccessesRootExternalAccessItems__Group_2__1__Impl )
            // InternalAccessesParser.g:2173:2: rule__AccessesRootExternalAccessItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItems__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group_2__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group_2__1__Impl"
    // InternalAccessesParser.g:2179:1: rule__AccessesRootExternalAccessItems__Group_2__1__Impl : ( ( rule__AccessesRootExternalAccessItems__Group_2_1__0 )* ) ;
    public final void rule__AccessesRootExternalAccessItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2183:1: ( ( ( rule__AccessesRootExternalAccessItems__Group_2_1__0 )* ) )
            // InternalAccessesParser.g:2184:1: ( ( rule__AccessesRootExternalAccessItems__Group_2_1__0 )* )
            {
            // InternalAccessesParser.g:2184:1: ( ( rule__AccessesRootExternalAccessItems__Group_2_1__0 )* )
            // InternalAccessesParser.g:2185:2: ( rule__AccessesRootExternalAccessItems__Group_2_1__0 )*
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAccess().getGroup_2_1()); 
            // InternalAccessesParser.g:2186:2: ( rule__AccessesRootExternalAccessItems__Group_2_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAccessesParser.g:2186:3: rule__AccessesRootExternalAccessItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AccessesRootExternalAccessItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAccessesRootExternalAccessItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group_2__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group_2_1__0"
    // InternalAccessesParser.g:2195:1: rule__AccessesRootExternalAccessItems__Group_2_1__0 : rule__AccessesRootExternalAccessItems__Group_2_1__0__Impl rule__AccessesRootExternalAccessItems__Group_2_1__1 ;
    public final void rule__AccessesRootExternalAccessItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2199:1: ( rule__AccessesRootExternalAccessItems__Group_2_1__0__Impl rule__AccessesRootExternalAccessItems__Group_2_1__1 )
            // InternalAccessesParser.g:2200:2: rule__AccessesRootExternalAccessItems__Group_2_1__0__Impl rule__AccessesRootExternalAccessItems__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__AccessesRootExternalAccessItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItems__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group_2_1__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group_2_1__0__Impl"
    // InternalAccessesParser.g:2207:1: rule__AccessesRootExternalAccessItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__AccessesRootExternalAccessItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2211:1: ( ( Comma ) )
            // InternalAccessesParser.g:2212:1: ( Comma )
            {
            // InternalAccessesParser.g:2212:1: ( Comma )
            // InternalAccessesParser.g:2213:2: Comma
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group_2_1__1"
    // InternalAccessesParser.g:2222:1: rule__AccessesRootExternalAccessItems__Group_2_1__1 : rule__AccessesRootExternalAccessItems__Group_2_1__1__Impl ;
    public final void rule__AccessesRootExternalAccessItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2226:1: ( rule__AccessesRootExternalAccessItems__Group_2_1__1__Impl )
            // InternalAccessesParser.g:2227:2: rule__AccessesRootExternalAccessItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItems__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group_2_1__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__Group_2_1__1__Impl"
    // InternalAccessesParser.g:2233:1: rule__AccessesRootExternalAccessItems__Group_2_1__1__Impl : ( ( rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__AccessesRootExternalAccessItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2237:1: ( ( ( rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1 ) ) )
            // InternalAccessesParser.g:2238:1: ( ( rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalAccessesParser.g:2238:1: ( ( rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1 ) )
            // InternalAccessesParser.g:2239:2: ( rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalAccessesParser.g:2240:2: ( rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1 )
            // InternalAccessesParser.g:2240:3: rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsName__Group__0"
    // InternalAccessesParser.g:2249:1: rule__AccessesRootExternalAccessItemsName__Group__0 : rule__AccessesRootExternalAccessItemsName__Group__0__Impl rule__AccessesRootExternalAccessItemsName__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2253:1: ( rule__AccessesRootExternalAccessItemsName__Group__0__Impl rule__AccessesRootExternalAccessItemsName__Group__1 )
            // InternalAccessesParser.g:2254:2: rule__AccessesRootExternalAccessItemsName__Group__0__Impl rule__AccessesRootExternalAccessItemsName__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AccessesRootExternalAccessItemsName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsName__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsName__Group__0__Impl"
    // InternalAccessesParser.g:2261:1: rule__AccessesRootExternalAccessItemsName__Group__0__Impl : ( () ) ;
    public final void rule__AccessesRootExternalAccessItemsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2265:1: ( ( () ) )
            // InternalAccessesParser.g:2266:1: ( () )
            {
            // InternalAccessesParser.g:2266:1: ( () )
            // InternalAccessesParser.g:2267:2: ()
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getAccessesRootExternalAccessItemsNameAction_0()); 
            // InternalAccessesParser.g:2268:2: ()
            // InternalAccessesParser.g:2268:3: 
            {
            }

             after(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getAccessesRootExternalAccessItemsNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsName__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsName__Group__1"
    // InternalAccessesParser.g:2276:1: rule__AccessesRootExternalAccessItemsName__Group__1 : rule__AccessesRootExternalAccessItemsName__Group__1__Impl rule__AccessesRootExternalAccessItemsName__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2280:1: ( rule__AccessesRootExternalAccessItemsName__Group__1__Impl rule__AccessesRootExternalAccessItemsName__Group__2 )
            // InternalAccessesParser.g:2281:2: rule__AccessesRootExternalAccessItemsName__Group__1__Impl rule__AccessesRootExternalAccessItemsName__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsName__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsName__Group__1__Impl"
    // InternalAccessesParser.g:2288:1: rule__AccessesRootExternalAccessItemsName__Group__1__Impl : ( Name ) ;
    public final void rule__AccessesRootExternalAccessItemsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2292:1: ( ( Name ) )
            // InternalAccessesParser.g:2293:1: ( Name )
            {
            // InternalAccessesParser.g:2293:1: ( Name )
            // InternalAccessesParser.g:2294:2: Name
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsName__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsName__Group__2"
    // InternalAccessesParser.g:2303:1: rule__AccessesRootExternalAccessItemsName__Group__2 : rule__AccessesRootExternalAccessItemsName__Group__2__Impl rule__AccessesRootExternalAccessItemsName__Group__3 ;
    public final void rule__AccessesRootExternalAccessItemsName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2307:1: ( rule__AccessesRootExternalAccessItemsName__Group__2__Impl rule__AccessesRootExternalAccessItemsName__Group__3 )
            // InternalAccessesParser.g:2308:2: rule__AccessesRootExternalAccessItemsName__Group__2__Impl rule__AccessesRootExternalAccessItemsName__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsName__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsName__Group__2__Impl"
    // InternalAccessesParser.g:2315:1: rule__AccessesRootExternalAccessItemsName__Group__2__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2319:1: ( ( Colon ) )
            // InternalAccessesParser.g:2320:1: ( Colon )
            {
            // InternalAccessesParser.g:2320:1: ( Colon )
            // InternalAccessesParser.g:2321:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsName__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsName__Group__3"
    // InternalAccessesParser.g:2330:1: rule__AccessesRootExternalAccessItemsName__Group__3 : rule__AccessesRootExternalAccessItemsName__Group__3__Impl ;
    public final void rule__AccessesRootExternalAccessItemsName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2334:1: ( rule__AccessesRootExternalAccessItemsName__Group__3__Impl )
            // InternalAccessesParser.g:2335:2: rule__AccessesRootExternalAccessItemsName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsName__Group__3"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsName__Group__3__Impl"
    // InternalAccessesParser.g:2341:1: rule__AccessesRootExternalAccessItemsName__Group__3__Impl : ( ( rule__AccessesRootExternalAccessItemsName__NameAssignment_3 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2345:1: ( ( ( rule__AccessesRootExternalAccessItemsName__NameAssignment_3 ) ) )
            // InternalAccessesParser.g:2346:1: ( ( rule__AccessesRootExternalAccessItemsName__NameAssignment_3 ) )
            {
            // InternalAccessesParser.g:2346:1: ( ( rule__AccessesRootExternalAccessItemsName__NameAssignment_3 ) )
            // InternalAccessesParser.g:2347:2: ( rule__AccessesRootExternalAccessItemsName__NameAssignment_3 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getNameAssignment_3()); 
            // InternalAccessesParser.g:2348:2: ( rule__AccessesRootExternalAccessItemsName__NameAssignment_3 )
            // InternalAccessesParser.g:2348:3: rule__AccessesRootExternalAccessItemsName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsName__Group__3__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsPath__Group__0"
    // InternalAccessesParser.g:2357:1: rule__AccessesRootExternalAccessItemsPath__Group__0 : rule__AccessesRootExternalAccessItemsPath__Group__0__Impl rule__AccessesRootExternalAccessItemsPath__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2361:1: ( rule__AccessesRootExternalAccessItemsPath__Group__0__Impl rule__AccessesRootExternalAccessItemsPath__Group__1 )
            // InternalAccessesParser.g:2362:2: rule__AccessesRootExternalAccessItemsPath__Group__0__Impl rule__AccessesRootExternalAccessItemsPath__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsPath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsPath__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsPath__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsPath__Group__0__Impl"
    // InternalAccessesParser.g:2369:1: rule__AccessesRootExternalAccessItemsPath__Group__0__Impl : ( Path ) ;
    public final void rule__AccessesRootExternalAccessItemsPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2373:1: ( ( Path ) )
            // InternalAccessesParser.g:2374:1: ( Path )
            {
            // InternalAccessesParser.g:2374:1: ( Path )
            // InternalAccessesParser.g:2375:2: Path
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getPathKeyword_0()); 
            match(input,Path,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getPathKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsPath__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsPath__Group__1"
    // InternalAccessesParser.g:2384:1: rule__AccessesRootExternalAccessItemsPath__Group__1 : rule__AccessesRootExternalAccessItemsPath__Group__1__Impl rule__AccessesRootExternalAccessItemsPath__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2388:1: ( rule__AccessesRootExternalAccessItemsPath__Group__1__Impl rule__AccessesRootExternalAccessItemsPath__Group__2 )
            // InternalAccessesParser.g:2389:2: rule__AccessesRootExternalAccessItemsPath__Group__1__Impl rule__AccessesRootExternalAccessItemsPath__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsPath__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsPath__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsPath__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsPath__Group__1__Impl"
    // InternalAccessesParser.g:2396:1: rule__AccessesRootExternalAccessItemsPath__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2400:1: ( ( Colon ) )
            // InternalAccessesParser.g:2401:1: ( Colon )
            {
            // InternalAccessesParser.g:2401:1: ( Colon )
            // InternalAccessesParser.g:2402:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsPath__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsPath__Group__2"
    // InternalAccessesParser.g:2411:1: rule__AccessesRootExternalAccessItemsPath__Group__2 : rule__AccessesRootExternalAccessItemsPath__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsPath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2415:1: ( rule__AccessesRootExternalAccessItemsPath__Group__2__Impl )
            // InternalAccessesParser.g:2416:2: rule__AccessesRootExternalAccessItemsPath__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsPath__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsPath__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsPath__Group__2__Impl"
    // InternalAccessesParser.g:2422:1: rule__AccessesRootExternalAccessItemsPath__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsPath__PathAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsPath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2426:1: ( ( ( rule__AccessesRootExternalAccessItemsPath__PathAssignment_2 ) ) )
            // InternalAccessesParser.g:2427:1: ( ( rule__AccessesRootExternalAccessItemsPath__PathAssignment_2 ) )
            {
            // InternalAccessesParser.g:2427:1: ( ( rule__AccessesRootExternalAccessItemsPath__PathAssignment_2 ) )
            // InternalAccessesParser.g:2428:2: ( rule__AccessesRootExternalAccessItemsPath__PathAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getPathAssignment_2()); 
            // InternalAccessesParser.g:2429:2: ( rule__AccessesRootExternalAccessItemsPath__PathAssignment_2 )
            // InternalAccessesParser.g:2429:3: rule__AccessesRootExternalAccessItemsPath__PathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsPath__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsPath__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOntological__Group__0"
    // InternalAccessesParser.g:2438:1: rule__AccessesRootExternalAccessItemsOntological__Group__0 : rule__AccessesRootExternalAccessItemsOntological__Group__0__Impl rule__AccessesRootExternalAccessItemsOntological__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsOntological__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2442:1: ( rule__AccessesRootExternalAccessItemsOntological__Group__0__Impl rule__AccessesRootExternalAccessItemsOntological__Group__1 )
            // InternalAccessesParser.g:2443:2: rule__AccessesRootExternalAccessItemsOntological__Group__0__Impl rule__AccessesRootExternalAccessItemsOntological__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsOntological__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOntological__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOntological__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOntological__Group__0__Impl"
    // InternalAccessesParser.g:2450:1: rule__AccessesRootExternalAccessItemsOntological__Group__0__Impl : ( Ontological ) ;
    public final void rule__AccessesRootExternalAccessItemsOntological__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2454:1: ( ( Ontological ) )
            // InternalAccessesParser.g:2455:1: ( Ontological )
            {
            // InternalAccessesParser.g:2455:1: ( Ontological )
            // InternalAccessesParser.g:2456:2: Ontological
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getOntologicalKeyword_0()); 
            match(input,Ontological,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getOntologicalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOntological__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOntological__Group__1"
    // InternalAccessesParser.g:2465:1: rule__AccessesRootExternalAccessItemsOntological__Group__1 : rule__AccessesRootExternalAccessItemsOntological__Group__1__Impl rule__AccessesRootExternalAccessItemsOntological__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsOntological__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2469:1: ( rule__AccessesRootExternalAccessItemsOntological__Group__1__Impl rule__AccessesRootExternalAccessItemsOntological__Group__2 )
            // InternalAccessesParser.g:2470:2: rule__AccessesRootExternalAccessItemsOntological__Group__1__Impl rule__AccessesRootExternalAccessItemsOntological__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsOntological__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOntological__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOntological__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOntological__Group__1__Impl"
    // InternalAccessesParser.g:2477:1: rule__AccessesRootExternalAccessItemsOntological__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsOntological__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2481:1: ( ( Colon ) )
            // InternalAccessesParser.g:2482:1: ( Colon )
            {
            // InternalAccessesParser.g:2482:1: ( Colon )
            // InternalAccessesParser.g:2483:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOntological__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOntological__Group__2"
    // InternalAccessesParser.g:2492:1: rule__AccessesRootExternalAccessItemsOntological__Group__2 : rule__AccessesRootExternalAccessItemsOntological__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsOntological__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2496:1: ( rule__AccessesRootExternalAccessItemsOntological__Group__2__Impl )
            // InternalAccessesParser.g:2497:2: rule__AccessesRootExternalAccessItemsOntological__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOntological__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOntological__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOntological__Group__2__Impl"
    // InternalAccessesParser.g:2503:1: rule__AccessesRootExternalAccessItemsOntological__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsOntological__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2507:1: ( ( ( rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2 ) ) )
            // InternalAccessesParser.g:2508:1: ( ( rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2 ) )
            {
            // InternalAccessesParser.g:2508:1: ( ( rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2 ) )
            // InternalAccessesParser.g:2509:2: ( rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getOntologicalAssignment_2()); 
            // InternalAccessesParser.g:2510:2: ( rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2 )
            // InternalAccessesParser.g:2510:3: rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getOntologicalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOntological__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsClassname__Group__0"
    // InternalAccessesParser.g:2519:1: rule__AccessesRootExternalAccessItemsClassname__Group__0 : rule__AccessesRootExternalAccessItemsClassname__Group__0__Impl rule__AccessesRootExternalAccessItemsClassname__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsClassname__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2523:1: ( rule__AccessesRootExternalAccessItemsClassname__Group__0__Impl rule__AccessesRootExternalAccessItemsClassname__Group__1 )
            // InternalAccessesParser.g:2524:2: rule__AccessesRootExternalAccessItemsClassname__Group__0__Impl rule__AccessesRootExternalAccessItemsClassname__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsClassname__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsClassname__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsClassname__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsClassname__Group__0__Impl"
    // InternalAccessesParser.g:2531:1: rule__AccessesRootExternalAccessItemsClassname__Group__0__Impl : ( Classname ) ;
    public final void rule__AccessesRootExternalAccessItemsClassname__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2535:1: ( ( Classname ) )
            // InternalAccessesParser.g:2536:1: ( Classname )
            {
            // InternalAccessesParser.g:2536:1: ( Classname )
            // InternalAccessesParser.g:2537:2: Classname
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getClassnameKeyword_0()); 
            match(input,Classname,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getClassnameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsClassname__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsClassname__Group__1"
    // InternalAccessesParser.g:2546:1: rule__AccessesRootExternalAccessItemsClassname__Group__1 : rule__AccessesRootExternalAccessItemsClassname__Group__1__Impl rule__AccessesRootExternalAccessItemsClassname__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsClassname__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2550:1: ( rule__AccessesRootExternalAccessItemsClassname__Group__1__Impl rule__AccessesRootExternalAccessItemsClassname__Group__2 )
            // InternalAccessesParser.g:2551:2: rule__AccessesRootExternalAccessItemsClassname__Group__1__Impl rule__AccessesRootExternalAccessItemsClassname__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsClassname__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsClassname__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsClassname__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsClassname__Group__1__Impl"
    // InternalAccessesParser.g:2558:1: rule__AccessesRootExternalAccessItemsClassname__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsClassname__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2562:1: ( ( Colon ) )
            // InternalAccessesParser.g:2563:1: ( Colon )
            {
            // InternalAccessesParser.g:2563:1: ( Colon )
            // InternalAccessesParser.g:2564:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsClassname__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsClassname__Group__2"
    // InternalAccessesParser.g:2573:1: rule__AccessesRootExternalAccessItemsClassname__Group__2 : rule__AccessesRootExternalAccessItemsClassname__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsClassname__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2577:1: ( rule__AccessesRootExternalAccessItemsClassname__Group__2__Impl )
            // InternalAccessesParser.g:2578:2: rule__AccessesRootExternalAccessItemsClassname__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsClassname__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsClassname__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsClassname__Group__2__Impl"
    // InternalAccessesParser.g:2584:1: rule__AccessesRootExternalAccessItemsClassname__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsClassname__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2588:1: ( ( ( rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2 ) ) )
            // InternalAccessesParser.g:2589:1: ( ( rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2 ) )
            {
            // InternalAccessesParser.g:2589:1: ( ( rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2 ) )
            // InternalAccessesParser.g:2590:2: ( rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getClassnameAssignment_2()); 
            // InternalAccessesParser.g:2591:2: ( rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2 )
            // InternalAccessesParser.g:2591:3: rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getClassnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsClassname__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsMethod__Group__0"
    // InternalAccessesParser.g:2600:1: rule__AccessesRootExternalAccessItemsMethod__Group__0 : rule__AccessesRootExternalAccessItemsMethod__Group__0__Impl rule__AccessesRootExternalAccessItemsMethod__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2604:1: ( rule__AccessesRootExternalAccessItemsMethod__Group__0__Impl rule__AccessesRootExternalAccessItemsMethod__Group__1 )
            // InternalAccessesParser.g:2605:2: rule__AccessesRootExternalAccessItemsMethod__Group__0__Impl rule__AccessesRootExternalAccessItemsMethod__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsMethod__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsMethod__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsMethod__Group__0__Impl"
    // InternalAccessesParser.g:2612:1: rule__AccessesRootExternalAccessItemsMethod__Group__0__Impl : ( Method ) ;
    public final void rule__AccessesRootExternalAccessItemsMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2616:1: ( ( Method ) )
            // InternalAccessesParser.g:2617:1: ( Method )
            {
            // InternalAccessesParser.g:2617:1: ( Method )
            // InternalAccessesParser.g:2618:2: Method
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getMethodKeyword_0()); 
            match(input,Method,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getMethodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsMethod__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsMethod__Group__1"
    // InternalAccessesParser.g:2627:1: rule__AccessesRootExternalAccessItemsMethod__Group__1 : rule__AccessesRootExternalAccessItemsMethod__Group__1__Impl rule__AccessesRootExternalAccessItemsMethod__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2631:1: ( rule__AccessesRootExternalAccessItemsMethod__Group__1__Impl rule__AccessesRootExternalAccessItemsMethod__Group__2 )
            // InternalAccessesParser.g:2632:2: rule__AccessesRootExternalAccessItemsMethod__Group__1__Impl rule__AccessesRootExternalAccessItemsMethod__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsMethod__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsMethod__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsMethod__Group__1__Impl"
    // InternalAccessesParser.g:2639:1: rule__AccessesRootExternalAccessItemsMethod__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2643:1: ( ( Colon ) )
            // InternalAccessesParser.g:2644:1: ( Colon )
            {
            // InternalAccessesParser.g:2644:1: ( Colon )
            // InternalAccessesParser.g:2645:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsMethod__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsMethod__Group__2"
    // InternalAccessesParser.g:2654:1: rule__AccessesRootExternalAccessItemsMethod__Group__2 : rule__AccessesRootExternalAccessItemsMethod__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2658:1: ( rule__AccessesRootExternalAccessItemsMethod__Group__2__Impl )
            // InternalAccessesParser.g:2659:2: rule__AccessesRootExternalAccessItemsMethod__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsMethod__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsMethod__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsMethod__Group__2__Impl"
    // InternalAccessesParser.g:2665:1: rule__AccessesRootExternalAccessItemsMethod__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2669:1: ( ( ( rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2 ) ) )
            // InternalAccessesParser.g:2670:1: ( ( rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2 ) )
            {
            // InternalAccessesParser.g:2670:1: ( ( rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2 ) )
            // InternalAccessesParser.g:2671:2: ( rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getMethodAssignment_2()); 
            // InternalAccessesParser.g:2672:2: ( rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2 )
            // InternalAccessesParser.g:2672:3: rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getMethodAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsMethod__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsAuth__Group__0"
    // InternalAccessesParser.g:2681:1: rule__AccessesRootExternalAccessItemsAuth__Group__0 : rule__AccessesRootExternalAccessItemsAuth__Group__0__Impl rule__AccessesRootExternalAccessItemsAuth__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsAuth__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2685:1: ( rule__AccessesRootExternalAccessItemsAuth__Group__0__Impl rule__AccessesRootExternalAccessItemsAuth__Group__1 )
            // InternalAccessesParser.g:2686:2: rule__AccessesRootExternalAccessItemsAuth__Group__0__Impl rule__AccessesRootExternalAccessItemsAuth__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsAuth__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsAuth__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsAuth__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsAuth__Group__0__Impl"
    // InternalAccessesParser.g:2693:1: rule__AccessesRootExternalAccessItemsAuth__Group__0__Impl : ( Auth ) ;
    public final void rule__AccessesRootExternalAccessItemsAuth__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2697:1: ( ( Auth ) )
            // InternalAccessesParser.g:2698:1: ( Auth )
            {
            // InternalAccessesParser.g:2698:1: ( Auth )
            // InternalAccessesParser.g:2699:2: Auth
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getAuthKeyword_0()); 
            match(input,Auth,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getAuthKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsAuth__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsAuth__Group__1"
    // InternalAccessesParser.g:2708:1: rule__AccessesRootExternalAccessItemsAuth__Group__1 : rule__AccessesRootExternalAccessItemsAuth__Group__1__Impl rule__AccessesRootExternalAccessItemsAuth__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsAuth__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2712:1: ( rule__AccessesRootExternalAccessItemsAuth__Group__1__Impl rule__AccessesRootExternalAccessItemsAuth__Group__2 )
            // InternalAccessesParser.g:2713:2: rule__AccessesRootExternalAccessItemsAuth__Group__1__Impl rule__AccessesRootExternalAccessItemsAuth__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsAuth__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsAuth__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsAuth__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsAuth__Group__1__Impl"
    // InternalAccessesParser.g:2720:1: rule__AccessesRootExternalAccessItemsAuth__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsAuth__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2724:1: ( ( Colon ) )
            // InternalAccessesParser.g:2725:1: ( Colon )
            {
            // InternalAccessesParser.g:2725:1: ( Colon )
            // InternalAccessesParser.g:2726:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsAuth__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsAuth__Group__2"
    // InternalAccessesParser.g:2735:1: rule__AccessesRootExternalAccessItemsAuth__Group__2 : rule__AccessesRootExternalAccessItemsAuth__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsAuth__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2739:1: ( rule__AccessesRootExternalAccessItemsAuth__Group__2__Impl )
            // InternalAccessesParser.g:2740:2: rule__AccessesRootExternalAccessItemsAuth__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsAuth__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsAuth__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsAuth__Group__2__Impl"
    // InternalAccessesParser.g:2746:1: rule__AccessesRootExternalAccessItemsAuth__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsAuth__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2750:1: ( ( ( rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2 ) ) )
            // InternalAccessesParser.g:2751:1: ( ( rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2 ) )
            {
            // InternalAccessesParser.g:2751:1: ( ( rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2 ) )
            // InternalAccessesParser.g:2752:2: ( rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getAuthAssignment_2()); 
            // InternalAccessesParser.g:2753:2: ( rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2 )
            // InternalAccessesParser.g:2753:3: rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getAuthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsAuth__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group__0"
    // InternalAccessesParser.g:2762:1: rule__AccessesRootExternalAccessItemsInput__Group__0 : rule__AccessesRootExternalAccessItemsInput__Group__0__Impl rule__AccessesRootExternalAccessItemsInput__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2766:1: ( rule__AccessesRootExternalAccessItemsInput__Group__0__Impl rule__AccessesRootExternalAccessItemsInput__Group__1 )
            // InternalAccessesParser.g:2767:2: rule__AccessesRootExternalAccessItemsInput__Group__0__Impl rule__AccessesRootExternalAccessItemsInput__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__AccessesRootExternalAccessItemsInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group__0__Impl"
    // InternalAccessesParser.g:2774:1: rule__AccessesRootExternalAccessItemsInput__Group__0__Impl : ( () ) ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2778:1: ( ( () ) )
            // InternalAccessesParser.g:2779:1: ( () )
            {
            // InternalAccessesParser.g:2779:1: ( () )
            // InternalAccessesParser.g:2780:2: ()
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getAccessesRootExternalAccessItemsInputAction_0()); 
            // InternalAccessesParser.g:2781:2: ()
            // InternalAccessesParser.g:2781:3: 
            {
            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getAccessesRootExternalAccessItemsInputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group__1"
    // InternalAccessesParser.g:2789:1: rule__AccessesRootExternalAccessItemsInput__Group__1 : rule__AccessesRootExternalAccessItemsInput__Group__1__Impl rule__AccessesRootExternalAccessItemsInput__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2793:1: ( rule__AccessesRootExternalAccessItemsInput__Group__1__Impl rule__AccessesRootExternalAccessItemsInput__Group__2 )
            // InternalAccessesParser.g:2794:2: rule__AccessesRootExternalAccessItemsInput__Group__1__Impl rule__AccessesRootExternalAccessItemsInput__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group__1__Impl"
    // InternalAccessesParser.g:2801:1: rule__AccessesRootExternalAccessItemsInput__Group__1__Impl : ( Input ) ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2805:1: ( ( Input ) )
            // InternalAccessesParser.g:2806:1: ( Input )
            {
            // InternalAccessesParser.g:2806:1: ( Input )
            // InternalAccessesParser.g:2807:2: Input
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputKeyword_1()); 
            match(input,Input,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group__2"
    // InternalAccessesParser.g:2816:1: rule__AccessesRootExternalAccessItemsInput__Group__2 : rule__AccessesRootExternalAccessItemsInput__Group__2__Impl rule__AccessesRootExternalAccessItemsInput__Group__3 ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2820:1: ( rule__AccessesRootExternalAccessItemsInput__Group__2__Impl rule__AccessesRootExternalAccessItemsInput__Group__3 )
            // InternalAccessesParser.g:2821:2: rule__AccessesRootExternalAccessItemsInput__Group__2__Impl rule__AccessesRootExternalAccessItemsInput__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__AccessesRootExternalAccessItemsInput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group__2__Impl"
    // InternalAccessesParser.g:2828:1: rule__AccessesRootExternalAccessItemsInput__Group__2__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2832:1: ( ( Colon ) )
            // InternalAccessesParser.g:2833:1: ( Colon )
            {
            // InternalAccessesParser.g:2833:1: ( Colon )
            // InternalAccessesParser.g:2834:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group__3"
    // InternalAccessesParser.g:2843:1: rule__AccessesRootExternalAccessItemsInput__Group__3 : rule__AccessesRootExternalAccessItemsInput__Group__3__Impl rule__AccessesRootExternalAccessItemsInput__Group__4 ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2847:1: ( rule__AccessesRootExternalAccessItemsInput__Group__3__Impl rule__AccessesRootExternalAccessItemsInput__Group__4 )
            // InternalAccessesParser.g:2848:2: rule__AccessesRootExternalAccessItemsInput__Group__3__Impl rule__AccessesRootExternalAccessItemsInput__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__AccessesRootExternalAccessItemsInput__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group__3"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group__3__Impl"
    // InternalAccessesParser.g:2855:1: rule__AccessesRootExternalAccessItemsInput__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2859:1: ( ( LeftSquareBracket ) )
            // InternalAccessesParser.g:2860:1: ( LeftSquareBracket )
            {
            // InternalAccessesParser.g:2860:1: ( LeftSquareBracket )
            // InternalAccessesParser.g:2861:2: LeftSquareBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group__3__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group__4"
    // InternalAccessesParser.g:2870:1: rule__AccessesRootExternalAccessItemsInput__Group__4 : rule__AccessesRootExternalAccessItemsInput__Group__4__Impl rule__AccessesRootExternalAccessItemsInput__Group__5 ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2874:1: ( rule__AccessesRootExternalAccessItemsInput__Group__4__Impl rule__AccessesRootExternalAccessItemsInput__Group__5 )
            // InternalAccessesParser.g:2875:2: rule__AccessesRootExternalAccessItemsInput__Group__4__Impl rule__AccessesRootExternalAccessItemsInput__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__AccessesRootExternalAccessItemsInput__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group__4"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group__4__Impl"
    // InternalAccessesParser.g:2882:1: rule__AccessesRootExternalAccessItemsInput__Group__4__Impl : ( ( rule__AccessesRootExternalAccessItemsInput__Group_4__0 )? ) ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2886:1: ( ( ( rule__AccessesRootExternalAccessItemsInput__Group_4__0 )? ) )
            // InternalAccessesParser.g:2887:1: ( ( rule__AccessesRootExternalAccessItemsInput__Group_4__0 )? )
            {
            // InternalAccessesParser.g:2887:1: ( ( rule__AccessesRootExternalAccessItemsInput__Group_4__0 )? )
            // InternalAccessesParser.g:2888:2: ( rule__AccessesRootExternalAccessItemsInput__Group_4__0 )?
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getGroup_4()); 
            // InternalAccessesParser.g:2889:2: ( rule__AccessesRootExternalAccessItemsInput__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LeftCurlyBracket) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAccessesParser.g:2889:3: rule__AccessesRootExternalAccessItemsInput__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AccessesRootExternalAccessItemsInput__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group__4__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group__5"
    // InternalAccessesParser.g:2897:1: rule__AccessesRootExternalAccessItemsInput__Group__5 : rule__AccessesRootExternalAccessItemsInput__Group__5__Impl ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2901:1: ( rule__AccessesRootExternalAccessItemsInput__Group__5__Impl )
            // InternalAccessesParser.g:2902:2: rule__AccessesRootExternalAccessItemsInput__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group__5"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group__5__Impl"
    // InternalAccessesParser.g:2908:1: rule__AccessesRootExternalAccessItemsInput__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2912:1: ( ( RightSquareBracket ) )
            // InternalAccessesParser.g:2913:1: ( RightSquareBracket )
            {
            // InternalAccessesParser.g:2913:1: ( RightSquareBracket )
            // InternalAccessesParser.g:2914:2: RightSquareBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group__5__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group_4__0"
    // InternalAccessesParser.g:2924:1: rule__AccessesRootExternalAccessItemsInput__Group_4__0 : rule__AccessesRootExternalAccessItemsInput__Group_4__0__Impl rule__AccessesRootExternalAccessItemsInput__Group_4__1 ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2928:1: ( rule__AccessesRootExternalAccessItemsInput__Group_4__0__Impl rule__AccessesRootExternalAccessItemsInput__Group_4__1 )
            // InternalAccessesParser.g:2929:2: rule__AccessesRootExternalAccessItemsInput__Group_4__0__Impl rule__AccessesRootExternalAccessItemsInput__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__AccessesRootExternalAccessItemsInput__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group_4__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group_4__0__Impl"
    // InternalAccessesParser.g:2936:1: rule__AccessesRootExternalAccessItemsInput__Group_4__0__Impl : ( ( rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2940:1: ( ( ( rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0 ) ) )
            // InternalAccessesParser.g:2941:1: ( ( rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0 ) )
            {
            // InternalAccessesParser.g:2941:1: ( ( rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0 ) )
            // InternalAccessesParser.g:2942:2: ( rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputAssignment_4_0()); 
            // InternalAccessesParser.g:2943:2: ( rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0 )
            // InternalAccessesParser.g:2943:3: rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group_4__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group_4__1"
    // InternalAccessesParser.g:2951:1: rule__AccessesRootExternalAccessItemsInput__Group_4__1 : rule__AccessesRootExternalAccessItemsInput__Group_4__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2955:1: ( rule__AccessesRootExternalAccessItemsInput__Group_4__1__Impl )
            // InternalAccessesParser.g:2956:2: rule__AccessesRootExternalAccessItemsInput__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group_4__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group_4__1__Impl"
    // InternalAccessesParser.g:2962:1: rule__AccessesRootExternalAccessItemsInput__Group_4__1__Impl : ( ( rule__AccessesRootExternalAccessItemsInput__Group_4_1__0 )* ) ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2966:1: ( ( ( rule__AccessesRootExternalAccessItemsInput__Group_4_1__0 )* ) )
            // InternalAccessesParser.g:2967:1: ( ( rule__AccessesRootExternalAccessItemsInput__Group_4_1__0 )* )
            {
            // InternalAccessesParser.g:2967:1: ( ( rule__AccessesRootExternalAccessItemsInput__Group_4_1__0 )* )
            // InternalAccessesParser.g:2968:2: ( rule__AccessesRootExternalAccessItemsInput__Group_4_1__0 )*
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getGroup_4_1()); 
            // InternalAccessesParser.g:2969:2: ( rule__AccessesRootExternalAccessItemsInput__Group_4_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAccessesParser.g:2969:3: rule__AccessesRootExternalAccessItemsInput__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AccessesRootExternalAccessItemsInput__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group_4__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group_4_1__0"
    // InternalAccessesParser.g:2978:1: rule__AccessesRootExternalAccessItemsInput__Group_4_1__0 : rule__AccessesRootExternalAccessItemsInput__Group_4_1__0__Impl rule__AccessesRootExternalAccessItemsInput__Group_4_1__1 ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2982:1: ( rule__AccessesRootExternalAccessItemsInput__Group_4_1__0__Impl rule__AccessesRootExternalAccessItemsInput__Group_4_1__1 )
            // InternalAccessesParser.g:2983:2: rule__AccessesRootExternalAccessItemsInput__Group_4_1__0__Impl rule__AccessesRootExternalAccessItemsInput__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__AccessesRootExternalAccessItemsInput__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group_4_1__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group_4_1__0__Impl"
    // InternalAccessesParser.g:2990:1: rule__AccessesRootExternalAccessItemsInput__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:2994:1: ( ( Comma ) )
            // InternalAccessesParser.g:2995:1: ( Comma )
            {
            // InternalAccessesParser.g:2995:1: ( Comma )
            // InternalAccessesParser.g:2996:2: Comma
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group_4_1__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group_4_1__1"
    // InternalAccessesParser.g:3005:1: rule__AccessesRootExternalAccessItemsInput__Group_4_1__1 : rule__AccessesRootExternalAccessItemsInput__Group_4_1__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3009:1: ( rule__AccessesRootExternalAccessItemsInput__Group_4_1__1__Impl )
            // InternalAccessesParser.g:3010:2: rule__AccessesRootExternalAccessItemsInput__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group_4_1__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__Group_4_1__1__Impl"
    // InternalAccessesParser.g:3016:1: rule__AccessesRootExternalAccessItemsInput__Group_4_1__1__Impl : ( ( rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsInput__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3020:1: ( ( ( rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1 ) ) )
            // InternalAccessesParser.g:3021:1: ( ( rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1 ) )
            {
            // InternalAccessesParser.g:3021:1: ( ( rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1 ) )
            // InternalAccessesParser.g:3022:2: ( rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputAssignment_4_1_1()); 
            // InternalAccessesParser.g:3023:2: ( rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1 )
            // InternalAccessesParser.g:3023:3: rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__Group_4_1__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group__0"
    // InternalAccessesParser.g:3032:1: rule__AccessesRootExternalAccessItemsOutput__Group__0 : rule__AccessesRootExternalAccessItemsOutput__Group__0__Impl rule__AccessesRootExternalAccessItemsOutput__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3036:1: ( rule__AccessesRootExternalAccessItemsOutput__Group__0__Impl rule__AccessesRootExternalAccessItemsOutput__Group__1 )
            // InternalAccessesParser.g:3037:2: rule__AccessesRootExternalAccessItemsOutput__Group__0__Impl rule__AccessesRootExternalAccessItemsOutput__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AccessesRootExternalAccessItemsOutput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group__0__Impl"
    // InternalAccessesParser.g:3044:1: rule__AccessesRootExternalAccessItemsOutput__Group__0__Impl : ( () ) ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3048:1: ( ( () ) )
            // InternalAccessesParser.g:3049:1: ( () )
            {
            // InternalAccessesParser.g:3049:1: ( () )
            // InternalAccessesParser.g:3050:2: ()
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getAccessesRootExternalAccessItemsOutputAction_0()); 
            // InternalAccessesParser.g:3051:2: ()
            // InternalAccessesParser.g:3051:3: 
            {
            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getAccessesRootExternalAccessItemsOutputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group__1"
    // InternalAccessesParser.g:3059:1: rule__AccessesRootExternalAccessItemsOutput__Group__1 : rule__AccessesRootExternalAccessItemsOutput__Group__1__Impl rule__AccessesRootExternalAccessItemsOutput__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3063:1: ( rule__AccessesRootExternalAccessItemsOutput__Group__1__Impl rule__AccessesRootExternalAccessItemsOutput__Group__2 )
            // InternalAccessesParser.g:3064:2: rule__AccessesRootExternalAccessItemsOutput__Group__1__Impl rule__AccessesRootExternalAccessItemsOutput__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsOutput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group__1__Impl"
    // InternalAccessesParser.g:3071:1: rule__AccessesRootExternalAccessItemsOutput__Group__1__Impl : ( Output ) ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3075:1: ( ( Output ) )
            // InternalAccessesParser.g:3076:1: ( Output )
            {
            // InternalAccessesParser.g:3076:1: ( Output )
            // InternalAccessesParser.g:3077:2: Output
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputKeyword_1()); 
            match(input,Output,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group__2"
    // InternalAccessesParser.g:3086:1: rule__AccessesRootExternalAccessItemsOutput__Group__2 : rule__AccessesRootExternalAccessItemsOutput__Group__2__Impl rule__AccessesRootExternalAccessItemsOutput__Group__3 ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3090:1: ( rule__AccessesRootExternalAccessItemsOutput__Group__2__Impl rule__AccessesRootExternalAccessItemsOutput__Group__3 )
            // InternalAccessesParser.g:3091:2: rule__AccessesRootExternalAccessItemsOutput__Group__2__Impl rule__AccessesRootExternalAccessItemsOutput__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__AccessesRootExternalAccessItemsOutput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group__2__Impl"
    // InternalAccessesParser.g:3098:1: rule__AccessesRootExternalAccessItemsOutput__Group__2__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3102:1: ( ( Colon ) )
            // InternalAccessesParser.g:3103:1: ( Colon )
            {
            // InternalAccessesParser.g:3103:1: ( Colon )
            // InternalAccessesParser.g:3104:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group__3"
    // InternalAccessesParser.g:3113:1: rule__AccessesRootExternalAccessItemsOutput__Group__3 : rule__AccessesRootExternalAccessItemsOutput__Group__3__Impl rule__AccessesRootExternalAccessItemsOutput__Group__4 ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3117:1: ( rule__AccessesRootExternalAccessItemsOutput__Group__3__Impl rule__AccessesRootExternalAccessItemsOutput__Group__4 )
            // InternalAccessesParser.g:3118:2: rule__AccessesRootExternalAccessItemsOutput__Group__3__Impl rule__AccessesRootExternalAccessItemsOutput__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__AccessesRootExternalAccessItemsOutput__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group__3"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group__3__Impl"
    // InternalAccessesParser.g:3125:1: rule__AccessesRootExternalAccessItemsOutput__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3129:1: ( ( LeftSquareBracket ) )
            // InternalAccessesParser.g:3130:1: ( LeftSquareBracket )
            {
            // InternalAccessesParser.g:3130:1: ( LeftSquareBracket )
            // InternalAccessesParser.g:3131:2: LeftSquareBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group__3__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group__4"
    // InternalAccessesParser.g:3140:1: rule__AccessesRootExternalAccessItemsOutput__Group__4 : rule__AccessesRootExternalAccessItemsOutput__Group__4__Impl rule__AccessesRootExternalAccessItemsOutput__Group__5 ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3144:1: ( rule__AccessesRootExternalAccessItemsOutput__Group__4__Impl rule__AccessesRootExternalAccessItemsOutput__Group__5 )
            // InternalAccessesParser.g:3145:2: rule__AccessesRootExternalAccessItemsOutput__Group__4__Impl rule__AccessesRootExternalAccessItemsOutput__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__AccessesRootExternalAccessItemsOutput__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group__4"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group__4__Impl"
    // InternalAccessesParser.g:3152:1: rule__AccessesRootExternalAccessItemsOutput__Group__4__Impl : ( ( rule__AccessesRootExternalAccessItemsOutput__Group_4__0 )? ) ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3156:1: ( ( ( rule__AccessesRootExternalAccessItemsOutput__Group_4__0 )? ) )
            // InternalAccessesParser.g:3157:1: ( ( rule__AccessesRootExternalAccessItemsOutput__Group_4__0 )? )
            {
            // InternalAccessesParser.g:3157:1: ( ( rule__AccessesRootExternalAccessItemsOutput__Group_4__0 )? )
            // InternalAccessesParser.g:3158:2: ( rule__AccessesRootExternalAccessItemsOutput__Group_4__0 )?
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getGroup_4()); 
            // InternalAccessesParser.g:3159:2: ( rule__AccessesRootExternalAccessItemsOutput__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LeftCurlyBracket) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAccessesParser.g:3159:3: rule__AccessesRootExternalAccessItemsOutput__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AccessesRootExternalAccessItemsOutput__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group__4__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group__5"
    // InternalAccessesParser.g:3167:1: rule__AccessesRootExternalAccessItemsOutput__Group__5 : rule__AccessesRootExternalAccessItemsOutput__Group__5__Impl ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3171:1: ( rule__AccessesRootExternalAccessItemsOutput__Group__5__Impl )
            // InternalAccessesParser.g:3172:2: rule__AccessesRootExternalAccessItemsOutput__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group__5"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group__5__Impl"
    // InternalAccessesParser.g:3178:1: rule__AccessesRootExternalAccessItemsOutput__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3182:1: ( ( RightSquareBracket ) )
            // InternalAccessesParser.g:3183:1: ( RightSquareBracket )
            {
            // InternalAccessesParser.g:3183:1: ( RightSquareBracket )
            // InternalAccessesParser.g:3184:2: RightSquareBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group__5__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group_4__0"
    // InternalAccessesParser.g:3194:1: rule__AccessesRootExternalAccessItemsOutput__Group_4__0 : rule__AccessesRootExternalAccessItemsOutput__Group_4__0__Impl rule__AccessesRootExternalAccessItemsOutput__Group_4__1 ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3198:1: ( rule__AccessesRootExternalAccessItemsOutput__Group_4__0__Impl rule__AccessesRootExternalAccessItemsOutput__Group_4__1 )
            // InternalAccessesParser.g:3199:2: rule__AccessesRootExternalAccessItemsOutput__Group_4__0__Impl rule__AccessesRootExternalAccessItemsOutput__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__AccessesRootExternalAccessItemsOutput__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group_4__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group_4__0__Impl"
    // InternalAccessesParser.g:3206:1: rule__AccessesRootExternalAccessItemsOutput__Group_4__0__Impl : ( ( rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3210:1: ( ( ( rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0 ) ) )
            // InternalAccessesParser.g:3211:1: ( ( rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0 ) )
            {
            // InternalAccessesParser.g:3211:1: ( ( rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0 ) )
            // InternalAccessesParser.g:3212:2: ( rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputAssignment_4_0()); 
            // InternalAccessesParser.g:3213:2: ( rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0 )
            // InternalAccessesParser.g:3213:3: rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group_4__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group_4__1"
    // InternalAccessesParser.g:3221:1: rule__AccessesRootExternalAccessItemsOutput__Group_4__1 : rule__AccessesRootExternalAccessItemsOutput__Group_4__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3225:1: ( rule__AccessesRootExternalAccessItemsOutput__Group_4__1__Impl )
            // InternalAccessesParser.g:3226:2: rule__AccessesRootExternalAccessItemsOutput__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group_4__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group_4__1__Impl"
    // InternalAccessesParser.g:3232:1: rule__AccessesRootExternalAccessItemsOutput__Group_4__1__Impl : ( ( rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0 )* ) ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3236:1: ( ( ( rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0 )* ) )
            // InternalAccessesParser.g:3237:1: ( ( rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0 )* )
            {
            // InternalAccessesParser.g:3237:1: ( ( rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0 )* )
            // InternalAccessesParser.g:3238:2: ( rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0 )*
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getGroup_4_1()); 
            // InternalAccessesParser.g:3239:2: ( rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Comma) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAccessesParser.g:3239:3: rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group_4__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0"
    // InternalAccessesParser.g:3248:1: rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0 : rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0__Impl rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1 ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3252:1: ( rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0__Impl rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1 )
            // InternalAccessesParser.g:3253:2: rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0__Impl rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0__Impl"
    // InternalAccessesParser.g:3260:1: rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3264:1: ( ( Comma ) )
            // InternalAccessesParser.g:3265:1: ( Comma )
            {
            // InternalAccessesParser.g:3265:1: ( Comma )
            // InternalAccessesParser.g:3266:2: Comma
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1"
    // InternalAccessesParser.g:3275:1: rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1 : rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3279:1: ( rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1__Impl )
            // InternalAccessesParser.g:3280:2: rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1__Impl"
    // InternalAccessesParser.g:3286:1: rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1__Impl : ( ( rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3290:1: ( ( ( rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1 ) ) )
            // InternalAccessesParser.g:3291:1: ( ( rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1 ) )
            {
            // InternalAccessesParser.g:3291:1: ( ( rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1 ) )
            // InternalAccessesParser.g:3292:2: ( rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputAssignment_4_1_1()); 
            // InternalAccessesParser.g:3293:2: ( rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1 )
            // InternalAccessesParser.g:3293:3: rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__Group_4_1__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group__0"
    // InternalAccessesParser.g:3302:1: rule__AccessesRootExternalAccessItemsBody__Group__0 : rule__AccessesRootExternalAccessItemsBody__Group__0__Impl rule__AccessesRootExternalAccessItemsBody__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3306:1: ( rule__AccessesRootExternalAccessItemsBody__Group__0__Impl rule__AccessesRootExternalAccessItemsBody__Group__1 )
            // InternalAccessesParser.g:3307:2: rule__AccessesRootExternalAccessItemsBody__Group__0__Impl rule__AccessesRootExternalAccessItemsBody__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AccessesRootExternalAccessItemsBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group__0__Impl"
    // InternalAccessesParser.g:3314:1: rule__AccessesRootExternalAccessItemsBody__Group__0__Impl : ( () ) ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3318:1: ( ( () ) )
            // InternalAccessesParser.g:3319:1: ( () )
            {
            // InternalAccessesParser.g:3319:1: ( () )
            // InternalAccessesParser.g:3320:2: ()
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getAccessesRootExternalAccessItemsBodyAction_0()); 
            // InternalAccessesParser.g:3321:2: ()
            // InternalAccessesParser.g:3321:3: 
            {
            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getAccessesRootExternalAccessItemsBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group__1"
    // InternalAccessesParser.g:3329:1: rule__AccessesRootExternalAccessItemsBody__Group__1 : rule__AccessesRootExternalAccessItemsBody__Group__1__Impl rule__AccessesRootExternalAccessItemsBody__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3333:1: ( rule__AccessesRootExternalAccessItemsBody__Group__1__Impl rule__AccessesRootExternalAccessItemsBody__Group__2 )
            // InternalAccessesParser.g:3334:2: rule__AccessesRootExternalAccessItemsBody__Group__1__Impl rule__AccessesRootExternalAccessItemsBody__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group__1__Impl"
    // InternalAccessesParser.g:3341:1: rule__AccessesRootExternalAccessItemsBody__Group__1__Impl : ( Body ) ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3345:1: ( ( Body ) )
            // InternalAccessesParser.g:3346:1: ( Body )
            {
            // InternalAccessesParser.g:3346:1: ( Body )
            // InternalAccessesParser.g:3347:2: Body
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyKeyword_1()); 
            match(input,Body,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group__2"
    // InternalAccessesParser.g:3356:1: rule__AccessesRootExternalAccessItemsBody__Group__2 : rule__AccessesRootExternalAccessItemsBody__Group__2__Impl rule__AccessesRootExternalAccessItemsBody__Group__3 ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3360:1: ( rule__AccessesRootExternalAccessItemsBody__Group__2__Impl rule__AccessesRootExternalAccessItemsBody__Group__3 )
            // InternalAccessesParser.g:3361:2: rule__AccessesRootExternalAccessItemsBody__Group__2__Impl rule__AccessesRootExternalAccessItemsBody__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__AccessesRootExternalAccessItemsBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group__2__Impl"
    // InternalAccessesParser.g:3368:1: rule__AccessesRootExternalAccessItemsBody__Group__2__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3372:1: ( ( Colon ) )
            // InternalAccessesParser.g:3373:1: ( Colon )
            {
            // InternalAccessesParser.g:3373:1: ( Colon )
            // InternalAccessesParser.g:3374:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group__3"
    // InternalAccessesParser.g:3383:1: rule__AccessesRootExternalAccessItemsBody__Group__3 : rule__AccessesRootExternalAccessItemsBody__Group__3__Impl rule__AccessesRootExternalAccessItemsBody__Group__4 ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3387:1: ( rule__AccessesRootExternalAccessItemsBody__Group__3__Impl rule__AccessesRootExternalAccessItemsBody__Group__4 )
            // InternalAccessesParser.g:3388:2: rule__AccessesRootExternalAccessItemsBody__Group__3__Impl rule__AccessesRootExternalAccessItemsBody__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__AccessesRootExternalAccessItemsBody__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group__3"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group__3__Impl"
    // InternalAccessesParser.g:3395:1: rule__AccessesRootExternalAccessItemsBody__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3399:1: ( ( LeftSquareBracket ) )
            // InternalAccessesParser.g:3400:1: ( LeftSquareBracket )
            {
            // InternalAccessesParser.g:3400:1: ( LeftSquareBracket )
            // InternalAccessesParser.g:3401:2: LeftSquareBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group__3__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group__4"
    // InternalAccessesParser.g:3410:1: rule__AccessesRootExternalAccessItemsBody__Group__4 : rule__AccessesRootExternalAccessItemsBody__Group__4__Impl rule__AccessesRootExternalAccessItemsBody__Group__5 ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3414:1: ( rule__AccessesRootExternalAccessItemsBody__Group__4__Impl rule__AccessesRootExternalAccessItemsBody__Group__5 )
            // InternalAccessesParser.g:3415:2: rule__AccessesRootExternalAccessItemsBody__Group__4__Impl rule__AccessesRootExternalAccessItemsBody__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__AccessesRootExternalAccessItemsBody__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group__4"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group__4__Impl"
    // InternalAccessesParser.g:3422:1: rule__AccessesRootExternalAccessItemsBody__Group__4__Impl : ( ( rule__AccessesRootExternalAccessItemsBody__Group_4__0 )? ) ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3426:1: ( ( ( rule__AccessesRootExternalAccessItemsBody__Group_4__0 )? ) )
            // InternalAccessesParser.g:3427:1: ( ( rule__AccessesRootExternalAccessItemsBody__Group_4__0 )? )
            {
            // InternalAccessesParser.g:3427:1: ( ( rule__AccessesRootExternalAccessItemsBody__Group_4__0 )? )
            // InternalAccessesParser.g:3428:2: ( rule__AccessesRootExternalAccessItemsBody__Group_4__0 )?
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getGroup_4()); 
            // InternalAccessesParser.g:3429:2: ( rule__AccessesRootExternalAccessItemsBody__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LeftCurlyBracket) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAccessesParser.g:3429:3: rule__AccessesRootExternalAccessItemsBody__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AccessesRootExternalAccessItemsBody__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group__4__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group__5"
    // InternalAccessesParser.g:3437:1: rule__AccessesRootExternalAccessItemsBody__Group__5 : rule__AccessesRootExternalAccessItemsBody__Group__5__Impl ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3441:1: ( rule__AccessesRootExternalAccessItemsBody__Group__5__Impl )
            // InternalAccessesParser.g:3442:2: rule__AccessesRootExternalAccessItemsBody__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group__5"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group__5__Impl"
    // InternalAccessesParser.g:3448:1: rule__AccessesRootExternalAccessItemsBody__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3452:1: ( ( RightSquareBracket ) )
            // InternalAccessesParser.g:3453:1: ( RightSquareBracket )
            {
            // InternalAccessesParser.g:3453:1: ( RightSquareBracket )
            // InternalAccessesParser.g:3454:2: RightSquareBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group__5__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group_4__0"
    // InternalAccessesParser.g:3464:1: rule__AccessesRootExternalAccessItemsBody__Group_4__0 : rule__AccessesRootExternalAccessItemsBody__Group_4__0__Impl rule__AccessesRootExternalAccessItemsBody__Group_4__1 ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3468:1: ( rule__AccessesRootExternalAccessItemsBody__Group_4__0__Impl rule__AccessesRootExternalAccessItemsBody__Group_4__1 )
            // InternalAccessesParser.g:3469:2: rule__AccessesRootExternalAccessItemsBody__Group_4__0__Impl rule__AccessesRootExternalAccessItemsBody__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__AccessesRootExternalAccessItemsBody__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group_4__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group_4__0__Impl"
    // InternalAccessesParser.g:3476:1: rule__AccessesRootExternalAccessItemsBody__Group_4__0__Impl : ( ( rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3480:1: ( ( ( rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0 ) ) )
            // InternalAccessesParser.g:3481:1: ( ( rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0 ) )
            {
            // InternalAccessesParser.g:3481:1: ( ( rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0 ) )
            // InternalAccessesParser.g:3482:2: ( rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyAssignment_4_0()); 
            // InternalAccessesParser.g:3483:2: ( rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0 )
            // InternalAccessesParser.g:3483:3: rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group_4__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group_4__1"
    // InternalAccessesParser.g:3491:1: rule__AccessesRootExternalAccessItemsBody__Group_4__1 : rule__AccessesRootExternalAccessItemsBody__Group_4__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3495:1: ( rule__AccessesRootExternalAccessItemsBody__Group_4__1__Impl )
            // InternalAccessesParser.g:3496:2: rule__AccessesRootExternalAccessItemsBody__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group_4__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group_4__1__Impl"
    // InternalAccessesParser.g:3502:1: rule__AccessesRootExternalAccessItemsBody__Group_4__1__Impl : ( ( rule__AccessesRootExternalAccessItemsBody__Group_4_1__0 )* ) ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3506:1: ( ( ( rule__AccessesRootExternalAccessItemsBody__Group_4_1__0 )* ) )
            // InternalAccessesParser.g:3507:1: ( ( rule__AccessesRootExternalAccessItemsBody__Group_4_1__0 )* )
            {
            // InternalAccessesParser.g:3507:1: ( ( rule__AccessesRootExternalAccessItemsBody__Group_4_1__0 )* )
            // InternalAccessesParser.g:3508:2: ( rule__AccessesRootExternalAccessItemsBody__Group_4_1__0 )*
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getGroup_4_1()); 
            // InternalAccessesParser.g:3509:2: ( rule__AccessesRootExternalAccessItemsBody__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAccessesParser.g:3509:3: rule__AccessesRootExternalAccessItemsBody__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AccessesRootExternalAccessItemsBody__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group_4__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group_4_1__0"
    // InternalAccessesParser.g:3518:1: rule__AccessesRootExternalAccessItemsBody__Group_4_1__0 : rule__AccessesRootExternalAccessItemsBody__Group_4_1__0__Impl rule__AccessesRootExternalAccessItemsBody__Group_4_1__1 ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3522:1: ( rule__AccessesRootExternalAccessItemsBody__Group_4_1__0__Impl rule__AccessesRootExternalAccessItemsBody__Group_4_1__1 )
            // InternalAccessesParser.g:3523:2: rule__AccessesRootExternalAccessItemsBody__Group_4_1__0__Impl rule__AccessesRootExternalAccessItemsBody__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__AccessesRootExternalAccessItemsBody__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group_4_1__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group_4_1__0__Impl"
    // InternalAccessesParser.g:3530:1: rule__AccessesRootExternalAccessItemsBody__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3534:1: ( ( Comma ) )
            // InternalAccessesParser.g:3535:1: ( Comma )
            {
            // InternalAccessesParser.g:3535:1: ( Comma )
            // InternalAccessesParser.g:3536:2: Comma
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group_4_1__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group_4_1__1"
    // InternalAccessesParser.g:3545:1: rule__AccessesRootExternalAccessItemsBody__Group_4_1__1 : rule__AccessesRootExternalAccessItemsBody__Group_4_1__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3549:1: ( rule__AccessesRootExternalAccessItemsBody__Group_4_1__1__Impl )
            // InternalAccessesParser.g:3550:2: rule__AccessesRootExternalAccessItemsBody__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group_4_1__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__Group_4_1__1__Impl"
    // InternalAccessesParser.g:3556:1: rule__AccessesRootExternalAccessItemsBody__Group_4_1__1__Impl : ( ( rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsBody__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3560:1: ( ( ( rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1 ) ) )
            // InternalAccessesParser.g:3561:1: ( ( rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1 ) )
            {
            // InternalAccessesParser.g:3561:1: ( ( rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1 ) )
            // InternalAccessesParser.g:3562:2: ( rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyAssignment_4_1_1()); 
            // InternalAccessesParser.g:3563:2: ( rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1 )
            // InternalAccessesParser.g:3563:3: rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__Group_4_1__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group__0"
    // InternalAccessesParser.g:3572:1: rule__AccessesRootExternalAccessItemsTrigger__Group__0 : rule__AccessesRootExternalAccessItemsTrigger__Group__0__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3576:1: ( rule__AccessesRootExternalAccessItemsTrigger__Group__0__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__1 )
            // InternalAccessesParser.g:3577:2: rule__AccessesRootExternalAccessItemsTrigger__Group__0__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AccessesRootExternalAccessItemsTrigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group__0__Impl"
    // InternalAccessesParser.g:3584:1: rule__AccessesRootExternalAccessItemsTrigger__Group__0__Impl : ( () ) ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3588:1: ( ( () ) )
            // InternalAccessesParser.g:3589:1: ( () )
            {
            // InternalAccessesParser.g:3589:1: ( () )
            // InternalAccessesParser.g:3590:2: ()
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getAccessesRootExternalAccessItemsTriggerAction_0()); 
            // InternalAccessesParser.g:3591:2: ()
            // InternalAccessesParser.g:3591:3: 
            {
            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getAccessesRootExternalAccessItemsTriggerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group__1"
    // InternalAccessesParser.g:3599:1: rule__AccessesRootExternalAccessItemsTrigger__Group__1 : rule__AccessesRootExternalAccessItemsTrigger__Group__1__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3603:1: ( rule__AccessesRootExternalAccessItemsTrigger__Group__1__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__2 )
            // InternalAccessesParser.g:3604:2: rule__AccessesRootExternalAccessItemsTrigger__Group__1__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsTrigger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group__1__Impl"
    // InternalAccessesParser.g:3611:1: rule__AccessesRootExternalAccessItemsTrigger__Group__1__Impl : ( Trigger ) ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3615:1: ( ( Trigger ) )
            // InternalAccessesParser.g:3616:1: ( Trigger )
            {
            // InternalAccessesParser.g:3616:1: ( Trigger )
            // InternalAccessesParser.g:3617:2: Trigger
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerKeyword_1()); 
            match(input,Trigger,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group__2"
    // InternalAccessesParser.g:3626:1: rule__AccessesRootExternalAccessItemsTrigger__Group__2 : rule__AccessesRootExternalAccessItemsTrigger__Group__2__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__3 ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3630:1: ( rule__AccessesRootExternalAccessItemsTrigger__Group__2__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__3 )
            // InternalAccessesParser.g:3631:2: rule__AccessesRootExternalAccessItemsTrigger__Group__2__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__AccessesRootExternalAccessItemsTrigger__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group__2__Impl"
    // InternalAccessesParser.g:3638:1: rule__AccessesRootExternalAccessItemsTrigger__Group__2__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3642:1: ( ( Colon ) )
            // InternalAccessesParser.g:3643:1: ( Colon )
            {
            // InternalAccessesParser.g:3643:1: ( Colon )
            // InternalAccessesParser.g:3644:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group__3"
    // InternalAccessesParser.g:3653:1: rule__AccessesRootExternalAccessItemsTrigger__Group__3 : rule__AccessesRootExternalAccessItemsTrigger__Group__3__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__4 ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3657:1: ( rule__AccessesRootExternalAccessItemsTrigger__Group__3__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__4 )
            // InternalAccessesParser.g:3658:2: rule__AccessesRootExternalAccessItemsTrigger__Group__3__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__AccessesRootExternalAccessItemsTrigger__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group__3"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group__3__Impl"
    // InternalAccessesParser.g:3665:1: rule__AccessesRootExternalAccessItemsTrigger__Group__3__Impl : ( LeftCurlyBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3669:1: ( ( LeftCurlyBracket ) )
            // InternalAccessesParser.g:3670:1: ( LeftCurlyBracket )
            {
            // InternalAccessesParser.g:3670:1: ( LeftCurlyBracket )
            // InternalAccessesParser.g:3671:2: LeftCurlyBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group__3__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group__4"
    // InternalAccessesParser.g:3680:1: rule__AccessesRootExternalAccessItemsTrigger__Group__4 : rule__AccessesRootExternalAccessItemsTrigger__Group__4__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__5 ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3684:1: ( rule__AccessesRootExternalAccessItemsTrigger__Group__4__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__5 )
            // InternalAccessesParser.g:3685:2: rule__AccessesRootExternalAccessItemsTrigger__Group__4__Impl rule__AccessesRootExternalAccessItemsTrigger__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__AccessesRootExternalAccessItemsTrigger__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group__4"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group__4__Impl"
    // InternalAccessesParser.g:3692:1: rule__AccessesRootExternalAccessItemsTrigger__Group__4__Impl : ( ( rule__AccessesRootExternalAccessItemsTrigger__Group_4__0 )? ) ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3696:1: ( ( ( rule__AccessesRootExternalAccessItemsTrigger__Group_4__0 )? ) )
            // InternalAccessesParser.g:3697:1: ( ( rule__AccessesRootExternalAccessItemsTrigger__Group_4__0 )? )
            {
            // InternalAccessesParser.g:3697:1: ( ( rule__AccessesRootExternalAccessItemsTrigger__Group_4__0 )? )
            // InternalAccessesParser.g:3698:2: ( rule__AccessesRootExternalAccessItemsTrigger__Group_4__0 )?
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getGroup_4()); 
            // InternalAccessesParser.g:3699:2: ( rule__AccessesRootExternalAccessItemsTrigger__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==TimeTrigger||(LA22_0>=OnAccess && LA22_0<=OnDelete)||(LA22_0>=OnLoad && LA22_0<=OnMove)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAccessesParser.g:3699:3: rule__AccessesRootExternalAccessItemsTrigger__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AccessesRootExternalAccessItemsTrigger__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group__4__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group__5"
    // InternalAccessesParser.g:3707:1: rule__AccessesRootExternalAccessItemsTrigger__Group__5 : rule__AccessesRootExternalAccessItemsTrigger__Group__5__Impl ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3711:1: ( rule__AccessesRootExternalAccessItemsTrigger__Group__5__Impl )
            // InternalAccessesParser.g:3712:2: rule__AccessesRootExternalAccessItemsTrigger__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group__5"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group__5__Impl"
    // InternalAccessesParser.g:3718:1: rule__AccessesRootExternalAccessItemsTrigger__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3722:1: ( ( RightCurlyBracket ) )
            // InternalAccessesParser.g:3723:1: ( RightCurlyBracket )
            {
            // InternalAccessesParser.g:3723:1: ( RightCurlyBracket )
            // InternalAccessesParser.g:3724:2: RightCurlyBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group__5__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group_4__0"
    // InternalAccessesParser.g:3734:1: rule__AccessesRootExternalAccessItemsTrigger__Group_4__0 : rule__AccessesRootExternalAccessItemsTrigger__Group_4__0__Impl rule__AccessesRootExternalAccessItemsTrigger__Group_4__1 ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3738:1: ( rule__AccessesRootExternalAccessItemsTrigger__Group_4__0__Impl rule__AccessesRootExternalAccessItemsTrigger__Group_4__1 )
            // InternalAccessesParser.g:3739:2: rule__AccessesRootExternalAccessItemsTrigger__Group_4__0__Impl rule__AccessesRootExternalAccessItemsTrigger__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__AccessesRootExternalAccessItemsTrigger__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group_4__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group_4__0__Impl"
    // InternalAccessesParser.g:3746:1: rule__AccessesRootExternalAccessItemsTrigger__Group_4__0__Impl : ( ( rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3750:1: ( ( ( rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0 ) ) )
            // InternalAccessesParser.g:3751:1: ( ( rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0 ) )
            {
            // InternalAccessesParser.g:3751:1: ( ( rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0 ) )
            // InternalAccessesParser.g:3752:2: ( rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerAssignment_4_0()); 
            // InternalAccessesParser.g:3753:2: ( rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0 )
            // InternalAccessesParser.g:3753:3: rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group_4__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group_4__1"
    // InternalAccessesParser.g:3761:1: rule__AccessesRootExternalAccessItemsTrigger__Group_4__1 : rule__AccessesRootExternalAccessItemsTrigger__Group_4__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3765:1: ( rule__AccessesRootExternalAccessItemsTrigger__Group_4__1__Impl )
            // InternalAccessesParser.g:3766:2: rule__AccessesRootExternalAccessItemsTrigger__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group_4__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group_4__1__Impl"
    // InternalAccessesParser.g:3772:1: rule__AccessesRootExternalAccessItemsTrigger__Group_4__1__Impl : ( ( rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0 )* ) ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3776:1: ( ( ( rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0 )* ) )
            // InternalAccessesParser.g:3777:1: ( ( rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0 )* )
            {
            // InternalAccessesParser.g:3777:1: ( ( rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0 )* )
            // InternalAccessesParser.g:3778:2: ( rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0 )*
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getGroup_4_1()); 
            // InternalAccessesParser.g:3779:2: ( rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Comma) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAccessesParser.g:3779:3: rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group_4__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0"
    // InternalAccessesParser.g:3788:1: rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0 : rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0__Impl rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1 ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3792:1: ( rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0__Impl rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1 )
            // InternalAccessesParser.g:3793:2: rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0__Impl rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1
            {
            pushFollow(FOLLOW_19);
            rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0__Impl"
    // InternalAccessesParser.g:3800:1: rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3804:1: ( ( Comma ) )
            // InternalAccessesParser.g:3805:1: ( Comma )
            {
            // InternalAccessesParser.g:3805:1: ( Comma )
            // InternalAccessesParser.g:3806:2: Comma
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1"
    // InternalAccessesParser.g:3815:1: rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1 : rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3819:1: ( rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1__Impl )
            // InternalAccessesParser.g:3820:2: rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1__Impl"
    // InternalAccessesParser.g:3826:1: rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1__Impl : ( ( rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3830:1: ( ( ( rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1 ) ) )
            // InternalAccessesParser.g:3831:1: ( ( rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1 ) )
            {
            // InternalAccessesParser.g:3831:1: ( ( rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1 ) )
            // InternalAccessesParser.g:3832:2: ( rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerAssignment_4_1_1()); 
            // InternalAccessesParser.g:3833:2: ( rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1 )
            // InternalAccessesParser.g:3833:3: rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group__0"
    // InternalAccessesParser.g:3842:1: rule__AccessesRootExternalAccessItemsInputItems__Group__0 : rule__AccessesRootExternalAccessItemsInputItems__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItems__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3846:1: ( rule__AccessesRootExternalAccessItemsInputItems__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItems__Group__1 )
            // InternalAccessesParser.g:3847:2: rule__AccessesRootExternalAccessItemsInputItems__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AccessesRootExternalAccessItemsInputItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group__0__Impl"
    // InternalAccessesParser.g:3854:1: rule__AccessesRootExternalAccessItemsInputItems__Group__0__Impl : ( () ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3858:1: ( ( () ) )
            // InternalAccessesParser.g:3859:1: ( () )
            {
            // InternalAccessesParser.g:3859:1: ( () )
            // InternalAccessesParser.g:3860:2: ()
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getAccessesRootExternalAccessItemsInputItemsAction_0()); 
            // InternalAccessesParser.g:3861:2: ()
            // InternalAccessesParser.g:3861:3: 
            {
            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getAccessesRootExternalAccessItemsInputItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group__1"
    // InternalAccessesParser.g:3869:1: rule__AccessesRootExternalAccessItemsInputItems__Group__1 : rule__AccessesRootExternalAccessItemsInputItems__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItems__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3873:1: ( rule__AccessesRootExternalAccessItemsInputItems__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItems__Group__2 )
            // InternalAccessesParser.g:3874:2: rule__AccessesRootExternalAccessItemsInputItems__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItems__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__AccessesRootExternalAccessItemsInputItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group__1__Impl"
    // InternalAccessesParser.g:3881:1: rule__AccessesRootExternalAccessItemsInputItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3885:1: ( ( LeftCurlyBracket ) )
            // InternalAccessesParser.g:3886:1: ( LeftCurlyBracket )
            {
            // InternalAccessesParser.g:3886:1: ( LeftCurlyBracket )
            // InternalAccessesParser.g:3887:2: LeftCurlyBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group__2"
    // InternalAccessesParser.g:3896:1: rule__AccessesRootExternalAccessItemsInputItems__Group__2 : rule__AccessesRootExternalAccessItemsInputItems__Group__2__Impl rule__AccessesRootExternalAccessItemsInputItems__Group__3 ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3900:1: ( rule__AccessesRootExternalAccessItemsInputItems__Group__2__Impl rule__AccessesRootExternalAccessItemsInputItems__Group__3 )
            // InternalAccessesParser.g:3901:2: rule__AccessesRootExternalAccessItemsInputItems__Group__2__Impl rule__AccessesRootExternalAccessItemsInputItems__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__AccessesRootExternalAccessItemsInputItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group__2__Impl"
    // InternalAccessesParser.g:3908:1: rule__AccessesRootExternalAccessItemsInputItems__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsInputItems__Group_2__0 )? ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3912:1: ( ( ( rule__AccessesRootExternalAccessItemsInputItems__Group_2__0 )? ) )
            // InternalAccessesParser.g:3913:1: ( ( rule__AccessesRootExternalAccessItemsInputItems__Group_2__0 )? )
            {
            // InternalAccessesParser.g:3913:1: ( ( rule__AccessesRootExternalAccessItemsInputItems__Group_2__0 )? )
            // InternalAccessesParser.g:3914:2: ( rule__AccessesRootExternalAccessItemsInputItems__Group_2__0 )?
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getGroup_2()); 
            // InternalAccessesParser.g:3915:2: ( rule__AccessesRootExternalAccessItemsInputItems__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==APIInput||(LA24_0>=Value && LA24_0<=Attr)||LA24_0==Way) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAccessesParser.g:3915:3: rule__AccessesRootExternalAccessItemsInputItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AccessesRootExternalAccessItemsInputItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group__3"
    // InternalAccessesParser.g:3923:1: rule__AccessesRootExternalAccessItemsInputItems__Group__3 : rule__AccessesRootExternalAccessItemsInputItems__Group__3__Impl ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3927:1: ( rule__AccessesRootExternalAccessItemsInputItems__Group__3__Impl )
            // InternalAccessesParser.g:3928:2: rule__AccessesRootExternalAccessItemsInputItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group__3"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group__3__Impl"
    // InternalAccessesParser.g:3934:1: rule__AccessesRootExternalAccessItemsInputItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3938:1: ( ( RightCurlyBracket ) )
            // InternalAccessesParser.g:3939:1: ( RightCurlyBracket )
            {
            // InternalAccessesParser.g:3939:1: ( RightCurlyBracket )
            // InternalAccessesParser.g:3940:2: RightCurlyBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group__3__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group_2__0"
    // InternalAccessesParser.g:3950:1: rule__AccessesRootExternalAccessItemsInputItems__Group_2__0 : rule__AccessesRootExternalAccessItemsInputItems__Group_2__0__Impl rule__AccessesRootExternalAccessItemsInputItems__Group_2__1 ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3954:1: ( rule__AccessesRootExternalAccessItemsInputItems__Group_2__0__Impl rule__AccessesRootExternalAccessItemsInputItems__Group_2__1 )
            // InternalAccessesParser.g:3955:2: rule__AccessesRootExternalAccessItemsInputItems__Group_2__0__Impl rule__AccessesRootExternalAccessItemsInputItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__AccessesRootExternalAccessItemsInputItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItems__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group_2__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group_2__0__Impl"
    // InternalAccessesParser.g:3962:1: rule__AccessesRootExternalAccessItemsInputItems__Group_2__0__Impl : ( ( rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3966:1: ( ( ( rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0 ) ) )
            // InternalAccessesParser.g:3967:1: ( ( rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0 ) )
            {
            // InternalAccessesParser.g:3967:1: ( ( rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0 ) )
            // InternalAccessesParser.g:3968:2: ( rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getItemsAssignment_2_0()); 
            // InternalAccessesParser.g:3969:2: ( rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0 )
            // InternalAccessesParser.g:3969:3: rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group_2__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group_2__1"
    // InternalAccessesParser.g:3977:1: rule__AccessesRootExternalAccessItemsInputItems__Group_2__1 : rule__AccessesRootExternalAccessItemsInputItems__Group_2__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3981:1: ( rule__AccessesRootExternalAccessItemsInputItems__Group_2__1__Impl )
            // InternalAccessesParser.g:3982:2: rule__AccessesRootExternalAccessItemsInputItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItems__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group_2__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group_2__1__Impl"
    // InternalAccessesParser.g:3988:1: rule__AccessesRootExternalAccessItemsInputItems__Group_2__1__Impl : ( ( rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0 )* ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:3992:1: ( ( ( rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0 )* ) )
            // InternalAccessesParser.g:3993:1: ( ( rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0 )* )
            {
            // InternalAccessesParser.g:3993:1: ( ( rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0 )* )
            // InternalAccessesParser.g:3994:2: ( rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0 )*
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getGroup_2_1()); 
            // InternalAccessesParser.g:3995:2: ( rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Comma) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAccessesParser.g:3995:3: rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group_2__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0"
    // InternalAccessesParser.g:4004:1: rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0 : rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0__Impl rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1 ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4008:1: ( rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0__Impl rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1 )
            // InternalAccessesParser.g:4009:2: rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0__Impl rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1
            {
            pushFollow(FOLLOW_21);
            rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0__Impl"
    // InternalAccessesParser.g:4016:1: rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4020:1: ( ( Comma ) )
            // InternalAccessesParser.g:4021:1: ( Comma )
            {
            // InternalAccessesParser.g:4021:1: ( Comma )
            // InternalAccessesParser.g:4022:2: Comma
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1"
    // InternalAccessesParser.g:4031:1: rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1 : rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4035:1: ( rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1__Impl )
            // InternalAccessesParser.g:4036:2: rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1__Impl"
    // InternalAccessesParser.g:4042:1: rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1__Impl : ( ( rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4046:1: ( ( ( rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1 ) ) )
            // InternalAccessesParser.g:4047:1: ( ( rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalAccessesParser.g:4047:1: ( ( rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1 ) )
            // InternalAccessesParser.g:4048:2: ( rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalAccessesParser.g:4049:2: ( rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1 )
            // InternalAccessesParser.g:4049:3: rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0"
    // InternalAccessesParser.g:4058:1: rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0 : rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4062:1: ( rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1 )
            // InternalAccessesParser.g:4063:2: rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0__Impl"
    // InternalAccessesParser.g:4070:1: rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0__Impl : ( Attr ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4074:1: ( ( Attr ) )
            // InternalAccessesParser.g:4075:1: ( Attr )
            {
            // InternalAccessesParser.g:4075:1: ( Attr )
            // InternalAccessesParser.g:4076:2: Attr
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getAttrKeyword_0()); 
            match(input,Attr,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getAttrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1"
    // InternalAccessesParser.g:4085:1: rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1 : rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4089:1: ( rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2 )
            // InternalAccessesParser.g:4090:2: rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1__Impl"
    // InternalAccessesParser.g:4097:1: rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4101:1: ( ( Colon ) )
            // InternalAccessesParser.g:4102:1: ( Colon )
            {
            // InternalAccessesParser.g:4102:1: ( Colon )
            // InternalAccessesParser.g:4103:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2"
    // InternalAccessesParser.g:4112:1: rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2 : rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4116:1: ( rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2__Impl )
            // InternalAccessesParser.g:4117:2: rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2__Impl"
    // InternalAccessesParser.g:4123:1: rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4127:1: ( ( ( rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2 ) ) )
            // InternalAccessesParser.g:4128:1: ( ( rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2 ) )
            {
            // InternalAccessesParser.g:4128:1: ( ( rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2 ) )
            // InternalAccessesParser.g:4129:2: ( rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getAttrAssignment_2()); 
            // InternalAccessesParser.g:4130:2: ( rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2 )
            // InternalAccessesParser.g:4130:3: rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getAttrAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0"
    // InternalAccessesParser.g:4139:1: rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0 : rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4143:1: ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1 )
            // InternalAccessesParser.g:4144:2: rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0__Impl"
    // InternalAccessesParser.g:4151:1: rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0__Impl : ( APIInput ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4155:1: ( ( APIInput ) )
            // InternalAccessesParser.g:4156:1: ( APIInput )
            {
            // InternalAccessesParser.g:4156:1: ( APIInput )
            // InternalAccessesParser.g:4157:2: APIInput
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getAPIInputKeyword_0()); 
            match(input,APIInput,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getAPIInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1"
    // InternalAccessesParser.g:4166:1: rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1 : rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4170:1: ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2 )
            // InternalAccessesParser.g:4171:2: rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1__Impl"
    // InternalAccessesParser.g:4178:1: rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4182:1: ( ( Colon ) )
            // InternalAccessesParser.g:4183:1: ( Colon )
            {
            // InternalAccessesParser.g:4183:1: ( Colon )
            // InternalAccessesParser.g:4184:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2"
    // InternalAccessesParser.g:4193:1: rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2 : rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4197:1: ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2__Impl )
            // InternalAccessesParser.g:4198:2: rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2__Impl"
    // InternalAccessesParser.g:4204:1: rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4208:1: ( ( ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2 ) ) )
            // InternalAccessesParser.g:4209:1: ( ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2 ) )
            {
            // InternalAccessesParser.g:4209:1: ( ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2 ) )
            // InternalAccessesParser.g:4210:2: ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getAPIInputAssignment_2()); 
            // InternalAccessesParser.g:4211:2: ( rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2 )
            // InternalAccessesParser.g:4211:3: rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getAPIInputAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0"
    // InternalAccessesParser.g:4220:1: rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0 : rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4224:1: ( rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1 )
            // InternalAccessesParser.g:4225:2: rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0__Impl"
    // InternalAccessesParser.g:4232:1: rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0__Impl : ( Way ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4236:1: ( ( Way ) )
            // InternalAccessesParser.g:4237:1: ( Way )
            {
            // InternalAccessesParser.g:4237:1: ( Way )
            // InternalAccessesParser.g:4238:2: Way
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getWayKeyword_0()); 
            match(input,Way,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getWayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1"
    // InternalAccessesParser.g:4247:1: rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1 : rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4251:1: ( rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2 )
            // InternalAccessesParser.g:4252:2: rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1__Impl"
    // InternalAccessesParser.g:4259:1: rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4263:1: ( ( Colon ) )
            // InternalAccessesParser.g:4264:1: ( Colon )
            {
            // InternalAccessesParser.g:4264:1: ( Colon )
            // InternalAccessesParser.g:4265:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2"
    // InternalAccessesParser.g:4274:1: rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2 : rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4278:1: ( rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2__Impl )
            // InternalAccessesParser.g:4279:2: rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2__Impl"
    // InternalAccessesParser.g:4285:1: rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4289:1: ( ( ( rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2 ) ) )
            // InternalAccessesParser.g:4290:1: ( ( rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2 ) )
            {
            // InternalAccessesParser.g:4290:1: ( ( rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2 ) )
            // InternalAccessesParser.g:4291:2: ( rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getWayAssignment_2()); 
            // InternalAccessesParser.g:4292:2: ( rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2 )
            // InternalAccessesParser.g:4292:3: rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getWayAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0"
    // InternalAccessesParser.g:4301:1: rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0 : rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4305:1: ( rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1 )
            // InternalAccessesParser.g:4306:2: rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0__Impl rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0__Impl"
    // InternalAccessesParser.g:4313:1: rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0__Impl : ( Value ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4317:1: ( ( Value ) )
            // InternalAccessesParser.g:4318:1: ( Value )
            {
            // InternalAccessesParser.g:4318:1: ( Value )
            // InternalAccessesParser.g:4319:2: Value
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getValueKeyword_0()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getValueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1"
    // InternalAccessesParser.g:4328:1: rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1 : rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4332:1: ( rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2 )
            // InternalAccessesParser.g:4333:2: rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1__Impl rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1__Impl"
    // InternalAccessesParser.g:4340:1: rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4344:1: ( ( Colon ) )
            // InternalAccessesParser.g:4345:1: ( Colon )
            {
            // InternalAccessesParser.g:4345:1: ( Colon )
            // InternalAccessesParser.g:4346:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2"
    // InternalAccessesParser.g:4355:1: rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2 : rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4359:1: ( rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2__Impl )
            // InternalAccessesParser.g:4360:2: rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2__Impl"
    // InternalAccessesParser.g:4366:1: rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4370:1: ( ( ( rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2 ) ) )
            // InternalAccessesParser.g:4371:1: ( ( rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2 ) )
            {
            // InternalAccessesParser.g:4371:1: ( ( rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2 ) )
            // InternalAccessesParser.g:4372:2: ( rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getValueAssignment_2()); 
            // InternalAccessesParser.g:4373:2: ( rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2 )
            // InternalAccessesParser.g:4373:3: rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group__0"
    // InternalAccessesParser.g:4382:1: rule__AccessesRootExternalAccessItemsOutputItems__Group__0 : rule__AccessesRootExternalAccessItemsOutputItems__Group__0__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4386:1: ( rule__AccessesRootExternalAccessItemsOutputItems__Group__0__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group__1 )
            // InternalAccessesParser.g:4387:2: rule__AccessesRootExternalAccessItemsOutputItems__Group__0__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AccessesRootExternalAccessItemsOutputItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group__0__Impl"
    // InternalAccessesParser.g:4394:1: rule__AccessesRootExternalAccessItemsOutputItems__Group__0__Impl : ( () ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4398:1: ( ( () ) )
            // InternalAccessesParser.g:4399:1: ( () )
            {
            // InternalAccessesParser.g:4399:1: ( () )
            // InternalAccessesParser.g:4400:2: ()
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getAccessesRootExternalAccessItemsOutputItemsAction_0()); 
            // InternalAccessesParser.g:4401:2: ()
            // InternalAccessesParser.g:4401:3: 
            {
            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getAccessesRootExternalAccessItemsOutputItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group__1"
    // InternalAccessesParser.g:4409:1: rule__AccessesRootExternalAccessItemsOutputItems__Group__1 : rule__AccessesRootExternalAccessItemsOutputItems__Group__1__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4413:1: ( rule__AccessesRootExternalAccessItemsOutputItems__Group__1__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group__2 )
            // InternalAccessesParser.g:4414:2: rule__AccessesRootExternalAccessItemsOutputItems__Group__1__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__AccessesRootExternalAccessItemsOutputItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group__1__Impl"
    // InternalAccessesParser.g:4421:1: rule__AccessesRootExternalAccessItemsOutputItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4425:1: ( ( LeftCurlyBracket ) )
            // InternalAccessesParser.g:4426:1: ( LeftCurlyBracket )
            {
            // InternalAccessesParser.g:4426:1: ( LeftCurlyBracket )
            // InternalAccessesParser.g:4427:2: LeftCurlyBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group__2"
    // InternalAccessesParser.g:4436:1: rule__AccessesRootExternalAccessItemsOutputItems__Group__2 : rule__AccessesRootExternalAccessItemsOutputItems__Group__2__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group__3 ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4440:1: ( rule__AccessesRootExternalAccessItemsOutputItems__Group__2__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group__3 )
            // InternalAccessesParser.g:4441:2: rule__AccessesRootExternalAccessItemsOutputItems__Group__2__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__AccessesRootExternalAccessItemsOutputItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group__2__Impl"
    // InternalAccessesParser.g:4448:1: rule__AccessesRootExternalAccessItemsOutputItems__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0 )? ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4452:1: ( ( ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0 )? ) )
            // InternalAccessesParser.g:4453:1: ( ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0 )? )
            {
            // InternalAccessesParser.g:4453:1: ( ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0 )? )
            // InternalAccessesParser.g:4454:2: ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0 )?
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getGroup_2()); 
            // InternalAccessesParser.g:4455:2: ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==APIOutput||LA26_0==Attr) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAccessesParser.g:4455:3: rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group__3"
    // InternalAccessesParser.g:4463:1: rule__AccessesRootExternalAccessItemsOutputItems__Group__3 : rule__AccessesRootExternalAccessItemsOutputItems__Group__3__Impl ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4467:1: ( rule__AccessesRootExternalAccessItemsOutputItems__Group__3__Impl )
            // InternalAccessesParser.g:4468:2: rule__AccessesRootExternalAccessItemsOutputItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group__3"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group__3__Impl"
    // InternalAccessesParser.g:4474:1: rule__AccessesRootExternalAccessItemsOutputItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4478:1: ( ( RightCurlyBracket ) )
            // InternalAccessesParser.g:4479:1: ( RightCurlyBracket )
            {
            // InternalAccessesParser.g:4479:1: ( RightCurlyBracket )
            // InternalAccessesParser.g:4480:2: RightCurlyBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group__3__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0"
    // InternalAccessesParser.g:4490:1: rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0 : rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1 ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4494:1: ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1 )
            // InternalAccessesParser.g:4495:2: rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0__Impl"
    // InternalAccessesParser.g:4502:1: rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0__Impl : ( ( rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4506:1: ( ( ( rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0 ) ) )
            // InternalAccessesParser.g:4507:1: ( ( rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0 ) )
            {
            // InternalAccessesParser.g:4507:1: ( ( rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0 ) )
            // InternalAccessesParser.g:4508:2: ( rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getItemsAssignment_2_0()); 
            // InternalAccessesParser.g:4509:2: ( rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0 )
            // InternalAccessesParser.g:4509:3: rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1"
    // InternalAccessesParser.g:4517:1: rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1 : rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4521:1: ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1__Impl )
            // InternalAccessesParser.g:4522:2: rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1__Impl"
    // InternalAccessesParser.g:4528:1: rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1__Impl : ( ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0 )* ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4532:1: ( ( ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0 )* ) )
            // InternalAccessesParser.g:4533:1: ( ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0 )* )
            {
            // InternalAccessesParser.g:4533:1: ( ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0 )* )
            // InternalAccessesParser.g:4534:2: ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0 )*
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getGroup_2_1()); 
            // InternalAccessesParser.g:4535:2: ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAccessesParser.g:4535:3: rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group_2__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0"
    // InternalAccessesParser.g:4544:1: rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0 : rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1 ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4548:1: ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1 )
            // InternalAccessesParser.g:4549:2: rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0__Impl rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1
            {
            pushFollow(FOLLOW_23);
            rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0__Impl"
    // InternalAccessesParser.g:4556:1: rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4560:1: ( ( Comma ) )
            // InternalAccessesParser.g:4561:1: ( Comma )
            {
            // InternalAccessesParser.g:4561:1: ( Comma )
            // InternalAccessesParser.g:4562:2: Comma
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1"
    // InternalAccessesParser.g:4571:1: rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1 : rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4575:1: ( rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1__Impl )
            // InternalAccessesParser.g:4576:2: rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1__Impl"
    // InternalAccessesParser.g:4582:1: rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1__Impl : ( ( rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4586:1: ( ( ( rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1 ) ) )
            // InternalAccessesParser.g:4587:1: ( ( rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalAccessesParser.g:4587:1: ( ( rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1 ) )
            // InternalAccessesParser.g:4588:2: ( rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalAccessesParser.g:4589:2: ( rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1 )
            // InternalAccessesParser.g:4589:3: rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0"
    // InternalAccessesParser.g:4598:1: rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0 : rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0__Impl rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4602:1: ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0__Impl rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1 )
            // InternalAccessesParser.g:4603:2: rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0__Impl rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0__Impl"
    // InternalAccessesParser.g:4610:1: rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0__Impl : ( Attr ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4614:1: ( ( Attr ) )
            // InternalAccessesParser.g:4615:1: ( Attr )
            {
            // InternalAccessesParser.g:4615:1: ( Attr )
            // InternalAccessesParser.g:4616:2: Attr
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getAttrKeyword_0()); 
            match(input,Attr,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getAttrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1"
    // InternalAccessesParser.g:4625:1: rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1 : rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1__Impl rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4629:1: ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1__Impl rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2 )
            // InternalAccessesParser.g:4630:2: rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1__Impl rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1__Impl"
    // InternalAccessesParser.g:4637:1: rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4641:1: ( ( Colon ) )
            // InternalAccessesParser.g:4642:1: ( Colon )
            {
            // InternalAccessesParser.g:4642:1: ( Colon )
            // InternalAccessesParser.g:4643:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2"
    // InternalAccessesParser.g:4652:1: rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2 : rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4656:1: ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2__Impl )
            // InternalAccessesParser.g:4657:2: rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2__Impl"
    // InternalAccessesParser.g:4663:1: rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4667:1: ( ( ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2 ) ) )
            // InternalAccessesParser.g:4668:1: ( ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2 ) )
            {
            // InternalAccessesParser.g:4668:1: ( ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2 ) )
            // InternalAccessesParser.g:4669:2: ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getAttrAssignment_2()); 
            // InternalAccessesParser.g:4670:2: ( rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2 )
            // InternalAccessesParser.g:4670:3: rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getAttrAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0"
    // InternalAccessesParser.g:4679:1: rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0 : rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0__Impl rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4683:1: ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0__Impl rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1 )
            // InternalAccessesParser.g:4684:2: rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0__Impl rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0__Impl"
    // InternalAccessesParser.g:4691:1: rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0__Impl : ( APIOutput ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4695:1: ( ( APIOutput ) )
            // InternalAccessesParser.g:4696:1: ( APIOutput )
            {
            // InternalAccessesParser.g:4696:1: ( APIOutput )
            // InternalAccessesParser.g:4697:2: APIOutput
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getAPIOutputKeyword_0()); 
            match(input,APIOutput,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getAPIOutputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1"
    // InternalAccessesParser.g:4706:1: rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1 : rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1__Impl rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4710:1: ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1__Impl rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2 )
            // InternalAccessesParser.g:4711:2: rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1__Impl rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1__Impl"
    // InternalAccessesParser.g:4718:1: rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4722:1: ( ( Colon ) )
            // InternalAccessesParser.g:4723:1: ( Colon )
            {
            // InternalAccessesParser.g:4723:1: ( Colon )
            // InternalAccessesParser.g:4724:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2"
    // InternalAccessesParser.g:4733:1: rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2 : rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4737:1: ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2__Impl )
            // InternalAccessesParser.g:4738:2: rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2__Impl"
    // InternalAccessesParser.g:4744:1: rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4748:1: ( ( ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2 ) ) )
            // InternalAccessesParser.g:4749:1: ( ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2 ) )
            {
            // InternalAccessesParser.g:4749:1: ( ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2 ) )
            // InternalAccessesParser.g:4750:2: ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getAPIOutputAssignment_2()); 
            // InternalAccessesParser.g:4751:2: ( rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2 )
            // InternalAccessesParser.g:4751:3: rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getAPIOutputAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group__0"
    // InternalAccessesParser.g:4760:1: rule__AccessesRootExternalAccessItemsBodyItems__Group__0 : rule__AccessesRootExternalAccessItemsBodyItems__Group__0__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4764:1: ( rule__AccessesRootExternalAccessItemsBodyItems__Group__0__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group__1 )
            // InternalAccessesParser.g:4765:2: rule__AccessesRootExternalAccessItemsBodyItems__Group__0__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AccessesRootExternalAccessItemsBodyItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group__0__Impl"
    // InternalAccessesParser.g:4772:1: rule__AccessesRootExternalAccessItemsBodyItems__Group__0__Impl : ( () ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4776:1: ( ( () ) )
            // InternalAccessesParser.g:4777:1: ( () )
            {
            // InternalAccessesParser.g:4777:1: ( () )
            // InternalAccessesParser.g:4778:2: ()
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getAccessesRootExternalAccessItemsBodyItemsAction_0()); 
            // InternalAccessesParser.g:4779:2: ()
            // InternalAccessesParser.g:4779:3: 
            {
            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getAccessesRootExternalAccessItemsBodyItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group__1"
    // InternalAccessesParser.g:4787:1: rule__AccessesRootExternalAccessItemsBodyItems__Group__1 : rule__AccessesRootExternalAccessItemsBodyItems__Group__1__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4791:1: ( rule__AccessesRootExternalAccessItemsBodyItems__Group__1__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group__2 )
            // InternalAccessesParser.g:4792:2: rule__AccessesRootExternalAccessItemsBodyItems__Group__1__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__AccessesRootExternalAccessItemsBodyItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group__1__Impl"
    // InternalAccessesParser.g:4799:1: rule__AccessesRootExternalAccessItemsBodyItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4803:1: ( ( LeftCurlyBracket ) )
            // InternalAccessesParser.g:4804:1: ( LeftCurlyBracket )
            {
            // InternalAccessesParser.g:4804:1: ( LeftCurlyBracket )
            // InternalAccessesParser.g:4805:2: LeftCurlyBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group__2"
    // InternalAccessesParser.g:4814:1: rule__AccessesRootExternalAccessItemsBodyItems__Group__2 : rule__AccessesRootExternalAccessItemsBodyItems__Group__2__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group__3 ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4818:1: ( rule__AccessesRootExternalAccessItemsBodyItems__Group__2__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group__3 )
            // InternalAccessesParser.g:4819:2: rule__AccessesRootExternalAccessItemsBodyItems__Group__2__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__AccessesRootExternalAccessItemsBodyItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group__2__Impl"
    // InternalAccessesParser.g:4826:1: rule__AccessesRootExternalAccessItemsBodyItems__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0 )? ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4830:1: ( ( ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0 )? ) )
            // InternalAccessesParser.g:4831:1: ( ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0 )? )
            {
            // InternalAccessesParser.g:4831:1: ( ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0 )? )
            // InternalAccessesParser.g:4832:2: ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0 )?
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getGroup_2()); 
            // InternalAccessesParser.g:4833:2: ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==APIBody||LA28_0==Attr) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAccessesParser.g:4833:3: rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group__3"
    // InternalAccessesParser.g:4841:1: rule__AccessesRootExternalAccessItemsBodyItems__Group__3 : rule__AccessesRootExternalAccessItemsBodyItems__Group__3__Impl ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4845:1: ( rule__AccessesRootExternalAccessItemsBodyItems__Group__3__Impl )
            // InternalAccessesParser.g:4846:2: rule__AccessesRootExternalAccessItemsBodyItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group__3"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group__3__Impl"
    // InternalAccessesParser.g:4852:1: rule__AccessesRootExternalAccessItemsBodyItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4856:1: ( ( RightCurlyBracket ) )
            // InternalAccessesParser.g:4857:1: ( RightCurlyBracket )
            {
            // InternalAccessesParser.g:4857:1: ( RightCurlyBracket )
            // InternalAccessesParser.g:4858:2: RightCurlyBracket
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group__3__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0"
    // InternalAccessesParser.g:4868:1: rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0 : rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1 ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4872:1: ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1 )
            // InternalAccessesParser.g:4873:2: rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0__Impl"
    // InternalAccessesParser.g:4880:1: rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0__Impl : ( ( rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4884:1: ( ( ( rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0 ) ) )
            // InternalAccessesParser.g:4885:1: ( ( rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0 ) )
            {
            // InternalAccessesParser.g:4885:1: ( ( rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0 ) )
            // InternalAccessesParser.g:4886:2: ( rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getItemsAssignment_2_0()); 
            // InternalAccessesParser.g:4887:2: ( rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0 )
            // InternalAccessesParser.g:4887:3: rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1"
    // InternalAccessesParser.g:4895:1: rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1 : rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4899:1: ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1__Impl )
            // InternalAccessesParser.g:4900:2: rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1__Impl"
    // InternalAccessesParser.g:4906:1: rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1__Impl : ( ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0 )* ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4910:1: ( ( ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0 )* ) )
            // InternalAccessesParser.g:4911:1: ( ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0 )* )
            {
            // InternalAccessesParser.g:4911:1: ( ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0 )* )
            // InternalAccessesParser.g:4912:2: ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0 )*
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getGroup_2_1()); 
            // InternalAccessesParser.g:4913:2: ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Comma) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAccessesParser.g:4913:3: rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group_2__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0"
    // InternalAccessesParser.g:4922:1: rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0 : rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1 ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4926:1: ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1 )
            // InternalAccessesParser.g:4927:2: rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0__Impl rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1
            {
            pushFollow(FOLLOW_25);
            rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0__Impl"
    // InternalAccessesParser.g:4934:1: rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4938:1: ( ( Comma ) )
            // InternalAccessesParser.g:4939:1: ( Comma )
            {
            // InternalAccessesParser.g:4939:1: ( Comma )
            // InternalAccessesParser.g:4940:2: Comma
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1"
    // InternalAccessesParser.g:4949:1: rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1 : rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1__Impl ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4953:1: ( rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1__Impl )
            // InternalAccessesParser.g:4954:2: rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1__Impl"
    // InternalAccessesParser.g:4960:1: rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1__Impl : ( ( rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4964:1: ( ( ( rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1 ) ) )
            // InternalAccessesParser.g:4965:1: ( ( rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalAccessesParser.g:4965:1: ( ( rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1 ) )
            // InternalAccessesParser.g:4966:2: ( rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalAccessesParser.g:4967:2: ( rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1 )
            // InternalAccessesParser.g:4967:3: rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0"
    // InternalAccessesParser.g:4976:1: rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0 : rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0__Impl rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4980:1: ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0__Impl rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1 )
            // InternalAccessesParser.g:4981:2: rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0__Impl rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0__Impl"
    // InternalAccessesParser.g:4988:1: rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0__Impl : ( Attr ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:4992:1: ( ( Attr ) )
            // InternalAccessesParser.g:4993:1: ( Attr )
            {
            // InternalAccessesParser.g:4993:1: ( Attr )
            // InternalAccessesParser.g:4994:2: Attr
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getAttrKeyword_0()); 
            match(input,Attr,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getAttrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1"
    // InternalAccessesParser.g:5003:1: rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1 : rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1__Impl rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5007:1: ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1__Impl rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2 )
            // InternalAccessesParser.g:5008:2: rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1__Impl rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1__Impl"
    // InternalAccessesParser.g:5015:1: rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5019:1: ( ( Colon ) )
            // InternalAccessesParser.g:5020:1: ( Colon )
            {
            // InternalAccessesParser.g:5020:1: ( Colon )
            // InternalAccessesParser.g:5021:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2"
    // InternalAccessesParser.g:5030:1: rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2 : rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5034:1: ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2__Impl )
            // InternalAccessesParser.g:5035:2: rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2__Impl"
    // InternalAccessesParser.g:5041:1: rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5045:1: ( ( ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2 ) ) )
            // InternalAccessesParser.g:5046:1: ( ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2 ) )
            {
            // InternalAccessesParser.g:5046:1: ( ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2 ) )
            // InternalAccessesParser.g:5047:2: ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getAttrAssignment_2()); 
            // InternalAccessesParser.g:5048:2: ( rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2 )
            // InternalAccessesParser.g:5048:3: rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getAttrAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0"
    // InternalAccessesParser.g:5057:1: rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0 : rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0__Impl rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5061:1: ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0__Impl rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1 )
            // InternalAccessesParser.g:5062:2: rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0__Impl rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0__Impl"
    // InternalAccessesParser.g:5069:1: rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0__Impl : ( APIBody ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5073:1: ( ( APIBody ) )
            // InternalAccessesParser.g:5074:1: ( APIBody )
            {
            // InternalAccessesParser.g:5074:1: ( APIBody )
            // InternalAccessesParser.g:5075:2: APIBody
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getAPIBodyKeyword_0()); 
            match(input,APIBody,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getAPIBodyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1"
    // InternalAccessesParser.g:5084:1: rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1 : rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1__Impl rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5088:1: ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1__Impl rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2 )
            // InternalAccessesParser.g:5089:2: rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1__Impl rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1__Impl"
    // InternalAccessesParser.g:5096:1: rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5100:1: ( ( Colon ) )
            // InternalAccessesParser.g:5101:1: ( Colon )
            {
            // InternalAccessesParser.g:5101:1: ( Colon )
            // InternalAccessesParser.g:5102:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2"
    // InternalAccessesParser.g:5111:1: rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2 : rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5115:1: ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2__Impl )
            // InternalAccessesParser.g:5116:2: rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2__Impl"
    // InternalAccessesParser.g:5122:1: rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5126:1: ( ( ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2 ) ) )
            // InternalAccessesParser.g:5127:1: ( ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2 ) )
            {
            // InternalAccessesParser.g:5127:1: ( ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2 ) )
            // InternalAccessesParser.g:5128:2: ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getAPIBodyAssignment_2()); 
            // InternalAccessesParser.g:5129:2: ( rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2 )
            // InternalAccessesParser.g:5129:3: rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getAPIBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0"
    // InternalAccessesParser.g:5138:1: rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0 : rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5142:1: ( rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1 )
            // InternalAccessesParser.g:5143:2: rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0__Impl"
    // InternalAccessesParser.g:5150:1: rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0__Impl : ( OnChange ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5154:1: ( ( OnChange ) )
            // InternalAccessesParser.g:5155:1: ( OnChange )
            {
            // InternalAccessesParser.g:5155:1: ( OnChange )
            // InternalAccessesParser.g:5156:2: OnChange
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getOnChangeKeyword_0()); 
            match(input,OnChange,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getOnChangeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1"
    // InternalAccessesParser.g:5165:1: rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1 : rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5169:1: ( rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2 )
            // InternalAccessesParser.g:5170:2: rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1__Impl"
    // InternalAccessesParser.g:5177:1: rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5181:1: ( ( Colon ) )
            // InternalAccessesParser.g:5182:1: ( Colon )
            {
            // InternalAccessesParser.g:5182:1: ( Colon )
            // InternalAccessesParser.g:5183:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2"
    // InternalAccessesParser.g:5192:1: rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2 : rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5196:1: ( rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2__Impl )
            // InternalAccessesParser.g:5197:2: rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2__Impl"
    // InternalAccessesParser.g:5203:1: rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5207:1: ( ( ( rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2 ) ) )
            // InternalAccessesParser.g:5208:1: ( ( rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2 ) )
            {
            // InternalAccessesParser.g:5208:1: ( ( rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2 ) )
            // InternalAccessesParser.g:5209:2: ( rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getOnChangeAssignment_2()); 
            // InternalAccessesParser.g:5210:2: ( rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2 )
            // InternalAccessesParser.g:5210:3: rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getOnChangeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0"
    // InternalAccessesParser.g:5219:1: rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0 : rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5223:1: ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1 )
            // InternalAccessesParser.g:5224:2: rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0__Impl"
    // InternalAccessesParser.g:5231:1: rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0__Impl : ( OnCreate ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5235:1: ( ( OnCreate ) )
            // InternalAccessesParser.g:5236:1: ( OnCreate )
            {
            // InternalAccessesParser.g:5236:1: ( OnCreate )
            // InternalAccessesParser.g:5237:2: OnCreate
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getOnCreateKeyword_0()); 
            match(input,OnCreate,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getOnCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1"
    // InternalAccessesParser.g:5246:1: rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1 : rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5250:1: ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2 )
            // InternalAccessesParser.g:5251:2: rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1__Impl"
    // InternalAccessesParser.g:5258:1: rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5262:1: ( ( Colon ) )
            // InternalAccessesParser.g:5263:1: ( Colon )
            {
            // InternalAccessesParser.g:5263:1: ( Colon )
            // InternalAccessesParser.g:5264:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2"
    // InternalAccessesParser.g:5273:1: rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2 : rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5277:1: ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2__Impl )
            // InternalAccessesParser.g:5278:2: rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2__Impl"
    // InternalAccessesParser.g:5284:1: rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5288:1: ( ( ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2 ) ) )
            // InternalAccessesParser.g:5289:1: ( ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2 ) )
            {
            // InternalAccessesParser.g:5289:1: ( ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2 ) )
            // InternalAccessesParser.g:5290:2: ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getOnCreateAssignment_2()); 
            // InternalAccessesParser.g:5291:2: ( rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2 )
            // InternalAccessesParser.g:5291:3: rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getOnCreateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0"
    // InternalAccessesParser.g:5300:1: rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0 : rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5304:1: ( rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1 )
            // InternalAccessesParser.g:5305:2: rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0__Impl"
    // InternalAccessesParser.g:5312:1: rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0__Impl : ( OnMove ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5316:1: ( ( OnMove ) )
            // InternalAccessesParser.g:5317:1: ( OnMove )
            {
            // InternalAccessesParser.g:5317:1: ( OnMove )
            // InternalAccessesParser.g:5318:2: OnMove
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getOnMoveKeyword_0()); 
            match(input,OnMove,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getOnMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1"
    // InternalAccessesParser.g:5327:1: rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1 : rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5331:1: ( rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2 )
            // InternalAccessesParser.g:5332:2: rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1__Impl"
    // InternalAccessesParser.g:5339:1: rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5343:1: ( ( Colon ) )
            // InternalAccessesParser.g:5344:1: ( Colon )
            {
            // InternalAccessesParser.g:5344:1: ( Colon )
            // InternalAccessesParser.g:5345:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2"
    // InternalAccessesParser.g:5354:1: rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2 : rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5358:1: ( rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2__Impl )
            // InternalAccessesParser.g:5359:2: rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2__Impl"
    // InternalAccessesParser.g:5365:1: rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5369:1: ( ( ( rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2 ) ) )
            // InternalAccessesParser.g:5370:1: ( ( rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2 ) )
            {
            // InternalAccessesParser.g:5370:1: ( ( rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2 ) )
            // InternalAccessesParser.g:5371:2: ( rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getOnMoveAssignment_2()); 
            // InternalAccessesParser.g:5372:2: ( rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2 )
            // InternalAccessesParser.g:5372:3: rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getOnMoveAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0"
    // InternalAccessesParser.g:5381:1: rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0 : rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5385:1: ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1 )
            // InternalAccessesParser.g:5386:2: rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0__Impl"
    // InternalAccessesParser.g:5393:1: rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0__Impl : ( OnDelete ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5397:1: ( ( OnDelete ) )
            // InternalAccessesParser.g:5398:1: ( OnDelete )
            {
            // InternalAccessesParser.g:5398:1: ( OnDelete )
            // InternalAccessesParser.g:5399:2: OnDelete
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getOnDeleteKeyword_0()); 
            match(input,OnDelete,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getOnDeleteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1"
    // InternalAccessesParser.g:5408:1: rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1 : rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5412:1: ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2 )
            // InternalAccessesParser.g:5413:2: rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1__Impl"
    // InternalAccessesParser.g:5420:1: rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5424:1: ( ( Colon ) )
            // InternalAccessesParser.g:5425:1: ( Colon )
            {
            // InternalAccessesParser.g:5425:1: ( Colon )
            // InternalAccessesParser.g:5426:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2"
    // InternalAccessesParser.g:5435:1: rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2 : rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5439:1: ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2__Impl )
            // InternalAccessesParser.g:5440:2: rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2__Impl"
    // InternalAccessesParser.g:5446:1: rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5450:1: ( ( ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2 ) ) )
            // InternalAccessesParser.g:5451:1: ( ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2 ) )
            {
            // InternalAccessesParser.g:5451:1: ( ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2 ) )
            // InternalAccessesParser.g:5452:2: ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getOnDeleteAssignment_2()); 
            // InternalAccessesParser.g:5453:2: ( rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2 )
            // InternalAccessesParser.g:5453:3: rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getOnDeleteAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0"
    // InternalAccessesParser.g:5462:1: rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0 : rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5466:1: ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1 )
            // InternalAccessesParser.g:5467:2: rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0__Impl"
    // InternalAccessesParser.g:5474:1: rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0__Impl : ( OnAccess ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5478:1: ( ( OnAccess ) )
            // InternalAccessesParser.g:5479:1: ( OnAccess )
            {
            // InternalAccessesParser.g:5479:1: ( OnAccess )
            // InternalAccessesParser.g:5480:2: OnAccess
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getOnAccessKeyword_0()); 
            match(input,OnAccess,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getOnAccessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1"
    // InternalAccessesParser.g:5489:1: rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1 : rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5493:1: ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2 )
            // InternalAccessesParser.g:5494:2: rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1__Impl"
    // InternalAccessesParser.g:5501:1: rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5505:1: ( ( Colon ) )
            // InternalAccessesParser.g:5506:1: ( Colon )
            {
            // InternalAccessesParser.g:5506:1: ( Colon )
            // InternalAccessesParser.g:5507:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2"
    // InternalAccessesParser.g:5516:1: rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2 : rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5520:1: ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2__Impl )
            // InternalAccessesParser.g:5521:2: rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2__Impl"
    // InternalAccessesParser.g:5527:1: rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5531:1: ( ( ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2 ) ) )
            // InternalAccessesParser.g:5532:1: ( ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2 ) )
            {
            // InternalAccessesParser.g:5532:1: ( ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2 ) )
            // InternalAccessesParser.g:5533:2: ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getOnAccessAssignment_2()); 
            // InternalAccessesParser.g:5534:2: ( rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2 )
            // InternalAccessesParser.g:5534:3: rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getOnAccessAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0"
    // InternalAccessesParser.g:5543:1: rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0 : rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5547:1: ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1 )
            // InternalAccessesParser.g:5548:2: rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0__Impl"
    // InternalAccessesParser.g:5555:1: rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0__Impl : ( OnLoad ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5559:1: ( ( OnLoad ) )
            // InternalAccessesParser.g:5560:1: ( OnLoad )
            {
            // InternalAccessesParser.g:5560:1: ( OnLoad )
            // InternalAccessesParser.g:5561:2: OnLoad
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getOnLoadKeyword_0()); 
            match(input,OnLoad,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getOnLoadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1"
    // InternalAccessesParser.g:5570:1: rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1 : rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5574:1: ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2 )
            // InternalAccessesParser.g:5575:2: rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1__Impl"
    // InternalAccessesParser.g:5582:1: rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5586:1: ( ( Colon ) )
            // InternalAccessesParser.g:5587:1: ( Colon )
            {
            // InternalAccessesParser.g:5587:1: ( Colon )
            // InternalAccessesParser.g:5588:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2"
    // InternalAccessesParser.g:5597:1: rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2 : rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5601:1: ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2__Impl )
            // InternalAccessesParser.g:5602:2: rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2__Impl"
    // InternalAccessesParser.g:5608:1: rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5612:1: ( ( ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2 ) ) )
            // InternalAccessesParser.g:5613:1: ( ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2 ) )
            {
            // InternalAccessesParser.g:5613:1: ( ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2 ) )
            // InternalAccessesParser.g:5614:2: ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getOnLoadAssignment_2()); 
            // InternalAccessesParser.g:5615:2: ( rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2 )
            // InternalAccessesParser.g:5615:3: rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getOnLoadAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__2__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0"
    // InternalAccessesParser.g:5624:1: rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0 : rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5628:1: ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1 )
            // InternalAccessesParser.g:5629:2: rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0__Impl rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0__Impl"
    // InternalAccessesParser.g:5636:1: rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0__Impl : ( TimeTrigger ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5640:1: ( ( TimeTrigger ) )
            // InternalAccessesParser.g:5641:1: ( TimeTrigger )
            {
            // InternalAccessesParser.g:5641:1: ( TimeTrigger )
            // InternalAccessesParser.g:5642:2: TimeTrigger
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getTimeTriggerKeyword_0()); 
            match(input,TimeTrigger,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getTimeTriggerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1"
    // InternalAccessesParser.g:5651:1: rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1 : rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2 ;
    public final void rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5655:1: ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2 )
            // InternalAccessesParser.g:5656:2: rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1__Impl rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1__Impl"
    // InternalAccessesParser.g:5663:1: rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1__Impl : ( Colon ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5667:1: ( ( Colon ) )
            // InternalAccessesParser.g:5668:1: ( Colon )
            {
            // InternalAccessesParser.g:5668:1: ( Colon )
            // InternalAccessesParser.g:5669:2: Colon
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__1__Impl"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2"
    // InternalAccessesParser.g:5678:1: rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2 : rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2__Impl ;
    public final void rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5682:1: ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2__Impl )
            // InternalAccessesParser.g:5683:2: rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2__Impl"
    // InternalAccessesParser.g:5689:1: rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2__Impl : ( ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2 ) ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5693:1: ( ( ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2 ) ) )
            // InternalAccessesParser.g:5694:1: ( ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2 ) )
            {
            // InternalAccessesParser.g:5694:1: ( ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2 ) )
            // InternalAccessesParser.g:5695:2: ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2 )
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getTimeTriggerAssignment_2()); 
            // InternalAccessesParser.g:5696:2: ( rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2 )
            // InternalAccessesParser.g:5696:3: rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getTimeTriggerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__2__Impl"


    // $ANTLR start "rule__AccessesRoot__AccessesRootAssignment_2_0"
    // InternalAccessesParser.g:5705:1: rule__AccessesRoot__AccessesRootAssignment_2_0 : ( ruleAccessesRootPropertiesAbstract ) ;
    public final void rule__AccessesRoot__AccessesRootAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5709:1: ( ( ruleAccessesRootPropertiesAbstract ) )
            // InternalAccessesParser.g:5710:2: ( ruleAccessesRootPropertiesAbstract )
            {
            // InternalAccessesParser.g:5710:2: ( ruleAccessesRootPropertiesAbstract )
            // InternalAccessesParser.g:5711:3: ruleAccessesRootPropertiesAbstract
            {
             before(grammarAccess.getAccessesRootAccess().getAccessesRootAccessesRootPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootAccess().getAccessesRootAccessesRootPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__AccessesRootAssignment_2_0"


    // $ANTLR start "rule__AccessesRoot__AccessesRootAssignment_2_1_1"
    // InternalAccessesParser.g:5720:1: rule__AccessesRoot__AccessesRootAssignment_2_1_1 : ( ruleAccessesRootPropertiesAbstract ) ;
    public final void rule__AccessesRoot__AccessesRootAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5724:1: ( ( ruleAccessesRootPropertiesAbstract ) )
            // InternalAccessesParser.g:5725:2: ( ruleAccessesRootPropertiesAbstract )
            {
            // InternalAccessesParser.g:5725:2: ( ruleAccessesRootPropertiesAbstract )
            // InternalAccessesParser.g:5726:3: ruleAccessesRootPropertiesAbstract
            {
             before(grammarAccess.getAccessesRootAccess().getAccessesRootAccessesRootPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootAccess().getAccessesRootAccessesRootPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRoot__AccessesRootAssignment_2_1_1"


    // $ANTLR start "rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0"
    // InternalAccessesParser.g:5735:1: rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0 : ( ruleAccessesRootExternalAccessItems ) ;
    public final void rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5739:1: ( ( ruleAccessesRootExternalAccessItems ) )
            // InternalAccessesParser.g:5740:2: ( ruleAccessesRootExternalAccessItems )
            {
            // InternalAccessesParser.g:5740:2: ( ruleAccessesRootExternalAccessItems )
            // InternalAccessesParser.g:5741:3: ruleAccessesRootExternalAccessItems
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessAccessesRootExternalAccessItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItems();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessAccessesRootExternalAccessItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0"


    // $ANTLR start "rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1"
    // InternalAccessesParser.g:5750:1: rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1 : ( ruleAccessesRootExternalAccessItems ) ;
    public final void rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5754:1: ( ( ruleAccessesRootExternalAccessItems ) )
            // InternalAccessesParser.g:5755:2: ( ruleAccessesRootExternalAccessItems )
            {
            // InternalAccessesParser.g:5755:2: ( ruleAccessesRootExternalAccessItems )
            // InternalAccessesParser.g:5756:3: ruleAccessesRootExternalAccessItems
            {
             before(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessAccessesRootExternalAccessItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItems();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessAccessesRootExternalAccessItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0"
    // InternalAccessesParser.g:5765:1: rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0 : ( ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ;
    public final void rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5769:1: ( ( ruleAccessesRootExternalAccessItemsPropertiesAbstract ) )
            // InternalAccessesParser.g:5770:2: ( ruleAccessesRootExternalAccessItemsPropertiesAbstract )
            {
            // InternalAccessesParser.g:5770:2: ( ruleAccessesRootExternalAccessItemsPropertiesAbstract )
            // InternalAccessesParser.g:5771:3: ruleAccessesRootExternalAccessItemsPropertiesAbstract
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAccess().getItemsAccessesRootExternalAccessItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsAccess().getItemsAccessesRootExternalAccessItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1"
    // InternalAccessesParser.g:5780:1: rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1 : ( ruleAccessesRootExternalAccessItemsPropertiesAbstract ) ;
    public final void rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5784:1: ( ( ruleAccessesRootExternalAccessItemsPropertiesAbstract ) )
            // InternalAccessesParser.g:5785:2: ( ruleAccessesRootExternalAccessItemsPropertiesAbstract )
            {
            // InternalAccessesParser.g:5785:2: ( ruleAccessesRootExternalAccessItemsPropertiesAbstract )
            // InternalAccessesParser.g:5786:3: ruleAccessesRootExternalAccessItemsPropertiesAbstract
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAccess().getItemsAccessesRootExternalAccessItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsAccess().getItemsAccessesRootExternalAccessItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsName__NameAssignment_3"
    // InternalAccessesParser.g:5795:1: rule__AccessesRootExternalAccessItemsName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5799:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:5800:2: ( ruleEString )
            {
            // InternalAccessesParser.g:5800:2: ( ruleEString )
            // InternalAccessesParser.g:5801:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsName__NameAssignment_3"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsPath__PathAssignment_2"
    // InternalAccessesParser.g:5810:1: rule__AccessesRootExternalAccessItemsPath__PathAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsPath__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5814:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:5815:2: ( ruleEString )
            {
            // InternalAccessesParser.g:5815:2: ( ruleEString )
            // InternalAccessesParser.g:5816:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getPathEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getPathEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsPath__PathAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2"
    // InternalAccessesParser.g:5825:1: rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5829:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:5830:2: ( ruleEString )
            {
            // InternalAccessesParser.g:5830:2: ( ruleEString )
            // InternalAccessesParser.g:5831:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getOntologicalEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getOntologicalEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2"
    // InternalAccessesParser.g:5840:1: rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5844:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:5845:2: ( ruleEString )
            {
            // InternalAccessesParser.g:5845:2: ( ruleEString )
            // InternalAccessesParser.g:5846:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getClassnameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getClassnameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2"
    // InternalAccessesParser.g:5855:1: rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5859:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:5860:2: ( ruleEString )
            {
            // InternalAccessesParser.g:5860:2: ( ruleEString )
            // InternalAccessesParser.g:5861:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getMethodEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getMethodEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2"
    // InternalAccessesParser.g:5870:1: rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5874:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:5875:2: ( ruleEString )
            {
            // InternalAccessesParser.g:5875:2: ( ruleEString )
            // InternalAccessesParser.g:5876:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getAuthEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getAuthEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0"
    // InternalAccessesParser.g:5885:1: rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0 : ( ruleAccessesRootExternalAccessItemsInputItems ) ;
    public final void rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5889:1: ( ( ruleAccessesRootExternalAccessItemsInputItems ) )
            // InternalAccessesParser.g:5890:2: ( ruleAccessesRootExternalAccessItemsInputItems )
            {
            // InternalAccessesParser.g:5890:2: ( ruleAccessesRootExternalAccessItemsInputItems )
            // InternalAccessesParser.g:5891:3: ruleAccessesRootExternalAccessItemsInputItems
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputAccessesRootExternalAccessItemsInputItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsInputItems();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputAccessesRootExternalAccessItemsInputItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1"
    // InternalAccessesParser.g:5900:1: rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1 : ( ruleAccessesRootExternalAccessItemsInputItems ) ;
    public final void rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5904:1: ( ( ruleAccessesRootExternalAccessItemsInputItems ) )
            // InternalAccessesParser.g:5905:2: ( ruleAccessesRootExternalAccessItemsInputItems )
            {
            // InternalAccessesParser.g:5905:2: ( ruleAccessesRootExternalAccessItemsInputItems )
            // InternalAccessesParser.g:5906:3: ruleAccessesRootExternalAccessItemsInputItems
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputAccessesRootExternalAccessItemsInputItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsInputItems();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputAccessesRootExternalAccessItemsInputItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0"
    // InternalAccessesParser.g:5915:1: rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0 : ( ruleAccessesRootExternalAccessItemsOutputItems ) ;
    public final void rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5919:1: ( ( ruleAccessesRootExternalAccessItemsOutputItems ) )
            // InternalAccessesParser.g:5920:2: ( ruleAccessesRootExternalAccessItemsOutputItems )
            {
            // InternalAccessesParser.g:5920:2: ( ruleAccessesRootExternalAccessItemsOutputItems )
            // InternalAccessesParser.g:5921:3: ruleAccessesRootExternalAccessItemsOutputItems
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputAccessesRootExternalAccessItemsOutputItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsOutputItems();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputAccessesRootExternalAccessItemsOutputItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1"
    // InternalAccessesParser.g:5930:1: rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1 : ( ruleAccessesRootExternalAccessItemsOutputItems ) ;
    public final void rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5934:1: ( ( ruleAccessesRootExternalAccessItemsOutputItems ) )
            // InternalAccessesParser.g:5935:2: ( ruleAccessesRootExternalAccessItemsOutputItems )
            {
            // InternalAccessesParser.g:5935:2: ( ruleAccessesRootExternalAccessItemsOutputItems )
            // InternalAccessesParser.g:5936:3: ruleAccessesRootExternalAccessItemsOutputItems
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputAccessesRootExternalAccessItemsOutputItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsOutputItems();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputAccessesRootExternalAccessItemsOutputItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0"
    // InternalAccessesParser.g:5945:1: rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0 : ( ruleAccessesRootExternalAccessItemsBodyItems ) ;
    public final void rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5949:1: ( ( ruleAccessesRootExternalAccessItemsBodyItems ) )
            // InternalAccessesParser.g:5950:2: ( ruleAccessesRootExternalAccessItemsBodyItems )
            {
            // InternalAccessesParser.g:5950:2: ( ruleAccessesRootExternalAccessItemsBodyItems )
            // InternalAccessesParser.g:5951:3: ruleAccessesRootExternalAccessItemsBodyItems
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyAccessesRootExternalAccessItemsBodyItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsBodyItems();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyAccessesRootExternalAccessItemsBodyItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1"
    // InternalAccessesParser.g:5960:1: rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1 : ( ruleAccessesRootExternalAccessItemsBodyItems ) ;
    public final void rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5964:1: ( ( ruleAccessesRootExternalAccessItemsBodyItems ) )
            // InternalAccessesParser.g:5965:2: ( ruleAccessesRootExternalAccessItemsBodyItems )
            {
            // InternalAccessesParser.g:5965:2: ( ruleAccessesRootExternalAccessItemsBodyItems )
            // InternalAccessesParser.g:5966:3: ruleAccessesRootExternalAccessItemsBodyItems
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyAccessesRootExternalAccessItemsBodyItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsBodyItems();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyAccessesRootExternalAccessItemsBodyItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0"
    // InternalAccessesParser.g:5975:1: rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0 : ( ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5979:1: ( ( ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) )
            // InternalAccessesParser.g:5980:2: ( ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract )
            {
            // InternalAccessesParser.g:5980:2: ( ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract )
            // InternalAccessesParser.g:5981:3: ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerAccessesRootExternalAccessItemsTriggerPropertiesAbstractParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerAccessesRootExternalAccessItemsTriggerPropertiesAbstractParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1"
    // InternalAccessesParser.g:5990:1: rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1 : ( ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) ;
    public final void rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:5994:1: ( ( ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract ) )
            // InternalAccessesParser.g:5995:2: ( ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract )
            {
            // InternalAccessesParser.g:5995:2: ( ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract )
            // InternalAccessesParser.g:5996:3: ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerAccessesRootExternalAccessItemsTriggerPropertiesAbstractParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsTriggerPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerAccessesRootExternalAccessItemsTriggerPropertiesAbstractParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0"
    // InternalAccessesParser.g:6005:1: rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0 : ( ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6009:1: ( ( ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) )
            // InternalAccessesParser.g:6010:2: ( ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract )
            {
            // InternalAccessesParser.g:6010:2: ( ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract )
            // InternalAccessesParser.g:6011:3: ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getItemsAccessesRootExternalAccessItemsInputItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getItemsAccessesRootExternalAccessItemsInputItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1"
    // InternalAccessesParser.g:6020:1: rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1 : ( ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6024:1: ( ( ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract ) )
            // InternalAccessesParser.g:6025:2: ( ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract )
            {
            // InternalAccessesParser.g:6025:2: ( ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract )
            // InternalAccessesParser.g:6026:3: ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getItemsAccessesRootExternalAccessItemsInputItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsInputItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getItemsAccessesRootExternalAccessItemsInputItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2"
    // InternalAccessesParser.g:6035:1: rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6039:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:6040:2: ( ruleEString )
            {
            // InternalAccessesParser.g:6040:2: ( ruleEString )
            // InternalAccessesParser.g:6041:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getAttrEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getAttrEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2"
    // InternalAccessesParser.g:6050:1: rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6054:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:6055:2: ( ruleEString )
            {
            // InternalAccessesParser.g:6055:2: ( ruleEString )
            // InternalAccessesParser.g:6056:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getAPIInputEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getAPIInputEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2"
    // InternalAccessesParser.g:6065:1: rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6069:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:6070:2: ( ruleEString )
            {
            // InternalAccessesParser.g:6070:2: ( ruleEString )
            // InternalAccessesParser.g:6071:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getWayEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getWayEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2"
    // InternalAccessesParser.g:6080:1: rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6084:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:6085:2: ( ruleEString )
            {
            // InternalAccessesParser.g:6085:2: ( ruleEString )
            // InternalAccessesParser.g:6086:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getValueEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0"
    // InternalAccessesParser.g:6095:1: rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0 : ( ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6099:1: ( ( ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) )
            // InternalAccessesParser.g:6100:2: ( ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract )
            {
            // InternalAccessesParser.g:6100:2: ( ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract )
            // InternalAccessesParser.g:6101:3: ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getItemsAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getItemsAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1"
    // InternalAccessesParser.g:6110:1: rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1 : ( ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6114:1: ( ( ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract ) )
            // InternalAccessesParser.g:6115:2: ( ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract )
            {
            // InternalAccessesParser.g:6115:2: ( ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract )
            // InternalAccessesParser.g:6116:3: ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getItemsAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getItemsAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2"
    // InternalAccessesParser.g:6125:1: rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6129:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:6130:2: ( ruleEString )
            {
            // InternalAccessesParser.g:6130:2: ( ruleEString )
            // InternalAccessesParser.g:6131:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getAttrEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getAttrEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2"
    // InternalAccessesParser.g:6140:1: rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6144:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:6145:2: ( ruleEString )
            {
            // InternalAccessesParser.g:6145:2: ( ruleEString )
            // InternalAccessesParser.g:6146:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getAPIOutputEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getAPIOutputEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0"
    // InternalAccessesParser.g:6155:1: rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0 : ( ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6159:1: ( ( ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) )
            // InternalAccessesParser.g:6160:2: ( ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract )
            {
            // InternalAccessesParser.g:6160:2: ( ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract )
            // InternalAccessesParser.g:6161:3: ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getItemsAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getItemsAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1"
    // InternalAccessesParser.g:6170:1: rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1 : ( ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6174:1: ( ( ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract ) )
            // InternalAccessesParser.g:6175:2: ( ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract )
            {
            // InternalAccessesParser.g:6175:2: ( ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract )
            // InternalAccessesParser.g:6176:3: ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getItemsAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getItemsAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2"
    // InternalAccessesParser.g:6185:1: rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6189:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:6190:2: ( ruleEString )
            {
            // InternalAccessesParser.g:6190:2: ( ruleEString )
            // InternalAccessesParser.g:6191:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getAttrEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getAttrEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2"
    // InternalAccessesParser.g:6200:1: rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2 : ( ruleEString ) ;
    public final void rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6204:1: ( ( ruleEString ) )
            // InternalAccessesParser.g:6205:2: ( ruleEString )
            {
            // InternalAccessesParser.g:6205:2: ( ruleEString )
            // InternalAccessesParser.g:6206:3: ruleEString
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getAPIBodyEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getAPIBodyEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2"
    // InternalAccessesParser.g:6215:1: rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6219:1: ( ( ruleEBooleanObject ) )
            // InternalAccessesParser.g:6220:2: ( ruleEBooleanObject )
            {
            // InternalAccessesParser.g:6220:2: ( ruleEBooleanObject )
            // InternalAccessesParser.g:6221:3: ruleEBooleanObject
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getOnChangeEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getOnChangeEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2"
    // InternalAccessesParser.g:6230:1: rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6234:1: ( ( ruleEBooleanObject ) )
            // InternalAccessesParser.g:6235:2: ( ruleEBooleanObject )
            {
            // InternalAccessesParser.g:6235:2: ( ruleEBooleanObject )
            // InternalAccessesParser.g:6236:3: ruleEBooleanObject
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getOnCreateEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getOnCreateEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2"
    // InternalAccessesParser.g:6245:1: rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6249:1: ( ( ruleEBooleanObject ) )
            // InternalAccessesParser.g:6250:2: ( ruleEBooleanObject )
            {
            // InternalAccessesParser.g:6250:2: ( ruleEBooleanObject )
            // InternalAccessesParser.g:6251:3: ruleEBooleanObject
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getOnMoveEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getOnMoveEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2"
    // InternalAccessesParser.g:6260:1: rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6264:1: ( ( ruleEBooleanObject ) )
            // InternalAccessesParser.g:6265:2: ( ruleEBooleanObject )
            {
            // InternalAccessesParser.g:6265:2: ( ruleEBooleanObject )
            // InternalAccessesParser.g:6266:3: ruleEBooleanObject
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getOnDeleteEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getOnDeleteEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2"
    // InternalAccessesParser.g:6275:1: rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6279:1: ( ( ruleEBooleanObject ) )
            // InternalAccessesParser.g:6280:2: ( ruleEBooleanObject )
            {
            // InternalAccessesParser.g:6280:2: ( ruleEBooleanObject )
            // InternalAccessesParser.g:6281:3: ruleEBooleanObject
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getOnAccessEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getOnAccessEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2"
    // InternalAccessesParser.g:6290:1: rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6294:1: ( ( ruleEBooleanObject ) )
            // InternalAccessesParser.g:6295:2: ( ruleEBooleanObject )
            {
            // InternalAccessesParser.g:6295:2: ( ruleEBooleanObject )
            // InternalAccessesParser.g:6296:3: ruleEBooleanObject
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getOnLoadEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getOnLoadEBooleanObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2"


    // $ANTLR start "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2"
    // InternalAccessesParser.g:6305:1: rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2 : ( ruleEDoubleObject ) ;
    public final void rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAccessesParser.g:6309:1: ( ( ruleEDoubleObject ) )
            // InternalAccessesParser.g:6310:2: ( ruleEDoubleObject )
            {
            // InternalAccessesParser.g:6310:2: ( ruleEDoubleObject )
            // InternalAccessesParser.g:6311:3: ruleEDoubleObject
            {
             before(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getTimeTriggerEDoubleObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getTimeTriggerEDoubleObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000807998120L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007998120L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000200FFFFFF0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800063C40L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000063C40L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000808600200L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008600200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800400080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800404000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000C000000000L});

}