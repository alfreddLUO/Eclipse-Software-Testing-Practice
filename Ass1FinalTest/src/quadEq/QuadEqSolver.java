// File QuadEqSolver.java BEGIN ===============================================
// 
package quadEq;

// This class implements the methods for solving the equation represented by QuadEq.
public class QuadEqSolver extends QuadEq {
	// Declare the attributes representing the roots of the equation (to compute)
	private double root1, root2;	// **Do NOT modify this declaration statement!!**
	// Default constructor
	public QuadEqSolver() {		// **Do NOT add code here!!  Just leave this method empty.**
	}
	// Getter methods for public access of the values of roots
	public double getRoot1() {
		return root1;			// **Do NOT modify this getter method!!**
	}
	public double getRoot2() {
		return root2;			// **Do NOT modify this getter method!!**
	}

	// solveQEq() implements the solver for Quadratic Equations
	public String solveQEq() {
		// **Skeleton only: to be filled in by real code for implementation**
		// This method computes and stores the roots of the quadratic equation, AND
		//   returns one of the pre-defined text strings describing the characteristics of roots.
		return NO_ROOT;
	}

	// solveEq() implements the solver for (quadratic/degenerated) Equations
	public String solveEq() {
		// **Skeleton only: to be filled in by real code for implementation**
		// This method computes and stores the roots of the (quadratic/degenerated) equation, AND
		//   returns one of the pre-defined text strings describing the characteristics of roots.
		return NO_ROOT;		
	}
}
// 
// File QuadEqSolver.java  END  ===============================================
