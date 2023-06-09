package com.salihpolat.writer;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWriterDosyaYazmaStreamUTF8 {

    public static void main(String[] args) {

        try {

            // FileWriter writer = new FileWriter("src/main/myInput.txt", true);

            FileOutputStream fileOutputStream = new FileOutputStream("src/main/myInput.txt", true);

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);

            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write("\n------------------");
            bufferedWriter.write("\n------------------");
            bufferedWriter.write("\n------------------");
            bufferedWriter.write("\n------------------");

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

            bufferedWriter.write("\n*********************");
            bufferedWriter.write("\n*********************");
            bufferedWriter.write("\n*********************");

            bufferedWriter.write("\n你好嗎？");
            bufferedWriter.write("\n找到錢就打電話。");

            bufferedWriter.close();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }
}