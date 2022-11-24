/**
 */
package ontological.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import ontological.OntologicalPackage;
import ontological.OntologicalRootClassesItemsReferencesItems;
import ontological.OntologicalRootClassesItemsReferencesItemsPropertiesAbstract;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items References Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsImpl#getName <em>Name</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsImpl#getContaintment <em>Containtment</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsImpl#getMin <em>Min</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsImpl#getMax <em>Max</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootClassesItemsReferencesItemsImpl#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalRootClassesItemsReferencesItemsImpl extends MinimalEObjectImpl.Container implements OntologicalRootClassesItemsReferencesItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologicalRootClassesItemsReferencesItemsPropertiesAbstract> items;

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
	 * The default value of the '{@link #getContaintment() <em>Containtment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContaintment()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINTMENT_EDEFAULT = null;

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
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOpposite() <em>Opposite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected static final String OPPOSITE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalRootClassesItemsReferencesItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalPackage.Literals.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OntologicalRootClassesItemsReferencesItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<OntologicalRootClassesItemsReferencesItemsPropertiesAbstract>(OntologicalRootClassesItemsReferencesItemsPropertiesAbstract.class, this, OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS);
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
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsReferencesItemsName.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsReferencesItemsName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContaintment() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsReferencesItemsContaintment.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsReferencesItemsContaintment.class::cast).map(instance->instance.getContaintment()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMin() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsReferencesItemsMin.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsReferencesItemsMin.class::cast).map(instance->instance.getMin()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMax() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsReferencesItemsMax.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsReferencesItemsMax.class::cast).map(instance->instance.getMax()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsReferencesItemsTarget.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsReferencesItemsTarget.class::cast).map(instance->instance.getTarget()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpposite() {
		return this.getItems().stream().filter(ontological.OntologicalRootClassesItemsReferencesItemsOpposite.class::isInstance).findAny().map(ontological.OntologicalRootClassesItemsReferencesItemsOpposite.class::cast).map(instance->instance.getOpposite()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("name".equals(key) ){return this.getName();}
		
		if ("containtment".equals(key) ){return this.getContaintment();}
		
		if ("min".equals(key) ){return this.getMin();}
		
		if ("max".equals(key) ){return this.getMax();}
		
		if ("target".equals(key) ){return this.getTarget();}
		
		if ("opposite".equals(key) ){return this.getOpposite();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (OntologicalRootClassesItemsReferencesItemsPropertiesAbstract child : this.items){
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS:
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS:
				return getItems();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__NAME:
				return getName();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__CONTAINTMENT:
				return getContaintment();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MIN:
				return getMin();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MAX:
				return getMax();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__TARGET:
				return getTarget();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__OPPOSITE:
				return getOpposite();
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends OntologicalRootClassesItemsReferencesItemsPropertiesAbstract>)newValue);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS:
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__ITEMS:
				return items != null && !items.isEmpty();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__CONTAINTMENT:
				return CONTAINTMENT_EDEFAULT == null ? getContaintment() != null : !CONTAINTMENT_EDEFAULT.equals(getContaintment());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MIN:
				return MIN_EDEFAULT == null ? getMin() != null : !MIN_EDEFAULT.equals(getMin());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__MAX:
				return MAX_EDEFAULT == null ? getMax() != null : !MAX_EDEFAULT.equals(getMax());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__TARGET:
				return TARGET_EDEFAULT == null ? getTarget() != null : !TARGET_EDEFAULT.equals(getTarget());
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS__OPPOSITE:
				return OPPOSITE_EDEFAULT == null ? getOpposite() != null : !OPPOSITE_EDEFAULT.equals(getOpposite());
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OntologicalRootClassesItemsReferencesItemsImpl
