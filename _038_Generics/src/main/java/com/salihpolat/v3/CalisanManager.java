package com.salihpolat.v3;

public class CalisanManager<BenimKendiTipim> {

    BenimKendiTipim maas;

    private String kayitNumarasi;
    String adi, soyadi;
    // TODO ramdom Sayı İle Kullanılacaktır
    private final String SIRKET_ADI = "ABC";

    public  String getBilgiAl() {
        return "Adı: " + adi + " Soyadı: " + soyadi + " Maaş: " + maas + " No: " + kayitNumarasi;
    }

    public String getKayitNumarasi() {
        return kayitNumarasi;
    }

    public void setKayitNumarasi(String kayitNumarasi) {
        this.kayitNumarasi = kayitNumarasi;
    }
}