package threeDimension;

public class Tetrahedron extends threeDimensionShape{
    private double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    @Override
    double getVolume() {
        return (Math.sqrt(2) / 12.0) * Math.pow(edge, 3);
    }

    @Override
    public double getArea() {
        return Math.pow(edge,2) * Math.sqrt(3);
    }

    @Override
    public void showResult() {
        System.out.println("Edge: " + edge);
        System.out.println("Area: " + getArea());
        System.out.println("Volume: " + getVolume());
    }
}
