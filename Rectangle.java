

import java.util.Arrays;

public class Rectangle {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Rectangle(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public double perimeter() {
		// Leverage the fact that in a rectangle, the longest side from a point is the hypotenuse
		double[] sides = new double[3];
		sides[0] = A.distance(B);
		sides[1] = A.distance(C);
		sides[2] = A.distance(D);
		Arrays.sort(sides);
		// After sorting, the first and the second represent the adjacent side
		double x = sides[0];
		double y = sides[1];
		
		return 2*(x+y);
	}
	
	public boolean isSquare() {
		double[] sides = new double[3];
		sides[0] = A.distance(B);
		sides[1] = A.distance(C);
		sides[2] = A.distance(D);
		Arrays.sort(sides);
		// After sorting, the first and the second represent the adjacent side
		double x = sides[0];
		double y = sides[1];
		
		// Leverage the fact that square is a rectangle that has the same adjacent side
		return x==y;
	}
}