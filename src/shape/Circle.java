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
        if (Double.isNaN(radius)) {
            return false;
        }
        if (Double.isInfinite(radius)) {
            return false;
        }
        if (radius <= 0) {
            return false;
        }
        if (radius < Double.MIN_NORMAL) {
            return false;
        }
        if (Double.isInfinite(getPerimeter())) {
            return false;
        }
        if (getArea() == 0) {
            return false;
        }
        if (Double.isInfinite(getArea())) {
            return false;
        }
        if (getVolume() == 0) {
            return false;
        }
        if (Double.isInfinite(getVolume())) {
            return false;
        }
        return true;
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
