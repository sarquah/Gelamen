/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import Leveleditor.ERoomEventAction;
import Leveleditor.ERoomEventCondition;
import Leveleditor.Enemy;
import Leveleditor.Item;
import Leveleditor.LeveleditorPackage;
import Leveleditor.NPC;
import Leveleditor.Quest;
import Leveleditor.Room;
import Leveleditor.RoomEvent;
import Leveleditor.Trap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getAction <em>Action</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#isIsEnemyDead <em>Is Enemy Dead</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#isIsItemused <em>Is Itemused</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getItemtaken <em>Itemtaken</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#isIsItemtaken <em>Is Itemtaken</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getRoomenteredtimes <em>Roomenteredtimes</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getEnemyattack <em>Enemyattack</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getRoomdescription <em>Roomdescription</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getTrap <em>Trap</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getTrapdescription <em>Trapdescription</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getReceivedItem <em>Received Item</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getItemUsed <em>Item Used</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getPlaceenemy <em>Placeenemy</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getNpc <em>Npc</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getHP <em>HP</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#isFinishedtalking <em>Finishedtalking</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getNpcGotoId <em>Npc Goto Id</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getHiddenroomfound <em>Hiddenroomfound</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomEventImpl#getQuest <em>Quest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomEventImpl extends EObjectImpl implements RoomEvent {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final ERoomEventCondition CONDITION_EDEFAULT = ERoomEventCondition.ENEMY_DIED;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ERoomEventCondition condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final ERoomEventAction ACTION_EDEFAULT = ERoomEventAction.ENEMY_ATTACK;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ERoomEventAction action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEnemyDead() <em>Is Enemy Dead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnemyDead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENEMY_DEAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnemyDead() <em>Is Enemy Dead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnemyDead()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnemyDead = IS_ENEMY_DEAD_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsItemused() <em>Is Itemused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItemused()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ITEMUSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsItemused() <em>Is Itemused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItemused()
	 * @generated
	 * @ordered
	 */
	protected boolean isItemused = IS_ITEMUSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItemtaken() <em>Itemtaken</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemtaken()
	 * @generated
	 * @ordered
	 */
	protected Item itemtaken;

	/**
	 * The default value of the '{@link #isIsItemtaken() <em>Is Itemtaken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItemtaken()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ITEMTAKEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsItemtaken() <em>Is Itemtaken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItemtaken()
	 * @generated
	 * @ordered
	 */
	protected boolean isItemtaken = IS_ITEMTAKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomenteredtimes() <em>Roomenteredtimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomenteredtimes()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOMENTEREDTIMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomenteredtimes() <em>Roomenteredtimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomenteredtimes()
	 * @generated
	 * @ordered
	 */
	protected int roomenteredtimes = ROOMENTEREDTIMES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnemyattack() <em>Enemyattack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnemyattack()
	 * @generated
	 * @ordered
	 */
	protected Enemy enemyattack;

	/**
	 * The default value of the '{@link #getRoomdescription() <em>Roomdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomdescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOMDESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomdescription() <em>Roomdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomdescription()
	 * @generated
	 * @ordered
	 */
	protected String roomdescription = ROOMDESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrap() <em>Trap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrap()
	 * @generated
	 * @ordered
	 */
	protected Trap trap;

	/**
	 * The default value of the '{@link #getTrapdescription() <em>Trapdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrapdescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAPDESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrapdescription() <em>Trapdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrapdescription()
	 * @generated
	 * @ordered
	 */
	protected String trapdescription = TRAPDESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceivedItem() <em>Received Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedItem()
	 * @generated
	 * @ordered
	 */
	protected Item receivedItem;

	/**
	 * The cached value of the '{@link #getItemUsed() <em>Item Used</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemUsed()
	 * @generated
	 * @ordered
	 */
	protected Item itemUsed;

	/**
	 * The cached value of the '{@link #getPlaceenemy() <em>Placeenemy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceenemy()
	 * @generated
	 * @ordered
	 */
	protected Enemy placeenemy;

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
	 * The cached value of the '{@link #getNpc() <em>Npc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNpc()
	 * @generated
	 * @ordered
	 */
	protected NPC npc;

	/**
	 * The default value of the '{@link #getHP() <em>HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHP()
	 * @generated
	 * @ordered
	 */
	protected static final int HP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHP() <em>HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHP()
	 * @generated
	 * @ordered
	 */
	protected int hp = HP_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinishedtalking() <em>Finishedtalking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinishedtalking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINISHEDTALKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinishedtalking() <em>Finishedtalking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinishedtalking()
	 * @generated
	 * @ordered
	 */
	protected boolean finishedtalking = FINISHEDTALKING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNpcGotoId() <em>Npc Goto Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNpcGotoId()
	 * @generated
	 * @ordered
	 */
	protected static final int NPC_GOTO_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNpcGotoId() <em>Npc Goto Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNpcGotoId()
	 * @generated
	 * @ordered
	 */
	protected int npcGotoId = NPC_GOTO_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHiddenroomfound() <em>Hiddenroomfound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenroomfound()
	 * @generated
	 * @ordered
	 */
	protected Room hiddenroomfound;

	/**
	 * The cached value of the '{@link #getQuest() <em>Quest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuest()
	 * @generated
	 * @ordered
	 */
	protected Quest quest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.ROOM_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERoomEventCondition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(ERoomEventCondition newCondition) {
		ERoomEventCondition oldCondition = condition;
		condition = newCondition == null ? CONDITION_EDEFAULT : newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERoomEventAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ERoomEventAction newAction) {
		ERoomEventAction oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnemyDead() {
		return isEnemyDead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnemyDead(boolean newIsEnemyDead) {
		boolean oldIsEnemyDead = isEnemyDead;
		isEnemyDead = newIsEnemyDead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__IS_ENEMY_DEAD, oldIsEnemyDead, isEnemyDead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsItemused() {
		return isItemused;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsItemused(boolean newIsItemused) {
		boolean oldIsItemused = isItemused;
		isItemused = newIsItemused;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__IS_ITEMUSED, oldIsItemused, isItemused));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getHiddenroomfound() {
		if (hiddenroomfound != null && hiddenroomfound.eIsProxy()) {
			InternalEObject oldHiddenroomfound = (InternalEObject)hiddenroomfound;
			hiddenroomfound = (Room)eResolveProxy(oldHiddenroomfound);
			if (hiddenroomfound != oldHiddenroomfound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ROOM_EVENT__HIDDENROOMFOUND, oldHiddenroomfound, hiddenroomfound));
			}
		}
		return hiddenroomfound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetHiddenroomfound() {
		return hiddenroomfound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiddenroomfound(Room newHiddenroomfound) {
		Room oldHiddenroomfound = hiddenroomfound;
		hiddenroomfound = newHiddenroomfound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__HIDDENROOMFOUND, oldHiddenroomfound, hiddenroomfound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quest getQuest() {
		if (quest != null && quest.eIsProxy()) {
			InternalEObject oldQuest = (InternalEObject)quest;
			quest = (Quest)eResolveProxy(oldQuest);
			if (quest != oldQuest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ROOM_EVENT__QUEST, oldQuest, quest));
			}
		}
		return quest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quest basicGetQuest() {
		return quest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuest(Quest newQuest) {
		Quest oldQuest = quest;
		quest = newQuest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__QUEST, oldQuest, quest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getItemUsed() {
		if (itemUsed != null && itemUsed.eIsProxy()) {
			InternalEObject oldItemUsed = (InternalEObject)itemUsed;
			itemUsed = (Item)eResolveProxy(oldItemUsed);
			if (itemUsed != oldItemUsed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ROOM_EVENT__ITEM_USED, oldItemUsed, itemUsed));
			}
		}
		return itemUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetItemUsed() {
		return itemUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemUsed(Item newItemUsed) {
		Item oldItemUsed = itemUsed;
		itemUsed = newItemUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__ITEM_USED, oldItemUsed, itemUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enemy getPlaceenemy() {
		if (placeenemy != null && placeenemy.eIsProxy()) {
			InternalEObject oldPlaceenemy = (InternalEObject)placeenemy;
			placeenemy = (Enemy)eResolveProxy(oldPlaceenemy);
			if (placeenemy != oldPlaceenemy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ROOM_EVENT__PLACEENEMY, oldPlaceenemy, placeenemy));
			}
		}
		return placeenemy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enemy basicGetPlaceenemy() {
		return placeenemy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceenemy(Enemy newPlaceenemy) {
		Enemy oldPlaceenemy = placeenemy;
		placeenemy = newPlaceenemy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__PLACEENEMY, oldPlaceenemy, placeenemy));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ROOM_EVENT__ROOM, oldRoom, room));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPC getNpc() {
		if (npc != null && npc.eIsProxy()) {
			InternalEObject oldNpc = (InternalEObject)npc;
			npc = (NPC)eResolveProxy(oldNpc);
			if (npc != oldNpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ROOM_EVENT__NPC, oldNpc, npc));
			}
		}
		return npc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPC basicGetNpc() {
		return npc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNpc(NPC newNpc) {
		NPC oldNpc = npc;
		npc = newNpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__NPC, oldNpc, npc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHP() {
		return hp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHP(int newHP) {
		int oldHP = hp;
		hp = newHP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__HP, oldHP, hp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinishedtalking() {
		return finishedtalking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishedtalking(boolean newFinishedtalking) {
		boolean oldFinishedtalking = finishedtalking;
		finishedtalking = newFinishedtalking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__FINISHEDTALKING, oldFinishedtalking, finishedtalking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNpcGotoId() {
		return npcGotoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNpcGotoId(int newNpcGotoId) {
		int oldNpcGotoId = npcGotoId;
		npcGotoId = newNpcGotoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__NPC_GOTO_ID, oldNpcGotoId, npcGotoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getItemtaken() {
		if (itemtaken != null && itemtaken.eIsProxy()) {
			InternalEObject oldItemtaken = (InternalEObject)itemtaken;
			itemtaken = (Item)eResolveProxy(oldItemtaken);
			if (itemtaken != oldItemtaken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ROOM_EVENT__ITEMTAKEN, oldItemtaken, itemtaken));
			}
		}
		return itemtaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetItemtaken() {
		return itemtaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemtaken(Item newItemtaken) {
		Item oldItemtaken = itemtaken;
		itemtaken = newItemtaken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__ITEMTAKEN, oldItemtaken, itemtaken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsItemtaken() {
		return isItemtaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsItemtaken(boolean newIsItemtaken) {
		boolean oldIsItemtaken = isItemtaken;
		isItemtaken = newIsItemtaken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__IS_ITEMTAKEN, oldIsItemtaken, isItemtaken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomenteredtimes() {
		return roomenteredtimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomenteredtimes(int newRoomenteredtimes) {
		int oldRoomenteredtimes = roomenteredtimes;
		roomenteredtimes = newRoomenteredtimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__ROOMENTEREDTIMES, oldRoomenteredtimes, roomenteredtimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enemy getEnemyattack() {
		if (enemyattack != null && enemyattack.eIsProxy()) {
			InternalEObject oldEnemyattack = (InternalEObject)enemyattack;
			enemyattack = (Enemy)eResolveProxy(oldEnemyattack);
			if (enemyattack != oldEnemyattack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ROOM_EVENT__ENEMYATTACK, oldEnemyattack, enemyattack));
			}
		}
		return enemyattack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enemy basicGetEnemyattack() {
		return enemyattack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnemyattack(Enemy newEnemyattack) {
		Enemy oldEnemyattack = enemyattack;
		enemyattack = newEnemyattack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__ENEMYATTACK, oldEnemyattack, enemyattack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomdescription() {
		return roomdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomdescription(String newRoomdescription) {
		String oldRoomdescription = roomdescription;
		roomdescription = newRoomdescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__ROOMDESCRIPTION, oldRoomdescription, roomdescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trap getTrap() {
		return trap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrap(Trap newTrap, NotificationChain msgs) {
		Trap oldTrap = trap;
		trap = newTrap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__TRAP, oldTrap, newTrap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrap(Trap newTrap) {
		if (newTrap != trap) {
			NotificationChain msgs = null;
			if (trap != null)
				msgs = ((InternalEObject)trap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.ROOM_EVENT__TRAP, null, msgs);
			if (newTrap != null)
				msgs = ((InternalEObject)newTrap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.ROOM_EVENT__TRAP, null, msgs);
			msgs = basicSetTrap(newTrap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__TRAP, newTrap, newTrap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrapdescription() {
		return trapdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrapdescription(String newTrapdescription) {
		String oldTrapdescription = trapdescription;
		trapdescription = newTrapdescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__TRAPDESCRIPTION, oldTrapdescription, trapdescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getReceivedItem() {
		return receivedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivedItem(Item newReceivedItem, NotificationChain msgs) {
		Item oldReceivedItem = receivedItem;
		receivedItem = newReceivedItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__RECEIVED_ITEM, oldReceivedItem, newReceivedItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedItem(Item newReceivedItem) {
		if (newReceivedItem != receivedItem) {
			NotificationChain msgs = null;
			if (receivedItem != null)
				msgs = ((InternalEObject)receivedItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.ROOM_EVENT__RECEIVED_ITEM, null, msgs);
			if (newReceivedItem != null)
				msgs = ((InternalEObject)newReceivedItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeveleditorPackage.ROOM_EVENT__RECEIVED_ITEM, null, msgs);
			msgs = basicSetReceivedItem(newReceivedItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM_EVENT__RECEIVED_ITEM, newReceivedItem, newReceivedItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeveleditorPackage.ROOM_EVENT__TRAP:
				return basicSetTrap(null, msgs);
			case LeveleditorPackage.ROOM_EVENT__RECEIVED_ITEM:
				return basicSetReceivedItem(null, msgs);
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
			case LeveleditorPackage.ROOM_EVENT__CONDITION:
				return getCondition();
			case LeveleditorPackage.ROOM_EVENT__ACTION:
				return getAction();
			case LeveleditorPackage.ROOM_EVENT__IS_ENEMY_DEAD:
				return isIsEnemyDead();
			case LeveleditorPackage.ROOM_EVENT__IS_ITEMUSED:
				return isIsItemused();
			case LeveleditorPackage.ROOM_EVENT__ITEMTAKEN:
				if (resolve) return getItemtaken();
				return basicGetItemtaken();
			case LeveleditorPackage.ROOM_EVENT__IS_ITEMTAKEN:
				return isIsItemtaken();
			case LeveleditorPackage.ROOM_EVENT__ROOMENTEREDTIMES:
				return getRoomenteredtimes();
			case LeveleditorPackage.ROOM_EVENT__ENEMYATTACK:
				if (resolve) return getEnemyattack();
				return basicGetEnemyattack();
			case LeveleditorPackage.ROOM_EVENT__ROOMDESCRIPTION:
				return getRoomdescription();
			case LeveleditorPackage.ROOM_EVENT__TRAP:
				return getTrap();
			case LeveleditorPackage.ROOM_EVENT__TRAPDESCRIPTION:
				return getTrapdescription();
			case LeveleditorPackage.ROOM_EVENT__RECEIVED_ITEM:
				return getReceivedItem();
			case LeveleditorPackage.ROOM_EVENT__ITEM_USED:
				if (resolve) return getItemUsed();
				return basicGetItemUsed();
			case LeveleditorPackage.ROOM_EVENT__PLACEENEMY:
				if (resolve) return getPlaceenemy();
				return basicGetPlaceenemy();
			case LeveleditorPackage.ROOM_EVENT__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case LeveleditorPackage.ROOM_EVENT__NPC:
				if (resolve) return getNpc();
				return basicGetNpc();
			case LeveleditorPackage.ROOM_EVENT__HP:
				return getHP();
			case LeveleditorPackage.ROOM_EVENT__FINISHEDTALKING:
				return isFinishedtalking();
			case LeveleditorPackage.ROOM_EVENT__NPC_GOTO_ID:
				return getNpcGotoId();
			case LeveleditorPackage.ROOM_EVENT__HIDDENROOMFOUND:
				if (resolve) return getHiddenroomfound();
				return basicGetHiddenroomfound();
			case LeveleditorPackage.ROOM_EVENT__QUEST:
				if (resolve) return getQuest();
				return basicGetQuest();
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
			case LeveleditorPackage.ROOM_EVENT__CONDITION:
				setCondition((ERoomEventCondition)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__ACTION:
				setAction((ERoomEventAction)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__IS_ENEMY_DEAD:
				setIsEnemyDead((Boolean)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__IS_ITEMUSED:
				setIsItemused((Boolean)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__ITEMTAKEN:
				setItemtaken((Item)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__IS_ITEMTAKEN:
				setIsItemtaken((Boolean)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__ROOMENTEREDTIMES:
				setRoomenteredtimes((Integer)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__ENEMYATTACK:
				setEnemyattack((Enemy)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__ROOMDESCRIPTION:
				setRoomdescription((String)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__TRAP:
				setTrap((Trap)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__TRAPDESCRIPTION:
				setTrapdescription((String)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__RECEIVED_ITEM:
				setReceivedItem((Item)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__ITEM_USED:
				setItemUsed((Item)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__PLACEENEMY:
				setPlaceenemy((Enemy)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__ROOM:
				setRoom((Room)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__NPC:
				setNpc((NPC)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__HP:
				setHP((Integer)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__FINISHEDTALKING:
				setFinishedtalking((Boolean)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__NPC_GOTO_ID:
				setNpcGotoId((Integer)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__HIDDENROOMFOUND:
				setHiddenroomfound((Room)newValue);
				return;
			case LeveleditorPackage.ROOM_EVENT__QUEST:
				setQuest((Quest)newValue);
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
			case LeveleditorPackage.ROOM_EVENT__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM_EVENT__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM_EVENT__IS_ENEMY_DEAD:
				setIsEnemyDead(IS_ENEMY_DEAD_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM_EVENT__IS_ITEMUSED:
				setIsItemused(IS_ITEMUSED_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM_EVENT__ITEMTAKEN:
				setItemtaken((Item)null);
				return;
			case LeveleditorPackage.ROOM_EVENT__IS_ITEMTAKEN:
				setIsItemtaken(IS_ITEMTAKEN_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM_EVENT__ROOMENTEREDTIMES:
				setRoomenteredtimes(ROOMENTEREDTIMES_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM_EVENT__ENEMYATTACK:
				setEnemyattack((Enemy)null);
				return;
			case LeveleditorPackage.ROOM_EVENT__ROOMDESCRIPTION:
				setRoomdescription(ROOMDESCRIPTION_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM_EVENT__TRAP:
				setTrap((Trap)null);
				return;
			case LeveleditorPackage.ROOM_EVENT__TRAPDESCRIPTION:
				setTrapdescription(TRAPDESCRIPTION_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM_EVENT__RECEIVED_ITEM:
				setReceivedItem((Item)null);
				return;
			case LeveleditorPackage.ROOM_EVENT__ITEM_USED:
				setItemUsed((Item)null);
				return;
			case LeveleditorPackage.ROOM_EVENT__PLACEENEMY:
				setPlaceenemy((Enemy)null);
				return;
			case LeveleditorPackage.ROOM_EVENT__ROOM:
				setRoom((Room)null);
				return;
			case LeveleditorPackage.ROOM_EVENT__NPC:
				setNpc((NPC)null);
				return;
			case LeveleditorPackage.ROOM_EVENT__HP:
				setHP(HP_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM_EVENT__FINISHEDTALKING:
				setFinishedtalking(FINISHEDTALKING_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM_EVENT__NPC_GOTO_ID:
				setNpcGotoId(NPC_GOTO_ID_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM_EVENT__HIDDENROOMFOUND:
				setHiddenroomfound((Room)null);
				return;
			case LeveleditorPackage.ROOM_EVENT__QUEST:
				setQuest((Quest)null);
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
			case LeveleditorPackage.ROOM_EVENT__CONDITION:
				return condition != CONDITION_EDEFAULT;
			case LeveleditorPackage.ROOM_EVENT__ACTION:
				return action != ACTION_EDEFAULT;
			case LeveleditorPackage.ROOM_EVENT__IS_ENEMY_DEAD:
				return isEnemyDead != IS_ENEMY_DEAD_EDEFAULT;
			case LeveleditorPackage.ROOM_EVENT__IS_ITEMUSED:
				return isItemused != IS_ITEMUSED_EDEFAULT;
			case LeveleditorPackage.ROOM_EVENT__ITEMTAKEN:
				return itemtaken != null;
			case LeveleditorPackage.ROOM_EVENT__IS_ITEMTAKEN:
				return isItemtaken != IS_ITEMTAKEN_EDEFAULT;
			case LeveleditorPackage.ROOM_EVENT__ROOMENTEREDTIMES:
				return roomenteredtimes != ROOMENTEREDTIMES_EDEFAULT;
			case LeveleditorPackage.ROOM_EVENT__ENEMYATTACK:
				return enemyattack != null;
			case LeveleditorPackage.ROOM_EVENT__ROOMDESCRIPTION:
				return ROOMDESCRIPTION_EDEFAULT == null ? roomdescription != null : !ROOMDESCRIPTION_EDEFAULT.equals(roomdescription);
			case LeveleditorPackage.ROOM_EVENT__TRAP:
				return trap != null;
			case LeveleditorPackage.ROOM_EVENT__TRAPDESCRIPTION:
				return TRAPDESCRIPTION_EDEFAULT == null ? trapdescription != null : !TRAPDESCRIPTION_EDEFAULT.equals(trapdescription);
			case LeveleditorPackage.ROOM_EVENT__RECEIVED_ITEM:
				return receivedItem != null;
			case LeveleditorPackage.ROOM_EVENT__ITEM_USED:
				return itemUsed != null;
			case LeveleditorPackage.ROOM_EVENT__PLACEENEMY:
				return placeenemy != null;
			case LeveleditorPackage.ROOM_EVENT__ROOM:
				return room != null;
			case LeveleditorPackage.ROOM_EVENT__NPC:
				return npc != null;
			case LeveleditorPackage.ROOM_EVENT__HP:
				return hp != HP_EDEFAULT;
			case LeveleditorPackage.ROOM_EVENT__FINISHEDTALKING:
				return finishedtalking != FINISHEDTALKING_EDEFAULT;
			case LeveleditorPackage.ROOM_EVENT__NPC_GOTO_ID:
				return npcGotoId != NPC_GOTO_ID_EDEFAULT;
			case LeveleditorPackage.ROOM_EVENT__HIDDENROOMFOUND:
				return hiddenroomfound != null;
			case LeveleditorPackage.ROOM_EVENT__QUEST:
				return quest != null;
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(", action: ");
		result.append(action);
		result.append(", isEnemyDead: ");
		result.append(isEnemyDead);
		result.append(", isItemused: ");
		result.append(isItemused);
		result.append(", isItemtaken: ");
		result.append(isItemtaken);
		result.append(", roomenteredtimes: ");
		result.append(roomenteredtimes);
		result.append(", roomdescription: ");
		result.append(roomdescription);
		result.append(", trapdescription: ");
		result.append(trapdescription);
		result.append(", HP: ");
		result.append(hp);
		result.append(", finishedtalking: ");
		result.append(finishedtalking);
		result.append(", npcGotoId: ");
		result.append(npcGotoId);
		result.append(')');
		return result.toString();
	}

} //RoomEventImpl
