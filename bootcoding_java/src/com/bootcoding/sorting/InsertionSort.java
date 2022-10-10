package com.bootcoding.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int a[]={100,30,70,40,55};
        int n=a.length;
        for (int i=1; i<n;i++){
            int key=a[i];
            int j=i-1;
            while (j>=0 && a[j]>key){
                a[j+1]=a[j];
                j=j-1;
            }
            j=j+1;
            a[j]=key;
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}
