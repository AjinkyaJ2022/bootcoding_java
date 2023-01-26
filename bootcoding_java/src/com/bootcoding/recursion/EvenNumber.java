package com.bootcoding.recursion;

public class EvenNumber {
    public static void print(int n){
        if(n==0) {
            return;
        }else{
            int lastDigit=n%10;
            int result=n/10;
            if (lastDigit %2 ==0){
                return;

            }
        }
    }
}
