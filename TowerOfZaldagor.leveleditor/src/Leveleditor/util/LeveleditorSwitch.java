/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.util;

import Leveleditor.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import Leveleditor.Accessory;
import Leveleditor.Act;
import Leveleditor.Armor;
import Leveleditor.Aura;
import Leveleditor.Creature;
import Leveleditor.Dialog;
import Leveleditor.DialogChoices;
import Leveleditor.DialogController;
import Leveleditor.DialogSkillTest;
import Leveleditor.Enemy;
import Leveleditor.EventRoom;
import Leveleditor.FinalRoom;
import Leveleditor.Gold;
import Leveleditor.Item;
import Leveleditor.Key;
import Leveleditor.LeveleditorPackage;
import Leveleditor.NPC;
import Leveleditor.Potion;
import Leveleditor.Quest;
import Leveleditor.Room;
import Leveleditor.RoomEvent;
import Leveleditor.Trap;
import Leveleditor.Weapon;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Leveleditor.LeveleditorPackage
 * @generated
 */
public class LeveleditorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LeveleditorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeveleditorSwitch() {
		if (modelPackage == null) {
			modelPackage = LeveleditorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LeveleditorPackage.ACT: {
				Act act = (Act)theEObject;
				T result = caseAct(act);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.NPC: {
				NPC npc = (NPC)theEObject;
				T result = caseNPC(npc);
				if (result == null) result = caseEnemy(npc);
				if (result == null) result = caseCreature(npc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.KEY: {
				Key key = (Key)theEObject;
				T result = caseKey(key);
				if (result == null) result = caseItem(key);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.EVENT_ROOM: {
				EventRoom eventRoom = (EventRoom)theEObject;
				T result = caseEventRoom(eventRoom);
				if (result == null) result = caseRoom(eventRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.ROOM_EVENT: {
				RoomEvent roomEvent = (RoomEvent)theEObject;
				T result = caseRoomEvent(roomEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.TRAP: {
				Trap trap = (Trap)theEObject;
				T result = caseTrap(trap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.CREATURE: {
				Creature creature = (Creature)theEObject;
				T result = caseCreature(creature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.ENEMY: {
				Enemy enemy = (Enemy)theEObject;
				T result = caseEnemy(enemy);
				if (result == null) result = caseCreature(enemy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.DIALOG_CONTROLLER: {
				DialogController dialogController = (DialogController)theEObject;
				T result = caseDialogController(dialogController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.DIALOG_CHOICES: {
				DialogChoices dialogChoices = (DialogChoices)theEObject;
				T result = caseDialogChoices(dialogChoices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.DIALOG: {
				Dialog dialog = (Dialog)theEObject;
				T result = caseDialog(dialog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.DIALOG_SKILL_TEST: {
				DialogSkillTest dialogSkillTest = (DialogSkillTest)theEObject;
				T result = caseDialogSkillTest(dialogSkillTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.GOLD: {
				Gold gold = (Gold)theEObject;
				T result = caseGold(gold);
				if (result == null) result = caseItem(gold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.POTION: {
				Potion potion = (Potion)theEObject;
				T result = casePotion(potion);
				if (result == null) result = caseItem(potion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.WEAPON: {
				Weapon weapon = (Weapon)theEObject;
				T result = caseWeapon(weapon);
				if (result == null) result = caseItem(weapon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.ARMOR: {
				Armor armor = (Armor)theEObject;
				T result = caseArmor(armor);
				if (result == null) result = caseItem(armor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.FINAL_ROOM: {
				FinalRoom finalRoom = (FinalRoom)theEObject;
				T result = caseFinalRoom(finalRoom);
				if (result == null) result = caseEventRoom(finalRoom);
				if (result == null) result = caseRoom(finalRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.QUEST: {
				Quest quest = (Quest)theEObject;
				T result = caseQuest(quest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.ACCESSORY: {
				Accessory accessory = (Accessory)theEObject;
				T result = caseAccessory(accessory);
				if (result == null) result = caseItem(accessory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LeveleditorPackage.AURA: {
				Aura aura = (Aura)theEObject;
				T result = caseAura(aura);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNPC(NPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKey(Key object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventRoom(EventRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomEvent(RoomEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrap(Trap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreature(Creature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enemy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enemy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnemy(Enemy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogController(DialogController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Choices</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Choices</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogChoices(DialogChoices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialog(Dialog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog Skill Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog Skill Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogSkillTest(DialogSkillTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGold(Gold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Potion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Potion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePotion(Potion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weapon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weapon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeapon(Weapon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmor(Armor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalRoom(FinalRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuest(Quest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accessory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accessory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessory(Accessory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aura</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aura</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAura(Aura object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LeveleditorSwitch
