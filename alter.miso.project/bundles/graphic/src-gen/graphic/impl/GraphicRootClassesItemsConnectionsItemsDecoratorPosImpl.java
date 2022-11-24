/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConnectionsItemsDecoratorPos;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Connections Items Decorator Pos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorPosImpl#getDecoratorPos <em>Decorator Pos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsConnectionsItemsDecoratorPosImpl extends GraphicRootClassesItemsConnectionsItemsPropertiesAbstractImpl implements GraphicRootClassesItemsConnectionsItemsDecoratorPos {
	/**
	 * The default value of the '{@link #getDecoratorPos() <em>Decorator Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorPos()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATOR_POS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecoratorPos() <em>Decorator Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorPos()
	 * @generated
	 * @ordered
	 */
	protected String decoratorPos = DECORATOR_POS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsConnectionsItemsDecoratorPosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecoratorPos() {
		return decoratorPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecoratorPos(String newDecoratorPos) {
		String oldDecoratorPos = decoratorPos;
		decoratorPos = newDecoratorPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS__DECORATOR_POS, oldDecoratorPos, decoratorPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS__DECORATOR_POS:
				return getDecoratorPos();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS__DECORATOR_POS:
				setDecoratorPos((String)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS__DECORATOR_POS:
				setDecoratorPos(DECORATOR_POS_EDEFAULT);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_POS__DECORATOR_POS:
				return DECORATOR_POS_EDEFAULT == null ? decoratorPos != null : !DECORATOR_POS_EDEFAULT.equals(decoratorPos);
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
		result.append(" (decoratorPos: ");
		result.append(decoratorPos);
		result.append(')');
		return result.toString();
	}

} //GraphicRootClassesItemsConnectionsItemsDecoratorPosImpl
