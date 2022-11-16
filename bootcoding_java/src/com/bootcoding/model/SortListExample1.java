package com.bootcoding.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListExample1 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();

        list.add("Raja");
        list.add("Raja");
        list.add("Ajay");
        list.add("Veeru");
        list.add("Banti");
        list.add("Babu");

        //System.out.println(list);
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
