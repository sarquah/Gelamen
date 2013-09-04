/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import Leveleditor.Dialog;
import Leveleditor.DialogSkillTest;
import Leveleditor.Item;
import Leveleditor.LeveleditorPackage;

import Leveleditor.Quest;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.DialogImpl#getOptiontext <em>Optiontext</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogImpl#getAnswertext <em>Answertext</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogImpl#getId <em>Id</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogImpl#getGotoId <em>Goto Id</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogImpl#getDialogskilltest <em>Dialogskilltest</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogImpl#isGiveItem <em>Give Item</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogImpl#getItem <em>Item</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogImpl#getQuest <em>Quest</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogImpl#isIsAttacking <em>Is Attacking</em>}</li>
 *   <li>{@link Leveleditor.impl.DialogImpl#isEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DialogImpl extends EObjectImpl implements Dialog {
	/**
	 * The default value of the '{@link #getOptiontext() <em>Optiontext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptiontext()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptiontext() <em>Optiontext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptiontext()
	 * @generated
	 * @ordered
	 */
	protected String optiontext = OPTIONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnswertext() <em>Answertext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswertext()
	 * @generated
	 * @ordered
	 */
	protected static final String ANSWERTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnswertext() <em>Answertext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswertext()
	 * @generated
	 * @ordered
	 */
	protected String answertext = ANSWERTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGotoId() <em>Goto Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGotoId()
	 * @generated
	 * @ordered
	 */
	protected static final int GOTO_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGotoId() <em>Goto Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGotoId()
	 * @generated
	 * @ordered
	 */
	protected int gotoId = GOTO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDialogskilltest() <em>Dialogskilltest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogskilltest()
	 * @generated
	 * @ordered
	 */
	protected DialogSkillTest dialogskilltest;

	/**
	 * The default value of the '{@link #isGiveItem() <em>Give Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGiveItem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GIVE_ITEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGiveItem() <em>Give Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGiveItem()
	 * @generated
	 * @ordered
	 */
	protected boolean giveItem = GIVE_ITEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected Item item;

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
	 * The default value of the '{@link #isIsAttacking() <em>Is Attacking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAttacking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ATTACKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAttacking() <em>Is Attacking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAttacking()
	 * @generated
	 * @ordered
	 */
	protected boolean isAttacking = IS_ATTACKING_EDEFAULT;

	/**
	 * The default value of the '{@link #isEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEvent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EVENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEvent()
	 * @generated
	 * @ordered
	 */
	protected boolean event = EVENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.DIALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptiontext() {
		return optiontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptiontext(String newOptiontext) {
		String oldOptiontext = optiontext;
		optiontext = newOptiontext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__OPTIONTEXT, oldOptiontext, optiontext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnswertext() {
		return answertext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswertext(String newAnswertext) {
		String oldAnswertext = answertext;
		answertext = newAnswertext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__ANSWERTEXT, oldAnswertext, answertext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGotoId() {
		return gotoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGotoId(int newGotoId) {
		int oldGotoId = gotoId;
		gotoId = newGotoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__GOTO_ID, oldGotoId, gotoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinal() {
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogSkillTest getDialogskilltest() {
		return dialogskilltest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDialogskilltest(DialogSkillTest newDialogskilltest, NotificationChain msgs) {
		DialogSkillTest oldDialogskilltest = dialogskilltest;
		dialogskilltest = newDialogskilltest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__DIALOGSKILLTEST, oldDialogskilltest, newDialogskilltest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialogskilltest(DialogSkillTest newDialogskilltest) {
		if (newDialogskilltest != dialogskilltest) {
			NotificationChain msgs = null;
			if (dialogskilltest != null)
				msgs = ((InternalEObject)dialogskilltest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.DIALOG__DIALOGSKILLTEST, null, msgs);
			if (newDialogskilltest != null)
				msgs = ((InternalEObject)newDialogskilltest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.DIALOG__DIALOGSKILLTEST, null, msgs);
			msgs = basicSetDialogskilltest(newDialogskilltest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__DIALOGSKILLTEST, newDialogskilltest, newDialogskilltest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGiveItem() {
		return giveItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGiveItem(boolean newGiveItem) {
		boolean oldGiveItem = giveItem;
		giveItem = newGiveItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__GIVE_ITEM, oldGiveItem, giveItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getItem() {
		if (item != null && item.eIsProxy()) {
			InternalEObject oldItem = (InternalEObject)item;
			item = (Item)eResolveProxy(oldItem);
			if (item != oldItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.DIALOG__ITEM, oldItem, item));
			}
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(Item newItem) {
		Item oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__ITEM, oldItem, item));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__QUEST, oldQuest, newQuest);
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
				msgs = ((InternalEObject)quest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.DIALOG__QUEST, null, msgs);
			if (newQuest != null)
				msgs = ((InternalEObject)newQuest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.DIALOG__QUEST, null, msgs);
			msgs = basicSetQuest(newQuest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__QUEST, newQuest, newQuest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAttacking() {
		return isAttacking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAttacking(boolean newIsAttacking) {
		boolean oldIsAttacking = isAttacking;
		isAttacking = newIsAttacking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__IS_ATTACKING, oldIsAttacking, isAttacking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(boolean newEvent) {
		boolean oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.DIALOG__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeveleditorPackage.DIALOG__DIALOGSKILLTEST:
				return basicSetDialogskilltest(null, msgs);
			case LeveleditorPackage.DIALOG__QUEST:
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
			case LeveleditorPackage.DIALOG__OPTIONTEXT:
				return getOptiontext();
			case LeveleditorPackage.DIALOG__ANSWERTEXT:
				return getAnswertext();
			case LeveleditorPackage.DIALOG__ID:
				return getId();
			case LeveleditorPackage.DIALOG__GOTO_ID:
				return getGotoId();
			case LeveleditorPackage.DIALOG__IS_FINAL:
				return isIsFinal();
			case LeveleditorPackage.DIALOG__DIALOGSKILLTEST:
				return getDialogskilltest();
			case LeveleditorPackage.DIALOG__GIVE_ITEM:
				return isGiveItem();
			case LeveleditorPackage.DIALOG__ITEM:
				if (resolve) return getItem();
				return basicGetItem();
			case LeveleditorPackage.DIALOG__QUEST:
				return getQuest();
			case LeveleditorPackage.DIALOG__IS_ATTACKING:
				return isIsAttacking();
			case LeveleditorPackage.DIALOG__EVENT:
				return isEvent();
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
			case LeveleditorPackage.DIALOG__OPTIONTEXT:
				setOptiontext((String)newValue);
				return;
			case LeveleditorPackage.DIALOG__ANSWERTEXT:
				setAnswertext((String)newValue);
				return;
			case LeveleditorPackage.DIALOG__ID:
				setId((Integer)newValue);
				return;
			case LeveleditorPackage.DIALOG__GOTO_ID:
				setGotoId((Integer)newValue);
				return;
			case LeveleditorPackage.DIALOG__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case LeveleditorPackage.DIALOG__DIALOGSKILLTEST:
				setDialogskilltest((DialogSkillTest)newValue);
				return;
			case LeveleditorPackage.DIALOG__GIVE_ITEM:
				setGiveItem((Boolean)newValue);
				return;
			case LeveleditorPackage.DIALOG__ITEM:
				setItem((Item)newValue);
				return;
			case LeveleditorPackage.DIALOG__QUEST:
				setQuest((Quest)newValue);
				return;
			case LeveleditorPackage.DIALOG__IS_ATTACKING:
				setIsAttacking((Boolean)newValue);
				return;
			case LeveleditorPackage.DIALOG__EVENT:
				setEvent((Boolean)newValue);
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
			case LeveleditorPackage.DIALOG__OPTIONTEXT:
				setOptiontext(OPTIONTEXT_EDEFAULT);
				return;
			case LeveleditorPackage.DIALOG__ANSWERTEXT:
				setAnswertext(ANSWERTEXT_EDEFAULT);
				return;
			case LeveleditorPackage.DIALOG__ID:
				setId(ID_EDEFAULT);
				return;
			case LeveleditorPackage.DIALOG__GOTO_ID:
				setGotoId(GOTO_ID_EDEFAULT);
				return;
			case LeveleditorPackage.DIALOG__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case LeveleditorPackage.DIALOG__DIALOGSKILLTEST:
				setDialogskilltest((DialogSkillTest)null);
				return;
			case LeveleditorPackage.DIALOG__GIVE_ITEM:
				setGiveItem(GIVE_ITEM_EDEFAULT);
				return;
			case LeveleditorPackage.DIALOG__ITEM:
				setItem((Item)null);
				return;
			case LeveleditorPackage.DIALOG__QUEST:
				setQuest((Quest)null);
				return;
			case LeveleditorPackage.DIALOG__IS_ATTACKING:
				setIsAttacking(IS_ATTACKING_EDEFAULT);
				return;
			case LeveleditorPackage.DIALOG__EVENT:
				setEvent(EVENT_EDEFAULT);
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
			case LeveleditorPackage.DIALOG__OPTIONTEXT:
				return OPTIONTEXT_EDEFAULT == null ? optiontext != null : !OPTIONTEXT_EDEFAULT.equals(optiontext);
			case LeveleditorPackage.DIALOG__ANSWERTEXT:
				return ANSWERTEXT_EDEFAULT == null ? answertext != null : !ANSWERTEXT_EDEFAULT.equals(answertext);
			case LeveleditorPackage.DIALOG__ID:
				return id != ID_EDEFAULT;
			case LeveleditorPackage.DIALOG__GOTO_ID:
				return gotoId != GOTO_ID_EDEFAULT;
			case LeveleditorPackage.DIALOG__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
			case LeveleditorPackage.DIALOG__DIALOGSKILLTEST:
				return dialogskilltest != null;
			case LeveleditorPackage.DIALOG__GIVE_ITEM:
				return giveItem != GIVE_ITEM_EDEFAULT;
			case LeveleditorPackage.DIALOG__ITEM:
				return item != null;
			case LeveleditorPackage.DIALOG__QUEST:
				return quest != null;
			case LeveleditorPackage.DIALOG__IS_ATTACKING:
				return isAttacking != IS_ATTACKING_EDEFAULT;
			case LeveleditorPackage.DIALOG__EVENT:
				return event != EVENT_EDEFAULT;
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
		result.append(" (optiontext: ");
		result.append(optiontext);
		result.append(", answertext: ");
		result.append(answertext);
		result.append(", id: ");
		result.append(id);
		result.append(", gotoId: ");
		result.append(gotoId);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(", giveItem: ");
		result.append(giveItem);
		result.append(", isAttacking: ");
		result.append(isAttacking);
		result.append(", event: ");
		result.append(event);
		result.append(')');
		return result.toString();
	}

} //DialogImpl
