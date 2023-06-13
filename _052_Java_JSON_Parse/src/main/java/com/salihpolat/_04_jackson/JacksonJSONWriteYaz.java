package com.salihpolat._04_jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;

public class JacksonJSONWriteYaz {

    public static void main(String[] args) {

        Calisan calisan = new Calisan();

        calisan.setCalisanid(1);
        calisan.setAdi("Gizem");
        calisan.setSoyadi("KUŞÇUOĞLU");
        calisan.setDepertman("Proje Yöneticisi");
        calisan.setMaas(65_000);

        ObjectMapper objectMapper = new ObjectMapper();

        try {

            String jsonStr = objectMapper.writeValueAsString(calisan);
            System.out.println(jsonStr);

            FileWriter fileWriter = new FileWriter("calisanlar4.json");
            fileWriter.write(jsonStr);
            fileWriter.flush();

        } catch (JsonProcessingException e) {

            e.printStackTrace();
            throw new RuntimeException(e);

        } catch (IOException e) {

            e.printStackTrace();
            throw new RuntimeException(e);

        }
    }
}