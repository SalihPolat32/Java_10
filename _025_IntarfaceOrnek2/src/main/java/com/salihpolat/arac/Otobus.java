package com.salihpolat.arac;

public class Otobus extends Arac implements Mesafe {


    @Override
    public String getYurtDisiIzni() {
        return "Yurtdışı İzni Var.";
    }
}