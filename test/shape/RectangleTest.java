package shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void testGetVolume() {
        Rectangle r = new Rectangle(4, 5, 6);
        double rs = r.getVolume();
        double expected = 120;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testCheckRectangle() {
        assertTrue(rectangle.checkRectangle());
    }

    @Test
    public void testCheckRectangleFalse() {
        assertFalse(new Rectangle(Double.NaN, 5, 1).checkRectangle());
        assertFalse(new Rectangle(4, Double.NaN, 1).checkRectangle());
        assertFalse(new Rectangle(4, 5, Double.NaN).checkRectangle());
        assertFalse(new Rectangle(Double.POSITIVE_INFINITY, 5, 1).checkRectangle());
        assertFalse(new Rectangle(4, Double.POSITIVE_INFINITY, 1).checkRectangle());
        assertFalse(new Rectangle(4, 5, Double.POSITIVE_INFINITY).checkRectangle());
        assertFalse(new Rectangle(0, 5).checkRectangle());
        assertFalse(new Rectangle(4, 0).checkRectangle());
        assertFalse(new Rectangle(4, 5, 0).checkRectangle());
        assertFalse(new Rectangle(-4, -5).checkRectangle());
    }




}
