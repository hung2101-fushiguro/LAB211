package threeDimension;

public class Cube extends threeDimensionShape{
    private double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    @Override
    double getVolume() {
        return Math.pow(edge, 3);
    }

    @Override
    public double getArea() {
        return 6 * edge * edge;
    }

    @Override
    public void showResult() {
        System.out.println("Cube:");
        System.out.println("Edge:" + edge);
        System.out.println("Area:" + getArea());
        System.out.println("Volume:" + getVolume());
    }
}
