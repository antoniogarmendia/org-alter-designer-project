/**
 */
package accesses.impl;

import accesses.AccessesPackage;
import accesses.AccessesRootExternalAccessItemsTriggerTimeTrigger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root External Access Items Trigger Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsTriggerTimeTriggerImpl#getTimeTrigger <em>Time Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessesRootExternalAccessItemsTriggerTimeTriggerImpl extends AccessesRootExternalAccessItemsTriggerPropertiesAbstractImpl implements AccessesRootExternalAccessItemsTriggerTimeTrigger {
	/**
	 * The default value of the '{@link #getTimeTrigger() <em>Time Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final Double TIME_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeTrigger() <em>Time Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTrigger()
	 * @generated
	 * @ordered
	 */
	protected Double timeTrigger = TIME_TRIGGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessesRootExternalAccessItemsTriggerTimeTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessesPackage.Literals.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getTimeTrigger() {
		return timeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeTrigger(Double newTimeTrigger) {
		Double oldTimeTrigger = timeTrigger;
		timeTrigger = newTimeTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER__TIME_TRIGGER, oldTimeTrigger, timeTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER__TIME_TRIGGER:
				return getTimeTrigger();
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER__TIME_TRIGGER:
				setTimeTrigger((Double)newValue);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER__TIME_TRIGGER:
				setTimeTrigger(TIME_TRIGGER_EDEFAULT);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER__TIME_TRIGGER:
				return TIME_TRIGGER_EDEFAULT == null ? timeTrigger != null : !TIME_TRIGGER_EDEFAULT.equals(timeTrigger);
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
		result.append(" (timeTrigger: ");
		result.append(timeTrigger);
		result.append(')');
		return result.toString();
	}

} //AccessesRootExternalAccessItemsTriggerTimeTriggerImpl
