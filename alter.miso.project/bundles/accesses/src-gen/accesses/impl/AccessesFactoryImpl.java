/**
 */
package accesses.impl;

import accesses.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessesFactoryImpl extends EFactoryImpl implements AccessesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessesFactory init() {
		try {
			AccessesFactory theAccessesFactory = (AccessesFactory)EPackage.Registry.INSTANCE.getEFactory(AccessesPackage.eNS_URI);
			if (theAccessesFactory != null) {
				return theAccessesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccessesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AccessesPackage.ACCESSES_ROOT: return createAccessesRoot();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS: return createAccessesRootExternalAccess();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS: return createAccessesRootExternalAccessItems();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_NAME: return createAccessesRootExternalAccessItemsName();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_PATH: return createAccessesRootExternalAccessItemsPath();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_ONTOLOGICAL: return createAccessesRootExternalAccessItemsOntological();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_CLASSNAME: return createAccessesRootExternalAccessItemsClassname();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_METHOD: return createAccessesRootExternalAccessItemsMethod();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_AUTH: return createAccessesRootExternalAccessItemsAuth();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT: return createAccessesRootExternalAccessItemsInput();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS: return createAccessesRootExternalAccessItemsInputItems();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_ATTR: return createAccessesRootExternalAccessItemsInputItemsAttr();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_API_INPUT: return createAccessesRootExternalAccessItemsInputItemsAPIInput();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_WAY: return createAccessesRootExternalAccessItemsInputItemsWay();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_INPUT_ITEMS_VALUE: return createAccessesRootExternalAccessItemsInputItemsValue();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT: return createAccessesRootExternalAccessItemsOutput();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS: return createAccessesRootExternalAccessItemsOutputItems();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_ATTR: return createAccessesRootExternalAccessItemsOutputItemsAttr();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_OUTPUT_ITEMS_API_OUTPUT: return createAccessesRootExternalAccessItemsOutputItemsAPIOutput();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY: return createAccessesRootExternalAccessItemsBody();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS: return createAccessesRootExternalAccessItemsBodyItems();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_ATTR: return createAccessesRootExternalAccessItemsBodyItemsAttr();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_BODY_ITEMS_API_BODY: return createAccessesRootExternalAccessItemsBodyItemsAPIBody();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER: return createAccessesRootExternalAccessItemsTrigger();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CHANGE: return createAccessesRootExternalAccessItemsTriggerOnChange();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_CREATE: return createAccessesRootExternalAccessItemsTriggerOnCreate();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_MOVE: return createAccessesRootExternalAccessItemsTriggerOnMove();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_DELETE: return createAccessesRootExternalAccessItemsTriggerOnDelete();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_ACCESS: return createAccessesRootExternalAccessItemsTriggerOnAccess();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_ON_LOAD: return createAccessesRootExternalAccessItemsTriggerOnLoad();
			case AccessesPackage.ACCESSES_ROOT_EXTERNAL_ACCESS_ITEMS_TRIGGER_TIME_TRIGGER: return createAccessesRootExternalAccessItemsTriggerTimeTrigger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRoot createAccessesRoot() {
		AccessesRootImpl accessesRoot = new AccessesRootImpl();
		return accessesRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccess createAccessesRootExternalAccess() {
		AccessesRootExternalAccessImpl accessesRootExternalAccess = new AccessesRootExternalAccessImpl();
		return accessesRootExternalAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItems createAccessesRootExternalAccessItems() {
		AccessesRootExternalAccessItemsImpl accessesRootExternalAccessItems = new AccessesRootExternalAccessItemsImpl();
		return accessesRootExternalAccessItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsName createAccessesRootExternalAccessItemsName() {
		AccessesRootExternalAccessItemsNameImpl accessesRootExternalAccessItemsName = new AccessesRootExternalAccessItemsNameImpl();
		return accessesRootExternalAccessItemsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsPath createAccessesRootExternalAccessItemsPath() {
		AccessesRootExternalAccessItemsPathImpl accessesRootExternalAccessItemsPath = new AccessesRootExternalAccessItemsPathImpl();
		return accessesRootExternalAccessItemsPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsOntological createAccessesRootExternalAccessItemsOntological() {
		AccessesRootExternalAccessItemsOntologicalImpl accessesRootExternalAccessItemsOntological = new AccessesRootExternalAccessItemsOntologicalImpl();
		return accessesRootExternalAccessItemsOntological;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsClassname createAccessesRootExternalAccessItemsClassname() {
		AccessesRootExternalAccessItemsClassnameImpl accessesRootExternalAccessItemsClassname = new AccessesRootExternalAccessItemsClassnameImpl();
		return accessesRootExternalAccessItemsClassname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsMethod createAccessesRootExternalAccessItemsMethod() {
		AccessesRootExternalAccessItemsMethodImpl accessesRootExternalAccessItemsMethod = new AccessesRootExternalAccessItemsMethodImpl();
		return accessesRootExternalAccessItemsMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsAuth createAccessesRootExternalAccessItemsAuth() {
		AccessesRootExternalAccessItemsAuthImpl accessesRootExternalAccessItemsAuth = new AccessesRootExternalAccessItemsAuthImpl();
		return accessesRootExternalAccessItemsAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsInput createAccessesRootExternalAccessItemsInput() {
		AccessesRootExternalAccessItemsInputImpl accessesRootExternalAccessItemsInput = new AccessesRootExternalAccessItemsInputImpl();
		return accessesRootExternalAccessItemsInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsInputItems createAccessesRootExternalAccessItemsInputItems() {
		AccessesRootExternalAccessItemsInputItemsImpl accessesRootExternalAccessItemsInputItems = new AccessesRootExternalAccessItemsInputItemsImpl();
		return accessesRootExternalAccessItemsInputItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsInputItemsAttr createAccessesRootExternalAccessItemsInputItemsAttr() {
		AccessesRootExternalAccessItemsInputItemsAttrImpl accessesRootExternalAccessItemsInputItemsAttr = new AccessesRootExternalAccessItemsInputItemsAttrImpl();
		return accessesRootExternalAccessItemsInputItemsAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsInputItemsAPIInput createAccessesRootExternalAccessItemsInputItemsAPIInput() {
		AccessesRootExternalAccessItemsInputItemsAPIInputImpl accessesRootExternalAccessItemsInputItemsAPIInput = new AccessesRootExternalAccessItemsInputItemsAPIInputImpl();
		return accessesRootExternalAccessItemsInputItemsAPIInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsInputItemsWay createAccessesRootExternalAccessItemsInputItemsWay() {
		AccessesRootExternalAccessItemsInputItemsWayImpl accessesRootExternalAccessItemsInputItemsWay = new AccessesRootExternalAccessItemsInputItemsWayImpl();
		return accessesRootExternalAccessItemsInputItemsWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsInputItemsValue createAccessesRootExternalAccessItemsInputItemsValue() {
		AccessesRootExternalAccessItemsInputItemsValueImpl accessesRootExternalAccessItemsInputItemsValue = new AccessesRootExternalAccessItemsInputItemsValueImpl();
		return accessesRootExternalAccessItemsInputItemsValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsOutput createAccessesRootExternalAccessItemsOutput() {
		AccessesRootExternalAccessItemsOutputImpl accessesRootExternalAccessItemsOutput = new AccessesRootExternalAccessItemsOutputImpl();
		return accessesRootExternalAccessItemsOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsOutputItems createAccessesRootExternalAccessItemsOutputItems() {
		AccessesRootExternalAccessItemsOutputItemsImpl accessesRootExternalAccessItemsOutputItems = new AccessesRootExternalAccessItemsOutputItemsImpl();
		return accessesRootExternalAccessItemsOutputItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsOutputItemsAttr createAccessesRootExternalAccessItemsOutputItemsAttr() {
		AccessesRootExternalAccessItemsOutputItemsAttrImpl accessesRootExternalAccessItemsOutputItemsAttr = new AccessesRootExternalAccessItemsOutputItemsAttrImpl();
		return accessesRootExternalAccessItemsOutputItemsAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsOutputItemsAPIOutput createAccessesRootExternalAccessItemsOutputItemsAPIOutput() {
		AccessesRootExternalAccessItemsOutputItemsAPIOutputImpl accessesRootExternalAccessItemsOutputItemsAPIOutput = new AccessesRootExternalAccessItemsOutputItemsAPIOutputImpl();
		return accessesRootExternalAccessItemsOutputItemsAPIOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsBody createAccessesRootExternalAccessItemsBody() {
		AccessesRootExternalAccessItemsBodyImpl accessesRootExternalAccessItemsBody = new AccessesRootExternalAccessItemsBodyImpl();
		return accessesRootExternalAccessItemsBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsBodyItems createAccessesRootExternalAccessItemsBodyItems() {
		AccessesRootExternalAccessItemsBodyItemsImpl accessesRootExternalAccessItemsBodyItems = new AccessesRootExternalAccessItemsBodyItemsImpl();
		return accessesRootExternalAccessItemsBodyItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsBodyItemsAttr createAccessesRootExternalAccessItemsBodyItemsAttr() {
		AccessesRootExternalAccessItemsBodyItemsAttrImpl accessesRootExternalAccessItemsBodyItemsAttr = new AccessesRootExternalAccessItemsBodyItemsAttrImpl();
		return accessesRootExternalAccessItemsBodyItemsAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsBodyItemsAPIBody createAccessesRootExternalAccessItemsBodyItemsAPIBody() {
		AccessesRootExternalAccessItemsBodyItemsAPIBodyImpl accessesRootExternalAccessItemsBodyItemsAPIBody = new AccessesRootExternalAccessItemsBodyItemsAPIBodyImpl();
		return accessesRootExternalAccessItemsBodyItemsAPIBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsTrigger createAccessesRootExternalAccessItemsTrigger() {
		AccessesRootExternalAccessItemsTriggerImpl accessesRootExternalAccessItemsTrigger = new AccessesRootExternalAccessItemsTriggerImpl();
		return accessesRootExternalAccessItemsTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsTriggerOnChange createAccessesRootExternalAccessItemsTriggerOnChange() {
		AccessesRootExternalAccessItemsTriggerOnChangeImpl accessesRootExternalAccessItemsTriggerOnChange = new AccessesRootExternalAccessItemsTriggerOnChangeImpl();
		return accessesRootExternalAccessItemsTriggerOnChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsTriggerOnCreate createAccessesRootExternalAccessItemsTriggerOnCreate() {
		AccessesRootExternalAccessItemsTriggerOnCreateImpl accessesRootExternalAccessItemsTriggerOnCreate = new AccessesRootExternalAccessItemsTriggerOnCreateImpl();
		return accessesRootExternalAccessItemsTriggerOnCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsTriggerOnMove createAccessesRootExternalAccessItemsTriggerOnMove() {
		AccessesRootExternalAccessItemsTriggerOnMoveImpl accessesRootExternalAccessItemsTriggerOnMove = new AccessesRootExternalAccessItemsTriggerOnMoveImpl();
		return accessesRootExternalAccessItemsTriggerOnMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsTriggerOnDelete createAccessesRootExternalAccessItemsTriggerOnDelete() {
		AccessesRootExternalAccessItemsTriggerOnDeleteImpl accessesRootExternalAccessItemsTriggerOnDelete = new AccessesRootExternalAccessItemsTriggerOnDeleteImpl();
		return accessesRootExternalAccessItemsTriggerOnDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsTriggerOnAccess createAccessesRootExternalAccessItemsTriggerOnAccess() {
		AccessesRootExternalAccessItemsTriggerOnAccessImpl accessesRootExternalAccessItemsTriggerOnAccess = new AccessesRootExternalAccessItemsTriggerOnAccessImpl();
		return accessesRootExternalAccessItemsTriggerOnAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsTriggerOnLoad createAccessesRootExternalAccessItemsTriggerOnLoad() {
		AccessesRootExternalAccessItemsTriggerOnLoadImpl accessesRootExternalAccessItemsTriggerOnLoad = new AccessesRootExternalAccessItemsTriggerOnLoadImpl();
		return accessesRootExternalAccessItemsTriggerOnLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesRootExternalAccessItemsTriggerTimeTrigger createAccessesRootExternalAccessItemsTriggerTimeTrigger() {
		AccessesRootExternalAccessItemsTriggerTimeTriggerImpl accessesRootExternalAccessItemsTriggerTimeTrigger = new AccessesRootExternalAccessItemsTriggerTimeTriggerImpl();
		return accessesRootExternalAccessItemsTriggerTimeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessesPackage getAccessesPackage() {
		return (AccessesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AccessesPackage getPackage() {
		return AccessesPackage.eINSTANCE;
	}

} //AccessesFactoryImpl
