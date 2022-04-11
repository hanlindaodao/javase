package com.com.daodao_01;

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("a1", 12);
        Student s2 = new Student("a2", 23);
        Student s3 = new Student("a3", 34);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println(student);
        }
    }
}
