package com.com.daodao_01;

/**
 * ArrayList构造和添加
 */

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

//        System.out.println(array.add("hello"));

        array.add("hello");
        array.add("world");
        array.add("hahaha");

        array.add(1, "mamaipi");
        array.add(3, "3");
//        array.add(6,"hehe");
        System.out.println("array:" + array);
    }
}
