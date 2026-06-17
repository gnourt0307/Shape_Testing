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
        assertFalse(new Rectangle(0, 5).checkRectangle());
        assertFalse(new Rectangle(4, 0).checkRectangle());
        assertFalse(new Rectangle(4, 5, 0).checkRectangle());
        assertFalse(new Rectangle(-4, -5).checkRectangle());
    }

    @Test
    public void testCheckSquare() {
        assertTrue(new Rectangle(4, 4).checkSquare());
    }

    @Test
    public void testCheckSquareFalse() {
        assertFalse(rectangle.checkSquare());
        assertFalse(new Rectangle(0, 0).checkSquare());
        assertFalse(new Rectangle(4, 0).checkSquare());
        assertFalse(new Rectangle(-4, -4).checkSquare());
    }

    @Test
    public void testGetDiagonal() {
        Rectangle r = new Rectangle(3, 4);
        double rs = r.getDiagonal();
        double expected = 5;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testSetSide() {
        Rectangle r = new Rectangle(0, 0);
        r.setWidth(6);
        r.setLength(8);
        r.setHeight(10);

        double expectedWidth = 6;
        double expectedLength = 8;
        double expectedHeight = 10;

        assertEquals(expectedWidth, r.getWidth(), 0.0001);
        assertEquals(expectedLength, r.getLength(), 0.0001);
        assertEquals(expectedHeight, r.getHeight(), 0.0001);
    }
}
