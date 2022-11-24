/**
 */
package ontological;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items References Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootClassesItemsReferencesItems#getItems <em>Items</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsReferencesItems#getName <em>Name</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsReferencesItems#getContaintment <em>Containtment</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsReferencesItems#getMin <em>Min</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsReferencesItems#getMax <em>Max</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsReferencesItems#getTarget <em>Target</em>}</li>
 *   <li>{@link ontological.OntologicalRootClassesItemsReferencesItems#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsReferencesItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface OntologicalRootClassesItemsReferencesItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link ontological.OntologicalRootClassesItemsReferencesItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsReferencesItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<OntologicalRootClassesItemsReferencesItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsReferencesItems_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Containtment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containtment</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsReferencesItems_Containtment()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getContaintment();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsReferencesItems_Min()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getMin();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsReferencesItems_Max()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getMax();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsReferencesItems_Target()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getTarget();

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsReferencesItems_Opposite()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getOpposite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // OntologicalRootClassesItemsReferencesItems
