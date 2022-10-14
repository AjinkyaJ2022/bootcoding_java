package com.bootcoding.basic;

public class Hello4 {
    public static void main(String[] args) {
        int hour=11;
        int minute=59;
        System.out.print("The current time is ");
        System.out.println(hour);
        System.out.print(":");
        System.out.println(minute);
        System.out.println(".");


        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 +minute);

        System.out.print("Fraction of the hours that has passed: ");
        System.out.println(minute/60);

        System.out.print("Persent of the hour that has passed: ");
        System.out.println(minute * 100 /60);
    }


}
