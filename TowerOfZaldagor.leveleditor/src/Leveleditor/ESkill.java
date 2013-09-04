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
 * A representation of the literals of the enumeration '<em><b>ESkill</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Leveleditor.LeveleditorPackage#getESkill()
 * @model
 * @generated
 */
public enum ESkill implements Enumerator {
	/**
	 * The '<em><b>STRENGTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	STRENGTH(0, "STRENGTH", "STRENGTH"),

	/**
	 * The '<em><b>AGILITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGILITY_VALUE
	 * @generated
	 * @ordered
	 */
	AGILITY(1, "AGILITY", "AGILITY"),

	/**
	 * The '<em><b>CHARISMA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARISMA_VALUE
	 * @generated
	 * @ordered
	 */
	CHARISMA(3, "CHARISMA", "CHARISMA"),

	/**
	 * The '<em><b>MANA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANA_VALUE
	 * @generated
	 * @ordered
	 */
	MANA(4, "MANA", "MANA"),

	/**
	 * The '<em><b>HP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HP_VALUE
	 * @generated
	 * @ordered
	 */
	HP(5, "HP", "HP");

	/**
	 * The '<em><b>STRENGTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRENGTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRENGTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRENGTH_VALUE = 0;

	/**
	 * The '<em><b>AGILITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AGILITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGILITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGILITY_VALUE = 1;

	/**
	 * The '<em><b>CHARISMA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARISMA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARISMA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARISMA_VALUE = 3;

	/**
	 * The '<em><b>MANA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANA_VALUE = 4;

	/**
	 * The '<em><b>HP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HP_VALUE = 5;

	/**
	 * An array of all the '<em><b>ESkill</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESkill[] VALUES_ARRAY =
		new ESkill[] {
			STRENGTH,
			AGILITY,
			CHARISMA,
			MANA,
			HP,
		};

	/**
	 * A public read-only list of all the '<em><b>ESkill</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ESkill> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ESkill</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESkill get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESkill result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESkill</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESkill getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESkill result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESkill</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESkill get(int value) {
		switch (value) {
			case STRENGTH_VALUE: return STRENGTH;
			case AGILITY_VALUE: return AGILITY;
			case CHARISMA_VALUE: return CHARISMA;
			case MANA_VALUE: return MANA;
			case HP_VALUE: return HP;
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
	private ESkill(int value, String name, String literal) {
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
	
} //ESkill
