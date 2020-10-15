package com.example.demoAppCourses.service;


import com.example.demoAppCourses.entity.Course;

import java.util.List;


public interface CourseService {
    public List<Course> findAll();
    public void AddCourse(Course course);
    public Course findCourseById(String id);
    public void updateCourse(Course course);
    public void deleteCourse(String courseId);
}
