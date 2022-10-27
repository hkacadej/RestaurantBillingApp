package org.example;

import java.util.Map;
import java.util.Scanner;

public class KamarierUtils {


    public static  void printoTavolinen( Map<Integer,Order> porosite){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep numrin e tavolines qe do te printosh : ");
        try {
            Integer tavolina=scanner.nextInt();
            if(porosite.containsKey(tavolina)) {
                System.out.println("tavolina : " +tavolina );
                System.out.println("Porosia : ");
                porosite.get(tavolina).printoPorosi();
                porosite.remove(tavolina);
            }else {
                System.out.println("Ju nuk keni asnje porosi new kete tavoline !");
            }

        }catch (Exception e){

            System.out.println("Veprim i gabuar !");

        }

    }




    public static void shtoPorosi(Kamarier kamarier){

        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Jep tavolinen : ");
            Integer tavolina = scanner.nextInt();

            if (!Kamarier.tavolinat.contains(tavolina)) {
                System.out.println("Tavolina qe keni zgjedhur nuk ekziston . \nZgjidh nje tavoline nga 1 - 10");
                return;
            }

            System.out.println("Jep pjata");
            scanner.nextLine();
            String pjata = scanner.nextLine();

            System.out.println("Jep sasia");
            Integer sasia = scanner.nextInt();

            if (kamarier.getPorosite().containsKey(tavolina)) {
                kamarier.getPorosite().get(tavolina).addOrder(pjata, sasia);

            } else {

                Order order = new Order(kamarier.getMenu());
                order.addOrder(pjata, sasia);
                kamarier.shtoPorosi(tavolina, order);

            }

        }catch (Exception e){
            System.out.println("Ju keni futur vlere te gabuar\n\n");
            return;
        }

    }

    public static void shtoMenuItem(Kamarier kamarier){
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Jep Emrin E Pjates : ");
            String pjata = scanner.nextLine();

            System.out.println("Jep cmimin e "+ pjata);
            Integer cmimi = scanner.nextInt();

            kamarier.shtoMenuitem(pjata,cmimi);
        }catch (Exception e){
            System.out.println("Ju keni futur vlere te gabuar\n\n");
            return;
        }
    }

    public static void shtoTavolina(Kamarier kamarier){
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Jep numrin e tavolinave qe do te shtosh");
            Integer tavolinat = scanner.nextInt();

            kamarier.shtoTavolina(tavolinat);
        }catch (Exception e){
            System.out.println("Ju keni futur vlere te gabuar\n\n");
            return;
        }
    }

    public static void printoMenu(Kamarier kamarier){
        System.out.println( " === MENU ===");
        kamarier.getMenu().entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

    public static void init(){
        Kamarier kamarier = new Kamarier();
        Controller controller = new Controller(kamarier);
    }

}
