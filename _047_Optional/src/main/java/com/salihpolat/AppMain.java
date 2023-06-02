package com.salihpolat;

import java.util.Optional;

public class AppMain {

    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci("Ali");
        System.out.println("id......: " + ogrenci.getId());
        System.out.println("Adı.....: " + ogrenci.getAd());

        ogrenci = new Ogrenci("Yiğitcan");
        System.out.println("id......: " + ogrenci.getId());
        System.out.println("Adı.....: " + ogrenci.getAd());

        ogrenci = new Ogrenci("Aysu");
        System.out.println("Öğrenci Kontrol: " + Optional.ofNullable(ogrenci));
        System.out.println("id......: " + ogrenci.getId());
        System.out.println("Adı.....: " + ogrenci.getAd());

        ogrenci = null;
        // System.out.println(ogrenci.getAd());
        System.out.println(Optional.ofNullable(ogrenci));

        System.out.println("-------------------------------------");

        Optional<Double> ortalama = ortalamaHesapla(80, 75, 63);

        if (ortalama.isPresent()) {
            System.out.println("Ortalaması: " + ortalama.get());
        } else {
            System.out.println("Henüz Sınav Yapılmadı.");
        }
    }

    private static Optional<Double> ortalamaHesapla(double...notlar) {

        if (notlar.length == 0) {
            return Optional.empty();
        }

        double toplam = 0;

        for (double not : notlar) {
            // toplam = toplam + not;
            toplam += not;
        }

        double sonuc = toplam / notlar.length;

        return Optional.of(sonuc);
    }
}