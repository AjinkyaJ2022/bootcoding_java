package com.bootcoding.model;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListExample2 {
    public static void main(String[] args) {
        User user1= new User("Raja","Kumar","9890436981","test@yopmail.com");
        User user2= new User("Raja","Kumar","9890436981","test@yopmail.com");
        User user3= new User("Banti","Kumar","9890436981","test@yopmail.com");
        User user4= new User("Babu","Kumar","9890436981","test@yopmail.com");
        User user5= new User("Raju","Kumar","9890436981","test@yopmail.com");

        List<User> list= new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(2,user5);

        Collections.sort(list);

        //comparable com


        /* for(int index=0;index<list.size();index++){
            System.out.println(list.get(index));
        }*/

        //list.forEach(details-> System.out.println(details));
        //list.remove(user3);  remove using object name
        //list.remove(0); remove using index(index starting from zero)
        //list.removeAll(list);
        //System.out.println("===============================");
        //list.forEach(details-> System.out.println(details));

        //method reference
        list.forEach(System.out::println);

        // list.stream().distinct().filter(user -> user.getFirstName().equalsIgnoreCase("Raja"));
    }

    }
