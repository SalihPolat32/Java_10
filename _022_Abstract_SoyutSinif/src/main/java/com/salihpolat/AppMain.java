package com.salihpolat;

public class AppMain {

    public static void main(String[] args) {

        // Hayvan hayvan = new Hayvan();
        // Soyut Sınıftan Asla Nesne Oluşturulmaz.

        Kedi kedi = new Kedi();
        kedi.yemekYe();
        // Abstract Sınıfı Miras Alabiliriz.
        kedi.sesVer();

        Kopek kopek = new Kopek();
        kopek.yemekYe();
        kopek.sesVer();

        Hayvan hayvan = new Kedi();
        hayvan.sesVer();

        hayvan = new Kopek();
        hayvan.sesVer();

        hayvan = new At();
        hayvan.sesVer();

        Hayvan ustNesne = new Hayvan() {
            @Override
            public void sesVer() {
                System.out.println("sesVer ustNesne");
            }

            @Override
            public void hareketEt() {
                System.out.println("hareketEt ustNesne");
            }

            @Override
            public void bilgisiniGetir() {
                System.out.println("bigisiniGetir ustNesne");
            }
        };
    }
}