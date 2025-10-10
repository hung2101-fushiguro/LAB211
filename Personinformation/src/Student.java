public class Student extends Person {
    private int yearOfAdmission;
    private int entranceEnglishScore;

    public Student() {
        super();
        this.yearOfAdmission = 0;
        this.entranceEnglishScore = 0;
    }

    public Student(String id, String fullName, String phoneNumber, int yearOfBirth, String major, int yearOfAdmission, int entranceEnglishScore) {
        super(id, fullName, phoneNumber, yearOfBirth, major);
        this.yearOfAdmission = yearOfAdmission;
        this.entranceEnglishScore = entranceEnglishScore;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getEntranceEnglishScore() {
        return entranceEnglishScore;
    }

    public void setEntranceEnglishScore(int entranceEnglishScore) {
        this.entranceEnglishScore = entranceEnglishScore;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" | %-10d | %-3d%n", yearOfAdmission, entranceEnglishScore);
    }
}
