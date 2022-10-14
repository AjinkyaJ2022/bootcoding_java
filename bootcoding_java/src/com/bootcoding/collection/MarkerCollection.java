package com.bootcoding.collection;

import com.bootcoding.basic.Marker;

import java.util.HashMap;

public class MarkerCollection {
    HashMap<Long, Marker> markers=new HashMap<>();
    public void addMarker(Marker m){
        markers.put(m.getId(),m);
    }
    public void printMarker(){
        for (long key: markers.keySet()){
            Marker m=markers.get(key);
            System.out.println("Id;"+m.getId());
            System.out.println("Company;"+m.getCompany());
            System.out.println("Type;"+m.getType());
            System.out.println("Colour;"+m.getColour());
            System.out.println("Price;"+m.getPrice());
        }
    }

    public static void main(String[] args) {
        MarkerCollection m1=new MarkerCollection();

        for (int i=1;i<10;i++){
            Marker marker=new Marker();
            marker.setId(i);
            marker.setCompany("Marker"+i);
            marker.setType("White Board");
            marker.setColour("Blue");
            marker.setPrice(i*10.5);
            m1.addMarker(marker);
        }
        m1.printMarker();
    }
}
