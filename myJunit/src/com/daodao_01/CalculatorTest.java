package com.daodao_01;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        int result = c.add(1,2);
        System.out.println(result);

        int resultSub = c.sub(1,2);
        System.out.println(resultSub);
    }
}
