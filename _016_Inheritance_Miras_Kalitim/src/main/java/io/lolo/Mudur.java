package io.lolo;

public class Mudur extends Personel {

    private String mudurDerecesi;
    private String yoneticiDepertman;
    private String tahsisiliPersonel;
    private long gorevTazminati;

    public Mudur() {
    }

    public Mudur(String mudurDerecesi, String yoneticiDepertman, String tahsisiliPersonel, long gorevTazminati) {
        this.mudurDerecesi = mudurDerecesi;
        this.yoneticiDepertman = yoneticiDepertman;
        this.tahsisiliPersonel = tahsisiliPersonel;
        this.gorevTazminati = gorevTazminati;
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

    public long getGorevTazminati() {
        return gorevTazminati;
    }

    public void setGorevTazminati(long gorevTazminati) {
        this.gorevTazminati = gorevTazminati;
    }
}
