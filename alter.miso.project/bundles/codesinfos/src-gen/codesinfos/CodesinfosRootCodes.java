/**
 */
package codesinfos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Codes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codesinfos.CodesinfosRootCodes#getCodes <em>Codes</em>}</li>
 * </ul>
 *
 * @see codesinfos.CodesinfosPackage#getCodesinfosRootCodes()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface CodesinfosRootCodes extends CodesinfosRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Codes</b></em>' containment reference list.
	 * The list contents are of type {@link codesinfos.CodesinfosRootCodesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codes</em>' containment reference list.
	 * @see codesinfos.CodesinfosPackage#getCodesinfosRootCodes_Codes()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='codes'"
	 * @generated
	 */
	EList<CodesinfosRootCodesItems> getCodes();

} // CodesinfosRootCodes
