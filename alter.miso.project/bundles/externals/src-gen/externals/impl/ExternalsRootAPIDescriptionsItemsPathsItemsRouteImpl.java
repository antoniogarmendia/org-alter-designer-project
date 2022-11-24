/**
 */
package externals.impl;

import externals.ExternalsPackage;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsRoute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root API Descriptions Items Paths Items Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsRouteImpl#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalsRootAPIDescriptionsItemsPathsItemsRouteImpl extends ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractImpl implements ExternalsRootAPIDescriptionsItemsPathsItemsRoute {
	/**
	 * The default value of the '{@link #getRoute() <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected String route = ROUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoute(String newRoute) {
		String oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE__ROUTE:
				return getRoute();
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE__ROUTE:
				setRoute((String)newValue);
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE__ROUTE:
				setRoute(ROUTE_EDEFAULT);
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_ROUTE__ROUTE:
				return ROUTE_EDEFAULT == null ? route != null : !ROUTE_EDEFAULT.equals(route);
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
		result.append(" (route: ");
		result.append(route);
		result.append(')');
		return result.toString();
	}

} //ExternalsRootAPIDescriptionsItemsPathsItemsRouteImpl
