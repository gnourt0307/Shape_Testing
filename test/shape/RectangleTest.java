package shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    Rectangle rectangle;

    public RectangleTest() {
        rectangle = new Rectangle(4, 5);
    }

    @Test
    public void testGetArea() {
        double rs = rectangle.getArea();
        double expected = 20;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        double rs = rectangle.getPerimeter();
        double expected = 18;
        assertEquals(expected, rs, 0.0001);
    }
}
