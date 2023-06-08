package com.salihpolat.ornek06.repository;

import com.salihpolat.ornek06.exp.MesajTipleri;
import com.salihpolat.ornek06.exp.OgrenciException;
import com.salihpolat.ornek06.model.Ogrenci;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OgrenciRepository {

    // Değişken - Dizi - Liste - Dosya - Veri Tabanı ==> Verinin Tutulduğu Yerler

    private List<Ogrenci> ogrenciListesi;

    public OgrenciRepository() {
        ogrenciListesi = new ArrayList<>();
    }

    public void ogrenciEkle(String ad, String soyad) {

        ogrenciListesi.add(new Ogrenci(ad, soyad));
    }

    public void ogrenciGuncelle(Ogrenci ogrenci) {


    }

    public List<Ogrenci> getOgrenciListesi() {
        return ogrenciListesi;
    }

    public void setOgrenciListesi(List<Ogrenci> ogrenciListesi) {
        this.ogrenciListesi = ogrenciListesi;
    }

    public Optional<Ogrenci> ogrenciAra(Long id) throws OgrenciException {

        Optional<Ogrenci> ogrenci = ogrenciListesi.stream().filter(ogr -> ogr.getId().equals(id)).findFirst();

        if (ogrenci.isEmpty()) {
            throw  new OgrenciException(MesajTipleri.ARANAN_BULUNAMADI);
        }
                return ogrenci;
    }
}