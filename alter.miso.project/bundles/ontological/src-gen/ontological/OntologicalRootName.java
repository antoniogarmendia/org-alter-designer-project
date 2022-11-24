/**
 */
package ontological;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootName()
 * @model annotation="Type Type='string'"
 * @generated
 */
public interface OntologicalRootName extends OntologicalRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ontological.OntologicalPackage#getOntologicalRootName_Name()
	 * @model required="true"
	 *        annotation="Keyword Keyword='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ontological.OntologicalRootName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OntologicalRootName
