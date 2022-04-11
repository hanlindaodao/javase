package com.daodao04;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * - Arrays工具类中有一个静态方法：
 *
 *   - public static <T> List<T> asList(T... a)：返回由指定数组支持的固定大小的列表
 *   - 返回的集合不能做增删操作，可以做修改操作
 *
 * - List接口中有一个静态方法：
 *
 *   - public static <E> List<E> of(E... elements)：返回包含任意数量元素的不可变列表
 *   - 返回的集合不能做增删改操作
 *
 * - Set接口中有一个静态方法：
 *
 *   - public static <E> Set<E> of(E... elements) ：返回一个包含任意数量元素的不可变集合
 *   - 在给元素的时候，不能给重复的元素
 *   - 返回的集合不能做增删操作，没有修改的方法
 */

public class GenericDemo {
    public static void main(String[] args) {

        // public static <T> List<T> asList(T... a)：返回由指定数组支持的固定大小的列表
        List<String> list = Arrays.asList("hello", "world", "java");
        // 不可以增删，可以改
//        list.add("add");
//        list.remove("hello");
        list.set(1, "daodao");
        System.out.println(list);

        // public static <E> List<E> of(E... elements)：返回包含任意数量元素的不可变列表
        List<String> listOf = List.of("hello", "world", "java");
        // 增删改都不可以
//        listOf.add("add");
//        listOf.remove("hello");
//        listOf.set(1, "hi");

        // public static <E> Set<E> of(E... elements) ：返回一个包含任意数量元素的不可变集合
        Set<String> set = Set.of("hello", "world", "java");
        // 不可以增删，没有修改的方法set，因为没有下标
//        set.add("add");
//        set.remove("hello");
        System.out.println(set);

        // 不可以有重复
//        Set<String> set2 = Set.of("hello", "world", "java", "hello");
//        System.out.println(set2);


        System.out.println(listOf);
    }
}
