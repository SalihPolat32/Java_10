package com.salihpolat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Muhasebe extends Memur {

    private Boolean maliYetki;

    @Override
    public void hesapla() { // Miras
        System.out.println("Muhasebe hesapla Metodu.");
    }

    @Override
    public void hesapla(int maas) { // Polymorphism
        System.out.println("Selamlar Maas: " + maas);
    }

    public void hesapla(int maas, String kaySayi) { // Polymorphism - Önemli olan değişken adı önemli değil türü ve sırası önmeli
        System.out.println("Muhasebe Maas + Kat Sayı: " + maas);
    }

    public void hesapla(String kaySayi, int maas) { // Polymorphism
        System.out.println("Muhasebe Maas + Kat Sayı: " + maas);
    }

    public void hesapla(byte kaySayi, int maas) { // Polymorphism
        System.out.println("Muhasebe Maas + Kat Sayı: " + maas);
    }

    public void hesapla(int kaySayi, int maas) { // Polymorphism
        System.out.println("Muhasebe Maas + Kat Sayı: " + maas);
    }

    public void hesapla(short kaySayi, int maas) { // Polymorphism
        System.out.println("Muhasebe Maas + Kat Sayı: " + maas);
    }

    public void hesapla(String ortalama) { // Polymorphim
        System.out.println("Muhasebe Maas + Kat Sayı: " + ortalama);
    }
}