/**
 */
package externals.provider;


import externals.ExternalsFactory;
import externals.ExternalsPackage;
import externals.ExternalsRootAPIDescriptionsItems;

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
 * This is the item provider adapter for a {@link externals.ExternalsRootAPIDescriptionsItems} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalsRootAPIDescriptionsItemsItemProvider 
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
	public ExternalsRootAPIDescriptionsItemsItemProvider(AdapterFactory adapterFactory) {
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
			addProtocolPropertyDescriptor(object);
			addUrlPropertyDescriptor(object);
			addPathsPropertyDescriptor(object);
			addAPIAuthPropertyDescriptor(object);
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
				 getString("_UI_ExternalsRootAPIDescriptionsItems_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExternalsRootAPIDescriptionsItems_name_feature", "_UI_ExternalsRootAPIDescriptionsItems_type"),
				 ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExternalsRootAPIDescriptionsItems_protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExternalsRootAPIDescriptionsItems_protocol_feature", "_UI_ExternalsRootAPIDescriptionsItems_type"),
				 ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PROTOCOL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExternalsRootAPIDescriptionsItems_url_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExternalsRootAPIDescriptionsItems_url_feature", "_UI_ExternalsRootAPIDescriptionsItems_type"),
				 ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__URL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paths feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExternalsRootAPIDescriptionsItems_paths_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExternalsRootAPIDescriptionsItems_paths_feature", "_UI_ExternalsRootAPIDescriptionsItems_type"),
				 ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PATHS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the API Auth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAPIAuthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExternalsRootAPIDescriptionsItems_APIAuth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExternalsRootAPIDescriptionsItems_APIAuth_feature", "_UI_ExternalsRootAPIDescriptionsItems_type"),
				 ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__API_AUTH,
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
			childrenFeatures.add(ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS);
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
	 * This returns ExternalsRootAPIDescriptionsItems.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExternalsRootAPIDescriptionsItems"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExternalsRootAPIDescriptionsItems)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ExternalsRootAPIDescriptionsItems_type") :
			getString("_UI_ExternalsRootAPIDescriptionsItems_type") + " " + label;
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

		switch (notification.getFeatureID(ExternalsRootAPIDescriptionsItems.class)) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__NAME:
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PROTOCOL:
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__URL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS:
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
				(ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS,
				 ExternalsFactory.eINSTANCE.createExternalsRootAPIDescriptionsItemsName()));

		newChildDescriptors.add
			(createChildParameter
				(ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS,
				 ExternalsFactory.eINSTANCE.createExternalsRootAPIDescriptionsItemsProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS,
				 ExternalsFactory.eINSTANCE.createExternalsRootAPIDescriptionsItemsUrl()));

		newChildDescriptors.add
			(createChildParameter
				(ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS,
				 ExternalsFactory.eINSTANCE.createExternalsRootAPIDescriptionsItemsPaths()));

		newChildDescriptors.add
			(createChildParameter
				(ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS,
				 ExternalsFactory.eINSTANCE.createExternalsRootAPIDescriptionsItemsAPIAuth()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ExternalsOptEditPlugin.INSTANCE;
	}

}
