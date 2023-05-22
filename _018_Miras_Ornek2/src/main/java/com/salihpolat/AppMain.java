package com.salihpolat;

public class AppMain {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.addAuthors(new String[]{"Mimar ASLAN"});
        System.out.println(book1.getAuthors());
    }
}