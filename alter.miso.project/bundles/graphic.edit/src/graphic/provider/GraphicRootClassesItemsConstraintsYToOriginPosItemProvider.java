/**
 */
package graphic.provider;


import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConstraintsYToOriginPos;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link graphic.GraphicRootClassesItemsConstraintsYToOriginPos} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicRootClassesItemsConstraintsYToOriginPosItemProvider extends GraphicRootClassesItemsConstraintsPropertiesAbstractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicRootClassesItemsConstraintsYToOriginPosItemProvider(AdapterFactory adapterFactory) {
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

			addYToOriginPosPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_GraphicRootClassesItemsConstraintsYToOriginPos_yToOriginPos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicRootClassesItemsConstraintsYToOriginPos_yToOriginPos_feature", "_UI_GraphicRootClassesItemsConstraintsYToOriginPos_type"),
				 GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_YTO_ORIGIN_POS__YTO_ORIGIN_POS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GraphicRootClassesItemsConstraintsYToOriginPos.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GraphicRootClassesItemsConstraintsYToOriginPos"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GraphicRootClassesItemsConstraintsYToOriginPos)object).getYToOriginPos();
		return label == null || label.length() == 0 ?
			getString("_UI_GraphicRootClassesItemsConstraintsYToOriginPos_type") :
			getString("_UI_GraphicRootClassesItemsConstraintsYToOriginPos_type") + " " + label;
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

		switch (notification.getFeatureID(GraphicRootClassesItemsConstraintsYToOriginPos.class)) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_YTO_ORIGIN_POS__YTO_ORIGIN_POS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
