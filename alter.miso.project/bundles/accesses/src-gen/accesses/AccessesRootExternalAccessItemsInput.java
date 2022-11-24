/**
 */
package accesses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root External Access Items Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link accesses.AccessesRootExternalAccessItemsInput#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsInput()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface AccessesRootExternalAccessItemsInput extends AccessesRootExternalAccessItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link accesses.AccessesRootExternalAccessItemsInputItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see accesses.AccessesPackage#getAccessesRootExternalAccessItemsInput_Input()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='input'"
	 * @generated
	 */
	EList<AccessesRootExternalAccessItemsInputItems> getInput();

} // AccessesRootExternalAccessItemsInput
