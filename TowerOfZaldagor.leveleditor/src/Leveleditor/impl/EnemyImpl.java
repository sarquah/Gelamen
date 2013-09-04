/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import Leveleditor.Aura;
import Leveleditor.Enemy;
import Leveleditor.LeveleditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enemy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.EnemyImpl#isIsAttacking <em>Is Attacking</em>}</li>
 *   <li>{@link Leveleditor.impl.EnemyImpl#getScarefactor <em>Scarefactor</em>}</li>
 *   <li>{@link Leveleditor.impl.EnemyImpl#getDamageFire <em>Damage Fire</em>}</li>
 *   <li>{@link Leveleditor.impl.EnemyImpl#getDamageLightning <em>Damage Lightning</em>}</li>
 *   <li>{@link Leveleditor.impl.EnemyImpl#getDamageIce <em>Damage Ice</em>}</li>
 *   <li>{@link Leveleditor.impl.EnemyImpl#getDamagePoison <em>Damage Poison</em>}</li>
 *   <li>{@link Leveleditor.impl.EnemyImpl#getAuras <em>Auras</em>}</li>
 *   <li>{@link Leveleditor.impl.EnemyImpl#isBoss <em>Boss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnemyImpl extends CreatureImpl implements Enemy {
	/**
	 * The default value of the '{@link #isIsAttacking() <em>Is Attacking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAttacking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ATTACKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAttacking() <em>Is Attacking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAttacking()
	 * @generated
	 * @ordered
	 */
	protected boolean isAttacking = IS_ATTACKING_EDEFAULT;

	/**
	 * The default value of the '{@link #getScarefactor() <em>Scarefactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScarefactor()
	 * @generated
	 * @ordered
	 */
	protected static final int SCAREFACTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScarefactor() <em>Scarefactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScarefactor()
	 * @generated
	 * @ordered
	 */
	protected int scarefactor = SCAREFACTOR_EDEFAULT;

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
	 * The cached value of the '{@link #getAuras() <em>Auras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuras()
	 * @generated
	 * @ordered
	 */
	protected EList<Aura> auras;

	/**
	 * The default value of the '{@link #isBoss() <em>Boss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoss()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOSS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoss() <em>Boss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoss()
	 * @generated
	 * @ordered
	 */
	protected boolean boss = BOSS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnemyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.ENEMY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAttacking() {
		return isAttacking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAttacking(boolean newIsAttacking) {
		boolean oldIsAttacking = isAttacking;
		isAttacking = newIsAttacking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ENEMY__IS_ATTACKING, oldIsAttacking, isAttacking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScarefactor() {
		return scarefactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScarefactor(int newScarefactor) {
		int oldScarefactor = scarefactor;
		scarefactor = newScarefactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ENEMY__SCAREFACTOR, oldScarefactor, scarefactor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ENEMY__DAMAGE_FIRE, oldDamageFire, damageFire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ENEMY__DAMAGE_LIGHTNING, oldDamageLightning, damageLightning));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ENEMY__DAMAGE_ICE, oldDamageIce, damageIce));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ENEMY__DAMAGE_POISON, oldDamagePoison, damagePoison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aura> getAuras() {
		if (auras == null) {
			auras = new EObjectContainmentEList<Aura>(Aura.class, this, LeveleditorPackage.ENEMY__AURAS);
		}
		return auras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoss() {
		return boss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoss(boolean newBoss) {
		boolean oldBoss = boss;
		boss = newBoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ENEMY__BOSS, oldBoss, boss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeveleditorPackage.ENEMY__AURAS:
				return ((InternalEList<?>)getAuras()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeveleditorPackage.ENEMY__IS_ATTACKING:
				return isIsAttacking();
			case LeveleditorPackage.ENEMY__SCAREFACTOR:
				return getScarefactor();
			case LeveleditorPackage.ENEMY__DAMAGE_FIRE:
				return getDamageFire();
			case LeveleditorPackage.ENEMY__DAMAGE_LIGHTNING:
				return getDamageLightning();
			case LeveleditorPackage.ENEMY__DAMAGE_ICE:
				return getDamageIce();
			case LeveleditorPackage.ENEMY__DAMAGE_POISON:
				return getDamagePoison();
			case LeveleditorPackage.ENEMY__AURAS:
				return getAuras();
			case LeveleditorPackage.ENEMY__BOSS:
				return isBoss();
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
			case LeveleditorPackage.ENEMY__IS_ATTACKING:
				setIsAttacking((Boolean)newValue);
				return;
			case LeveleditorPackage.ENEMY__SCAREFACTOR:
				setScarefactor((Integer)newValue);
				return;
			case LeveleditorPackage.ENEMY__DAMAGE_FIRE:
				setDamageFire((Integer)newValue);
				return;
			case LeveleditorPackage.ENEMY__DAMAGE_LIGHTNING:
				setDamageLightning((Integer)newValue);
				return;
			case LeveleditorPackage.ENEMY__DAMAGE_ICE:
				setDamageIce((Integer)newValue);
				return;
			case LeveleditorPackage.ENEMY__DAMAGE_POISON:
				setDamagePoison((Integer)newValue);
				return;
			case LeveleditorPackage.ENEMY__AURAS:
				getAuras().clear();
				getAuras().addAll((Collection<? extends Aura>)newValue);
				return;
			case LeveleditorPackage.ENEMY__BOSS:
				setBoss((Boolean)newValue);
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
			case LeveleditorPackage.ENEMY__IS_ATTACKING:
				setIsAttacking(IS_ATTACKING_EDEFAULT);
				return;
			case LeveleditorPackage.ENEMY__SCAREFACTOR:
				setScarefactor(SCAREFACTOR_EDEFAULT);
				return;
			case LeveleditorPackage.ENEMY__DAMAGE_FIRE:
				setDamageFire(DAMAGE_FIRE_EDEFAULT);
				return;
			case LeveleditorPackage.ENEMY__DAMAGE_LIGHTNING:
				setDamageLightning(DAMAGE_LIGHTNING_EDEFAULT);
				return;
			case LeveleditorPackage.ENEMY__DAMAGE_ICE:
				setDamageIce(DAMAGE_ICE_EDEFAULT);
				return;
			case LeveleditorPackage.ENEMY__DAMAGE_POISON:
				setDamagePoison(DAMAGE_POISON_EDEFAULT);
				return;
			case LeveleditorPackage.ENEMY__AURAS:
				getAuras().clear();
				return;
			case LeveleditorPackage.ENEMY__BOSS:
				setBoss(BOSS_EDEFAULT);
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
			case LeveleditorPackage.ENEMY__IS_ATTACKING:
				return isAttacking != IS_ATTACKING_EDEFAULT;
			case LeveleditorPackage.ENEMY__SCAREFACTOR:
				return scarefactor != SCAREFACTOR_EDEFAULT;
			case LeveleditorPackage.ENEMY__DAMAGE_FIRE:
				return damageFire != DAMAGE_FIRE_EDEFAULT;
			case LeveleditorPackage.ENEMY__DAMAGE_LIGHTNING:
				return damageLightning != DAMAGE_LIGHTNING_EDEFAULT;
			case LeveleditorPackage.ENEMY__DAMAGE_ICE:
				return damageIce != DAMAGE_ICE_EDEFAULT;
			case LeveleditorPackage.ENEMY__DAMAGE_POISON:
				return damagePoison != DAMAGE_POISON_EDEFAULT;
			case LeveleditorPackage.ENEMY__AURAS:
				return auras != null && !auras.isEmpty();
			case LeveleditorPackage.ENEMY__BOSS:
				return boss != BOSS_EDEFAULT;
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
		result.append(" (isAttacking: ");
		result.append(isAttacking);
		result.append(", scarefactor: ");
		result.append(scarefactor);
		result.append(", damageFire: ");
		result.append(damageFire);
		result.append(", damageLightning: ");
		result.append(damageLightning);
		result.append(", damageIce: ");
		result.append(damageIce);
		result.append(", damagePoison: ");
		result.append(damagePoison);
		result.append(", boss: ");
		result.append(boss);
		result.append(')');
		return result.toString();
	}

} //EnemyImpl
