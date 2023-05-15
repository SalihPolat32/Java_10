package com.salihpolat.staticmetot;

public class MyApp {

    // OverLoading Aynı Metotlara Farklı Paremetler Ekleyerek Kullanılması
    /*
    public static void ekranaSelamYaz() {
        System.out.println("Selam");
    }

    private static void ekranaSelamYaz(String adi) {
        System.out.println("Selam "+adi);
    }

    private static void ekranaSelamYaz(String adi, String soyadi) {
        System.out.println("Selam "+adi+" "+soyadi);
    }
    */
    /*
    public static void ekranaSelamYaz() {
        System.out.println("Selam");
    }

    public static void ekranaSelamYaz(String adi) {
        System.out.println("Selam "+adi);
    }

    public static void ekranaSelamYaz(String adi, String soyadi) {
        System.out.println("Selam "+adi+" "+soyadi);
    }
    */
    public void ekranaSelamYaz() {
        System.out.println("Selam");
    }

    public void ekranaSelamYaz(String adi) {
        System.out.println("Selam "+adi);
    }

    public void ekranaSelamYaz(String adi, String soyadi) {
        System.out.println("Selam "+adi+" "+soyadi);
    }

    public static void main(String[] args) {

        /*
        // Overloading
        ekranaSelamYaz();
        ekranaSelamYaz("Ahmet");
        ekranaSelamYaz("Ahmet","AKKOYUN");
        */

        MyApp myApp = new MyApp();
        myApp.ekranaSelamYaz();
        myApp.ekranaSelamYaz("Ahmet");
        myApp.ekranaSelamYaz("Ahmet","AKKOYUN");

    }
}
