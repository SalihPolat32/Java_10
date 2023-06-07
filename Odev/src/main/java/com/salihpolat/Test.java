package com.salihpolat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Test {

    private final static List<Ogretmen> ogretmenler = new ArrayList<>();
    private final static List<Ogrenci> ogrenciler = new ArrayList<>();
    private final static List<Memur> memurlar = new ArrayList<>();
    private final static List<EDers> dersler = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("============================");
        ogrenciOlustur();
        System.out.println("============================");
        ogretmenOlustur();
        System.out.println("============================");
        memurOlustur();
        System.out.println("============================");
        rastgeleOgrenciniNotOrtalamasi();
        System.out.println("============================");
        aIleBasliyanOgrenciler();
        System.out.println("============================");
        birinciSinifOgrencileri();
        System.out.println("============================");
        ikinciSinifOgrenciIsimleri();
        System.out.println("============================");
        rastgeleOgrenciniNotOrtalamasi();
    }

    public static <T> void listeyeEkle(List<T> list, T object) {
        list.add(object);
    }

    public static void ogrenciOlustur() {

        Ogrenci ogrenci1 = new Ogrenci("S-1", "Salih", 1, EDers.MATEMATIK);
        ogrenci1.getDersListesi().add(EDers.GEOMETRI);
        ogrenci1.getNotlar().add(55.0);
        ogrenci1.getNotlar().add(65.0);
        ogrenci1.getNotlar().add(75.0);

        Ogrenci ogrenci2 = new Ogrenci("S-2", "Ali", 2, EDers.INGILIZCE);
        ogrenci2.getDersListesi().add(EDers.TURKCE);
        ogrenci2.getNotlar().add(95.0);
        ogrenci2.getNotlar().add(84.0);
        ogrenci2.getNotlar().add(77.0);

        listeyeEkle(ogrenciler, ogrenci1);
        listeyeEkle(ogrenciler, ogrenci2);

        System.out.println(ogrenciler);
    }

    public static void ogretmenOlustur() {

        Ogretmen ogretmen1 = new Ogretmen("T-1", "Mustafa", 15000.0, EDers.BEDEN_EGITMI);
        ogretmen1.getDersListesi().add(EDers.INGILIZCE);

        Ogretmen ogretmen2 = new Ogretmen("T-2", "Veli", 15000.0, EDers.GEOMETRI);
        ogretmen2.getDersListesi().add(EDers.MATEMATIK);

        listeyeEkle(ogretmenler, ogretmen1);
        listeyeEkle(ogretmenler, ogretmen2);

        System.out.println(ogretmenler);
    }

    public static void memurOlustur() {

        Memur memur = new Memur("OF-1", "Cansu", 15000.0);

        listeyeEkle(memurlar, memur);

        System.out.println(memurlar);
    }

    public static void aIleBasliyanOgrenciler() {
        ogrenciler.stream().filter(x -> x.getOgrenciAdi().toUpperCase().startsWith("A")).forEach(System.out::println);
    }

    public static void birinciSinifOgrencileri() {
        ogrenciler.stream().filter(x -> x.getSinifSeviyesi() == 1).forEach(System.out::println);
    }

    public static void ikinciSinifOgrenciIsimleri() {
        ogrenciler.stream().filter(x -> x.getSinifSeviyesi() == 2).forEach(x -> System.out.println(x.getOgrenciAdi()));
    }

    private static void rastgeleOgrenciniNotOrtalamasi() {
        Random random = new Random();
        int rastgeleOgrenci = random.nextInt(0, ogrenciler.size());
        // double ortalama = ogrenciler.stream().map(x -> x.getNotlar()).collect(Collectors.averagingDouble(x -> x.get(rastgeleOgrenci)));
        double ortalama2 = ogrenciler.stream().map(x -> x.getNotlar()).mapToDouble(x -> x.get(rastgeleOgrenci)).average().getAsDouble();

        System.out.println(ogrenciler.get(rastgeleOgrenci).getOgrenciAdi() + " Ortalaması: " + ortalama2);
    }
}