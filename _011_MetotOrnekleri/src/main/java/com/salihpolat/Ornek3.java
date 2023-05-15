package com.salihpolat;

public class Ornek3 {

    /*
     * Değişkenler
     * Hazırlayıcı Metotlar
     * Normal Metotlar
     */

    public Ornek3() { // Bu yazmasa da var
        System.out.println("Constructor - Hazırlayıcı, Yapıcı");
    }

    public int selamVer() {
        System.out.println("Sıradan Bir Metot");
        return 25;
    }

    public static void main(String[] args) {

        System.out.println("\tDurum 1 main Metodu");

        Ornek3 obj = new Ornek3();

        System.out.println("\tDurum 2 main Metodu");

        obj.selamVer();

        System.out.println("\tDurum 3 main Metodu");
    }
}