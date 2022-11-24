/**
 */
package graphic.provider;


import graphic.GraphicFactory;
import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConnectionsItems;

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
 * This is the item provider adapter for a {@link graphic.GraphicRootClassesItemsConnectionsItems} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicRootClassesItemsConnectionsItemsItemProvider 
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
	public GraphicRootClassesItemsConnectionsItemsItemProvider(AdapterFactory adapterFactory) {
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
			addColorPropertyDescriptor(object);
			addTextColorPropertyDescriptor(object);
			addDecoratorPropertyDescriptor(object);
			addDecoratorColorPropertyDescriptor(object);
			addDecoratorWidthPropertyDescriptor(object);
			addDecoratorPosPropertyDescriptor(object);
			addPatternPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addPositionPropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
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
				 getString("_UI_GraphicRootClassesItemsConnectionsItems_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConnectionsItems_name_feature", "_UI_GraphicRootClassesItemsConnectionsItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__NAME,
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
				 getString("_UI_GraphicRootClassesItemsConnectionsItems_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConnectionsItems_type_feature", "_UI_GraphicRootClassesItemsConnectionsItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConnectionsItems_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConnectionsItems_color_feature", "_UI_GraphicRootClassesItemsConnectionsItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__COLOR,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConnectionsItems_textColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConnectionsItems_textColor_feature", "_UI_GraphicRootClassesItemsConnectionsItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TEXT_COLOR,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decorator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecoratorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConnectionsItems_decorator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConnectionsItems_decorator_feature", "_UI_GraphicRootClassesItemsConnectionsItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decorator Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecoratorColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConnectionsItems_decoratorColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConnectionsItems_decoratorColor_feature", "_UI_GraphicRootClassesItemsConnectionsItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_COLOR,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decorator Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecoratorWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConnectionsItems_decoratorWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConnectionsItems_decoratorWidth_feature", "_UI_GraphicRootClassesItemsConnectionsItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_WIDTH,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decorator Pos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecoratorPosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConnectionsItems_decoratorPos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConnectionsItems_decoratorPos_feature", "_UI_GraphicRootClassesItemsConnectionsItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_POS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConnectionsItems_pattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConnectionsItems_pattern_feature", "_UI_GraphicRootClassesItemsConnectionsItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__PATTERN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConnectionsItems_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConnectionsItems_width_feature", "_UI_GraphicRootClassesItemsConnectionsItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__WIDTH,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConnectionsItems_position_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConnectionsItems_position_feature", "_UI_GraphicRootClassesItemsConnectionsItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__POSITION,
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
				 getString("_UI_GraphicRootClassesItemsConnectionsItems_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConnectionsItems_target_feature", "_UI_GraphicRootClassesItemsConnectionsItems_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TARGET,
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
			childrenFeatures.add(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS);
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
	 * This returns GraphicRootClassesItemsConnectionsItems.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GraphicRootClassesItemsConnectionsItems"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GraphicRootClassesItemsConnectionsItems)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GraphicRootClassesItemsConnectionsItems_type") :
			getString("_UI_GraphicRootClassesItemsConnectionsItems_type") + " " + label;
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

		switch (notification.getFeatureID(GraphicRootClassesItemsConnectionsItems.class)) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__NAME:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TYPE:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__COLOR:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TEXT_COLOR:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_COLOR:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_WIDTH:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__DECORATOR_POS:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__PATTERN:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__WIDTH:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__POSITION:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__TARGET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS:
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
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnectionsItemsName()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnectionsItemsType()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnectionsItemsColor()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnectionsItemsTextColor()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnectionsItemsDecorator()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnectionsItemsDecoratorColor()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnectionsItemsDecoratorWidth()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnectionsItemsDecoratorPos()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnectionsItemsPattern()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnectionsItemsWidth()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnectionsItemsPosition()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS__ITEMS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConnectionsItemsTarget()));
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
