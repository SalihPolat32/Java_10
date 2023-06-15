package com.salihpolat.ornek04sleep;

public class AppMain {

    public static void main(String[] args) throws InterruptedException {

        long baslangic = System.currentTimeMillis();

        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {

            throw new RuntimeException();

        }

        long bitis = System.currentTimeMillis();

        System.out.println(bitis - baslangic);
    }
}