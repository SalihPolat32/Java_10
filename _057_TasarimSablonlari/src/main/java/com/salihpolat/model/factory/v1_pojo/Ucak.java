package com.salihpolat.model.factory.v1_pojo;

public class Ucak extends Tasima{

    public Ucak() {
        super(ETasimaTipi.HAVA);
        hazirlikIslemleriniYap();
    }

    @Override
    protected void hazirlikIslemleriniYap() {
        System.out.println("Gemi Hazır.");
    }
}