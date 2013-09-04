/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.FinalRoom#isIsFinal <em>Is Final</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getFinalRoom()
 * @model
 * @generated
 */
public interface FinalRoom extends EventRoom {
	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see Leveleditor.LeveleditorPackage#getFinalRoom_IsFinal()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link Leveleditor.FinalRoom#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

} // FinalRoom
