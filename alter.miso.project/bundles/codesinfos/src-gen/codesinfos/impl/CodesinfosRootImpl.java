/**
 */
package codesinfos.impl;

import codesinfos.CodesinfosPackage;
import codesinfos.CodesinfosRoot;
import codesinfos.CodesinfosRootCodesItems;
import codesinfos.CodesinfosRootPropertiesAbstract;

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
 *   <li>{@link codesinfos.impl.CodesinfosRootImpl#getCodesinfosRoot <em>Codesinfos Root</em>}</li>
 *   <li>{@link codesinfos.impl.CodesinfosRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link codesinfos.impl.CodesinfosRootImpl#getCodes <em>Codes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodesinfosRootImpl extends MinimalEObjectImpl.Container implements CodesinfosRoot {
	/**
	 * The cached value of the '{@link #getCodesinfosRoot() <em>Codesinfos Root</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodesinfosRoot()
	 * @generated
	 * @ordered
	 */
	protected EList<CodesinfosRootPropertiesAbstract> codesinfosRoot;

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
	protected CodesinfosRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesinfosPackage.Literals.CODESINFOS_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodesinfosRootPropertiesAbstract> getCodesinfosRoot() {
		if (codesinfosRoot == null) {
			codesinfosRoot = new EObjectContainmentEList<CodesinfosRootPropertiesAbstract>(CodesinfosRootPropertiesAbstract.class, this, CodesinfosPackage.CODESINFOS_ROOT__CODESINFOS_ROOT);
		}
		return codesinfosRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return this.getCodesinfosRoot().stream().filter(codesinfos.CodesinfosRootName.class::isInstance).findAny().map(codesinfos.CodesinfosRootName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodesinfosRootCodesItems> getCodes() {
		return this.getCodesinfosRoot().stream().filter(codesinfos.CodesinfosRootCodes.class::isInstance).findAny().map(codesinfos.CodesinfosRootCodes.class::cast).map(instance->instance.getCodes()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("name".equals(key) ){return this.getName();}
		
		if ("codes".equals(key) ){return this.getCodes();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (CodesinfosRootPropertiesAbstract child : this.codesinfosRoot){
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
			case CodesinfosPackage.CODESINFOS_ROOT__CODESINFOS_ROOT:
				return ((InternalEList<?>)getCodesinfosRoot()).basicRemove(otherEnd, msgs);
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
			case CodesinfosPackage.CODESINFOS_ROOT__CODESINFOS_ROOT:
				return getCodesinfosRoot();
			case CodesinfosPackage.CODESINFOS_ROOT__NAME:
				return getName();
			case CodesinfosPackage.CODESINFOS_ROOT__CODES:
				return getCodes();
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
			case CodesinfosPackage.CODESINFOS_ROOT__CODESINFOS_ROOT:
				getCodesinfosRoot().clear();
				getCodesinfosRoot().addAll((Collection<? extends CodesinfosRootPropertiesAbstract>)newValue);
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
			case CodesinfosPackage.CODESINFOS_ROOT__CODESINFOS_ROOT:
				getCodesinfosRoot().clear();
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
			case CodesinfosPackage.CODESINFOS_ROOT__CODESINFOS_ROOT:
				return codesinfosRoot != null && !codesinfosRoot.isEmpty();
			case CodesinfosPackage.CODESINFOS_ROOT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CodesinfosPackage.CODESINFOS_ROOT__CODES:
				return !getCodes().isEmpty();
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
			case CodesinfosPackage.CODESINFOS_ROOT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CodesinfosRootImpl
