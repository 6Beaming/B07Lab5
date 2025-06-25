public class GeneralParallelogram {
	// General Parallelogram is referred to parallelograms that are not rectangle or square
	// Diagonals are NOT equal in general parallelogram
	// So,
	// A	D
	//
	// C	B   <-- We don't need this case - diagonals equal(AB=CD)
	Point A;
	Point B;
	Point C;
	Point D;

	public GeneralParallelogram(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public double perimeter() {
		// Leverage the fact that opposite sides are equal
		// Hence perimeter = 2*(x+y)
		double x=0;
		double y=0;
		// Find the diagonals
		// Diagonals are not equal in general parallelogram
		// Based on that, we have 3 cases: A + B/C/D or mathematically C(4,2)
		// If AD and BC are diagonals
		if (A.distance(B)==C.distance(D) && A.distance(C)==B.distance(D) && A.distance(D)!=B.distance(C)) {
			// A	B
			//    C    D
			x = A.distance(B);
			y = A.distance(C);
		}
		// If AB and CD are diagonals
		else if (A.distance(C)==D.distance(B) && A.distance(D)==C.distance(B) && A.distance(B)!=C.distance(D)) {
			// A	C
			//    D    B
			x = A.distance(C);
			y = A.distance(D);
		}
		//If AC and BD are diagonals 
		else if (A.distance(B)==D.distance(C) && A.distance(D)==C.distance(B) && A.distance(C)!=B.distance(D)) {
			// A	B
			//    D    C
			x = A.distance(B);
			y = A.distance(D);
		}
	
		return 2*(x+y);
	}
	
	public boolean isRhombus() {
		// Leverage the fact that diagonals of rhombus are perpendicular
		// i.e. the product of slopes of diagonals is -1
		
		// If AD and BC are the diagonals -> Their slope product will be -1
		if (A.distance(B)==C.distance(D) && A.distance(C)==B.distance(D) && A.distance(D)!=B.distance(C)) {
			double k_AD = (A.y-D.y)/(A.x-D.x);
			double k_BC = (B.y-C.y)/(B.x-C.x);
			return (k_AD*k_BC == -1);
		}
		// If AB and CD are the diagonals
		else if (A.distance(C)==D.distance(B) && A.distance(D)==C.distance(B) && A.distance(B)!=C.distance(D)) {
			double k_AB = (A.y-B.y)/(A.x-B.x);
			double k_CD = (D.y-C.y)/(D.x-C.x);
			return (k_AB*k_CD == -1);
		}
		//If AC and BD are diagonals 
		else {
			double k_AC = (A.y-C.y)/(A.x-C.x);
			double k_BD = (D.y-B.y)/(D.x-B.x);
			return (k_AC*k_BD == -1);
		}
	}
}