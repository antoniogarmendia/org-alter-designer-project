/**
 */
package ontological.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import ontological.OntologicalPackage;
import ontological.OntologicalRoot;
import ontological.OntologicalRootClassesItems;
import ontological.OntologicalRootPropertiesAbstract;

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
 *   <li>{@link ontological.impl.OntologicalRootImpl#getOntologicalRoot <em>Ontological Root</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootImpl#getURI <em>URI</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootImpl#getOnlyCodes <em>Only Codes</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootImpl#getBluetooth <em>Bluetooth</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootImpl#getExternal <em>External</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootImpl#getFirebase <em>Firebase</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootImpl#getPhysics <em>Physics</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootImpl#getGameloop <em>Gameloop</em>}</li>
 *   <li>{@link ontological.impl.OntologicalRootImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalRootImpl extends MinimalEObjectImpl.Container implements OntologicalRoot {
	/**
	 * The cached value of the '{@link #getOntologicalRoot() <em>Ontological Root</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologicalRoot()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologicalRootPropertiesAbstract> ontologicalRoot;

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
	 * The default value of the '{@link #getExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternal()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXTERNAL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFirebase() <em>Firebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirebase()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FIREBASE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPhysics() <em>Physics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysics()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PHYSICS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGameloop() <em>Gameloop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameloop()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GAMELOOP_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalPackage.Literals.ONTOLOGICAL_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OntologicalRootPropertiesAbstract> getOntologicalRoot() {
		if (ontologicalRoot == null) {
			ontologicalRoot = new EObjectContainmentEList<OntologicalRootPropertiesAbstract>(OntologicalRootPropertiesAbstract.class, this, OntologicalPackage.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT);
		}
		return ontologicalRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return this.getOntologicalRoot().stream().filter(ontological.OntologicalRootName.class::isInstance).findAny().map(ontological.OntologicalRootName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getURI() {
		return this.getOntologicalRoot().stream().filter(ontological.OntologicalRootURI.class::isInstance).findAny().map(ontological.OntologicalRootURI.class::cast).map(instance->instance.getURI()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnlyCodes() {
		return this.getOntologicalRoot().stream().filter(ontological.OntologicalRootOnlyCodes.class::isInstance).findAny().map(ontological.OntologicalRootOnlyCodes.class::cast).map(instance->instance.getOnlyCodes()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getBluetooth() {
		return this.getOntologicalRoot().stream().filter(ontological.OntologicalRootBluetooth.class::isInstance).findAny().map(ontological.OntologicalRootBluetooth.class::cast).map(instance->instance.getBluetooth()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExternal() {
		return this.getOntologicalRoot().stream().filter(ontological.OntologicalRootExternal.class::isInstance).findAny().map(ontological.OntologicalRootExternal.class::cast).map(instance->instance.getExternal()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFirebase() {
		return this.getOntologicalRoot().stream().filter(ontological.OntologicalRootFirebase.class::isInstance).findAny().map(ontological.OntologicalRootFirebase.class::cast).map(instance->instance.getFirebase()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPhysics() {
		return this.getOntologicalRoot().stream().filter(ontological.OntologicalRootPhysics.class::isInstance).findAny().map(ontological.OntologicalRootPhysics.class::cast).map(instance->instance.getPhysics()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getGameloop() {
		return this.getOntologicalRoot().stream().filter(ontological.OntologicalRootGameloop.class::isInstance).findAny().map(ontological.OntologicalRootGameloop.class::cast).map(instance->instance.getGameloop()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OntologicalRootClassesItems> getClasses() {
		return this.getOntologicalRoot().stream().filter(ontological.OntologicalRootClasses.class::isInstance).findAny().map(ontological.OntologicalRootClasses.class::cast).map(instance->instance.getClasses()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
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
		
		if ("onlyCodes".equals(key) ){return this.getOnlyCodes();}
		
		if ("bluetooth".equals(key) ){return this.getBluetooth();}
		
		if ("external".equals(key) ){return this.getExternal();}
		
		if ("firebase".equals(key) ){return this.getFirebase();}
		
		if ("physics".equals(key) ){return this.getPhysics();}
		
		if ("gameloop".equals(key) ){return this.getGameloop();}
		
		if ("classes".equals(key) ){return this.getClasses();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (OntologicalRootPropertiesAbstract child : this.ontologicalRoot){
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
			case OntologicalPackage.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT:
				return ((InternalEList<?>)getOntologicalRoot()).basicRemove(otherEnd, msgs);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT:
				return getOntologicalRoot();
			case OntologicalPackage.ONTOLOGICAL_ROOT__NAME:
				return getName();
			case OntologicalPackage.ONTOLOGICAL_ROOT__URI:
				return getURI();
			case OntologicalPackage.ONTOLOGICAL_ROOT__ONLY_CODES:
				return getOnlyCodes();
			case OntologicalPackage.ONTOLOGICAL_ROOT__BLUETOOTH:
				return getBluetooth();
			case OntologicalPackage.ONTOLOGICAL_ROOT__EXTERNAL:
				return getExternal();
			case OntologicalPackage.ONTOLOGICAL_ROOT__FIREBASE:
				return getFirebase();
			case OntologicalPackage.ONTOLOGICAL_ROOT__PHYSICS:
				return getPhysics();
			case OntologicalPackage.ONTOLOGICAL_ROOT__GAMELOOP:
				return getGameloop();
			case OntologicalPackage.ONTOLOGICAL_ROOT__CLASSES:
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
			case OntologicalPackage.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT:
				getOntologicalRoot().clear();
				getOntologicalRoot().addAll((Collection<? extends OntologicalRootPropertiesAbstract>)newValue);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT:
				getOntologicalRoot().clear();
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
			case OntologicalPackage.ONTOLOGICAL_ROOT__ONTOLOGICAL_ROOT:
				return ontologicalRoot != null && !ontologicalRoot.isEmpty();
			case OntologicalPackage.ONTOLOGICAL_ROOT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case OntologicalPackage.ONTOLOGICAL_ROOT__URI:
				return URI_EDEFAULT == null ? getURI() != null : !URI_EDEFAULT.equals(getURI());
			case OntologicalPackage.ONTOLOGICAL_ROOT__ONLY_CODES:
				return ONLY_CODES_EDEFAULT == null ? getOnlyCodes() != null : !ONLY_CODES_EDEFAULT.equals(getOnlyCodes());
			case OntologicalPackage.ONTOLOGICAL_ROOT__BLUETOOTH:
				return BLUETOOTH_EDEFAULT == null ? getBluetooth() != null : !BLUETOOTH_EDEFAULT.equals(getBluetooth());
			case OntologicalPackage.ONTOLOGICAL_ROOT__EXTERNAL:
				return EXTERNAL_EDEFAULT == null ? getExternal() != null : !EXTERNAL_EDEFAULT.equals(getExternal());
			case OntologicalPackage.ONTOLOGICAL_ROOT__FIREBASE:
				return FIREBASE_EDEFAULT == null ? getFirebase() != null : !FIREBASE_EDEFAULT.equals(getFirebase());
			case OntologicalPackage.ONTOLOGICAL_ROOT__PHYSICS:
				return PHYSICS_EDEFAULT == null ? getPhysics() != null : !PHYSICS_EDEFAULT.equals(getPhysics());
			case OntologicalPackage.ONTOLOGICAL_ROOT__GAMELOOP:
				return GAMELOOP_EDEFAULT == null ? getGameloop() != null : !GAMELOOP_EDEFAULT.equals(getGameloop());
			case OntologicalPackage.ONTOLOGICAL_ROOT__CLASSES:
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
			case OntologicalPackage.ONTOLOGICAL_ROOT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OntologicalRootImpl
