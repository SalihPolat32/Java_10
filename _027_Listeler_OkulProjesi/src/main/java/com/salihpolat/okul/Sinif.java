package com.salihpolat.okul;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sinif {

    private int siraSayi;
            private boolean projelsiyon;
    private boolean akilliTahta;
    private String subeNo; // 101 - Aziz SANCAR 201 İlber ORTAYLI
    List<Ogrenci> ogrenciListesi;
    List<Ogretmen> ogretmenListesi;
}