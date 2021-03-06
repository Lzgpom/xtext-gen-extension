/**
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.Event#getName <em>Name</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.Event#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.Event#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.Event#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.Event#getEntityBehaviours <em>Entity Behaviours</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.Event#getDataBehaviours <em>Data Behaviours</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.Event#getBehaviourNamespaces <em>Behaviour Namespaces</em>}</li>
 * </ul>
 *
 * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Entity, MType
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEvent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.Event#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEvent_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.Event#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Data Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Source</em>' reference.
   * @see #setDataSource(DataSource)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEvent_DataSource()
   * @model
   * @generated
   */
  DataSource getDataSource();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.Event#getDataSource <em>Data Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Source</em>' reference.
   * @see #getDataSource()
   * @generated
   */
  void setDataSource(DataSource value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.MAttribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEvent_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<MAttribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Entity Behaviours</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.EntityBehaviour}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Behaviours</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEvent_EntityBehaviours()
   * @model containment="true"
   * @generated
   */
  EList<EntityBehaviour> getEntityBehaviours();

  /**
   * Returns the value of the '<em><b>Data Behaviours</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.DataBehaviour}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Behaviours</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEvent_DataBehaviours()
   * @model containment="true"
   * @generated
   */
  EList<DataBehaviour> getDataBehaviours();

  /**
   * Returns the value of the '<em><b>Behaviour Namespaces</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.BehaviourNamespace}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviour Namespaces</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEvent_BehaviourNamespaces()
   * @model containment="true"
   * @generated
   */
  EList<BehaviourNamespace> getBehaviourNamespaces();

} // Event
