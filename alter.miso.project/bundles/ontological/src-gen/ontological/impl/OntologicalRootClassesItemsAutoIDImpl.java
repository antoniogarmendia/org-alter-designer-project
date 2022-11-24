/**
 */
package ontological.impl;

import ontological.OntologicalPackage;
import ontological.OntologicalRootClassesItemsAutoID;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Auto ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsAutoIDImpl#getAutoID <em>Auto ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalRootClassesItemsAutoIDImpl extends OntologicalRootClassesItemsPropertiesAbstractImpl implements OntologicalRootClassesItemsAutoID {
	/**
	 * The default value of the '{@link #getAutoID() <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoID()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoID() <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoID()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoID = AUTO_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalRootClassesItemsAutoIDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoID() {
		return autoID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoID(Boolean newAutoID) {
		Boolean oldAutoID = autoID;
		autoID = newAutoID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID__AUTO_ID, oldAutoID, autoID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID__AUTO_ID:
				return getAutoID();
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID__AUTO_ID:
				setAutoID((Boolean)newValue);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID__AUTO_ID:
				setAutoID(AUTO_ID_EDEFAULT);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID__AUTO_ID:
				return AUTO_ID_EDEFAULT == null ? autoID != null : !AUTO_ID_EDEFAULT.equals(autoID);
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
		result.append(" (autoID: ");
		result.append(autoID);
		result.append(')');
		return result.toString();
	}

} //OntologicalRootClassesItemsAutoIDImpl
