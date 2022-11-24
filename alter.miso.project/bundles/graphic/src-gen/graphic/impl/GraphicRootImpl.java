/**
 */
package graphic.impl;

import graphic.GraphicPackage;
import graphic.GraphicRoot;
import graphic.GraphicRootClassesItems;
import graphic.GraphicRootPropertiesAbstract;

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
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic.impl.GraphicRootImpl#getGraphicRoot <em>Graphic Root</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootImpl#getURI <em>URI</em>}</li>
 *   <li>{@link graphic.impl.GraphicRootImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRootImpl extends MinimalEObjectImpl.Container implements GraphicRoot {
	/**
	 * The cached value of the '{@link #getGraphicRoot() <em>Graphic Root</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicRoot()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicRootPropertiesAbstract> graphicRoot;

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
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicPackage.Literals.GRAPHIC_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicRootPropertiesAbstract> getGraphicRoot() {
		if (graphicRoot == null) {
			graphicRoot = new EObjectContainmentEList<GraphicRootPropertiesAbstract>(GraphicRootPropertiesAbstract.class, this, GraphicPackage.GRAPHIC_ROOT__GRAPHIC_ROOT);
		}
		return graphicRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return this.getGraphicRoot().stream().filter(graphic.GraphicRootName.class::isInstance).findAny().map(graphic.GraphicRootName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getURI() {
		return this.getGraphicRoot().stream().filter(graphic.GraphicRootURI.class::isInstance).findAny().map(graphic.GraphicRootURI.class::cast).map(instance->instance.getURI()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicRootClassesItems> getClasses() {
		return this.getGraphicRoot().stream().filter(graphic.GraphicRootClasses.class::isInstance).findAny().map(graphic.GraphicRootClasses.class::cast).map(instance->instance.getClasses()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("name".equals(key) ){return this.getName();}
		
		if ("URI".equals(key) ){return this.getURI();}
		
		if ("classes".equals(key) ){return this.getClasses();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (GraphicRootPropertiesAbstract child : this.graphicRoot){
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
			case GraphicPackage.GRAPHIC_ROOT__GRAPHIC_ROOT:
				return ((InternalEList<?>)getGraphicRoot()).basicRemove(otherEnd, msgs);
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
			case GraphicPackage.GRAPHIC_ROOT__GRAPHIC_ROOT:
				return getGraphicRoot();
			case GraphicPackage.GRAPHIC_ROOT__NAME:
				return getName();
			case GraphicPackage.GRAPHIC_ROOT__URI:
				return getURI();
			case GraphicPackage.GRAPHIC_ROOT__CLASSES:
				return getClasses();
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
			case GraphicPackage.GRAPHIC_ROOT__GRAPHIC_ROOT:
				getGraphicRoot().clear();
				getGraphicRoot().addAll((Collection<? extends GraphicRootPropertiesAbstract>)newValue);
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
			case GraphicPackage.GRAPHIC_ROOT__GRAPHIC_ROOT:
				getGraphicRoot().clear();
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
			case GraphicPackage.GRAPHIC_ROOT__GRAPHIC_ROOT:
				return graphicRoot != null && !graphicRoot.isEmpty();
			case GraphicPackage.GRAPHIC_ROOT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GraphicPackage.GRAPHIC_ROOT__URI:
				return URI_EDEFAULT == null ? getURI() != null : !URI_EDEFAULT.equals(getURI());
			case GraphicPackage.GRAPHIC_ROOT__CLASSES:
				return !getClasses().isEmpty();
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
			case GraphicPackage.GRAPHIC_ROOT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GraphicRootImpl
