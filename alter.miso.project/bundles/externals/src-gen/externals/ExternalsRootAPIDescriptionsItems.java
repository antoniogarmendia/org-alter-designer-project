/**
 */
package externals;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root API Descriptions Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItems#getItems <em>Items</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItems#getName <em>Name</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItems#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItems#getUrl <em>Url</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItems#getPaths <em>Paths</em>}</li>
 *   <li>{@link externals.ExternalsRootAPIDescriptionsItems#getAPIAuth <em>API Auth</em>}</li>
 * </ul>
 *
 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface ExternalsRootAPIDescriptionsItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItems_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItems_Protocol()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItems_Url()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsPathsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItems_Paths()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsPathsItems> getPaths();

	/**
	 * Returns the value of the '<em><b>API Auth</b></em>' reference list.
	 * The list contents are of type {@link externals.ExternalsRootAPIDescriptionsItemsAPIAuthItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>API Auth</em>' reference list.
	 * @see externals.ExternalsPackage#getExternalsRootAPIDescriptionsItems_APIAuth()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<ExternalsRootAPIDescriptionsItemsAPIAuthItems> getAPIAuth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // ExternalsRootAPIDescriptionsItems
