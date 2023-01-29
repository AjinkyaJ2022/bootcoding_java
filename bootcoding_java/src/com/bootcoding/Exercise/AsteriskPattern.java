package com.bootcoding.Exercise;

public class AsteriskPattern {
    public static void main(String[] args) {
        int a;
        a=4;
        for (int i=0;i<a;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
