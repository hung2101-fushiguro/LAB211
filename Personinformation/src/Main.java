import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Validation val = new Validation();
        Person p = new Person();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        while(true){
            System.out.println("*** Information Management ***");
            System.out.println("1. Teacher");
            System.out.println("2. Student");
            System.out.println("3. Person");
            System.out.println("4. Exit");
            System.out.println("You choice:");
            switch (choice){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    p.setId(val.inputID());
                    p.setFullName(val.inputName());
                    p.setPhoneNumber(val.inputPhoneNumber());
                }
            }
        }
    }
}