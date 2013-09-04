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
 * A representation of the model object '<em><b>Event Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.EventRoom#getEvents <em>Events</em>}</li>
 *   <li>{@link Leveleditor.EventRoom#getQuest <em>Quest</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getEventRoom()
 * @model
 * @generated
 */
public interface EventRoom extends Room {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link Leveleditor.RoomEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see Leveleditor.LeveleditorPackage#getEventRoom_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoomEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Quest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quest</em>' containment reference.
	 * @see #setQuest(Quest)
	 * @see Leveleditor.LeveleditorPackage#getEventRoom_Quest()
	 * @model containment="true"
	 * @generated
	 */
	Quest getQuest();

	/**
	 * Sets the value of the '{@link Leveleditor.EventRoom#getQuest <em>Quest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quest</em>' containment reference.
	 * @see #getQuest()
	 * @generated
	 */
	void setQuest(Quest value);

} // EventRoom
