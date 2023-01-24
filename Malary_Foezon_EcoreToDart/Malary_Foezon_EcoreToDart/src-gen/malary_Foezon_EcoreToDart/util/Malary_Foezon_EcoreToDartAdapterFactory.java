/**
 */
package malary_Foezon_EcoreToDart.util;

import malary_Foezon_EcoreToDart.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see malary_Foezon_EcoreToDart.Malary_Foezon_EcoreToDartPackage
 * @generated
 */
public class Malary_Foezon_EcoreToDartAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Malary_Foezon_EcoreToDartPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Malary_Foezon_EcoreToDartAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Malary_Foezon_EcoreToDartPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Malary_Foezon_EcoreToDartSwitch<Adapter> modelSwitch = new Malary_Foezon_EcoreToDartSwitch<Adapter>() {
		@Override
		public Adapter caseBDD(BDD object) {
			return createBDDAdapter();
		}

		@Override
		public Adapter caseCollection(Collection object) {
			return createCollectionAdapter();
		}

		@Override
		public Adapter caseDocuments(Documents object) {
			return createDocumentsAdapter();
		}

		@Override
		public Adapter caseChamp(Champ object) {
			return createChampAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link malary_Foezon_EcoreToDart.BDD <em>BDD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see malary_Foezon_EcoreToDart.BDD
	 * @generated
	 */
	public Adapter createBDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link malary_Foezon_EcoreToDart.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see malary_Foezon_EcoreToDart.Collection
	 * @generated
	 */
	public Adapter createCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link malary_Foezon_EcoreToDart.Documents <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see malary_Foezon_EcoreToDart.Documents
	 * @generated
	 */
	public Adapter createDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link malary_Foezon_EcoreToDart.Champ <em>Champ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see malary_Foezon_EcoreToDart.Champ
	 * @generated
	 */
	public Adapter createChampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Malary_Foezon_EcoreToDartAdapterFactory
