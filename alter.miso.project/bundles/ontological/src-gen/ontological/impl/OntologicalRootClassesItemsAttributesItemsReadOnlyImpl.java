/**
 */
package ontological.impl;

import ontological.OntologicalPackage;
import ontological.OntologicalRootClassesItemsAttributesItemsReadOnly;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Attributes Items Read Only</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsReadOnlyImpl#getReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalRootClassesItemsAttributesItemsReadOnlyImpl extends OntologicalRootClassesItemsAttributesItemsPropertiesAbstractImpl implements OntologicalRootClassesItemsAttributesItemsReadOnly {
	/**
	 * The default value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean READ_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalRootClassesItemsAttributesItemsReadOnlyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(Boolean newReadOnly) {
		Boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY__READ_ONLY:
				return getReadOnly();
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY__READ_ONLY:
				setReadOnly((Boolean)newValue);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY__READ_ONLY:
				return READ_ONLY_EDEFAULT == null ? readOnly != null : !READ_ONLY_EDEFAULT.equals(readOnly);
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
		result.append(" (readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //OntologicalRootClassesItemsAttributesItemsReadOnlyImpl
