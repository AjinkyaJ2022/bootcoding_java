package com.bootcoding.practice.method;

public class palindromNumber {
    public static int getPalindrom(int n){
        int r=0;
        int temp=n;
        while(n!=0){
            int d=n/10;
            r=r*10+(n%10);
            n=d;
        }
        return r;
    }

    public static void main(String[] args) {
        int p=getPalindrom(243);
        if(p==243){
            System.out.println("the number is palindrom");
        }else{
            System.out.println("the number is not a palindrom");
        }
    }
}
