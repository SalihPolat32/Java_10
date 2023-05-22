package com.salihpolat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personel {

    private String adi;
    private String soyadi;
    private String unvani;

    public void hesapla() {
        System.out.println("Personel hesapla Metodu.");
    }

    public void hesapla(int maas) {

        System.out.println(maas + 100);
    }

    protected String selamVer(String adi) { // Sadece Sınıf ve Miras Alanlar Kullanabilir.
        return "Selamlar " + adi + " Hoşgeldiniz.";
    }
}