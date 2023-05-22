package com.salihpolat;

public class AppMain {

    public static void main(String[] args) {

        Muhasebe muhasebe = new Muhasebe();
        // muhasebe.isMaliYetki(); // boolean olduğu için is oldu
        muhasebe.setAdi("Burak");
        muhasebe.setSoyadi("DELİCE");
        muhasebe.setMaliYetki(Boolean.TRUE);
        muhasebe.setKidemYili((short)3);
        muhasebe.setUnvani("Mali Müşavir");

        System.out.println("Adı: " + muhasebe.getAdi());
        System.out.println("Soyadı: " + muhasebe.getSoyadi());
        System.out.println("Yetki: " + muhasebe.getMaliYetki());
        System.out.println("Kıdem: " + muhasebe.getKidemYili());
        System.out.println("Ünvan: " + muhasebe.getUnvani());

        muhasebe.hesapla();
        muhasebe.hesapla(75);
        muhasebe.hesapla(10,5);
        muhasebe.hesapla(10, (byte)5);
        muhasebe.hesapla(10, (short)5);

        String gelenCevap = muhasebe.selamVer("Serkan");
        System.out.println(gelenCevap);
    }
}