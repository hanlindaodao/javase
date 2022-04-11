package com.daodao_02;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1};

        String reversal = arrayToString(arr);
        System.out.println(reversal);
    }

    public static String arrayToString(int[] arr) {
        String s = "";

        StringBuilder sb = new StringBuilder(s);

        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.deleteCharAt(sb.length()-1).deleteCharAt(sb.length()-1);
        sb.append("]");

        return sb.toString();
    }
}
