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
 * A representation of the model object '<em><b>Quest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Leveleditor.Quest#getId <em>Id</em>}</li>
 *   <li>{@link Leveleditor.Quest#getIntroduction <em>Introduction</em>}</li>
 *   <li>{@link Leveleditor.Quest#getDescription <em>Description</em>}</li>
 *   <li>{@link Leveleditor.Quest#getCompleteText <em>Complete Text</em>}</li>
 *   <li>{@link Leveleditor.Quest#getQuestCondition <em>Quest Condition</em>}</li>
 *   <li>{@link Leveleditor.Quest#getQuestItem <em>Quest Item</em>}</li>
 *   <li>{@link Leveleditor.Quest#isIsComplete <em>Is Complete</em>}</li>
 *   <li>{@link Leveleditor.Quest#getXpEarned <em>Xp Earned</em>}</li>
 *   <li>{@link Leveleditor.Quest#getAwardItem <em>Award Item</em>}</li>
 *   <li>{@link Leveleditor.Quest#getNpcGivenby <em>Npc Givenby</em>}</li>
 *   <li>{@link Leveleditor.Quest#getEnemydead <em>Enemydead</em>}</li>
 *   <li>{@link Leveleditor.Quest#getDialogid <em>Dialogid</em>}</li>
 *   <li>{@link Leveleditor.Quest#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see Leveleditor.LeveleditorPackage#getQuest()
 * @model
 * @generated
 */
public interface Quest extends EObject {
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
	 * @see Leveleditor.LeveleditorPackage#getQuest_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Introduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Introduction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Introduction</em>' attribute.
	 * @see #setIntroduction(String)
	 * @see Leveleditor.LeveleditorPackage#getQuest_Introduction()
	 * @model
	 * @generated
	 */
	String getIntroduction();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#getIntroduction <em>Introduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Introduction</em>' attribute.
	 * @see #getIntroduction()
	 * @generated
	 */
	void setIntroduction(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Leveleditor.LeveleditorPackage#getQuest_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Complete Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete Text</em>' attribute.
	 * @see #setCompleteText(String)
	 * @see Leveleditor.LeveleditorPackage#getQuest_CompleteText()
	 * @model
	 * @generated
	 */
	String getCompleteText();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#getCompleteText <em>Complete Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete Text</em>' attribute.
	 * @see #getCompleteText()
	 * @generated
	 */
	void setCompleteText(String value);

	/**
	 * Returns the value of the '<em><b>Quest Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link Leveleditor.ERoomEventCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quest Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quest Condition</em>' attribute.
	 * @see Leveleditor.ERoomEventCondition
	 * @see #setQuestCondition(ERoomEventCondition)
	 * @see Leveleditor.LeveleditorPackage#getQuest_QuestCondition()
	 * @model
	 * @generated
	 */
	ERoomEventCondition getQuestCondition();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#getQuestCondition <em>Quest Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quest Condition</em>' attribute.
	 * @see Leveleditor.ERoomEventCondition
	 * @see #getQuestCondition()
	 * @generated
	 */
	void setQuestCondition(ERoomEventCondition value);

	/**
	 * Returns the value of the '<em><b>Enemydead</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enemydead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enemydead</em>' reference.
	 * @see #setEnemydead(Enemy)
	 * @see Leveleditor.LeveleditorPackage#getQuest_Enemydead()
	 * @model
	 * @generated
	 */
	Enemy getEnemydead();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#getEnemydead <em>Enemydead</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enemydead</em>' reference.
	 * @see #getEnemydead()
	 * @generated
	 */
	void setEnemydead(Enemy value);

	/**
	 * Returns the value of the '<em><b>Dialogid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialogid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogid</em>' attribute.
	 * @see #setDialogid(int)
	 * @see Leveleditor.LeveleditorPackage#getQuest_Dialogid()
	 * @model
	 * @generated
	 */
	int getDialogid();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#getDialogid <em>Dialogid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialogid</em>' attribute.
	 * @see #getDialogid()
	 * @generated
	 */
	void setDialogid(int value);

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
	 * @see Leveleditor.LeveleditorPackage#getQuest_Room()
	 * @model
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Quest Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quest Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quest Item</em>' reference.
	 * @see #setQuestItem(Item)
	 * @see Leveleditor.LeveleditorPackage#getQuest_QuestItem()
	 * @model
	 * @generated
	 */
	Item getQuestItem();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#getQuestItem <em>Quest Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quest Item</em>' reference.
	 * @see #getQuestItem()
	 * @generated
	 */
	void setQuestItem(Item value);

	/**
	 * Returns the value of the '<em><b>Is Complete</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Complete</em>' attribute.
	 * @see #setIsComplete(boolean)
	 * @see Leveleditor.LeveleditorPackage#getQuest_IsComplete()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsComplete();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#isIsComplete <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Complete</em>' attribute.
	 * @see #isIsComplete()
	 * @generated
	 */
	void setIsComplete(boolean value);

	/**
	 * Returns the value of the '<em><b>Xp Earned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xp Earned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xp Earned</em>' attribute.
	 * @see #setXpEarned(int)
	 * @see Leveleditor.LeveleditorPackage#getQuest_XpEarned()
	 * @model
	 * @generated
	 */
	int getXpEarned();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#getXpEarned <em>Xp Earned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xp Earned</em>' attribute.
	 * @see #getXpEarned()
	 * @generated
	 */
	void setXpEarned(int value);

	/**
	 * Returns the value of the '<em><b>Award Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Award Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Award Item</em>' containment reference.
	 * @see #setAwardItem(Item)
	 * @see Leveleditor.LeveleditorPackage#getQuest_AwardItem()
	 * @model containment="true"
	 * @generated
	 */
	Item getAwardItem();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#getAwardItem <em>Award Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Award Item</em>' containment reference.
	 * @see #getAwardItem()
	 * @generated
	 */
	void setAwardItem(Item value);

	/**
	 * Returns the value of the '<em><b>Npc Givenby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Npc Givenby</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Npc Givenby</em>' reference.
	 * @see #setNpcGivenby(NPC)
	 * @see Leveleditor.LeveleditorPackage#getQuest_NpcGivenby()
	 * @model
	 * @generated
	 */
	NPC getNpcGivenby();

	/**
	 * Sets the value of the '{@link Leveleditor.Quest#getNpcGivenby <em>Npc Givenby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Npc Givenby</em>' reference.
	 * @see #getNpcGivenby()
	 * @generated
	 */
	void setNpcGivenby(NPC value);

} // Quest
