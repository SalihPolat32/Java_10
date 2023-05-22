package com.salihpolat;

public abstract class Hayvan {

   public void yemekYe() {
       System.out.println("Hayvan Sınıfındaki Yemek Yeme Normal Metodudur.");
    }

    public abstract void sesVer();

    public abstract void hareketEt();

    public abstract void bilgisiniGetir();
}