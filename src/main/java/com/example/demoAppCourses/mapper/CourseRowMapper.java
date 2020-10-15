package com.example.demoAppCourses.mapper;

import com.example.demoAppCourses.entity.Course;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseRowMapper implements RowMapper<Course> {
    @Override
    public Course mapRow(ResultSet resultSet, int i) throws SQLException {
        Course course = new Course() ;
        course.setCourseId(resultSet.getString("courseId"));
        course.setCourseName(resultSet.getString("courseName"));
        course.setCourseAuthor(resultSet.getString("courseAuthor"));
        course.setCourseAuthorMail(resultSet.getString("courseAuthorMail")) ;
        course.setCourseImageUrl(resultSet.getString("courseImageUrl"));


        return course;
    }
}
