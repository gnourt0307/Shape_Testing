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
        if (Double.isNaN(a)) {
            return false;
        }
        if (Double.isNaN(b)) {
            return false;
        }
        if (Double.isNaN(c)) {
            return false;
        }
        if (Double.isInfinite(a)) {
            return false;
        }
        if (Double.isInfinite(b)) {
            return false;
        }
        if (Double.isInfinite(c)) {
            return false;
        }
        if (a <= 0) {
            return false;
        }
        if (b <= 0) {
            return false;
        }
        if (c <= 0) {
            return false;
        }
        if (a + b <= c) {
            return false;
        }
        if (b + c <= a) {
            return false;
        }
        if (a + c <= b) {
            return false;
        }
        return true;
    }

    public String getType() {
        if (!checkTriangle()) {
            return "Invalid";
        }
        if (a == b && b == c) {
            return "Equilateral";
        }

        boolean isIsosceles = a == b || b == c || a == c;
        double longest = a;
        double side1 = b;
        double side2 = c;

        if (b > longest) {
            longest = b;
            side1 = a;
            side2 = c;
        }
        if (c > longest) {
            longest = c;
            side1 = a;
            side2 = b;
        }

        double longestSquare = longest * longest;
        double otherSquares = side1 * side1 + side2 * side2;

        if (Math.abs(longestSquare - otherSquares) < 0.0001) {
            if (isIsosceles) {
                return "Right Isosceles";
            }
            return "Right Scalene";
        }

        if (longestSquare > otherSquares) {
            if (isIsosceles) {
                return "Obtuse Isosceles";
            }
            return "Obtuse Scalene";
        }

        if (isIsosceles) {
            return "Acute Isosceles";
        }
        return "Acute Scalene";
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
