import javafx.util.Pair;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static String zwrocImie(Integer case1) {
      //  Integer case1 = 5;
        String imie = "";
        switch (case1) {
            case 1: imie = "Jula"; break;
            case 5: imie = "Tomek"; break;
            case 8: imie = "Dawid"; break;
            default: imie = "NoName";
        }

        return imie;
    }

    public static void przedstawSie(String imie) {
        System.out.println("moje imie to: " +imie);
    }

    public static void main(String[] args) {
        String imie = zwrocImie(5);
        przedstawSie(imie);
        imie = zwrocImie(1);
        przedstawSie(imie);
        przedstawSie(zwrocImie( 10));


//    private static Object lista1;

        System.out.println("Hej, mój pierwszy program");


        String napis1 = "Jula";
        Boolean isTomek = napis1.contains("Tomek");
        System.out.print(isTomek);

        Integer liczba1 = 2;
        Long liczba2 = Long.valueOf(12345);

        double ulamek = 10.155;
//Float ulamek = 2.1;

        List<String> lista1 = new ArrayList<>();
        lista1.add(napis1);
        lista1.add("Tomek");
        System.out.print(lista1.toString());

        HashMap<String, Integer> mapa1 = new HashMap<>();
        mapa1.put(napis1, liczba1);
        mapa1.put("Tomek", 5);
        System.out.println(mapa1.toString());

        Pair<String, Integer> pair = new Pair<>("Jula", 1);
        String napis2 = pair.getKey();
        napis2 += pair.getValue().toString();
        System.out.println(napis2);
        //i++ oznacza że i będzie większe o 1 po przejściu pętli
        for (Integer i = 0; i < 5; i++) {
            System.out.println("Wartosc licznika:" + i.toString());
        }

        Integer i = 0;
        while (i < 5) {
            System.out.println("Jestem w while po raz " + i.toString());
            i++;
        }
        while (true) {
            i++;
            if (i.equals(7))
                continue;
            System.out.print(" " + i.toString());
            if (i == 10)
                break;

        }
        do {
            System.out.println("Jestem w do while");
            i++;
        } while (i < 10);

        for (String el : lista1) {
            System.out.println("Element listy: " + el);
            if (lista1.size() == 2) {
                System.out.println("Jestem w instrukcji warunkowej");
            }
            if (lista1.size() < 1) {
                System.out.println("Z tym warunkiem się nigdy nie wpisze");
            }else{
                System.out.println("Jestem w instrukcji else");
            }

         i=5;
            String message = "Moje imie to";
            switch (i) {
                case 2: message += "Jula";
                case 5: message += "Tomek";
                case 8: message += "Dawid";

            }
                System.out.println(message);
            }


        }

    }

