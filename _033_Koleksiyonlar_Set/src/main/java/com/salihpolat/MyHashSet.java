package com.salihpolat;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {

    public static void main(String[] args) {

        /*
        SET lerde tekrarlı Kayıt yok
        null Alır
        İçine Hep Aynı Tip Değer Alır Kuyruklar Gibi
        Sadece 1 Tane null Değeri Alır
        */

        Set<String> ogrenciList = new HashSet<>();

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

        System.out.println("HashSet: " + ogrenciList);

        System.out.println(ogrenciList.size());

//      for (int i = 0; i < ogrenciList.size(); i++) {
            // Tekrar Eden Kayıtları Bulunuz (Ödev) // İçine almadığı için tekrar eden bulunmaz.
//      }

        ogrenciList.remove("Mehmet"); // İçinde Yok Ama Hata Vermez
        System.out.println("HashSet: " + ogrenciList);

        ogrenciList.remove("Gizem");
        System.out.println("HashSet: " + ogrenciList);

        ogrenciList.clear();
        System.out.println(ogrenciList);

        ogrenciList.remove("Ali"); // İçinde Hiçbir Şey Yok Yine de Hata Vermez Çalışmaya Devam Eder
        System.out.println(ogrenciList);

        ogrenciList.remove(null);
        System.out.println(ogrenciList);
    }
}