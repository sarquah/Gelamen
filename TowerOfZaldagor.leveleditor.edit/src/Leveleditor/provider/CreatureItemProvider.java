/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Leveleditor.provider;


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

import Leveleditor.Creature;
import Leveleditor.LeveleditorFactory;
import Leveleditor.LeveleditorPackage;

/**
 * This is the item provider adapter for a {@link Leveleditor.Creature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CreatureItemProvider
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
	public CreatureItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addInitHpPropertyDescriptor(object);
			addInitManaPropertyDescriptor(object);
			addManaPropertyDescriptor(object);
			addStrengthPropertyDescriptor(object);
			addAgilityPropertyDescriptor(object);
			addCharismaPropertyDescriptor(object);
			addLevelPropertyDescriptor(object);
			addExperiencePropertyDescriptor(object);
			addGoldPropertyDescriptor(object);
			addInitPlayerActionsPropertyDescriptor(object);
			addResistLightningPropertyDescriptor(object);
			addResistFirePropertyDescriptor(object);
			addResistPoisonPropertyDescriptor(object);
			addResistIcePropertyDescriptor(object);
			addIsMalePropertyDescriptor(object);
			addRacePropertyDescriptor(object);
			addCreatureClassPropertyDescriptor(object);
			addArmorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_name_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init Hp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitHpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_initHp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_initHp_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__INIT_HP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init Mana feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitManaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_initMana_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_initMana_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__INIT_MANA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mana feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_mana_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_mana_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__MANA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strength feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_strength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_strength_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__STRENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Agility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_agility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_agility_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__AGILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Charisma feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCharismaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_charisma_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_charisma_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__CHARISMA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_level_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_level_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Experience feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExperiencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_experience_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_experience_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__EXPERIENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_gold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_gold_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__GOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init Player Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitPlayerActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_initPlayerActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_initPlayerActions_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__INIT_PLAYER_ACTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resist Lightning feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResistLightningPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_resistLightning_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_resistLightning_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__RESIST_LIGHTNING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resist Fire feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResistFirePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_resistFire_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_resistFire_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__RESIST_FIRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resist Poison feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResistPoisonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_resistPoison_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_resistPoison_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__RESIST_POISON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resist Ice feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResistIcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_resistIce_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_resistIce_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__RESIST_ICE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Male feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsMalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_isMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_isMale_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__IS_MALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Race feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_race_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_race_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__RACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creature Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatureClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_creatureClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_creatureClass_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__CREATURE_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Armor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArmorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Creature_armor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Creature_armor_feature", "_UI_Creature_type"),
				 LeveleditorPackage.Literals.CREATURE__ARMOR,
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
			childrenFeatures.add(LeveleditorPackage.Literals.CREATURE__INVENTORY);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Creature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Creature_type") :
			getString("_UI_Creature_type") + " " + label;
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

		switch (notification.getFeatureID(Creature.class)) {
			case LeveleditorPackage.CREATURE__NAME:
			case LeveleditorPackage.CREATURE__INIT_HP:
			case LeveleditorPackage.CREATURE__INIT_MANA:
			case LeveleditorPackage.CREATURE__MANA:
			case LeveleditorPackage.CREATURE__STRENGTH:
			case LeveleditorPackage.CREATURE__AGILITY:
			case LeveleditorPackage.CREATURE__CHARISMA:
			case LeveleditorPackage.CREATURE__LEVEL:
			case LeveleditorPackage.CREATURE__EXPERIENCE:
			case LeveleditorPackage.CREATURE__GOLD:
			case LeveleditorPackage.CREATURE__INIT_PLAYER_ACTIONS:
			case LeveleditorPackage.CREATURE__RESIST_LIGHTNING:
			case LeveleditorPackage.CREATURE__RESIST_FIRE:
			case LeveleditorPackage.CREATURE__RESIST_POISON:
			case LeveleditorPackage.CREATURE__RESIST_ICE:
			case LeveleditorPackage.CREATURE__IS_MALE:
			case LeveleditorPackage.CREATURE__RACE:
			case LeveleditorPackage.CREATURE__CREATURE_CLASS:
			case LeveleditorPackage.CREATURE__ARMOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LeveleditorPackage.CREATURE__INVENTORY:
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
				(LeveleditorPackage.Literals.CREATURE__INVENTORY,
				 LeveleditorFactory.eINSTANCE.createKey()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.CREATURE__INVENTORY,
				 LeveleditorFactory.eINSTANCE.createGold()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.CREATURE__INVENTORY,
				 LeveleditorFactory.eINSTANCE.createPotion()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.CREATURE__INVENTORY,
				 LeveleditorFactory.eINSTANCE.createWeapon()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.CREATURE__INVENTORY,
				 LeveleditorFactory.eINSTANCE.createArmor()));

		newChildDescriptors.add
			(createChildParameter
				(LeveleditorPackage.Literals.CREATURE__INVENTORY,
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
