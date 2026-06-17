package shape;

/**
 *
 * @author THAYCACAC
 */
public class Square extends Shape {

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
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

    public double getDiagonal() {
        return side * Math.sqrt(2);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
