package com.salihpolat.ornekler;

public class MetotAsiriYuklemesiOverloading {

    public static void main(String[] args) {

        ciz();
        ciz("Ali");
        ciz("Mehmet", "Ahmet");


    }
    private static void ciz () {
        System.out.println("------------------");
    }
    public static void ciz(String adi) {
        System.out.println("------------------"+adi);
    }
    public static void ciz(String adi, String soyadi) {
        System.out.println("------------------"+adi+" "+soyadi);
    }
}
