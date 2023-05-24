package com.salihpolat.okul;

import com.salihpolat.utils.Dersler;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ders {

    // fields
    private Dersler ad;
    private Ogretmen ogretmen;

    int not1;
    int not2;

    // TODO Notlar Listeye Çevrilecek
    // List<Integer> notlar;

    public int ortalama() {
        return (getNot1() + getNot2()) / 2;
    }
}