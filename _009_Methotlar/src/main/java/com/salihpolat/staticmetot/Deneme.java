package com.salihpolat.staticmetot;

public class Deneme {
    public static void main(String[] args) {

        // Static ise Sınıfın_Adı.Metot_Adı
        /*
        MyApp.ekranaSelamYaz();
        MyApp.ekranaSelamYaz("Orhun");
        MyApp.ekranaSelamYaz("Orhun", "BAYINDIR");
        */

        // Sınıfın_Tipinde_Nesne.
        MyApp obj = new MyApp();
        obj.ekranaSelamYaz();
        obj.ekranaSelamYaz("Orhun");
        obj.ekranaSelamYaz("Orhun", "BAYINDIR");
    }
}
