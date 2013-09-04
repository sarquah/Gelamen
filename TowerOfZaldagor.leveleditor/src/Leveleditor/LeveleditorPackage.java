/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Leveleditor.LeveleditorFactory
 * @model kind="package"
 * @generated
 */
public interface LeveleditorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Leveleditor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "leveleditor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "leveleditor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LeveleditorPackage eINSTANCE = Leveleditor.impl.LeveleditorPackageImpl.init();

	/**
	 * The meta object id for the '{@link Leveleditor.impl.ActImpl <em>Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.ActImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getAct()
	 * @generated
	 */
	int ACT = 0;

	/**
	 * The feature id for the '<em><b>World</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__WORLD = 0;

	/**
	 * The feature id for the '<em><b>Act Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__ACT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Goto Act</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__GOTO_ACT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.RoomImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Post Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__POST_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Post Items Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__POST_ITEMS_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Revealed Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__REVEALED_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Hidden Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HIDDEN_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Enemies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ENEMIES = 6;

	/**
	 * The feature id for the '<em><b>Npcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NPCS = 7;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ITEMS = 8;

	/**
	 * The feature id for the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__IS_LOCKED = 9;

	/**
	 * The feature id for the '<em><b>Unlock Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__UNLOCK_KEYS = 10;

	/**
	 * The feature id for the '<em><b>Is Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__IS_HIDDEN = 11;

	/**
	 * The feature id for the '<em><b>Is Revealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__IS_REVEALED = 12;

	/**
	 * The feature id for the '<em><b>Is Hidden Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__IS_HIDDEN_EVENT = 13;

	/**
	 * The feature id for the '<em><b>North</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NORTH = 14;

	/**
	 * The feature id for the '<em><b>South</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SOUTH = 15;

	/**
	 * The feature id for the '<em><b>West</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__WEST = 16;

	/**
	 * The feature id for the '<em><b>East</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__EAST = 17;

	/**
	 * The feature id for the '<em><b>Autosave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__AUTOSAVE = 18;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.CreatureImpl <em>Creature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.CreatureImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getCreature()
	 * @generated
	 */
	int CREATURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Init Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__INIT_HP = 1;

	/**
	 * The feature id for the '<em><b>Init Mana</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__INIT_MANA = 2;

	/**
	 * The feature id for the '<em><b>Mana</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__MANA = 3;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__STRENGTH = 4;

	/**
	 * The feature id for the '<em><b>Agility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__AGILITY = 5;

	/**
	 * The feature id for the '<em><b>Charisma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__CHARISMA = 6;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__LEVEL = 7;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__INVENTORY = 8;

	/**
	 * The feature id for the '<em><b>Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__EXPERIENCE = 9;

	/**
	 * The feature id for the '<em><b>Gold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__GOLD = 10;

	/**
	 * The feature id for the '<em><b>Init Player Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__INIT_PLAYER_ACTIONS = 11;

	/**
	 * The feature id for the '<em><b>Resist Lightning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__RESIST_LIGHTNING = 12;

	/**
	 * The feature id for the '<em><b>Resist Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__RESIST_FIRE = 13;

	/**
	 * The feature id for the '<em><b>Resist Poison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__RESIST_POISON = 14;

	/**
	 * The feature id for the '<em><b>Resist Ice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__RESIST_ICE = 15;

	/**
	 * The feature id for the '<em><b>Is Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__IS_MALE = 16;

	/**
	 * The feature id for the '<em><b>Race</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__RACE = 17;

	/**
	 * The feature id for the '<em><b>Creature Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__CREATURE_CLASS = 18;

	/**
	 * The feature id for the '<em><b>Armor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__ARMOR = 19;

	/**
	 * The number of structural features of the '<em>Creature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.NPCImpl <em>NPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.NPCImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getNPC()
	 * @generated
	 */
	int NPC = 2;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.ItemImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 3;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.KeyImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getKey()
	 * @generated
	 */
	int KEY = 4;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.EventRoomImpl <em>Event Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.EventRoomImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getEventRoom()
	 * @generated
	 */
	int EVENT_ROOM = 5;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.RoomEventImpl <em>Room Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.RoomEventImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getRoomEvent()
	 * @generated
	 */
	int ROOM_EVENT = 6;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.TrapImpl <em>Trap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.TrapImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getTrap()
	 * @generated
	 */
	int TRAP = 7;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.EnemyImpl <em>Enemy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.EnemyImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getEnemy()
	 * @generated
	 */
	int ENEMY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__NAME = CREATURE__NAME;

	/**
	 * The feature id for the '<em><b>Init Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__INIT_HP = CREATURE__INIT_HP;

	/**
	 * The feature id for the '<em><b>Init Mana</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__INIT_MANA = CREATURE__INIT_MANA;

	/**
	 * The feature id for the '<em><b>Mana</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__MANA = CREATURE__MANA;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__STRENGTH = CREATURE__STRENGTH;

	/**
	 * The feature id for the '<em><b>Agility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__AGILITY = CREATURE__AGILITY;

	/**
	 * The feature id for the '<em><b>Charisma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__CHARISMA = CREATURE__CHARISMA;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__LEVEL = CREATURE__LEVEL;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__INVENTORY = CREATURE__INVENTORY;

	/**
	 * The feature id for the '<em><b>Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__EXPERIENCE = CREATURE__EXPERIENCE;

	/**
	 * The feature id for the '<em><b>Gold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__GOLD = CREATURE__GOLD;

	/**
	 * The feature id for the '<em><b>Init Player Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__INIT_PLAYER_ACTIONS = CREATURE__INIT_PLAYER_ACTIONS;

	/**
	 * The feature id for the '<em><b>Resist Lightning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__RESIST_LIGHTNING = CREATURE__RESIST_LIGHTNING;

	/**
	 * The feature id for the '<em><b>Resist Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__RESIST_FIRE = CREATURE__RESIST_FIRE;

	/**
	 * The feature id for the '<em><b>Resist Poison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__RESIST_POISON = CREATURE__RESIST_POISON;

	/**
	 * The feature id for the '<em><b>Resist Ice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__RESIST_ICE = CREATURE__RESIST_ICE;

	/**
	 * The feature id for the '<em><b>Is Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__IS_MALE = CREATURE__IS_MALE;

	/**
	 * The feature id for the '<em><b>Race</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__RACE = CREATURE__RACE;

	/**
	 * The feature id for the '<em><b>Creature Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__CREATURE_CLASS = CREATURE__CREATURE_CLASS;

	/**
	 * The feature id for the '<em><b>Armor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__ARMOR = CREATURE__ARMOR;

	/**
	 * The feature id for the '<em><b>Is Attacking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__IS_ATTACKING = CREATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scarefactor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__SCAREFACTOR = CREATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Damage Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__DAMAGE_FIRE = CREATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Damage Lightning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__DAMAGE_LIGHTNING = CREATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Damage Ice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__DAMAGE_ICE = CREATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Damage Poison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__DAMAGE_POISON = CREATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__AURAS = CREATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Boss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__BOSS = CREATURE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Enemy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_FEATURE_COUNT = CREATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__NAME = ENEMY__NAME;

	/**
	 * The feature id for the '<em><b>Init Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__INIT_HP = ENEMY__INIT_HP;

	/**
	 * The feature id for the '<em><b>Init Mana</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__INIT_MANA = ENEMY__INIT_MANA;

	/**
	 * The feature id for the '<em><b>Mana</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__MANA = ENEMY__MANA;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__STRENGTH = ENEMY__STRENGTH;

	/**
	 * The feature id for the '<em><b>Agility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__AGILITY = ENEMY__AGILITY;

	/**
	 * The feature id for the '<em><b>Charisma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__CHARISMA = ENEMY__CHARISMA;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__LEVEL = ENEMY__LEVEL;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__INVENTORY = ENEMY__INVENTORY;

	/**
	 * The feature id for the '<em><b>Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__EXPERIENCE = ENEMY__EXPERIENCE;

	/**
	 * The feature id for the '<em><b>Gold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__GOLD = ENEMY__GOLD;

	/**
	 * The feature id for the '<em><b>Init Player Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__INIT_PLAYER_ACTIONS = ENEMY__INIT_PLAYER_ACTIONS;

	/**
	 * The feature id for the '<em><b>Resist Lightning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__RESIST_LIGHTNING = ENEMY__RESIST_LIGHTNING;

	/**
	 * The feature id for the '<em><b>Resist Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__RESIST_FIRE = ENEMY__RESIST_FIRE;

	/**
	 * The feature id for the '<em><b>Resist Poison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__RESIST_POISON = ENEMY__RESIST_POISON;

	/**
	 * The feature id for the '<em><b>Resist Ice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__RESIST_ICE = ENEMY__RESIST_ICE;

	/**
	 * The feature id for the '<em><b>Is Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__IS_MALE = ENEMY__IS_MALE;

	/**
	 * The feature id for the '<em><b>Race</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__RACE = ENEMY__RACE;

	/**
	 * The feature id for the '<em><b>Creature Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__CREATURE_CLASS = ENEMY__CREATURE_CLASS;

	/**
	 * The feature id for the '<em><b>Armor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__ARMOR = ENEMY__ARMOR;

	/**
	 * The feature id for the '<em><b>Is Attacking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__IS_ATTACKING = ENEMY__IS_ATTACKING;

	/**
	 * The feature id for the '<em><b>Scarefactor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__SCAREFACTOR = ENEMY__SCAREFACTOR;

	/**
	 * The feature id for the '<em><b>Damage Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__DAMAGE_FIRE = ENEMY__DAMAGE_FIRE;

	/**
	 * The feature id for the '<em><b>Damage Lightning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__DAMAGE_LIGHTNING = ENEMY__DAMAGE_LIGHTNING;

	/**
	 * The feature id for the '<em><b>Damage Ice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__DAMAGE_ICE = ENEMY__DAMAGE_ICE;

	/**
	 * The feature id for the '<em><b>Damage Poison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__DAMAGE_POISON = ENEMY__DAMAGE_POISON;

	/**
	 * The feature id for the '<em><b>Auras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__AURAS = ENEMY__AURAS;

	/**
	 * The feature id for the '<em><b>Boss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__BOSS = ENEMY__BOSS;

	/**
	 * The feature id for the '<em><b>Dialogcontroller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__DIALOGCONTROLLER = ENEMY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Talking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__TALKING = ENEMY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Firsttime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__FIRSTTIME = ENEMY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Goto Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__GOTO_ID = ENEMY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>NPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_FEATURE_COUNT = ENEMY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__ID = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__NAME = ROOM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__DESCRIPTION = ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Post Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__POST_DESCRIPTION = ROOM__POST_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Post Items Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__POST_ITEMS_DESCRIPTION = ROOM__POST_ITEMS_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Revealed Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__REVEALED_DESCRIPTION = ROOM__REVEALED_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Hidden Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__HIDDEN_DESCRIPTION = ROOM__HIDDEN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Enemies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__ENEMIES = ROOM__ENEMIES;

	/**
	 * The feature id for the '<em><b>Npcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__NPCS = ROOM__NPCS;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__ITEMS = ROOM__ITEMS;

	/**
	 * The feature id for the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__IS_LOCKED = ROOM__IS_LOCKED;

	/**
	 * The feature id for the '<em><b>Unlock Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__UNLOCK_KEYS = ROOM__UNLOCK_KEYS;

	/**
	 * The feature id for the '<em><b>Is Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__IS_HIDDEN = ROOM__IS_HIDDEN;

	/**
	 * The feature id for the '<em><b>Is Revealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__IS_REVEALED = ROOM__IS_REVEALED;

	/**
	 * The feature id for the '<em><b>Is Hidden Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__IS_HIDDEN_EVENT = ROOM__IS_HIDDEN_EVENT;

	/**
	 * The feature id for the '<em><b>North</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__NORTH = ROOM__NORTH;

	/**
	 * The feature id for the '<em><b>South</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__SOUTH = ROOM__SOUTH;

	/**
	 * The feature id for the '<em><b>West</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__WEST = ROOM__WEST;

	/**
	 * The feature id for the '<em><b>East</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__EAST = ROOM__EAST;

	/**
	 * The feature id for the '<em><b>Autosave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__AUTOSAVE = ROOM__AUTOSAVE;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__EVENTS = ROOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM__QUEST = ROOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Is Enemy Dead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__IS_ENEMY_DEAD = 2;

	/**
	 * The feature id for the '<em><b>Is Itemused</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__IS_ITEMUSED = 3;

	/**
	 * The feature id for the '<em><b>Itemtaken</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__ITEMTAKEN = 4;

	/**
	 * The feature id for the '<em><b>Is Itemtaken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__IS_ITEMTAKEN = 5;

	/**
	 * The feature id for the '<em><b>Roomenteredtimes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__ROOMENTEREDTIMES = 6;

	/**
	 * The feature id for the '<em><b>Enemyattack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__ENEMYATTACK = 7;

	/**
	 * The feature id for the '<em><b>Roomdescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__ROOMDESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Trap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__TRAP = 9;

	/**
	 * The feature id for the '<em><b>Trapdescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__TRAPDESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Received Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__RECEIVED_ITEM = 11;

	/**
	 * The feature id for the '<em><b>Item Used</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__ITEM_USED = 12;

	/**
	 * The feature id for the '<em><b>Placeenemy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__PLACEENEMY = 13;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__ROOM = 14;

	/**
	 * The feature id for the '<em><b>Npc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__NPC = 15;

	/**
	 * The feature id for the '<em><b>HP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__HP = 16;

	/**
	 * The feature id for the '<em><b>Finishedtalking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__FINISHEDTALKING = 17;

	/**
	 * The feature id for the '<em><b>Npc Goto Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__NPC_GOTO_ID = 18;

	/**
	 * The feature id for the '<em><b>Hiddenroomfound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__HIDDENROOMFOUND = 19;

	/**
	 * The feature id for the '<em><b>Quest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT__QUEST = 20;

	/**
	 * The number of structural features of the '<em>Room Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EVENT_FEATURE_COUNT = 21;

	/**
	 * The feature id for the '<em><b>Poison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP__POISON = 0;

	/**
	 * The feature id for the '<em><b>Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP__FIRE = 1;

	/**
	 * The feature id for the '<em><b>Ice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP__ICE = 2;

	/**
	 * The feature id for the '<em><b>Lightning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP__LIGHTNING = 3;

	/**
	 * The feature id for the '<em><b>Normal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP__NORMAL = 4;

	/**
	 * The feature id for the '<em><b>Trapagility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP__TRAPAGILITY = 5;

	/**
	 * The feature id for the '<em><b>Trapdescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP__TRAPDESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Trap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAP_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.DialogControllerImpl <em>Dialog Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.DialogControllerImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getDialogController()
	 * @generated
	 */
	int DIALOG_CONTROLLER = 10;

	/**
	 * The feature id for the '<em><b>Conversation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONTROLLER__CONVERSATION = 0;

	/**
	 * The number of structural features of the '<em>Dialog Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONTROLLER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.DialogChoicesImpl <em>Dialog Choices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.DialogChoicesImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getDialogChoices()
	 * @generated
	 */
	int DIALOG_CHOICES = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CHOICES__ID = 0;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CHOICES__CHOICES = 1;

	/**
	 * The number of structural features of the '<em>Dialog Choices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CHOICES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.DialogImpl <em>Dialog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.DialogImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getDialog()
	 * @generated
	 */
	int DIALOG = 12;

	/**
	 * The feature id for the '<em><b>Optiontext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__OPTIONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Answertext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__ANSWERTEXT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__ID = 2;

	/**
	 * The feature id for the '<em><b>Goto Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__GOTO_ID = 3;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__IS_FINAL = 4;

	/**
	 * The feature id for the '<em><b>Dialogskilltest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__DIALOGSKILLTEST = 5;

	/**
	 * The feature id for the '<em><b>Give Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__GIVE_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__ITEM = 7;

	/**
	 * The feature id for the '<em><b>Quest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__QUEST = 8;

	/**
	 * The feature id for the '<em><b>Is Attacking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__IS_ATTACKING = 9;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__EVENT = 10;

	/**
	 * The number of structural features of the '<em>Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.DialogSkillTestImpl <em>Dialog Skill Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.DialogSkillTestImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getDialogSkillTest()
	 * @generated
	 */
	int DIALOG_SKILL_TEST = 13;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_SKILL_TEST__SKILL = 0;

	/**
	 * The feature id for the '<em><b>Goto Id Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_SKILL_TEST__GOTO_ID_SUCCESS = 1;

	/**
	 * The feature id for the '<em><b>Goto Id Fail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_SKILL_TEST__GOTO_ID_FAIL = 2;

	/**
	 * The feature id for the '<em><b>Skill NPC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_SKILL_TEST__SKILL_NPC = 3;

	/**
	 * The feature id for the '<em><b>Sucess Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_SKILL_TEST__SUCESS_TEXT = 4;

	/**
	 * The feature id for the '<em><b>Fail Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_SKILL_TEST__FAIL_TEXT = 5;

	/**
	 * The number of structural features of the '<em>Dialog Skill Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_SKILL_TEST_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.GoldImpl <em>Gold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.GoldImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getGold()
	 * @generated
	 */
	int GOLD = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOLD__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Ammount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOLD__AMMOUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOLD_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.PotionImpl <em>Potion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.PotionImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getPotion()
	 * @generated
	 */
	int POTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTION__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTION__SKILL = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Add Skill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTION__ADD_SKILL = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Potion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTION_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.WeaponImpl <em>Weapon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.WeaponImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getWeapon()
	 * @generated
	 */
	int WEAPON = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__DAMAGE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Twohanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__IS_TWOHANDED = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Damage Lightning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__DAMAGE_LIGHTNING = ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Damage Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__DAMAGE_FIRE = ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Damage Poison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__DAMAGE_POISON = ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Damage Ice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__DAMAGE_ICE = ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__CLASSES = ITEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__HP = ITEM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mana</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__MANA = ITEM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__STRENGTH = ITEM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Agility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__AGILITY = ITEM_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Charisma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__CHARISMA = ITEM_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Weapon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON_FEATURE_COUNT = ITEM_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.ArmorImpl <em>Armor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.ArmorImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getArmor()
	 * @generated
	 */
	int ARMOR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Armor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__ARMOR = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Armor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__ARMOR_TYPE = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resist Lightning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__RESIST_LIGHTNING = ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resist Ice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__RESIST_ICE = ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resist Fire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__RESIST_FIRE = ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resist Poison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__RESIST_POISON = ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__CLASSES = ITEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__HP = ITEM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mana</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__MANA = ITEM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__STRENGTH = ITEM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Agility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__AGILITY = ITEM_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Charisma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR__CHARISMA = ITEM_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Armor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_FEATURE_COUNT = ITEM_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.FinalRoomImpl <em>Final Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.FinalRoomImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getFinalRoom()
	 * @generated
	 */
	int FINAL_ROOM = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__NAME = EVENT_ROOM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__DESCRIPTION = EVENT_ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Post Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__POST_DESCRIPTION = EVENT_ROOM__POST_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Post Items Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__POST_ITEMS_DESCRIPTION = EVENT_ROOM__POST_ITEMS_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Revealed Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__REVEALED_DESCRIPTION = EVENT_ROOM__REVEALED_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Hidden Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__HIDDEN_DESCRIPTION = EVENT_ROOM__HIDDEN_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Enemies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__ENEMIES = EVENT_ROOM__ENEMIES;

	/**
	 * The feature id for the '<em><b>Npcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__NPCS = EVENT_ROOM__NPCS;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__ITEMS = EVENT_ROOM__ITEMS;

	/**
	 * The feature id for the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__IS_LOCKED = EVENT_ROOM__IS_LOCKED;

	/**
	 * The feature id for the '<em><b>Unlock Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__UNLOCK_KEYS = EVENT_ROOM__UNLOCK_KEYS;

	/**
	 * The feature id for the '<em><b>Is Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__IS_HIDDEN = EVENT_ROOM__IS_HIDDEN;

	/**
	 * The feature id for the '<em><b>Is Revealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__IS_REVEALED = EVENT_ROOM__IS_REVEALED;

	/**
	 * The feature id for the '<em><b>Is Hidden Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__IS_HIDDEN_EVENT = EVENT_ROOM__IS_HIDDEN_EVENT;

	/**
	 * The feature id for the '<em><b>North</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__NORTH = EVENT_ROOM__NORTH;

	/**
	 * The feature id for the '<em><b>South</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__SOUTH = EVENT_ROOM__SOUTH;

	/**
	 * The feature id for the '<em><b>West</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__WEST = EVENT_ROOM__WEST;

	/**
	 * The feature id for the '<em><b>East</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__EAST = EVENT_ROOM__EAST;

	/**
	 * The feature id for the '<em><b>Autosave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__AUTOSAVE = EVENT_ROOM__AUTOSAVE;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__EVENTS = EVENT_ROOM__EVENTS;

	/**
	 * The feature id for the '<em><b>Quest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__QUEST = EVENT_ROOM__QUEST;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM__IS_FINAL = EVENT_ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ROOM_FEATURE_COUNT = EVENT_ROOM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.QuestImpl <em>Quest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.QuestImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getQuest()
	 * @generated
	 */
	int QUEST = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Introduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__INTRODUCTION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Complete Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__COMPLETE_TEXT = 3;

	/**
	 * The feature id for the '<em><b>Quest Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__QUEST_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Quest Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__QUEST_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Is Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__IS_COMPLETE = 6;

	/**
	 * The feature id for the '<em><b>Xp Earned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__XP_EARNED = 7;

	/**
	 * The feature id for the '<em><b>Award Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__AWARD_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Npc Givenby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__NPC_GIVENBY = 9;

	/**
	 * The feature id for the '<em><b>Enemydead</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__ENEMYDEAD = 10;

	/**
	 * The feature id for the '<em><b>Dialogid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__DIALOGID = 11;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST__ROOM = 12;

	/**
	 * The number of structural features of the '<em>Quest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEST_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.AccessoryImpl <em>Accessory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.AccessoryImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getAccessory()
	 * @generated
	 */
	int ACCESSORY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSORY__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSORY__ROOM = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accessory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSORY_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Leveleditor.impl.AuraImpl <em>Aura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.impl.AuraImpl
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getAura()
	 * @generated
	 */
	int AURA = 21;

	/**
	 * The feature id for the '<em><b>Aura Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AURA__AURA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Ammount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AURA__AMMOUNT = 1;

	/**
	 * The number of structural features of the '<em>Aura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AURA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Leveleditor.ERoomEventCondition <em>ERoom Event Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.ERoomEventCondition
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getERoomEventCondition()
	 * @generated
	 */
	int EROOM_EVENT_CONDITION = 22;

	/**
	 * The meta object id for the '{@link Leveleditor.ERoomEventAction <em>ERoom Event Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.ERoomEventAction
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getERoomEventAction()
	 * @generated
	 */
	int EROOM_EVENT_ACTION = 23;

	/**
	 * The meta object id for the '{@link Leveleditor.ECreatureClass <em>ECreature Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.ECreatureClass
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getECreatureClass()
	 * @generated
	 */
	int ECREATURE_CLASS = 24;

	/**
	 * The meta object id for the '{@link Leveleditor.ECreatureRace <em>ECreature Race</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.ECreatureRace
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getECreatureRace()
	 * @generated
	 */
	int ECREATURE_RACE = 25;

	/**
	 * The meta object id for the '{@link Leveleditor.EElement <em>EElement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.EElement
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getEElement()
	 * @generated
	 */
	int EELEMENT = 26;

	/**
	 * The meta object id for the '{@link Leveleditor.ESkill <em>ESkill</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.ESkill
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getESkill()
	 * @generated
	 */
	int ESKILL = 27;

	/**
	 * The meta object id for the '{@link Leveleditor.EArmorType <em>EArmor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.EArmorType
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getEArmorType()
	 * @generated
	 */
	int EARMOR_TYPE = 28;


	/**
	 * The meta object id for the '{@link Leveleditor.EAura <em>EAura</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Leveleditor.EAura
	 * @see Leveleditor.impl.LeveleditorPackageImpl#getEAura()
	 * @generated
	 */
	int EAURA = 29;


	/**
	 * Returns the meta object for class '{@link Leveleditor.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Act</em>'.
	 * @see Leveleditor.Act
	 * @generated
	 */
	EClass getAct();

	/**
	 * Returns the meta object for the containment reference list '{@link Leveleditor.Act#getWorld <em>World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>World</em>'.
	 * @see Leveleditor.Act#getWorld()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_World();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Act#getActName <em>Act Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Act Name</em>'.
	 * @see Leveleditor.Act#getActName()
	 * @see #getAct()
	 * @generated
	 */
	EAttribute getAct_ActName();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.Act#getGotoAct <em>Goto Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goto Act</em>'.
	 * @see Leveleditor.Act#getGotoAct()
	 * @see #getAct()
	 * @generated
	 */
	EReference getAct_GotoAct();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Act#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Leveleditor.Act#getDescription()
	 * @see #getAct()
	 * @generated
	 */
	EAttribute getAct_Description();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see Leveleditor.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Leveleditor.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Room#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Leveleditor.Room#getDescription()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Description();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Room#getPostDescription <em>Post Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Description</em>'.
	 * @see Leveleditor.Room#getPostDescription()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_PostDescription();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Room#getPostItemsDescription <em>Post Items Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Items Description</em>'.
	 * @see Leveleditor.Room#getPostItemsDescription()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_PostItemsDescription();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Room#getRevealedDescription <em>Revealed Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revealed Description</em>'.
	 * @see Leveleditor.Room#getRevealedDescription()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RevealedDescription();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Room#getHiddenDescription <em>Hidden Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden Description</em>'.
	 * @see Leveleditor.Room#getHiddenDescription()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_HiddenDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link Leveleditor.Room#getEnemies <em>Enemies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enemies</em>'.
	 * @see Leveleditor.Room#getEnemies()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Enemies();

	/**
	 * Returns the meta object for the containment reference list '{@link Leveleditor.Room#getNpcs <em>Npcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Npcs</em>'.
	 * @see Leveleditor.Room#getNpcs()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Npcs();

	/**
	 * Returns the meta object for the containment reference list '{@link Leveleditor.Room#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see Leveleditor.Room#getItems()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Items();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.Room#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>North</em>'.
	 * @see Leveleditor.Room#getNorth()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_North();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.Room#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>South</em>'.
	 * @see Leveleditor.Room#getSouth()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_South();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.Room#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>East</em>'.
	 * @see Leveleditor.Room#getEast()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_East();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Room#isAutosave <em>Autosave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autosave</em>'.
	 * @see Leveleditor.Room#isAutosave()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Autosave();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.Room#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>West</em>'.
	 * @see Leveleditor.Room#getWest()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_West();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Room#isIsLocked <em>Is Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Locked</em>'.
	 * @see Leveleditor.Room#isIsLocked()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_IsLocked();

	/**
	 * Returns the meta object for the reference list '{@link Leveleditor.Room#getUnlockKeys <em>Unlock Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unlock Keys</em>'.
	 * @see Leveleditor.Room#getUnlockKeys()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_UnlockKeys();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Room#isIsHidden <em>Is Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hidden</em>'.
	 * @see Leveleditor.Room#isIsHidden()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_IsHidden();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Room#isIsRevealed <em>Is Revealed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Revealed</em>'.
	 * @see Leveleditor.Room#isIsRevealed()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_IsRevealed();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Room#isIsHiddenEvent <em>Is Hidden Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hidden Event</em>'.
	 * @see Leveleditor.Room#isIsHiddenEvent()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_IsHiddenEvent();

	/**
	 * Returns the meta object for class '{@link Leveleditor.NPC <em>NPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPC</em>'.
	 * @see Leveleditor.NPC
	 * @generated
	 */
	EClass getNPC();

	/**
	 * Returns the meta object for the containment reference '{@link Leveleditor.NPC#getDialogcontroller <em>Dialogcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dialogcontroller</em>'.
	 * @see Leveleditor.NPC#getDialogcontroller()
	 * @see #getNPC()
	 * @generated
	 */
	EReference getNPC_Dialogcontroller();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.NPC#isTalking <em>Talking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Talking</em>'.
	 * @see Leveleditor.NPC#isTalking()
	 * @see #getNPC()
	 * @generated
	 */
	EAttribute getNPC_Talking();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.NPC#isFirsttime <em>Firsttime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firsttime</em>'.
	 * @see Leveleditor.NPC#isFirsttime()
	 * @see #getNPC()
	 * @generated
	 */
	EAttribute getNPC_Firsttime();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.NPC#getGotoId <em>Goto Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goto Id</em>'.
	 * @see Leveleditor.NPC#getGotoId()
	 * @see #getNPC()
	 * @generated
	 */
	EAttribute getNPC_GotoId();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see Leveleditor.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Leveleditor.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see Leveleditor.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Key#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Leveleditor.Key#getId()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Id();

	/**
	 * Returns the meta object for class '{@link Leveleditor.EventRoom <em>Event Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Room</em>'.
	 * @see Leveleditor.EventRoom
	 * @generated
	 */
	EClass getEventRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link Leveleditor.EventRoom#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see Leveleditor.EventRoom#getEvents()
	 * @see #getEventRoom()
	 * @generated
	 */
	EReference getEventRoom_Events();

	/**
	 * Returns the meta object for the containment reference '{@link Leveleditor.EventRoom#getQuest <em>Quest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quest</em>'.
	 * @see Leveleditor.EventRoom#getQuest()
	 * @see #getEventRoom()
	 * @generated
	 */
	EReference getEventRoom_Quest();

	/**
	 * Returns the meta object for class '{@link Leveleditor.RoomEvent <em>Room Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Event</em>'.
	 * @see Leveleditor.RoomEvent
	 * @generated
	 */
	EClass getRoomEvent();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.RoomEvent#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see Leveleditor.RoomEvent#getCondition()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EAttribute getRoomEvent_Condition();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.RoomEvent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see Leveleditor.RoomEvent#getAction()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EAttribute getRoomEvent_Action();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.RoomEvent#isIsEnemyDead <em>Is Enemy Dead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enemy Dead</em>'.
	 * @see Leveleditor.RoomEvent#isIsEnemyDead()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EAttribute getRoomEvent_IsEnemyDead();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.RoomEvent#isIsItemused <em>Is Itemused</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Itemused</em>'.
	 * @see Leveleditor.RoomEvent#isIsItemused()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EAttribute getRoomEvent_IsItemused();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.RoomEvent#getHiddenroomfound <em>Hiddenroomfound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hiddenroomfound</em>'.
	 * @see Leveleditor.RoomEvent#getHiddenroomfound()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EReference getRoomEvent_Hiddenroomfound();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.RoomEvent#getQuest <em>Quest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quest</em>'.
	 * @see Leveleditor.RoomEvent#getQuest()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EReference getRoomEvent_Quest();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.RoomEvent#getItemUsed <em>Item Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Used</em>'.
	 * @see Leveleditor.RoomEvent#getItemUsed()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EReference getRoomEvent_ItemUsed();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.RoomEvent#getPlaceenemy <em>Placeenemy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Placeenemy</em>'.
	 * @see Leveleditor.RoomEvent#getPlaceenemy()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EReference getRoomEvent_Placeenemy();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.RoomEvent#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see Leveleditor.RoomEvent#getRoom()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EReference getRoomEvent_Room();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.RoomEvent#getNpc <em>Npc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Npc</em>'.
	 * @see Leveleditor.RoomEvent#getNpc()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EReference getRoomEvent_Npc();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.RoomEvent#getHP <em>HP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HP</em>'.
	 * @see Leveleditor.RoomEvent#getHP()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EAttribute getRoomEvent_HP();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.RoomEvent#isFinishedtalking <em>Finishedtalking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finishedtalking</em>'.
	 * @see Leveleditor.RoomEvent#isFinishedtalking()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EAttribute getRoomEvent_Finishedtalking();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.RoomEvent#getNpcGotoId <em>Npc Goto Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Npc Goto Id</em>'.
	 * @see Leveleditor.RoomEvent#getNpcGotoId()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EAttribute getRoomEvent_NpcGotoId();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.RoomEvent#getItemtaken <em>Itemtaken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Itemtaken</em>'.
	 * @see Leveleditor.RoomEvent#getItemtaken()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EReference getRoomEvent_Itemtaken();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.RoomEvent#isIsItemtaken <em>Is Itemtaken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Itemtaken</em>'.
	 * @see Leveleditor.RoomEvent#isIsItemtaken()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EAttribute getRoomEvent_IsItemtaken();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.RoomEvent#getRoomenteredtimes <em>Roomenteredtimes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roomenteredtimes</em>'.
	 * @see Leveleditor.RoomEvent#getRoomenteredtimes()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EAttribute getRoomEvent_Roomenteredtimes();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.RoomEvent#getEnemyattack <em>Enemyattack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enemyattack</em>'.
	 * @see Leveleditor.RoomEvent#getEnemyattack()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EReference getRoomEvent_Enemyattack();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.RoomEvent#getRoomdescription <em>Roomdescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roomdescription</em>'.
	 * @see Leveleditor.RoomEvent#getRoomdescription()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EAttribute getRoomEvent_Roomdescription();

	/**
	 * Returns the meta object for the containment reference '{@link Leveleditor.RoomEvent#getTrap <em>Trap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trap</em>'.
	 * @see Leveleditor.RoomEvent#getTrap()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EReference getRoomEvent_Trap();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.RoomEvent#getTrapdescription <em>Trapdescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trapdescription</em>'.
	 * @see Leveleditor.RoomEvent#getTrapdescription()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EAttribute getRoomEvent_Trapdescription();

	/**
	 * Returns the meta object for the containment reference '{@link Leveleditor.RoomEvent#getReceivedItem <em>Received Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Received Item</em>'.
	 * @see Leveleditor.RoomEvent#getReceivedItem()
	 * @see #getRoomEvent()
	 * @generated
	 */
	EReference getRoomEvent_ReceivedItem();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Trap <em>Trap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trap</em>'.
	 * @see Leveleditor.Trap
	 * @generated
	 */
	EClass getTrap();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Trap#getPoison <em>Poison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poison</em>'.
	 * @see Leveleditor.Trap#getPoison()
	 * @see #getTrap()
	 * @generated
	 */
	EAttribute getTrap_Poison();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Trap#getFire <em>Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fire</em>'.
	 * @see Leveleditor.Trap#getFire()
	 * @see #getTrap()
	 * @generated
	 */
	EAttribute getTrap_Fire();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Trap#getIce <em>Ice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ice</em>'.
	 * @see Leveleditor.Trap#getIce()
	 * @see #getTrap()
	 * @generated
	 */
	EAttribute getTrap_Ice();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Trap#getLightning <em>Lightning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lightning</em>'.
	 * @see Leveleditor.Trap#getLightning()
	 * @see #getTrap()
	 * @generated
	 */
	EAttribute getTrap_Lightning();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Trap#getNormal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal</em>'.
	 * @see Leveleditor.Trap#getNormal()
	 * @see #getTrap()
	 * @generated
	 */
	EAttribute getTrap_Normal();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Trap#getTrapagility <em>Trapagility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trapagility</em>'.
	 * @see Leveleditor.Trap#getTrapagility()
	 * @see #getTrap()
	 * @generated
	 */
	EAttribute getTrap_Trapagility();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Trap#getTrapdescription <em>Trapdescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trapdescription</em>'.
	 * @see Leveleditor.Trap#getTrapdescription()
	 * @see #getTrap()
	 * @generated
	 */
	EAttribute getTrap_Trapdescription();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Trap#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Leveleditor.Trap#getType()
	 * @see #getTrap()
	 * @generated
	 */
	EAttribute getTrap_Type();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Creature <em>Creature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creature</em>'.
	 * @see Leveleditor.Creature
	 * @generated
	 */
	EClass getCreature();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Leveleditor.Creature#getName()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Name();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getInitHp <em>Init Hp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Hp</em>'.
	 * @see Leveleditor.Creature#getInitHp()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_InitHp();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getInitMana <em>Init Mana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Mana</em>'.
	 * @see Leveleditor.Creature#getInitMana()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_InitMana();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getMana <em>Mana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mana</em>'.
	 * @see Leveleditor.Creature#getMana()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Mana();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see Leveleditor.Creature#getStrength()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Strength();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getAgility <em>Agility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agility</em>'.
	 * @see Leveleditor.Creature#getAgility()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Agility();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getCharisma <em>Charisma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charisma</em>'.
	 * @see Leveleditor.Creature#getCharisma()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Charisma();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see Leveleditor.Creature#getLevel()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link Leveleditor.Creature#getInventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventory</em>'.
	 * @see Leveleditor.Creature#getInventory()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_Inventory();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getExperience <em>Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experience</em>'.
	 * @see Leveleditor.Creature#getExperience()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Experience();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getGold <em>Gold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gold</em>'.
	 * @see Leveleditor.Creature#getGold()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Gold();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getInitPlayerActions <em>Init Player Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Player Actions</em>'.
	 * @see Leveleditor.Creature#getInitPlayerActions()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_InitPlayerActions();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getResistLightning <em>Resist Lightning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resist Lightning</em>'.
	 * @see Leveleditor.Creature#getResistLightning()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_ResistLightning();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getResistFire <em>Resist Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resist Fire</em>'.
	 * @see Leveleditor.Creature#getResistFire()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_ResistFire();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getResistPoison <em>Resist Poison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resist Poison</em>'.
	 * @see Leveleditor.Creature#getResistPoison()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_ResistPoison();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getResistIce <em>Resist Ice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resist Ice</em>'.
	 * @see Leveleditor.Creature#getResistIce()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_ResistIce();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#isIsMale <em>Is Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Male</em>'.
	 * @see Leveleditor.Creature#isIsMale()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_IsMale();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getRace <em>Race</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Race</em>'.
	 * @see Leveleditor.Creature#getRace()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Race();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getCreatureClass <em>Creature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creature Class</em>'.
	 * @see Leveleditor.Creature#getCreatureClass()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_CreatureClass();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Creature#getArmor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Armor</em>'.
	 * @see Leveleditor.Creature#getArmor()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Armor();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Enemy <em>Enemy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enemy</em>'.
	 * @see Leveleditor.Enemy
	 * @generated
	 */
	EClass getEnemy();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Enemy#isIsAttacking <em>Is Attacking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Attacking</em>'.
	 * @see Leveleditor.Enemy#isIsAttacking()
	 * @see #getEnemy()
	 * @generated
	 */
	EAttribute getEnemy_IsAttacking();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Enemy#getScarefactor <em>Scarefactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scarefactor</em>'.
	 * @see Leveleditor.Enemy#getScarefactor()
	 * @see #getEnemy()
	 * @generated
	 */
	EAttribute getEnemy_Scarefactor();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Enemy#getDamageFire <em>Damage Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Fire</em>'.
	 * @see Leveleditor.Enemy#getDamageFire()
	 * @see #getEnemy()
	 * @generated
	 */
	EAttribute getEnemy_DamageFire();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Enemy#getDamageLightning <em>Damage Lightning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Lightning</em>'.
	 * @see Leveleditor.Enemy#getDamageLightning()
	 * @see #getEnemy()
	 * @generated
	 */
	EAttribute getEnemy_DamageLightning();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Enemy#getDamageIce <em>Damage Ice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Ice</em>'.
	 * @see Leveleditor.Enemy#getDamageIce()
	 * @see #getEnemy()
	 * @generated
	 */
	EAttribute getEnemy_DamageIce();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Enemy#getDamagePoison <em>Damage Poison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Poison</em>'.
	 * @see Leveleditor.Enemy#getDamagePoison()
	 * @see #getEnemy()
	 * @generated
	 */
	EAttribute getEnemy_DamagePoison();

	/**
	 * Returns the meta object for the containment reference list '{@link Leveleditor.Enemy#getAuras <em>Auras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auras</em>'.
	 * @see Leveleditor.Enemy#getAuras()
	 * @see #getEnemy()
	 * @generated
	 */
	EReference getEnemy_Auras();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Enemy#isBoss <em>Boss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boss</em>'.
	 * @see Leveleditor.Enemy#isBoss()
	 * @see #getEnemy()
	 * @generated
	 */
	EAttribute getEnemy_Boss();

	/**
	 * Returns the meta object for class '{@link Leveleditor.DialogController <em>Dialog Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Controller</em>'.
	 * @see Leveleditor.DialogController
	 * @generated
	 */
	EClass getDialogController();

	/**
	 * Returns the meta object for the containment reference list '{@link Leveleditor.DialogController#getConversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversation</em>'.
	 * @see Leveleditor.DialogController#getConversation()
	 * @see #getDialogController()
	 * @generated
	 */
	EReference getDialogController_Conversation();

	/**
	 * Returns the meta object for class '{@link Leveleditor.DialogChoices <em>Dialog Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Choices</em>'.
	 * @see Leveleditor.DialogChoices
	 * @generated
	 */
	EClass getDialogChoices();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.DialogChoices#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Leveleditor.DialogChoices#getId()
	 * @see #getDialogChoices()
	 * @generated
	 */
	EAttribute getDialogChoices_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link Leveleditor.DialogChoices#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see Leveleditor.DialogChoices#getChoices()
	 * @see #getDialogChoices()
	 * @generated
	 */
	EReference getDialogChoices_Choices();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Dialog <em>Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog</em>'.
	 * @see Leveleditor.Dialog
	 * @generated
	 */
	EClass getDialog();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Dialog#getOptiontext <em>Optiontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optiontext</em>'.
	 * @see Leveleditor.Dialog#getOptiontext()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_Optiontext();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Dialog#getAnswertext <em>Answertext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answertext</em>'.
	 * @see Leveleditor.Dialog#getAnswertext()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_Answertext();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Dialog#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Leveleditor.Dialog#getId()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_Id();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Dialog#getGotoId <em>Goto Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goto Id</em>'.
	 * @see Leveleditor.Dialog#getGotoId()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_GotoId();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Dialog#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see Leveleditor.Dialog#isIsFinal()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_IsFinal();

	/**
	 * Returns the meta object for the containment reference '{@link Leveleditor.Dialog#getDialogskilltest <em>Dialogskilltest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dialogskilltest</em>'.
	 * @see Leveleditor.Dialog#getDialogskilltest()
	 * @see #getDialog()
	 * @generated
	 */
	EReference getDialog_Dialogskilltest();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Dialog#isGiveItem <em>Give Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Give Item</em>'.
	 * @see Leveleditor.Dialog#isGiveItem()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_GiveItem();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.Dialog#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see Leveleditor.Dialog#getItem()
	 * @see #getDialog()
	 * @generated
	 */
	EReference getDialog_Item();

	/**
	 * Returns the meta object for the containment reference '{@link Leveleditor.Dialog#getQuest <em>Quest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quest</em>'.
	 * @see Leveleditor.Dialog#getQuest()
	 * @see #getDialog()
	 * @generated
	 */
	EReference getDialog_Quest();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Dialog#isIsAttacking <em>Is Attacking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Attacking</em>'.
	 * @see Leveleditor.Dialog#isIsAttacking()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_IsAttacking();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Dialog#isEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see Leveleditor.Dialog#isEvent()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_Event();

	/**
	 * Returns the meta object for class '{@link Leveleditor.DialogSkillTest <em>Dialog Skill Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Skill Test</em>'.
	 * @see Leveleditor.DialogSkillTest
	 * @generated
	 */
	EClass getDialogSkillTest();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.DialogSkillTest#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill</em>'.
	 * @see Leveleditor.DialogSkillTest#getSkill()
	 * @see #getDialogSkillTest()
	 * @generated
	 */
	EAttribute getDialogSkillTest_Skill();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.DialogSkillTest#getGotoIdSuccess <em>Goto Id Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goto Id Success</em>'.
	 * @see Leveleditor.DialogSkillTest#getGotoIdSuccess()
	 * @see #getDialogSkillTest()
	 * @generated
	 */
	EAttribute getDialogSkillTest_GotoIdSuccess();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.DialogSkillTest#getGotoIdFail <em>Goto Id Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goto Id Fail</em>'.
	 * @see Leveleditor.DialogSkillTest#getGotoIdFail()
	 * @see #getDialogSkillTest()
	 * @generated
	 */
	EAttribute getDialogSkillTest_GotoIdFail();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.DialogSkillTest#getSkillNPC <em>Skill NPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill NPC</em>'.
	 * @see Leveleditor.DialogSkillTest#getSkillNPC()
	 * @see #getDialogSkillTest()
	 * @generated
	 */
	EAttribute getDialogSkillTest_SkillNPC();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.DialogSkillTest#getSucessText <em>Sucess Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sucess Text</em>'.
	 * @see Leveleditor.DialogSkillTest#getSucessText()
	 * @see #getDialogSkillTest()
	 * @generated
	 */
	EAttribute getDialogSkillTest_SucessText();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.DialogSkillTest#getFailText <em>Fail Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fail Text</em>'.
	 * @see Leveleditor.DialogSkillTest#getFailText()
	 * @see #getDialogSkillTest()
	 * @generated
	 */
	EAttribute getDialogSkillTest_FailText();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Gold <em>Gold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gold</em>'.
	 * @see Leveleditor.Gold
	 * @generated
	 */
	EClass getGold();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Gold#getAmmount <em>Ammount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ammount</em>'.
	 * @see Leveleditor.Gold#getAmmount()
	 * @see #getGold()
	 * @generated
	 */
	EAttribute getGold_Ammount();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Potion <em>Potion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potion</em>'.
	 * @see Leveleditor.Potion
	 * @generated
	 */
	EClass getPotion();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Potion#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill</em>'.
	 * @see Leveleditor.Potion#getSkill()
	 * @see #getPotion()
	 * @generated
	 */
	EAttribute getPotion_Skill();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Potion#getAddSkill <em>Add Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Skill</em>'.
	 * @see Leveleditor.Potion#getAddSkill()
	 * @see #getPotion()
	 * @generated
	 */
	EAttribute getPotion_AddSkill();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Weapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weapon</em>'.
	 * @see Leveleditor.Weapon
	 * @generated
	 */
	EClass getWeapon();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Weapon#getDamage <em>Damage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage</em>'.
	 * @see Leveleditor.Weapon#getDamage()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Damage();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Weapon#isIsTwohanded <em>Is Twohanded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Twohanded</em>'.
	 * @see Leveleditor.Weapon#isIsTwohanded()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_IsTwohanded();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Weapon#getDamageLightning <em>Damage Lightning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Lightning</em>'.
	 * @see Leveleditor.Weapon#getDamageLightning()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_DamageLightning();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Weapon#getDamageFire <em>Damage Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Fire</em>'.
	 * @see Leveleditor.Weapon#getDamageFire()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_DamageFire();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Weapon#getDamagePoison <em>Damage Poison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Poison</em>'.
	 * @see Leveleditor.Weapon#getDamagePoison()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_DamagePoison();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Weapon#getDamageIce <em>Damage Ice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Ice</em>'.
	 * @see Leveleditor.Weapon#getDamageIce()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_DamageIce();

	/**
	 * Returns the meta object for the attribute list '{@link Leveleditor.Weapon#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Classes</em>'.
	 * @see Leveleditor.Weapon#getClasses()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Classes();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Weapon#getHp <em>Hp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hp</em>'.
	 * @see Leveleditor.Weapon#getHp()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Hp();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Weapon#getMana <em>Mana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mana</em>'.
	 * @see Leveleditor.Weapon#getMana()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Mana();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Weapon#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see Leveleditor.Weapon#getStrength()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Strength();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Weapon#getAgility <em>Agility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agility</em>'.
	 * @see Leveleditor.Weapon#getAgility()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Agility();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Weapon#getCharisma <em>Charisma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charisma</em>'.
	 * @see Leveleditor.Weapon#getCharisma()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Charisma();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Armor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armor</em>'.
	 * @see Leveleditor.Armor
	 * @generated
	 */
	EClass getArmor();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Armor#getArmor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Armor</em>'.
	 * @see Leveleditor.Armor#getArmor()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Armor();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Armor#getArmorType <em>Armor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Armor Type</em>'.
	 * @see Leveleditor.Armor#getArmorType()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_ArmorType();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Armor#getResistLightning <em>Resist Lightning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resist Lightning</em>'.
	 * @see Leveleditor.Armor#getResistLightning()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_ResistLightning();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Armor#getResistIce <em>Resist Ice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resist Ice</em>'.
	 * @see Leveleditor.Armor#getResistIce()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_ResistIce();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Armor#getResistFire <em>Resist Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resist Fire</em>'.
	 * @see Leveleditor.Armor#getResistFire()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_ResistFire();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Armor#getResistPoison <em>Resist Poison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resist Poison</em>'.
	 * @see Leveleditor.Armor#getResistPoison()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_ResistPoison();

	/**
	 * Returns the meta object for the attribute list '{@link Leveleditor.Armor#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Classes</em>'.
	 * @see Leveleditor.Armor#getClasses()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Classes();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Armor#getHp <em>Hp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hp</em>'.
	 * @see Leveleditor.Armor#getHp()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Hp();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Armor#getMana <em>Mana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mana</em>'.
	 * @see Leveleditor.Armor#getMana()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Mana();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Armor#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see Leveleditor.Armor#getStrength()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Strength();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Armor#getAgility <em>Agility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agility</em>'.
	 * @see Leveleditor.Armor#getAgility()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Agility();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Armor#getCharisma <em>Charisma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charisma</em>'.
	 * @see Leveleditor.Armor#getCharisma()
	 * @see #getArmor()
	 * @generated
	 */
	EAttribute getArmor_Charisma();

	/**
	 * Returns the meta object for class '{@link Leveleditor.FinalRoom <em>Final Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Room</em>'.
	 * @see Leveleditor.FinalRoom
	 * @generated
	 */
	EClass getFinalRoom();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.FinalRoom#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see Leveleditor.FinalRoom#isIsFinal()
	 * @see #getFinalRoom()
	 * @generated
	 */
	EAttribute getFinalRoom_IsFinal();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Quest <em>Quest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quest</em>'.
	 * @see Leveleditor.Quest
	 * @generated
	 */
	EClass getQuest();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Quest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Leveleditor.Quest#getId()
	 * @see #getQuest()
	 * @generated
	 */
	EAttribute getQuest_Id();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Quest#getIntroduction <em>Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Introduction</em>'.
	 * @see Leveleditor.Quest#getIntroduction()
	 * @see #getQuest()
	 * @generated
	 */
	EAttribute getQuest_Introduction();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Quest#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Leveleditor.Quest#getDescription()
	 * @see #getQuest()
	 * @generated
	 */
	EAttribute getQuest_Description();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Quest#getCompleteText <em>Complete Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete Text</em>'.
	 * @see Leveleditor.Quest#getCompleteText()
	 * @see #getQuest()
	 * @generated
	 */
	EAttribute getQuest_CompleteText();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Quest#getQuestCondition <em>Quest Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quest Condition</em>'.
	 * @see Leveleditor.Quest#getQuestCondition()
	 * @see #getQuest()
	 * @generated
	 */
	EAttribute getQuest_QuestCondition();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.Quest#getEnemydead <em>Enemydead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enemydead</em>'.
	 * @see Leveleditor.Quest#getEnemydead()
	 * @see #getQuest()
	 * @generated
	 */
	EReference getQuest_Enemydead();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Quest#getDialogid <em>Dialogid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialogid</em>'.
	 * @see Leveleditor.Quest#getDialogid()
	 * @see #getQuest()
	 * @generated
	 */
	EAttribute getQuest_Dialogid();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.Quest#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see Leveleditor.Quest#getRoom()
	 * @see #getQuest()
	 * @generated
	 */
	EReference getQuest_Room();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Accessory <em>Accessory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accessory</em>'.
	 * @see Leveleditor.Accessory
	 * @generated
	 */
	EClass getAccessory();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.Accessory#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see Leveleditor.Accessory#getRoom()
	 * @see #getAccessory()
	 * @generated
	 */
	EReference getAccessory_Room();

	/**
	 * Returns the meta object for class '{@link Leveleditor.Aura <em>Aura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aura</em>'.
	 * @see Leveleditor.Aura
	 * @generated
	 */
	EClass getAura();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Aura#getAuraType <em>Aura Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aura Type</em>'.
	 * @see Leveleditor.Aura#getAuraType()
	 * @see #getAura()
	 * @generated
	 */
	EAttribute getAura_AuraType();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Aura#getAmmount <em>Ammount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ammount</em>'.
	 * @see Leveleditor.Aura#getAmmount()
	 * @see #getAura()
	 * @generated
	 */
	EAttribute getAura_Ammount();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.Quest#getQuestItem <em>Quest Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quest Item</em>'.
	 * @see Leveleditor.Quest#getQuestItem()
	 * @see #getQuest()
	 * @generated
	 */
	EReference getQuest_QuestItem();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Quest#isIsComplete <em>Is Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Complete</em>'.
	 * @see Leveleditor.Quest#isIsComplete()
	 * @see #getQuest()
	 * @generated
	 */
	EAttribute getQuest_IsComplete();

	/**
	 * Returns the meta object for the attribute '{@link Leveleditor.Quest#getXpEarned <em>Xp Earned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xp Earned</em>'.
	 * @see Leveleditor.Quest#getXpEarned()
	 * @see #getQuest()
	 * @generated
	 */
	EAttribute getQuest_XpEarned();

	/**
	 * Returns the meta object for the containment reference '{@link Leveleditor.Quest#getAwardItem <em>Award Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Award Item</em>'.
	 * @see Leveleditor.Quest#getAwardItem()
	 * @see #getQuest()
	 * @generated
	 */
	EReference getQuest_AwardItem();

	/**
	 * Returns the meta object for the reference '{@link Leveleditor.Quest#getNpcGivenby <em>Npc Givenby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Npc Givenby</em>'.
	 * @see Leveleditor.Quest#getNpcGivenby()
	 * @see #getQuest()
	 * @generated
	 */
	EReference getQuest_NpcGivenby();

	/**
	 * Returns the meta object for enum '{@link Leveleditor.ERoomEventCondition <em>ERoom Event Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ERoom Event Condition</em>'.
	 * @see Leveleditor.ERoomEventCondition
	 * @generated
	 */
	EEnum getERoomEventCondition();

	/**
	 * Returns the meta object for enum '{@link Leveleditor.ERoomEventAction <em>ERoom Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ERoom Event Action</em>'.
	 * @see Leveleditor.ERoomEventAction
	 * @generated
	 */
	EEnum getERoomEventAction();

	/**
	 * Returns the meta object for enum '{@link Leveleditor.ECreatureClass <em>ECreature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ECreature Class</em>'.
	 * @see Leveleditor.ECreatureClass
	 * @generated
	 */
	EEnum getECreatureClass();

	/**
	 * Returns the meta object for enum '{@link Leveleditor.ECreatureRace <em>ECreature Race</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ECreature Race</em>'.
	 * @see Leveleditor.ECreatureRace
	 * @generated
	 */
	EEnum getECreatureRace();

	/**
	 * Returns the meta object for enum '{@link Leveleditor.EElement <em>EElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EElement</em>'.
	 * @see Leveleditor.EElement
	 * @generated
	 */
	EEnum getEElement();

	/**
	 * Returns the meta object for enum '{@link Leveleditor.ESkill <em>ESkill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESkill</em>'.
	 * @see Leveleditor.ESkill
	 * @generated
	 */
	EEnum getESkill();

	/**
	 * Returns the meta object for enum '{@link Leveleditor.EArmorType <em>EArmor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EArmor Type</em>'.
	 * @see Leveleditor.EArmorType
	 * @generated
	 */
	EEnum getEArmorType();

	/**
	 * Returns the meta object for enum '{@link Leveleditor.EAura <em>EAura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EAura</em>'.
	 * @see Leveleditor.EAura
	 * @generated
	 */
	EEnum getEAura();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LeveleditorFactory getLeveleditorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Leveleditor.impl.ActImpl <em>Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.ActImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getAct()
		 * @generated
		 */
		EClass ACT = eINSTANCE.getAct();

		/**
		 * The meta object literal for the '<em><b>World</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__WORLD = eINSTANCE.getAct_World();

		/**
		 * The meta object literal for the '<em><b>Act Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACT__ACT_NAME = eINSTANCE.getAct_ActName();

		/**
		 * The meta object literal for the '<em><b>Goto Act</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__GOTO_ACT = eINSTANCE.getAct_GotoAct();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACT__DESCRIPTION = eINSTANCE.getAct_Description();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.RoomImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__DESCRIPTION = eINSTANCE.getRoom_Description();

		/**
		 * The meta object literal for the '<em><b>Post Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__POST_DESCRIPTION = eINSTANCE.getRoom_PostDescription();

		/**
		 * The meta object literal for the '<em><b>Post Items Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__POST_ITEMS_DESCRIPTION = eINSTANCE.getRoom_PostItemsDescription();

		/**
		 * The meta object literal for the '<em><b>Revealed Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__REVEALED_DESCRIPTION = eINSTANCE.getRoom_RevealedDescription();

		/**
		 * The meta object literal for the '<em><b>Hidden Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__HIDDEN_DESCRIPTION = eINSTANCE.getRoom_HiddenDescription();

		/**
		 * The meta object literal for the '<em><b>Enemies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ENEMIES = eINSTANCE.getRoom_Enemies();

		/**
		 * The meta object literal for the '<em><b>Npcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__NPCS = eINSTANCE.getRoom_Npcs();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ITEMS = eINSTANCE.getRoom_Items();

		/**
		 * The meta object literal for the '<em><b>North</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__NORTH = eINSTANCE.getRoom_North();

		/**
		 * The meta object literal for the '<em><b>South</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SOUTH = eINSTANCE.getRoom_South();

		/**
		 * The meta object literal for the '<em><b>East</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__EAST = eINSTANCE.getRoom_East();

		/**
		 * The meta object literal for the '<em><b>Autosave</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__AUTOSAVE = eINSTANCE.getRoom_Autosave();

		/**
		 * The meta object literal for the '<em><b>West</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__WEST = eINSTANCE.getRoom_West();

		/**
		 * The meta object literal for the '<em><b>Is Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__IS_LOCKED = eINSTANCE.getRoom_IsLocked();

		/**
		 * The meta object literal for the '<em><b>Unlock Keys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__UNLOCK_KEYS = eINSTANCE.getRoom_UnlockKeys();

		/**
		 * The meta object literal for the '<em><b>Is Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__IS_HIDDEN = eINSTANCE.getRoom_IsHidden();

		/**
		 * The meta object literal for the '<em><b>Is Revealed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__IS_REVEALED = eINSTANCE.getRoom_IsRevealed();

		/**
		 * The meta object literal for the '<em><b>Is Hidden Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__IS_HIDDEN_EVENT = eINSTANCE.getRoom_IsHiddenEvent();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.NPCImpl <em>NPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.NPCImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getNPC()
		 * @generated
		 */
		EClass NPC = eINSTANCE.getNPC();

		/**
		 * The meta object literal for the '<em><b>Dialogcontroller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPC__DIALOGCONTROLLER = eINSTANCE.getNPC_Dialogcontroller();

		/**
		 * The meta object literal for the '<em><b>Talking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__TALKING = eINSTANCE.getNPC_Talking();

		/**
		 * The meta object literal for the '<em><b>Firsttime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__FIRSTTIME = eINSTANCE.getNPC_Firsttime();

		/**
		 * The meta object literal for the '<em><b>Goto Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__GOTO_ID = eINSTANCE.getNPC_GotoId();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.ItemImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.KeyImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getKey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__ID = eINSTANCE.getKey_Id();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.EventRoomImpl <em>Event Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.EventRoomImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getEventRoom()
		 * @generated
		 */
		EClass EVENT_ROOM = eINSTANCE.getEventRoom();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ROOM__EVENTS = eINSTANCE.getEventRoom_Events();

		/**
		 * The meta object literal for the '<em><b>Quest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ROOM__QUEST = eINSTANCE.getEventRoom_Quest();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.RoomEventImpl <em>Room Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.RoomEventImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getRoomEvent()
		 * @generated
		 */
		EClass ROOM_EVENT = eINSTANCE.getRoomEvent();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EVENT__CONDITION = eINSTANCE.getRoomEvent_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EVENT__ACTION = eINSTANCE.getRoomEvent_Action();

		/**
		 * The meta object literal for the '<em><b>Is Enemy Dead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EVENT__IS_ENEMY_DEAD = eINSTANCE.getRoomEvent_IsEnemyDead();

		/**
		 * The meta object literal for the '<em><b>Is Itemused</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EVENT__IS_ITEMUSED = eINSTANCE.getRoomEvent_IsItemused();

		/**
		 * The meta object literal for the '<em><b>Hiddenroomfound</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EVENT__HIDDENROOMFOUND = eINSTANCE.getRoomEvent_Hiddenroomfound();

		/**
		 * The meta object literal for the '<em><b>Quest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EVENT__QUEST = eINSTANCE.getRoomEvent_Quest();

		/**
		 * The meta object literal for the '<em><b>Item Used</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EVENT__ITEM_USED = eINSTANCE.getRoomEvent_ItemUsed();

		/**
		 * The meta object literal for the '<em><b>Placeenemy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EVENT__PLACEENEMY = eINSTANCE.getRoomEvent_Placeenemy();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EVENT__ROOM = eINSTANCE.getRoomEvent_Room();

		/**
		 * The meta object literal for the '<em><b>Npc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EVENT__NPC = eINSTANCE.getRoomEvent_Npc();

		/**
		 * The meta object literal for the '<em><b>HP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EVENT__HP = eINSTANCE.getRoomEvent_HP();

		/**
		 * The meta object literal for the '<em><b>Finishedtalking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EVENT__FINISHEDTALKING = eINSTANCE.getRoomEvent_Finishedtalking();

		/**
		 * The meta object literal for the '<em><b>Npc Goto Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EVENT__NPC_GOTO_ID = eINSTANCE.getRoomEvent_NpcGotoId();

		/**
		 * The meta object literal for the '<em><b>Itemtaken</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EVENT__ITEMTAKEN = eINSTANCE.getRoomEvent_Itemtaken();

		/**
		 * The meta object literal for the '<em><b>Is Itemtaken</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EVENT__IS_ITEMTAKEN = eINSTANCE.getRoomEvent_IsItemtaken();

		/**
		 * The meta object literal for the '<em><b>Roomenteredtimes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EVENT__ROOMENTEREDTIMES = eINSTANCE.getRoomEvent_Roomenteredtimes();

		/**
		 * The meta object literal for the '<em><b>Enemyattack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EVENT__ENEMYATTACK = eINSTANCE.getRoomEvent_Enemyattack();

		/**
		 * The meta object literal for the '<em><b>Roomdescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EVENT__ROOMDESCRIPTION = eINSTANCE.getRoomEvent_Roomdescription();

		/**
		 * The meta object literal for the '<em><b>Trap</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EVENT__TRAP = eINSTANCE.getRoomEvent_Trap();

		/**
		 * The meta object literal for the '<em><b>Trapdescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_EVENT__TRAPDESCRIPTION = eINSTANCE.getRoomEvent_Trapdescription();

		/**
		 * The meta object literal for the '<em><b>Received Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EVENT__RECEIVED_ITEM = eINSTANCE.getRoomEvent_ReceivedItem();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.TrapImpl <em>Trap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.TrapImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getTrap()
		 * @generated
		 */
		EClass TRAP = eINSTANCE.getTrap();

		/**
		 * The meta object literal for the '<em><b>Poison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAP__POISON = eINSTANCE.getTrap_Poison();

		/**
		 * The meta object literal for the '<em><b>Fire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAP__FIRE = eINSTANCE.getTrap_Fire();

		/**
		 * The meta object literal for the '<em><b>Ice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAP__ICE = eINSTANCE.getTrap_Ice();

		/**
		 * The meta object literal for the '<em><b>Lightning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAP__LIGHTNING = eINSTANCE.getTrap_Lightning();

		/**
		 * The meta object literal for the '<em><b>Normal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAP__NORMAL = eINSTANCE.getTrap_Normal();

		/**
		 * The meta object literal for the '<em><b>Trapagility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAP__TRAPAGILITY = eINSTANCE.getTrap_Trapagility();

		/**
		 * The meta object literal for the '<em><b>Trapdescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAP__TRAPDESCRIPTION = eINSTANCE.getTrap_Trapdescription();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAP__TYPE = eINSTANCE.getTrap_Type();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.CreatureImpl <em>Creature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.CreatureImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getCreature()
		 * @generated
		 */
		EClass CREATURE = eINSTANCE.getCreature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__NAME = eINSTANCE.getCreature_Name();

		/**
		 * The meta object literal for the '<em><b>Init Hp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__INIT_HP = eINSTANCE.getCreature_InitHp();

		/**
		 * The meta object literal for the '<em><b>Init Mana</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__INIT_MANA = eINSTANCE.getCreature_InitMana();

		/**
		 * The meta object literal for the '<em><b>Mana</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__MANA = eINSTANCE.getCreature_Mana();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__STRENGTH = eINSTANCE.getCreature_Strength();

		/**
		 * The meta object literal for the '<em><b>Agility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__AGILITY = eINSTANCE.getCreature_Agility();

		/**
		 * The meta object literal for the '<em><b>Charisma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__CHARISMA = eINSTANCE.getCreature_Charisma();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__LEVEL = eINSTANCE.getCreature_Level();

		/**
		 * The meta object literal for the '<em><b>Inventory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATURE__INVENTORY = eINSTANCE.getCreature_Inventory();

		/**
		 * The meta object literal for the '<em><b>Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__EXPERIENCE = eINSTANCE.getCreature_Experience();

		/**
		 * The meta object literal for the '<em><b>Gold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__GOLD = eINSTANCE.getCreature_Gold();

		/**
		 * The meta object literal for the '<em><b>Init Player Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__INIT_PLAYER_ACTIONS = eINSTANCE.getCreature_InitPlayerActions();

		/**
		 * The meta object literal for the '<em><b>Resist Lightning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__RESIST_LIGHTNING = eINSTANCE.getCreature_ResistLightning();

		/**
		 * The meta object literal for the '<em><b>Resist Fire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__RESIST_FIRE = eINSTANCE.getCreature_ResistFire();

		/**
		 * The meta object literal for the '<em><b>Resist Poison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__RESIST_POISON = eINSTANCE.getCreature_ResistPoison();

		/**
		 * The meta object literal for the '<em><b>Resist Ice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__RESIST_ICE = eINSTANCE.getCreature_ResistIce();

		/**
		 * The meta object literal for the '<em><b>Is Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__IS_MALE = eINSTANCE.getCreature_IsMale();

		/**
		 * The meta object literal for the '<em><b>Race</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__RACE = eINSTANCE.getCreature_Race();

		/**
		 * The meta object literal for the '<em><b>Creature Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__CREATURE_CLASS = eINSTANCE.getCreature_CreatureClass();

		/**
		 * The meta object literal for the '<em><b>Armor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__ARMOR = eINSTANCE.getCreature_Armor();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.EnemyImpl <em>Enemy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.EnemyImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getEnemy()
		 * @generated
		 */
		EClass ENEMY = eINSTANCE.getEnemy();

		/**
		 * The meta object literal for the '<em><b>Is Attacking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY__IS_ATTACKING = eINSTANCE.getEnemy_IsAttacking();

		/**
		 * The meta object literal for the '<em><b>Scarefactor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY__SCAREFACTOR = eINSTANCE.getEnemy_Scarefactor();

		/**
		 * The meta object literal for the '<em><b>Damage Fire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY__DAMAGE_FIRE = eINSTANCE.getEnemy_DamageFire();

		/**
		 * The meta object literal for the '<em><b>Damage Lightning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY__DAMAGE_LIGHTNING = eINSTANCE.getEnemy_DamageLightning();

		/**
		 * The meta object literal for the '<em><b>Damage Ice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY__DAMAGE_ICE = eINSTANCE.getEnemy_DamageIce();

		/**
		 * The meta object literal for the '<em><b>Damage Poison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY__DAMAGE_POISON = eINSTANCE.getEnemy_DamagePoison();

		/**
		 * The meta object literal for the '<em><b>Auras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENEMY__AURAS = eINSTANCE.getEnemy_Auras();

		/**
		 * The meta object literal for the '<em><b>Boss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY__BOSS = eINSTANCE.getEnemy_Boss();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.DialogControllerImpl <em>Dialog Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.DialogControllerImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getDialogController()
		 * @generated
		 */
		EClass DIALOG_CONTROLLER = eINSTANCE.getDialogController();

		/**
		 * The meta object literal for the '<em><b>Conversation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG_CONTROLLER__CONVERSATION = eINSTANCE.getDialogController_Conversation();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.DialogChoicesImpl <em>Dialog Choices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.DialogChoicesImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getDialogChoices()
		 * @generated
		 */
		EClass DIALOG_CHOICES = eINSTANCE.getDialogChoices();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_CHOICES__ID = eINSTANCE.getDialogChoices_Id();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG_CHOICES__CHOICES = eINSTANCE.getDialogChoices_Choices();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.DialogImpl <em>Dialog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.DialogImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getDialog()
		 * @generated
		 */
		EClass DIALOG = eINSTANCE.getDialog();

		/**
		 * The meta object literal for the '<em><b>Optiontext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__OPTIONTEXT = eINSTANCE.getDialog_Optiontext();

		/**
		 * The meta object literal for the '<em><b>Answertext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__ANSWERTEXT = eINSTANCE.getDialog_Answertext();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__ID = eINSTANCE.getDialog_Id();

		/**
		 * The meta object literal for the '<em><b>Goto Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__GOTO_ID = eINSTANCE.getDialog_GotoId();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__IS_FINAL = eINSTANCE.getDialog_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Dialogskilltest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG__DIALOGSKILLTEST = eINSTANCE.getDialog_Dialogskilltest();

		/**
		 * The meta object literal for the '<em><b>Give Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__GIVE_ITEM = eINSTANCE.getDialog_GiveItem();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG__ITEM = eINSTANCE.getDialog_Item();

		/**
		 * The meta object literal for the '<em><b>Quest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG__QUEST = eINSTANCE.getDialog_Quest();

		/**
		 * The meta object literal for the '<em><b>Is Attacking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__IS_ATTACKING = eINSTANCE.getDialog_IsAttacking();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__EVENT = eINSTANCE.getDialog_Event();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.DialogSkillTestImpl <em>Dialog Skill Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.DialogSkillTestImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getDialogSkillTest()
		 * @generated
		 */
		EClass DIALOG_SKILL_TEST = eINSTANCE.getDialogSkillTest();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_SKILL_TEST__SKILL = eINSTANCE.getDialogSkillTest_Skill();

		/**
		 * The meta object literal for the '<em><b>Goto Id Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_SKILL_TEST__GOTO_ID_SUCCESS = eINSTANCE.getDialogSkillTest_GotoIdSuccess();

		/**
		 * The meta object literal for the '<em><b>Goto Id Fail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_SKILL_TEST__GOTO_ID_FAIL = eINSTANCE.getDialogSkillTest_GotoIdFail();

		/**
		 * The meta object literal for the '<em><b>Skill NPC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_SKILL_TEST__SKILL_NPC = eINSTANCE.getDialogSkillTest_SkillNPC();

		/**
		 * The meta object literal for the '<em><b>Sucess Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_SKILL_TEST__SUCESS_TEXT = eINSTANCE.getDialogSkillTest_SucessText();

		/**
		 * The meta object literal for the '<em><b>Fail Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_SKILL_TEST__FAIL_TEXT = eINSTANCE.getDialogSkillTest_FailText();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.GoldImpl <em>Gold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.GoldImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getGold()
		 * @generated
		 */
		EClass GOLD = eINSTANCE.getGold();

		/**
		 * The meta object literal for the '<em><b>Ammount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOLD__AMMOUNT = eINSTANCE.getGold_Ammount();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.PotionImpl <em>Potion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.PotionImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getPotion()
		 * @generated
		 */
		EClass POTION = eINSTANCE.getPotion();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POTION__SKILL = eINSTANCE.getPotion_Skill();

		/**
		 * The meta object literal for the '<em><b>Add Skill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POTION__ADD_SKILL = eINSTANCE.getPotion_AddSkill();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.WeaponImpl <em>Weapon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.WeaponImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getWeapon()
		 * @generated
		 */
		EClass WEAPON = eINSTANCE.getWeapon();

		/**
		 * The meta object literal for the '<em><b>Damage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__DAMAGE = eINSTANCE.getWeapon_Damage();

		/**
		 * The meta object literal for the '<em><b>Is Twohanded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__IS_TWOHANDED = eINSTANCE.getWeapon_IsTwohanded();

		/**
		 * The meta object literal for the '<em><b>Damage Lightning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__DAMAGE_LIGHTNING = eINSTANCE.getWeapon_DamageLightning();

		/**
		 * The meta object literal for the '<em><b>Damage Fire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__DAMAGE_FIRE = eINSTANCE.getWeapon_DamageFire();

		/**
		 * The meta object literal for the '<em><b>Damage Poison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__DAMAGE_POISON = eINSTANCE.getWeapon_DamagePoison();

		/**
		 * The meta object literal for the '<em><b>Damage Ice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__DAMAGE_ICE = eINSTANCE.getWeapon_DamageIce();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__CLASSES = eINSTANCE.getWeapon_Classes();

		/**
		 * The meta object literal for the '<em><b>Hp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__HP = eINSTANCE.getWeapon_Hp();

		/**
		 * The meta object literal for the '<em><b>Mana</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__MANA = eINSTANCE.getWeapon_Mana();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__STRENGTH = eINSTANCE.getWeapon_Strength();

		/**
		 * The meta object literal for the '<em><b>Agility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__AGILITY = eINSTANCE.getWeapon_Agility();

		/**
		 * The meta object literal for the '<em><b>Charisma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__CHARISMA = eINSTANCE.getWeapon_Charisma();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.ArmorImpl <em>Armor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.ArmorImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getArmor()
		 * @generated
		 */
		EClass ARMOR = eINSTANCE.getArmor();

		/**
		 * The meta object literal for the '<em><b>Armor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__ARMOR = eINSTANCE.getArmor_Armor();

		/**
		 * The meta object literal for the '<em><b>Armor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__ARMOR_TYPE = eINSTANCE.getArmor_ArmorType();

		/**
		 * The meta object literal for the '<em><b>Resist Lightning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__RESIST_LIGHTNING = eINSTANCE.getArmor_ResistLightning();

		/**
		 * The meta object literal for the '<em><b>Resist Ice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__RESIST_ICE = eINSTANCE.getArmor_ResistIce();

		/**
		 * The meta object literal for the '<em><b>Resist Fire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__RESIST_FIRE = eINSTANCE.getArmor_ResistFire();

		/**
		 * The meta object literal for the '<em><b>Resist Poison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__RESIST_POISON = eINSTANCE.getArmor_ResistPoison();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__CLASSES = eINSTANCE.getArmor_Classes();

		/**
		 * The meta object literal for the '<em><b>Hp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__HP = eINSTANCE.getArmor_Hp();

		/**
		 * The meta object literal for the '<em><b>Mana</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__MANA = eINSTANCE.getArmor_Mana();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__STRENGTH = eINSTANCE.getArmor_Strength();

		/**
		 * The meta object literal for the '<em><b>Agility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__AGILITY = eINSTANCE.getArmor_Agility();

		/**
		 * The meta object literal for the '<em><b>Charisma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMOR__CHARISMA = eINSTANCE.getArmor_Charisma();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.FinalRoomImpl <em>Final Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.FinalRoomImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getFinalRoom()
		 * @generated
		 */
		EClass FINAL_ROOM = eINSTANCE.getFinalRoom();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINAL_ROOM__IS_FINAL = eINSTANCE.getFinalRoom_IsFinal();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.QuestImpl <em>Quest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.QuestImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getQuest()
		 * @generated
		 */
		EClass QUEST = eINSTANCE.getQuest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEST__ID = eINSTANCE.getQuest_Id();

		/**
		 * The meta object literal for the '<em><b>Introduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEST__INTRODUCTION = eINSTANCE.getQuest_Introduction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEST__DESCRIPTION = eINSTANCE.getQuest_Description();

		/**
		 * The meta object literal for the '<em><b>Complete Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEST__COMPLETE_TEXT = eINSTANCE.getQuest_CompleteText();

		/**
		 * The meta object literal for the '<em><b>Quest Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEST__QUEST_CONDITION = eINSTANCE.getQuest_QuestCondition();

		/**
		 * The meta object literal for the '<em><b>Enemydead</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEST__ENEMYDEAD = eINSTANCE.getQuest_Enemydead();

		/**
		 * The meta object literal for the '<em><b>Dialogid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEST__DIALOGID = eINSTANCE.getQuest_Dialogid();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEST__ROOM = eINSTANCE.getQuest_Room();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.AccessoryImpl <em>Accessory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.AccessoryImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getAccessory()
		 * @generated
		 */
		EClass ACCESSORY = eINSTANCE.getAccessory();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSORY__ROOM = eINSTANCE.getAccessory_Room();

		/**
		 * The meta object literal for the '{@link Leveleditor.impl.AuraImpl <em>Aura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.impl.AuraImpl
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getAura()
		 * @generated
		 */
		EClass AURA = eINSTANCE.getAura();

		/**
		 * The meta object literal for the '<em><b>Aura Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AURA__AURA_TYPE = eINSTANCE.getAura_AuraType();

		/**
		 * The meta object literal for the '<em><b>Ammount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AURA__AMMOUNT = eINSTANCE.getAura_Ammount();

		/**
		 * The meta object literal for the '<em><b>Quest Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEST__QUEST_ITEM = eINSTANCE.getQuest_QuestItem();

		/**
		 * The meta object literal for the '<em><b>Is Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEST__IS_COMPLETE = eINSTANCE.getQuest_IsComplete();

		/**
		 * The meta object literal for the '<em><b>Xp Earned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEST__XP_EARNED = eINSTANCE.getQuest_XpEarned();

		/**
		 * The meta object literal for the '<em><b>Award Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEST__AWARD_ITEM = eINSTANCE.getQuest_AwardItem();

		/**
		 * The meta object literal for the '<em><b>Npc Givenby</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEST__NPC_GIVENBY = eINSTANCE.getQuest_NpcGivenby();

		/**
		 * The meta object literal for the '{@link Leveleditor.ERoomEventCondition <em>ERoom Event Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.ERoomEventCondition
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getERoomEventCondition()
		 * @generated
		 */
		EEnum EROOM_EVENT_CONDITION = eINSTANCE.getERoomEventCondition();

		/**
		 * The meta object literal for the '{@link Leveleditor.ERoomEventAction <em>ERoom Event Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.ERoomEventAction
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getERoomEventAction()
		 * @generated
		 */
		EEnum EROOM_EVENT_ACTION = eINSTANCE.getERoomEventAction();

		/**
		 * The meta object literal for the '{@link Leveleditor.ECreatureClass <em>ECreature Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.ECreatureClass
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getECreatureClass()
		 * @generated
		 */
		EEnum ECREATURE_CLASS = eINSTANCE.getECreatureClass();

		/**
		 * The meta object literal for the '{@link Leveleditor.ECreatureRace <em>ECreature Race</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.ECreatureRace
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getECreatureRace()
		 * @generated
		 */
		EEnum ECREATURE_RACE = eINSTANCE.getECreatureRace();

		/**
		 * The meta object literal for the '{@link Leveleditor.EElement <em>EElement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.EElement
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getEElement()
		 * @generated
		 */
		EEnum EELEMENT = eINSTANCE.getEElement();

		/**
		 * The meta object literal for the '{@link Leveleditor.ESkill <em>ESkill</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.ESkill
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getESkill()
		 * @generated
		 */
		EEnum ESKILL = eINSTANCE.getESkill();

		/**
		 * The meta object literal for the '{@link Leveleditor.EArmorType <em>EArmor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.EArmorType
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getEArmorType()
		 * @generated
		 */
		EEnum EARMOR_TYPE = eINSTANCE.getEArmorType();

		/**
		 * The meta object literal for the '{@link Leveleditor.EAura <em>EAura</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Leveleditor.EAura
		 * @see Leveleditor.impl.LeveleditorPackageImpl#getEAura()
		 * @generated
		 */
		EEnum EAURA = eINSTANCE.getEAura();

	}

} //LeveleditorPackage
