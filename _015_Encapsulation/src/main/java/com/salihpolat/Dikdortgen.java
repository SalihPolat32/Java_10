package com.salihpolat;

public class Dikdortgen {

    private int uzunKenar; // 10
    private int kisaKenar; // 3
    // Hazırlayıcı
    public Dikdortgen(int uzunKenar, int kisaKenar) {

        this.uzunKenar = uzunKenar; // 10
        this.kisaKenar = kisaKenar; // 3
    }
    int getHesaplaAlan(){
        /*
        int sonuc = this.uzunKenar * this.kisaKenar;
        return sonuc;
        */
        return this.uzunKenar * this.kisaKenar;
    }
    public int getHesaplaCevre(){
        /*
        int sonuc = (this.uzunKenar + this.kisaKenar) * 2
        return sonuc;
        */
        return (this.uzunKenar + this.kisaKenar) * 2;
    }
}