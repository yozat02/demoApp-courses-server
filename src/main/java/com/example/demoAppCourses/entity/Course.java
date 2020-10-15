package com.example.demoAppCourses.entity;


public class Course {
    String courseId;
    String courseName;
    String courseAuthor;
    String courseAuthorMail;
    String courseImageUrl;

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

    public String getCourseAuthor() {
        return courseAuthor;
    }

    public void setCourseAuthor(String courseAuthor) {
        this.courseAuthor = courseAuthor;
    }

    public String getCourseAuthorMail() {
        return courseAuthorMail;
    }

    public void setCourseAuthorMail(String courseAuthorMail) {
        this.courseAuthorMail = courseAuthorMail;
    }

    public String getCourseImageUrl() {
        return courseImageUrl;
    }

    public void setCourseImageUrl(String courseImageUrl) {
        this.courseImageUrl = courseImageUrl;
    }
    public Course() {

    }
}
