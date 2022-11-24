/**
 */
package codesinfos.util;

import codesinfos.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see codesinfos.CodesinfosPackage
 * @generated
 */
public class CodesinfosAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodesinfosPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodesinfosAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CodesinfosPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodesinfosSwitch<Adapter> modelSwitch =
		new CodesinfosSwitch<Adapter>() {
			@Override
			public Adapter caseCodesinfosRoot(CodesinfosRoot object) {
				return createCodesinfosRootAdapter();
			}
			@Override
			public Adapter caseCodesinfosRootName(CodesinfosRootName object) {
				return createCodesinfosRootNameAdapter();
			}
			@Override
			public Adapter caseCodesinfosRootCodes(CodesinfosRootCodes object) {
				return createCodesinfosRootCodesAdapter();
			}
			@Override
			public Adapter caseCodesinfosRootCodesItems(CodesinfosRootCodesItems object) {
				return createCodesinfosRootCodesItemsAdapter();
			}
			@Override
			public Adapter caseCodesinfosRootCodesItemsName(CodesinfosRootCodesItemsName object) {
				return createCodesinfosRootCodesItemsNameAdapter();
			}
			@Override
			public Adapter caseCodesinfosRootCodesItemsClassname(CodesinfosRootCodesItemsClassname object) {
				return createCodesinfosRootCodesItemsClassnameAdapter();
			}
			@Override
			public Adapter caseCodesinfosRootCodesItemsNodename(CodesinfosRootCodesItemsNodename object) {
				return createCodesinfosRootCodesItemsNodenameAdapter();
			}
			@Override
			public Adapter caseCodesinfosRootPropertiesAbstract(CodesinfosRootPropertiesAbstract object) {
				return createCodesinfosRootPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseCodesinfosRootCodesItemsPropertiesAbstract(CodesinfosRootCodesItemsPropertiesAbstract object) {
				return createCodesinfosRootCodesItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link codesinfos.CodesinfosRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codesinfos.CodesinfosRoot
	 * @generated
	 */
	public Adapter createCodesinfosRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codesinfos.CodesinfosRootName <em>Root Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codesinfos.CodesinfosRootName
	 * @generated
	 */
	public Adapter createCodesinfosRootNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codesinfos.CodesinfosRootCodes <em>Root Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codesinfos.CodesinfosRootCodes
	 * @generated
	 */
	public Adapter createCodesinfosRootCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codesinfos.CodesinfosRootCodesItems <em>Root Codes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codesinfos.CodesinfosRootCodesItems
	 * @generated
	 */
	public Adapter createCodesinfosRootCodesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codesinfos.CodesinfosRootCodesItemsName <em>Root Codes Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codesinfos.CodesinfosRootCodesItemsName
	 * @generated
	 */
	public Adapter createCodesinfosRootCodesItemsNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codesinfos.CodesinfosRootCodesItemsClassname <em>Root Codes Items Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codesinfos.CodesinfosRootCodesItemsClassname
	 * @generated
	 */
	public Adapter createCodesinfosRootCodesItemsClassnameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codesinfos.CodesinfosRootCodesItemsNodename <em>Root Codes Items Nodename</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codesinfos.CodesinfosRootCodesItemsNodename
	 * @generated
	 */
	public Adapter createCodesinfosRootCodesItemsNodenameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codesinfos.CodesinfosRootPropertiesAbstract <em>Root Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codesinfos.CodesinfosRootPropertiesAbstract
	 * @generated
	 */
	public Adapter createCodesinfosRootPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codesinfos.CodesinfosRootCodesItemsPropertiesAbstract <em>Root Codes Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codesinfos.CodesinfosRootCodesItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createCodesinfosRootCodesItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CodesinfosAdapterFactory
