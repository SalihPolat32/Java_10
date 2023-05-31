package com.salihpolat.lambda01;

/*
class Sekil {

    public void dikdortgen() {

    }
}

interface Sekil {

    void dikdortgen();
}
*/
public class ParametresizLambda {

    public static void main(String[] args) {

        int sayi = 50;

        Sekil sekil1 = new Sekil() {
            @Override
            public void dikdortgen() {
                System.out.println("Parametresiz Lambda Örneği 1");
            }
        };

        sekil1.dikdortgen();

        Sekil sekil2 = () -> System.out.println("Parametresiz Lambda Örneği 2");

        sekil2.dikdortgen();
    }
}