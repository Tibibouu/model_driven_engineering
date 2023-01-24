/**
 */
package malary_Foezon_EcoreToDart.impl;

import java.util.Collection;

import malary_Foezon_EcoreToDart.Champ;
import malary_Foezon_EcoreToDart.Documents;
import malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage;

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
 * An implementation of the model object '<em><b>Documents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link malary_Foezon_EcoreToDart.impl.DocumentsImpl#getId <em>Id</em>}</li>
 *   <li>{@link malary_Foezon_EcoreToDart.impl.DocumentsImpl#getChamps <em>Champs</em>}</li>
 *   <li>{@link malary_Foezon_EcoreToDart.impl.DocumentsImpl#getCollections <em>Collections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentsImpl extends MinimalEObjectImpl.Container implements Documents {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChamps() <em>Champs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChamps()
	 * @generated
	 * @ordered
	 */
	protected EList<Champ> champs;

	/**
	 * The cached value of the '{@link #getCollections() <em>Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<malary_Foezon_EcoreToDart.Collection> collections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Malary_Foezon_EcoreToDartPackage.Literals.DOCUMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Malary_Foezon_EcoreToDartPackage.DOCUMENTS__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Champ> getChamps() {
		if (champs == null) {
			champs = new EObjectContainmentEList<Champ>(Champ.class, this,
					Malary_Foezon_EcoreToDartPackage.DOCUMENTS__CHAMPS);
		}
		return champs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<malary_Foezon_EcoreToDart.Collection> getCollections() {
		if (collections == null) {
			collections = new EObjectContainmentEList<malary_Foezon_EcoreToDart.Collection>(
					malary_Foezon_EcoreToDart.Collection.class, this,
					Malary_Foezon_EcoreToDartPackage.DOCUMENTS__COLLECTIONS);
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
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__CHAMPS:
			return ((InternalEList<?>) getChamps()).basicRemove(otherEnd, msgs);
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__COLLECTIONS:
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
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__ID:
			return getId();
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__CHAMPS:
			return getChamps();
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__COLLECTIONS:
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
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__ID:
			setId((String) newValue);
			return;
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__CHAMPS:
			getChamps().clear();
			getChamps().addAll((Collection<? extends Champ>) newValue);
			return;
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__COLLECTIONS:
			getCollections().clear();
			getCollections().addAll((Collection<? extends malary_Foezon_EcoreToDart.Collection>) newValue);
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
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__ID:
			setId(ID_EDEFAULT);
			return;
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__CHAMPS:
			getChamps().clear();
			return;
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__COLLECTIONS:
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
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__CHAMPS:
			return champs != null && !champs.isEmpty();
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS__COLLECTIONS:
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DocumentsImpl
