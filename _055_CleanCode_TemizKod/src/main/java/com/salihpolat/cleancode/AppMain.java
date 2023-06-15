package com.salihpolat.cleancode;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public AppMain() {
    }

    public static void main(String[] args) {

        new AppMain();

        System.out.println("Hello world!");

        String adi = "Ünal";

        /*
         *   Temiz Kod:
         * 1 - Okunurluk: Projelerin, paketlerin, sınıfların, metotların, değişkenlerin isimleri okunduğunda anlaşılmalı.
         *       Ölçümüz var. İhtiyacımız olmadıkça ekleme yapmıyoruz!!!
         *
         * 2 - Kodun son kullanma tarihi?
         *       Kodun sürümleri olur. Kodun bakımları yapılmalı
         *
         * 3 - Sınıflar birbirini kullanıyor. Aralarındaki bağ zayıf olmalı. Esnek olmalı.
         *
         * 4 - Sınıflar, metotlar, değişkenler olabildiğince küçük parçalara ayrılmalı. Kontrol, yönetimi kolay olur.
         *       Sınıflar ortalama 500 satırırı geçmemeye çalışılmalı.
         *       Metotlarda 15 - 20 satır geçmese iyi olur. (Tekrar eden kodlar metot içinde yer almalıdır.)
         *       Metotların parametre sayıları ortalama 5 taneyi geçmemelidir. İdeali 2 tanedir.
         *
         * 5 - Paketler içinde hiyerarşisi düzgün kurulmalı.
         *
         * 6 - If - else / Switch - Case karar mekanizmaları
         *       En fazla 7 - 8 kademede işi bitirmeliyiz
         */

        // TEK SADECE 1 TANE ISIM ICIN BU DOGRU
        String ogrenciAdi;
        ogrenciAdi = "Aysu";

        // SADECE 1 ISIM ICIN BOYLE KULLANMAK ISRAFTIR VE GEREKSIZDIR!
        List<String> ogrenciAdi2 = new ArrayList<>();
        ogrenciAdi2.add("Aysu");


        String OgrenciSoyadi = "Çağışlar";

        int c = 15;

        String person;
        String satanKisi;

        int number = 30;

        double _double;

        // Dogru olani budur.
        ekranaYaz();

        // OLMAZ!!! YAPMAYIN!
        EkranaBaski();

        ekranayaz();


        // Parametrelerde ENUM kullanilmali.
        koluKaldir(1, "LEFT");

        sagaHareket();
        solaHareket();
        daireselHareket();

        kafayiSoldanSagaCevir();

    }

    private static void kafayiSoldanSagaCevir() {
    }

    private static void daireselHareket() {
    }

    private static void solaHareket() {
    }

    private static void sagaHareket() {
    }

    private static void koluKaldir(int i, String yon) {

        solaHareket();

    }

    private static void ekranayaz() {
    }

    private static void EkranaBaski() {
    }

    private static void ekranaYaz() {
        System.out.println("Selam ekrana mesaj verildi.");
    }
}