/**
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.omnia.metamodel.metamodel.MetamodelPackage;
import org.omnia.metamodel.metamodel.QueryFunction;
import org.omnia.metamodel.metamodel.QueryProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.QueryPropertyImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.QueryPropertyImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.QueryPropertyImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryPropertyImpl extends MinimalEObjectImpl.Container implements QueryProperty
{
  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected static final QueryFunction FUNCTION_EDEFAULT = QueryFunction.NONE;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected QueryFunction function = FUNCTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryPropertyImpl()
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
    return MetamodelPackage.Literals.QUERY_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.QUERY_PROPERTY__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.QUERY_PROPERTY__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QueryFunction getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunction(QueryFunction newFunction)
  {
    QueryFunction oldFunction = function;
    function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.QUERY_PROPERTY__FUNCTION, oldFunction, function));
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
      case MetamodelPackage.QUERY_PROPERTY__PATH:
        return getPath();
      case MetamodelPackage.QUERY_PROPERTY__ALIAS:
        return getAlias();
      case MetamodelPackage.QUERY_PROPERTY__FUNCTION:
        return getFunction();
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
      case MetamodelPackage.QUERY_PROPERTY__PATH:
        setPath((String)newValue);
        return;
      case MetamodelPackage.QUERY_PROPERTY__ALIAS:
        setAlias((String)newValue);
        return;
      case MetamodelPackage.QUERY_PROPERTY__FUNCTION:
        setFunction((QueryFunction)newValue);
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
      case MetamodelPackage.QUERY_PROPERTY__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case MetamodelPackage.QUERY_PROPERTY__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case MetamodelPackage.QUERY_PROPERTY__FUNCTION:
        setFunction(FUNCTION_EDEFAULT);
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
      case MetamodelPackage.QUERY_PROPERTY__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case MetamodelPackage.QUERY_PROPERTY__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case MetamodelPackage.QUERY_PROPERTY__FUNCTION:
        return function != FUNCTION_EDEFAULT;
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
    result.append(" (path: ");
    result.append(path);
    result.append(", alias: ");
    result.append(alias);
    result.append(", function: ");
    result.append(function);
    result.append(')');
    return result.toString();
  }

} //QueryPropertyImpl
