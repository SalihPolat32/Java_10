package com.salihpolat.ornek06.app;

import com.salihpolat.ornek06.repository.OgrenciRepository;

public class AppMainOzellestirilmisIstisna {

    static OgrenciRepository ogrenciRepository = new OgrenciRepository();

    public static void main(String[] args) {
/*
        OgrenciRepository ogrenciRepository = new OgrenciRepository();
        // v1
        ogrenciRepository.ogrenciEkle("Ünal Gani", "BERK");
        ogrenciRepository.ogrenciEkle("Ahmet", "AKKOYUN");
        ogrenciRepository.ogrenciEkle("Orhun", "BAYINDIR");
        ogrenciRepository.ogrenciEkle("Engin", "ERTİKMEN");
        ogrenciRepository.ogrenciEkle("Mehmet Caner", "ÖKSÜZ");
        ogrenciRepository.ogrenciEkle("Burak", "DELİCE");
        ogrenciRepository.ogrenciEkle("Salih Polat", "DÖNMEZ");
        ogrenciRepository.ogrenciEkle("Osman Onur", "BAŞ");
        ogrenciRepository.ogrenciEkle("Ali", "GÜNEŞ");
*/
        System.out.println("-----------------------------------------");

        ogrenciOlustur();

        ogrenciListesiGoster();
    }

    private static void ogrenciOlustur() {

        // v2
        ogrenciRepository.ogrenciEkle("Ünal Gani", "BERK");
        ogrenciRepository.ogrenciEkle("Ahmet", "AKKOYUN");
        ogrenciRepository.ogrenciEkle("Orhun", "BAYINDIR");
        ogrenciRepository.ogrenciEkle("Engin", "ERTİKMEN");
        ogrenciRepository.ogrenciEkle("Mehmet Caner", "ÖKSÜZ");
        ogrenciRepository.ogrenciEkle("Burak", "DELİCE");
        ogrenciRepository.ogrenciEkle("Salih Polat", "DÖNMEZ");
        ogrenciRepository.ogrenciEkle("Osman Onur", "BAŞ");
        ogrenciRepository.ogrenciEkle("Ali", "GÜNEŞ");
    }

    private static void ogrenciListesiGoster() {

    }
}