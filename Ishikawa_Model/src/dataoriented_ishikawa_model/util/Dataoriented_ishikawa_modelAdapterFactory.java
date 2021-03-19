/**
 */
package dataoriented_ishikawa_model.util;

import dataoriented_ishikawa_model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage
 * @generated
 */
public class Dataoriented_ishikawa_modelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dataoriented_ishikawa_modelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataoriented_ishikawa_modelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Dataoriented_ishikawa_modelPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dataoriented_ishikawa_modelSwitch<Adapter> modelSwitch =
		new Dataoriented_ishikawa_modelSwitch<Adapter>() {
			@Override
			public Adapter caseEffect(Effect object) {
				return createEffectAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseCause(Cause object) {
				return createCauseAdapter();
			}
			@Override
			public Adapter caseCompoundCause(CompoundCause object) {
				return createCompoundCauseAdapter();
			}
			@Override
			public Adapter caseDataLinkedCause(DataLinkedCause object) {
				return createDataLinkedCauseAdapter();
			}
			@Override
			public Adapter caseNotMappedCause(NotMappedCause object) {
				return createNotMappedCauseAdapter();
			}
			@Override
			public Adapter caseAttributeFilter(AttributeFilter object) {
				return createAttributeFilterAdapter();
			}
			@Override
			public Adapter caseIncludedReference(IncludedReference object) {
				return createIncludedReferenceAdapter();
			}
			@Override
			public Adapter caseDOF(DOF object) {
				return createDOFAdapter();
			}
			@Override
			public Adapter caseDataFeeder(DataFeeder object) {
				return createDataFeederAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dataoriented_ishikawa_model.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataoriented_ishikawa_model.Effect
	 * @generated
	 */
	public Adapter createEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataoriented_ishikawa_model.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataoriented_ishikawa_model.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataoriented_ishikawa_model.Cause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataoriented_ishikawa_model.Cause
	 * @generated
	 */
	public Adapter createCauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataoriented_ishikawa_model.CompoundCause <em>Compound Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataoriented_ishikawa_model.CompoundCause
	 * @generated
	 */
	public Adapter createCompoundCauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataoriented_ishikawa_model.DataLinkedCause <em>Data Linked Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataoriented_ishikawa_model.DataLinkedCause
	 * @generated
	 */
	public Adapter createDataLinkedCauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataoriented_ishikawa_model.NotMappedCause <em>Not Mapped Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataoriented_ishikawa_model.NotMappedCause
	 * @generated
	 */
	public Adapter createNotMappedCauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataoriented_ishikawa_model.AttributeFilter <em>Attribute Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataoriented_ishikawa_model.AttributeFilter
	 * @generated
	 */
	public Adapter createAttributeFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataoriented_ishikawa_model.IncludedReference <em>Included Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataoriented_ishikawa_model.IncludedReference
	 * @generated
	 */
	public Adapter createIncludedReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataoriented_ishikawa_model.DOF <em>DOF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataoriented_ishikawa_model.DOF
	 * @generated
	 */
	public Adapter createDOFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataoriented_ishikawa_model.DataFeeder <em>Data Feeder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataoriented_ishikawa_model.DataFeeder
	 * @generated
	 */
	public Adapter createDataFeederAdapter() {
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

} //Dataoriented_ishikawa_modelAdapterFactory
