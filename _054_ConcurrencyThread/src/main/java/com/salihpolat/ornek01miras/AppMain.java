package com.salihpolat.ornek01miras;

class BasitSinif extends Thread {

    @Override
    public void run() {
        System.out.println("Thread Çalışıyor." + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println("extends i: " + i);
        }
    }
}

public class AppMain{

    public static void main(String[] args) {

        BasitSinif basitSinif = new BasitSinif();
        System.out.println("Thread Başlıyor.");
        basitSinif.start();
    }
}