package com.salihpolat.ornek03;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppMainMultiCatch {

    public static void main(String[] args) {

        Integer sayi1 = null;
        Integer sayi2 =  null;
        Integer toplam = null;
        Integer bolme =  null;

        boolean exceptionFlagStatus = false;

        do{

            try{

                Scanner scanner = new Scanner(System.in);

                System.out.println("1. Sayıyı Giriniz:");
                sayi1 = scanner.nextInt();

                System.out.println("2. Sayıyı Giriniz:");
                sayi2 = scanner.nextInt();

                toplam = sayi1 + sayi2;
                System.out.println("Toplam: " + toplam );

                bolme = sayi1 / sayi2;
                System.out.println("Bölme: " + bolme );

                exceptionFlagStatus = false;

                // InputMismatchException // ABC + - *
                // ArithmeticException    // UYGUN SAYILAR

            } catch (InputMismatchException e){

                System.out.println("İstisna: "+ e.toString());
                exceptionFlagStatus = true;

            } catch (ArithmeticException e){

                System.out.println("İstisna: "+ e.toString());
                exceptionFlagStatus = true;

            } catch (NoSuchElementException e){

                System.out.println("İstisna: "+ e.toString());
                exceptionFlagStatus = true;

            } catch (NullPointerException e){

                System.out.println("İstisna: "+ e.toString());
                exceptionFlagStatus = true;

            } catch (RuntimeException e){

                System.out.println("İstisna: "+ e.toString());
                exceptionFlagStatus = true;
            } catch (Exception e){

                System.out.println("İstisna: "+ e.toString());
                exceptionFlagStatus = true;

            } finally {

                System.out.println("-------------------------");

            }
        } while (exceptionFlagStatus);
        System.out.println("Uygulama Sonlandırıldı.");
    }
}