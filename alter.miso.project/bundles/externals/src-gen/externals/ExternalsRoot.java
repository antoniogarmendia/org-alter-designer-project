/**
 */
package externals;

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
 *   <li>{@link externals.ExternalsRoot#getExternalsRoot <em>Externals Root</em>}</li>
 *   <li>{@link externals.ExternalsRoot#getAPIDescriptions <em>API Descriptions</em>}</li>
 * </ul>
 *
 * @see externals.ExternalsPackage#getExternalsRoot()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface ExternalsRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Externals Root</b></em>' containment reference list.
	 * The list contents are of type {@link externals.ExternalsRootPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externals Root</em>' containment reference list.
	 * @see externals.ExternalsPackage#getExternalsRoot_ExternalsRoot()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalsRootPropertiesAbstract> getExternalsRoot();

	/**
	 * Returns the value of the '<em><b>API Descriptions</b></em>' reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>API Descriptions</em>' reference list.
	 * @see externals.ExternalsPackage#getExternalsRoot_APIDescriptions()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItems> getAPIDescriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // ExternalsRoot
