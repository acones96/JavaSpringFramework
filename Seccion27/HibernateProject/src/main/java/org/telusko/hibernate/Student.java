package org.telusko.hibernate;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @Column(name = "id")
    private int rollno;
    private String name;
    private int age;
    @OneToOne
    private Laptop laptop;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
