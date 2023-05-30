package com.salihpolat.v2;

public class AppMain {

    // Helikopter helikopter3 = new Helikopter(); // Varsayılan Değeri null

    String adi = new String(); // Varsayılan Değeri null
    String soyadi; // Varsayılan Değeri null
    int yasi;

    public static void main(String[] args) {

        Ucak ucak1 = new Ucak();
        System.out.println(ucak1);

        Ucak ucak2 = new Ucak(1.0f, 2.0f, 3, 4.0f, true, 5.0f);
        System.out.println(ucak2);

        Helikopter helikopter1 = new Helikopter();
        System.out.println("Helikopter 1 : " + helikopter1);
        helikopter1.manevra();
        helikopter1.inisKontrol();

        Helikopter helikopter2 = new Helikopter(10.0f, 20.0f, 30, 40.f, false, 50.0f, 6.0f);
        System.out.println("Helikopter 2 : " + helikopter2);

        Helikopter helikopter3 = new Helikopter();
        System.out.println("Helikopter 3 : " + helikopter3); // static Olduğunda Böyle Kullanıyoruz

        AppMain obj = new AppMain();

        // System.out.println("Helikopter 3 : " + obj.helikopter3);// static Olmadığında Böyle Kullanıyoruz
        System.out.println(obj.adi);

        System.out.println("\nToplam Hava Aracı Sayısı: " + HavaAraci.toplamUcakSayisi);
        System.out.println("Pilot Sayısı: " + HavaAraci.pilotSayisi);

        adiYaz();
    }

    private static void adiYaz() {
        System.out.println("Selam");
    }
}