package com.salihpolat.ornek06.exp;

public class OgrenciException extends RuntimeException {


    public OgrenciException(MesajTipleri mesaj) {

        System.out.println(mesaj);
    }
}