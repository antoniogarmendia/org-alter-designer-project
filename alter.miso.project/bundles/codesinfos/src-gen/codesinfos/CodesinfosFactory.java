/**
 */
package codesinfos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see codesinfos.CodesinfosPackage
 * @generated
 */
public interface CodesinfosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodesinfosFactory eINSTANCE = codesinfos.impl.CodesinfosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	CodesinfosRoot createCodesinfosRoot();

	/**
	 * Returns a new object of class '<em>Root Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Name</em>'.
	 * @generated
	 */
	CodesinfosRootName createCodesinfosRootName();

	/**
	 * Returns a new object of class '<em>Root Codes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Codes</em>'.
	 * @generated
	 */
	CodesinfosRootCodes createCodesinfosRootCodes();

	/**
	 * Returns a new object of class '<em>Root Codes Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Codes Items</em>'.
	 * @generated
	 */
	CodesinfosRootCodesItems createCodesinfosRootCodesItems();

	/**
	 * Returns a new object of class '<em>Root Codes Items Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Codes Items Name</em>'.
	 * @generated
	 */
	CodesinfosRootCodesItemsName createCodesinfosRootCodesItemsName();

	/**
	 * Returns a new object of class '<em>Root Codes Items Classname</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Codes Items Classname</em>'.
	 * @generated
	 */
	CodesinfosRootCodesItemsClassname createCodesinfosRootCodesItemsClassname();

	/**
	 * Returns a new object of class '<em>Root Codes Items Nodename</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Codes Items Nodename</em>'.
	 * @generated
	 */
	CodesinfosRootCodesItemsNodename createCodesinfosRootCodesItemsNodename();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodesinfosPackage getCodesinfosPackage();

} //CodesinfosFactory
