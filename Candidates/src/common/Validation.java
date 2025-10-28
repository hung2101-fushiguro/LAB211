package common;

import java.util.Calendar;
import java.util.Scanner;

public class Validation {
    private final static Scanner sc = new Scanner(System.in);
    public static String getString(String message){
        while(true){
            System.out.println(message);
            String input = sc.nextLine().trim();
            if(input.isEmpty()){
                System.out.println("Input can be empty!");
            }else{
                return input;
            }
        }
    }

    public static int getInt(String message, int min, int max){
        while(true){
            try{
                System.out.println(message);
                int input = Integer.parseInt(sc.nextLine().trim());
                if(input < min || input > max){
                    throw new NumberFormatException();
                }
                return input;
            }catch (NumberFormatException e){
                System.err.println("please input between " +min +max);
            }
        }
    }

    public static int getBirthDate(String message){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        while(true){
            int birthDate = getInt(message, 1900, currentYear);
            return birthDate;
        }
    }

    public static String getPhoneNumber(String message){
        while (true){
            String phone = getString(message);
            if(phone.matches("\\d{10,}")){//0816141366
                return phone;
            }else{
                System.out.println("Phone must be 10 character!");
            }
        }
    }

    public static String getEmail(String message){
        while(true){
            String email = getString(message);
            if(email.matches("^[A-Za-z0-9.+-_%]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")){
                return email;
            }else{
                System.out.println("Email must be in format :accountname@domain.com");
            }
        }
    }

    public static String getGraduationRank(String message){
        while(true){
            String rank = getString(message);
            if(rank.equalsIgnoreCase("Excellence") || rank.equalsIgnoreCase("Good") || rank.equalsIgnoreCase("Pair")||rank.equalsIgnoreCase("Poor")){
                return rank;
            }else{
                System.out.println("Rank must be one of Excellence, Good, Fair, Poor");
            }
        }
    }

    public static boolean getYesNo(String message) {
        while (true) {
            String input = getString(message);
            if (input.equalsIgnoreCase("Y")) {
                return true;
            } else if (input.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.err.println("Please enter 'Y' or 'N'.");
            }
        }
    }
}
