package com.sergeymar4.crudhibernate.repositories;

import com.sergeymar4.crudhibernate.models.Course;
import com.sergeymar4.crudhibernate.models.Teacher;
import com.sergeymar4.crudhibernate.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {

    public Teacher getById(int id) {
        Teacher teacher = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            teacher = session.get(Teacher.class, id);
        }

        return teacher;
    }

    public List<Teacher> getAll() {
        List<Teacher> teachers = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            teachers = session.createQuery("from Teacher").list();
        }

        return teachers;
    }

    public void create(Teacher teacher) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(teacher);
            transaction.commit();
        }
    }

    public void update(Teacher teacher) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(teacher);
            transaction.commit();
        }
    }

    public List<Course> getAllCourseByTeacher(int teacher_id) {
        List<Course> courses = new ArrayList<>();

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("from Course where teacher.id=:teacher_id");
            query.setParameter("teacher_id", teacher_id);
            courses = query.list();
        }

        return courses;
    }
}