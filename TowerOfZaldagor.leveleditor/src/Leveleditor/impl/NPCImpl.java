/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import Leveleditor.DialogController;
import Leveleditor.LeveleditorPackage;
import Leveleditor.NPC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.NPCImpl#getDialogcontroller <em>Dialogcontroller</em>}</li>
 *   <li>{@link Leveleditor.impl.NPCImpl#isTalking <em>Talking</em>}</li>
 *   <li>{@link Leveleditor.impl.NPCImpl#isFirsttime <em>Firsttime</em>}</li>
 *   <li>{@link Leveleditor.impl.NPCImpl#getGotoId <em>Goto Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NPCImpl extends EnemyImpl implements NPC {
	/**
	 * The cached value of the '{@link #getDialogcontroller() <em>Dialogcontroller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogcontroller()
	 * @generated
	 * @ordered
	 */
	protected DialogController dialogcontroller;

	/**
	 * The default value of the '{@link #isTalking() <em>Talking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTalking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TALKING_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTalking() <em>Talking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTalking()
	 * @generated
	 * @ordered
	 */
	protected boolean talking = TALKING_EDEFAULT;

	/**
	 * The default value of the '{@link #isFirsttime() <em>Firsttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirsttime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRSTTIME_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFirsttime() <em>Firsttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirsttime()
	 * @generated
	 * @ordered
	 */
	protected boolean firsttime = FIRSTTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGotoId() <em>Goto Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGotoId()
	 * @generated
	 * @ordered
	 */
	protected static final int GOTO_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGotoId() <em>Goto Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGotoId()
	 * @generated
	 * @ordered
	 */
	protected int gotoId = GOTO_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.NPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogController getDialogcontroller() {
		return dialogcontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDialogcontroller(DialogController newDialogcontroller, NotificationChain msgs) {
		DialogController oldDialogcontroller = dialogcontroller;
		dialogcontroller = newDialogcontroller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeveleditorPackage.NPC__DIALOGCONTROLLER, oldDialogcontroller, newDialogcontroller);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialogcontroller(DialogController newDialogcontroller) {
		if (newDialogcontroller != dialogcontroller) {
			NotificationChain msgs = null;
			if (dialogcontroller != null)
				msgs = ((InternalEObject)dialogcontroller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.NPC__DIALOGCONTROLLER, null, msgs);
			if (newDialogcontroller != null)
				msgs = ((InternalEObject)newDialogcontroller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.NPC__DIALOGCONTROLLER, null, msgs);
			msgs = basicSetDialogcontroller(newDialogcontroller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.NPC__DIALOGCONTROLLER, newDialogcontroller, newDialogcontroller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTalking() {
		return talking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTalking(boolean newTalking) {
		boolean oldTalking = talking;
		talking = newTalking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.NPC__TALKING, oldTalking, talking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFirsttime() {
		return firsttime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirsttime(boolean newFirsttime) {
		boolean oldFirsttime = firsttime;
		firsttime = newFirsttime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.NPC__FIRSTTIME, oldFirsttime, firsttime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGotoId() {
		return gotoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGotoId(int newGotoId) {
		int oldGotoId = gotoId;
		gotoId = newGotoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.NPC__GOTO_ID, oldGotoId, gotoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeveleditorPackage.NPC__DIALOGCONTROLLER:
				return basicSetDialogcontroller(null, msgs);
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
			case LeveleditorPackage.NPC__DIALOGCONTROLLER:
				return getDialogcontroller();
			case LeveleditorPackage.NPC__TALKING:
				return isTalking();
			case LeveleditorPackage.NPC__FIRSTTIME:
				return isFirsttime();
			case LeveleditorPackage.NPC__GOTO_ID:
				return getGotoId();
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
			case LeveleditorPackage.NPC__DIALOGCONTROLLER:
				setDialogcontroller((DialogController)newValue);
				return;
			case LeveleditorPackage.NPC__TALKING:
				setTalking((Boolean)newValue);
				return;
			case LeveleditorPackage.NPC__FIRSTTIME:
				setFirsttime((Boolean)newValue);
				return;
			case LeveleditorPackage.NPC__GOTO_ID:
				setGotoId((Integer)newValue);
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
			case LeveleditorPackage.NPC__DIALOGCONTROLLER:
				setDialogcontroller((DialogController)null);
				return;
			case LeveleditorPackage.NPC__TALKING:
				setTalking(TALKING_EDEFAULT);
				return;
			case LeveleditorPackage.NPC__FIRSTTIME:
				setFirsttime(FIRSTTIME_EDEFAULT);
				return;
			case LeveleditorPackage.NPC__GOTO_ID:
				setGotoId(GOTO_ID_EDEFAULT);
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
			case LeveleditorPackage.NPC__DIALOGCONTROLLER:
				return dialogcontroller != null;
			case LeveleditorPackage.NPC__TALKING:
				return talking != TALKING_EDEFAULT;
			case LeveleditorPackage.NPC__FIRSTTIME:
				return firsttime != FIRSTTIME_EDEFAULT;
			case LeveleditorPackage.NPC__GOTO_ID:
				return gotoId != GOTO_ID_EDEFAULT;
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
		result.append(" (talking: ");
		result.append(talking);
		result.append(", firsttime: ");
		result.append(firsttime);
		result.append(", gotoId: ");
		result.append(gotoId);
		result.append(')');
		return result.toString();
	}

} //NPCImpl
