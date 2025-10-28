package model;

public class Intern extends Candidates {
    private String major;
    private String semester;
    private String universityName;

    public Intern(String candidateId, String firstName, String lastName, int birthDate, String phoneNumber, String address, String email, String major, String semester, String universityName) {
        super(candidateId, firstName, lastName, birthDate, phoneNumber, address, email, 2);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
