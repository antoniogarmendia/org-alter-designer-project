/**
 */
package ontological.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import ontological.OntologicalPackage;
import ontological.OntologicalRootClassesItems;
import ontological.OntologicalRootClassesItemsAttributesItems;
import ontological.OntologicalRootClassesItemsPropertiesAbstract;
import ontological.OntologicalRootClassesItemsReferencesItems;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsImpl#getName <em>Name</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsImpl#getReferences <em>References</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsImpl#getAutoID <em>Auto ID</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsImpl#getOnlyCodes <em>Only Codes</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsImpl#getBluetooth <em>Bluetooth</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsImpl#getNoSCN <em>No SCN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalRootClassesItemsImpl extends MinimalEObjectImpl.Container implements OntologicalRootClassesItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologicalRootClassesItemsPropertiesAbstract> items;

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
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAutoID() <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoID()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnlyCodes() <em>Only Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlyCodes()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ONLY_CODES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBluetooth() <em>Bluetooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBluetooth()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BLUETOOTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNoSCN() <em>No SCN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoSCN()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NO_SCN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalRootClassesItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OntologicalRootClassesItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<OntologicalRootClassesItemsPropertiesAbstract>(OntologicalRootClassesItemsPropertiesAbstract.class, this, OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__ITEMS);
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
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsName.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbstract() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsAbstract.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsAbstract.class::cast).map(instance->instance.getAbstract()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OntologicalRootClassesItemsAttributesItems> getAttributes() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsAttributes.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsAttributes.class::cast).map(instance->instance.getAttributes()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OntologicalRootClassesItemsReferencesItems> getReferences() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsReferences.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsReferences.class::cast).map(instance->instance.getReferences()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoID() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsAutoID.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsAutoID.class::cast).map(instance->instance.getAutoID()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnlyCodes() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsOnlyCodes.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsOnlyCodes.class::cast).map(instance->instance.getOnlyCodes()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getBluetooth() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsBluetooth.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsBluetooth.class::cast).map(instance->instance.getBluetooth()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNoSCN() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsNoSCN.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsNoSCN.class::cast).map(instance->instance.getNoSCN()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("name".equals(key) ){return this.getName();}
		
		if ("abstract".equals(key) ){return this.getAbstract();}
		
		if ("attributes".equals(key) ){return this.getAttributes();}
		
		if ("references".equals(key) ){return this.getReferences();}
		
		if ("autoID".equals(key) ){return this.getAutoID();}
		
		if ("onlyCodes".equals(key) ){return this.getOnlyCodes();}
		
		if ("bluetooth".equals(key) ){return this.getBluetooth();}
		
		if ("noSCN".equals(key) ){return this.getNoSCN();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (OntologicalRootClassesItemsPropertiesAbstract child : this.items){
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__ITEMS:
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__ITEMS:
				return getItems();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__NAME:
				return getName();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__ABSTRACT:
				return getAbstract();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__ATTRIBUTES:
				return getAttributes();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__REFERENCES:
				return getReferences();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__AUTO_ID:
				return getAutoID();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__ONLY_CODES:
				return getOnlyCodes();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__BLUETOOTH:
				return getBluetooth();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__NO_SCN:
				return getNoSCN();
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends OntologicalRootClassesItemsPropertiesAbstract>)newValue);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__ITEMS:
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__ITEMS:
				return items != null && !items.isEmpty();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? getAbstract() != null : !ABSTRACT_EDEFAULT.equals(getAbstract());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__REFERENCES:
				return !getReferences().isEmpty();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__AUTO_ID:
				return AUTO_ID_EDEFAULT == null ? getAutoID() != null : !AUTO_ID_EDEFAULT.equals(getAutoID());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__ONLY_CODES:
				return ONLY_CODES_EDEFAULT == null ? getOnlyCodes() != null : !ONLY_CODES_EDEFAULT.equals(getOnlyCodes());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__BLUETOOTH:
				return BLUETOOTH_EDEFAULT == null ? getBluetooth() != null : !BLUETOOTH_EDEFAULT.equals(getBluetooth());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS__NO_SCN:
				return NO_SCN_EDEFAULT == null ? getNoSCN() != null : !NO_SCN_EDEFAULT.equals(getNoSCN());
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OntologicalRootClassesItemsImpl
