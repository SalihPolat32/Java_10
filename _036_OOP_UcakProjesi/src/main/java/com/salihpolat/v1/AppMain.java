package com.salihpolat.v1;

public class AppMain {

    public static void main(String[] args) {

        Ucak ucak1 = new Ucak();
        System.out.println(ucak1);

        Ucak ucak2 = new Ucak(35.2f, 4.3f, 20000, 27500.5f);
        System.out.println(ucak2);

        Ucak ucak3 = new Ucak(35.2f, 4.3f, 20000, 27500.5f, true);
        System.out.println(ucak3);

        System.out.println("Toplam Uçak Sayısı: " + Ucak.toplamUcakSayisi);
        System.out.println("Pilot Sayısı: " + Ucak.pilotSayisi);
    }
}