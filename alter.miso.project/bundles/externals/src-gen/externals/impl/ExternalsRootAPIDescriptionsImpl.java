/**
 */
package externals.impl;

import externals.ExternalsPackage;
import externals.ExternalsRootAPIDescriptions;
import externals.ExternalsRootAPIDescriptionsItems;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root API Descriptions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsImpl#getAPIDescriptions <em>API Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalsRootAPIDescriptionsImpl extends ExternalsRootPropertiesAbstractImpl implements ExternalsRootAPIDescriptions {
	/**
	 * The cached value of the '{@link #getAPIDescriptions() <em>API Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPIDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalsRootAPIDescriptionsItems> apiDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalsRootAPIDescriptionsItems> getAPIDescriptions() {
		if (apiDescriptions == null) {
			apiDescriptions = new EObjectContainmentEList<ExternalsRootAPIDescriptionsItems>(ExternalsRootAPIDescriptionsItems.class, this, ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS__API_DESCRIPTIONS);
		}
		return apiDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS__API_DESCRIPTIONS:
				return ((InternalEList<?>)getAPIDescriptions()).basicRemove(otherEnd, msgs);
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS__API_DESCRIPTIONS:
				return getAPIDescriptions();
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS__API_DESCRIPTIONS:
				getAPIDescriptions().clear();
				getAPIDescriptions().addAll((Collection<? extends ExternalsRootAPIDescriptionsItems>)newValue);
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS__API_DESCRIPTIONS:
				getAPIDescriptions().clear();
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS__API_DESCRIPTIONS:
				return apiDescriptions != null && !apiDescriptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExternalsRootAPIDescriptionsImpl
