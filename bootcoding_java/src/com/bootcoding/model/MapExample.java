package com.bootcoding.model;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<String,String>();
        map.put("101","Raja");
        map.put("102","Rani");
        map.put("103","Babu");
        map.put("104","Banti");
        //map.forEach((s, s2) -> System.out.println(s));

        for(String s:map.keySet()){
            String s1 = map.get(s);
            System.out.println(s1);
        }
    }
}
