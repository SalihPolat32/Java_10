package com.salihpolat;

public class Ornek7 {
    /*
    private static void gosterSonuc(int sayi1, int sayi2) {
        System.out.println("Sayı 1: " + sayi1 + " Sayı 2: " + sayi2);
    }
    private static void gosterSonuc(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("Sayı 1: " + sayi1 + " Sayı 2: " + sayi2 + " Sayı 3: " + sayi3 + " Sayı 4: " + sayi4);
    }
    */
    private static void gosterSonuc(int... sayilar) {
        System.out.println("\n\nParametre Sayısı: " + sayilar.length);
        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }
    }

    private static void gosterSonuc(String a, float[] b, int... sayilar) { // Sonsuzluk operatörü her zaman sonda olur
        System.out.println("\n\nParametre Sayısı: " + sayilar.length);
        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }
    }

    public static void main(String[] args) {
        gosterSonuc(10, 29);
        gosterSonuc(1, 4, 5, 3);
        gosterSonuc(1, 4, 5, 3, 2, 9);
        gosterSonuc(1, 4, 5, 3, 2, 9, 1, 4);
        gosterSonuc(1, 4, 5, 3, 2, 9, 1, 4, 5, 7, 0);
        gosterSonuc(1, 4, 5, 3, 2, 9, 1, 4, 5, 7, 0, 4, 5, 3, 2, 9, 1, 4);
    }
}