/*
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MetamodelStandaloneSetup extends MetamodelStandaloneSetupGenerated {

	public static void doSetup() {
		new MetamodelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
