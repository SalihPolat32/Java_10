package com.salihpolat.ornek06.app;

import com.salihpolat.ornek06.model.Ogrenci;
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
        // v2
        ogrenciOlustur();

        ogrenciListesiGoster();

        System.out.println("-----------------------------------------");

        // ogrenciRepository.ogrenciAra(8L);

        Ogrenci ogrenci = ogrenciRepository.ogrenciAraId(8L).get();

        System.out.println(ogrenci.getId() + " - " + ogrenci.getAd() + " " + ogrenci.getSoyad());

        System.out.println("-----------------------------------------");

        System.out.println(ogrenciRepository.ogrenciAraId(8L));
        System.out.println(ogrenciRepository.ogrenciAraId(8L).toString());
        System.out.println(ogrenciRepository.ogrenciAraId(8L).get());

        System.out.println("-----------------------------------------");

        ogrenciRepository.ogrenciGuncelle(new Ogrenci(8L, "Gizem", "KUŞÇUĞLU"));

        System.out.println("-----------------------------------------");

        ogrenciListesiGoster();

        System.out.println("-----------------------------------------");
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
        ogrenciRepository.ogrenciEkle("Serkan Şahin", "ZORLU");

    }

    private static void ogrenciListesiGoster() {

        // ogrenciRepository.getOgrenciListesi().forEach(System.out::println); // Nesne Olarak Gösterir
        ogrenciRepository.getOgrenciListesi().forEach(ogr -> System.out.println(ogr.getId() + " - " + ogr.getAd() + " " + ogr.getSoyad()));
    }
}