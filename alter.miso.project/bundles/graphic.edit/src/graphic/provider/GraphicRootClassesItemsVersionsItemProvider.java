/**
 */
package graphic.provider;


import graphic.GraphicFactory;
import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsVersions;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link graphic.GraphicRootClassesItemsVersions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicRootClassesItemsVersionsItemProvider extends GraphicRootClassesItemsPropertiesAbstractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicRootClassesItemsVersionsItemProvider(AdapterFactory adapterFactory) {
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

			addV1PropertyDescriptor(object);
			addV2PropertyDescriptor(object);
			addV3PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the V1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addV1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsVersions_v1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsVersions_v1_feature", "_UI_GraphicRootClassesItemsVersions_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V1,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the V2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addV2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsVersions_v2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsVersions_v2_feature", "_UI_GraphicRootClassesItemsVersions_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V2,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the V3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addV3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsVersions_v3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsVersions_v3_feature", "_UI_GraphicRootClassesItemsVersions_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V3,
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
			childrenFeatures.add(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__VERSIONS);
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
	 * This returns GraphicRootClassesItemsVersions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GraphicRootClassesItemsVersions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GraphicRootClassesItemsVersions)object).getV1();
		return label == null || label.length() == 0 ?
			getString("_UI_GraphicRootClassesItemsVersions_type") :
			getString("_UI_GraphicRootClassesItemsVersions_type") + " " + label;
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

		switch (notification.getFeatureID(GraphicRootClassesItemsVersions.class)) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V1:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V2:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__V3:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__VERSIONS:
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
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__VERSIONS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsVersionsV1()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__VERSIONS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsVersionsV2()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_VERSIONS__VERSIONS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsVersionsV3()));
	}

}
