/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConstraintsCategoryBitMask;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Constraints Category Bit Mask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsCategoryBitMaskImpl#getCategoryBitMask <em>Category Bit Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsConstraintsCategoryBitMaskImpl extends GraphicRootClassesItemsConstraintsPropertiesAbstractImpl implements GraphicRootClassesItemsConstraintsCategoryBitMask {
	/**
	 * The default value of the '{@link #getCategoryBitMask() <em>Category Bit Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryBitMask()
	 * @generated
	 * @ordered
	 */
	protected static final Double CATEGORY_BIT_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryBitMask() <em>Category Bit Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryBitMask()
	 * @generated
	 * @ordered
	 */
	protected Double categoryBitMask = CATEGORY_BIT_MASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsConstraintsCategoryBitMaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getCategoryBitMask() {
		return categoryBitMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryBitMask(Double newCategoryBitMask) {
		Double oldCategoryBitMask = categoryBitMask;
		categoryBitMask = newCategoryBitMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK__CATEGORY_BIT_MASK, oldCategoryBitMask, categoryBitMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK__CATEGORY_BIT_MASK:
				return getCategoryBitMask();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK__CATEGORY_BIT_MASK:
				setCategoryBitMask((Double)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK__CATEGORY_BIT_MASK:
				setCategoryBitMask(CATEGORY_BIT_MASK_EDEFAULT);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_CATEGORY_BIT_MASK__CATEGORY_BIT_MASK:
				return CATEGORY_BIT_MASK_EDEFAULT == null ? categoryBitMask != null : !CATEGORY_BIT_MASK_EDEFAULT.equals(categoryBitMask);
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
		result.append(" (categoryBitMask: ");
		result.append(categoryBitMask);
		result.append(')');
		return result.toString();
	}

} //GraphicRootClassesItemsConstraintsCategoryBitMaskImpl
