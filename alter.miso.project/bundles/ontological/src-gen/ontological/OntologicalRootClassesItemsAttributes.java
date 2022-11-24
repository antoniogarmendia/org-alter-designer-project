/**
 */
package ontological;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootClassesItemsAttributes#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsAttributes()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface OntologicalRootClassesItemsAttributes extends OntologicalRootClassesItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ontological.OntologicalRootClassesItemsAttributesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see ontological.OntologicalPackage#getOntologicalRootClassesItemsAttributes_Attributes()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='attributes'"
	 * @generated
	 */
	EList<OntologicalRootClassesItemsAttributesItems> getAttributes();

} // OntologicalRootClassesItemsAttributes
