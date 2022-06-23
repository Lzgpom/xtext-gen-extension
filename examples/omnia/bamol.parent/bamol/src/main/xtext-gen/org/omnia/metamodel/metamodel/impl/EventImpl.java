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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omnia.metamodel.metamodel.BehaviourNamespace;
import org.omnia.metamodel.metamodel.DataBehaviour;
import org.omnia.metamodel.metamodel.DataSource;
import org.omnia.metamodel.metamodel.EntityBehaviour;
import org.omnia.metamodel.metamodel.Event;
import org.omnia.metamodel.metamodel.MAttribute;
import org.omnia.metamodel.metamodel.MetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.EventImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.EventImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.EventImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.EventImpl#getEntityBehaviours <em>Entity Behaviours</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.EventImpl#getDataBehaviours <em>Data Behaviours</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.EventImpl#getBehaviourNamespaces <em>Behaviour Namespaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends EntityImpl implements Event
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
   * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataSource()
   * @generated
   * @ordered
   */
  protected DataSource dataSource;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<MAttribute> attributes;

  /**
   * The cached value of the '{@link #getEntityBehaviours() <em>Entity Behaviours</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityBehaviours()
   * @generated
   * @ordered
   */
  protected EList<EntityBehaviour> entityBehaviours;

  /**
   * The cached value of the '{@link #getDataBehaviours() <em>Data Behaviours</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataBehaviours()
   * @generated
   * @ordered
   */
  protected EList<DataBehaviour> dataBehaviours;

  /**
   * The cached value of the '{@link #getBehaviourNamespaces() <em>Behaviour Namespaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviourNamespaces()
   * @generated
   * @ordered
   */
  protected EList<BehaviourNamespace> behaviourNamespaces;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return MetamodelPackage.Literals.EVENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.EVENT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.EVENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataSource getDataSource()
  {
    if (dataSource != null && dataSource.eIsProxy())
    {
      InternalEObject oldDataSource = (InternalEObject)dataSource;
      dataSource = (DataSource)eResolveProxy(oldDataSource);
      if (dataSource != oldDataSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.EVENT__DATA_SOURCE, oldDataSource, dataSource));
      }
    }
    return dataSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSource basicGetDataSource()
  {
    return dataSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDataSource(DataSource newDataSource)
  {
    DataSource oldDataSource = dataSource;
    dataSource = newDataSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.EVENT__DATA_SOURCE, oldDataSource, dataSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<MAttribute>(MAttribute.class, this, MetamodelPackage.EVENT__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EntityBehaviour> getEntityBehaviours()
  {
    if (entityBehaviours == null)
    {
      entityBehaviours = new EObjectContainmentEList<EntityBehaviour>(EntityBehaviour.class, this, MetamodelPackage.EVENT__ENTITY_BEHAVIOURS);
    }
    return entityBehaviours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DataBehaviour> getDataBehaviours()
  {
    if (dataBehaviours == null)
    {
      dataBehaviours = new EObjectContainmentEList<DataBehaviour>(DataBehaviour.class, this, MetamodelPackage.EVENT__DATA_BEHAVIOURS);
    }
    return dataBehaviours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BehaviourNamespace> getBehaviourNamespaces()
  {
    if (behaviourNamespaces == null)
    {
      behaviourNamespaces = new EObjectContainmentEList<BehaviourNamespace>(BehaviourNamespace.class, this, MetamodelPackage.EVENT__BEHAVIOUR_NAMESPACES);
    }
    return behaviourNamespaces;
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
      case MetamodelPackage.EVENT__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case MetamodelPackage.EVENT__ENTITY_BEHAVIOURS:
        return ((InternalEList<?>)getEntityBehaviours()).basicRemove(otherEnd, msgs);
      case MetamodelPackage.EVENT__DATA_BEHAVIOURS:
        return ((InternalEList<?>)getDataBehaviours()).basicRemove(otherEnd, msgs);
      case MetamodelPackage.EVENT__BEHAVIOUR_NAMESPACES:
        return ((InternalEList<?>)getBehaviourNamespaces()).basicRemove(otherEnd, msgs);
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
      case MetamodelPackage.EVENT__NAME:
        return getName();
      case MetamodelPackage.EVENT__DESCRIPTION:
        return getDescription();
      case MetamodelPackage.EVENT__DATA_SOURCE:
        if (resolve) return getDataSource();
        return basicGetDataSource();
      case MetamodelPackage.EVENT__ATTRIBUTES:
        return getAttributes();
      case MetamodelPackage.EVENT__ENTITY_BEHAVIOURS:
        return getEntityBehaviours();
      case MetamodelPackage.EVENT__DATA_BEHAVIOURS:
        return getDataBehaviours();
      case MetamodelPackage.EVENT__BEHAVIOUR_NAMESPACES:
        return getBehaviourNamespaces();
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
      case MetamodelPackage.EVENT__NAME:
        setName((String)newValue);
        return;
      case MetamodelPackage.EVENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MetamodelPackage.EVENT__DATA_SOURCE:
        setDataSource((DataSource)newValue);
        return;
      case MetamodelPackage.EVENT__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends MAttribute>)newValue);
        return;
      case MetamodelPackage.EVENT__ENTITY_BEHAVIOURS:
        getEntityBehaviours().clear();
        getEntityBehaviours().addAll((Collection<? extends EntityBehaviour>)newValue);
        return;
      case MetamodelPackage.EVENT__DATA_BEHAVIOURS:
        getDataBehaviours().clear();
        getDataBehaviours().addAll((Collection<? extends DataBehaviour>)newValue);
        return;
      case MetamodelPackage.EVENT__BEHAVIOUR_NAMESPACES:
        getBehaviourNamespaces().clear();
        getBehaviourNamespaces().addAll((Collection<? extends BehaviourNamespace>)newValue);
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
      case MetamodelPackage.EVENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MetamodelPackage.EVENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MetamodelPackage.EVENT__DATA_SOURCE:
        setDataSource((DataSource)null);
        return;
      case MetamodelPackage.EVENT__ATTRIBUTES:
        getAttributes().clear();
        return;
      case MetamodelPackage.EVENT__ENTITY_BEHAVIOURS:
        getEntityBehaviours().clear();
        return;
      case MetamodelPackage.EVENT__DATA_BEHAVIOURS:
        getDataBehaviours().clear();
        return;
      case MetamodelPackage.EVENT__BEHAVIOUR_NAMESPACES:
        getBehaviourNamespaces().clear();
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
      case MetamodelPackage.EVENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MetamodelPackage.EVENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MetamodelPackage.EVENT__DATA_SOURCE:
        return dataSource != null;
      case MetamodelPackage.EVENT__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case MetamodelPackage.EVENT__ENTITY_BEHAVIOURS:
        return entityBehaviours != null && !entityBehaviours.isEmpty();
      case MetamodelPackage.EVENT__DATA_BEHAVIOURS:
        return dataBehaviours != null && !dataBehaviours.isEmpty();
      case MetamodelPackage.EVENT__BEHAVIOUR_NAMESPACES:
        return behaviourNamespaces != null && !behaviourNamespaces.isEmpty();
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

} //EventImpl
