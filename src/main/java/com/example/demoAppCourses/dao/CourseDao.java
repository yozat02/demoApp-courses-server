package com.example.demoAppCourses.dao;

import com.example.demoAppCourses.entity.Course;

import java.util.List;

public interface CourseDao {
    List<Course> findAll() ;
    Course findCourseById(String courseId) ;
    void InsertCourse(Course course) ;
    void UpdateCourse(Course course) ;
    void DeleteCourse(String courseId) ;
}
