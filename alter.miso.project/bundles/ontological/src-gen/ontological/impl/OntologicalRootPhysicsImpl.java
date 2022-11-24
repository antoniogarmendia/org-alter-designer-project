/**
 */
package ontological.impl;

import ontological.OntologicalPackage;
import ontological.OntologicalRootPhysics;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Physics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ontological.impl.OntologicalRootPhysicsImpl#getPhysics <em>Physics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalRootPhysicsImpl extends OntologicalRootPropertiesAbstractImpl implements OntologicalRootPhysics {
	/**
	 * The default value of the '{@link #getPhysics() <em>Physics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysics()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PHYSICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysics() <em>Physics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysics()
	 * @generated
	 * @ordered
	 */
	protected Boolean physics = PHYSICS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalRootPhysicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalPackage.Literals.ONTOLOGICAL_ROOT_PHYSICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPhysics() {
		return physics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysics(Boolean newPhysics) {
		Boolean oldPhysics = physics;
		physics = newPhysics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalPackage.ONTOLOGICAL_ROOT_PHYSICS__PHYSICS, oldPhysics, physics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntologicalPackage.ONTOLOGICAL_ROOT_PHYSICS__PHYSICS:
				return getPhysics();
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_PHYSICS__PHYSICS:
				setPhysics((Boolean)newValue);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_PHYSICS__PHYSICS:
				setPhysics(PHYSICS_EDEFAULT);
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
			case OntologicalPackage.ONTOLOGICAL_ROOT_PHYSICS__PHYSICS:
				return PHYSICS_EDEFAULT == null ? physics != null : !PHYSICS_EDEFAULT.equals(physics);
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
		result.append(" (physics: ");
		result.append(physics);
		result.append(')');
		return result.toString();
	}

} //OntologicalRootPhysicsImpl
