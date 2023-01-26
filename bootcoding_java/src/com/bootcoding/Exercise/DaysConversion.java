package com.bootcoding.Exercise;

public class DaysConversion {
    public static void main(String[] args) {
        int days =1329;
        int years;
        int weeks;
        years=(days/365);
        weeks=(days%365)/7;
        days  = days - ((years * 365) + (weeks * 7));

        System.out.println("Years: "+years);
        System.out.println("Weeks: "+weeks);
        System.out.println("Days: "+days);
    }
}
