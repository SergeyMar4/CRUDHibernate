package com.sergeymar4.crudhibernate.controllers;

import com.sergeymar4.crudhibernate.models.Student;

import java.util.ArrayList;

public class StudentController {
    private StudentController studentRepository;

    public StudentController() {
        this.studentRepository = new StudentController();
    }

    public ArrayList<Student> getAll() {
        return studentRepository.getAll();
    }

    public Student getById(int id) {
        return studentRepository.getById(id);
    }

    public void create(String firstName, String lastName, int age) {
        studentRepository.create(firstName, lastName, age);
    }

    public void update(int id, String firstName, String lastName, int age) {
        studentRepository.update(id, firstName, lastName, age);
    }

    public void delete(int id) {
        studentRepository.delete(id);
    }
}