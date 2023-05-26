package com.salihpolat;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MyLinkedHashSet {

    public static void main(String[] args) {

        /*
        SET lerde tekrarlı Kayıt yok
        İçeriye Giren Kayıtları Sıralı Tutar
        null Alır
        İçine Hep Aynı Tip Değer Alır Kuyruklar Gibi
        Sadece 1 Tane null Değeri Alır
        */

        Set<String> ogrenciList = new LinkedHashSet<>();

        ogrenciList.add("Abdullah");
        ogrenciList.add("Gizem");
        ogrenciList.add("Ali");
        ogrenciList.add("Burak");
        ogrenciList.add("Aysu");
        ogrenciList.add("Aminenur");
        ogrenciList.add("Ali");
        ogrenciList.add("Ali ".trim());
        ogrenciList.add("Ali");
        ogrenciList.add(null);

        System.out.println("LinkedHashSet: " + ogrenciList);

        System.out.println(ogrenciList.size());

//      for (int i = 0; i < ogrenciList.size(); i++) {
            // Tekrar Eden Kayıtları Bulunuz (Ödev) // İçine almadığı için tekrar eden bulunmaz.
//      }

        ogrenciList.remove("Mehmet"); // İçinde Yok Ama Hata Vermez
        System.out.println("LinkedHashSet: " + ogrenciList);

        ogrenciList.remove("Gizem");
        System.out.println("LinkedHashSet: " + ogrenciList);

        if (ogrenciList.isEmpty()) {
            System.out.println("Liste Boş");
        } else {
            System.out.println("Liste Dolu");
        }

        ogrenciList.clear();
        System.out.println(ogrenciList);

        ogrenciList.remove("Ali"); // İçinde Hiçbir Şey Yok Yine de Hata Vermez Çalışmaya Devam Eder
        System.out.println(ogrenciList);

        ogrenciList.remove(null);
        System.out.println(ogrenciList);

        if (ogrenciList.isEmpty()) {
            System.out.println("Liste Boş");
        } else {
            System.out.println("Liste Dolu");
        }
    }
}