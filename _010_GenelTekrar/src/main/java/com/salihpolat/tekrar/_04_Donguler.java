package com.salihpolat.tekrar;

import java.util.Scanner;

public class _04_Donguler {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int i = 0;
        while (i<10){
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        int secim = -1;

        while (secim != 0) {
            System.out.println("Çıkış İçin 0 Değerine Basınız.");
            secim = scanner.nextInt();
        }

        do {
            System.out.println("Çıkış İçin 0 Değerine Basınız.");
            secim = scanner.nextInt();
        } while (secim != 0);
    }
}
