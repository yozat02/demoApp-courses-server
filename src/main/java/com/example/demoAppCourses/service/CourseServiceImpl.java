package com.example.demoAppCourses.service;

import com.example.demoAppCourses.dao.CourseDao;
import com.example.demoAppCourses.dao.CourseDaoImpl;
import com.example.demoAppCourses.entity.Course;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Component
public class CourseServiceImpl implements CourseService {
    @Resource
    CourseDao courseDao ;

    @Override
    public List<Course> findAll(){
        return courseDao.findAll() ;
    }

    @Override
    public void AddCourse(Course course) {
         courseDao.InsertCourse(course) ;
    }

    @Override
    public Course findCourseById(String id) {
        return courseDao.findCourseById(id) ;
    }

    @Override
    public void updateCourse(Course course) {
        courseDao.UpdateCourse(course);
    }

    @Override
    public void deleteCourse(String courseId) {
        courseDao.DeleteCourse(courseId);
    }
}
