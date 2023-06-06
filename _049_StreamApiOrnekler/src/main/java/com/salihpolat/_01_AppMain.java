package com.salihpolat;

import java.util.List;
import java.util.stream.Stream;

public class _01_AppMain {

    public static void main(String[] args) {

        Stream<String> bosKayit = Stream.empty();
        Stream<String> tekKayit = Stream.of("Serkan");
        Stream<String> cokluKayit = Stream.of("Aysu", "Gizem", "Aminenur");

        List<String> ogrencilerListesi = List.of("Burak", "Yiğitcan", "Abdullah", "Ahmet");

        System.out.println("-----------------------------------------------");

        Stream<String> ogrencilerStream = ogrencilerListesi.stream();

        ogrencilerStream.forEach(System.out::println);
        // ogrencilerStream.forEach(System.out::println); // Stream Bir Kere Kullanılır

        System.out.println("-----------------------------------------------");

        Stream<String> ogrencilerStream2 = ogrencilerListesi.stream();

                              // parametre return sonuç
        ogrencilerStream2.forEach(ogrenci -> System.out.println(ogrenci));

        System.out.println("-----------------------------------------------");

        adiYaz("Osman");

        System.out.println("-----------------------------------------------");

        Stream<String> ogrencilerStream3 = ogrencilerListesi.stream();

        ogrencilerStream3.forEach(ogrenci -> {
            System.out.println("Öğrencilerin Bilgisi:");
            System.out.println(ogrenci);
            System.out.println("Teşekkürler");
        });

        System.out.println("-----------------------------------------------");
    }

    private static void adiYaz(String ogrenci) {

        System.out.println(ogrenci.toUpperCase());
    }
}