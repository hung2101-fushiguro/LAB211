package twoDimetion;

import javax.xml.transform.Source;

public class Triagle extends twoDimensionShape {
    private double a, b, c;

    public Triagle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void showResult() {
        System.out.println("Triagle:");
        System.out.println("Edge a:" + a);
        System.out.println("Edge b:" + b);
        System.out.println("Edge c:" + c);
        System.out.println("Area:" + getArea());
    }
}
