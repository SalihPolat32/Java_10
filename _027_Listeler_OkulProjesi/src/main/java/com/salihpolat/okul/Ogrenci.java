package com.salihpolat.okul;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogrenci {

    // TODO Miras Yapılacak
    String ad;
    String soyad;
    String adres;
    String okulNo;

    List<Ders> dersListesi;
}