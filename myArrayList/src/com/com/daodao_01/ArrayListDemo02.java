package com.com.daodao_01;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("zhangsan");
        arrayList.add("lisi");
        arrayList.add("wangwu");

        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            System.out.println(s);
        }
    }
}
