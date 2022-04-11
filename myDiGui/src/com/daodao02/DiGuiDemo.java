package com.daodao02;

import java.util.Scanner;

/**
 * 递归求阶乘
 */

public class DiGuiDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input:");
        int n = sc.nextInt();
        System.out.println(jiecheng(n));
    }

    public static int jiecheng(int n) {
        if (n == 1) {
            return 1;
        }else{
            return n*jiecheng(n-1);
        }
    }
}
