package com.salihpolat;

import java.util.Scanner;

public class Ornek2 {

    // Static tipte bir değer atadığımızda o değer kalır.

    static int siraNo = 5;
    static String adi = new String("Ali");
    static Scanner scanner = new Scanner(System.in);

    private static void veriAl() {

        System.out.print("Numarayı Giriniz: ");
        siraNo = scanner.nextInt(); // 10

        System.out.print("\nAdı Giriniz: ");
        adi = scanner.next(); // Ahmet
    }

    private static void goster() {
        System.out.println("\ngoster Adı: " + adi + " No: " + siraNo);
    }

    public static void main(String[] args) {

        System.out.println("\nmain Önce ==> Adı: " + adi + " No: " + siraNo);

        veriAl();
        goster();

        System.out.println("\nmain Sonra ==> Adı: " + adi + " No: " + siraNo);

    }
}