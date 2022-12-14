/*
 * generated by Xtext 2.23.0
 */
package accesses.accesses.parser.antlr;

import accesses.accesses.parser.antlr.internal.InternalAccessesParser;
import accesses.accesses.services.AccessesGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AccessesParser extends AbstractAntlrParser {

	@Inject
	private AccessesGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAccessesParser createParser(XtextTokenStream stream) {
		return new InternalAccessesParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "AccessesRoot";
	}

	public AccessesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AccessesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
