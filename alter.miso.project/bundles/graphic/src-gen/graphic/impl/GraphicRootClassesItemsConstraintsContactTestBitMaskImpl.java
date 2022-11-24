/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConstraintsContactTestBitMask;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Constraints Contact Test Bit Mask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsContactTestBitMaskImpl#getContactTestBitMask <em>Contact Test Bit Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsConstraintsContactTestBitMaskImpl extends GraphicRootClassesItemsConstraintsPropertiesAbstractImpl implements GraphicRootClassesItemsConstraintsContactTestBitMask {
	/**
	 * The default value of the '{@link #getContactTestBitMask() <em>Contact Test Bit Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactTestBitMask()
	 * @generated
	 * @ordered
	 */
	protected static final Double CONTACT_TEST_BIT_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactTestBitMask() <em>Contact Test Bit Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactTestBitMask()
	 * @generated
	 * @ordered
	 */
	protected Double contactTestBitMask = CONTACT_TEST_BIT_MASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsConstraintsContactTestBitMaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getContactTestBitMask() {
		return contactTestBitMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactTestBitMask(Double newContactTestBitMask) {
		Double oldContactTestBitMask = contactTestBitMask;
		contactTestBitMask = newContactTestBitMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK__CONTACT_TEST_BIT_MASK, oldContactTestBitMask, contactTestBitMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK__CONTACT_TEST_BIT_MASK:
				return getContactTestBitMask();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK__CONTACT_TEST_BIT_MASK:
				setContactTestBitMask((Double)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK__CONTACT_TEST_BIT_MASK:
				setContactTestBitMask(CONTACT_TEST_BIT_MASK_EDEFAULT);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CONTACT_TEST_BIT_MASK__CONTACT_TEST_BIT_MASK:
				return CONTACT_TEST_BIT_MASK_EDEFAULT == null ? contactTestBitMask != null : !CONTACT_TEST_BIT_MASK_EDEFAULT.equals(contactTestBitMask);
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
		result.append(" (contactTestBitMask: ");
		result.append(contactTestBitMask);
		result.append(')');
		return result.toString();
	}

} //GraphicRootClassesItemsConstraintsContactTestBitMaskImpl
