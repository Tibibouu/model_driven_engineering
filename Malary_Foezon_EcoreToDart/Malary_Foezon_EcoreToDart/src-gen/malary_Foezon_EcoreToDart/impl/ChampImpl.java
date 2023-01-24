/**
 */
package malary_Foezon_EcoreToDart.impl;

import malary_Foezon_EcoreToDart.Champ;
import malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage;
import malary_Foezon_EcoreToDart.TypeChamp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Champ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link malary_Foezon_EcoreToDart.impl.ChampImpl#getChamp <em>Champ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChampImpl extends MinimalEObjectImpl.Container implements Champ {
	/**
	 * The default value of the '{@link #getChamp() <em>Champ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChamp()
	 * @generated
	 * @ordered
	 */
	protected static final TypeChamp CHAMP_EDEFAULT = TypeChamp.STRING;

	/**
	 * The cached value of the '{@link #getChamp() <em>Champ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChamp()
	 * @generated
	 * @ordered
	 */
	protected TypeChamp champ = CHAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Malary_Foezon_EcoreToDartPackage.Literals.CHAMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeChamp getChamp() {
		return champ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChamp(TypeChamp newChamp) {
		TypeChamp oldChamp = champ;
		champ = newChamp == null ? CHAMP_EDEFAULT : newChamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Malary_Foezon_EcoreToDartPackage.CHAMP__CHAMP,
					oldChamp, champ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Malary_Foezon_EcoreToDartPackage.CHAMP__CHAMP:
			return getChamp();
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
		case Malary_Foezon_EcoreToDartPackage.CHAMP__CHAMP:
			setChamp((TypeChamp) newValue);
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
		case Malary_Foezon_EcoreToDartPackage.CHAMP__CHAMP:
			setChamp(CHAMP_EDEFAULT);
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
		case Malary_Foezon_EcoreToDartPackage.CHAMP__CHAMP:
			return champ != CHAMP_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (champ: ");
		result.append(champ);
		result.append(')');
		return result.toString();
	}

} //ChampImpl
