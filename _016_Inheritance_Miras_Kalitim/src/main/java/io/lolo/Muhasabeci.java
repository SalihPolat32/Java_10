package io.lolo;

public class Muhasabeci extends Personel {

    private String MuhasebeciUnvani;
    private long gorevTazminati;

    public String getMuhasebeciUnvani() {
        return MuhasebeciUnvani;
    }

    public void setMuhasebeciUnvani(String muhasebeciUnvani) {
        MuhasebeciUnvani = muhasebeciUnvani;
    }

    public long getGorevTazminati() {
        return gorevTazminati;
    }

    public void setGorevTazminati(long gorevTazminati) {
        this.gorevTazminati = gorevTazminati;
    }
}
