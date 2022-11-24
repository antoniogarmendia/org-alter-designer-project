/**
 */
package ontological;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Firebase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootFirebase#getFirebase <em>Firebase</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootFirebase()
 * @model annotation="Type Type='boolean'"
 * @generated
 */
public interface OntologicalRootFirebase extends OntologicalRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Firebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firebase</em>' attribute.
	 * @see #setFirebase(Boolean)
	 * @see ontological.OntologicalPackage#getOntologicalRootFirebase_Firebase()
	 * @model required="true"
	 *        annotation="Keyword Keyword='firebase'"
	 * @generated
	 */
	Boolean getFirebase();

	/**
	 * Sets the value of the '{@link ontological.OntologicalRootFirebase#getFirebase <em>Firebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firebase</em>' attribute.
	 * @see #getFirebase()
	 * @generated
	 */
	void setFirebase(Boolean value);

} // OntologicalRootFirebase
