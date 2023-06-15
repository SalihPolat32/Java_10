package com.salihpolat.ornek02interface;

class BasitSinif implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Çalışıyor." + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println("implements i: " + i);
        }
    }
}

public class AppMain {

    public static void main(String[] args) {

        BasitSinif basitSinif = new BasitSinif();
        System.out.println("Thread Başlıyor.");
        Thread thread = new Thread(basitSinif);
        thread.start();
    }
}