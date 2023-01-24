/**
 */
package malary_Foezon_EcoreToDart.impl;

import malary_Foezon_EcoreToDart.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Malary_Foezon_EcoreToDartFactoryImpl extends EFactoryImpl implements Malary_Foezon_EcoreToDartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Malary_Foezon_EcoreToDartFactory init() {
		try {
			Malary_Foezon_EcoreToDartFactory theMalary_Foezon_EcoreToDartFactory = (Malary_Foezon_EcoreToDartFactory) EPackage.Registry.INSTANCE
					.getEFactory(Malary_Foezon_EcoreToDartPackage.eNS_URI);
			if (theMalary_Foezon_EcoreToDartFactory != null) {
				return theMalary_Foezon_EcoreToDartFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Malary_Foezon_EcoreToDartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Malary_Foezon_EcoreToDartFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Malary_Foezon_EcoreToDartPackage.BDD:
			return createBDD();
		case Malary_Foezon_EcoreToDartPackage.COLLECTION:
			return createCollection();
		case Malary_Foezon_EcoreToDartPackage.DOCUMENTS:
			return createDocuments();
		case Malary_Foezon_EcoreToDartPackage.CHAMP:
			return createChamp();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Malary_Foezon_EcoreToDartPackage.TYPE_BDD:
			return createTypeBDDFromString(eDataType, initialValue);
		case Malary_Foezon_EcoreToDartPackage.TYPE_CHAMP:
			return createTypeChampFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Malary_Foezon_EcoreToDartPackage.TYPE_BDD:
			return convertTypeBDDToString(eDataType, instanceValue);
		case Malary_Foezon_EcoreToDartPackage.TYPE_CHAMP:
			return convertTypeChampToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDD createBDD() {
		BDDImpl bdd = new BDDImpl();
		return bdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection createCollection() {
		CollectionImpl collection = new CollectionImpl();
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documents createDocuments() {
		DocumentsImpl documents = new DocumentsImpl();
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Champ createChamp() {
		ChampImpl champ = new ChampImpl();
		return champ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeBDD createTypeBDDFromString(EDataType eDataType, String initialValue) {
		TypeBDD result = TypeBDD.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeBDDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeChamp createTypeChampFromString(EDataType eDataType, String initialValue) {
		TypeChamp result = TypeChamp.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeChampToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Malary_Foezon_EcoreToDartPackage getMalary_Foezon_EcoreToDartPackage() {
		return (Malary_Foezon_EcoreToDartPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Malary_Foezon_EcoreToDartPackage getPackage() {
		return Malary_Foezon_EcoreToDartPackage.eINSTANCE;
	}

} //Malary_Foezon_EcoreToDartFactoryImpl
