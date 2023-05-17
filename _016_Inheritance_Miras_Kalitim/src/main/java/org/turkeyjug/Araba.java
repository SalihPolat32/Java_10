package org.turkeyjug;

public class Araba extends Tasit {

    public Araba() {
    }
    @Override
    void yazdir() {
        System.out.println("--- Araba Sınıfının içi: " + getTekerSayisi());
    }
}