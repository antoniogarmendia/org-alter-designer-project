/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConnectionsItemsDecoratorColor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Connections Items Decorator Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorColorImpl#getDecoratorColor <em>Decorator Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsConnectionsItemsDecoratorColorImpl extends GraphicRootClassesItemsConnectionsItemsPropertiesAbstractImpl implements GraphicRootClassesItemsConnectionsItemsDecoratorColor {
	/**
	 * The default value of the '{@link #getDecoratorColor() <em>Decorator Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorColor()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATOR_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecoratorColor() <em>Decorator Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorColor()
	 * @generated
	 * @ordered
	 */
	protected String decoratorColor = DECORATOR_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsConnectionsItemsDecoratorColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecoratorColor() {
		return decoratorColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecoratorColor(String newDecoratorColor) {
		String oldDecoratorColor = decoratorColor;
		decoratorColor = newDecoratorColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR__DECORATOR_COLOR, oldDecoratorColor, decoratorColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR__DECORATOR_COLOR:
				return getDecoratorColor();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR__DECORATOR_COLOR:
				setDecoratorColor((String)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR__DECORATOR_COLOR:
				setDecoratorColor(DECORATOR_COLOR_EDEFAULT);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_COLOR__DECORATOR_COLOR:
				return DECORATOR_COLOR_EDEFAULT == null ? decoratorColor != null : !DECORATOR_COLOR_EDEFAULT.equals(decoratorColor);
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
		result.append(" (decoratorColor: ");
		result.append(decoratorColor);
		result.append(')');
		return result.toString();
	}

} //GraphicRootClassesItemsConnectionsItemsDecoratorColorImpl
