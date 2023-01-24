/**
 */
package malary_Foezon_EcoreToDart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage
 * @generated
 */
public interface Malary_Foezon_EcoreToDartFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Malary_Foezon_EcoreToDartFactory eINSTANCE = malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>BDD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BDD</em>'.
	 * @generated
	 */
	BDD createBDD();

	/**
	 * Returns a new object of class '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection</em>'.
	 * @generated
	 */
	Collection createCollection();

	/**
	 * Returns a new object of class '<em>Documents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documents</em>'.
	 * @generated
	 */
	Documents createDocuments();

	/**
	 * Returns a new object of class '<em>Champ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Champ</em>'.
	 * @generated
	 */
	Champ createChamp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Malary_Foezon_EcoreToDartPackage getMalary_Foezon_EcoreToDartPackage();

} //Malary_Foezon_EcoreToDartFactory
