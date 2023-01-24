/**
 */
package malary_Foezon_EcoreToDart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartFactory
 * @model kind="package"
 * @generated
 */
public interface Malary_Foezon_EcoreToDartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "malary_Foezon_EcoreToDart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/malary_Foezon_EcoreToDart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "malary_Foezon_EcoreToDart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Malary_Foezon_EcoreToDartPackage eINSTANCE = malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link malary_Foezon_EcoreToDart.impl.BDDImpl <em>BDD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see malary_Foezon_EcoreToDart.impl.BDDImpl
	 * @see malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl#getBDD()
	 * @generated
	 */
	int BDD = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD__COLLECTIONS = 1;

	/**
	 * The number of structural features of the '<em>BDD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BDD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link malary_Foezon_EcoreToDart.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see malary_Foezon_EcoreToDart.impl.CollectionImpl
	 * @see malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 1;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__DOCUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link malary_Foezon_EcoreToDart.impl.DocumentsImpl <em>Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see malary_Foezon_EcoreToDart.impl.DocumentsImpl
	 * @see malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl#getDocuments()
	 * @generated
	 */
	int DOCUMENTS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS__ID = 0;

	/**
	 * The feature id for the '<em><b>Champs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS__CHAMPS = 1;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS__COLLECTIONS = 2;

	/**
	 * The number of structural features of the '<em>Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link malary_Foezon_EcoreToDart.impl.ChampImpl <em>Champ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see malary_Foezon_EcoreToDart.impl.ChampImpl
	 * @see malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl#getChamp()
	 * @generated
	 */
	int CHAMP = 3;

	/**
	 * The feature id for the '<em><b>Champ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP__CHAMP = 0;

	/**
	 * The number of structural features of the '<em>Champ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Champ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link malary_Foezon_EcoreToDart.TypeBDD <em>Type BDD</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see malary_Foezon_EcoreToDart.TypeBDD
	 * @see malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl#getTypeBDD()
	 * @generated
	 */
	int TYPE_BDD = 4;

	/**
	 * The meta object id for the '{@link malary_Foezon_EcoreToDart.TypeChamp <em>Type Champ</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see malary_Foezon_EcoreToDart.TypeChamp
	 * @see malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl#getTypeChamp()
	 * @generated
	 */
	int TYPE_CHAMP = 5;

	/**
	 * Returns the meta object for class '{@link malary_Foezon_EcoreToDart.BDD <em>BDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BDD</em>'.
	 * @see malary_Foezon_EcoreToDart.BDD
	 * @generated
	 */
	EClass getBDD();

	/**
	 * Returns the meta object for the attribute '{@link malary_Foezon_EcoreToDart.BDD#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see malary_Foezon_EcoreToDart.BDD#getType()
	 * @see #getBDD()
	 * @generated
	 */
	EAttribute getBDD_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link malary_Foezon_EcoreToDart.BDD#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collections</em>'.
	 * @see malary_Foezon_EcoreToDart.BDD#getCollections()
	 * @see #getBDD()
	 * @generated
	 */
	EReference getBDD_Collections();

	/**
	 * Returns the meta object for class '{@link malary_Foezon_EcoreToDart.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see malary_Foezon_EcoreToDart.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the attribute '{@link malary_Foezon_EcoreToDart.Collection#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see malary_Foezon_EcoreToDart.Collection#getTitre()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Titre();

	/**
	 * Returns the meta object for the containment reference list '{@link malary_Foezon_EcoreToDart.Collection#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documents</em>'.
	 * @see malary_Foezon_EcoreToDart.Collection#getDocuments()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Documents();

	/**
	 * Returns the meta object for class '{@link malary_Foezon_EcoreToDart.Documents <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documents</em>'.
	 * @see malary_Foezon_EcoreToDart.Documents
	 * @generated
	 */
	EClass getDocuments();

	/**
	 * Returns the meta object for the attribute '{@link malary_Foezon_EcoreToDart.Documents#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see malary_Foezon_EcoreToDart.Documents#getId()
	 * @see #getDocuments()
	 * @generated
	 */
	EAttribute getDocuments_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link malary_Foezon_EcoreToDart.Documents#getChamps <em>Champs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Champs</em>'.
	 * @see malary_Foezon_EcoreToDart.Documents#getChamps()
	 * @see #getDocuments()
	 * @generated
	 */
	EReference getDocuments_Champs();

	/**
	 * Returns the meta object for the containment reference list '{@link malary_Foezon_EcoreToDart.Documents#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collections</em>'.
	 * @see malary_Foezon_EcoreToDart.Documents#getCollections()
	 * @see #getDocuments()
	 * @generated
	 */
	EReference getDocuments_Collections();

	/**
	 * Returns the meta object for class '{@link malary_Foezon_EcoreToDart.Champ <em>Champ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Champ</em>'.
	 * @see malary_Foezon_EcoreToDart.Champ
	 * @generated
	 */
	EClass getChamp();

	/**
	 * Returns the meta object for the attribute '{@link malary_Foezon_EcoreToDart.Champ#getChamp <em>Champ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Champ</em>'.
	 * @see malary_Foezon_EcoreToDart.Champ#getChamp()
	 * @see #getChamp()
	 * @generated
	 */
	EAttribute getChamp_Champ();

	/**
	 * Returns the meta object for enum '{@link malary_Foezon_EcoreToDart.TypeBDD <em>Type BDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type BDD</em>'.
	 * @see malary_Foezon_EcoreToDart.TypeBDD
	 * @generated
	 */
	EEnum getTypeBDD();

	/**
	 * Returns the meta object for enum '{@link malary_Foezon_EcoreToDart.TypeChamp <em>Type Champ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Champ</em>'.
	 * @see malary_Foezon_EcoreToDart.TypeChamp
	 * @generated
	 */
	EEnum getTypeChamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Malary_Foezon_EcoreToDartFactory getMalary_Foezon_EcoreToDartFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link malary_Foezon_EcoreToDart.impl.BDDImpl <em>BDD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see malary_Foezon_EcoreToDart.impl.BDDImpl
		 * @see malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl#getBDD()
		 * @generated
		 */
		EClass BDD = eINSTANCE.getBDD();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BDD__TYPE = eINSTANCE.getBDD_Type();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BDD__COLLECTIONS = eINSTANCE.getBDD_Collections();

		/**
		 * The meta object literal for the '{@link malary_Foezon_EcoreToDart.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see malary_Foezon_EcoreToDart.impl.CollectionImpl
		 * @see malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION__TITRE = eINSTANCE.getCollection_Titre();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__DOCUMENTS = eINSTANCE.getCollection_Documents();

		/**
		 * The meta object literal for the '{@link malary_Foezon_EcoreToDart.impl.DocumentsImpl <em>Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see malary_Foezon_EcoreToDart.impl.DocumentsImpl
		 * @see malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl#getDocuments()
		 * @generated
		 */
		EClass DOCUMENTS = eINSTANCE.getDocuments();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTS__ID = eINSTANCE.getDocuments_Id();

		/**
		 * The meta object literal for the '<em><b>Champs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTS__CHAMPS = eINSTANCE.getDocuments_Champs();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTS__COLLECTIONS = eINSTANCE.getDocuments_Collections();

		/**
		 * The meta object literal for the '{@link malary_Foezon_EcoreToDart.impl.ChampImpl <em>Champ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see malary_Foezon_EcoreToDart.impl.ChampImpl
		 * @see malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl#getChamp()
		 * @generated
		 */
		EClass CHAMP = eINSTANCE.getChamp();

		/**
		 * The meta object literal for the '<em><b>Champ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMP__CHAMP = eINSTANCE.getChamp_Champ();

		/**
		 * The meta object literal for the '{@link malary_Foezon_EcoreToDart.TypeBDD <em>Type BDD</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see malary_Foezon_EcoreToDart.TypeBDD
		 * @see malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl#getTypeBDD()
		 * @generated
		 */
		EEnum TYPE_BDD = eINSTANCE.getTypeBDD();

		/**
		 * The meta object literal for the '{@link malary_Foezon_EcoreToDart.TypeChamp <em>Type Champ</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see malary_Foezon_EcoreToDart.TypeChamp
		 * @see malary_Foezon_EcoreToDart.impl.Malary_Foezon_EcoreToDartPackageImpl#getTypeChamp()
		 * @generated
		 */
		EEnum TYPE_CHAMP = eINSTANCE.getTypeChamp();

	}

} //Malary_Foezon_EcoreToDartPackage
