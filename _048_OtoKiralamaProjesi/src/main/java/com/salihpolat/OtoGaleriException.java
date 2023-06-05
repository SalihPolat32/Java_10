package com.salihpolat;

// Custom Exception
public class OtoGaleriException extends Exception {

    private String mesaj;

    public OtoGaleriException(String message, String mesaj) {
        super(message);
        this.mesaj = mesaj;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
}