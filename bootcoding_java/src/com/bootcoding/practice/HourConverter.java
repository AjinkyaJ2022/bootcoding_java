package com.bootcoding.practice;

import java.util.Scanner;

public class HourConverter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter seconds : ");

        int seconds= in.nextInt();
        int c1=seconds % 60;
        int c2=seconds / 60;
        int c3=c2 % 60;
        c2=c2/60;
        System.out.print(c2+":"+c3+":"+c1);
        System.out.println("\n");
    }

}
