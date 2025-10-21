package twoDimetion;

public class Square extends twoDimensionShape {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return edge * edge;
    }

    @Override
    public void showResult() {
        System.out.println("Square:");
        System.out.println("Square edge: " + edge);
        System.out.println("Area: " + getArea());
    }
}
