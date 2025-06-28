import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {
	
    @Test
    void testPerimeter_simpleRectangle() {
        // Arrange: construct a 4×3 rectangle
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(4, 3);
        Point D = new Point(0, 3);
        Rectangle r = new Rectangle(A, B, C, D);

        // Act & Assert: perimeter = 2 * (4 + 3) = 14
        assertEquals(14.0, r.perimeter());
    }

    @Test
    void testIsSquare_trueForSquare() {
        // Arrange: construct a square with side length 2
        Point A = new Point(0, 0);
        Point B = new Point(2, 0);
        Point C = new Point(2, 2);
        Point D = new Point(0, 2);
        Rectangle r = new Rectangle(A, B, C, D);

        // Act & Assert: should be recognized as a square
        assertTrue(r.isSquare());
    }

    @Test
    void testIsSquare_falseForRectangle() {
        // Arrange: construct a 5×2 rectangle
        Point A = new Point(0, 0);
        Point B = new Point(5, 0);
        Point C = new Point(5, 2);
        Point D = new Point(0, 2);
        Rectangle r = new Rectangle(A, B, C, D);

        // Act & Assert: should not be recognized as a square
        assertFalse(r.isSquare());
    }

}
