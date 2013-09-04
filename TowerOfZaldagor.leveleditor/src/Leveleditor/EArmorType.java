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
 * A representation of the literals of the enumeration '<em><b>EArmor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Leveleditor.LeveleditorPackage#getEArmorType()
 * @model
 * @generated
 */
public enum EArmorType implements Enumerator {
	/**
	 * The '<em><b>HEAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD(0, "HEAD", "HEAD"),

	/**
	 * The '<em><b>BODY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BODY_VALUE
	 * @generated
	 * @ordered
	 */
	BODY(1, "BODY", "BODY"),

	/**
	 * The '<em><b>LEGGINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGGINS_VALUE
	 * @generated
	 * @ordered
	 */
	LEGGINS(2, "LEGGINS", "LEGGINS");

	/**
	 * The '<em><b>HEAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_VALUE = 0;

	/**
	 * The '<em><b>BODY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BODY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BODY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BODY_VALUE = 1;

	/**
	 * The '<em><b>LEGGINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEGGINS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEGGINS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEGGINS_VALUE = 2;

	/**
	 * An array of all the '<em><b>EArmor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EArmorType[] VALUES_ARRAY =
		new EArmorType[] {
			HEAD,
			BODY,
			LEGGINS,
		};

	/**
	 * A public read-only list of all the '<em><b>EArmor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EArmorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EArmor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EArmorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EArmorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EArmor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EArmorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EArmorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EArmor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EArmorType get(int value) {
		switch (value) {
			case HEAD_VALUE: return HEAD;
			case BODY_VALUE: return BODY;
			case LEGGINS_VALUE: return LEGGINS;
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
	private EArmorType(int value, String name, String literal) {
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
	
} //EArmorType
