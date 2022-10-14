package com.bootcoding.basic;

public class StringEqual {
    public static void main(String[] args) {
        String name= "Bootcoding";
        String name2= new String("Bootcoding");
        String name3= name;

        if (name==name2){
            System.out.println("Address of Name and name2 both are same");
        }
        else {
            System.out.println("Address of Name and name2 both are not same");
        }
        if (name.equals(name2)){
            System.out.println("Refrence of Name and name2 both are same");
        }
        else {
            System.out.println("Refrence of Name and name2 both are not same");
        }
    }
}
