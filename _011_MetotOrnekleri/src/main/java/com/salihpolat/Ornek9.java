package com.salihpolat;

public class Ornek9 {

    public Ornek9(String adiSoyadi) {
        System.out.println("Yapıcı Metot");
    }

    public Ornek9(String adiSoyadi, int yasi, Boolean araclariVarMi) {
        System.out.println("Yapıcı Metot");
    }

    public Ornek9(String adiSoyadi, int yasi) {
        System.out.println("Yapıcı Metot");
    }

    public Ornek9(String adiSoyadi, int boyu, int kilo) {
        System.out.println("Yapıcı Metot");
    }

    public static String yaz() {
        System.out.println("Sıradan Metot");
        return "Selam";
    }

    public static String yaz(int adet) {
        System.out.println("Sıradan Metot");
        return "Selam";
    }

    public static double yaz(int ucret, Integer masraf) {
        System.out.println("BJK");
        return 1.0;
    }

    public static String yaz(int ucret, int masraf) {
        System.out.println("BJK");
        return "Selam";
    }

    public static String yaz(short masraf, int ucret) {
        System.out.println("GS");
        return "Selam";
    }

    public static boolean yaz(int ucret, short masraf) {
        System.out.println("FB");
        return true;
    }

    public static void main(String[] args) {

            System.out.println("Main Metot");
            String cevap = yaz();
            System.out.println(cevap);

            yaz();
            yaz(1,  1);
            yaz(1, (short) 1);

            // Varlık  Yokluk
            // new ----- null

            Ornek9 nesne1 = new Ornek9("Gizem");

            Ornek9 nesne2 = new Ornek9("Gizem");

            short a = 32756;
            short b = 10000;
            int c = a+b;

            byte a1 = 3;
            byte b1 = 1;
            int c1 = a1 + b1;

            int c2 = a + a1;
    }

}
