/*
 * generated by Xtext 2.23.0
 */
package accesses.accesses.ui.tests;

import accesses.accesses.ui.internal.AccessesActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class AccessesUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AccessesActivator.getInstance().getInjector("accesses.accesses.Accesses");
	}

}
