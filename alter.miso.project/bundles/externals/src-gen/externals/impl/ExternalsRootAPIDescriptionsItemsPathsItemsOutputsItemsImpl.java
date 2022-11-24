/**
 */
package externals.impl;

import externals.ExternalsPackage;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems;
import externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract;

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
 * An implementation of the model object '<em><b>Root API Descriptions Items Paths Items Outputs Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl#getName <em>Name</em>}</li>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl#getType <em>Type</em>}</li>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl#getJSONPath <em>JSON Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl extends MinimalEObjectImpl.Container implements ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract> items;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getJSONPath() <em>JSON Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJSONPath()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_PATH_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract>(ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract.class, this, ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return this.getItems().stream().filter(externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName.class::isInstance).findAny().map(externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return this.getItems().stream().filter(externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType.class::isInstance).findAny().map(externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType.class::cast).map(instance->instance.getType()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJSONPath() {
		return this.getItems().stream().filter(externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath.class::isInstance).findAny().map(externals.ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath.class::cast).map(instance->instance.getJSONPath()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("name".equals(key) ){return this.getName();}
		
		if ("type".equals(key) ){return this.getType();}
		
		if ("JSONPath".equals(key) ){return this.getJSONPath();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract child : this.items){
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__ITEMS:
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__ITEMS:
				return getItems();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__NAME:
				return getName();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__TYPE:
				return getType();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__JSON_PATH:
				return getJSONPath();
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract>)newValue);
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__ITEMS:
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__ITEMS:
				return items != null && !items.isEmpty();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS__JSON_PATH:
				return JSON_PATH_EDEFAULT == null ? getJSONPath() != null : !JSON_PATH_EDEFAULT.equals(getJSONPath());
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS_PATHS_ITEMS_OUTPUTS_ITEMS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsImpl
