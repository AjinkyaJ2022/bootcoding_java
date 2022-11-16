package com.bootcoding.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        Set<String> set= new LinkedHashSet<String>();
        set.add("Raja");
        set.add("Rani");
        set.add("Banti");
        set.add("Babu");
        set.add("Raja");
        set.add("Raja");
        set.forEach(System.out::println);
    }
}
