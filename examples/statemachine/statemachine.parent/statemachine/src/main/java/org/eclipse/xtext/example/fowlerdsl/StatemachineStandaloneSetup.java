/*
 * generated by Xtext 2.27.0
 */
package org.eclipse.xtext.example.fowlerdsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class StatemachineStandaloneSetup extends StatemachineStandaloneSetupGenerated {

	public static void doSetup() {
		new StatemachineStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
