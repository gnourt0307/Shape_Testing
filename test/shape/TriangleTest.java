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
    public void testCheckTriangle() {
        boolean rs = triangle.checkTriangle();
        assertTrue(rs);
    }

    @Test
    public void testCheckTriangleFalse() {
        assertFalse(new Triangle(0, 4, 5).checkTriangle());
        assertFalse(new Triangle(3, 0, 5).checkTriangle());
        assertFalse(new Triangle(3, 4, 0).checkTriangle());
        assertFalse(new Triangle(1, 2, 10).checkTriangle());
        assertFalse(new Triangle(10, 1, 2).checkTriangle());
        assertFalse(new Triangle(1, 10, 2).checkTriangle());
    }

    @Test
    public void testSetSide() {
        Triangle t = new Triangle();
        t.setA(6);
        t.setB(8);
        t.setC(10);

        double expectedA = 6;
        double expectedB = 8;
        double expectedC = 10;

        assertEquals(expectedA, t.getA(), 0.0001);
        assertEquals(expectedB, t.getB(), 0.0001);
        assertEquals(expectedC, t.getC(), 0.0001);
    }
}
