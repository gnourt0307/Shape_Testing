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
        return width > 0 && length > 0 && height > 0;
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
