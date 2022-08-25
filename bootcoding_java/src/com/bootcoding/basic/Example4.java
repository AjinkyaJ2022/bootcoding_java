package com.bootcoding.basic;

public class Example4 {

    public String toUpperCase(String s) {

        String str1=s.toUpperCase();
        return str1;
    }

    public static void main(String[] args) {

        Example4 e4=new Example4();
        String res=e4.toUpperCase("Hello");
        System.out.println(res);
    }
}
