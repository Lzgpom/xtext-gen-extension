/**
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omnia.metamodel.metamodel.ApplicationMenu;
import org.omnia.metamodel.metamodel.ElementAttribute;
import org.omnia.metamodel.metamodel.ElementBehaviour;
import org.omnia.metamodel.metamodel.ElementType;
import org.omnia.metamodel.metamodel.InnerElement;
import org.omnia.metamodel.metamodel.MetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ApplicationMenuImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ApplicationMenuImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ApplicationMenuImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ApplicationMenuImpl#getHelpText <em>Help Text</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ApplicationMenuImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ApplicationMenuImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ApplicationMenuImpl#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ApplicationMenuImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationMenuImpl extends MinimalEObjectImpl.Container implements ApplicationMenu
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getHelpText() <em>Help Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelpText()
   * @generated
   * @ordered
   */
  protected static final String HELP_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHelpText() <em>Help Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelpText()
   * @generated
   * @ordered
   */
  protected String helpText = HELP_TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ElementType TYPE_EDEFAULT = ElementType.INPUT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ElementType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<ElementAttribute> attributes;

  /**
   * The cached value of the '{@link #getBehaviours() <em>Behaviours</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviours()
   * @generated
   * @ordered
   */
  protected EList<ElementBehaviour> behaviours;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<InnerElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationMenuImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MetamodelPackage.Literals.APPLICATION_MENU;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.APPLICATION_MENU__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.APPLICATION_MENU__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.APPLICATION_MENU__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHelpText()
  {
    return helpText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHelpText(String newHelpText)
  {
    String oldHelpText = helpText;
    helpText = newHelpText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.APPLICATION_MENU__HELP_TEXT, oldHelpText, helpText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ElementType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(ElementType newType)
  {
    ElementType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.APPLICATION_MENU__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ElementAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<ElementAttribute>(ElementAttribute.class, this, MetamodelPackage.APPLICATION_MENU__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ElementBehaviour> getBehaviours()
  {
    if (behaviours == null)
    {
      behaviours = new EObjectContainmentEList<ElementBehaviour>(ElementBehaviour.class, this, MetamodelPackage.APPLICATION_MENU__BEHAVIOURS);
    }
    return behaviours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InnerElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<InnerElement>(InnerElement.class, this, MetamodelPackage.APPLICATION_MENU__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MetamodelPackage.APPLICATION_MENU__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case MetamodelPackage.APPLICATION_MENU__BEHAVIOURS:
        return ((InternalEList<?>)getBehaviours()).basicRemove(otherEnd, msgs);
      case MetamodelPackage.APPLICATION_MENU__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MetamodelPackage.APPLICATION_MENU__NAME:
        return getName();
      case MetamodelPackage.APPLICATION_MENU__DESCRIPTION:
        return getDescription();
      case MetamodelPackage.APPLICATION_MENU__LABEL:
        return getLabel();
      case MetamodelPackage.APPLICATION_MENU__HELP_TEXT:
        return getHelpText();
      case MetamodelPackage.APPLICATION_MENU__TYPE:
        return getType();
      case MetamodelPackage.APPLICATION_MENU__ATTRIBUTES:
        return getAttributes();
      case MetamodelPackage.APPLICATION_MENU__BEHAVIOURS:
        return getBehaviours();
      case MetamodelPackage.APPLICATION_MENU__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MetamodelPackage.APPLICATION_MENU__NAME:
        setName((String)newValue);
        return;
      case MetamodelPackage.APPLICATION_MENU__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MetamodelPackage.APPLICATION_MENU__LABEL:
        setLabel((String)newValue);
        return;
      case MetamodelPackage.APPLICATION_MENU__HELP_TEXT:
        setHelpText((String)newValue);
        return;
      case MetamodelPackage.APPLICATION_MENU__TYPE:
        setType((ElementType)newValue);
        return;
      case MetamodelPackage.APPLICATION_MENU__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends ElementAttribute>)newValue);
        return;
      case MetamodelPackage.APPLICATION_MENU__BEHAVIOURS:
        getBehaviours().clear();
        getBehaviours().addAll((Collection<? extends ElementBehaviour>)newValue);
        return;
      case MetamodelPackage.APPLICATION_MENU__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends InnerElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MetamodelPackage.APPLICATION_MENU__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MetamodelPackage.APPLICATION_MENU__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MetamodelPackage.APPLICATION_MENU__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case MetamodelPackage.APPLICATION_MENU__HELP_TEXT:
        setHelpText(HELP_TEXT_EDEFAULT);
        return;
      case MetamodelPackage.APPLICATION_MENU__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MetamodelPackage.APPLICATION_MENU__ATTRIBUTES:
        getAttributes().clear();
        return;
      case MetamodelPackage.APPLICATION_MENU__BEHAVIOURS:
        getBehaviours().clear();
        return;
      case MetamodelPackage.APPLICATION_MENU__ELEMENTS:
        getElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MetamodelPackage.APPLICATION_MENU__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MetamodelPackage.APPLICATION_MENU__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MetamodelPackage.APPLICATION_MENU__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case MetamodelPackage.APPLICATION_MENU__HELP_TEXT:
        return HELP_TEXT_EDEFAULT == null ? helpText != null : !HELP_TEXT_EDEFAULT.equals(helpText);
      case MetamodelPackage.APPLICATION_MENU__TYPE:
        return type != TYPE_EDEFAULT;
      case MetamodelPackage.APPLICATION_MENU__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case MetamodelPackage.APPLICATION_MENU__BEHAVIOURS:
        return behaviours != null && !behaviours.isEmpty();
      case MetamodelPackage.APPLICATION_MENU__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", label: ");
    result.append(label);
    result.append(", helpText: ");
    result.append(helpText);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ApplicationMenuImpl