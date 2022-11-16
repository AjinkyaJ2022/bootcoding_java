package com.bootcoding.model;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {
    public static void main(String[] args) {
        Set<String> set= new HashSet<String>();
        set.add("Raja");
        set.add("Rani");
        set.add("Banti");
        set.add("Babu");
        set.add("Raja");
        set.add("Raja");

        //set.forEach(System.out::println); method reference
        set.forEach(s -> System.out.println(s)); //for each method
    }
}
