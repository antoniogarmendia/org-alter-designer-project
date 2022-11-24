/**
 */
package ontological;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootClassesItemsReferences#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsReferences()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface OntologicalRootClassesItemsReferences extends OntologicalRootClassesItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link ontological.OntologicalRootClassesItemsReferencesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsReferences_References()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='references'"
	 * @generated
	 */
	EList<OntologicalRootClassesItemsReferencesItems> getReferences();

} // OntologicalRootClassesItemsReferences
