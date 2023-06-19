package com.salihpolat.model.singleton.v2_singleton;

public class Urun {

    private static  Urun nesne = null;
    private Long id;
    private String adi;
    private Double fiyati;

    private Urun() {
    }

    private Urun(Long id, String adi, Double fiyati) {
        this.id = id;
        this.adi = adi;
        this.fiyati = fiyati;
    }

    // Urun için Singleton nesne kontrolü yapılacak.
    public static Urun getInstance() {

            if (nesne == null) {
                nesne = new Urun();
            }
        return nesne;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Double getFiyati() {
        return fiyati;
    }

    public void setFiyati(Double fiyati) {
        this.fiyati = fiyati;
    }
}