package com.bootcoding.collection;

import com.bootcoding.basic.Marker;
import com.bootcoding.oops.Book1;

import java.awt.print.Book;
import java.util.HashMap;

public class BookCollection {
    HashMap<Long, Book1> books= new HashMap<>();
    public void addBook(Book1 b){
        books.put(b.getId(),b);
    }
    public void printBook1(){
        for (long key: books.keySet()){
            Book1 b=books.get(key);
            System.out.println("Id;"+b.getId());
            System.out.println("Auther Name;"+b.getAuthorName());
            System.out.println("Quantity;"+b.getQuantity());
            System.out.println("Pages;"+b.getPages());
            System.out.println("Price;"+b.getPrice());
        }
    }

    public static void main(String[] args) {
        BookCollection b1=new BookCollection();

        for (int i=1;i<10;i++){
            Book1 book=new Book1();
            book.setId(i);
            book.setAuthorName("Arihent"+i);
            book.setQuantity(10);
            book.setPages(220);
            book.setPrice(i*20.5);
            b1.addBook(book);
        }
        b1.printBook1();
    }
}
