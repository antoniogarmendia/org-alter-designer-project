/**
 */
package codesinfos.impl;

import codesinfos.CodesinfosPackage;
import codesinfos.CodesinfosRootCodesItemsNodename;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Codes Items Nodename</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codesinfos.impl.CodesinfosRootCodesItemsNodenameImpl#getNodename <em>Nodename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodesinfosRootCodesItemsNodenameImpl extends CodesinfosRootCodesItemsPropertiesAbstractImpl implements CodesinfosRootCodesItemsNodename {
	/**
	 * The default value of the '{@link #getNodename() <em>Nodename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodename()
	 * @generated
	 * @ordered
	 */
	protected static final String NODENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodename() <em>Nodename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodename()
	 * @generated
	 * @ordered
	 */
	protected String nodename = NODENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodesinfosRootCodesItemsNodenameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesinfosPackage.Literals.CODESINFOS_ROOT_CODES_ITEMS_NODENAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNodename() {
		return nodename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodename(String newNodename) {
		String oldNodename = nodename;
		nodename = newNodename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS_NODENAME__NODENAME, oldNodename, nodename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS_NODENAME__NODENAME:
				return getNodename();
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
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS_NODENAME__NODENAME:
				setNodename((String)newValue);
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
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS_NODENAME__NODENAME:
				setNodename(NODENAME_EDEFAULT);
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
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS_NODENAME__NODENAME:
				return NODENAME_EDEFAULT == null ? nodename != null : !NODENAME_EDEFAULT.equals(nodename);
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
		result.append(" (nodename: ");
		result.append(nodename);
		result.append(')');
		return result.toString();
	}

} //CodesinfosRootCodesItemsNodenameImpl
