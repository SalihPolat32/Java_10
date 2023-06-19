package com.salihpolat.model.factory.v1_pojo;

public class Kamyonet extends Tasima{

    public Kamyonet() {
        super(ETasimaTipi.KARA);
        hazirlikIslemleriniYap();
    }

    @Override
    protected void hazirlikIslemleriniYap() {
        System.out.println("Kamyonet Hazır");
    }
}