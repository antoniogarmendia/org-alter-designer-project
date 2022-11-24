/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConnectionsItemsDecoratorWidth;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Connections Items Decorator Width</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorWidthImpl#getDecoratorWidth <em>Decorator Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsConnectionsItemsDecoratorWidthImpl extends GraphicRootClassesItemsConnectionsItemsPropertiesAbstractImpl implements GraphicRootClassesItemsConnectionsItemsDecoratorWidth {
	/**
	 * The default value of the '{@link #getDecoratorWidth() <em>Decorator Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATOR_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecoratorWidth() <em>Decorator Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorWidth()
	 * @generated
	 * @ordered
	 */
	protected String decoratorWidth = DECORATOR_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsConnectionsItemsDecoratorWidthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecoratorWidth() {
		return decoratorWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecoratorWidth(String newDecoratorWidth) {
		String oldDecoratorWidth = decoratorWidth;
		decoratorWidth = newDecoratorWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH__DECORATOR_WIDTH, oldDecoratorWidth, decoratorWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH__DECORATOR_WIDTH:
				return getDecoratorWidth();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH__DECORATOR_WIDTH:
				setDecoratorWidth((String)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH__DECORATOR_WIDTH:
				setDecoratorWidth(DECORATOR_WIDTH_EDEFAULT);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR_WIDTH__DECORATOR_WIDTH:
				return DECORATOR_WIDTH_EDEFAULT == null ? decoratorWidth != null : !DECORATOR_WIDTH_EDEFAULT.equals(decoratorWidth);
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
		result.append(" (decoratorWidth: ");
		result.append(decoratorWidth);
		result.append(')');
		return result.toString();
	}

} //GraphicRootClassesItemsConnectionsItemsDecoratorWidthImpl
