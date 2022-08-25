package com.bootcoding.basic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Example4Test {

    @Test
    public void testCase() {
        Example4 e4=new Example4();
        String res=e4.toUpperCase("Hello");
        System.out.println(res);
        Assert.assertEquals("HELLO",e4.toUpperCase(res));
    }
}