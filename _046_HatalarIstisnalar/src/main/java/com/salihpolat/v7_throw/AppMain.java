package com.salihpolat.v7_throw;

public class AppMain {

    public static void main(String[] args) {

        try {

            sifiraBolmeHatasi();

        } catch (Exception e) {

            System.out.println("İstisna: " + e);

        } finally {

            System.out.println("------------------------------------------");

        }

    }

    private static void sifiraBolmeHatasi() {
        throw new ArithmeticException("Denedik Sıfıra Bölme Olmadı");
    }
}