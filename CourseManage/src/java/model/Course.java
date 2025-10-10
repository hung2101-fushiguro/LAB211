/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Course {
    private String courseId;
    private String courseName;
    private int credits;
    private Date beginDate;
    private Date endDate;
    private String mode;

    public Course() {
    }

    public Course(String courseId, String courseName, int credits, Date beginDate, Date endDate, String mode) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.mode = mode;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName=" + courseName + ", credits=" + credits + ", beginDate=" + beginDate + ", endDate=" + endDate + ", mode=" + mode + '}';
    }

    
    
}
