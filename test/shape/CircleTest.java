package shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircleTest {

    Circle circle;

    public CircleTest() {
        circle = new Circle(2);
    }

    @Test
    public void testGetArea() {
        double rs = circle.getArea();
        double expected = Math.PI * 4;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        double rs = circle.getPerimeter();
        double expected = Math.PI * 4;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testGetVolume() {
        double rs = circle.getVolume();
        double expected = 4.0 / 3 * Math.PI * 8;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testCheckCircle() {
        assertTrue(circle.checkCircle());
    }

    @Test
    public void testCheckCircleFalse() {
        assertFalse(new Circle(0).checkCircle());
        assertFalse(new Circle(-2).checkCircle());
    }

    @Test
    public void testGetDiameter() {
        double rs = circle.getDiameter();
        double expected = 4;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testSetRadius() {
        Circle c = new Circle();
        c.setRadius(3);

        double rs = c.getRadius();
        double expected = 3;
        assertEquals(expected, rs, 0.0001);
    }
}
