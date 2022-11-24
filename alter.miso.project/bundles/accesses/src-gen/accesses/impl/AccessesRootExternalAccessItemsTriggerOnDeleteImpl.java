/**
 */
package accesses.impl;

import accesses.AccessesPackage;
import accesses.AccessesRootExternalAccessItemsTriggerOnDelete;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root External Access Items Trigger On Delete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnDeleteImpl#getOnDelete <em>On Delete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessesRootExternalAccessItemsTriggerOnDeleteImpl extends AccessesRootExternalAccessItemsTriggerPropertiesAbstractImpl implements AccessesRootExternalAccessItemsTriggerOnDelete {
	/**
	 * The default value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ON_DELETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected Boolean onDelete = ON_DELETE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessesRootExternalAccessItemsTriggerOnDeleteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessesPackage.Literals.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnDelete() {
		return onDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnDelete(Boolean newOnDelete) {
		Boolean oldOnDelete = onDelete;
		onDelete = newOnDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE__ON_DELETE, oldOnDelete, onDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE__ON_DELETE:
				return getOnDelete();
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE__ON_DELETE:
				setOnDelete((Boolean)newValue);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE__ON_DELETE:
				setOnDelete(ON_DELETE_EDEFAULT);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE__ON_DELETE:
				return ON_DELETE_EDEFAULT == null ? onDelete != null : !ON_DELETE_EDEFAULT.equals(onDelete);
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
		result.append(" (onDelete: ");
		result.append(onDelete);
		result.append(')');
		return result.toString();
	}

} //AccessesRootExternalAccessItemsTriggerOnDeleteImpl
