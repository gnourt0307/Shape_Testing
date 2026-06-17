package shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SquareTest {

    Square square;

    public SquareTest() {
        square = new Square(4);
    }

    @Test
    public void testGetArea() {
        double rs = square.getArea();
        double expected = 16;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        double rs = square.getPerimeter();
        double expected = 16;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testGetVolume() {
        double rs = square.getVolume();
        double expected = 64;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testCheckSquare() {
        assertTrue(square.checkSquare());
    }

    @Test
    public void testCheckSquareFalse() {
        assertFalse(new Square(Double.NaN).checkSquare());
        assertFalse(new Square(Double.POSITIVE_INFINITY).checkSquare());
        assertFalse(new Square(0).checkSquare());
        assertFalse(new Square(-4).checkSquare());
        assertFalse(new Square(Double.MIN_VALUE).checkSquare());
        assertFalse(new Square(Double.MAX_VALUE).checkSquare());
        assertFalse(new Square(1.0E-200).checkSquare());
        assertFalse(new Square(1.0E155).checkSquare());
        assertFalse(new Square(1.0E-110).checkSquare());
        assertFalse(new Square(1.0E103).checkSquare());
    }

}
