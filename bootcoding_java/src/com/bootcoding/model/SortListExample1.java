package com.bootcoding.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListExample1 {
    public static void main(String[] args) {
       /* List<String> list= new ArrayList<String>();

        list.add("Raja");
        list.add("Raja");
        list.add("Ajay");
        list.add("Veeru");
        list.add("Banti");
        list.add("Babu");*/



        List<Emp> list= new ArrayList<Emp>();

        list.add(new Emp("Raja",22,9890436981L));
        list.add( new Emp("Ram",23,98900887619L));
        list.add( new Emp("Banti",11,98900887619L));
        list.add( new Emp("Babu",34,98900887619L));
        list.add( new Emp("Nishant",37,98900887619L));
        list.add( new Emp("Veeru",41,98900887619L));


        //System.out.println(list);
        Comparator comparator= new Comparator<Emp>() {
            @Override
            public int compare(Emp emp1, Emp emp2) {
                if(emp1.getAge()>emp2.getAge()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(list,comparator);
        list.forEach(System.out::println);
    }
}
