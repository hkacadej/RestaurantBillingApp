package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kamarier {


    private Map<Integer,Order> porosite;
    public static ArrayList<Integer> tavolinat;

    private   Map<String,Integer> menu;

    public Kamarier() {


        porosite = new HashMap<>();
        tavolinat = new ArrayList<>();
        menu = new HashMap<>();


        //Item menuje paraprake ne menyre qe kryhet nje test
        menu.put("PIZZA",120);
        menu.put("SOUP",100);


        for (int i=1;i<11;i++){
            tavolinat.add(i);
        }
    }



    public Map<String, Integer> getMenu() {
        return menu;
    }
    public Map<Integer, Order> getPorosite() {
        return porosite;
    }

    public void setPorosite(Map<Integer, Order> porosite) {
        this.porosite = porosite;
    }
    public void shtoPorosi(Integer tavolina , Order order){
        porosite.put(tavolina,order);
    }

    public void shtoMenuitem(String pjata,Integer cmimi){
        menu.put(pjata,cmimi);
    }
    public void shtoTavolina(Integer tavolina){
        for (int i = tavolinat.get(tavolinat.size()-1)+1;i<=tavolina;i++){
            tavolinat.add(i);
        }
    }
}
