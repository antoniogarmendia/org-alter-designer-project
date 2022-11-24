/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConstraintsSizeMax;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Constraints Size Max</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsSizeMaxImpl#getSizeMax <em>Size Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsConstraintsSizeMaxImpl extends GraphicRootClassesItemsConstraintsPropertiesAbstractImpl implements GraphicRootClassesItemsConstraintsSizeMax {
	/**
	 * The default value of the '{@link #getSizeMax() <em>Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeMax()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeMax() <em>Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeMax()
	 * @generated
	 * @ordered
	 */
	protected String sizeMax = SIZE_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsConstraintsSizeMaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSizeMax() {
		return sizeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeMax(String newSizeMax) {
		String oldSizeMax = sizeMax;
		sizeMax = newSizeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX__SIZE_MAX, oldSizeMax, sizeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX__SIZE_MAX:
				return getSizeMax();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX__SIZE_MAX:
				setSizeMax((String)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX__SIZE_MAX:
				setSizeMax(SIZE_MAX_EDEFAULT);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_SIZE_MAX__SIZE_MAX:
				return SIZE_MAX_EDEFAULT == null ? sizeMax != null : !SIZE_MAX_EDEFAULT.equals(sizeMax);
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
		result.append(" (sizeMax: ");
		result.append(sizeMax);
		result.append(')');
		return result.toString();
	}

} //GraphicRootClassesItemsConstraintsSizeMaxImpl
