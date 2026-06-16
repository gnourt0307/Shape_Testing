package shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {

    Triangle triangle;

    public TriangleTest() {
        triangle = new Triangle(3, 4, 5);
    }

    @Test
    public void testGetArea() {
        double rs = triangle.getArea();
        assertTrue(Double.isNaN(rs));
    }

    @Test
    public void testGetPerimeter() {
        double rs = triangle.getPerimeter();
        double expected = 12;
        assertEquals(expected, rs, 0.0001);
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
