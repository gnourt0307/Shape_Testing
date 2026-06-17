package shape;


/**
 *
 * @author THAYCACAC
 */
public class Rectangle extends Shape {

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

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
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

    public double getDiagonal() {
        return Math.sqrt(width * width + length * length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
