package com.bootcoding.basic;

public class Array4 {
    public static void main(String[] args) {
        int a[] = new int[8];
        //   int a[]={10,15,20,25,35,75,80,95};
        a[0] = 10;
        a[1] = 15;
        a[2] = 20;
        a[3] = 25;
        a[4] = 35;
        a[5] = 75;

        for (int i = 7; i >= 0; --i)
            System.out.println(a[i] + " ");

        int b[] = {10, 15, 20, 25, 35, 75 ,95};
        int temp = 80;
        boolean found= false;
        for (int i = 0; i < b.length; i++) {

            if (temp == b[i]) {
                found = true;
            }
        }

        if(found==true){
            System.out.println("element present");

        }
        else{
            System.out.println("element not present");
        }



    }
}