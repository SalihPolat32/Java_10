package com.salihpolat;

import com.salihpolat.okul.Ders;
import com.salihpolat.okul.Ogrenci;
import com.salihpolat.okul.Ogretmen;
import com.salihpolat.okul.Sinif;
import com.salihpolat.utils.Branslar;
import com.salihpolat.utils.Dersler;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setAd("Aminenur");
        ogretmen.setSoyad("GÖYNÜK");
        ogretmen.setBrans(Branslar.Matematik);
        ogretmen.setTelefon("0123456789");
        ogretmen.setAdres("Ankara");

        Ogretmen ogretmen2 = new Ogretmen("Aysu", "ÇAĞIŞLAR", "0987654321", "İzmir", Branslar.Ingilizce);

        List<Ogretmen> ogretmenList = new ArrayList<>();
        ogretmenList.add(ogretmen); // index 0
        ogretmenList.add(ogretmen2); // index 1

        //---------------------------------------------------------------------------

        List<Ders> dersList = new ArrayList<>();
        dersList.add(new Ders(Dersler.Geometri, ogretmenList.get(0), 0, 0)); // index 0
        dersList.add(new Ders(Dersler.Matematik, ogretmen, 0, 0)); // index 1
        dersList.add(new Ders(Dersler.Ingilizce, ogretmen2, 0, 0)); // index 2

        //---------------------------------------------------------------------------

        List<Ogrenci> ogrenciList = new ArrayList<>();
        ogrenciList.add(new Ogrenci("Mehmet", "Caner", "Çanakkale", "123", dersList)); // index 0

        ogrenciList.add(new Ogrenci("Orhun", "BAYINDIR", "Adana", "101", dersList.subList(1, 2))); // index 1

        //---------------------------------------------------------------------------

        Sinif sinif = new Sinif(20, true, false, "101 - Aziz Sancar", ogrenciList, ogretmenList);

        // System.out.println(sinif);

        System.out.println(sinif.getSubeNo());
        System.out.println(sinif.getOgrenciListesi().get(0).getAd());
        System.out.println(sinif.getOgrenciListesi().get(0).getSoyad());
        System.out.println(sinif.getOgrenciListesi().get(0).getDersListesi().get(0).getOgretmen().getBrans());

        System.out.println(sinif.getOgretmenListesi().get(0).getAd());
        System.out.println(sinif.getOgretmenListesi().get(0).getSoyad());
    }
}