package com.bootcoding.basic;

public class Array2 {
    public static void main(String[] args) {
        String d[] = {"Apple", "Avocado", "Grapes", "Pineapple", "Watermilon"};
        String[] c = new String[5];
        c[0] = "Apple";
        c[1] = "Avocado";
        c[2] = "Grapes";
        c[3] ="Pineapple";
        c[4] = "Watermilon";
        for (int i = 4; i >= 0; --i)
            System.out.println(c[i]);

    }
}
