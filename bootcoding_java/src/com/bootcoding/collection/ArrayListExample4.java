package com.bootcoding.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample4 {
    public static void main(String[] args) {
        //ArrayList<Integer> num = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            num.add(i * 10 );
        }
        ArrayListExample4 e = new ArrayListExample4();
        e.reduceNumbersToZero(num);

    }
    public void reduceNumbersToZero(List<Integer> numbers){
        for (Integer num : numbers){
            int r = numberToZero(num);
            System.out.println(num + " number of steps to zero : " + r);
        }
    }
       public int  numberToZero(int n){
            int a=0;
           while(n != 0){
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = n - 1;
                }
                a++;
            }
            return a;
    }
}
