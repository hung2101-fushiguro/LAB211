/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrix;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========= Matrix Calculator =========");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                case "2":
                case "3":
                    int r1 = inputInt(sc, "Enter Row Matrix 1: ");
                    int c1 = inputInt(sc, "Enter Column Matrix 1:  ");
                    Matrix m1 = new Matrix(r1, c1);
                    fillMatrix(sc, m1, "Matrix 1");

                    int r2 = inputInt(sc, "Enter Row Matrix 2: ");
                    int c2 = inputInt(sc, "Enter Column Matrix 2: ");
                    Matrix m2 = new Matrix(r2, c2);
                    fillMatrix(sc, m2, "Matrix 2");

                    Matrix result = null;
                    if (choice.equals("1")) {
                        result = m1.additionMatrix(m2);
                    } else if (choice.equals("2")) {
                        result = m1.subtractionMatrix(m2);
                    } else if (choice.equals("3")) {
                        result = m1.multiplicationMatrix(m2);
                    }

                    if (result != null) {
                        System.out.println("Solution:");
                        result.displayMatrix();
                    } else {
                        System.out.println("Invalid");
                    }
                    break;

                case "4":
                    System.out.println("Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }
    }

    private static int inputInt(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digit!");
            }
        }
    }

    private static void fillMatrix(Scanner sc, Matrix m, String name) {
        System.out.println("Enter " + name + ":");
        for (int i = 0; i < m.row; i++) {
            for (int j = 0; j < m.col; j++) {
                while (true) {
                    System.out.print("[" + i + "][" + j + "]: ");
                    try {
                        m.data[i][j] = Double.parseDouble(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Values of matrix must be the number");
                    }
                }
            }
        }
    }
}
