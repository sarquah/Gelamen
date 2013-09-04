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
 * A representation of the model object '<em><b>Weapon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.Weapon#getDamage <em>Damage</em>}</li>
 *   <li>{@link Leveleditor.Weapon#isIsTwohanded <em>Is Twohanded</em>}</li>
 *   <li>{@link Leveleditor.Weapon#getDamageLightning <em>Damage Lightning</em>}</li>
 *   <li>{@link Leveleditor.Weapon#getDamageFire <em>Damage Fire</em>}</li>
 *   <li>{@link Leveleditor.Weapon#getDamagePoison <em>Damage Poison</em>}</li>
 *   <li>{@link Leveleditor.Weapon#getDamageIce <em>Damage Ice</em>}</li>
 *   <li>{@link Leveleditor.Weapon#getClasses <em>Classes</em>}</li>
 *   <li>{@link Leveleditor.Weapon#getHp <em>Hp</em>}</li>
 *   <li>{@link Leveleditor.Weapon#getMana <em>Mana</em>}</li>
 *   <li>{@link Leveleditor.Weapon#getStrength <em>Strength</em>}</li>
 *   <li>{@link Leveleditor.Weapon#getAgility <em>Agility</em>}</li>
 *   <li>{@link Leveleditor.Weapon#getCharisma <em>Charisma</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getWeapon()
 * @model
 * @generated
 */
public interface Weapon extends Item {
	/**
	 * Returns the value of the '<em><b>Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage</em>' attribute.
	 * @see #setDamage(int)
	 * @see Leveleditor.LeveleditorPackage#getWeapon_Damage()
	 * @model
	 * @generated
	 */
	int getDamage();

	/**
	 * Sets the value of the '{@link Leveleditor.Weapon#getDamage <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage</em>' attribute.
	 * @see #getDamage()
	 * @generated
	 */
	void setDamage(int value);

	/**
	 * Returns the value of the '<em><b>Is Twohanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Twohanded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Twohanded</em>' attribute.
	 * @see #setIsTwohanded(boolean)
	 * @see Leveleditor.LeveleditorPackage#getWeapon_IsTwohanded()
	 * @model
	 * @generated
	 */
	boolean isIsTwohanded();

	/**
	 * Sets the value of the '{@link Leveleditor.Weapon#isIsTwohanded <em>Is Twohanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Twohanded</em>' attribute.
	 * @see #isIsTwohanded()
	 * @generated
	 */
	void setIsTwohanded(boolean value);

	/**
	 * Returns the value of the '<em><b>Damage Lightning</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage Lightning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage Lightning</em>' attribute.
	 * @see #setDamageLightning(int)
	 * @see Leveleditor.LeveleditorPackage#getWeapon_DamageLightning()
	 * @model default="0"
	 * @generated
	 */
	int getDamageLightning();

	/**
	 * Sets the value of the '{@link Leveleditor.Weapon#getDamageLightning <em>Damage Lightning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Lightning</em>' attribute.
	 * @see #getDamageLightning()
	 * @generated
	 */
	void setDamageLightning(int value);

	/**
	 * Returns the value of the '<em><b>Damage Fire</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage Fire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage Fire</em>' attribute.
	 * @see #setDamageFire(int)
	 * @see Leveleditor.LeveleditorPackage#getWeapon_DamageFire()
	 * @model default="0"
	 * @generated
	 */
	int getDamageFire();

	/**
	 * Sets the value of the '{@link Leveleditor.Weapon#getDamageFire <em>Damage Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Fire</em>' attribute.
	 * @see #getDamageFire()
	 * @generated
	 */
	void setDamageFire(int value);

	/**
	 * Returns the value of the '<em><b>Damage Poison</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage Poison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage Poison</em>' attribute.
	 * @see #setDamagePoison(int)
	 * @see Leveleditor.LeveleditorPackage#getWeapon_DamagePoison()
	 * @model default="0"
	 * @generated
	 */
	int getDamagePoison();

	/**
	 * Sets the value of the '{@link Leveleditor.Weapon#getDamagePoison <em>Damage Poison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Poison</em>' attribute.
	 * @see #getDamagePoison()
	 * @generated
	 */
	void setDamagePoison(int value);

	/**
	 * Returns the value of the '<em><b>Damage Ice</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage Ice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage Ice</em>' attribute.
	 * @see #setDamageIce(int)
	 * @see Leveleditor.LeveleditorPackage#getWeapon_DamageIce()
	 * @model default="0"
	 * @generated
	 */
	int getDamageIce();

	/**
	 * Sets the value of the '{@link Leveleditor.Weapon#getDamageIce <em>Damage Ice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Ice</em>' attribute.
	 * @see #getDamageIce()
	 * @generated
	 */
	void setDamageIce(int value);

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
	 * @see Leveleditor.LeveleditorPackage#getWeapon_Classes()
	 * @model default="" required="true"
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
	 * @see Leveleditor.LeveleditorPackage#getWeapon_Hp()
	 * @model
	 * @generated
	 */
	int getHp();

	/**
	 * Sets the value of the '{@link Leveleditor.Weapon#getHp <em>Hp</em>}' attribute.
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
	 * @see Leveleditor.LeveleditorPackage#getWeapon_Mana()
	 * @model
	 * @generated
	 */
	int getMana();

	/**
	 * Sets the value of the '{@link Leveleditor.Weapon#getMana <em>Mana</em>}' attribute.
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
	 * @see Leveleditor.LeveleditorPackage#getWeapon_Strength()
	 * @model
	 * @generated
	 */
	int getStrength();

	/**
	 * Sets the value of the '{@link Leveleditor.Weapon#getStrength <em>Strength</em>}' attribute.
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
	 * @see Leveleditor.LeveleditorPackage#getWeapon_Agility()
	 * @model
	 * @generated
	 */
	int getAgility();

	/**
	 * Sets the value of the '{@link Leveleditor.Weapon#getAgility <em>Agility</em>}' attribute.
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
	 * @see Leveleditor.LeveleditorPackage#getWeapon_Charisma()
	 * @model
	 * @generated
	 */
	int getCharisma();

	/**
	 * Sets the value of the '{@link Leveleditor.Weapon#getCharisma <em>Charisma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charisma</em>' attribute.
	 * @see #getCharisma()
	 * @generated
	 */
	void setCharisma(int value);

} // Weapon
