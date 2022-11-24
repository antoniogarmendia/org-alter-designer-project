/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsConnectionsItemsDecorator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Connections Items Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsConnectionsItemsDecoratorImpl#getDecorator <em>Decorator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsConnectionsItemsDecoratorImpl extends GraphicRootClassesItemsConnectionsItemsPropertiesAbstractImpl implements GraphicRootClassesItemsConnectionsItemsDecorator {
	/**
	 * The default value of the '{@link #getDecorator() <em>Decorator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorator()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecorator() <em>Decorator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorator()
	 * @generated
	 * @ordered
	 */
	protected String decorator = DECORATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsConnectionsItemsDecoratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecorator() {
		return decorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecorator(String newDecorator) {
		String oldDecorator = decorator;
		decorator = newDecorator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR__DECORATOR, oldDecorator, decorator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR__DECORATOR:
				return getDecorator();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR__DECORATOR:
				setDecorator((String)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR__DECORATOR:
				setDecorator(DECORATOR_EDEFAULT);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_CONNECTIONS_ITEMS_DECORATOR__DECORATOR:
				return DECORATOR_EDEFAULT == null ? decorator != null : !DECORATOR_EDEFAULT.equals(decorator);
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
		result.append(" (decorator: ");
		result.append(decorator);
		result.append(')');
		return result.toString();
	}

} //GraphicRootClassesItemsConnectionsItemsDecoratorImpl
