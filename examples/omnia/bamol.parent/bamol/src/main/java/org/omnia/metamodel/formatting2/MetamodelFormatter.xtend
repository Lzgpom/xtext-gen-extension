/*
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.omnia.metamodel.metamodel.Agent
import org.omnia.metamodel.metamodel.App
import org.omnia.metamodel.services.MetamodelGrammarAccess

class MetamodelFormatter extends AbstractFormatter2 {
	
	@Inject extension MetamodelGrammarAccess

	def dispatch void format(App app, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (agent : app.agents) {
			agent.format
		}
		for (applicationBehaviour : app.applicationBehaviours) {
			applicationBehaviour.format
		}
		for (commitement : app.commitements) {
			commitement.format
		}
		for (dashboard : app.dashboards) {
			dashboard.format
		}
		for (dataSource : app.datasources) {
			dataSource.format
		}
		for (_document : app.documents) {
			_document.format
		}
		for (enumeration : app.enumerations) {
			enumeration.format
		}
		for (form : app.forms) {
			form.format
		}
		for (genericEntity : app.genericEntities) {
			genericEntity.format
		}
		for (list : app.lists) {
			list.format
		}
		for (query : app.queries) {
			query.format
		}
		for (resource : app.resources) {
			resource.format
		}
		for (selector : app.selectors) {
			selector.format
		}
		for (serie : app.series) {
			serie.format
		}
		for (stateMachine : app.stateMachines) {
			stateMachine.format
		}
		for (event : app.events) {
			event.format
		}
		for (applicationMenu : app.applicationMenus) {
			applicationMenu.format
		}
		for (language : app.languages) {
			language.format
		}
		for (webComponent : app.webComponents) {
			webComponent.format
		}
		for (textTemplate : app.textTemplates) {
			textTemplate.format
		}
		for (theme : app.themes) {
			theme.format
		}
		for (authorizationPolicy : app.authorizationPolicies) {
			authorizationPolicy.format
		}
		for (authorizationRole : app.authorizationRoles) {
			authorizationRole.format
		}
	}

	def dispatch void format(Agent agent, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (mAttribute : agent.attributes) {
			mAttribute.format
		}
		for (entityBehaviour : agent.entityBehaviours) {
			entityBehaviour.format
		}
		for (dataBehaviour : agent.dataBehaviours) {
			dataBehaviour.format
		}
		for (behaviourNamespace : agent.behaviourNamespaces) {
			behaviourNamespace.format
		}
	}
	
	// TODO: implement for ApplicationBehaviour, Commitement, Dashboard, DataSource, Document, Enumeration, Form, GenericEntity, List, Query, Resource, Selector, Serie, StateMachine, Event, ApplicationMenu, Language, AuthorizationPolicy, AuthorizationRole, MAttribute, EntityBehaviour, InnerElement, QueryTable, QueryJoin, State
}