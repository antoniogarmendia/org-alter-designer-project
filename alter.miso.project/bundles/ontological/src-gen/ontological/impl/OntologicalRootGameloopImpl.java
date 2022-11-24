/**
 */
package ontological.impl;

import ontological.OntologicalPackage;
import ontological.OntologicalRootGameloop;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Gameloop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ontological.impl.OntologicalRootGameloopImpl#getGameloop <em>Gameloop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalRootGameloopImpl extends OntologicalRootPropertiesAbstractImpl implements OntologicalRootGameloop {
	/**
	 * The default value of the '{@link #getGameloop() <em>Gameloop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameloop()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GAMELOOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGameloop() <em>Gameloop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameloop()
	 * @generated
	 * @ordered
	 */
	protected Boolean gameloop = GAMELOOP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalRootGameloopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalPackage.Literals.ONTOLOGICAL_ROOT_GAMELOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getGameloop() {
		return gameloop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGameloop(Boolean newGameloop) {
		Boolean oldGameloop = gameloop;
		gameloop = newGameloop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalPackage.ONTOLOGICAL_ROOT_GAMELOOP__GAMELOOP, oldGameloop, gameloop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntologicalPackage.ONTOLOGICAL_ROOT_GAMELOOP__GAMELOOP:
				return getGameloop();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OntologicalPackage.ONTOLOGICAL_ROOT_GAMELOOP__GAMELOOP:
				setGameloop((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OntologicalPackage.ONTOLOGICAL_ROOT_GAMELOOP__GAMELOOP:
				setGameloop(GAMELOOP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OntologicalPackage.ONTOLOGICAL_ROOT_GAMELOOP__GAMELOOP:
				return GAMELOOP_EDEFAULT == null ? gameloop != null : !GAMELOOP_EDEFAULT.equals(gameloop);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (gameloop: ");
		result.append(gameloop);
		result.append(')');
		return result.toString();
	}

} //OntologicalRootGameloopImpl
