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
        assertFalse(new Circle(Double.NaN).checkCircle());
        assertFalse(new Circle(Double.POSITIVE_INFINITY).checkCircle());
        assertFalse(new Circle(0).checkCircle());
        assertFalse(new Circle(-2).checkCircle());
        assertFalse(new Circle(Double.MIN_VALUE).checkCircle());
        assertFalse(new Circle(Double.MAX_VALUE).checkCircle());
        assertFalse(new Circle(1.0E-200).checkCircle());
        assertFalse(new Circle(1.0E154).checkCircle());
        assertFalse(new Circle(1.0E-110).checkCircle());
        assertFalse(new Circle(1.0E103).checkCircle());
    }

}
