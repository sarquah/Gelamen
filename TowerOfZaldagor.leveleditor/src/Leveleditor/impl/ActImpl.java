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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import Leveleditor.Act;
import Leveleditor.LeveleditorPackage;
import Leveleditor.Room;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.ActImpl#getWorld <em>World</em>}</li>
 *   <li>{@link Leveleditor.impl.ActImpl#getActName <em>Act Name</em>}</li>
 *   <li>{@link Leveleditor.impl.ActImpl#getGotoAct <em>Goto Act</em>}</li>
 *   <li>{@link Leveleditor.impl.ActImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActImpl extends EObjectImpl implements Act {
	/**
	 * The cached value of the '{@link #getWorld() <em>World</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorld()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> world;

	/**
	 * The default value of the '{@link #getActName() <em>Act Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActName() <em>Act Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActName()
	 * @generated
	 * @ordered
	 */
	protected String actName = ACT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGotoAct() <em>Goto Act</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGotoAct()
	 * @generated
	 * @ordered
	 */
	protected Act gotoAct;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getWorld() {
		if (world == null) {
			world = new EObjectContainmentEList<Room>(Room.class, this, LeveleditorPackage.ACT__WORLD);
		}
		return world;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActName() {
		return actName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActName(String newActName) {
		String oldActName = actName;
		actName = newActName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ACT__ACT_NAME, oldActName, actName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Act getGotoAct() {
		if (gotoAct != null && gotoAct.eIsProxy()) {
			InternalEObject oldGotoAct = (InternalEObject)gotoAct;
			gotoAct = (Act)eResolveProxy(oldGotoAct);
			if (gotoAct != oldGotoAct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ACT__GOTO_ACT, oldGotoAct, gotoAct));
			}
		}
		return gotoAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Act basicGetGotoAct() {
		return gotoAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGotoAct(Act newGotoAct) {
		Act oldGotoAct = gotoAct;
		gotoAct = newGotoAct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ACT__GOTO_ACT, oldGotoAct, gotoAct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ACT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeveleditorPackage.ACT__WORLD:
				return ((InternalEList<?>)getWorld()).basicRemove(otherEnd, msgs);
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
			case LeveleditorPackage.ACT__WORLD:
				return getWorld();
			case LeveleditorPackage.ACT__ACT_NAME:
				return getActName();
			case LeveleditorPackage.ACT__GOTO_ACT:
				if (resolve) return getGotoAct();
				return basicGetGotoAct();
			case LeveleditorPackage.ACT__DESCRIPTION:
				return getDescription();
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
			case LeveleditorPackage.ACT__WORLD:
				getWorld().clear();
				getWorld().addAll((Collection<? extends Room>)newValue);
				return;
			case LeveleditorPackage.ACT__ACT_NAME:
				setActName((String)newValue);
				return;
			case LeveleditorPackage.ACT__GOTO_ACT:
				setGotoAct((Act)newValue);
				return;
			case LeveleditorPackage.ACT__DESCRIPTION:
				setDescription((String)newValue);
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
			case LeveleditorPackage.ACT__WORLD:
				getWorld().clear();
				return;
			case LeveleditorPackage.ACT__ACT_NAME:
				setActName(ACT_NAME_EDEFAULT);
				return;
			case LeveleditorPackage.ACT__GOTO_ACT:
				setGotoAct((Act)null);
				return;
			case LeveleditorPackage.ACT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case LeveleditorPackage.ACT__WORLD:
				return world != null && !world.isEmpty();
			case LeveleditorPackage.ACT__ACT_NAME:
				return ACT_NAME_EDEFAULT == null ? actName != null : !ACT_NAME_EDEFAULT.equals(actName);
			case LeveleditorPackage.ACT__GOTO_ACT:
				return gotoAct != null;
			case LeveleditorPackage.ACT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (actName: ");
		result.append(actName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ActImpl
