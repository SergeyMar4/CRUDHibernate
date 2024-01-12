package com.sergeymar4.crudhibernate.controllers;

import com.sergeymar4.crudhibernate.models.Student;
import com.sergeymar4.crudhibernate.repositories.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private StudentRepository studentRepository;

    public StudentController() {
        this.studentRepository = new StudentRepository();
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

    /* public void update(int id, String firstName, String lastName, int age) {
        studentRepository.update(id, firstName, lastName, age);
    }

    public void delete(int id) {
        studentRepository.delete(id);
    }
     */
}