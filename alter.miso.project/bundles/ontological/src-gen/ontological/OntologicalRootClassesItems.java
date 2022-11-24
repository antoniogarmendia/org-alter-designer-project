/**
 */
package ontological;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootClassesItems#getItems <em>Items</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItems#getName <em>Name</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItems#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItems#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItems#getReferences <em>References</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItems#getAutoID <em>Auto ID</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItems#getOnlyCodes <em>Only Codes</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItems#getBluetooth <em>Bluetooth</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItems#getNoSCN <em>No SCN</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootClassesItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface OntologicalRootClassesItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link ontological.OntologicalRootClassesItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<OntologicalRootClassesItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItems_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItems_Abstract()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link ontological.OntologicalRootClassesItemsAttributesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItems_Attributes()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<OntologicalRootClassesItemsAttributesItems> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link ontological.OntologicalRootClassesItemsReferencesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItems_References()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<OntologicalRootClassesItemsReferencesItems> getReferences();

	/**
	 * Returns the value of the '<em><b>Auto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto ID</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItems_AutoID()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getAutoID();

	/**
	 * Returns the value of the '<em><b>Only Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Codes</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItems_OnlyCodes()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getOnlyCodes();

	/**
	 * Returns the value of the '<em><b>Bluetooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bluetooth</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItems_Bluetooth()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getBluetooth();

	/**
	 * Returns the value of the '<em><b>No SCN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No SCN</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItems_NoSCN()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getNoSCN();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // OntologicalRootClassesItems
