package com.bootcoding.model;

import java.util.HashSet;
import java.util.Set;

public class SetExample3 {
    public static void main(String[] args) {
        Set<User> userSet= new HashSet<User>();
        userSet.add(new User("Ram","Kumar","9890436981","ram@yopmail.com"));
        userSet.add(new User("Dev","Raj","9890436981","dev@yopmail.com"));
        userSet.add(new User("Dev","Raj","9890436981","dev@yopmail.com"));
        userSet.add(new User("Banti","Chapke","9890436981","dev@yopmail.com"));

        userSet.forEach(System.out::println);
    }
}
