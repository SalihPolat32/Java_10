package com.salihpolat.oopkavramlar;

// Class
public class Calisan extends Object {

    // fields - Alan // Variables - Değisken
    private Long kimlikNo;
    private String adi;
    private String soyadi;
    private Float maas;
    private Boolean sigorta;

    //Erişim Belirteçleri private, public, protected - Encapsulation (Koruma)

    // Constructors - Hazırlayıcı - Yapıcı
    public Calisan() {
    }

    public Calisan(Long kimlikNo, String adi, String soyadi, Float maas, Boolean sigorta) {
        this.kimlikNo = kimlikNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
        this.sigorta = sigorta;
    }

    // Setters and Getters
    // Yazma - Setter
    public void setKimlikNo(Long kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public void setMaas(Float maas) {
        this.maas = maas;
    }

    public void setSigorta(Boolean sigorta) {
        this.sigorta = sigorta;
    }

    // RO (Read Only)
    // Okuma - Getter
    public Long getKimlikNo() {
        return kimlikNo;
    }

    public String getAdi() {
        return adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public Float getMaas() {
        return maas;
    }

    public Boolean getSigorta() {
        return sigorta;
    }

    // toString Metot
    @Override // Ezme
    public String toString() {
        return "Calisan{" +
                "kimlikNo=" + kimlikNo +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", maas=" + maas +
                ", sigorta=" + sigorta +
                '}';
    }

    // Sıradan bir metot
    public Float getMaasSonDurumu(float asgariUcret,float bonus) {
        return asgariUcret*3 + bonus;
    }

    // Polymorphism
    public Float getMaasSonDurumu(float asgariUcret,float bonus,int ucretliIzin) {
        return asgariUcret*3 + bonus + ucretliIzin*14;
    }
}