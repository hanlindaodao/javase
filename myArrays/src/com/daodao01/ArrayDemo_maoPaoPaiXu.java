package com.daodao01;

public class ArrayDemo_maoPaoPaiXu {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};

        System.out.println("排序前:");
        System.out.println(arrayToString_builder(arr));
/*
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println("第一次比较后:");
        System.out.println(arrayToString_builder(arr));

        for (int i = 0; i < arr.length - 1 -1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println("第二次比较后:");
        System.out.println(arrayToString_builder(arr));*/

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("排序后:");
        System.out.println(arrayToString_builder(arr));
    }

    public static String arrayToString_builder(int[] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i]).append(", ");
//                sb.append(", ");
            } else {
                sb.append(arr[i]).append("]");
//                sb.append("]");
            }
        }

        return sb.toString();
    }

    public static String arrayToString(int[] arr) {
        String str = "[";

        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i];
            str += " ";
        }
        str = str + arr[arr.length - 1] + "]";

        return str;
    }
}
