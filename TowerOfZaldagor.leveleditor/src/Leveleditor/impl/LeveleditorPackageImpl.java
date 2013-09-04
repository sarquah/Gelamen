/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import Leveleditor.Accessory;
import Leveleditor.Act;
import Leveleditor.Armor;
import Leveleditor.Aura;
import Leveleditor.Creature;
import Leveleditor.Dialog;
import Leveleditor.DialogChoices;
import Leveleditor.DialogController;
import Leveleditor.DialogSkillTest;
import Leveleditor.EArmorType;
import Leveleditor.EAura;
import Leveleditor.ECreatureClass;
import Leveleditor.ECreatureRace;
import Leveleditor.EElement;
import Leveleditor.ERoomEventAction;
import Leveleditor.ERoomEventCondition;
import Leveleditor.ESkill;
import Leveleditor.Enemy;
import Leveleditor.EventRoom;
import Leveleditor.FinalRoom;
import Leveleditor.Gold;
import Leveleditor.Item;
import Leveleditor.Key;
import Leveleditor.LeveleditorFactory;
import Leveleditor.LeveleditorPackage;
import Leveleditor.Potion;
import Leveleditor.Quest;
import Leveleditor.Room;
import Leveleditor.RoomEvent;
import Leveleditor.Trap;
import Leveleditor.Weapon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeveleditorPackageImpl extends EPackageImpl implements LeveleditorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass npcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enemyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogChoicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogSkillTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weaponEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eRoomEventConditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eRoomEventActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eCreatureClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eCreatureRaceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eElementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eSkillEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eArmorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eAuraEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Leveleditor.LeveleditorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LeveleditorPackageImpl() {
		super(eNS_URI, LeveleditorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LeveleditorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LeveleditorPackage init() {
		if (isInited) return (LeveleditorPackage)EPackage.Registry.INSTANCE.getEPackage(LeveleditorPackage.eNS_URI);

		// Obtain or create and register package
		LeveleditorPackageImpl theLeveleditorPackage = (LeveleditorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LeveleditorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LeveleditorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLeveleditorPackage.createPackageContents();

		// Initialize created meta-data
		theLeveleditorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLeveleditorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LeveleditorPackage.eNS_URI, theLeveleditorPackage);
		return theLeveleditorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAct() {
		return actEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAct_World() {
		return (EReference)actEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAct_ActName() {
		return (EAttribute)actEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAct_GotoAct() {
		return (EReference)actEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAct_Description() {
		return (EAttribute)actEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Name() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Description() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_PostDescription() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_PostItemsDescription() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RevealedDescription() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_HiddenDescription() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Enemies() {
		return (EReference)roomEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Npcs() {
		return (EReference)roomEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Items() {
		return (EReference)roomEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_North() {
		return (EReference)roomEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_South() {
		return (EReference)roomEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_East() {
		return (EReference)roomEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Autosave() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_West() {
		return (EReference)roomEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_IsLocked() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_UnlockKeys() {
		return (EReference)roomEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_IsHidden() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_IsRevealed() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_IsHiddenEvent() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNPC() {
		return npcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNPC_Dialogcontroller() {
		return (EReference)npcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNPC_Talking() {
		return (EAttribute)npcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNPC_Firsttime() {
		return (EAttribute)npcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNPC_GotoId() {
		return (EAttribute)npcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Name() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKey() {
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_Id() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventRoom() {
		return eventRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventRoom_Events() {
		return (EReference)eventRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventRoom_Quest() {
		return (EReference)eventRoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomEvent() {
		return roomEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEvent_Condition() {
		return (EAttribute)roomEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEvent_Action() {
		return (EAttribute)roomEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEvent_IsEnemyDead() {
		return (EAttribute)roomEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEvent_IsItemused() {
		return (EAttribute)roomEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEvent_Hiddenroomfound() {
		return (EReference)roomEventEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEvent_Quest() {
		return (EReference)roomEventEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEvent_ItemUsed() {
		return (EReference)roomEventEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEvent_Placeenemy() {
		return (EReference)roomEventEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEvent_Room() {
		return (EReference)roomEventEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEvent_Npc() {
		return (EReference)roomEventEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEvent_HP() {
		return (EAttribute)roomEventEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEvent_Finishedtalking() {
		return (EAttribute)roomEventEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEvent_NpcGotoId() {
		return (EAttribute)roomEventEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEvent_Itemtaken() {
		return (EReference)roomEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEvent_IsItemtaken() {
		return (EAttribute)roomEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEvent_Roomenteredtimes() {
		return (EAttribute)roomEventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEvent_Enemyattack() {
		return (EReference)roomEventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEvent_Roomdescription() {
		return (EAttribute)roomEventEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEvent_Trap() {
		return (EReference)roomEventEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomEvent_Trapdescription() {
		return (EAttribute)roomEventEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomEvent_ReceivedItem() {
		return (EReference)roomEventEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrap() {
		return trapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrap_Poison() {
		return (EAttribute)trapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrap_Fire() {
		return (EAttribute)trapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrap_Ice() {
		return (EAttribute)trapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrap_Lightning() {
		return (EAttribute)trapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrap_Normal() {
		return (EAttribute)trapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrap_Trapagility() {
		return (EAttribute)trapEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrap_Trapdescription() {
		return (EAttribute)trapEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrap_Type() {
		return (EAttribute)trapEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreature() {
		return creatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_Name() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_InitHp() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_InitMana() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_Mana() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_Strength() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_Agility() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_Charisma() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_Level() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreature_Inventory() {
		return (EReference)creatureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_Experience() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_Gold() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_InitPlayerActions() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_ResistLightning() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_ResistFire() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_ResistPoison() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_ResistIce() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_IsMale() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_Race() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_CreatureClass() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreature_Armor() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnemy() {
		return enemyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnemy_IsAttacking() {
		return (EAttribute)enemyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnemy_Scarefactor() {
		return (EAttribute)enemyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnemy_DamageFire() {
		return (EAttribute)enemyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnemy_DamageLightning() {
		return (EAttribute)enemyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnemy_DamageIce() {
		return (EAttribute)enemyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnemy_DamagePoison() {
		return (EAttribute)enemyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnemy_Auras() {
		return (EReference)enemyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnemy_Boss() {
		return (EAttribute)enemyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogController() {
		return dialogControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogController_Conversation() {
		return (EReference)dialogControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogChoices() {
		return dialogChoicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogChoices_Id() {
		return (EAttribute)dialogChoicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogChoices_Choices() {
		return (EReference)dialogChoicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialog() {
		return dialogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_Optiontext() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_Answertext() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_Id() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_GotoId() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_IsFinal() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialog_Dialogskilltest() {
		return (EReference)dialogEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_GiveItem() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialog_Item() {
		return (EReference)dialogEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialog_Quest() {
		return (EReference)dialogEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_IsAttacking() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_Event() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogSkillTest() {
		return dialogSkillTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogSkillTest_Skill() {
		return (EAttribute)dialogSkillTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogSkillTest_GotoIdSuccess() {
		return (EAttribute)dialogSkillTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogSkillTest_GotoIdFail() {
		return (EAttribute)dialogSkillTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogSkillTest_SkillNPC() {
		return (EAttribute)dialogSkillTestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogSkillTest_SucessText() {
		return (EAttribute)dialogSkillTestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogSkillTest_FailText() {
		return (EAttribute)dialogSkillTestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGold() {
		return goldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGold_Ammount() {
		return (EAttribute)goldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPotion() {
		return potionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPotion_Skill() {
		return (EAttribute)potionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPotion_AddSkill() {
		return (EAttribute)potionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeapon() {
		return weaponEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_Damage() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_IsTwohanded() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_DamageLightning() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_DamageFire() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_DamagePoison() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_DamageIce() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_Classes() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_Hp() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_Mana() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_Strength() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_Agility() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_Charisma() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmor() {
		return armorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmor_Armor() {
		return (EAttribute)armorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmor_ArmorType() {
		return (EAttribute)armorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmor_ResistLightning() {
		return (EAttribute)armorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmor_ResistIce() {
		return (EAttribute)armorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmor_ResistFire() {
		return (EAttribute)armorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmor_ResistPoison() {
		return (EAttribute)armorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmor_Classes() {
		return (EAttribute)armorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmor_Hp() {
		return (EAttribute)armorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmor_Mana() {
		return (EAttribute)armorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmor_Strength() {
		return (EAttribute)armorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmor_Agility() {
		return (EAttribute)armorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmor_Charisma() {
		return (EAttribute)armorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalRoom() {
		return finalRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinalRoom_IsFinal() {
		return (EAttribute)finalRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuest() {
		return questEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuest_Id() {
		return (EAttribute)questEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuest_Introduction() {
		return (EAttribute)questEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuest_Description() {
		return (EAttribute)questEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuest_CompleteText() {
		return (EAttribute)questEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuest_QuestCondition() {
		return (EAttribute)questEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuest_Enemydead() {
		return (EReference)questEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuest_Dialogid() {
		return (EAttribute)questEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuest_Room() {
		return (EReference)questEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessory() {
		return accessoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessory_Room() {
		return (EReference)accessoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAura() {
		return auraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAura_AuraType() {
		return (EAttribute)auraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAura_Ammount() {
		return (EAttribute)auraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuest_QuestItem() {
		return (EReference)questEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuest_IsComplete() {
		return (EAttribute)questEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuest_XpEarned() {
		return (EAttribute)questEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuest_AwardItem() {
		return (EReference)questEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuest_NpcGivenby() {
		return (EReference)questEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getERoomEventCondition() {
		return eRoomEventConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getERoomEventAction() {
		return eRoomEventActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getECreatureClass() {
		return eCreatureClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getECreatureRace() {
		return eCreatureRaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEElement() {
		return eElementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getESkill() {
		return eSkillEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEArmorType() {
		return eArmorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEAura() {
		return eAuraEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeveleditorFactory getLeveleditorFactory() {
		return (LeveleditorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		actEClass = createEClass(ACT);
		createEReference(actEClass, ACT__WORLD);
		createEAttribute(actEClass, ACT__ACT_NAME);
		createEReference(actEClass, ACT__GOTO_ACT);
		createEAttribute(actEClass, ACT__DESCRIPTION);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__NAME);
		createEAttribute(roomEClass, ROOM__DESCRIPTION);
		createEAttribute(roomEClass, ROOM__POST_DESCRIPTION);
		createEAttribute(roomEClass, ROOM__POST_ITEMS_DESCRIPTION);
		createEAttribute(roomEClass, ROOM__REVEALED_DESCRIPTION);
		createEAttribute(roomEClass, ROOM__HIDDEN_DESCRIPTION);
		createEReference(roomEClass, ROOM__ENEMIES);
		createEReference(roomEClass, ROOM__NPCS);
		createEReference(roomEClass, ROOM__ITEMS);
		createEAttribute(roomEClass, ROOM__IS_LOCKED);
		createEReference(roomEClass, ROOM__UNLOCK_KEYS);
		createEAttribute(roomEClass, ROOM__IS_HIDDEN);
		createEAttribute(roomEClass, ROOM__IS_REVEALED);
		createEAttribute(roomEClass, ROOM__IS_HIDDEN_EVENT);
		createEReference(roomEClass, ROOM__NORTH);
		createEReference(roomEClass, ROOM__SOUTH);
		createEReference(roomEClass, ROOM__WEST);
		createEReference(roomEClass, ROOM__EAST);
		createEAttribute(roomEClass, ROOM__AUTOSAVE);

		npcEClass = createEClass(NPC);
		createEReference(npcEClass, NPC__DIALOGCONTROLLER);
		createEAttribute(npcEClass, NPC__TALKING);
		createEAttribute(npcEClass, NPC__FIRSTTIME);
		createEAttribute(npcEClass, NPC__GOTO_ID);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__NAME);

		keyEClass = createEClass(KEY);
		createEAttribute(keyEClass, KEY__ID);

		eventRoomEClass = createEClass(EVENT_ROOM);
		createEReference(eventRoomEClass, EVENT_ROOM__EVENTS);
		createEReference(eventRoomEClass, EVENT_ROOM__QUEST);

		roomEventEClass = createEClass(ROOM_EVENT);
		createEAttribute(roomEventEClass, ROOM_EVENT__CONDITION);
		createEAttribute(roomEventEClass, ROOM_EVENT__ACTION);
		createEAttribute(roomEventEClass, ROOM_EVENT__IS_ENEMY_DEAD);
		createEAttribute(roomEventEClass, ROOM_EVENT__IS_ITEMUSED);
		createEReference(roomEventEClass, ROOM_EVENT__ITEMTAKEN);
		createEAttribute(roomEventEClass, ROOM_EVENT__IS_ITEMTAKEN);
		createEAttribute(roomEventEClass, ROOM_EVENT__ROOMENTEREDTIMES);
		createEReference(roomEventEClass, ROOM_EVENT__ENEMYATTACK);
		createEAttribute(roomEventEClass, ROOM_EVENT__ROOMDESCRIPTION);
		createEReference(roomEventEClass, ROOM_EVENT__TRAP);
		createEAttribute(roomEventEClass, ROOM_EVENT__TRAPDESCRIPTION);
		createEReference(roomEventEClass, ROOM_EVENT__RECEIVED_ITEM);
		createEReference(roomEventEClass, ROOM_EVENT__ITEM_USED);
		createEReference(roomEventEClass, ROOM_EVENT__PLACEENEMY);
		createEReference(roomEventEClass, ROOM_EVENT__ROOM);
		createEReference(roomEventEClass, ROOM_EVENT__NPC);
		createEAttribute(roomEventEClass, ROOM_EVENT__HP);
		createEAttribute(roomEventEClass, ROOM_EVENT__FINISHEDTALKING);
		createEAttribute(roomEventEClass, ROOM_EVENT__NPC_GOTO_ID);
		createEReference(roomEventEClass, ROOM_EVENT__HIDDENROOMFOUND);
		createEReference(roomEventEClass, ROOM_EVENT__QUEST);

		trapEClass = createEClass(TRAP);
		createEAttribute(trapEClass, TRAP__POISON);
		createEAttribute(trapEClass, TRAP__FIRE);
		createEAttribute(trapEClass, TRAP__ICE);
		createEAttribute(trapEClass, TRAP__LIGHTNING);
		createEAttribute(trapEClass, TRAP__NORMAL);
		createEAttribute(trapEClass, TRAP__TRAPAGILITY);
		createEAttribute(trapEClass, TRAP__TRAPDESCRIPTION);
		createEAttribute(trapEClass, TRAP__TYPE);

		creatureEClass = createEClass(CREATURE);
		createEAttribute(creatureEClass, CREATURE__NAME);
		createEAttribute(creatureEClass, CREATURE__INIT_HP);
		createEAttribute(creatureEClass, CREATURE__INIT_MANA);
		createEAttribute(creatureEClass, CREATURE__MANA);
		createEAttribute(creatureEClass, CREATURE__STRENGTH);
		createEAttribute(creatureEClass, CREATURE__AGILITY);
		createEAttribute(creatureEClass, CREATURE__CHARISMA);
		createEAttribute(creatureEClass, CREATURE__LEVEL);
		createEReference(creatureEClass, CREATURE__INVENTORY);
		createEAttribute(creatureEClass, CREATURE__EXPERIENCE);
		createEAttribute(creatureEClass, CREATURE__GOLD);
		createEAttribute(creatureEClass, CREATURE__INIT_PLAYER_ACTIONS);
		createEAttribute(creatureEClass, CREATURE__RESIST_LIGHTNING);
		createEAttribute(creatureEClass, CREATURE__RESIST_FIRE);
		createEAttribute(creatureEClass, CREATURE__RESIST_POISON);
		createEAttribute(creatureEClass, CREATURE__RESIST_ICE);
		createEAttribute(creatureEClass, CREATURE__IS_MALE);
		createEAttribute(creatureEClass, CREATURE__RACE);
		createEAttribute(creatureEClass, CREATURE__CREATURE_CLASS);
		createEAttribute(creatureEClass, CREATURE__ARMOR);

		enemyEClass = createEClass(ENEMY);
		createEAttribute(enemyEClass, ENEMY__IS_ATTACKING);
		createEAttribute(enemyEClass, ENEMY__SCAREFACTOR);
		createEAttribute(enemyEClass, ENEMY__DAMAGE_FIRE);
		createEAttribute(enemyEClass, ENEMY__DAMAGE_LIGHTNING);
		createEAttribute(enemyEClass, ENEMY__DAMAGE_ICE);
		createEAttribute(enemyEClass, ENEMY__DAMAGE_POISON);
		createEReference(enemyEClass, ENEMY__AURAS);
		createEAttribute(enemyEClass, ENEMY__BOSS);

		dialogControllerEClass = createEClass(DIALOG_CONTROLLER);
		createEReference(dialogControllerEClass, DIALOG_CONTROLLER__CONVERSATION);

		dialogChoicesEClass = createEClass(DIALOG_CHOICES);
		createEAttribute(dialogChoicesEClass, DIALOG_CHOICES__ID);
		createEReference(dialogChoicesEClass, DIALOG_CHOICES__CHOICES);

		dialogEClass = createEClass(DIALOG);
		createEAttribute(dialogEClass, DIALOG__OPTIONTEXT);
		createEAttribute(dialogEClass, DIALOG__ANSWERTEXT);
		createEAttribute(dialogEClass, DIALOG__ID);
		createEAttribute(dialogEClass, DIALOG__GOTO_ID);
		createEAttribute(dialogEClass, DIALOG__IS_FINAL);
		createEReference(dialogEClass, DIALOG__DIALOGSKILLTEST);
		createEAttribute(dialogEClass, DIALOG__GIVE_ITEM);
		createEReference(dialogEClass, DIALOG__ITEM);
		createEReference(dialogEClass, DIALOG__QUEST);
		createEAttribute(dialogEClass, DIALOG__IS_ATTACKING);
		createEAttribute(dialogEClass, DIALOG__EVENT);

		dialogSkillTestEClass = createEClass(DIALOG_SKILL_TEST);
		createEAttribute(dialogSkillTestEClass, DIALOG_SKILL_TEST__SKILL);
		createEAttribute(dialogSkillTestEClass, DIALOG_SKILL_TEST__GOTO_ID_SUCCESS);
		createEAttribute(dialogSkillTestEClass, DIALOG_SKILL_TEST__GOTO_ID_FAIL);
		createEAttribute(dialogSkillTestEClass, DIALOG_SKILL_TEST__SKILL_NPC);
		createEAttribute(dialogSkillTestEClass, DIALOG_SKILL_TEST__SUCESS_TEXT);
		createEAttribute(dialogSkillTestEClass, DIALOG_SKILL_TEST__FAIL_TEXT);

		goldEClass = createEClass(GOLD);
		createEAttribute(goldEClass, GOLD__AMMOUNT);

		potionEClass = createEClass(POTION);
		createEAttribute(potionEClass, POTION__SKILL);
		createEAttribute(potionEClass, POTION__ADD_SKILL);

		weaponEClass = createEClass(WEAPON);
		createEAttribute(weaponEClass, WEAPON__DAMAGE);
		createEAttribute(weaponEClass, WEAPON__IS_TWOHANDED);
		createEAttribute(weaponEClass, WEAPON__DAMAGE_LIGHTNING);
		createEAttribute(weaponEClass, WEAPON__DAMAGE_FIRE);
		createEAttribute(weaponEClass, WEAPON__DAMAGE_POISON);
		createEAttribute(weaponEClass, WEAPON__DAMAGE_ICE);
		createEAttribute(weaponEClass, WEAPON__CLASSES);
		createEAttribute(weaponEClass, WEAPON__HP);
		createEAttribute(weaponEClass, WEAPON__MANA);
		createEAttribute(weaponEClass, WEAPON__STRENGTH);
		createEAttribute(weaponEClass, WEAPON__AGILITY);
		createEAttribute(weaponEClass, WEAPON__CHARISMA);

		armorEClass = createEClass(ARMOR);
		createEAttribute(armorEClass, ARMOR__ARMOR);
		createEAttribute(armorEClass, ARMOR__ARMOR_TYPE);
		createEAttribute(armorEClass, ARMOR__RESIST_LIGHTNING);
		createEAttribute(armorEClass, ARMOR__RESIST_ICE);
		createEAttribute(armorEClass, ARMOR__RESIST_FIRE);
		createEAttribute(armorEClass, ARMOR__RESIST_POISON);
		createEAttribute(armorEClass, ARMOR__CLASSES);
		createEAttribute(armorEClass, ARMOR__HP);
		createEAttribute(armorEClass, ARMOR__MANA);
		createEAttribute(armorEClass, ARMOR__STRENGTH);
		createEAttribute(armorEClass, ARMOR__AGILITY);
		createEAttribute(armorEClass, ARMOR__CHARISMA);

		finalRoomEClass = createEClass(FINAL_ROOM);
		createEAttribute(finalRoomEClass, FINAL_ROOM__IS_FINAL);

		questEClass = createEClass(QUEST);
		createEAttribute(questEClass, QUEST__ID);
		createEAttribute(questEClass, QUEST__INTRODUCTION);
		createEAttribute(questEClass, QUEST__DESCRIPTION);
		createEAttribute(questEClass, QUEST__COMPLETE_TEXT);
		createEAttribute(questEClass, QUEST__QUEST_CONDITION);
		createEReference(questEClass, QUEST__QUEST_ITEM);
		createEAttribute(questEClass, QUEST__IS_COMPLETE);
		createEAttribute(questEClass, QUEST__XP_EARNED);
		createEReference(questEClass, QUEST__AWARD_ITEM);
		createEReference(questEClass, QUEST__NPC_GIVENBY);
		createEReference(questEClass, QUEST__ENEMYDEAD);
		createEAttribute(questEClass, QUEST__DIALOGID);
		createEReference(questEClass, QUEST__ROOM);

		accessoryEClass = createEClass(ACCESSORY);
		createEReference(accessoryEClass, ACCESSORY__ROOM);

		auraEClass = createEClass(AURA);
		createEAttribute(auraEClass, AURA__AURA_TYPE);
		createEAttribute(auraEClass, AURA__AMMOUNT);

		// Create enums
		eRoomEventConditionEEnum = createEEnum(EROOM_EVENT_CONDITION);
		eRoomEventActionEEnum = createEEnum(EROOM_EVENT_ACTION);
		eCreatureClassEEnum = createEEnum(ECREATURE_CLASS);
		eCreatureRaceEEnum = createEEnum(ECREATURE_RACE);
		eElementEEnum = createEEnum(EELEMENT);
		eSkillEEnum = createEEnum(ESKILL);
		eArmorTypeEEnum = createEEnum(EARMOR_TYPE);
		eAuraEEnum = createEEnum(EAURA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		npcEClass.getESuperTypes().add(this.getEnemy());
		keyEClass.getESuperTypes().add(this.getItem());
		eventRoomEClass.getESuperTypes().add(this.getRoom());
		enemyEClass.getESuperTypes().add(this.getCreature());
		goldEClass.getESuperTypes().add(this.getItem());
		potionEClass.getESuperTypes().add(this.getItem());
		weaponEClass.getESuperTypes().add(this.getItem());
		armorEClass.getESuperTypes().add(this.getItem());
		finalRoomEClass.getESuperTypes().add(this.getEventRoom());
		accessoryEClass.getESuperTypes().add(this.getItem());

		// Initialize classes and features; add operations and parameters
		initEClass(actEClass, Act.class, "Act", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAct_World(), this.getRoom(), null, "world", null, 1, -1, Act.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAct_ActName(), ecorePackage.getEString(), "actName", null, 0, 1, Act.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAct_GotoAct(), this.getAct(), null, "gotoAct", null, 0, 1, Act.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAct_Description(), ecorePackage.getEString(), "description", null, 0, 1, Act.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Name(), ecorePackage.getEString(), "name", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_Description(), ecorePackage.getEString(), "description", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_PostDescription(), ecorePackage.getEString(), "postDescription", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_PostItemsDescription(), ecorePackage.getEString(), "postItemsDescription", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_RevealedDescription(), ecorePackage.getEString(), "revealedDescription", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_HiddenDescription(), ecorePackage.getEString(), "hiddenDescription", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Enemies(), this.getEnemy(), null, "enemies", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Npcs(), this.getNPC(), null, "npcs", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Items(), this.getItem(), null, "items", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_IsLocked(), ecorePackage.getEBoolean(), "isLocked", "false", 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_UnlockKeys(), this.getKey(), null, "unlockKeys", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_IsHidden(), ecorePackage.getEBoolean(), "isHidden", "false", 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_IsRevealed(), ecorePackage.getEBoolean(), "isRevealed", "false", 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_IsHiddenEvent(), ecorePackage.getEBoolean(), "isHiddenEvent", "false", 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_North(), this.getRoom(), null, "north", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_South(), this.getRoom(), null, "south", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_West(), this.getRoom(), null, "west", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_East(), this.getRoom(), null, "east", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_Autosave(), ecorePackage.getEBoolean(), "autosave", "false", 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(npcEClass, Leveleditor.NPC.class, "NPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNPC_Dialogcontroller(), this.getDialogController(), null, "dialogcontroller", null, 1, 1, Leveleditor.NPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNPC_Talking(), ecorePackage.getEBoolean(), "talking", "false", 0, 1, Leveleditor.NPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNPC_Firsttime(), ecorePackage.getEBoolean(), "firsttime", "true", 0, 1, Leveleditor.NPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNPC_GotoId(), ecorePackage.getEInt(), "gotoId", "0", 0, 1, Leveleditor.NPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKey_Id(), ecorePackage.getEString(), "id", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventRoomEClass, EventRoom.class, "EventRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventRoom_Events(), this.getRoomEvent(), null, "events", null, 0, -1, EventRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventRoom_Quest(), this.getQuest(), null, "quest", null, 0, 1, EventRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEventEClass, RoomEvent.class, "RoomEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomEvent_Condition(), this.getERoomEventCondition(), "condition", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomEvent_Action(), this.getERoomEventAction(), "action", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomEvent_IsEnemyDead(), ecorePackage.getEBoolean(), "isEnemyDead", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomEvent_IsItemused(), ecorePackage.getEBoolean(), "isItemused", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomEvent_Itemtaken(), this.getItem(), null, "itemtaken", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomEvent_IsItemtaken(), ecorePackage.getEBoolean(), "isItemtaken", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomEvent_Roomenteredtimes(), ecorePackage.getEInt(), "roomenteredtimes", "0", 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomEvent_Enemyattack(), this.getEnemy(), null, "enemyattack", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomEvent_Roomdescription(), ecorePackage.getEString(), "roomdescription", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomEvent_Trap(), this.getTrap(), null, "trap", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomEvent_Trapdescription(), ecorePackage.getEString(), "trapdescription", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomEvent_ReceivedItem(), this.getItem(), null, "receivedItem", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomEvent_ItemUsed(), this.getItem(), null, "itemUsed", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomEvent_Placeenemy(), this.getEnemy(), null, "placeenemy", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomEvent_Room(), this.getRoom(), null, "room", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomEvent_Npc(), this.getNPC(), null, "npc", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomEvent_HP(), ecorePackage.getEInt(), "HP", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomEvent_Finishedtalking(), ecorePackage.getEBoolean(), "finishedtalking", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomEvent_NpcGotoId(), ecorePackage.getEInt(), "npcGotoId", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomEvent_Hiddenroomfound(), this.getRoom(), null, "hiddenroomfound", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomEvent_Quest(), this.getQuest(), null, "quest", null, 0, 1, RoomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trapEClass, Trap.class, "Trap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrap_Poison(), ecorePackage.getEInt(), "poison", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrap_Fire(), ecorePackage.getEInt(), "fire", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrap_Ice(), ecorePackage.getEInt(), "ice", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrap_Lightning(), ecorePackage.getEInt(), "lightning", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrap_Normal(), ecorePackage.getEInt(), "normal", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrap_Trapagility(), ecorePackage.getEInt(), "trapagility", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrap_Trapdescription(), ecorePackage.getEString(), "trapdescription", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrap_Type(), this.getEElement(), "type", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creatureEClass, Creature.class, "Creature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_InitHp(), ecorePackage.getEInt(), "initHp", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_InitMana(), ecorePackage.getEInt(), "initMana", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Mana(), ecorePackage.getEInt(), "mana", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Strength(), ecorePackage.getEInt(), "strength", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Agility(), ecorePackage.getEInt(), "agility", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Charisma(), ecorePackage.getEInt(), "charisma", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Level(), ecorePackage.getEInt(), "level", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreature_Inventory(), this.getItem(), null, "inventory", null, 0, -1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Experience(), ecorePackage.getEInt(), "experience", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Gold(), ecorePackage.getEInt(), "gold", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_InitPlayerActions(), ecorePackage.getEInt(), "initPlayerActions", "1", 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_ResistLightning(), ecorePackage.getEInt(), "resistLightning", "0", 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_ResistFire(), ecorePackage.getEInt(), "resistFire", "0", 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_ResistPoison(), ecorePackage.getEInt(), "resistPoison", "0", 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_ResistIce(), ecorePackage.getEInt(), "resistIce", "0", 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_IsMale(), ecorePackage.getEBoolean(), "isMale", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Race(), this.getECreatureRace(), "race", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_CreatureClass(), this.getECreatureClass(), "creatureClass", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Armor(), ecorePackage.getEInt(), "armor", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enemyEClass, Enemy.class, "Enemy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnemy_IsAttacking(), ecorePackage.getEBoolean(), "isAttacking", "false", 0, 1, Enemy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemy_Scarefactor(), ecorePackage.getEInt(), "scarefactor", null, 0, 1, Enemy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemy_DamageFire(), ecorePackage.getEInt(), "damageFire", "0", 0, 1, Enemy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemy_DamageLightning(), ecorePackage.getEInt(), "damageLightning", "0", 0, 1, Enemy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemy_DamageIce(), ecorePackage.getEInt(), "damageIce", "0", 0, 1, Enemy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemy_DamagePoison(), ecorePackage.getEInt(), "damagePoison", "0", 0, 1, Enemy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnemy_Auras(), this.getAura(), null, "auras", null, 0, -1, Enemy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemy_Boss(), ecorePackage.getEBoolean(), "boss", null, 0, 1, Enemy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogControllerEClass, DialogController.class, "DialogController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDialogController_Conversation(), this.getDialogChoices(), null, "conversation", null, 0, -1, DialogController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogChoicesEClass, DialogChoices.class, "DialogChoices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDialogChoices_Id(), ecorePackage.getEInt(), "id", null, 0, 1, DialogChoices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialogChoices_Choices(), this.getDialog(), null, "choices", null, 0, -1, DialogChoices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogEClass, Dialog.class, "Dialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDialog_Optiontext(), ecorePackage.getEString(), "optiontext", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_Answertext(), ecorePackage.getEString(), "answertext", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_GotoId(), ecorePackage.getEInt(), "gotoId", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialog_Dialogskilltest(), this.getDialogSkillTest(), null, "dialogskilltest", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_GiveItem(), ecorePackage.getEBoolean(), "giveItem", "false", 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialog_Item(), this.getItem(), null, "item", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialog_Quest(), this.getQuest(), null, "quest", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_IsAttacking(), ecorePackage.getEBoolean(), "isAttacking", "false", 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_Event(), ecorePackage.getEBoolean(), "event", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogSkillTestEClass, DialogSkillTest.class, "DialogSkillTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDialogSkillTest_Skill(), this.getESkill(), "skill", null, 0, 1, DialogSkillTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogSkillTest_GotoIdSuccess(), ecorePackage.getEInt(), "gotoIdSuccess", null, 0, 1, DialogSkillTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogSkillTest_GotoIdFail(), ecorePackage.getEInt(), "gotoIdFail", null, 0, 1, DialogSkillTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogSkillTest_SkillNPC(), ecorePackage.getEInt(), "skillNPC", null, 0, 1, DialogSkillTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogSkillTest_SucessText(), ecorePackage.getEString(), "sucessText", null, 0, 1, DialogSkillTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogSkillTest_FailText(), ecorePackage.getEString(), "failText", null, 0, 1, DialogSkillTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goldEClass, Gold.class, "Gold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGold_Ammount(), ecorePackage.getEInt(), "ammount", null, 0, 1, Gold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(potionEClass, Potion.class, "Potion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPotion_Skill(), this.getESkill(), "skill", null, 0, 1, Potion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPotion_AddSkill(), ecorePackage.getEInt(), "addSkill", null, 0, 1, Potion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weaponEClass, Weapon.class, "Weapon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeapon_Damage(), ecorePackage.getEInt(), "damage", null, 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeapon_IsTwohanded(), ecorePackage.getEBoolean(), "isTwohanded", null, 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeapon_DamageLightning(), ecorePackage.getEInt(), "damageLightning", "0", 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeapon_DamageFire(), ecorePackage.getEInt(), "damageFire", "0", 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeapon_DamagePoison(), ecorePackage.getEInt(), "damagePoison", "0", 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeapon_DamageIce(), ecorePackage.getEInt(), "damageIce", "0", 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeapon_Classes(), this.getECreatureClass(), "classes", "", 1, -1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeapon_Hp(), ecorePackage.getEInt(), "hp", null, 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeapon_Mana(), ecorePackage.getEInt(), "mana", null, 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeapon_Strength(), ecorePackage.getEInt(), "strength", null, 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeapon_Agility(), ecorePackage.getEInt(), "agility", null, 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeapon_Charisma(), ecorePackage.getEInt(), "charisma", null, 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armorEClass, Armor.class, "Armor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArmor_Armor(), ecorePackage.getEInt(), "armor", null, 0, 1, Armor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmor_ArmorType(), this.getEArmorType(), "armorType", null, 0, 1, Armor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmor_ResistLightning(), ecorePackage.getEInt(), "resistLightning", "0", 0, 1, Armor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmor_ResistIce(), ecorePackage.getEInt(), "resistIce", "0", 0, 1, Armor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmor_ResistFire(), ecorePackage.getEInt(), "resistFire", "0", 0, 1, Armor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmor_ResistPoison(), ecorePackage.getEInt(), "resistPoison", "0", 0, 1, Armor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmor_Classes(), this.getECreatureClass(), "classes", null, 1, -1, Armor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmor_Hp(), ecorePackage.getEInt(), "hp", null, 0, 1, Armor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmor_Mana(), ecorePackage.getEInt(), "mana", null, 0, 1, Armor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmor_Strength(), ecorePackage.getEInt(), "strength", null, 0, 1, Armor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmor_Agility(), ecorePackage.getEInt(), "agility", null, 0, 1, Armor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmor_Charisma(), ecorePackage.getEInt(), "charisma", null, 0, 1, Armor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalRoomEClass, FinalRoom.class, "FinalRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinalRoom_IsFinal(), ecorePackage.getEBoolean(), "isFinal", "false", 0, 1, FinalRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questEClass, Quest.class, "Quest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuest_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuest_Introduction(), ecorePackage.getEString(), "introduction", null, 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuest_Description(), ecorePackage.getEString(), "description", null, 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuest_CompleteText(), ecorePackage.getEString(), "completeText", null, 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuest_QuestCondition(), this.getERoomEventCondition(), "questCondition", null, 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuest_QuestItem(), this.getItem(), null, "questItem", null, 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuest_IsComplete(), ecorePackage.getEBoolean(), "isComplete", "false", 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuest_XpEarned(), ecorePackage.getEInt(), "xpEarned", null, 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuest_AwardItem(), this.getItem(), null, "awardItem", null, 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuest_NpcGivenby(), this.getNPC(), null, "npcGivenby", null, 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuest_Enemydead(), this.getEnemy(), null, "enemydead", null, 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuest_Dialogid(), ecorePackage.getEInt(), "dialogid", null, 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuest_Room(), this.getRoom(), null, "room", null, 0, 1, Quest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessoryEClass, Accessory.class, "Accessory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessory_Room(), this.getRoom(), null, "room", null, 0, 1, Accessory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auraEClass, Aura.class, "Aura", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAura_AuraType(), this.getEAura(), "auraType", null, 0, 1, Aura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAura_Ammount(), ecorePackage.getEInt(), "ammount", null, 0, 1, Aura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eRoomEventConditionEEnum, ERoomEventCondition.class, "ERoomEventCondition");
		addEEnumLiteral(eRoomEventConditionEEnum, ERoomEventCondition.ENEMY_DIED);
		addEEnumLiteral(eRoomEventConditionEEnum, ERoomEventCondition.ITEM_USED);
		addEEnumLiteral(eRoomEventConditionEEnum, ERoomEventCondition.HIDDENROOM_FOUND);
		addEEnumLiteral(eRoomEventConditionEEnum, ERoomEventCondition.ITEM_GIVEN);
		addEEnumLiteral(eRoomEventConditionEEnum, ERoomEventCondition.ITEM_TAKEN);
		addEEnumLiteral(eRoomEventConditionEEnum, ERoomEventCondition.ROOM_ENTERED_TWICE);
		addEEnumLiteral(eRoomEventConditionEEnum, ERoomEventCondition.ROOM_ENTERED);
		addEEnumLiteral(eRoomEventConditionEEnum, ERoomEventCondition.FINISHED_DIALOG);

		initEEnum(eRoomEventActionEEnum, ERoomEventAction.class, "ERoomEventAction");
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.ENEMY_ATTACK);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.ROOM_DESCRIPTION);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.HIDDENROOM_FOUND);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.ROOM_PLACEENEMY);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.TRIGGER_TRAP);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.ADD_ITEM);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.REMOVE_ENEMY);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.REMOVE_NPC);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.SET_HP_ENEMY);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.MOVE_PLAYER);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.NPC_TALK);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.CANCEL_ACCESSORY);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.UNLOCK_DOOR);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.SOLVE_QUEST_ENTERROOM);
		addEEnumLiteral(eRoomEventActionEEnum, ERoomEventAction.ADD_QUEST);

		initEEnum(eCreatureClassEEnum, ECreatureClass.class, "ECreatureClass");
		addEEnumLiteral(eCreatureClassEEnum, ECreatureClass.WARRIOR);
		addEEnumLiteral(eCreatureClassEEnum, ECreatureClass.WIZARD);
		addEEnumLiteral(eCreatureClassEEnum, ECreatureClass.PALADIN);
		addEEnumLiteral(eCreatureClassEEnum, ECreatureClass.ASSASIN);
		addEEnumLiteral(eCreatureClassEEnum, ECreatureClass.WARLOCK);
		addEEnumLiteral(eCreatureClassEEnum, ECreatureClass.ICE_WIZARD);

		initEEnum(eCreatureRaceEEnum, ECreatureRace.class, "ECreatureRace");
		addEEnumLiteral(eCreatureRaceEEnum, ECreatureRace.HUMAN);
		addEEnumLiteral(eCreatureRaceEEnum, ECreatureRace.ORC);
		addEEnumLiteral(eCreatureRaceEEnum, ECreatureRace.GOBLIN);
		addEEnumLiteral(eCreatureRaceEEnum, ECreatureRace.ELF);
		addEEnumLiteral(eCreatureRaceEEnum, ECreatureRace.RAT);
		addEEnumLiteral(eCreatureRaceEEnum, ECreatureRace.DARK_ORC);
		addEEnumLiteral(eCreatureRaceEEnum, ECreatureRace.WERERAT);
		addEEnumLiteral(eCreatureRaceEEnum, ECreatureRace.HELLHOUND);
		addEEnumLiteral(eCreatureRaceEEnum, ECreatureRace.TROLL);
		addEEnumLiteral(eCreatureRaceEEnum, ECreatureRace.UNDEAD);
		addEEnumLiteral(eCreatureRaceEEnum, ECreatureRace.REPTILE);

		initEEnum(eElementEEnum, EElement.class, "EElement");
		addEEnumLiteral(eElementEEnum, EElement.LIGHTNING);
		addEEnumLiteral(eElementEEnum, EElement.POISON);
		addEEnumLiteral(eElementEEnum, EElement.FIRE);
		addEEnumLiteral(eElementEEnum, EElement.ICE);
		addEEnumLiteral(eElementEEnum, EElement.NORMAL);

		initEEnum(eSkillEEnum, ESkill.class, "ESkill");
		addEEnumLiteral(eSkillEEnum, ESkill.STRENGTH);
		addEEnumLiteral(eSkillEEnum, ESkill.AGILITY);
		addEEnumLiteral(eSkillEEnum, ESkill.CHARISMA);
		addEEnumLiteral(eSkillEEnum, ESkill.MANA);
		addEEnumLiteral(eSkillEEnum, ESkill.HP);

		initEEnum(eArmorTypeEEnum, EArmorType.class, "EArmorType");
		addEEnumLiteral(eArmorTypeEEnum, EArmorType.HEAD);
		addEEnumLiteral(eArmorTypeEEnum, EArmorType.BODY);
		addEEnumLiteral(eArmorTypeEEnum, EArmorType.LEGGINS);

		initEEnum(eAuraEEnum, EAura.class, "EAura");
		addEEnumLiteral(eAuraEEnum, EAura.REGEN_MANA);
		addEEnumLiteral(eAuraEEnum, EAura.REGEN_HP);

		// Create resource
		createResource(eNS_URI);
	}

} //LeveleditorPackageImpl
