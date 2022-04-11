package com.daodao_02;

public class StudentDemo03 {
    public static void main(String[] args) {
        Student s1 = new Student();
//        s1.name = 'a1';
        s1.name = "a1";
        s1.age = 1;
        System.out.println(s1.name + "," + s1.age);

        Student s2 = s1;
        s2.name = "a2";
        s2.age = 2;

        System.out.println(s1.name + "," + s1.age);
        System.out.println(s2.name + "," + s2.age);

    }
}
