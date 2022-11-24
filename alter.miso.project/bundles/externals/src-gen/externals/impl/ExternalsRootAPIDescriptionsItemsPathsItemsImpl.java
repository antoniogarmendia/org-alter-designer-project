/**
 */
package externals.impl;

import externals.ExternalsPackage;
import externals.ExternalsRootAPIDescriptionsItemsPathsItems;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root API Descriptions Items Paths Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalsRootAPIDescriptionsItemsPathsItemsImpl extends MinimalEObjectImpl.Container implements ExternalsRootAPIDescriptionsItemsPathsItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract> items;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract>(ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract.class, this, ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoute() {
		return this.getItems().stream().filter(externals.ExternalsRootAPIDescriptionsItemsPathsItemsRoute.class::isInstance).findAny().map(externals.ExternalsRootAPIDescriptionsItemsPathsItemsRoute.class::cast).map(instance->instance.getRoute()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems> getParameters() {
		return this.getItems().stream().filter(externals.ExternalsRootAPIDescriptionsItemsPathsItemsParameters.class::isInstance).findAny().map(externals.ExternalsRootAPIDescriptionsItemsPathsItemsParameters.class::cast).map(instance->instance.getParameters()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems> getOutputs() {
		return this.getItems().stream().filter(externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputs.class::isInstance).findAny().map(externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputs.class::cast).map(instance->instance.getOutputs()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("route".equals(key) ){return this.getRoute();}
		
		if ("parameters".equals(key) ){return this.getParameters();}
		
		if ("outputs".equals(key) ){return this.getOutputs();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract child : this.items){
			if (!java.util.Collections.disjoint(additionalOrPatternPropertyClasses, java.util.Arrays.asList(child.getClass().getInterfaces()))){
				try{
					java.lang.reflect.Field keyField = child.getClass().getDeclaredField("key");
					if (jku.se.atl.transformation.utils.Utils.getIdentifier(keyField.get(child).toString()).equals(key)) {
						java.lang.reflect.Field valueField = java.util.Arrays.asList(child.getClass().getDeclaredFields()).stream().filter(field -> field.getName().equals("additionalProperties") || field.getName().startsWith("patternProperties") ).findAny().get();
						return valueField.get(child);
					}
				} catch (Exception e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
		}
		return null;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ITEMS:
				return getItems();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ROUTE:
				return getRoute();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__PARAMETERS:
				return getParameters();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__OUTPUTS:
				return getOutputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract>)newValue);
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ITEMS:
				getItems().clear();
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ITEMS:
				return items != null && !items.isEmpty();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__ROUTE:
				return ROUTE_EDEFAULT == null ? getRoute() != null : !ROUTE_EDEFAULT.equals(getRoute());
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__PARAMETERS:
				return !getParameters().isEmpty();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS__OUTPUTS:
				return !getOutputs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExternalsRootAPIDescriptionsItemsPathsItemsImpl
