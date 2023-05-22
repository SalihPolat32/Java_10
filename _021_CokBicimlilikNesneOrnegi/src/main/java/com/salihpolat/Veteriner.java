package com.salihpolat;

public class Veteriner {

    public String hayvanBilgisiAl(Hayvan hayvan) {

        String cevap = "Hayvan Bilgisi Bulunamadı.";

        if (hayvan instanceof Kedi) { // Kedi
            cevap = "Kedi Nesnesi Gönderildi.";
        }

        if (hayvan instanceof Kopek) { // Kopek
            cevap = "Köpek Nesnesi Gönderildi.";
        }

        if (hayvan instanceof Kus) { // Kus
            cevap = "Kuş Nesnesi Gönderildi.";
        }
        return cevap;
    }
}
