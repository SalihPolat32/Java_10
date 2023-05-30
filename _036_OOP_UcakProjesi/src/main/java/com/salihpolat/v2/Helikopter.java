package com.salihpolat.v2;

public class Helikopter extends HavaAraci {

    float ustPervane;
    float arkaPervane;

    public void manevra() {
        System.out.println("Manevra Yeteneği");
    }

    public Helikopter() {
        super();
    }

    public Helikopter(float uzunluk, float yukseklik, int hiz, float agirlik, boolean ucmaDurumu, float ustPervane, float arkaPervane) {
        super(uzunluk, yukseklik, hiz, agirlik, ucmaDurumu);
        this.ustPervane = ustPervane;
        this.arkaPervane = arkaPervane;
    }
}