package com.bootcoding.recursion;

public class Factrecursion {
    public long fact(int n){
        if (n==1){
            return 1;
        }
        return fact(n-1)*n;
    }

    public static void main(String[] args) {
        Factrecursion f1=new Factrecursion();
        long s = f1.fact(7);
        System.out.println(s);

    }
}
