package com.teacherAndStudent;

public class Student extends Person{
    public Student() {}

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("student study");
    }
}
