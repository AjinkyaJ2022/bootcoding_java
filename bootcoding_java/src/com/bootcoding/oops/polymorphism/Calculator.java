package com.bootcoding.oops.polymorphism;

public class Calculator {

    public int add (int a, int b){
        int d =a+b;
        return d;
    }
    public int add (int[] arr){
        int sum=0;
        for (int i=0; i< arr.length;i++){
            sum= sum+arr[i];
        }
        return sum;

    }
    public double add (int f, double e){
        double g=f+e;
        return g;
    }
}
