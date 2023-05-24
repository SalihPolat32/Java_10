package com.salihpolat;

import java.util.PriorityQueue;
import java.util.Queue;

public class AppMain {

    public static void main(String[] args) {

        // Sadece Aynı Tip Verileri Alıyor
        // Farklı Veri Girince Hata Vermiyor Yazdırınca Hata Veriyor

        Queue queue1 = new PriorityQueue();

        queue1.add(100);
        queue1.add(200);

        System.out.println(queue1);

        Queue queue2 = new PriorityQueue();

        queue2.add("Aysu");
        queue2.add("Gizem");

        System.out.println(queue2);

        Queue queue3 = new PriorityQueue();

        queue3.add(3.14);
        queue3.add(5.18);

        System.out.println(queue3);

        Queue queue4 = new PriorityQueue();

        queue4.add(Boolean.TRUE);
        queue4.add(Boolean.FALSE);

        System.out.println(queue4);
    }
}