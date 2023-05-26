package com.salihpolat;

import java.util.LinkedHashMap;

public class MapOrnek3_LinkedHashMap {

    public static void main(String[] args) {

        // Sırayı Bozmuyor - HashMap İle Aynı - Tekrar Edenleri 1 Tane Yazar - - null Hatası Vermez

        // Map<String, String> plakaListesi = new LinkedHashMap<>();
        // HashMap<String, String> plakaListesi = new LinkedHashMap<>();
        LinkedHashMap<String, String> plakaListesi = new LinkedHashMap<>();

        plakaListesi.put("Ankara", "06");
        plakaListesi.put("Ankara", "06"); // İtiraz Etmez İçine Almaz
        plakaListesi.put("İzmir", "35");
        plakaListesi.put("Nevşehir", "50");
        plakaListesi.put("Yozgat", "66");
        plakaListesi.put("Adana", "01");
        plakaListesi.put("Konya", "42");
        plakaListesi.put("Kocaeli", null);
        plakaListesi.put(null, "27");
        plakaListesi.put(null, null);
        plakaListesi.put(null, null);

        System.out.println(plakaListesi);

        for (String anahtar : plakaListesi.keySet()) {
            System.out.println("Şehirlerin Plaka Numaraları: " + anahtar + " " + plakaListesi.get(anahtar));
        }
    }
}