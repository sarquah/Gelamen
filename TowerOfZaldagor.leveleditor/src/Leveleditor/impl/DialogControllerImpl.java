/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import Leveleditor.DialogChoices;
import Leveleditor.DialogController;
import Leveleditor.LeveleditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialog Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.DialogControllerImpl#getConversation <em>Conversation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DialogControllerImpl extends EObjectImpl implements DialogController {
	/**
	 * The cached value of the '{@link #getConversation() <em>Conversation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversation()
	 * @generated
	 * @ordered
	 */
	protected EList<DialogChoices> conversation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.DIALOG_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DialogChoices> getConversation() {
		if (conversation == null) {
			conversation = new EObjectContainmentEList<DialogChoices>(DialogChoices.class, this, LeveleditorPackage.DIALOG_CONTROLLER__CONVERSATION);
		}
		return conversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeveleditorPackage.DIALOG_CONTROLLER__CONVERSATION:
				return ((InternalEList<?>)getConversation()).basicRemove(otherEnd, msgs);
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
			case LeveleditorPackage.DIALOG_CONTROLLER__CONVERSATION:
				return getConversation();
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
			case LeveleditorPackage.DIALOG_CONTROLLER__CONVERSATION:
				getConversation().clear();
				getConversation().addAll((Collection<? extends DialogChoices>)newValue);
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
			case LeveleditorPackage.DIALOG_CONTROLLER__CONVERSATION:
				getConversation().clear();
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
			case LeveleditorPackage.DIALOG_CONTROLLER__CONVERSATION:
				return conversation != null && !conversation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DialogControllerImpl
