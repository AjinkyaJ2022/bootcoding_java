package com.bootcoding.dsa;

public class SumOf1Darray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int sum=0;
        int b[]=new int[nums.length];
        for (int i=0; i<nums.length; i++){
            sum=sum+nums[i];
            b[i]=sum;

        }

        for (int x: b){
            System.out.println(x);
        }
    }
}
