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
 * A representation of the literals of the enumeration '<em><b>EAura</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Leveleditor.LeveleditorPackage#getEAura()
 * @model
 * @generated
 */
public enum EAura implements Enumerator {
	/**
	 * The '<em><b>REGEN MANA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEN_MANA_VALUE
	 * @generated
	 * @ordered
	 */
	REGEN_MANA(0, "REGEN_MANA", "REGEN_MANA"),

	/**
	 * The '<em><b>REGEN HP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEN_HP_VALUE
	 * @generated
	 * @ordered
	 */
	REGEN_HP(1, "REGEN_HP", "REGEN_HP");

	/**
	 * The '<em><b>REGEN MANA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REGEN MANA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGEN_MANA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGEN_MANA_VALUE = 0;

	/**
	 * The '<em><b>REGEN HP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REGEN HP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGEN_HP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGEN_HP_VALUE = 1;

	/**
	 * An array of all the '<em><b>EAura</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EAura[] VALUES_ARRAY =
		new EAura[] {
			REGEN_MANA,
			REGEN_HP,
		};

	/**
	 * A public read-only list of all the '<em><b>EAura</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EAura> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EAura</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EAura get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EAura result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EAura</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EAura getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EAura result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EAura</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EAura get(int value) {
		switch (value) {
			case REGEN_MANA_VALUE: return REGEN_MANA;
			case REGEN_HP_VALUE: return REGEN_HP;
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
	private EAura(int value, String name, String literal) {
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
	
} //EAura
