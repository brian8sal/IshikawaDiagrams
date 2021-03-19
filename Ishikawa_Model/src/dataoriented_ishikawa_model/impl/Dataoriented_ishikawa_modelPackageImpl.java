/**
 */
package dataoriented_ishikawa_model.impl;

import dataoriented_ishikawa_model.AttributeFilter;
import dataoriented_ishikawa_model.Category;
import dataoriented_ishikawa_model.Cause;
import dataoriented_ishikawa_model.CompoundCause;
import dataoriented_ishikawa_model.DataFeeder;
import dataoriented_ishikawa_model.DataLinkedCause;
import dataoriented_ishikawa_model.Dataoriented_ishikawa_modelFactory;
import dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage;
import dataoriented_ishikawa_model.Effect;
import dataoriented_ishikawa_model.IncludedReference;
import dataoriented_ishikawa_model.NotMappedCause;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dataoriented_ishikawa_modelPackageImpl extends EPackageImpl implements Dataoriented_ishikawa_modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundCauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLinkedCauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notMappedCauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includedReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dofEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFeederEClass = null;

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
	 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Dataoriented_ishikawa_modelPackageImpl() {
		super(eNS_URI, Dataoriented_ishikawa_modelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Dataoriented_ishikawa_modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Dataoriented_ishikawa_modelPackage init() {
		if (isInited) return (Dataoriented_ishikawa_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Dataoriented_ishikawa_modelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataoriented_ishikawa_modelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Dataoriented_ishikawa_modelPackageImpl theDataoriented_ishikawa_modelPackage = registeredDataoriented_ishikawa_modelPackage instanceof Dataoriented_ishikawa_modelPackageImpl ? (Dataoriented_ishikawa_modelPackageImpl)registeredDataoriented_ishikawa_modelPackage : new Dataoriented_ishikawa_modelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDataoriented_ishikawa_modelPackage.createPackageContents();

		// Initialize created meta-data
		theDataoriented_ishikawa_modelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataoriented_ishikawa_modelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Dataoriented_ishikawa_modelPackage.eNS_URI, theDataoriented_ishikawa_modelPackage);
		return theDataoriented_ishikawa_modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffect() {
		return effectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Name() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffect_Categories() {
		return (EReference)effectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffect_DataFeeder() {
		return (EReference)effectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_Name() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Causes() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCause() {
		return causeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCause_Name() {
		return (EAttribute)causeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCause_Realizes() {
		return (EAttribute)causeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundCause() {
		return compoundCauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundCause_SubCauses() {
		return (EReference)compoundCauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataLinkedCause() {
		return dataLinkedCauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLinkedCause_DataFeeder() {
		return (EReference)dataLinkedCauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotMappedCause() {
		return notMappedCauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeFilter() {
		return attributeFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludedReference() {
		return includedReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDOF() {
		return dofEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOF_Effect() {
		return (EReference)dofEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFeeder() {
		return dataFeederEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFeeder_DomainElementSelector() {
		return (EAttribute)dataFeederEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFeeder_IncludedReference() {
		return (EReference)dataFeederEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFeeder_Attributefilter() {
		return (EReference)dataFeederEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFeeder_Name() {
		return (EAttribute)dataFeederEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataoriented_ishikawa_modelFactory getDataoriented_ishikawa_modelFactory() {
		return (Dataoriented_ishikawa_modelFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		effectEClass = createEClass(EFFECT);
		createEAttribute(effectEClass, EFFECT__NAME);
		createEReference(effectEClass, EFFECT__CATEGORIES);
		createEReference(effectEClass, EFFECT__DATA_FEEDER);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__NAME);
		createEReference(categoryEClass, CATEGORY__CAUSES);

		causeEClass = createEClass(CAUSE);
		createEAttribute(causeEClass, CAUSE__NAME);
		createEAttribute(causeEClass, CAUSE__REALIZES);

		compoundCauseEClass = createEClass(COMPOUND_CAUSE);
		createEReference(compoundCauseEClass, COMPOUND_CAUSE__SUB_CAUSES);

		dataLinkedCauseEClass = createEClass(DATA_LINKED_CAUSE);
		createEReference(dataLinkedCauseEClass, DATA_LINKED_CAUSE__DATA_FEEDER);

		notMappedCauseEClass = createEClass(NOT_MAPPED_CAUSE);

		attributeFilterEClass = createEClass(ATTRIBUTE_FILTER);

		includedReferenceEClass = createEClass(INCLUDED_REFERENCE);

		dofEClass = createEClass(DOF);
		createEReference(dofEClass, DOF__EFFECT);

		dataFeederEClass = createEClass(DATA_FEEDER);
		createEAttribute(dataFeederEClass, DATA_FEEDER__DOMAIN_ELEMENT_SELECTOR);
		createEReference(dataFeederEClass, DATA_FEEDER__INCLUDED_REFERENCE);
		createEReference(dataFeederEClass, DATA_FEEDER__ATTRIBUTEFILTER);
		createEAttribute(dataFeederEClass, DATA_FEEDER__NAME);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compoundCauseEClass.getESuperTypes().add(this.getCause());
		dataLinkedCauseEClass.getESuperTypes().add(this.getCause());
		notMappedCauseEClass.getESuperTypes().add(this.getCause());

		// Initialize classes, features, and operations; add parameters
		initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEffect_Name(), ecorePackage.getEString(), "name", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffect_Categories(), this.getCategory(), null, "categories", null, 1, -1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffect_DataFeeder(), this.getDataFeeder(), null, "dataFeeder", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Causes(), this.getCause(), null, "causes", null, 1, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(causeEClass, Cause.class, "Cause", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCause_Name(), ecorePackage.getEString(), "name", null, 0, 1, Cause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCause_Realizes(), ecorePackage.getEString(), "realizes", null, 0, 1, Cause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundCauseEClass, CompoundCause.class, "CompoundCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundCause_SubCauses(), this.getCause(), null, "subCauses", null, 1, -1, CompoundCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataLinkedCauseEClass, DataLinkedCause.class, "DataLinkedCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataLinkedCause_DataFeeder(), this.getDataFeeder(), null, "dataFeeder", null, 1, 1, DataLinkedCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notMappedCauseEClass, NotMappedCause.class, "NotMappedCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeFilterEClass, AttributeFilter.class, "AttributeFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(includedReferenceEClass, IncludedReference.class, "IncludedReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dofEClass, dataoriented_ishikawa_model.DOF.class, "DOF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDOF_Effect(), this.getEffect(), null, "effect", null, 1, 1, dataoriented_ishikawa_model.DOF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFeederEClass, DataFeeder.class, "DataFeeder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFeeder_DomainElementSelector(), ecorePackage.getEString(), "domainElementSelector", null, 0, 1, DataFeeder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFeeder_IncludedReference(), this.getIncludedReference(), null, "includedReference", null, 0, -1, DataFeeder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFeeder_Attributefilter(), this.getAttributeFilter(), null, "attributefilter", null, 0, 1, DataFeeder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFeeder_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataFeeder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Dataoriented_ishikawa_modelPackageImpl
