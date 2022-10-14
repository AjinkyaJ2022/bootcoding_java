package com.bootcoding.recursion;

public class RecursionExample {
    public static void main(String[] args) {
        RecursionExample n1=new RecursionExample();
        n1.printNumber(10);
    }
    public void printNumber(int n){
        if(n<1){
            return;
        }
        System.out.println(n);


        printNumber(n-1);



    }
}












