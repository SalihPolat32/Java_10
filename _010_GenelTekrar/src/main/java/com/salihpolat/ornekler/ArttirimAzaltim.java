package com.salihpolat.ornekler;

public class ArttirimAzaltim {

    public static void main(String[] args) {

        int a = 5;
        int b = 9;

        // int sonuc = a++;
        // System.out.println(sonuc);

        // sonuc = ++b;
        // System.out.println(sonuc);

        //int sonuc2 = a++ + ++a; // 5 + 7 = 12
        //System.out.println(sonuc2);

        int sonuc3 = a++ + ++a - b-- - --b; // Soldan sağa önce --/++ yapılır soonra ortadakiler
        System.out.println(sonuc3);
    }
}
