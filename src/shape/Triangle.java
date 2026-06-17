package shape;


/**
 *
 * @author THAYCACAC
 */
public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;
    private double height;

    public Triangle() {
        this.height = 1;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = 1;
    }

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getVolume() {
        return getArea() * height;
    }

    public boolean checkTriangle() {
        return a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b;
    }

    public String getType() {
        if (!checkTriangle()) {
            return "Invalid";
        }
        if (a == b && b == c) {
            return "Equilateral";
        }
        if (a == b || b == c || a == c) {
            return "Isosceles";
        }
        return "Scalene";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
