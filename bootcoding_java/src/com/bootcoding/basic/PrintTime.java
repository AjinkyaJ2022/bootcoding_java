package com.bootcoding.basic;

import java.sql.Time;

public class PrintTime {
    public static void PrintTime(int hour,int minute){
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }

    public static void main(String[] args) {
        int hour=11;
        int minute=59;
        PrintTime(hour,minute);
    }
}
