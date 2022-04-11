package com.daodao_03;

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入反转前的字符串:");
        String line = sc.nextLine();

        String reversal = reversal(line);

        System.out.println("反转后的字符串为:");
        System.out.println(reversal);
    }

    public static String reversal(String str) {
        String rStr = "";
        for (int i = 0; i < str.length(); i++) {
            rStr += str.charAt(str.length() - i - 1);
        }
        return rStr;
    }
}
