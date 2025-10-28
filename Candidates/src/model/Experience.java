package model;

public class Experience extends Candidates {
    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(String candidateId, String firstName, String lastName, int birthDate, String phoneNumber, String address, String email, int expInYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDate, phoneNumber, address, email, 0);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
