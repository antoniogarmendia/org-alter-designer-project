/**
 */
package accesses.impl;

import accesses.AccessesPackage;
import accesses.AccessesRootExternalAccessItemsInputItemsAPIInput;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root External Access Items Input Items API Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsAPIInputImpl#getAPIInput <em>API Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessesRootExternalAccessItemsInputItemsAPIInputImpl extends AccessesRootExternalAccessItemsInputItemsPropertiesAbstractImpl implements AccessesRootExternalAccessItemsInputItemsAPIInput {
	/**
	 * The default value of the '{@link #getAPIInput() <em>API Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPIInput()
	 * @generated
	 * @ordered
	 */
	protected static final String API_INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAPIInput() <em>API Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPIInput()
	 * @generated
	 * @ordered
	 */
	protected String apiInput = API_INPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessesRootExternalAccessItemsInputItemsAPIInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessesPackage.Literals.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAPIInput() {
		return apiInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAPIInput(String newAPIInput) {
		String oldAPIInput = apiInput;
		apiInput = newAPIInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT__API_INPUT, oldAPIInput, apiInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT__API_INPUT:
				return getAPIInput();
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT__API_INPUT:
				setAPIInput((String)newValue);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT__API_INPUT:
				setAPIInput(API_INPUT_EDEFAULT);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT__API_INPUT:
				return API_INPUT_EDEFAULT == null ? apiInput != null : !API_INPUT_EDEFAULT.equals(apiInput);
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
		result.append(" (APIInput: ");
		result.append(apiInput);
		result.append(')');
		return result.toString();
	}

} //AccessesRootExternalAccessItemsInputItemsAPIInputImpl
