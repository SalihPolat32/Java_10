package com.salihpolat.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class MyLinkedList {

    public static void main(String[] args) {

        //List<String> list1 = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>(); // Bir şey alma ekrana yazdırmada iyi
        list1.add("Mehmet"); // 0
        list1.add("Aysun"); // 1
        list1.add("Osman"); // 2
        list1.set(1, "Aysu");
        list1.get(list1.size()); // Son değere ulaşma
        System.out.println(list1);

        // List<String> list2 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>(); // Bir şey eklemelerde daha iyi
        list2.add("Mehmet");
        list2.add("Aysun");
        list2.add("Osman");
        list2.set(1, "Aysu");

        System.out.println(list2);

        list2.addFirst("Orhun");
        list2.addLast("Serkan");
        list2.add("Ahmet");
        // list2.add(12)
        Collections.sort(list2);
        for (String str : list2) {
            System.out.print(" " + str);
        }
        System.out.println(list2);

        list2.getLast(); // Son değere ulaşma

        System.out.println("Son Kayıt: " + list2.getLast());

    }
}