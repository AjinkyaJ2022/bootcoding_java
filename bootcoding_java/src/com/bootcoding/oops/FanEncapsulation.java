package com.bootcoding.oops;

public class FanEncapsulation {

    private int speed;
    private int no_of_plates;
    private String colour;
    private double price;
    private String company;
    private int warranty;

   public FanEncapsulation(){

   }
   public void setSpeed(int speed){
       this.speed =speed;
   }
   public void setNo_of_plates(int n){
       this.no_of_plates=n;
   }
   public void setColour(String c){
       this.colour=c;
   }
    public void setPrice(double p){
        this.price=p;
    }
    public void setCompany(String co){
        this.company=co;
    }
    public void setWarranty(int w){
        this.warranty=w;
    }
    public int getSpeed(){
       return speed;
    }
    public int getNo_of_plates(){
        return no_of_plates;
    }
    public String getColour(){
        return colour;
    }
    public double getPrice(){
        return price;
    }
    public String getCompany(){
        return company;
    }
    public int getWarranty(){
        return warranty;
    }
}
