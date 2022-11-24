/**
 */
package accesses.impl;

import accesses.AccessesPackage;
import accesses.AccessesRootExternalAccessItemsInputItems;
import accesses.AccessesRootExternalAccessItemsInputItemsPropertiesAbstract;

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
 * An implementation of the model object '<em><b>Root External Access Items Input Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsImpl#getAPIInput <em>API Input</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsImpl#getWay <em>Way</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsInputItemsImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessesRootExternalAccessItemsInputItemsImpl extends MinimalEObjectImpl.Container implements AccessesRootExternalAccessItemsInputItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessesRootExternalAccessItemsInputItemsPropertiesAbstract> items;

	/**
	 * The default value of the '{@link #getAttr() <em>Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAPIInput() <em>API Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPIInput()
	 * @generated
	 * @ordered
	 */
	protected static final String API_INPUT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWay() <em>Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWay()
	 * @generated
	 * @ordered
	 */
	protected static final String WAY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessesRootExternalAccessItemsInputItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessesPackage.Literals.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessesRootExternalAccessItemsInputItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<AccessesRootExternalAccessItemsInputItemsPropertiesAbstract>(AccessesRootExternalAccessItemsInputItemsPropertiesAbstract.class, this, AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttr() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsInputItemsAttr.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsInputItemsAttr.class::cast).map(instance->instance.getAttr()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAPIInput() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsInputItemsAPIInput.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsInputItemsAPIInput.class::cast).map(instance->instance.getAPIInput()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWay() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsInputItemsWay.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsInputItemsWay.class::cast).map(instance->instance.getWay()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsInputItemsValue.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsInputItemsValue.class::cast).map(instance->instance.getValue()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("attr".equals(key) ){return this.getAttr();}
		
		if ("APIInput".equals(key) ){return this.getAPIInput();}
		
		if ("way".equals(key) ){return this.getWay();}
		
		if ("value".equals(key) ){return this.getValue();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (AccessesRootExternalAccessItemsInputItemsPropertiesAbstract child : this.items){
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ITEMS:
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ITEMS:
				return getItems();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ATTR:
				return getAttr();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__API_INPUT:
				return getAPIInput();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__WAY:
				return getWay();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__VALUE:
				return getValue();
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends AccessesRootExternalAccessItemsInputItemsPropertiesAbstract>)newValue);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ITEMS:
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ITEMS:
				return items != null && !items.isEmpty();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__ATTR:
				return ATTR_EDEFAULT == null ? getAttr() != null : !ATTR_EDEFAULT.equals(getAttr());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__API_INPUT:
				return API_INPUT_EDEFAULT == null ? getAPIInput() != null : !API_INPUT_EDEFAULT.equals(getAPIInput());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__WAY:
				return WAY_EDEFAULT == null ? getWay() != null : !WAY_EDEFAULT.equals(getWay());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AccessesRootExternalAccessItemsInputItemsImpl
