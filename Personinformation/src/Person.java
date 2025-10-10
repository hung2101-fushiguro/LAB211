import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String id;
    private String fullName;
    private String phoneNumber;
    private int yearOfBirth;
    private String major;

    public Person() {
        this.id = "";
        this.fullName = "";
        this.phoneNumber = "";
        this.yearOfBirth = 0;
        this.major = "";
    }

    public Person(String id, String fullName, String phoneNumber, int yearOfBirth, String major) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.yearOfBirth = yearOfBirth;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void header(){
        System.out.printf("%-10s | %-20s | %-12s | %-10s | %-30s%n", "ID", "Name", "Phone", "BirthYear", "Major");
    }
    public void display() {
        System.out.printf("%-10s | %-20s | %-12s | %-10d | %-30s", id, fullName, phoneNumber, yearOfBirth, major);
    }
}
