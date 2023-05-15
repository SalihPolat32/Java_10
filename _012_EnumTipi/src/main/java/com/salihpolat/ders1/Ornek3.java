package com.salihpolat.ders1;

import com.sun.tools.javac.Main;

public class Ornek3 {

    enum Meslek {
        MUHENDIS,
        DOKTOR,
        OGRETMEN,
        HALK_OZANI
    }

    public static void main(String[] args) {

        String unvan = "Dr."; // Dr DR Dr.
        System.out.println(unvan); // DR.
/*
        Meslek meslek = Meslek.DOKTOR; // !!! enum'da new yok!!!
        System.out.println(meslek);

        System.out.println(meslek.MUHENDIS + " " + meslek.OGRETMEN);
*/
        unvan = Meslek.DOKTOR.toString();
        System.out.println(unvan); // DOKTOR

        unvan = "Müh.";
        System.out.println(unvan); // Müh.

        unvan = Meslek.MUHENDIS.toString();
        System.out.println(unvan); // MUHENDIS
    }
}