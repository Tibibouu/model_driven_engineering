/**
 */
package malary_Foezon_EcoreToDart.impl;

import malary_Foezon_EcoreToDart.BDD;
import malary_Foezon_EcoreToDart.Collection;
import malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage;
import malary_Foezon_EcoreToDart.TypeBDD;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BDD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link malary_Foezon_EcoreToDart.impl.BDDImpl#getType <em>Type</em>}</li>
 *   <li>{@link malary_Foezon_EcoreToDart.impl.BDDImpl#getCollections <em>Collections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BDDImpl extends MinimalEObjectImpl.Container implements BDD {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeBDD TYPE_EDEFAULT = TypeBDD.FIREBASE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeBDD type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCollections() <em>Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<Collection> collections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Malary_Foezon_EcoreToDartPackage.Literals.BDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeBDD getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeBDD newType) {
		TypeBDD oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Malary_Foezon_EcoreToDartPackage.BDD__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collection> getCollections() {
		if (collections == null) {
			collections = new EObjectContainmentEList<Collection>(Collection.class, this,
					Malary_Foezon_EcoreToDartPackage.BDD__COLLECTIONS);
		}
		return collections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Malary_Foezon_EcoreToDartPackage.BDD__COLLECTIONS:
			return ((InternalEList<?>) getCollections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Malary_Foezon_EcoreToDartPackage.BDD__TYPE:
			return getType();
		case Malary_Foezon_EcoreToDartPackage.BDD__COLLECTIONS:
			return getCollections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Malary_Foezon_EcoreToDartPackage.BDD__TYPE:
			setType((TypeBDD) newValue);
			return;
		case Malary_Foezon_EcoreToDartPackage.BDD__COLLECTIONS:
			getCollections().clear();
			getCollections().addAll((java.util.Collection<? extends Collection>) newValue);
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
		case Malary_Foezon_EcoreToDartPackage.BDD__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Malary_Foezon_EcoreToDartPackage.BDD__COLLECTIONS:
			getCollections().clear();
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
		case Malary_Foezon_EcoreToDartPackage.BDD__TYPE:
			return type != TYPE_EDEFAULT;
		case Malary_Foezon_EcoreToDartPackage.BDD__COLLECTIONS:
			return collections != null && !collections.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //BDDImpl
