package com.salihpolat;

public class Ornek5 {

    int siraNo; // 0
    String adiSoyadi; // null

    // Overloading
    public Ornek5() {
        System.out.println("Constructor - Yapıcı Parametresiz Çağrıldı");
        this.siraNo = 10;
        this.adiSoyadi = "Osman Onur BAŞ";
    }

    public Ornek5(String adiSoyadi, int siraNo) {
        System.out.println("Constructor - Yapıcı 2 Parametreli Çağrıldı");
        this.siraNo = siraNo;
        this.adiSoyadi = adiSoyadi;
    }

    public Ornek5(int siraNo, String adiSoyadi) {
        System.out.println("Constructor - Yapıcı 2 Parametreli Çağrıldı");
        this.siraNo = siraNo;
        this.adiSoyadi = adiSoyadi;
    }

    public Ornek5(int siraNo) {
        System.out.println("Constructor - Yapıcı 1 Parametreli siraNo Çağrıldı");
        this.siraNo = siraNo;
    }

    public Ornek5(String adiSoyadi) {
        System.out.println("Constructor - Yapıcı 1 Parametreli adiSoyadi Çağrıldı");
        this.adiSoyadi = adiSoyadi;
    }

    public static void main(String[] args) {

        Ornek5 obj1 = new Ornek5();
        System.out.println(obj1.siraNo + " " + obj1.adiSoyadi);

        /*
         * obj.siraNo = 10;
         * obj.adi =  "Osman";
         */

        System.out.println(obj1.siraNo + " " + obj1.adiSoyadi);

        Ornek5 obj2 = new Ornek5("Burak DELİCE", 88);
        System.out.println(obj2.siraNo + " " + obj2.adiSoyadi);

        Ornek5 obj3 = new Ornek5(92, "Ünal Gani BERK");
        System.out.println(obj3.adiSoyadi + " " + obj3.siraNo);

        Ornek5 obj4 = new Ornek5("Gizem KUŞÇUOĞLU");
        System.out.println(obj4.siraNo + " " + obj4.adiSoyadi);

        Ornek5 obj5 = new Ornek5(58);
        System.out.println(obj5.siraNo + " " + obj5.adiSoyadi);
    }
}