/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRootClassesItemsVname;
import graphic.GraphicRootClassesItemsVnamePropertiesAbstract;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Classes Items Vname</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsVnameImpl#getVname <em>Vname</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsVnameImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsVnameImpl#getV2 <em>V2</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootClassesItemsVnameImpl#getV3 <em>V3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootClassesItemsVnameImpl extends GraphicRootClassesItemsPropertiesAbstractImpl implements GraphicRootClassesItemsVname {
	/**
	 * The cached value of the '{@link #getVname() <em>Vname</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVname()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicRootClassesItemsVnamePropertiesAbstract> vname;

	/**
	 * The default value of the '{@link #getV1() <em>V1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV1()
	 * @generated
	 * @ordered
	 */
	protected static final String V1_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getV2() <em>V2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV2()
	 * @generated
	 * @ordered
	 */
	protected static final String V2_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getV3() <em>V3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV3()
	 * @generated
	 * @ordered
	 */
	protected static final String V3_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootClassesItemsVnameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicRootClassesItemsVnamePropertiesAbstract> getVname() {
		if (vname == null) {
			vname = new EObjectContainmentEList<GraphicRootClassesItemsVnamePropertiesAbstract>(GraphicRootClassesItemsVnamePropertiesAbstract.class, this, GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__VNAME);
		}
		return vname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getV1() {
		return this.getVname().stream().filter(graphic.GraphicRootClassesItemsVnameV1.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsVnameV1.class::cast).map(instance->instance.getV1()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getV2() {
		return this.getVname().stream().filter(graphic.GraphicRootClassesItemsVnameV2.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsVnameV2.class::cast).map(instance->instance.getV2()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getV3() {
		return this.getVname().stream().filter(graphic.GraphicRootClassesItemsVnameV3.class::isInstance).findAny().map(graphic.GraphicRootClassesItemsVnameV3.class::cast).map(instance->instance.getV3()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("v1".equals(key) ){return this.getV1();}
		
		if ("v2".equals(key) ){return this.getV2();}
		
		if ("v3".equals(key) ){return this.getV3();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (GraphicRootClassesItemsVnamePropertiesAbstract child : this.vname){
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__VNAME:
				return ((InternalEList<?>)getVname()).basicRemove(otherEnd, msgs);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__VNAME:
				return getVname();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V1:
				return getV1();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V2:
				return getV2();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V3:
				return getV3();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__VNAME:
				getVname().clear();
				getVname().addAll((Collection<? extends GraphicRootClassesItemsVnamePropertiesAbstract>)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__VNAME:
				getVname().clear();
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__VNAME:
				return vname != null && !vname.isEmpty();
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V1:
				return V1_EDEFAULT == null ? getV1() != null : !V1_EDEFAULT.equals(getV1());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V2:
				return V2_EDEFAULT == null ? getV2() != null : !V2_EDEFAULT.equals(getV2());
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME__V3:
				return V3_EDEFAULT == null ? getV3() != null : !V3_EDEFAULT.equals(getV3());
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
			case GraphicPackage.GRAPHIC_ROOT_CLASSES_ITEMS_VNAME___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GraphicRootClassesItemsVnameImpl
