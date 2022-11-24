/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConstraintsZToOriginPos;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Constraints ZTo Origin Pos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConstraintsZToOriginPosImpl#getZToOriginPos <em>ZTo Origin Pos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsConstraintsZToOriginPosImpl extends GraphicRootClassesItemsConstraintsPropertiesAbstractImpl implements GraphicRootClassesItemsConstraintsZToOriginPos {
	/**
	 * The default value of the '{@link #getZToOriginPos() <em>ZTo Origin Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZToOriginPos()
	 * @generated
	 * @ordered
	 */
	protected static final String ZTO_ORIGIN_POS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZToOriginPos() <em>ZTo Origin Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZToOriginPos()
	 * @generated
	 * @ordered
	 */
	protected String zToOriginPos = ZTO_ORIGIN_POS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsConstraintsZToOriginPosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZToOriginPos() {
		return zToOriginPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZToOriginPos(String newZToOriginPos) {
		String oldZToOriginPos = zToOriginPos;
		zToOriginPos = newZToOriginPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS__ZTO_ORIGIN_POS, oldZToOriginPos, zToOriginPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS__ZTO_ORIGIN_POS:
				return getZToOriginPos();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS__ZTO_ORIGIN_POS:
				setZToOriginPos((String)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS__ZTO_ORIGIN_POS:
				setZToOriginPos(ZTO_ORIGIN_POS_EDEFAULT);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONSTRAINTS_ZTO_ORIGIN_POS__ZTO_ORIGIN_POS:
				return ZTO_ORIGIN_POS_EDEFAULT == null ? zToOriginPos != null : !ZTO_ORIGIN_POS_EDEFAULT.equals(zToOriginPos);
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
		result.append(" (zToOriginPos: ");
		result.append(zToOriginPos);
		result.append(')');
		return result.toString();
	}

} //GraphicRootClassesItemsConstraintsZToOriginPosImpl
