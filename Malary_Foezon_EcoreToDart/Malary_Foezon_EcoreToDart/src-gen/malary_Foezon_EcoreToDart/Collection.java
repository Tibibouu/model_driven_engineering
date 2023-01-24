/**
 */
package malary_Foezon_EcoreToDart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link malary_Foezon_EcoreToDart.Collection#getTitre <em>Titre</em>}</li>
 *   <li>{@link malary_Foezon_EcoreToDart.Collection#getDocuments <em>Documents</em>}</li>
 * </ul>
 *
 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends EObject {
	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage#getCollection_Titre()
	 * @model
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link malary_Foezon_EcoreToDart.Collection#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' containment reference list.
	 * The list contents are of type {@link malary_Foezon_EcoreToDart.Documents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' containment reference list.
	 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage#getCollection_Documents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Documents> getDocuments();

} // Collection
