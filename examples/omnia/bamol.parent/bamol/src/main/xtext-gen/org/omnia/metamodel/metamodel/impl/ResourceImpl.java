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
import org.omnia.metamodel.metamodel.MAttribute;
import org.omnia.metamodel.metamodel.MetamodelPackage;
import org.omnia.metamodel.metamodel.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ResourceImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ResourceImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ResourceImpl#getEntityBehaviours <em>Entity Behaviours</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ResourceImpl#getDataBehaviours <em>Data Behaviours</em>}</li>
 *   <li>{@link org.omnia.metamodel.metamodel.impl.ResourceImpl#getBehaviourNamespaces <em>Behaviour Namespaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends EntityImpl implements Resource
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
  protected ResourceImpl()
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
    return MetamodelPackage.Literals.RESOURCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESOURCE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESOURCE__DESCRIPTION, oldDescription, description));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.RESOURCE__DATA_SOURCE, oldDataSource, dataSource));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESOURCE__DATA_SOURCE, oldDataSource, dataSource));
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
      attributes = new EObjectContainmentEList<MAttribute>(MAttribute.class, this, MetamodelPackage.RESOURCE__ATTRIBUTES);
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
      entityBehaviours = new EObjectContainmentEList<EntityBehaviour>(EntityBehaviour.class, this, MetamodelPackage.RESOURCE__ENTITY_BEHAVIOURS);
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
      dataBehaviours = new EObjectContainmentEList<DataBehaviour>(DataBehaviour.class, this, MetamodelPackage.RESOURCE__DATA_BEHAVIOURS);
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
      behaviourNamespaces = new EObjectContainmentEList<BehaviourNamespace>(BehaviourNamespace.class, this, MetamodelPackage.RESOURCE__BEHAVIOUR_NAMESPACES);
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
      case MetamodelPackage.RESOURCE__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case MetamodelPackage.RESOURCE__ENTITY_BEHAVIOURS:
        return ((InternalEList<?>)getEntityBehaviours()).basicRemove(otherEnd, msgs);
      case MetamodelPackage.RESOURCE__DATA_BEHAVIOURS:
        return ((InternalEList<?>)getDataBehaviours()).basicRemove(otherEnd, msgs);
      case MetamodelPackage.RESOURCE__BEHAVIOUR_NAMESPACES:
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
      case MetamodelPackage.RESOURCE__NAME:
        return getName();
      case MetamodelPackage.RESOURCE__DESCRIPTION:
        return getDescription();
      case MetamodelPackage.RESOURCE__DATA_SOURCE:
        if (resolve) return getDataSource();
        return basicGetDataSource();
      case MetamodelPackage.RESOURCE__ATTRIBUTES:
        return getAttributes();
      case MetamodelPackage.RESOURCE__ENTITY_BEHAVIOURS:
        return getEntityBehaviours();
      case MetamodelPackage.RESOURCE__DATA_BEHAVIOURS:
        return getDataBehaviours();
      case MetamodelPackage.RESOURCE__BEHAVIOUR_NAMESPACES:
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
      case MetamodelPackage.RESOURCE__NAME:
        setName((String)newValue);
        return;
      case MetamodelPackage.RESOURCE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MetamodelPackage.RESOURCE__DATA_SOURCE:
        setDataSource((DataSource)newValue);
        return;
      case MetamodelPackage.RESOURCE__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends MAttribute>)newValue);
        return;
      case MetamodelPackage.RESOURCE__ENTITY_BEHAVIOURS:
        getEntityBehaviours().clear();
        getEntityBehaviours().addAll((Collection<? extends EntityBehaviour>)newValue);
        return;
      case MetamodelPackage.RESOURCE__DATA_BEHAVIOURS:
        getDataBehaviours().clear();
        getDataBehaviours().addAll((Collection<? extends DataBehaviour>)newValue);
        return;
      case MetamodelPackage.RESOURCE__BEHAVIOUR_NAMESPACES:
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
      case MetamodelPackage.RESOURCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MetamodelPackage.RESOURCE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MetamodelPackage.RESOURCE__DATA_SOURCE:
        setDataSource((DataSource)null);
        return;
      case MetamodelPackage.RESOURCE__ATTRIBUTES:
        getAttributes().clear();
        return;
      case MetamodelPackage.RESOURCE__ENTITY_BEHAVIOURS:
        getEntityBehaviours().clear();
        return;
      case MetamodelPackage.RESOURCE__DATA_BEHAVIOURS:
        getDataBehaviours().clear();
        return;
      case MetamodelPackage.RESOURCE__BEHAVIOUR_NAMESPACES:
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
      case MetamodelPackage.RESOURCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MetamodelPackage.RESOURCE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MetamodelPackage.RESOURCE__DATA_SOURCE:
        return dataSource != null;
      case MetamodelPackage.RESOURCE__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case MetamodelPackage.RESOURCE__ENTITY_BEHAVIOURS:
        return entityBehaviours != null && !entityBehaviours.isEmpty();
      case MetamodelPackage.RESOURCE__DATA_BEHAVIOURS:
        return dataBehaviours != null && !dataBehaviours.isEmpty();
      case MetamodelPackage.RESOURCE__BEHAVIOUR_NAMESPACES:
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

} //ResourceImpl
