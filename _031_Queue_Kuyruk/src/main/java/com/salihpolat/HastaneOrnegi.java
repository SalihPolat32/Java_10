package com.salihpolat;

import java.util.LinkedList;
import java.util.Queue;

public class HastaneOrnegi {

    public static void main(String[] args) {

        /*
        Hastalar gelir kuyruğa girer
        Hastanın birinin ismi tabelada yazar
        Kuyruktan bir kişi eksilir
        */

        Queue<String> hastaKuyrugu = new LinkedList<>();
        hastaKuyrugu.add("Ali");
        hastaKuyrugu.add("Burak");
        hastaKuyrugu.add("Orhun");
        hastaKuyrugu.add("Engin");
        hastaKuyrugu.add("Gizem");
        hastaKuyrugu.offer("Serkan");

        System.out.println(hastaKuyrugu);
        hastaKuyrugu.forEach(hasta -> System.out.print(hasta + " ")); // Bu ikisi aynı

        System.out.println("\n=============================================");
        if (hastaKuyrugu.size() > 0) {

            String hastaBilgisi = hastaKuyrugu.peek();
            System.out.println("Tabelada Okunan Hasta Bilgisi: " + hastaBilgisi);
            hastaBilgisi = hastaKuyrugu.remove();
            System.out.println("Odada Muayene Olan Hasta Bilgisi: " + hastaBilgisi);

            System.out.println("==============================================");

            hastaBilgisi = hastaKuyrugu.peek();
            System.out.println("Tabelada Okunan Hasta Bilgisi: " + hastaBilgisi);
            hastaBilgisi = hastaKuyrugu.remove();
            System.out.println("Odada Muayene Olan Hasta Bilgisi: " + hastaBilgisi);

            System.out.println("==============================================");

            hastaBilgisi = hastaKuyrugu.peek();
            System.out.println("Tabelada Okunan Hasta Bilgisi: " + hastaBilgisi);
            hastaBilgisi = hastaKuyrugu.remove();
            System.out.println("Odada Muayene Olan Hasta Bilgisi: " + hastaBilgisi);

            System.out.println("==============================================");

            hastaBilgisi = hastaKuyrugu.poll();
            System.out.println("Tabelada Okunan Hasta Bilgisi: " + hastaBilgisi);
            System.out.println("Odada Muayene Olan Hasta Bilgisi: " + hastaBilgisi);
        } else {
            System.out.println("Hasta Yok");
        }
    }
}