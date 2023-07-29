package com.salihpolat;

import com.salihpolat.controller.EvController;
import com.salihpolat.controller.KiralamaController;
import com.salihpolat.controller.KisiController;
import com.salihpolat.model.Ev;
import com.salihpolat.model.Kiralama;
import com.salihpolat.model.Kisi;
import com.salihpolat.model.enums.EEvStatus;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AppMain {

    static Scanner scanner = new Scanner(System.in);
    static EvController evController;
    static KiralamaController kiralamaController;
    static KisiController kisiController;

    public AppMain() {

        this.evController = new EvController();
        this.kiralamaController = new KiralamaController();
        this.kisiController = new KisiController();
    }

    public static void main(String[] args) {

        AppMain appMain = new AppMain();
        appMain.anaMenu();

        //FIXME - Menuler Taşınacak
/*
        AppMenu appMenu = new AppMenu();
        appMenu.anaMenu();
*/
    }

    private void anaMenu() {

        int secim = 0;

        do {
            System.out.println("***************************");
            System.out.println("******** LOLO EMLAK *******");
            System.out.println("********* ANA MENU ********");
            System.out.println("***************************");

            System.out.println("1- Ev Ekle");
            System.out.println("2- Ev Ara");
            System.out.println("3- Kişi Ekle");
            System.out.println("4- Ev Kirala");
            System.out.println("5- Rapor");
            System.out.println("0- Çıkış");

            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Ev Ekle Seçildi..");
                    evEkle();
                    break;

                case 2:
                    System.out.println("Ev Ara Seçildi..");
                    evAra();
                    break;

                case 3:
                    System.out.println("Kisi Ekle Seçildi..");
                    kisiEkle();
                    break;

                case 4:
                    System.out.println("Ev Kirala Seçildi..");
                    evKirala();
                    break;

                case 5:
                    System.out.println("Rapor Seçildi..");
                    rapor();
                    break;

                case 0:
                    System.out.println("Çıkış Yapılıyor...");
                    break;

                default:
                    break;
            }

        } while (secim != 0);
    }


    private static void evEkle() {

/*
        Ev ev = Ev.builder()
                .durum(EEvStatus.MUSAIT)
                .kat(3)
                .semt("Ayrancı")
                .yapimYili(LocalDate.now())
                .tur("Rezidans")
                .build();
*/

        System.out.println("Lütfen Kat Sayısını Giriniz:");
        int kat = scanner.nextInt();

        System.out.println("Lütfen Yapım Yılını Giriniz:");
        int sene = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Lütfen Türü Giriniz:");
        String tur = scanner.nextLine();

        Ev ev = Ev.builder()
                .kat(kat)
                .yapimYili(LocalDate.of(sene, 1, 1))
                .tur(tur)
                .build();

        evController.evOlustur(ev);
    }

    private static void evAra() {

        System.out.println("Lütfen Ev Id'sini Giriniz:");
        Long id = scanner.nextLong();

        Ev ev = evController.evAraById(id);
        System.out.println(ev);
    }

    private static void evKirala() {

        System.out.println("Lütfen Ev Id'sini Giriniz:");
        Long id = scanner.nextLong();

        Ev ev = evController.evAraById(id);
        ev.setDurum(EEvStatus.KIRADA);
        System.out.println("Ev Bilgisi: " + ev);


        System.out.println("Lütfen Kiralamak İsteyen Kişi Id'sini Giriniz:");
        Long kisiId = scanner.nextLong();

        Kisi kisi = kisiController.kisiAraById(kisiId);
        System.out.println("Kişi Bilgisi:" + kisi);


        Kiralama kiralama = Kiralama.builder()
                .ev(ev)
                .kisi(kisi)
                .build();

        kiralamaController.kiralamaOlustur(kiralama);
    }

    private static void kisiEkle() {

        scanner.nextLine();

        System.out.println("Lütfen İsminizi Giriniz: ");
        String ad = scanner.nextLine();

        System.out.println("Lütfen Soyisminizi Giriniz:");
        String soyad = scanner.nextLine();

        System.out.println("Lütfen TC'nizi Giriniz:");
        String tc = scanner.nextLine();

        //  scanner.nextLine();

        Kisi kisi = Kisi.builder()
                .ad(ad)
                .soyad(soyad)
                .tcNo(tc)
                .build();

        kisiController.kisiOlustur(kisi);
    }

    private static void rapor() {

        int secim = 0;

        do {

            System.out.println("**************************");
            System.out.println("******** RAPORLAR ********");
            System.out.println("**************************");

            System.out.println("1- Şu An Kirada Olan Evler");
            System.out.println("2- Boşta/Müsait Olan Evler");
            System.out.println("3- Herhangi Bir Müşterinin Kiraladığı Evler");

            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Şu An Kirada Olan Evler Aranıyor.");
                    kiradakiEvler();
                    break;

                case 2:
                    System.out.println("Boşta/Müsait Olan Evler Aranıyor.");
                    musaitEvler();
                    break;

                case 3:
                    System.out.println("Herhangi Bir Müşterinin Kiraladığı Evler Aranıyor.");
                    herhangiBirMusterininKiraladigiEvler();
                    break;


                case 0:
                    System.out.println("Çıkış Yapılıyor...");
                    break;

                default:
                    break;
            }
        } while (secim != 0);
    }

    private static void kiradakiEvler() {

        //  System.out.println(evController.kiradakiEvler());

        List<Ev> evlerListesi = evController.kiradakiEvler();
        for (Ev ev : evlerListesi) {
            //System.out.println(ev);
            System.out.println("Durumu: " + ev.getDurum() + "\t Id: " + ev.getId() + "\t Kat: " + ev.getKat() +
                    "\t Türü: " + ev.getTur() + "\t Semt: " + ev.getSemt() + "\t Yılı: " + ev.getYapimYili());
        }
    }

    private static void musaitEvler() {

        //  System.out.println(evController.musaitEvler());

        List<Ev> evlerListesi = evController.musaitEvler();
        for (Ev ev : evlerListesi) {
            //System.out.println(ev);
            System.out.println("Durumu: " + ev.getDurum() + "\t Id: " + ev.getId() + "\t Kat: " + ev.getKat() +
                    "\t Türü: " + ev.getTur() + "\t Semt: " + ev.getSemt() + "\t Yılı: " + ev.getYapimYili());
        }
/*
          System.out.println("------------------------------------------");

          for (int i = 0; i < evlerListesi.size(); i++) {
                System.out.print(evlerListesi.get(i) + " ");
            }
            System.out.println("\n------------------------------------------");

            evlerListesi.forEach(ev-> System.out.print(ev + " "));
*/
    }

    private static void herhangiBirMusterininKiraladigiEvler() {
    }
}