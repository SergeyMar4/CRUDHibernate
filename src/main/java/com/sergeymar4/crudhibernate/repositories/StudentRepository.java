package com.sergeymar4.crudhibernate.repositories;

import com.sergeymar4.crudhibernate.models.Student;
import com.sergeymar4.crudhibernate.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    public Student getById(int id) {
        Student student = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            student = session.get(Student.class, id);
        }

        return student;
    }

    public List<Student> getAll() {
        List<Student> students = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            students = session.createQuery("from Student").list();
        }

        return students;
    }

    public void create(Student student) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        }
    }

    public void update(Student student) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.getTransaction();
            session.update(student);
            transaction.commit();
        }
    }
}
