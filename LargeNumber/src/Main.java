
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        String num1 = sc.nextLine().trim();
        System.out.println("Enter number 2:");
        String num2 = sc.nextLine().trim();
        LargeNumber n1 = new LargeNumber(num1);
        LargeNumber n2 = new LargeNumber(num2);
        LargeNumber sum = n1.add(n2);
        LargeNumber mul = n1.multiply(n2);
        System.out.println("Kq: " + sum);
        System.out.println("Mul: " + mul);
    }
}