package com.salihpolat.veriformati;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class ZamanSaatFormati {

    public static void main(String[] args) {

        Date simdi = new Date();
        System.out.println(simdi);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String tarihBilgisi = simpleDateFormat.format(simdi);
        System.out.println(tarihBilgisi);

        System.out.println(simpleDateFormat.format(simdi));

                         // Anonim Nesne
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));

        System.out.println("--------------------------------------");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatlanmisVeri = LocalDate.now().format(dateTimeFormatter);
        System.out.println(formatlanmisVeri);

        System.out.println("Bugün: " + formatlanmisVeri);

        System.out.println("--------------------------------------");

        LocalDate localDateNow = LocalDate.now();
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        DateTimeFormatter formatimiz = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
        formatlanmisVeri = localDateNow.format(dateTimeFormatter);
        System.out.println(formatlanmisVeri);
    }
}