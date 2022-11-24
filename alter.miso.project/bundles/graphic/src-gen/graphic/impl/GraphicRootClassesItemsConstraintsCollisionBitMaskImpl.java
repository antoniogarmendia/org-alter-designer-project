/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConstraintsCollisionBitMask;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Constraints Collision Bit Mask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsCollisionBitMaskImpl#getCollisionBitMask <em>Collision Bit Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsConstraintsCollisionBitMaskImpl extends GraphicRootClassesItemsConstraintsPropertiesAbstractImpl implements GraphicRootClassesItemsConstraintsCollisionBitMask {
	/**
	 * The default value of the '{@link #getCollisionBitMask() <em>Collision Bit Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollisionBitMask()
	 * @generated
	 * @ordered
	 */
	protected static final Double COLLISION_BIT_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollisionBitMask() <em>Collision Bit Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollisionBitMask()
	 * @generated
	 * @ordered
	 */
	protected Double collisionBitMask = COLLISION_BIT_MASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsConstraintsCollisionBitMaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getCollisionBitMask() {
		return collisionBitMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollisionBitMask(Double newCollisionBitMask) {
		Double oldCollisionBitMask = collisionBitMask;
		collisionBitMask = newCollisionBitMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK__COLLISION_BIT_MASK, oldCollisionBitMask, collisionBitMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK__COLLISION_BIT_MASK:
				return getCollisionBitMask();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK__COLLISION_BIT_MASK:
				setCollisionBitMask((Double)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK__COLLISION_BIT_MASK:
				setCollisionBitMask(COLLISION_BIT_MASK_EDEFAULT);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_COLLISION_BIT_MASK__COLLISION_BIT_MASK:
				return COLLISION_BIT_MASK_EDEFAULT == null ? collisionBitMask != null : !COLLISION_BIT_MASK_EDEFAULT.equals(collisionBitMask);
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
		result.append(" (collisionBitMask: ");
		result.append(collisionBitMask);
		result.append(')');
		return result.toString();
	}

} //GraphicRootClassesItemsConstraintsCollisionBitMaskImpl
