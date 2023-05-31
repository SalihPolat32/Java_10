package com.salihpolat.files;

import java.io.*;

public class ReadingFileDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(new File("C:\\DOSYA_SONUC.txt"));

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        try {

            char c = (char) bufferedInputStream.read();
            System.out.println("Okunan Veri: " + c);

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            bufferedInputStream.close();
        }

        String myData = "Üzerinde İşlemler Yapıldı.";

        BufferedOutputStream cikti = null;

        try {

            FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\DOSYA_SONUC.txt"));

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            cikti.write(myData.getBytes());
            System.out.println("Başarılı");

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            bufferedInputStream.close();
        }

    }
}