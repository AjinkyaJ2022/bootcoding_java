package com.bootcoding.oops.abstraction;

public class Dog extends Animal {
    public void sound(){
        System.out.println("bhoooo bhoooo");
    }
    public void sleep(){
        super.sleep();
        System.out.println("I am Dog I am sleeping");
    }
}
