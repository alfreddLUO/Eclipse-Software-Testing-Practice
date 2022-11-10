// File QuadEqSolver.java BEGIN ===============================================
// 
package quadEq;
import java.lang.Math;



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
		root1=DNULL;
		root2=DNULL;
		if(coeffA==0) {
			return NOT_QE;
		}
		else {
			double delta=coeffB*coeffB-4*coeffA*coeffC;
			double sqrtDelta=java.lang.Math.sqrt(delta);
			if(delta<0) {
				return NO_ROOT;
			}
			else if(delta==0) {
				root1=(-coeffB+sqrtDelta)/(2*coeffA);
				root2=root1;
				return EQUAL_ROOTS;
			}
			else {
				root1=(-coeffB+sqrtDelta)/(2*coeffA);
				root2=(-coeffB-sqrtDelta)/(2*coeffA);
				if(root1>root2) {
					Double temp=root1;
					root1=root2;
					root2=temp;
				}
				return TWO_ROOTS;
			}
		}
	}

	// solveEq() implements the solver for (quadratic/degenerated) Equations
	public String solveEq() {
		// **Skeleton only: to be filled in by real code for implementation**
		// This method computes and stores the roots of the (quadratic/degenerated) equation, AND
		if(coeffA==0) {
			if(coeffC==0){
				if(coeffB==0) {
					return ALL_ROOTS;
				}
				else {
					root1=0;
					return ONE_ROOT;
				}
			}
			else if(coeffC!=0) {
				if(coeffB==0) {
					return NO_ROOT;
				}
				else {
					root1=(-coeffC)/coeffB;
					root2=DNULL;
					return ONE_ROOT;
				}
			}
		}
		else {
			double delta=coeffB*coeffB-4*coeffA*coeffC;
			double sqrtDelta=java.lang.Math.sqrt(delta);
			if(delta<0) {
				return NO_ROOT;
			}
			else if(delta==0) {
				root1=(-coeffB+sqrtDelta)/(2*coeffA);
				root2=DNULL;
				return ONE_ROOT;
			}
			else {
				root1=(-coeffB+sqrtDelta)/(2*coeffA);
				root2=(-coeffB-sqrtDelta)/(2*coeffA);
				if(root1>root2) {
					Double temp=root1;
					root1=root2;
					root2=temp;
				}
				return TWO_ROOTS;
			}
	}
		return "";
}
	public static void main(String args[]) {
		System.out.println("Successful!");
		
	}
}
// 
// File QuadEqSolver.java  END  ===============================================