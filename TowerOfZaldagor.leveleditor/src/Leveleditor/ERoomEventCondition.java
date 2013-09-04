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
 * A representation of the literals of the enumeration '<em><b>ERoom Event Condition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Leveleditor.LeveleditorPackage#getERoomEventCondition()
 * @model
 * @generated
 */
public enum ERoomEventCondition implements Enumerator {
	/**
	 * The '<em><b>ENEMY DIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENEMY_DIED_VALUE
	 * @generated
	 * @ordered
	 */
	ENEMY_DIED(0, "ENEMY_DIED", "ENEMY_DIED"),

	/**
	 * The '<em><b>ITEM USED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_USED_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM_USED(1, "ITEM_USED", "ITEM_USED"), /**
	 * The '<em><b>HIDDENROOM FOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIDDENROOM_FOUND_VALUE
	 * @generated
	 * @ordered
	 */
	HIDDENROOM_FOUND(2, "HIDDENROOM_FOUND", "HIDDENROOM_FOUND"),

	/**
	 * The '<em><b>ITEM GIVEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_GIVEN_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM_GIVEN(6, "ITEM_GIVEN", "ITEM_GIVEN"), /**
	 * The '<em><b>ITEM TAKEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_TAKEN_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM_TAKEN(3, "ITEM_TAKEN", "ITEM_TAKEN"),

	/**
	 * The '<em><b>ROOM ENTERED TWICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOM_ENTERED_TWICE_VALUE
	 * @generated
	 * @ordered
	 */
	ROOM_ENTERED_TWICE(4, "ROOM_ENTERED_TWICE", "ROOM_ENTERED_TWICE"),

	/**
	 * The '<em><b>ROOM ENTERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOM_ENTERED_VALUE
	 * @generated
	 * @ordered
	 */
	ROOM_ENTERED(5, "ROOM_ENTERED", "ROOM_ENTERED"), /**
	 * The '<em><b>FINISHED DIALOG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHED_DIALOG_VALUE
	 * @generated
	 * @ordered
	 */
	FINISHED_DIALOG(7, "FINISHED_DIALOG", "FINISHED_DIALOG");

	/**
	 * The '<em><b>ENEMY DIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENEMY DIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENEMY_DIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENEMY_DIED_VALUE = 0;

	/**
	 * The '<em><b>ITEM USED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITEM USED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITEM_USED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_USED_VALUE = 1;

	/**
	 * The '<em><b>HIDDENROOM FOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIDDENROOM FOUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIDDENROOM_FOUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIDDENROOM_FOUND_VALUE = 2;

	/**
	 * The '<em><b>ITEM GIVEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITEM GIVEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITEM_GIVEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_GIVEN_VALUE = 6;

	/**
	 * The '<em><b>ITEM TAKEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITEM TAKEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITEM_TAKEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_TAKEN_VALUE = 3;

	/**
	 * The '<em><b>ROOM ENTERED TWICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROOM ENTERED TWICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOM_ENTERED_TWICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_ENTERED_TWICE_VALUE = 4;

	/**
	 * The '<em><b>ROOM ENTERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROOM ENTERED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOM_ENTERED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_ENTERED_VALUE = 5;

	/**
	 * The '<em><b>FINISHED DIALOG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINISHED DIALOG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISHED_DIALOG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINISHED_DIALOG_VALUE = 7;

	/**
	 * An array of all the '<em><b>ERoom Event Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ERoomEventCondition[] VALUES_ARRAY =
		new ERoomEventCondition[] {
			ENEMY_DIED,
			ITEM_USED,
			HIDDENROOM_FOUND,
			ITEM_GIVEN,
			ITEM_TAKEN,
			ROOM_ENTERED_TWICE,
			ROOM_ENTERED,
			FINISHED_DIALOG,
		};

	/**
	 * A public read-only list of all the '<em><b>ERoom Event Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ERoomEventCondition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ERoom Event Condition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERoomEventCondition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERoomEventCondition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERoom Event Condition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERoomEventCondition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERoomEventCondition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERoom Event Condition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERoomEventCondition get(int value) {
		switch (value) {
			case ENEMY_DIED_VALUE: return ENEMY_DIED;
			case ITEM_USED_VALUE: return ITEM_USED;
			case HIDDENROOM_FOUND_VALUE: return HIDDENROOM_FOUND;
			case ITEM_GIVEN_VALUE: return ITEM_GIVEN;
			case ITEM_TAKEN_VALUE: return ITEM_TAKEN;
			case ROOM_ENTERED_TWICE_VALUE: return ROOM_ENTERED_TWICE;
			case ROOM_ENTERED_VALUE: return ROOM_ENTERED;
			case FINISHED_DIALOG_VALUE: return FINISHED_DIALOG;
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
	private ERoomEventCondition(int value, String name, String literal) {
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
	
} //ERoomEventCondition
