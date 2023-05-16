package org.turkeyjug;

public class AppMain {

    public static void main(String[] args) {

        Araba araba = new Araba("Mercedes","Mavi",2023,10000);

        System.out.println(araba);

//      Araba araba1 = new Araba("Honda","Gri",2010,1600);

//       System.out.println(araba1);

        araba = new Araba("Serçedes","Kırmızı",2000,250);

        System.out.println(araba);

        System.out.println(new Araba("Anadolu","Sarı",1000,75));
        System.out.println(araba);

        /*
         * Integer a = 10;
         * a = 5;
         */

        araba.setMarka("Volvo");
        araba.setModel(2021);
        araba.setMotorHacmi(2500);
        araba.setRenk("Pembe");
        System.out.println(araba);

        int modelSayi = araba.getModel();
        System.out.println(modelSayi);

        System.out.println(araba.getMotorHacmi() * 2);
    }
}
