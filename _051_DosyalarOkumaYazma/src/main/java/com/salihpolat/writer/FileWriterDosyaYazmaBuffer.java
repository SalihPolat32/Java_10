package com.salihpolat.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDosyaYazmaBuffer {

    public static void main(String[] args) {

        try {

            // FIXME bakılacak
            FileWriter writer = new FileWriter("src/main/myInput.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("\n----------------------------");

            bufferedWriter.write("\nAbdullah AKTAŞ\n" +
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
                    "Ünal Gani BERK\n");

            bufferedWriter.newLine();

            bufferedWriter.write("*********************");

            bufferedWriter.close();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }
}