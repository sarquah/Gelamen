/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.provider;


import Leveleditor.LeveleditorFactory;
import Leveleditor.LeveleditorPackage;
import Leveleditor.Quest;

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
 * This is the item provider adapter for a {@link Leveleditor.Quest} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestItemProvider
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
	public QuestItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addIntroductionPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addCompleteTextPropertyDescriptor(object);
			addQuestConditionPropertyDescriptor(object);
			addQuestItemPropertyDescriptor(object);
			addIsCompletePropertyDescriptor(object);
			addXpEarnedPropertyDescriptor(object);
			addNpcGivenbyPropertyDescriptor(object);
			addEnemydeadPropertyDescriptor(object);
			addDialogidPropertyDescriptor(object);
			addRoomPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quest_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quest_id_feature", "_UI_Quest_type"),
				 LeveleditorPackage.Literals.QUEST__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Introduction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntroductionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quest_introduction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quest_introduction_feature", "_UI_Quest_type"),
				 LeveleditorPackage.Literals.QUEST__INTRODUCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quest_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quest_description_feature", "_UI_Quest_type"),
				 LeveleditorPackage.Literals.QUEST__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Complete Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompleteTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quest_completeText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quest_completeText_feature", "_UI_Quest_type"),
				 LeveleditorPackage.Literals.QUEST__COMPLETE_TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Quest Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuestConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quest_questCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quest_questCondition_feature", "_UI_Quest_type"),
				 LeveleditorPackage.Literals.QUEST__QUEST_CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enemydead feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnemydeadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quest_enemydead_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quest_enemydead_feature", "_UI_Quest_type"),
				 LeveleditorPackage.Literals.QUEST__ENEMYDEAD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dialogid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDialogidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quest_dialogid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quest_dialogid_feature", "_UI_Quest_type"),
				 LeveleditorPackage.Literals.QUEST__DIALOGID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_Quest_room_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quest_room_feature", "_UI_Quest_type"),
				 LeveleditorPackage.Literals.QUEST__ROOM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Quest Item feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuestItemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quest_questItem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quest_questItem_feature", "_UI_Quest_type"),
				 LeveleditorPackage.Literals.QUEST__QUEST_ITEM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Complete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCompletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quest_isComplete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quest_isComplete_feature", "_UI_Quest_type"),
				 LeveleditorPackage.Literals.QUEST__IS_COMPLETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xp Earned feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXpEarnedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quest_xpEarned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quest_xpEarned_feature", "_UI_Quest_type"),
				 LeveleditorPackage.Literals.QUEST__XP_EARNED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Npc Givenby feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNpcGivenbyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quest_npcGivenby_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quest_npcGivenby_feature", "_UI_Quest_type"),
				 LeveleditorPackage.Literals.QUEST__NPC_GIVENBY,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(LeveleditorPackage.Literals.QUEST__AWARD_ITEM);
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
	 * This returns Quest.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Quest"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Quest quest = (Quest)object;
		return getString("_UI_Quest_type") + " " + quest.getId();
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

		switch (notification.getFeatureID(Quest.class)) {
			case LeveleditorPackage.QUEST__ID:
			case LeveleditorPackage.QUEST__INTRODUCTION:
			case LeveleditorPackage.QUEST__DESCRIPTION:
			case LeveleditorPackage.QUEST__COMPLETE_TEXT:
			case LeveleditorPackage.QUEST__QUEST_CONDITION:
			case LeveleditorPackage.QUEST__IS_COMPLETE:
			case LeveleditorPackage.QUEST__XP_EARNED:
			case LeveleditorPackage.QUEST__DIALOGID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LeveleditorPackage.QUEST__AWARD_ITEM:
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
				(LeveleditorPackage.Literals.QUEST__AWARD_ITEM,
				 LeveleditorFactory.eINSTANCE.createKey()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.QUEST__AWARD_ITEM,
				 LeveleditorFactory.eINSTANCE.createGold()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.QUEST__AWARD_ITEM,
				 LeveleditorFactory.eINSTANCE.createPotion()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.QUEST__AWARD_ITEM,
				 LeveleditorFactory.eINSTANCE.createWeapon()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.QUEST__AWARD_ITEM,
				 LeveleditorFactory.eINSTANCE.createArmor()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.QUEST__AWARD_ITEM,
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
