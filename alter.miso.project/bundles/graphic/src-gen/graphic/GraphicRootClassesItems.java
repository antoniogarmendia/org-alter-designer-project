/**
 */
package graphic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Classes Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic.GraphicRootClassesItems#getItems <em>Items</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItems#getName <em>Name</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItems#getVersions <em>Versions</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItems#getVname <em>Vname</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItems#getShowAttributes <em>Show Attributes</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItems#getMaterialAttributes <em>Material Attributes</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItems#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link graphic.GraphicRootClassesItems#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see graphic.GraphicPackage#getGraphicRootClassesItems()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface GraphicRootClassesItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link graphic.GraphicRootClassesItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphicRootClassesItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItems_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' reference.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItems_Versions()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GraphicRootClassesItemsVersions getVersions();

	/**
	 * Returns the value of the '<em><b>Vname</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vname</em>' reference.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItems_Vname()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GraphicRootClassesItemsVname getVname();

	/**
	 * Returns the value of the '<em><b>Show Attributes</b></em>' reference list.
	 * The list contents are of type {@link graphic.GraphicRootClassesItemsShowAttributesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Attributes</em>' reference list.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItems_ShowAttributes()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<GraphicRootClassesItemsShowAttributesItems> getShowAttributes();

	/**
	 * Returns the value of the '<em><b>Material Attributes</b></em>' reference list.
	 * The list contents are of type {@link graphic.GraphicRootClassesItemsMaterialAttributesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Attributes</em>' reference list.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItems_MaterialAttributes()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<GraphicRootClassesItemsMaterialAttributesItems> getMaterialAttributes();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItems_Constraints()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GraphicRootClassesItemsConstraints getConstraints();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link graphic.GraphicRootClassesItemsConnectionsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see graphic.GraphicPackage#getGraphicRootClassesItems_Connections()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<GraphicRootClassesItemsConnectionsItems> getConnections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GraphicRootClassesItems
