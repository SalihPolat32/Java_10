package com.salihpolat.v2Exception;

import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        try {

            System.out.println("try: Hataya Açık Kodlar");

            int a = read.nextInt();

            int b = read.nextInt();

            int sonuc = a / b;

            System.out.println(a + " / " + b + " = " + sonuc);

        } catch (Exception e) {

            System.out.println("Exception: " + e);

            System.out.println("catch: Hatanın Açıklaması ve Yapılacaklar.");

        } finally {

            System.out.println("finally: Sonunda Ne Olmasını İstiyorsak Onlar Yapılır.");
        }

        System.out.println("--------------------------------------");
    }
}