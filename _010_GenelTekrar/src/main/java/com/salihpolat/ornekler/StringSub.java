package com.salihpolat.ornekler;

public class StringSub {

    public static void main(String[] args) {

                    //0123456789
        String str = "Ahmet Mehmet Ali Veli";
        System.out.println("Son 4 Karakter: "+str.substring(str.length()-4));
        System.out.println("İlk 4 Karakter: "+str.substring(0,4));
        System.out.println("Seçilen: "+str.substring(2,8));

        "hamburger".substring(4,8); // "urge"
        "smiles".substring(1,5); // "mile
    }
}
