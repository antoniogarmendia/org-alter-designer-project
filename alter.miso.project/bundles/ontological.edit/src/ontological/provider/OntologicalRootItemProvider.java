/**
 */
package ontological.provider;


import java.util.Collection;
import java.util.List;

import ontological.OntologicalFactory;
import ontological.OntologicalPackage;
import ontological.OntologicalRoot;

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
 * This is the item provider adapter for a {@link ontological.OntologicalRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OntologicalRootItemProvider 
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
	public OntologicalRootItemProvider(AdapterFactory adapterFactory) {
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
			addURIPropertyDescriptor(object);
			addOnlyCodesPropertyDescriptor(object);
			addBluetoothPropertyDescriptor(object);
			addExternalPropertyDescriptor(object);
			addFirebasePropertyDescriptor(object);
			addPhysicsPropertyDescriptor(object);
			addGameloopPropertyDescriptor(object);
			addClassesPropertyDescriptor(object);
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
				 getString("_UI_OntologicalRoot_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRoot_name_feature", "_UI_OntologicalRoot_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRoot_URI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRoot_URI_feature", "_UI_OntologicalRoot_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT__URI,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Only Codes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnlyCodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRoot_onlyCodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRoot_onlyCodes_feature", "_UI_OntologicalRoot_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT__ONLY_CODES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bluetooth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBluetoothPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRoot_bluetooth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRoot_bluetooth_feature", "_UI_OntologicalRoot_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT__BLUETOOTH,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRoot_external_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRoot_external_feature", "_UI_OntologicalRoot_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT__EXTERNAL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Firebase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirebasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRoot_firebase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRoot_firebase_feature", "_UI_OntologicalRoot_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT__FIREBASE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Physics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRoot_physics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRoot_physics_feature", "_UI_OntologicalRoot_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT__PHYSICS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gameloop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGameloopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRoot_gameloop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRoot_gameloop_feature", "_UI_OntologicalRoot_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT__GAMELOOP,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OntologicalRoot_classes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OntologicalRoot_classes_feature", "_UI_OntologicalRoot_type"),
				 OntologicalPackage.Literals.ONTOLOGICAL_ROOT__CLASSES,
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
			childrenFeatures.add(OntologicalPackage.Literals.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT);
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
	 * This returns OntologicalRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OntologicalRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OntologicalRoot)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OntologicalRoot_type") :
			getString("_UI_OntologicalRoot_type") + " " + label;
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

		switch (notification.getFeatureID(OntologicalRoot.class)) {
			case OntologicalPackage.ONTOLOGICAL_ROOT__NAME:
			case OntologicalPackage.ONTOLOGICAL_ROOT__URI:
			case OntologicalPackage.ONTOLOGICAL_ROOT__ONLY_CODES:
			case OntologicalPackage.ONTOLOGICAL_ROOT__BLUETOOTH:
			case OntologicalPackage.ONTOLOGICAL_ROOT__EXTERNAL:
			case OntologicalPackage.ONTOLOGICAL_ROOT__FIREBASE:
			case OntologicalPackage.ONTOLOGICAL_ROOT__PHYSICS:
			case OntologicalPackage.ONTOLOGICAL_ROOT__GAMELOOP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OntologicalPackage.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT:
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
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT,
				 OntologicalFactory.eINSTANCE.createOntologicalRootName()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT,
				 OntologicalFactory.eINSTANCE.createOntologicalRootURI()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT,
				 OntologicalFactory.eINSTANCE.createOntologicalRootOnlyCodes()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT,
				 OntologicalFactory.eINSTANCE.createOntologicalRootBluetooth()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT,
				 OntologicalFactory.eINSTANCE.createOntologicalRootExternal()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT,
				 OntologicalFactory.eINSTANCE.createOntologicalRootFirebase()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT,
				 OntologicalFactory.eINSTANCE.createOntologicalRootPhysics()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT,
				 OntologicalFactory.eINSTANCE.createOntologicalRootGameloop()));

		newChildDescriptors.add
			(createChildParameter
				(OntologicalPackage.Literals.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT,
				 OntologicalFactory.eINSTANCE.createOntologicalRootClasses()));
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
