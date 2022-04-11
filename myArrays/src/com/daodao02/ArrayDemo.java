package com.daodao02;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};

        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序hou:");
        System.out.println(Arrays.toString(arr));

    }
}
