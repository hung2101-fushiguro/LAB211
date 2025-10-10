/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import courseDao.CourseDao;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import model.Course;

/**
 *
 * @author DELL
 */
public class test {

    public static void main(String[] args) throws SQLException {
        CourseDao cd = new CourseDao();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*** Course Management ***");
            System.out.println("1. Add online course/ offline course");
            System.out.println("2. Print all online course / offline course");
            System.out.println("3. Print all course");
            System.out.println("4. Search information base on course name");
            System.out.println("5. Update Course");
            System.out.println("6. Delete Course");
            System.out.println("7. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("Enter Course Id:");
                    String courseID = sc.nextLine().trim().toUpperCase();
                    System.out.println("Enter course name:");
                    String courseName = sc.nextLine().trim();
                    System.out.println("Enter credits:");
                    int credits = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter begin date (yyyy-mm-dd):");
                    String beginDateStr = sc.nextLine().trim();
                    System.out.println("Enter end date (yyyy-mm-dd):");
                    String endDateStr = sc.nextLine().trim();
                    System.out.println("Enter course mode:");
                    String mode = sc.nextLine().trim().toLowerCase();
                    Date beginDate = Date.valueOf(beginDateStr);
                    Date endDate = Date.valueOf(endDateStr);
                    Course course = new Course(courseID, courseName, credits, beginDate, endDate, mode);
                    try {
                        cd.insertCourse(course);
                        System.out.println("Add successfully!");
                    } catch (Exception e) {
                        System.out.println("Insert failed!");
                        e.printStackTrace();
                    }
                }
                break;

                case 2: {
                    try {
                        System.out.println("Enter mode of course(Online, Offline)");
                        String mode = sc.nextLine().trim().toLowerCase();
                        List<Course> course = cd.getCourseByMode(mode);
                        if (course != null && !course.isEmpty()) {
                            System.out.printf("%-10s | %-40s | %-7s | %-12s | %-12s | %-10s%n",
                                    "ID", "Name", "Credits", "Begin", "End", "Mode");
                            System.out.println("-----------------------------------------------------------------------------------------------");

                            for (Course c : course) {
                                System.out.printf("%-10s | %-40s | %-7d | %-12s | %-12s | %-10s%n",
                                        c.getCourseId(),
                                        c.getCourseName(),
                                        c.getCredits(),
                                        c.getBeginDate(),
                                        c.getEndDate(),
                                        c.getMode());
                            }

                        } else {
                            System.out.println("Course List is empty");
                        }

                    } catch (Exception e) {
                        System.out.println("Erorr");
                        e.printStackTrace();
                    }
                }
                break;
                case 3: {
                    try {
                        List<Course> course = cd.selectAllCourse();
                        if (course != null && !course.isEmpty()) {
                            System.out.printf("%-10s | %-40s | %-7s | %-12s | %-12s | %-10s%n",
                                    "ID", "Name", "Credits", "Begin", "End", "Mode");
                            System.out.println("-----------------------------------------------------------------------------------------------");

                            for (Course c : course) {
                                System.out.printf("%-10s | %-40s | %-7d | %-12s | %-12s | %-10s%n",
                                        c.getCourseId(),
                                        c.getCourseName(),
                                        c.getCredits(),
                                        c.getBeginDate(),
                                        c.getEndDate(),
                                        c.getMode());
                            }

                        } else {
                            System.out.println("Course List is empty");
                        }

                    } catch (Exception e) {
                        System.out.println("Erorr");
                        e.printStackTrace();
                    }
                }
                break;
                case 4: {
                    try {
                        System.out.println("Enter key to search:");
                        String key = sc.nextLine().trim().toLowerCase();
                        List<Course> course = cd.getCourseByName(key);
                        if (course != null && !course.isEmpty()) {
                            System.out.printf("%-10s | %-40s | %-7s | %-12s | %-12s | %-10s%n",
                                    "ID", "Name", "Credits", "Begin", "End", "Mode");
                            System.out.println("-----------------------------------------------------------------------------------------------");

                            for (Course c : course) {
                                System.out.printf("%-10s | %-40s | %-7d | %-12s | %-12s | %-10s%n",
                                        c.getCourseId(),
                                        c.getCourseName(),
                                        c.getCredits(),
                                        c.getBeginDate(),
                                        c.getEndDate(),
                                        c.getMode());
                            }

                        } else {
                            System.out.println("Course List is empty");
                        }

                    } catch (Exception e) {
                        System.out.println("Erorr");
                        e.printStackTrace();
                    }
                }
                break;
                case 5: {
                    System.out.println("Enter Course Id to update:");
                    String courseID = sc.nextLine().trim().toUpperCase();
                    System.out.println("Enter new course name:");
                    String courseName = sc.nextLine().trim();
                    System.out.println("Enter new credits:");
                    int credits = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new begin date (yyyy-mm-dd):");
                    String beginDateStr = sc.nextLine().trim();
                    System.out.println("Enter new end date (yyyy-mm-dd):");
                    String endDateStr = sc.nextLine().trim();
                    System.out.println("Enter new course mode (online/offline):");
                    String mode = sc.nextLine().trim().toLowerCase();
                    Date beginDate = Date.valueOf(beginDateStr);
                    Date endDate = Date.valueOf(endDateStr);
                    Course course = new Course(courseID, courseName, credits, beginDate, endDate, mode);
                    try {
                        boolean updated = cd.updateCourse(course);
                        if (updated) {
                            System.out.println("Update successfully!");
                        } else {
                            System.out.println("Update failed! (maybe Course ID not found)");
                        }
                    } catch (Exception e) {
                        System.out.println("Error while updating course!");
                        e.printStackTrace();
                    }

                }
                break;
                case 6: {
                    System.out.println("Enter Id need to delete:");
                    String id = sc.nextLine().trim().toUpperCase();
                    try {
                        boolean deleted = cd.deleteCourseById(id);
                        if (deleted) {
                            System.out.println("Deleted!");
                        } else {
                            System.out.println("Not found to delete or fail to delete");
                        }
                    } catch (Exception e) {
                        System.out.println("Error while updating course!");
                        e.printStackTrace();
                    }
                }
                break;
                case 7: {
                    System.out.println("Exit...");
                    return;
                }

                default: {
                    System.out.println("choice again!");
                }
            }
        }
    }
}
