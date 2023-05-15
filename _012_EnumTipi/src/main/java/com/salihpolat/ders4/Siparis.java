package com.salihpolat.ders4;

public class Siparis {
    String pizzaBoyutu; // field

    public Siparis() {}

    public Siparis(String pizzaBoyutu) {
        this.pizzaBoyutu = pizzaBoyutu;
    }

    private void siparisPizza() {
        /*
        switch (pizzaBoyutu) {
            case SiparisEnum.Boyut.KUCUK:
                System.out.println("Küçük Boy");
        }
         */
    }

    public static void main(String[] args) {

        Siparis siparis1 = new Siparis();

        siparis1.pizzaBoyutu = SiparisEnum.Boyut.ORTA.toString();
        System.out.println(siparis1.pizzaBoyutu); // ORTA

        Siparis siparis2 = new Siparis(SiparisEnum.Boyut.BUYUK.toString());
        System.out.println(siparis2.pizzaBoyutu);

        Siparis siparis3 = new Siparis(SiparisEnum.Boyut.KUCUK.toString());
        siparis3.siparisPizza();

    }
}