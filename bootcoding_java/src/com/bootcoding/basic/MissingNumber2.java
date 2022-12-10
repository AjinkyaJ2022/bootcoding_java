package com.bootcoding.basic;

import java.util.Arrays;

public class MissingNumber2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};

        int N = 12;
        int idealSum = (N * (N + 1)) / 2;
        int sum = Arrays.stream(numbers).sum();

        int missingNumber = idealSum - sum;
        System.out.println(missingNumber);
    }
}
