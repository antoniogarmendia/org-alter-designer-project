/**
 */
package accesses.impl;

import accesses.AccessesPackage;
import accesses.AccessesRootExternalAccess;
import accesses.AccessesRootExternalAccessItems;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root External Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessImpl#getExternalAccess <em>External Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessesRootExternalAccessImpl extends AccessesRootPropertiesAbstractImpl implements AccessesRootExternalAccess {
	/**
	 * The cached value of the '{@link #getExternalAccess() <em>External Access</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessesRootExternalAccessItems> externalAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessesRootExternalAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessesPackage.Literals.ACCESSES_ROOT_EXTERNAL_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessesRootExternalAccessItems> getExternalAccess() {
		if (externalAccess == null) {
			externalAccess = new EObjectContainmentEList<AccessesRootExternalAccessItems>(AccessesRootExternalAccessItems.class, this, AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS__EXTERNAL_ACCESS);
		}
		return externalAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS__EXTERNAL_ACCESS:
				return ((InternalEList<?>)getExternalAccess()).basicRemove(otherEnd, msgs);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS__EXTERNAL_ACCESS:
				return getExternalAccess();
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS__EXTERNAL_ACCESS:
				getExternalAccess().clear();
				getExternalAccess().addAll((Collection<? extends AccessesRootExternalAccessItems>)newValue);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS__EXTERNAL_ACCESS:
				getExternalAccess().clear();
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS__EXTERNAL_ACCESS:
				return externalAccess != null && !externalAccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccessesRootExternalAccessImpl
