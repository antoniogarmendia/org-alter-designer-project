/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConstraintsOverlapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Constraints Overlapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsOverlappingImpl#getOverlapping <em>Overlapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsConstraintsOverlappingImpl extends GraphicRootClassesItemsConstraintsPropertiesAbstractImpl implements GraphicRootClassesItemsConstraintsOverlapping {
	/**
	 * The default value of the '{@link #getOverlapping() <em>Overlapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlapping()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERLAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverlapping() <em>Overlapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlapping()
	 * @generated
	 * @ordered
	 */
	protected String overlapping = OVERLAPPING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsConstraintsOverlappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOverlapping() {
		return overlapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverlapping(String newOverlapping) {
		String oldOverlapping = overlapping;
		overlapping = newOverlapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING__OVERLAPPING, oldOverlapping, overlapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING__OVERLAPPING:
				return getOverlapping();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING__OVERLAPPING:
				setOverlapping((String)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING__OVERLAPPING:
				setOverlapping(OVERLAPPING_EDEFAULT);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_OVERLAPPING__OVERLAPPING:
				return OVERLAPPING_EDEFAULT == null ? overlapping != null : !OVERLAPPING_EDEFAULT.equals(overlapping);
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
		result.append(" (overlapping: ");
		result.append(overlapping);
		result.append(')');
		return result.toString();
	}

} //GraphicRootClassesItemsConstraintsOverlappingImpl
