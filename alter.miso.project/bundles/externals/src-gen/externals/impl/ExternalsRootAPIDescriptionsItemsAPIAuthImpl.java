/**
 */
package externals.impl;

import externals.ExternalsPackage;
import externals.ExternalsRootAPIDescriptionsItemsAPIAuth;
import externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root API Descriptions Items API Auth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsAPIAuthImpl#getAPIAuth <em>API Auth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalsRootAPIDescriptionsItemsAPIAuthImpl extends ExternalsRootAPIDescriptionsItemsPropertiesAbstractImpl implements ExternalsRootAPIDescriptionsItemsAPIAuth {
	/**
	 * The cached value of the '{@link #getAPIAuth() <em>API Auth</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPIAuth()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalsRootAPIDescriptionsItemsAPIAuthItems> apiAuth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsAPIAuthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalsRootAPIDescriptionsItemsAPIAuthItems> getAPIAuth() {
		if (apiAuth == null) {
			apiAuth = new EObjectContainmentEList<ExternalsRootAPIDescriptionsItemsAPIAuthItems>(ExternalsRootAPIDescriptionsItemsAPIAuthItems.class, this, ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH__API_AUTH);
		}
		return apiAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH__API_AUTH:
				return ((InternalEList<?>)getAPIAuth()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH__API_AUTH:
				return getAPIAuth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH__API_AUTH:
				getAPIAuth().clear();
				getAPIAuth().addAll((Collection<? extends ExternalsRootAPIDescriptionsItemsAPIAuthItems>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH__API_AUTH:
				getAPIAuth().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_API_AUTH__API_AUTH:
				return apiAuth != null && !apiAuth.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExternalsRootAPIDescriptionsItemsAPIAuthImpl
