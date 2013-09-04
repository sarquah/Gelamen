/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.Creature#getName <em>Name</em>}</li>
 *   <li>{@link Leveleditor.Creature#getInitHp <em>Init Hp</em>}</li>
 *   <li>{@link Leveleditor.Creature#getInitMana <em>Init Mana</em>}</li>
 *   <li>{@link Leveleditor.Creature#getMana <em>Mana</em>}</li>
 *   <li>{@link Leveleditor.Creature#getStrength <em>Strength</em>}</li>
 *   <li>{@link Leveleditor.Creature#getAgility <em>Agility</em>}</li>
 *   <li>{@link Leveleditor.Creature#getCharisma <em>Charisma</em>}</li>
 *   <li>{@link Leveleditor.Creature#getLevel <em>Level</em>}</li>
 *   <li>{@link Leveleditor.Creature#getInventory <em>Inventory</em>}</li>
 *   <li>{@link Leveleditor.Creature#getExperience <em>Experience</em>}</li>
 *   <li>{@link Leveleditor.Creature#getGold <em>Gold</em>}</li>
 *   <li>{@link Leveleditor.Creature#getInitPlayerActions <em>Init Player Actions</em>}</li>
 *   <li>{@link Leveleditor.Creature#getResistLightning <em>Resist Lightning</em>}</li>
 *   <li>{@link Leveleditor.Creature#getResistFire <em>Resist Fire</em>}</li>
 *   <li>{@link Leveleditor.Creature#getResistPoison <em>Resist Poison</em>}</li>
 *   <li>{@link Leveleditor.Creature#getResistIce <em>Resist Ice</em>}</li>
 *   <li>{@link Leveleditor.Creature#isIsMale <em>Is Male</em>}</li>
 *   <li>{@link Leveleditor.Creature#getRace <em>Race</em>}</li>
 *   <li>{@link Leveleditor.Creature#getCreatureClass <em>Creature Class</em>}</li>
 *   <li>{@link Leveleditor.Creature#getArmor <em>Armor</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getCreature()
 * @model abstract="true"
 * @generated
 */
public interface Creature extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Leveleditor.LeveleditorPackage#getCreature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Init Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Hp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Hp</em>' attribute.
	 * @see #setInitHp(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_InitHp()
	 * @model
	 * @generated
	 */
	int getInitHp();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getInitHp <em>Init Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Hp</em>' attribute.
	 * @see #getInitHp()
	 * @generated
	 */
	void setInitHp(int value);

	/**
	 * Returns the value of the '<em><b>Init Mana</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Mana</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Mana</em>' attribute.
	 * @see #setInitMana(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_InitMana()
	 * @model
	 * @generated
	 */
	int getInitMana();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getInitMana <em>Init Mana</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Mana</em>' attribute.
	 * @see #getInitMana()
	 * @generated
	 */
	void setInitMana(int value);

	/**
	 * Returns the value of the '<em><b>Mana</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mana</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mana</em>' attribute.
	 * @see #setMana(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_Mana()
	 * @model
	 * @generated
	 */
	int getMana();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getMana <em>Mana</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mana</em>' attribute.
	 * @see #getMana()
	 * @generated
	 */
	void setMana(int value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' attribute.
	 * @see #setStrength(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_Strength()
	 * @model
	 * @generated
	 */
	int getStrength();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getStrength <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' attribute.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(int value);

	/**
	 * Returns the value of the '<em><b>Agility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agility</em>' attribute.
	 * @see #setAgility(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_Agility()
	 * @model
	 * @generated
	 */
	int getAgility();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getAgility <em>Agility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agility</em>' attribute.
	 * @see #getAgility()
	 * @generated
	 */
	void setAgility(int value);

	/**
	 * Returns the value of the '<em><b>Charisma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charisma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charisma</em>' attribute.
	 * @see #setCharisma(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_Charisma()
	 * @model
	 * @generated
	 */
	int getCharisma();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getCharisma <em>Charisma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charisma</em>' attribute.
	 * @see #getCharisma()
	 * @generated
	 */
	void setCharisma(int value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' containment reference list.
	 * The list contents are of type {@link Leveleditor.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory</em>' containment reference list.
	 * @see Leveleditor.LeveleditorPackage#getCreature_Inventory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getInventory();

	/**
	 * Returns the value of the '<em><b>Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experience</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experience</em>' attribute.
	 * @see #setExperience(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_Experience()
	 * @model
	 * @generated
	 */
	int getExperience();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getExperience <em>Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experience</em>' attribute.
	 * @see #getExperience()
	 * @generated
	 */
	void setExperience(int value);

	/**
	 * Returns the value of the '<em><b>Gold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gold</em>' attribute.
	 * @see #setGold(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_Gold()
	 * @model
	 * @generated
	 */
	int getGold();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getGold <em>Gold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gold</em>' attribute.
	 * @see #getGold()
	 * @generated
	 */
	void setGold(int value);

	/**
	 * Returns the value of the '<em><b>Init Player Actions</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Player Actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Player Actions</em>' attribute.
	 * @see #setInitPlayerActions(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_InitPlayerActions()
	 * @model default="1"
	 * @generated
	 */
	int getInitPlayerActions();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getInitPlayerActions <em>Init Player Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Player Actions</em>' attribute.
	 * @see #getInitPlayerActions()
	 * @generated
	 */
	void setInitPlayerActions(int value);

	/**
	 * Returns the value of the '<em><b>Resist Lightning</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resist Lightning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resist Lightning</em>' attribute.
	 * @see #setResistLightning(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_ResistLightning()
	 * @model default="0"
	 * @generated
	 */
	int getResistLightning();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getResistLightning <em>Resist Lightning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resist Lightning</em>' attribute.
	 * @see #getResistLightning()
	 * @generated
	 */
	void setResistLightning(int value);

	/**
	 * Returns the value of the '<em><b>Resist Fire</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resist Fire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resist Fire</em>' attribute.
	 * @see #setResistFire(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_ResistFire()
	 * @model default="0"
	 * @generated
	 */
	int getResistFire();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getResistFire <em>Resist Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resist Fire</em>' attribute.
	 * @see #getResistFire()
	 * @generated
	 */
	void setResistFire(int value);

	/**
	 * Returns the value of the '<em><b>Resist Poison</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resist Poison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resist Poison</em>' attribute.
	 * @see #setResistPoison(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_ResistPoison()
	 * @model default="0"
	 * @generated
	 */
	int getResistPoison();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getResistPoison <em>Resist Poison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resist Poison</em>' attribute.
	 * @see #getResistPoison()
	 * @generated
	 */
	void setResistPoison(int value);

	/**
	 * Returns the value of the '<em><b>Resist Ice</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resist Ice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resist Ice</em>' attribute.
	 * @see #setResistIce(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_ResistIce()
	 * @model default="0"
	 * @generated
	 */
	int getResistIce();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getResistIce <em>Resist Ice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resist Ice</em>' attribute.
	 * @see #getResistIce()
	 * @generated
	 */
	void setResistIce(int value);

	/**
	 * Returns the value of the '<em><b>Is Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Male</em>' attribute.
	 * @see #setIsMale(boolean)
	 * @see Leveleditor.LeveleditorPackage#getCreature_IsMale()
	 * @model
	 * @generated
	 */
	boolean isIsMale();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#isIsMale <em>Is Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Male</em>' attribute.
	 * @see #isIsMale()
	 * @generated
	 */
	void setIsMale(boolean value);

	/**
	 * Returns the value of the '<em><b>Race</b></em>' attribute.
	 * The literals are from the enumeration {@link Leveleditor.ECreatureRace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Race</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Race</em>' attribute.
	 * @see Leveleditor.ECreatureRace
	 * @see #setRace(ECreatureRace)
	 * @see Leveleditor.LeveleditorPackage#getCreature_Race()
	 * @model
	 * @generated
	 */
	ECreatureRace getRace();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getRace <em>Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Race</em>' attribute.
	 * @see Leveleditor.ECreatureRace
	 * @see #getRace()
	 * @generated
	 */
	void setRace(ECreatureRace value);

	/**
	 * Returns the value of the '<em><b>Creature Class</b></em>' attribute.
	 * The literals are from the enumeration {@link Leveleditor.ECreatureClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creature Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creature Class</em>' attribute.
	 * @see Leveleditor.ECreatureClass
	 * @see #setCreatureClass(ECreatureClass)
	 * @see Leveleditor.LeveleditorPackage#getCreature_CreatureClass()
	 * @model
	 * @generated
	 */
	ECreatureClass getCreatureClass();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getCreatureClass <em>Creature Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creature Class</em>' attribute.
	 * @see Leveleditor.ECreatureClass
	 * @see #getCreatureClass()
	 * @generated
	 */
	void setCreatureClass(ECreatureClass value);

	/**
	 * Returns the value of the '<em><b>Armor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Armor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armor</em>' attribute.
	 * @see #setArmor(int)
	 * @see Leveleditor.LeveleditorPackage#getCreature_Armor()
	 * @model
	 * @generated
	 */
	int getArmor();

	/**
	 * Sets the value of the '{@link Leveleditor.Creature#getArmor <em>Armor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armor</em>' attribute.
	 * @see #getArmor()
	 * @generated
	 */
	void setArmor(int value);

} // Creature
