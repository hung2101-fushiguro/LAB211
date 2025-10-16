/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courseDao;

import dao.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Course;

/**
 *
 * @author DELL
 */
public class CourseDao implements ICourseDao {

    private static final String INSERT_COURSE = "INSERT INTO Course (course_id, name_course, credits, begin_date, end_date, mode) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String GET_COURSES_BY_MODE = "SELECT * FROM Course WHERE mode = ?";
    private static final String GET_ALL_COURSE = "SELECT * FROM Course";
    private static final String GET_COURSE_BY_NAME = "SELECT * FROM Course WHERE name_course LIKE ?";
    private static final String UPDATE_COURSE = "UPDATE Course SET name_course = ?, credits = ?, begin_date = ?, end_date = ?, mode = ? WHERE course_id = ?";
    private static final String DELETE_COURSE = "DELETE FROM Course WHERE course_id = ? ";

    @Override
    public void insertCourse(Course course) throws SQLException {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(INSERT_COURSE);
            ps.setString(1, course.getCourseId());
            ps.setString(2, course.getCourseName());
            ps.setInt(3, course.getCredits());
            ps.setDate(4, new Date(course.getBeginDate().getTime()));
            ps.setDate(5, new Date(course.getEndDate().getTime()));
            ps.setString(6, course.getMode());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Course> selectAllCourse() {
        List<Course> course = new ArrayList<>();
        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(GET_ALL_COURSE);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Course courses = new Course();
                courses.setCourseId(rs.getString("course_id"));
                courses.setCourseName(rs.getString("name_course"));
                courses.setCredits(rs.getInt("credits"));
                courses.setBeginDate(rs.getDate("begin_date"));
                courses.setEndDate(rs.getDate("end_date"));
                courses.setMode(rs.getString("mode"));
                course.add(courses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return course;
    }

    @Override
    public List<Course> getCourseByName(String course_name) throws SQLException {
        List<Course> list = new ArrayList<>();
        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(GET_COURSE_BY_NAME);
            ps.setString(1, "%" + course_name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Course course = new Course();
                course.setCourseId(rs.getString("course_id"));
                course.setCourseName(rs.getString("name_course"));
                course.setCredits(rs.getInt("credits"));
                course.setBeginDate(rs.getDate("begin_date"));
                course.setEndDate(rs.getDate("end_date"));
                course.setMode(rs.getString("mode"));
                list.add(course);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Course> getCourseByMode(String mode) throws SQLException {
        List<Course> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(GET_COURSES_BY_MODE);
            ps.setString(1, mode);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Course course = new Course();
                course.setCourseId(rs.getString("course_id"));
                course.setCourseName(rs.getString("name_course"));
                course.setCredits(rs.getInt("credits"));
                course.setBeginDate(rs.getDate("begin_date"));
                course.setEndDate(rs.getDate("end_date"));
                course.setMode(rs.getString("mode"));
                list.add(course);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public boolean updateCourse(Course course) throws SQLException {
        boolean rowUpdated = false;
        try (Connection con = DBConnection.getConnection()) {
            if (con != null) {
                PreparedStatement ps = con.prepareStatement(UPDATE_COURSE);
                ps.setString(1, course.getCourseName());
                ps.setInt(2, course.getCredits());
                ps.setDate(3, new Date(course.getBeginDate().getTime()));
                ps.setDate(4, new Date(course.getEndDate().getTime()));
                ps.setString(5, course.getMode());
                ps.setString(6, course.getCourseId());
                rowUpdated = ps.executeUpdate() > 0;
            }
        }
        return rowUpdated;
    }

    @Override
    public boolean deleteCourseById(String id) throws SQLException {
        //boolean deleted = false;
        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(DELETE_COURSE);
            ps.setString(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
