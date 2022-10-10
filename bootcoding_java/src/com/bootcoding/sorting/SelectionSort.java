package com.bootcoding.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={100,30,70,40,55};
        int n=a.length;
        int min_index=0;

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (a[j]<a[min_index])
                    min_index=j;
            }
            int temp=a[min_index];
            a[min_index]=a[i];
            a[i]=temp;
        }
        for (int i=0; i<n;i++){
            System.out.print(a[i] +" ");
        }

    }
}
