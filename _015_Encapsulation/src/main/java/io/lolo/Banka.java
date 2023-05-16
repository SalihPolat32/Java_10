package io.lolo;

public class Banka {

    public static void main(String[] args) {

        Musteri musteri = new Musteri();
        musteri.setAdi("Ali");
        musteri.setSoyadi("GÜNEŞ");
        musteri.setHesapCuzdan(10000.0);
        musteri.setHesapNo(123456789L);

        System.out.println(musteri);

        musteri.hesapCuzdan = 0.0;
        System.out.println(musteri);


    }
}
