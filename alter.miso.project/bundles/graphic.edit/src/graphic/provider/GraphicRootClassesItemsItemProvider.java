/**
 */
package graphic.provider;


import graphic.GraphicFactory;
import graphic.GraphicPackage;
import graphic.GraphicRootClassesItems;

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
 * This is the item provider adapter for a {@link graphic.GraphicRootClassesItems} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicRootClassesItemsItemProvider 
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
	public GraphicRootClassesItemsItemProvider(AdapterFactory adapterFactory) {
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
			addVersionsPropertyDescriptor(object);
			addVnamePropertyDescriptor(object);
			addShowAttributesPropertyDescriptor(object);
			addMaterialAttributesPropertyDescriptor(object);
			addConstraintsPropertyDescriptor(object);
			addConnectionsPropertyDescriptor(object);
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
				 getString("_UI_GraphicRootClassesItems_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItems_name_feature", "_UI_GraphicRootClassesItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Versions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItems_versions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItems_versions_feature", "_UI_GraphicRootClassesItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__VERSIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItems_vname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItems_vname_feature", "_UI_GraphicRootClassesItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__VNAME,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItems_showAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItems_showAttributes_feature", "_UI_GraphicRootClassesItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__SHOW_ATTRIBUTES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Material Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaterialAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItems_materialAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItems_materialAttributes_feature", "_UI_GraphicRootClassesItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__MATERIAL_ATTRIBUTES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constraints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItems_constraints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItems_constraints_feature", "_UI_GraphicRootClassesItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__CONSTRAINTS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItems_connections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItems_connections_feature", "_UI_GraphicRootClassesItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__CONNECTIONS,
				 false,
				 false,
				 false,
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
			childrenFeatures.add(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS);
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
	 * This returns GraphicRootClassesItems.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GraphicRootClassesItems"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GraphicRootClassesItems)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GraphicRootClassesItems_type") :
			getString("_UI_GraphicRootClassesItems_type") + " " + label;
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

		switch (notification.getFeatureID(GraphicRootClassesItems.class)) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS:
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
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsName()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsVersions()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsVname()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsShowAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsMaterialAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnections()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GraphicOptEditPlugin.INSTANCE;
	}

}
