/**
 */
package codesinfos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codesinfos.CodesinfosRoot#getCodesinfosRoot <em>Codesinfos Root</em>}</li>
 *   <li>{@link codesinfos.CodesinfosRoot#getName <em>Name</em>}</li>
 *   <li>{@link codesinfos.CodesinfosRoot#getCodes <em>Codes</em>}</li>
 * </ul>
 *
 * @see codesinfos.CodesinfosPackage#getCodesinfosRoot()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface CodesinfosRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Codesinfos Root</b></em>' containment reference list.
	 * The list contents are of type {@link codesinfos.CodesinfosRootPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codesinfos Root</em>' containment reference list.
	 * @see codesinfos.CodesinfosPackage#getCodesinfosRoot_CodesinfosRoot()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodesinfosRootPropertiesAbstract> getCodesinfosRoot();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see codesinfos.CodesinfosPackage#getCodesinfosRoot_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Codes</b></em>' reference list.
	 * The list contents are of type {@link codesinfos.CodesinfosRootCodesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codes</em>' reference list.
	 * @see codesinfos.CodesinfosPackage#getCodesinfosRoot_Codes()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<CodesinfosRootCodesItems> getCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // CodesinfosRoot
