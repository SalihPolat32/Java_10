package io.lolo.v2;

public class AppMain {

    public static void main(String[] args) {

        Mudur mudur = new Mudur();
        mudur.setAdi("Mehmet Caner");
        mudur.setSoyadi("ÖKSÜZ");
        mudur.setAdres("Berlin");
        mudur.setMudurDerecesi("Genel Müdür");
        mudur.setTahsisiliPersonel("Lisans");
        mudur.setYoneticiDepertman("Büyükelçi");
        mudur.setGorevTazminati(1_000_000);
        mudur.setMaasKatSayi(50);
        mudur.setTc("12345678901");
        mudur.setYas(42);

        System.out.println(mudur);

        System.out.println("Adı Soyadı: " + mudur.getAdi() + " " + mudur.getSoyadi());
        System.out.println(mudur.getMudurDerecesi());
        System.out.println(mudur.getYoneticiDepertman());
        System.out.println(mudur.getAdres());
        System.out.println(mudur.getTahsisiliPersonel());
        System.out.println(mudur.getYas());
        System.out.println(mudur.getTc());


    //    Muhendis muhendis = new Muhendis();
    //    muhendis.setTemelBeceri("Java");

        System.out.println("-----------------------------");

        Hizmetli hizmetli = new Hizmetli();
        int[] sorumlulukKatlari = new int[] {2,5,6,10};
        hizmetli.setKatGorevAlani(sorumlulukKatlari);

        System.out.println(hizmetli.getKatGorevAlani());

        System.out.println(hizmetli);

        for (int kat : hizmetli.getKatGorevAlani()) {
            System.out.print(kat + " ");
        }
    }
}