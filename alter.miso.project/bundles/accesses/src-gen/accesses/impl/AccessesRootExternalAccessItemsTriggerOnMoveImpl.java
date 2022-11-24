/**
 */
package accesses.impl;

import accesses.AccessesPackage;
import accesses.AccessesRootExternalAccessItemsTriggerOnMove;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root External Access Items Trigger On Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsTriggerOnMoveImpl#getOnMove <em>On Move</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessesRootExternalAccessItemsTriggerOnMoveImpl extends AccessesRootExternalAccessItemsTriggerPropertiesAbstractImpl implements AccessesRootExternalAccessItemsTriggerOnMove {
	/**
	 * The default value of the '{@link #getOnMove() <em>On Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnMove()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ON_MOVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnMove() <em>On Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnMove()
	 * @generated
	 * @ordered
	 */
	protected Boolean onMove = ON_MOVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessesRootExternalAccessItemsTriggerOnMoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessesPackage.Literals.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnMove() {
		return onMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnMove(Boolean newOnMove) {
		Boolean oldOnMove = onMove;
		onMove = newOnMove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE__ON_MOVE, oldOnMove, onMove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE__ON_MOVE:
				return getOnMove();
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE__ON_MOVE:
				setOnMove((Boolean)newValue);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE__ON_MOVE:
				setOnMove(ON_MOVE_EDEFAULT);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE__ON_MOVE:
				return ON_MOVE_EDEFAULT == null ? onMove != null : !ON_MOVE_EDEFAULT.equals(onMove);
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
		result.append(" (onMove: ");
		result.append(onMove);
		result.append(')');
		return result.toString();
	}

} //AccessesRootExternalAccessItemsTriggerOnMoveImpl
