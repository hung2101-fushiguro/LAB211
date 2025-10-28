package controller;

import common.Validation;
import model.Candidates;
import model.Experience;
import model.Fresher;
import model.Intern;

import java.util.ArrayList;

public class CandidateManager {
    private ArrayList<Candidates> list = new ArrayList<>();

    public void CraeteCandidate(int type){
        while(true){
            String id = Validation.getString("Enter ID:");
            String firstName = Validation.getString("Enter FirstName:");
            String lastName = Validation.getString("Enter LastName:");
            int birthDate = Validation.getBirthDate("Enter Birth Date:");
            String phone = Validation.getPhoneNumber("Enter phone number:");
            String address = Validation.getString("Enter Address:");
            String email = Validation.getEmail("Enter email");
            Candidates candidates = null;
            switch (type){
                case 0:{
                    int expInYear = Validation.getInt("Enter year of experience(0-15):", 0, 15);
                    String proSkill = Validation.getString("Enter pro skill:");
                    candidates = new Experience(id,firstName,lastName,birthDate,phone,address,email,expInYear,proSkill);
                    break;
                }
                case 1:{
                    String gradDate = Validation.getString("Enter Graduation Date:");
                    String gradRank = Validation.getGraduationRank("Enter Graduation Rank:");
                    String educationName = Validation.getString("Enter the education name:");
                    candidates = new Fresher(id,firstName,lastName,birthDate,phone,address,email,gradDate,gradRank,educationName);
                    break;
                }
                case 2:{
                    String major = Validation.getString("Enter Major:");
                    String semester = Validation.getString("Enter semester:");
                    String uniName = Validation.getString("Enter University name:");
                    candidates = new Intern(id,firstName,lastName,birthDate,phone,address,email,major,semester,uniName);
                    break;
                }
            }
            list.add(candidates);
            System.out.println("Add successful!");

            if(!Validation.getYesNo("Do you want to continue(Y/N)")){
                break;
            }
        }
        System.out.println("\n--- All candidates created ---");
        display();
    }
    private void display(){
        System.out.println("List of candidates:");
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Candidates c : list) {
            if (c instanceof Experience) {
                System.out.println(c.getFirstName() + " " + c.getLastName());
            }
        }
        System.out.println("===========FRESHER CANDIDATE============");
        for (Candidates c : list) {
            if (c instanceof Fresher) {
                System.out.println(c.getFirstName() + " " + c.getLastName());
            }
        }
        System.out.println("===========INTERN CANDIDATE============");
        for (Candidates c : list) {
            if (c instanceof Intern) {
                System.out.println(c.getFirstName() + " " + c.getLastName());
            }
        }
    }
}
