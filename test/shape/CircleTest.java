package shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void testSetRadius() {
        Circle c = new Circle();
        c.setRadius(3);

        double rs = c.getRadius();
        double expected = 3;
        assertEquals(expected, rs, 0.0001);
    }
}
