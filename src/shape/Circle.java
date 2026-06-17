package shape;
/**
 *
 * @author THAYCACAC
 */
public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getVolume() {
        return 4.0 / 3 * Math.PI * radius * radius * radius;
    }

    public boolean checkCircle() {
        return radius > 0;
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
}
