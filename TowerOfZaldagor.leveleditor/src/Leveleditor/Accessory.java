/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accessory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.Accessory#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getAccessory()
 * @model
 * @generated
 */
public interface Accessory extends Item {

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see Leveleditor.LeveleditorPackage#getAccessory_Room()
	 * @model
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link Leveleditor.Accessory#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);
} // Accessory
