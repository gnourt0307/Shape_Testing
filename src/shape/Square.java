package shape;

/**
 *
 * @author THAYCACAC
 */
public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getVolume() {
        return side * side * side;
    }

    public boolean checkSquare() {
        if (Double.isNaN(side)) {
            return false;
        }
        if (Double.isInfinite(side)) {
            return false;
        }
        if (side <= 0) {
            return false;
        }
        if (side < Double.MIN_NORMAL) {
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
