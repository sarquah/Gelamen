/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import Leveleditor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeveleditorFactoryImpl extends EFactoryImpl implements LeveleditorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LeveleditorFactory init() {
		try {
			LeveleditorFactory theLeveleditorFactory = (LeveleditorFactory)EPackage.Registry.INSTANCE.getEFactory("leveleditor"); 
			if (theLeveleditorFactory != null) {
				return theLeveleditorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LeveleditorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeveleditorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LeveleditorPackage.ACT: return createAct();
			case LeveleditorPackage.NPC: return createNPC();
			case LeveleditorPackage.KEY: return createKey();
			case LeveleditorPackage.EVENT_ROOM: return createEventRoom();
			case LeveleditorPackage.ROOM_EVENT: return createRoomEvent();
			case LeveleditorPackage.TRAP: return createTrap();
			case LeveleditorPackage.ENEMY: return createEnemy();
			case LeveleditorPackage.DIALOG_CONTROLLER: return createDialogController();
			case LeveleditorPackage.DIALOG_CHOICES: return createDialogChoices();
			case LeveleditorPackage.DIALOG: return createDialog();
			case LeveleditorPackage.DIALOG_SKILL_TEST: return createDialogSkillTest();
			case LeveleditorPackage.GOLD: return createGold();
			case LeveleditorPackage.POTION: return createPotion();
			case LeveleditorPackage.WEAPON: return createWeapon();
			case LeveleditorPackage.ARMOR: return createArmor();
			case LeveleditorPackage.FINAL_ROOM: return createFinalRoom();
			case LeveleditorPackage.QUEST: return createQuest();
			case LeveleditorPackage.ACCESSORY: return createAccessory();
			case LeveleditorPackage.AURA: return createAura();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LeveleditorPackage.EROOM_EVENT_CONDITION:
				return createERoomEventConditionFromString(eDataType, initialValue);
			case LeveleditorPackage.EROOM_EVENT_ACTION:
				return createERoomEventActionFromString(eDataType, initialValue);
			case LeveleditorPackage.ECREATURE_CLASS:
				return createECreatureClassFromString(eDataType, initialValue);
			case LeveleditorPackage.ECREATURE_RACE:
				return createECreatureRaceFromString(eDataType, initialValue);
			case LeveleditorPackage.EELEMENT:
				return createEElementFromString(eDataType, initialValue);
			case LeveleditorPackage.ESKILL:
				return createESkillFromString(eDataType, initialValue);
			case LeveleditorPackage.EARMOR_TYPE:
				return createEArmorTypeFromString(eDataType, initialValue);
			case LeveleditorPackage.EAURA:
				return createEAuraFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LeveleditorPackage.EROOM_EVENT_CONDITION:
				return convertERoomEventConditionToString(eDataType, instanceValue);
			case LeveleditorPackage.EROOM_EVENT_ACTION:
				return convertERoomEventActionToString(eDataType, instanceValue);
			case LeveleditorPackage.ECREATURE_CLASS:
				return convertECreatureClassToString(eDataType, instanceValue);
			case LeveleditorPackage.ECREATURE_RACE:
				return convertECreatureRaceToString(eDataType, instanceValue);
			case LeveleditorPackage.EELEMENT:
				return convertEElementToString(eDataType, instanceValue);
			case LeveleditorPackage.ESKILL:
				return convertESkillToString(eDataType, instanceValue);
			case LeveleditorPackage.EARMOR_TYPE:
				return convertEArmorTypeToString(eDataType, instanceValue);
			case LeveleditorPackage.EAURA:
				return convertEAuraToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Act createAct() {
		ActImpl act = new ActImpl();
		return act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPC createNPC() {
		NPCImpl npc = new NPCImpl();
		return npc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventRoom createEventRoom() {
		EventRoomImpl eventRoom = new EventRoomImpl();
		return eventRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomEvent createRoomEvent() {
		RoomEventImpl roomEvent = new RoomEventImpl();
		return roomEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trap createTrap() {
		TrapImpl trap = new TrapImpl();
		return trap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enemy createEnemy() {
		EnemyImpl enemy = new EnemyImpl();
		return enemy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogController createDialogController() {
		DialogControllerImpl dialogController = new DialogControllerImpl();
		return dialogController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogChoices createDialogChoices() {
		DialogChoicesImpl dialogChoices = new DialogChoicesImpl();
		return dialogChoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialog createDialog() {
		DialogImpl dialog = new DialogImpl();
		return dialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogSkillTest createDialogSkillTest() {
		DialogSkillTestImpl dialogSkillTest = new DialogSkillTestImpl();
		return dialogSkillTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gold createGold() {
		GoldImpl gold = new GoldImpl();
		return gold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Potion createPotion() {
		PotionImpl potion = new PotionImpl();
		return potion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weapon createWeapon() {
		WeaponImpl weapon = new WeaponImpl();
		return weapon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Armor createArmor() {
		ArmorImpl armor = new ArmorImpl();
		return armor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalRoom createFinalRoom() {
		FinalRoomImpl finalRoom = new FinalRoomImpl();
		return finalRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quest createQuest() {
		QuestImpl quest = new QuestImpl();
		return quest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accessory createAccessory() {
		AccessoryImpl accessory = new AccessoryImpl();
		return accessory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aura createAura() {
		AuraImpl aura = new AuraImpl();
		return aura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERoomEventCondition createERoomEventConditionFromString(EDataType eDataType, String initialValue) {
		ERoomEventCondition result = ERoomEventCondition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertERoomEventConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERoomEventAction createERoomEventActionFromString(EDataType eDataType, String initialValue) {
		ERoomEventAction result = ERoomEventAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertERoomEventActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECreatureClass createECreatureClassFromString(EDataType eDataType, String initialValue) {
		ECreatureClass result = ECreatureClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECreatureClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECreatureRace createECreatureRaceFromString(EDataType eDataType, String initialValue) {
		ECreatureRace result = ECreatureRace.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECreatureRaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EElement createEElementFromString(EDataType eDataType, String initialValue) {
		EElement result = EElement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEElementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESkill createESkillFromString(EDataType eDataType, String initialValue) {
		ESkill result = ESkill.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESkillToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EArmorType createEArmorTypeFromString(EDataType eDataType, String initialValue) {
		EArmorType result = EArmorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEArmorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAura createEAuraFromString(EDataType eDataType, String initialValue) {
		EAura result = EAura.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEAuraToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeveleditorPackage getLeveleditorPackage() {
		return (LeveleditorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LeveleditorPackage getPackage() {
		return LeveleditorPackage.eINSTANCE;
	}

} //LeveleditorFactoryImpl
