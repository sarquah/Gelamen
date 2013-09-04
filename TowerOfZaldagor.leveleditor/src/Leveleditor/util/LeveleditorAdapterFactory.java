/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.util;

import Leveleditor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Leveleditor.LeveleditorPackage
 * @generated
 */
public class LeveleditorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LeveleditorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeveleditorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LeveleditorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeveleditorSwitch<Adapter> modelSwitch =
		new LeveleditorSwitch<Adapter>() {
			@Override
			public Adapter caseAct(Act object) {
				return createActAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseNPC(NPC object) {
				return createNPCAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseKey(Key object) {
				return createKeyAdapter();
			}
			@Override
			public Adapter caseEventRoom(EventRoom object) {
				return createEventRoomAdapter();
			}
			@Override
			public Adapter caseRoomEvent(RoomEvent object) {
				return createRoomEventAdapter();
			}
			@Override
			public Adapter caseTrap(Trap object) {
				return createTrapAdapter();
			}
			@Override
			public Adapter caseCreature(Creature object) {
				return createCreatureAdapter();
			}
			@Override
			public Adapter caseEnemy(Enemy object) {
				return createEnemyAdapter();
			}
			@Override
			public Adapter caseDialogController(DialogController object) {
				return createDialogControllerAdapter();
			}
			@Override
			public Adapter caseDialogChoices(DialogChoices object) {
				return createDialogChoicesAdapter();
			}
			@Override
			public Adapter caseDialog(Dialog object) {
				return createDialogAdapter();
			}
			@Override
			public Adapter caseDialogSkillTest(DialogSkillTest object) {
				return createDialogSkillTestAdapter();
			}
			@Override
			public Adapter caseGold(Gold object) {
				return createGoldAdapter();
			}
			@Override
			public Adapter casePotion(Potion object) {
				return createPotionAdapter();
			}
			@Override
			public Adapter caseWeapon(Weapon object) {
				return createWeaponAdapter();
			}
			@Override
			public Adapter caseArmor(Armor object) {
				return createArmorAdapter();
			}
			@Override
			public Adapter caseFinalRoom(FinalRoom object) {
				return createFinalRoomAdapter();
			}
			@Override
			public Adapter caseQuest(Quest object) {
				return createQuestAdapter();
			}
			@Override
			public Adapter caseAccessory(Accessory object) {
				return createAccessoryAdapter();
			}
			@Override
			public Adapter caseAura(Aura object) {
				return createAuraAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.NPC <em>NPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.NPC
	 * @generated
	 */
	public Adapter createNPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Key
	 * @generated
	 */
	public Adapter createKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.EventRoom <em>Event Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.EventRoom
	 * @generated
	 */
	public Adapter createEventRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.RoomEvent <em>Room Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.RoomEvent
	 * @generated
	 */
	public Adapter createRoomEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Trap <em>Trap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Trap
	 * @generated
	 */
	public Adapter createTrapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Creature <em>Creature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Creature
	 * @generated
	 */
	public Adapter createCreatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Enemy <em>Enemy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Enemy
	 * @generated
	 */
	public Adapter createEnemyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.DialogController <em>Dialog Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.DialogController
	 * @generated
	 */
	public Adapter createDialogControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.DialogChoices <em>Dialog Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.DialogChoices
	 * @generated
	 */
	public Adapter createDialogChoicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Dialog <em>Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Dialog
	 * @generated
	 */
	public Adapter createDialogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.DialogSkillTest <em>Dialog Skill Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.DialogSkillTest
	 * @generated
	 */
	public Adapter createDialogSkillTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Gold <em>Gold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Gold
	 * @generated
	 */
	public Adapter createGoldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Potion <em>Potion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Potion
	 * @generated
	 */
	public Adapter createPotionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Weapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Weapon
	 * @generated
	 */
	public Adapter createWeaponAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Armor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Armor
	 * @generated
	 */
	public Adapter createArmorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.FinalRoom <em>Final Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.FinalRoom
	 * @generated
	 */
	public Adapter createFinalRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Quest <em>Quest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Quest
	 * @generated
	 */
	public Adapter createQuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Accessory <em>Accessory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Accessory
	 * @generated
	 */
	public Adapter createAccessoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Leveleditor.Aura <em>Aura</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Leveleditor.Aura
	 * @generated
	 */
	public Adapter createAuraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LeveleditorAdapterFactory
