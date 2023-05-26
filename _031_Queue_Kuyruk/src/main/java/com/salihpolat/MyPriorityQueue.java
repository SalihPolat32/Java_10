package com.salihpolat;

import java.util.PriorityQueue;

public class MyPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> sayilarKuyrugu = new PriorityQueue<>(10);

        sayilarKuyrugu.add(Integer.valueOf(10));
        sayilarKuyrugu.add(10);
        sayilarKuyrugu.add(Integer.valueOf("2400"));

        System.out.println(sayilarKuyrugu);
/*
        Integer okunanSayi = sayilarKuyrugu.remove();

        if (okunanSayi != null) {
            System.out.println("\n1. Durum Okunan Sayı: " + okunanSayi);
        } else {
            System.out.println("İçeride Veri Yok");
        }

        System.out.println("\n1. Durum Kalan Sayı: " + sayilarKuyrugu);

        okunanSayi = sayilarKuyrugu.remove();
        System.out.println("\n2. Durum Okunan Sayı: " + okunanSayi);
        System.out.println("\n2. Durum Kalan Sayı: " + sayilarKuyrugu);

        okunanSayi = sayilarKuyrugu.remove();
        System.out.println("\n3. Durum Okunan Sayı: " + okunanSayi);
        System.out.println("\n3. Durum Kalan Sayı: " + sayilarKuyrugu);
*/

        elemanlariKuyruktanCikar(sayilarKuyrugu);
        elemanlariKuyruktanCikar(sayilarKuyrugu);
        elemanlariKuyruktanCikar(sayilarKuyrugu);
    }

    private static void elemanlariKuyruktanCikar(PriorityQueue<Integer> sayilarKuyrugu) {

        System.out.println("\nDurum Okunan Sayı: " + sayilarKuyrugu.remove());
        System.out.println("\nDurum Kalan Sayı: " + sayilarKuyrugu);
    }
}