package com.bootcoding.practice.method;

public class armstrongNumber {
    public static int getarmstrong(int n){
        int r=0;
        int temp=n;
        int sum=0;
        sum=r*r*r;
        while(n!=0){
            int d=n/10;
            r=sum+(n%10);
            n=d;
        }
        return r;
    }

    public static void main(String[] args) {
        int p=getarmstrong(412);
        if(p==412){
            System.out.println("the number is armstrong");
        }else{
            System.out.println("the number is not a armstrong");
        }

    }
}
