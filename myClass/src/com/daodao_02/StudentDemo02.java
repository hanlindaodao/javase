package com.daodao_02;

public class StudentDemo02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "a1";
        s1.age = 1;
        System.out.println(s1.name + "," + s1.age);
        s1.study();
        s1.doHomework();

        Student s2 = new Student();
        s2.name = "a2";
        s2.age = 2;
        System.out.println(s2.name + "," + s2.age);
        s2.study();
        s2.doHomework();
    }
}
