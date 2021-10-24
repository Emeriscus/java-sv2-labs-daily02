package Day02;

public class Rectangle {

    private double a;
    private double b;

    public Rectangle (double a, double b) {
        this.a =a;
        this.b =b;
    }
    public double calculateArea() {
        return a * b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
