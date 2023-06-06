package com.salihpolat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OtoGaleri implements IOtoGaleri {

    private static final String FIRMA_ADI = "LOLO";
    private static List<Araba> arabalar = new ArrayList<>();
    private static List<Musteri> musteriler = new ArrayList<>();
    private static List<Kasiyer> kasiyerler = new ArrayList<>();
    private static List<Kiralama> kiralamalar = new ArrayList<>();

    public static void main(String[] args) throws OtoGaleriException {

        System.out.println(FIRMA_ADI + "Oto Galeri");
/*
        Musteri musteri1 = new Musteri(1, "Serkan");
        Musteri musteri2 = new Musteri(2, "Burak");
        Musteri musteri3 = new Musteri(3, "Osman");
        Musteri musteri4 = new Musteri(4, "Gizem");
*/
        OtoGaleri otoGaleri = new OtoGaleri();
        otoGaleri.arabaOlustur();
        otoGaleri.kasiyerOlustur();
        otoGaleri.musteriOlustur();

        listeyeEkle(musteriler, new Musteri(5, "Aminenur"));
        listeyeEkle(musteriler, new Musteri(6, "Gani"));
        listeyeEkle(musteriler, new Musteri(7, "Gani ünal"));
        listeyeEkle(kasiyerler, new Kasiyer(4, "Abdullah", 33_000.0));
        listeyeEkle(arabalar, new Araba(11, "Toyota"));

        // Musteri, Kasiyer Oluşutur
        // Araba Oluştur

        otoGaleri.kiralamaOlustur();

        try {

            System.out.println(otoGaleri.kiralananArabaListesi());
            otoGaleri.arabaAra();
            otoGaleri.kiralamaYap();
            otoGaleri.musteriAra();

        } catch (OtoGaleriException e) {

            System.out.println(e.getMesaj());

        }

        System.out.println("------------------------------------------------");

        System.out.println("Gan ile Başlayan Müşterilerin Listesini Bul");
        // System.out.println(ganIleBaslayanMusteriler());
        ganIleBaslayanMusteriler().forEach(System.out::println);

        System.out.println("------------------------------------------------");

        System.out.println("Kiralanan Araba Adına Göre Müşterilerin Adını Bul");
        arabaAdinaGoreKiralayanMusteriler("BMW").forEach(System.out::println);

        System.out.println("------------------------------------------------");

        System.out.println("İd Bilgisine Göre Müşterilerin Kiraladığı Arabalar Bul");
        musteriIdyeGoreKiralananArabalar(1).forEach(System.out::println);

        System.out.println("------------------------------------------------");

        System.out.println("Araba İd Bilgisine Göre Kiralayan Müşterilerin Bilgisi");
        arabaIdyeGoreKiralayanMusteriler(2).forEach(System.out::println);
    }

    private static List<Musteri> arabaIdyeGoreKiralayanMusteriler(int arabaId) {

        return kiralamalar.stream().filter(oto -> oto.getAraba().getId() == arabaId)
                .map(m -> m.getMusteri()).collect(Collectors.toList());
    }

    private static List<Araba> musteriIdyeGoreKiralananArabalar(int musteriId) {
/*
        List<Araba> arabaList = kiralamalar.stream().filter(m -> m.getMusteri().getId() == musteriId)
                .map(oto -> oto.getAraba()).collect(Collectors.toList());
        return arabaList;
*/
        return kiralamalar.stream().filter(m -> m.getMusteri().getId() == musteriId)
                .map(oto -> oto.getAraba()).collect(Collectors.toList());
    }

    // FIXME buraya bak
    private static List<Musteri> arabaAdinaGoreKiralayanMusteriler(String arabaAdi) {

        List<Musteri> musteriList = kiralamalar.stream()
                .filter(oto -> oto.getAraba().getIsim().equalsIgnoreCase(arabaAdi))
                .map(mus -> mus.getMusteri()).collect(Collectors.toList());

        return musteriList;
    }

    private static List<Musteri> ganIleBaslayanMusteriler() {

        List<Musteri> musteriList = musteriler.stream()
                .filter(m -> m.getIsim().startsWith("Gan")).collect(Collectors.toList());

        return musteriList;
    }

    private static <T> void listeyeEkle(List<T> gelenListe, T gelenNesne) {
        gelenListe.add(gelenNesne);
    }

    private void arabaOlustur() {
/*
        Araba araba1 = new Araba(1, "Mercedes");
        Araba araba2 = new Araba(2, "BMW");
        Araba araba3 = new Araba(3, "Kartal");
        Araba araba4 = new Araba(4, "Doğan");
        Araba araba5 = new Araba(5, "Şahin");
        Araba araba6 = new Araba(6, "Passat");
        Araba araba7 = new Araba(7, "Volvo");
        Araba araba8 = new Araba(8, "Jaguar");
        Araba araba9 = new Araba(9, "Mazda");
        Araba araba10 = new Araba(10, "TOGG");

        listeyeEkle(arabalar, araba1);
        listeyeEkle(arabalar, araba2);
        listeyeEkle(arabalar, araba3);
        listeyeEkle(arabalar, araba4);
        listeyeEkle(arabalar, araba5);
        listeyeEkle(arabalar, araba6);
        listeyeEkle(arabalar, araba7);
        listeyeEkle(arabalar, araba8);
        listeyeEkle(arabalar, araba9);
        listeyeEkle(arabalar, araba10);
*/
        listeyeEkle(arabalar, new Araba(1, "Mercedes"));
        listeyeEkle(arabalar, new Araba(2, "BMW"));
        listeyeEkle(arabalar, new Araba(3, "Kartal"));
        listeyeEkle(arabalar, new Araba(4, "Doğan"));
        listeyeEkle(arabalar, new Araba(5, "Şahin"));
        listeyeEkle(arabalar, new Araba(6, "Passat"));
        listeyeEkle(arabalar, new Araba(7, "Volvo"));
        listeyeEkle(arabalar, new Araba(8, "Jaguar"));
        listeyeEkle(arabalar, new Araba(9, "Mazda"));
        listeyeEkle(arabalar, new Araba(10, "TOGG"));
    }

    private void kasiyerOlustur() {

        Kasiyer kasiyer1 = new Kasiyer(1, "Salih", 30000.0);
        Kasiyer kasiyer2 = new Kasiyer(2, "Aysu", 40000.0);
        Kasiyer kasiyer3 = new Kasiyer(3, "Orhun", 35000.0);

        listeyeEkle(kasiyerler, kasiyer1);
        listeyeEkle(kasiyerler, kasiyer2);
        listeyeEkle(kasiyerler, kasiyer3);
    }

    private void musteriOlustur() {

        Musteri musteri1 = new Musteri(1, "Serkan");
        Musteri musteri2 = new Musteri(2, "Burak");
        Musteri musteri3 = new Musteri(3, "Osman");
        Musteri musteri4 = new Musteri(4, "Gizem");

        listeyeEkle(musteriler, musteri1);
        listeyeEkle(musteriler, musteri2);
        listeyeEkle(musteriler, musteri3);
        listeyeEkle(musteriler, musteri4);
    }

    private void kiralamaOlustur() {

        Kiralama kiralama1 = new Kiralama(1, kasiyerler.get(0), musteriler.get(0), arabalar.get(0));
        arabalar.get(0).setDurum(EDurum.KIRADA);

        Kiralama kiralama2 = new Kiralama(2, kasiyerler.get(1), musteriler.get(1), arabalar.get(1));
        arabalar.get(1).setDurum(EDurum.KIRADA);

        Kiralama kiralama3 = new Kiralama(3, kasiyerler.get(2), musteriler.get(2), arabalar.get(2));
        arabalar.get(2).setDurum(EDurum.KIRADA);

        Kiralama kiralama4 = new Kiralama(4, kasiyerler.get(0), musteriler.get(3), arabalar.get(3));
        arabalar.get(3).setDurum(EDurum.KIRADA);

        Kiralama kiralama5 = new Kiralama(5, kasiyerler.get(3), musteriler.get(4), arabalar.get(7));
        arabalar.get(7).setDurum(EDurum.KIRADA);

        Kiralama kiralama6 = new Kiralama(6, kasiyerler.get(8), musteriler.get(4), arabalar.get(7));
        arabalar.get(7).setDurum(EDurum.KIRADA);

        Kiralama kiralama7 = new Kiralama(7, kasiyerler.get(0), musteriler.get(0), arabalar.get(10));
        arabalar.get(10).setDurum(EDurum.KIRADA);

        Kiralama kiralama8 = new Kiralama(8, kasiyerler.get(1), musteriler.get(2), arabalar.get(4));
        arabalar.get(4).setDurum(EDurum.KIRADA);

        listeyeEkle(kiralamalar, kiralama1);
        listeyeEkle(kiralamalar, kiralama2);
        listeyeEkle(kiralamalar, kiralama3);
        listeyeEkle(kiralamalar, kiralama4);
        listeyeEkle(kiralamalar, kiralama5);
        listeyeEkle(kiralamalar, kiralama6);
        listeyeEkle(kiralamalar, kiralama7);
        listeyeEkle(kiralamalar, kiralama8);
    }

    @Override
    public Araba arabaAra() throws OtoGaleriException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Araba Adını Giriniz:");
        String arananArabaMarkasi = scanner.nextLine();

        Optional<Araba> araba = arabalar
                .stream()
                .filter(oto -> oto.getIsim().equalsIgnoreCase(arananArabaMarkasi)).findFirst();

        if (araba.isEmpty()) {
            throw new OtoGaleriException("Araba bulunamadı");
        }

        return araba.get();
    }

    @Override
    public boolean kiralamaYap() throws OtoGaleriException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kasiyer id: ");
        int kasiyeriId = Integer.parseInt(scanner.nextLine());
        Kasiyer kasiyer = kasiyerler.get(kasiyeriId - 1);

        System.out.println("-----------------------------------");

        System.out.print("Müşteri id: ");
        int musteriId = Integer.parseInt(scanner.nextLine());
        Musteri musteri = musteriler.get(musteriId - 1);

        System.out.println("-----------------------------------");

        System.out.println("Kirada Olmayan Arabalar:");

        /*
         * 1. Değişkenler int Integer
         * 2. Diziler sabit 10 tane, 5 tane
         * 3. Listeler (esnek dizi) istediğim kadar ekleme çıkarma yapabiliyorum
         * 4. Akış (stream) - üzerinde daha kolay iş yapabilmek için. (lambda söz dizimi)
         */

        arabalar.stream().filter(arabaParametresi -> arabaParametresi.getDurum().equals(EDurum.GALERIDE))
                .forEach(sonucParametresi -> {
                    System.out.println(sonucParametresi.getId() + " - " + sonucParametresi.getIsim() + " - " + sonucParametresi.getDurum());
                });

        System.out.println("Lütfen Bir Seçim Yapınız:");
        int arabaId = Integer.parseInt(scanner.nextLine());

        Araba araba = arabalar.get(arabaId - 1);

        if (araba.getDurum().equals(EDurum.KIRADA)) {
            throw new OtoGaleriException("Arab Kirada. İşlem Başarısız Oldu.");
        } else {
            Kiralama kiralama = new Kiralama(kiralamalar.size() + 1, kasiyer, musteri, araba);
            kiralamalar.add(kiralama);
            return true;
        }
    }

    @Override
    public Musteri musteriAra() throws OtoGaleriException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Müşteri Adını Giriniz:");
        String arananMusteri = scanner.nextLine();

        Optional<Musteri> musteri = musteriler
                .stream()
                .filter(mus -> mus.getIsim().equalsIgnoreCase(arananMusteri)).findFirst();

        if (musteri.isEmpty()) {
            throw new OtoGaleriException("Müşteri Bulunamadı.");
        }

        return musteri.get();
    }

    @Override
    public List<Araba> kiralananArabaListesi() throws OtoGaleriException {

        List<Araba> kiralananArabalar = arabalar.stream().filter(oto -> oto.getDurum().equals(EDurum.KIRADA))
                .collect(Collectors.toList());

        if (kiralananArabalar.isEmpty()) {
            throw new OtoGaleriException("Şimdi Kiralana Araba Yok, Bulunamadı.");
        }
        return kiralananArabalar;
    }
}