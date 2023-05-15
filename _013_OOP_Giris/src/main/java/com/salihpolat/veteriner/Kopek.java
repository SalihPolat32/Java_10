package com.salihpolat.veteriner;

public class Kopek extends EvcilHayvan {
    @Override
    void hayvanSesVer() {
        System.out.println("Hav Hav");
    }
    @Override
    void yazdir() {
        System.out.println("Köpek Sınıfı");
    }
    @Override
    void rapor() {

    }
    @Override
    String chipKontrol(boolean chipDurumu) {
        return null;
    }
}