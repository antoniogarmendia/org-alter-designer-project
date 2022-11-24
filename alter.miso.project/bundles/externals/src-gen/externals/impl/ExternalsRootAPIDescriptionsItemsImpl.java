/**
 */
package externals.impl;

import externals.ExternalsPackage;
import externals.ExternalsRootAPIDescriptionsItems;
import externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems;
import externals.ExternalsRootAPIDescriptionsItemsPathsItems;
import externals.ExternalsRootAPIDescriptionsItemsPropertiesAbstract;

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
 * An implementation of the model object '<em><b>Root API Descriptions Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsImpl#getName <em>Name</em>}</li>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link externals.impl.ExternalsRootAPIDescriptionsItemsImpl#getAPIAuth <em>API Auth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalsRootAPIDescriptionsItemsImpl extends MinimalEObjectImpl.Container implements ExternalsRootAPIDescriptionsItems {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalsRootAPIDescriptionsItemsPropertiesAbstract> items;

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
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalsRootAPIDescriptionsItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalsPackage.Literals.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalsRootAPIDescriptionsItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ExternalsRootAPIDescriptionsItemsPropertiesAbstract>(ExternalsRootAPIDescriptionsItemsPropertiesAbstract.class, this, ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS);
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
		return this.getItems().stream().filter(externals.ExternalsRootAPIDescriptionsItemsName.class::isInstance).findAny().map(externals.ExternalsRootAPIDescriptionsItemsName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return this.getItems().stream().filter(externals.ExternalsRootAPIDescriptionsItemsProtocol.class::isInstance).findAny().map(externals.ExternalsRootAPIDescriptionsItemsProtocol.class::cast).map(instance->instance.getProtocol()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return this.getItems().stream().filter(externals.ExternalsRootAPIDescriptionsItemsUrl.class::isInstance).findAny().map(externals.ExternalsRootAPIDescriptionsItemsUrl.class::cast).map(instance->instance.getUrl()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalsRootAPIDescriptionsItemsPathsItems> getPaths() {
		return this.getItems().stream().filter(externals.ExternalsRootAPIDescriptionsItemsPaths.class::isInstance).findAny().map(externals.ExternalsRootAPIDescriptionsItemsPaths.class::cast).map(instance->instance.getPaths()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalsRootAPIDescriptionsItemsAPIAuthItems> getAPIAuth() {
		return this.getItems().stream().filter(externals.ExternalsRootAPIDescriptionsItemsAPIAuth.class::isInstance).findAny().map(externals.ExternalsRootAPIDescriptionsItemsAPIAuth.class::cast).map(instance->instance.getAPIAuth()).orElse(new org.eclipse.emf.common.util.BasicEList<>());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("name".equals(key) ){return this.getName();}
		
		if ("protocol".equals(key) ){return this.getProtocol();}
		
		if ("url".equals(key) ){return this.getUrl();}
		
		if ("paths".equals(key) ){return this.getPaths();}
		
		if ("APIAuth".equals(key) ){return this.getAPIAuth();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (ExternalsRootAPIDescriptionsItemsPropertiesAbstract child : this.items){
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS:
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS:
				return getItems();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__NAME:
				return getName();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PROTOCOL:
				return getProtocol();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__URL:
				return getUrl();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PATHS:
				return getPaths();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__API_AUTH:
				return getAPIAuth();
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ExternalsRootAPIDescriptionsItemsPropertiesAbstract>)newValue);
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS:
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__ITEMS:
				return items != null && !items.isEmpty();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? getProtocol() != null : !PROTOCOL_EDEFAULT.equals(getProtocol());
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__PATHS:
				return !getPaths().isEmpty();
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS__API_AUTH:
				return !getAPIAuth().isEmpty();
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
			case ExternalsPackage.EXTERNALS_ROOT_API_DESCRIPTIONS_ITEMS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExternalsRootAPIDescriptionsItemsImpl
