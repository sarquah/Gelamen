/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import Leveleditor.Aura;
import Leveleditor.EAura;
import Leveleditor.LeveleditorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aura</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.AuraImpl#getAuraType <em>Aura Type</em>}</li>
 *   <li>{@link Leveleditor.impl.AuraImpl#getAmmount <em>Ammount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuraImpl extends EObjectImpl implements Aura {
	/**
	 * The default value of the '{@link #getAuraType() <em>Aura Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuraType()
	 * @generated
	 * @ordered
	 */
	protected static final EAura AURA_TYPE_EDEFAULT = EAura.REGEN_MANA;

	/**
	 * The cached value of the '{@link #getAuraType() <em>Aura Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuraType()
	 * @generated
	 * @ordered
	 */
	protected EAura auraType = AURA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmmount() <em>Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmmount()
	 * @generated
	 * @ordered
	 */
	protected static final int AMMOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmmount() <em>Ammount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmmount()
	 * @generated
	 * @ordered
	 */
	protected int ammount = AMMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.AURA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAura getAuraType() {
		return auraType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuraType(EAura newAuraType) {
		EAura oldAuraType = auraType;
		auraType = newAuraType == null ? AURA_TYPE_EDEFAULT : newAuraType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.AURA__AURA_TYPE, oldAuraType, auraType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmmount() {
		return ammount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmmount(int newAmmount) {
		int oldAmmount = ammount;
		ammount = newAmmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.AURA__AMMOUNT, oldAmmount, ammount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeveleditorPackage.AURA__AURA_TYPE:
				return getAuraType();
			case LeveleditorPackage.AURA__AMMOUNT:
				return getAmmount();
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
			case LeveleditorPackage.AURA__AURA_TYPE:
				setAuraType((EAura)newValue);
				return;
			case LeveleditorPackage.AURA__AMMOUNT:
				setAmmount((Integer)newValue);
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
			case LeveleditorPackage.AURA__AURA_TYPE:
				setAuraType(AURA_TYPE_EDEFAULT);
				return;
			case LeveleditorPackage.AURA__AMMOUNT:
				setAmmount(AMMOUNT_EDEFAULT);
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
			case LeveleditorPackage.AURA__AURA_TYPE:
				return auraType != AURA_TYPE_EDEFAULT;
			case LeveleditorPackage.AURA__AMMOUNT:
				return ammount != AMMOUNT_EDEFAULT;
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
		result.append(" (auraType: ");
		result.append(auraType);
		result.append(", ammount: ");
		result.append(ammount);
		result.append(')');
		return result.toString();
	}

} //AuraImpl
