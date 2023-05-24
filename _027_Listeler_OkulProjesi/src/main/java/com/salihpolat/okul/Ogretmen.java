package com.salihpolat.okul;

import com.salihpolat.utils.Branslar;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogretmen {

    // TODO Miras Yapılacak
    private String ad;
    private String soyad;
    private String telefon;
    private String adres;
    private Branslar brans;
}