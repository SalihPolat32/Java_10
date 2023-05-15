package com.salihpolat.ornekler;

public class MethotCagirilariHesap {

    public static void main(String[] args) {

        hesapla();

    }

    private static void hesapla() {

        int cevre = dikdortgenCevre(2, 8);
        int alan = dikdortgenAlani(2, 8);

        System.out.println("Çevresi: "+cevre);
        System.out.println("Alanı: "+alan);
    }

    private static int dikdortgenCevre(int kısaKenar, int uzunKenar) {
        return 2*(kısaKenar+uzunKenar);
    }

    private static int dikdortgenAlani(int kısaKenar, int uzunKenar) {
        return kısaKenar*uzunKenar;
    }

}
