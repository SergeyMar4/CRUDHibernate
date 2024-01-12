package com.sergeymar4.crudhibernate.controllers;

import com.sergeymar4.crudhibernate.models.Teacher;
import com.sergeymar4.crudhibernate.repositories.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherController {
    private TeacherRepository teacherRepository;

    public TeacherController() {
        this.teacherRepository = new TeacherRepository();
    }

    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

    public Teacher getById(int id) {
        return teacherRepository.getById(id);
    }

   /* public void update(int id, String firstName, String lastName, int age, String specialization) {
        teacherRepository.update(id, firstName, lastName, age, specialization);
    }

    public void delete(int id) {
        teacherRepository.delete(id);
    }
     */

    public void create(String firstName, String lastName, int age, String specialization) {
        Teacher teacher = new Teacher();
        teacher.setAge(age);
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setSpecialization(specialization);
        teacherRepository.create(teacher);
    }
}
