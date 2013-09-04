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
 * A representation of the literals of the enumeration '<em><b>ECreature Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Leveleditor.LeveleditorPackage#getECreatureClass()
 * @model
 * @generated
 */
public enum ECreatureClass implements Enumerator {
	/**
	 * The '<em><b>Warrior</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARRIOR_VALUE
	 * @generated
	 * @ordered
	 */
	WARRIOR(0, "Warrior", "Warrior"),

	/**
	 * The '<em><b>Wizard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIZARD_VALUE
	 * @generated
	 * @ordered
	 */
	WIZARD(1, "Wizard", "Wizard"), /**
	 * The '<em><b>Paladin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PALADIN_VALUE
	 * @generated
	 * @ordered
	 */
	PALADIN(2, "Paladin", "Paladin"), /**
	 * The '<em><b>Assasin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSASIN_VALUE
	 * @generated
	 * @ordered
	 */
	ASSASIN(3, "Assasin", "Assasin"), /**
	 * The '<em><b>Warlock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	WARLOCK(4, "Warlock", "Warlock"), /**
	 * The '<em><b>Ice Wizard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICE_WIZARD_VALUE
	 * @generated
	 * @ordered
	 */
	ICE_WIZARD(5, "IceWizard", "IceWizard");

	/**
	 * The '<em><b>Warrior</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Warrior</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARRIOR
	 * @model name="Warrior"
	 * @generated
	 * @ordered
	 */
	public static final int WARRIOR_VALUE = 0;

	/**
	 * The '<em><b>Wizard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wizard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIZARD
	 * @model name="Wizard"
	 * @generated
	 * @ordered
	 */
	public static final int WIZARD_VALUE = 1;

	/**
	 * The '<em><b>Paladin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paladin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PALADIN
	 * @model name="Paladin"
	 * @generated
	 * @ordered
	 */
	public static final int PALADIN_VALUE = 2;

	/**
	 * The '<em><b>Assasin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assasin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSASIN
	 * @model name="Assasin"
	 * @generated
	 * @ordered
	 */
	public static final int ASSASIN_VALUE = 3;

	/**
	 * The '<em><b>Warlock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Warlock</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARLOCK
	 * @model name="Warlock"
	 * @generated
	 * @ordered
	 */
	public static final int WARLOCK_VALUE = 4;

	/**
	 * The '<em><b>Ice Wizard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ice Wizard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICE_WIZARD
	 * @model name="IceWizard"
	 * @generated
	 * @ordered
	 */
	public static final int ICE_WIZARD_VALUE = 5;

	/**
	 * An array of all the '<em><b>ECreature Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ECreatureClass[] VALUES_ARRAY =
		new ECreatureClass[] {
			WARRIOR,
			WIZARD,
			PALADIN,
			ASSASIN,
			WARLOCK,
			ICE_WIZARD,
		};

	/**
	 * A public read-only list of all the '<em><b>ECreature Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ECreatureClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ECreature Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ECreatureClass get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ECreatureClass result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ECreature Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ECreatureClass getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ECreatureClass result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ECreature Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ECreatureClass get(int value) {
		switch (value) {
			case WARRIOR_VALUE: return WARRIOR;
			case WIZARD_VALUE: return WIZARD;
			case PALADIN_VALUE: return PALADIN;
			case ASSASIN_VALUE: return ASSASIN;
			case WARLOCK_VALUE: return WARLOCK;
			case ICE_WIZARD_VALUE: return ICE_WIZARD;
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
	private ECreatureClass(int value, String name, String literal) {
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
	
} //ECreatureClass
