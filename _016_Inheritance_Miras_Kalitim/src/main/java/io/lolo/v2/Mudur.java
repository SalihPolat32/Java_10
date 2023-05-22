package io.lolo.v2;

public class Mudur extends Personel {

    private String mudurDerecesi;
    private String yoneticiDepertman;
    private String tahsisiliPersonel;

    public Mudur() {
    }

    public Mudur(String mudurDerecesi, String yoneticiDepertman, String tahsisiliPersonel, long gorevTazminati) {
        this.mudurDerecesi = mudurDerecesi;
        this.yoneticiDepertman = yoneticiDepertman;
        this.tahsisiliPersonel = tahsisiliPersonel;
    }

    public String getMudurDerecesi() {
        return mudurDerecesi;
    }

    public void setMudurDerecesi(String mudurDerecesi) {
        this.mudurDerecesi = mudurDerecesi;
    }

    public String getYoneticiDepertman() {
        return yoneticiDepertman;
    }

    public void setYoneticiDepertman(String yoneticiDepertman) {
        this.yoneticiDepertman = yoneticiDepertman;
    }

    public String getTahsisiliPersonel() {
        return tahsisiliPersonel;
    }

    public void setTahsisiliPersonel(String tahsisiliPersonel) {
        this.tahsisiliPersonel = tahsisiliPersonel;
    }
}
