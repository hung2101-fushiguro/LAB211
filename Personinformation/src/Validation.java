import java.util.Calendar;
import java.util.Scanner;

public class Validation {
    Scanner sc = new Scanner(System.in);
    public String inputID(){
        while(true){
            System.out.println("Enter ID:");
            String input = sc.nextLine().trim();
            if(input.matches("\\d{6}")){
                return input;
            }
            System.out.println("Id must be 6 digits!");
        }
    }
    public String inputName(){
        while(true){
            System.out.println("Enter full name:");
            String name = sc.nextLine().trim();
            if(name.matches("[a-zA-Z ]+")){
                return name;
            }
            System.out.println("Fullname is alphabet and blanks!");
        }
    }

    public String inputPhoneNumber(){
        while(true){
            System.out.println("Enter phone number:");
            String phone = sc.nextLine().trim();
            if(phone.matches("\\d{10}")){
                return phone;
            }
            System.out.println("Phone number is 10 digits!");
        }
    }

    public int inputYearOfBirth(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        while(true){
            System.out.println("Enter year of birth:");
            try{
                int year = Integer.parseInt(sc.nextLine().trim());
                if(year < currentYear){
                    return year;
                }
                System.out.println("Year of birth must be before current year!");
            }catch(NumberFormatException e){
                System.out.println("Invalid! Must be number!");
            }
        }
    }

    public String major(){
        while(true){
            System.out.println("Enter major:");
            String major = sc.nextLine().trim();
            if(major.length() <= 30){
                return major;
            }
            System.out.println("Major is a string no more than 30 characters!");
        }
    }

}
