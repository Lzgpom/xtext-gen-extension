/**
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Ordered Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.QueryOrderedProperty#getPath <em>Path</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.QueryOrderedProperty#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.QueryOrderedProperty#getFunction <em>Function</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.QueryOrderedProperty#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see org.omnia.metamodel.metamodel.MetamodelPackage#getQueryOrderedProperty()
 * @model
 * @generated
 */
public interface QueryOrderedProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getQueryOrderedProperty_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.QueryOrderedProperty#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(String)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getQueryOrderedProperty_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.QueryOrderedProperty#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * The literals are from the enumeration {@link org.omnia.metamodel.metamodel.QueryFunction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see org.omnia.metamodel.metamodel.QueryFunction
   * @see #setFunction(QueryFunction)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getQueryOrderedProperty_Function()
   * @model
   * @generated
   */
  QueryFunction getFunction();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.QueryOrderedProperty#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see org.omnia.metamodel.metamodel.QueryFunction
   * @see #getFunction()
   * @generated
   */
  void setFunction(QueryFunction value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link org.omnia.metamodel.metamodel.QuerySort}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see org.omnia.metamodel.metamodel.QuerySort
   * @see #setDirection(QuerySort)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getQueryOrderedProperty_Direction()
   * @model
   * @generated
   */
  QuerySort getDirection();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.QueryOrderedProperty#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see org.omnia.metamodel.metamodel.QuerySort
   * @see #getDirection()
   * @generated
   */
  void setDirection(QuerySort value);

} // QueryOrderedProperty
