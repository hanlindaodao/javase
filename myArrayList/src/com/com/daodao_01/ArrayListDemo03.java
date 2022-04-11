package com.com.daodao_01;

/**
 * ArrayList常用方法
 */

import java.util.ArrayList;

public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("guapi");

//        System.out.println(arrayList.remove("world"));
//        System.out.println(arrayList.remove("world"));

//        System.out.println(arrayList.remove(1));
//        System.out.println(arrayList.remove(3));

//        System.out.println(arrayList.set(1, "haha"));
//        System.out.println(arrayList.set(3, "haha"));

//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(3));

        System.out.println(arrayList.size());

        System.out.println("arrayList:" + arrayList);

    }
}
