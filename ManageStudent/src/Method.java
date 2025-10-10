import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Method {
    public ArrayList<student> students;
    Scanner sc = new Scanner(System.in);

    public Method() {
        students = new ArrayList<>();
    }

    public void createStudent() {
        System.out.println("Enter number of students want to add:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String id, name, course;
            int semester;

            while (true) {
                System.out.println("Enter Student ID:");
                id = sc.nextLine().trim();

                System.out.println("Enter Student Name:");
                name = sc.nextLine().trim();

                System.out.println("Enter Semester:");
                semester = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Course:(Java, .Net, C/C++)");
                course = sc.nextLine().trim();

                if (isDuplicate(id, semester, course)) {
                    System.out.println(" Duplicate student (same ID + Semester + Course). Please re-enter!");
                } else {
                    students.add(new student(id, name, semester, course));
                    System.out.println(" Add successful!");
                    break; // nhập hợp lệ thì thoát while
                }
            }

            if (students.size() >= 3) {
                System.out.println("Do you want to continue (Y/N)?");
                String ans = sc.nextLine().trim();
                if (ans.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }
    }


    public void findByName() {
        if (students.isEmpty()) {
            System.out.println("No student in list!");
        }
        System.out.println("Enter the name to search:");
        String search = sc.nextLine().trim().toLowerCase();
        ArrayList<student> find = new ArrayList<>();
        for (student s : students) {
            if (s.getStudentName().toLowerCase().contains(search)) {
                find.add(s);
            }
        }
        if (find.isEmpty()) {
            System.out.println("Not found!");
        }
        System.out.printf("%-10s | %-20s | %-10s | %-10s%n", "ID", "Name", "Semester", "Course");
        for (student s : find) {
            System.out.printf("%-10s | %-20s | %-10s | %-10s%n", s.getStudentId(), s.getStudentName(), s.getSemester(), s.getCourseName());
        }
    }

    public void removeById(String id) {
        students.removeIf(s -> s.getStudentId().equalsIgnoreCase(id));
    }

    public void updateById(String id, String newName, int newSemester, String newCourse) {
        for (student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                s.setStudentName(newName);
                s.setSemester(newSemester);
                s.setCourseName(newCourse);
            }
        }
        disp();
    }

    public void report() {
        if (students.isEmpty()) {
            System.out.println("No student in list!");
            return;
        }

        // Đếm số khóa học theo studentName + courseName
        ArrayList<String> reportList = new ArrayList<>();
        for (student s : students) {
            String key = s.getStudentName() + " | " + s.getCourseName();
            if (!reportList.contains(key)) {
                int count = 0;
                for (student t : students) {
                    if (t.getStudentName().equalsIgnoreCase(s.getStudentName())
                            && t.getCourseName().equalsIgnoreCase(s.getCourseName())) {
                        count++;
                    }
                }
                System.out.println(key + " | " + count);
                reportList.add(key);
            }
        }
        sortByName();
    }

    public void sortByName() {
        students.sort(Comparator.comparing(student::getStudentName));
        disp();
    }

    public boolean isDuplicate(String id, int semester, String course) {
        for (student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id) && s.getSemester() == semester && s.getCourseName().equalsIgnoreCase(course)) {
                return true;
            }
        }
        return false;
    }


    public void disp() {
        if (students.isEmpty()) {
            System.out.println("No student in list!");
            return;
        }
        System.out.printf("%-10s | %-20s | %-10s | %-10s%n", "ID", "Name", "Semester", "Course");
        for (student s : students) {
            System.out.printf("%-10s | %-20s | %-10s | %-10s%n", s.getStudentId(), s.getStudentName(), s.getSemester(), s.getCourseName());
        }
    }
}
