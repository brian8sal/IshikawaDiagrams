/**
 */
package dataoriented_ishikawa_model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dataoriented_ishikawa_model.Dataoriented_ishikawa_modelPackage
 * @generated
 */
public interface Dataoriented_ishikawa_modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dataoriented_ishikawa_modelFactory eINSTANCE = dataoriented_ishikawa_model.impl.Dataoriented_ishikawa_modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect</em>'.
	 * @generated
	 */
	Effect createEffect();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Compound Cause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Cause</em>'.
	 * @generated
	 */
	CompoundCause createCompoundCause();

	/**
	 * Returns a new object of class '<em>Data Linked Cause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Linked Cause</em>'.
	 * @generated
	 */
	DataLinkedCause createDataLinkedCause();

	/**
	 * Returns a new object of class '<em>Not Mapped Cause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Mapped Cause</em>'.
	 * @generated
	 */
	NotMappedCause createNotMappedCause();

	/**
	 * Returns a new object of class '<em>Attribute Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Filter</em>'.
	 * @generated
	 */
	AttributeFilter createAttributeFilter();

	/**
	 * Returns a new object of class '<em>Included Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Included Reference</em>'.
	 * @generated
	 */
	IncludedReference createIncludedReference();

	/**
	 * Returns a new object of class '<em>DOF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DOF</em>'.
	 * @generated
	 */
	DOF createDOF();

	/**
	 * Returns a new object of class '<em>Data Feeder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Feeder</em>'.
	 * @generated
	 */
	DataFeeder createDataFeeder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Dataoriented_ishikawa_modelPackage getDataoriented_ishikawa_modelPackage();

} //Dataoriented_ishikawa_modelFactory
