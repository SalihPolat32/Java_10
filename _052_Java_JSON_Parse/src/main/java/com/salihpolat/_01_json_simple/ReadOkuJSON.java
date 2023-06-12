package com.salihpolat._01_json_simple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadOkuJSON {

    public static void main(String[] args) {

        JSONParser jsonParser = new JSONParser();

        try(FileReader readerOkuma = new FileReader("calisanlar.json")) {

            Object obj = jsonParser.parse(readerOkuma);

            JSONArray calisanlarListesi = (JSONArray) obj;

            System.out.println(calisanlarListesi);

            calisanlarListesi.forEach(calisan -> calianlariYazParse((JSONObject) calisan));

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        } catch (IOException e) {

            throw new RuntimeException(e);

        } catch (ParseException e) {

            e.printStackTrace();

        }
    }

    /*
     * calisanlar.json
     *
     * {"calisanlar":[
     * {"adi":"Serkan Şahin", "soyadi":"ZORLU", "yas":25},
     * {"adi":"Burak", "soyadi":"DELİCE", "yas":33},
     * {"adi":"Mehmet Caner", "soyadi":"ÖKSÜZ", "yas":28}
     * ]}
     */

    // calisan.json = {"adi":"Serkan Şahin", "soyadi":"ZORLU", "yas":25}
    private static void calianlariYazParse(JSONObject calisan) {

        JSONObject calisanObj = (JSONObject) calisan.get("calisanlar");

        String adi = (String) calisanObj.get("adi");
        String soyadi = (String) calisanObj.get("soyadi");
        Long yas = (Long) calisanObj.get("yas");
        // String yas = calisanObj.get("yas").toString();

        System.out.println("-----------------------------");

        System.out.println("Adı: " + adi);
        System.out.println("Soydı: " + soyadi);
        System.out.println("Yaşı: " + yas);
    }
}