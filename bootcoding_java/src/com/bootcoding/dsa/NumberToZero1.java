package com.bootcoding.dsa;

public class NumberToZero1 {
    public static void main(String[] args) {
        NumberToZero1 b=new NumberToZero1();
        int res =b.numberOfSteps(14);
        System.out.println(res);
    }
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }

            count++;
        }
        return count;
    }
}
