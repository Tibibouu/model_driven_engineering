/**
 */
package malary_Foezon_EcoreToDart.impl;

import malary_Foezon_EcoreToDart.Champ;
import malary_Foezon_EcoreToDart.Collection;
import malary_Foezon_EcoreToDart.Documents;
import malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartFactory;
import malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage;
import malary_Foezon_EcoreToDart.TypeBDD;

import malary_Foezon_EcoreToDart.TypeChamp;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Malary_Foezon_EcoreToDartPackageImpl extends EPackageImpl implements Malary_Foezon_EcoreToDartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass champEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeBDDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeChampEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Malary_Foezon_EcoreToDartPackageImpl() {
		super(eNS_URI, Malary_Foezon_EcoreToDartFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Malary_Foezon_EcoreToDartPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Malary_Foezon_EcoreToDartPackage init() {
		if (isInited)
			return (Malary_Foezon_EcoreToDartPackage) EPackage.Registry.INSTANCE
					.getEPackage(Malary_Foezon_EcoreToDartPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMalary_Foezon_EcoreToDartPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Malary_Foezon_EcoreToDartPackageImpl theMalary_Foezon_EcoreToDartPackage = registeredMalary_Foezon_EcoreToDartPackage instanceof Malary_Foezon_EcoreToDartPackageImpl
				? (Malary_Foezon_EcoreToDartPackageImpl) registeredMalary_Foezon_EcoreToDartPackage
				: new Malary_Foezon_EcoreToDartPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMalary_Foezon_EcoreToDartPackage.createPackageContents();

		// Initialize created meta-data
		theMalary_Foezon_EcoreToDartPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMalary_Foezon_EcoreToDartPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Malary_Foezon_EcoreToDartPackage.eNS_URI, theMalary_Foezon_EcoreToDartPackage);
		return theMalary_Foezon_EcoreToDartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBDD() {
		return bddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBDD_Type() {
		return (EAttribute) bddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBDD_Collections() {
		return (EReference) bddEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollection() {
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Titre() {
		return (EAttribute) collectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Documents() {
		return (EReference) collectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocuments() {
		return documentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocuments_Id() {
		return (EAttribute) documentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocuments_Champs() {
		return (EReference) documentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocuments_Collections() {
		return (EReference) documentsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChamp() {
		return champEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChamp_Champ() {
		return (EAttribute) champEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeBDD() {
		return typeBDDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeChamp() {
		return typeChampEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Malary_Foezon_EcoreToDartFactory getMalary_Foezon_EcoreToDartFactory() {
		return (Malary_Foezon_EcoreToDartFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		bddEClass = createEClass(BDD);
		createEAttribute(bddEClass, BDD__TYPE);
		createEReference(bddEClass, BDD__COLLECTIONS);

		collectionEClass = createEClass(COLLECTION);
		createEAttribute(collectionEClass, COLLECTION__TITRE);
		createEReference(collectionEClass, COLLECTION__DOCUMENTS);

		documentsEClass = createEClass(DOCUMENTS);
		createEAttribute(documentsEClass, DOCUMENTS__ID);
		createEReference(documentsEClass, DOCUMENTS__CHAMPS);
		createEReference(documentsEClass, DOCUMENTS__COLLECTIONS);

		champEClass = createEClass(CHAMP);
		createEAttribute(champEClass, CHAMP__CHAMP);

		// Create enums
		typeBDDEEnum = createEEnum(TYPE_BDD);
		typeChampEEnum = createEEnum(TYPE_CHAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(bddEClass, malary_Foezon_EcoreToDart.BDD.class, "BDD", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBDD_Type(), this.getTypeBDD(), "type", null, 0, 1, malary_Foezon_EcoreToDart.BDD.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBDD_Collections(), this.getCollection(), null, "collections", null, 0, -1,
				malary_Foezon_EcoreToDart.BDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionEClass, Collection.class, "Collection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollection_Titre(), ecorePackage.getEString(), "titre", null, 0, 1, Collection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollection_Documents(), this.getDocuments(), null, "documents", null, 0, -1, Collection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentsEClass, Documents.class, "Documents", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocuments_Id(), ecorePackage.getEString(), "id", null, 0, 1, Documents.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocuments_Champs(), this.getChamp(), null, "champs", null, 0, -1, Documents.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocuments_Collections(), this.getCollection(), null, "collections", null, 0, -1,
				Documents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(champEClass, Champ.class, "Champ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChamp_Champ(), this.getTypeChamp(), "champ", null, 0, 1, Champ.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeBDDEEnum, TypeBDD.class, "TypeBDD");
		addEEnumLiteral(typeBDDEEnum, TypeBDD.FIREBASE);

		initEEnum(typeChampEEnum, TypeChamp.class, "TypeChamp");
		addEEnumLiteral(typeChampEEnum, TypeChamp.STRING);
		addEEnumLiteral(typeChampEEnum, TypeChamp.BOOLEAN);
		addEEnumLiteral(typeChampEEnum, TypeChamp.MAP);
		addEEnumLiteral(typeChampEEnum, TypeChamp.ARRAY);
		addEEnumLiteral(typeChampEEnum, TypeChamp.NULL);
		addEEnumLiteral(typeChampEEnum, TypeChamp.TIMESTAMP);
		addEEnumLiteral(typeChampEEnum, TypeChamp.GEOPOINT);
		addEEnumLiteral(typeChampEEnum, TypeChamp.REFERENCE);
		addEEnumLiteral(typeChampEEnum, TypeChamp.NUMBER);

		// Create resource
		createResource(eNS_URI);
	}

} //Malary_Foezon_EcoreToDartPackageImpl
