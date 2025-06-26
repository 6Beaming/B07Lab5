package lab5;

public class Rectangle {
	Point A;
	Point B;
	Point P;  //the perpendicular point
	
	
	public Rectangle(Point a, Point b, Point p){
		A=a.copy();
		B=b.copy();
		P=p.copy();
		
	}
	
	public double perimeter() {
		return (A.distance(P)+B.distance(P))*2;
	}
	
	public boolean isSquare() {
		return A.distance(P)==B.distance(P);
	}

	
}
