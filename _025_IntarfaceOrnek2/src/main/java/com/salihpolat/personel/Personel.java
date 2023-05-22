package com.salihpolat.personel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Personel {

    private String ad;
    private String soyadi;
    private String kimlikNo;
    private double maas;

    @Override
    public String toString() {
        return "Personel{" +
                "ad='" + ad + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", maas=" + maas +
                '}';
    }
}