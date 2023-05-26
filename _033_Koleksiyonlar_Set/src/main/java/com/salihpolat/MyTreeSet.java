package com.salihpolat;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {

    public static void main(String[] args) {

        /*
        SET lerde tekrarlı Kayıt yok
        TreeSet Asla Ama Asla null Değeri Almaz
        İçine Hep Aynı Tip Değer Alır Kuyruklar Gibi
        */

        Set<String> ogrenciList = new TreeSet<>();

        ogrenciList.add("Abdullah");
        ogrenciList.add("Gizem");
        ogrenciList.add("Ali");
        ogrenciList.add("Burak");
        ogrenciList.add("Aysu");
        ogrenciList.add("Aminenur");
        ogrenciList.add("Ali");
        ogrenciList.add("Ali");
        ogrenciList.add("Ali");
        // ogrenciList.add(null);
        System.out.println("TreeSet: " + ogrenciList);

        System.out.println(ogrenciList.size());

//      for (int i = 0; i < ogrenciList.size(); i++) {
        // Tekrar Eden Kayıtları Bulunuz (Ödev) // İçine almadığı için tekrar eden bulunmaz.
//      }

        ogrenciList.remove("Mehmet"); // İçinde Yok Ama Hata Vermez
        System.out.println("TreeSet: " + ogrenciList);

        ogrenciList.remove("Gizem");
        System.out.println("TreeSet: " + ogrenciList);

        ogrenciList.clear();
        System.out.println(ogrenciList);

        ogrenciList.remove("Ali"); // İçinde Hiçbir Şey Yok Yine de Hata Vermez Çalışmaya Devam Eder
        System.out.println(ogrenciList);

        ogrenciList.remove(null);
        System.out.println(ogrenciList);

        System.out.println("=============================================================");

        TreeSet<Integer> sayiList = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            sayiList.add(i * i);
        }
        System.out.println(sayiList);

        /*
        TreeSet<TreeSet<Integer>> nukleerDenemeList = new TreeSet<>();
        nukleerDenemeList.add(sayiList);
        System.out.println(nukleerDenemeList.toString());
        */

        for (Integer sayi : sayiList) {
            System.out.print (sayi + " ");
        }
    }
}