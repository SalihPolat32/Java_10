package com.salihpolat.ornek06.exp;

public enum MesajTipleri {

    ARANAN_BULUNAMADI(100, "Aranan Bulunamadı!!!"),
    EKLEME_YAPILAMADI(200, "Ekleme Yapılamadı!!!"),
    EKLEME_YAPILAMADI2(201, "Ekleme 1 Yapılamadı!!!"),
    EKLEME_YAPILAMADI3(202, "Ekleme 2 Yapılamadı!!!"),
    EKLEME_YAPILAMADI4(203, "Ekleme 3 Yapılamadı!!!"),
    GUNCELLEME_YAPILAMADI(600, "Güncelleme Yapılamadı!!!"),
    GUNCELLEME_YAPILAMADI2(602, "Güncelleme 2 Yapılamadı!!!");

    int istisnaKodu;
    String mesaj;

    MesajTipleri(int istisnaKodu, String mesaj) {

        System.out.println();
    }

    public int getIstisnaKodu() {
        return istisnaKodu;
    }

    public String getMesaj() {
        return mesaj;
    }
}