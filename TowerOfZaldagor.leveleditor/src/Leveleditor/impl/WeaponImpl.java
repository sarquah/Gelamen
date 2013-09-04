/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import Leveleditor.ECreatureClass;
import Leveleditor.LeveleditorPackage;
import Leveleditor.Weapon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weapon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.WeaponImpl#getDamage <em>Damage</em>}</li>
 *   <li>{@link Leveleditor.impl.WeaponImpl#isIsTwohanded <em>Is Twohanded</em>}</li>
 *   <li>{@link Leveleditor.impl.WeaponImpl#getDamageLightning <em>Damage Lightning</em>}</li>
 *   <li>{@link Leveleditor.impl.WeaponImpl#getDamageFire <em>Damage Fire</em>}</li>
 *   <li>{@link Leveleditor.impl.WeaponImpl#getDamagePoison <em>Damage Poison</em>}</li>
 *   <li>{@link Leveleditor.impl.WeaponImpl#getDamageIce <em>Damage Ice</em>}</li>
 *   <li>{@link Leveleditor.impl.WeaponImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link Leveleditor.impl.WeaponImpl#getHp <em>Hp</em>}</li>
 *   <li>{@link Leveleditor.impl.WeaponImpl#getMana <em>Mana</em>}</li>
 *   <li>{@link Leveleditor.impl.WeaponImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link Leveleditor.impl.WeaponImpl#getAgility <em>Agility</em>}</li>
 *   <li>{@link Leveleditor.impl.WeaponImpl#getCharisma <em>Charisma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeaponImpl extends ItemImpl implements Weapon {
	/**
	 * The default value of the '{@link #getDamage() <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamage()
	 * @generated
	 * @ordered
	 */
	protected static final int DAMAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDamage() <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamage()
	 * @generated
	 * @ordered
	 */
	protected int damage = DAMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTwohanded() <em>Is Twohanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTwohanded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TWOHANDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTwohanded() <em>Is Twohanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTwohanded()
	 * @generated
	 * @ordered
	 */
	protected boolean isTwohanded = IS_TWOHANDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDamageLightning() <em>Damage Lightning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageLightning()
	 * @generated
	 * @ordered
	 */
	protected static final int DAMAGE_LIGHTNING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDamageLightning() <em>Damage Lightning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageLightning()
	 * @generated
	 * @ordered
	 */
	protected int damageLightning = DAMAGE_LIGHTNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDamageFire() <em>Damage Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageFire()
	 * @generated
	 * @ordered
	 */
	protected static final int DAMAGE_FIRE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDamageFire() <em>Damage Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageFire()
	 * @generated
	 * @ordered
	 */
	protected int damageFire = DAMAGE_FIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDamagePoison() <em>Damage Poison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamagePoison()
	 * @generated
	 * @ordered
	 */
	protected static final int DAMAGE_POISON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDamagePoison() <em>Damage Poison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamagePoison()
	 * @generated
	 * @ordered
	 */
	protected int damagePoison = DAMAGE_POISON_EDEFAULT;

	/**
	 * The default value of the '{@link #getDamageIce() <em>Damage Ice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageIce()
	 * @generated
	 * @ordered
	 */
	protected static final int DAMAGE_ICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDamageIce() <em>Damage Ice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageIce()
	 * @generated
	 * @ordered
	 */
	protected int damageIce = DAMAGE_ICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ECreatureClass> classes;

	/**
	 * The default value of the '{@link #getHp() <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHp()
	 * @generated
	 * @ordered
	 */
	protected static final int HP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHp() <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHp()
	 * @generated
	 * @ordered
	 */
	protected int hp = HP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMana() <em>Mana</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMana()
	 * @generated
	 * @ordered
	 */
	protected static final int MANA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMana() <em>Mana</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMana()
	 * @generated
	 * @ordered
	 */
	protected int mana = MANA_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected static final int STRENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected int strength = STRENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgility() <em>Agility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgility()
	 * @generated
	 * @ordered
	 */
	protected static final int AGILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAgility() <em>Agility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgility()
	 * @generated
	 * @ordered
	 */
	protected int agility = AGILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharisma() <em>Charisma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharisma()
	 * @generated
	 * @ordered
	 */
	protected static final int CHARISMA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCharisma() <em>Charisma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharisma()
	 * @generated
	 * @ordered
	 */
	protected int charisma = CHARISMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeaponImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.WEAPON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamage(int newDamage) {
		int oldDamage = damage;
		damage = newDamage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.WEAPON__DAMAGE, oldDamage, damage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTwohanded() {
		return isTwohanded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTwohanded(boolean newIsTwohanded) {
		boolean oldIsTwohanded = isTwohanded;
		isTwohanded = newIsTwohanded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.WEAPON__IS_TWOHANDED, oldIsTwohanded, isTwohanded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDamageLightning() {
		return damageLightning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamageLightning(int newDamageLightning) {
		int oldDamageLightning = damageLightning;
		damageLightning = newDamageLightning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.WEAPON__DAMAGE_LIGHTNING, oldDamageLightning, damageLightning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDamageFire() {
		return damageFire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamageFire(int newDamageFire) {
		int oldDamageFire = damageFire;
		damageFire = newDamageFire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.WEAPON__DAMAGE_FIRE, oldDamageFire, damageFire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDamagePoison() {
		return damagePoison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamagePoison(int newDamagePoison) {
		int oldDamagePoison = damagePoison;
		damagePoison = newDamagePoison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.WEAPON__DAMAGE_POISON, oldDamagePoison, damagePoison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDamageIce() {
		return damageIce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamageIce(int newDamageIce) {
		int oldDamageIce = damageIce;
		damageIce = newDamageIce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.WEAPON__DAMAGE_ICE, oldDamageIce, damageIce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECreatureClass> getClasses() {
		if (classes == null) {
			classes = new EDataTypeUniqueEList<ECreatureClass>(ECreatureClass.class, this, LeveleditorPackage.WEAPON__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHp(int newHp) {
		int oldHp = hp;
		hp = newHp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.WEAPON__HP, oldHp, hp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMana() {
		return mana;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMana(int newMana) {
		int oldMana = mana;
		mana = newMana;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.WEAPON__MANA, oldMana, mana));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(int newStrength) {
		int oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.WEAPON__STRENGTH, oldStrength, strength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAgility() {
		return agility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgility(int newAgility) {
		int oldAgility = agility;
		agility = newAgility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.WEAPON__AGILITY, oldAgility, agility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCharisma() {
		return charisma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharisma(int newCharisma) {
		int oldCharisma = charisma;
		charisma = newCharisma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.WEAPON__CHARISMA, oldCharisma, charisma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeveleditorPackage.WEAPON__DAMAGE:
				return getDamage();
			case LeveleditorPackage.WEAPON__IS_TWOHANDED:
				return isIsTwohanded();
			case LeveleditorPackage.WEAPON__DAMAGE_LIGHTNING:
				return getDamageLightning();
			case LeveleditorPackage.WEAPON__DAMAGE_FIRE:
				return getDamageFire();
			case LeveleditorPackage.WEAPON__DAMAGE_POISON:
				return getDamagePoison();
			case LeveleditorPackage.WEAPON__DAMAGE_ICE:
				return getDamageIce();
			case LeveleditorPackage.WEAPON__CLASSES:
				return getClasses();
			case LeveleditorPackage.WEAPON__HP:
				return getHp();
			case LeveleditorPackage.WEAPON__MANA:
				return getMana();
			case LeveleditorPackage.WEAPON__STRENGTH:
				return getStrength();
			case LeveleditorPackage.WEAPON__AGILITY:
				return getAgility();
			case LeveleditorPackage.WEAPON__CHARISMA:
				return getCharisma();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LeveleditorPackage.WEAPON__DAMAGE:
				setDamage((Integer)newValue);
				return;
			case LeveleditorPackage.WEAPON__IS_TWOHANDED:
				setIsTwohanded((Boolean)newValue);
				return;
			case LeveleditorPackage.WEAPON__DAMAGE_LIGHTNING:
				setDamageLightning((Integer)newValue);
				return;
			case LeveleditorPackage.WEAPON__DAMAGE_FIRE:
				setDamageFire((Integer)newValue);
				return;
			case LeveleditorPackage.WEAPON__DAMAGE_POISON:
				setDamagePoison((Integer)newValue);
				return;
			case LeveleditorPackage.WEAPON__DAMAGE_ICE:
				setDamageIce((Integer)newValue);
				return;
			case LeveleditorPackage.WEAPON__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ECreatureClass>)newValue);
				return;
			case LeveleditorPackage.WEAPON__HP:
				setHp((Integer)newValue);
				return;
			case LeveleditorPackage.WEAPON__MANA:
				setMana((Integer)newValue);
				return;
			case LeveleditorPackage.WEAPON__STRENGTH:
				setStrength((Integer)newValue);
				return;
			case LeveleditorPackage.WEAPON__AGILITY:
				setAgility((Integer)newValue);
				return;
			case LeveleditorPackage.WEAPON__CHARISMA:
				setCharisma((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LeveleditorPackage.WEAPON__DAMAGE:
				setDamage(DAMAGE_EDEFAULT);
				return;
			case LeveleditorPackage.WEAPON__IS_TWOHANDED:
				setIsTwohanded(IS_TWOHANDED_EDEFAULT);
				return;
			case LeveleditorPackage.WEAPON__DAMAGE_LIGHTNING:
				setDamageLightning(DAMAGE_LIGHTNING_EDEFAULT);
				return;
			case LeveleditorPackage.WEAPON__DAMAGE_FIRE:
				setDamageFire(DAMAGE_FIRE_EDEFAULT);
				return;
			case LeveleditorPackage.WEAPON__DAMAGE_POISON:
				setDamagePoison(DAMAGE_POISON_EDEFAULT);
				return;
			case LeveleditorPackage.WEAPON__DAMAGE_ICE:
				setDamageIce(DAMAGE_ICE_EDEFAULT);
				return;
			case LeveleditorPackage.WEAPON__CLASSES:
				getClasses().clear();
				return;
			case LeveleditorPackage.WEAPON__HP:
				setHp(HP_EDEFAULT);
				return;
			case LeveleditorPackage.WEAPON__MANA:
				setMana(MANA_EDEFAULT);
				return;
			case LeveleditorPackage.WEAPON__STRENGTH:
				setStrength(STRENGTH_EDEFAULT);
				return;
			case LeveleditorPackage.WEAPON__AGILITY:
				setAgility(AGILITY_EDEFAULT);
				return;
			case LeveleditorPackage.WEAPON__CHARISMA:
				setCharisma(CHARISMA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LeveleditorPackage.WEAPON__DAMAGE:
				return damage != DAMAGE_EDEFAULT;
			case LeveleditorPackage.WEAPON__IS_TWOHANDED:
				return isTwohanded != IS_TWOHANDED_EDEFAULT;
			case LeveleditorPackage.WEAPON__DAMAGE_LIGHTNING:
				return damageLightning != DAMAGE_LIGHTNING_EDEFAULT;
			case LeveleditorPackage.WEAPON__DAMAGE_FIRE:
				return damageFire != DAMAGE_FIRE_EDEFAULT;
			case LeveleditorPackage.WEAPON__DAMAGE_POISON:
				return damagePoison != DAMAGE_POISON_EDEFAULT;
			case LeveleditorPackage.WEAPON__DAMAGE_ICE:
				return damageIce != DAMAGE_ICE_EDEFAULT;
			case LeveleditorPackage.WEAPON__CLASSES:
				return classes != null && !classes.isEmpty();
			case LeveleditorPackage.WEAPON__HP:
				return hp != HP_EDEFAULT;
			case LeveleditorPackage.WEAPON__MANA:
				return mana != MANA_EDEFAULT;
			case LeveleditorPackage.WEAPON__STRENGTH:
				return strength != STRENGTH_EDEFAULT;
			case LeveleditorPackage.WEAPON__AGILITY:
				return agility != AGILITY_EDEFAULT;
			case LeveleditorPackage.WEAPON__CHARISMA:
				return charisma != CHARISMA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (damage: ");
		result.append(damage);
		result.append(", isTwohanded: ");
		result.append(isTwohanded);
		result.append(", damageLightning: ");
		result.append(damageLightning);
		result.append(", damageFire: ");
		result.append(damageFire);
		result.append(", damagePoison: ");
		result.append(damagePoison);
		result.append(", damageIce: ");
		result.append(damageIce);
		result.append(", classes: ");
		result.append(classes);
		result.append(", hp: ");
		result.append(hp);
		result.append(", mana: ");
		result.append(mana);
		result.append(", strength: ");
		result.append(strength);
		result.append(", agility: ");
		result.append(agility);
		result.append(", charisma: ");
		result.append(charisma);
		result.append(')');
		return result.toString();
	}

} //WeaponImpl
