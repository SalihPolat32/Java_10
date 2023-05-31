package com.salihpolat.listeler;

import java.util.List;
import java.util.stream.Stream;

public class ListelerdeStream {

    public static void main(String[] args) {

        Stream<String> bosKayit = Stream.empty();
        Stream<String> tekKayit = Stream.of("Gizem");
        Stream<Double> virgulluSayilar = Stream.of(2.0, 3d);

        List<String> gunler = List.of("Pazartesi", "Salı", "Çarşamba");

        Stream<String> gunleStream = gunler.stream();
        System.out.println(gunleStream.count());
    }
}