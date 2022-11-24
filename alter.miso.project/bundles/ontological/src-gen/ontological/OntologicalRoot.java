/**
 */
package ontological;

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
 *   <li>{@link ontological.OntologicalRoot#getOntologicalRoot <em>Ontological Root</em>}</li>
 *   <li>{@link ontological.OntologicalRoot#getName <em>Name</em>}</li>
 *   <li>{@link ontological.OntologicalRoot#getURI <em>URI</em>}</li>
 *   <li>{@link ontological.OntologicalRoot#getOnlyCodes <em>Only Codes</em>}</li>
 *   <li>{@link ontological.OntologicalRoot#getBluetooth <em>Bluetooth</em>}</li>
 *   <li>{@link ontological.OntologicalRoot#getExternal <em>External</em>}</li>
 *   <li>{@link ontological.OntologicalRoot#getFirebase <em>Firebase</em>}</li>
 *   <li>{@link ontological.OntologicalRoot#getPhysics <em>Physics</em>}</li>
 *   <li>{@link ontological.OntologicalRoot#getGameloop <em>Gameloop</em>}</li>
 *   <li>{@link ontological.OntologicalRoot#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see ontological.OntologicalPackage#getOntologicalRoot()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface OntologicalRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Ontological Root</b></em>' containment reference list.
	 * The list contents are of type {@link ontological.OntologicalRootPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontological Root</em>' containment reference list.
	 * @see ontological.OntologicalPackage#getOntologicalRoot_OntologicalRoot()
	 * @model containment="true"
	 * @generated
	 */
	EList<OntologicalRootPropertiesAbstract> getOntologicalRoot();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRoot_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRoot_URI()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getURI();

	/**
	 * Returns the value of the '<em><b>Only Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Codes</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRoot_OnlyCodes()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getOnlyCodes();

	/**
	 * Returns the value of the '<em><b>Bluetooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bluetooth</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRoot_Bluetooth()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getBluetooth();

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRoot_External()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getExternal();

	/**
	 * Returns the value of the '<em><b>Firebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firebase</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRoot_Firebase()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getFirebase();

	/**
	 * Returns the value of the '<em><b>Physics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physics</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRoot_Physics()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getPhysics();

	/**
	 * Returns the value of the '<em><b>Gameloop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameloop</em>' attribute.
	 * @see ontological.OntologicalPackage#getOntologicalRoot_Gameloop()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getGameloop();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link ontological.OntologicalRootClassesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see ontological.OntologicalPackage#getOntologicalRoot_Classes()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<OntologicalRootClassesItems> getClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // OntologicalRoot
