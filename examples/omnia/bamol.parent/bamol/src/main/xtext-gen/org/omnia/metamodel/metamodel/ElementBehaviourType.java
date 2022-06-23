/**
 * generated by Xtext 2.27.0
 */
package org.omnia.metamodel.metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Element Behaviour Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omnia.metamodel.metamodel.MetamodelPackage#getElementBehaviourType()
 * @model
 * @generated
 */
public enum ElementBehaviourType implements Enumerator
{
  /**
   * The '<em><b>Initialize</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INITIALIZE_VALUE
   * @generated
   * @ordered
   */
  INITIALIZE(0, "Initialize", "Initialize"),

  /**
   * The '<em><b>Before Change</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFORE_CHANGE_VALUE
   * @generated
   * @ordered
   */
  BEFORE_CHANGE(1, "BeforeChange", "BeforeChange"),

  /**
   * The '<em><b>Change</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHANGE_VALUE
   * @generated
   * @ordered
   */
  CHANGE(2, "Change", "Change"),

  /**
   * The '<em><b>After Change</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AFTER_CHANGE_VALUE
   * @generated
   * @ordered
   */
  AFTER_CHANGE(3, "AfterChange", "AfterChange"),

  /**
   * The '<em><b>Before Save</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFORE_SAVE_VALUE
   * @generated
   * @ordered
   */
  BEFORE_SAVE(4, "BeforeSave", "BeforeSave"),

  /**
   * The '<em><b>Select</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SELECT_VALUE
   * @generated
   * @ordered
   */
  SELECT(5, "Select", "Select"),

  /**
   * The '<em><b>Before Collection Entity Initialize</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFORE_COLLECTION_ENTITY_INITIALIZE_VALUE
   * @generated
   * @ordered
   */
  BEFORE_COLLECTION_ENTITY_INITIALIZE(6, "BeforeCollectionEntityInitialize", "BeforeCollectionEntityInitialize"),

  /**
   * The '<em><b>On Click</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ON_CLICK_VALUE
   * @generated
   * @ordered
   */
  ON_CLICK(7, "OnClick", "OnClick");

  /**
   * The '<em><b>Initialize</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INITIALIZE
   * @model name="Initialize"
   * @generated
   * @ordered
   */
  public static final int INITIALIZE_VALUE = 0;

  /**
   * The '<em><b>Before Change</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFORE_CHANGE
   * @model name="BeforeChange"
   * @generated
   * @ordered
   */
  public static final int BEFORE_CHANGE_VALUE = 1;

  /**
   * The '<em><b>Change</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHANGE
   * @model name="Change"
   * @generated
   * @ordered
   */
  public static final int CHANGE_VALUE = 2;

  /**
   * The '<em><b>After Change</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AFTER_CHANGE
   * @model name="AfterChange"
   * @generated
   * @ordered
   */
  public static final int AFTER_CHANGE_VALUE = 3;

  /**
   * The '<em><b>Before Save</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFORE_SAVE
   * @model name="BeforeSave"
   * @generated
   * @ordered
   */
  public static final int BEFORE_SAVE_VALUE = 4;

  /**
   * The '<em><b>Select</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SELECT
   * @model name="Select"
   * @generated
   * @ordered
   */
  public static final int SELECT_VALUE = 5;

  /**
   * The '<em><b>Before Collection Entity Initialize</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFORE_COLLECTION_ENTITY_INITIALIZE
   * @model name="BeforeCollectionEntityInitialize"
   * @generated
   * @ordered
   */
  public static final int BEFORE_COLLECTION_ENTITY_INITIALIZE_VALUE = 6;

  /**
   * The '<em><b>On Click</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ON_CLICK
   * @model name="OnClick"
   * @generated
   * @ordered
   */
  public static final int ON_CLICK_VALUE = 7;

  /**
   * An array of all the '<em><b>Element Behaviour Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ElementBehaviourType[] VALUES_ARRAY =
    new ElementBehaviourType[]
    {
      INITIALIZE,
      BEFORE_CHANGE,
      CHANGE,
      AFTER_CHANGE,
      BEFORE_SAVE,
      SELECT,
      BEFORE_COLLECTION_ENTITY_INITIALIZE,
      ON_CLICK,
    };

  /**
   * A public read-only list of all the '<em><b>Element Behaviour Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ElementBehaviourType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Element Behaviour Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ElementBehaviourType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ElementBehaviourType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Element Behaviour Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ElementBehaviourType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ElementBehaviourType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Element Behaviour Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ElementBehaviourType get(int value)
  {
    switch (value)
    {
      case INITIALIZE_VALUE: return INITIALIZE;
      case BEFORE_CHANGE_VALUE: return BEFORE_CHANGE;
      case CHANGE_VALUE: return CHANGE;
      case AFTER_CHANGE_VALUE: return AFTER_CHANGE;
      case BEFORE_SAVE_VALUE: return BEFORE_SAVE;
      case SELECT_VALUE: return SELECT;
      case BEFORE_COLLECTION_ENTITY_INITIALIZE_VALUE: return BEFORE_COLLECTION_ENTITY_INITIALIZE;
      case ON_CLICK_VALUE: return ON_CLICK;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ElementBehaviourType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ElementBehaviourType
