package com.salihpolat.ornek04;

public class AppMainFirlatmakThrow {

    public static void main(String[] args) {

        System.out.println("Kümesteki Yumurta Sayısı:");

        int kumesId = -15;

/*
        // v1
        if (kumesId<0 || kumesId >100){

            System.out.println("..........Geçersiz Id Girildi.........");

        } else {

            System.out.println("Girilen Id: "+  kumesId +  " Yumurta Sayısı: "+ yumurtalariSayUnchecked(kumesId));
        }
*/

        //v2
        //  System.out.println("Girilen Id: "+  kumesId +  " Yumurta sayisi: "+ yumurtalariSayUnchecked(kumesId));

        //v3
        System.out.println("--------Unchecked----------------Try-Catch Bloğu İsteğe Bağlı-----------------");
        try {

            System.out.println("Girilen Id: "+  kumesId +  " Yumurta Sayısı: "+ yumurtalariSayUnchecked(kumesId));

        } catch (Exception e){

            System.err.println("İstisna: " + e);
            e.printStackTrace();

        }

        System.out.println("---------Checked--------------------Try-Catch Bloğu ŞART!!! ----------------");

        try {

            System.out.println("Girilen Id: "+  kumesId +  " Yumurta Sayısı: "+ yumurtalariSayChecked(kumesId));

        } catch (Exception e) {

            throw new RuntimeException(e);

        }
    }

    private static int yumurtalariSayUnchecked(int kumesId) {

        if (kumesId<0 || kumesId >100){
            throw new ArithmeticException("Geçersiz Id Değeri Girildi.");
        } else {
            return 50;
        }
    }

    private static int yumurtalariSayChecked(int kumesId) throws Exception {

        if (kumesId<0 || kumesId >100){
            throw new ArithmeticException("Geçersiz Id Değeri Girildi.");
        } else {
            return 50;
        }
    }
}