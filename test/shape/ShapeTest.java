package shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    Shape shape;

    public ShapeTest() {
        shape = new Shape() {
        };
    }

    @Test
    public void testGetArea() {
        double rs = shape.getArea();
        double expected = 0;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        double rs = shape.getPerimeter();
        double expected = 0;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testPrintResult() {
        shape.printResult();
    }
}
