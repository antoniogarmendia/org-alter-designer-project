/**
 */
package accesses.impl;

import accesses.AccessesPackage;
import accesses.AccessesRoot;
import accesses.AccessesRootExternalAccessItems;
import accesses.AccessesRootPropertiesAbstract;

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
 *   <li>{@link accesses.impl.AccessesRootImpl#getAccessesRoot <em>Accesses Root</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootImpl#getExternalAccess <em>External Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessesRootImpl extends MinimalEObjectImpl.Container implements AccessesRoot {
	/**
	 * The cached value of the '{@link #getAccessesRoot() <em>Accesses Root</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessesRoot()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessesRootPropertiesAbstract> accessesRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessesRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessesPackage.Literals.ACCESSES_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessesRootPropertiesAbstract> getAccessesRoot() {
		if (accessesRoot == null) {
			accessesRoot = new EObjectContainmentEList<AccessesRootPropertiesAbstract>(AccessesRootPropertiesAbstract.class, this, AccessesPackage.ACCESSES_ROOT__ACCESSES_ROOT);
		}
		return accessesRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessesRootExternalAccessItems> getExternalAccess() {
		return this.getAccessesRoot().stream().filter(accesses.AccessesRootExternalAccess.class::isInstance).findAny().map(accesses.AccessesRootExternalAccess.class::cast).map(instance->instance.getExternalAccess()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("ExternalAccess".equals(key) ){return this.getExternalAccess();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (AccessesRootPropertiesAbstract child : this.accessesRoot){
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
			case AccessesPackage.ACCESSES_ROOT__ACCESSES_ROOT:
				return ((InternalEList<?>)getAccessesRoot()).basicRemove(otherEnd, msgs);
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
			case AccessesPackage.ACCESSES_ROOT__ACCESSES_ROOT:
				return getAccessesRoot();
			case AccessesPackage.ACCESSES_ROOT__EXTERNAL_ACCESS:
				return getExternalAccess();
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
			case AccessesPackage.ACCESSES_ROOT__ACCESSES_ROOT:
				getAccessesRoot().clear();
				getAccessesRoot().addAll((Collection<? extends AccessesRootPropertiesAbstract>)newValue);
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
			case AccessesPackage.ACCESSES_ROOT__ACCESSES_ROOT:
				getAccessesRoot().clear();
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
			case AccessesPackage.ACCESSES_ROOT__ACCESSES_ROOT:
				return accessesRoot != null && !accessesRoot.isEmpty();
			case AccessesPackage.ACCESSES_ROOT__EXTERNAL_ACCESS:
				return !getExternalAccess().isEmpty();
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
			case AccessesPackage.ACCESSES_ROOT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AccessesRootImpl
