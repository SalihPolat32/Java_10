package com.salihpolat.veteriner;

public class Kedi extends EvcilHayvan {
    @Override
    void hayvanSesVer() {
        System.out.println("Miyav Miyav");
    }

    @Override
    void yazdir() {
        System.out.println("Kedi Sınıfı");
    }

    @Override
    String chipKontrol(boolean chipDurumu) {
        return null;
    }
}