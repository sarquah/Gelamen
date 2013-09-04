/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import Leveleditor.Enemy;
import Leveleditor.Item;
import Leveleditor.Key;
import Leveleditor.LeveleditorPackage;
import Leveleditor.NPC;
import Leveleditor.Room;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Leveleditor.impl.RoomImpl#getName <em>Name</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getPostDescription <em>Post Description</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getPostItemsDescription <em>Post Items Description</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getRevealedDescription <em>Revealed Description</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getHiddenDescription <em>Hidden Description</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getEnemies <em>Enemies</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getNpcs <em>Npcs</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getItems <em>Items</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#isIsLocked <em>Is Locked</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getUnlockKeys <em>Unlock Keys</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#isIsHidden <em>Is Hidden</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#isIsRevealed <em>Is Revealed</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#isIsHiddenEvent <em>Is Hidden Event</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getNorth <em>North</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getSouth <em>South</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getWest <em>West</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#getEast <em>East</em>}</li>
 *   <li>{@link Leveleditor.impl.RoomImpl#isAutosave <em>Autosave</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RoomImpl extends EObjectImpl implements Room {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getPostDescription() <em>Post Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostDescription() <em>Post Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostDescription()
	 * @generated
	 * @ordered
	 */
	protected String postDescription = POST_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostItemsDescription() <em>Post Items Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostItemsDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_ITEMS_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostItemsDescription() <em>Post Items Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostItemsDescription()
	 * @generated
	 * @ordered
	 */
	protected String postItemsDescription = POST_ITEMS_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevealedDescription() <em>Revealed Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevealedDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String REVEALED_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevealedDescription() <em>Revealed Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevealedDescription()
	 * @generated
	 * @ordered
	 */
	protected String revealedDescription = REVEALED_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHiddenDescription() <em>Hidden Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String HIDDEN_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHiddenDescription() <em>Hidden Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenDescription()
	 * @generated
	 * @ordered
	 */
	protected String hiddenDescription = HIDDEN_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnemies() <em>Enemies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnemies()
	 * @generated
	 * @ordered
	 */
	protected EList<Enemy> enemies;

	/**
	 * The cached value of the '{@link #getNpcs() <em>Npcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNpcs()
	 * @generated
	 * @ordered
	 */
	protected EList<NPC> npcs;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The default value of the '{@link #isIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocked = IS_LOCKED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnlockKeys() <em>Unlock Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlockKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<Key> unlockKeys;

	/**
	 * The default value of the '{@link #isIsHidden() <em>Is Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHidden() <em>Is Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHidden()
	 * @generated
	 * @ordered
	 */
	protected boolean isHidden = IS_HIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRevealed() <em>Is Revealed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRevealed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REVEALED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRevealed() <em>Is Revealed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRevealed()
	 * @generated
	 * @ordered
	 */
	protected boolean isRevealed = IS_REVEALED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsHiddenEvent() <em>Is Hidden Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHiddenEvent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HIDDEN_EVENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHiddenEvent() <em>Is Hidden Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHiddenEvent()
	 * @generated
	 * @ordered
	 */
	protected boolean isHiddenEvent = IS_HIDDEN_EVENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNorth() <em>North</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorth()
	 * @generated
	 * @ordered
	 */
	protected Room north;

	/**
	 * The cached value of the '{@link #getSouth() <em>South</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouth()
	 * @generated
	 * @ordered
	 */
	protected Room south;

	/**
	 * The cached value of the '{@link #getWest() <em>West</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWest()
	 * @generated
	 * @ordered
	 */
	protected Room west;

	/**
	 * The cached value of the '{@link #getEast() <em>East</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEast()
	 * @generated
	 * @ordered
	 */
	protected Room east;

	/**
	 * The default value of the '{@link #isAutosave() <em>Autosave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutosave()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOSAVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutosave() <em>Autosave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutosave()
	 * @generated
	 * @ordered
	 */
	protected boolean autosave = AUTOSAVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeveleditorPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostDescription() {
		return postDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostDescription(String newPostDescription) {
		String oldPostDescription = postDescription;
		postDescription = newPostDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__POST_DESCRIPTION, oldPostDescription, postDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostItemsDescription() {
		return postItemsDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostItemsDescription(String newPostItemsDescription) {
		String oldPostItemsDescription = postItemsDescription;
		postItemsDescription = newPostItemsDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__POST_ITEMS_DESCRIPTION, oldPostItemsDescription, postItemsDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevealedDescription() {
		return revealedDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevealedDescription(String newRevealedDescription) {
		String oldRevealedDescription = revealedDescription;
		revealedDescription = newRevealedDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__REVEALED_DESCRIPTION, oldRevealedDescription, revealedDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHiddenDescription() {
		return hiddenDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiddenDescription(String newHiddenDescription) {
		String oldHiddenDescription = hiddenDescription;
		hiddenDescription = newHiddenDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__HIDDEN_DESCRIPTION, oldHiddenDescription, hiddenDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enemy> getEnemies() {
		if (enemies == null) {
			enemies = new EObjectContainmentEList<Enemy>(Enemy.class, this, LeveleditorPackage.ROOM__ENEMIES);
		}
		return enemies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NPC> getNpcs() {
		if (npcs == null) {
			npcs = new EObjectContainmentEList<NPC>(NPC.class, this, LeveleditorPackage.ROOM__NPCS);
		}
		return npcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, LeveleditorPackage.ROOM__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getNorth() {
		if (north != null && north.eIsProxy()) {
			InternalEObject oldNorth = (InternalEObject)north;
			north = (Room)eResolveProxy(oldNorth);
			if (north != oldNorth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ROOM__NORTH, oldNorth, north));
			}
		}
		return north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetNorth() {
		return north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNorth(Room newNorth) {
		Room oldNorth = north;
		north = newNorth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__NORTH, oldNorth, north));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getSouth() {
		if (south != null && south.eIsProxy()) {
			InternalEObject oldSouth = (InternalEObject)south;
			south = (Room)eResolveProxy(oldSouth);
			if (south != oldSouth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ROOM__SOUTH, oldSouth, south));
			}
		}
		return south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetSouth() {
		return south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouth(Room newSouth) {
		Room oldSouth = south;
		south = newSouth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__SOUTH, oldSouth, south));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getEast() {
		if (east != null && east.eIsProxy()) {
			InternalEObject oldEast = (InternalEObject)east;
			east = (Room)eResolveProxy(oldEast);
			if (east != oldEast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ROOM__EAST, oldEast, east));
			}
		}
		return east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetEast() {
		return east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEast(Room newEast) {
		Room oldEast = east;
		east = newEast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__EAST, oldEast, east));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutosave() {
		return autosave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutosave(boolean newAutosave) {
		boolean oldAutosave = autosave;
		autosave = newAutosave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__AUTOSAVE, oldAutosave, autosave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getWest() {
		if (west != null && west.eIsProxy()) {
			InternalEObject oldWest = (InternalEObject)west;
			west = (Room)eResolveProxy(oldWest);
			if (west != oldWest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeveleditorPackage.ROOM__WEST, oldWest, west));
			}
		}
		return west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetWest() {
		return west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWest(Room newWest) {
		Room oldWest = west;
		west = newWest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__WEST, oldWest, west));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLocked() {
		return isLocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocked(boolean newIsLocked) {
		boolean oldIsLocked = isLocked;
		isLocked = newIsLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__IS_LOCKED, oldIsLocked, isLocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Key> getUnlockKeys() {
		if (unlockKeys == null) {
			unlockKeys = new EObjectResolvingEList<Key>(Key.class, this, LeveleditorPackage.ROOM__UNLOCK_KEYS);
		}
		return unlockKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHidden() {
		return isHidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHidden(boolean newIsHidden) {
		boolean oldIsHidden = isHidden;
		isHidden = newIsHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__IS_HIDDEN, oldIsHidden, isHidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRevealed() {
		return isRevealed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRevealed(boolean newIsRevealed) {
		boolean oldIsRevealed = isRevealed;
		isRevealed = newIsRevealed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__IS_REVEALED, oldIsRevealed, isRevealed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHiddenEvent() {
		return isHiddenEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHiddenEvent(boolean newIsHiddenEvent) {
		boolean oldIsHiddenEvent = isHiddenEvent;
		isHiddenEvent = newIsHiddenEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeveleditorPackage.ROOM__IS_HIDDEN_EVENT, oldIsHiddenEvent, isHiddenEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeveleditorPackage.ROOM__ENEMIES:
				return ((InternalEList<?>)getEnemies()).basicRemove(otherEnd, msgs);
			case LeveleditorPackage.ROOM__NPCS:
				return ((InternalEList<?>)getNpcs()).basicRemove(otherEnd, msgs);
			case LeveleditorPackage.ROOM__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case LeveleditorPackage.ROOM__NAME:
				return getName();
			case LeveleditorPackage.ROOM__DESCRIPTION:
				return getDescription();
			case LeveleditorPackage.ROOM__POST_DESCRIPTION:
				return getPostDescription();
			case LeveleditorPackage.ROOM__POST_ITEMS_DESCRIPTION:
				return getPostItemsDescription();
			case LeveleditorPackage.ROOM__REVEALED_DESCRIPTION:
				return getRevealedDescription();
			case LeveleditorPackage.ROOM__HIDDEN_DESCRIPTION:
				return getHiddenDescription();
			case LeveleditorPackage.ROOM__ENEMIES:
				return getEnemies();
			case LeveleditorPackage.ROOM__NPCS:
				return getNpcs();
			case LeveleditorPackage.ROOM__ITEMS:
				return getItems();
			case LeveleditorPackage.ROOM__IS_LOCKED:
				return isIsLocked();
			case LeveleditorPackage.ROOM__UNLOCK_KEYS:
				return getUnlockKeys();
			case LeveleditorPackage.ROOM__IS_HIDDEN:
				return isIsHidden();
			case LeveleditorPackage.ROOM__IS_REVEALED:
				return isIsRevealed();
			case LeveleditorPackage.ROOM__IS_HIDDEN_EVENT:
				return isIsHiddenEvent();
			case LeveleditorPackage.ROOM__NORTH:
				if (resolve) return getNorth();
				return basicGetNorth();
			case LeveleditorPackage.ROOM__SOUTH:
				if (resolve) return getSouth();
				return basicGetSouth();
			case LeveleditorPackage.ROOM__WEST:
				if (resolve) return getWest();
				return basicGetWest();
			case LeveleditorPackage.ROOM__EAST:
				if (resolve) return getEast();
				return basicGetEast();
			case LeveleditorPackage.ROOM__AUTOSAVE:
				return isAutosave();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LeveleditorPackage.ROOM__NAME:
				setName((String)newValue);
				return;
			case LeveleditorPackage.ROOM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LeveleditorPackage.ROOM__POST_DESCRIPTION:
				setPostDescription((String)newValue);
				return;
			case LeveleditorPackage.ROOM__POST_ITEMS_DESCRIPTION:
				setPostItemsDescription((String)newValue);
				return;
			case LeveleditorPackage.ROOM__REVEALED_DESCRIPTION:
				setRevealedDescription((String)newValue);
				return;
			case LeveleditorPackage.ROOM__HIDDEN_DESCRIPTION:
				setHiddenDescription((String)newValue);
				return;
			case LeveleditorPackage.ROOM__ENEMIES:
				getEnemies().clear();
				getEnemies().addAll((Collection<? extends Enemy>)newValue);
				return;
			case LeveleditorPackage.ROOM__NPCS:
				getNpcs().clear();
				getNpcs().addAll((Collection<? extends NPC>)newValue);
				return;
			case LeveleditorPackage.ROOM__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case LeveleditorPackage.ROOM__IS_LOCKED:
				setIsLocked((Boolean)newValue);
				return;
			case LeveleditorPackage.ROOM__UNLOCK_KEYS:
				getUnlockKeys().clear();
				getUnlockKeys().addAll((Collection<? extends Key>)newValue);
				return;
			case LeveleditorPackage.ROOM__IS_HIDDEN:
				setIsHidden((Boolean)newValue);
				return;
			case LeveleditorPackage.ROOM__IS_REVEALED:
				setIsRevealed((Boolean)newValue);
				return;
			case LeveleditorPackage.ROOM__IS_HIDDEN_EVENT:
				setIsHiddenEvent((Boolean)newValue);
				return;
			case LeveleditorPackage.ROOM__NORTH:
				setNorth((Room)newValue);
				return;
			case LeveleditorPackage.ROOM__SOUTH:
				setSouth((Room)newValue);
				return;
			case LeveleditorPackage.ROOM__WEST:
				setWest((Room)newValue);
				return;
			case LeveleditorPackage.ROOM__EAST:
				setEast((Room)newValue);
				return;
			case LeveleditorPackage.ROOM__AUTOSAVE:
				setAutosave((Boolean)newValue);
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
			case LeveleditorPackage.ROOM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM__POST_DESCRIPTION:
				setPostDescription(POST_DESCRIPTION_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM__POST_ITEMS_DESCRIPTION:
				setPostItemsDescription(POST_ITEMS_DESCRIPTION_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM__REVEALED_DESCRIPTION:
				setRevealedDescription(REVEALED_DESCRIPTION_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM__HIDDEN_DESCRIPTION:
				setHiddenDescription(HIDDEN_DESCRIPTION_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM__ENEMIES:
				getEnemies().clear();
				return;
			case LeveleditorPackage.ROOM__NPCS:
				getNpcs().clear();
				return;
			case LeveleditorPackage.ROOM__ITEMS:
				getItems().clear();
				return;
			case LeveleditorPackage.ROOM__IS_LOCKED:
				setIsLocked(IS_LOCKED_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM__UNLOCK_KEYS:
				getUnlockKeys().clear();
				return;
			case LeveleditorPackage.ROOM__IS_HIDDEN:
				setIsHidden(IS_HIDDEN_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM__IS_REVEALED:
				setIsRevealed(IS_REVEALED_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM__IS_HIDDEN_EVENT:
				setIsHiddenEvent(IS_HIDDEN_EVENT_EDEFAULT);
				return;
			case LeveleditorPackage.ROOM__NORTH:
				setNorth((Room)null);
				return;
			case LeveleditorPackage.ROOM__SOUTH:
				setSouth((Room)null);
				return;
			case LeveleditorPackage.ROOM__WEST:
				setWest((Room)null);
				return;
			case LeveleditorPackage.ROOM__EAST:
				setEast((Room)null);
				return;
			case LeveleditorPackage.ROOM__AUTOSAVE:
				setAutosave(AUTOSAVE_EDEFAULT);
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
			case LeveleditorPackage.ROOM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LeveleditorPackage.ROOM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LeveleditorPackage.ROOM__POST_DESCRIPTION:
				return POST_DESCRIPTION_EDEFAULT == null ? postDescription != null : !POST_DESCRIPTION_EDEFAULT.equals(postDescription);
			case LeveleditorPackage.ROOM__POST_ITEMS_DESCRIPTION:
				return POST_ITEMS_DESCRIPTION_EDEFAULT == null ? postItemsDescription != null : !POST_ITEMS_DESCRIPTION_EDEFAULT.equals(postItemsDescription);
			case LeveleditorPackage.ROOM__REVEALED_DESCRIPTION:
				return REVEALED_DESCRIPTION_EDEFAULT == null ? revealedDescription != null : !REVEALED_DESCRIPTION_EDEFAULT.equals(revealedDescription);
			case LeveleditorPackage.ROOM__HIDDEN_DESCRIPTION:
				return HIDDEN_DESCRIPTION_EDEFAULT == null ? hiddenDescription != null : !HIDDEN_DESCRIPTION_EDEFAULT.equals(hiddenDescription);
			case LeveleditorPackage.ROOM__ENEMIES:
				return enemies != null && !enemies.isEmpty();
			case LeveleditorPackage.ROOM__NPCS:
				return npcs != null && !npcs.isEmpty();
			case LeveleditorPackage.ROOM__ITEMS:
				return items != null && !items.isEmpty();
			case LeveleditorPackage.ROOM__IS_LOCKED:
				return isLocked != IS_LOCKED_EDEFAULT;
			case LeveleditorPackage.ROOM__UNLOCK_KEYS:
				return unlockKeys != null && !unlockKeys.isEmpty();
			case LeveleditorPackage.ROOM__IS_HIDDEN:
				return isHidden != IS_HIDDEN_EDEFAULT;
			case LeveleditorPackage.ROOM__IS_REVEALED:
				return isRevealed != IS_REVEALED_EDEFAULT;
			case LeveleditorPackage.ROOM__IS_HIDDEN_EVENT:
				return isHiddenEvent != IS_HIDDEN_EVENT_EDEFAULT;
			case LeveleditorPackage.ROOM__NORTH:
				return north != null;
			case LeveleditorPackage.ROOM__SOUTH:
				return south != null;
			case LeveleditorPackage.ROOM__WEST:
				return west != null;
			case LeveleditorPackage.ROOM__EAST:
				return east != null;
			case LeveleditorPackage.ROOM__AUTOSAVE:
				return autosave != AUTOSAVE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", postDescription: ");
		result.append(postDescription);
		result.append(", postItemsDescription: ");
		result.append(postItemsDescription);
		result.append(", revealedDescription: ");
		result.append(revealedDescription);
		result.append(", hiddenDescription: ");
		result.append(hiddenDescription);
		result.append(", isLocked: ");
		result.append(isLocked);
		result.append(", isHidden: ");
		result.append(isHidden);
		result.append(", isRevealed: ");
		result.append(isRevealed);
		result.append(", isHiddenEvent: ");
		result.append(isHiddenEvent);
		result.append(", autosave: ");
		result.append(autosave);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
