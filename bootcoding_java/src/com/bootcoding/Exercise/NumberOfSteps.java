package com.bootcoding.Exercise;

public class NumberOfSteps {
    public static void main(String[] args) {
        int n=12;
        int a=0;

        for (int i=100;i<n;i++){
            if (n%2==0){
                n=n/2;
                a++;
            }else {
                n=n-1;
                a++;
                if (n==0);
                break;
            }
        }
        System.out.println(a);
    }
}
