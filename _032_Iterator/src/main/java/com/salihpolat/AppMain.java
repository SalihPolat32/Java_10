package com.salihpolat;

import java.util.ArrayList;
import java.util.Iterator;

public class AppMain {

    public static void main(String[] args) {

        ArrayList<String> personList = new ArrayList<>();

        personList.add("Gizem");
        personList.add("Aminenur");
        personList.add("Engin");
        personList.add("Ali");
        personList.add("Serkan");
        personList.add("Caner");
        personList.add("Aysu");

        System.out.println(personList);

        Iterator<String> iterator = personList.iterator();
        // System.out.println(iterator.next()); // İlk değeri getirdi

        String arananIsim;
        while (iterator.hasNext()) {
            // System.out.print (iterator.next() + " ");
            arananIsim = iterator.next();
            System.out.println("Aranan İsim: " + arananIsim + " ");
            if ((arananIsim == "Ali") || (arananIsim == "Serkan")) {
                System.out.println("\nAli ya da SerkanBulundu");
                iterator.remove();
            }
        }
        System.out.println(personList);
    }
}