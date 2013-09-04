/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.Dialog#getOptiontext <em>Optiontext</em>}</li>
 *   <li>{@link Leveleditor.Dialog#getAnswertext <em>Answertext</em>}</li>
 *   <li>{@link Leveleditor.Dialog#getId <em>Id</em>}</li>
 *   <li>{@link Leveleditor.Dialog#getGotoId <em>Goto Id</em>}</li>
 *   <li>{@link Leveleditor.Dialog#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link Leveleditor.Dialog#getDialogskilltest <em>Dialogskilltest</em>}</li>
 *   <li>{@link Leveleditor.Dialog#isGiveItem <em>Give Item</em>}</li>
 *   <li>{@link Leveleditor.Dialog#getItem <em>Item</em>}</li>
 *   <li>{@link Leveleditor.Dialog#getQuest <em>Quest</em>}</li>
 *   <li>{@link Leveleditor.Dialog#isIsAttacking <em>Is Attacking</em>}</li>
 *   <li>{@link Leveleditor.Dialog#isEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getDialog()
 * @model
 * @generated
 */
public interface Dialog extends EObject {
	/**
	 * Returns the value of the '<em><b>Optiontext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optiontext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optiontext</em>' attribute.
	 * @see #setOptiontext(String)
	 * @see Leveleditor.LeveleditorPackage#getDialog_Optiontext()
	 * @model
	 * @generated
	 */
	String getOptiontext();

	/**
	 * Sets the value of the '{@link Leveleditor.Dialog#getOptiontext <em>Optiontext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optiontext</em>' attribute.
	 * @see #getOptiontext()
	 * @generated
	 */
	void setOptiontext(String value);

	/**
	 * Returns the value of the '<em><b>Answertext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answertext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answertext</em>' attribute.
	 * @see #setAnswertext(String)
	 * @see Leveleditor.LeveleditorPackage#getDialog_Answertext()
	 * @model
	 * @generated
	 */
	String getAnswertext();

	/**
	 * Sets the value of the '{@link Leveleditor.Dialog#getAnswertext <em>Answertext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answertext</em>' attribute.
	 * @see #getAnswertext()
	 * @generated
	 */
	void setAnswertext(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Leveleditor.LeveleditorPackage#getDialog_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Leveleditor.Dialog#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Goto Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goto Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goto Id</em>' attribute.
	 * @see #setGotoId(int)
	 * @see Leveleditor.LeveleditorPackage#getDialog_GotoId()
	 * @model
	 * @generated
	 */
	int getGotoId();

	/**
	 * Sets the value of the '{@link Leveleditor.Dialog#getGotoId <em>Goto Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goto Id</em>' attribute.
	 * @see #getGotoId()
	 * @generated
	 */
	void setGotoId(int value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see Leveleditor.LeveleditorPackage#getDialog_IsFinal()
	 * @model
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link Leveleditor.Dialog#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Dialogskilltest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialogskilltest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogskilltest</em>' containment reference.
	 * @see #setDialogskilltest(DialogSkillTest)
	 * @see Leveleditor.LeveleditorPackage#getDialog_Dialogskilltest()
	 * @model containment="true"
	 * @generated
	 */
	DialogSkillTest getDialogskilltest();

	/**
	 * Sets the value of the '{@link Leveleditor.Dialog#getDialogskilltest <em>Dialogskilltest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialogskilltest</em>' containment reference.
	 * @see #getDialogskilltest()
	 * @generated
	 */
	void setDialogskilltest(DialogSkillTest value);

	/**
	 * Returns the value of the '<em><b>Give Item</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Give Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Give Item</em>' attribute.
	 * @see #setGiveItem(boolean)
	 * @see Leveleditor.LeveleditorPackage#getDialog_GiveItem()
	 * @model default="false"
	 * @generated
	 */
	boolean isGiveItem();

	/**
	 * Sets the value of the '{@link Leveleditor.Dialog#isGiveItem <em>Give Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Give Item</em>' attribute.
	 * @see #isGiveItem()
	 * @generated
	 */
	void setGiveItem(boolean value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(Item)
	 * @see Leveleditor.LeveleditorPackage#getDialog_Item()
	 * @model
	 * @generated
	 */
	Item getItem();

	/**
	 * Sets the value of the '{@link Leveleditor.Dialog#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Item value);

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
	 * @see Leveleditor.LeveleditorPackage#getDialog_Quest()
	 * @model containment="true"
	 * @generated
	 */
	Quest getQuest();

	/**
	 * Sets the value of the '{@link Leveleditor.Dialog#getQuest <em>Quest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quest</em>' containment reference.
	 * @see #getQuest()
	 * @generated
	 */
	void setQuest(Quest value);

	/**
	 * Returns the value of the '<em><b>Is Attacking</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Attacking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attacking</em>' attribute.
	 * @see #setIsAttacking(boolean)
	 * @see Leveleditor.LeveleditorPackage#getDialog_IsAttacking()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsAttacking();

	/**
	 * Sets the value of the '{@link Leveleditor.Dialog#isIsAttacking <em>Is Attacking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Attacking</em>' attribute.
	 * @see #isIsAttacking()
	 * @generated
	 */
	void setIsAttacking(boolean value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(boolean)
	 * @see Leveleditor.LeveleditorPackage#getDialog_Event()
	 * @model
	 * @generated
	 */
	boolean isEvent();

	/**
	 * Sets the value of the '{@link Leveleditor.Dialog#isEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #isEvent()
	 * @generated
	 */
	void setEvent(boolean value);

} // Dialog
