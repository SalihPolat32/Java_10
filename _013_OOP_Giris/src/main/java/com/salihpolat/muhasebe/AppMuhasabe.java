package com.salihpolat.muhasebe;

public class AppMuhasabe {

    public static void main(String[] args) {

        MusteriHesap musteriHesap = new MusteriHesap();
        musteriHesap.setMusteriNo(100);
        System.out.println(musteriHesap.getMusteriNo());

        // musteriHesap.maas = 20000;
        musteriHesap.setMaas(20000);
        System.out.println(musteriHesap.getMaas());

        musteriHesap.setEmail("abc");
        System.out.println(musteriHesap.getEmail());
    }
}
