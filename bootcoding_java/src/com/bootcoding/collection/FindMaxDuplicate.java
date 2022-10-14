package com.bootcoding.collection;

import java.security.Key;
import java.util.HashMap;

public class FindMaxDuplicate {
    public static void main(String[] args) {
        int a[]={10,20,10,30,20,30,40};
        FindMaxDuplicate f2=new FindMaxDuplicate();
        int p= f2.findMaxDuplicate(a);
        System.out.println(p);
    }
    public int findMaxDuplicate(int[] arr){
        HashMap<Integer,Integer> countMap=new HashMap<>();
        int max=0;
        for (int i=0; i<arr.length; i++){
            if (countMap.containsValue(arr[i])){
                int key =countMap.get(arr[i]);
                countMap.put(arr[i],key+1);
            }
            else {
                countMap.put(arr[i],1);
            }
        }
        for (Integer Key:countMap.keySet()){
            if (Key<1){
                max++;
            }
        }
        return max;
    }

}
