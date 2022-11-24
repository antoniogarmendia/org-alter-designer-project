/**
 */
package accesses.impl;

import accesses.AccessesPackage;
import accesses.AccessesRootExternalAccessItemsBodyItems;
import accesses.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract;

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
 * An implementation of the model object '<em><b>Root External Access Items Body Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsBodyItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsBodyItemsImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsBodyItemsImpl#getAPIBody <em>API Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessesRootExternalAccessItemsBodyItemsImpl extends MinimalEObjectImpl.Container implements AccessesRootExternalAccessItemsBodyItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract> items;

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
	 * The default value of the '{@link #getAPIBody() <em>API Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPIBody()
	 * @generated
	 * @ordered
	 */
	protected static final String API_BODY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessesRootExternalAccessItemsBodyItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessesPackage.Literals.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract>(AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract.class, this, AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ITEMS);
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
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsBodyItemsAttr.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsBodyItemsAttr.class::cast).map(instance->instance.getAttr()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAPIBody() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsBodyItemsAPIBody.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsBodyItemsAPIBody.class::cast).map(instance->instance.getAPIBody()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("attr".equals(key) ){return this.getAttr();}
		
		if ("APIBody".equals(key) ){return this.getAPIBody();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract child : this.items){
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ITEMS:
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ITEMS:
				return getItems();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ATTR:
				return getAttr();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__API_BODY:
				return getAPIBody();
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract>)newValue);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ITEMS:
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ITEMS:
				return items != null && !items.isEmpty();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__ATTR:
				return ATTR_EDEFAULT == null ? getAttr() != null : !ATTR_EDEFAULT.equals(getAttr());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS__API_BODY:
				return API_BODY_EDEFAULT == null ? getAPIBody() != null : !API_BODY_EDEFAULT.equals(getAPIBody());
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AccessesRootExternalAccessItemsBodyItemsImpl
