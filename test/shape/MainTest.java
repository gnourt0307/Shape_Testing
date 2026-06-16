package shape;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testInputAndDisplay() throws Exception {
        String input = "abc\n4\n5\n2\n1\n2\n10\n10\n1\n2\n1\n10\n2\n3\n4\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        PrintStream oldOut = System.out;
        PrintStream oldErr = System.err;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.setErr(new PrintStream(output));

        Class<?> mainClass = Class.forName("shape.Main");

        Method inputRectangle = mainClass.getDeclaredMethod("inputRectangle");
        inputRectangle.setAccessible(true);
        Rectangle rectangle = (Rectangle) inputRectangle.invoke(null);

        Method inputCircle = mainClass.getDeclaredMethod("inputCircle");
        inputCircle.setAccessible(true);
        Circle circle = (Circle) inputCircle.invoke(null);

        Method inputTriangle = mainClass.getDeclaredMethod("inputTriangle");
        inputTriangle.setAccessible(true);
        Triangle triangle = (Triangle) inputTriangle.invoke(null);

        Method display = mainClass.getDeclaredMethod("display", Triangle.class, Rectangle.class, Circle.class);
        display.setAccessible(true);
        display.invoke(null, triangle, rectangle, circle);

        System.setOut(oldOut);
        System.setErr(oldErr);

        assertEquals(20, rectangle.getArea(), 0.0001);
        assertEquals(Math.PI * 4, circle.getArea(), 0.0001);
        assertEquals(12, triangle.getPerimeter(), 0.0001);
    }
}
