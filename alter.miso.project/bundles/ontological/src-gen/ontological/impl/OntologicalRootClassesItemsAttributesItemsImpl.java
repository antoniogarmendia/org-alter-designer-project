/**
 */
package ontological.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import ontological.OntologicalPackage;
import ontological.OntologicalRootClassesItemsAttributesItems;
import ontological.OntologicalRootClassesItemsAttributesItemsPropertiesAbstract;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Attributes Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl#getName <em>Name</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl#getType <em>Type</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl#getMin <em>Min</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl#getMax <em>Max</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl#getIsParam <em>Is Param</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsAttributesItemsImpl#getIsKey <em>Is Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalRootClassesItemsAttributesItemsImpl extends MinimalEObjectImpl.Container implements OntologicalRootClassesItemsAttributesItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologicalRootClassesItemsAttributesItemsPropertiesAbstract> items;

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
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean READ_ONLY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsParam() <em>Is Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsParam()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PARAM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsKey() <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsKey()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_KEY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalRootClassesItemsAttributesItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OntologicalRootClassesItemsAttributesItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<OntologicalRootClassesItemsAttributesItemsPropertiesAbstract>(OntologicalRootClassesItemsAttributesItemsPropertiesAbstract.class, this, OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS);
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
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsAttributesItemsName.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsAttributesItemsName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsAttributesItemsType.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsAttributesItemsType.class::cast).map(instance->instance.getType()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMin() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsAttributesItemsMin.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsAttributesItemsMin.class::cast).map(instance->instance.getMin()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMax() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsAttributesItemsMax.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsAttributesItemsMax.class::cast).map(instance->instance.getMax()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefault() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsAttributesItemsDefault.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsAttributesItemsDefault.class::cast).map(instance->instance.getDefault()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReadOnly() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsAttributesItemsReadOnly.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsAttributesItemsReadOnly.class::cast).map(instance->instance.getReadOnly()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsParam() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsAttributesItemsIsParam.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsAttributesItemsIsParam.class::cast).map(instance->instance.getIsParam()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsKey() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsAttributesItemsIsKey.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsAttributesItemsIsKey.class::cast).map(instance->instance.getIsKey()).orElse(null);
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
		
		if ("min".equals(key) ){return this.getMin();}
		
		if ("max".equals(key) ){return this.getMax();}
		
		if ("default".equals(key) ){return this.getDefault();}
		
		if ("readOnly".equals(key) ){return this.getReadOnly();}
		
		if ("isParam".equals(key) ){return this.getIsParam();}
		
		if ("isKey".equals(key) ){return this.getIsKey();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (OntologicalRootClassesItemsAttributesItemsPropertiesAbstract child : this.items){
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS:
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS:
				return getItems();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__NAME:
				return getName();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__TYPE:
				return getType();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MIN:
				return getMin();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MAX:
				return getMax();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__DEFAULT:
				return getDefault();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__READ_ONLY:
				return getReadOnly();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_PARAM:
				return getIsParam();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_KEY:
				return getIsKey();
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends OntologicalRootClassesItemsAttributesItemsPropertiesAbstract>)newValue);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS:
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__ITEMS:
				return items != null && !items.isEmpty();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MIN:
				return MIN_EDEFAULT == null ? getMin() != null : !MIN_EDEFAULT.equals(getMin());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__MAX:
				return MAX_EDEFAULT == null ? getMax() != null : !MAX_EDEFAULT.equals(getMax());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__DEFAULT:
				return DEFAULT_EDEFAULT == null ? getDefault() != null : !DEFAULT_EDEFAULT.equals(getDefault());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__READ_ONLY:
				return READ_ONLY_EDEFAULT == null ? getReadOnly() != null : !READ_ONLY_EDEFAULT.equals(getReadOnly());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_PARAM:
				return IS_PARAM_EDEFAULT == null ? getIsParam() != null : !IS_PARAM_EDEFAULT.equals(getIsParam());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS__IS_KEY:
				return IS_KEY_EDEFAULT == null ? getIsKey() != null : !IS_KEY_EDEFAULT.equals(getIsKey());
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OntologicalRootClassesItemsAttributesItemsImpl
