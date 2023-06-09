package com.salihpolat.writer;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDosyaYazma {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("src/main/myInput.txt", true);

            writer.write("Abdullah AKTAŞ\n" +
                    "Ahmet AKKOYUN\n" +
                    "Ali Güneş\n" +
                    "Aminenur GÖYRÜK\n" +
                    "Aysu ÇAĞIŞLAR\n" +
                    "Burak DELİCE\n" +
                    "Gizem KUŞÇUOĞLU\n" +
                    "Mehmet Caner ÖKSÜZ\n" +
                    "Orhun BAYINDIR\n" +
                    "Osman Onur BAŞ\n" +
                    "Salih Polat DÖNMEZ\n" +
                    "Serkan Şahin ZORLU\n" +
                    "Yiğitcan ABAY\n" +
                    "Ünal Gani BERK");

            writer.close();

        }  catch (IOException e) {

            throw new RuntimeException(e);

        }
    }
}