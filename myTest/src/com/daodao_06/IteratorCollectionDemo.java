package com.daodao_06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorCollectionDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();

        coll.add("hello");
        coll.add("daodao");
        coll.add("songbi");
        coll.add("niubi");
        coll.add("hello");

        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
