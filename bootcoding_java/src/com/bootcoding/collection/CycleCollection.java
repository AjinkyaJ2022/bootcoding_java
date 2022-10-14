package com.bootcoding.collection;

import com.bootcoding.oops.Book1;
import com.bootcoding.oops.Cycle;

import java.util.HashMap;
import java.util.Random;

public class CycleCollection {
    HashMap<Long, Cycle> cycles= new HashMap<>();
    public void addCycle(Cycle c){
        cycles.put(c.getId(),c);
    }
    public void printCycle(){
        for (long key: cycles.keySet()){
            Cycle c=cycles.get(key);
            System.out.println("Id;"+c.getId());
            System.out.println("Company Name;"+c.getCompanyName());
            System.out.println("Colour;"+c.getColour());
            System.out.println("Size;"+c.getSize());
            System.out.println("Price;"+c.getPrice());
            System.out.println("Wheel;"+c.getWheel());
        }
    }

    public static void main(String[] args) {
        CycleCollection c1=new CycleCollection();
        String[] colors = {"BLACK", "BLUE", "GREEN", "RED"};
//        for (int i=0;i<15;i++){
//            Cycle cycle=new Cycle();
//            cycle.setId(i);
//            cycle.setCompanyName("Avon"+i);
//            cycle.setColour(colors[i%4]);
//            cycle.setSize("Large");
//            cycle.setPrice(i*20.5);
//            cycle.setWheel(2);
//            c1.addCycle(cycle);
//        }
        Random random = new Random();

        for (int i=0;i<15;i++){
            Cycle cycle=new Cycle();
            cycle.setId(i);
            cycle.setCompanyName("Avon"+i);
            int randomIndex = random.nextInt(4);
            System.out.println("Random Index " + randomIndex);
            cycle.setColour(colors[randomIndex]);
            cycle.setSize("Large");
            cycle.setPrice(i*20.5);
            cycle.setWheel(2);
            c1.addCycle(cycle);
        }

        c1.printCycle();
    }
}
