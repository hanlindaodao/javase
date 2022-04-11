package com.daodao_origin;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("--------Welcome--------");
            System.out.println("1.add");
            System.out.println("2.delete");
            System.out.println("3.change");
            System.out.println("4.look");
            System.out.println("5.exit");
            System.out.println("Please input");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            System.out.println("-----------------------");
            switch (line) {
                case "1":
//                    System.out.println("add student");
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("delete student");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("update student");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("look student");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("thanks");
//                    break;
                    System.exit(0);
            }
        }
    }

/*
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("sid:");
        String sid = sc.nextLine();
        System.out.println("name:");
        String name = sc.nextLine();
        System.out.println("age:");
        String age = sc.nextLine();
        System.out.println("address:");
        String address = sc.nextLine();

        Student s = new Student(sid, name, age, address);
        array.add(s);
        System.out.println("add succeed");
    }
*/

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        String sid;

        while (true) {
            System.out.println("sid:");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("sid has used");
            } else {
                break;
            }
        }

        System.out.println("name:");
        String name = sc.nextLine();
        System.out.println("age:");
        String age = sc.nextLine();
        System.out.println("address:");
        String address = sc.nextLine();

        Student s = new Student(sid, name, age, address);
        array.add(s);
        System.out.println("add succeed");
    }


    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("please add first");
            return;
        }

        System.out.println("sid\tname\tage\taddrss");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }

/*
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please input sit:");
        String sid = sc.nextLine();

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
            }
        }
        System.out.println("delete succeed");
    }
*/

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please input sit:");
        String sid = sc.nextLine();

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
//                int index = i;
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("not find");
        } else {
            array.remove(index);
            System.out.println("delete succeed");
        }

    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please input the sid of update:");
        String sid = sc.nextLine();

        System.out.println("new name:");
        String name = sc.nextLine();
        System.out.println("new age:");
        String age = sc.nextLine();
        System.out.println("new address:");
        String address = sc.nextLine();

        Student s = new Student(sid, name, age, address);
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                array.set(i, s);
            }
        }
        System.out.println("update succeed");
    }

    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}
