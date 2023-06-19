package com.salihpolat.model.factory.v1_pojo;

public class Gemi extends Tasima{

    public Gemi() {
        super(ETasimaTipi.DENIZ);
        hazirlikIslemleriniYap();
    }

    @Override
    protected void hazirlikIslemleriniYap() {
        System.out.println("Gemi Hazır.");

    }
}