/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import Leveleditor.Armor;
import Leveleditor.EArmorType;
import Leveleditor.ECreatureClass;
import Leveleditor.LeveleditorPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Armor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.ArmorImpl#getArmor <em>Armor</em>}</li>
 *   <li>{@link Leveleditor.impl.ArmorImpl#getArmorType <em>Armor Type</em>}</li>
 *   <li>{@link Leveleditor.impl.ArmorImpl#getResistLightning <em>Resist Lightning</em>}</li>
 *   <li>{@link Leveleditor.impl.ArmorImpl#getResistIce <em>Resist Ice</em>}</li>
 *   <li>{@link Leveleditor.impl.ArmorImpl#getResistFire <em>Resist Fire</em>}</li>
 *   <li>{@link Leveleditor.impl.ArmorImpl#getResistPoison <em>Resist Poison</em>}</li>
 *   <li>{@link Leveleditor.impl.ArmorImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link Leveleditor.impl.ArmorImpl#getHp <em>Hp</em>}</li>
 *   <li>{@link Leveleditor.impl.ArmorImpl#getMana <em>Mana</em>}</li>
 *   <li>{@link Leveleditor.impl.ArmorImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link Leveleditor.impl.ArmorImpl#getAgility <em>Agility</em>}</li>
 *   <li>{@link Leveleditor.impl.ArmorImpl#getCharisma <em>Charisma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArmorImpl extends ItemImpl implements Armor {
	/**
	 * The default value of the '{@link #getArmor() <em>Armor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmor()
	 * @generated
	 * @ordered
	 */
	protected static final int ARMOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArmor() <em>Armor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmor()
	 * @generated
	 * @ordered
	 */
	protected int armor = ARMOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getArmorType() <em>Armor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmorType()
	 * @generated
	 * @ordered
	 */
	protected static final EArmorType ARMOR_TYPE_EDEFAULT = EArmorType.HEAD;

	/**
	 * The cached value of the '{@link #getArmorType() <em>Armor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmorType()
	 * @generated
	 * @ordered
	 */
	protected EArmorType armorType = ARMOR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResistLightning() <em>Resist Lightning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistLightning()
	 * @generated
	 * @ordered
	 */
	protected static final int RESIST_LIGHTNING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResistLightning() <em>Resist Lightning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistLightning()
	 * @generated
	 * @ordered
	 */
	protected int resistLightning = RESIST_LIGHTNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getResistIce() <em>Resist Ice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistIce()
	 * @generated
	 * @ordered
	 */
	protected static final int RESIST_ICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResistIce() <em>Resist Ice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistIce()
	 * @generated
	 * @ordered
	 */
	protected int resistIce = RESIST_ICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResistFire() <em>Resist Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistFire()
	 * @generated
	 * @ordered
	 */
	protected static final int RESIST_FIRE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResistFire() <em>Resist Fire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistFire()
	 * @generated
	 * @ordered
	 */
	protected int resistFire = RESIST_FIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResistPoison() <em>Resist Poison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistPoison()
	 * @generated
	 * @ordered
	 */
	protected static final int RESIST_POISON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResistPoison() <em>Resist Poison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistPoison()
	 * @generated
	 * @ordered
	 */
	protected int resistPoison = RESIST_POISON_EDEFAULT;

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
	protected ArmorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.ARMOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArmor() {
		return armor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmor(int newArmor) {
		int oldArmor = armor;
		armor = newArmor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ARMOR__ARMOR, oldArmor, armor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EArmorType getArmorType() {
		return armorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmorType(EArmorType newArmorType) {
		EArmorType oldArmorType = armorType;
		armorType = newArmorType == null ? ARMOR_TYPE_EDEFAULT : newArmorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ARMOR__ARMOR_TYPE, oldArmorType, armorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResistLightning() {
		return resistLightning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistLightning(int newResistLightning) {
		int oldResistLightning = resistLightning;
		resistLightning = newResistLightning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ARMOR__RESIST_LIGHTNING, oldResistLightning, resistLightning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResistIce() {
		return resistIce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistIce(int newResistIce) {
		int oldResistIce = resistIce;
		resistIce = newResistIce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ARMOR__RESIST_ICE, oldResistIce, resistIce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResistFire() {
		return resistFire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistFire(int newResistFire) {
		int oldResistFire = resistFire;
		resistFire = newResistFire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ARMOR__RESIST_FIRE, oldResistFire, resistFire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResistPoison() {
		return resistPoison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistPoison(int newResistPoison) {
		int oldResistPoison = resistPoison;
		resistPoison = newResistPoison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ARMOR__RESIST_POISON, oldResistPoison, resistPoison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECreatureClass> getClasses() {
		if (classes == null) {
			classes = new EDataTypeUniqueEList<ECreatureClass>(ECreatureClass.class, this, LeveleditorPackage.ARMOR__CLASSES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ARMOR__HP, oldHp, hp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ARMOR__MANA, oldMana, mana));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ARMOR__STRENGTH, oldStrength, strength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ARMOR__AGILITY, oldAgility, agility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ARMOR__CHARISMA, oldCharisma, charisma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeveleditorPackage.ARMOR__ARMOR:
				return getArmor();
			case LeveleditorPackage.ARMOR__ARMOR_TYPE:
				return getArmorType();
			case LeveleditorPackage.ARMOR__RESIST_LIGHTNING:
				return getResistLightning();
			case LeveleditorPackage.ARMOR__RESIST_ICE:
				return getResistIce();
			case LeveleditorPackage.ARMOR__RESIST_FIRE:
				return getResistFire();
			case LeveleditorPackage.ARMOR__RESIST_POISON:
				return getResistPoison();
			case LeveleditorPackage.ARMOR__CLASSES:
				return getClasses();
			case LeveleditorPackage.ARMOR__HP:
				return getHp();
			case LeveleditorPackage.ARMOR__MANA:
				return getMana();
			case LeveleditorPackage.ARMOR__STRENGTH:
				return getStrength();
			case LeveleditorPackage.ARMOR__AGILITY:
				return getAgility();
			case LeveleditorPackage.ARMOR__CHARISMA:
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
			case LeveleditorPackage.ARMOR__ARMOR:
				setArmor((Integer)newValue);
				return;
			case LeveleditorPackage.ARMOR__ARMOR_TYPE:
				setArmorType((EArmorType)newValue);
				return;
			case LeveleditorPackage.ARMOR__RESIST_LIGHTNING:
				setResistLightning((Integer)newValue);
				return;
			case LeveleditorPackage.ARMOR__RESIST_ICE:
				setResistIce((Integer)newValue);
				return;
			case LeveleditorPackage.ARMOR__RESIST_FIRE:
				setResistFire((Integer)newValue);
				return;
			case LeveleditorPackage.ARMOR__RESIST_POISON:
				setResistPoison((Integer)newValue);
				return;
			case LeveleditorPackage.ARMOR__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ECreatureClass>)newValue);
				return;
			case LeveleditorPackage.ARMOR__HP:
				setHp((Integer)newValue);
				return;
			case LeveleditorPackage.ARMOR__MANA:
				setMana((Integer)newValue);
				return;
			case LeveleditorPackage.ARMOR__STRENGTH:
				setStrength((Integer)newValue);
				return;
			case LeveleditorPackage.ARMOR__AGILITY:
				setAgility((Integer)newValue);
				return;
			case LeveleditorPackage.ARMOR__CHARISMA:
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
			case LeveleditorPackage.ARMOR__ARMOR:
				setArmor(ARMOR_EDEFAULT);
				return;
			case LeveleditorPackage.ARMOR__ARMOR_TYPE:
				setArmorType(ARMOR_TYPE_EDEFAULT);
				return;
			case LeveleditorPackage.ARMOR__RESIST_LIGHTNING:
				setResistLightning(RESIST_LIGHTNING_EDEFAULT);
				return;
			case LeveleditorPackage.ARMOR__RESIST_ICE:
				setResistIce(RESIST_ICE_EDEFAULT);
				return;
			case LeveleditorPackage.ARMOR__RESIST_FIRE:
				setResistFire(RESIST_FIRE_EDEFAULT);
				return;
			case LeveleditorPackage.ARMOR__RESIST_POISON:
				setResistPoison(RESIST_POISON_EDEFAULT);
				return;
			case LeveleditorPackage.ARMOR__CLASSES:
				getClasses().clear();
				return;
			case LeveleditorPackage.ARMOR__HP:
				setHp(HP_EDEFAULT);
				return;
			case LeveleditorPackage.ARMOR__MANA:
				setMana(MANA_EDEFAULT);
				return;
			case LeveleditorPackage.ARMOR__STRENGTH:
				setStrength(STRENGTH_EDEFAULT);
				return;
			case LeveleditorPackage.ARMOR__AGILITY:
				setAgility(AGILITY_EDEFAULT);
				return;
			case LeveleditorPackage.ARMOR__CHARISMA:
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
			case LeveleditorPackage.ARMOR__ARMOR:
				return armor != ARMOR_EDEFAULT;
			case LeveleditorPackage.ARMOR__ARMOR_TYPE:
				return armorType != ARMOR_TYPE_EDEFAULT;
			case LeveleditorPackage.ARMOR__RESIST_LIGHTNING:
				return resistLightning != RESIST_LIGHTNING_EDEFAULT;
			case LeveleditorPackage.ARMOR__RESIST_ICE:
				return resistIce != RESIST_ICE_EDEFAULT;
			case LeveleditorPackage.ARMOR__RESIST_FIRE:
				return resistFire != RESIST_FIRE_EDEFAULT;
			case LeveleditorPackage.ARMOR__RESIST_POISON:
				return resistPoison != RESIST_POISON_EDEFAULT;
			case LeveleditorPackage.ARMOR__CLASSES:
				return classes != null && !classes.isEmpty();
			case LeveleditorPackage.ARMOR__HP:
				return hp != HP_EDEFAULT;
			case LeveleditorPackage.ARMOR__MANA:
				return mana != MANA_EDEFAULT;
			case LeveleditorPackage.ARMOR__STRENGTH:
				return strength != STRENGTH_EDEFAULT;
			case LeveleditorPackage.ARMOR__AGILITY:
				return agility != AGILITY_EDEFAULT;
			case LeveleditorPackage.ARMOR__CHARISMA:
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
		result.append(" (armor: ");
		result.append(armor);
		result.append(", armorType: ");
		result.append(armorType);
		result.append(", resistLightning: ");
		result.append(resistLightning);
		result.append(", resistIce: ");
		result.append(resistIce);
		result.append(", resistFire: ");
		result.append(resistFire);
		result.append(", resistPoison: ");
		result.append(resistPoison);
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

} //ArmorImpl
