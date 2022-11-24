/**
 */
package ontological.provider;


import java.util.Collection;
import java.util.List;

import ontological.OntologicalFactory;
import ontological.OntologicalPackage;
import ontological.OntologicalRootClassesItemsAttributesItems;

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
 * This is the item provider adapter for a {@link ontological.OntologicalRootClassesItemsAttributesItems} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OntologicalRootClassesItemsAttributesItemsItemProvider 
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
	public OntologicalRootClassesItemsAttributesItemsItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
			addMinPropertyDescriptor(object);
			addMaxPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addReadOnlyPropertyDescriptor(object);
			addIsParamPropertyDescriptor(object);
			addIsKeyPropertyDescriptor(object);
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
				 getString("_UI_OntologicalRootClassesItemsAttributesItems_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsAttributesItems_name_feature", "_UI_OntologicalRootClassesItemsAttributesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRootClassesItemsAttributesItems_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsAttributesItems_type_feature", "_UI_OntologicalRootClassesItemsAttributesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRootClassesItemsAttributesItems_min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsAttributesItems_min_feature", "_UI_OntologicalRootClassesItemsAttributesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MIN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRootClassesItemsAttributesItems_max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsAttributesItems_max_feature", "_UI_OntologicalRootClassesItemsAttributesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MAX,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRootClassesItemsAttributesItems_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsAttributesItems_default_feature", "_UI_OntologicalRootClassesItemsAttributesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__DEFAULT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRootClassesItemsAttributesItems_readOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsAttributesItems_readOnly_feature", "_UI_OntologicalRootClassesItemsAttributesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__READ_ONLY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRootClassesItemsAttributesItems_isParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsAttributesItems_isParam_feature", "_UI_OntologicalRootClassesItemsAttributesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_PARAM,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRootClassesItemsAttributesItems_isKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsAttributesItems_isKey_feature", "_UI_OntologicalRootClassesItemsAttributesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_KEY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS);
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
	 * This returns OntologicalRootClassesItemsAttributesItems.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OntologicalRootClassesItemsAttributesItems"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OntologicalRootClassesItemsAttributesItems)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OntologicalRootClassesItemsAttributesItems_type") :
			getString("_UI_OntologicalRootClassesItemsAttributesItems_type") + " " + label;
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

		switch (notification.getFeatureID(OntologicalRootClassesItemsAttributesItems.class)) {
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__NAME:
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__TYPE:
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MIN:
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MAX:
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__DEFAULT:
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__READ_ONLY:
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_PARAM:
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_KEY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS:
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
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsAttributesItemsName()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsAttributesItemsType()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsAttributesItemsMin()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsAttributesItemsMax()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsAttributesItemsDefault()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsAttributesItemsReadOnly()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsAttributesItemsIsParam()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsAttributesItemsIsKey()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OntologicalOptEditPlugin.INSTANCE;
	}

}
