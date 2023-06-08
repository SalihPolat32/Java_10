package com.salihpolat.ornek02;

import java.util.Scanner;

public class AppMainTryCatchFinally {

    public static void main(String[] args) {

        System.out.println("***************************************************");
        System.out.println("***************** Okul Otomasyonu *****************");
        System.out.println("***************************************************");

        System.out.println("1 - Ders Oluştur");
        System.out.println("2 - Öğrenci Oluştur");
        System.out.println("3 - Öğrenciye Ders Ekle");
        System.out.println("0 - Çıkış");
/*
        // Fazladan Kod Yazmış Olduk Try-Catch Burada İhtiyacımız Yok
        // v1

        try {

            int secim = secimYap();
            System.out.println("Seçilen Değer: " + secim);

        } catch (Exception e) {

            System.err.println("İstisna: " + e);
        }
        System.out.println("Program Kapatıldı.");
*/

/*
        // v2

        int secim = secimYap();
        System.out.println("Seçilen Değer: " + secim);
        System.out.println("Program Kapatıldı.");
*/
        // v3
        System.out.println("Seçilen Değer: " + secimYap());
        System.out.println("Program Kapatıldı.");
    }

    private static int secimYap() {

        Scanner scanner = new Scanner(System.in);
        int secim = 0;
        boolean tekrarDurumu = false;

        do {

            System.out.println("Seçiminizi Yapınız:");

            try {

                secim = scanner.nextInt();

                if (secim < 0 || secim > 3) {
                    System.out.println("Lütfen 0, 1, 2, ya da 3 Değerlerinden Birini Giriniz!");
                    tekrarDurumu = true;
                } else {
                    tekrarDurumu = false;
                }

            } catch (Exception e) {

                System.err.println("İstisna: " + e);

            } finally {

                scanner.nextLine();
            }

        } while (tekrarDurumu);

        return secim;
    }
}