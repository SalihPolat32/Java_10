package com.salihpolat._01_json_simple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteYazJSON {

    public static void main(String[] args) {

        /*
         * calisanlar.json
         *
         * {"calisanlar":[
         * {"adi":"Serkan Şahin", "soyadi":"ZORLU", "yas":25},
         * {"adi":"Burak", "soyadi":"DELİCE", "yas":33},
         * {"adi":"Mehmet Caner", "soyadi":"ÖKSÜZ", "yas":28}
         * ]}
         */

        JSONObject calisanDetayi = new JSONObject();

        calisanDetayi.put("adi", "Serkan Şahin"); // K, V
        calisanDetayi.put("soyadi", "ZORLU"); // Key, Value
        calisanDetayi.put("yas", 25);

        JSONObject calisanlarObj = new JSONObject();

        calisanlarObj.put("calisanlar", calisanDetayi);

        // -----------------------------------------------------

        JSONObject calisanDetayi2 = new JSONObject();

        calisanDetayi2.put("adi", "Burak"); // K, V
        calisanDetayi2.put("soyadi", "DELİCE"); // Key, Value
        calisanDetayi2.put("yas", 33);

        JSONObject calisanlarObj2 = new JSONObject();

        calisanlarObj2.put("calisanlar", calisanDetayi2);

        // -----------------------------------------------------

        JSONArray calisanList = new JSONArray();

        calisanList.add(calisanlarObj);
        calisanList.add(calisanlarObj2);

        try (FileWriter file = new FileWriter("calisanlar.json")) {

            file.write(calisanList.toJSONString());
            file.flush();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }
}