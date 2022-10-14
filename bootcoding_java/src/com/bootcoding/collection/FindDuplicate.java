package com.bootcoding.collection;

import java.util.HashMap;

public class FindDuplicate {

    public static void main(String[] args) {
        int a[]={10,20,10,30,20,30,40};
        FindDuplicate f1=new FindDuplicate();
        int p= f1.findDuplicate(a);
        System.out.println(p);
    }


    public int findDuplicate(int[] arr){
        HashMap<Integer,Integer> countMap=new HashMap<>();
        int count=0;
        for (int i=0; i<arr.length; i++){
            if (countMap.containsKey(arr[i])){
                int value =countMap.get(arr[i]);
                countMap.put(arr[i],value+1);
            }
            else {
                countMap.put(arr[i],1);
            }
        }
        for (Integer value:countMap.values()){
            if (value>1){
                count++;
            }
        }
        return count;
    }



}
