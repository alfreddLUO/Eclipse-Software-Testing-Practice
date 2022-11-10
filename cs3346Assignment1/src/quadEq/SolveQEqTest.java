package quadEq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolveQEqTest {
	private QuadEqSolver quadEqSolver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		quadEqSolver=new QuadEqSolver();		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSolveQEq_01() {
		quadEqSolver.setCoeff(0,0,0);
		String resultCase=quadEqSolver.solveQEq();
		String msg="Testing the special case that all coefficients are 0.";
		assertEquals(resultCase, "Not a quadratic equation",msg);
	}
	
	@Test
	void testSolveQEq_02() {
		quadEqSolver.setCoeff(0,1,2);
		String resultCase=quadEqSolver.solveQEq();
		String msg="Testing one random case that it not a quadratic equation.";
		assertEquals(resultCase, "Not a quadratic equation",msg);
	}
	
	@Test
	void testSolveQEq_03() {
		quadEqSolver.setCoeff(1,2,0);
		String resultCase=quadEqSolver.solveQEq();
		double root1=quadEqSolver.getRoot1();
		double root2=quadEqSolver.getRoot2();
		String msg="Test with test02 to see whether it can distinguish the different coefficients when one of them are 0";
		assertEquals(resultCase, "Two distinct real roots",msg);
		assertEquals(root1, -2,0.00001,msg);
		assertEquals(root2,0,0.00001,msg);	}
	
	@Test
	void testSolveQEq_04() {
		quadEqSolver.setCoeff(0,0,1);
		String resultCase=quadEqSolver.solveQEq();
		String msg="Testing cases with two coefficients are 0";
		assertEquals(resultCase, "Not a quadratic equation",msg);
	}
	
	@Test
	void testSolveQEq_05() {
		quadEqSolver.setCoeff(0,1,0);
		String resultCase=quadEqSolver.solveQEq();
		String msg="Testing with test 04 to see whether it can distinguish the different coefficients when two coeffs are 0";
		assertEquals(resultCase, "Not a quadratic equation",msg);
	}
	
	@Test
	void testSolveQEq_06() {
		quadEqSolver.setCoeff(1,2,3);
		String resultCase=quadEqSolver.solveQEq();
		String msg="Test the case of No real root";
		assertEquals(resultCase, "No real root",msg);
	}
	@Test
	void testSolveQEq_07() {
		quadEqSolver.setCoeff(2,3,1);
		String resultCase=quadEqSolver.solveQEq();
		double root1=quadEqSolver.getRoot1();
		double root2=quadEqSolver.getRoot2();
		String msg="Test with test06 to see whether it can distinguish the different coefficients when each of them are distinct";
		assertEquals(resultCase, "Two distinct real roots",msg);
		assertEquals(root1, -1.0,0.00001,msg);
		assertEquals(root2,-0.5,0.00001,msg);
	}
	@Test
	void testSolveQEq_08() {
		quadEqSolver.setCoeff(3,1,2);
		String resultCase=quadEqSolver.solveQEq();
		String msg="Test with test06 and test07 to see whether it can distinguish the different coefficients when each of them are distinct";
		assertEquals(resultCase, "No real root",msg);
	}
	@Test
	void testSolveQEq_09() {
		quadEqSolver.setCoeff(1,6,9);
		String resultCase=quadEqSolver.solveQEq();
		double root1=quadEqSolver.getRoot1();
		double root2=quadEqSolver.getRoot2();
		String msg="Testing cases with two equal real roots.";
		assertEquals(resultCase, "Two equal real roots",msg);
		assertEquals(root1, -3,0.00001,msg);
		assertEquals(root2,-3,0.00001,msg);
	}
	@Test
	void testSolveQEq_10() {
		quadEqSolver.setCoeff(1,-3,2);
		String resultCase=quadEqSolver.solveQEq();
		double root1=quadEqSolver.getRoot1();
		double root2=quadEqSolver.getRoot2();
		String msg="Testing cases with two distinct real roots.";
		assertEquals(resultCase, "Two distinct real roots",msg);
		assertEquals(root1, 1.0,0.00001,msg);
		assertEquals(root2,2.0,0.00001,msg);
	}

	@Test
	void testSolveQEq_11() {
		quadEqSolver.setCoeff(-1.2,-4.8,-3.6);
		String resultCase=quadEqSolver.solveQEq();
		double root1=quadEqSolver.getRoot1();
		double root2=quadEqSolver.getRoot2();
		String msg="Testing cases with negative double number.";
		assertEquals(resultCase, "Two distinct real roots",msg);
		assertEquals(root1, -3.0,0.00001,msg);
		assertEquals(root2, -1.0,0.00001,msg);
	}
	@Test
	void testSolveQEq_12() {
		quadEqSolver.setCoeff(1/1,2/2,1/1);
		String resultCase=quadEqSolver.solveQEq();
		double root1=quadEqSolver.getRoot1();
		String msg="Testing cases with coefficient being fraction values";
		assertEquals(resultCase, "Two equal real roots",msg);
		assertEquals(root1, -1.0,0.00001,msg);
		
	}
	
	

	



}
