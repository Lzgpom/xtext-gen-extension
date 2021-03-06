/*
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.omnia.metamodel.MetamodelRuntimeModule;
import org.omnia.metamodel.MetamodelStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MetamodelIdeSetup extends MetamodelStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MetamodelRuntimeModule(), new MetamodelIdeModule()));
	}
	
}
