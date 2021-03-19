/**
 */
package dataoriented_ishikawa_model.impl;

import dataoriented_ishikawa_model.*;

import org.eclipse.emf.ecore.EClass;
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
public class Dataoriented_ishikawa_modelFactoryImpl extends EFactoryImpl implements Dataoriented_ishikawa_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Dataoriented_ishikawa_modelFactory init() {
		try {
			Dataoriented_ishikawa_modelFactory theDataoriented_ishikawa_modelFactory = (Dataoriented_ishikawa_modelFactory)EPackage.Registry.INSTANCE.getEFactory(Dataoriented_ishikawa_modelPackage.eNS_URI);
			if (theDataoriented_ishikawa_modelFactory != null) {
				return theDataoriented_ishikawa_modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Dataoriented_ishikawa_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataoriented_ishikawa_modelFactoryImpl() {
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
			case Dataoriented_ishikawa_modelPackage.EFFECT: return createEffect();
			case Dataoriented_ishikawa_modelPackage.CATEGORY: return createCategory();
			case Dataoriented_ishikawa_modelPackage.COMPOUND_CAUSE: return createCompoundCause();
			case Dataoriented_ishikawa_modelPackage.DATA_LINKED_CAUSE: return createDataLinkedCause();
			case Dataoriented_ishikawa_modelPackage.NOT_MAPPED_CAUSE: return createNotMappedCause();
			case Dataoriented_ishikawa_modelPackage.ATTRIBUTE_FILTER: return createAttributeFilter();
			case Dataoriented_ishikawa_modelPackage.INCLUDED_REFERENCE: return createIncludedReference();
			case Dataoriented_ishikawa_modelPackage.DOF: return createDOF();
			case Dataoriented_ishikawa_modelPackage.DATA_FEEDER: return createDataFeeder();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effect createEffect() {
		EffectImpl effect = new EffectImpl();
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundCause createCompoundCause() {
		CompoundCauseImpl compoundCause = new CompoundCauseImpl();
		return compoundCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLinkedCause createDataLinkedCause() {
		DataLinkedCauseImpl dataLinkedCause = new DataLinkedCauseImpl();
		return dataLinkedCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotMappedCause createNotMappedCause() {
		NotMappedCauseImpl notMappedCause = new NotMappedCauseImpl();
		return notMappedCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeFilter createAttributeFilter() {
		AttributeFilterImpl attributeFilter = new AttributeFilterImpl();
		return attributeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludedReference createIncludedReference() {
		IncludedReferenceImpl includedReference = new IncludedReferenceImpl();
		return includedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOF createDOF() {
		DOFImpl dof = new DOFImpl();
		return dof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFeeder createDataFeeder() {
		DataFeederImpl dataFeeder = new DataFeederImpl();
		return dataFeeder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataoriented_ishikawa_modelPackage getDataoriented_ishikawa_modelPackage() {
		return (Dataoriented_ishikawa_modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Dataoriented_ishikawa_modelPackage getPackage() {
		return Dataoriented_ishikawa_modelPackage.eINSTANCE;
	}

} //Dataoriented_ishikawa_modelFactoryImpl
