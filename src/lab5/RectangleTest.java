package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void testSlope() {
		Point a=new Point(1,2);
		Point b=new Point(0,0);
		assertEquals(Rectangle.slope(a,b),2);
	}

	@Test
	void testIsPerp() {
		Point a=new Point(1,2);
		Point b=new Point(0,0);
		Point c=new Point(2,-1);
		assertTrue(Rectangle.isPerp(a, c, b));
		a=new Point(1,0);
		c=new Point(0,1);
		assertTrue(Rectangle.isPerp(a, c, b));
		assertTrue(Rectangle.isPerp(c, a, b));
		Point d=new Point(3,4);
		assertFalse(Rectangle.isPerp(c, d, b));
		assertFalse(Rectangle.isPerp(a, d, b));

		a=new Point(-1,-1);
		assertFalse(Rectangle.isPerp(a, c, b));
	}

	@Test
	void testRectangle() {
		Point a=new Point(1,2);
		Point b=new Point(0,0);
		Point c=new Point(-1,-1);
		try {
			Rectangle r=new Rectangle(a,c,b);
			assertFalse(true);
		}catch(Exception e) {
			assertEquals(e.getMessage(),"must be formatted: point,point,perpendicular corner");
		}
		c=new Point(-2,1);
		try {
			Rectangle r=new Rectangle(a,c,b);
			
		}catch(Exception e) {
			assertFalse(true);
		}
	}

	@Test
	void testPeri() throws Exception{
		Point a=new Point(3,4);
		Point b=new Point(0,0);
		Point c=new Point(-4,3);
		Rectangle r=new Rectangle(a,c,b);
		assertEquals(r.perimeter(),20);
	}
	
	@Test
	void testSquare() throws Exception{
		Point a=new Point(3,4);
		Point b=new Point(0,0);
		Point c=new Point(-4,3);
		Rectangle r=new Rectangle(a,c,b);
		assertTrue(r.isSquare());
		c=new Point(-2,1.5);
		r=new Rectangle(a,c,b);
		assertFalse(r.isSquare());
	}


	
}
