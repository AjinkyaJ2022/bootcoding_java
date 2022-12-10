package com.bootcoding.basic;

public class MissingNumber {
    public static void main(String[] args) {
        int a[]={1,2,3,5,6};
        int n=6;
        int idealSum=(n * (n+1))/2;
        int sum= calculatesum(a);

        int missingNumber= idealSum - sum;
        System.out.println("missing number");

    }
    public static int calculatesum(int[] a){
        int sum=0;
        for (int n:a){
            sum +=n;
        }
        return sum;
    }
}
