package lab5;

public class Rectangle {
	Point A;
	Point B;
	Point P;  //the perpendicular point
	
	public static Double slope(Point a,Point b) {            //boxed type bc return null
		if (a.x-b.x==0)
			return null;
		return (a.y-b.y)/(a.x-b.x);
	}
	
	public static boolean isPerp(Point a,Point b,Point p) {
		if ((slope(a,p)==null&&slope(b,p)==0)||(slope(b,p)==null&&slope(a,p)==0)) {
			return true;
		}else if(slope(a,p)!=null&&slope(b,p)!=null&&slope(a,p)*slope(b,p)+1<0.0001)
			return true;
		return false;
	}
	
	public Rectangle(Point a, Point b, Point p) throws Exception{
		if (!isPerp(a,b,p))
			throw new Exception("must be formatted: point,point,perpendicular corner");
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
