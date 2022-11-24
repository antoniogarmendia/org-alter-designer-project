/**
 */
package codesinfos.impl;

import codesinfos.*;

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
public class CodesinfosFactoryImpl extends EFactoryImpl implements CodesinfosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodesinfosFactory init() {
		try {
			CodesinfosFactory theCodesinfosFactory = (CodesinfosFactory)EPackage.Registry.INSTANCE.getEFactory(CodesinfosPackage.eNS_URI);
			if (theCodesinfosFactory != null) {
				return theCodesinfosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodesinfosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodesinfosFactoryImpl() {
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
			case CodesinfosPackage.CODESINFOS_ROOT: return createCodesinfosRoot();
			case CodesinfosPackage.CODESINFOS_ROOT_NAME: return createCodesinfosRootName();
			case CodesinfosPackage.CODESINFOS_ROOT_CODES: return createCodesinfosRootCodes();
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS: return createCodesinfosRootCodesItems();
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS_NAME: return createCodesinfosRootCodesItemsName();
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS_CLASSNAME: return createCodesinfosRootCodesItemsClassname();
			case CodesinfosPackage.CODESINFOS_ROOT_CODES_ITEMS_NODENAME: return createCodesinfosRootCodesItemsNodename();
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
	public CodesinfosRoot createCodesinfosRoot() {
		CodesinfosRootImpl codesinfosRoot = new CodesinfosRootImpl();
		return codesinfosRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodesinfosRootName createCodesinfosRootName() {
		CodesinfosRootNameImpl codesinfosRootName = new CodesinfosRootNameImpl();
		return codesinfosRootName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodesinfosRootCodes createCodesinfosRootCodes() {
		CodesinfosRootCodesImpl codesinfosRootCodes = new CodesinfosRootCodesImpl();
		return codesinfosRootCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodesinfosRootCodesItems createCodesinfosRootCodesItems() {
		CodesinfosRootCodesItemsImpl codesinfosRootCodesItems = new CodesinfosRootCodesItemsImpl();
		return codesinfosRootCodesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodesinfosRootCodesItemsName createCodesinfosRootCodesItemsName() {
		CodesinfosRootCodesItemsNameImpl codesinfosRootCodesItemsName = new CodesinfosRootCodesItemsNameImpl();
		return codesinfosRootCodesItemsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodesinfosRootCodesItemsClassname createCodesinfosRootCodesItemsClassname() {
		CodesinfosRootCodesItemsClassnameImpl codesinfosRootCodesItemsClassname = new CodesinfosRootCodesItemsClassnameImpl();
		return codesinfosRootCodesItemsClassname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodesinfosRootCodesItemsNodename createCodesinfosRootCodesItemsNodename() {
		CodesinfosRootCodesItemsNodenameImpl codesinfosRootCodesItemsNodename = new CodesinfosRootCodesItemsNodenameImpl();
		return codesinfosRootCodesItemsNodename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodesinfosPackage getCodesinfosPackage() {
		return (CodesinfosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodesinfosPackage getPackage() {
		return CodesinfosPackage.eINSTANCE;
	}

} //CodesinfosFactoryImpl
