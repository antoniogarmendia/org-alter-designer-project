/**
 */
package codesinfos.impl;

import codesinfos.CodesinfosFactory;
import codesinfos.CodesinfosPackage;
import codesinfos.CodesinfosRoot;
import codesinfos.CodesinfosRootCodes;
import codesinfos.CodesinfosRootCodesItems;
import codesinfos.CodesinfosRootCodesItemsClassname;
import codesinfos.CodesinfosRootCodesItemsName;
import codesinfos.CodesinfosRootCodesItemsNodename;
import codesinfos.CodesinfosRootCodesItemsPropertiesAbstract;
import codesinfos.CodesinfosRootName;
import codesinfos.CodesinfosRootPropertiesAbstract;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodesinfosPackageImpl extends EPackageImpl implements CodesinfosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codesinfosRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codesinfosRootNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codesinfosRootCodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codesinfosRootCodesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codesinfosRootCodesItemsNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codesinfosRootCodesItemsClassnameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codesinfosRootCodesItemsNodenameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codesinfosRootPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codesinfosRootCodesItemsPropertiesAbstractEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see codesinfos.CodesinfosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodesinfosPackageImpl() {
		super(eNS_URI, CodesinfosFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CodesinfosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodesinfosPackage init() {
		if (isInited) return (CodesinfosPackage)EPackage.Registry.INSTANCE.getEPackage(CodesinfosPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCodesinfosPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CodesinfosPackageImpl theCodesinfosPackage = registeredCodesinfosPackage instanceof CodesinfosPackageImpl ? (CodesinfosPackageImpl)registeredCodesinfosPackage : new CodesinfosPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCodesinfosPackage.createPackageContents();

		// Initialize created meta-data
		theCodesinfosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodesinfosPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodesinfosPackage.eNS_URI, theCodesinfosPackage);
		return theCodesinfosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodesinfosRoot() {
		return codesinfosRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodesinfosRoot_CodesinfosRoot() {
		return (EReference)codesinfosRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodesinfosRoot_Name() {
		return (EAttribute)codesinfosRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodesinfosRoot_Codes() {
		return (EReference)codesinfosRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodesinfosRoot__Get__String() {
		return codesinfosRootEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodesinfosRootName() {
		return codesinfosRootNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodesinfosRootName_Name() {
		return (EAttribute)codesinfosRootNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodesinfosRootCodes() {
		return codesinfosRootCodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodesinfosRootCodes_Codes() {
		return (EReference)codesinfosRootCodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodesinfosRootCodesItems() {
		return codesinfosRootCodesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodesinfosRootCodesItems_Items() {
		return (EReference)codesinfosRootCodesItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodesinfosRootCodesItems_Name() {
		return (EAttribute)codesinfosRootCodesItemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodesinfosRootCodesItems_Classname() {
		return (EAttribute)codesinfosRootCodesItemsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodesinfosRootCodesItems_Nodename() {
		return (EAttribute)codesinfosRootCodesItemsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodesinfosRootCodesItems__Get__String() {
		return codesinfosRootCodesItemsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodesinfosRootCodesItemsName() {
		return codesinfosRootCodesItemsNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodesinfosRootCodesItemsName_Name() {
		return (EAttribute)codesinfosRootCodesItemsNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodesinfosRootCodesItemsClassname() {
		return codesinfosRootCodesItemsClassnameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodesinfosRootCodesItemsClassname_Classname() {
		return (EAttribute)codesinfosRootCodesItemsClassnameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodesinfosRootCodesItemsNodename() {
		return codesinfosRootCodesItemsNodenameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodesinfosRootCodesItemsNodename_Nodename() {
		return (EAttribute)codesinfosRootCodesItemsNodenameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodesinfosRootPropertiesAbstract() {
		return codesinfosRootPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodesinfosRootCodesItemsPropertiesAbstract() {
		return codesinfosRootCodesItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodesinfosFactory getCodesinfosFactory() {
		return (CodesinfosFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		codesinfosRootEClass = createEClass(CODESINFOS_ROOT);
		createEReference(codesinfosRootEClass, CODESINFOS_ROOT__CODESINFOS_ROOT);
		createEAttribute(codesinfosRootEClass, CODESINFOS_ROOT__NAME);
		createEReference(codesinfosRootEClass, CODESINFOS_ROOT__CODES);
		createEOperation(codesinfosRootEClass, CODESINFOS_ROOT___GET__STRING);

		codesinfosRootNameEClass = createEClass(CODESINFOS_ROOT_NAME);
		createEAttribute(codesinfosRootNameEClass, CODESINFOS_ROOT_NAME__NAME);

		codesinfosRootCodesEClass = createEClass(CODESINFOS_ROOT_CODES);
		createEReference(codesinfosRootCodesEClass, CODESINFOS_ROOT_CODES__CODES);

		codesinfosRootCodesItemsEClass = createEClass(CODESINFOS_ROOT_CODES_ITEMS);
		createEReference(codesinfosRootCodesItemsEClass, CODESINFOS_ROOT_CODES_ITEMS__ITEMS);
		createEAttribute(codesinfosRootCodesItemsEClass, CODESINFOS_ROOT_CODES_ITEMS__NAME);
		createEAttribute(codesinfosRootCodesItemsEClass, CODESINFOS_ROOT_CODES_ITEMS__CLASSNAME);
		createEAttribute(codesinfosRootCodesItemsEClass, CODESINFOS_ROOT_CODES_ITEMS__NODENAME);
		createEOperation(codesinfosRootCodesItemsEClass, CODESINFOS_ROOT_CODES_ITEMS___GET__STRING);

		codesinfosRootCodesItemsNameEClass = createEClass(CODESINFOS_ROOT_CODES_ITEMS_NAME);
		createEAttribute(codesinfosRootCodesItemsNameEClass, CODESINFOS_ROOT_CODES_ITEMS_NAME__NAME);

		codesinfosRootCodesItemsClassnameEClass = createEClass(CODESINFOS_ROOT_CODES_ITEMS_CLASSNAME);
		createEAttribute(codesinfosRootCodesItemsClassnameEClass, CODESINFOS_ROOT_CODES_ITEMS_CLASSNAME__CLASSNAME);

		codesinfosRootCodesItemsNodenameEClass = createEClass(CODESINFOS_ROOT_CODES_ITEMS_NODENAME);
		createEAttribute(codesinfosRootCodesItemsNodenameEClass, CODESINFOS_ROOT_CODES_ITEMS_NODENAME__NODENAME);

		codesinfosRootPropertiesAbstractEClass = createEClass(CODESINFOS_ROOT_PROPERTIES_ABSTRACT);

		codesinfosRootCodesItemsPropertiesAbstractEClass = createEClass(CODESINFOS_ROOT_CODES_ITEMS_PROPERTIES_ABSTRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codesinfosRootNameEClass.getESuperTypes().add(this.getCodesinfosRootPropertiesAbstract());
		codesinfosRootCodesEClass.getESuperTypes().add(this.getCodesinfosRootPropertiesAbstract());
		codesinfosRootCodesItemsNameEClass.getESuperTypes().add(this.getCodesinfosRootCodesItemsPropertiesAbstract());
		codesinfosRootCodesItemsClassnameEClass.getESuperTypes().add(this.getCodesinfosRootCodesItemsPropertiesAbstract());
		codesinfosRootCodesItemsNodenameEClass.getESuperTypes().add(this.getCodesinfosRootCodesItemsPropertiesAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(codesinfosRootEClass, CodesinfosRoot.class, "CodesinfosRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodesinfosRoot_CodesinfosRoot(), this.getCodesinfosRootPropertiesAbstract(), null, "codesinfosRoot", null, 0, -1, CodesinfosRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodesinfosRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, CodesinfosRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getCodesinfosRoot_Codes(), this.getCodesinfosRootCodesItems(), null, "codes", null, 0, -1, CodesinfosRoot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getCodesinfosRoot__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(codesinfosRootNameEClass, CodesinfosRootName.class, "CodesinfosRootName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodesinfosRootName_Name(), ecorePackage.getEString(), "name", null, 1, 1, CodesinfosRootName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codesinfosRootCodesEClass, CodesinfosRootCodes.class, "CodesinfosRootCodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodesinfosRootCodes_Codes(), this.getCodesinfosRootCodesItems(), null, "codes", null, 0, -1, CodesinfosRootCodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codesinfosRootCodesItemsEClass, CodesinfosRootCodesItems.class, "CodesinfosRootCodesItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodesinfosRootCodesItems_Items(), this.getCodesinfosRootCodesItemsPropertiesAbstract(), null, "items", null, 0, -1, CodesinfosRootCodesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodesinfosRootCodesItems_Name(), ecorePackage.getEString(), "name", null, 0, 1, CodesinfosRootCodesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodesinfosRootCodesItems_Classname(), ecorePackage.getEString(), "classname", null, 0, 1, CodesinfosRootCodesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodesinfosRootCodesItems_Nodename(), ecorePackage.getEString(), "nodename", null, 0, 1, CodesinfosRootCodesItems.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCodesinfosRootCodesItems__Get__String(), ecorePackage.getEJavaObject(), "get", 1, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(codesinfosRootCodesItemsNameEClass, CodesinfosRootCodesItemsName.class, "CodesinfosRootCodesItemsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodesinfosRootCodesItemsName_Name(), ecorePackage.getEString(), "name", null, 1, 1, CodesinfosRootCodesItemsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codesinfosRootCodesItemsClassnameEClass, CodesinfosRootCodesItemsClassname.class, "CodesinfosRootCodesItemsClassname", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodesinfosRootCodesItemsClassname_Classname(), ecorePackage.getEString(), "classname", null, 1, 1, CodesinfosRootCodesItemsClassname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codesinfosRootCodesItemsNodenameEClass, CodesinfosRootCodesItemsNodename.class, "CodesinfosRootCodesItemsNodename", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodesinfosRootCodesItemsNodename_Nodename(), ecorePackage.getEString(), "nodename", null, 1, 1, CodesinfosRootCodesItemsNodename.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codesinfosRootPropertiesAbstractEClass, CodesinfosRootPropertiesAbstract.class, "CodesinfosRootPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codesinfosRootCodesItemsPropertiesAbstractEClass, CodesinfosRootCodesItemsPropertiesAbstract.class, "CodesinfosRootCodesItemsPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Type
		createTypeAnnotations();
		// Keyword
		createKeywordAnnotations();
		// Comment
		createCommentAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Type</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTypeAnnotations() {
		String source = "Type";
		addAnnotation
		  (codesinfosRootEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (codesinfosRootNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (codesinfosRootCodesEClass,
		   source,
		   new String[] {
			   "Type", "array"
		   });
		addAnnotation
		  (codesinfosRootCodesItemsEClass,
		   source,
		   new String[] {
			   "Type", "object"
		   });
		addAnnotation
		  (codesinfosRootCodesItemsNameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (codesinfosRootCodesItemsClassnameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
		addAnnotation
		  (codesinfosRootCodesItemsNodenameEClass,
		   source,
		   new String[] {
			   "Type", "string"
		   });
	}

	/**
	 * Initializes the annotations for <b>Keyword</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKeywordAnnotations() {
		String source = "Keyword";
		addAnnotation
		  (getCodesinfosRootName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getCodesinfosRootCodes_Codes(),
		   source,
		   new String[] {
			   "Keyword", "codes"
		   });
		addAnnotation
		  (getCodesinfosRootCodesItemsName_Name(),
		   source,
		   new String[] {
			   "Keyword", "name"
		   });
		addAnnotation
		  (getCodesinfosRootCodesItemsClassname_Classname(),
		   source,
		   new String[] {
			   "Keyword", "classname"
		   });
		addAnnotation
		  (getCodesinfosRootCodesItemsNodename_Nodename(),
		   source,
		   new String[] {
			   "Keyword", "nodename"
		   });
	}

	/**
	 * Initializes the annotations for <b>Comment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCommentAnnotations() {
		String source = "Comment";
		addAnnotation
		  (codesinfosRootCodesItemsClassnameEClass,
		   source,
		   new String[] {
			   "Comment", "it should be class"
		   });
	}

} //CodesinfosPackageImpl
