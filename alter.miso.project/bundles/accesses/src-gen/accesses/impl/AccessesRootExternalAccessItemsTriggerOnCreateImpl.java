/**
 */
package accesses.impl;

import accesses.AccessesPackage;
import accesses.AccessesRootExternalAccessItemsTriggerOnCreate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root External Access Items Trigger On Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnCreateImpl#getOnCreate <em>On Create</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessesRootExternalAccessItemsTriggerOnCreateImpl extends AccessesRootExternalAccessItemsTriggerPropertiesAbstractImpl implements AccessesRootExternalAccessItemsTriggerOnCreate {
	/**
	 * The default value of the '{@link #getOnCreate() <em>On Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCreate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ON_CREATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnCreate() <em>On Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCreate()
	 * @generated
	 * @ordered
	 */
	protected Boolean onCreate = ON_CREATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessesRootExternalAccessItemsTriggerOnCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessesPackage.Literals.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnCreate() {
		return onCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnCreate(Boolean newOnCreate) {
		Boolean oldOnCreate = onCreate;
		onCreate = newOnCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE__ON_CREATE, oldOnCreate, onCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE__ON_CREATE:
				return getOnCreate();
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE__ON_CREATE:
				setOnCreate((Boolean)newValue);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE__ON_CREATE:
				setOnCreate(ON_CREATE_EDEFAULT);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE__ON_CREATE:
				return ON_CREATE_EDEFAULT == null ? onCreate != null : !ON_CREATE_EDEFAULT.equals(onCreate);
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
		result.append(" (onCreate: ");
		result.append(onCreate);
		result.append(')');
		return result.toString();
	}

} //AccessesRootExternalAccessItemsTriggerOnCreateImpl
