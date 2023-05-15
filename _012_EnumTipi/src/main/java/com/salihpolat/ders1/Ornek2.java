package com.salihpolat.ders1;

public class Ornek2 {

    enum HaftanınGunleri {
        Pazartesi(), Salı(), Çarşamba(), Perşembe(), Cuma(5), Cumartesi("Spor"), Pazar("Tatil");
        String mesaj;
        HaftanınGunleri() {
            System.out.println("Varsayılan - Parametresiz");
        }
        HaftanınGunleri(String mesaj) {
            this.mesaj = mesaj;
            System.out.println("Parametreli" + mesaj);
        }

        HaftanınGunleri(int mesaj) {
            this.mesaj = Integer.toString(mesaj);
            System.out.println("Parametreli" + mesaj);
        }
    }

    public static void main(String[] args) {

        for (HaftanınGunleri gun : HaftanınGunleri.values()) {
            if(gun.mesaj != null) {
                System.out.println("\n" + gun + " " + gun.mesaj);
            }
        }
    }
}
