package com.bootcoding.basic;

public class NewLine {

    public static void newline(){
        System.out.println();
    }
    public static void threeline(){
        newline();
        newline();
        newline();
    }

    public static void main(String[] args) {
        System.out.println("First line.");
        threeline();
        System.out.println("Second line.");
    }

}
