/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import Leveleditor.ESkill;
import Leveleditor.LeveleditorPackage;
import Leveleditor.Potion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.PotionImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link Leveleditor.impl.PotionImpl#getAddSkill <em>Add Skill</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PotionImpl extends ItemImpl implements Potion {
	/**
	 * The default value of the '{@link #getSkill() <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected static final ESkill SKILL_EDEFAULT = ESkill.STRENGTH;

	/**
	 * The cached value of the '{@link #getSkill() <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected ESkill skill = SKILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddSkill() <em>Add Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddSkill()
	 * @generated
	 * @ordered
	 */
	protected static final int ADD_SKILL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAddSkill() <em>Add Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddSkill()
	 * @generated
	 * @ordered
	 */
	protected int addSkill = ADD_SKILL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PotionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.POTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESkill getSkill() {
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkill(ESkill newSkill) {
		ESkill oldSkill = skill;
		skill = newSkill == null ? SKILL_EDEFAULT : newSkill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.POTION__SKILL, oldSkill, skill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAddSkill() {
		return addSkill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddSkill(int newAddSkill) {
		int oldAddSkill = addSkill;
		addSkill = newAddSkill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.POTION__ADD_SKILL, oldAddSkill, addSkill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeveleditorPackage.POTION__SKILL:
				return getSkill();
			case LeveleditorPackage.POTION__ADD_SKILL:
				return getAddSkill();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LeveleditorPackage.POTION__SKILL:
				setSkill((ESkill)newValue);
				return;
			case LeveleditorPackage.POTION__ADD_SKILL:
				setAddSkill((Integer)newValue);
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
			case LeveleditorPackage.POTION__SKILL:
				setSkill(SKILL_EDEFAULT);
				return;
			case LeveleditorPackage.POTION__ADD_SKILL:
				setAddSkill(ADD_SKILL_EDEFAULT);
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
			case LeveleditorPackage.POTION__SKILL:
				return skill != SKILL_EDEFAULT;
			case LeveleditorPackage.POTION__ADD_SKILL:
				return addSkill != ADD_SKILL_EDEFAULT;
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
		result.append(" (skill: ");
		result.append(skill);
		result.append(", addSkill: ");
		result.append(addSkill);
		result.append(')');
		return result.toString();
	}

} //PotionImpl
