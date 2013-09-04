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
 * A representation of the model object '<em><b>Dialog Skill Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.DialogSkillTest#getSkill <em>Skill</em>}</li>
 *   <li>{@link Leveleditor.DialogSkillTest#getGotoIdSuccess <em>Goto Id Success</em>}</li>
 *   <li>{@link Leveleditor.DialogSkillTest#getGotoIdFail <em>Goto Id Fail</em>}</li>
 *   <li>{@link Leveleditor.DialogSkillTest#getSkillNPC <em>Skill NPC</em>}</li>
 *   <li>{@link Leveleditor.DialogSkillTest#getSucessText <em>Sucess Text</em>}</li>
 *   <li>{@link Leveleditor.DialogSkillTest#getFailText <em>Fail Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getDialogSkillTest()
 * @model
 * @generated
 */
public interface DialogSkillTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Skill</b></em>' attribute.
	 * The literals are from the enumeration {@link Leveleditor.ESkill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill</em>' attribute.
	 * @see Leveleditor.ESkill
	 * @see #setSkill(ESkill)
	 * @see Leveleditor.LeveleditorPackage#getDialogSkillTest_Skill()
	 * @model
	 * @generated
	 */
	ESkill getSkill();

	/**
	 * Sets the value of the '{@link Leveleditor.DialogSkillTest#getSkill <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill</em>' attribute.
	 * @see Leveleditor.ESkill
	 * @see #getSkill()
	 * @generated
	 */
	void setSkill(ESkill value);

	/**
	 * Returns the value of the '<em><b>Goto Id Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goto Id Success</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goto Id Success</em>' attribute.
	 * @see #setGotoIdSuccess(int)
	 * @see Leveleditor.LeveleditorPackage#getDialogSkillTest_GotoIdSuccess()
	 * @model
	 * @generated
	 */
	int getGotoIdSuccess();

	/**
	 * Sets the value of the '{@link Leveleditor.DialogSkillTest#getGotoIdSuccess <em>Goto Id Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goto Id Success</em>' attribute.
	 * @see #getGotoIdSuccess()
	 * @generated
	 */
	void setGotoIdSuccess(int value);

	/**
	 * Returns the value of the '<em><b>Goto Id Fail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goto Id Fail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goto Id Fail</em>' attribute.
	 * @see #setGotoIdFail(int)
	 * @see Leveleditor.LeveleditorPackage#getDialogSkillTest_GotoIdFail()
	 * @model
	 * @generated
	 */
	int getGotoIdFail();

	/**
	 * Sets the value of the '{@link Leveleditor.DialogSkillTest#getGotoIdFail <em>Goto Id Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goto Id Fail</em>' attribute.
	 * @see #getGotoIdFail()
	 * @generated
	 */
	void setGotoIdFail(int value);

	/**
	 * Returns the value of the '<em><b>Skill NPC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill NPC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill NPC</em>' attribute.
	 * @see #setSkillNPC(int)
	 * @see Leveleditor.LeveleditorPackage#getDialogSkillTest_SkillNPC()
	 * @model
	 * @generated
	 */
	int getSkillNPC();

	/**
	 * Sets the value of the '{@link Leveleditor.DialogSkillTest#getSkillNPC <em>Skill NPC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill NPC</em>' attribute.
	 * @see #getSkillNPC()
	 * @generated
	 */
	void setSkillNPC(int value);

	/**
	 * Returns the value of the '<em><b>Sucess Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sucess Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sucess Text</em>' attribute.
	 * @see #setSucessText(String)
	 * @see Leveleditor.LeveleditorPackage#getDialogSkillTest_SucessText()
	 * @model
	 * @generated
	 */
	String getSucessText();

	/**
	 * Sets the value of the '{@link Leveleditor.DialogSkillTest#getSucessText <em>Sucess Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sucess Text</em>' attribute.
	 * @see #getSucessText()
	 * @generated
	 */
	void setSucessText(String value);

	/**
	 * Returns the value of the '<em><b>Fail Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Text</em>' attribute.
	 * @see #setFailText(String)
	 * @see Leveleditor.LeveleditorPackage#getDialogSkillTest_FailText()
	 * @model
	 * @generated
	 */
	String getFailText();

	/**
	 * Sets the value of the '{@link Leveleditor.DialogSkillTest#getFailText <em>Fail Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Text</em>' attribute.
	 * @see #getFailText()
	 * @generated
	 */
	void setFailText(String value);

} // DialogSkillTest
