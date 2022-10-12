package com.bootcoding.oops.interfaces;

public class Hero implements cycle{

    @Override
    public void gettype() {
        System.out.println("hero cycle");
    }

    @Override
    public void getgear() {
        System.out.println("hero cycle with gear");

    }

    @Override
    public void getwogear() {
        System.out.println("hero cycle without gear");

    }
}
