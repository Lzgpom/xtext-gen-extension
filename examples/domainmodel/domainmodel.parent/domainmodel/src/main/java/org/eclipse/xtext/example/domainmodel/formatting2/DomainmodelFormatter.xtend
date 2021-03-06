/*
 * generated by Xtext 2.27.0
 */
package org.eclipse.xtext.example.domainmodel.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.example.domainmodel.domainmodel.DomainModel
import org.eclipse.xtext.example.domainmodel.domainmodel.PackageDeclaration
import org.eclipse.xtext.example.domainmodel.services.DomainmodelGrammarAccess
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.xbase.formatting2.XbaseFormatter

class DomainmodelFormatter extends XbaseFormatter {
	
	@Inject extension DomainmodelGrammarAccess

	def dispatch void format(DomainModel domainModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		domainModel.importSection.format
		for (abstractElement : domainModel.elements) {
			abstractElement.format
		}
	}

	def dispatch void format(PackageDeclaration packageDeclaration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (abstractElement : packageDeclaration.elements) {
			abstractElement.format
		}
	}
	
	// TODO: implement for Entity, Property, Operation
}
