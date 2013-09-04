/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.DialogController#getConversation <em>Conversation</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getDialogController()
 * @model
 * @generated
 */
public interface DialogController extends EObject {
	/**
	 * Returns the value of the '<em><b>Conversation</b></em>' containment reference list.
	 * The list contents are of type {@link Leveleditor.DialogChoices}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation</em>' containment reference list.
	 * @see Leveleditor.LeveleditorPackage#getDialogController_Conversation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DialogChoices> getConversation();

} // DialogController
