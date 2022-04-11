package com.daodao_03;

import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        System.out.println("please input:");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("bigCount:" + bigCount);
        System.out.println("smallCount:" + smallCount);
        System.out.println("numberCount:" + numberCount);
    }
}
