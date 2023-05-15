package com.salihpolat;

public class AppMain {

    static int b = 25;

    public static void main(String[] args) { // Scope - Gövde (Body)
        // 35
        int a = 10 + b;
                           // 35 25
        System.out.println(a + " " + b);

    }

    void selamVer() { // Scope - Gövde (Body)

        int a = 0;
        int b = 1;
                            // 0 1
        System.out.println(a + " " + b);

    }
}