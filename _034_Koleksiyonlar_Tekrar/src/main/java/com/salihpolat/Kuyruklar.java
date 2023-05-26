package com.salihpolat;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kuyruklar {

    public static void main(String[] args) {

        Queue myPriorityQueueList1 = new PriorityQueue(); // null Değeri Almaz

        myPriorityQueueList1.add("Aysu"); // 0
        myPriorityQueueList1.add("Serkan"); // 1
        myPriorityQueueList1.add("Gizem"); // 2
        myPriorityQueueList1.add("Ali"); // 3
        // myPriorityQueueList1.add(null); // 4 // !!! ÖNEMLİ !!! - Sort(Sıralama) Yaptığı İçin null Değeri Almaz
        // myPriorityQueueList1.add(null); // 5 // !!! ÖNEMLİ !!! - Sort(Sıralama) Yaptığı İçin null Değeri Almaz
        myPriorityQueueList1.offer("Engin"); // 6

        System.out.println(myPriorityQueueList1);

        myPriorityQueueList1.peek(); // En Üstteki Değeri Gösterir

        myPriorityQueueList1.clear();
        // myPriorityQueueList1.remove(); // Boş Sınıfta Hata Verir
        myPriorityQueueList1.poll(); // En Üstteki Değeri Çıkarır - Boş Sınıfta Hata Vermeden Devam Eder

        System.out.println(myPriorityQueueList1);

        System.out.println("==================================================");

        Queue myArrayDequeList1 = new ArrayDeque(); // null Değeri Almaz

        myArrayDequeList1.add("Aysu"); // 0
        myArrayDequeList1.add("Serkan"); // 1
        myArrayDequeList1.add("Gizem"); // 2
        myArrayDequeList1.add("Ali"); // 3
        // myArrayDequeList1.add(null); // 4 // !!! ÖNEMLİ !!! - Sort(Sıralama) Yaptığı İçin null Değeri Almaz
        // myArrayDequeList1.add(null); // 5 // !!! ÖNEMLİ !!! - Sort(Sıralama) Yaptığı İçin null Değeri Almaz
        myArrayDequeList1.offer("Engin"); // 6

        System.out.println(myArrayDequeList1);

        myArrayDequeList1.peek(); // En Üstteki Değeri Gösterir

        myArrayDequeList1.clear();
        // myArrayDequeList1.remove(); // Boş Sınıfta Hata Verir
        myArrayDequeList1.poll(); // En Üstteki Değeri Çıkarır - Boş Sınıfta Hata Vermeden Devam Eder

        System.out.println(myArrayDequeList1);
    }
}