package shape;
/**
 *
 * @author THAYCACAC
 */
public class Circle{

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

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
}
