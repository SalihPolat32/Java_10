package com.salihpolat.solidprensibleri.rapor.musteri;

import com.salihpolat.solidprensibleri.Musteri;
import com.salihpolat.solidprensibleri.Rapor;
import com.salihpolat.solidprensibleri.rapor.IExcel;

public class MusteriRaporExcel extends Rapor implements IExcel {

    @Override
    public void mustreriRaporBilginiNotEt(Musteri musteri) {
        System.out.println("mustreriRaporBilginiNotEt: " + musteri.getAdi() + " "  + musteri.getSoyadi());

    }

    @Override
    public void mustreriRaporExcel(Musteri musteri) {
        System.out.println("mustreriRaporExcel: " +  musteri.getAdi() + " "  + musteri.getSoyadi() );
    }
}