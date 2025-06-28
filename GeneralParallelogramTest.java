import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneralParallelogramTest{
	@Test
	void testperi1(){
		GeneralParallelogram p1 = new GeneralParallelogram(new Point(0, 0),
														   new Point(2, 0),
														   new Point(3, 3),
														   new Point(1, 3));
		GeneralParallelogram p2 = new GeneralParallelogram(new Point(1, 3),
				   										   new Point(2, 0),
				   										   new Point(0, 0),
				   										   new Point(3, 3));
		assertEquals(p1.perimeter(), p2.perimeter());
	}
	@Test
	void testperi2(){
		GeneralParallelogram p1 = new GeneralParallelogram(new Point(0, 0),
														   new Point(3, 3),
														   new Point(2, 0),
														   new Point(1, 3));
		GeneralParallelogram p2 = new GeneralParallelogram(new Point(1, 3),
				   										   new Point(0, 0),
				   										   new Point(2, 0),
				   										   new Point(3, 3));
		assertEquals(p1.perimeter(), p2.perimeter());
	}
	@Test
	void testperi3(){
		GeneralParallelogram p1 = new GeneralParallelogram(new Point(0, 0),
														   new Point(2, 0),
														   new Point(1, 3),
														   new Point(3, 3));
		GeneralParallelogram p2 = new GeneralParallelogram(new Point(1, 3),
				   										   new Point(3, 3),
				   										   new Point(0, 0),
				   										   new Point(2, 0));
		assertEquals(p1.perimeter(), p2.perimeter());
	}
	@Test
	void testperi4(){
		GeneralParallelogram p1 = new GeneralParallelogram(new Point(3, 3),
														   new Point(1, 3),
														   new Point(2, 0),
														   new Point(0, 0));
		assertEquals(4+2*Math.sqrt(10), p1.perimeter());
	}
	@Test
	void testperi5(){
		GeneralParallelogram p1 = new GeneralParallelogram(new Point(0, 0),
														   new Point(2, 0),
														   new Point(1, 1),
														   new Point(3, 1));
		assertEquals(4+2*Math.sqrt(2), p1.perimeter());
	}
	@Test
	void testperi6(){
		GeneralParallelogram p1 = new GeneralParallelogram(new Point(3, 3),
														   new Point(12, 3),
														   new Point(-3, -3),
														   new Point(6, -3));
		assertEquals(18+Math.sqrt(288), p1.perimeter());
	}
	@Test
	void testisRhombus1(){
		GeneralParallelogram p1 = new GeneralParallelogram(new Point(0, 0),
														   new Point(26, 0),
														   new Point(50, 10),
														   new Point(24, 10));
		assertTrue(p1.isRhombus());
	}
	@Test
	void testisRhombus2(){
		GeneralParallelogram p1 = new GeneralParallelogram(new Point(0, 0),
														   new Point(24, 10),
														   new Point(26, 0),
														   new Point(50, 10));
		assertTrue(p1.isRhombus());
	}
	@Test
	void testisRhombus3(){
		GeneralParallelogram p1 = new GeneralParallelogram(new Point(0, 0),
														   new Point(50, 10),
														   new Point(24, 10),
														   new Point(26, 0));
		assertTrue(p1.isRhombus());
	}
	@Test
	void testisRhombus4(){
		GeneralParallelogram p1 = new GeneralParallelogram(new Point(0, 0),
														   new Point(2, 0),
														   new Point(3, 3),
														   new Point(1, 3));
		assertFalse(p1.isRhombus());
	}
	@Test
	void testisRhombus5(){
		GeneralParallelogram p1 = new GeneralParallelogram(new Point(0, 0),
														   new Point(1, 3),
														   new Point(2, 0),
														   new Point(3, 3));
		assertFalse(p1.isRhombus());
	}
	@Test
	void testisRhombus6(){
		GeneralParallelogram p1 = new GeneralParallelogram(new Point(0, 0),
														   new Point(3, 3),
														   new Point(1, 3),
														   new Point(2, 0));
		assertFalse(p1.isRhombus());
	}
}
