/**
 */
package dataoriented_ishikawa_model.tests;

import dataoriented_ishikawa_model.CompoundCause;
import dataoriented_ishikawa_model.Dataoriented_ishikawa_modelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Compound Cause</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompoundCauseTest extends CauseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompoundCauseTest.class);
	}

	/**
	 * Constructs a new Compound Cause test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundCauseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Compound Cause test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompoundCause getFixture() {
		return (CompoundCause)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dataoriented_ishikawa_modelFactory.eINSTANCE.createCompoundCause());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CompoundCauseTest
