package com.daodao_02;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);

        System.out.println(s.name + "," + s.age);

        s.name = "a";
        s.age = 123;

        System.out.println(s.name + "," + s.age);

        s.study();
        s.doHomework();
    }
}
