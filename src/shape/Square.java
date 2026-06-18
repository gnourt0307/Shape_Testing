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

    public double getDiagonal() { return side * Math.sqrt(2);}

    public boolean checkSquare() {
        if (Double.isNaN(side)) {
            return false;
        } else if (Double.isInfinite(side)) {
            return false;
        } else if (side <= 0) {
            return false;
        } else if (Double.isInfinite(getPerimeter())) {
            return false;
        } else if (Double.isInfinite(getDiagonal())) {
            return false;
        } else if (getArea() == 0) {
            return false;
        } else if (Double.isInfinite(getArea())) {
            return false;
        } else if (getVolume() == 0) {
            return false;
        } else if (Double.isInfinite(getVolume())) {
            return false;
        } else {
            return true;
        }
    }
}