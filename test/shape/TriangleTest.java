package shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {

    Triangle triangle;

    public TriangleTest() {
        triangle = new Triangle(3, 4, 5);
    }

    @Test
    public void testGetArea() {
        double rs = triangle.getArea();
        double expected = 6;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        double rs = triangle.getPerimeter();
        double expected = 12;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testGetVolume() {
        Triangle t = new Triangle(3, 4, 5, 7);
        double rs = t.getVolume();
        double expected = 42;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testCheckTriangle() {
        boolean rs = triangle.checkTriangle();
        assertTrue(rs);
    }

    @Test
    public void testCheckTriangleFalse() {
        assertFalse(new Triangle(Double.NaN, 4, 5).checkTriangle());
        assertFalse(new Triangle(3, Double.NaN, 5).checkTriangle());
        assertFalse(new Triangle(3, 4, Double.NaN).checkTriangle());
        assertFalse(new Triangle(Double.POSITIVE_INFINITY, 4, 5).checkTriangle());
        assertFalse(new Triangle(3, Double.POSITIVE_INFINITY, 5).checkTriangle());
        assertFalse(new Triangle(3, 4, Double.POSITIVE_INFINITY).checkTriangle());
        assertFalse(new Triangle(0, 4, 5).checkTriangle());
        assertFalse(new Triangle(3, 0, 5).checkTriangle());
        assertFalse(new Triangle(3, 4, 0).checkTriangle());
        assertFalse(new Triangle(1, 2, 10).checkTriangle());
        assertFalse(new Triangle(10, 1, 2).checkTriangle());
        assertFalse(new Triangle(1, 10, 2).checkTriangle());
    }

    @Test
    public void testGetType() {
        assertEquals("Equilateral", new Triangle(3, 3, 3).getType());
        assertEquals("Isosceles", new Triangle(3, 3, 4).getType());
        assertEquals("Isosceles", new Triangle(3, 4, 3).getType());
        assertEquals("Isosceles", new Triangle(4, 3, 3).getType());
        assertEquals("Scalene", new Triangle(4, 5, 6).getType());
        assertEquals("Right", new Triangle(5, 3, 4).getType());
        assertEquals("Right", new Triangle(3, 5, 4).getType());
        assertEquals("Right", new Triangle(3, 4, 5).getType());
        assertEquals("Right", new Triangle(1, 1, Math.sqrt(2)).getType());
        assertEquals("Invalid", new Triangle(1, 3, 10).getType());
        assertEquals("Invalid", new Triangle(0, 3, 5).getType());
        assertEquals("Invalid", new Triangle(3, -1, 4).getType());
    }

}
