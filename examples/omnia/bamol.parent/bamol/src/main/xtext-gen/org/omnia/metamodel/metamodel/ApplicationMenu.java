/**
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationMenu#getName <em>Name</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationMenu#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationMenu#getLabel <em>Label</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationMenu#getHelpText <em>Help Text</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationMenu#getType <em>Type</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationMenu#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationMenu#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.ApplicationMenu#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationMenu()
 * @model
 * @generated
 */
public interface ApplicationMenu extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationMenu_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.ApplicationMenu#getName <em>Name</em>}' attribute.
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
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationMenu_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.ApplicationMenu#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationMenu_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.ApplicationMenu#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Help Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Help Text</em>' attribute.
   * @see #setHelpText(String)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationMenu_HelpText()
   * @model
   * @generated
   */
  String getHelpText();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.ApplicationMenu#getHelpText <em>Help Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Help Text</em>' attribute.
   * @see #getHelpText()
   * @generated
   */
  void setHelpText(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.omnia.metamodel.metamodel.ElementType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.omnia.metamodel.metamodel.ElementType
   * @see #setType(ElementType)
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationMenu_Type()
   * @model
   * @generated
   */
  ElementType getType();

  /**
   * Sets the value of the '{@link org.omnia.metamodel.metamodel.ApplicationMenu#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.omnia.metamodel.metamodel.ElementType
   * @see #getType()
   * @generated
   */
  void setType(ElementType value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.ElementAttribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationMenu_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<ElementAttribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Behaviours</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.ElementBehaviour}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviours</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationMenu_Behaviours()
   * @model containment="true"
   * @generated
   */
  EList<ElementBehaviour> getBehaviours();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.omnia.metamodel.metamodel.InnerElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.omnia.metamodel.metamodel.MetamodelPackage#getApplicationMenu_Elements()
   * @model containment="true"
   * @generated
   */
  EList<InnerElement> getElements();

} // ApplicationMenu
