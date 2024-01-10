package com.sergeymar4.crudhibernate.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="students")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "age")
    private int age;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String LastName;
    @Column(name = "specialization")
    private String specialization;
    @OneToMany(mappedBy = "courses")
    private ArrayList<Course> courses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", courses=" + courses +
                '}';
    }
}
