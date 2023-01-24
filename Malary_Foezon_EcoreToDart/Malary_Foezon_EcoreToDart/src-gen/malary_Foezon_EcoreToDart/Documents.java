/**
 */
package malary_Foezon_EcoreToDart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link malary_Foezon_EcoreToDart.Documents#getId <em>Id</em>}</li>
 *   <li>{@link malary_Foezon_EcoreToDart.Documents#getChamps <em>Champs</em>}</li>
 *   <li>{@link malary_Foezon_EcoreToDart.Documents#getCollections <em>Collections</em>}</li>
 * </ul>
 *
 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage#getDocuments()
 * @model
 * @generated
 */
public interface Documents extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage#getDocuments_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link malary_Foezon_EcoreToDart.Documents#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Champs</b></em>' containment reference list.
	 * The list contents are of type {@link malary_Foezon_EcoreToDart.Champ}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champs</em>' containment reference list.
	 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage#getDocuments_Champs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Champ> getChamps();

	/**
	 * Returns the value of the '<em><b>Collections</b></em>' containment reference list.
	 * The list contents are of type {@link malary_Foezon_EcoreToDart.Collection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' containment reference list.
	 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage#getDocuments_Collections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Collection> getCollections();

} // Documents
