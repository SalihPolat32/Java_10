package com.salihpolat.v2;

import java.util.ArrayList;

public class AppMain {

    public static void main(String[] args) {

        ArrayList<String> listeArrayList = new ArrayList<>();

        ListManager<String> listeBanaOzel = new ListManager<>();

        listeBanaOzel.listeyeEkle("Aminenur");
        listeBanaOzel.listeyeEkle("Aysu");
        listeBanaOzel.listeyeEkle("Gizem");
        System.out.println(listeBanaOzel.listeyiGetir());

        ListManager<Integer> listeBanaOzel2 = new ListManager<>();

        listeBanaOzel2.listeyeEkle(100);
        listeBanaOzel2.listeyeEkle(200);
        listeBanaOzel2.listeyeEkle(300);
        System.out.println(listeBanaOzel2.listeyiGetir());

//        for (ListManager<String> madde : listeBanaOzel) {
//            System.out.println(madde);
//        }

        ArrayList<String> listeYazdirilacak = listeBanaOzel.listeyiGetir();

        for (String madde : listeYazdirilacak) {
            System.out.print (madde + " ");
        }

        System.out.println("\n=========================================");

        for (int i = 0; i < listeYazdirilacak.size(); i++) {
            System.out.print (listeYazdirilacak.get(i));
        }

        System.out.println("\n=========================================");

        listeYazdirilacak.forEach((madde) -> System.out.print (madde + " "));


    }
}