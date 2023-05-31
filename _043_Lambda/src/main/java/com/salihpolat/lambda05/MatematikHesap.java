package com.salihpolat.lambda05;

public class MatematikHesap {

    public static void main(String[] args) {

        Sayisal sayisal1 = new Sayisal() {
            @Override
            public boolean sayiKontrol(int a, int b) {
                return a < b;
            }
        };

        System.out.println("a < b için Sonuc: " + sayisal1.sayiKontrol(10, 5));

        Sayisal sayisal2 = (a, b) -> a < b;
        System.out.println("a < b için Sonuc: " + sayisal2.sayiKontrol(10, 5));
    }
}