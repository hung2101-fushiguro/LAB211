package twoDimetion;

public class Circle extends twoDimensionShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public void showResult() {
        System.out.println("Circle:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }
}
