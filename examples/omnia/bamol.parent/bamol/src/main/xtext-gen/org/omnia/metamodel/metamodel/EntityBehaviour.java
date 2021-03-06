/**
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.EntityBehaviour#getName <em>Name</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.EntityBehaviour#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.EntityBehaviour#getType <em>Type</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.EntityBehaviour#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.EntityBehaviour#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEntityBehaviour()
 * @model
 * @generated
 */
public interface EntityBehaviour extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEntityBehaviour_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.EntityBehaviour#getName <em>Name</em>}' attribute.
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
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEntityBehaviour_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.EntityBehaviour#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.omnia.metamodel.metamodel.EntityBehaviourType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.omnia.metamodel.metamodel.EntityBehaviourType
   * @see #setType(EntityBehaviourType)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEntityBehaviour_Type()
   * @model
   * @generated
   */
  EntityBehaviourType getType();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.EntityBehaviour#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.omnia.metamodel.metamodel.EntityBehaviourType
   * @see #getType()
   * @generated
   */
  void setType(EntityBehaviourType value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' attribute.
   * @see #setExpression(String)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEntityBehaviour_Expression()
   * @model
   * @generated
   */
  String getExpression();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.EntityBehaviour#getExpression <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' attribute.
   * @see #getExpression()
   * @generated
   */
  void setExpression(String value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(MAttribute)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getEntityBehaviour_Attribute()
   * @model containment="true"
   * @generated
   */
  MAttribute getAttribute();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.EntityBehaviour#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(MAttribute value);

} // EntityBehaviour
