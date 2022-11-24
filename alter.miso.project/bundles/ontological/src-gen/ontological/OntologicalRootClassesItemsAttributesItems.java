/**
 */
package ontological;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items Attributes Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootClassesItemsAttributesItems#getItems <em>Items</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsAttributesItems#getName <em>Name</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsAttributesItems#getType <em>Type</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsAttributesItems#getMin <em>Min</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsAttributesItems#getMax <em>Max</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsAttributesItems#getDefault <em>Default</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsAttributesItems#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsAttributesItems#getIsParam <em>Is Param</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsAttributesItems#getIsKey <em>Is Key</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsAttributesItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface OntologicalRootClassesItemsAttributesItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link ontological.OntologicalRootClassesItemsAttributesItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsAttributesItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<OntologicalRootClassesItemsAttributesItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsAttributesItems_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsAttributesItems_Type()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsAttributesItems_Min()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getMin();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsAttributesItems_Max()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getMax();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsAttributesItems_Default()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getDefault();

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsAttributesItems_ReadOnly()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getReadOnly();

	/**
	 * Returns the value of the '<em><b>Is Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Param</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsAttributesItems_IsParam()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getIsParam();

	/**
	 * Returns the value of the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Key</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsAttributesItems_IsKey()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getIsKey();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // OntologicalRootClassesItemsAttributesItems
