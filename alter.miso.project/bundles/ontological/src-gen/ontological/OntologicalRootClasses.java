/**
 */
package ontological;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootClasses#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootClasses()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface OntologicalRootClasses extends OntologicalRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link ontological.OntologicalRootClassesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see ontological.OntologicalPackage#getOntologicalRootClasses_Classes()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='classes'"
	 * @generated
	 */
	EList<OntologicalRootClassesItems> getClasses();

} // OntologicalRootClasses
