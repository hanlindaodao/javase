package com.daodao01;

import java.util.Arrays;

public class DiGuiDemo {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(f(20));
    }

    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }
}
