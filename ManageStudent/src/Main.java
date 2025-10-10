
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int choice;
        Method mt = new Method();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("===Student Manager===");
            System.out.println("1.Show List Student");
            System.out.println("2.Add Student");
            System.out.println("3.Find Student");
            System.out.println("4.Sort Student");
            System.out.println("5.Update Student");
            System.out.println("6.Delete Student");
            System.out.println("7.Repot");
            System.out.println("8.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    mt.disp();
                    break;
                }
                case 2: {
                    mt.createStudent();
                    break;
                }
                case 3: {
                    mt.findByName();
                    break;
                }
                case 4: {
                    mt.sortByName();
                    break;
                }
                case 5: {
                    System.out.println("Enter the id need update:");
                    String id = sc.nextLine().trim();
                    System.out.println("Enter the new name:");
                    String name = sc.nextLine().trim();
                    System.out.println("Enter the new semester:");
                    int semester = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the new course:");
                    String course = sc.nextLine().trim();
                    mt.updateById(id, name, semester, course);
                    break;
                }
                case 6:{
                    System.out.println("Enter the id need to delete:");
                    String id = sc.nextLine().trim();
                    mt.removeById(id);
                    System.out.println("Deleted!");
                    break;
                }
                case 7:{
                    mt.report();
                    break;
                }
                case 8:{
                    System.out.println("Exit...");
                    return;
                }
                default:{
                    System.out.println("Chose again!");
                }
            }
        }
    }
}