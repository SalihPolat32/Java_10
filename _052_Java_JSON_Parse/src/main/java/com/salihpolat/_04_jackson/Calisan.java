package com.salihpolat._04_jackson;

public class Calisan {

    // POJO - Model
    private int calisanid;
    private String adi;
    private String soyadi;
    private String depertman;
    private float maas;

    public int getCalisanid() {
        return calisanid;
    }

    public void setCalisanid(int calisanid) {
        this.calisanid = calisanid;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getDepertman() {
        return depertman;
    }

    public void setDepertman(String depertman) {
        this.depertman = depertman;
    }

    public float getMaas() {
        return maas;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("*******************************");
        sb.append("\ncalisanid=").append(calisanid);
        sb.append("\nadi=").append(adi);
        sb.append("\nsoyadi=").append(soyadi);
        sb.append("\ndepertman=").append(depertman);
        sb.append("\nmaas=").append(maas);
        sb.append("*******************************");

        return sb.toString();
 /*
        return "Calisan{" +
                "calisanid=" + calisanid +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", depertman='" + depertman + '\'' +
                ", maas=" + maas +
                '}';
*/
    }
}