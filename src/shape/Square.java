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
        return side > 0;
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
