package shape;

/**
 *
 * @author THAYCACAC
 */
public class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public boolean checkCylinder() {
        return radius > 0 && height > 0;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
