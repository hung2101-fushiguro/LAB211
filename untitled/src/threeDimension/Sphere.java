package threeDimension;

public class Sphere extends threeDimensionShape{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getVolume() {
        return (4/3) * 3.14 * Math.pow(radius, 3);
    }

    @Override
    public double getArea() {
        return 4 * 3.14 * radius * radius;
    }

    @Override
    public void showResult() {
        System.out.println("Radius:" + radius);
        System.out.println("Area:" + getArea());
        System.out.println("Volume:" + getVolume());
    }
}
