package com.salihpolat.lambda02;

public class ParametresizGeriDonusTipiOrnegi {

    public static void main(String[] args) {

        Sekil sekil1 = new Sekil() {
            @Override
            public String dikdortgen() {
                return "Selam Dikdörtgen Metodu";
            }
        };

        System.out.println(sekil1.dikdortgen());

        Sekil sekil2 = () -> "Merhaba Dikdörtgen Metodu";

        System.out.println(sekil2.dikdortgen());
    }
}