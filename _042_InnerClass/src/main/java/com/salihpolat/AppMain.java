package com.salihpolat;

class DisSinif {

    int sayi = 44;

    class YavruSinif {

        int sayi = 55;
    }
}

public class AppMain {

    public static void main(String[] args) {

        DisSinif obj1 = new DisSinif();
        System.out.println(obj1.sayi);

        // DisSinif.YavruSinif obj2 = new DisSinif.YavruSinif(); // iç class'ı static'li yazım
        DisSinif.YavruSinif obj2 = obj1.new YavruSinif(); // iç class'ı static'siz yazım
        System.out.println(obj2.sayi);
    }
}