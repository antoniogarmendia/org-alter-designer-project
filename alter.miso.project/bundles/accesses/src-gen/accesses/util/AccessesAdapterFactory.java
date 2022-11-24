/**
 */
package accesses.util;

import accesses.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see accesses.AccessesPackage
 * @generated
 */
public class AccessesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AccessesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AccessesPackage.eINSTANCE;
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
	protected AccessesSwitch<Adapter> modelSwitch =
		new AccessesSwitch<Adapter>() {
			@Override
			public Adapter caseAccessesRoot(AccessesRoot object) {
				return createAccessesRootAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccess(AccessesRootExternalAccess object) {
				return createAccessesRootExternalAccessAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItems(AccessesRootExternalAccessItems object) {
				return createAccessesRootExternalAccessItemsAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsName(AccessesRootExternalAccessItemsName object) {
				return createAccessesRootExternalAccessItemsNameAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsPath(AccessesRootExternalAccessItemsPath object) {
				return createAccessesRootExternalAccessItemsPathAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsOntological(AccessesRootExternalAccessItemsOntological object) {
				return createAccessesRootExternalAccessItemsOntologicalAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsClassname(AccessesRootExternalAccessItemsClassname object) {
				return createAccessesRootExternalAccessItemsClassnameAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsMethod(AccessesRootExternalAccessItemsMethod object) {
				return createAccessesRootExternalAccessItemsMethodAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsAuth(AccessesRootExternalAccessItemsAuth object) {
				return createAccessesRootExternalAccessItemsAuthAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsInput(AccessesRootExternalAccessItemsInput object) {
				return createAccessesRootExternalAccessItemsInputAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsInputItems(AccessesRootExternalAccessItemsInputItems object) {
				return createAccessesRootExternalAccessItemsInputItemsAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsInputItemsAttr(AccessesRootExternalAccessItemsInputItemsAttr object) {
				return createAccessesRootExternalAccessItemsInputItemsAttrAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsInputItemsAPIInput(AccessesRootExternalAccessItemsInputItemsAPIInput object) {
				return createAccessesRootExternalAccessItemsInputItemsAPIInputAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsInputItemsWay(AccessesRootExternalAccessItemsInputItemsWay object) {
				return createAccessesRootExternalAccessItemsInputItemsWayAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsInputItemsValue(AccessesRootExternalAccessItemsInputItemsValue object) {
				return createAccessesRootExternalAccessItemsInputItemsValueAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsOutput(AccessesRootExternalAccessItemsOutput object) {
				return createAccessesRootExternalAccessItemsOutputAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsOutputItems(AccessesRootExternalAccessItemsOutputItems object) {
				return createAccessesRootExternalAccessItemsOutputItemsAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsOutputItemsAttr(AccessesRootExternalAccessItemsOutputItemsAttr object) {
				return createAccessesRootExternalAccessItemsOutputItemsAttrAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsOutputItemsAPIOutput(AccessesRootExternalAccessItemsOutputItemsAPIOutput object) {
				return createAccessesRootExternalAccessItemsOutputItemsAPIOutputAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsBody(AccessesRootExternalAccessItemsBody object) {
				return createAccessesRootExternalAccessItemsBodyAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsBodyItems(AccessesRootExternalAccessItemsBodyItems object) {
				return createAccessesRootExternalAccessItemsBodyItemsAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsBodyItemsAttr(AccessesRootExternalAccessItemsBodyItemsAttr object) {
				return createAccessesRootExternalAccessItemsBodyItemsAttrAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsBodyItemsAPIBody(AccessesRootExternalAccessItemsBodyItemsAPIBody object) {
				return createAccessesRootExternalAccessItemsBodyItemsAPIBodyAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsTrigger(AccessesRootExternalAccessItemsTrigger object) {
				return createAccessesRootExternalAccessItemsTriggerAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsTriggerOnChange(AccessesRootExternalAccessItemsTriggerOnChange object) {
				return createAccessesRootExternalAccessItemsTriggerOnChangeAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsTriggerOnCreate(AccessesRootExternalAccessItemsTriggerOnCreate object) {
				return createAccessesRootExternalAccessItemsTriggerOnCreateAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsTriggerOnMove(AccessesRootExternalAccessItemsTriggerOnMove object) {
				return createAccessesRootExternalAccessItemsTriggerOnMoveAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsTriggerOnDelete(AccessesRootExternalAccessItemsTriggerOnDelete object) {
				return createAccessesRootExternalAccessItemsTriggerOnDeleteAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsTriggerOnAccess(AccessesRootExternalAccessItemsTriggerOnAccess object) {
				return createAccessesRootExternalAccessItemsTriggerOnAccessAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsTriggerOnLoad(AccessesRootExternalAccessItemsTriggerOnLoad object) {
				return createAccessesRootExternalAccessItemsTriggerOnLoadAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsTriggerTimeTrigger(AccessesRootExternalAccessItemsTriggerTimeTrigger object) {
				return createAccessesRootExternalAccessItemsTriggerTimeTriggerAdapter();
			}
			@Override
			public Adapter caseAccessesRootPropertiesAbstract(AccessesRootPropertiesAbstract object) {
				return createAccessesRootPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsPropertiesAbstract(AccessesRootExternalAccessItemsPropertiesAbstract object) {
				return createAccessesRootExternalAccessItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsInputItemsPropertiesAbstract(AccessesRootExternalAccessItemsInputItemsPropertiesAbstract object) {
				return createAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsOutputItemsPropertiesAbstract(AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract object) {
				return createAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsBodyItemsPropertiesAbstract(AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract object) {
				return createAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseAccessesRootExternalAccessItemsTriggerPropertiesAbstract(AccessesRootExternalAccessItemsTriggerPropertiesAbstract object) {
				return createAccessesRootExternalAccessItemsTriggerPropertiesAbstractAdapter();
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
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRoot
	 * @generated
	 */
	public Adapter createAccessesRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccess <em>Root External Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccess
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItems <em>Root External Access Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItems
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsName <em>Root External Access Items Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsName
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsPath <em>Root External Access Items Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsPath
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsOntological <em>Root External Access Items Ontological</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsOntological
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsOntologicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsClassname <em>Root External Access Items Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsClassname
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsClassnameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsMethod <em>Root External Access Items Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsMethod
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsAuth <em>Root External Access Items Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsAuth
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsAuthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsInput <em>Root External Access Items Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsInput
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsInputItems <em>Root External Access Items Input Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsInputItems
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsInputItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsInputItemsAttr <em>Root External Access Items Input Items Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsAttr
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsInputItemsAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsInputItemsAPIInput <em>Root External Access Items Input Items API Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsAPIInput
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsInputItemsAPIInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsInputItemsWay <em>Root External Access Items Input Items Way</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsWay
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsInputItemsWayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsInputItemsValue <em>Root External Access Items Input Items Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsValue
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsInputItemsValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsOutput <em>Root External Access Items Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsOutput
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsOutputItems <em>Root External Access Items Output Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItems
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsOutputItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsOutputItemsAttr <em>Root External Access Items Output Items Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItemsAttr
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsOutputItemsAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsOutputItemsAPIOutput <em>Root External Access Items Output Items API Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItemsAPIOutput
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsOutputItemsAPIOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsBody <em>Root External Access Items Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsBody
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsBodyItems <em>Root External Access Items Body Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItems
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsBodyItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsBodyItemsAttr <em>Root External Access Items Body Items Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItemsAttr
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsBodyItemsAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsBodyItemsAPIBody <em>Root External Access Items Body Items API Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItemsAPIBody
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsBodyItemsAPIBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsTrigger <em>Root External Access Items Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsTrigger
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsTriggerOnChange <em>Root External Access Items Trigger On Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnChange
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsTriggerOnChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsTriggerOnCreate <em>Root External Access Items Trigger On Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnCreate
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsTriggerOnCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsTriggerOnMove <em>Root External Access Items Trigger On Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnMove
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsTriggerOnMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsTriggerOnDelete <em>Root External Access Items Trigger On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnDelete
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsTriggerOnDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsTriggerOnAccess <em>Root External Access Items Trigger On Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnAccess
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsTriggerOnAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsTriggerOnLoad <em>Root External Access Items Trigger On Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerOnLoad
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsTriggerOnLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsTriggerTimeTrigger <em>Root External Access Items Trigger Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerTimeTrigger
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsTriggerTimeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootPropertiesAbstract <em>Root Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootPropertiesAbstract
	 * @generated
	 */
	public Adapter createAccessesRootPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsPropertiesAbstract <em>Root External Access Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsInputItemsPropertiesAbstract <em>Root External Access Items Input Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsInputItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract <em>Root External Access Items Output Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract <em>Root External Access Items Body Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accesses.AccessesRootExternalAccessItemsTriggerPropertiesAbstract <em>Root External Access Items Trigger Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accesses.AccessesRootExternalAccessItemsTriggerPropertiesAbstract
	 * @generated
	 */
	public Adapter createAccessesRootExternalAccessItemsTriggerPropertiesAbstractAdapter() {
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

} //AccessesAdapterFactory
