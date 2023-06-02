package com.salihpolat.v6TryCatch;

public class AppMain {

    public static void main(String[] args) {

        try {

            System.out.println("try");

            int sonuc = 3 / 0;

            System.out.println(sonuc);

        } catch (NullPointerException e) {

            System.out.println("catch 1");
            System.out.println("Exception: " + e);

        } catch (Exception e) {

            System.out.println("catch 2");
            System.out.println("Exception: " + e);

        } finally {

            System.out.println("finally");

        }
    }
}