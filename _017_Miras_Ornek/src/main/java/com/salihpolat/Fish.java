package com.salihpolat;

public class Fish {

    private int sizeInFt;
    private Boolean is_wild;

    public int getSizeInFt() {
        return sizeInFt;
    }

    public void setSizeInFt(int sizeInFt) {
        this.sizeInFt = sizeInFt;
    }

    public Boolean getIs_wild() {
        return is_wild;
    }

    public void setIs_wild(Boolean is_wild) {
        this.is_wild = is_wild;
    }

    public void swim() {
        System.out.println("swim Metodu");
    }
}