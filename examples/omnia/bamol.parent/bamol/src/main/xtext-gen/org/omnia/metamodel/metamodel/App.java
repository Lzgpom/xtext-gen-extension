/**
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getAgents <em>Agents</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getApplicationBehaviours <em>Application Behaviours</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getCommitements <em>Commitements</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getDashboards <em>Dashboards</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getDatasources <em>Datasources</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getDocuments <em>Documents</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getForms <em>Forms</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getGenericEntities <em>Generic Entities</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getLists <em>Lists</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getQueries <em>Queries</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getResources <em>Resources</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getSeries <em>Series</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getStateMachines <em>State Machines</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getEvents <em>Events</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getApplicationMenus <em>Application Menus</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getLanguages <em>Languages</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getWebComponents <em>Web Components</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getTextTemplates <em>Text Templates</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getThemes <em>Themes</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getAuthorizationPolicies <em>Authorization Policies</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.App#getAuthorizationRoles <em>Authorization Roles</em>}</li>
 * </ul>
 *
 * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp()
 * @model
 * @generated
 */
public interface App extends EObject
{
  /**
   * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Agent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agents</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Agents()
   * @model containment="true"
   * @generated
   */
  EList<Agent> getAgents();

  /**
   * Returns the value of the '<em><b>Application Behaviours</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.ApplicationBehaviour}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application Behaviours</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_ApplicationBehaviours()
   * @model containment="true"
   * @generated
   */
  EList<ApplicationBehaviour> getApplicationBehaviours();

  /**
   * Returns the value of the '<em><b>Commitements</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Commitement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commitements</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Commitements()
   * @model containment="true"
   * @generated
   */
  EList<Commitement> getCommitements();

  /**
   * Returns the value of the '<em><b>Dashboards</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Dashboard}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dashboards</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Dashboards()
   * @model containment="true"
   * @generated
   */
  EList<Dashboard> getDashboards();

  /**
   * Returns the value of the '<em><b>Datasources</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.DataSource}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datasources</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Datasources()
   * @model containment="true"
   * @generated
   */
  EList<DataSource> getDatasources();

  /**
   * Returns the value of the '<em><b>Documents</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Document}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documents</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Documents()
   * @model containment="true"
   * @generated
   */
  EList<Document> getDocuments();

  /**
   * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Enumeration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerations</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Enumerations()
   * @model containment="true"
   * @generated
   */
  EList<Enumeration> getEnumerations();

  /**
   * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Form}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forms</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Forms()
   * @model containment="true"
   * @generated
   */
  EList<Form> getForms();

  /**
   * Returns the value of the '<em><b>Generic Entities</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.GenericEntity}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Entities</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_GenericEntities()
   * @model containment="true"
   * @generated
   */
  EList<GenericEntity> getGenericEntities();

  /**
   * Returns the value of the '<em><b>Lists</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.List}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lists</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Lists()
   * @model containment="true"
   * @generated
   */
  EList<List> getLists();

  /**
   * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Query}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queries</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Queries()
   * @model containment="true"
   * @generated
   */
  EList<Query> getQueries();

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Resource}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Resources()
   * @model containment="true"
   * @generated
   */
  EList<Resource> getResources();

  /**
   * Returns the value of the '<em><b>Selectors</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Selector}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selectors</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Selectors()
   * @model containment="true"
   * @generated
   */
  EList<Selector> getSelectors();

  /**
   * Returns the value of the '<em><b>Series</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Serie}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Series</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Series()
   * @model containment="true"
   * @generated
   */
  EList<Serie> getSeries();

  /**
   * Returns the value of the '<em><b>State Machines</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.StateMachine}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Machines</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_StateMachines()
   * @model containment="true"
   * @generated
   */
  EList<StateMachine> getStateMachines();

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

  /**
   * Returns the value of the '<em><b>Application Menus</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.ApplicationMenu}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application Menus</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_ApplicationMenus()
   * @model containment="true"
   * @generated
   */
  EList<ApplicationMenu> getApplicationMenus();

  /**
   * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Language}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Languages</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Languages()
   * @model containment="true"
   * @generated
   */
  EList<Language> getLanguages();

  /**
   * Returns the value of the '<em><b>Web Components</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.WebComponent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Web Components</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_WebComponents()
   * @model containment="true"
   * @generated
   */
  EList<WebComponent> getWebComponents();

  /**
   * Returns the value of the '<em><b>Text Templates</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.TextTemplate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Templates</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_TextTemplates()
   * @model containment="true"
   * @generated
   */
  EList<TextTemplate> getTextTemplates();

  /**
   * Returns the value of the '<em><b>Themes</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.Theme}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Themes</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_Themes()
   * @model containment="true"
   * @generated
   */
  EList<Theme> getThemes();

  /**
   * Returns the value of the '<em><b>Authorization Policies</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.AuthorizationPolicy}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Authorization Policies</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_AuthorizationPolicies()
   * @model containment="true"
   * @generated
   */
  EList<AuthorizationPolicy> getAuthorizationPolicies();

  /**
   * Returns the value of the '<em><b>Authorization Roles</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.AuthorizationRole}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Authorization Roles</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApp_AuthorizationRoles()
   * @model containment="true"
   * @generated
   */
  EList<AuthorizationRole> getAuthorizationRoles();

} // App
