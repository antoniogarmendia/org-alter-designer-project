/**
 */
package accesses.impl;

import accesses.AccessesPackage;
import accesses.AccessesRootExternalAccessItemsTrigger;
import accesses.AccessesRootExternalAccessItemsTriggerPropertiesAbstract;

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
 * An implementation of the model object '<em><b>Root External Access Items Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsTriggerImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsTriggerImpl#getOnChange <em>On Change</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsTriggerImpl#getOnCreate <em>On Create</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsTriggerImpl#getOnMove <em>On Move</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsTriggerImpl#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsTriggerImpl#getOnAccess <em>On Access</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsTriggerImpl#getOnLoad <em>On Load</em>}</li>
 *   <li>{@link accesses.impl.AccessesRootExternalAccessItemsTriggerImpl#getTimeTrigger <em>Time Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessesRootExternalAccessItemsTriggerImpl extends AccessesRootExternalAccessItemsPropertiesAbstractImpl implements AccessesRootExternalAccessItemsTrigger {
	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessesRootExternalAccessItemsTriggerPropertiesAbstract> trigger;

	/**
	 * The default value of the '{@link #getOnChange() <em>On Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChange()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ON_CHANGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnCreate() <em>On Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCreate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ON_CREATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnMove() <em>On Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnMove()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ON_MOVE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ON_DELETE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnAccess() <em>On Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ON_ACCESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnLoad() <em>On Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnLoad()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ON_LOAD_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTimeTrigger() <em>Time Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final Double TIME_TRIGGER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessesRootExternalAccessItemsTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessesPackage.Literals.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessesRootExternalAccessItemsTriggerPropertiesAbstract> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<AccessesRootExternalAccessItemsTriggerPropertiesAbstract>(AccessesRootExternalAccessItemsTriggerPropertiesAbstract.class, this, AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnChange() {
		return this.getTrigger().stream().filter(accesses.AccessesRootExternalAccessItemsTriggerOnChange.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsTriggerOnChange.class::cast).map(instance->instance.getOnChange()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnCreate() {
		return this.getTrigger().stream().filter(accesses.AccessesRootExternalAccessItemsTriggerOnCreate.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsTriggerOnCreate.class::cast).map(instance->instance.getOnCreate()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnMove() {
		return this.getTrigger().stream().filter(accesses.AccessesRootExternalAccessItemsTriggerOnMove.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsTriggerOnMove.class::cast).map(instance->instance.getOnMove()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnDelete() {
		return this.getTrigger().stream().filter(accesses.AccessesRootExternalAccessItemsTriggerOnDelete.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsTriggerOnDelete.class::cast).map(instance->instance.getOnDelete()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnAccess() {
		return this.getTrigger().stream().filter(accesses.AccessesRootExternalAccessItemsTriggerOnAccess.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsTriggerOnAccess.class::cast).map(instance->instance.getOnAccess()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnLoad() {
		return this.getTrigger().stream().filter(accesses.AccessesRootExternalAccessItemsTriggerOnLoad.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsTriggerOnLoad.class::cast).map(instance->instance.getOnLoad()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getTimeTrigger() {
		return this.getTrigger().stream().filter(accesses.AccessesRootExternalAccessItemsTriggerTimeTrigger.class::isInstance).findAny().map(accesses.AccessesRootExternalAccessItemsTriggerTimeTrigger.class::cast).map(instance->instance.getTimeTrigger()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("onChange".equals(key) ){return this.getOnChange();}
		
		if ("onCreate".equals(key) ){return this.getOnCreate();}
		
		if ("onMove".equals(key) ){return this.getOnMove();}
		
		if ("onDelete".equals(key) ){return this.getOnDelete();}
		
		if ("onAccess".equals(key) ){return this.getOnAccess();}
		
		if ("onLoad".equals(key) ){return this.getOnLoad();}
		
		if ("timeTrigger".equals(key) ){return this.getTimeTrigger();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (AccessesRootExternalAccessItemsTriggerPropertiesAbstract child : this.trigger){
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TRIGGER:
				return getTrigger();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_CHANGE:
				return getOnChange();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_CREATE:
				return getOnCreate();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_MOVE:
				return getOnMove();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_DELETE:
				return getOnDelete();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_ACCESS:
				return getOnAccess();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_LOAD:
				return getOnLoad();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TIME_TRIGGER:
				return getTimeTrigger();
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends AccessesRootExternalAccessItemsTriggerPropertiesAbstract>)newValue);
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TRIGGER:
				getTrigger().clear();
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TRIGGER:
				return trigger != null && !trigger.isEmpty();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_CHANGE:
				return ON_CHANGE_EDEFAULT == null ? getOnChange() != null : !ON_CHANGE_EDEFAULT.equals(getOnChange());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_CREATE:
				return ON_CREATE_EDEFAULT == null ? getOnCreate() != null : !ON_CREATE_EDEFAULT.equals(getOnCreate());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_MOVE:
				return ON_MOVE_EDEFAULT == null ? getOnMove() != null : !ON_MOVE_EDEFAULT.equals(getOnMove());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_DELETE:
				return ON_DELETE_EDEFAULT == null ? getOnDelete() != null : !ON_DELETE_EDEFAULT.equals(getOnDelete());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_ACCESS:
				return ON_ACCESS_EDEFAULT == null ? getOnAccess() != null : !ON_ACCESS_EDEFAULT.equals(getOnAccess());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__ON_LOAD:
				return ON_LOAD_EDEFAULT == null ? getOnLoad() != null : !ON_LOAD_EDEFAULT.equals(getOnLoad());
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER__TIME_TRIGGER:
				return TIME_TRIGGER_EDEFAULT == null ? getTimeTrigger() != null : !TIME_TRIGGER_EDEFAULT.equals(getTimeTrigger());
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
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AccessesRootExternalAccessItemsTriggerImpl
