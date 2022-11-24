/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItems;
import graphic.GraphicRootClassesItemsConnectionsItems;
import graphic.GraphicRootClassesItemsConstraints;
import graphic.GraphicRootClassesItemsMaterialAttributesItems;
import graphic.GraphicRootClassesItemsPropertiesAbstract;
import graphic.GraphicRootClassesItemsShowAttributesItems;
import graphic.GraphicRootClassesItemsVersions;
import graphic.GraphicRootClassesItemsVname;

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
 * An implementation of the model object '<em><b>Root Classes Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsImpl#getName <em>Name</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsImpl#getVname <em>Vname</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsImpl#getShowAttributes <em>Show Attributes</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsImpl#getMaterialAttributes <em>Material Attributes</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsImpl extends MinimalEObjectImpl.Container implements GraphicRootClassesItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicRootClassesItemsPropertiesAbstract> items;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicRootClassesItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<GraphicRootClassesItemsPropertiesAbstract>(GraphicRootClassesItemsPropertiesAbstract.class, this, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS);
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
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsName.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsVersions getVersions() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsVersions.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsVersions.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsVname getVname() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsVname.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsVname.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicRootClassesItemsShowAttributesItems> getShowAttributes() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsShowAttributes.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsShowAttributes.class::cast).map(instance->instance.getShowAttributes()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicRootClassesItemsMaterialAttributesItems> getMaterialAttributes() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsMaterialAttributes.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsMaterialAttributes.class::cast).map(instance->instance.getMaterialAttributes()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicRootClassesItemsConstraints getConstraints() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConstraints.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConstraints.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicRootClassesItemsConnectionsItems> getConnections() {
		return this.getItems().stream().filter(graphic.GraphicRootClassesItemsConnections.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsConnections.class::cast).map(instance->instance.getConnections()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("name".equals(key) ){return this.getName();}
		
		if ("versions".equals(key) ){return this.getVersions();}
		
		if ("vname".equals(key) ){return this.getVname();}
		
		if ("showAttributes".equals(key) ){return this.getShowAttributes();}
		
		if ("materialAttributes".equals(key) ){return this.getMaterialAttributes();}
		
		if ("constraints".equals(key) ){return this.getConstraints();}
		
		if ("connections".equals(key) ){return this.getConnections();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (GraphicRootClassesItemsPropertiesAbstract child : this.items){
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS:
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS:
				return getItems();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__NAME:
				return getName();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__VERSIONS:
				return getVersions();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__VNAME:
				return getVname();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__SHOW_ATTRIBUTES:
				return getShowAttributes();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__MATERIAL_ATTRIBUTES:
				return getMaterialAttributes();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__CONSTRAINTS:
				return getConstraints();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__CONNECTIONS:
				return getConnections();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends GraphicRootClassesItemsPropertiesAbstract>)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS:
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__ITEMS:
				return items != null && !items.isEmpty();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__VERSIONS:
				return getVersions() != null;
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__VNAME:
				return getVname() != null;
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__SHOW_ATTRIBUTES:
				return !getShowAttributes().isEmpty();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__MATERIAL_ATTRIBUTES:
				return !getMaterialAttributes().isEmpty();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__CONSTRAINTS:
				return getConstraints() != null;
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS__CONNECTIONS:
				return !getConnections().isEmpty();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GraphicRootClassesItemsImpl
