package com.bootcoding.basic;

import java.util.Date;

public class Marker {
    String company;
    String colour;
    String type;
    double price;
    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void fillMarker(){
        System.out.println("Marker has been filled");
    }
    public Marker(){
        System.out.println("marker object created");
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Date st=new Date();
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
        Date et=new Date();
        System.out.println(et.getTime()-st.getTime()+" ms ");
    }
}
