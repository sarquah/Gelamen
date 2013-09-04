/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.NPC#getDialogcontroller <em>Dialogcontroller</em>}</li>
 *   <li>{@link Leveleditor.NPC#isTalking <em>Talking</em>}</li>
 *   <li>{@link Leveleditor.NPC#isFirsttime <em>Firsttime</em>}</li>
 *   <li>{@link Leveleditor.NPC#getGotoId <em>Goto Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getNPC()
 * @model
 * @generated
 */
public interface NPC extends Enemy {
	/**
	 * Returns the value of the '<em><b>Dialogcontroller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialogcontroller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogcontroller</em>' containment reference.
	 * @see #setDialogcontroller(DialogController)
	 * @see Leveleditor.LeveleditorPackage#getNPC_Dialogcontroller()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DialogController getDialogcontroller();

	/**
	 * Sets the value of the '{@link Leveleditor.NPC#getDialogcontroller <em>Dialogcontroller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialogcontroller</em>' containment reference.
	 * @see #getDialogcontroller()
	 * @generated
	 */
	void setDialogcontroller(DialogController value);

	/**
	 * Returns the value of the '<em><b>Talking</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Talking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talking</em>' attribute.
	 * @see #setTalking(boolean)
	 * @see Leveleditor.LeveleditorPackage#getNPC_Talking()
	 * @model default="false"
	 * @generated
	 */
	boolean isTalking();

	/**
	 * Sets the value of the '{@link Leveleditor.NPC#isTalking <em>Talking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Talking</em>' attribute.
	 * @see #isTalking()
	 * @generated
	 */
	void setTalking(boolean value);

	/**
	 * Returns the value of the '<em><b>Firsttime</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firsttime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firsttime</em>' attribute.
	 * @see #setFirsttime(boolean)
	 * @see Leveleditor.LeveleditorPackage#getNPC_Firsttime()
	 * @model default="true"
	 * @generated
	 */
	boolean isFirsttime();

	/**
	 * Sets the value of the '{@link Leveleditor.NPC#isFirsttime <em>Firsttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firsttime</em>' attribute.
	 * @see #isFirsttime()
	 * @generated
	 */
	void setFirsttime(boolean value);

	/**
	 * Returns the value of the '<em><b>Goto Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goto Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goto Id</em>' attribute.
	 * @see #setGotoId(int)
	 * @see Leveleditor.LeveleditorPackage#getNPC_GotoId()
	 * @model default="0"
	 * @generated
	 */
	int getGotoId();

	/**
	 * Sets the value of the '{@link Leveleditor.NPC#getGotoId <em>Goto Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goto Id</em>' attribute.
	 * @see #getGotoId()
	 * @generated
	 */
	void setGotoId(int value);

} // NPC
