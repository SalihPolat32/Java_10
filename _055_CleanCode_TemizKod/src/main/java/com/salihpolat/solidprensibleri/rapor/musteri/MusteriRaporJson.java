package com.salihpolat.solidprensibleri.rapor.musteri;

import com.salihpolat.solidprensibleri.Musteri;
import com.salihpolat.solidprensibleri.Rapor;
import com.salihpolat.solidprensibleri.rapor.IJson;

public class MusteriRaporJson  extends Rapor implements IJson {

    @Override
    public void mustreriRaporBilginiNotEt(Musteri musteri) {
        System.out.println("MusteriRaporJson: " + musteri.getAdi() + " "  + musteri.getSoyadi());
    }

    @Override
    public void musteriRaporJson(Musteri musteri) {
        System.out.println("musteriRaporJson: " +  musteri.getAdi() + " "  + musteri.getSoyadi() );
    }
}