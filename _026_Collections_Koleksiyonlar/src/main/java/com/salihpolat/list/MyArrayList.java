package com.salihpolat.list;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public MyArrayList() {
    }

    @Override
    public String toString() {
        return "MyArrayList{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add(10); // index 0
        list1.add(20); // index 1

        list2.add("Ahmet"); // index 0
        list2.add("Osman"); // index 1
        list2.add("Gizem"); // index 2

        System.out.println("Elemanları Liste 1: " + list1);
        System.out.println("Elemanları Liste 2: " + list2);

        System.out.println("Arama 1: " + list1.contains(55));
        System.out.println("Arama 2: " + list2.contains("Osman"));

        List<String> list3 = new ArrayList<>();
        list3.add("Ahmet"); // index 0
        list3.add("Gizem"); // index 1
        list3.add("Osman"); // index 2
        list3.add("Caner"); // index 3


        System.out.println("Eşitlik Liste Durumu: " + list2.equals(list3)); // equals indexlere bakıyor

        System.out.println("Arama 3: " + list3.containsAll(list2)); // containsAll sadece içinde var mı yok mu diye bakıyor

        // küçük liste büyük liste içinde aranır - true çıkabilir

        System.out.println("Liste Boyutu: " + list3.size());

        System.out.println("Liste Boş Mu?: " + list3.isEmpty());
        System.out.println("Liste Dolu Mu?: " + !list3.isEmpty());

        // list3.clear(); // Listenin içini boşaltıyor.
        // System.out.println("Liste Sıfırlama/Boşaltma Sonrası Liste Boyutu: " + list3.size());
/*
        System.out.println(list3.get(0));
        list3.remove(0);
        System.out.println(list3.get(0));
*/
        list3.add("Orhun");
        list3.add("Aysu");
        list3.add("Ünal");
        // list3.add("Serkan");

        System.out.println(list3);

        System.out.println("Liste 2: " + list2);
        System.out.println("Liste 3: " + list3);

        list3.removeAll(list2);
        System.out.println("Liste Farkları: " + list3);

        System.out.println("Hash Code: " + list3.hashCode());


    }
}