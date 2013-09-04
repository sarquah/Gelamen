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
 * A representation of the literals of the enumeration '<em><b>ERoom Event Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Leveleditor.LeveleditorPackage#getERoomEventAction()
 * @model
 * @generated
 */
public enum ERoomEventAction implements Enumerator {
	/**
	 * The '<em><b>ENEMY ATTACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENEMY_ATTACK_VALUE
	 * @generated
	 * @ordered
	 */
	ENEMY_ATTACK(0, "ENEMY_ATTACK", "ENEMY_ATTACK"),

	/**
	 * The '<em><b>ROOM DESCRIPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOM_DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	ROOM_DESCRIPTION(1, "ROOM_DESCRIPTION", "ROOM_DESCRIPTION"),

	/**
	 * The '<em><b>HIDDENROOM FOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIDDENROOM_FOUND_VALUE
	 * @generated
	 * @ordered
	 */
	HIDDENROOM_FOUND(2, "HIDDENROOM_FOUND", "HIDDENROOM_FOUND"),

	/**
	 * The '<em><b>ROOM PLACEENEMY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOM_PLACEENEMY_VALUE
	 * @generated
	 * @ordered
	 */
	ROOM_PLACEENEMY(3, "ROOM_PLACEENEMY", "ROOM_PLACEENEMY"),

	/**
	 * The '<em><b>TRIGGER TRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER_TRAP_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGER_TRAP(4, "TRIGGER_TRAP", "TRIGGER_TRAP"),

	/**
	 * The '<em><b>ADD ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	ADD_ITEM(5, "ADD_ITEM", "ADD_ITEM"), /**
	 * The '<em><b>REMOVE ENEMY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_ENEMY_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_ENEMY(6, "REMOVE_ENEMY", "REMOVE_ENEMY"), /**
	 * The '<em><b>REMOVE NPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_NPC_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_NPC(7, "REMOVE_NPC", "REMOVE_NPC"), /**
	 * The '<em><b>SET HP ENEMY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_HP_ENEMY_VALUE
	 * @generated
	 * @ordered
	 */
	SET_HP_ENEMY(8, "SET_HP_ENEMY", "SET_HP_ENEMY"), /**
	 * The '<em><b>MOVE PLAYER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_PLAYER_VALUE
	 * @generated
	 * @ordered
	 */
	MOVE_PLAYER(9, "MOVE_PLAYER", "MOVE_PLAYER"), /**
	 * The '<em><b>NPC TALK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NPC_TALK_VALUE
	 * @generated
	 * @ordered
	 */
	NPC_TALK(10, "NPC_TALK", "NPC_TALK"), /**
	 * The '<em><b>CANCEL ACCESSORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_ACCESSORY_VALUE
	 * @generated
	 * @ordered
	 */
	CANCEL_ACCESSORY(11, "CANCEL_ACCESSORY", "CANCEL_ACCESSORY"), /**
	 * The '<em><b>UNLOCK DOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLOCK_DOOR_VALUE
	 * @generated
	 * @ordered
	 */
	UNLOCK_DOOR(12, "UNLOCK_DOOR", "UNLOCK_DOOR"), /**
	 * The '<em><b>SOLVE QUEST ENTERROOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLVE_QUEST_ENTERROOM_VALUE
	 * @generated
	 * @ordered
	 */
	SOLVE_QUEST_ENTERROOM(13, "SOLVE_QUEST_ENTERROOM", "SOLVE_QUEST_ENTERROOM"), /**
	 * The '<em><b>ADD QUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_QUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ADD_QUEST(14, "ADD_QUEST", "ADD_QUEST");

	/**
	 * The '<em><b>ENEMY ATTACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENEMY ATTACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENEMY_ATTACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENEMY_ATTACK_VALUE = 0;

	/**
	 * The '<em><b>ROOM DESCRIPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROOM DESCRIPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOM_DESCRIPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_DESCRIPTION_VALUE = 1;

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
	 * The '<em><b>ROOM PLACEENEMY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROOM PLACEENEMY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOM_PLACEENEMY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_PLACEENEMY_VALUE = 3;

	/**
	 * The '<em><b>TRIGGER TRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIGGER TRAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIGGER_TRAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGER_TRAP_VALUE = 4;

	/**
	 * The '<em><b>ADD ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADD ITEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADD_ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADD_ITEM_VALUE = 5;

	/**
	 * The '<em><b>REMOVE ENEMY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REMOVE ENEMY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_ENEMY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_ENEMY_VALUE = 6;

	/**
	 * The '<em><b>REMOVE NPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REMOVE NPC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_NPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_NPC_VALUE = 7;

	/**
	 * The '<em><b>SET HP ENEMY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET HP ENEMY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_HP_ENEMY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_HP_ENEMY_VALUE = 8;

	/**
	 * The '<em><b>MOVE PLAYER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVE PLAYER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVE_PLAYER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVE_PLAYER_VALUE = 9;

	/**
	 * The '<em><b>NPC TALK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NPC TALK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NPC_TALK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NPC_TALK_VALUE = 10;

	/**
	 * The '<em><b>CANCEL ACCESSORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CANCEL ACCESSORY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL_ACCESSORY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_ACCESSORY_VALUE = 11;

	/**
	 * The '<em><b>UNLOCK DOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNLOCK DOOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNLOCK_DOOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNLOCK_DOOR_VALUE = 12;

	/**
	 * The '<em><b>SOLVE QUEST ENTERROOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOLVE QUEST ENTERROOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLVE_QUEST_ENTERROOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOLVE_QUEST_ENTERROOM_VALUE = 13;

	/**
	 * The '<em><b>ADD QUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADD QUEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADD_QUEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADD_QUEST_VALUE = 14;

	/**
	 * An array of all the '<em><b>ERoom Event Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ERoomEventAction[] VALUES_ARRAY =
		new ERoomEventAction[] {
			ENEMY_ATTACK,
			ROOM_DESCRIPTION,
			HIDDENROOM_FOUND,
			ROOM_PLACEENEMY,
			TRIGGER_TRAP,
			ADD_ITEM,
			REMOVE_ENEMY,
			REMOVE_NPC,
			SET_HP_ENEMY,
			MOVE_PLAYER,
			NPC_TALK,
			CANCEL_ACCESSORY,
			UNLOCK_DOOR,
			SOLVE_QUEST_ENTERROOM,
			ADD_QUEST,
		};

	/**
	 * A public read-only list of all the '<em><b>ERoom Event Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ERoomEventAction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ERoom Event Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERoomEventAction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERoomEventAction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERoom Event Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERoomEventAction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERoomEventAction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERoom Event Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERoomEventAction get(int value) {
		switch (value) {
			case ENEMY_ATTACK_VALUE: return ENEMY_ATTACK;
			case ROOM_DESCRIPTION_VALUE: return ROOM_DESCRIPTION;
			case HIDDENROOM_FOUND_VALUE: return HIDDENROOM_FOUND;
			case ROOM_PLACEENEMY_VALUE: return ROOM_PLACEENEMY;
			case TRIGGER_TRAP_VALUE: return TRIGGER_TRAP;
			case ADD_ITEM_VALUE: return ADD_ITEM;
			case REMOVE_ENEMY_VALUE: return REMOVE_ENEMY;
			case REMOVE_NPC_VALUE: return REMOVE_NPC;
			case SET_HP_ENEMY_VALUE: return SET_HP_ENEMY;
			case MOVE_PLAYER_VALUE: return MOVE_PLAYER;
			case NPC_TALK_VALUE: return NPC_TALK;
			case CANCEL_ACCESSORY_VALUE: return CANCEL_ACCESSORY;
			case UNLOCK_DOOR_VALUE: return UNLOCK_DOOR;
			case SOLVE_QUEST_ENTERROOM_VALUE: return SOLVE_QUEST_ENTERROOM;
			case ADD_QUEST_VALUE: return ADD_QUEST;
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
	private ERoomEventAction(int value, String name, String literal) {
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
	
} //ERoomEventAction
