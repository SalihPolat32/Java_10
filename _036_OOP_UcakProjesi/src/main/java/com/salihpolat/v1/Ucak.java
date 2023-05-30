package com.salihpolat.v1;

import org.w3c.dom.ls.LSOutput;

public class Ucak {

    float uzunluk;
    float yukseklik;
    int hiz;
    float agirlik;
    boolean ucakKonumDurumu;

    static int toplamUcakSayisi;
    static int pilotSayisi;

    static final int MAX_YOLCU_SAYISI = 200;

    {
        ++toplamUcakSayisi;
        pilotSayisi += 2;
        System.out.println("static block - Uçak Oluşturuldu"); // static Blok - İlk Bu Oluşur ve Çalışır
    }

    static {
        System.out.println("Bu static block Sadece Bir Defa Çağırılır.");
    }

    public Ucak() {
        // toplamUcakSayisi = toplamUcakSayisi + 1;
        // System.out.println("Parametresiz Hazırlayıcı");
    }

    public boolean inisKontrol() {

        ucakKonumDurumu = true;
        return ucakKonumDurumu;
    }

    public boolean kalkisKontrol() {

        ucakKonumDurumu = false;
        return ucakKonumDurumu;
    }

    public Ucak(float uzunluk, float yukseklik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;

        // ++toplamUcakSayisi;

    }

    public Ucak(float uzunluk, float yukseklik, int hiz) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;

        // ++toplamUcakSayisi;

    }

    public Ucak(float uzunluk, float yukseklik, int hiz, float agirlik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;
        this.agirlik = agirlik;

        // ++toplamUcakSayisi;

        // System.out.println("4 Parametreli Hazırlayıcı");
    }

    public Ucak(float uzunluk, float yukseklik, int hiz, float agirlik, boolean ucakKonumDurumu) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;
        this.agirlik = agirlik;
        this.ucakKonumDurumu = ucakKonumDurumu;

        // ++toplamUcakSayisi;

        // System.out.println("5 Parametreli Hazırlayıcı");
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "uzunluk=" + uzunluk +
                ", yukseklik=" + yukseklik +
                ", hiz=" + hiz +
                ", agirlik=" + agirlik +
                ", ucakKonumDurumu=" + ucakKonumDurumu +
                '}';
    }
}