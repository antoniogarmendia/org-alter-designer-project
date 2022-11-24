/**
 */
package ontological.impl;

import ontological.*;

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
public class OntologicalFactoryImpl extends EFactoryImpl implements OntologicalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OntologicalFactory init() {
		try {
			OntologicalFactory theOntologicalFactory = (OntologicalFactory)EPackage.Registry.INSTANCE.getEFactory(OntologicalPackage.eNS_URI);
			if (theOntologicalFactory != null) {
				return theOntologicalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OntologicalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalFactoryImpl() {
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
			case OntologicalPackage.ONTOLOGICAL_ROOT: return createOntologicalRoot();
			case OntologicalPackage.ONTOLOGICAL_ROOT_NAME: return createOntologicalRootName();
			case OntologicalPackage.ONTOLOGICAL_ROOT_URI: return createOntologicalRootURI();
			case OntologicalPackage.ONTOLOGICAL_ROOT_ONLY_CODES: return createOntologicalRootOnlyCodes();
			case OntologicalPackage.ONTOLOGICAL_ROOT_BLUETOOTH: return createOntologicalRootBluetooth();
			case OntologicalPackage.ONTOLOGICAL_ROOT_EXTERNAL: return createOntologicalRootExternal();
			case OntologicalPackage.ONTOLOGICAL_ROOT_FIREBASE: return createOntologicalRootFirebase();
			case OntologicalPackage.ONTOLOGICAL_ROOT_PHYSICS: return createOntologicalRootPhysics();
			case OntologicalPackage.ONTOLOGICAL_ROOT_GAMELOOP: return createOntologicalRootGameloop();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES: return createOntologicalRootClasses();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS: return createOntologicalRootClassesItems();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_NAME: return createOntologicalRootClassesItemsName();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ABSTRACT: return createOntologicalRootClassesItemsAbstract();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES: return createOntologicalRootClassesItemsAttributes();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS: return createOntologicalRootClassesItemsAttributesItems();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_NAME: return createOntologicalRootClassesItemsAttributesItemsName();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_TYPE: return createOntologicalRootClassesItemsAttributesItemsType();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MIN: return createOntologicalRootClassesItemsAttributesItemsMin();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_MAX: return createOntologicalRootClassesItemsAttributesItemsMax();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_DEFAULT: return createOntologicalRootClassesItemsAttributesItemsDefault();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_READ_ONLY: return createOntologicalRootClassesItemsAttributesItemsReadOnly();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_PARAM: return createOntologicalRootClassesItemsAttributesItemsIsParam();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ATTRIBUTES_ITEMS_IS_KEY: return createOntologicalRootClassesItemsAttributesItemsIsKey();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES: return createOntologicalRootClassesItemsReferences();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS: return createOntologicalRootClassesItemsReferencesItems();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_NAME: return createOntologicalRootClassesItemsReferencesItemsName();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_CONTAINTMENT: return createOntologicalRootClassesItemsReferencesItemsContaintment();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MIN: return createOntologicalRootClassesItemsReferencesItemsMin();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_MAX: return createOntologicalRootClassesItemsReferencesItemsMax();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_TARGET: return createOntologicalRootClassesItemsReferencesItemsTarget();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_REFERENCES_ITEMS_OPPOSITE: return createOntologicalRootClassesItemsReferencesItemsOpposite();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_AUTO_ID: return createOntologicalRootClassesItemsAutoID();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_ONLY_CODES: return createOntologicalRootClassesItemsOnlyCodes();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_BLUETOOTH: return createOntologicalRootClassesItemsBluetooth();
			case OntologicalPackage.ONTOLOGICAL_ROOT_CLASSES_ITEMS_NO_SCN: return createOntologicalRootClassesItemsNoSCN();
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
	public OntologicalRoot createOntologicalRoot() {
		OntologicalRootImpl ontologicalRoot = new OntologicalRootImpl();
		return ontologicalRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootName createOntologicalRootName() {
		OntologicalRootNameImpl ontologicalRootName = new OntologicalRootNameImpl();
		return ontologicalRootName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootURI createOntologicalRootURI() {
		OntologicalRootURIImpl ontologicalRootURI = new OntologicalRootURIImpl();
		return ontologicalRootURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootOnlyCodes createOntologicalRootOnlyCodes() {
		OntologicalRootOnlyCodesImpl ontologicalRootOnlyCodes = new OntologicalRootOnlyCodesImpl();
		return ontologicalRootOnlyCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootBluetooth createOntologicalRootBluetooth() {
		OntologicalRootBluetoothImpl ontologicalRootBluetooth = new OntologicalRootBluetoothImpl();
		return ontologicalRootBluetooth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootExternal createOntologicalRootExternal() {
		OntologicalRootExternalImpl ontologicalRootExternal = new OntologicalRootExternalImpl();
		return ontologicalRootExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootFirebase createOntologicalRootFirebase() {
		OntologicalRootFirebaseImpl ontologicalRootFirebase = new OntologicalRootFirebaseImpl();
		return ontologicalRootFirebase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootPhysics createOntologicalRootPhysics() {
		OntologicalRootPhysicsImpl ontologicalRootPhysics = new OntologicalRootPhysicsImpl();
		return ontologicalRootPhysics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootGameloop createOntologicalRootGameloop() {
		OntologicalRootGameloopImpl ontologicalRootGameloop = new OntologicalRootGameloopImpl();
		return ontologicalRootGameloop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClasses createOntologicalRootClasses() {
		OntologicalRootClassesImpl ontologicalRootClasses = new OntologicalRootClassesImpl();
		return ontologicalRootClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItems createOntologicalRootClassesItems() {
		OntologicalRootClassesItemsImpl ontologicalRootClassesItems = new OntologicalRootClassesItemsImpl();
		return ontologicalRootClassesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsName createOntologicalRootClassesItemsName() {
		OntologicalRootClassesItemsNameImpl ontologicalRootClassesItemsName = new OntologicalRootClassesItemsNameImpl();
		return ontologicalRootClassesItemsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsAbstract createOntologicalRootClassesItemsAbstract() {
		OntologicalRootClassesItemsAbstractImpl ontologicalRootClassesItemsAbstract = new OntologicalRootClassesItemsAbstractImpl();
		return ontologicalRootClassesItemsAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsAttributes createOntologicalRootClassesItemsAttributes() {
		OntologicalRootClassesItemsAttributesImpl ontologicalRootClassesItemsAttributes = new OntologicalRootClassesItemsAttributesImpl();
		return ontologicalRootClassesItemsAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsAttributesItems createOntologicalRootClassesItemsAttributesItems() {
		OntologicalRootClassesItemsAttributesItemsImpl ontologicalRootClassesItemsAttributesItems = new OntologicalRootClassesItemsAttributesItemsImpl();
		return ontologicalRootClassesItemsAttributesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsAttributesItemsName createOntologicalRootClassesItemsAttributesItemsName() {
		OntologicalRootClassesItemsAttributesItemsNameImpl ontologicalRootClassesItemsAttributesItemsName = new OntologicalRootClassesItemsAttributesItemsNameImpl();
		return ontologicalRootClassesItemsAttributesItemsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsAttributesItemsType createOntologicalRootClassesItemsAttributesItemsType() {
		OntologicalRootClassesItemsAttributesItemsTypeImpl ontologicalRootClassesItemsAttributesItemsType = new OntologicalRootClassesItemsAttributesItemsTypeImpl();
		return ontologicalRootClassesItemsAttributesItemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsAttributesItemsMin createOntologicalRootClassesItemsAttributesItemsMin() {
		OntologicalRootClassesItemsAttributesItemsMinImpl ontologicalRootClassesItemsAttributesItemsMin = new OntologicalRootClassesItemsAttributesItemsMinImpl();
		return ontologicalRootClassesItemsAttributesItemsMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsAttributesItemsMax createOntologicalRootClassesItemsAttributesItemsMax() {
		OntologicalRootClassesItemsAttributesItemsMaxImpl ontologicalRootClassesItemsAttributesItemsMax = new OntologicalRootClassesItemsAttributesItemsMaxImpl();
		return ontologicalRootClassesItemsAttributesItemsMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsAttributesItemsDefault createOntologicalRootClassesItemsAttributesItemsDefault() {
		OntologicalRootClassesItemsAttributesItemsDefaultImpl ontologicalRootClassesItemsAttributesItemsDefault = new OntologicalRootClassesItemsAttributesItemsDefaultImpl();
		return ontologicalRootClassesItemsAttributesItemsDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsAttributesItemsReadOnly createOntologicalRootClassesItemsAttributesItemsReadOnly() {
		OntologicalRootClassesItemsAttributesItemsReadOnlyImpl ontologicalRootClassesItemsAttributesItemsReadOnly = new OntologicalRootClassesItemsAttributesItemsReadOnlyImpl();
		return ontologicalRootClassesItemsAttributesItemsReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsAttributesItemsIsParam createOntologicalRootClassesItemsAttributesItemsIsParam() {
		OntologicalRootClassesItemsAttributesItemsIsParamImpl ontologicalRootClassesItemsAttributesItemsIsParam = new OntologicalRootClassesItemsAttributesItemsIsParamImpl();
		return ontologicalRootClassesItemsAttributesItemsIsParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsAttributesItemsIsKey createOntologicalRootClassesItemsAttributesItemsIsKey() {
		OntologicalRootClassesItemsAttributesItemsIsKeyImpl ontologicalRootClassesItemsAttributesItemsIsKey = new OntologicalRootClassesItemsAttributesItemsIsKeyImpl();
		return ontologicalRootClassesItemsAttributesItemsIsKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsReferences createOntologicalRootClassesItemsReferences() {
		OntologicalRootClassesItemsReferencesImpl ontologicalRootClassesItemsReferences = new OntologicalRootClassesItemsReferencesImpl();
		return ontologicalRootClassesItemsReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsReferencesItems createOntologicalRootClassesItemsReferencesItems() {
		OntologicalRootClassesItemsReferencesItemsImpl ontologicalRootClassesItemsReferencesItems = new OntologicalRootClassesItemsReferencesItemsImpl();
		return ontologicalRootClassesItemsReferencesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsReferencesItemsName createOntologicalRootClassesItemsReferencesItemsName() {
		OntologicalRootClassesItemsReferencesItemsNameImpl ontologicalRootClassesItemsReferencesItemsName = new OntologicalRootClassesItemsReferencesItemsNameImpl();
		return ontologicalRootClassesItemsReferencesItemsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsReferencesItemsContaintment createOntologicalRootClassesItemsReferencesItemsContaintment() {
		OntologicalRootClassesItemsReferencesItemsContaintmentImpl ontologicalRootClassesItemsReferencesItemsContaintment = new OntologicalRootClassesItemsReferencesItemsContaintmentImpl();
		return ontologicalRootClassesItemsReferencesItemsContaintment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsReferencesItemsMin createOntologicalRootClassesItemsReferencesItemsMin() {
		OntologicalRootClassesItemsReferencesItemsMinImpl ontologicalRootClassesItemsReferencesItemsMin = new OntologicalRootClassesItemsReferencesItemsMinImpl();
		return ontologicalRootClassesItemsReferencesItemsMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsReferencesItemsMax createOntologicalRootClassesItemsReferencesItemsMax() {
		OntologicalRootClassesItemsReferencesItemsMaxImpl ontologicalRootClassesItemsReferencesItemsMax = new OntologicalRootClassesItemsReferencesItemsMaxImpl();
		return ontologicalRootClassesItemsReferencesItemsMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsReferencesItemsTarget createOntologicalRootClassesItemsReferencesItemsTarget() {
		OntologicalRootClassesItemsReferencesItemsTargetImpl ontologicalRootClassesItemsReferencesItemsTarget = new OntologicalRootClassesItemsReferencesItemsTargetImpl();
		return ontologicalRootClassesItemsReferencesItemsTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsReferencesItemsOpposite createOntologicalRootClassesItemsReferencesItemsOpposite() {
		OntologicalRootClassesItemsReferencesItemsOppositeImpl ontologicalRootClassesItemsReferencesItemsOpposite = new OntologicalRootClassesItemsReferencesItemsOppositeImpl();
		return ontologicalRootClassesItemsReferencesItemsOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsAutoID createOntologicalRootClassesItemsAutoID() {
		OntologicalRootClassesItemsAutoIDImpl ontologicalRootClassesItemsAutoID = new OntologicalRootClassesItemsAutoIDImpl();
		return ontologicalRootClassesItemsAutoID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsOnlyCodes createOntologicalRootClassesItemsOnlyCodes() {
		OntologicalRootClassesItemsOnlyCodesImpl ontologicalRootClassesItemsOnlyCodes = new OntologicalRootClassesItemsOnlyCodesImpl();
		return ontologicalRootClassesItemsOnlyCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsBluetooth createOntologicalRootClassesItemsBluetooth() {
		OntologicalRootClassesItemsBluetoothImpl ontologicalRootClassesItemsBluetooth = new OntologicalRootClassesItemsBluetoothImpl();
		return ontologicalRootClassesItemsBluetooth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalRootClassesItemsNoSCN createOntologicalRootClassesItemsNoSCN() {
		OntologicalRootClassesItemsNoSCNImpl ontologicalRootClassesItemsNoSCN = new OntologicalRootClassesItemsNoSCNImpl();
		return ontologicalRootClassesItemsNoSCN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OntologicalPackage getOntologicalPackage() {
		return (OntologicalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OntologicalPackage getPackage() {
		return OntologicalPackage.eINSTANCE;
	}

} //OntologicalFactoryImpl
