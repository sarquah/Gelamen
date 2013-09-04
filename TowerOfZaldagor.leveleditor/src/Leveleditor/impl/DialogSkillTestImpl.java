/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import Leveleditor.DialogSkillTest;
import Leveleditor.ESkill;
import Leveleditor.LeveleditorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialog Skill Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.DialogSkillTestImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogSkillTestImpl#getGotoIdSuccess <em>Goto Id Success</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogSkillTestImpl#getGotoIdFail <em>Goto Id Fail</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogSkillTestImpl#getSkillNPC <em>Skill NPC</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogSkillTestImpl#getSucessText <em>Sucess Text</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogSkillTestImpl#getFailText <em>Fail Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DialogSkillTestImpl extends EObjectImpl implements DialogSkillTest {
	/**
	 * The default value of the '{@link #getSkill() <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected static final ESkill SKILL_EDEFAULT = ESkill.STRENGTH;

	/**
	 * The cached value of the '{@link #getSkill() <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected ESkill skill = SKILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGotoIdSuccess() <em>Goto Id Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGotoIdSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final int GOTO_ID_SUCCESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGotoIdSuccess() <em>Goto Id Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGotoIdSuccess()
	 * @generated
	 * @ordered
	 */
	protected int gotoIdSuccess = GOTO_ID_SUCCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGotoIdFail() <em>Goto Id Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGotoIdFail()
	 * @generated
	 * @ordered
	 */
	protected static final int GOTO_ID_FAIL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGotoIdFail() <em>Goto Id Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGotoIdFail()
	 * @generated
	 * @ordered
	 */
	protected int gotoIdFail = GOTO_ID_FAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkillNPC() <em>Skill NPC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillNPC()
	 * @generated
	 * @ordered
	 */
	protected static final int SKILL_NPC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSkillNPC() <em>Skill NPC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillNPC()
	 * @generated
	 * @ordered
	 */
	protected int skillNPC = SKILL_NPC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSucessText() <em>Sucess Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucessText()
	 * @generated
	 * @ordered
	 */
	protected static final String SUCESS_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSucessText() <em>Sucess Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucessText()
	 * @generated
	 * @ordered
	 */
	protected String sucessText = SUCESS_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailText() <em>Fail Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailText()
	 * @generated
	 * @ordered
	 */
	protected static final String FAIL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailText() <em>Fail Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailText()
	 * @generated
	 * @ordered
	 */
	protected String failText = FAIL_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogSkillTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.DIALOG_SKILL_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESkill getSkill() {
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkill(ESkill newSkill) {
		ESkill oldSkill = skill;
		skill = newSkill == null ? SKILL_EDEFAULT : newSkill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG_SKILL_TEST__SKILL, oldSkill, skill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGotoIdSuccess() {
		return gotoIdSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGotoIdSuccess(int newGotoIdSuccess) {
		int oldGotoIdSuccess = gotoIdSuccess;
		gotoIdSuccess = newGotoIdSuccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG_SKILL_TEST__GOTO_ID_SUCCESS, oldGotoIdSuccess, gotoIdSuccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGotoIdFail() {
		return gotoIdFail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGotoIdFail(int newGotoIdFail) {
		int oldGotoIdFail = gotoIdFail;
		gotoIdFail = newGotoIdFail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG_SKILL_TEST__GOTO_ID_FAIL, oldGotoIdFail, gotoIdFail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSkillNPC() {
		return skillNPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkillNPC(int newSkillNPC) {
		int oldSkillNPC = skillNPC;
		skillNPC = newSkillNPC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG_SKILL_TEST__SKILL_NPC, oldSkillNPC, skillNPC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSucessText() {
		return sucessText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSucessText(String newSucessText) {
		String oldSucessText = sucessText;
		sucessText = newSucessText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG_SKILL_TEST__SUCESS_TEXT, oldSucessText, sucessText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFailText() {
		return failText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailText(String newFailText) {
		String oldFailText = failText;
		failText = newFailText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG_SKILL_TEST__FAIL_TEXT, oldFailText, failText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeveleditorPackage.DIALOG_SKILL_TEST__SKILL:
				return getSkill();
			case LeveleditorPackage.DIALOG_SKILL_TEST__GOTO_ID_SUCCESS:
				return getGotoIdSuccess();
			case LeveleditorPackage.DIALOG_SKILL_TEST__GOTO_ID_FAIL:
				return getGotoIdFail();
			case LeveleditorPackage.DIALOG_SKILL_TEST__SKILL_NPC:
				return getSkillNPC();
			case LeveleditorPackage.DIALOG_SKILL_TEST__SUCESS_TEXT:
				return getSucessText();
			case LeveleditorPackage.DIALOG_SKILL_TEST__FAIL_TEXT:
				return getFailText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LeveleditorPackage.DIALOG_SKILL_TEST__SKILL:
				setSkill((ESkill)newValue);
				return;
			case LeveleditorPackage.DIALOG_SKILL_TEST__GOTO_ID_SUCCESS:
				setGotoIdSuccess((Integer)newValue);
				return;
			case LeveleditorPackage.DIALOG_SKILL_TEST__GOTO_ID_FAIL:
				setGotoIdFail((Integer)newValue);
				return;
			case LeveleditorPackage.DIALOG_SKILL_TEST__SKILL_NPC:
				setSkillNPC((Integer)newValue);
				return;
			case LeveleditorPackage.DIALOG_SKILL_TEST__SUCESS_TEXT:
				setSucessText((String)newValue);
				return;
			case LeveleditorPackage.DIALOG_SKILL_TEST__FAIL_TEXT:
				setFailText((String)newValue);
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
			case LeveleditorPackage.DIALOG_SKILL_TEST__SKILL:
				setSkill(SKILL_EDEFAULT);
				return;
			case LeveleditorPackage.DIALOG_SKILL_TEST__GOTO_ID_SUCCESS:
				setGotoIdSuccess(GOTO_ID_SUCCESS_EDEFAULT);
				return;
			case LeveleditorPackage.DIALOG_SKILL_TEST__GOTO_ID_FAIL:
				setGotoIdFail(GOTO_ID_FAIL_EDEFAULT);
				return;
			case LeveleditorPackage.DIALOG_SKILL_TEST__SKILL_NPC:
				setSkillNPC(SKILL_NPC_EDEFAULT);
				return;
			case LeveleditorPackage.DIALOG_SKILL_TEST__SUCESS_TEXT:
				setSucessText(SUCESS_TEXT_EDEFAULT);
				return;
			case LeveleditorPackage.DIALOG_SKILL_TEST__FAIL_TEXT:
				setFailText(FAIL_TEXT_EDEFAULT);
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
			case LeveleditorPackage.DIALOG_SKILL_TEST__SKILL:
				return skill != SKILL_EDEFAULT;
			case LeveleditorPackage.DIALOG_SKILL_TEST__GOTO_ID_SUCCESS:
				return gotoIdSuccess != GOTO_ID_SUCCESS_EDEFAULT;
			case LeveleditorPackage.DIALOG_SKILL_TEST__GOTO_ID_FAIL:
				return gotoIdFail != GOTO_ID_FAIL_EDEFAULT;
			case LeveleditorPackage.DIALOG_SKILL_TEST__SKILL_NPC:
				return skillNPC != SKILL_NPC_EDEFAULT;
			case LeveleditorPackage.DIALOG_SKILL_TEST__SUCESS_TEXT:
				return SUCESS_TEXT_EDEFAULT == null ? sucessText != null : !SUCESS_TEXT_EDEFAULT.equals(sucessText);
			case LeveleditorPackage.DIALOG_SKILL_TEST__FAIL_TEXT:
				return FAIL_TEXT_EDEFAULT == null ? failText != null : !FAIL_TEXT_EDEFAULT.equals(failText);
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
		result.append(" (skill: ");
		result.append(skill);
		result.append(", gotoIdSuccess: ");
		result.append(gotoIdSuccess);
		result.append(", gotoIdFail: ");
		result.append(gotoIdFail);
		result.append(", skillNPC: ");
		result.append(skillNPC);
		result.append(", sucessText: ");
		result.append(sucessText);
		result.append(", failText: ");
		result.append(failText);
		result.append(')');
		return result.toString();
	}

} //DialogSkillTestImpl
