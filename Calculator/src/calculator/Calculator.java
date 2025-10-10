/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author DELL
 */
public class Calculator {

    private double a, b, c;

    public Calculator(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public boolean checkOdd(double n) {
        return n % 2 != 0;
    }

    public boolean checkSquare(double n) {
        if (n < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public void dispNum(double n, double m) {
        double[] arr = {n, m};
        for (double x : arr) {
            System.out.println((checkOdd(x) ? "Number is Odd: " : "Number is Even: ") + x);
            if (checkSquare(x)) {
                System.out.println("Number is Perfect Square:" + x);
            }
        }
    }

    public void superLative() {
        if (a == 0) {
            System.out.println("Error");
        } else {
            double x = -b / a;
            System.out.println("Solution x = " + x);
        }
        dispNum(a, b);
    }

    public void Quadratic() {
        if (a == 0) {
            new Calculator(b, c).superLative();
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("No solution");
        } else if (delta == 0) {
            System.out.println("Double root: x = " + (-b / (2 * a)));
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
