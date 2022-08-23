package com.bootcoding.basic;

public class Array1 {
    public static void main(String[] args) {
        long[] b={10,15,20,25,30};
        int[] c=new int[4];
        c[0]=10;
        b[1]=15;
        b[2]=20;
        b[3]=25;

        b[4]=30;
        for (int i=0; i<b.length;i++)
            System.out.println(b[i]);

    }
}
