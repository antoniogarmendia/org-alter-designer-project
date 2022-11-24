/**
 */
package externals.provider;


import externals.ExternalsPackage;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameItemProvider extends ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_name_feature", "_UI_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_type"),
				 ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_NAME__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_type") :
			getString("_UI_ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName_type") + " " + label;
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

		switch (notification.getFeatureID(ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName.class)) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS_NAME__NAME:
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
