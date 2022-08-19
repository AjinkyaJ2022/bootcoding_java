package com.bootcoding.basic;

public class Laptop {
    String colour;
    int size;
    double price;
    String unit;

    public String getColour() {
        return colour;
    }
    void start(){
        System.out.println("start");
    }

    public static void main(String[] args) {
        Laptop hp = new Laptop();
        Laptop asus = new Laptop();
        hp.colour ="RED";
        hp.size =15;
        hp.price=10000.50;
        String hpColour = hp.getColour();
        hp.start();
        System.out.println(hpColour);
    }
}
