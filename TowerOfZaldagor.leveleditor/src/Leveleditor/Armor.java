/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Armor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.Armor#getArmor <em>Armor</em>}</li>
 *   <li>{@link Leveleditor.Armor#getArmorType <em>Armor Type</em>}</li>
 *   <li>{@link Leveleditor.Armor#getResistLightning <em>Resist Lightning</em>}</li>
 *   <li>{@link Leveleditor.Armor#getResistIce <em>Resist Ice</em>}</li>
 *   <li>{@link Leveleditor.Armor#getResistFire <em>Resist Fire</em>}</li>
 *   <li>{@link Leveleditor.Armor#getResistPoison <em>Resist Poison</em>}</li>
 *   <li>{@link Leveleditor.Armor#getClasses <em>Classes</em>}</li>
 *   <li>{@link Leveleditor.Armor#getHp <em>Hp</em>}</li>
 *   <li>{@link Leveleditor.Armor#getMana <em>Mana</em>}</li>
 *   <li>{@link Leveleditor.Armor#getStrength <em>Strength</em>}</li>
 *   <li>{@link Leveleditor.Armor#getAgility <em>Agility</em>}</li>
 *   <li>{@link Leveleditor.Armor#getCharisma <em>Charisma</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getArmor()
 * @model
 * @generated
 */
public interface Armor extends Item {
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
	 * @see Leveleditor.LeveleditorPackage#getArmor_Armor()
	 * @model
	 * @generated
	 */
	int getArmor();

	/**
	 * Sets the value of the '{@link Leveleditor.Armor#getArmor <em>Armor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armor</em>' attribute.
	 * @see #getArmor()
	 * @generated
	 */
	void setArmor(int value);

	/**
	 * Returns the value of the '<em><b>Armor Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Leveleditor.EArmorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Armor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armor Type</em>' attribute.
	 * @see Leveleditor.EArmorType
	 * @see #setArmorType(EArmorType)
	 * @see Leveleditor.LeveleditorPackage#getArmor_ArmorType()
	 * @model
	 * @generated
	 */
	EArmorType getArmorType();

	/**
	 * Sets the value of the '{@link Leveleditor.Armor#getArmorType <em>Armor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armor Type</em>' attribute.
	 * @see Leveleditor.EArmorType
	 * @see #getArmorType()
	 * @generated
	 */
	void setArmorType(EArmorType value);

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
	 * @see Leveleditor.LeveleditorPackage#getArmor_ResistLightning()
	 * @model default="0"
	 * @generated
	 */
	int getResistLightning();

	/**
	 * Sets the value of the '{@link Leveleditor.Armor#getResistLightning <em>Resist Lightning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resist Lightning</em>' attribute.
	 * @see #getResistLightning()
	 * @generated
	 */
	void setResistLightning(int value);

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
	 * @see Leveleditor.LeveleditorPackage#getArmor_ResistIce()
	 * @model default="0"
	 * @generated
	 */
	int getResistIce();

	/**
	 * Sets the value of the '{@link Leveleditor.Armor#getResistIce <em>Resist Ice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resist Ice</em>' attribute.
	 * @see #getResistIce()
	 * @generated
	 */
	void setResistIce(int value);

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
	 * @see Leveleditor.LeveleditorPackage#getArmor_ResistFire()
	 * @model default="0"
	 * @generated
	 */
	int getResistFire();

	/**
	 * Sets the value of the '{@link Leveleditor.Armor#getResistFire <em>Resist Fire</em>}' attribute.
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
	 * @see Leveleditor.LeveleditorPackage#getArmor_ResistPoison()
	 * @model default="0"
	 * @generated
	 */
	int getResistPoison();

	/**
	 * Sets the value of the '{@link Leveleditor.Armor#getResistPoison <em>Resist Poison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resist Poison</em>' attribute.
	 * @see #getResistPoison()
	 * @generated
	 */
	void setResistPoison(int value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' attribute list.
	 * The list contents are of type {@link Leveleditor.ECreatureClass}.
	 * The literals are from the enumeration {@link Leveleditor.ECreatureClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' attribute list.
	 * @see Leveleditor.ECreatureClass
	 * @see Leveleditor.LeveleditorPackage#getArmor_Classes()
	 * @model required="true"
	 * @generated
	 */
	EList<ECreatureClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hp</em>' attribute.
	 * @see #setHp(int)
	 * @see Leveleditor.LeveleditorPackage#getArmor_Hp()
	 * @model
	 * @generated
	 */
	int getHp();

	/**
	 * Sets the value of the '{@link Leveleditor.Armor#getHp <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hp</em>' attribute.
	 * @see #getHp()
	 * @generated
	 */
	void setHp(int value);

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
	 * @see Leveleditor.LeveleditorPackage#getArmor_Mana()
	 * @model
	 * @generated
	 */
	int getMana();

	/**
	 * Sets the value of the '{@link Leveleditor.Armor#getMana <em>Mana</em>}' attribute.
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
	 * @see Leveleditor.LeveleditorPackage#getArmor_Strength()
	 * @model
	 * @generated
	 */
	int getStrength();

	/**
	 * Sets the value of the '{@link Leveleditor.Armor#getStrength <em>Strength</em>}' attribute.
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
	 * @see Leveleditor.LeveleditorPackage#getArmor_Agility()
	 * @model
	 * @generated
	 */
	int getAgility();

	/**
	 * Sets the value of the '{@link Leveleditor.Armor#getAgility <em>Agility</em>}' attribute.
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
	 * @see Leveleditor.LeveleditorPackage#getArmor_Charisma()
	 * @model
	 * @generated
	 */
	int getCharisma();

	/**
	 * Sets the value of the '{@link Leveleditor.Armor#getCharisma <em>Charisma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charisma</em>' attribute.
	 * @see #getCharisma()
	 * @generated
	 */
	void setCharisma(int value);

} // Armor
