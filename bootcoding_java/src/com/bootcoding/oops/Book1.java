package com.bootcoding.oops;

public class Book1 {
    String authorName;
    double quantity;
    int pages;
    double price;
    long id;

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getQuantity() {
        return quantity;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }


    public Book1(){
        System.out.println("Book object created");

    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public void setQuantity(double quantity){
        this.quantity=quantity;
    }
    public void setPages(int pages){
        this.pages=pages;
    }
    public void setPrice(double price){
        this.price=price;
    }
}
