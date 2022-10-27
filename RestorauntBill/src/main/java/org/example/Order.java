package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private   Map<String,Integer> menu;
    private  Map<String,Integer> porosia;

    private double kostoTotale ;

    public double getKostoTotale(){
        return kostoTotale;
    }

    public Order(Map<String,Integer> menu){
       porosia = new HashMap<>();
       this.menu = menu;
    }

    public void addOrder(String pjata , Integer sasia ){

           if(porosia.containsKey(pjata)){
               sasia+=porosia.get(pjata);
               porosia.put(pjata,sasia);
               kostoTotale+=menu.get(pjata)*sasia;
           }
            porosia.put(pjata,sasia);
            kostoTotale+=menu.get(pjata)*sasia;

    }

    public void printoPorosi(){

        for (String name: porosia.keySet()) {
            String key = name.toString();
            String value = porosia.get(name).toString();
            System.out.println(key + " " + value);
        }
        System.out.println("Totoali "+ getKostoTotale());
    }

}
