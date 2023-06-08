package com.salihpolat.ornek06.exp;

public enum MesajTipleri {

    ARANAN_BULUNAMADI(100, "Aranan Bulunamadı!!!"),
    EKLEME_YAPILAMADI(200, "Ekleme Yapılamadı!!!"),
    EKLEME_YAPILAMADI2(201, "Dosya Yapılamadı!!!"),
    EKLEME_YAPILAMADI3(202, "Dosya Yapılamadı!!!"),
    EKLEME_YAPILAMADI4(203, "Dosya Yapılamadı!!!"),
    EKLEME_YAPILAMAD5(204, "Dosya Yapılamadı!!!"),
    GUNCELLEME_YAPILAMADI(300, "Güncelleme Yapılamadı!!!");

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