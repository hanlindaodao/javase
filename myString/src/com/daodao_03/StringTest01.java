package com.daodao_03;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        String username = "username";
        String password = "password";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("please input the username:");
            String inputUsername = sc.nextLine();

            System.out.println("please input the password");
            String inputPassword = sc.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("success");
                break;
            } else {
                if (2-i ==0) {
                    System.out.println("lock");
                } else {
                    System.out.println("false and you have " + (2-i) + " least");
                }
            }
        }


    }
}
