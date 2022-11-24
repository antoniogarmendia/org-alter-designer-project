/**
 */
package ontological.impl;

import ontological.OntologicalPackage;
import ontological.OntologicalRootClassesItemsReferencesItemsContaintment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items References Items Containtment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsContaintmentImpl#getContaintment <em>Containtment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalRootClassesItemsReferencesItemsContaintmentImpl extends OntologicalRootClassesItemsReferencesItemsPropertiesAbstractImpl implements OntologicalRootClassesItemsReferencesItemsContaintment {
	/**
	 * The default value of the '{@link #getContaintment() <em>Containtment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContaintment()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINTMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContaintment() <em>Containtment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContaintment()
	 * @generated
	 * @ordered
	 */
	protected String containtment = CONTAINTMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalRootClassesItemsReferencesItemsContaintmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContaintment() {
		return containtment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContaintment(String newContaintment) {
		String oldContaintment = containtment;
		containtment = newContaintment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT__CONTAINTMENT, oldContaintment, containtment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT__CONTAINTMENT:
				return getContaintment();
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT__CONTAINTMENT:
				setContaintment((String)newValue);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT__CONTAINTMENT:
				setContaintment(CONTAINTMENT_EDEFAULT);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT__CONTAINTMENT:
				return CONTAINTMENT_EDEFAULT == null ? containtment != null : !CONTAINTMENT_EDEFAULT.equals(containtment);
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
		result.append(" (containtment: ");
		result.append(containtment);
		result.append(')');
		return result.toString();
	}

} //OntologicalRootClassesItemsReferencesItemsContaintmentImpl
