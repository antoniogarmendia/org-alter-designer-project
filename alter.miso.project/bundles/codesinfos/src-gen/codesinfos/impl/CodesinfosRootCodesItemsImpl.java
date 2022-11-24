/**
 */
package codesinfos.impl;

import codesinfos.CodesinfosPackage;
import codesinfos.CodesinfosRootCodesItems;
import codesinfos.CodesinfosRootCodesItemsPropertiesAbstract;

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
 * An implementation of the model object '<em><b>Root Codes Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codesinfos.impl.CodesinfosRootCodesItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link codesinfos.impl.CodesinfosRootCodesItemsImpl#getName <em>Name</em>}</li>
 *   <li>{@link codesinfos.impl.CodesinfosRootCodesItemsImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link codesinfos.impl.CodesinfosRootCodesItemsImpl#getNodename <em>Nodename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodesinfosRootCodesItemsImpl extends MinimalEObjectImpl.Container implements CodesinfosRootCodesItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CodesinfosRootCodesItemsPropertiesAbstract> items;

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
	 * The default value of the '{@link #getClassname() <em>Classname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassname()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSNAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNodename() <em>Nodename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodename()
	 * @generated
	 * @ordered
	 */
	protected static final String NODENAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodesinfosRootCodesItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesinfosPackage.Literals.CODESINFOS_ROOT_CODES_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodesinfosRootCodesItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<CodesinfosRootCodesItemsPropertiesAbstract>(CodesinfosRootCodesItemsPropertiesAbstract.class, this, CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS__ITEMS);
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
		return this.getItems().stream().filter(codesinfos.CodesinfosRootCodesItemsName.class::isInstance).findAny().map(codesinfos.CodesinfosRootCodesItemsName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassname() {
		return this.getItems().stream().filter(codesinfos.CodesinfosRootCodesItemsClassname.class::isInstance).findAny().map(codesinfos.CodesinfosRootCodesItemsClassname.class::cast).map(instance->instance.getClassname()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNodename() {
		return this.getItems().stream().filter(codesinfos.CodesinfosRootCodesItemsNodename.class::isInstance).findAny().map(codesinfos.CodesinfosRootCodesItemsNodename.class::cast).map(instance->instance.getNodename()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("name".equals(key) ){return this.getName();}
		
		if ("classname".equals(key) ){return this.getClassname();}
		
		if ("nodename".equals(key) ){return this.getNodename();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (CodesinfosRootCodesItemsPropertiesAbstract child : this.items){
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
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS__ITEMS:
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
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS__ITEMS:
				return getItems();
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS__NAME:
				return getName();
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS__CLASSNAME:
				return getClassname();
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS__NODENAME:
				return getNodename();
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
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends CodesinfosRootCodesItemsPropertiesAbstract>)newValue);
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
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS__ITEMS:
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
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS__ITEMS:
				return items != null && !items.isEmpty();
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS__CLASSNAME:
				return CLASSNAME_EDEFAULT == null ? getClassname() != null : !CLASSNAME_EDEFAULT.equals(getClassname());
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS__NODENAME:
				return NODENAME_EDEFAULT == null ? getNodename() != null : !NODENAME_EDEFAULT.equals(getNodename());
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
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CodesinfosRootCodesItemsImpl
