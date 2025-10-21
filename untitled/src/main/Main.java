package main;

import shape.Shape;
import threeDimension.Cube;
import twoDimetion.Circle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Cube(12);
        shapes[1] = new Circle(10);
        for(Shape s : shapes){
            s.showResult();
        }
    }
}
