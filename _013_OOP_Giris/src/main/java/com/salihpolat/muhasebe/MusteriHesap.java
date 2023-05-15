package com.salihpolat.muhasebe;

public class MusteriHesap {

    private long musteriNo;
    private String email;
    private float maas;

    public long getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(long musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getMaas() {
        return maas;
    }

    public float setMaas(float maas) {
        this.maas = maas;
        return maas;
    }

    public long setMusteriNo() {
        this.musteriNo = musteriNo;
        return musteriNo;
    }
}