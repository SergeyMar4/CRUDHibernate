package com.sergeymar4.crudhibernate.controllers;

import com.sergeymar4.crudhibernate.models.Student;
import com.sergeymar4.crudhibernate.repositories.CourseRepository;
import com.sergeymar4.crudhibernate.repositories.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private StudentRepository studentRepository;
    private CourseRepository courseRepository;

    public StudentController() {
        this.studentRepository = new StudentRepository();
        this.courseRepository = new CourseRepository();
    }

    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    public Student getById(int id) {
        return studentRepository.getById(id);
    }

    public void create(String firstName, String lastName, int age) {
        Student student = new Student();
        student.setAge(age);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        studentRepository.create(student);
    }

    public void addCourse(int student_id, int course_id) {
        studentRepository.addCourse(studentRepository.getById(student_id), courseRepository.getById(course_id));
    }

    public List<Student> getAllByFirstName(String firstName) {
        return studentRepository.getAllByFirstName(firstName);
    }
    /* public void update(int id, String firstName, String lastName, int age) {
        studentRepository.update(id, firstName, lastName, age);
    }

    public void delete(int id) {
        studentRepository.delete(id);
    }
     */
}