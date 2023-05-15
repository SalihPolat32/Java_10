package com.salihpolat.ornekler;

public class StringMetot {

    public static void main(String[] args) {

        String str1 = "         Ahmet Mehmet         ";  // str1.trim()

        String sonuc = str1.trim(); // Ahmet Mehmet
        System.out.println(sonuc.length()); // 12

        // System.out.println(str1.trim().length()); // 12
    }
}
