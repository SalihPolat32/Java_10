package com.salihpolat.solidprensibleri.rapor.musteri;

import com.salihpolat.solidprensibleri.Musteri;
import com.salihpolat.solidprensibleri.Rapor;
import com.salihpolat.solidprensibleri.rapor.IPdf;

public class MusteriRaporPdf extends Rapor implements IPdf {

    @Override
    public void mustreriRaporBilginiNotEt(Musteri musteri) {
        System.out.println("MusteriRaporPdf: " + musteri.getAdi() + " "  + musteri.getSoyadi());
    }

    @Override
    public void musteriRaporPdf(Musteri musteri) {
        System.out.println("musteriRaporPdf: " +  musteri.getAdi() + " "  + musteri.getSoyadi() );
    }
}