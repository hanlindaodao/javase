package com.daodao_06;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("1");
        list.add("22");
        list.add("333");
        list.add("4444");
        list.add("55555");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("*********************");


        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            System.out.println(next);
        }

        System.out.println("*********************");

        while (listIterator.hasPrevious()) {
            String previous = listIterator.previous();
            System.out.println(previous);
        }

        System.out.println("*********************");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
