package com.salihpolat.v3;

public class Ucak extends HavaAraci {

    float kanatUzunlugu;

    public boolean suyaInis() {
        return true;
    }

    public Ucak() {
        super();
        // super(35.2f, 4.3f, 20000, 27500.5f);
        // super(35.2f, 4.3f, 20000, 27500.5f, true);
    }

    @Override
    public String bilgiVer(String mesaj) {
        System.out.println(mesaj);
        return mesaj;
    }

    public Ucak(float uzunluk, float yukseklik, int hiz, float agirlik, boolean ucmaDurumu) {
        super(uzunluk, yukseklik, hiz, agirlik, ucmaDurumu);
    }

    public Ucak(float uzunluk, float yukseklik, int hiz, float agirlik, boolean ucmaDurumu, float kanatUzunlugu) {
        super(uzunluk, yukseklik, hiz, agirlik, ucmaDurumu);
        this.kanatUzunlugu = kanatUzunlugu;
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "kanatUzunlugu=" + kanatUzunlugu +
                ", uzunluk=" + uzunluk +
                ", yukseklik=" + yukseklik +
                ", hiz=" + hiz +
                ", agirlik=" + agirlik +
                ", ucmaDurumu=" + ucmaDurumu +
                '}';
    }
}