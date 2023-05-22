package com.salihpolat;

public class AppMain {

    public static void main(String[] args) {

        Kedi obj1 = new Kedi();
        Kopek obj2 = new Kopek();
        Kus obj3 = new Kus();

        obj1.ses();
        obj2.ses();
        obj3.ses();

        if (obj1 instanceof Hayvan) {
            System.out.println(obj1);
        }

        if (obj2 instanceof Hayvan) {
            System.out.println(obj2);
        }

        if (obj3 instanceof Hayvan) {
            System.out.println(obj3);
        }

        if (obj3 instanceof Kus) {
            System.out.println(obj3);
        }

//      if ((obj3 instanceof Kedi) == true) {
//          System.out.println(obj3);
//      }

        Veteriner veteriner = new Veteriner();

        String gelenCevap = veteriner.hayvanBilgisiAl(obj1);
        System.out.println(gelenCevap);

        gelenCevap = veteriner.hayvanBilgisiAl(obj2);
        System.out.println(gelenCevap);

        gelenCevap = veteriner.hayvanBilgisiAl(obj3);
        System.out.println(gelenCevap);

    }
}
