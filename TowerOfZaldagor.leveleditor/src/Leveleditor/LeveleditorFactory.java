/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Leveleditor.LeveleditorPackage
 * @generated
 */
public interface LeveleditorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LeveleditorFactory eINSTANCE = Leveleditor.impl.LeveleditorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Act</em>'.
	 * @generated
	 */
	Act createAct();

	/**
	 * Returns a new object of class '<em>NPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NPC</em>'.
	 * @generated
	 */
	NPC createNPC();

	/**
	 * Returns a new object of class '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key</em>'.
	 * @generated
	 */
	Key createKey();

	/**
	 * Returns a new object of class '<em>Event Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Room</em>'.
	 * @generated
	 */
	EventRoom createEventRoom();

	/**
	 * Returns a new object of class '<em>Room Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Event</em>'.
	 * @generated
	 */
	RoomEvent createRoomEvent();

	/**
	 * Returns a new object of class '<em>Trap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trap</em>'.
	 * @generated
	 */
	Trap createTrap();

	/**
	 * Returns a new object of class '<em>Enemy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enemy</em>'.
	 * @generated
	 */
	Enemy createEnemy();

	/**
	 * Returns a new object of class '<em>Dialog Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Controller</em>'.
	 * @generated
	 */
	DialogController createDialogController();

	/**
	 * Returns a new object of class '<em>Dialog Choices</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Choices</em>'.
	 * @generated
	 */
	DialogChoices createDialogChoices();

	/**
	 * Returns a new object of class '<em>Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog</em>'.
	 * @generated
	 */
	Dialog createDialog();

	/**
	 * Returns a new object of class '<em>Dialog Skill Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Skill Test</em>'.
	 * @generated
	 */
	DialogSkillTest createDialogSkillTest();

	/**
	 * Returns a new object of class '<em>Gold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gold</em>'.
	 * @generated
	 */
	Gold createGold();

	/**
	 * Returns a new object of class '<em>Potion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Potion</em>'.
	 * @generated
	 */
	Potion createPotion();

	/**
	 * Returns a new object of class '<em>Weapon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weapon</em>'.
	 * @generated
	 */
	Weapon createWeapon();

	/**
	 * Returns a new object of class '<em>Armor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armor</em>'.
	 * @generated
	 */
	Armor createArmor();

	/**
	 * Returns a new object of class '<em>Final Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final Room</em>'.
	 * @generated
	 */
	FinalRoom createFinalRoom();

	/**
	 * Returns a new object of class '<em>Quest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quest</em>'.
	 * @generated
	 */
	Quest createQuest();

	/**
	 * Returns a new object of class '<em>Accessory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accessory</em>'.
	 * @generated
	 */
	Accessory createAccessory();

	/**
	 * Returns a new object of class '<em>Aura</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aura</em>'.
	 * @generated
	 */
	Aura createAura();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LeveleditorPackage getLeveleditorPackage();

} //LeveleditorFactory
