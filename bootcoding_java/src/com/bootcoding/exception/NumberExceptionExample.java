package com.bootcoding.exception;

public class NumberExceptionExample {
    public static void main(String[] args) {
        NumberExceptionExample e=new NumberExceptionExample();
        int abc = e.convertToInteger("123");
        System.out.println(abc);


    }
    public int convertToInteger(String n){
        try {
            int l=2/1;
            int m=Integer.parseInt(n);
            return m;
        }catch (NumberFormatException ex){
            System.err.println("Please Provide Integer Number");
            ex.printStackTrace();
        }catch (Exception ex) {
//            System.err.println("Please Provide Integer Number");
            ex.printStackTrace();
        }
        finally {
            System.out.println("I will Execute");
        }
        return 0;

    }
}
