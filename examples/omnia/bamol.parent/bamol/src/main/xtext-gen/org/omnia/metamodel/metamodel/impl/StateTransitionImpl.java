/**
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.omnia.metamodel.metamodel.MetamodelPackage;
import org.omnia.metamodel.metamodel.State;
import org.omnia.metamodel.metamodel.StateDecision;
import org.omnia.metamodel.metamodel.StateTransition;
import org.omnia.metamodel.metamodel.StateTransitionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.StateTransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.StateTransitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.StateTransitionImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.StateTransitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.StateTransitionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.StateTransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.StateTransitionImpl#getDecision <em>Decision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateTransitionImpl extends MinimalEObjectImpl.Container implements StateTransition
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
   * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected static final int ORDER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected int order = ORDER_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final StateTransitionType TYPE_EDEFAULT = StateTransitionType.AUTO;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected StateTransitionType type = TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected State to;

  /**
   * The cached value of the '{@link #getDecision() <em>Decision</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecision()
   * @generated
   * @ordered
   */
  protected StateDecision decision;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateTransitionImpl()
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
    return MetamodelPackage.Literals.STATE_TRANSITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE_TRANSITION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE_TRANSITION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOrder(int newOrder)
  {
    int oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE_TRANSITION__ORDER, oldOrder, order));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateTransitionType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(StateTransitionType newType)
  {
    StateTransitionType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE_TRANSITION__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE_TRANSITION__EXPRESSION, oldExpression, expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getTo()
  {
    if (to != null && to.eIsProxy())
    {
      InternalEObject oldTo = (InternalEObject)to;
      to = (State)eResolveProxy(oldTo);
      if (to != oldTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.STATE_TRANSITION__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTo(State newTo)
  {
    State oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE_TRANSITION__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateDecision getDecision()
  {
    if (decision != null && decision.eIsProxy())
    {
      InternalEObject oldDecision = (InternalEObject)decision;
      decision = (StateDecision)eResolveProxy(oldDecision);
      if (decision != oldDecision)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.STATE_TRANSITION__DECISION, oldDecision, decision));
      }
    }
    return decision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDecision basicGetDecision()
  {
    return decision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDecision(StateDecision newDecision)
  {
    StateDecision oldDecision = decision;
    decision = newDecision;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.STATE_TRANSITION__DECISION, oldDecision, decision));
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
      case MetamodelPackage.STATE_TRANSITION__NAME:
        return getName();
      case MetamodelPackage.STATE_TRANSITION__DESCRIPTION:
        return getDescription();
      case MetamodelPackage.STATE_TRANSITION__ORDER:
        return getOrder();
      case MetamodelPackage.STATE_TRANSITION__TYPE:
        return getType();
      case MetamodelPackage.STATE_TRANSITION__EXPRESSION:
        return getExpression();
      case MetamodelPackage.STATE_TRANSITION__TO:
        if (resolve) return getTo();
        return basicGetTo();
      case MetamodelPackage.STATE_TRANSITION__DECISION:
        if (resolve) return getDecision();
        return basicGetDecision();
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
      case MetamodelPackage.STATE_TRANSITION__NAME:
        setName((String)newValue);
        return;
      case MetamodelPackage.STATE_TRANSITION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MetamodelPackage.STATE_TRANSITION__ORDER:
        setOrder((Integer)newValue);
        return;
      case MetamodelPackage.STATE_TRANSITION__TYPE:
        setType((StateTransitionType)newValue);
        return;
      case MetamodelPackage.STATE_TRANSITION__EXPRESSION:
        setExpression((String)newValue);
        return;
      case MetamodelPackage.STATE_TRANSITION__TO:
        setTo((State)newValue);
        return;
      case MetamodelPackage.STATE_TRANSITION__DECISION:
        setDecision((StateDecision)newValue);
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
      case MetamodelPackage.STATE_TRANSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MetamodelPackage.STATE_TRANSITION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MetamodelPackage.STATE_TRANSITION__ORDER:
        setOrder(ORDER_EDEFAULT);
        return;
      case MetamodelPackage.STATE_TRANSITION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MetamodelPackage.STATE_TRANSITION__EXPRESSION:
        setExpression(EXPRESSION_EDEFAULT);
        return;
      case MetamodelPackage.STATE_TRANSITION__TO:
        setTo((State)null);
        return;
      case MetamodelPackage.STATE_TRANSITION__DECISION:
        setDecision((StateDecision)null);
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
      case MetamodelPackage.STATE_TRANSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MetamodelPackage.STATE_TRANSITION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MetamodelPackage.STATE_TRANSITION__ORDER:
        return order != ORDER_EDEFAULT;
      case MetamodelPackage.STATE_TRANSITION__TYPE:
        return type != TYPE_EDEFAULT;
      case MetamodelPackage.STATE_TRANSITION__EXPRESSION:
        return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
      case MetamodelPackage.STATE_TRANSITION__TO:
        return to != null;
      case MetamodelPackage.STATE_TRANSITION__DECISION:
        return decision != null;
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
    result.append(", order: ");
    result.append(order);
    result.append(", type: ");
    result.append(type);
    result.append(", expression: ");
    result.append(expression);
    result.append(')');
    return result.toString();
  }

} //StateTransitionImpl
