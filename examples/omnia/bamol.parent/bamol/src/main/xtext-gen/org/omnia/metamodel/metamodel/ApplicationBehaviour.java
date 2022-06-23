/**
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationBehaviour#getName <em>Name</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationBehaviour#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationBehaviour#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationBehaviour#getExecutionLocation <em>Execution Location</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationBehaviour#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationBehaviour#getBehaviourNamespaces <em>Behaviour Namespaces</em>}</li>
 * </ul>
 *
 * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationBehaviour()
 * @model
 * @generated
 */
public interface ApplicationBehaviour extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationBehaviour_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.ApplicationBehaviour#getName <em>Name</em>}' attribute.
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
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationBehaviour_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.ApplicationBehaviour#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' attribute.
   * @see #setExpression(String)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationBehaviour_Expression()
   * @model
   * @generated
   */
  String getExpression();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.ApplicationBehaviour#getExpression <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' attribute.
   * @see #getExpression()
   * @generated
   */
  void setExpression(String value);

  /**
   * Returns the value of the '<em><b>Execution Location</b></em>' attribute.
   * The literals are from the enumeration {@link org.omnia.metamodel.metamodel.ExecutionLocation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Execution Location</em>' attribute.
   * @see org.omnia.metamodel.metamodel.ExecutionLocation
   * @see #setExecutionLocation(ExecutionLocation)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationBehaviour_ExecutionLocation()
   * @model
   * @generated
   */
  ExecutionLocation getExecutionLocation();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.ApplicationBehaviour#getExecutionLocation <em>Execution Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Execution Location</em>' attribute.
   * @see org.omnia.metamodel.metamodel.ExecutionLocation
   * @see #getExecutionLocation()
   * @generated
   */
  void setExecutionLocation(ExecutionLocation value);

  /**
   * Returns the value of the '<em><b>Data Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Source</em>' reference.
   * @see #setDataSource(DataSource)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationBehaviour_DataSource()
   * @model
   * @generated
   */
  DataSource getDataSource();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.ApplicationBehaviour#getDataSource <em>Data Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Source</em>' reference.
   * @see #getDataSource()
   * @generated
   */
  void setDataSource(DataSource value);

  /**
   * Returns the value of the '<em><b>Behaviour Namespaces</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.BehaviourNamespace}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviour Namespaces</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationBehaviour_BehaviourNamespaces()
   * @model containment="true"
   * @generated
   */
  EList<BehaviourNamespace> getBehaviourNamespaces();

} // ApplicationBehaviour