package com.bootcoding.Exercise;

public class FindMaximumValue {
    public static void main(String[] args) {
        int first=25;
        int second=35;
        int third=15;
        if (first>second && first>third){
            System.out.println("Maximum value of three integers is: "+first);
        } else if (second>first && second>third) {
            System.out.println("Maximum value of three integers is: "+second);
        }
        else
        System.out.println("Maximum value of three integers is: "+third);
    }
}
