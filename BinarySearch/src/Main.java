import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of array:");
        int n = sc.nextInt();
        binarySearch bs = new binarySearch(n);
        bs.addArray();
        bs.Sort();
        System.out.println("The array:");
        bs.disp();
        System.out.println("Enter the number need to find:");
        int x = sc.nextInt();
        int result = bs.Search(x);
        if(result == -1){
            System.out.println("Not found !");
        }else System.out.println("Find at index " + result);
    }
}