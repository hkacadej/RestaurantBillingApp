package org.example;

import java.util.Scanner;

public class Controller {

    private Kamarier kamarier;


    String doVazhdosh = "";
    public Controller(Kamarier kamarier) {
        this.kamarier = kamarier;
        System.out.println("PERSHENDETJE");

        Scanner scanner= new Scanner(System.in);

        while (!doVazhdosh.equals("jo")) {
            System.out.println("Zgjidh Veprim :");
            System.out.println(
                    "\n\n"+
                            "Printo Tavolinen : 1 \n" +
                            "Shto Porosi : 2 \n"+
                            "Shto Menu Item : 3\n"+
                            "Shto Tavolina : 4\n"+
                            "Printo Menu"
            );
            veprimet(zgjidhVeprim());
        }

    }


    public Integer zgjidhVeprim(){
        Scanner scanner = new Scanner(System.in);
        Integer veprimi = null;
        while (veprimi==null){

            try {
                int vep = Integer.parseInt(scanner.nextLine());
                if ((vep > 0) && (vep < 6)) {
                    veprimi=vep;
                }else {throw new Exception();}
            }catch (Exception e){
                System.out.println("Keni futur veprim te paligjshem!");
            }
        }
        return veprimi;
    }

    public void veprimet(Integer veprimi) {
        switch (veprimi) {

            case 1 -> KamarierUtils.printoTavolinen(kamarier.getPorosite());
            case 2 -> KamarierUtils.shtoPorosi(kamarier);
            case 3 -> KamarierUtils.shtoMenuItem(kamarier);
            case 4 -> KamarierUtils.shtoTavolina(kamarier);
            case 5 -> KamarierUtils.printoMenu(kamarier);

        }
    }






    public Kamarier getKamarier() {
        return kamarier;
    }

    public void setKamarier(Kamarier kamarier) {
        this.kamarier = kamarier;
    }
}
