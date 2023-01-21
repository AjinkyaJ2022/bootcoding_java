package com.bootcoding.Exercise;

public class armstrongNumber {
    public static int armstrong(int n){
        int r=2;
        int temp=n;
        int cube;
        int sum=0;
        while (n!=0){
            int d=n%10;
            r=n/10;
            n=d;
            cube=r*r*r;
            sum=sum+cube;
        }

        return sum;

    }

    public static void main(String[] args) {
            int p=armstrong(200);
            if(p==200){
                System.out.println("the number is armstrong");
            }else{
                System.out.println("the number is not a armstrong");
            }
    }
}
