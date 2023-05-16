package com.salihpolat;

public class Araba {

    // Yakit yakit = new Yakit();
private Yakit yakit; // null
private Ayna ayna; // null
private Far far; // null
    public Araba() {
        yakit = new Yakit(); // Nesne oldu
        ayna = new Ayna(); // Nesne oldu
        far = new Far(); // Nesne oldu
        System.out.println("Araba");
        System.out.println("Araba - Yakıt Nesne: " + yakit);
    }
    public void harketeGec() {
        System.out.println("hareketeGec - Yakıt Nesne: " + yakit);
        yakit.depo();
        System.out.println("Harekete Geç");
    }
}