package com.salihpolat.zamaneklemecikarma;

import java.time.LocalDate;

public class ZamanEkleCikar {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2024, 1, 12);

        System.out.println("Tarih: " + localDate);
        System.out.println("5 Gün Ekleme Yapıldı: " + localDate.plusDays(5));
        System.out.println("13 Ay Ekleme Yapıldı: " + localDate.plusMonths(13));
        System.out.println("2 Hafta Ekleme Yapıldı: " + localDate.plusWeeks(2));

        System.out.println("4 Hafta Çıkarma Yapıldı: " + localDate.minusWeeks(4));

        LocalDate localDate2 = LocalDate.of(2026, 8, 21);

        // Ödev
        System.out.println("Tarih Farkı: " + farkiniAl(localDate2, localDate));
    }

    private static String farkiniAl(LocalDate localDate2, LocalDate localDate) {
        return null;
    }
}