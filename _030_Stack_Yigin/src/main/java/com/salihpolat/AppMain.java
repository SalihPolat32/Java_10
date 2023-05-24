package com.salihpolat;

import java.util.Stack;

public class AppMain {

    public static void main(String[] args) {

        Stack<String> stackList = new Stack();

        stackList.push("Ali"); // index 0
        stackList.push("Salih"); // index 1
        stackList.push("Orhun"); // index 2
        stackList.push("Aysu"); // index 3
        stackList.push("Gizem"); // index 4
        stackList.push("Ahmet"); // index 5

        System.out.println(stackList);

        stackList.pop(); // Son Gireni Çıkarır
        System.out.println(stackList);

        stackList.add("Burak");
        System.out.println(stackList);

        System.out.println(stackList.peek()); // Son Eklenen Veri
        System.out.println(stackList.lastElement());

        System.out.println(stackList.search("Ali"));

        System.out.println(stackList.empty()); // Boş mu?
        System.out.println(stackList.isEmpty()); // Boş mu?
    }
}