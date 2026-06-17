package shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CylinderTest {

    Cylinder cylinder;

    public CylinderTest() {
        cylinder = new Cylinder(2, 5);
    }

    @Test
    public void testGetArea() {
        double rs = cylinder.getArea();
        double expected = 28 * Math.PI;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        double rs = cylinder.getPerimeter();
        double expected = 4 * Math.PI;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testGetVolume() {
        double rs = cylinder.getVolume();
        double expected = 20 * Math.PI;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testCheckCylinder() {
        assertTrue(cylinder.checkCylinder());
    }

    @Test
    public void testCheckCylinderFalse() {
        assertFalse(new Cylinder(0, 5).checkCylinder());
        assertFalse(new Cylinder(2, 0).checkCylinder());
        assertFalse(new Cylinder(-2, -5).checkCylinder());
    }

    @Test
    public void testGetDiameter() {
        double rs = cylinder.getDiameter();
        double expected = 4;
        assertEquals(expected, rs, 0.0001);
    }

    @Test
    public void testSetSide() {
        Cylinder c = new Cylinder();
        c.setRadius(3);
        c.setHeight(6);

        double expectedRadius = 3;
        double expectedHeight = 6;

        assertEquals(expectedRadius, c.getRadius(), 0.0001);
        assertEquals(expectedHeight, c.getHeight(), 0.0001);
    }
}
