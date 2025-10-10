/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package courseDao;

import model.Course;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface ICourseDao {

    void insertCourse(Course course) throws SQLException;

    List<Course> selectAllCourse();

    List<Course> getCourseByName(String course_name) throws SQLException;

    List<Course> getCourseByMode(String mode) throws SQLException;

    boolean updateCourse(Course course) throws SQLException;

    boolean deleteCourseById(String id) throws SQLException;
    
}
