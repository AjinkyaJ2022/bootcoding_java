package com.bootcoding.model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample1 {
    public static void main(String[] args) {
        User user1= new User("Raja","Kumar","9890436981","test@yopmail.com");
        User user2= new User("Rani","Kumar","9890436981","test@yopmail.com");
        User user3= new User("Banti","Kumar","9890436981","test@yopmail.com");
        User user4= new User("Babu","Kumar","9890436981","test@yopmail.com");

        List<User> list= new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);



        //for each loop
        /*for(User user:list){
            System.out.println(user);
        }*/

        //using Iterator interface
        /*Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println(user);
        }*/

        //for each method
        list.forEach(detail-> System.out.println(detail));
    }
}
