package com.salihpolat.v4IcIceIstisnalar;

public class AppMain {

    public static void main(String[] args) {

        int myArr[] = new int[6];

        try {

            myArr[2] = 22;
            myArr[4] = 44;
            myArr[0] = myArr[2] / myArr[4];
            // myArr[13] = 200;

            try {

                myArr[13] = 200;

            } catch (ArithmeticException e) {

                System.out.println("İçteki catch 1 : " + e);

            } catch (Exception e) {

                System.out.println("İçteki catch 2 : " + e);

            } finally {

                System.out.println("İçteki finally");

            }

        } catch (ArithmeticException e) {

            System.out.println("Dıştaki catch 1 : " + e);

        } catch (Exception e) {

            System.out.println("Dıştaki catch 2 : " + e);

        } finally {

            System.out.println("Dıştaki finally");

        }

        System.out.println(myArr);
    }
}