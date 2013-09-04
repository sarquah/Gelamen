/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import Leveleditor.ERoomEventCondition;
import Leveleditor.Enemy;
import Leveleditor.Item;
import Leveleditor.LeveleditorPackage;
import Leveleditor.NPC;
import Leveleditor.Quest;

import Leveleditor.Room;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.QuestImpl#getId <em>Id</em>}</li>
 *   <li>{@link Leveleditor.impl.QuestImpl#getIntroduction <em>Introduction</em>}</li>
 *   <li>{@link Leveleditor.impl.QuestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Leveleditor.impl.QuestImpl#getCompleteText <em>Complete Text</em>}</li>
 *   <li>{@link Leveleditor.impl.QuestImpl#getQuestCondition <em>Quest Condition</em>}</li>
 *   <li>{@link Leveleditor.impl.QuestImpl#getQuestItem <em>Quest Item</em>}</li>
 *   <li>{@link Leveleditor.impl.QuestImpl#isIsComplete <em>Is Complete</em>}</li>
 *   <li>{@link Leveleditor.impl.QuestImpl#getXpEarned <em>Xp Earned</em>}</li>
 *   <li>{@link Leveleditor.impl.QuestImpl#getAwardItem <em>Award Item</em>}</li>
 *   <li>{@link Leveleditor.impl.QuestImpl#getNpcGivenby <em>Npc Givenby</em>}</li>
 *   <li>{@link Leveleditor.impl.QuestImpl#getEnemydead <em>Enemydead</em>}</li>
 *   <li>{@link Leveleditor.impl.QuestImpl#getDialogid <em>Dialogid</em>}</li>
 *   <li>{@link Leveleditor.impl.QuestImpl#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestImpl extends EObjectImpl implements Quest {
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
	 * The default value of the '{@link #getIntroduction() <em>Introduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroduction()
	 * @generated
	 * @ordered
	 */
	protected static final String INTRODUCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntroduction() <em>Introduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroduction()
	 * @generated
	 * @ordered
	 */
	protected String introduction = INTRODUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompleteText() <em>Complete Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteText()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompleteText() <em>Complete Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteText()
	 * @generated
	 * @ordered
	 */
	protected String completeText = COMPLETE_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuestCondition() <em>Quest Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestCondition()
	 * @generated
	 * @ordered
	 */
	protected static final ERoomEventCondition QUEST_CONDITION_EDEFAULT = ERoomEventCondition.ENEMY_DIED;

	/**
	 * The cached value of the '{@link #getQuestCondition() <em>Quest Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestCondition()
	 * @generated
	 * @ordered
	 */
	protected ERoomEventCondition questCondition = QUEST_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuestItem() <em>Quest Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestItem()
	 * @generated
	 * @ordered
	 */
	protected Item questItem;

	/**
	 * The default value of the '{@link #isIsComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean isComplete = IS_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXpEarned() <em>Xp Earned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpEarned()
	 * @generated
	 * @ordered
	 */
	protected static final int XP_EARNED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXpEarned() <em>Xp Earned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpEarned()
	 * @generated
	 * @ordered
	 */
	protected int xpEarned = XP_EARNED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAwardItem() <em>Award Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwardItem()
	 * @generated
	 * @ordered
	 */
	protected Item awardItem;

	/**
	 * The cached value of the '{@link #getNpcGivenby() <em>Npc Givenby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNpcGivenby()
	 * @generated
	 * @ordered
	 */
	protected NPC npcGivenby;

	/**
	 * The cached value of the '{@link #getEnemydead() <em>Enemydead</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnemydead()
	 * @generated
	 * @ordered
	 */
	protected Enemy enemydead;

	/**
	 * The default value of the '{@link #getDialogid() <em>Dialogid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogid()
	 * @generated
	 * @ordered
	 */
	protected static final int DIALOGID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDialogid() <em>Dialogid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogid()
	 * @generated
	 * @ordered
	 */
	protected int dialogid = DIALOGID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.QUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntroduction() {
		return introduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntroduction(String newIntroduction) {
		String oldIntroduction = introduction;
		introduction = newIntroduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__INTRODUCTION, oldIntroduction, introduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompleteText() {
		return completeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteText(String newCompleteText) {
		String oldCompleteText = completeText;
		completeText = newCompleteText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__COMPLETE_TEXT, oldCompleteText, completeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERoomEventCondition getQuestCondition() {
		return questCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestCondition(ERoomEventCondition newQuestCondition) {
		ERoomEventCondition oldQuestCondition = questCondition;
		questCondition = newQuestCondition == null ? QUEST_CONDITION_EDEFAULT : newQuestCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__QUEST_CONDITION, oldQuestCondition, questCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enemy getEnemydead() {
		if (enemydead != null && enemydead.eIsProxy()) {
			InternalEObject oldEnemydead = (InternalEObject)enemydead;
			enemydead = (Enemy)eResolveProxy(oldEnemydead);
			if (enemydead != oldEnemydead) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.QUEST__ENEMYDEAD, oldEnemydead, enemydead));
			}
		}
		return enemydead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enemy basicGetEnemydead() {
		return enemydead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnemydead(Enemy newEnemydead) {
		Enemy oldEnemydead = enemydead;
		enemydead = newEnemydead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__ENEMYDEAD, oldEnemydead, enemydead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDialogid() {
		return dialogid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialogid(int newDialogid) {
		int oldDialogid = dialogid;
		dialogid = newDialogid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__DIALOGID, oldDialogid, dialogid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.QUEST__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getQuestItem() {
		if (questItem != null && questItem.eIsProxy()) {
			InternalEObject oldQuestItem = (InternalEObject)questItem;
			questItem = (Item)eResolveProxy(oldQuestItem);
			if (questItem != oldQuestItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.QUEST__QUEST_ITEM, oldQuestItem, questItem));
			}
		}
		return questItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetQuestItem() {
		return questItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestItem(Item newQuestItem) {
		Item oldQuestItem = questItem;
		questItem = newQuestItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__QUEST_ITEM, oldQuestItem, questItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComplete() {
		return isComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComplete(boolean newIsComplete) {
		boolean oldIsComplete = isComplete;
		isComplete = newIsComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__IS_COMPLETE, oldIsComplete, isComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXpEarned() {
		return xpEarned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpEarned(int newXpEarned) {
		int oldXpEarned = xpEarned;
		xpEarned = newXpEarned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__XP_EARNED, oldXpEarned, xpEarned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getAwardItem() {
		return awardItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwardItem(Item newAwardItem, NotificationChain msgs) {
		Item oldAwardItem = awardItem;
		awardItem = newAwardItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__AWARD_ITEM, oldAwardItem, newAwardItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwardItem(Item newAwardItem) {
		if (newAwardItem != awardItem) {
			NotificationChain msgs = null;
			if (awardItem != null)
				msgs = ((InternalEObject)awardItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.QUEST__AWARD_ITEM, null, msgs);
			if (newAwardItem != null)
				msgs = ((InternalEObject)newAwardItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.QUEST__AWARD_ITEM, null, msgs);
			msgs = basicSetAwardItem(newAwardItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__AWARD_ITEM, newAwardItem, newAwardItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPC getNpcGivenby() {
		if (npcGivenby != null && npcGivenby.eIsProxy()) {
			InternalEObject oldNpcGivenby = (InternalEObject)npcGivenby;
			npcGivenby = (NPC)eResolveProxy(oldNpcGivenby);
			if (npcGivenby != oldNpcGivenby) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.QUEST__NPC_GIVENBY, oldNpcGivenby, npcGivenby));
			}
		}
		return npcGivenby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPC basicGetNpcGivenby() {
		return npcGivenby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNpcGivenby(NPC newNpcGivenby) {
		NPC oldNpcGivenby = npcGivenby;
		npcGivenby = newNpcGivenby;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.QUEST__NPC_GIVENBY, oldNpcGivenby, npcGivenby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeveleditorPackage.QUEST__AWARD_ITEM:
				return basicSetAwardItem(null, msgs);
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
			case LeveleditorPackage.QUEST__ID:
				return getId();
			case LeveleditorPackage.QUEST__INTRODUCTION:
				return getIntroduction();
			case LeveleditorPackage.QUEST__DESCRIPTION:
				return getDescription();
			case LeveleditorPackage.QUEST__COMPLETE_TEXT:
				return getCompleteText();
			case LeveleditorPackage.QUEST__QUEST_CONDITION:
				return getQuestCondition();
			case LeveleditorPackage.QUEST__QUEST_ITEM:
				if (resolve) return getQuestItem();
				return basicGetQuestItem();
			case LeveleditorPackage.QUEST__IS_COMPLETE:
				return isIsComplete();
			case LeveleditorPackage.QUEST__XP_EARNED:
				return getXpEarned();
			case LeveleditorPackage.QUEST__AWARD_ITEM:
				return getAwardItem();
			case LeveleditorPackage.QUEST__NPC_GIVENBY:
				if (resolve) return getNpcGivenby();
				return basicGetNpcGivenby();
			case LeveleditorPackage.QUEST__ENEMYDEAD:
				if (resolve) return getEnemydead();
				return basicGetEnemydead();
			case LeveleditorPackage.QUEST__DIALOGID:
				return getDialogid();
			case LeveleditorPackage.QUEST__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
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
			case LeveleditorPackage.QUEST__ID:
				setId((Integer)newValue);
				return;
			case LeveleditorPackage.QUEST__INTRODUCTION:
				setIntroduction((String)newValue);
				return;
			case LeveleditorPackage.QUEST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LeveleditorPackage.QUEST__COMPLETE_TEXT:
				setCompleteText((String)newValue);
				return;
			case LeveleditorPackage.QUEST__QUEST_CONDITION:
				setQuestCondition((ERoomEventCondition)newValue);
				return;
			case LeveleditorPackage.QUEST__QUEST_ITEM:
				setQuestItem((Item)newValue);
				return;
			case LeveleditorPackage.QUEST__IS_COMPLETE:
				setIsComplete((Boolean)newValue);
				return;
			case LeveleditorPackage.QUEST__XP_EARNED:
				setXpEarned((Integer)newValue);
				return;
			case LeveleditorPackage.QUEST__AWARD_ITEM:
				setAwardItem((Item)newValue);
				return;
			case LeveleditorPackage.QUEST__NPC_GIVENBY:
				setNpcGivenby((NPC)newValue);
				return;
			case LeveleditorPackage.QUEST__ENEMYDEAD:
				setEnemydead((Enemy)newValue);
				return;
			case LeveleditorPackage.QUEST__DIALOGID:
				setDialogid((Integer)newValue);
				return;
			case LeveleditorPackage.QUEST__ROOM:
				setRoom((Room)newValue);
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
			case LeveleditorPackage.QUEST__ID:
				setId(ID_EDEFAULT);
				return;
			case LeveleditorPackage.QUEST__INTRODUCTION:
				setIntroduction(INTRODUCTION_EDEFAULT);
				return;
			case LeveleditorPackage.QUEST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LeveleditorPackage.QUEST__COMPLETE_TEXT:
				setCompleteText(COMPLETE_TEXT_EDEFAULT);
				return;
			case LeveleditorPackage.QUEST__QUEST_CONDITION:
				setQuestCondition(QUEST_CONDITION_EDEFAULT);
				return;
			case LeveleditorPackage.QUEST__QUEST_ITEM:
				setQuestItem((Item)null);
				return;
			case LeveleditorPackage.QUEST__IS_COMPLETE:
				setIsComplete(IS_COMPLETE_EDEFAULT);
				return;
			case LeveleditorPackage.QUEST__XP_EARNED:
				setXpEarned(XP_EARNED_EDEFAULT);
				return;
			case LeveleditorPackage.QUEST__AWARD_ITEM:
				setAwardItem((Item)null);
				return;
			case LeveleditorPackage.QUEST__NPC_GIVENBY:
				setNpcGivenby((NPC)null);
				return;
			case LeveleditorPackage.QUEST__ENEMYDEAD:
				setEnemydead((Enemy)null);
				return;
			case LeveleditorPackage.QUEST__DIALOGID:
				setDialogid(DIALOGID_EDEFAULT);
				return;
			case LeveleditorPackage.QUEST__ROOM:
				setRoom((Room)null);
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
			case LeveleditorPackage.QUEST__ID:
				return id != ID_EDEFAULT;
			case LeveleditorPackage.QUEST__INTRODUCTION:
				return INTRODUCTION_EDEFAULT == null ? introduction != null : !INTRODUCTION_EDEFAULT.equals(introduction);
			case LeveleditorPackage.QUEST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LeveleditorPackage.QUEST__COMPLETE_TEXT:
				return COMPLETE_TEXT_EDEFAULT == null ? completeText != null : !COMPLETE_TEXT_EDEFAULT.equals(completeText);
			case LeveleditorPackage.QUEST__QUEST_CONDITION:
				return questCondition != QUEST_CONDITION_EDEFAULT;
			case LeveleditorPackage.QUEST__QUEST_ITEM:
				return questItem != null;
			case LeveleditorPackage.QUEST__IS_COMPLETE:
				return isComplete != IS_COMPLETE_EDEFAULT;
			case LeveleditorPackage.QUEST__XP_EARNED:
				return xpEarned != XP_EARNED_EDEFAULT;
			case LeveleditorPackage.QUEST__AWARD_ITEM:
				return awardItem != null;
			case LeveleditorPackage.QUEST__NPC_GIVENBY:
				return npcGivenby != null;
			case LeveleditorPackage.QUEST__ENEMYDEAD:
				return enemydead != null;
			case LeveleditorPackage.QUEST__DIALOGID:
				return dialogid != DIALOGID_EDEFAULT;
			case LeveleditorPackage.QUEST__ROOM:
				return room != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", introduction: ");
		result.append(introduction);
		result.append(", description: ");
		result.append(description);
		result.append(", completeText: ");
		result.append(completeText);
		result.append(", questCondition: ");
		result.append(questCondition);
		result.append(", isComplete: ");
		result.append(isComplete);
		result.append(", xpEarned: ");
		result.append(xpEarned);
		result.append(", dialogid: ");
		result.append(dialogid);
		result.append(')');
		return result.toString();
	}

} //QuestImpl
