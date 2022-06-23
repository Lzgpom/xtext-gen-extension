/**
 * generated by Xtext 2.27.0
 */
package org.eclipse.xtext.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.AbstractElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getAbstractElement()
 * @model
 * @generated
 */
public interface AbstractElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getAbstractElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.example.domainmodel.domainmodel.AbstractElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // AbstractElement
