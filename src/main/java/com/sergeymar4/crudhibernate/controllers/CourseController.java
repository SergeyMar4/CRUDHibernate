package com.sergeymar4.crudhibernate.controllers;

import com.sergeymar4.crudhibernate.models.Course;
import com.sergeymar4.crudhibernate.models.Teacher;
import com.sergeymar4.crudhibernate.repositories.CourseRepository;
import com.sergeymar4.crudhibernate.repositories.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class CourseController {
    private CourseRepository courseRepository;
    private TeacherRepository teacherRepository;

    public CourseController() {
        this.courseRepository = new CourseRepository();
    }

    public List<Course> getAll() {
        return courseRepository.getAll();
    }

    public Course getById(int id) {
        return courseRepository.getById(id);
    }

    public void create(String title, int teacher_id) {
        Course course = new Course();
        course.setTitle(title);
        course.setTeacher(teacherRepository.getById(teacher_id));
        courseRepository.create(course);
    }

    /* public void update(int id, String title) {
        courseRepository.update(id, title);
    }

    public void delete(int id) {
        courseRepository.delete(id);
    }
     */
}