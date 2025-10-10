/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaperimeter;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=====Calculator Shape Program=====");
            System.out.println("1. Rectangle");
            System.out.println("2. Triagle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.println("Choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    double width, length;
                    do {
                        System.out.println("Please input side width of Rectangle:");
                        width = sc.nextDouble();
                    } while (width <= 0);
                    do {
                        System.out.println("Please input length of Rectangle:");
                        length = sc.nextDouble();
                    } while (length <= 0);
                    Rectangle rect = new Rectangle(width, length);
                    rect.printResult();
                    break;
                }

                case 2: {
                    double a, b, c;
                    do {
                        System.out.println("Please input side A of Triangle:");
                        a = sc.nextDouble();
                    } while (a <= 0);
                    do {
                        System.out.println("Please input side B of Triangle:");
                        b = sc.nextDouble();
                    } while (b <= 0);
                    do {
                        System.out.println("Please input side C of Triangle:");
                        c = sc.nextDouble();
                    } while (c <= 0);
                    if (a + b > c && a + c > b && b + c > a) {
                        Triagle tri = new Triagle(a, b, c);
                        tri.printResult();
                    } else {
                        System.out.println("The triagle invalid!!");
                    }
                    break;
                }

                case 3: {
                    double r;
                    do {
                        System.out.println("Please input radius of Circle:");
                        r = sc.nextDouble();
                    } while (r <= 0);
                    Circle cir = new Circle(r);
                    cir.printResult();
                    break;
                }

                case 4: {
                    System.out.println("Exit...");
                    return;
                }
                default: {
                    System.out.println("choice again!");
                }
            }
        } //while (choice < 4 && choice > 0);
    }
}
