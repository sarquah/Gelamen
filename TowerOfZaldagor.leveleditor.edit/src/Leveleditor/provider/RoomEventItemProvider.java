/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.provider;


import Leveleditor.ERoomEventCondition;
import Leveleditor.LeveleditorFactory;
import Leveleditor.LeveleditorPackage;
import Leveleditor.RoomEvent;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Leveleditor.RoomEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomEventItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomEventItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addConditionPropertyDescriptor(object);
			addActionPropertyDescriptor(object);
			addIsEnemyDeadPropertyDescriptor(object);
			addIsItemusedPropertyDescriptor(object);
			addItemtakenPropertyDescriptor(object);
			addIsItemtakenPropertyDescriptor(object);
			addRoomenteredtimesPropertyDescriptor(object);
			addEnemyattackPropertyDescriptor(object);
			addRoomdescriptionPropertyDescriptor(object);
			addTrapdescriptionPropertyDescriptor(object);
			addItemUsedPropertyDescriptor(object);
			addPlaceenemyPropertyDescriptor(object);
			addRoomPropertyDescriptor(object);
			addNpcPropertyDescriptor(object);
			addHPPropertyDescriptor(object);
			addFinishedtalkingPropertyDescriptor(object);
			addNpcGotoIdPropertyDescriptor(object);
			addHiddenroomfoundPropertyDescriptor(object);
			addQuestPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_condition_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_action_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Enemy Dead feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEnemyDeadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_isEnemyDead_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_isEnemyDead_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__IS_ENEMY_DEAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Itemused feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsItemusedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_isItemused_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_isItemused_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__IS_ITEMUSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Itemtaken feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemtakenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_itemtaken_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_itemtaken_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__ITEMTAKEN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Itemtaken feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsItemtakenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_isItemtaken_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_isItemtaken_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__IS_ITEMTAKEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Roomenteredtimes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoomenteredtimesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_roomenteredtimes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_roomenteredtimes_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__ROOMENTEREDTIMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enemyattack feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnemyattackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_enemyattack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_enemyattack_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__ENEMYATTACK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Roomdescription feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoomdescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_roomdescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_roomdescription_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__ROOMDESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trapdescription feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrapdescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_trapdescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_trapdescription_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__TRAPDESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hiddenroomfound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHiddenroomfoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_hiddenroomfound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_hiddenroomfound_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__HIDDENROOMFOUND,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Quest feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_quest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_quest_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__QUEST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Item Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_itemUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_itemUsed_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__ITEM_USED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Placeenemy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlaceenemyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_placeenemy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_placeenemy_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__PLACEENEMY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Room feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_room_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_room_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__ROOM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Npc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNpcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_npc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_npc_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__NPC,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the HP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_HP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_HP_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__HP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Finishedtalking feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinishedtalkingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_finishedtalking_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_finishedtalking_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__FINISHEDTALKING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Npc Goto Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNpcGotoIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoomEvent_npcGotoId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoomEvent_npcGotoId_feature", "_UI_RoomEvent_type"),
				 LeveleditorPackage.Literals.ROOM_EVENT__NPC_GOTO_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LeveleditorPackage.Literals.ROOM_EVENT__TRAP);
			childrenFeatures.add(LeveleditorPackage.Literals.ROOM_EVENT__RECEIVED_ITEM);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns RoomEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoomEvent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ERoomEventCondition labelValue = ((RoomEvent)object).getCondition();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_RoomEvent_type") :
			getString("_UI_RoomEvent_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RoomEvent.class)) {
			case LeveleditorPackage.ROOM_EVENT__CONDITION:
			case LeveleditorPackage.ROOM_EVENT__ACTION:
			case LeveleditorPackage.ROOM_EVENT__IS_ENEMY_DEAD:
			case LeveleditorPackage.ROOM_EVENT__IS_ITEMUSED:
			case LeveleditorPackage.ROOM_EVENT__IS_ITEMTAKEN:
			case LeveleditorPackage.ROOM_EVENT__ROOMENTEREDTIMES:
			case LeveleditorPackage.ROOM_EVENT__ROOMDESCRIPTION:
			case LeveleditorPackage.ROOM_EVENT__TRAPDESCRIPTION:
			case LeveleditorPackage.ROOM_EVENT__HP:
			case LeveleditorPackage.ROOM_EVENT__FINISHEDTALKING:
			case LeveleditorPackage.ROOM_EVENT__NPC_GOTO_ID:
			case LeveleditorPackage.ROOM_EVENT__HIDDENROOMFOUND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LeveleditorPackage.ROOM_EVENT__TRAP:
			case LeveleditorPackage.ROOM_EVENT__RECEIVED_ITEM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.ROOM_EVENT__TRAP,
				 LeveleditorFactory.eINSTANCE.createTrap()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.ROOM_EVENT__RECEIVED_ITEM,
				 LeveleditorFactory.eINSTANCE.createKey()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.ROOM_EVENT__RECEIVED_ITEM,
				 LeveleditorFactory.eINSTANCE.createGold()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.ROOM_EVENT__RECEIVED_ITEM,
				 LeveleditorFactory.eINSTANCE.createPotion()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.ROOM_EVENT__RECEIVED_ITEM,
				 LeveleditorFactory.eINSTANCE.createWeapon()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.ROOM_EVENT__RECEIVED_ITEM,
				 LeveleditorFactory.eINSTANCE.createArmor()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.ROOM_EVENT__RECEIVED_ITEM,
				 LeveleditorFactory.eINSTANCE.createAccessory()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LeveleditorEditPlugin.INSTANCE;
	}

}
