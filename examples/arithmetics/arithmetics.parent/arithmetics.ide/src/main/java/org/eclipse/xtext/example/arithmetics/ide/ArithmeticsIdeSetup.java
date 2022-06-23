/*
 * generated by Xtext 2.27.0
 */
package org.eclipse.xtext.example.arithmetics.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.example.arithmetics.ArithmeticsRuntimeModule;
import org.eclipse.xtext.example.arithmetics.ArithmeticsStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ArithmeticsIdeSetup extends ArithmeticsStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ArithmeticsRuntimeModule(), new ArithmeticsIdeModule()));
	}
	
}
