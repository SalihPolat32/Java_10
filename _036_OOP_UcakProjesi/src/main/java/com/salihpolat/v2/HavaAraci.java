package com.salihpolat.v2;

public class HavaAraci {

    float uzunluk;
    float yukseklik;
    int hiz;
    float agirlik;
    boolean ucmaDurumu;

    static int toplamUcakSayisi;
    static int pilotSayisi;

    static final int MAX_YOLCU_SAYISI = 200;

    {
        // uzunluk = 150;
        ++toplamUcakSayisi;
        pilotSayisi += 2;
        System.out.println("static block - Uçak Oluşturuldu\n"); // static Blok - İlk Bu Oluşur ve Çalışır
    }

    static {
        System.out.println("Bu static block Sadece Bir Defa Çağırılır.\n");
    }

    public HavaAraci() {
        // toplamUcakSayisi = toplamUcakSayisi + 1;
        // System.out.println("Parametresiz Hazırlayıcı");
    }

    public boolean inisKontrol() {

        ucmaDurumu = true;
        return ucmaDurumu;
    }

    public boolean kalkisKontrol() {

        ucmaDurumu = false;
        return ucmaDurumu;
    }

    public HavaAraci(float uzunluk, float yukseklik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;

        // ++toplamUcakSayisi;

    }

    public HavaAraci(float uzunluk, float yukseklik, int hiz) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;

        // ++toplamUcakSayisi;

    }

    public HavaAraci(float uzunluk, float yukseklik, int hiz, float agirlik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;
        this.agirlik = agirlik;

        // ++toplamUcakSayisi;

        // System.out.println("4 Parametreli Hazırlayıcı");
    }

    public HavaAraci(float uzunluk, float yukseklik, int hiz, float agirlik, boolean ucmaDurumu) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;
        this.agirlik = agirlik;
        this.ucmaDurumu = ucmaDurumu;

        // ++toplamUcakSayisi;

        // System.out.println("5 Parametreli Hazırlayıcı");
    }

    @Override
    public String toString() {
        return "HavaAraci{" +
                "uzunluk=" + uzunluk +
                ", yukseklik=" + yukseklik +
                ", hiz=" + hiz +
                ", agirlik=" + agirlik +
                ", ucakKonumDurumu=" + ucmaDurumu +
                '}';
    }
}