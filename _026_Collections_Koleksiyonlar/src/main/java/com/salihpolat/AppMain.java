package com.salihpolat;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        List liste1 = new ArrayList();
        liste1.add(10); // Integer
        liste1.add("Serkan"); // String
        liste1.add(30.0f); // Float
        liste1.add("Salih"); // String

        int sayi = 40;
        liste1.add(sayi);

        System.out.println(liste1);

        List<String> liste2 = new ArrayList<>();
        liste2.add("Aysu"); // 0
        liste2.add("Osman"); // 1
        liste2.add("Abdullah"); // 2
        liste2.add("Gizem"); // 3
        liste2.add("Burak"); // 4
        // liste2.add("10.5f"); // 5

        System.out.println(liste2);

        System.out.println(liste2.size());
        System.out.println(liste2.get(0));
        System.out.println(liste2.get(1));
        System.out.println(liste2.get(2));
        System.out.println(liste2.get(3));
        System.out.println(liste2.get(4));
        // System.out.println(liste2.get(5));

        // Index -2 out of bounds for length 4
        // System.out.println(liste2.get(-2));

        List<Integer> liste3 = new ArrayList<>();
        liste3.add(0, 1000);// 0
        liste3.add(1, 2000); // 1
        liste3.add(2, 3000); // 2
        System.out.println(liste3);
        //index    0     1     2
        //      1000, 2000, 3000

        for (int i = 0; i < 5; i++) {
            liste3.add(0, 10 * i); // 0
        }
        // index  0  1  2  3  4
        //        0
        //       10  0
        //       20 10  0
        //       30 20 10  0
        //       40 30 20 10  0
        System.out.println(liste3);

        // index  0   1   2   3  4     5     6     7
        //       40, 30, 20, 10, 0, 1000, 2000, 3000

        liste3 = null;
        System.out.println(liste3);
    }
}