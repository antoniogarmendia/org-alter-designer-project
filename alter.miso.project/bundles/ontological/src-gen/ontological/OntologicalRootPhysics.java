/**
 */
package ontological;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Physics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ontological.OntologicalRootPhysics#getPhysics <em>Physics</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRootPhysics()
 * @model annotation="Type Type='boolean'"
 * @generated
 */
public interface OntologicalRootPhysics extends OntologicalRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Physics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physics</em>' attribute.
	 * @see #setPhysics(Boolean)
	 * @see ontological.OntologicalPackage#getOntologicalRootPhysics_Physics()
	 * @model required="true"
	 *        annotation="Keyword Keyword='physics'"
	 * @generated
	 */
	Boolean getPhysics();

	/**
	 * Sets the value of the '{@link ontological.OntologicalRootPhysics#getPhysics <em>Physics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physics</em>' attribute.
	 * @see #getPhysics()
	 * @generated
	 */
	void setPhysics(Boolean value);

} // OntologicalRootPhysics
