package com.bootcoding.model;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<Double,Boolean> map= new HashMap<Double,Boolean>();
        map.put(60.52,true);
        map.put(84.41,true);
        map.put(39.87,false);
        map.put(40.54,false);
        for(Double s:map.keySet()){
            Boolean d1 = map.get(s);
            System.out.println(d1);
        }
    }
}
