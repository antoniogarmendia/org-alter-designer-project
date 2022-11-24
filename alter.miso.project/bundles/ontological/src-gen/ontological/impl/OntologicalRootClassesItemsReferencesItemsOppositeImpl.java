/**
 */
package ontological.impl;

import ontological.OntologicalPackage;
import ontological.OntologicalRootClassesItemsReferencesItemsOpposite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items References Items Opposite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsOppositeImpl#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalRootClassesItemsReferencesItemsOppositeImpl extends OntologicalRootClassesItemsReferencesItemsPropertiesAbstractImpl implements OntologicalRootClassesItemsReferencesItemsOpposite {
	/**
	 * The default value of the '{@link #getOpposite() <em>Opposite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected static final String OPPOSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected String opposite = OPPOSITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalRootClassesItemsReferencesItemsOppositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpposite(String newOpposite) {
		String oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE__OPPOSITE, oldOpposite, opposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE__OPPOSITE:
				return getOpposite();
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE__OPPOSITE:
				setOpposite((String)newValue);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE__OPPOSITE:
				setOpposite(OPPOSITE_EDEFAULT);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE__OPPOSITE:
				return OPPOSITE_EDEFAULT == null ? opposite != null : !OPPOSITE_EDEFAULT.equals(opposite);
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
		result.append(" (opposite: ");
		result.append(opposite);
		result.append(')');
		return result.toString();
	}

} //OntologicalRootClassesItemsReferencesItemsOppositeImpl
