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

import Leveleditor.EventRoom;
import Leveleditor.LeveleditorPackage;
import Leveleditor.Quest;
import Leveleditor.RoomEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.EventRoomImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link Leveleditor.impl.EventRoomImpl#getQuest <em>Quest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventRoomImpl extends RoomImpl implements EventRoom {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomEvent> events;

	/**
	 * The cached value of the '{@link #getQuest() <em>Quest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuest()
	 * @generated
	 * @ordered
	 */
	protected Quest quest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.EVENT_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<RoomEvent>(RoomEvent.class, this, LeveleditorPackage.EVENT_ROOM__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quest getQuest() {
		return quest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuest(Quest newQuest, NotificationChain msgs) {
		Quest oldQuest = quest;
		quest = newQuest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeveleditorPackage.EVENT_ROOM__QUEST, oldQuest, newQuest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuest(Quest newQuest) {
		if (newQuest != quest) {
			NotificationChain msgs = null;
			if (quest != null)
				msgs = ((InternalEObject)quest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.EVENT_ROOM__QUEST, null, msgs);
			if (newQuest != null)
				msgs = ((InternalEObject)newQuest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.EVENT_ROOM__QUEST, null, msgs);
			msgs = basicSetQuest(newQuest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.EVENT_ROOM__QUEST, newQuest, newQuest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeveleditorPackage.EVENT_ROOM__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case LeveleditorPackage.EVENT_ROOM__QUEST:
				return basicSetQuest(null, msgs);
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
			case LeveleditorPackage.EVENT_ROOM__EVENTS:
				return getEvents();
			case LeveleditorPackage.EVENT_ROOM__QUEST:
				return getQuest();
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
			case LeveleditorPackage.EVENT_ROOM__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends RoomEvent>)newValue);
				return;
			case LeveleditorPackage.EVENT_ROOM__QUEST:
				setQuest((Quest)newValue);
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
			case LeveleditorPackage.EVENT_ROOM__EVENTS:
				getEvents().clear();
				return;
			case LeveleditorPackage.EVENT_ROOM__QUEST:
				setQuest((Quest)null);
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
			case LeveleditorPackage.EVENT_ROOM__EVENTS:
				return events != null && !events.isEmpty();
			case LeveleditorPackage.EVENT_ROOM__QUEST:
				return quest != null;
		}
		return super.eIsSet(featureID);
	}

} //EventRoomImpl
