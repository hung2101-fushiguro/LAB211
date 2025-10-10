/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computerprogram;

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
        do {

            System.out.println("========= Calculator Program =========");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            System.out.println("Please choice one option:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("----- Normal Calculator -----");
                    System.out.println("Enter a number:");
                    double num1 = sc.nextDouble();
                    Calculator cal = new Calculator(num1);

                    while (true) {
                        System.out.println("Enter operator:");
                        String op = sc.next();

                        if (op.equals("=")) {
                            System.out.println("Result :" + cal.getMemory());
                            break;
                        } else if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                            System.out.println("Enter a number:");
                            double num2 = sc.nextDouble();
                            cal.calculate(num2, op);
                            System.out.println("Memory:" + cal.getMemory());
                        } else {
                            System.out.println("...");
                        }
                    }
                }
                break;
                case 2: {
                    System.out.println("----- BMI Calculator -----");
                    double height;
                    while (true) {
                        System.out.print("Enter Height(cm): ");
                        if (sc.hasNextDouble()) {
                            height = sc.nextDouble();
                            break;
                        } else {
                            System.out.println("BMI is digit");
                            sc.next();
                        }
                    }
                    double weight;
                    while (true) {
                        System.out.print("Enter Weight(kg): ");
                        if (sc.hasNextDouble()) {
                            weight = sc.nextDouble();
                            break;
                        } else {
                            System.out.println("BMI is digit");
                            sc.next();
                        }
                    }
                    Bmi bmi = new Bmi(height, weight);
                    double calbmi = bmi.bmiCalculate();
                    System.out.println("BMI Number:" + calbmi);
                    if (calbmi < 19 && calbmi > 0) {
                        System.out.println("BMI Status: Under-standard ");
                    } else if (calbmi >= 19 && calbmi < 25) {
                        System.out.println("BMI Status: Standard");
                    } else if (calbmi >= 25 && calbmi < 30) {
                        System.out.println("BMI Status: Overweigh");
                    } else if (calbmi >= 30 && calbmi < 40) {
                        System.out.println("BMI Status: Fat - should lose weight");
                    } else {
                        System.out.println("BMI Status: Very fat - should lose weight immediately");
                    }
                }
                break;
            }
        } while (choice < 3 && choice > 0);
    }

}
