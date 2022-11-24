/**
 */
package accesses.impl;

import accesses.AccessesPackage;
import accesses.AccessesRootExternalAccessItemsOutputItemsAPIOutput;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root External Access Items Output Items API Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsOutputItemsAPIOutputImpl#getAPIOutput <em>API Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessesRootExternalAccessItemsOutputItemsAPIOutputImpl extends AccessesRootExternalAccessItemsOutputItemsPropertiesAbstractImpl implements AccessesRootExternalAccessItemsOutputItemsAPIOutput {
	/**
	 * The default value of the '{@link #getAPIOutput() <em>API Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPIOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String API_OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAPIOutput() <em>API Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPIOutput()
	 * @generated
	 * @ordered
	 */
	protected String apiOutput = API_OUTPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessesRootExternalAccessItemsOutputItemsAPIOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessesPackage.Literals.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAPIOutput() {
		return apiOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAPIOutput(String newAPIOutput) {
		String oldAPIOutput = apiOutput;
		apiOutput = newAPIOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT__API_OUTPUT, oldAPIOutput, apiOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT__API_OUTPUT:
				return getAPIOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT__API_OUTPUT:
				setAPIOutput((String)newValue);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT__API_OUTPUT:
				setAPIOutput(API_OUTPUT_EDEFAULT);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT__API_OUTPUT:
				return API_OUTPUT_EDEFAULT == null ? apiOutput != null : !API_OUTPUT_EDEFAULT.equals(apiOutput);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (APIOutput: ");
		result.append(apiOutput);
		result.append(')');
		return result.toString();
	}

} //AccessesRootExternalAccessItemsOutputItemsAPIOutputImpl
