/**
 */
package accesses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsOutput#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsOutput()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface AccessesRootExternalAccessItemsOutput extends AccessesRootExternalAccessItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItemsOutputItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsOutput_Output()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='output'"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItemsOutputItems> getOutput();

} // AccessesRootExternalAccessItemsOutput
