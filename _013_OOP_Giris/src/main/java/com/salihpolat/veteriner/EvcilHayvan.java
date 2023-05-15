package com.salihpolat.veteriner;

public abstract class EvcilHayvan { // abstract kullanımı zorlar

    abstract void hayvanSesVer();

    abstract void yazdir();

    void rapor() { // Normal Metot
        System.out.println("Rapor Metodu");
    }

    String chipKontrol(boolean chipDurumu) {
        return "Mesaj";
    }
}