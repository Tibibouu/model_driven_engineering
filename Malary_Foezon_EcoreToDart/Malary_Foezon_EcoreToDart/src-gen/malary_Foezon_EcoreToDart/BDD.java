/**
 */
package malary_Foezon_EcoreToDart;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link malary_Foezon_EcoreToDart.BDD#getType <em>Type</em>}</li>
 *   <li>{@link malary_Foezon_EcoreToDart.BDD#getCollections <em>Collections</em>}</li>
 * </ul>
 *
 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage#getBDD()
 * @model
 * @generated
 */
public interface BDD extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link malary_Foezon_EcoreToDart.TypeBDD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see malary_Foezon_EcoreToDart.TypeBDD
	 * @see #setType(TypeBDD)
	 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage#getBDD_Type()
	 * @model
	 * @generated
	 */
	TypeBDD getType();

	/**
	 * Sets the value of the '{@link malary_Foezon_EcoreToDart.BDD#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see malary_Foezon_EcoreToDart.TypeBDD
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeBDD value);

	/**
	 * Returns the value of the '<em><b>Collections</b></em>' containment reference list.
	 * The list contents are of type {@link malary_Foezon_EcoreToDart.Collection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' containment reference list.
	 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage#getBDD_Collections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Collection> getCollections();

} // BDD
