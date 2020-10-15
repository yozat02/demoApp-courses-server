package com.example.demoAppCourses.controller;

import com.example.demoAppCourses.entity.Course;
import com.example.demoAppCourses.service.CourseService;
import com.example.demoAppCourses.service.CourseServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Resource
    CourseService courseService;
    @GetMapping("/all")
    public List<Course> findAll(){
        return courseService.findAll() ;
    }
    @GetMapping("/course")
    public Course findCourseById(@RequestParam String id){
        return courseService.findCourseById(id) ;
    }
    @PostMapping("/addCourse")
    public void addCourse(@RequestBody Course course){
        courseService.AddCourse(course);
    }
    @PostMapping("/updateCourse")
    public void updateCourse(@RequestBody Course course){
        courseService.updateCourse(course) ;
    }
    @DeleteMapping("/deleteCourse")
    public void deleteCourse(@RequestParam String courseId){
        courseService.deleteCourse(courseId);
    }
}
