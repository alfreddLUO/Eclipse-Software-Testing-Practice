package quadEq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


class SolveEqTestParamFile {
	
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

	@ParameterizedTest
	@CsvFileSource(resources="testSolveEq.csv")
	void testSolveEq(String a,String b, String c, String expectedroot1, String expectedroot2, String expectedRootType, String msg ) {
		double coeffA=Double.parseDouble(a);
		double coeffB=Double.parseDouble(b);
		double coeffC=Double.parseDouble(c);
		quadEqSolver.setCoeff(coeffA, coeffB, coeffC);
		assertEquals(quadEqSolver.solveEq(),expectedRootType,msg);
		if(expectedRootType.equals("Two distinct real roots")) {
			double actualRoot1=quadEqSolver.getRoot1();
			double actualRoot2=quadEqSolver.getRoot2();
			double expectedRoot1=Double.parseDouble(expectedroot1);
			double expectedRoot2=Double.parseDouble(expectedroot2);
			assertEquals(actualRoot1,expectedRoot1,0.0001,msg);
			assertEquals(actualRoot2,expectedRoot2,0.0001,msg);
		}
		else if(expectedRootType.equals("One real root only")) {
			double actualRoot1=quadEqSolver.getRoot1();
			double expectedRoot1=Double.parseDouble(expectedroot1);
			assertEquals(actualRoot1,expectedRoot1,0.0001,msg);
		}
	}

}
