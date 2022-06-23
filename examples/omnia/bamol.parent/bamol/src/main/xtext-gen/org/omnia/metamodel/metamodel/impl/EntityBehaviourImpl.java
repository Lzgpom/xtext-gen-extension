/**
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.omnia.metamodel.metamodel.EntityBehaviour;
import org.omnia.metamodel.metamodel.EntityBehaviourType;
import org.omnia.metamodel.metamodel.MAttribute;
import org.omnia.metamodel.metamodel.MetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.EntityBehaviourImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.EntityBehaviourImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.EntityBehaviourImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.EntityBehaviourImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.EntityBehaviourImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityBehaviourImpl extends MinimalEObjectImpl.Container implements EntityBehaviour
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final EntityBehaviourType TYPE_EDEFAULT = EntityBehaviourType.ACTION;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EntityBehaviourType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected static final String EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected String expression = EXPRESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected MAttribute attribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityBehaviourImpl()
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
    return MetamodelPackage.Literals.ENTITY_BEHAVIOUR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_BEHAVIOUR__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_BEHAVIOUR__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityBehaviourType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(EntityBehaviourType newType)
  {
    EntityBehaviourType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_BEHAVIOUR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpression(String newExpression)
  {
    String oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_BEHAVIOUR__EXPRESSION, oldExpression, expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MAttribute getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttribute(MAttribute newAttribute, NotificationChain msgs)
  {
    MAttribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_BEHAVIOUR__ATTRIBUTE, oldAttribute, newAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttribute(MAttribute newAttribute)
  {
    if (newAttribute != attribute)
    {
      NotificationChain msgs = null;
      if (attribute != null)
        msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.ENTITY_BEHAVIOUR__ATTRIBUTE, null, msgs);
      if (newAttribute != null)
        msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.ENTITY_BEHAVIOUR__ATTRIBUTE, null, msgs);
      msgs = basicSetAttribute(newAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY_BEHAVIOUR__ATTRIBUTE, newAttribute, newAttribute));
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
      case MetamodelPackage.ENTITY_BEHAVIOUR__ATTRIBUTE:
        return basicSetAttribute(null, msgs);
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
      case MetamodelPackage.ENTITY_BEHAVIOUR__NAME:
        return getName();
      case MetamodelPackage.ENTITY_BEHAVIOUR__DESCRIPTION:
        return getDescription();
      case MetamodelPackage.ENTITY_BEHAVIOUR__TYPE:
        return getType();
      case MetamodelPackage.ENTITY_BEHAVIOUR__EXPRESSION:
        return getExpression();
      case MetamodelPackage.ENTITY_BEHAVIOUR__ATTRIBUTE:
        return getAttribute();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MetamodelPackage.ENTITY_BEHAVIOUR__NAME:
        setName((String)newValue);
        return;
      case MetamodelPackage.ENTITY_BEHAVIOUR__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MetamodelPackage.ENTITY_BEHAVIOUR__TYPE:
        setType((EntityBehaviourType)newValue);
        return;
      case MetamodelPackage.ENTITY_BEHAVIOUR__EXPRESSION:
        setExpression((String)newValue);
        return;
      case MetamodelPackage.ENTITY_BEHAVIOUR__ATTRIBUTE:
        setAttribute((MAttribute)newValue);
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
      case MetamodelPackage.ENTITY_BEHAVIOUR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MetamodelPackage.ENTITY_BEHAVIOUR__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MetamodelPackage.ENTITY_BEHAVIOUR__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MetamodelPackage.ENTITY_BEHAVIOUR__EXPRESSION:
        setExpression(EXPRESSION_EDEFAULT);
        return;
      case MetamodelPackage.ENTITY_BEHAVIOUR__ATTRIBUTE:
        setAttribute((MAttribute)null);
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
      case MetamodelPackage.ENTITY_BEHAVIOUR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MetamodelPackage.ENTITY_BEHAVIOUR__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MetamodelPackage.ENTITY_BEHAVIOUR__TYPE:
        return type != TYPE_EDEFAULT;
      case MetamodelPackage.ENTITY_BEHAVIOUR__EXPRESSION:
        return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
      case MetamodelPackage.ENTITY_BEHAVIOUR__ATTRIBUTE:
        return attribute != null;
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
    result.append(", type: ");
    result.append(type);
    result.append(", expression: ");
    result.append(expression);
    result.append(')');
    return result.toString();
  }

} //EntityBehaviourImpl