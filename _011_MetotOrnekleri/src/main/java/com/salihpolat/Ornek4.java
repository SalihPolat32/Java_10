package com.salihpolat;

public class Ornek4 {

    // new gördüğümüz yerde hazırlayıcı metot devreye girer.

    public Ornek4() {
        System.out.println("Nesne Oluşturuldu.");
    }

    public static void main(String[] args) {

        Ornek4 obj1 = new Ornek4();
        Ornek4 obj2 = new Ornek4();

        System.out.println(obj1);
        System.out.println(obj2);

        String str1 = new String("Veli");
        System.out.println(str1);
    }
}
