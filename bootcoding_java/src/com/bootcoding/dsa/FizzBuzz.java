package com.bootcoding.dsa;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n=3;
        List<String> arr =new ArrayList<>();
        for (int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                System.out.println("Fizz Buzz");
                arr.add("Fizz Buzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
                arr.add("Fizz");

            }
            else if (i%5==0){
                System.out.println("Buzz");
                arr.add("Buzz");

            }
            else {
                System.out.println(" "+i);
                arr.add(" " +i);

            }
        }
    }
}
