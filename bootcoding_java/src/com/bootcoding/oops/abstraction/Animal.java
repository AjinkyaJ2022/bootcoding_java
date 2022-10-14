package com.bootcoding.oops.abstraction;

public abstract class Animal {

    public void sleep(){
        System.out.println("I am Animal i am sleeping");
    }
    public void see(){
        System.out.println("I am looking");
    }
    public abstract void sound();
}
