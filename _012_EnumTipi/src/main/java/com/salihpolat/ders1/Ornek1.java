package com.salihpolat.ders1;

public class Ornek1 {

    enum HaftanınGunleri {
        Pazartesi, Salı, Çarşamba, Perşembe, Cuma, Cumartesi, Pazar
    }

    public static void main(String[] args) {

        // final String GUN1 = "Pazartesi";
        // ...............
        // String gun7 = "Pazar";
        // gun1 = "Pzt.";

        HaftanınGunleri gunDegeri = HaftanınGunleri.Salı;
        System.out.println(gunDegeri);
        // Sl Sal Sali Sali SALI Salli

        for (HaftanınGunleri gun : HaftanınGunleri.values()) {
            System.out.print (gun + " ");
        }
    }
}
