package com.anli01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        for (int i = 0; i < 3; i++) {
            addStudent(array);
        }

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println("name:" + s.getName() + " age:" + s.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("name:");
        String name = sc.nextLine();

        System.out.println("age:");
        String age = sc.nextLine();

        Student s = new Student(name, age);
        array.add(s);
    }
}
