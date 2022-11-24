/**
 */
package graphic.provider;


import graphic.GraphicFactory;
import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConstraints;

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
 * This is the item provider adapter for a {@link graphic.GraphicRootClassesItemsConstraints} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicRootClassesItemsConstraintsItemProvider extends GraphicRootClassesItemsPropertiesAbstractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicRootClassesItemsConstraintsItemProvider(AdapterFactory adapterFactory) {
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

			addPlanesPropertyDescriptor(object);
			addIluminationPropertyDescriptor(object);
			addSizeMaxPropertyDescriptor(object);
			addSizeMinPropertyDescriptor(object);
			addSizeInitPropertyDescriptor(object);
			addOverlappingPropertyDescriptor(object);
			addXToOriginPosPropertyDescriptor(object);
			addYToOriginPosPropertyDescriptor(object);
			addZToOriginPosPropertyDescriptor(object);
			addRotationPropertyDescriptor(object);
			addTextPropertyDescriptor(object);
			addTrimPropertyDescriptor(object);
			addCategoryBitMaskPropertyDescriptor(object);
			addCollisionBitMaskPropertyDescriptor(object);
			addContactTestBitMaskPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Planes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlanesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_planes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_planes_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__PLANES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ilumination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIluminationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_ilumination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_ilumination_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ILUMINATION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizeMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_sizeMax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_sizeMax_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MAX,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizeMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_sizeMin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_sizeMin_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MIN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size Init feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizeInitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_sizeInit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_sizeInit_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_INIT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overlapping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverlappingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_overlapping_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_overlapping_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__OVERLAPPING,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XTo Origin Pos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXToOriginPosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_xToOriginPos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_xToOriginPos_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__XTO_ORIGIN_POS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YTo Origin Pos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYToOriginPosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_yToOriginPos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_yToOriginPos_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__YTO_ORIGIN_POS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ZTo Origin Pos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZToOriginPosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_zToOriginPos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_zToOriginPos_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ZTO_ORIGIN_POS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_rotation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_rotation_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ROTATION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_text_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TEXT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trim feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrimPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_trim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_trim_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TRIM,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category Bit Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryBitMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_categoryBitMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_categoryBitMask_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CATEGORY_BIT_MASK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collision Bit Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollisionBitMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_collisionBitMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_collisionBitMask_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__COLLISION_BIT_MASK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contact Test Bit Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContactTestBitMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicRootClassesItemsConstraints_contactTestBitMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraints_contactTestBitMask_feature", "_UI_GraphicRootClassesItemsConstraints_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONTACT_TEST_BIT_MASK,
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
			childrenFeatures.add(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS);
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
	 * This returns GraphicRootClassesItemsConstraints.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GraphicRootClassesItemsConstraints"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GraphicRootClassesItemsConstraints)object).getPlanes();
		return label == null || label.length() == 0 ?
			getString("_UI_GraphicRootClassesItemsConstraints_type") :
			getString("_UI_GraphicRootClassesItemsConstraints_type") + " " + label;
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

		switch (notification.getFeatureID(GraphicRootClassesItemsConstraints.class)) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__PLANES:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ILUMINATION:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MAX:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_MIN:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__SIZE_INIT:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__OVERLAPPING:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__XTO_ORIGIN_POS:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__YTO_ORIGIN_POS:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ZTO_ORIGIN_POS:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__ROTATION:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TEXT:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__TRIM:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CATEGORY_BIT_MASK:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__COLLISION_BIT_MASK:
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONTACT_TEST_BIT_MASK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS:
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
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsPlanes()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsIlumination()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsSizeMax()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsSizeMin()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsSizeInit()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsOverlapping()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsXToOriginPos()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsYToOriginPos()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsZToOriginPos()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsRotation()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsText()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsTrim()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsCategoryBitMask()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsCollisionBitMask()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS__CONSTRAINTS,
				 GraphicFactory.eINSTANCE.createGraphicRootClassesItemsConstraintsContactTestBitMask()));
	}

}
