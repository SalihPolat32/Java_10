package com.salihpolat.isyeri;

public class AppIsYeriMerkez {

    public static void main(String[] args) {

        Yazilimci yazilimci = new Yazilimci();
        System.out.println("Maaş: " + (yazilimci.asgariUcret + yazilimci.bonus));
        System.out.println("SGK: " + ((yazilimci.sigorta == true) ? "Evet" : "Hayır"));
        System.out.println("Özel Sağlık Sigortası: " + yazilimci.ozelSaglikSigortasi);
        System.out.println("İzin Hakkı: " + yazilimci.izinHakki);

        Ceo ceo = new Ceo();
        System.out.println(ceo.asgariUcret + ceo.bonus);
        System.out.println(ceo.sigorta);
        System.out.println(ceo.izinHakki + ceo.ekIzin);

    }
}
