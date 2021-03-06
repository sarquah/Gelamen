/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ETrap Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Leveleditor.LeveleditorPackage#getETrapType()
 * @model
 * @generated
 */
public enum ETrapType implements Enumerator {
	/**
	 * The '<em><b>POISON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POISON_VALUE
	 * @generated
	 * @ordered
	 */
	POISON(0, "POISON", "POISON"),

	/**
	 * The '<em><b>FIRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRE_VALUE
	 * @generated
	 * @ordered
	 */
	FIRE(1, "FIRE", "FIRE"),

	/**
	 * The '<em><b>ICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICE_VALUE
	 * @generated
	 * @ordered
	 */
	ICE(2, "ICE", "ICE"),

	/**
	 * The '<em><b>LIGHTNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTNING_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTNING(3, "LIGHTNING", "LIGHTNING"),

	/**
	 * The '<em><b>NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(4, "NORMAL", "NORMAL");

	/**
	 * The '<em><b>POISON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POISON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POISON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POISON_VALUE = 0;

	/**
	 * The '<em><b>FIRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIRE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRE_VALUE = 1;

	/**
	 * The '<em><b>ICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICE_VALUE = 2;

	/**
	 * The '<em><b>LIGHTNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIGHTNING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHTNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTNING_VALUE = 3;

	/**
	 * The '<em><b>NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>ETrap Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ETrapType[] VALUES_ARRAY =
		new ETrapType[] {
			POISON,
			FIRE,
			ICE,
			LIGHTNING,
			NORMAL,
		};

	/**
	 * A public read-only list of all the '<em><b>ETrap Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ETrapType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ETrap Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETrapType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETrapType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETrap Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETrapType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETrapType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETrap Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETrapType get(int value) {
		switch (value) {
			case POISON_VALUE: return POISON;
			case FIRE_VALUE: return FIRE;
			case ICE_VALUE: return ICE;
			case LIGHTNING_VALUE: return LIGHTNING;
			case NORMAL_VALUE: return NORMAL;
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
	private ETrapType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ETrapType
