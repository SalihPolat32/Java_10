package com.salihpolat.ornekler;

import java.util.Scanner;

public class ConsoleMenu {

    private static void menuyuGetir() {
        System.out.println("Bir Seçim Yapınız.");
        System.out.println("Secim 1");
        System.out.println("Secim 2");
        System.out.println("Secim 3");
        System.out.println("Çıkış İçin 9'a Basınız.");

        akisiGetir();

    }

    private static  void akisiGetir() {

        Scanner myInput = new Scanner(System.in);
        String secim = myInput.nextLine();

        switch (secim) {
            case "1":
                System.out.println("Girilen Değer 1");
                selamVer ("Selamlar", 10);
                break;
            case "2":
                System.out.println("Girilen Değer 2");
                break;
            case "3":
                System.out.println("Girilen Değer 3");
                break;
            case "9":
                System.out.println("Girilen Değer 9 ve Çıkış");
                System.exit(0);
                break;
            default:
                System.out.println("Olumsuz");
                break;
        }
    }

    private static void selamVer(String selamlar, int i) {

        if (i > 0) {
            System.out.println(selamlar + "Sayı Sıfırdan Büyük");
        } else {
            System.out.println(selamlar + "Sayı Sıfırdan Küçük");
        }
    }

    public static void main(String[] args) {

        menuyuGetir();

    }
}
