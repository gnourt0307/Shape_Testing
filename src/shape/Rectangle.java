package shape;


/**
 *
 * @author THAYCACAC
 */
public class Rectangle{

    private double width;
    private double length;
    private double height;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.height = 1;
    }

    public Rectangle(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getVolume() {
        return width * length * height;
    }

    public boolean checkRectangle() {
        if (Double.isNaN(width)) {
            return false;
        }
        if (Double.isNaN(length)) {
            return false;
        }
        if (Double.isNaN(height)) {
            return false;
        }
        if (Double.isInfinite(width)) {
            return false;
        }
        if (Double.isInfinite(length)) {
            return false;
        }
        if (Double.isInfinite(height)) {
            return false;
        }
        if (width <= 0) {
            return false;
        }
        if (length <= 0) {
            return false;
        }
        if (height <= 0) {
            return false;
        }
        return true;
    }
}
