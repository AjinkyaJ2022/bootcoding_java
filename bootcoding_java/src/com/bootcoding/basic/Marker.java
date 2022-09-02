package com.bootcoding.basic;

public class Marker {
    String company;
    String colour;
    String type;
    double price;

    public void fillMarker(){
        System.out.println("Marker has been filled");
    }
    public Marker(){
        System.out.println("marker object created");
    }

    public static void main(String[] args) {
        Marker m1=new Marker();
        m1.company="Camlin";
        m1.colour="Blue";
        m1.type="White Board";
        m1.price=120.00;
        System.out.println(m1.company);
        System.out.println(m1.colour);
        System.out.println(m1.type);
        System.out.println(m1.price);

        Marker m2=new Marker();
        m2.company="Natraj";
        m2.colour="Red";
        m2.type="White Board";
        m2.price=130.00;
        System.out.println(m2.company);
        System.out.println(m2.colour);
        System.out.println(m2.type);
        System.out.println(m2.price);
    }
}
