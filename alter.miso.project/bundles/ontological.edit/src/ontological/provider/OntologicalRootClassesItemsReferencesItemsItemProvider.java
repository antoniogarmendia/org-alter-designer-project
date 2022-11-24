/**
 */
package ontological.provider;


import java.util.Collection;
import java.util.List;

import ontological.OntologicalFactory;
import ontological.OntologicalPackage;
import ontological.OntologicalRootClassesItemsReferencesItems;

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
 * This is the item provider adapter for a {@link ontological.OntologicalRootClassesItemsReferencesItems} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OntologicalRootClassesItemsReferencesItemsItemProvider 
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
	public OntologicalRootClassesItemsReferencesItemsItemProvider(AdapterFactory adapterFactory) {
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
			addContaintmentPropertyDescriptor(object);
			addMinPropertyDescriptor(object);
			addMaxPropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addOppositePropertyDescriptor(object);
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
				 getString("_UI_OntologicalRootClassesItemsReferencesItems_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsReferencesItems_name_feature", "_UI_OntologicalRootClassesItemsReferencesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Containtment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContaintmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRootClassesItemsReferencesItems_containtment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsReferencesItems_containtment_feature", "_UI_OntologicalRootClassesItemsReferencesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__CONTAINTMENT,
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
				 getString("_UI_OntologicalRootClassesItemsReferencesItems_min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsReferencesItems_min_feature", "_UI_OntologicalRootClassesItemsReferencesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MIN,
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
				 getString("_UI_OntologicalRootClassesItemsReferencesItems_max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsReferencesItems_max_feature", "_UI_OntologicalRootClassesItemsReferencesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MAX,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRootClassesItemsReferencesItems_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsReferencesItems_target_feature", "_UI_OntologicalRootClassesItemsReferencesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__TARGET,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Opposite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOppositePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRootClassesItemsReferencesItems_opposite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRootClassesItemsReferencesItems_opposite_feature", "_UI_OntologicalRootClassesItemsReferencesItems_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__OPPOSITE,
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
			childrenFeatures.add(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS);
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
	 * This returns OntologicalRootClassesItemsReferencesItems.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OntologicalRootClassesItemsReferencesItems"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OntologicalRootClassesItemsReferencesItems)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OntologicalRootClassesItemsReferencesItems_type") :
			getString("_UI_OntologicalRootClassesItemsReferencesItems_type") + " " + label;
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

		switch (notification.getFeatureID(OntologicalRootClassesItemsReferencesItems.class)) {
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__NAME:
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__CONTAINTMENT:
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MIN:
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MAX:
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__TARGET:
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__OPPOSITE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS:
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
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsReferencesItemsName()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsReferencesItemsContaintment()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsReferencesItemsMin()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsReferencesItemsMax()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsReferencesItemsTarget()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClassesItemsReferencesItemsOpposite()));
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
