package main;


import common.Validation;
import controller.CandidateManager;

public class Main {

    public static void main(String[] args) {
        CandidateManager manager = new CandidateManager();

        while (true) {

            System.out.println("\nCANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            int choice = Validation.getInt("(Please choose 1 to Create, 4 to Search, 5 to Exit): ", 1, 5);


            switch (choice) {
                case 1:
                    manager.CraeteCandidate(0);
                    break;
                case 2:
                    manager.CraeteCandidate(1);
                    break;
                case 3:
                    manager.CraeteCandidate(2);
                    break;
                case 4:
                    manager.searchCandidates();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
            }
        }
    }
}