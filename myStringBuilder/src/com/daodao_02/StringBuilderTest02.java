package com.daodao_02;

import java.util.Scanner;

public class StringBuilderTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个需要反转的字符串:");
        String line = sc.nextLine();

        StringBuilder sb = new StringBuilder(line);
        String rline = sb.reverse().toString();
        System.out.println("反转后的字符串为:");
        System.out.println(rline);
    }
}
