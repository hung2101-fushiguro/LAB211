public class Teacher extends Person {
    private int yearInProfession;
    private String contractType;
    private double salaryCoefficient;

    public Teacher() {
        super();
        this.yearInProfession = 0;
        this.contractType = "";
        this.salaryCoefficient = 0.0;
    }

    public Teacher(String id, String fullName, String phoneNumber, int yearOfBirth, String major, int yearInProfession, String contractType, double salaryCoefficient) {
        super(id, fullName, phoneNumber, yearOfBirth, major);
        this.yearInProfession = yearInProfession;
        this.contractType = contractType;
        this.salaryCoefficient = salaryCoefficient;
    }

    public int getYearInProfession() {
        return yearInProfession;
    }

    public void setYearInProfession(int yearInProfession) {
        this.yearInProfession = yearInProfession;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" | %-5d | %-6s | %-5.2f%n", yearInProfession, contractType, salaryCoefficient);
    }
}

