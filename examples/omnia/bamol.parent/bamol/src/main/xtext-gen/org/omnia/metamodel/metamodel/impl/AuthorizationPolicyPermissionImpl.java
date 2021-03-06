/**
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.omnia.metamodel.metamodel.AuthorizationPolicyPermission;
import org.omnia.metamodel.metamodel.AuthorizationRole;
import org.omnia.metamodel.metamodel.MetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Policy Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.AuthorizationPolicyPermissionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.AuthorizationPolicyPermissionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.AuthorizationPolicyPermissionImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizationPolicyPermissionImpl extends MinimalEObjectImpl.Container implements AuthorizationPolicyPermission
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
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<AuthorizationRole> roles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AuthorizationPolicyPermissionImpl()
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
    return MetamodelPackage.Literals.AUTHORIZATION_POLICY_PERMISSION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AuthorizationRole> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectResolvingEList<AuthorizationRole>(AuthorizationRole.class, this, MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__ROLES);
    }
    return roles;
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
      case MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__NAME:
        return getName();
      case MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__DESCRIPTION:
        return getDescription();
      case MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__ROLES:
        return getRoles();
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
      case MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__NAME:
        setName((String)newValue);
        return;
      case MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends AuthorizationRole>)newValue);
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
      case MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__ROLES:
        getRoles().clear();
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
      case MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MetamodelPackage.AUTHORIZATION_POLICY_PERMISSION__ROLES:
        return roles != null && !roles.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //AuthorizationPolicyPermissionImpl
