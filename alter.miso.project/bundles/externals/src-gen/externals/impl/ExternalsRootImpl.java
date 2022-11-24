/**
 */
package externals.impl;

import externals.ExternalsPackage;
import externals.ExternalsRoot;
import externals.ExternalsRootAPIDescriptionsItems;
import externals.ExternalsRootPropertiesAbstract;

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
 *   <li>{@link externals.impl.ExternalsRootImpl#getExternalsRoot <em>Externals Root</em>}</li>
 *   <li>{@link externals.impl.ExternalsRootImpl#getAPIDescriptions <em>API Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalsRootImpl extends MinimalEObjectImpl.Container implements ExternalsRoot {
	/**
	 * The cached value of the '{@link #getExternalsRoot() <em>Externals Root</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalsRoot()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalsRootPropertiesAbstract> externalsRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalsPackage.Literals.EXTERNALS_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalsRootPropertiesAbstract> getExternalsRoot() {
		if (externalsRoot == null) {
			externalsRoot = new EObjectContainmentEList<ExternalsRootPropertiesAbstract>(ExternalsRootPropertiesAbstract.class, this, ExternalsPackage.EXTERNALS_ROOT__EXTERNALS_ROOT);
		}
		return externalsRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalsRootAPIDescriptionsItems> getAPIDescriptions() {
		return this.getExternalsRoot().stream().filter(externals.ExternalsRootAPIDescriptions.class::isInstance).findAny().map(externals.ExternalsRootAPIDescriptions.class::cast).map(instance->instance.getAPIDescriptions()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("APIDescriptions".equals(key) ){return this.getAPIDescriptions();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (ExternalsRootPropertiesAbstract child : this.externalsRoot){
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
			case ExternalsPackage.EXTERNALS_ROOT__EXTERNALS_ROOT:
				return ((InternalEList<?>)getExternalsRoot()).basicRemove(otherEnd, msgs);
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
			case ExternalsPackage.EXTERNALS_ROOT__EXTERNALS_ROOT:
				return getExternalsRoot();
			case ExternalsPackage.EXTERNALS_ROOT__API_DESCRIPTIONS:
				return getAPIDescriptions();
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
			case ExternalsPackage.EXTERNALS_ROOT__EXTERNALS_ROOT:
				getExternalsRoot().clear();
				getExternalsRoot().addAll((Collection<? extends ExternalsRootPropertiesAbstract>)newValue);
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
			case ExternalsPackage.EXTERNALS_ROOT__EXTERNALS_ROOT:
				getExternalsRoot().clear();
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
			case ExternalsPackage.EXTERNALS_ROOT__EXTERNALS_ROOT:
				return externalsRoot != null && !externalsRoot.isEmpty();
			case ExternalsPackage.EXTERNALS_ROOT__API_DESCRIPTIONS:
				return !getAPIDescriptions().isEmpty();
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
			case ExternalsPackage.EXTERNALS_ROOT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExternalsRootImpl
