package com.test;

import com.daodao_01.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void init(){
        System.out.println("init...");
    }

    @After
    public void close() {
        System.out.println("close...");
    }

    @Test
    public void testAdd() {
//        System.out.println("我被执行了");
        Calculator c = new Calculator();
//        System.out.println(c.add(1,3));
        int result = c.add(1, 3);
        System.out.println("test");
        Assert.assertEquals(4,result);
    }
}
