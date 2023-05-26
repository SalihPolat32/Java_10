package com.salihpolat;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class KisitliKuyruk {

    public static void main(String[] args) {

        Queue<String> kisitliKuyruk = new ArrayBlockingQueue<>(3);

        kisitliKuyruk.add("Ali"); // 0
        kisitliKuyruk.add("Aysu"); // 1
        kisitliKuyruk.add("Aminenur"); // 2
        // kisitliKuyruk.add("Serkan"); // 3
        // kisitliKuyruk.add("Orhun"); // 4

        kisitliKuyruk.offer("Burak"); // İçerisi boşalınca girer

        System.out.println(kisitliKuyruk);

        System.out.println(kisitliKuyruk.poll()); // En Baştaki Kişiyi Buldu Çıkardı
        System.out.println(kisitliKuyruk);

        System.out.println(kisitliKuyruk.peek()); // En Baştaki Kişiyi Bulur
    }
}