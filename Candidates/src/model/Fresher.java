package model;

public class Fresher extends Candidates {
    private String graduationDate;
    private String graduationRank;
    private String educationName;

    public Fresher(String candidateId, String firstName, String lastName, int birthDate, String phoneNumber, String address, String email, String graduationDate, String graduationRank, String educationName) {
        super(candidateId, firstName, lastName, birthDate, phoneNumber, address, email, 1);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.educationName = educationName;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }
}
