package com.bootcoding.collection;

import java.util.HashMap;
import java.util.Map;

public class EntrySetExample {
    public static void main(String[] args) {
        HashMap<String,Integer>employees=new HashMap<>();
        for (int i=1; i<=10;i++){
          employees.put("emp"+i,i*1000);
        }
        for (String key:employees.keySet()){
            int value=employees.get(key);
            System.out.println("Employee Name:"+key+",salary="+value);
        }
        for (Map.Entry e: employees.entrySet()){
            System.out.println("Employee Name:"+e.getKey()+",salary="+e.getValue());
        }
    }
}
