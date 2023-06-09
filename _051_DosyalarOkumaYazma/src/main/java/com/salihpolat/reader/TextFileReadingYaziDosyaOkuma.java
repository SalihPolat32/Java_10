package com.salihpolat.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReadingYaziDosyaOkuma {
    public static void main(String[] args) {

        try {

            // FileReader reader = new FileReader("C:\\Java10\\myInput.txt");
            FileReader reader = new FileReader("src/main/myInput.txt");
            // FileReader reader = new FileReader("src/main/myInput.json");
            // FileReader reader = new FileReader("src/main/myInput.xml");

            int okumaKarakteri;

            while ((okumaKarakteri = reader.read()) != -1) {
                System.out.println((char) okumaKarakteri);
            }

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        } catch (IOException e) {

            throw new RuntimeException(e);

        } finally {

            // reader.close();

        }
    }
}