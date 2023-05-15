package com.salihpolat.ornekler;

public class StringIfadeSorusu {

    public static void main(String[] args) {

        String ifade1 = "Selam";
        int sayi1 = 10;

        System.out.println(2 + sayi1 + ifade1); // 12Selam
        System.out.println(ifade1 + 2 + sayi1); // Selam210
        System.out.println(ifade1 + (2 + sayi1)); // Selam12
    }
}
