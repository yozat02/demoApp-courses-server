package com.example.demoAppCourses.dao;

import com.example.demoAppCourses.entity.Course;
import com.example.demoAppCourses.mapper.CourseRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;
import java.util.Map;

@Repository
public class CourseDaoImpl implements CourseDao {

    public CourseDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public List<Course> findAll() {
        return template.query("SELECT * FROM course",new CourseRowMapper());
    }

    @Override
    public Course findCourseById(String courseId) {
        String sql = "SELECT * FROM course WHERE courseId='"+courseId+"'";
        return template.query(sql,new CourseRowMapper()).get(0);
    }

    @Override
    public void InsertCourse(Course course) {
        final String sql = "INSERT INTO course(courseId,courseName,courseAuthor,courseAuthorMail,courseImageUrl) values(:courseId,:courseName,:courseAuthor,:courseAuthorMail,:courseImageUrl)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("courseId", course.getCourseId())
                .addValue("courseName", course.getCourseName())
                .addValue("courseAuthor", course.getCourseAuthor())
                .addValue("courseAuthorMail", course.getCourseAuthorMail())
                .addValue("courseImageUrl",course.getCourseImageUrl());
        template.update(sql,param, holder);
    }

    @Override
    public void UpdateCourse(Course course) {
        final String sql = "UPDATE course SET courseName=:courseName,courseAuthor=:courseAuthor,courseAuthorMail=:courseAuthorMail,courseImageUrl=:courseImageUrl WHERE courseId=:courseId";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("courseId", course.getCourseId())
                .addValue("courseName", course.getCourseName())
                .addValue("courseAuthor", course.getCourseAuthor())
                .addValue("courseAuthorMail", course.getCourseAuthorMail())
                .addValue("courseImageUrl",course.getCourseImageUrl());
        template.update(sql,param,holder) ;
    }

    @Override
    public void DeleteCourse(String courseId) {
        final String sql = "Delete FROM course WHERE courseId=:courseId";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("courseId",courseId);
        template.update(sql,param,holder) ;
    }
}
