package com.daodao_05;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();

        Student s2 = new Student("a");
        s2.show();

        Student s3 = new Student(12);
        s3.show();

        Student s4 = new Student("asdf", 123);
        s4.show();
    }
}
