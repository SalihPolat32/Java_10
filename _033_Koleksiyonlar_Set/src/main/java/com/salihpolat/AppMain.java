package com.salihpolat;

import java.util.*;

public class AppMain {

    public static void main(String[] args) {

        // Set içinde tekrar eden veri yok

        List<String> ogrenciList = new ArrayList <>();

        ogrenciList.add("Abdullah");
        ogrenciList.add("Gizem");
        ogrenciList.add("Ali");
        ogrenciList.add("Burak");
        ogrenciList.add("Aysu");
        ogrenciList.add("Aminenur");
        ogrenciList.add("Ali");
        ogrenciList.add("Ali");
        ogrenciList.add("Ali");
        ogrenciList.add(null);
        System.out.println("Arraylist: " + ogrenciList);

        Set<String> ogrenciList2 = new HashSet<>(); // HashSet Sırayı Değiştirdi Ve Tekrar Edeni Bir Tane Yazdı
                                                    // null eklenebilir
        ogrenciList2.add("Abdullah");
        ogrenciList2.add("Gizem");
        ogrenciList2.add("Ali");
        ogrenciList2.add("Burak");
        ogrenciList2.add("Aysu");
        ogrenciList2.add("Aminenur");
        ogrenciList2.add("Ali");
        ogrenciList2.add("Ali");
        ogrenciList2.add("Ali");
        ogrenciList2.add(null);
        System.out.println("HashSet: " + ogrenciList2);

        Set<String> ogrenciList3 = new TreeSet<>(); // TreeSet Sırayı Değiştirdi Ve Tekrar Edeni Bir Tane Yazdı
                                                    // null değer almaz
        ogrenciList3.add("Abdullah");
        ogrenciList3.add("Gizem");
        ogrenciList3.add("Ali");
        ogrenciList3.add("Burak");
        ogrenciList3.add("Aysu");
        ogrenciList3.add("Aminenur");
        ogrenciList3.add("Ali");
        ogrenciList3.add("Ali");
        ogrenciList3.add("Ali");
        // ogrenciList3.add(null); // null değer almaz!!!
        System.out.println("TreeSet: " + ogrenciList3);

        Set<String> ogrenciList4 = new LinkedHashSet<>(); // Daha Masraflı Sırayı kaybetmez Tekrar Edeni Bir Tane Yazar
                                                          // null eklenebilir
        ogrenciList4.add("Abdullah");
        ogrenciList4.add("Gizem");
        ogrenciList4.add("Ali");
        ogrenciList4.add("Burak");
        ogrenciList4.add("Aysu");
        ogrenciList4.add("Aminenur");
        ogrenciList4.add("Ali");
        ogrenciList4.add("Ali");
        ogrenciList4.add("Ali");
        ogrenciList4.add(null);
        System.out.println("HashSet: " + ogrenciList2);
    }
}