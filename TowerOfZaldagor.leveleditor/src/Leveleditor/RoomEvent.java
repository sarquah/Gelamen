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
 * A representation of the model object '<em><b>Room Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.RoomEvent#getCondition <em>Condition</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getAction <em>Action</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#isIsEnemyDead <em>Is Enemy Dead</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#isIsItemused <em>Is Itemused</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getItemtaken <em>Itemtaken</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#isIsItemtaken <em>Is Itemtaken</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getRoomenteredtimes <em>Roomenteredtimes</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getEnemyattack <em>Enemyattack</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getRoomdescription <em>Roomdescription</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getTrap <em>Trap</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getTrapdescription <em>Trapdescription</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getReceivedItem <em>Received Item</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getItemUsed <em>Item Used</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getPlaceenemy <em>Placeenemy</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getRoom <em>Room</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getNpc <em>Npc</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getHP <em>HP</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#isFinishedtalking <em>Finishedtalking</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getNpcGotoId <em>Npc Goto Id</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getHiddenroomfound <em>Hiddenroomfound</em>}</li>
 *   <li>{@link Leveleditor.RoomEvent#getQuest <em>Quest</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getRoomEvent()
 * @model
 * @generated
 */
public interface RoomEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link Leveleditor.ERoomEventCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see Leveleditor.ERoomEventCondition
	 * @see #setCondition(ERoomEventCondition)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Condition()
	 * @model
	 * @generated
	 */
	ERoomEventCondition getCondition();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see Leveleditor.ERoomEventCondition
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ERoomEventCondition value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link Leveleditor.ERoomEventAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see Leveleditor.ERoomEventAction
	 * @see #setAction(ERoomEventAction)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Action()
	 * @model
	 * @generated
	 */
	ERoomEventAction getAction();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see Leveleditor.ERoomEventAction
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ERoomEventAction value);

	/**
	 * Returns the value of the '<em><b>Is Enemy Dead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Enemy Dead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Enemy Dead</em>' attribute.
	 * @see #setIsEnemyDead(boolean)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_IsEnemyDead()
	 * @model
	 * @generated
	 */
	boolean isIsEnemyDead();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#isIsEnemyDead <em>Is Enemy Dead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Enemy Dead</em>' attribute.
	 * @see #isIsEnemyDead()
	 * @generated
	 */
	void setIsEnemyDead(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Itemused</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Itemused</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Itemused</em>' attribute.
	 * @see #setIsItemused(boolean)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_IsItemused()
	 * @model
	 * @generated
	 */
	boolean isIsItemused();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#isIsItemused <em>Is Itemused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Itemused</em>' attribute.
	 * @see #isIsItemused()
	 * @generated
	 */
	void setIsItemused(boolean value);

	/**
	 * Returns the value of the '<em><b>Hiddenroomfound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hiddenroomfound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hiddenroomfound</em>' reference.
	 * @see #setHiddenroomfound(Room)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Hiddenroomfound()
	 * @model
	 * @generated
	 */
	Room getHiddenroomfound();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getHiddenroomfound <em>Hiddenroomfound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hiddenroomfound</em>' reference.
	 * @see #getHiddenroomfound()
	 * @generated
	 */
	void setHiddenroomfound(Room value);

	/**
	 * Returns the value of the '<em><b>Quest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quest</em>' reference.
	 * @see #setQuest(Quest)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Quest()
	 * @model
	 * @generated
	 */
	Quest getQuest();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getQuest <em>Quest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quest</em>' reference.
	 * @see #getQuest()
	 * @generated
	 */
	void setQuest(Quest value);

	/**
	 * Returns the value of the '<em><b>Item Used</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Used</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Used</em>' reference.
	 * @see #setItemUsed(Item)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_ItemUsed()
	 * @model
	 * @generated
	 */
	Item getItemUsed();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getItemUsed <em>Item Used</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Used</em>' reference.
	 * @see #getItemUsed()
	 * @generated
	 */
	void setItemUsed(Item value);

	/**
	 * Returns the value of the '<em><b>Placeenemy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeenemy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeenemy</em>' reference.
	 * @see #setPlaceenemy(Enemy)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Placeenemy()
	 * @model
	 * @generated
	 */
	Enemy getPlaceenemy();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getPlaceenemy <em>Placeenemy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeenemy</em>' reference.
	 * @see #getPlaceenemy()
	 * @generated
	 */
	void setPlaceenemy(Enemy value);

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
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Room()
	 * @model
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Npc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Npc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Npc</em>' reference.
	 * @see #setNpc(NPC)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Npc()
	 * @model
	 * @generated
	 */
	NPC getNpc();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getNpc <em>Npc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Npc</em>' reference.
	 * @see #getNpc()
	 * @generated
	 */
	void setNpc(NPC value);

	/**
	 * Returns the value of the '<em><b>HP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HP</em>' attribute.
	 * @see #setHP(int)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_HP()
	 * @model
	 * @generated
	 */
	int getHP();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getHP <em>HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HP</em>' attribute.
	 * @see #getHP()
	 * @generated
	 */
	void setHP(int value);

	/**
	 * Returns the value of the '<em><b>Finishedtalking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finishedtalking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finishedtalking</em>' attribute.
	 * @see #setFinishedtalking(boolean)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Finishedtalking()
	 * @model
	 * @generated
	 */
	boolean isFinishedtalking();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#isFinishedtalking <em>Finishedtalking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finishedtalking</em>' attribute.
	 * @see #isFinishedtalking()
	 * @generated
	 */
	void setFinishedtalking(boolean value);

	/**
	 * Returns the value of the '<em><b>Npc Goto Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Npc Goto Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Npc Goto Id</em>' attribute.
	 * @see #setNpcGotoId(int)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_NpcGotoId()
	 * @model
	 * @generated
	 */
	int getNpcGotoId();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getNpcGotoId <em>Npc Goto Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Npc Goto Id</em>' attribute.
	 * @see #getNpcGotoId()
	 * @generated
	 */
	void setNpcGotoId(int value);

	/**
	 * Returns the value of the '<em><b>Itemtaken</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemtaken</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemtaken</em>' reference.
	 * @see #setItemtaken(Item)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Itemtaken()
	 * @model
	 * @generated
	 */
	Item getItemtaken();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getItemtaken <em>Itemtaken</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemtaken</em>' reference.
	 * @see #getItemtaken()
	 * @generated
	 */
	void setItemtaken(Item value);

	/**
	 * Returns the value of the '<em><b>Is Itemtaken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Itemtaken</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Itemtaken</em>' attribute.
	 * @see #setIsItemtaken(boolean)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_IsItemtaken()
	 * @model
	 * @generated
	 */
	boolean isIsItemtaken();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#isIsItemtaken <em>Is Itemtaken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Itemtaken</em>' attribute.
	 * @see #isIsItemtaken()
	 * @generated
	 */
	void setIsItemtaken(boolean value);

	/**
	 * Returns the value of the '<em><b>Roomenteredtimes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomenteredtimes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomenteredtimes</em>' attribute.
	 * @see #setRoomenteredtimes(int)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Roomenteredtimes()
	 * @model default="0"
	 * @generated
	 */
	int getRoomenteredtimes();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getRoomenteredtimes <em>Roomenteredtimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomenteredtimes</em>' attribute.
	 * @see #getRoomenteredtimes()
	 * @generated
	 */
	void setRoomenteredtimes(int value);

	/**
	 * Returns the value of the '<em><b>Enemyattack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enemyattack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enemyattack</em>' reference.
	 * @see #setEnemyattack(Enemy)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Enemyattack()
	 * @model
	 * @generated
	 */
	Enemy getEnemyattack();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getEnemyattack <em>Enemyattack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enemyattack</em>' reference.
	 * @see #getEnemyattack()
	 * @generated
	 */
	void setEnemyattack(Enemy value);

	/**
	 * Returns the value of the '<em><b>Roomdescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomdescription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomdescription</em>' attribute.
	 * @see #setRoomdescription(String)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Roomdescription()
	 * @model
	 * @generated
	 */
	String getRoomdescription();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getRoomdescription <em>Roomdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomdescription</em>' attribute.
	 * @see #getRoomdescription()
	 * @generated
	 */
	void setRoomdescription(String value);

	/**
	 * Returns the value of the '<em><b>Trap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trap</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trap</em>' containment reference.
	 * @see #setTrap(Trap)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Trap()
	 * @model containment="true"
	 * @generated
	 */
	Trap getTrap();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getTrap <em>Trap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trap</em>' containment reference.
	 * @see #getTrap()
	 * @generated
	 */
	void setTrap(Trap value);

	/**
	 * Returns the value of the '<em><b>Trapdescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trapdescription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trapdescription</em>' attribute.
	 * @see #setTrapdescription(String)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_Trapdescription()
	 * @model
	 * @generated
	 */
	String getTrapdescription();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getTrapdescription <em>Trapdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trapdescription</em>' attribute.
	 * @see #getTrapdescription()
	 * @generated
	 */
	void setTrapdescription(String value);

	/**
	 * Returns the value of the '<em><b>Received Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Item</em>' containment reference.
	 * @see #setReceivedItem(Item)
	 * @see Leveleditor.LeveleditorPackage#getRoomEvent_ReceivedItem()
	 * @model containment="true"
	 * @generated
	 */
	Item getReceivedItem();

	/**
	 * Sets the value of the '{@link Leveleditor.RoomEvent#getReceivedItem <em>Received Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Item</em>' containment reference.
	 * @see #getReceivedItem()
	 * @generated
	 */
	void setReceivedItem(Item value);

} // RoomEvent
