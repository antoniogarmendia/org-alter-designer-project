/**
 */
package ontological.impl;

import ontological.OntologicalPackage;
import ontological.OntologicalRootClassesItemsAttributesItemsIsParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Attributes Items Is Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsIsParamImpl#getIsParam <em>Is Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalRootClassesItemsAttributesItemsIsParamImpl extends OntologicalRootClassesItemsAttributesItemsPropertiesAbstractImpl implements OntologicalRootClassesItemsAttributesItemsIsParam {
	/**
	 * The default value of the '{@link #getIsParam() <em>Is Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsParam()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PARAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsParam() <em>Is Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsParam()
	 * @generated
	 * @ordered
	 */
	protected Boolean isParam = IS_PARAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalRootClassesItemsAttributesItemsIsParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsParam() {
		return isParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsParam(Boolean newIsParam) {
		Boolean oldIsParam = isParam;
		isParam = newIsParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM__IS_PARAM, oldIsParam, isParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM__IS_PARAM:
				return getIsParam();
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM__IS_PARAM:
				setIsParam((Boolean)newValue);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM__IS_PARAM:
				setIsParam(IS_PARAM_EDEFAULT);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM__IS_PARAM:
				return IS_PARAM_EDEFAULT == null ? isParam != null : !IS_PARAM_EDEFAULT.equals(isParam);
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
		result.append(" (isParam: ");
		result.append(isParam);
		result.append(')');
		return result.toString();
	}

} //OntologicalRootClassesItemsAttributesItemsIsParamImpl
