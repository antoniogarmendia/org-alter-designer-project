/*
 * generated by Xtext 2.23.0
 */
package codesinfos.codesinfos.ide;

import codesinfos.codesinfos.CodesinfosRuntimeModule;
import codesinfos.codesinfos.CodesinfosStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CodesinfosIdeSetup extends CodesinfosStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new CodesinfosRuntimeModule(), new CodesinfosIdeModule()));
	}
	
}