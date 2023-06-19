package com.salihpolat.model.factory.v1_pojo;

public class Kamyon extends Tasima{

    public Kamyon() {
        super(ETasimaTipi.KARA);
        hazirlikIslemleriniYap();
    }

    @Override
    protected void hazirlikIslemleriniYap() {
        System.out.println("Kamyon Hazır");

    }
}