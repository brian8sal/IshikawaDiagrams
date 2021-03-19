/**
 */
package dataoriented_ishikawa_model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Dataoriented_ishikawa_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataoriented_ishikawa_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dataoriented_ishikawa_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataoriented_ishikawa_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dataoriented_ishikawa_modelPackage eINSTANCE = dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link dataoriented_ishikawa_model.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataoriented_ishikawa_model.impl.EffectImpl
	 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__CATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Data Feeder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DATA_FEEDER = 2;

	/**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataoriented_ishikawa_model.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataoriented_ishikawa_model.impl.CategoryImpl
	 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Causes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CAUSES = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataoriented_ishikawa_model.impl.CauseImpl <em>Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataoriented_ishikawa_model.impl.CauseImpl
	 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getCause()
	 * @generated
	 */
	int CAUSE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__REALIZES = 1;

	/**
	 * The number of structural features of the '<em>Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataoriented_ishikawa_model.impl.CompoundCauseImpl <em>Compound Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataoriented_ishikawa_model.impl.CompoundCauseImpl
	 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getCompoundCause()
	 * @generated
	 */
	int COMPOUND_CAUSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_CAUSE__NAME = CAUSE__NAME;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_CAUSE__REALIZES = CAUSE__REALIZES;

	/**
	 * The feature id for the '<em><b>Sub Causes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_CAUSE__SUB_CAUSES = CAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_CAUSE_FEATURE_COUNT = CAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compound Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_CAUSE_OPERATION_COUNT = CAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataoriented_ishikawa_model.impl.DataLinkedCauseImpl <em>Data Linked Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataoriented_ishikawa_model.impl.DataLinkedCauseImpl
	 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getDataLinkedCause()
	 * @generated
	 */
	int DATA_LINKED_CAUSE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINKED_CAUSE__NAME = CAUSE__NAME;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINKED_CAUSE__REALIZES = CAUSE__REALIZES;

	/**
	 * The feature id for the '<em><b>Data Feeder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINKED_CAUSE__DATA_FEEDER = CAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Linked Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINKED_CAUSE_FEATURE_COUNT = CAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Linked Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINKED_CAUSE_OPERATION_COUNT = CAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataoriented_ishikawa_model.impl.NotMappedCauseImpl <em>Not Mapped Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataoriented_ishikawa_model.impl.NotMappedCauseImpl
	 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getNotMappedCause()
	 * @generated
	 */
	int NOT_MAPPED_CAUSE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_MAPPED_CAUSE__NAME = CAUSE__NAME;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_MAPPED_CAUSE__REALIZES = CAUSE__REALIZES;

	/**
	 * The number of structural features of the '<em>Not Mapped Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_MAPPED_CAUSE_FEATURE_COUNT = CAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Mapped Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_MAPPED_CAUSE_OPERATION_COUNT = CAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataoriented_ishikawa_model.impl.AttributeFilterImpl <em>Attribute Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataoriented_ishikawa_model.impl.AttributeFilterImpl
	 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getAttributeFilter()
	 * @generated
	 */
	int ATTRIBUTE_FILTER = 6;

	/**
	 * The number of structural features of the '<em>Attribute Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FILTER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attribute Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataoriented_ishikawa_model.impl.IncludedReferenceImpl <em>Included Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataoriented_ishikawa_model.impl.IncludedReferenceImpl
	 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getIncludedReference()
	 * @generated
	 */
	int INCLUDED_REFERENCE = 7;

	/**
	 * The number of structural features of the '<em>Included Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Included Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataoriented_ishikawa_model.impl.DOFImpl <em>DOF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataoriented_ishikawa_model.impl.DOFImpl
	 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getDOF()
	 * @generated
	 */
	int DOF = 8;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOF__EFFECT = 0;

	/**
	 * The number of structural features of the '<em>DOF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DOF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataoriented_ishikawa_model.impl.DataFeederImpl <em>Data Feeder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataoriented_ishikawa_model.impl.DataFeederImpl
	 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getDataFeeder()
	 * @generated
	 */
	int DATA_FEEDER = 9;

	/**
	 * The feature id for the '<em><b>Domain Element Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEEDER__DOMAIN_ELEMENT_SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Included Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEEDER__INCLUDED_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Attributefilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEEDER__ATTRIBUTEFILTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEEDER__NAME = 3;

	/**
	 * The number of structural features of the '<em>Data Feeder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEEDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Feeder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEEDER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link dataoriented_ishikawa_model.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see dataoriented_ishikawa_model.Effect
	 * @generated
	 */
	EClass getEffect();

	/**
	 * Returns the meta object for the attribute '{@link dataoriented_ishikawa_model.Effect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataoriented_ishikawa_model.Effect#getName()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dataoriented_ishikawa_model.Effect#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see dataoriented_ishikawa_model.Effect#getCategories()
	 * @see #getEffect()
	 * @generated
	 */
	EReference getEffect_Categories();

	/**
	 * Returns the meta object for the containment reference '{@link dataoriented_ishikawa_model.Effect#getDataFeeder <em>Data Feeder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Feeder</em>'.
	 * @see dataoriented_ishikawa_model.Effect#getDataFeeder()
	 * @see #getEffect()
	 * @generated
	 */
	EReference getEffect_DataFeeder();

	/**
	 * Returns the meta object for class '{@link dataoriented_ishikawa_model.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see dataoriented_ishikawa_model.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link dataoriented_ishikawa_model.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataoriented_ishikawa_model.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dataoriented_ishikawa_model.Category#getCauses <em>Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Causes</em>'.
	 * @see dataoriented_ishikawa_model.Category#getCauses()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Causes();

	/**
	 * Returns the meta object for class '{@link dataoriented_ishikawa_model.Cause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cause</em>'.
	 * @see dataoriented_ishikawa_model.Cause
	 * @generated
	 */
	EClass getCause();

	/**
	 * Returns the meta object for the attribute '{@link dataoriented_ishikawa_model.Cause#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataoriented_ishikawa_model.Cause#getName()
	 * @see #getCause()
	 * @generated
	 */
	EAttribute getCause_Name();

	/**
	 * Returns the meta object for the attribute '{@link dataoriented_ishikawa_model.Cause#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realizes</em>'.
	 * @see dataoriented_ishikawa_model.Cause#getRealizes()
	 * @see #getCause()
	 * @generated
	 */
	EAttribute getCause_Realizes();

	/**
	 * Returns the meta object for class '{@link dataoriented_ishikawa_model.CompoundCause <em>Compound Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Cause</em>'.
	 * @see dataoriented_ishikawa_model.CompoundCause
	 * @generated
	 */
	EClass getCompoundCause();

	/**
	 * Returns the meta object for the containment reference list '{@link dataoriented_ishikawa_model.CompoundCause#getSubCauses <em>Sub Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Causes</em>'.
	 * @see dataoriented_ishikawa_model.CompoundCause#getSubCauses()
	 * @see #getCompoundCause()
	 * @generated
	 */
	EReference getCompoundCause_SubCauses();

	/**
	 * Returns the meta object for class '{@link dataoriented_ishikawa_model.DataLinkedCause <em>Data Linked Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Linked Cause</em>'.
	 * @see dataoriented_ishikawa_model.DataLinkedCause
	 * @generated
	 */
	EClass getDataLinkedCause();

	/**
	 * Returns the meta object for the containment reference '{@link dataoriented_ishikawa_model.DataLinkedCause#getDataFeeder <em>Data Feeder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Feeder</em>'.
	 * @see dataoriented_ishikawa_model.DataLinkedCause#getDataFeeder()
	 * @see #getDataLinkedCause()
	 * @generated
	 */
	EReference getDataLinkedCause_DataFeeder();

	/**
	 * Returns the meta object for class '{@link dataoriented_ishikawa_model.NotMappedCause <em>Not Mapped Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Mapped Cause</em>'.
	 * @see dataoriented_ishikawa_model.NotMappedCause
	 * @generated
	 */
	EClass getNotMappedCause();

	/**
	 * Returns the meta object for class '{@link dataoriented_ishikawa_model.AttributeFilter <em>Attribute Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Filter</em>'.
	 * @see dataoriented_ishikawa_model.AttributeFilter
	 * @generated
	 */
	EClass getAttributeFilter();

	/**
	 * Returns the meta object for class '{@link dataoriented_ishikawa_model.IncludedReference <em>Included Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Reference</em>'.
	 * @see dataoriented_ishikawa_model.IncludedReference
	 * @generated
	 */
	EClass getIncludedReference();

	/**
	 * Returns the meta object for class '{@link dataoriented_ishikawa_model.DOF <em>DOF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOF</em>'.
	 * @see dataoriented_ishikawa_model.DOF
	 * @generated
	 */
	EClass getDOF();

	/**
	 * Returns the meta object for the containment reference '{@link dataoriented_ishikawa_model.DOF#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see dataoriented_ishikawa_model.DOF#getEffect()
	 * @see #getDOF()
	 * @generated
	 */
	EReference getDOF_Effect();

	/**
	 * Returns the meta object for class '{@link dataoriented_ishikawa_model.DataFeeder <em>Data Feeder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Feeder</em>'.
	 * @see dataoriented_ishikawa_model.DataFeeder
	 * @generated
	 */
	EClass getDataFeeder();

	/**
	 * Returns the meta object for the attribute '{@link dataoriented_ishikawa_model.DataFeeder#getDomainElementSelector <em>Domain Element Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Element Selector</em>'.
	 * @see dataoriented_ishikawa_model.DataFeeder#getDomainElementSelector()
	 * @see #getDataFeeder()
	 * @generated
	 */
	EAttribute getDataFeeder_DomainElementSelector();

	/**
	 * Returns the meta object for the containment reference list '{@link dataoriented_ishikawa_model.DataFeeder#getIncludedReference <em>Included Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Included Reference</em>'.
	 * @see dataoriented_ishikawa_model.DataFeeder#getIncludedReference()
	 * @see #getDataFeeder()
	 * @generated
	 */
	EReference getDataFeeder_IncludedReference();

	/**
	 * Returns the meta object for the containment reference '{@link dataoriented_ishikawa_model.DataFeeder#getAttributefilter <em>Attributefilter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributefilter</em>'.
	 * @see dataoriented_ishikawa_model.DataFeeder#getAttributefilter()
	 * @see #getDataFeeder()
	 * @generated
	 */
	EReference getDataFeeder_Attributefilter();

	/**
	 * Returns the meta object for the attribute '{@link dataoriented_ishikawa_model.DataFeeder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataoriented_ishikawa_model.DataFeeder#getName()
	 * @see #getDataFeeder()
	 * @generated
	 */
	EAttribute getDataFeeder_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Dataoriented_ishikawa_modelFactory getDataoriented_ishikawa_modelFactory();

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
		 * The meta object literal for the '{@link dataoriented_ishikawa_model.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataoriented_ishikawa_model.impl.EffectImpl
		 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getEffect()
		 * @generated
		 */
		EClass EFFECT = eINSTANCE.getEffect();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__NAME = eINSTANCE.getEffect_Name();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT__CATEGORIES = eINSTANCE.getEffect_Categories();

		/**
		 * The meta object literal for the '<em><b>Data Feeder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT__DATA_FEEDER = eINSTANCE.getEffect_DataFeeder();

		/**
		 * The meta object literal for the '{@link dataoriented_ishikawa_model.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataoriented_ishikawa_model.impl.CategoryImpl
		 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Causes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CAUSES = eINSTANCE.getCategory_Causes();

		/**
		 * The meta object literal for the '{@link dataoriented_ishikawa_model.impl.CauseImpl <em>Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataoriented_ishikawa_model.impl.CauseImpl
		 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getCause()
		 * @generated
		 */
		EClass CAUSE = eINSTANCE.getCause();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAUSE__NAME = eINSTANCE.getCause_Name();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAUSE__REALIZES = eINSTANCE.getCause_Realizes();

		/**
		 * The meta object literal for the '{@link dataoriented_ishikawa_model.impl.CompoundCauseImpl <em>Compound Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataoriented_ishikawa_model.impl.CompoundCauseImpl
		 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getCompoundCause()
		 * @generated
		 */
		EClass COMPOUND_CAUSE = eINSTANCE.getCompoundCause();

		/**
		 * The meta object literal for the '<em><b>Sub Causes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_CAUSE__SUB_CAUSES = eINSTANCE.getCompoundCause_SubCauses();

		/**
		 * The meta object literal for the '{@link dataoriented_ishikawa_model.impl.DataLinkedCauseImpl <em>Data Linked Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataoriented_ishikawa_model.impl.DataLinkedCauseImpl
		 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getDataLinkedCause()
		 * @generated
		 */
		EClass DATA_LINKED_CAUSE = eINSTANCE.getDataLinkedCause();

		/**
		 * The meta object literal for the '<em><b>Data Feeder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINKED_CAUSE__DATA_FEEDER = eINSTANCE.getDataLinkedCause_DataFeeder();

		/**
		 * The meta object literal for the '{@link dataoriented_ishikawa_model.impl.NotMappedCauseImpl <em>Not Mapped Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataoriented_ishikawa_model.impl.NotMappedCauseImpl
		 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getNotMappedCause()
		 * @generated
		 */
		EClass NOT_MAPPED_CAUSE = eINSTANCE.getNotMappedCause();

		/**
		 * The meta object literal for the '{@link dataoriented_ishikawa_model.impl.AttributeFilterImpl <em>Attribute Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataoriented_ishikawa_model.impl.AttributeFilterImpl
		 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getAttributeFilter()
		 * @generated
		 */
		EClass ATTRIBUTE_FILTER = eINSTANCE.getAttributeFilter();

		/**
		 * The meta object literal for the '{@link dataoriented_ishikawa_model.impl.IncludedReferenceImpl <em>Included Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataoriented_ishikawa_model.impl.IncludedReferenceImpl
		 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getIncludedReference()
		 * @generated
		 */
		EClass INCLUDED_REFERENCE = eINSTANCE.getIncludedReference();

		/**
		 * The meta object literal for the '{@link dataoriented_ishikawa_model.impl.DOFImpl <em>DOF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataoriented_ishikawa_model.impl.DOFImpl
		 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getDOF()
		 * @generated
		 */
		EClass DOF = eINSTANCE.getDOF();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOF__EFFECT = eINSTANCE.getDOF_Effect();

		/**
		 * The meta object literal for the '{@link dataoriented_ishikawa_model.impl.DataFeederImpl <em>Data Feeder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataoriented_ishikawa_model.impl.DataFeederImpl
		 * @see dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelPackageImpl#getDataFeeder()
		 * @generated
		 */
		EClass DATA_FEEDER = eINSTANCE.getDataFeeder();

		/**
		 * The meta object literal for the '<em><b>Domain Element Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FEEDER__DOMAIN_ELEMENT_SELECTOR = eINSTANCE.getDataFeeder_DomainElementSelector();

		/**
		 * The meta object literal for the '<em><b>Included Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FEEDER__INCLUDED_REFERENCE = eINSTANCE.getDataFeeder_IncludedReference();

		/**
		 * The meta object literal for the '<em><b>Attributefilter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FEEDER__ATTRIBUTEFILTER = eINSTANCE.getDataFeeder_Attributefilter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FEEDER__NAME = eINSTANCE.getDataFeeder_Name();

	}

} //Dataoriented_ishikawa_modelPackage
