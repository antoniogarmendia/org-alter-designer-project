/**
 */
package accesses.impl;

import accesses.AccessesPackage;
import accesses.AccessesRootExternalAccessItems;
import accesses.AccessesRootExternalAccessItemsBodyItems;
import accesses.AccessesRootExternalAccessItemsInputItems;
import accesses.AccessesRootExternalAccessItemsOutputItems;
import accesses.AccessesRootExternalAccessItemsPropertiesAbstract;
import accesses.AccessesRootExternalAccessItemsTrigger;

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
 * An implementation of the model object '<em><b>Root External Access Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsImpl#getName <em>Name</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsImpl#getPath <em>Path</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsImpl#getOntological <em>Ontological</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsImpl#getAuth <em>Auth</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsImpl#getInput <em>Input</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsImpl#getBody <em>Body</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessesRootExternalAccessItemsImpl extends MinimalEObjectImpl.Container implements AccessesRootExternalAccessItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessesRootExternalAccessItemsPropertiesAbstract> items;

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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOntological() <em>Ontological</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntological()
	 * @generated
	 * @ordered
	 */
	protected static final String ONTOLOGICAL_EDEFAULT = null;

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
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAuth() <em>Auth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuth()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessesRootExternalAccessItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessesPackage.Literals.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessesRootExternalAccessItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<AccessesRootExternalAccessItemsPropertiesAbstract>(AccessesRootExternalAccessItemsPropertiesAbstract.class, this, AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ITEMS);
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
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsName.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsPath.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsPath.class::cast).map(instance->instance.getPath()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOntological() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsOntological.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsOntological.class::cast).map(instance->instance.getOntological()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassname() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsClassname.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsClassname.class::cast).map(instance->instance.getClassname()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethod() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsMethod.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsMethod.class::cast).map(instance->instance.getMethod()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuth() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsAuth.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsAuth.class::cast).map(instance->instance.getAuth()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessesRootExternalAccessItemsInputItems> getInput() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsInput.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsInput.class::cast).map(instance->instance.getInput()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessesRootExternalAccessItemsOutputItems> getOutput() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsOutput.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsOutput.class::cast).map(instance->instance.getOutput()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessesRootExternalAccessItemsBodyItems> getBody() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsBody.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsBody.class::cast).map(instance->instance.getBody()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsTrigger getTrigger() {
		return this.getItems().stream().filter(accesses.AccessesRootExternalAccessItemsTrigger.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsTrigger.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("name".equals(key) ){return this.getName();}
		
		if ("path".equals(key) ){return this.getPath();}
		
		if ("ontological".equals(key) ){return this.getOntological();}
		
		if ("classname".equals(key) ){return this.getClassname();}
		
		if ("method".equals(key) ){return this.getMethod();}
		
		if ("auth".equals(key) ){return this.getAuth();}
		
		if ("input".equals(key) ){return this.getInput();}
		
		if ("output".equals(key) ){return this.getOutput();}
		
		if ("body".equals(key) ){return this.getBody();}
		
		if ("trigger".equals(key) ){return this.getTrigger();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (AccessesRootExternalAccessItemsPropertiesAbstract child : this.items){
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ITEMS:
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ITEMS:
				return getItems();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__NAME:
				return getName();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__PATH:
				return getPath();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ONTOLOGICAL:
				return getOntological();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__CLASSNAME:
				return getClassname();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__METHOD:
				return getMethod();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__AUTH:
				return getAuth();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__INPUT:
				return getInput();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__OUTPUT:
				return getOutput();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__BODY:
				return getBody();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__TRIGGER:
				return getTrigger();
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends AccessesRootExternalAccessItemsPropertiesAbstract>)newValue);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ITEMS:
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ITEMS:
				return items != null && !items.isEmpty();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__ONTOLOGICAL:
				return ONTOLOGICAL_EDEFAULT == null ? getOntological() != null : !ONTOLOGICAL_EDEFAULT.equals(getOntological());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__CLASSNAME:
				return CLASSNAME_EDEFAULT == null ? getClassname() != null : !CLASSNAME_EDEFAULT.equals(getClassname());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__METHOD:
				return METHOD_EDEFAULT == null ? getMethod() != null : !METHOD_EDEFAULT.equals(getMethod());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__AUTH:
				return AUTH_EDEFAULT == null ? getAuth() != null : !AUTH_EDEFAULT.equals(getAuth());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__INPUT:
				return !getInput().isEmpty();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__OUTPUT:
				return !getOutput().isEmpty();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__BODY:
				return !getBody().isEmpty();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS__TRIGGER:
				return getTrigger() != null;
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AccessesRootExternalAccessItemsImpl
