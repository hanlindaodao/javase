package com.daodao_03;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "aaa";
//        s.age = 12;
//        s.age = -12;
        s.setAge(30);

        s.show();
    }
}
