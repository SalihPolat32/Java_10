package com.salihpolat.v3DetayliException;

import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        try {

            System.out.println("try: Hataya Açık Kodlar");

            Integer a = read.nextInt();

            Integer b = read.nextInt();

            Integer sonuc = a / b;

            System.out.println(a + " / " + b + " = " + sonuc);

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException: " + e);

            System.out.println("catch 1 : Hatanın Açıklaması ve Yapılacaklar.");

        } catch (RuntimeException e) {

            System.out.println("RuntimeException: " + e);

            System.out.println("catch 2 : Hatanın Açıklaması ve Yapılacaklar.");

        } catch (Exception e) {

            System.out.println("Exception: " + e);

            System.out.println("catch 3 : Hatanın Açıklaması ve Yapılacaklar.");

        } finally {

            System.out.println("finally: Sonunda Ne Olmasını İstiyorsak Onlar Yapılır.");
        }

        System.out.println("--------------------------------------");
    }
}