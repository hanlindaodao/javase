package com.daodao_03;

public class Student {
    String name;
    //    int age;
    private int age;

    public void setAge(int a) {
//        age = a;
        if (a < 0 || a > 120) {
            System.out.println("cuo");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
