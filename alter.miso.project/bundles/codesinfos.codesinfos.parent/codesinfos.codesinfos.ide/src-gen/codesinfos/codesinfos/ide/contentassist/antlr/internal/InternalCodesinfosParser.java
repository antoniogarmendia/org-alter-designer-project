package codesinfos.codesinfos.ide.contentassist.antlr.internal;
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
import codesinfos.codesinfos.services.CodesinfosGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCodesinfosParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Name", "'\"name\"'");
    		tokenNameToValue.put("Codes", "'\"codes\"'");
    		tokenNameToValue.put("Nodename", "'\"nodename\"'");
    		tokenNameToValue.put("Classname", "'\"classname\"'");
    	}

    	public void setGrammarAccess(CodesinfosGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCodesinfosRoot"
    // InternalCodesinfosParser.g:65:1: entryRuleCodesinfosRoot : ruleCodesinfosRoot EOF ;
    public final void entryRuleCodesinfosRoot() throws RecognitionException {
        try {
            // InternalCodesinfosParser.g:66:1: ( ruleCodesinfosRoot EOF )
            // InternalCodesinfosParser.g:67:1: ruleCodesinfosRoot EOF
            {
             before(grammarAccess.getCodesinfosRootRule()); 
            pushFollow(FOLLOW_1);
            ruleCodesinfosRoot();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootRule()); 
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
    // $ANTLR end "entryRuleCodesinfosRoot"


    // $ANTLR start "ruleCodesinfosRoot"
    // InternalCodesinfosParser.g:74:1: ruleCodesinfosRoot : ( ( rule__CodesinfosRoot__Group__0 ) ) ;
    public final void ruleCodesinfosRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:78:2: ( ( ( rule__CodesinfosRoot__Group__0 ) ) )
            // InternalCodesinfosParser.g:79:2: ( ( rule__CodesinfosRoot__Group__0 ) )
            {
            // InternalCodesinfosParser.g:79:2: ( ( rule__CodesinfosRoot__Group__0 ) )
            // InternalCodesinfosParser.g:80:3: ( rule__CodesinfosRoot__Group__0 )
            {
             before(grammarAccess.getCodesinfosRootAccess().getGroup()); 
            // InternalCodesinfosParser.g:81:3: ( rule__CodesinfosRoot__Group__0 )
            // InternalCodesinfosParser.g:81:4: rule__CodesinfosRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodesinfosRoot"


    // $ANTLR start "entryRuleCodesinfosRootPropertiesAbstract"
    // InternalCodesinfosParser.g:90:1: entryRuleCodesinfosRootPropertiesAbstract : ruleCodesinfosRootPropertiesAbstract EOF ;
    public final void entryRuleCodesinfosRootPropertiesAbstract() throws RecognitionException {
        try {
            // InternalCodesinfosParser.g:91:1: ( ruleCodesinfosRootPropertiesAbstract EOF )
            // InternalCodesinfosParser.g:92:1: ruleCodesinfosRootPropertiesAbstract EOF
            {
             before(grammarAccess.getCodesinfosRootPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleCodesinfosRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleCodesinfosRootPropertiesAbstract"


    // $ANTLR start "ruleCodesinfosRootPropertiesAbstract"
    // InternalCodesinfosParser.g:99:1: ruleCodesinfosRootPropertiesAbstract : ( ( rule__CodesinfosRootPropertiesAbstract__Alternatives ) ) ;
    public final void ruleCodesinfosRootPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:103:2: ( ( ( rule__CodesinfosRootPropertiesAbstract__Alternatives ) ) )
            // InternalCodesinfosParser.g:104:2: ( ( rule__CodesinfosRootPropertiesAbstract__Alternatives ) )
            {
            // InternalCodesinfosParser.g:104:2: ( ( rule__CodesinfosRootPropertiesAbstract__Alternatives ) )
            // InternalCodesinfosParser.g:105:3: ( rule__CodesinfosRootPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getCodesinfosRootPropertiesAbstractAccess().getAlternatives()); 
            // InternalCodesinfosParser.g:106:3: ( rule__CodesinfosRootPropertiesAbstract__Alternatives )
            // InternalCodesinfosParser.g:106:4: rule__CodesinfosRootPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodesinfosRootPropertiesAbstract"


    // $ANTLR start "entryRuleCodesinfosRootCodesItemsPropertiesAbstract"
    // InternalCodesinfosParser.g:115:1: entryRuleCodesinfosRootCodesItemsPropertiesAbstract : ruleCodesinfosRootCodesItemsPropertiesAbstract EOF ;
    public final void entryRuleCodesinfosRootCodesItemsPropertiesAbstract() throws RecognitionException {
        try {
            // InternalCodesinfosParser.g:116:1: ( ruleCodesinfosRootCodesItemsPropertiesAbstract EOF )
            // InternalCodesinfosParser.g:117:1: ruleCodesinfosRootCodesItemsPropertiesAbstract EOF
            {
             before(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleCodesinfosRootCodesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleCodesinfosRootCodesItemsPropertiesAbstract"


    // $ANTLR start "ruleCodesinfosRootCodesItemsPropertiesAbstract"
    // InternalCodesinfosParser.g:124:1: ruleCodesinfosRootCodesItemsPropertiesAbstract : ( ( rule__CodesinfosRootCodesItemsPropertiesAbstract__Alternatives ) ) ;
    public final void ruleCodesinfosRootCodesItemsPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:128:2: ( ( ( rule__CodesinfosRootCodesItemsPropertiesAbstract__Alternatives ) ) )
            // InternalCodesinfosParser.g:129:2: ( ( rule__CodesinfosRootCodesItemsPropertiesAbstract__Alternatives ) )
            {
            // InternalCodesinfosParser.g:129:2: ( ( rule__CodesinfosRootCodesItemsPropertiesAbstract__Alternatives ) )
            // InternalCodesinfosParser.g:130:3: ( rule__CodesinfosRootCodesItemsPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractAccess().getAlternatives()); 
            // InternalCodesinfosParser.g:131:3: ( rule__CodesinfosRootCodesItemsPropertiesAbstract__Alternatives )
            // InternalCodesinfosParser.g:131:4: rule__CodesinfosRootCodesItemsPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodesinfosRootCodesItemsPropertiesAbstract"


    // $ANTLR start "entryRuleCodesinfosRootName"
    // InternalCodesinfosParser.g:140:1: entryRuleCodesinfosRootName : ruleCodesinfosRootName EOF ;
    public final void entryRuleCodesinfosRootName() throws RecognitionException {
        try {
            // InternalCodesinfosParser.g:141:1: ( ruleCodesinfosRootName EOF )
            // InternalCodesinfosParser.g:142:1: ruleCodesinfosRootName EOF
            {
             before(grammarAccess.getCodesinfosRootNameRule()); 
            pushFollow(FOLLOW_1);
            ruleCodesinfosRootName();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootNameRule()); 
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
    // $ANTLR end "entryRuleCodesinfosRootName"


    // $ANTLR start "ruleCodesinfosRootName"
    // InternalCodesinfosParser.g:149:1: ruleCodesinfosRootName : ( ( rule__CodesinfosRootName__Group__0 ) ) ;
    public final void ruleCodesinfosRootName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:153:2: ( ( ( rule__CodesinfosRootName__Group__0 ) ) )
            // InternalCodesinfosParser.g:154:2: ( ( rule__CodesinfosRootName__Group__0 ) )
            {
            // InternalCodesinfosParser.g:154:2: ( ( rule__CodesinfosRootName__Group__0 ) )
            // InternalCodesinfosParser.g:155:3: ( rule__CodesinfosRootName__Group__0 )
            {
             before(grammarAccess.getCodesinfosRootNameAccess().getGroup()); 
            // InternalCodesinfosParser.g:156:3: ( rule__CodesinfosRootName__Group__0 )
            // InternalCodesinfosParser.g:156:4: rule__CodesinfosRootName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodesinfosRootName"


    // $ANTLR start "entryRuleCodesinfosRootCodes"
    // InternalCodesinfosParser.g:165:1: entryRuleCodesinfosRootCodes : ruleCodesinfosRootCodes EOF ;
    public final void entryRuleCodesinfosRootCodes() throws RecognitionException {
        try {
            // InternalCodesinfosParser.g:166:1: ( ruleCodesinfosRootCodes EOF )
            // InternalCodesinfosParser.g:167:1: ruleCodesinfosRootCodes EOF
            {
             before(grammarAccess.getCodesinfosRootCodesRule()); 
            pushFollow(FOLLOW_1);
            ruleCodesinfosRootCodes();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesRule()); 
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
    // $ANTLR end "entryRuleCodesinfosRootCodes"


    // $ANTLR start "ruleCodesinfosRootCodes"
    // InternalCodesinfosParser.g:174:1: ruleCodesinfosRootCodes : ( ( rule__CodesinfosRootCodes__Group__0 ) ) ;
    public final void ruleCodesinfosRootCodes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:178:2: ( ( ( rule__CodesinfosRootCodes__Group__0 ) ) )
            // InternalCodesinfosParser.g:179:2: ( ( rule__CodesinfosRootCodes__Group__0 ) )
            {
            // InternalCodesinfosParser.g:179:2: ( ( rule__CodesinfosRootCodes__Group__0 ) )
            // InternalCodesinfosParser.g:180:3: ( rule__CodesinfosRootCodes__Group__0 )
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getGroup()); 
            // InternalCodesinfosParser.g:181:3: ( rule__CodesinfosRootCodes__Group__0 )
            // InternalCodesinfosParser.g:181:4: rule__CodesinfosRootCodes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodesinfosRootCodes"


    // $ANTLR start "entryRuleEString"
    // InternalCodesinfosParser.g:190:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCodesinfosParser.g:191:1: ( ruleEString EOF )
            // InternalCodesinfosParser.g:192:1: ruleEString EOF
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
    // InternalCodesinfosParser.g:199:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:203:2: ( ( ruleVALID_STRING ) )
            // InternalCodesinfosParser.g:204:2: ( ruleVALID_STRING )
            {
            // InternalCodesinfosParser.g:204:2: ( ruleVALID_STRING )
            // InternalCodesinfosParser.g:205:3: ruleVALID_STRING
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


    // $ANTLR start "entryRuleCodesinfosRootCodesItems"
    // InternalCodesinfosParser.g:215:1: entryRuleCodesinfosRootCodesItems : ruleCodesinfosRootCodesItems EOF ;
    public final void entryRuleCodesinfosRootCodesItems() throws RecognitionException {
        try {
            // InternalCodesinfosParser.g:216:1: ( ruleCodesinfosRootCodesItems EOF )
            // InternalCodesinfosParser.g:217:1: ruleCodesinfosRootCodesItems EOF
            {
             before(grammarAccess.getCodesinfosRootCodesItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleCodesinfosRootCodesItems();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesItemsRule()); 
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
    // $ANTLR end "entryRuleCodesinfosRootCodesItems"


    // $ANTLR start "ruleCodesinfosRootCodesItems"
    // InternalCodesinfosParser.g:224:1: ruleCodesinfosRootCodesItems : ( ( rule__CodesinfosRootCodesItems__Group__0 ) ) ;
    public final void ruleCodesinfosRootCodesItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:228:2: ( ( ( rule__CodesinfosRootCodesItems__Group__0 ) ) )
            // InternalCodesinfosParser.g:229:2: ( ( rule__CodesinfosRootCodesItems__Group__0 ) )
            {
            // InternalCodesinfosParser.g:229:2: ( ( rule__CodesinfosRootCodesItems__Group__0 ) )
            // InternalCodesinfosParser.g:230:3: ( rule__CodesinfosRootCodesItems__Group__0 )
            {
             before(grammarAccess.getCodesinfosRootCodesItemsAccess().getGroup()); 
            // InternalCodesinfosParser.g:231:3: ( rule__CodesinfosRootCodesItems__Group__0 )
            // InternalCodesinfosParser.g:231:4: rule__CodesinfosRootCodesItems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesItemsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodesinfosRootCodesItems"


    // $ANTLR start "entryRuleCodesinfosRootCodesItemsName"
    // InternalCodesinfosParser.g:240:1: entryRuleCodesinfosRootCodesItemsName : ruleCodesinfosRootCodesItemsName EOF ;
    public final void entryRuleCodesinfosRootCodesItemsName() throws RecognitionException {
        try {
            // InternalCodesinfosParser.g:241:1: ( ruleCodesinfosRootCodesItemsName EOF )
            // InternalCodesinfosParser.g:242:1: ruleCodesinfosRootCodesItemsName EOF
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNameRule()); 
            pushFollow(FOLLOW_1);
            ruleCodesinfosRootCodesItemsName();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesItemsNameRule()); 
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
    // $ANTLR end "entryRuleCodesinfosRootCodesItemsName"


    // $ANTLR start "ruleCodesinfosRootCodesItemsName"
    // InternalCodesinfosParser.g:249:1: ruleCodesinfosRootCodesItemsName : ( ( rule__CodesinfosRootCodesItemsName__Group__0 ) ) ;
    public final void ruleCodesinfosRootCodesItemsName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:253:2: ( ( ( rule__CodesinfosRootCodesItemsName__Group__0 ) ) )
            // InternalCodesinfosParser.g:254:2: ( ( rule__CodesinfosRootCodesItemsName__Group__0 ) )
            {
            // InternalCodesinfosParser.g:254:2: ( ( rule__CodesinfosRootCodesItemsName__Group__0 ) )
            // InternalCodesinfosParser.g:255:3: ( rule__CodesinfosRootCodesItemsName__Group__0 )
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getGroup()); 
            // InternalCodesinfosParser.g:256:3: ( rule__CodesinfosRootCodesItemsName__Group__0 )
            // InternalCodesinfosParser.g:256:4: rule__CodesinfosRootCodesItemsName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodesinfosRootCodesItemsName"


    // $ANTLR start "entryRuleCodesinfosRootCodesItemsClassname"
    // InternalCodesinfosParser.g:265:1: entryRuleCodesinfosRootCodesItemsClassname : ruleCodesinfosRootCodesItemsClassname EOF ;
    public final void entryRuleCodesinfosRootCodesItemsClassname() throws RecognitionException {
        try {
            // InternalCodesinfosParser.g:266:1: ( ruleCodesinfosRootCodesItemsClassname EOF )
            // InternalCodesinfosParser.g:267:1: ruleCodesinfosRootCodesItemsClassname EOF
            {
             before(grammarAccess.getCodesinfosRootCodesItemsClassnameRule()); 
            pushFollow(FOLLOW_1);
            ruleCodesinfosRootCodesItemsClassname();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesItemsClassnameRule()); 
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
    // $ANTLR end "entryRuleCodesinfosRootCodesItemsClassname"


    // $ANTLR start "ruleCodesinfosRootCodesItemsClassname"
    // InternalCodesinfosParser.g:274:1: ruleCodesinfosRootCodesItemsClassname : ( ( rule__CodesinfosRootCodesItemsClassname__Group__0 ) ) ;
    public final void ruleCodesinfosRootCodesItemsClassname() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:278:2: ( ( ( rule__CodesinfosRootCodesItemsClassname__Group__0 ) ) )
            // InternalCodesinfosParser.g:279:2: ( ( rule__CodesinfosRootCodesItemsClassname__Group__0 ) )
            {
            // InternalCodesinfosParser.g:279:2: ( ( rule__CodesinfosRootCodesItemsClassname__Group__0 ) )
            // InternalCodesinfosParser.g:280:3: ( rule__CodesinfosRootCodesItemsClassname__Group__0 )
            {
             before(grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getGroup()); 
            // InternalCodesinfosParser.g:281:3: ( rule__CodesinfosRootCodesItemsClassname__Group__0 )
            // InternalCodesinfosParser.g:281:4: rule__CodesinfosRootCodesItemsClassname__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsClassname__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodesinfosRootCodesItemsClassname"


    // $ANTLR start "entryRuleCodesinfosRootCodesItemsNodename"
    // InternalCodesinfosParser.g:290:1: entryRuleCodesinfosRootCodesItemsNodename : ruleCodesinfosRootCodesItemsNodename EOF ;
    public final void entryRuleCodesinfosRootCodesItemsNodename() throws RecognitionException {
        try {
            // InternalCodesinfosParser.g:291:1: ( ruleCodesinfosRootCodesItemsNodename EOF )
            // InternalCodesinfosParser.g:292:1: ruleCodesinfosRootCodesItemsNodename EOF
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNodenameRule()); 
            pushFollow(FOLLOW_1);
            ruleCodesinfosRootCodesItemsNodename();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesItemsNodenameRule()); 
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
    // $ANTLR end "entryRuleCodesinfosRootCodesItemsNodename"


    // $ANTLR start "ruleCodesinfosRootCodesItemsNodename"
    // InternalCodesinfosParser.g:299:1: ruleCodesinfosRootCodesItemsNodename : ( ( rule__CodesinfosRootCodesItemsNodename__Group__0 ) ) ;
    public final void ruleCodesinfosRootCodesItemsNodename() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:303:2: ( ( ( rule__CodesinfosRootCodesItemsNodename__Group__0 ) ) )
            // InternalCodesinfosParser.g:304:2: ( ( rule__CodesinfosRootCodesItemsNodename__Group__0 ) )
            {
            // InternalCodesinfosParser.g:304:2: ( ( rule__CodesinfosRootCodesItemsNodename__Group__0 ) )
            // InternalCodesinfosParser.g:305:3: ( rule__CodesinfosRootCodesItemsNodename__Group__0 )
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getGroup()); 
            // InternalCodesinfosParser.g:306:3: ( rule__CodesinfosRootCodesItemsNodename__Group__0 )
            // InternalCodesinfosParser.g:306:4: rule__CodesinfosRootCodesItemsNodename__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsNodename__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodesinfosRootCodesItemsNodename"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalCodesinfosParser.g:315:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalCodesinfosParser.g:316:1: ( ruleVALID_STRING EOF )
            // InternalCodesinfosParser.g:317:1: ruleVALID_STRING EOF
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
    // InternalCodesinfosParser.g:324:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:328:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalCodesinfosParser.g:329:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalCodesinfosParser.g:329:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalCodesinfosParser.g:330:3: ( rule__VALID_STRING__Alternatives )
            {
             before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            // InternalCodesinfosParser.g:331:3: ( rule__VALID_STRING__Alternatives )
            // InternalCodesinfosParser.g:331:4: rule__VALID_STRING__Alternatives
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
    // InternalCodesinfosParser.g:340:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalCodesinfosParser.g:341:1: ( ruleKEYWORD EOF )
            // InternalCodesinfosParser.g:342:1: ruleKEYWORD EOF
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
    // InternalCodesinfosParser.g:349:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:353:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalCodesinfosParser.g:354:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalCodesinfosParser.g:354:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalCodesinfosParser.g:355:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalCodesinfosParser.g:356:3: ( rule__KEYWORD__Alternatives )
            // InternalCodesinfosParser.g:356:4: rule__KEYWORD__Alternatives
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


    // $ANTLR start "rule__CodesinfosRootPropertiesAbstract__Alternatives"
    // InternalCodesinfosParser.g:364:1: rule__CodesinfosRootPropertiesAbstract__Alternatives : ( ( ruleCodesinfosRootName ) | ( ruleCodesinfosRootCodes ) );
    public final void rule__CodesinfosRootPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:368:1: ( ( ruleCodesinfosRootName ) | ( ruleCodesinfosRootCodes ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Name) ) {
                alt1=1;
            }
            else if ( (LA1_0==Codes) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCodesinfosParser.g:369:2: ( ruleCodesinfosRootName )
                    {
                    // InternalCodesinfosParser.g:369:2: ( ruleCodesinfosRootName )
                    // InternalCodesinfosParser.g:370:3: ruleCodesinfosRootName
                    {
                     before(grammarAccess.getCodesinfosRootPropertiesAbstractAccess().getCodesinfosRootNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCodesinfosRootName();

                    state._fsp--;

                     after(grammarAccess.getCodesinfosRootPropertiesAbstractAccess().getCodesinfosRootNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCodesinfosParser.g:375:2: ( ruleCodesinfosRootCodes )
                    {
                    // InternalCodesinfosParser.g:375:2: ( ruleCodesinfosRootCodes )
                    // InternalCodesinfosParser.g:376:3: ruleCodesinfosRootCodes
                    {
                     before(grammarAccess.getCodesinfosRootPropertiesAbstractAccess().getCodesinfosRootCodesParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCodesinfosRootCodes();

                    state._fsp--;

                     after(grammarAccess.getCodesinfosRootPropertiesAbstractAccess().getCodesinfosRootCodesParserRuleCall_1()); 

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
    // $ANTLR end "rule__CodesinfosRootPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__CodesinfosRootCodesItemsPropertiesAbstract__Alternatives"
    // InternalCodesinfosParser.g:385:1: rule__CodesinfosRootCodesItemsPropertiesAbstract__Alternatives : ( ( ruleCodesinfosRootCodesItemsName ) | ( ruleCodesinfosRootCodesItemsClassname ) | ( ruleCodesinfosRootCodesItemsNodename ) );
    public final void rule__CodesinfosRootCodesItemsPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:389:1: ( ( ruleCodesinfosRootCodesItemsName ) | ( ruleCodesinfosRootCodesItemsClassname ) | ( ruleCodesinfosRootCodesItemsNodename ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt2=1;
                }
                break;
            case Classname:
                {
                alt2=2;
                }
                break;
            case Nodename:
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
                    // InternalCodesinfosParser.g:390:2: ( ruleCodesinfosRootCodesItemsName )
                    {
                    // InternalCodesinfosParser.g:390:2: ( ruleCodesinfosRootCodesItemsName )
                    // InternalCodesinfosParser.g:391:3: ruleCodesinfosRootCodesItemsName
                    {
                     before(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractAccess().getCodesinfosRootCodesItemsNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCodesinfosRootCodesItemsName();

                    state._fsp--;

                     after(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractAccess().getCodesinfosRootCodesItemsNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCodesinfosParser.g:396:2: ( ruleCodesinfosRootCodesItemsClassname )
                    {
                    // InternalCodesinfosParser.g:396:2: ( ruleCodesinfosRootCodesItemsClassname )
                    // InternalCodesinfosParser.g:397:3: ruleCodesinfosRootCodesItemsClassname
                    {
                     before(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractAccess().getCodesinfosRootCodesItemsClassnameParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCodesinfosRootCodesItemsClassname();

                    state._fsp--;

                     after(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractAccess().getCodesinfosRootCodesItemsClassnameParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCodesinfosParser.g:402:2: ( ruleCodesinfosRootCodesItemsNodename )
                    {
                    // InternalCodesinfosParser.g:402:2: ( ruleCodesinfosRootCodesItemsNodename )
                    // InternalCodesinfosParser.g:403:3: ruleCodesinfosRootCodesItemsNodename
                    {
                     before(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractAccess().getCodesinfosRootCodesItemsNodenameParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCodesinfosRootCodesItemsNodename();

                    state._fsp--;

                     after(grammarAccess.getCodesinfosRootCodesItemsPropertiesAbstractAccess().getCodesinfosRootCodesItemsNodenameParserRuleCall_2()); 

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
    // $ANTLR end "rule__CodesinfosRootCodesItemsPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__VALID_STRING__Alternatives"
    // InternalCodesinfosParser.g:412:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:416:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=Classname && LA3_0<=Name)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCodesinfosParser.g:417:2: ( RULE_STRING )
                    {
                    // InternalCodesinfosParser.g:417:2: ( RULE_STRING )
                    // InternalCodesinfosParser.g:418:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCodesinfosParser.g:423:2: ( ruleKEYWORD )
                    {
                    // InternalCodesinfosParser.g:423:2: ( ruleKEYWORD )
                    // InternalCodesinfosParser.g:424:3: ruleKEYWORD
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
    // InternalCodesinfosParser.g:433:1: rule__KEYWORD__Alternatives : ( ( Codes ) | ( Nodename ) | ( Classname ) | ( Name ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:437:1: ( ( Codes ) | ( Nodename ) | ( Classname ) | ( Name ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case Codes:
                {
                alt4=1;
                }
                break;
            case Nodename:
                {
                alt4=2;
                }
                break;
            case Classname:
                {
                alt4=3;
                }
                break;
            case Name:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCodesinfosParser.g:438:2: ( Codes )
                    {
                    // InternalCodesinfosParser.g:438:2: ( Codes )
                    // InternalCodesinfosParser.g:439:3: Codes
                    {
                     before(grammarAccess.getKEYWORDAccess().getCodesKeyword_0()); 
                    match(input,Codes,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getCodesKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCodesinfosParser.g:444:2: ( Nodename )
                    {
                    // InternalCodesinfosParser.g:444:2: ( Nodename )
                    // InternalCodesinfosParser.g:445:3: Nodename
                    {
                     before(grammarAccess.getKEYWORDAccess().getNodenameKeyword_1()); 
                    match(input,Nodename,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNodenameKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCodesinfosParser.g:450:2: ( Classname )
                    {
                    // InternalCodesinfosParser.g:450:2: ( Classname )
                    // InternalCodesinfosParser.g:451:3: Classname
                    {
                     before(grammarAccess.getKEYWORDAccess().getClassnameKeyword_2()); 
                    match(input,Classname,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getClassnameKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCodesinfosParser.g:456:2: ( Name )
                    {
                    // InternalCodesinfosParser.g:456:2: ( Name )
                    // InternalCodesinfosParser.g:457:3: Name
                    {
                     before(grammarAccess.getKEYWORDAccess().getNameKeyword_3()); 
                    match(input,Name,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNameKeyword_3()); 

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


    // $ANTLR start "rule__CodesinfosRoot__Group__0"
    // InternalCodesinfosParser.g:466:1: rule__CodesinfosRoot__Group__0 : rule__CodesinfosRoot__Group__0__Impl rule__CodesinfosRoot__Group__1 ;
    public final void rule__CodesinfosRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:470:1: ( rule__CodesinfosRoot__Group__0__Impl rule__CodesinfosRoot__Group__1 )
            // InternalCodesinfosParser.g:471:2: rule__CodesinfosRoot__Group__0__Impl rule__CodesinfosRoot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CodesinfosRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRoot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group__0"


    // $ANTLR start "rule__CodesinfosRoot__Group__0__Impl"
    // InternalCodesinfosParser.g:478:1: rule__CodesinfosRoot__Group__0__Impl : ( () ) ;
    public final void rule__CodesinfosRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:482:1: ( ( () ) )
            // InternalCodesinfosParser.g:483:1: ( () )
            {
            // InternalCodesinfosParser.g:483:1: ( () )
            // InternalCodesinfosParser.g:484:2: ()
            {
             before(grammarAccess.getCodesinfosRootAccess().getCodesinfosRootAction_0()); 
            // InternalCodesinfosParser.g:485:2: ()
            // InternalCodesinfosParser.g:485:3: 
            {
            }

             after(grammarAccess.getCodesinfosRootAccess().getCodesinfosRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group__0__Impl"


    // $ANTLR start "rule__CodesinfosRoot__Group__1"
    // InternalCodesinfosParser.g:493:1: rule__CodesinfosRoot__Group__1 : rule__CodesinfosRoot__Group__1__Impl rule__CodesinfosRoot__Group__2 ;
    public final void rule__CodesinfosRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:497:1: ( rule__CodesinfosRoot__Group__1__Impl rule__CodesinfosRoot__Group__2 )
            // InternalCodesinfosParser.g:498:2: rule__CodesinfosRoot__Group__1__Impl rule__CodesinfosRoot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CodesinfosRoot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRoot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group__1"


    // $ANTLR start "rule__CodesinfosRoot__Group__1__Impl"
    // InternalCodesinfosParser.g:505:1: rule__CodesinfosRoot__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__CodesinfosRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:509:1: ( ( LeftCurlyBracket ) )
            // InternalCodesinfosParser.g:510:1: ( LeftCurlyBracket )
            {
            // InternalCodesinfosParser.g:510:1: ( LeftCurlyBracket )
            // InternalCodesinfosParser.g:511:2: LeftCurlyBracket
            {
             before(grammarAccess.getCodesinfosRootAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group__1__Impl"


    // $ANTLR start "rule__CodesinfosRoot__Group__2"
    // InternalCodesinfosParser.g:520:1: rule__CodesinfosRoot__Group__2 : rule__CodesinfosRoot__Group__2__Impl rule__CodesinfosRoot__Group__3 ;
    public final void rule__CodesinfosRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:524:1: ( rule__CodesinfosRoot__Group__2__Impl rule__CodesinfosRoot__Group__3 )
            // InternalCodesinfosParser.g:525:2: rule__CodesinfosRoot__Group__2__Impl rule__CodesinfosRoot__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CodesinfosRoot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRoot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group__2"


    // $ANTLR start "rule__CodesinfosRoot__Group__2__Impl"
    // InternalCodesinfosParser.g:532:1: rule__CodesinfosRoot__Group__2__Impl : ( ( rule__CodesinfosRoot__Group_2__0 )? ) ;
    public final void rule__CodesinfosRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:536:1: ( ( ( rule__CodesinfosRoot__Group_2__0 )? ) )
            // InternalCodesinfosParser.g:537:1: ( ( rule__CodesinfosRoot__Group_2__0 )? )
            {
            // InternalCodesinfosParser.g:537:1: ( ( rule__CodesinfosRoot__Group_2__0 )? )
            // InternalCodesinfosParser.g:538:2: ( rule__CodesinfosRoot__Group_2__0 )?
            {
             before(grammarAccess.getCodesinfosRootAccess().getGroup_2()); 
            // InternalCodesinfosParser.g:539:2: ( rule__CodesinfosRoot__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=Codes && LA5_0<=Name)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCodesinfosParser.g:539:3: rule__CodesinfosRoot__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CodesinfosRoot__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodesinfosRootAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group__2__Impl"


    // $ANTLR start "rule__CodesinfosRoot__Group__3"
    // InternalCodesinfosParser.g:547:1: rule__CodesinfosRoot__Group__3 : rule__CodesinfosRoot__Group__3__Impl ;
    public final void rule__CodesinfosRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:551:1: ( rule__CodesinfosRoot__Group__3__Impl )
            // InternalCodesinfosParser.g:552:2: rule__CodesinfosRoot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRoot__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group__3"


    // $ANTLR start "rule__CodesinfosRoot__Group__3__Impl"
    // InternalCodesinfosParser.g:558:1: rule__CodesinfosRoot__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__CodesinfosRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:562:1: ( ( RightCurlyBracket ) )
            // InternalCodesinfosParser.g:563:1: ( RightCurlyBracket )
            {
            // InternalCodesinfosParser.g:563:1: ( RightCurlyBracket )
            // InternalCodesinfosParser.g:564:2: RightCurlyBracket
            {
             before(grammarAccess.getCodesinfosRootAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group__3__Impl"


    // $ANTLR start "rule__CodesinfosRoot__Group_2__0"
    // InternalCodesinfosParser.g:574:1: rule__CodesinfosRoot__Group_2__0 : rule__CodesinfosRoot__Group_2__0__Impl rule__CodesinfosRoot__Group_2__1 ;
    public final void rule__CodesinfosRoot__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:578:1: ( rule__CodesinfosRoot__Group_2__0__Impl rule__CodesinfosRoot__Group_2__1 )
            // InternalCodesinfosParser.g:579:2: rule__CodesinfosRoot__Group_2__0__Impl rule__CodesinfosRoot__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__CodesinfosRoot__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRoot__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group_2__0"


    // $ANTLR start "rule__CodesinfosRoot__Group_2__0__Impl"
    // InternalCodesinfosParser.g:586:1: rule__CodesinfosRoot__Group_2__0__Impl : ( ( rule__CodesinfosRoot__CodesinfosRootAssignment_2_0 ) ) ;
    public final void rule__CodesinfosRoot__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:590:1: ( ( ( rule__CodesinfosRoot__CodesinfosRootAssignment_2_0 ) ) )
            // InternalCodesinfosParser.g:591:1: ( ( rule__CodesinfosRoot__CodesinfosRootAssignment_2_0 ) )
            {
            // InternalCodesinfosParser.g:591:1: ( ( rule__CodesinfosRoot__CodesinfosRootAssignment_2_0 ) )
            // InternalCodesinfosParser.g:592:2: ( rule__CodesinfosRoot__CodesinfosRootAssignment_2_0 )
            {
             before(grammarAccess.getCodesinfosRootAccess().getCodesinfosRootAssignment_2_0()); 
            // InternalCodesinfosParser.g:593:2: ( rule__CodesinfosRoot__CodesinfosRootAssignment_2_0 )
            // InternalCodesinfosParser.g:593:3: rule__CodesinfosRoot__CodesinfosRootAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRoot__CodesinfosRootAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootAccess().getCodesinfosRootAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group_2__0__Impl"


    // $ANTLR start "rule__CodesinfosRoot__Group_2__1"
    // InternalCodesinfosParser.g:601:1: rule__CodesinfosRoot__Group_2__1 : rule__CodesinfosRoot__Group_2__1__Impl ;
    public final void rule__CodesinfosRoot__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:605:1: ( rule__CodesinfosRoot__Group_2__1__Impl )
            // InternalCodesinfosParser.g:606:2: rule__CodesinfosRoot__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRoot__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group_2__1"


    // $ANTLR start "rule__CodesinfosRoot__Group_2__1__Impl"
    // InternalCodesinfosParser.g:612:1: rule__CodesinfosRoot__Group_2__1__Impl : ( ( rule__CodesinfosRoot__Group_2_1__0 )* ) ;
    public final void rule__CodesinfosRoot__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:616:1: ( ( ( rule__CodesinfosRoot__Group_2_1__0 )* ) )
            // InternalCodesinfosParser.g:617:1: ( ( rule__CodesinfosRoot__Group_2_1__0 )* )
            {
            // InternalCodesinfosParser.g:617:1: ( ( rule__CodesinfosRoot__Group_2_1__0 )* )
            // InternalCodesinfosParser.g:618:2: ( rule__CodesinfosRoot__Group_2_1__0 )*
            {
             before(grammarAccess.getCodesinfosRootAccess().getGroup_2_1()); 
            // InternalCodesinfosParser.g:619:2: ( rule__CodesinfosRoot__Group_2_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Comma) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCodesinfosParser.g:619:3: rule__CodesinfosRoot__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__CodesinfosRoot__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCodesinfosRootAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group_2__1__Impl"


    // $ANTLR start "rule__CodesinfosRoot__Group_2_1__0"
    // InternalCodesinfosParser.g:628:1: rule__CodesinfosRoot__Group_2_1__0 : rule__CodesinfosRoot__Group_2_1__0__Impl rule__CodesinfosRoot__Group_2_1__1 ;
    public final void rule__CodesinfosRoot__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:632:1: ( rule__CodesinfosRoot__Group_2_1__0__Impl rule__CodesinfosRoot__Group_2_1__1 )
            // InternalCodesinfosParser.g:633:2: rule__CodesinfosRoot__Group_2_1__0__Impl rule__CodesinfosRoot__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__CodesinfosRoot__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRoot__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group_2_1__0"


    // $ANTLR start "rule__CodesinfosRoot__Group_2_1__0__Impl"
    // InternalCodesinfosParser.g:640:1: rule__CodesinfosRoot__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__CodesinfosRoot__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:644:1: ( ( Comma ) )
            // InternalCodesinfosParser.g:645:1: ( Comma )
            {
            // InternalCodesinfosParser.g:645:1: ( Comma )
            // InternalCodesinfosParser.g:646:2: Comma
            {
             before(grammarAccess.getCodesinfosRootAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group_2_1__0__Impl"


    // $ANTLR start "rule__CodesinfosRoot__Group_2_1__1"
    // InternalCodesinfosParser.g:655:1: rule__CodesinfosRoot__Group_2_1__1 : rule__CodesinfosRoot__Group_2_1__1__Impl ;
    public final void rule__CodesinfosRoot__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:659:1: ( rule__CodesinfosRoot__Group_2_1__1__Impl )
            // InternalCodesinfosParser.g:660:2: rule__CodesinfosRoot__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRoot__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group_2_1__1"


    // $ANTLR start "rule__CodesinfosRoot__Group_2_1__1__Impl"
    // InternalCodesinfosParser.g:666:1: rule__CodesinfosRoot__Group_2_1__1__Impl : ( ( rule__CodesinfosRoot__CodesinfosRootAssignment_2_1_1 ) ) ;
    public final void rule__CodesinfosRoot__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:670:1: ( ( ( rule__CodesinfosRoot__CodesinfosRootAssignment_2_1_1 ) ) )
            // InternalCodesinfosParser.g:671:1: ( ( rule__CodesinfosRoot__CodesinfosRootAssignment_2_1_1 ) )
            {
            // InternalCodesinfosParser.g:671:1: ( ( rule__CodesinfosRoot__CodesinfosRootAssignment_2_1_1 ) )
            // InternalCodesinfosParser.g:672:2: ( rule__CodesinfosRoot__CodesinfosRootAssignment_2_1_1 )
            {
             before(grammarAccess.getCodesinfosRootAccess().getCodesinfosRootAssignment_2_1_1()); 
            // InternalCodesinfosParser.g:673:2: ( rule__CodesinfosRoot__CodesinfosRootAssignment_2_1_1 )
            // InternalCodesinfosParser.g:673:3: rule__CodesinfosRoot__CodesinfosRootAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRoot__CodesinfosRootAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootAccess().getCodesinfosRootAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__Group_2_1__1__Impl"


    // $ANTLR start "rule__CodesinfosRootName__Group__0"
    // InternalCodesinfosParser.g:682:1: rule__CodesinfosRootName__Group__0 : rule__CodesinfosRootName__Group__0__Impl rule__CodesinfosRootName__Group__1 ;
    public final void rule__CodesinfosRootName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:686:1: ( rule__CodesinfosRootName__Group__0__Impl rule__CodesinfosRootName__Group__1 )
            // InternalCodesinfosParser.g:687:2: rule__CodesinfosRootName__Group__0__Impl rule__CodesinfosRootName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CodesinfosRootName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootName__Group__0"


    // $ANTLR start "rule__CodesinfosRootName__Group__0__Impl"
    // InternalCodesinfosParser.g:694:1: rule__CodesinfosRootName__Group__0__Impl : ( () ) ;
    public final void rule__CodesinfosRootName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:698:1: ( ( () ) )
            // InternalCodesinfosParser.g:699:1: ( () )
            {
            // InternalCodesinfosParser.g:699:1: ( () )
            // InternalCodesinfosParser.g:700:2: ()
            {
             before(grammarAccess.getCodesinfosRootNameAccess().getCodesinfosRootNameAction_0()); 
            // InternalCodesinfosParser.g:701:2: ()
            // InternalCodesinfosParser.g:701:3: 
            {
            }

             after(grammarAccess.getCodesinfosRootNameAccess().getCodesinfosRootNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootName__Group__0__Impl"


    // $ANTLR start "rule__CodesinfosRootName__Group__1"
    // InternalCodesinfosParser.g:709:1: rule__CodesinfosRootName__Group__1 : rule__CodesinfosRootName__Group__1__Impl rule__CodesinfosRootName__Group__2 ;
    public final void rule__CodesinfosRootName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:713:1: ( rule__CodesinfosRootName__Group__1__Impl rule__CodesinfosRootName__Group__2 )
            // InternalCodesinfosParser.g:714:2: rule__CodesinfosRootName__Group__1__Impl rule__CodesinfosRootName__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CodesinfosRootName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootName__Group__1"


    // $ANTLR start "rule__CodesinfosRootName__Group__1__Impl"
    // InternalCodesinfosParser.g:721:1: rule__CodesinfosRootName__Group__1__Impl : ( Name ) ;
    public final void rule__CodesinfosRootName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:725:1: ( ( Name ) )
            // InternalCodesinfosParser.g:726:1: ( Name )
            {
            // InternalCodesinfosParser.g:726:1: ( Name )
            // InternalCodesinfosParser.g:727:2: Name
            {
             before(grammarAccess.getCodesinfosRootNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootName__Group__1__Impl"


    // $ANTLR start "rule__CodesinfosRootName__Group__2"
    // InternalCodesinfosParser.g:736:1: rule__CodesinfosRootName__Group__2 : rule__CodesinfosRootName__Group__2__Impl rule__CodesinfosRootName__Group__3 ;
    public final void rule__CodesinfosRootName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:740:1: ( rule__CodesinfosRootName__Group__2__Impl rule__CodesinfosRootName__Group__3 )
            // InternalCodesinfosParser.g:741:2: rule__CodesinfosRootName__Group__2__Impl rule__CodesinfosRootName__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__CodesinfosRootName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootName__Group__2"


    // $ANTLR start "rule__CodesinfosRootName__Group__2__Impl"
    // InternalCodesinfosParser.g:748:1: rule__CodesinfosRootName__Group__2__Impl : ( Colon ) ;
    public final void rule__CodesinfosRootName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:752:1: ( ( Colon ) )
            // InternalCodesinfosParser.g:753:1: ( Colon )
            {
            // InternalCodesinfosParser.g:753:1: ( Colon )
            // InternalCodesinfosParser.g:754:2: Colon
            {
             before(grammarAccess.getCodesinfosRootNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootName__Group__2__Impl"


    // $ANTLR start "rule__CodesinfosRootName__Group__3"
    // InternalCodesinfosParser.g:763:1: rule__CodesinfosRootName__Group__3 : rule__CodesinfosRootName__Group__3__Impl ;
    public final void rule__CodesinfosRootName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:767:1: ( rule__CodesinfosRootName__Group__3__Impl )
            // InternalCodesinfosParser.g:768:2: rule__CodesinfosRootName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootName__Group__3"


    // $ANTLR start "rule__CodesinfosRootName__Group__3__Impl"
    // InternalCodesinfosParser.g:774:1: rule__CodesinfosRootName__Group__3__Impl : ( ( rule__CodesinfosRootName__NameAssignment_3 ) ) ;
    public final void rule__CodesinfosRootName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:778:1: ( ( ( rule__CodesinfosRootName__NameAssignment_3 ) ) )
            // InternalCodesinfosParser.g:779:1: ( ( rule__CodesinfosRootName__NameAssignment_3 ) )
            {
            // InternalCodesinfosParser.g:779:1: ( ( rule__CodesinfosRootName__NameAssignment_3 ) )
            // InternalCodesinfosParser.g:780:2: ( rule__CodesinfosRootName__NameAssignment_3 )
            {
             before(grammarAccess.getCodesinfosRootNameAccess().getNameAssignment_3()); 
            // InternalCodesinfosParser.g:781:2: ( rule__CodesinfosRootName__NameAssignment_3 )
            // InternalCodesinfosParser.g:781:3: rule__CodesinfosRootName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootName__Group__3__Impl"


    // $ANTLR start "rule__CodesinfosRootCodes__Group__0"
    // InternalCodesinfosParser.g:790:1: rule__CodesinfosRootCodes__Group__0 : rule__CodesinfosRootCodes__Group__0__Impl rule__CodesinfosRootCodes__Group__1 ;
    public final void rule__CodesinfosRootCodes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:794:1: ( rule__CodesinfosRootCodes__Group__0__Impl rule__CodesinfosRootCodes__Group__1 )
            // InternalCodesinfosParser.g:795:2: rule__CodesinfosRootCodes__Group__0__Impl rule__CodesinfosRootCodes__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CodesinfosRootCodes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group__0"


    // $ANTLR start "rule__CodesinfosRootCodes__Group__0__Impl"
    // InternalCodesinfosParser.g:802:1: rule__CodesinfosRootCodes__Group__0__Impl : ( () ) ;
    public final void rule__CodesinfosRootCodes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:806:1: ( ( () ) )
            // InternalCodesinfosParser.g:807:1: ( () )
            {
            // InternalCodesinfosParser.g:807:1: ( () )
            // InternalCodesinfosParser.g:808:2: ()
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getCodesinfosRootCodesAction_0()); 
            // InternalCodesinfosParser.g:809:2: ()
            // InternalCodesinfosParser.g:809:3: 
            {
            }

             after(grammarAccess.getCodesinfosRootCodesAccess().getCodesinfosRootCodesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group__0__Impl"


    // $ANTLR start "rule__CodesinfosRootCodes__Group__1"
    // InternalCodesinfosParser.g:817:1: rule__CodesinfosRootCodes__Group__1 : rule__CodesinfosRootCodes__Group__1__Impl rule__CodesinfosRootCodes__Group__2 ;
    public final void rule__CodesinfosRootCodes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:821:1: ( rule__CodesinfosRootCodes__Group__1__Impl rule__CodesinfosRootCodes__Group__2 )
            // InternalCodesinfosParser.g:822:2: rule__CodesinfosRootCodes__Group__1__Impl rule__CodesinfosRootCodes__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CodesinfosRootCodes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group__1"


    // $ANTLR start "rule__CodesinfosRootCodes__Group__1__Impl"
    // InternalCodesinfosParser.g:829:1: rule__CodesinfosRootCodes__Group__1__Impl : ( Codes ) ;
    public final void rule__CodesinfosRootCodes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:833:1: ( ( Codes ) )
            // InternalCodesinfosParser.g:834:1: ( Codes )
            {
            // InternalCodesinfosParser.g:834:1: ( Codes )
            // InternalCodesinfosParser.g:835:2: Codes
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getCodesKeyword_1()); 
            match(input,Codes,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesAccess().getCodesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group__1__Impl"


    // $ANTLR start "rule__CodesinfosRootCodes__Group__2"
    // InternalCodesinfosParser.g:844:1: rule__CodesinfosRootCodes__Group__2 : rule__CodesinfosRootCodes__Group__2__Impl rule__CodesinfosRootCodes__Group__3 ;
    public final void rule__CodesinfosRootCodes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:848:1: ( rule__CodesinfosRootCodes__Group__2__Impl rule__CodesinfosRootCodes__Group__3 )
            // InternalCodesinfosParser.g:849:2: rule__CodesinfosRootCodes__Group__2__Impl rule__CodesinfosRootCodes__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__CodesinfosRootCodes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group__2"


    // $ANTLR start "rule__CodesinfosRootCodes__Group__2__Impl"
    // InternalCodesinfosParser.g:856:1: rule__CodesinfosRootCodes__Group__2__Impl : ( Colon ) ;
    public final void rule__CodesinfosRootCodes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:860:1: ( ( Colon ) )
            // InternalCodesinfosParser.g:861:1: ( Colon )
            {
            // InternalCodesinfosParser.g:861:1: ( Colon )
            // InternalCodesinfosParser.g:862:2: Colon
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group__2__Impl"


    // $ANTLR start "rule__CodesinfosRootCodes__Group__3"
    // InternalCodesinfosParser.g:871:1: rule__CodesinfosRootCodes__Group__3 : rule__CodesinfosRootCodes__Group__3__Impl rule__CodesinfosRootCodes__Group__4 ;
    public final void rule__CodesinfosRootCodes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:875:1: ( rule__CodesinfosRootCodes__Group__3__Impl rule__CodesinfosRootCodes__Group__4 )
            // InternalCodesinfosParser.g:876:2: rule__CodesinfosRootCodes__Group__3__Impl rule__CodesinfosRootCodes__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__CodesinfosRootCodes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group__3"


    // $ANTLR start "rule__CodesinfosRootCodes__Group__3__Impl"
    // InternalCodesinfosParser.g:883:1: rule__CodesinfosRootCodes__Group__3__Impl : ( LeftSquareBracket ) ;
    public final void rule__CodesinfosRootCodes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:887:1: ( ( LeftSquareBracket ) )
            // InternalCodesinfosParser.g:888:1: ( LeftSquareBracket )
            {
            // InternalCodesinfosParser.g:888:1: ( LeftSquareBracket )
            // InternalCodesinfosParser.g:889:2: LeftSquareBracket
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getLeftSquareBracketKeyword_3()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group__3__Impl"


    // $ANTLR start "rule__CodesinfosRootCodes__Group__4"
    // InternalCodesinfosParser.g:898:1: rule__CodesinfosRootCodes__Group__4 : rule__CodesinfosRootCodes__Group__4__Impl rule__CodesinfosRootCodes__Group__5 ;
    public final void rule__CodesinfosRootCodes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:902:1: ( rule__CodesinfosRootCodes__Group__4__Impl rule__CodesinfosRootCodes__Group__5 )
            // InternalCodesinfosParser.g:903:2: rule__CodesinfosRootCodes__Group__4__Impl rule__CodesinfosRootCodes__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__CodesinfosRootCodes__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group__4"


    // $ANTLR start "rule__CodesinfosRootCodes__Group__4__Impl"
    // InternalCodesinfosParser.g:910:1: rule__CodesinfosRootCodes__Group__4__Impl : ( ( rule__CodesinfosRootCodes__Group_4__0 )? ) ;
    public final void rule__CodesinfosRootCodes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:914:1: ( ( ( rule__CodesinfosRootCodes__Group_4__0 )? ) )
            // InternalCodesinfosParser.g:915:1: ( ( rule__CodesinfosRootCodes__Group_4__0 )? )
            {
            // InternalCodesinfosParser.g:915:1: ( ( rule__CodesinfosRootCodes__Group_4__0 )? )
            // InternalCodesinfosParser.g:916:2: ( rule__CodesinfosRootCodes__Group_4__0 )?
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getGroup_4()); 
            // InternalCodesinfosParser.g:917:2: ( rule__CodesinfosRootCodes__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LeftCurlyBracket) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCodesinfosParser.g:917:3: rule__CodesinfosRootCodes__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CodesinfosRootCodes__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodesinfosRootCodesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group__4__Impl"


    // $ANTLR start "rule__CodesinfosRootCodes__Group__5"
    // InternalCodesinfosParser.g:925:1: rule__CodesinfosRootCodes__Group__5 : rule__CodesinfosRootCodes__Group__5__Impl ;
    public final void rule__CodesinfosRootCodes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:929:1: ( rule__CodesinfosRootCodes__Group__5__Impl )
            // InternalCodesinfosParser.g:930:2: rule__CodesinfosRootCodes__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group__5"


    // $ANTLR start "rule__CodesinfosRootCodes__Group__5__Impl"
    // InternalCodesinfosParser.g:936:1: rule__CodesinfosRootCodes__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__CodesinfosRootCodes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:940:1: ( ( RightSquareBracket ) )
            // InternalCodesinfosParser.g:941:1: ( RightSquareBracket )
            {
            // InternalCodesinfosParser.g:941:1: ( RightSquareBracket )
            // InternalCodesinfosParser.g:942:2: RightSquareBracket
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group__5__Impl"


    // $ANTLR start "rule__CodesinfosRootCodes__Group_4__0"
    // InternalCodesinfosParser.g:952:1: rule__CodesinfosRootCodes__Group_4__0 : rule__CodesinfosRootCodes__Group_4__0__Impl rule__CodesinfosRootCodes__Group_4__1 ;
    public final void rule__CodesinfosRootCodes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:956:1: ( rule__CodesinfosRootCodes__Group_4__0__Impl rule__CodesinfosRootCodes__Group_4__1 )
            // InternalCodesinfosParser.g:957:2: rule__CodesinfosRootCodes__Group_4__0__Impl rule__CodesinfosRootCodes__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__CodesinfosRootCodes__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group_4__0"


    // $ANTLR start "rule__CodesinfosRootCodes__Group_4__0__Impl"
    // InternalCodesinfosParser.g:964:1: rule__CodesinfosRootCodes__Group_4__0__Impl : ( ( rule__CodesinfosRootCodes__CodesAssignment_4_0 ) ) ;
    public final void rule__CodesinfosRootCodes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:968:1: ( ( ( rule__CodesinfosRootCodes__CodesAssignment_4_0 ) ) )
            // InternalCodesinfosParser.g:969:1: ( ( rule__CodesinfosRootCodes__CodesAssignment_4_0 ) )
            {
            // InternalCodesinfosParser.g:969:1: ( ( rule__CodesinfosRootCodes__CodesAssignment_4_0 ) )
            // InternalCodesinfosParser.g:970:2: ( rule__CodesinfosRootCodes__CodesAssignment_4_0 )
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getCodesAssignment_4_0()); 
            // InternalCodesinfosParser.g:971:2: ( rule__CodesinfosRootCodes__CodesAssignment_4_0 )
            // InternalCodesinfosParser.g:971:3: rule__CodesinfosRootCodes__CodesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__CodesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesAccess().getCodesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group_4__0__Impl"


    // $ANTLR start "rule__CodesinfosRootCodes__Group_4__1"
    // InternalCodesinfosParser.g:979:1: rule__CodesinfosRootCodes__Group_4__1 : rule__CodesinfosRootCodes__Group_4__1__Impl ;
    public final void rule__CodesinfosRootCodes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:983:1: ( rule__CodesinfosRootCodes__Group_4__1__Impl )
            // InternalCodesinfosParser.g:984:2: rule__CodesinfosRootCodes__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group_4__1"


    // $ANTLR start "rule__CodesinfosRootCodes__Group_4__1__Impl"
    // InternalCodesinfosParser.g:990:1: rule__CodesinfosRootCodes__Group_4__1__Impl : ( ( rule__CodesinfosRootCodes__Group_4_1__0 )* ) ;
    public final void rule__CodesinfosRootCodes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:994:1: ( ( ( rule__CodesinfosRootCodes__Group_4_1__0 )* ) )
            // InternalCodesinfosParser.g:995:1: ( ( rule__CodesinfosRootCodes__Group_4_1__0 )* )
            {
            // InternalCodesinfosParser.g:995:1: ( ( rule__CodesinfosRootCodes__Group_4_1__0 )* )
            // InternalCodesinfosParser.g:996:2: ( rule__CodesinfosRootCodes__Group_4_1__0 )*
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getGroup_4_1()); 
            // InternalCodesinfosParser.g:997:2: ( rule__CodesinfosRootCodes__Group_4_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCodesinfosParser.g:997:3: rule__CodesinfosRootCodes__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__CodesinfosRootCodes__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCodesinfosRootCodesAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group_4__1__Impl"


    // $ANTLR start "rule__CodesinfosRootCodes__Group_4_1__0"
    // InternalCodesinfosParser.g:1006:1: rule__CodesinfosRootCodes__Group_4_1__0 : rule__CodesinfosRootCodes__Group_4_1__0__Impl rule__CodesinfosRootCodes__Group_4_1__1 ;
    public final void rule__CodesinfosRootCodes__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1010:1: ( rule__CodesinfosRootCodes__Group_4_1__0__Impl rule__CodesinfosRootCodes__Group_4_1__1 )
            // InternalCodesinfosParser.g:1011:2: rule__CodesinfosRootCodes__Group_4_1__0__Impl rule__CodesinfosRootCodes__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__CodesinfosRootCodes__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group_4_1__0"


    // $ANTLR start "rule__CodesinfosRootCodes__Group_4_1__0__Impl"
    // InternalCodesinfosParser.g:1018:1: rule__CodesinfosRootCodes__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__CodesinfosRootCodes__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1022:1: ( ( Comma ) )
            // InternalCodesinfosParser.g:1023:1: ( Comma )
            {
            // InternalCodesinfosParser.g:1023:1: ( Comma )
            // InternalCodesinfosParser.g:1024:2: Comma
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group_4_1__0__Impl"


    // $ANTLR start "rule__CodesinfosRootCodes__Group_4_1__1"
    // InternalCodesinfosParser.g:1033:1: rule__CodesinfosRootCodes__Group_4_1__1 : rule__CodesinfosRootCodes__Group_4_1__1__Impl ;
    public final void rule__CodesinfosRootCodes__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1037:1: ( rule__CodesinfosRootCodes__Group_4_1__1__Impl )
            // InternalCodesinfosParser.g:1038:2: rule__CodesinfosRootCodes__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group_4_1__1"


    // $ANTLR start "rule__CodesinfosRootCodes__Group_4_1__1__Impl"
    // InternalCodesinfosParser.g:1044:1: rule__CodesinfosRootCodes__Group_4_1__1__Impl : ( ( rule__CodesinfosRootCodes__CodesAssignment_4_1_1 ) ) ;
    public final void rule__CodesinfosRootCodes__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1048:1: ( ( ( rule__CodesinfosRootCodes__CodesAssignment_4_1_1 ) ) )
            // InternalCodesinfosParser.g:1049:1: ( ( rule__CodesinfosRootCodes__CodesAssignment_4_1_1 ) )
            {
            // InternalCodesinfosParser.g:1049:1: ( ( rule__CodesinfosRootCodes__CodesAssignment_4_1_1 ) )
            // InternalCodesinfosParser.g:1050:2: ( rule__CodesinfosRootCodes__CodesAssignment_4_1_1 )
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getCodesAssignment_4_1_1()); 
            // InternalCodesinfosParser.g:1051:2: ( rule__CodesinfosRootCodes__CodesAssignment_4_1_1 )
            // InternalCodesinfosParser.g:1051:3: rule__CodesinfosRootCodes__CodesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodes__CodesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesAccess().getCodesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__Group_4_1__1__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group__0"
    // InternalCodesinfosParser.g:1060:1: rule__CodesinfosRootCodesItems__Group__0 : rule__CodesinfosRootCodesItems__Group__0__Impl rule__CodesinfosRootCodesItems__Group__1 ;
    public final void rule__CodesinfosRootCodesItems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1064:1: ( rule__CodesinfosRootCodesItems__Group__0__Impl rule__CodesinfosRootCodesItems__Group__1 )
            // InternalCodesinfosParser.g:1065:2: rule__CodesinfosRootCodesItems__Group__0__Impl rule__CodesinfosRootCodesItems__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CodesinfosRootCodesItems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItems__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group__0"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group__0__Impl"
    // InternalCodesinfosParser.g:1072:1: rule__CodesinfosRootCodesItems__Group__0__Impl : ( () ) ;
    public final void rule__CodesinfosRootCodesItems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1076:1: ( ( () ) )
            // InternalCodesinfosParser.g:1077:1: ( () )
            {
            // InternalCodesinfosParser.g:1077:1: ( () )
            // InternalCodesinfosParser.g:1078:2: ()
            {
             before(grammarAccess.getCodesinfosRootCodesItemsAccess().getCodesinfosRootCodesItemsAction_0()); 
            // InternalCodesinfosParser.g:1079:2: ()
            // InternalCodesinfosParser.g:1079:3: 
            {
            }

             after(grammarAccess.getCodesinfosRootCodesItemsAccess().getCodesinfosRootCodesItemsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group__0__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group__1"
    // InternalCodesinfosParser.g:1087:1: rule__CodesinfosRootCodesItems__Group__1 : rule__CodesinfosRootCodesItems__Group__1__Impl rule__CodesinfosRootCodesItems__Group__2 ;
    public final void rule__CodesinfosRootCodesItems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1091:1: ( rule__CodesinfosRootCodesItems__Group__1__Impl rule__CodesinfosRootCodesItems__Group__2 )
            // InternalCodesinfosParser.g:1092:2: rule__CodesinfosRootCodesItems__Group__1__Impl rule__CodesinfosRootCodesItems__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__CodesinfosRootCodesItems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItems__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group__1"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group__1__Impl"
    // InternalCodesinfosParser.g:1099:1: rule__CodesinfosRootCodesItems__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__CodesinfosRootCodesItems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1103:1: ( ( LeftCurlyBracket ) )
            // InternalCodesinfosParser.g:1104:1: ( LeftCurlyBracket )
            {
            // InternalCodesinfosParser.g:1104:1: ( LeftCurlyBracket )
            // InternalCodesinfosParser.g:1105:2: LeftCurlyBracket
            {
             before(grammarAccess.getCodesinfosRootCodesItemsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesItemsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group__1__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group__2"
    // InternalCodesinfosParser.g:1114:1: rule__CodesinfosRootCodesItems__Group__2 : rule__CodesinfosRootCodesItems__Group__2__Impl rule__CodesinfosRootCodesItems__Group__3 ;
    public final void rule__CodesinfosRootCodesItems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1118:1: ( rule__CodesinfosRootCodesItems__Group__2__Impl rule__CodesinfosRootCodesItems__Group__3 )
            // InternalCodesinfosParser.g:1119:2: rule__CodesinfosRootCodesItems__Group__2__Impl rule__CodesinfosRootCodesItems__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__CodesinfosRootCodesItems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItems__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group__2"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group__2__Impl"
    // InternalCodesinfosParser.g:1126:1: rule__CodesinfosRootCodesItems__Group__2__Impl : ( ( rule__CodesinfosRootCodesItems__Group_2__0 )? ) ;
    public final void rule__CodesinfosRootCodesItems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1130:1: ( ( ( rule__CodesinfosRootCodesItems__Group_2__0 )? ) )
            // InternalCodesinfosParser.g:1131:1: ( ( rule__CodesinfosRootCodesItems__Group_2__0 )? )
            {
            // InternalCodesinfosParser.g:1131:1: ( ( rule__CodesinfosRootCodesItems__Group_2__0 )? )
            // InternalCodesinfosParser.g:1132:2: ( rule__CodesinfosRootCodesItems__Group_2__0 )?
            {
             before(grammarAccess.getCodesinfosRootCodesItemsAccess().getGroup_2()); 
            // InternalCodesinfosParser.g:1133:2: ( rule__CodesinfosRootCodesItems__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=Classname && LA9_0<=Nodename)||LA9_0==Name) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCodesinfosParser.g:1133:3: rule__CodesinfosRootCodesItems__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CodesinfosRootCodesItems__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodesinfosRootCodesItemsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group__2__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group__3"
    // InternalCodesinfosParser.g:1141:1: rule__CodesinfosRootCodesItems__Group__3 : rule__CodesinfosRootCodesItems__Group__3__Impl ;
    public final void rule__CodesinfosRootCodesItems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1145:1: ( rule__CodesinfosRootCodesItems__Group__3__Impl )
            // InternalCodesinfosParser.g:1146:2: rule__CodesinfosRootCodesItems__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItems__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group__3"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group__3__Impl"
    // InternalCodesinfosParser.g:1152:1: rule__CodesinfosRootCodesItems__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__CodesinfosRootCodesItems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1156:1: ( ( RightCurlyBracket ) )
            // InternalCodesinfosParser.g:1157:1: ( RightCurlyBracket )
            {
            // InternalCodesinfosParser.g:1157:1: ( RightCurlyBracket )
            // InternalCodesinfosParser.g:1158:2: RightCurlyBracket
            {
             before(grammarAccess.getCodesinfosRootCodesItemsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesItemsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group__3__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group_2__0"
    // InternalCodesinfosParser.g:1168:1: rule__CodesinfosRootCodesItems__Group_2__0 : rule__CodesinfosRootCodesItems__Group_2__0__Impl rule__CodesinfosRootCodesItems__Group_2__1 ;
    public final void rule__CodesinfosRootCodesItems__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1172:1: ( rule__CodesinfosRootCodesItems__Group_2__0__Impl rule__CodesinfosRootCodesItems__Group_2__1 )
            // InternalCodesinfosParser.g:1173:2: rule__CodesinfosRootCodesItems__Group_2__0__Impl rule__CodesinfosRootCodesItems__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__CodesinfosRootCodesItems__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItems__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group_2__0"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group_2__0__Impl"
    // InternalCodesinfosParser.g:1180:1: rule__CodesinfosRootCodesItems__Group_2__0__Impl : ( ( rule__CodesinfosRootCodesItems__ItemsAssignment_2_0 ) ) ;
    public final void rule__CodesinfosRootCodesItems__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1184:1: ( ( ( rule__CodesinfosRootCodesItems__ItemsAssignment_2_0 ) ) )
            // InternalCodesinfosParser.g:1185:1: ( ( rule__CodesinfosRootCodesItems__ItemsAssignment_2_0 ) )
            {
            // InternalCodesinfosParser.g:1185:1: ( ( rule__CodesinfosRootCodesItems__ItemsAssignment_2_0 ) )
            // InternalCodesinfosParser.g:1186:2: ( rule__CodesinfosRootCodesItems__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getCodesinfosRootCodesItemsAccess().getItemsAssignment_2_0()); 
            // InternalCodesinfosParser.g:1187:2: ( rule__CodesinfosRootCodesItems__ItemsAssignment_2_0 )
            // InternalCodesinfosParser.g:1187:3: rule__CodesinfosRootCodesItems__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItems__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesItemsAccess().getItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group_2__0__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group_2__1"
    // InternalCodesinfosParser.g:1195:1: rule__CodesinfosRootCodesItems__Group_2__1 : rule__CodesinfosRootCodesItems__Group_2__1__Impl ;
    public final void rule__CodesinfosRootCodesItems__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1199:1: ( rule__CodesinfosRootCodesItems__Group_2__1__Impl )
            // InternalCodesinfosParser.g:1200:2: rule__CodesinfosRootCodesItems__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItems__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group_2__1"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group_2__1__Impl"
    // InternalCodesinfosParser.g:1206:1: rule__CodesinfosRootCodesItems__Group_2__1__Impl : ( ( rule__CodesinfosRootCodesItems__Group_2_1__0 )* ) ;
    public final void rule__CodesinfosRootCodesItems__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1210:1: ( ( ( rule__CodesinfosRootCodesItems__Group_2_1__0 )* ) )
            // InternalCodesinfosParser.g:1211:1: ( ( rule__CodesinfosRootCodesItems__Group_2_1__0 )* )
            {
            // InternalCodesinfosParser.g:1211:1: ( ( rule__CodesinfosRootCodesItems__Group_2_1__0 )* )
            // InternalCodesinfosParser.g:1212:2: ( rule__CodesinfosRootCodesItems__Group_2_1__0 )*
            {
             before(grammarAccess.getCodesinfosRootCodesItemsAccess().getGroup_2_1()); 
            // InternalCodesinfosParser.g:1213:2: ( rule__CodesinfosRootCodesItems__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCodesinfosParser.g:1213:3: rule__CodesinfosRootCodesItems__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__CodesinfosRootCodesItems__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCodesinfosRootCodesItemsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group_2__1__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group_2_1__0"
    // InternalCodesinfosParser.g:1222:1: rule__CodesinfosRootCodesItems__Group_2_1__0 : rule__CodesinfosRootCodesItems__Group_2_1__0__Impl rule__CodesinfosRootCodesItems__Group_2_1__1 ;
    public final void rule__CodesinfosRootCodesItems__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1226:1: ( rule__CodesinfosRootCodesItems__Group_2_1__0__Impl rule__CodesinfosRootCodesItems__Group_2_1__1 )
            // InternalCodesinfosParser.g:1227:2: rule__CodesinfosRootCodesItems__Group_2_1__0__Impl rule__CodesinfosRootCodesItems__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__CodesinfosRootCodesItems__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItems__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group_2_1__0"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group_2_1__0__Impl"
    // InternalCodesinfosParser.g:1234:1: rule__CodesinfosRootCodesItems__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__CodesinfosRootCodesItems__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1238:1: ( ( Comma ) )
            // InternalCodesinfosParser.g:1239:1: ( Comma )
            {
            // InternalCodesinfosParser.g:1239:1: ( Comma )
            // InternalCodesinfosParser.g:1240:2: Comma
            {
             before(grammarAccess.getCodesinfosRootCodesItemsAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesItemsAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group_2_1__0__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group_2_1__1"
    // InternalCodesinfosParser.g:1249:1: rule__CodesinfosRootCodesItems__Group_2_1__1 : rule__CodesinfosRootCodesItems__Group_2_1__1__Impl ;
    public final void rule__CodesinfosRootCodesItems__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1253:1: ( rule__CodesinfosRootCodesItems__Group_2_1__1__Impl )
            // InternalCodesinfosParser.g:1254:2: rule__CodesinfosRootCodesItems__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItems__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group_2_1__1"


    // $ANTLR start "rule__CodesinfosRootCodesItems__Group_2_1__1__Impl"
    // InternalCodesinfosParser.g:1260:1: rule__CodesinfosRootCodesItems__Group_2_1__1__Impl : ( ( rule__CodesinfosRootCodesItems__ItemsAssignment_2_1_1 ) ) ;
    public final void rule__CodesinfosRootCodesItems__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1264:1: ( ( ( rule__CodesinfosRootCodesItems__ItemsAssignment_2_1_1 ) ) )
            // InternalCodesinfosParser.g:1265:1: ( ( rule__CodesinfosRootCodesItems__ItemsAssignment_2_1_1 ) )
            {
            // InternalCodesinfosParser.g:1265:1: ( ( rule__CodesinfosRootCodesItems__ItemsAssignment_2_1_1 ) )
            // InternalCodesinfosParser.g:1266:2: ( rule__CodesinfosRootCodesItems__ItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getCodesinfosRootCodesItemsAccess().getItemsAssignment_2_1_1()); 
            // InternalCodesinfosParser.g:1267:2: ( rule__CodesinfosRootCodesItems__ItemsAssignment_2_1_1 )
            // InternalCodesinfosParser.g:1267:3: rule__CodesinfosRootCodesItems__ItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItems__ItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesItemsAccess().getItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__Group_2_1__1__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItemsName__Group__0"
    // InternalCodesinfosParser.g:1276:1: rule__CodesinfosRootCodesItemsName__Group__0 : rule__CodesinfosRootCodesItemsName__Group__0__Impl rule__CodesinfosRootCodesItemsName__Group__1 ;
    public final void rule__CodesinfosRootCodesItemsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1280:1: ( rule__CodesinfosRootCodesItemsName__Group__0__Impl rule__CodesinfosRootCodesItemsName__Group__1 )
            // InternalCodesinfosParser.g:1281:2: rule__CodesinfosRootCodesItemsName__Group__0__Impl rule__CodesinfosRootCodesItemsName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CodesinfosRootCodesItemsName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsName__Group__0"


    // $ANTLR start "rule__CodesinfosRootCodesItemsName__Group__0__Impl"
    // InternalCodesinfosParser.g:1288:1: rule__CodesinfosRootCodesItemsName__Group__0__Impl : ( () ) ;
    public final void rule__CodesinfosRootCodesItemsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1292:1: ( ( () ) )
            // InternalCodesinfosParser.g:1293:1: ( () )
            {
            // InternalCodesinfosParser.g:1293:1: ( () )
            // InternalCodesinfosParser.g:1294:2: ()
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getCodesinfosRootCodesItemsNameAction_0()); 
            // InternalCodesinfosParser.g:1295:2: ()
            // InternalCodesinfosParser.g:1295:3: 
            {
            }

             after(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getCodesinfosRootCodesItemsNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsName__Group__0__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItemsName__Group__1"
    // InternalCodesinfosParser.g:1303:1: rule__CodesinfosRootCodesItemsName__Group__1 : rule__CodesinfosRootCodesItemsName__Group__1__Impl rule__CodesinfosRootCodesItemsName__Group__2 ;
    public final void rule__CodesinfosRootCodesItemsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1307:1: ( rule__CodesinfosRootCodesItemsName__Group__1__Impl rule__CodesinfosRootCodesItemsName__Group__2 )
            // InternalCodesinfosParser.g:1308:2: rule__CodesinfosRootCodesItemsName__Group__1__Impl rule__CodesinfosRootCodesItemsName__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CodesinfosRootCodesItemsName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsName__Group__1"


    // $ANTLR start "rule__CodesinfosRootCodesItemsName__Group__1__Impl"
    // InternalCodesinfosParser.g:1315:1: rule__CodesinfosRootCodesItemsName__Group__1__Impl : ( Name ) ;
    public final void rule__CodesinfosRootCodesItemsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1319:1: ( ( Name ) )
            // InternalCodesinfosParser.g:1320:1: ( Name )
            {
            // InternalCodesinfosParser.g:1320:1: ( Name )
            // InternalCodesinfosParser.g:1321:2: Name
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsName__Group__1__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItemsName__Group__2"
    // InternalCodesinfosParser.g:1330:1: rule__CodesinfosRootCodesItemsName__Group__2 : rule__CodesinfosRootCodesItemsName__Group__2__Impl rule__CodesinfosRootCodesItemsName__Group__3 ;
    public final void rule__CodesinfosRootCodesItemsName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1334:1: ( rule__CodesinfosRootCodesItemsName__Group__2__Impl rule__CodesinfosRootCodesItemsName__Group__3 )
            // InternalCodesinfosParser.g:1335:2: rule__CodesinfosRootCodesItemsName__Group__2__Impl rule__CodesinfosRootCodesItemsName__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__CodesinfosRootCodesItemsName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsName__Group__2"


    // $ANTLR start "rule__CodesinfosRootCodesItemsName__Group__2__Impl"
    // InternalCodesinfosParser.g:1342:1: rule__CodesinfosRootCodesItemsName__Group__2__Impl : ( Colon ) ;
    public final void rule__CodesinfosRootCodesItemsName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1346:1: ( ( Colon ) )
            // InternalCodesinfosParser.g:1347:1: ( Colon )
            {
            // InternalCodesinfosParser.g:1347:1: ( Colon )
            // InternalCodesinfosParser.g:1348:2: Colon
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsName__Group__2__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItemsName__Group__3"
    // InternalCodesinfosParser.g:1357:1: rule__CodesinfosRootCodesItemsName__Group__3 : rule__CodesinfosRootCodesItemsName__Group__3__Impl ;
    public final void rule__CodesinfosRootCodesItemsName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1361:1: ( rule__CodesinfosRootCodesItemsName__Group__3__Impl )
            // InternalCodesinfosParser.g:1362:2: rule__CodesinfosRootCodesItemsName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsName__Group__3"


    // $ANTLR start "rule__CodesinfosRootCodesItemsName__Group__3__Impl"
    // InternalCodesinfosParser.g:1368:1: rule__CodesinfosRootCodesItemsName__Group__3__Impl : ( ( rule__CodesinfosRootCodesItemsName__NameAssignment_3 ) ) ;
    public final void rule__CodesinfosRootCodesItemsName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1372:1: ( ( ( rule__CodesinfosRootCodesItemsName__NameAssignment_3 ) ) )
            // InternalCodesinfosParser.g:1373:1: ( ( rule__CodesinfosRootCodesItemsName__NameAssignment_3 ) )
            {
            // InternalCodesinfosParser.g:1373:1: ( ( rule__CodesinfosRootCodesItemsName__NameAssignment_3 ) )
            // InternalCodesinfosParser.g:1374:2: ( rule__CodesinfosRootCodesItemsName__NameAssignment_3 )
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getNameAssignment_3()); 
            // InternalCodesinfosParser.g:1375:2: ( rule__CodesinfosRootCodesItemsName__NameAssignment_3 )
            // InternalCodesinfosParser.g:1375:3: rule__CodesinfosRootCodesItemsName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsName__Group__3__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItemsClassname__Group__0"
    // InternalCodesinfosParser.g:1384:1: rule__CodesinfosRootCodesItemsClassname__Group__0 : rule__CodesinfosRootCodesItemsClassname__Group__0__Impl rule__CodesinfosRootCodesItemsClassname__Group__1 ;
    public final void rule__CodesinfosRootCodesItemsClassname__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1388:1: ( rule__CodesinfosRootCodesItemsClassname__Group__0__Impl rule__CodesinfosRootCodesItemsClassname__Group__1 )
            // InternalCodesinfosParser.g:1389:2: rule__CodesinfosRootCodesItemsClassname__Group__0__Impl rule__CodesinfosRootCodesItemsClassname__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CodesinfosRootCodesItemsClassname__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsClassname__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsClassname__Group__0"


    // $ANTLR start "rule__CodesinfosRootCodesItemsClassname__Group__0__Impl"
    // InternalCodesinfosParser.g:1396:1: rule__CodesinfosRootCodesItemsClassname__Group__0__Impl : ( Classname ) ;
    public final void rule__CodesinfosRootCodesItemsClassname__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1400:1: ( ( Classname ) )
            // InternalCodesinfosParser.g:1401:1: ( Classname )
            {
            // InternalCodesinfosParser.g:1401:1: ( Classname )
            // InternalCodesinfosParser.g:1402:2: Classname
            {
             before(grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getClassnameKeyword_0()); 
            match(input,Classname,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getClassnameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsClassname__Group__0__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItemsClassname__Group__1"
    // InternalCodesinfosParser.g:1411:1: rule__CodesinfosRootCodesItemsClassname__Group__1 : rule__CodesinfosRootCodesItemsClassname__Group__1__Impl rule__CodesinfosRootCodesItemsClassname__Group__2 ;
    public final void rule__CodesinfosRootCodesItemsClassname__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1415:1: ( rule__CodesinfosRootCodesItemsClassname__Group__1__Impl rule__CodesinfosRootCodesItemsClassname__Group__2 )
            // InternalCodesinfosParser.g:1416:2: rule__CodesinfosRootCodesItemsClassname__Group__1__Impl rule__CodesinfosRootCodesItemsClassname__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__CodesinfosRootCodesItemsClassname__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsClassname__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsClassname__Group__1"


    // $ANTLR start "rule__CodesinfosRootCodesItemsClassname__Group__1__Impl"
    // InternalCodesinfosParser.g:1423:1: rule__CodesinfosRootCodesItemsClassname__Group__1__Impl : ( Colon ) ;
    public final void rule__CodesinfosRootCodesItemsClassname__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1427:1: ( ( Colon ) )
            // InternalCodesinfosParser.g:1428:1: ( Colon )
            {
            // InternalCodesinfosParser.g:1428:1: ( Colon )
            // InternalCodesinfosParser.g:1429:2: Colon
            {
             before(grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsClassname__Group__1__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItemsClassname__Group__2"
    // InternalCodesinfosParser.g:1438:1: rule__CodesinfosRootCodesItemsClassname__Group__2 : rule__CodesinfosRootCodesItemsClassname__Group__2__Impl ;
    public final void rule__CodesinfosRootCodesItemsClassname__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1442:1: ( rule__CodesinfosRootCodesItemsClassname__Group__2__Impl )
            // InternalCodesinfosParser.g:1443:2: rule__CodesinfosRootCodesItemsClassname__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsClassname__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsClassname__Group__2"


    // $ANTLR start "rule__CodesinfosRootCodesItemsClassname__Group__2__Impl"
    // InternalCodesinfosParser.g:1449:1: rule__CodesinfosRootCodesItemsClassname__Group__2__Impl : ( ( rule__CodesinfosRootCodesItemsClassname__ClassnameAssignment_2 ) ) ;
    public final void rule__CodesinfosRootCodesItemsClassname__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1453:1: ( ( ( rule__CodesinfosRootCodesItemsClassname__ClassnameAssignment_2 ) ) )
            // InternalCodesinfosParser.g:1454:1: ( ( rule__CodesinfosRootCodesItemsClassname__ClassnameAssignment_2 ) )
            {
            // InternalCodesinfosParser.g:1454:1: ( ( rule__CodesinfosRootCodesItemsClassname__ClassnameAssignment_2 ) )
            // InternalCodesinfosParser.g:1455:2: ( rule__CodesinfosRootCodesItemsClassname__ClassnameAssignment_2 )
            {
             before(grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getClassnameAssignment_2()); 
            // InternalCodesinfosParser.g:1456:2: ( rule__CodesinfosRootCodesItemsClassname__ClassnameAssignment_2 )
            // InternalCodesinfosParser.g:1456:3: rule__CodesinfosRootCodesItemsClassname__ClassnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsClassname__ClassnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getClassnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsClassname__Group__2__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItemsNodename__Group__0"
    // InternalCodesinfosParser.g:1465:1: rule__CodesinfosRootCodesItemsNodename__Group__0 : rule__CodesinfosRootCodesItemsNodename__Group__0__Impl rule__CodesinfosRootCodesItemsNodename__Group__1 ;
    public final void rule__CodesinfosRootCodesItemsNodename__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1469:1: ( rule__CodesinfosRootCodesItemsNodename__Group__0__Impl rule__CodesinfosRootCodesItemsNodename__Group__1 )
            // InternalCodesinfosParser.g:1470:2: rule__CodesinfosRootCodesItemsNodename__Group__0__Impl rule__CodesinfosRootCodesItemsNodename__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CodesinfosRootCodesItemsNodename__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsNodename__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsNodename__Group__0"


    // $ANTLR start "rule__CodesinfosRootCodesItemsNodename__Group__0__Impl"
    // InternalCodesinfosParser.g:1477:1: rule__CodesinfosRootCodesItemsNodename__Group__0__Impl : ( Nodename ) ;
    public final void rule__CodesinfosRootCodesItemsNodename__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1481:1: ( ( Nodename ) )
            // InternalCodesinfosParser.g:1482:1: ( Nodename )
            {
            // InternalCodesinfosParser.g:1482:1: ( Nodename )
            // InternalCodesinfosParser.g:1483:2: Nodename
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getNodenameKeyword_0()); 
            match(input,Nodename,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getNodenameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsNodename__Group__0__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItemsNodename__Group__1"
    // InternalCodesinfosParser.g:1492:1: rule__CodesinfosRootCodesItemsNodename__Group__1 : rule__CodesinfosRootCodesItemsNodename__Group__1__Impl rule__CodesinfosRootCodesItemsNodename__Group__2 ;
    public final void rule__CodesinfosRootCodesItemsNodename__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1496:1: ( rule__CodesinfosRootCodesItemsNodename__Group__1__Impl rule__CodesinfosRootCodesItemsNodename__Group__2 )
            // InternalCodesinfosParser.g:1497:2: rule__CodesinfosRootCodesItemsNodename__Group__1__Impl rule__CodesinfosRootCodesItemsNodename__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__CodesinfosRootCodesItemsNodename__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsNodename__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsNodename__Group__1"


    // $ANTLR start "rule__CodesinfosRootCodesItemsNodename__Group__1__Impl"
    // InternalCodesinfosParser.g:1504:1: rule__CodesinfosRootCodesItemsNodename__Group__1__Impl : ( Colon ) ;
    public final void rule__CodesinfosRootCodesItemsNodename__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1508:1: ( ( Colon ) )
            // InternalCodesinfosParser.g:1509:1: ( Colon )
            {
            // InternalCodesinfosParser.g:1509:1: ( Colon )
            // InternalCodesinfosParser.g:1510:2: Colon
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsNodename__Group__1__Impl"


    // $ANTLR start "rule__CodesinfosRootCodesItemsNodename__Group__2"
    // InternalCodesinfosParser.g:1519:1: rule__CodesinfosRootCodesItemsNodename__Group__2 : rule__CodesinfosRootCodesItemsNodename__Group__2__Impl ;
    public final void rule__CodesinfosRootCodesItemsNodename__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1523:1: ( rule__CodesinfosRootCodesItemsNodename__Group__2__Impl )
            // InternalCodesinfosParser.g:1524:2: rule__CodesinfosRootCodesItemsNodename__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsNodename__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsNodename__Group__2"


    // $ANTLR start "rule__CodesinfosRootCodesItemsNodename__Group__2__Impl"
    // InternalCodesinfosParser.g:1530:1: rule__CodesinfosRootCodesItemsNodename__Group__2__Impl : ( ( rule__CodesinfosRootCodesItemsNodename__NodenameAssignment_2 ) ) ;
    public final void rule__CodesinfosRootCodesItemsNodename__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1534:1: ( ( ( rule__CodesinfosRootCodesItemsNodename__NodenameAssignment_2 ) ) )
            // InternalCodesinfosParser.g:1535:1: ( ( rule__CodesinfosRootCodesItemsNodename__NodenameAssignment_2 ) )
            {
            // InternalCodesinfosParser.g:1535:1: ( ( rule__CodesinfosRootCodesItemsNodename__NodenameAssignment_2 ) )
            // InternalCodesinfosParser.g:1536:2: ( rule__CodesinfosRootCodesItemsNodename__NodenameAssignment_2 )
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getNodenameAssignment_2()); 
            // InternalCodesinfosParser.g:1537:2: ( rule__CodesinfosRootCodesItemsNodename__NodenameAssignment_2 )
            // InternalCodesinfosParser.g:1537:3: rule__CodesinfosRootCodesItemsNodename__NodenameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CodesinfosRootCodesItemsNodename__NodenameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getNodenameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsNodename__Group__2__Impl"


    // $ANTLR start "rule__CodesinfosRoot__CodesinfosRootAssignment_2_0"
    // InternalCodesinfosParser.g:1546:1: rule__CodesinfosRoot__CodesinfosRootAssignment_2_0 : ( ruleCodesinfosRootPropertiesAbstract ) ;
    public final void rule__CodesinfosRoot__CodesinfosRootAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1550:1: ( ( ruleCodesinfosRootPropertiesAbstract ) )
            // InternalCodesinfosParser.g:1551:2: ( ruleCodesinfosRootPropertiesAbstract )
            {
            // InternalCodesinfosParser.g:1551:2: ( ruleCodesinfosRootPropertiesAbstract )
            // InternalCodesinfosParser.g:1552:3: ruleCodesinfosRootPropertiesAbstract
            {
             before(grammarAccess.getCodesinfosRootAccess().getCodesinfosRootCodesinfosRootPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCodesinfosRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootAccess().getCodesinfosRootCodesinfosRootPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__CodesinfosRootAssignment_2_0"


    // $ANTLR start "rule__CodesinfosRoot__CodesinfosRootAssignment_2_1_1"
    // InternalCodesinfosParser.g:1561:1: rule__CodesinfosRoot__CodesinfosRootAssignment_2_1_1 : ( ruleCodesinfosRootPropertiesAbstract ) ;
    public final void rule__CodesinfosRoot__CodesinfosRootAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1565:1: ( ( ruleCodesinfosRootPropertiesAbstract ) )
            // InternalCodesinfosParser.g:1566:2: ( ruleCodesinfosRootPropertiesAbstract )
            {
            // InternalCodesinfosParser.g:1566:2: ( ruleCodesinfosRootPropertiesAbstract )
            // InternalCodesinfosParser.g:1567:3: ruleCodesinfosRootPropertiesAbstract
            {
             before(grammarAccess.getCodesinfosRootAccess().getCodesinfosRootCodesinfosRootPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCodesinfosRootPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootAccess().getCodesinfosRootCodesinfosRootPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRoot__CodesinfosRootAssignment_2_1_1"


    // $ANTLR start "rule__CodesinfosRootName__NameAssignment_3"
    // InternalCodesinfosParser.g:1576:1: rule__CodesinfosRootName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__CodesinfosRootName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1580:1: ( ( ruleEString ) )
            // InternalCodesinfosParser.g:1581:2: ( ruleEString )
            {
            // InternalCodesinfosParser.g:1581:2: ( ruleEString )
            // InternalCodesinfosParser.g:1582:3: ruleEString
            {
             before(grammarAccess.getCodesinfosRootNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootName__NameAssignment_3"


    // $ANTLR start "rule__CodesinfosRootCodes__CodesAssignment_4_0"
    // InternalCodesinfosParser.g:1591:1: rule__CodesinfosRootCodes__CodesAssignment_4_0 : ( ruleCodesinfosRootCodesItems ) ;
    public final void rule__CodesinfosRootCodes__CodesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1595:1: ( ( ruleCodesinfosRootCodesItems ) )
            // InternalCodesinfosParser.g:1596:2: ( ruleCodesinfosRootCodesItems )
            {
            // InternalCodesinfosParser.g:1596:2: ( ruleCodesinfosRootCodesItems )
            // InternalCodesinfosParser.g:1597:3: ruleCodesinfosRootCodesItems
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getCodesCodesinfosRootCodesItemsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCodesinfosRootCodesItems();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesAccess().getCodesCodesinfosRootCodesItemsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__CodesAssignment_4_0"


    // $ANTLR start "rule__CodesinfosRootCodes__CodesAssignment_4_1_1"
    // InternalCodesinfosParser.g:1606:1: rule__CodesinfosRootCodes__CodesAssignment_4_1_1 : ( ruleCodesinfosRootCodesItems ) ;
    public final void rule__CodesinfosRootCodes__CodesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1610:1: ( ( ruleCodesinfosRootCodesItems ) )
            // InternalCodesinfosParser.g:1611:2: ( ruleCodesinfosRootCodesItems )
            {
            // InternalCodesinfosParser.g:1611:2: ( ruleCodesinfosRootCodesItems )
            // InternalCodesinfosParser.g:1612:3: ruleCodesinfosRootCodesItems
            {
             before(grammarAccess.getCodesinfosRootCodesAccess().getCodesCodesinfosRootCodesItemsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCodesinfosRootCodesItems();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesAccess().getCodesCodesinfosRootCodesItemsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodes__CodesAssignment_4_1_1"


    // $ANTLR start "rule__CodesinfosRootCodesItems__ItemsAssignment_2_0"
    // InternalCodesinfosParser.g:1621:1: rule__CodesinfosRootCodesItems__ItemsAssignment_2_0 : ( ruleCodesinfosRootCodesItemsPropertiesAbstract ) ;
    public final void rule__CodesinfosRootCodesItems__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1625:1: ( ( ruleCodesinfosRootCodesItemsPropertiesAbstract ) )
            // InternalCodesinfosParser.g:1626:2: ( ruleCodesinfosRootCodesItemsPropertiesAbstract )
            {
            // InternalCodesinfosParser.g:1626:2: ( ruleCodesinfosRootCodesItemsPropertiesAbstract )
            // InternalCodesinfosParser.g:1627:3: ruleCodesinfosRootCodesItemsPropertiesAbstract
            {
             before(grammarAccess.getCodesinfosRootCodesItemsAccess().getItemsCodesinfosRootCodesItemsPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCodesinfosRootCodesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesItemsAccess().getItemsCodesinfosRootCodesItemsPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__ItemsAssignment_2_0"


    // $ANTLR start "rule__CodesinfosRootCodesItems__ItemsAssignment_2_1_1"
    // InternalCodesinfosParser.g:1636:1: rule__CodesinfosRootCodesItems__ItemsAssignment_2_1_1 : ( ruleCodesinfosRootCodesItemsPropertiesAbstract ) ;
    public final void rule__CodesinfosRootCodesItems__ItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1640:1: ( ( ruleCodesinfosRootCodesItemsPropertiesAbstract ) )
            // InternalCodesinfosParser.g:1641:2: ( ruleCodesinfosRootCodesItemsPropertiesAbstract )
            {
            // InternalCodesinfosParser.g:1641:2: ( ruleCodesinfosRootCodesItemsPropertiesAbstract )
            // InternalCodesinfosParser.g:1642:3: ruleCodesinfosRootCodesItemsPropertiesAbstract
            {
             before(grammarAccess.getCodesinfosRootCodesItemsAccess().getItemsCodesinfosRootCodesItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCodesinfosRootCodesItemsPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesItemsAccess().getItemsCodesinfosRootCodesItemsPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItems__ItemsAssignment_2_1_1"


    // $ANTLR start "rule__CodesinfosRootCodesItemsName__NameAssignment_3"
    // InternalCodesinfosParser.g:1651:1: rule__CodesinfosRootCodesItemsName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__CodesinfosRootCodesItemsName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1655:1: ( ( ruleEString ) )
            // InternalCodesinfosParser.g:1656:2: ( ruleEString )
            {
            // InternalCodesinfosParser.g:1656:2: ( ruleEString )
            // InternalCodesinfosParser.g:1657:3: ruleEString
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesItemsNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsName__NameAssignment_3"


    // $ANTLR start "rule__CodesinfosRootCodesItemsClassname__ClassnameAssignment_2"
    // InternalCodesinfosParser.g:1666:1: rule__CodesinfosRootCodesItemsClassname__ClassnameAssignment_2 : ( ruleEString ) ;
    public final void rule__CodesinfosRootCodesItemsClassname__ClassnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1670:1: ( ( ruleEString ) )
            // InternalCodesinfosParser.g:1671:2: ( ruleEString )
            {
            // InternalCodesinfosParser.g:1671:2: ( ruleEString )
            // InternalCodesinfosParser.g:1672:3: ruleEString
            {
             before(grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getClassnameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesItemsClassnameAccess().getClassnameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsClassname__ClassnameAssignment_2"


    // $ANTLR start "rule__CodesinfosRootCodesItemsNodename__NodenameAssignment_2"
    // InternalCodesinfosParser.g:1681:1: rule__CodesinfosRootCodesItemsNodename__NodenameAssignment_2 : ( ruleEString ) ;
    public final void rule__CodesinfosRootCodesItemsNodename__NodenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodesinfosParser.g:1685:1: ( ( ruleEString ) )
            // InternalCodesinfosParser.g:1686:2: ( ruleEString )
            {
            // InternalCodesinfosParser.g:1686:2: ( ruleEString )
            // InternalCodesinfosParser.g:1687:3: ruleEString
            {
             before(grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getNodenameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCodesinfosRootCodesItemsNodenameAccess().getNodenameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodesinfosRootCodesItemsNodename__NodenameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000020C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000080F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000020B0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000B0L});

}