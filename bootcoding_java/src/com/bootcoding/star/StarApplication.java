package com.bootcoding.star;

import java.util.Calendar;
import java.util.Date;

public class StarApplication {
    public static void main(String[] args) {
        long st=new Date().getTime();
        long st2 =  System.nanoTime();
        //System.out.println('*');
        int a;
        a=3;
        for (int i=0; i<a; i++){
            //System.out.print('*');

            for (int j=0; j<i+1; j++){
                System.out.print( '*');
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------------------------------");
        int b;
        b=3;
        for (int i=0; i<b; i++){
            //System.out.print('*');

            for (int j=0; j<(b-i); j++){
                System.out.print( '*');
            }
            System.out.println();
        }
        int c;
        c=3;
        for (int i=0; i<c; i++){
            //System.out.print('*');
            for (int j=0; j<(b-i); j++){
                System.out.print( '*');
            }
            for (int n=0; n<=i*2; n++){
                System.out.print(" ");
            }

            for (int k=0; k<(b-i); k++){
                System.out.print( '*');
            }

            System.out.println();
        }
        Date et=new Date();
        long nanoSeconds = System.nanoTime() - st2;
        System.out.println(nanoSeconds / 1000 +" microseconds ");
    }

}
