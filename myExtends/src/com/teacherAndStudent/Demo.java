package com.teacherAndStudent;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("t1");
        t1.setAge(1);
        System.out.println("tName: " + t1.getName());
        System.out.println("tAge: " + t1.getAge());

        Teacher t2 = new Teacher("t2", 2);
        System.out.println("tName: " + t2.getName());
        System.out.println("tAge: " + t2.getAge());

        t1.teach();
        t2.teach();

        Student s1 = new Student();
        s1.setName("s1");
        s1.setAge(1);
        System.out.println("sName: " + s1.getName());
        System.out.println("sAge: " + s1.getAge());

        Student s2 = new Student("s2", 2);
        System.out.println("sName: " + s2.getName());
        System.out.println("sAge: " + s2.getAge());

    }
}
