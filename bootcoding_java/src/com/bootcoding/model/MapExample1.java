package com.bootcoding.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(101,"Raja");
        map.put(102,"Rani");
        map.put(103,"Ajay");
        map.put(104,"Veeru");

        for(Integer s:map.keySet()){
            String s1 = map.get(s);
            System.out.println(s1);
        }

    }
}
